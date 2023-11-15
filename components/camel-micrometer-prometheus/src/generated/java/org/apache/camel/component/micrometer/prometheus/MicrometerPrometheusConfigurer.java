/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.micrometer.prometheus;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.micrometer.prometheus.MicrometerPrometheus;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class MicrometerPrometheusConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.micrometer.prometheus.MicrometerPrometheus target = (org.apache.camel.component.micrometer.prometheus.MicrometerPrometheus) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "camelcontext":
        case "CamelContext": target.setCamelContext(property(camelContext, org.apache.camel.CamelContext.class, value)); return true;
        case "enableexchangeeventnotifier":
        case "EnableExchangeEventNotifier": target.setEnableExchangeEventNotifier(property(camelContext, boolean.class, value)); return true;
        case "enablemessagehistory":
        case "EnableMessageHistory": target.setEnableMessageHistory(property(camelContext, boolean.class, value)); return true;
        case "enablerouteeventnotifier":
        case "EnableRouteEventNotifier": target.setEnableRouteEventNotifier(property(camelContext, boolean.class, value)); return true;
        case "enableroutepolicy":
        case "EnableRoutePolicy": target.setEnableRoutePolicy(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "camelcontext":
        case "CamelContext": return org.apache.camel.CamelContext.class;
        case "enableexchangeeventnotifier":
        case "EnableExchangeEventNotifier": return boolean.class;
        case "enablemessagehistory":
        case "EnableMessageHistory": return boolean.class;
        case "enablerouteeventnotifier":
        case "EnableRouteEventNotifier": return boolean.class;
        case "enableroutepolicy":
        case "EnableRoutePolicy": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.micrometer.prometheus.MicrometerPrometheus target = (org.apache.camel.component.micrometer.prometheus.MicrometerPrometheus) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "camelcontext":
        case "CamelContext": return target.getCamelContext();
        case "enableexchangeeventnotifier":
        case "EnableExchangeEventNotifier": return target.isEnableExchangeEventNotifier();
        case "enablemessagehistory":
        case "EnableMessageHistory": return target.isEnableMessageHistory();
        case "enablerouteeventnotifier":
        case "EnableRouteEventNotifier": return target.isEnableRouteEventNotifier();
        case "enableroutepolicy":
        case "EnableRoutePolicy": return target.isEnableRoutePolicy();
        default: return null;
        }
    }
}

