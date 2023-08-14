/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.stub;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.seda.SedaComponentConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class StubComponentConfigurer extends SedaComponentConfigurer implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        StubComponent target = (StubComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "shadow": target.setShadow(property(camelContext, boolean.class, value)); return true;
        case "shadowpattern":
        case "shadowPattern": target.setShadowPattern(property(camelContext, java.lang.String.class, value)); return true;
        default: return true;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "shadow": return boolean.class;
        case "shadowpattern":
        case "shadowPattern": return java.lang.String.class;
        default: return super.getOptionType(name, ignoreCase);
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        StubComponent target = (StubComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "shadow": return target.isShadow();
        case "shadowpattern":
        case "shadowPattern": return target.getShadowPattern();
        default: return super.getOptionValue(obj, name, ignoreCase);
        }
    }
}

