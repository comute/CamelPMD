/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.minio;

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
public class MinioEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        MinioEndpoint target = (MinioEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": target.getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "autoclosebody":
        case "autoCloseBody": target.getConfiguration().setAutoCloseBody(property(camelContext, boolean.class, value)); return true;
        case "autocreatebucket":
        case "autoCreateBucket": target.getConfiguration().setAutoCreateBucket(property(camelContext, boolean.class, value)); return true;
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
        case "bypassgovernancemode":
        case "bypassGovernanceMode": target.getConfiguration().setBypassGovernanceMode(property(camelContext, boolean.class, value)); return true;
        case "customhttpclient":
        case "customHttpClient": target.getConfiguration().setCustomHttpClient(property(camelContext, okhttp3.OkHttpClient.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "deleteafterread":
        case "deleteAfterRead": target.getConfiguration().setDeleteAfterRead(property(camelContext, boolean.class, value)); return true;
        case "deleteafterwrite":
        case "deleteAfterWrite": target.getConfiguration().setDeleteAfterWrite(property(camelContext, boolean.class, value)); return true;
        case "delimiter": target.getConfiguration().setDelimiter(property(camelContext, java.lang.String.class, value)); return true;
        case "destinationbucketname":
        case "destinationBucketName": target.getConfiguration().setDestinationBucketName(property(camelContext, java.lang.String.class, value)); return true;
        case "destinationobjectname":
        case "destinationObjectName": target.getConfiguration().setDestinationObjectName(property(camelContext, java.lang.String.class, value)); return true;
        case "endpoint": target.getConfiguration().setEndpoint(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "includebody":
        case "includeBody": target.getConfiguration().setIncludeBody(property(camelContext, boolean.class, value)); return true;
        case "includefolders":
        case "includeFolders": target.getConfiguration().setIncludeFolders(property(camelContext, boolean.class, value)); return true;
        case "includeusermetadata":
        case "includeUserMetadata": target.getConfiguration().setIncludeUserMetadata(property(camelContext, boolean.class, value)); return true;
        case "includeversions":
        case "includeVersions": target.getConfiguration().setIncludeVersions(property(camelContext, boolean.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "keyname":
        case "keyName": target.getConfiguration().setKeyName(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "length": target.getConfiguration().setLength(property(camelContext, long.class, value)); return true;
        case "matchetag":
        case "matchETag": target.getConfiguration().setMatchETag(property(camelContext, java.lang.String.class, value)); return true;
        case "maxconnections":
        case "maxConnections": target.setMaxConnections(property(camelContext, int.class, value)); return true;
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": target.setMaxMessagesPerPoll(property(camelContext, int.class, value)); return true;
        case "minioclient":
        case "minioClient": target.getConfiguration().setMinioClient(property(camelContext, io.minio.MinioClient.class, value)); return true;
        case "modifiedsince":
        case "modifiedSince": target.getConfiguration().setModifiedSince(property(camelContext, java.time.ZonedDateTime.class, value)); return true;
        case "moveafterread":
        case "moveAfterRead": target.getConfiguration().setMoveAfterRead(property(camelContext, boolean.class, value)); return true;
        case "notmatchetag":
        case "notMatchETag": target.getConfiguration().setNotMatchETag(property(camelContext, java.lang.String.class, value)); return true;
        case "objectlock":
        case "objectLock": target.getConfiguration().setObjectLock(property(camelContext, boolean.class, value)); return true;
        case "objectname":
        case "objectName": target.getConfiguration().setObjectName(property(camelContext, java.lang.String.class, value)); return true;
        case "offset": target.getConfiguration().setOffset(property(camelContext, long.class, value)); return true;
        case "operation": target.getConfiguration().setOperation(property(camelContext, org.apache.camel.component.minio.MinioOperations.class, value)); return true;
        case "partsize":
        case "partSize": target.getConfiguration().setPartSize(property(camelContext, long.class, value)); return true;
        case "pojorequest":
        case "pojoRequest": target.getConfiguration().setPojoRequest(property(camelContext, boolean.class, value)); return true;
        case "policy": target.getConfiguration().setPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "prefix": target.getConfiguration().setPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": target.getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "recursive": target.getConfiguration().setRecursive(property(camelContext, boolean.class, value)); return true;
        case "region": target.getConfiguration().setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "secretkey":
        case "secretKey": target.getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "secure": target.getConfiguration().setSecure(property(camelContext, boolean.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "serversideencryption":
        case "serverSideEncryption": target.getConfiguration().setServerSideEncryption(property(camelContext, io.minio.ServerSideEncryption.class, value)); return true;
        case "serversideencryptioncustomerkey":
        case "serverSideEncryptionCustomerKey": target.getConfiguration().setServerSideEncryptionCustomerKey(property(camelContext, io.minio.ServerSideEncryptionCustomerKey.class, value)); return true;
        case "startafter":
        case "startAfter": target.getConfiguration().setStartAfter(property(camelContext, java.lang.String.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "storageclass":
        case "storageClass": target.getConfiguration().setStorageClass(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "unmodifiedsince":
        case "unModifiedSince": target.getConfiguration().setUnModifiedSince(property(camelContext, java.time.ZonedDateTime.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "useversion1":
        case "useVersion1": target.getConfiguration().setUseVersion1(property(camelContext, boolean.class, value)); return true;
        case "versionid":
        case "versionId": target.getConfiguration().setVersionId(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("accessKey", java.lang.String.class);
        answer.put("autoCloseBody", boolean.class);
        answer.put("autoCreateBucket", boolean.class);
        answer.put("backoffErrorThreshold", int.class);
        answer.put("backoffIdleThreshold", int.class);
        answer.put("backoffMultiplier", int.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("bypassGovernanceMode", boolean.class);
        answer.put("customHttpClient", okhttp3.OkHttpClient.class);
        answer.put("delay", long.class);
        answer.put("deleteAfterRead", boolean.class);
        answer.put("deleteAfterWrite", boolean.class);
        answer.put("delimiter", java.lang.String.class);
        answer.put("destinationBucketName", java.lang.String.class);
        answer.put("destinationObjectName", java.lang.String.class);
        answer.put("endpoint", java.lang.String.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("greedy", boolean.class);
        answer.put("includeBody", boolean.class);
        answer.put("includeFolders", boolean.class);
        answer.put("includeUserMetadata", boolean.class);
        answer.put("includeVersions", boolean.class);
        answer.put("initialDelay", long.class);
        answer.put("keyName", java.lang.String.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("length", long.class);
        answer.put("matchETag", java.lang.String.class);
        answer.put("maxConnections", int.class);
        answer.put("maxMessagesPerPoll", int.class);
        answer.put("minioClient", io.minio.MinioClient.class);
        answer.put("modifiedSince", java.time.ZonedDateTime.class);
        answer.put("moveAfterRead", boolean.class);
        answer.put("notMatchETag", java.lang.String.class);
        answer.put("objectLock", boolean.class);
        answer.put("objectName", java.lang.String.class);
        answer.put("offset", long.class);
        answer.put("operation", org.apache.camel.component.minio.MinioOperations.class);
        answer.put("partSize", long.class);
        answer.put("pojoRequest", boolean.class);
        answer.put("policy", java.lang.String.class);
        answer.put("pollStrategy", org.apache.camel.spi.PollingConsumerPollStrategy.class);
        answer.put("prefix", java.lang.String.class);
        answer.put("proxyPort", java.lang.Integer.class);
        answer.put("recursive", boolean.class);
        answer.put("region", java.lang.String.class);
        answer.put("repeatCount", long.class);
        answer.put("runLoggingLevel", org.apache.camel.LoggingLevel.class);
        answer.put("scheduledExecutorService", java.util.concurrent.ScheduledExecutorService.class);
        answer.put("scheduler", java.lang.String.class);
        answer.put("schedulerProperties", java.util.Map.class);
        answer.put("secretKey", java.lang.String.class);
        answer.put("secure", boolean.class);
        answer.put("sendEmptyMessageWhenIdle", boolean.class);
        answer.put("serverSideEncryption", io.minio.ServerSideEncryption.class);
        answer.put("serverSideEncryptionCustomerKey", io.minio.ServerSideEncryptionCustomerKey.class);
        answer.put("startAfter", java.lang.String.class);
        answer.put("startScheduler", boolean.class);
        answer.put("storageClass", java.lang.String.class);
        answer.put("synchronous", boolean.class);
        answer.put("timeUnit", java.util.concurrent.TimeUnit.class);
        answer.put("unModifiedSince", java.time.ZonedDateTime.class);
        answer.put("useFixedDelay", boolean.class);
        answer.put("useVersion1", boolean.class);
        answer.put("versionId", java.lang.String.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        MinioEndpoint target = (MinioEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return target.getConfiguration().getAccessKey();
        case "autoclosebody":
        case "autoCloseBody": return target.getConfiguration().isAutoCloseBody();
        case "autocreatebucket":
        case "autoCreateBucket": return target.getConfiguration().isAutoCreateBucket();
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
        case "bypassgovernancemode":
        case "bypassGovernanceMode": return target.getConfiguration().isBypassGovernanceMode();
        case "customhttpclient":
        case "customHttpClient": return target.getConfiguration().getCustomHttpClient();
        case "delay": return target.getDelay();
        case "deleteafterread":
        case "deleteAfterRead": return target.getConfiguration().isDeleteAfterRead();
        case "deleteafterwrite":
        case "deleteAfterWrite": return target.getConfiguration().isDeleteAfterWrite();
        case "delimiter": return target.getConfiguration().getDelimiter();
        case "destinationbucketname":
        case "destinationBucketName": return target.getConfiguration().getDestinationBucketName();
        case "destinationobjectname":
        case "destinationObjectName": return target.getConfiguration().getDestinationObjectName();
        case "endpoint": return target.getConfiguration().getEndpoint();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "greedy": return target.isGreedy();
        case "includebody":
        case "includeBody": return target.getConfiguration().isIncludeBody();
        case "includefolders":
        case "includeFolders": return target.getConfiguration().isIncludeFolders();
        case "includeusermetadata":
        case "includeUserMetadata": return target.getConfiguration().isIncludeUserMetadata();
        case "includeversions":
        case "includeVersions": return target.getConfiguration().isIncludeVersions();
        case "initialdelay":
        case "initialDelay": return target.getInitialDelay();
        case "keyname":
        case "keyName": return target.getConfiguration().getKeyName();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "length": return target.getConfiguration().getLength();
        case "matchetag":
        case "matchETag": return target.getConfiguration().getMatchETag();
        case "maxconnections":
        case "maxConnections": return target.getMaxConnections();
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": return target.getMaxMessagesPerPoll();
        case "minioclient":
        case "minioClient": return target.getConfiguration().getMinioClient();
        case "modifiedsince":
        case "modifiedSince": return target.getConfiguration().getModifiedSince();
        case "moveafterread":
        case "moveAfterRead": return target.getConfiguration().isMoveAfterRead();
        case "notmatchetag":
        case "notMatchETag": return target.getConfiguration().getNotMatchETag();
        case "objectlock":
        case "objectLock": return target.getConfiguration().isObjectLock();
        case "objectname":
        case "objectName": return target.getConfiguration().getObjectName();
        case "offset": return target.getConfiguration().getOffset();
        case "operation": return target.getConfiguration().getOperation();
        case "partsize":
        case "partSize": return target.getConfiguration().getPartSize();
        case "pojorequest":
        case "pojoRequest": return target.getConfiguration().isPojoRequest();
        case "policy": return target.getConfiguration().getPolicy();
        case "pollstrategy":
        case "pollStrategy": return target.getPollStrategy();
        case "prefix": return target.getConfiguration().getPrefix();
        case "proxyport":
        case "proxyPort": return target.getConfiguration().getProxyPort();
        case "recursive": return target.getConfiguration().isRecursive();
        case "region": return target.getConfiguration().getRegion();
        case "repeatcount":
        case "repeatCount": return target.getRepeatCount();
        case "runlogginglevel":
        case "runLoggingLevel": return target.getRunLoggingLevel();
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return target.getScheduledExecutorService();
        case "scheduler": return target.getScheduler();
        case "schedulerproperties":
        case "schedulerProperties": return target.getSchedulerProperties();
        case "secretkey":
        case "secretKey": return target.getConfiguration().getSecretKey();
        case "secure": return target.getConfiguration().isSecure();
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return target.isSendEmptyMessageWhenIdle();
        case "serversideencryption":
        case "serverSideEncryption": return target.getConfiguration().getServerSideEncryption();
        case "serversideencryptioncustomerkey":
        case "serverSideEncryptionCustomerKey": return target.getConfiguration().getServerSideEncryptionCustomerKey();
        case "startafter":
        case "startAfter": return target.getConfiguration().getStartAfter();
        case "startscheduler":
        case "startScheduler": return target.isStartScheduler();
        case "storageclass":
        case "storageClass": return target.getConfiguration().getStorageClass();
        case "synchronous": return target.isSynchronous();
        case "timeunit":
        case "timeUnit": return target.getTimeUnit();
        case "unmodifiedsince":
        case "unModifiedSince": return target.getConfiguration().getUnModifiedSince();
        case "usefixeddelay":
        case "useFixedDelay": return target.isUseFixedDelay();
        case "useversion1":
        case "useVersion1": return target.getConfiguration().isUseVersion1();
        case "versionid":
        case "versionId": return target.getConfiguration().getVersionId();
        default: return null;
        }
    }
}

