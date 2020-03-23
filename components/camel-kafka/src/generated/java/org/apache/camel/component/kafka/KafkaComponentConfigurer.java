/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.kafka;

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
public class KafkaComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.kafka.KafkaConfiguration getOrCreateConfiguration(KafkaComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.kafka.KafkaConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        KafkaComponent target = (KafkaComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": getOrCreateConfiguration(target).setAdditionalProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "allowmanualcommit":
        case "allowManualCommit": getOrCreateConfiguration(target).setAllowManualCommit(property(camelContext, boolean.class, value)); return true;
        case "autocommitenable":
        case "autoCommitEnable": getOrCreateConfiguration(target).setAutoCommitEnable(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "autocommitintervalms":
        case "autoCommitIntervalMs": getOrCreateConfiguration(target).setAutoCommitIntervalMs(property(camelContext, java.lang.Integer.class, value)); return true;
        case "autocommitonstop":
        case "autoCommitOnStop": getOrCreateConfiguration(target).setAutoCommitOnStop(property(camelContext, java.lang.String.class, value)); return true;
        case "autooffsetreset":
        case "autoOffsetReset": getOrCreateConfiguration(target).setAutoOffsetReset(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "breakonfirsterror":
        case "breakOnFirstError": getOrCreateConfiguration(target).setBreakOnFirstError(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "brokers": getOrCreateConfiguration(target).setBrokers(property(camelContext, java.lang.String.class, value)); return true;
        case "buffermemorysize":
        case "bufferMemorySize": getOrCreateConfiguration(target).setBufferMemorySize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "checkcrcs":
        case "checkCrcs": getOrCreateConfiguration(target).setCheckCrcs(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "clientid":
        case "clientId": getOrCreateConfiguration(target).setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "compressioncodec":
        case "compressionCodec": getOrCreateConfiguration(target).setCompressionCodec(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.kafka.KafkaConfiguration.class, value)); return true;
        case "connectionmaxidlems":
        case "connectionMaxIdleMs": getOrCreateConfiguration(target).setConnectionMaxIdleMs(property(camelContext, java.lang.Integer.class, value)); return true;
        case "consumerrequesttimeoutms":
        case "consumerRequestTimeoutMs": getOrCreateConfiguration(target).setConsumerRequestTimeoutMs(property(camelContext, java.lang.Integer.class, value)); return true;
        case "consumerstreams":
        case "consumerStreams": getOrCreateConfiguration(target).setConsumerStreams(property(camelContext, int.class, value)); return true;
        case "consumerscount":
        case "consumersCount": getOrCreateConfiguration(target).setConsumersCount(property(camelContext, int.class, value)); return true;
        case "enableidempotence":
        case "enableIdempotence": getOrCreateConfiguration(target).setEnableIdempotence(property(camelContext, boolean.class, value)); return true;
        case "fetchmaxbytes":
        case "fetchMaxBytes": getOrCreateConfiguration(target).setFetchMaxBytes(property(camelContext, java.lang.Integer.class, value)); return true;
        case "fetchminbytes":
        case "fetchMinBytes": getOrCreateConfiguration(target).setFetchMinBytes(property(camelContext, java.lang.Integer.class, value)); return true;
        case "fetchwaitmaxms":
        case "fetchWaitMaxMs": getOrCreateConfiguration(target).setFetchWaitMaxMs(property(camelContext, java.lang.Integer.class, value)); return true;
        case "groupid":
        case "groupId": getOrCreateConfiguration(target).setGroupId(property(camelContext, java.lang.String.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": getOrCreateConfiguration(target).setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": getOrCreateConfiguration(target).setHeartbeatIntervalMs(property(camelContext, java.lang.Integer.class, value)); return true;
        case "interceptorclasses":
        case "interceptorClasses": getOrCreateConfiguration(target).setInterceptorClasses(property(camelContext, java.lang.String.class, value)); return true;
        case "kafkaheaderdeserializer":
        case "kafkaHeaderDeserializer": getOrCreateConfiguration(target).setKafkaHeaderDeserializer(property(camelContext, org.apache.camel.component.kafka.serde.KafkaHeaderDeserializer.class, value)); return true;
        case "kafkaheaderserializer":
        case "kafkaHeaderSerializer": getOrCreateConfiguration(target).setKafkaHeaderSerializer(property(camelContext, org.apache.camel.component.kafka.serde.KafkaHeaderSerializer.class, value)); return true;
        case "kafkamanualcommitfactory":
        case "kafkaManualCommitFactory": target.setKafkaManualCommitFactory(property(camelContext, org.apache.camel.component.kafka.KafkaManualCommitFactory.class, value)); return true;
        case "kerberosbeforereloginmintime":
        case "kerberosBeforeReloginMinTime": getOrCreateConfiguration(target).setKerberosBeforeReloginMinTime(property(camelContext, java.lang.Integer.class, value)); return true;
        case "kerberosinitcmd":
        case "kerberosInitCmd": getOrCreateConfiguration(target).setKerberosInitCmd(property(camelContext, java.lang.String.class, value)); return true;
        case "kerberosprincipaltolocalrules":
        case "kerberosPrincipalToLocalRules": getOrCreateConfiguration(target).setKerberosPrincipalToLocalRules(property(camelContext, java.lang.String.class, value)); return true;
        case "kerberosrenewjitter":
        case "kerberosRenewJitter": getOrCreateConfiguration(target).setKerberosRenewJitter(property(camelContext, java.lang.Double.class, value)); return true;
        case "kerberosrenewwindowfactor":
        case "kerberosRenewWindowFactor": getOrCreateConfiguration(target).setKerberosRenewWindowFactor(property(camelContext, java.lang.Double.class, value)); return true;
        case "key": getOrCreateConfiguration(target).setKey(property(camelContext, java.lang.String.class, value)); return true;
        case "keydeserializer":
        case "keyDeserializer": getOrCreateConfiguration(target).setKeyDeserializer(property(camelContext, java.lang.String.class, value)); return true;
        case "keyserializerclass":
        case "keySerializerClass": getOrCreateConfiguration(target).setKeySerializerClass(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "lingerms":
        case "lingerMs": getOrCreateConfiguration(target).setLingerMs(property(camelContext, java.lang.Integer.class, value)); return true;
        case "maxblockms":
        case "maxBlockMs": getOrCreateConfiguration(target).setMaxBlockMs(property(camelContext, java.lang.Integer.class, value)); return true;
        case "maxinflightrequest":
        case "maxInFlightRequest": getOrCreateConfiguration(target).setMaxInFlightRequest(property(camelContext, java.lang.Integer.class, value)); return true;
        case "maxpartitionfetchbytes":
        case "maxPartitionFetchBytes": getOrCreateConfiguration(target).setMaxPartitionFetchBytes(property(camelContext, java.lang.Integer.class, value)); return true;
        case "maxpollintervalms":
        case "maxPollIntervalMs": getOrCreateConfiguration(target).setMaxPollIntervalMs(property(camelContext, java.lang.Long.class, value)); return true;
        case "maxpollrecords":
        case "maxPollRecords": getOrCreateConfiguration(target).setMaxPollRecords(property(camelContext, java.lang.Integer.class, value)); return true;
        case "maxrequestsize":
        case "maxRequestSize": getOrCreateConfiguration(target).setMaxRequestSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "metadatamaxagems":
        case "metadataMaxAgeMs": getOrCreateConfiguration(target).setMetadataMaxAgeMs(property(camelContext, java.lang.Integer.class, value)); return true;
        case "metricreporters":
        case "metricReporters": getOrCreateConfiguration(target).setMetricReporters(property(camelContext, java.lang.String.class, value)); return true;
        case "metricssamplewindowms":
        case "metricsSampleWindowMs": getOrCreateConfiguration(target).setMetricsSampleWindowMs(property(camelContext, java.lang.Integer.class, value)); return true;
        case "noofmetricssample":
        case "noOfMetricsSample": getOrCreateConfiguration(target).setNoOfMetricsSample(property(camelContext, java.lang.Integer.class, value)); return true;
        case "offsetrepository":
        case "offsetRepository": getOrCreateConfiguration(target).setOffsetRepository(property(camelContext, org.apache.camel.spi.StateRepository.class, value)); return true;
        case "partitionassignor":
        case "partitionAssignor": getOrCreateConfiguration(target).setPartitionAssignor(property(camelContext, java.lang.String.class, value)); return true;
        case "partitionkey":
        case "partitionKey": getOrCreateConfiguration(target).setPartitionKey(property(camelContext, java.lang.Integer.class, value)); return true;
        case "partitioner": getOrCreateConfiguration(target).setPartitioner(property(camelContext, java.lang.String.class, value)); return true;
        case "polltimeoutms":
        case "pollTimeoutMs": getOrCreateConfiguration(target).setPollTimeoutMs(property(camelContext, java.lang.Long.class, value)); return true;
        case "producerbatchsize":
        case "producerBatchSize": getOrCreateConfiguration(target).setProducerBatchSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "queuebufferingmaxmessages":
        case "queueBufferingMaxMessages": getOrCreateConfiguration(target).setQueueBufferingMaxMessages(property(camelContext, java.lang.Integer.class, value)); return true;
        case "receivebufferbytes":
        case "receiveBufferBytes": getOrCreateConfiguration(target).setReceiveBufferBytes(property(camelContext, java.lang.Integer.class, value)); return true;
        case "reconnectbackoffmaxms":
        case "reconnectBackoffMaxMs": getOrCreateConfiguration(target).setReconnectBackoffMaxMs(property(camelContext, java.lang.Integer.class, value)); return true;
        case "reconnectbackoffms":
        case "reconnectBackoffMs": getOrCreateConfiguration(target).setReconnectBackoffMs(property(camelContext, java.lang.Integer.class, value)); return true;
        case "recordmetadata":
        case "recordMetadata": getOrCreateConfiguration(target).setRecordMetadata(property(camelContext, boolean.class, value)); return true;
        case "requestrequiredacks":
        case "requestRequiredAcks": getOrCreateConfiguration(target).setRequestRequiredAcks(property(camelContext, java.lang.String.class, value)); return true;
        case "requesttimeoutms":
        case "requestTimeoutMs": getOrCreateConfiguration(target).setRequestTimeoutMs(property(camelContext, java.lang.Integer.class, value)); return true;
        case "retries": getOrCreateConfiguration(target).setRetries(property(camelContext, java.lang.Integer.class, value)); return true;
        case "retrybackoffms":
        case "retryBackoffMs": getOrCreateConfiguration(target).setRetryBackoffMs(property(camelContext, java.lang.Integer.class, value)); return true;
        case "sasljaasconfig":
        case "saslJaasConfig": getOrCreateConfiguration(target).setSaslJaasConfig(property(camelContext, java.lang.String.class, value)); return true;
        case "saslkerberosservicename":
        case "saslKerberosServiceName": getOrCreateConfiguration(target).setSaslKerberosServiceName(property(camelContext, java.lang.String.class, value)); return true;
        case "saslmechanism":
        case "saslMechanism": getOrCreateConfiguration(target).setSaslMechanism(property(camelContext, java.lang.String.class, value)); return true;
        case "schemaregistryurl":
        case "schemaRegistryURL": getOrCreateConfiguration(target).setSchemaRegistryURL(property(camelContext, java.lang.String.class, value)); return true;
        case "securityprotocol":
        case "securityProtocol": getOrCreateConfiguration(target).setSecurityProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "seekto":
        case "seekTo": getOrCreateConfiguration(target).setSeekTo(property(camelContext, java.lang.String.class, value)); return true;
        case "sendbufferbytes":
        case "sendBufferBytes": getOrCreateConfiguration(target).setSendBufferBytes(property(camelContext, java.lang.Integer.class, value)); return true;
        case "serializerclass":
        case "serializerClass": getOrCreateConfiguration(target).setSerializerClass(property(camelContext, java.lang.String.class, value)); return true;
        case "sessiontimeoutms":
        case "sessionTimeoutMs": getOrCreateConfiguration(target).setSessionTimeoutMs(property(camelContext, java.lang.Integer.class, value)); return true;
        case "specificavroreader":
        case "specificAvroReader": getOrCreateConfiguration(target).setSpecificAvroReader(property(camelContext, boolean.class, value)); return true;
        case "sslciphersuites":
        case "sslCipherSuites": getOrCreateConfiguration(target).setSslCipherSuites(property(camelContext, java.lang.String.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": getOrCreateConfiguration(target).setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "sslenabledprotocols":
        case "sslEnabledProtocols": getOrCreateConfiguration(target).setSslEnabledProtocols(property(camelContext, java.lang.String.class, value)); return true;
        case "sslendpointalgorithm":
        case "sslEndpointAlgorithm": getOrCreateConfiguration(target).setSslEndpointAlgorithm(property(camelContext, java.lang.String.class, value)); return true;
        case "sslkeypassword":
        case "sslKeyPassword": getOrCreateConfiguration(target).setSslKeyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "sslkeymanageralgorithm":
        case "sslKeymanagerAlgorithm": getOrCreateConfiguration(target).setSslKeymanagerAlgorithm(property(camelContext, java.lang.String.class, value)); return true;
        case "sslkeystorelocation":
        case "sslKeystoreLocation": getOrCreateConfiguration(target).setSslKeystoreLocation(property(camelContext, java.lang.String.class, value)); return true;
        case "sslkeystorepassword":
        case "sslKeystorePassword": getOrCreateConfiguration(target).setSslKeystorePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "sslkeystoretype":
        case "sslKeystoreType": getOrCreateConfiguration(target).setSslKeystoreType(property(camelContext, java.lang.String.class, value)); return true;
        case "sslprotocol":
        case "sslProtocol": getOrCreateConfiguration(target).setSslProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "sslprovider":
        case "sslProvider": getOrCreateConfiguration(target).setSslProvider(property(camelContext, java.lang.String.class, value)); return true;
        case "ssltrustmanageralgorithm":
        case "sslTrustmanagerAlgorithm": getOrCreateConfiguration(target).setSslTrustmanagerAlgorithm(property(camelContext, java.lang.String.class, value)); return true;
        case "ssltruststorelocation":
        case "sslTruststoreLocation": getOrCreateConfiguration(target).setSslTruststoreLocation(property(camelContext, java.lang.String.class, value)); return true;
        case "ssltruststorepassword":
        case "sslTruststorePassword": getOrCreateConfiguration(target).setSslTruststorePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "ssltruststoretype":
        case "sslTruststoreType": getOrCreateConfiguration(target).setSslTruststoreType(property(camelContext, java.lang.String.class, value)); return true;
        case "topicispattern":
        case "topicIsPattern": getOrCreateConfiguration(target).setTopicIsPattern(property(camelContext, boolean.class, value)); return true;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": target.setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        case "valuedeserializer":
        case "valueDeserializer": getOrCreateConfiguration(target).setValueDeserializer(property(camelContext, java.lang.String.class, value)); return true;
        case "workerpool":
        case "workerPool": getOrCreateConfiguration(target).setWorkerPool(property(camelContext, java.util.concurrent.ExecutorService.class, value)); return true;
        case "workerpoolcoresize":
        case "workerPoolCoreSize": getOrCreateConfiguration(target).setWorkerPoolCoreSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "workerpoolmaxsize":
        case "workerPoolMaxSize": getOrCreateConfiguration(target).setWorkerPoolMaxSize(property(camelContext, java.lang.Integer.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("additionalProperties", java.util.Map.class);
        answer.put("allowManualCommit", boolean.class);
        answer.put("autoCommitEnable", java.lang.Boolean.class);
        answer.put("autoCommitIntervalMs", java.lang.Integer.class);
        answer.put("autoCommitOnStop", java.lang.String.class);
        answer.put("autoOffsetReset", java.lang.String.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("breakOnFirstError", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("brokers", java.lang.String.class);
        answer.put("bufferMemorySize", java.lang.Integer.class);
        answer.put("checkCrcs", java.lang.Boolean.class);
        answer.put("clientId", java.lang.String.class);
        answer.put("compressionCodec", java.lang.String.class);
        answer.put("configuration", org.apache.camel.component.kafka.KafkaConfiguration.class);
        answer.put("connectionMaxIdleMs", java.lang.Integer.class);
        answer.put("consumerRequestTimeoutMs", java.lang.Integer.class);
        answer.put("consumerStreams", int.class);
        answer.put("consumersCount", int.class);
        answer.put("enableIdempotence", boolean.class);
        answer.put("fetchMaxBytes", java.lang.Integer.class);
        answer.put("fetchMinBytes", java.lang.Integer.class);
        answer.put("fetchWaitMaxMs", java.lang.Integer.class);
        answer.put("groupId", java.lang.String.class);
        answer.put("headerFilterStrategy", org.apache.camel.spi.HeaderFilterStrategy.class);
        answer.put("heartbeatIntervalMs", java.lang.Integer.class);
        answer.put("interceptorClasses", java.lang.String.class);
        answer.put("kafkaHeaderDeserializer", org.apache.camel.component.kafka.serde.KafkaHeaderDeserializer.class);
        answer.put("kafkaHeaderSerializer", org.apache.camel.component.kafka.serde.KafkaHeaderSerializer.class);
        answer.put("kafkaManualCommitFactory", org.apache.camel.component.kafka.KafkaManualCommitFactory.class);
        answer.put("kerberosBeforeReloginMinTime", java.lang.Integer.class);
        answer.put("kerberosInitCmd", java.lang.String.class);
        answer.put("kerberosPrincipalToLocalRules", java.lang.String.class);
        answer.put("kerberosRenewJitter", java.lang.Double.class);
        answer.put("kerberosRenewWindowFactor", java.lang.Double.class);
        answer.put("key", java.lang.String.class);
        answer.put("keyDeserializer", java.lang.String.class);
        answer.put("keySerializerClass", java.lang.String.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("lingerMs", java.lang.Integer.class);
        answer.put("maxBlockMs", java.lang.Integer.class);
        answer.put("maxInFlightRequest", java.lang.Integer.class);
        answer.put("maxPartitionFetchBytes", java.lang.Integer.class);
        answer.put("maxPollIntervalMs", java.lang.Long.class);
        answer.put("maxPollRecords", java.lang.Integer.class);
        answer.put("maxRequestSize", java.lang.Integer.class);
        answer.put("metadataMaxAgeMs", java.lang.Integer.class);
        answer.put("metricReporters", java.lang.String.class);
        answer.put("metricsSampleWindowMs", java.lang.Integer.class);
        answer.put("noOfMetricsSample", java.lang.Integer.class);
        answer.put("offsetRepository", org.apache.camel.spi.StateRepository.class);
        answer.put("partitionAssignor", java.lang.String.class);
        answer.put("partitionKey", java.lang.Integer.class);
        answer.put("partitioner", java.lang.String.class);
        answer.put("pollTimeoutMs", java.lang.Long.class);
        answer.put("producerBatchSize", java.lang.Integer.class);
        answer.put("queueBufferingMaxMessages", java.lang.Integer.class);
        answer.put("receiveBufferBytes", java.lang.Integer.class);
        answer.put("reconnectBackoffMaxMs", java.lang.Integer.class);
        answer.put("reconnectBackoffMs", java.lang.Integer.class);
        answer.put("recordMetadata", boolean.class);
        answer.put("requestRequiredAcks", java.lang.String.class);
        answer.put("requestTimeoutMs", java.lang.Integer.class);
        answer.put("retries", java.lang.Integer.class);
        answer.put("retryBackoffMs", java.lang.Integer.class);
        answer.put("saslJaasConfig", java.lang.String.class);
        answer.put("saslKerberosServiceName", java.lang.String.class);
        answer.put("saslMechanism", java.lang.String.class);
        answer.put("schemaRegistryURL", java.lang.String.class);
        answer.put("securityProtocol", java.lang.String.class);
        answer.put("seekTo", java.lang.String.class);
        answer.put("sendBufferBytes", java.lang.Integer.class);
        answer.put("serializerClass", java.lang.String.class);
        answer.put("sessionTimeoutMs", java.lang.Integer.class);
        answer.put("specificAvroReader", boolean.class);
        answer.put("sslCipherSuites", java.lang.String.class);
        answer.put("sslContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        answer.put("sslEnabledProtocols", java.lang.String.class);
        answer.put("sslEndpointAlgorithm", java.lang.String.class);
        answer.put("sslKeyPassword", java.lang.String.class);
        answer.put("sslKeymanagerAlgorithm", java.lang.String.class);
        answer.put("sslKeystoreLocation", java.lang.String.class);
        answer.put("sslKeystorePassword", java.lang.String.class);
        answer.put("sslKeystoreType", java.lang.String.class);
        answer.put("sslProtocol", java.lang.String.class);
        answer.put("sslProvider", java.lang.String.class);
        answer.put("sslTrustmanagerAlgorithm", java.lang.String.class);
        answer.put("sslTruststoreLocation", java.lang.String.class);
        answer.put("sslTruststorePassword", java.lang.String.class);
        answer.put("sslTruststoreType", java.lang.String.class);
        answer.put("topicIsPattern", boolean.class);
        answer.put("useGlobalSslContextParameters", boolean.class);
        answer.put("valueDeserializer", java.lang.String.class);
        answer.put("workerPool", java.util.concurrent.ExecutorService.class);
        answer.put("workerPoolCoreSize", java.lang.Integer.class);
        answer.put("workerPoolMaxSize", java.lang.Integer.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        KafkaComponent target = (KafkaComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": return getOrCreateConfiguration(target).getAdditionalProperties();
        case "allowmanualcommit":
        case "allowManualCommit": return getOrCreateConfiguration(target).isAllowManualCommit();
        case "autocommitenable":
        case "autoCommitEnable": return getOrCreateConfiguration(target).getAutoCommitEnable();
        case "autocommitintervalms":
        case "autoCommitIntervalMs": return getOrCreateConfiguration(target).getAutoCommitIntervalMs();
        case "autocommitonstop":
        case "autoCommitOnStop": return getOrCreateConfiguration(target).getAutoCommitOnStop();
        case "autooffsetreset":
        case "autoOffsetReset": return getOrCreateConfiguration(target).getAutoOffsetReset();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "breakonfirsterror":
        case "breakOnFirstError": return getOrCreateConfiguration(target).isBreakOnFirstError();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "brokers": return getOrCreateConfiguration(target).getBrokers();
        case "buffermemorysize":
        case "bufferMemorySize": return getOrCreateConfiguration(target).getBufferMemorySize();
        case "checkcrcs":
        case "checkCrcs": return getOrCreateConfiguration(target).getCheckCrcs();
        case "clientid":
        case "clientId": return getOrCreateConfiguration(target).getClientId();
        case "compressioncodec":
        case "compressionCodec": return getOrCreateConfiguration(target).getCompressionCodec();
        case "configuration": return target.getConfiguration();
        case "connectionmaxidlems":
        case "connectionMaxIdleMs": return getOrCreateConfiguration(target).getConnectionMaxIdleMs();
        case "consumerrequesttimeoutms":
        case "consumerRequestTimeoutMs": return getOrCreateConfiguration(target).getConsumerRequestTimeoutMs();
        case "consumerstreams":
        case "consumerStreams": return getOrCreateConfiguration(target).getConsumerStreams();
        case "consumerscount":
        case "consumersCount": return getOrCreateConfiguration(target).getConsumersCount();
        case "enableidempotence":
        case "enableIdempotence": return getOrCreateConfiguration(target).isEnableIdempotence();
        case "fetchmaxbytes":
        case "fetchMaxBytes": return getOrCreateConfiguration(target).getFetchMaxBytes();
        case "fetchminbytes":
        case "fetchMinBytes": return getOrCreateConfiguration(target).getFetchMinBytes();
        case "fetchwaitmaxms":
        case "fetchWaitMaxMs": return getOrCreateConfiguration(target).getFetchWaitMaxMs();
        case "groupid":
        case "groupId": return getOrCreateConfiguration(target).getGroupId();
        case "headerfilterstrategy":
        case "headerFilterStrategy": return getOrCreateConfiguration(target).getHeaderFilterStrategy();
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": return getOrCreateConfiguration(target).getHeartbeatIntervalMs();
        case "interceptorclasses":
        case "interceptorClasses": return getOrCreateConfiguration(target).getInterceptorClasses();
        case "kafkaheaderdeserializer":
        case "kafkaHeaderDeserializer": return getOrCreateConfiguration(target).getKafkaHeaderDeserializer();
        case "kafkaheaderserializer":
        case "kafkaHeaderSerializer": return getOrCreateConfiguration(target).getKafkaHeaderSerializer();
        case "kafkamanualcommitfactory":
        case "kafkaManualCommitFactory": return target.getKafkaManualCommitFactory();
        case "kerberosbeforereloginmintime":
        case "kerberosBeforeReloginMinTime": return getOrCreateConfiguration(target).getKerberosBeforeReloginMinTime();
        case "kerberosinitcmd":
        case "kerberosInitCmd": return getOrCreateConfiguration(target).getKerberosInitCmd();
        case "kerberosprincipaltolocalrules":
        case "kerberosPrincipalToLocalRules": return getOrCreateConfiguration(target).getKerberosPrincipalToLocalRules();
        case "kerberosrenewjitter":
        case "kerberosRenewJitter": return getOrCreateConfiguration(target).getKerberosRenewJitter();
        case "kerberosrenewwindowfactor":
        case "kerberosRenewWindowFactor": return getOrCreateConfiguration(target).getKerberosRenewWindowFactor();
        case "key": return getOrCreateConfiguration(target).getKey();
        case "keydeserializer":
        case "keyDeserializer": return getOrCreateConfiguration(target).getKeyDeserializer();
        case "keyserializerclass":
        case "keySerializerClass": return getOrCreateConfiguration(target).getKeySerializerClass();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "lingerms":
        case "lingerMs": return getOrCreateConfiguration(target).getLingerMs();
        case "maxblockms":
        case "maxBlockMs": return getOrCreateConfiguration(target).getMaxBlockMs();
        case "maxinflightrequest":
        case "maxInFlightRequest": return getOrCreateConfiguration(target).getMaxInFlightRequest();
        case "maxpartitionfetchbytes":
        case "maxPartitionFetchBytes": return getOrCreateConfiguration(target).getMaxPartitionFetchBytes();
        case "maxpollintervalms":
        case "maxPollIntervalMs": return getOrCreateConfiguration(target).getMaxPollIntervalMs();
        case "maxpollrecords":
        case "maxPollRecords": return getOrCreateConfiguration(target).getMaxPollRecords();
        case "maxrequestsize":
        case "maxRequestSize": return getOrCreateConfiguration(target).getMaxRequestSize();
        case "metadatamaxagems":
        case "metadataMaxAgeMs": return getOrCreateConfiguration(target).getMetadataMaxAgeMs();
        case "metricreporters":
        case "metricReporters": return getOrCreateConfiguration(target).getMetricReporters();
        case "metricssamplewindowms":
        case "metricsSampleWindowMs": return getOrCreateConfiguration(target).getMetricsSampleWindowMs();
        case "noofmetricssample":
        case "noOfMetricsSample": return getOrCreateConfiguration(target).getNoOfMetricsSample();
        case "offsetrepository":
        case "offsetRepository": return getOrCreateConfiguration(target).getOffsetRepository();
        case "partitionassignor":
        case "partitionAssignor": return getOrCreateConfiguration(target).getPartitionAssignor();
        case "partitionkey":
        case "partitionKey": return getOrCreateConfiguration(target).getPartitionKey();
        case "partitioner": return getOrCreateConfiguration(target).getPartitioner();
        case "polltimeoutms":
        case "pollTimeoutMs": return getOrCreateConfiguration(target).getPollTimeoutMs();
        case "producerbatchsize":
        case "producerBatchSize": return getOrCreateConfiguration(target).getProducerBatchSize();
        case "queuebufferingmaxmessages":
        case "queueBufferingMaxMessages": return getOrCreateConfiguration(target).getQueueBufferingMaxMessages();
        case "receivebufferbytes":
        case "receiveBufferBytes": return getOrCreateConfiguration(target).getReceiveBufferBytes();
        case "reconnectbackoffmaxms":
        case "reconnectBackoffMaxMs": return getOrCreateConfiguration(target).getReconnectBackoffMaxMs();
        case "reconnectbackoffms":
        case "reconnectBackoffMs": return getOrCreateConfiguration(target).getReconnectBackoffMs();
        case "recordmetadata":
        case "recordMetadata": return getOrCreateConfiguration(target).isRecordMetadata();
        case "requestrequiredacks":
        case "requestRequiredAcks": return getOrCreateConfiguration(target).getRequestRequiredAcks();
        case "requesttimeoutms":
        case "requestTimeoutMs": return getOrCreateConfiguration(target).getRequestTimeoutMs();
        case "retries": return getOrCreateConfiguration(target).getRetries();
        case "retrybackoffms":
        case "retryBackoffMs": return getOrCreateConfiguration(target).getRetryBackoffMs();
        case "sasljaasconfig":
        case "saslJaasConfig": return getOrCreateConfiguration(target).getSaslJaasConfig();
        case "saslkerberosservicename":
        case "saslKerberosServiceName": return getOrCreateConfiguration(target).getSaslKerberosServiceName();
        case "saslmechanism":
        case "saslMechanism": return getOrCreateConfiguration(target).getSaslMechanism();
        case "schemaregistryurl":
        case "schemaRegistryURL": return getOrCreateConfiguration(target).getSchemaRegistryURL();
        case "securityprotocol":
        case "securityProtocol": return getOrCreateConfiguration(target).getSecurityProtocol();
        case "seekto":
        case "seekTo": return getOrCreateConfiguration(target).getSeekTo();
        case "sendbufferbytes":
        case "sendBufferBytes": return getOrCreateConfiguration(target).getSendBufferBytes();
        case "serializerclass":
        case "serializerClass": return getOrCreateConfiguration(target).getSerializerClass();
        case "sessiontimeoutms":
        case "sessionTimeoutMs": return getOrCreateConfiguration(target).getSessionTimeoutMs();
        case "specificavroreader":
        case "specificAvroReader": return getOrCreateConfiguration(target).isSpecificAvroReader();
        case "sslciphersuites":
        case "sslCipherSuites": return getOrCreateConfiguration(target).getSslCipherSuites();
        case "sslcontextparameters":
        case "sslContextParameters": return getOrCreateConfiguration(target).getSslContextParameters();
        case "sslenabledprotocols":
        case "sslEnabledProtocols": return getOrCreateConfiguration(target).getSslEnabledProtocols();
        case "sslendpointalgorithm":
        case "sslEndpointAlgorithm": return getOrCreateConfiguration(target).getSslEndpointAlgorithm();
        case "sslkeypassword":
        case "sslKeyPassword": return getOrCreateConfiguration(target).getSslKeyPassword();
        case "sslkeymanageralgorithm":
        case "sslKeymanagerAlgorithm": return getOrCreateConfiguration(target).getSslKeymanagerAlgorithm();
        case "sslkeystorelocation":
        case "sslKeystoreLocation": return getOrCreateConfiguration(target).getSslKeystoreLocation();
        case "sslkeystorepassword":
        case "sslKeystorePassword": return getOrCreateConfiguration(target).getSslKeystorePassword();
        case "sslkeystoretype":
        case "sslKeystoreType": return getOrCreateConfiguration(target).getSslKeystoreType();
        case "sslprotocol":
        case "sslProtocol": return getOrCreateConfiguration(target).getSslProtocol();
        case "sslprovider":
        case "sslProvider": return getOrCreateConfiguration(target).getSslProvider();
        case "ssltrustmanageralgorithm":
        case "sslTrustmanagerAlgorithm": return getOrCreateConfiguration(target).getSslTrustmanagerAlgorithm();
        case "ssltruststorelocation":
        case "sslTruststoreLocation": return getOrCreateConfiguration(target).getSslTruststoreLocation();
        case "ssltruststorepassword":
        case "sslTruststorePassword": return getOrCreateConfiguration(target).getSslTruststorePassword();
        case "ssltruststoretype":
        case "sslTruststoreType": return getOrCreateConfiguration(target).getSslTruststoreType();
        case "topicispattern":
        case "topicIsPattern": return getOrCreateConfiguration(target).isTopicIsPattern();
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": return target.isUseGlobalSslContextParameters();
        case "valuedeserializer":
        case "valueDeserializer": return getOrCreateConfiguration(target).getValueDeserializer();
        case "workerpool":
        case "workerPool": return getOrCreateConfiguration(target).getWorkerPool();
        case "workerpoolcoresize":
        case "workerPoolCoreSize": return getOrCreateConfiguration(target).getWorkerPoolCoreSize();
        case "workerpoolmaxsize":
        case "workerPoolMaxSize": return getOrCreateConfiguration(target).getWorkerPoolMaxSize();
        default: return null;
        }
    }
}

