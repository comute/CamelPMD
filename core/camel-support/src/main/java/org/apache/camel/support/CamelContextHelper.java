/*
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
package org.apache.camel.support;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.StringTokenizer;
import java.util.TreeMap;

import org.apache.camel.CamelContext;
import org.apache.camel.Component;
import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.ExtendedCamelContext;
import org.apache.camel.LoadPropertiesException;
import org.apache.camel.NamedNode;
import org.apache.camel.NoSuchBeanException;
import org.apache.camel.NoSuchEndpointException;
import org.apache.camel.spi.ClassResolver;
import org.apache.camel.spi.RouteStartupOrder;
import org.apache.camel.util.IOHelper;
import org.apache.camel.util.ObjectHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.apache.camel.util.ObjectHelper.isNotEmpty;
import static org.apache.camel.util.ObjectHelper.notNull;

/**
 * A number of helper methods
 */
public final class CamelContextHelper {
    public static final String COMPONENT_BASE = "META-INF/services/org/apache/camel/component/";
    public static final String COMPONENT_DESCRIPTOR = "META-INF/services/org/apache/camel/component.properties";
    public static final String MODEL_DOCUMENTATION_PREFIX = "org/apache/camel/model/";

    private static final Logger LOG = LoggerFactory.getLogger(CamelContextHelper.class);

    /**
     * Utility classes should not have a public constructor.
     */
    private CamelContextHelper() {
    }

    /**
     * Returns the mandatory endpoint for the given URI or the
     * {@link org.apache.camel.NoSuchEndpointException} is thrown
     */
    public static Endpoint getMandatoryEndpoint(CamelContext camelContext, String uri)
        throws NoSuchEndpointException {
        Endpoint endpoint = camelContext.getEndpoint(uri);
        if (endpoint == null) {
            throw new NoSuchEndpointException(uri);
        } else {
            return endpoint;
        }
    }

    /**
     * Returns the mandatory endpoint for the given URI and type or the
     * {@link org.apache.camel.NoSuchEndpointException} is thrown
     */
    public static <T extends Endpoint> T getMandatoryEndpoint(CamelContext camelContext, String uri, Class<T> type) {
        Endpoint endpoint = getMandatoryEndpoint(camelContext, uri);
        return ObjectHelper.cast(type, endpoint);
    }

    /**
     * Converts the given value to the requested type
     */
    public static <T> T convertTo(CamelContext context, Class<T> type, Object value) {
        notNull(context, "camelContext");
        return context.getTypeConverter().convertTo(type, value);
    }

    /**
     * Tried to convert the given value to the requested type
     */
    public static <T> T tryConvertTo(CamelContext context, Class<T> type, Object value) {
        notNull(context, "camelContext");
        return context.getTypeConverter().tryConvertTo(type, value);
    }

    /**
     * Converts the given value to the specified type throwing an {@link IllegalArgumentException}
     * if the value could not be converted to a non null value
     */
    public static <T> T mandatoryConvertTo(CamelContext context, Class<T> type, Object value) {
        T answer = convertTo(context, type, value);
        if (answer == null) {
            throw new IllegalArgumentException("Value " + value + " converted to " + type.getName() + " cannot be null");
        }
        return answer;
    }

    /**
     * Creates a new instance of the given type using the {@link org.apache.camel.spi.Injector} on the given
     * {@link CamelContext}
     */
    public static <T> T newInstance(CamelContext context, Class<T> beanType) {
        return context.getInjector().newInstance(beanType);
    }

    /**
     * Look up the given named bean in the {@link org.apache.camel.spi.Registry} on the
     * {@link CamelContext}
     */
    public static Object lookup(CamelContext context, String name) {
        return context.getRegistry().lookupByName(name);
    }

    /**
     * Look up the given named bean of the given type in the {@link org.apache.camel.spi.Registry} on the
     * {@link CamelContext}
     */
    public static <T> T lookup(CamelContext context, String name, Class<T> beanType) {
        return context.getRegistry().lookupByNameAndType(name, beanType);
    }

    /**
     * Look up the given named bean in the {@link org.apache.camel.spi.Registry} on the
     * {@link CamelContext} and try to convert it to the given type.
     */
    public static <T> T lookupAndConvert(CamelContext context, String name, Class<T> beanType) {
        return tryConvertTo(context, beanType, lookup(context, name));
    }

