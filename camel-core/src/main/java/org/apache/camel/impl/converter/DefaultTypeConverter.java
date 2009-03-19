/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.impl.converter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.camel.Exchange;
import org.apache.camel.NoFactoryAvailableException;
import org.apache.camel.NoTypeConversionAvailableException;
import org.apache.camel.TypeConverter;
import org.apache.camel.spi.FactoryFinder;
import org.apache.camel.spi.Injector;
import org.apache.camel.spi.PackageScanClassResolver;
import org.apache.camel.spi.TypeConverterAware;
import org.apache.camel.spi.TypeConverterRegistry;
import org.apache.camel.util.ObjectHelper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import static org.apache.camel.util.ObjectHelper.wrapRuntimeCamelException;


/**
 * Default implementation of a type converter registry used for
 * <a href="http://camel.apache.org/type-converter.html">type converters</a> in Camel.
 *
 * @version $Revision$
 */
public class DefaultTypeConverter implements TypeConverter, TypeConverterRegistry {
    private static final transient Log LOG = LogFactory.getLog(DefaultTypeConverter.class);
    private final Map<TypeMapping, TypeConverter> typeMappings = new ConcurrentHashMap<TypeMapping, TypeConverter>();
    private final Map<TypeMapping, TypeMapping> misses = new ConcurrentHashMap<TypeMapping, TypeMapping>();
    private final List<TypeConverterLoader> typeConverterLoaders = new ArrayList<TypeConverterLoader>();
    private final List<TypeConverter> fallbackConverters = new ArrayList<TypeConverter>();
    private Injector injector;
    private final FactoryFinder factoryFinder;
    private boolean loaded;

    public DefaultTypeConverter(PackageScanClassResolver resolver, Injector injector, FactoryFinder factoryFinder) {
        this.injector = injector;
        this.factoryFinder = factoryFinder;

        typeConverterLoaders.add(new AnnotationTypeConverterLoader(resolver));

        // add to string first as it will then be last in the last as to string can nearly
        // always convert something to a string so we want it only as the last resort
        addFallbackTypeConverter(new ToStringTypeConverter());
        addFallbackTypeConverter(new EnumTypeConverter());
        addFallbackTypeConverter(new ArrayTypeConverter());
        addFallbackTypeConverter(new PropertyEditorTypeConverter());
        addFallbackTypeConverter(new AsyncProcessorTypeConverter());
    }

    public List<TypeConverterLoader> getTypeConverterLoaders() {
        return typeConverterLoaders;
    }

    public <T> T convertTo(Class<T> type, Object value) {
        return convertTo(type, null, value);
    }

    public <T> T convertTo(Class<T> type, Exchange exchange, Object value) {
        Object answer;
        try {
            answer = doConvertTo(type, exchange, value);
        } catch (Exception e) {
            // we cannot convert so return null
            if (LOG.isDebugEnabled()) {
                LOG.debug(NoTypeConversionAvailableException.createMessage(value, type)
                        + " Caused by: " + e.getMessage() + ". Will ignore this and continue.");
            }
            return null;
        }
        if (answer == Void.TYPE) {
            // Could not find suitable conversion
            return null;
        } else {
            return (T) answer;
        }
    }

    public <T> T mandatoryConvertTo(Class<T> type, Object value) throws NoTypeConversionAvailableException {
        return mandatoryConvertTo(type, null, value);
    }

    public <T> T mandatoryConvertTo(Class<T> type, Exchange exchange, Object value) throws NoTypeConversionAvailableException {
        Object answer;
        try {
            answer = doConvertTo(type, exchange, value);
        } catch (Exception e) {
            throw new NoTypeConversionAvailableException(value, type, e);
        }
        if (answer == Void.TYPE) {
            // Could not find suitable conversion
            throw new NoTypeConversionAvailableException(value, type);
        } else {
            return (T) answer;
        }
    }

