/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.couchbase;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class CouchbaseEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        CouchbaseEndpoint target = (CouchbaseEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalhosts":
        case "additionalHosts": target.setAdditionalHosts(property(camelContext, java.lang.String.class, value)); return true;
        case "autostartidforinserts":
        case "autoStartIdForInserts": target.setAutoStartIdForInserts(property(camelContext, boolean.class, value)); return true;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "bucket": target.setBucket(property(camelContext, java.lang.String.class, value)); return true;
        case "collection": target.setCollection(property(camelContext, java.lang.String.class, value)); return true;
        case "consumerprocessedstrategy":
        case "consumerProcessedStrategy": target.setConsumerProcessedStrategy(property(camelContext, java.lang.String.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "descending": target.setDescending(property(camelContext, boolean.class, value)); return true;
        case "designdocumentname":
        case "designDocumentName": target.setDesignDocumentName(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "key": target.setKey(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "limit": target.setLimit(property(camelContext, int.class, value)); return true;
        case "operation": target.setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "persistto":
        case "persistTo": target.setPersistTo(property(camelContext, int.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "producerretryattempts":
        case "producerRetryAttempts": target.setProducerRetryAttempts(property(camelContext, int.class, value)); return true;
        case "producerretrypause":
        case "producerRetryPause": target.setProducerRetryPause(property(camelContext, int.class, value)); return true;
        case "querytimeout":
        case "queryTimeout": target.setQueryTimeout(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "rangeendkey":
        case "rangeEndKey": target.setRangeEndKey(property(camelContext, java.lang.String.class, value)); return true;
        case "rangestartkey":
        case "rangeStartKey": target.setRangeStartKey(property(camelContext, java.lang.String.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "replicateto":
        case "replicateTo": target.setReplicateTo(property(camelContext, int.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.Object.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "scope": target.setScope(property(camelContext, java.lang.String.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "skip": target.setSkip(property(camelContext, int.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "startingidforinsertsfrom":
        case "startingIdForInsertsFrom": target.setStartingIdForInsertsFrom(property(camelContext, long.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "username": target.setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "viewname":
        case "viewName": target.setViewName(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("additionalHosts", java.lang.String.class);
        answer.put("autoStartIdForInserts", boolean.class);
        answer.put("backoffErrorThreshold", int.class);
        answer.put("backoffIdleThreshold", int.class);
        answer.put("backoffMultiplier", int.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("bucket", java.lang.String.class);
        answer.put("collection", java.lang.String.class);
        answer.put("consumerProcessedStrategy", java.lang.String.class);
        answer.put("delay", long.class);
        answer.put("descending", boolean.class);
        answer.put("designDocumentName", java.lang.String.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("greedy", boolean.class);
        answer.put("initialDelay", long.class);
        answer.put("key", java.lang.String.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("limit", int.class);
        answer.put("operation", java.lang.String.class);
        answer.put("password", java.lang.String.class);
        answer.put("persistTo", int.class);
        answer.put("pollStrategy", org.apache.camel.spi.PollingConsumerPollStrategy.class);
        answer.put("producerRetryAttempts", int.class);
        answer.put("producerRetryPause", int.class);
        answer.put("queryTimeout", long.class);
        answer.put("rangeEndKey", java.lang.String.class);
        answer.put("rangeStartKey", java.lang.String.class);
        answer.put("repeatCount", long.class);
        answer.put("replicateTo", int.class);
        answer.put("runLoggingLevel", org.apache.camel.LoggingLevel.class);
        answer.put("scheduledExecutorService", java.util.concurrent.ScheduledExecutorService.class);
        answer.put("scheduler", java.lang.Object.class);
        answer.put("schedulerProperties", java.util.Map.class);
        answer.put("scope", java.lang.String.class);
        answer.put("sendEmptyMessageWhenIdle", boolean.class);
        answer.put("skip", int.class);
        answer.put("startScheduler", boolean.class);
        answer.put("startingIdForInsertsFrom", long.class);
        answer.put("synchronous", boolean.class);
        answer.put("timeUnit", java.util.concurrent.TimeUnit.class);
        answer.put("useFixedDelay", boolean.class);
        answer.put("username", java.lang.String.class);
        answer.put("viewName", java.lang.String.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        CouchbaseEndpoint target = (CouchbaseEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalhosts":
        case "additionalHosts": return target.getAdditionalHosts();
        case "autostartidforinserts":
        case "autoStartIdForInserts": return target.isAutoStartIdForInserts();
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return target.getBackoffErrorThreshold();
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return target.getBackoffIdleThreshold();
        case "backoffmultiplier":
        case "backoffMultiplier": return target.getBackoffMultiplier();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "bucket": return target.getBucket();
        case "collection": return target.getCollection();
        case "consumerprocessedstrategy":
        case "consumerProcessedStrategy": return target.getConsumerProcessedStrategy();
        case "delay": return target.getDelay();
        case "descending": return target.isDescending();
        case "designdocumentname":
        case "designDocumentName": return target.getDesignDocumentName();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "greedy": return target.isGreedy();
        case "initialdelay":
        case "initialDelay": return target.getInitialDelay();
        case "key": return target.getKey();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "limit": return target.getLimit();
        case "operation": return target.getOperation();
        case "password": return target.getPassword();
        case "persistto":
        case "persistTo": return target.getPersistTo();
        case "pollstrategy":
        case "pollStrategy": return target.getPollStrategy();
        case "producerretryattempts":
        case "producerRetryAttempts": return target.getProducerRetryAttempts();
        case "producerretrypause":
        case "producerRetryPause": return target.getProducerRetryPause();
        case "querytimeout":
        case "queryTimeout": return target.getQueryTimeout();
        case "rangeendkey":
        case "rangeEndKey": return target.getRangeEndKey();
        case "rangestartkey":
        case "rangeStartKey": return target.getRangeStartKey();
        case "repeatcount":
        case "repeatCount": return target.getRepeatCount();
        case "replicateto":
        case "replicateTo": return target.getReplicateTo();
        case "runlogginglevel":
        case "runLoggingLevel": return target.getRunLoggingLevel();
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return target.getScheduledExecutorService();
        case "scheduler": return target.getScheduler();
        case "schedulerproperties":
        case "schedulerProperties": return target.getSchedulerProperties();
        case "scope": return target.getScope();
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return target.isSendEmptyMessageWhenIdle();
        case "skip": return target.getSkip();
        case "startscheduler":
        case "startScheduler": return target.isStartScheduler();
        case "startingidforinsertsfrom":
        case "startingIdForInsertsFrom": return target.getStartingIdForInsertsFrom();
        case "synchronous": return target.isSynchronous();
        case "timeunit":
        case "timeUnit": return target.getTimeUnit();
        case "usefixeddelay":
        case "useFixedDelay": return target.isUseFixedDelay();
        case "username": return target.getUsername();
        case "viewname":
        case "viewName": return target.getViewName();
        default: return null;
        }
    }
}