    /**
     * Look up a bean of the give type in the {@link org.apache.camel.spi.Registry} on the
     * {@link CamelContext} returning an instance if only one bean is present,
     */
    public static <T> T findByType(CamelContext camelContext, Class<T> type) {
        Set<T> set = camelContext.getRegistry().findByType(type);
        if (set.size() == 1) {
            return set.iterator().next();
        }

        return null;
    }

    /**
     * Look up the given named bean in the {@link org.apache.camel.spi.Registry} on the
     * {@link CamelContext} or throws {@link NoSuchBeanException} if not found.
     */
    public static Object mandatoryLookup(CamelContext context, String name) {
        Object answer = lookup(context, name);
        if (answer == null) {
            throw new NoSuchBeanException(name);
        }
        return answer;
    }

    /**
     * Look up the given named bean of the given type in the {@link org.apache.camel.spi.Registry} on the
     * {@link CamelContext} or throws NoSuchBeanException if not found.
     */
    public static <T> T mandatoryLookup(CamelContext context, String name, Class<T> beanType) {
        T answer = lookup(context, name, beanType);
        if (answer == null) {
            throw new NoSuchBeanException(name, beanType.getName());
        }
        return answer;
    }

    /**
     * Look up the given named bean in the {@link org.apache.camel.spi.Registry} on the
     * {@link CamelContext} and convert it to the given type or throws NoSuchBeanException if not found.
     */
    public static <T> T mandatoryLookupAndConvert(CamelContext context, String name, Class<T> beanType) {
        Object value = lookup(context, name);
        if (value == null) {
            throw new NoSuchBeanException(name, beanType.getName());
        }
        return convertTo(context, beanType, value);
    }

    /**
     * Evaluates the @EndpointInject annotation using the given context
     */
    public static Endpoint getEndpointInjection(CamelContext camelContext, String uri, String injectionPointName, boolean mandatory) {
        Endpoint endpoint;
        if (isNotEmpty(uri)) {
            endpoint = camelContext.getEndpoint(uri);
        } else {
            if (mandatory) {
                endpoint = mandatoryLookup(camelContext, injectionPointName, Endpoint.class);
            } else {
                endpoint = lookup(camelContext, injectionPointName, Endpoint.class);
            }
        }
        return endpoint;
    }

    /**
     * Gets the maximum cache pool size.
     * <p/>
     * Will use the property set on CamelContext with the key {@link Exchange#MAXIMUM_CACHE_POOL_SIZE}.
     * If no property has been set, then it will fallback to return a size of 1000.
     *
     * @param camelContext the camel context
     * @return the maximum cache size
     * @throws IllegalArgumentException is thrown if the property is illegal
     */
    public static int getMaximumCachePoolSize(CamelContext camelContext) throws IllegalArgumentException {
        if (camelContext != null) {
            String s = camelContext.getGlobalOption(Exchange.MAXIMUM_CACHE_POOL_SIZE);
            if (s != null) {
                try {
                    // we cannot use Camel type converters as they may not be ready this early
                    Integer size = Integer.valueOf(s);
                    if (size == null || size <= 0) {
                        throw new IllegalArgumentException("Property " + Exchange.MAXIMUM_CACHE_POOL_SIZE + " must be a positive number, was: " + s);
                    }
                    return size;
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Property " + Exchange.MAXIMUM_CACHE_POOL_SIZE + " must be a positive number, was: " + s, e);
                }
            }
        }

        // 1000 is the default fallback
        return 1000;
    }

    /**
     * Gets the maximum endpoint cache size.
     * <p/>
     * Will use the property set on CamelContext with the key {@link Exchange#MAXIMUM_ENDPOINT_CACHE_SIZE}.
     * If no property has been set, then it will fallback to return a size of 1000.
     *
     * @param camelContext the camel context
     * @return the maximum cache size
     * @throws IllegalArgumentException is thrown if the property is illegal
     */
    public static int getMaximumEndpointCacheSize(CamelContext camelContext) throws IllegalArgumentException {
        if (camelContext != null) {
            String s = camelContext.getGlobalOption(Exchange.MAXIMUM_ENDPOINT_CACHE_SIZE);
            if (s != null) {
                // we cannot use Camel type converters as they may not be ready this early
                try {
                    Integer size = Integer.valueOf(s);
                    if (size == null || size <= 0) {
                        throw new IllegalArgumentException("Property " + Exchange.MAXIMUM_ENDPOINT_CACHE_SIZE + " must be a positive number, was: " + s);
                    }
                    return size;
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Property " + Exchange.MAXIMUM_ENDPOINT_CACHE_SIZE + " must be a positive number, was: " + s, e);
                }
            }
        }

        // 1000 is the default fallback
        return 1000;
    }

