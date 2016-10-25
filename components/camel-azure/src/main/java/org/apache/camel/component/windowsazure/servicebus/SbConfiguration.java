package org.apache.camel.component.windowsazure.servicebus;

import com.microsoft.windowsazure.services.servicebus.ServiceBusContract;
import com.microsoft.windowsazure.services.servicebus.implementation.EntityStatus;
import com.microsoft.windowsazure.services.servicebus.implementation.PartitioningPolicy;
import com.microsoft.windowsazure.services.servicebus.models.ReceiveMode;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

import javax.xml.datatype.Duration;

/**
 * azure-sb://<queue>?queueName=<queueName>&ServiceBusContract=<ServiceBusContract>
 *     &timeout=<timeout>&peek_lock=<peek_lock>
 * azure-sb://<topic>?topicName=<topicName>&subscriptionName=<subscriptionName>&ServiceBusContract=<ServiceBusContract>
 *     &timeout=<timeout>&peek_lock=<peek_lock>
 * azure-sb://<event>?eventName=<queueName>&ServiceBusContract=<ServiceBusContract>
 *     &timeout=<timeout>&peek_lock=<peek_lock>
 * azure-sb://<sasKeyName>:<sasKey>@<namespace>.<serviceBusRootUri>/<queue>?queueName=<queueName>
 *     &timeout=<timeout>&peek_lock=<peek_lock>
 * azure-sb://<sasKeyName>:<sasKey>@<namespace>.<serviceBusRootUri>/<topic>?topicName=<topicName>&subscriptionName=<subscriptionName>
 *     &timeout=<timeout>&peek_lock=<peek_lock>
 * azure-sb://<sasKeyName>:<sasKey>@<namespace>.<serviceBusRootUri>/<event>?eventName=<queueName>
 *     &timeout=<timeout>&peek_lock=<peek_lock>
 * Created by alan on 14/10/16.
 */
@UriParams
public class SbConfiguration {
    // common properties
    @UriParam
    private ServiceBusContract serviceBusContract;

    //ServiceBusConfiguration
    @UriParam
    private String connectionString;
    @UriParam
    private String uri;
    @UriParam
    private String wrapUri;
    @UriParam
    private String wrapName;
    @UriParam
    private String wrapPassword;
    @UriParam
    private String sasKeyName;
    @UriParam
    private String sasKey;
    @UriParam
    private String profile;
    @UriParam
    private String namespace;
    @UriParam
    private String serviceBusRootUri;
    @UriParam
    private String wrapRootUri;



    @UriParam
    private EntityType entities;
    //common properties for topic, queue & event hub
    @UriParam
    private Duration autoDeleteOnIdle;
    @UriParam
    private Duration defaultMessageTimeToLive;
    @UriParam
    private Duration duplicateDetectionHistoryTimeWindow;
    @UriParam
    private Boolean enableBatchedOperations;
    @UriParam
    private Boolean isAnonymousAccessible;
    @UriParam
    private PartitioningPolicy partitioningPolicy;
    @UriParam
    private EntityStatus status;
    @UriParam
    private Boolean supportOrdering;
    @UriParam
    private String userMetadata;
    @UriParam
    private Boolean requiresDuplicateDetection;
    @UriParam
    private Long maxSizeInMegabytes;


    //queue properties
    @UriParam
    private String queueName;
    @UriParam
    private Boolean deadLetteringOnMessageExpiration;
    @UriParam
    private String forwardTo;
    @UriParam
    private Duration lockDuration;
    @UriParam
    private Integer maxDeliveryCount;
    @UriParam
    private Boolean requiresSession;

    //topic properties
    @UriParam
    private String topicPath;
    @UriParam
    private Boolean filteringMessageBeforePublishing;

    //subscription properties
    @UriParam
    private String subscriptionName;
    @UriParam
    private Boolean deadLetteringOnFilterEvaluationExceptions;
    @UriParam
    private String defaultRuleDescription;
    @UriParam
    private String ruleName;

    @UriParam
    private String ruleTag;

    //event hub properties
    @UriParam
    private String eventHubPath;

