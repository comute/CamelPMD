/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.http.common;

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
public final class HttpConverterLoader implements TypeConverterLoader, CamelContextAware {

    private CamelContext camelContext;

    public HttpConverterLoader() {
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
        registerConverters(registry);
    }

    private void registerConverters(TypeConverterRegistry registry) {
        addTypeConverter(registry, java.io.BufferedReader.class, org.apache.camel.http.common.HttpMessage.class, false,
            (type, exchange, value) -> org.apache.camel.http.common.HttpConverter.toReader((org.apache.camel.http.common.HttpMessage) value));
        addTypeConverter(registry, java.io.InputStream.class, javax.servlet.http.HttpServletRequest.class, false,
            (type, exchange, value) -> org.apache.camel.http.common.HttpConverter.toInputStream((javax.servlet.http.HttpServletRequest) value, exchange));
        addTypeConverter(registry, java.io.InputStream.class, org.apache.camel.http.common.HttpMessage.class, false,
            (type, exchange, value) -> org.apache.camel.http.common.HttpConverter.toInputStream((org.apache.camel.http.common.HttpMessage) value, exchange));
        addTypeConverter(registry, javax.servlet.ServletInputStream.class, org.apache.camel.http.common.HttpMessage.class, false,
            (type, exchange, value) -> org.apache.camel.http.common.HttpConverter.toServletInputStream((org.apache.camel.http.common.HttpMessage) value));
        addTypeConverter(registry, javax.servlet.http.HttpServletRequest.class, org.apache.camel.Message.class, false,
            (type, exchange, value) -> org.apache.camel.http.common.HttpConverter.toServletRequest((org.apache.camel.Message) value));
        addTypeConverter(registry, javax.servlet.http.HttpServletResponse.class, org.apache.camel.Message.class, false,
            (type, exchange, value) -> org.apache.camel.http.common.HttpConverter.toServletResponse((org.apache.camel.Message) value));
    }

    private static void addTypeConverter(TypeConverterRegistry registry, Class<?> toType, Class<?> fromType, boolean allowNull, SimpleTypeConverter.ConversionMethod method) { 
        registry.addTypeConverter(toType, fromType, new SimpleTypeConverter(allowNull, method));
    }

}
