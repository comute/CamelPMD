/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.milvus;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class MilvusEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        MilvusEndpoint target = (MilvusEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "host": target.getConfiguration().setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "port": target.getConfiguration().setPort(property(camelContext, int.class, value)); return true;
        case "timeout": target.getConfiguration().setTimeout(property(camelContext, long.class, value)); return true;
        case "token": target.getConfiguration().setToken(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "host": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "port": return int.class;
        case "timeout": return long.class;
        case "token": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        MilvusEndpoint target = (MilvusEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "host": return target.getConfiguration().getHost();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "port": return target.getConfiguration().getPort();
        case "timeout": return target.getConfiguration().getTimeout();
        case "token": return target.getConfiguration().getToken();
        default: return null;
        }
    }
}

