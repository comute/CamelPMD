/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.atmosphere.websocket;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.servlet.ServletComponentConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class WebsocketComponentConfigurer extends ServletComponentConfigurer implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("bridgeErrorHandler", boolean.class);
        map.put("servletName", java.lang.String.class);
        map.put("attachmentMultipartBinding", boolean.class);
        map.put("fileNameExtWhitelist", java.lang.String.class);
        map.put("httpRegistry", org.apache.camel.http.common.HttpRegistry.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("allowJavaSerializedObject", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("httpBinding", org.apache.camel.http.common.HttpBinding.class);
        map.put("httpConfiguration", org.apache.camel.http.common.HttpConfiguration.class);
        map.put("headerFilterStrategy", org.apache.camel.spi.HeaderFilterStrategy.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addConfigurerClearer(WebsocketComponentConfigurer::clearConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        WebsocketComponent target = (WebsocketComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        default: return super.configure(camelContext, obj, name, value, ignoreCase);
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    public static void clearBootstrapConfigurers() {
    }

    public static void clearConfigurers() {
        ALL_OPTIONS.clear();
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        WebsocketComponent target = (WebsocketComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        default: return super.getOptionValue(obj, name, ignoreCase);
        }
    }
}