    @SuppressWarnings("unchecked")
    public Object doConvertTo(final Class type, final Exchange exchange, final Object value) {
        if (LOG.isTraceEnabled()) {
            LOG.trace("Converting " + (value == null ? "null" : value.getClass().getCanonicalName())
                + " -> " + type.getCanonicalName() + " with value: " + value);
        }

        if (value == null) {
            // lets avoid NullPointerException when converting to boolean for null values
            if (boolean.class.isAssignableFrom(type)) {
                return Boolean.FALSE;
            }
            return null;
        }

        // same instance type
        if (type.isInstance(value)) {
            return type.cast(value);
        }

        // check if we have tried it before and if its a miss
        TypeMapping key = new TypeMapping(type, value.getClass());
        if (misses.containsKey(key)) {
            // we have tried before but we cannot convert this one
            return Void.TYPE;
        }

        // make sure we have loaded the converters
        checkLoaded();

        // try to find a suitable type converter
        TypeConverter converter = getOrFindTypeConverter(type, value);
        if (converter != null) {
            Object rc = converter.convertTo(type, exchange, value);
            if (rc != null) {
                return rc;
            }
        }

        // fallback converters
        for (TypeConverter fallback : fallbackConverters) {
            Object rc = fallback.convertTo(type, exchange, value);
            if (rc != null) {
                return rc;
            }
        }

        // primitives
        if (type.isPrimitive()) {
            Class primitiveType = ObjectHelper.convertPrimitiveTypeToWrapperType(type);
            if (primitiveType != type) {
                return convertTo(primitiveType, exchange, value);
            }
        }

        // Could not find suitable conversion, so remember it
        synchronized (misses) {
            misses.put(key, key);
        }

        // Could not find suitable conversion, so return Void to indicate not found
        return Void.TYPE;
    }

    public void addTypeConverter(Class toType, Class fromType, TypeConverter typeConverter) {
        if (LOG.isTraceEnabled()) {
            LOG.trace("Adding type converter: " + typeConverter);
        }
        TypeMapping key = new TypeMapping(toType, fromType);
        synchronized (typeMappings) {
            TypeConverter converter = typeMappings.get(key);
            if (converter != null) {
                LOG.warn("Overriding type converter from: " + converter + " to: " + typeConverter);
            }
            typeMappings.put(key, typeConverter);
        }
    }

    public void addFallbackTypeConverter(TypeConverter typeConverter) {
        if (LOG.isTraceEnabled()) {
            LOG.trace("Adding fallback type converter: " + typeConverter);
        }

        // add in top of fallback as the toString() fallback will nearly always be able to convert
        fallbackConverters.add(0, typeConverter);
        if (typeConverter instanceof TypeConverterAware) {
            TypeConverterAware typeConverterAware = (TypeConverterAware)typeConverter;
            typeConverterAware.setTypeConverter(this);
        }
    }

    public TypeConverter getTypeConverter(Class toType, Class fromType) {
        TypeMapping key = new TypeMapping(toType, fromType);
        return typeMappings.get(key);
    }

    public Injector getInjector() {
        return injector;
    }

    public void setInjector(Injector injector) {
        this.injector = injector;
    }

    public Set<Class> getFromClassMappings() {
        // make sure we have loaded the converters
        checkLoaded();

        Set<Class> answer = new HashSet<Class>();
        synchronized (typeMappings) {
            for (TypeMapping mapping : typeMappings.keySet()) {
                answer.add(mapping.getFromType());
            }
        }
        return answer;
    }

    public Map<Class, TypeConverter> getToClassMappings(Class fromClass) {
        Map<Class, TypeConverter> answer = new HashMap<Class, TypeConverter>();
        synchronized (typeMappings) {
            for (Map.Entry<TypeMapping, TypeConverter> entry : typeMappings.entrySet()) {
                TypeMapping mapping = entry.getKey();
                if (mapping.isApplicable(fromClass)) {
                    answer.put(mapping.getToType(), entry.getValue());
                }
            }
        }
        return answer;
    }

    public Map<TypeMapping, TypeConverter> getTypeMappings() {
        // make sure we have loaded the converters
        checkLoaded();

        return typeMappings;
    }

    protected <T> TypeConverter getOrFindTypeConverter(Class toType, Object value) {
        Class fromType = null;
        if (value != null) {
            fromType = value.getClass();
        }
        TypeMapping key = new TypeMapping(toType, fromType);
        TypeConverter converter;
        synchronized (typeMappings) {
            converter = typeMappings.get(key);
            if (converter == null) {
                converter = lookup(toType, fromType);
                if (converter != null) {
                    typeMappings.put(key, converter);
                }
            }
        }
        return converter;
    }

