/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.dataformat.univocity;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class UniVocityFixedWidthDataFormatConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        UniVocityFixedWidthDataFormat dataformat = (UniVocityFixedWidthDataFormat) target;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "skiptrailingcharsuntilnewline":
        case "skipTrailingCharsUntilNewline": dataformat.setSkipTrailingCharsUntilNewline(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "recordendsonnewline":
        case "recordEndsOnNewline": dataformat.setRecordEndsOnNewline(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "padding": dataformat.setPadding(property(camelContext, java.lang.Character.class, value)); return true;
        default: return false;
        }
    }

}

