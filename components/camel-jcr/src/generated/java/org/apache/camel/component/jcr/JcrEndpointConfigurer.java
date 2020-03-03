/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jcr;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class JcrEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        JcrEndpoint target = (JcrEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "deep": target.setDeep(property(camelContext, boolean.class, value)); return true;
        case "eventtypes":
        case "eventTypes": target.setEventTypes(property(camelContext, int.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "nolocal":
        case "noLocal": target.setNoLocal(property(camelContext, boolean.class, value)); return true;
        case "nodetypenames":
        case "nodeTypeNames": target.setNodeTypeNames(property(camelContext, java.lang.String.class, value)); return true;
        case "password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "sessionlivecheckinterval":
        case "sessionLiveCheckInterval": target.setSessionLiveCheckInterval(property(camelContext, long.class, value)); return true;
        case "sessionlivecheckintervalonstart":
        case "sessionLiveCheckIntervalOnStart": target.setSessionLiveCheckIntervalOnStart(property(camelContext, long.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "username": target.setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "uuids": target.setUuids(property(camelContext, java.lang.String.class, value)); return true;
        case "workspacename":
        case "workspaceName": target.setWorkspaceName(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}

