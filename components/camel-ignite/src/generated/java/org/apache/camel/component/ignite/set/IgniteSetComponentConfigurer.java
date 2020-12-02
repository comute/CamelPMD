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
public class IgniteSetComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        IgniteSetComponent target = (IgniteSetComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "configurationresource":
        case "configurationResource": target.setConfigurationResource(property(camelContext, java.lang.Object.class, value)); return true;
        case "ignite": target.setIgnite(property(camelContext, org.apache.ignite.Ignite.class, value)); return true;
        case "igniteconfiguration":
        case "igniteConfiguration": target.setIgniteConfiguration(property(camelContext, org.apache.ignite.configuration.IgniteConfiguration.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "configurationresource":
        case "configurationResource": return java.lang.Object.class;
        case "ignite": return org.apache.ignite.Ignite.class;
        case "igniteconfiguration":
        case "igniteConfiguration": return org.apache.ignite.configuration.IgniteConfiguration.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        IgniteSetComponent target = (IgniteSetComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "configurationresource":
        case "configurationResource": return target.getConfigurationResource();
        case "ignite": return target.getIgnite();
        case "igniteconfiguration":
        case "igniteConfiguration": return target.getIgniteConfiguration();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        default: return null;
        }
    }
}

