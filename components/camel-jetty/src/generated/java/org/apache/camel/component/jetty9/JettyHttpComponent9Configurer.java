/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jetty9;

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
public class JettyHttpComponent9Configurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("bridgeErrorHandler", boolean.class);
        map.put("continuationTimeout", java.lang.Long.class);
        map.put("enableJmx", boolean.class);
        map.put("maxThreads", java.lang.Integer.class);
        map.put("minThreads", java.lang.Integer.class);
        map.put("requestBufferSize", java.lang.Integer.class);
        map.put("requestHeaderSize", java.lang.Integer.class);
        map.put("responseBufferSize", java.lang.Integer.class);
        map.put("responseHeaderSize", java.lang.Integer.class);
        map.put("sendServerVersion", boolean.class);
        map.put("useContinuation", boolean.class);
        map.put("useXForwardedForHeader", boolean.class);
        map.put("threadPool", org.eclipse.jetty.util.thread.ThreadPool.class);
        map.put("allowJavaSerializedObject", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("errorHandler", org.eclipse.jetty.server.handler.ErrorHandler.class);
        map.put("httpBinding", org.apache.camel.http.common.HttpBinding.class);
        map.put("httpConfiguration", org.apache.camel.http.common.HttpConfiguration.class);
        map.put("jettyHttpBinding", org.apache.camel.component.jetty.JettyHttpBinding.class);
        map.put("mbContainer", org.eclipse.jetty.jmx.MBeanContainer.class);
        map.put("headerFilterStrategy", org.apache.camel.spi.HeaderFilterStrategy.class);
        map.put("proxyHost", java.lang.String.class);
        map.put("proxyPort", java.lang.Integer.class);
        map.put("keystore", java.lang.String.class);
        map.put("socketConnectorProperties", java.util.Map.class);
        map.put("socketConnectors", java.util.Map.class);
        map.put("sslContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        map.put("sslKeyPassword", java.lang.String.class);
        map.put("sslPassword", java.lang.String.class);
        map.put("sslSocketConnectorProperties", java.util.Map.class);
        map.put("sslSocketConnectors", java.util.Map.class);
        map.put("useGlobalSslContextParameters", boolean.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addConfigurerClearer(JettyHttpComponent9Configurer::clearConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        JettyHttpComponent9 target = (JettyHttpComponent9) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowjavaserializedobject":
        case "allowJavaSerializedObject": target.setAllowJavaSerializedObject(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "continuationtimeout":
        case "continuationTimeout": target.setContinuationTimeout(property(camelContext, java.lang.Long.class, value)); return true;
        case "enablejmx":
        case "enableJmx": target.setEnableJmx(property(camelContext, boolean.class, value)); return true;
        case "errorhandler":
        case "errorHandler": target.setErrorHandler(property(camelContext, org.eclipse.jetty.server.handler.ErrorHandler.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "httpbinding":
        case "httpBinding": target.setHttpBinding(property(camelContext, org.apache.camel.http.common.HttpBinding.class, value)); return true;
        case "httpconfiguration":
        case "httpConfiguration": target.setHttpConfiguration(property(camelContext, org.apache.camel.http.common.HttpConfiguration.class, value)); return true;
        case "jettyhttpbinding":
        case "jettyHttpBinding": target.setJettyHttpBinding(property(camelContext, org.apache.camel.component.jetty.JettyHttpBinding.class, value)); return true;
        case "keystore": target.setKeystore(property(camelContext, java.lang.String.class, value)); return true;
        case "maxthreads":
        case "maxThreads": target.setMaxThreads(property(camelContext, java.lang.Integer.class, value)); return true;
        case "mbcontainer":
        case "mbContainer": target.setMbContainer(property(camelContext, org.eclipse.jetty.jmx.MBeanContainer.class, value)); return true;
        case "minthreads":
        case "minThreads": target.setMinThreads(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyhost":
        case "proxyHost": target.setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": target.setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "requestbuffersize":
        case "requestBufferSize": target.setRequestBufferSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "requestheadersize":
        case "requestHeaderSize": target.setRequestHeaderSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "responsebuffersize":
        case "responseBufferSize": target.setResponseBufferSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "responseheadersize":
        case "responseHeaderSize": target.setResponseHeaderSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "sendserverversion":
        case "sendServerVersion": target.setSendServerVersion(property(camelContext, boolean.class, value)); return true;
        case "socketconnectorproperties":
        case "socketConnectorProperties": target.setSocketConnectorProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "socketconnectors":
        case "socketConnectors": target.setSocketConnectors(property(camelContext, java.util.Map.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "sslkeypassword":
        case "sslKeyPassword": target.setSslKeyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "sslpassword":
        case "sslPassword": target.setSslPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "sslsocketconnectorproperties":
        case "sslSocketConnectorProperties": target.setSslSocketConnectorProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "sslsocketconnectors":
        case "sslSocketConnectors": target.setSslSocketConnectors(property(camelContext, java.util.Map.class, value)); return true;
        case "threadpool":
        case "threadPool": target.setThreadPool(property(camelContext, org.eclipse.jetty.util.thread.ThreadPool.class, value)); return true;
        case "usecontinuation":
        case "useContinuation": target.setUseContinuation(property(camelContext, boolean.class, value)); return true;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": target.setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        case "usexforwardedforheader":
        case "useXForwardedForHeader": target.setUseXForwardedForHeader(property(camelContext, boolean.class, value)); return true;
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
        JettyHttpComponent9 target = (JettyHttpComponent9) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowjavaserializedobject":
        case "allowJavaSerializedObject": return target.isAllowJavaSerializedObject();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "continuationtimeout":
        case "continuationTimeout": return target.getContinuationTimeout();
        case "enablejmx":
        case "enableJmx": return target.isEnableJmx();
        case "errorhandler":
        case "errorHandler": return target.getErrorHandler();
        case "headerfilterstrategy":
        case "headerFilterStrategy": return target.getHeaderFilterStrategy();
        case "httpbinding":
        case "httpBinding": return target.getHttpBinding();
        case "httpconfiguration":
        case "httpConfiguration": return target.getHttpConfiguration();
        case "jettyhttpbinding":
        case "jettyHttpBinding": return target.getJettyHttpBinding();
        case "keystore": return target.getKeystore();
        case "maxthreads":
        case "maxThreads": return target.getMaxThreads();
        case "mbcontainer":
        case "mbContainer": return target.getMbContainer();
        case "minthreads":
        case "minThreads": return target.getMinThreads();
        case "proxyhost":
        case "proxyHost": return target.getProxyHost();
        case "proxyport":
        case "proxyPort": return target.getProxyPort();
        case "requestbuffersize":
        case "requestBufferSize": return target.getRequestBufferSize();
        case "requestheadersize":
        case "requestHeaderSize": return target.getRequestHeaderSize();
        case "responsebuffersize":
        case "responseBufferSize": return target.getResponseBufferSize();
        case "responseheadersize":
        case "responseHeaderSize": return target.getResponseHeaderSize();
        case "sendserverversion":
        case "sendServerVersion": return target.isSendServerVersion();
        case "socketconnectorproperties":
        case "socketConnectorProperties": return target.getSocketConnectorProperties();
        case "socketconnectors":
        case "socketConnectors": return target.getSocketConnectors();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getSslContextParameters();
        case "sslkeypassword":
        case "sslKeyPassword": return target.getSslKeyPassword();
        case "sslpassword":
        case "sslPassword": return target.getSslPassword();
        case "sslsocketconnectorproperties":
        case "sslSocketConnectorProperties": return target.getSslSocketConnectorProperties();
        case "sslsocketconnectors":
        case "sslSocketConnectors": return target.getSslSocketConnectors();
        case "threadpool":
        case "threadPool": return target.getThreadPool();
        case "usecontinuation":
        case "useContinuation": return target.isUseContinuation();
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": return target.isUseGlobalSslContextParameters();
        case "usexforwardedforheader":
        case "useXForwardedForHeader": return target.isUseXForwardedForHeader();
        default: return null;
        }
    }
}