    /**
     * Gets the maximum simple cache size.
     * <p/>
     * Will use the property set on CamelContext with the key {@link Exchange#MAXIMUM_SIMPLE_CACHE_SIZE}.
     * If no property has been set, then it will fallback to return a size of 1000.
     *
     * @param camelContext the camel context
     * @return the maximum cache size
     * @throws IllegalArgumentException is thrown if the property is illegal
     */
    public static int getMaximumSimpleCacheSize(CamelContext camelContext) throws IllegalArgumentException {
        if (camelContext != null) {
            String s = camelContext.getGlobalOption(Exchange.MAXIMUM_SIMPLE_CACHE_SIZE);
            if (s != null) {
                // we cannot use Camel type converters as they may not be ready this early
                try {
                    Integer size = Integer.valueOf(s);
                    if (size == null || size <= 0) {
                        throw new IllegalArgumentException("Property " + Exchange.MAXIMUM_SIMPLE_CACHE_SIZE + " must be a positive number, was: " + s);
                    }
                    return size;
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Property " + Exchange.MAXIMUM_SIMPLE_CACHE_SIZE + " must be a positive number, was: " + s, e);
                }
            }
        }

        // 1000 is the default fallback
        return 1000;
    }

    /**
     * Gets the maximum transformer cache size.
     * <p/>
     * Will use the property set on CamelContext with the key {@link Exchange#MAXIMUM_TRANSFORMER_CACHE_SIZE}.
     * If no property has been set, then it will fallback to return a size of 1000.
     *
     * @param camelContext the camel context
     * @return the maximum cache size
     * @throws IllegalArgumentException is thrown if the property is illegal
     */
    public static int getMaximumTransformerCacheSize(CamelContext camelContext) throws IllegalArgumentException {
        if (camelContext != null) {
            String s = camelContext.getGlobalOption(Exchange.MAXIMUM_TRANSFORMER_CACHE_SIZE);
            if (s != null) {
                // we cannot use Camel type converters as they may not be ready this early
                try {
                    Integer size = Integer.valueOf(s);
                    if (size == null || size <= 0) {
                        throw new IllegalArgumentException("Property " + Exchange.MAXIMUM_TRANSFORMER_CACHE_SIZE + " must be a positive number, was: " + s);
                    }
                    return size;
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Property " + Exchange.MAXIMUM_TRANSFORMER_CACHE_SIZE + " must be a positive number, was: " + s, e);
                }
            }
        }

        // 1000 is the default fallback
        return 1000;
    }

    /**
     * Gets the maximum validator cache size.
     * <p/>
     * Will use the property set on CamelContext with the key {@link Exchange#MAXIMUM_VALIDATOR_CACHE_SIZE}.
     * If no property has been set, then it will fallback to return a size of 1000.
     *
     * @param camelContext the camel context
     * @return the maximum cache size
     * @throws IllegalArgumentException is thrown if the property is illegal
     */
    public static int getMaximumValidatorCacheSize(CamelContext camelContext) throws IllegalArgumentException {
        if (camelContext != null) {
            String s = camelContext.getGlobalOption(Exchange.MAXIMUM_VALIDATOR_CACHE_SIZE);
            if (s != null) {
                // we cannot use Camel type converters as they may not be ready this early
                try {
                    Integer size = Integer.valueOf(s);
                    if (size == null || size <= 0) {
                        throw new IllegalArgumentException("Property " + Exchange.MAXIMUM_VALIDATOR_CACHE_SIZE + " must be a positive number, was: " + s);
                    }
                    return size;
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Property " + Exchange.MAXIMUM_VALIDATOR_CACHE_SIZE + " must be a positive number, was: " + s, e);
                }
            }
        }

        // 1000 is the default fallback
        return 1000;
    }

    /**
     * Parses the given text and handling property placeholders as well
     *
     * @param camelContext the camel context
     * @param text  the text
     * @return the parsed text, or <tt>null</tt> if the text was <tt>null</tt>
     * @throws Exception is thrown if illegal argument
     */
    public static String parseText(CamelContext camelContext, String text) throws Exception {
        // ensure we support property placeholders
        return camelContext.resolvePropertyPlaceholders(text);
    }

