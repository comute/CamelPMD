/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jclouds;

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
public class JcloudsEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        JcloudsEndpoint target = (JcloudsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "blobname":
        case "blobName": target.getConfiguration().setBlobName(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "container": target.getConfiguration().setContainer(property(camelContext, java.lang.String.class, value)); return true;
        case "directory": target.getConfiguration().setDirectory(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "group": target.getConfiguration().setGroup(property(camelContext, java.lang.String.class, value)); return true;
        case "hardwareid":
        case "hardwareId": target.getConfiguration().setHardwareId(property(camelContext, java.lang.String.class, value)); return true;
        case "imageid":
        case "imageId": target.getConfiguration().setImageId(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "locationid":
        case "locationId": target.getConfiguration().setLocationId(property(camelContext, java.lang.String.class, value)); return true;
        case "nodeid":
        case "nodeId": target.getConfiguration().setNodeId(property(camelContext, java.lang.String.class, value)); return true;
        case "nodestate":
        case "nodeState": target.getConfiguration().setNodeState(property(camelContext, java.lang.String.class, value)); return true;
        case "operation": target.getConfiguration().setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "user": target.getConfiguration().setUser(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "blobname":
        case "blobName": return java.lang.String.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "container": return java.lang.String.class;
        case "directory": return java.lang.String.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "group": return java.lang.String.class;
        case "hardwareid":
        case "hardwareId": return java.lang.String.class;
        case "imageid":
        case "imageId": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "locationid":
        case "locationId": return java.lang.String.class;
        case "nodeid":
        case "nodeId": return java.lang.String.class;
        case "nodestate":
        case "nodeState": return java.lang.String.class;
        case "operation": return java.lang.String.class;
        case "synchronous": return boolean.class;
        case "user": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        JcloudsEndpoint target = (JcloudsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "blobname":
        case "blobName": return target.getConfiguration().getBlobName();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "container": return target.getConfiguration().getContainer();
        case "directory": return target.getConfiguration().getDirectory();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "group": return target.getConfiguration().getGroup();
        case "hardwareid":
        case "hardwareId": return target.getConfiguration().getHardwareId();
        case "imageid":
        case "imageId": return target.getConfiguration().getImageId();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "locationid":
        case "locationId": return target.getConfiguration().getLocationId();
        case "nodeid":
        case "nodeId": return target.getConfiguration().getNodeId();
        case "nodestate":
        case "nodeState": return target.getConfiguration().getNodeState();
        case "operation": return target.getConfiguration().getOperation();
        case "synchronous": return target.isSynchronous();
        case "user": return target.getConfiguration().getUser();
        default: return null;
        }
    }
}

