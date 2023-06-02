/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.dataformat.swift.mt;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SwiftMtDataFormatConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        SwiftMtDataFormat dataformat = (SwiftMtDataFormat) target;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "writeinjson":
        case "writeInJson": dataformat.setWriteInJson(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}

