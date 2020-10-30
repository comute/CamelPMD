/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.ahc.ws;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.ahc.AhcEndpointConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class WsEndpointConfigurer extends AhcEndpointConfigurer implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("httpUri", java.net.URI.class);
        map.put("bridgeEndpoint", boolean.class);
        map.put("bufferSize", int.class);
        map.put("headerFilterStrategy", org.apache.camel.spi.HeaderFilterStrategy.class);
        map.put("throwExceptionOnFailure", boolean.class);
        map.put("transferException", boolean.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("sendMessageOnError", boolean.class);
        map.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        map.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        map.put("connectionClose", boolean.class);
        map.put("cookieHandler", org.apache.camel.http.base.cookie.CookieHandler.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("useStreaming", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("binding", org.apache.camel.component.ahc.AhcBinding.class);
        map.put("clientConfig", org.asynchttpclient.AsyncHttpClientConfig.class);
        map.put("clientConfigOptions", java.util.Map.class);
        map.put("synchronous", boolean.class);
        map.put("clientConfigRealmOptions", java.util.Map.class);
        map.put("sslContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addConfigurerClearer(WsEndpointConfigurer::clearConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        WsEndpoint target = (WsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "sendmessageonerror":
        case "sendMessageOnError": target.setSendMessageOnError(property(camelContext, boolean.class, value)); return true;
        case "usestreaming":
        case "useStreaming": target.setUseStreaming(property(camelContext, boolean.class, value)); return true;
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
        WsEndpoint target = (WsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "sendmessageonerror":
        case "sendMessageOnError": return target.isSendMessageOnError();
        case "usestreaming":
        case "useStreaming": return target.isUseStreaming();
        default: return super.getOptionValue(obj, name, ignoreCase);
        }
    }
}

