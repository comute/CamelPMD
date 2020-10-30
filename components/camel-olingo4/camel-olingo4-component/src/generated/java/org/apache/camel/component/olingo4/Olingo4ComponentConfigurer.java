/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.olingo4;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class Olingo4ComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("configuration", org.apache.camel.component.olingo4.Olingo4Configuration.class);
        map.put("connectTimeout", int.class);
        map.put("contentType", java.lang.String.class);
        map.put("filterAlreadySeen", boolean.class);
        map.put("httpHeaders", java.util.Map.class);
        map.put("proxy", org.apache.http.HttpHost.class);
        map.put("serviceUri", java.lang.String.class);
        map.put("socketTimeout", int.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("splitResult", boolean.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("httpAsyncClientBuilder", org.apache.http.impl.nio.client.HttpAsyncClientBuilder.class);
        map.put("httpClientBuilder", org.apache.http.impl.client.HttpClientBuilder.class);
        map.put("sslContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        map.put("useGlobalSslContextParameters", boolean.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addConfigurerClearer(Olingo4ComponentConfigurer::clearConfigurers);
    }

    private org.apache.camel.component.olingo4.Olingo4Configuration getOrCreateConfiguration(Olingo4Component target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.olingo4.Olingo4Configuration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        Olingo4Component target = (Olingo4Component) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.olingo4.Olingo4Configuration.class, value)); return true;
        case "connecttimeout":
        case "connectTimeout": getOrCreateConfiguration(target).setConnectTimeout(property(camelContext, int.class, value)); return true;
        case "contenttype":
        case "contentType": getOrCreateConfiguration(target).setContentType(property(camelContext, java.lang.String.class, value)); return true;
        case "filteralreadyseen":
        case "filterAlreadySeen": getOrCreateConfiguration(target).setFilterAlreadySeen(property(camelContext, boolean.class, value)); return true;
        case "httpasyncclientbuilder":
        case "httpAsyncClientBuilder": getOrCreateConfiguration(target).setHttpAsyncClientBuilder(property(camelContext, org.apache.http.impl.nio.client.HttpAsyncClientBuilder.class, value)); return true;
        case "httpclientbuilder":
        case "httpClientBuilder": getOrCreateConfiguration(target).setHttpClientBuilder(property(camelContext, org.apache.http.impl.client.HttpClientBuilder.class, value)); return true;
        case "httpheaders":
        case "httpHeaders": getOrCreateConfiguration(target).setHttpHeaders(property(camelContext, java.util.Map.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "proxy": getOrCreateConfiguration(target).setProxy(property(camelContext, org.apache.http.HttpHost.class, value)); return true;
        case "serviceuri":
        case "serviceUri": getOrCreateConfiguration(target).setServiceUri(property(camelContext, java.lang.String.class, value)); return true;
        case "sockettimeout":
        case "socketTimeout": getOrCreateConfiguration(target).setSocketTimeout(property(camelContext, int.class, value)); return true;
        case "splitresult":
        case "splitResult": getOrCreateConfiguration(target).setSplitResult(property(camelContext, boolean.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": getOrCreateConfiguration(target).setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": target.setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        default: return false;
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
        Olingo4Component target = (Olingo4Component) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "configuration": return target.getConfiguration();
        case "connecttimeout":
        case "connectTimeout": return getOrCreateConfiguration(target).getConnectTimeout();
        case "contenttype":
        case "contentType": return getOrCreateConfiguration(target).getContentType();
        case "filteralreadyseen":
        case "filterAlreadySeen": return getOrCreateConfiguration(target).isFilterAlreadySeen();
        case "httpasyncclientbuilder":
        case "httpAsyncClientBuilder": return getOrCreateConfiguration(target).getHttpAsyncClientBuilder();
        case "httpclientbuilder":
        case "httpClientBuilder": return getOrCreateConfiguration(target).getHttpClientBuilder();
        case "httpheaders":
        case "httpHeaders": return getOrCreateConfiguration(target).getHttpHeaders();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "proxy": return getOrCreateConfiguration(target).getProxy();
        case "serviceuri":
        case "serviceUri": return getOrCreateConfiguration(target).getServiceUri();
        case "sockettimeout":
        case "socketTimeout": return getOrCreateConfiguration(target).getSocketTimeout();
        case "splitresult":
        case "splitResult": return getOrCreateConfiguration(target).isSplitResult();
        case "sslcontextparameters":
        case "sslContextParameters": return getOrCreateConfiguration(target).getSslContextParameters();
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": return target.isUseGlobalSslContextParameters();
        default: return null;
        }
    }
}

