/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.ignite.set;

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
public class IgniteSetEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        IgniteSetEndpoint target = (IgniteSetEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "configuration": target.setConfiguration(property(camelContext, org.apache.ignite.configuration.CollectionConfiguration.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": target.setOperation(property(camelContext, org.apache.camel.component.ignite.set.IgniteSetOperation.class, value)); return true;
        case "propagateincomingbodyifnoreturnvalue":
        case "propagateIncomingBodyIfNoReturnValue": target.setPropagateIncomingBodyIfNoReturnValue(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "treatcollectionsascacheobjects":
        case "treatCollectionsAsCacheObjects": target.setTreatCollectionsAsCacheObjects(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "configuration": return org.apache.ignite.configuration.CollectionConfiguration.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "operation": return org.apache.camel.component.ignite.set.IgniteSetOperation.class;
        case "propagateincomingbodyifnoreturnvalue":
        case "propagateIncomingBodyIfNoReturnValue": return boolean.class;
        case "synchronous": return boolean.class;
        case "treatcollectionsascacheobjects":
        case "treatCollectionsAsCacheObjects": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        IgniteSetEndpoint target = (IgniteSetEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "configuration": return target.getConfiguration();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "operation": return target.getOperation();
        case "propagateincomingbodyifnoreturnvalue":
        case "propagateIncomingBodyIfNoReturnValue": return target.isPropagateIncomingBodyIfNoReturnValue();
        case "synchronous": return target.isSynchronous();
        case "treatcollectionsascacheobjects":
        case "treatCollectionsAsCacheObjects": return target.isTreatCollectionsAsCacheObjects();
        default: return null;
        }
    }
}

