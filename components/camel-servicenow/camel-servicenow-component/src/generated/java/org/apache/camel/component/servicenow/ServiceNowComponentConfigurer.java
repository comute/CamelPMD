/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.servicenow;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ServiceNowComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        ServiceNowComponent target = (ServiceNowComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "instancename":
        case "instanceName": target.setInstanceName(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.servicenow.ServiceNowConfiguration.class, value)); return true;
        case "apiurl":
        case "apiUrl": target.setApiUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "username":
        case "userName": target.setUserName(property(camelContext, java.lang.String.class, value)); return true;
        case "password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "oauthclientid":
        case "oauthClientId": target.setOauthClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "oauthclientsecret":
        case "oauthClientSecret": target.setOauthClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "oauthtokenurl":
        case "oauthTokenUrl": target.setOauthTokenUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyhost":
        case "proxyHost": target.setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": target.setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyusername":
        case "proxyUserName": target.setProxyUserName(property(camelContext, java.lang.String.class, value)); return true;
        case "proxypassword":
        case "proxyPassword": target.setProxyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": target.setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}

