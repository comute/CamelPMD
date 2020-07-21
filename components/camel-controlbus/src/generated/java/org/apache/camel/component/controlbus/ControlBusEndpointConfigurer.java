/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.controlbus;

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
public class ControlBusEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        ControlBusEndpoint target = (ControlBusEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "action": target.setAction(property(camelContext, java.lang.String.class, value)); return true;
        case "async": target.setAsync(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "logginglevel":
        case "loggingLevel": target.setLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "restartdelay":
        case "restartDelay": target.setRestartDelay(property(camelContext, int.class, value)); return true;
        case "routeid":
        case "routeId": target.setRouteId(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("action", java.lang.String.class);
        answer.put("async", boolean.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("loggingLevel", org.apache.camel.LoggingLevel.class);
        answer.put("restartDelay", int.class);
        answer.put("routeId", java.lang.String.class);
        answer.put("synchronous", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        ControlBusEndpoint target = (ControlBusEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "action": return target.getAction();
        case "async": return target.isAsync();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "logginglevel":
        case "loggingLevel": return target.getLoggingLevel();
        case "restartdelay":
        case "restartDelay": return target.getRestartDelay();
        case "routeid":
        case "routeId": return target.getRouteId();
        case "synchronous": return target.isSynchronous();
        default: return null;
        }
    }
}