    @UriParam
    private Long defaultMessageRetention;

    // consumer properties
    private int concurrentConsumers;

    //ReceiveMessageOptions
    @UriParam
    private Integer timeout;
    @UriParam
    private boolean peekLock = false;

    //AbstractListOptions
    @UriParam
    private Integer skip;
    @UriParam
    private Integer top;
    @UriParam
    private String filter;
    // producer properties
    // queue properties
    // dead letter queue properties

    // getter and setters
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public ServiceBusContract getServiceBusContract() {
        return serviceBusContract;
    }

    public void setServiceBusContract(ServiceBusContract serviceBusContract) {
        this.serviceBusContract = serviceBusContract;
    }

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getWrapUri() {
        return wrapUri;
    }

    public void setWrapUri(String wrapUri) {
        this.wrapUri = wrapUri;
    }

    public String getWrapName() {
        return wrapName;
    }

    public void setWrapName(String wrapName) {
        this.wrapName = wrapName;
    }

    public String getWrapPassword() {
        return wrapPassword;
    }

    public void setWrapPassword(String wrapPassword) {
        this.wrapPassword = wrapPassword;
    }

    public String getSasKeyName() {
        return sasKeyName;
    }

    public void setSasKeyName(String sasKeyName) {
        this.sasKeyName = sasKeyName;
    }

    public String getSasKey() {
        return sasKey;
    }

