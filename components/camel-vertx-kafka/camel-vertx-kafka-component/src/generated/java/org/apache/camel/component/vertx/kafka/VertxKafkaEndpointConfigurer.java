/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.vertx.kafka;

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
public class VertxKafkaEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        VertxKafkaEndpoint target = (VertxKafkaEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acks": target.getConfiguration().setAcks(property(camelContext, java.lang.String.class, value)); return true;
        case "allowautocreatetopics":
        case "allowAutoCreateTopics": target.getConfiguration().setAllowAutoCreateTopics(property(camelContext, boolean.class, value)); return true;
        case "autocommitintervalms":
        case "autoCommitIntervalMs": target.getConfiguration().setAutoCommitIntervalMs(property(camelContext, int.class, value)); return true;
        case "autooffsetreset":
        case "autoOffsetReset": target.getConfiguration().setAutoOffsetReset(property(camelContext, java.lang.String.class, value)); return true;
        case "batchsize":
        case "batchSize": target.getConfiguration().setBatchSize(property(camelContext, int.class, value)); return true;
        case "bootstrapservers":
        case "bootstrapServers": target.getConfiguration().setBootstrapServers(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "buffermemory":
        case "bufferMemory": target.getConfiguration().setBufferMemory(property(camelContext, long.class, value)); return true;
        case "checkcrcs":
        case "checkCrcs": target.getConfiguration().setCheckCrcs(property(camelContext, boolean.class, value)); return true;
        case "clientdnslookup":
        case "clientDnsLookup": target.getConfiguration().setClientDnsLookup(property(camelContext, java.lang.String.class, value)); return true;
        case "clientid":
        case "clientId": target.getConfiguration().setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientrack":
        case "clientRack": target.getConfiguration().setClientRack(property(camelContext, java.lang.String.class, value)); return true;
        case "compressiontype":
        case "compressionType": target.getConfiguration().setCompressionType(property(camelContext, java.lang.String.class, value)); return true;
        case "connectionsmaxidlems":
        case "connectionsMaxIdleMs": target.getConfiguration().setConnectionsMaxIdleMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "defaultapitimeoutms":
        case "defaultApiTimeoutMs": target.getConfiguration().setDefaultApiTimeoutMs(property(camelContext, int.class, value)); return true;
        case "deliverytimeoutms":
        case "deliveryTimeoutMs": target.getConfiguration().setDeliveryTimeoutMs(property(camelContext, int.class, value)); return true;
        case "enableautocommit":
        case "enableAutoCommit": target.getConfiguration().setEnableAutoCommit(property(camelContext, boolean.class, value)); return true;
        case "enableidempotence":
        case "enableIdempotence": target.getConfiguration().setEnableIdempotence(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "excludeinternaltopics":
        case "excludeInternalTopics": target.getConfiguration().setExcludeInternalTopics(property(camelContext, boolean.class, value)); return true;
        case "fetchmaxbytes":
        case "fetchMaxBytes": target.getConfiguration().setFetchMaxBytes(property(camelContext, int.class, value)); return true;
        case "fetchmaxwaitms":
        case "fetchMaxWaitMs": target.getConfiguration().setFetchMaxWaitMs(property(camelContext, int.class, value)); return true;
        case "fetchminbytes":
        case "fetchMinBytes": target.getConfiguration().setFetchMinBytes(property(camelContext, int.class, value)); return true;
        case "groupid":
        case "groupId": target.getConfiguration().setGroupId(property(camelContext, java.lang.String.class, value)); return true;
        case "groupinstanceid":
        case "groupInstanceId": target.getConfiguration().setGroupInstanceId(property(camelContext, java.lang.String.class, value)); return true;
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": target.getConfiguration().setHeartbeatIntervalMs(property(camelContext, int.class, value)); return true;
        case "interceptorclasses":
        case "interceptorClasses": target.getConfiguration().setInterceptorClasses(property(camelContext, java.lang.String.class, value)); return true;
        case "isolationlevel":
        case "isolationLevel": target.getConfiguration().setIsolationLevel(property(camelContext, java.lang.String.class, value)); return true;
        case "keydeserializer":
        case "keyDeserializer": target.getConfiguration().setKeyDeserializer(property(camelContext, java.lang.String.class, value)); return true;
        case "keyserializer":
        case "keySerializer": target.getConfiguration().setKeySerializer(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "lingerms":
        case "lingerMs": target.getConfiguration().setLingerMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "maxblockms":
        case "maxBlockMs": target.getConfiguration().setMaxBlockMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "maxinflightrequestsperconnection":
        case "maxInFlightRequestsPerConnection": target.getConfiguration().setMaxInFlightRequestsPerConnection(property(camelContext, int.class, value)); return true;
        case "maxpartitionfetchbytes":
        case "maxPartitionFetchBytes": target.getConfiguration().setMaxPartitionFetchBytes(property(camelContext, int.class, value)); return true;
        case "maxpollintervalms":
        case "maxPollIntervalMs": target.getConfiguration().setMaxPollIntervalMs(property(camelContext, int.class, value)); return true;
        case "maxpollrecords":
        case "maxPollRecords": target.getConfiguration().setMaxPollRecords(property(camelContext, int.class, value)); return true;
        case "maxrequestsize":
        case "maxRequestSize": target.getConfiguration().setMaxRequestSize(property(camelContext, int.class, value)); return true;
        case "metadatamaxagems":
        case "metadataMaxAgeMs": target.getConfiguration().setMetadataMaxAgeMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "metadatamaxidlems":
        case "metadataMaxIdleMs": target.getConfiguration().setMetadataMaxIdleMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "metricreporters":
        case "metricReporters": target.getConfiguration().setMetricReporters(property(camelContext, java.lang.String.class, value)); return true;
        case "metricsnumsamples":
        case "metricsNumSamples": target.getConfiguration().setMetricsNumSamples(property(camelContext, int.class, value)); return true;
        case "metricsrecordinglevel":
        case "metricsRecordingLevel": target.getConfiguration().setMetricsRecordingLevel(property(camelContext, java.lang.String.class, value)); return true;
        case "metricssamplewindowms":
        case "metricsSampleWindowMs": target.getConfiguration().setMetricsSampleWindowMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "partitionassignmentstrategy":
        case "partitionAssignmentStrategy": target.getConfiguration().setPartitionAssignmentStrategy(property(camelContext, java.lang.String.class, value)); return true;
        case "partitionid":
        case "partitionId": target.getConfiguration().setPartitionId(property(camelContext, java.lang.Integer.class, value)); return true;
        case "partitionerclass":
        case "partitionerClass": target.getConfiguration().setPartitionerClass(property(camelContext, java.lang.String.class, value)); return true;
        case "receivebufferbytes":
        case "receiveBufferBytes": target.getConfiguration().setReceiveBufferBytes(property(camelContext, int.class, value)); return true;
        case "reconnectbackoffmaxms":
        case "reconnectBackoffMaxMs": target.getConfiguration().setReconnectBackoffMaxMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "reconnectbackoffms":
        case "reconnectBackoffMs": target.getConfiguration().setReconnectBackoffMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "requesttimeoutms":
        case "requestTimeoutMs": target.getConfiguration().setRequestTimeoutMs(property(camelContext, int.class, value)); return true;
        case "retries": target.getConfiguration().setRetries(property(camelContext, int.class, value)); return true;
        case "retrybackoffms":
        case "retryBackoffMs": target.getConfiguration().setRetryBackoffMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "saslclientcallbackhandlerclass":
        case "saslClientCallbackHandlerClass": target.getConfiguration().setSaslClientCallbackHandlerClass(property(camelContext, java.lang.String.class, value)); return true;
        case "sasljaasconfig":
        case "saslJaasConfig": target.getConfiguration().setSaslJaasConfig(property(camelContext, java.lang.String.class, value)); return true;
        case "saslkerberoskinitcmd":
        case "saslKerberosKinitCmd": target.getConfiguration().setSaslKerberosKinitCmd(property(camelContext, java.lang.String.class, value)); return true;
        case "saslkerberosmintimebeforerelogin":
        case "saslKerberosMinTimeBeforeRelogin": target.getConfiguration().setSaslKerberosMinTimeBeforeRelogin(property(camelContext, long.class, value)); return true;
        case "saslkerberosservicename":
        case "saslKerberosServiceName": target.getConfiguration().setSaslKerberosServiceName(property(camelContext, java.lang.String.class, value)); return true;
        case "saslkerberosticketrenewjitter":
        case "saslKerberosTicketRenewJitter": target.getConfiguration().setSaslKerberosTicketRenewJitter(property(camelContext, double.class, value)); return true;
        case "saslkerberosticketrenewwindowfactor":
        case "saslKerberosTicketRenewWindowFactor": target.getConfiguration().setSaslKerberosTicketRenewWindowFactor(property(camelContext, double.class, value)); return true;
        case "sasllogincallbackhandlerclass":
        case "saslLoginCallbackHandlerClass": target.getConfiguration().setSaslLoginCallbackHandlerClass(property(camelContext, java.lang.String.class, value)); return true;
        case "saslloginclass":
        case "saslLoginClass": target.getConfiguration().setSaslLoginClass(property(camelContext, java.lang.String.class, value)); return true;
        case "saslloginrefreshbufferseconds":
        case "saslLoginRefreshBufferSeconds": target.getConfiguration().setSaslLoginRefreshBufferSeconds(property(camelContext, short.class, value)); return true;
        case "saslloginrefreshminperiodseconds":
        case "saslLoginRefreshMinPeriodSeconds": target.getConfiguration().setSaslLoginRefreshMinPeriodSeconds(property(camelContext, short.class, value)); return true;
        case "saslloginrefreshwindowfactor":
        case "saslLoginRefreshWindowFactor": target.getConfiguration().setSaslLoginRefreshWindowFactor(property(camelContext, double.class, value)); return true;
        case "saslloginrefreshwindowjitter":
        case "saslLoginRefreshWindowJitter": target.getConfiguration().setSaslLoginRefreshWindowJitter(property(camelContext, double.class, value)); return true;
        case "saslmechanism":
        case "saslMechanism": target.getConfiguration().setSaslMechanism(property(camelContext, java.lang.String.class, value)); return true;
        case "securityprotocol":
        case "securityProtocol": target.getConfiguration().setSecurityProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "securityproviders":
        case "securityProviders": target.getConfiguration().setSecurityProviders(property(camelContext, java.lang.String.class, value)); return true;
        case "seektooffset":
        case "seekToOffset": target.getConfiguration().setSeekToOffset(property(camelContext, java.lang.Long.class, value)); return true;
        case "seektoposition":
        case "seekToPosition": target.getConfiguration().setSeekToPosition(property(camelContext, java.lang.String.class, value)); return true;
        case "sendbufferbytes":
        case "sendBufferBytes": target.getConfiguration().setSendBufferBytes(property(camelContext, int.class, value)); return true;
        case "sessiontimeoutms":
        case "sessionTimeoutMs": target.getConfiguration().setSessionTimeoutMs(property(camelContext, int.class, value)); return true;
        case "sslciphersuites":
        case "sslCipherSuites": target.getConfiguration().setSslCipherSuites(property(camelContext, java.lang.String.class, value)); return true;
        case "sslenabledprotocols":
        case "sslEnabledProtocols": target.getConfiguration().setSslEnabledProtocols(property(camelContext, java.lang.String.class, value)); return true;
        case "sslendpointidentificationalgorithm":
        case "sslEndpointIdentificationAlgorithm": target.getConfiguration().setSslEndpointIdentificationAlgorithm(property(camelContext, java.lang.String.class, value)); return true;
        case "sslenginefactoryclass":
        case "sslEngineFactoryClass": target.getConfiguration().setSslEngineFactoryClass(property(camelContext, java.lang.String.class, value)); return true;
        case "sslkeypassword":
        case "sslKeyPassword": target.getConfiguration().setSslKeyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "sslkeymanageralgorithm":
        case "sslKeymanagerAlgorithm": target.getConfiguration().setSslKeymanagerAlgorithm(property(camelContext, java.lang.String.class, value)); return true;
        case "sslkeystorelocation":
        case "sslKeystoreLocation": target.getConfiguration().setSslKeystoreLocation(property(camelContext, java.lang.String.class, value)); return true;
        case "sslkeystorepassword":
        case "sslKeystorePassword": target.getConfiguration().setSslKeystorePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "sslkeystoretype":
        case "sslKeystoreType": target.getConfiguration().setSslKeystoreType(property(camelContext, java.lang.String.class, value)); return true;
        case "sslprotocol":
        case "sslProtocol": target.getConfiguration().setSslProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "sslprovider":
        case "sslProvider": target.getConfiguration().setSslProvider(property(camelContext, java.lang.String.class, value)); return true;
        case "sslsecurerandomimplementation":
        case "sslSecureRandomImplementation": target.getConfiguration().setSslSecureRandomImplementation(property(camelContext, java.lang.String.class, value)); return true;
        case "ssltrustmanageralgorithm":
        case "sslTrustmanagerAlgorithm": target.getConfiguration().setSslTrustmanagerAlgorithm(property(camelContext, java.lang.String.class, value)); return true;
        case "ssltruststorelocation":
        case "sslTruststoreLocation": target.getConfiguration().setSslTruststoreLocation(property(camelContext, java.lang.String.class, value)); return true;
        case "ssltruststorepassword":
        case "sslTruststorePassword": target.getConfiguration().setSslTruststorePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "ssltruststoretype":
        case "sslTruststoreType": target.getConfiguration().setSslTruststoreType(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "transactiontimeoutms":
        case "transactionTimeoutMs": target.getConfiguration().setTransactionTimeoutMs(property(camelContext, int.class, value)); return true;
        case "transactionalid":
        case "transactionalId": target.getConfiguration().setTransactionalId(property(camelContext, java.lang.String.class, value)); return true;
        case "valuedeserializer":
        case "valueDeserializer": target.getConfiguration().setValueDeserializer(property(camelContext, java.lang.String.class, value)); return true;
        case "valueserializer":
        case "valueSerializer": target.getConfiguration().setValueSerializer(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acks": return java.lang.String.class;
        case "allowautocreatetopics":
        case "allowAutoCreateTopics": return boolean.class;
        case "autocommitintervalms":
        case "autoCommitIntervalMs": return int.class;
        case "autooffsetreset":
        case "autoOffsetReset": return java.lang.String.class;
        case "batchsize":
        case "batchSize": return int.class;
        case "bootstrapservers":
        case "bootstrapServers": return java.lang.String.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "buffermemory":
        case "bufferMemory": return long.class;
        case "checkcrcs":
        case "checkCrcs": return boolean.class;
        case "clientdnslookup":
        case "clientDnsLookup": return java.lang.String.class;
        case "clientid":
        case "clientId": return java.lang.String.class;
        case "clientrack":
        case "clientRack": return java.lang.String.class;
        case "compressiontype":
        case "compressionType": return java.lang.String.class;
        case "connectionsmaxidlems":
        case "connectionsMaxIdleMs": return long.class;
        case "defaultapitimeoutms":
        case "defaultApiTimeoutMs": return int.class;
        case "deliverytimeoutms":
        case "deliveryTimeoutMs": return int.class;
        case "enableautocommit":
        case "enableAutoCommit": return boolean.class;
        case "enableidempotence":
        case "enableIdempotence": return boolean.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "excludeinternaltopics":
        case "excludeInternalTopics": return boolean.class;
        case "fetchmaxbytes":
        case "fetchMaxBytes": return int.class;
        case "fetchmaxwaitms":
        case "fetchMaxWaitMs": return int.class;
        case "fetchminbytes":
        case "fetchMinBytes": return int.class;
        case "groupid":
        case "groupId": return java.lang.String.class;
        case "groupinstanceid":
        case "groupInstanceId": return java.lang.String.class;
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": return int.class;
        case "interceptorclasses":
        case "interceptorClasses": return java.lang.String.class;
        case "isolationlevel":
        case "isolationLevel": return java.lang.String.class;
        case "keydeserializer":
        case "keyDeserializer": return java.lang.String.class;
        case "keyserializer":
        case "keySerializer": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "lingerms":
        case "lingerMs": return long.class;
        case "maxblockms":
        case "maxBlockMs": return long.class;
        case "maxinflightrequestsperconnection":
        case "maxInFlightRequestsPerConnection": return int.class;
        case "maxpartitionfetchbytes":
        case "maxPartitionFetchBytes": return int.class;
        case "maxpollintervalms":
        case "maxPollIntervalMs": return int.class;
        case "maxpollrecords":
        case "maxPollRecords": return int.class;
        case "maxrequestsize":
        case "maxRequestSize": return int.class;
        case "metadatamaxagems":
        case "metadataMaxAgeMs": return long.class;
        case "metadatamaxidlems":
        case "metadataMaxIdleMs": return long.class;
        case "metricreporters":
        case "metricReporters": return java.lang.String.class;
        case "metricsnumsamples":
        case "metricsNumSamples": return int.class;
        case "metricsrecordinglevel":
        case "metricsRecordingLevel": return java.lang.String.class;
        case "metricssamplewindowms":
        case "metricsSampleWindowMs": return long.class;
        case "partitionassignmentstrategy":
        case "partitionAssignmentStrategy": return java.lang.String.class;
        case "partitionid":
        case "partitionId": return java.lang.Integer.class;
        case "partitionerclass":
        case "partitionerClass": return java.lang.String.class;
        case "receivebufferbytes":
        case "receiveBufferBytes": return int.class;
        case "reconnectbackoffmaxms":
        case "reconnectBackoffMaxMs": return long.class;
        case "reconnectbackoffms":
        case "reconnectBackoffMs": return long.class;
        case "requesttimeoutms":
        case "requestTimeoutMs": return int.class;
        case "retries": return int.class;
        case "retrybackoffms":
        case "retryBackoffMs": return long.class;
        case "saslclientcallbackhandlerclass":
        case "saslClientCallbackHandlerClass": return java.lang.String.class;
        case "sasljaasconfig":
        case "saslJaasConfig": return java.lang.String.class;
        case "saslkerberoskinitcmd":
        case "saslKerberosKinitCmd": return java.lang.String.class;
        case "saslkerberosmintimebeforerelogin":
        case "saslKerberosMinTimeBeforeRelogin": return long.class;
        case "saslkerberosservicename":
        case "saslKerberosServiceName": return java.lang.String.class;
        case "saslkerberosticketrenewjitter":
        case "saslKerberosTicketRenewJitter": return double.class;
        case "saslkerberosticketrenewwindowfactor":
        case "saslKerberosTicketRenewWindowFactor": return double.class;
        case "sasllogincallbackhandlerclass":
        case "saslLoginCallbackHandlerClass": return java.lang.String.class;
        case "saslloginclass":
        case "saslLoginClass": return java.lang.String.class;
        case "saslloginrefreshbufferseconds":
        case "saslLoginRefreshBufferSeconds": return short.class;
        case "saslloginrefreshminperiodseconds":
        case "saslLoginRefreshMinPeriodSeconds": return short.class;
        case "saslloginrefreshwindowfactor":
        case "saslLoginRefreshWindowFactor": return double.class;
        case "saslloginrefreshwindowjitter":
        case "saslLoginRefreshWindowJitter": return double.class;
        case "saslmechanism":
        case "saslMechanism": return java.lang.String.class;
        case "securityprotocol":
        case "securityProtocol": return java.lang.String.class;
        case "securityproviders":
        case "securityProviders": return java.lang.String.class;
        case "seektooffset":
        case "seekToOffset": return java.lang.Long.class;
        case "seektoposition":
        case "seekToPosition": return java.lang.String.class;
        case "sendbufferbytes":
        case "sendBufferBytes": return int.class;
        case "sessiontimeoutms":
        case "sessionTimeoutMs": return int.class;
        case "sslciphersuites":
        case "sslCipherSuites": return java.lang.String.class;
        case "sslenabledprotocols":
        case "sslEnabledProtocols": return java.lang.String.class;
        case "sslendpointidentificationalgorithm":
        case "sslEndpointIdentificationAlgorithm": return java.lang.String.class;
        case "sslenginefactoryclass":
        case "sslEngineFactoryClass": return java.lang.String.class;
        case "sslkeypassword":
        case "sslKeyPassword": return java.lang.String.class;
        case "sslkeymanageralgorithm":
        case "sslKeymanagerAlgorithm": return java.lang.String.class;
        case "sslkeystorelocation":
        case "sslKeystoreLocation": return java.lang.String.class;
        case "sslkeystorepassword":
        case "sslKeystorePassword": return java.lang.String.class;
        case "sslkeystoretype":
        case "sslKeystoreType": return java.lang.String.class;
        case "sslprotocol":
        case "sslProtocol": return java.lang.String.class;
        case "sslprovider":
        case "sslProvider": return java.lang.String.class;
        case "sslsecurerandomimplementation":
        case "sslSecureRandomImplementation": return java.lang.String.class;
        case "ssltrustmanageralgorithm":
        case "sslTrustmanagerAlgorithm": return java.lang.String.class;
        case "ssltruststorelocation":
        case "sslTruststoreLocation": return java.lang.String.class;
        case "ssltruststorepassword":
        case "sslTruststorePassword": return java.lang.String.class;
        case "ssltruststoretype":
        case "sslTruststoreType": return java.lang.String.class;
        case "synchronous": return boolean.class;
        case "transactiontimeoutms":
        case "transactionTimeoutMs": return int.class;
        case "transactionalid":
        case "transactionalId": return java.lang.String.class;
        case "valuedeserializer":
        case "valueDeserializer": return java.lang.String.class;
        case "valueserializer":
        case "valueSerializer": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        VertxKafkaEndpoint target = (VertxKafkaEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acks": return target.getConfiguration().getAcks();
        case "allowautocreatetopics":
        case "allowAutoCreateTopics": return target.getConfiguration().isAllowAutoCreateTopics();
        case "autocommitintervalms":
        case "autoCommitIntervalMs": return target.getConfiguration().getAutoCommitIntervalMs();
        case "autooffsetreset":
        case "autoOffsetReset": return target.getConfiguration().getAutoOffsetReset();
        case "batchsize":
        case "batchSize": return target.getConfiguration().getBatchSize();
        case "bootstrapservers":
        case "bootstrapServers": return target.getConfiguration().getBootstrapServers();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "buffermemory":
        case "bufferMemory": return target.getConfiguration().getBufferMemory();
        case "checkcrcs":
        case "checkCrcs": return target.getConfiguration().isCheckCrcs();
        case "clientdnslookup":
        case "clientDnsLookup": return target.getConfiguration().getClientDnsLookup();
        case "clientid":
        case "clientId": return target.getConfiguration().getClientId();
        case "clientrack":
        case "clientRack": return target.getConfiguration().getClientRack();
        case "compressiontype":
        case "compressionType": return target.getConfiguration().getCompressionType();
        case "connectionsmaxidlems":
        case "connectionsMaxIdleMs": return target.getConfiguration().getConnectionsMaxIdleMs();
        case "defaultapitimeoutms":
        case "defaultApiTimeoutMs": return target.getConfiguration().getDefaultApiTimeoutMs();
        case "deliverytimeoutms":
        case "deliveryTimeoutMs": return target.getConfiguration().getDeliveryTimeoutMs();
        case "enableautocommit":
        case "enableAutoCommit": return target.getConfiguration().isEnableAutoCommit();
        case "enableidempotence":
        case "enableIdempotence": return target.getConfiguration().isEnableIdempotence();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "excludeinternaltopics":
        case "excludeInternalTopics": return target.getConfiguration().isExcludeInternalTopics();
        case "fetchmaxbytes":
        case "fetchMaxBytes": return target.getConfiguration().getFetchMaxBytes();
        case "fetchmaxwaitms":
        case "fetchMaxWaitMs": return target.getConfiguration().getFetchMaxWaitMs();
        case "fetchminbytes":
        case "fetchMinBytes": return target.getConfiguration().getFetchMinBytes();
        case "groupid":
        case "groupId": return target.getConfiguration().getGroupId();
        case "groupinstanceid":
        case "groupInstanceId": return target.getConfiguration().getGroupInstanceId();
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": return target.getConfiguration().getHeartbeatIntervalMs();
        case "interceptorclasses":
        case "interceptorClasses": return target.getConfiguration().getInterceptorClasses();
        case "isolationlevel":
        case "isolationLevel": return target.getConfiguration().getIsolationLevel();
        case "keydeserializer":
        case "keyDeserializer": return target.getConfiguration().getKeyDeserializer();
        case "keyserializer":
        case "keySerializer": return target.getConfiguration().getKeySerializer();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "lingerms":
        case "lingerMs": return target.getConfiguration().getLingerMs();
        case "maxblockms":
        case "maxBlockMs": return target.getConfiguration().getMaxBlockMs();
        case "maxinflightrequestsperconnection":
        case "maxInFlightRequestsPerConnection": return target.getConfiguration().getMaxInFlightRequestsPerConnection();
        case "maxpartitionfetchbytes":
        case "maxPartitionFetchBytes": return target.getConfiguration().getMaxPartitionFetchBytes();
        case "maxpollintervalms":
        case "maxPollIntervalMs": return target.getConfiguration().getMaxPollIntervalMs();
        case "maxpollrecords":
        case "maxPollRecords": return target.getConfiguration().getMaxPollRecords();
        case "maxrequestsize":
        case "maxRequestSize": return target.getConfiguration().getMaxRequestSize();
        case "metadatamaxagems":
        case "metadataMaxAgeMs": return target.getConfiguration().getMetadataMaxAgeMs();
        case "metadatamaxidlems":
        case "metadataMaxIdleMs": return target.getConfiguration().getMetadataMaxIdleMs();
        case "metricreporters":
        case "metricReporters": return target.getConfiguration().getMetricReporters();
        case "metricsnumsamples":
        case "metricsNumSamples": return target.getConfiguration().getMetricsNumSamples();
        case "metricsrecordinglevel":
        case "metricsRecordingLevel": return target.getConfiguration().getMetricsRecordingLevel();
        case "metricssamplewindowms":
        case "metricsSampleWindowMs": return target.getConfiguration().getMetricsSampleWindowMs();
        case "partitionassignmentstrategy":
        case "partitionAssignmentStrategy": return target.getConfiguration().getPartitionAssignmentStrategy();
        case "partitionid":
        case "partitionId": return target.getConfiguration().getPartitionId();
        case "partitionerclass":
        case "partitionerClass": return target.getConfiguration().getPartitionerClass();
        case "receivebufferbytes":
        case "receiveBufferBytes": return target.getConfiguration().getReceiveBufferBytes();
        case "reconnectbackoffmaxms":
        case "reconnectBackoffMaxMs": return target.getConfiguration().getReconnectBackoffMaxMs();
        case "reconnectbackoffms":
        case "reconnectBackoffMs": return target.getConfiguration().getReconnectBackoffMs();
        case "requesttimeoutms":
        case "requestTimeoutMs": return target.getConfiguration().getRequestTimeoutMs();
        case "retries": return target.getConfiguration().getRetries();
        case "retrybackoffms":
        case "retryBackoffMs": return target.getConfiguration().getRetryBackoffMs();
        case "saslclientcallbackhandlerclass":
        case "saslClientCallbackHandlerClass": return target.getConfiguration().getSaslClientCallbackHandlerClass();
        case "sasljaasconfig":
        case "saslJaasConfig": return target.getConfiguration().getSaslJaasConfig();
        case "saslkerberoskinitcmd":
        case "saslKerberosKinitCmd": return target.getConfiguration().getSaslKerberosKinitCmd();
        case "saslkerberosmintimebeforerelogin":
        case "saslKerberosMinTimeBeforeRelogin": return target.getConfiguration().getSaslKerberosMinTimeBeforeRelogin();
        case "saslkerberosservicename":
        case "saslKerberosServiceName": return target.getConfiguration().getSaslKerberosServiceName();
        case "saslkerberosticketrenewjitter":
        case "saslKerberosTicketRenewJitter": return target.getConfiguration().getSaslKerberosTicketRenewJitter();
        case "saslkerberosticketrenewwindowfactor":
        case "saslKerberosTicketRenewWindowFactor": return target.getConfiguration().getSaslKerberosTicketRenewWindowFactor();
        case "sasllogincallbackhandlerclass":
        case "saslLoginCallbackHandlerClass": return target.getConfiguration().getSaslLoginCallbackHandlerClass();
        case "saslloginclass":
        case "saslLoginClass": return target.getConfiguration().getSaslLoginClass();
        case "saslloginrefreshbufferseconds":
        case "saslLoginRefreshBufferSeconds": return target.getConfiguration().getSaslLoginRefreshBufferSeconds();
        case "saslloginrefreshminperiodseconds":
        case "saslLoginRefreshMinPeriodSeconds": return target.getConfiguration().getSaslLoginRefreshMinPeriodSeconds();
        case "saslloginrefreshwindowfactor":
        case "saslLoginRefreshWindowFactor": return target.getConfiguration().getSaslLoginRefreshWindowFactor();
        case "saslloginrefreshwindowjitter":
        case "saslLoginRefreshWindowJitter": return target.getConfiguration().getSaslLoginRefreshWindowJitter();
        case "saslmechanism":
        case "saslMechanism": return target.getConfiguration().getSaslMechanism();
        case "securityprotocol":
        case "securityProtocol": return target.getConfiguration().getSecurityProtocol();
        case "securityproviders":
        case "securityProviders": return target.getConfiguration().getSecurityProviders();
        case "seektooffset":
        case "seekToOffset": return target.getConfiguration().getSeekToOffset();
        case "seektoposition":
        case "seekToPosition": return target.getConfiguration().getSeekToPosition();
        case "sendbufferbytes":
        case "sendBufferBytes": return target.getConfiguration().getSendBufferBytes();
        case "sessiontimeoutms":
        case "sessionTimeoutMs": return target.getConfiguration().getSessionTimeoutMs();
        case "sslciphersuites":
        case "sslCipherSuites": return target.getConfiguration().getSslCipherSuites();
        case "sslenabledprotocols":
        case "sslEnabledProtocols": return target.getConfiguration().getSslEnabledProtocols();
        case "sslendpointidentificationalgorithm":
        case "sslEndpointIdentificationAlgorithm": return target.getConfiguration().getSslEndpointIdentificationAlgorithm();
        case "sslenginefactoryclass":
        case "sslEngineFactoryClass": return target.getConfiguration().getSslEngineFactoryClass();
        case "sslkeypassword":
        case "sslKeyPassword": return target.getConfiguration().getSslKeyPassword();
        case "sslkeymanageralgorithm":
        case "sslKeymanagerAlgorithm": return target.getConfiguration().getSslKeymanagerAlgorithm();
        case "sslkeystorelocation":
        case "sslKeystoreLocation": return target.getConfiguration().getSslKeystoreLocation();
        case "sslkeystorepassword":
        case "sslKeystorePassword": return target.getConfiguration().getSslKeystorePassword();
        case "sslkeystoretype":
        case "sslKeystoreType": return target.getConfiguration().getSslKeystoreType();
        case "sslprotocol":
        case "sslProtocol": return target.getConfiguration().getSslProtocol();
        case "sslprovider":
        case "sslProvider": return target.getConfiguration().getSslProvider();
        case "sslsecurerandomimplementation":
        case "sslSecureRandomImplementation": return target.getConfiguration().getSslSecureRandomImplementation();
        case "ssltrustmanageralgorithm":
        case "sslTrustmanagerAlgorithm": return target.getConfiguration().getSslTrustmanagerAlgorithm();
        case "ssltruststorelocation":
        case "sslTruststoreLocation": return target.getConfiguration().getSslTruststoreLocation();
        case "ssltruststorepassword":
        case "sslTruststorePassword": return target.getConfiguration().getSslTruststorePassword();
        case "ssltruststoretype":
        case "sslTruststoreType": return target.getConfiguration().getSslTruststoreType();
        case "synchronous": return target.isSynchronous();
        case "transactiontimeoutms":
        case "transactionTimeoutMs": return target.getConfiguration().getTransactionTimeoutMs();
        case "transactionalid":
        case "transactionalId": return target.getConfiguration().getTransactionalId();
        case "valuedeserializer":
        case "valueDeserializer": return target.getConfiguration().getValueDeserializer();
        case "valueserializer":
        case "valueSerializer": return target.getConfiguration().getValueSerializer();
        default: return null;
        }
    }
}

