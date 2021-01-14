/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jsonata;

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
public class JsonataEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        JsonataEndpoint target = (JsonataEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowcontextmapall":
        case "allowContextMapAll": target.setAllowContextMapAll(property(camelContext, boolean.class, value)); return true;
        case "contentcache":
        case "contentCache": target.setContentCache(property(camelContext, boolean.class, value)); return true;
        case "inputtype":
        case "inputType": target.setInputType(property(camelContext, org.apache.camel.component.jsonata.JsonataInputOutputType.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "outputtype":
        case "outputType": target.setOutputType(property(camelContext, org.apache.camel.component.jsonata.JsonataInputOutputType.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowcontextmapall":
        case "allowContextMapAll": return boolean.class;
        case "contentcache":
        case "contentCache": return boolean.class;
        case "inputtype":
        case "inputType": return org.apache.camel.component.jsonata.JsonataInputOutputType.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "outputtype":
        case "outputType": return org.apache.camel.component.jsonata.JsonataInputOutputType.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        JsonataEndpoint target = (JsonataEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowcontextmapall":
        case "allowContextMapAll": return target.isAllowContextMapAll();
        case "contentcache":
        case "contentCache": return target.isContentCache();
        case "inputtype":
        case "inputType": return target.getInputType();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "outputtype":
        case "outputType": return target.getOutputType();
        default: return null;
        }
    }
}

