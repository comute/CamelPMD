/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.soroushbot.component;

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
public class SoroushBotEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

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
        case "maxRetryWaitingTime": target.setMaxRetryWaitingTime(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "queuecapacityperthread":
        case "queueCapacityPerThread": target.setQueueCapacityPerThread(property(camelContext, int.class, value)); return true;
        case "reconnectidleconnectiontimeout":
        case "reconnectIdleConnectionTimeout": target.setReconnectIdleConnectionTimeout(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "retryexponentialcoefficient":
        case "retryExponentialCoefficient": target.setRetryExponentialCoefficient(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "retrylinearincrement":
        case "retryLinearIncrement": target.setRetryLinearIncrement(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "retrywaitingtime":
        case "retryWaitingTime": target.setRetryWaitingTime(property(camelContext, long.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "authorizationtoken":
        case "authorizationToken": return java.lang.String.class;
        case "autodownload":
        case "autoDownload": return boolean.class;
        case "autouploadfile":
        case "autoUploadFile": return boolean.class;
        case "backoffstrategy":
        case "backOffStrategy": return java.lang.String.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "concurrentconsumers":
        case "concurrentConsumers": return int.class;
        case "connectiontimeout":
        case "connectionTimeout": return int.class;
        case "downloadthumbnail":
        case "downloadThumbnail": return boolean.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "forcedownload":
        case "forceDownload": return boolean.class;
        case "forceupload":
        case "forceUpload": return boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "maxconnectionretry":
        case "maxConnectionRetry": return int.class;
        case "maxretrywaitingtime":
        case "maxRetryWaitingTime": return long.class;
        case "queuecapacityperthread":
        case "queueCapacityPerThread": return int.class;
        case "reconnectidleconnectiontimeout":
        case "reconnectIdleConnectionTimeout": return long.class;
        case "retryexponentialcoefficient":
        case "retryExponentialCoefficient": return long.class;
        case "retrylinearincrement":
        case "retryLinearIncrement": return long.class;
        case "retrywaitingtime":
        case "retryWaitingTime": return long.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        SoroushBotEndpoint target = (SoroushBotEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "authorizationtoken":
        case "authorizationToken": return target.getAuthorizationToken();
        case "autodownload":
        case "autoDownload": return target.isAutoDownload();
        case "autouploadfile":
        case "autoUploadFile": return target.isAutoUploadFile();
        case "backoffstrategy":
        case "backOffStrategy": return target.getBackOffStrategy();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "concurrentconsumers":
        case "concurrentConsumers": return target.getConcurrentConsumers();
        case "connectiontimeout":
        case "connectionTimeout": return target.getConnectionTimeout();
        case "downloadthumbnail":
        case "downloadThumbnail": return target.isDownloadThumbnail();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "forcedownload":
        case "forceDownload": return target.isForceDownload();
        case "forceupload":
        case "forceUpload": return target.isForceUpload();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxconnectionretry":
        case "maxConnectionRetry": return target.getMaxConnectionRetry();
        case "maxretrywaitingtime":
        case "maxRetryWaitingTime": return target.getMaxRetryWaitingTime();
        case "queuecapacityperthread":
        case "queueCapacityPerThread": return target.getQueueCapacityPerThread();
        case "reconnectidleconnectiontimeout":
        case "reconnectIdleConnectionTimeout": return target.getReconnectIdleConnectionTimeout();
        case "retryexponentialcoefficient":
        case "retryExponentialCoefficient": return target.getRetryExponentialCoefficient();
        case "retrylinearincrement":
        case "retryLinearIncrement": return target.getRetryLinearIncrement();
        case "retrywaitingtime":
        case "retryWaitingTime": return target.getRetryWaitingTime();
        default: return null;
        }
    }
}

