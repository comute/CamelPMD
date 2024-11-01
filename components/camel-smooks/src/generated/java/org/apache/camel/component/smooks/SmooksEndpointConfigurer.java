/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.smooks;

import javax.annotation.processing.Generated;
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
@Generated("org.apache.camel.maven.packaging.EndpointSchemaGeneratorMojo")
@SuppressWarnings("unchecked")
public class SmooksEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SmooksEndpoint target = (SmooksEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowexecutioncontextfromheader":
        case "allowExecutionContextFromHeader": target.setAllowExecutionContextFromHeader(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "reportpath":
        case "reportPath": target.setReportPath(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowexecutioncontextfromheader":
        case "allowExecutionContextFromHeader": return java.lang.Boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "reportpath":
        case "reportPath": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        SmooksEndpoint target = (SmooksEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowexecutioncontextfromheader":
        case "allowExecutionContextFromHeader": return target.getAllowExecutionContextFromHeader();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "reportpath":
        case "reportPath": return target.getReportPath();
        default: return null;
        }
    }
}