    public TypeConverter lookup(Class toType, Class fromType) {
        // make sure we have loaded the converters
        checkLoaded();

        // lets try the super classes of the from type
        if (fromType != null) {
            Class fromSuperClass = fromType.getSuperclass();
            if (fromSuperClass != null && !fromSuperClass.equals(Object.class)) {

                TypeConverter converter = getTypeConverter(toType, fromSuperClass);
                if (converter == null) {
                    converter = lookup(toType, fromSuperClass);
                }
                if (converter != null) {
                    return converter;
                }
            }
            for (Class type : fromType.getInterfaces()) {
                TypeConverter converter = getTypeConverter(toType, type);
                if (converter != null) {
                    return converter;
                }
            }

            // lets test for arrays
            if (fromType.isArray() && !fromType.getComponentType().isPrimitive()) {
                // TODO can we try walking the inheritance-tree for the element types?
                if (!fromType.equals(Object[].class)) {
                    fromSuperClass = Object[].class;

                    TypeConverter converter = getTypeConverter(toType, fromSuperClass);
                    if (converter == null) {
                        converter = lookup(toType, fromSuperClass);
                    }
                    if (converter != null) {
                        return converter;
                    }
                }
            }

            // lets test for Object based converters
            if (!fromType.equals(Object.class)) {
                TypeConverter converter = getTypeConverter(toType, Object.class);
                if (converter != null) {
                    return converter;
                }
            }
        }

        // lets try classes derived from this toType
        if (fromType != null) {
            Set<Map.Entry<TypeMapping, TypeConverter>> entries = typeMappings.entrySet();
            for (Map.Entry<TypeMapping, TypeConverter> entry : entries) {
                TypeMapping key = entry.getKey();
                Class aToType = key.getToType();
                if (toType.isAssignableFrom(aToType)) {
                    if (key.getFromType().isAssignableFrom(fromType)) {
                        return entry.getValue();
                    }
                }
            }
        }

        // TODO look at constructors of toType?
        return null;
    }

    /**
     * Checks if the registry is loaded and if not lazily load it
     */
    protected synchronized void checkLoaded() {
        if (!loaded) {
            loaded = true;
            try {
                for (TypeConverterLoader typeConverterLoader : typeConverterLoaders) {
                    typeConverterLoader.load(this);
                }

                // lets try load any other fallback converters
                try {
                    loadFallbackTypeConverters();
                } catch (NoFactoryAvailableException e) {
                    // ignore its fine to have none
                }
            } catch (Exception e) {
                throw wrapRuntimeCamelException(e);
            }
        }
    }

    protected void loadFallbackTypeConverters() throws IOException, ClassNotFoundException {
        List<TypeConverter> converters = factoryFinder.newInstances("FallbackTypeConverter", getInjector(), TypeConverter.class);
        for (TypeConverter converter : converters) {
            addFallbackTypeConverter(converter);
        }
    }

    /**
     * Represents a mapping from one type (which can be null) to another
     */
    protected static class TypeMapping {
        Class toType;
        Class fromType;

        public TypeMapping(Class toType, Class fromType) {
            this.toType = toType;
            this.fromType = fromType;
        }

        public Class getFromType() {
            return fromType;
        }

        public Class getToType() {
            return toType;
        }

        @Override
        public boolean equals(Object object) {
            if (object instanceof TypeMapping) {
                TypeMapping that = (TypeMapping)object;
                return ObjectHelper.equal(this.fromType, that.fromType)
                       && ObjectHelper.equal(this.toType, that.toType);
            }
            return false;
        }

        @Override
        public int hashCode() {
            int answer = toType.hashCode();
            if (fromType != null) {
                answer *= 37 + fromType.hashCode();
            }
            return answer;
        }

        @Override
        public String toString() {
            return "[" + fromType + "=>" + toType + "]";
        }

        public boolean isApplicable(Class fromClass) {
            return fromType.isAssignableFrom(fromClass);
        }
    }
}