    /**
     * Parses the given text and converts it to an Integer and handling property placeholders as well
     *
     * @param camelContext the camel context
     * @param text  the text
     * @return the integer vale, or <tt>null</tt> if the text was <tt>null</tt>
     * @throws Exception is thrown if illegal argument or type conversion not possible
     */
    public static Integer parseInteger(CamelContext camelContext, String text) throws Exception {
        // ensure we support property placeholders
        String s = camelContext.resolvePropertyPlaceholders(text);
        if (s != null) {
            try {
                return camelContext.getTypeConverter().mandatoryConvertTo(Integer.class, s);
            } catch (NumberFormatException e) {
                if (s.equals(text)) {
                    throw new IllegalArgumentException("Error parsing [" + s + "] as an Integer.", e);
                } else {
                    throw new IllegalArgumentException("Error parsing [" + s + "] from property " + text + " as an Integer.", e);
                }
            }
        }
        return null;
    }

    /**
     * Parses the given text and converts it to an Long and handling property placeholders as well
     *
     * @param camelContext the camel context
     * @param text  the text
     * @return the long vale, or <tt>null</tt> if the text was <tt>null</tt>
     * @throws Exception is thrown if illegal argument or type conversion not possible
     */
    public static Long parseLong(CamelContext camelContext, String text) throws Exception {
        // ensure we support property placeholders
        String s = camelContext.resolvePropertyPlaceholders(text);
        if (s != null) {
            try {
                return camelContext.getTypeConverter().mandatoryConvertTo(Long.class, s);
            } catch (NumberFormatException e) {
                if (s.equals(text)) {
                    throw new IllegalArgumentException("Error parsing [" + s + "] as a Long.", e);
                } else {
                    throw new IllegalArgumentException("Error parsing [" + s + "] from property " + text + " as a Long.", e);
                }
            }
        }
        return null;
    }

    /**
     * Parses the given text and converts it to a Double and handling property placeholders as well
     *
     * @param camelContext the camel context
     * @param text  the text
     * @return the double vale, or <tt>null</tt> if the text was <tt>null</tt>
     * @throws Exception is thrown if illegal argument or type conversion not possible
     */
    public static Double parseDouble(CamelContext camelContext, String text) throws Exception {
        // ensure we support property placeholders
        String s = camelContext.resolvePropertyPlaceholders(text);
        if (s != null) {
            try {
                return camelContext.getTypeConverter().mandatoryConvertTo(Double.class, s);
            } catch (NumberFormatException e) {
                if (s.equals(text)) {
                    throw new IllegalArgumentException("Error parsing [" + s + "] as an Integer.", e);
                } else {
                    throw new IllegalArgumentException("Error parsing [" + s + "] from property " + text + " as an Integer.", e);
                }
            }
        }
        return null;
    }

    /**
     * Parses the given text and converts it to an Boolean and handling property placeholders as well
     *
     * @param camelContext the camel context
     * @param text  the text
     * @return the boolean vale, or <tt>null</tt> if the text was <tt>null</tt>
     * @throws IllegalArgumentException is thrown if illegal argument or type conversion not possible
     */
    public static Boolean parseBoolean(CamelContext camelContext, String text) {
        // ensure we support property placeholders
        String s = camelContext.resolvePropertyPlaceholders(text);
        if (s != null) {
            s = s.trim().toLowerCase(Locale.ENGLISH);
            if (s.equals("true") || s.equals("false")) {
                return "true".equals(s) ? Boolean.TRUE : Boolean.FALSE;
            } else {
                if (s.equals(text)) {
                    throw new IllegalArgumentException("Error parsing [" + s + "] as a Boolean.");
                } else {
                    throw new IllegalArgumentException("Error parsing [" + s + "] from property " + text + " as a Boolean.");
                }
            }
        }
        return null;
    }

    /**
     * Finds all possible Components on the classpath, already registered in {@link org.apache.camel.CamelContext},
     * and from the {@link org.apache.camel.spi.Registry}.
     */
    public static SortedMap<String, Properties> findComponents(CamelContext camelContext) throws LoadPropertiesException {
        ClassResolver resolver = camelContext.getClassResolver();
        LOG.debug("Finding all components using class resolver: {}", resolver);
        Enumeration<URL> iter = resolver.loadAllResourcesAsURL(COMPONENT_DESCRIPTOR);
        return findComponents(camelContext, iter);
    }

