/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.pulsar;

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
public class PulsarEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        PulsarEndpoint target = (PulsarEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "ackgrouptimemillis":
        case "ackGroupTimeMillis": target.getPulsarConfiguration().setAckGroupTimeMillis(property(camelContext, long.class, value)); return true;
        case "acktimeoutmillis":
        case "ackTimeoutMillis": target.getPulsarConfiguration().setAckTimeoutMillis(property(camelContext, long.class, value)); return true;
        case "allowmanualacknowledgement":
        case "allowManualAcknowledgement": target.getPulsarConfiguration().setAllowManualAcknowledgement(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "batcherbuilder":
        case "batcherBuilder": target.getPulsarConfiguration().setBatcherBuilder(property(camelContext, org.apache.pulsar.client.api.BatcherBuilder.class, value)); return true;
        case "batchingenabled":
        case "batchingEnabled": target.getPulsarConfiguration().setBatchingEnabled(property(camelContext, boolean.class, value)); return true;
        case "batchingmaxmessages":
        case "batchingMaxMessages": target.getPulsarConfiguration().setBatchingMaxMessages(property(camelContext, int.class, value)); return true;
        case "batchingmaxpublishdelaymicros":
        case "batchingMaxPublishDelayMicros": target.getPulsarConfiguration().setBatchingMaxPublishDelayMicros(property(camelContext, long.class, value)); return true;
        case "blockifqueuefull":
        case "blockIfQueueFull": target.getPulsarConfiguration().setBlockIfQueueFull(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "compressiontype":
        case "compressionType": target.getPulsarConfiguration().setCompressionType(property(camelContext, org.apache.pulsar.client.api.CompressionType.class, value)); return true;
        case "consumername":
        case "consumerName": target.getPulsarConfiguration().setConsumerName(property(camelContext, java.lang.String.class, value)); return true;
        case "consumernameprefix":
        case "consumerNamePrefix": target.getPulsarConfiguration().setConsumerNamePrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "consumerqueuesize":
        case "consumerQueueSize": target.getPulsarConfiguration().setConsumerQueueSize(property(camelContext, int.class, value)); return true;
        case "deadlettertopic":
        case "deadLetterTopic": target.getPulsarConfiguration().setDeadLetterTopic(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "initialsequenceid":
        case "initialSequenceId": target.getPulsarConfiguration().setInitialSequenceId(property(camelContext, long.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxpendingmessages":
        case "maxPendingMessages": target.getPulsarConfiguration().setMaxPendingMessages(property(camelContext, int.class, value)); return true;
        case "maxpendingmessagesacrosspartitions":
        case "maxPendingMessagesAcrossPartitions": target.getPulsarConfiguration().setMaxPendingMessagesAcrossPartitions(property(camelContext, int.class, value)); return true;
        case "maxredelivercount":
        case "maxRedeliverCount": target.getPulsarConfiguration().setMaxRedeliverCount(property(camelContext, java.lang.Integer.class, value)); return true;
        case "messagerouter":
        case "messageRouter": target.getPulsarConfiguration().setMessageRouter(property(camelContext, org.apache.pulsar.client.api.MessageRouter.class, value)); return true;
        case "messageroutingmode":
        case "messageRoutingMode": target.getPulsarConfiguration().setMessageRoutingMode(property(camelContext, org.apache.pulsar.client.api.MessageRoutingMode.class, value)); return true;
        case "negativeackredeliverydelaymicros":
        case "negativeAckRedeliveryDelayMicros": target.getPulsarConfiguration().setNegativeAckRedeliveryDelayMicros(property(camelContext, long.class, value)); return true;
        case "numberofconsumers":
        case "numberOfConsumers": target.getPulsarConfiguration().setNumberOfConsumers(property(camelContext, int.class, value)); return true;
        case "producername":
        case "producerName": target.getPulsarConfiguration().setProducerName(property(camelContext, java.lang.String.class, value)); return true;
        case "sendtimeoutms":
        case "sendTimeoutMs": target.getPulsarConfiguration().setSendTimeoutMs(property(camelContext, int.class, value)); return true;
        case "subscriptioninitialposition":
        case "subscriptionInitialPosition": target.getPulsarConfiguration().setSubscriptionInitialPosition(property(camelContext, org.apache.camel.component.pulsar.utils.consumers.SubscriptionInitialPosition.class, value)); return true;
        case "subscriptionname":
        case "subscriptionName": target.getPulsarConfiguration().setSubscriptionName(property(camelContext, java.lang.String.class, value)); return true;
        case "subscriptiontopicsmode":
        case "subscriptionTopicsMode": target.getPulsarConfiguration().setSubscriptionTopicsMode(property(camelContext, org.apache.pulsar.client.api.RegexSubscriptionMode.class, value)); return true;
        case "subscriptiontype":
        case "subscriptionType": target.getPulsarConfiguration().setSubscriptionType(property(camelContext, org.apache.camel.component.pulsar.utils.consumers.SubscriptionType.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "topicspattern":
        case "topicsPattern": target.getPulsarConfiguration().setTopicsPattern(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("ackGroupTimeMillis", long.class);
        answer.put("ackTimeoutMillis", long.class);
        answer.put("allowManualAcknowledgement", boolean.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("batcherBuilder", org.apache.pulsar.client.api.BatcherBuilder.class);
        answer.put("batchingEnabled", boolean.class);
        answer.put("batchingMaxMessages", int.class);
        answer.put("batchingMaxPublishDelayMicros", long.class);
        answer.put("blockIfQueueFull", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("compressionType", org.apache.pulsar.client.api.CompressionType.class);
        answer.put("consumerName", java.lang.String.class);
        answer.put("consumerNamePrefix", java.lang.String.class);
        answer.put("consumerQueueSize", int.class);
        answer.put("deadLetterTopic", java.lang.String.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("initialSequenceId", long.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("maxPendingMessages", int.class);
        answer.put("maxPendingMessagesAcrossPartitions", int.class);
        answer.put("maxRedeliverCount", java.lang.Integer.class);
        answer.put("messageRouter", org.apache.pulsar.client.api.MessageRouter.class);
        answer.put("messageRoutingMode", org.apache.pulsar.client.api.MessageRoutingMode.class);
        answer.put("negativeAckRedeliveryDelayMicros", long.class);
        answer.put("numberOfConsumers", int.class);
        answer.put("producerName", java.lang.String.class);
        answer.put("sendTimeoutMs", int.class);
        answer.put("subscriptionInitialPosition", org.apache.camel.component.pulsar.utils.consumers.SubscriptionInitialPosition.class);
        answer.put("subscriptionName", java.lang.String.class);
        answer.put("subscriptionTopicsMode", org.apache.pulsar.client.api.RegexSubscriptionMode.class);
        answer.put("subscriptionType", org.apache.camel.component.pulsar.utils.consumers.SubscriptionType.class);
        answer.put("synchronous", boolean.class);
        answer.put("topicsPattern", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        PulsarEndpoint target = (PulsarEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "ackgrouptimemillis":
        case "ackGroupTimeMillis": return target.getPulsarConfiguration().getAckGroupTimeMillis();
        case "acktimeoutmillis":
        case "ackTimeoutMillis": return target.getPulsarConfiguration().getAckTimeoutMillis();
        case "allowmanualacknowledgement":
        case "allowManualAcknowledgement": return target.getPulsarConfiguration().isAllowManualAcknowledgement();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "batcherbuilder":
        case "batcherBuilder": return target.getPulsarConfiguration().getBatcherBuilder();
        case "batchingenabled":
        case "batchingEnabled": return target.getPulsarConfiguration().isBatchingEnabled();
        case "batchingmaxmessages":
        case "batchingMaxMessages": return target.getPulsarConfiguration().getBatchingMaxMessages();
        case "batchingmaxpublishdelaymicros":
        case "batchingMaxPublishDelayMicros": return target.getPulsarConfiguration().getBatchingMaxPublishDelayMicros();
        case "blockifqueuefull":
        case "blockIfQueueFull": return target.getPulsarConfiguration().isBlockIfQueueFull();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "compressiontype":
        case "compressionType": return target.getPulsarConfiguration().getCompressionType();
        case "consumername":
        case "consumerName": return target.getPulsarConfiguration().getConsumerName();
        case "consumernameprefix":
        case "consumerNamePrefix": return target.getPulsarConfiguration().getConsumerNamePrefix();
        case "consumerqueuesize":
        case "consumerQueueSize": return target.getPulsarConfiguration().getConsumerQueueSize();
        case "deadlettertopic":
        case "deadLetterTopic": return target.getPulsarConfiguration().getDeadLetterTopic();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "initialsequenceid":
        case "initialSequenceId": return target.getPulsarConfiguration().getInitialSequenceId();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxpendingmessages":
        case "maxPendingMessages": return target.getPulsarConfiguration().getMaxPendingMessages();
        case "maxpendingmessagesacrosspartitions":
        case "maxPendingMessagesAcrossPartitions": return target.getPulsarConfiguration().getMaxPendingMessagesAcrossPartitions();
        case "maxredelivercount":
        case "maxRedeliverCount": return target.getPulsarConfiguration().getMaxRedeliverCount();
        case "messagerouter":
        case "messageRouter": return target.getPulsarConfiguration().getMessageRouter();
        case "messageroutingmode":
        case "messageRoutingMode": return target.getPulsarConfiguration().getMessageRoutingMode();
        case "negativeackredeliverydelaymicros":
        case "negativeAckRedeliveryDelayMicros": return target.getPulsarConfiguration().getNegativeAckRedeliveryDelayMicros();
        case "numberofconsumers":
        case "numberOfConsumers": return target.getPulsarConfiguration().getNumberOfConsumers();
        case "producername":
        case "producerName": return target.getPulsarConfiguration().getProducerName();
        case "sendtimeoutms":
        case "sendTimeoutMs": return target.getPulsarConfiguration().getSendTimeoutMs();
        case "subscriptioninitialposition":
        case "subscriptionInitialPosition": return target.getPulsarConfiguration().getSubscriptionInitialPosition();
        case "subscriptionname":
        case "subscriptionName": return target.getPulsarConfiguration().getSubscriptionName();
        case "subscriptiontopicsmode":
        case "subscriptionTopicsMode": return target.getPulsarConfiguration().getSubscriptionTopicsMode();
        case "subscriptiontype":
        case "subscriptionType": return target.getPulsarConfiguration().getSubscriptionType();
        case "synchronous": return target.isSynchronous();
        case "topicspattern":
        case "topicsPattern": return target.getPulsarConfiguration().isTopicsPattern();
        default: return null;
        }
    }
}

