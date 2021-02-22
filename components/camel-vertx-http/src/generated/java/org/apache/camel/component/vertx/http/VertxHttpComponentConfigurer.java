/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.vertx.http;

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
public class VertxHttpComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        VertxHttpComponent target = (VertxHttpComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowjavaserializedobject":
        case "allowJavaSerializedObject": target.setAllowJavaSerializedObject(property(camelContext, boolean.class, value)); return true;
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "basicauthpassword":
        case "basicAuthPassword": target.setBasicAuthPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "basicauthusername":
        case "basicAuthUsername": target.setBasicAuthUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "bearertoken":
        case "bearerToken": target.setBearerToken(property(camelContext, java.lang.String.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "proxyhost":
        case "proxyHost": target.setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxypassword":
        case "proxyPassword": target.setProxyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": target.setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxytype":
        case "proxyType": target.setProxyType(property(camelContext, io.vertx.core.net.ProxyType.class, value)); return true;
        case "proxyusername":
        case "proxyUsername": target.setProxyUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "responsepayloadasbytearray":
        case "responsePayloadAsByteArray": target.setResponsePayloadAsByteArray(property(camelContext, boolean.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": target.setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        case "vertx": target.setVertx(property(camelContext, io.vertx.core.Vertx.class, value)); return true;
        case "vertxhttpbinding":
        case "vertxHttpBinding": target.setVertxHttpBinding(property(camelContext, org.apache.camel.component.vertx.http.VertxHttpBinding.class, value)); return true;
        case "vertxoptions":
        case "vertxOptions": target.setVertxOptions(property(camelContext, io.vertx.core.VertxOptions.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowjavaserializedobject":
        case "allowJavaSerializedObject": return boolean.class;
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "basicauthpassword":
        case "basicAuthPassword": return java.lang.String.class;
        case "basicauthusername":
        case "basicAuthUsername": return java.lang.String.class;
        case "bearertoken":
        case "bearerToken": return java.lang.String.class;
        case "headerfilterstrategy":
        case "headerFilterStrategy": return org.apache.camel.spi.HeaderFilterStrategy.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "proxyhost":
        case "proxyHost": return java.lang.String.class;
        case "proxypassword":
        case "proxyPassword": return java.lang.String.class;
        case "proxyport":
        case "proxyPort": return java.lang.Integer.class;
        case "proxytype":
        case "proxyType": return io.vertx.core.net.ProxyType.class;
        case "proxyusername":
        case "proxyUsername": return java.lang.String.class;
        case "responsepayloadasbytearray":
        case "responsePayloadAsByteArray": return boolean.class;
        case "sslcontextparameters":
        case "sslContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": return boolean.class;
        case "vertx": return io.vertx.core.Vertx.class;
        case "vertxhttpbinding":
        case "vertxHttpBinding": return org.apache.camel.component.vertx.http.VertxHttpBinding.class;
        case "vertxoptions":
        case "vertxOptions": return io.vertx.core.VertxOptions.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        VertxHttpComponent target = (VertxHttpComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowjavaserializedobject":
        case "allowJavaSerializedObject": return target.isAllowJavaSerializedObject();
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "basicauthpassword":
        case "basicAuthPassword": return target.getBasicAuthPassword();
        case "basicauthusername":
        case "basicAuthUsername": return target.getBasicAuthUsername();
        case "bearertoken":
        case "bearerToken": return target.getBearerToken();
        case "headerfilterstrategy":
        case "headerFilterStrategy": return target.getHeaderFilterStrategy();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "proxyhost":
        case "proxyHost": return target.getProxyHost();
        case "proxypassword":
        case "proxyPassword": return target.getProxyPassword();
        case "proxyport":
        case "proxyPort": return target.getProxyPort();
        case "proxytype":
        case "proxyType": return target.getProxyType();
        case "proxyusername":
        case "proxyUsername": return target.getProxyUsername();
        case "responsepayloadasbytearray":
        case "responsePayloadAsByteArray": return target.isResponsePayloadAsByteArray();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getSslContextParameters();
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": return target.isUseGlobalSslContextParameters();
        case "vertx": return target.getVertx();
        case "vertxhttpbinding":
        case "vertxHttpBinding": return target.getVertxHttpBinding();
        case "vertxoptions":
        case "vertxOptions": return target.getVertxOptions();
        default: return null;
        }
    }
}

