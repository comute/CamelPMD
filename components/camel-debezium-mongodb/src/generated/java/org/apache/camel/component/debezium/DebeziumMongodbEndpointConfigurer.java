/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.debezium;

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
public class DebeziumMongodbEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        DebeziumMongodbEndpoint target = (DebeziumMongodbEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": target.getConfiguration().setAdditionalProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "collectionblacklist":
        case "collectionBlacklist": target.getConfiguration().setCollectionBlacklist(property(camelContext, java.lang.String.class, value)); return true;
        case "collectionwhitelist":
        case "collectionWhitelist": target.getConfiguration().setCollectionWhitelist(property(camelContext, java.lang.String.class, value)); return true;
        case "connectbackoffinitialdelayms":
        case "connectBackoffInitialDelayMs": target.getConfiguration().setConnectBackoffInitialDelayMs(property(camelContext, long.class, value)); return true;
        case "connectbackoffmaxdelayms":
        case "connectBackoffMaxDelayMs": target.getConfiguration().setConnectBackoffMaxDelayMs(property(camelContext, long.class, value)); return true;
        case "connectmaxattempts":
        case "connectMaxAttempts": target.getConfiguration().setConnectMaxAttempts(property(camelContext, int.class, value)); return true;
        case "databaseblacklist":
        case "databaseBlacklist": target.getConfiguration().setDatabaseBlacklist(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistoryfilefilename":
        case "databaseHistoryFileFilename": target.getConfiguration().setDatabaseHistoryFileFilename(property(camelContext, java.lang.String.class, value)); return true;
        case "databasewhitelist":
        case "databaseWhitelist": target.getConfiguration().setDatabaseWhitelist(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "fieldblacklist":
        case "fieldBlacklist": target.getConfiguration().setFieldBlacklist(property(camelContext, java.lang.String.class, value)); return true;
        case "fieldrenames":
        case "fieldRenames": target.getConfiguration().setFieldRenames(property(camelContext, java.lang.String.class, value)); return true;
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": target.getConfiguration().setHeartbeatIntervalMs(property(camelContext, int.class, value)); return true;
        case "heartbeattopicsprefix":
        case "heartbeatTopicsPrefix": target.getConfiguration().setHeartbeatTopicsPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "initialsyncmaxthreads":
        case "initialSyncMaxThreads": target.getConfiguration().setInitialSyncMaxThreads(property(camelContext, int.class, value)); return true;
        case "internalkeyconverter":
        case "internalKeyConverter": target.getConfiguration().setInternalKeyConverter(property(camelContext, java.lang.String.class, value)); return true;
        case "internalvalueconverter":
        case "internalValueConverter": target.getConfiguration().setInternalValueConverter(property(camelContext, java.lang.String.class, value)); return true;
        case "maxbatchsize":
        case "maxBatchSize": target.getConfiguration().setMaxBatchSize(property(camelContext, int.class, value)); return true;
        case "maxqueuesize":
        case "maxQueueSize": target.getConfiguration().setMaxQueueSize(property(camelContext, int.class, value)); return true;
        case "mongodbhosts":
        case "mongodbHosts": target.getConfiguration().setMongodbHosts(property(camelContext, java.lang.String.class, value)); return true;
        case "mongodbmembersautodiscover":
        case "mongodbMembersAutoDiscover": target.getConfiguration().setMongodbMembersAutoDiscover(property(camelContext, boolean.class, value)); return true;
        case "mongodbname":
        case "mongodbName": target.getConfiguration().setMongodbName(property(camelContext, java.lang.String.class, value)); return true;
        case "mongodbpassword":
        case "mongodbPassword": target.getConfiguration().setMongodbPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "mongodbsslenabled":
        case "mongodbSslEnabled": target.getConfiguration().setMongodbSslEnabled(property(camelContext, boolean.class, value)); return true;
        case "mongodbsslinvalidhostnameallowed":
        case "mongodbSslInvalidHostnameAllowed": target.getConfiguration().setMongodbSslInvalidHostnameAllowed(property(camelContext, boolean.class, value)); return true;
        case "mongodbuser":
        case "mongodbUser": target.getConfiguration().setMongodbUser(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetcommitpolicy":
        case "offsetCommitPolicy": target.getConfiguration().setOffsetCommitPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetcommittimeoutms":
        case "offsetCommitTimeoutMs": target.getConfiguration().setOffsetCommitTimeoutMs(property(camelContext, long.class, value)); return true;
        case "offsetflushintervalms":
        case "offsetFlushIntervalMs": target.getConfiguration().setOffsetFlushIntervalMs(property(camelContext, long.class, value)); return true;
        case "offsetstorage":
        case "offsetStorage": target.getConfiguration().setOffsetStorage(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetstoragefilename":
        case "offsetStorageFileName": target.getConfiguration().setOffsetStorageFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetstoragepartitions":
        case "offsetStoragePartitions": target.getConfiguration().setOffsetStoragePartitions(property(camelContext, int.class, value)); return true;
        case "offsetstoragereplicationfactor":
        case "offsetStorageReplicationFactor": target.getConfiguration().setOffsetStorageReplicationFactor(property(camelContext, int.class, value)); return true;
        case "offsetstoragetopic":
        case "offsetStorageTopic": target.getConfiguration().setOffsetStorageTopic(property(camelContext, java.lang.String.class, value)); return true;
        case "pollintervalms":
        case "pollIntervalMs": target.getConfiguration().setPollIntervalMs(property(camelContext, long.class, value)); return true;
        case "snapshotdelayms":
        case "snapshotDelayMs": target.getConfiguration().setSnapshotDelayMs(property(camelContext, long.class, value)); return true;
        case "snapshotfetchsize":
        case "snapshotFetchSize": target.getConfiguration().setSnapshotFetchSize(property(camelContext, int.class, value)); return true;
        case "snapshotmode":
        case "snapshotMode": target.getConfiguration().setSnapshotMode(property(camelContext, java.lang.String.class, value)); return true;
        case "sourcestructversion":
        case "sourceStructVersion": target.getConfiguration().setSourceStructVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "tombstonesondelete":
        case "tombstonesOnDelete": target.getConfiguration().setTombstonesOnDelete(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("additionalProperties", java.util.Map.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("collectionBlacklist", java.lang.String.class);
        answer.put("collectionWhitelist", java.lang.String.class);
        answer.put("connectBackoffInitialDelayMs", long.class);
        answer.put("connectBackoffMaxDelayMs", long.class);
        answer.put("connectMaxAttempts", int.class);
        answer.put("databaseBlacklist", java.lang.String.class);
        answer.put("databaseHistoryFileFilename", java.lang.String.class);
        answer.put("databaseWhitelist", java.lang.String.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("fieldBlacklist", java.lang.String.class);
        answer.put("fieldRenames", java.lang.String.class);
        answer.put("heartbeatIntervalMs", int.class);
        answer.put("heartbeatTopicsPrefix", java.lang.String.class);
        answer.put("initialSyncMaxThreads", int.class);
        answer.put("internalKeyConverter", java.lang.String.class);
        answer.put("internalValueConverter", java.lang.String.class);
        answer.put("maxBatchSize", int.class);
        answer.put("maxQueueSize", int.class);
        answer.put("mongodbHosts", java.lang.String.class);
        answer.put("mongodbMembersAutoDiscover", boolean.class);
        answer.put("mongodbName", java.lang.String.class);
        answer.put("mongodbPassword", java.lang.String.class);
        answer.put("mongodbSslEnabled", boolean.class);
        answer.put("mongodbSslInvalidHostnameAllowed", boolean.class);
        answer.put("mongodbUser", java.lang.String.class);
        answer.put("offsetCommitPolicy", java.lang.String.class);
        answer.put("offsetCommitTimeoutMs", long.class);
        answer.put("offsetFlushIntervalMs", long.class);
        answer.put("offsetStorage", java.lang.String.class);
        answer.put("offsetStorageFileName", java.lang.String.class);
        answer.put("offsetStoragePartitions", int.class);
        answer.put("offsetStorageReplicationFactor", int.class);
        answer.put("offsetStorageTopic", java.lang.String.class);
        answer.put("pollIntervalMs", long.class);
        answer.put("snapshotDelayMs", long.class);
        answer.put("snapshotFetchSize", int.class);
        answer.put("snapshotMode", java.lang.String.class);
        answer.put("sourceStructVersion", java.lang.String.class);
        answer.put("synchronous", boolean.class);
        answer.put("tombstonesOnDelete", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        DebeziumMongodbEndpoint target = (DebeziumMongodbEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": target.getConfiguration().getAdditionalProperties(); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.isBasicPropertyBinding(); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.isBridgeErrorHandler(); return true;
        case "collectionblacklist":
        case "collectionBlacklist": target.getConfiguration().getCollectionBlacklist(); return true;
        case "collectionwhitelist":
        case "collectionWhitelist": target.getConfiguration().getCollectionWhitelist(); return true;
        case "connectbackoffinitialdelayms":
        case "connectBackoffInitialDelayMs": target.getConfiguration().getConnectBackoffInitialDelayMs(); return true;
        case "connectbackoffmaxdelayms":
        case "connectBackoffMaxDelayMs": target.getConfiguration().getConnectBackoffMaxDelayMs(); return true;
        case "connectmaxattempts":
        case "connectMaxAttempts": target.getConfiguration().getConnectMaxAttempts(); return true;
        case "databaseblacklist":
        case "databaseBlacklist": target.getConfiguration().getDatabaseBlacklist(); return true;
        case "databasehistoryfilefilename":
        case "databaseHistoryFileFilename": target.getConfiguration().getDatabaseHistoryFileFilename(); return true;
        case "databasewhitelist":
        case "databaseWhitelist": target.getConfiguration().getDatabaseWhitelist(); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.getExceptionHandler(); return true;
        case "exchangepattern":
        case "exchangePattern": target.getExchangePattern(); return true;
        case "fieldblacklist":
        case "fieldBlacklist": target.getConfiguration().getFieldBlacklist(); return true;
        case "fieldrenames":
        case "fieldRenames": target.getConfiguration().getFieldRenames(); return true;
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": target.getConfiguration().getHeartbeatIntervalMs(); return true;
        case "heartbeattopicsprefix":
        case "heartbeatTopicsPrefix": target.getConfiguration().getHeartbeatTopicsPrefix(); return true;
        case "initialsyncmaxthreads":
        case "initialSyncMaxThreads": target.getConfiguration().getInitialSyncMaxThreads(); return true;
        case "internalkeyconverter":
        case "internalKeyConverter": target.getConfiguration().getInternalKeyConverter(); return true;
        case "internalvalueconverter":
        case "internalValueConverter": target.getConfiguration().getInternalValueConverter(); return true;
        case "maxbatchsize":
        case "maxBatchSize": target.getConfiguration().getMaxBatchSize(); return true;
        case "maxqueuesize":
        case "maxQueueSize": target.getConfiguration().getMaxQueueSize(); return true;
        case "mongodbhosts":
        case "mongodbHosts": target.getConfiguration().getMongodbHosts(); return true;
        case "mongodbmembersautodiscover":
        case "mongodbMembersAutoDiscover": target.getConfiguration().isMongodbMembersAutoDiscover(); return true;
        case "mongodbname":
        case "mongodbName": target.getConfiguration().getMongodbName(); return true;
        case "mongodbpassword":
        case "mongodbPassword": target.getConfiguration().getMongodbPassword(); return true;
        case "mongodbsslenabled":
        case "mongodbSslEnabled": target.getConfiguration().isMongodbSslEnabled(); return true;
        case "mongodbsslinvalidhostnameallowed":
        case "mongodbSslInvalidHostnameAllowed": target.getConfiguration().isMongodbSslInvalidHostnameAllowed(); return true;
        case "mongodbuser":
        case "mongodbUser": target.getConfiguration().getMongodbUser(); return true;
        case "offsetcommitpolicy":
        case "offsetCommitPolicy": target.getConfiguration().getOffsetCommitPolicy(); return true;
        case "offsetcommittimeoutms":
        case "offsetCommitTimeoutMs": target.getConfiguration().getOffsetCommitTimeoutMs(); return true;
        case "offsetflushintervalms":
        case "offsetFlushIntervalMs": target.getConfiguration().getOffsetFlushIntervalMs(); return true;
        case "offsetstorage":
        case "offsetStorage": target.getConfiguration().getOffsetStorage(); return true;
        case "offsetstoragefilename":
        case "offsetStorageFileName": target.getConfiguration().getOffsetStorageFileName(); return true;
        case "offsetstoragepartitions":
        case "offsetStoragePartitions": target.getConfiguration().getOffsetStoragePartitions(); return true;
        case "offsetstoragereplicationfactor":
        case "offsetStorageReplicationFactor": target.getConfiguration().getOffsetStorageReplicationFactor(); return true;
        case "offsetstoragetopic":
        case "offsetStorageTopic": target.getConfiguration().getOffsetStorageTopic(); return true;
        case "pollintervalms":
        case "pollIntervalMs": target.getConfiguration().getPollIntervalMs(); return true;
        case "snapshotdelayms":
        case "snapshotDelayMs": target.getConfiguration().getSnapshotDelayMs(); return true;
        case "snapshotfetchsize":
        case "snapshotFetchSize": target.getConfiguration().getSnapshotFetchSize(); return true;
        case "snapshotmode":
        case "snapshotMode": target.getConfiguration().getSnapshotMode(); return true;
        case "sourcestructversion":
        case "sourceStructVersion": target.getConfiguration().getSourceStructVersion(); return true;
        case "synchronous": target.isSynchronous(); return true;
        case "tombstonesondelete":
        case "tombstonesOnDelete": target.getConfiguration().isTombstonesOnDelete(); return true;
        default: return null;
        }
    }
}