    public void setSasKey(String sasKey) {
        this.sasKey = sasKey;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getServiceBusRootUri() {
        return serviceBusRootUri;
    }

    public void setServiceBusRootUri(String serviceBusRootUri) {
        this.serviceBusRootUri = serviceBusRootUri;
    }

    public String getWrapRootUri() {
        return wrapRootUri;
    }

    public void setWrapRootUri(String wrapRootUri) {
        this.wrapRootUri = wrapRootUri;
    }

    public String getSubscriptionName() {
        return subscriptionName;
    }

    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    public String getEventHubPath() {
        return eventHubPath;
    }

    public void setEventHubPath(String eventHubPath) {
        this.eventHubPath = eventHubPath;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public ReceiveMode getReceiveMode() {
        if (peekLock) return ReceiveMode.PEEK_LOCK;
        return ReceiveMode.RECEIVE_AND_DELETE;
    }


    public boolean isPeekLock() {
        return peekLock;
    }

    public void setPeekLock(boolean peekLock) {
        this.peekLock = peekLock;
    }

    public Integer getSkip() {
        return skip;
    }

    public void setSkip(Integer skip) {
        this.skip = skip;
    }

    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getTopicPath() {

        return topicPath;
    }

    public void setTopicPath(String topicPath) {
        this.topicPath = topicPath;
    }

    public int getConcurrentConsumers() {
        return concurrentConsumers;
    }

    public void setConcurrentConsumers(int concurrentConsumers) {
        this.concurrentConsumers = concurrentConsumers;
    }

    public Duration getAutoDeleteOnIdle() {
        return autoDeleteOnIdle;
    }

    public void setAutoDeleteOnIdle(Duration autoDeleteOnIdle) {
        this.autoDeleteOnIdle = autoDeleteOnIdle;
    }

    public Boolean getDeadLetteringOnMessageExpiration() {
        return deadLetteringOnMessageExpiration;
    }

    public void setDeadLetteringOnMessageExpiration(Boolean deadLetteringOnMessageExpiration) {
        this.deadLetteringOnMessageExpiration = deadLetteringOnMessageExpiration;
    }

    public Duration getDefaultMessageTimeToLive() {
        return defaultMessageTimeToLive;
    }

    public void setDefaultMessageTimeToLive(Duration defaultMessageTimeToLive) {
        this.defaultMessageTimeToLive = defaultMessageTimeToLive;
    }

    public Duration getDuplicateDetectionHistoryTimeWindow() {
        return duplicateDetectionHistoryTimeWindow;
    }

    public void setDuplicateDetectionHistoryTimeWindow(Duration duplicateDetectionHistoryTimeWindow) {
        this.duplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindow;
    }

    public Boolean getEnableBatchedOperations() {
        return enableBatchedOperations;
    }

    public void setEnableBatchedOperations(Boolean enableBatchedOperations) {
        this.enableBatchedOperations = enableBatchedOperations;
    }

    public String getForwardTo() {
        return forwardTo;
    }

    public void setForwardTo(String forwardTo) {
        this.forwardTo = forwardTo;
    }

    public Boolean getAnonymousAccessible() {
        return isAnonymousAccessible;
    }

    public void setAnonymousAccessible(Boolean anonymousAccessible) {
        isAnonymousAccessible = anonymousAccessible;
    }

    public Duration getLockDuration() {
        return lockDuration;
    }

    public void setLockDuration(Duration lockDuration) {
        this.lockDuration = lockDuration;
    }

    public Integer getMaxDeliveryCount() {
        return maxDeliveryCount;
    }

    public void setMaxDeliveryCount(Integer maxDeliveryCount) {
        this.maxDeliveryCount = maxDeliveryCount;
    }

    public Long getMaxSizeInMegabytes() {
        return maxSizeInMegabytes;
    }

    public void setMaxSizeInMegabytes(Long maxSizeInMegabytes) {
        this.maxSizeInMegabytes = maxSizeInMegabytes;
    }

    public PartitioningPolicy getPartitioningPolicy() {
        return partitioningPolicy;
    }

    public void setPartitioningPolicy(PartitioningPolicy partitioningPolicy) {
        this.partitioningPolicy = partitioningPolicy;
    }

    public Boolean getRequiresDuplicateDetection() {
        return requiresDuplicateDetection;
    }

    public void setRequiresDuplicateDetection(Boolean requiresDuplicateDetection) {
        this.requiresDuplicateDetection = requiresDuplicateDetection;
    }

    public Boolean getRequiresSession() {
        return requiresSession;
    }

    public void setRequiresSession(Boolean requiresSession) {
        this.requiresSession = requiresSession;
    }

    public EntityStatus getStatus() {
        return status;
    }

    public void setStatus(EntityStatus status) {
        this.status = status;
    }

    public Boolean getSupportOrdering() {
        return supportOrdering;
    }

    public void setSupportOrdering(Boolean supportOrdering) {
        this.supportOrdering = supportOrdering;
    }

    public String getUserMetadata() {
        return userMetadata;
    }

    public void setUserMetadata(String userMetadata) {
        this.userMetadata = userMetadata;
    }

    public Boolean getIsAnonymousAccessible() {
        return isAnonymousAccessible;
    }
    public void setIsAnonymousAccessible(Boolean isAnonymousAccessible) {
        this.isAnonymousAccessible = isAnonymousAccessible;
    }

    public Boolean getFilteringMessageBeforePublishing() {
        return filteringMessageBeforePublishing;
    }

    public void setFilteringMessageBeforePublishing(Boolean filteringMessageBeforePublishing) {
        this.filteringMessageBeforePublishing = filteringMessageBeforePublishing;
    }
    public Boolean getDeadLetteringOnFilterEvaluationExceptions() {
        return deadLetteringOnFilterEvaluationExceptions;
    }

    public void setDeadLetteringOnFilterEvaluationExceptions(Boolean deadLetteringOnFilterEvaluationExceptions) {
        this.deadLetteringOnFilterEvaluationExceptions = deadLetteringOnFilterEvaluationExceptions;
    }

    public String getDefaultRuleDescription() {
        return defaultRuleDescription;
    }

    public void setDefaultRuleDescription(String defaultRuleDescription) {
        this.defaultRuleDescription = defaultRuleDescription;
    }
    public EntityType getEntities() {
        return entities;
    }

    public void setEntities(EntityType entities) {
        this.entities = entities;
    }
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleTag() {
        return ruleTag;
    }

    public void setRuleTag(String ruleTag) {
        this.ruleTag = ruleTag;
    }
    public Long getDefaultMessageRetention() {
        return defaultMessageRetention;
    }

    public void setDefaultMessageRetention(Long defaultMessageRetention) {
        this.defaultMessageRetention = defaultMessageRetention;
    }
}
