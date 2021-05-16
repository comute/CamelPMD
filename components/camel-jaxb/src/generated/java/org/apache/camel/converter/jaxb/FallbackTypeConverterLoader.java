/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.converter.jaxb;

import org.apache.camel.CamelContext;
import org.apache.camel.CamelContextAware;
import org.apache.camel.DeferredContextBinding;
import org.apache.camel.Exchange;
import org.apache.camel.TypeConversionException;
import org.apache.camel.TypeConverterLoaderException;
import org.apache.camel.spi.TypeConverterLoader;
import org.apache.camel.spi.TypeConverterRegistry;
import org.apache.camel.support.SimpleTypeConverter;
import org.apache.camel.support.TypeConverterSupport;
import org.apache.camel.util.DoubleMap;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
@DeferredContextBinding
public final class FallbackTypeConverterLoader implements TypeConverterLoader, CamelContextAware {

    private CamelContext camelContext;

    public FallbackTypeConverterLoader() {
    }

    @Override
    public void setCamelContext(CamelContext camelContext) {
        this.camelContext = camelContext;
    }

    @Override
    public CamelContext getCamelContext() {
        return camelContext;
    }

    @Override
    public void load(TypeConverterRegistry registry) throws TypeConverterLoaderException {
        registerFallbackConverters(registry);
    }

    private void registerFallbackConverters(TypeConverterRegistry registry) {
        addFallbackTypeConverter(registry, false, false, (type, exchange, value) -> getFallbackTypeConverter().convertTo(type, exchange, value, registry));
    }

    private static void addFallbackTypeConverter(TypeConverterRegistry registry, boolean allowNull, boolean canPromote, SimpleTypeConverter.ConversionMethod method) { 
        registry.addFallbackTypeConverter(new SimpleTypeConverter(allowNull, method), canPromote);
    }

    private volatile org.apache.camel.converter.jaxb.FallbackTypeConverter fallbackTypeConverter;
    private org.apache.camel.converter.jaxb.FallbackTypeConverter getFallbackTypeConverter() {
        if (fallbackTypeConverter == null) {
            fallbackTypeConverter = new org.apache.camel.converter.jaxb.FallbackTypeConverter();
            CamelContextAware.trySetCamelContext(fallbackTypeConverter, camelContext);
        }
        return fallbackTypeConverter;
    }
}
