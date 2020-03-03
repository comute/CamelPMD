/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.soroushbot.component;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SoroushBotEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SoroushBotEndpoint target = (SoroushBotEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "authorizationtoken":
        case "authorizationToken": target.setAuthorizationToken(property(camelContext, java.lang.String.class, value)); return true;
        case "autodownload":
        case "autoDownload": target.setAutoDownload(property(camelContext, boolean.class, value)); return true;
        case "autouploadfile":
        case "autoUploadFile": target.setAutoUploadFile(property(camelContext, boolean.class, value)); return true;
        case "backoffstrategy":
        case "backOffStrategy": target.setBackOffStrategy(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "concurrentconsumers":
        case "concurrentConsumers": target.setConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "connectiontimeout":
        case "connectionTimeout": target.setConnectionTimeout(property(camelContext, int.class, value)); return true;
        case "downloadthumbnail":
        case "downloadThumbnail": target.setDownloadThumbnail(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "forcedownload":
        case "forceDownload": target.setForceDownload(property(camelContext, boolean.class, value)); return true;
        case "forceupload":
        case "forceUpload": target.setForceUpload(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxconnectionretry":
        case "maxConnectionRetry": target.setMaxConnectionRetry(property(camelContext, int.class, value)); return true;
        case "maxretrywaitingtime":
        case "maxRetryWaitingTime": target.setMaxRetryWaitingTime(property(camelContext, long.class, value)); return true;
        case "queuecapacityperthread":
        case "queueCapacityPerThread": target.setQueueCapacityPerThread(property(camelContext, int.class, value)); return true;
        case "reconnectidleconnectiontimeout":
        case "reconnectIdleConnectionTimeout": target.setReconnectIdleConnectionTimeout(property(camelContext, long.class, value)); return true;
        case "retryexponentialcoefficient":
        case "retryExponentialCoefficient": target.setRetryExponentialCoefficient(property(camelContext, long.class, value)); return true;
        case "retrylinearincrement":
        case "retryLinearIncrement": target.setRetryLinearIncrement(property(camelContext, long.class, value)); return true;
        case "retrywaitingtime":
        case "retryWaitingTime": target.setRetryWaitingTime(property(camelContext, long.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}