    public static SortedMap<String, Properties> findComponents(CamelContext camelContext, Enumeration<URL> componentDescriptionIter)
        throws LoadPropertiesException {

        SortedMap<String, Properties> map = new TreeMap<>();
        while (componentDescriptionIter != null && componentDescriptionIter.hasMoreElements()) {
            URL url = componentDescriptionIter.nextElement();
            LOG.trace("Finding components in url: {}", url);
            try {
                Properties properties = new Properties();
                properties.load(url.openStream());
                String names = properties.getProperty("components");
                if (names != null) {
                    StringTokenizer tok = new StringTokenizer(names);
                    while (tok.hasMoreTokens()) {
                        String name = tok.nextToken();

                        // try to find the class name for this component
                        String className = null;
                        InputStream is = null;
                        try {
                            // now load the component name resource so we can grab its properties and the class name
                            Enumeration<URL> urls = camelContext.getClassResolver().loadAllResourcesAsURL(COMPONENT_BASE + name);
                            if (urls != null && urls.hasMoreElements()) {
                                is = urls.nextElement().openStream();
                            }
                            if (is != null) {
                                Properties compProperties = new Properties();
                                compProperties.load(is);
                                if (!compProperties.isEmpty()) {
                                    className = compProperties.getProperty("class");
                                }
                            }
                        } catch (Exception e) {
                            // ignore
                        } finally {
                            IOHelper.close(is);
                        }

                        // inherit properties we loaded first, as it has maven details
                        Properties prop = new Properties();
                        prop.putAll(properties);
                        if (camelContext.hasComponent(name) != null) {
                            prop.put("component", camelContext.getComponent(name));
                        }
                        if (className != null) {
                            prop.put("class", className);
                        }
                        prop.put("name", name);
                        map.put(name, prop);
                    }
                }
            } catch (IOException e) {
                throw new LoadPropertiesException(url, e);
            }
        }

        // lets see what other components are registered on camel context
        List<String> names = camelContext.getComponentNames();
        for (String name : names) {
            if (!map.containsKey(name)) {
                Component component = camelContext.getComponent(name);
                if (component != null) {
                    Properties properties = new Properties();
                    properties.put("component", component);
                    properties.put("class", component.getClass().getName());
                    properties.put("name", name);
                    // override default component if name clash
                    map.put(name, properties);
                }
            }
        }

        // lets see what other components are in the registry
        Map<String, Component> beanMap = camelContext.getRegistry().findByTypeWithName(Component.class);
        Set<Map.Entry<String, Component>> entries = beanMap.entrySet();
        for (Map.Entry<String, Component> entry : entries) {
            String name = entry.getKey();
            if (!map.containsKey(name)) {
                Component component = entry.getValue();
                if (component != null) {
                    Properties properties = new Properties();
                    properties.put("component", component);
                    properties.put("class", component.getClass().getName());
                    properties.put("name", name);
                    map.put(name, properties);
                }
            }
        }
        return map;
    }

    /**
     * Gets the route startup order for the given route id
     *
     * @param camelContext  the camel context
     * @param routeId       the id of the route
     * @return the startup order, or <tt>0</tt> if not possible to determine
     */
    public static int getRouteStartupOrder(CamelContext camelContext, String routeId) {
        for (RouteStartupOrder order : camelContext.adapt(ExtendedCamelContext.class).getRouteStartupOrder()) {
            if (order.getRoute().getId().equals(routeId)) {
                return order.getStartupOrder();
            }
        }
        return 0;
    }

    /**
     * A helper method to access a camel context properties with a prefix
     *
     * @param prefix       the prefix
     * @param camelContext the camel context
     * @return the properties which holds the camel context properties with the prefix,
     *         and the key omit the prefix part
     */
    public static Properties getCamelPropertiesWithPrefix(String prefix, CamelContext camelContext) {
        Properties answer = new Properties();
        Map<String, String> camelProperties = camelContext.getGlobalOptions();
        if (camelProperties != null) {
            for (Map.Entry<String, String> entry : camelProperties.entrySet()) {
                String key = entry.getKey();
                if (key != null && key.startsWith(prefix)) {
                    answer.put(key.substring(prefix.length()), entry.getValue());
                }
            }
        }
        return answer;
    }

    /**
     * Gets the route id the given node belongs to.
     *
     * @param node the node
     * @return the route id, or <tt>null</tt> if not possible to find
     */
    public static String getRouteId(NamedNode node) {
        NamedNode parent = node;
        while (parent != null && parent.getParent() != null) {
            parent = parent.getParent();
        }
        return parent != null ? parent.getId() : null;
    }

}
