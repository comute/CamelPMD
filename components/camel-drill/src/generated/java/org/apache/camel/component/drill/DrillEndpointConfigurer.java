/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.drill;

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
public class DrillEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        DrillEndpoint target = (DrillEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "clusterid":
        case "clusterId": target.setClusterId(property(camelContext, java.lang.String.class, value)); return true;
        case "directory": target.setDirectory(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "mode": target.setMode(property(camelContext, org.apache.camel.component.drill.DrillConnectionMode.class, value)); return true;
        case "port": target.setPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("clusterId", java.lang.String.class);
        answer.put("directory", java.lang.String.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("mode", org.apache.camel.component.drill.DrillConnectionMode.class);
        answer.put("port", java.lang.Integer.class);
        answer.put("synchronous", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        DrillEndpoint target = (DrillEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "clusterid":
        case "clusterId": return target.getClusterId();
        case "directory": return target.getDirectory();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "mode": return target.getMode();
        case "port": return target.getPort();
        case "synchronous": return target.isSynchronous();
        default: return null;
        }
    }
}

