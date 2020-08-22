/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.main;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.main.MySecondFoo;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class MySecondFooConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.main.MySecondFoo target = (org.apache.camel.main.MySecondFoo) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bars":
        case "Bars": target.setBars(property(camelContext, java.util.List.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("Bars", java.util.List.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.main.MySecondFoo target = (org.apache.camel.main.MySecondFoo) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bars":
        case "Bars": return target.getBars();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bars":
        case "Bars": return org.apache.camel.main.MySecondBar.class;
        default: return null;
        }
    }
}

