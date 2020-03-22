/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.velocity;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class VelocityEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        VelocityEndpoint target = (VelocityEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "contentcache":
        case "contentCache": target.setContentCache(property(camelContext, boolean.class, value)); return true;
        case "encoding": target.setEncoding(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "loadercache":
        case "loaderCache": target.setLoaderCache(property(camelContext, boolean.class, value)); return true;
        case "propertiesfile":
        case "propertiesFile": target.setPropertiesFile(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("contentCache", boolean.class);
        answer.put("encoding", java.lang.String.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("loaderCache", boolean.class);
        answer.put("propertiesFile", java.lang.String.class);
        answer.put("synchronous", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        VelocityEndpoint target = (VelocityEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "contentcache":
        case "contentCache": return target.isContentCache();
        case "encoding": return target.getEncoding();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "loadercache":
        case "loaderCache": return target.isLoaderCache();
        case "propertiesfile":
        case "propertiesFile": return target.getPropertiesFile();
        case "synchronous": return target.isSynchronous();
        default: return null;
        }
    }
}

