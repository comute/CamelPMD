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
public class DebeziumSqlserverEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        DebeziumSqlserverEndpoint target = (DebeziumSqlserverEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": target.getConfiguration().setAdditionalProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "columnblacklist":
        case "columnBlacklist": target.getConfiguration().setColumnBlacklist(property(camelContext, java.lang.String.class, value)); return true;
        case "databasedbname":
        case "databaseDbname": target.getConfiguration().setDatabaseDbname(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistory":
        case "databaseHistory": target.getConfiguration().setDatabaseHistory(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistoryfilefilename":
        case "databaseHistoryFileFilename": target.getConfiguration().setDatabaseHistoryFileFilename(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistorykafkabootstrapservers":
        case "databaseHistoryKafkaBootstrapServers": target.getConfiguration().setDatabaseHistoryKafkaBootstrapServers(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistorykafkarecoveryattempts":
        case "databaseHistoryKafkaRecoveryAttempts": target.getConfiguration().setDatabaseHistoryKafkaRecoveryAttempts(property(camelContext, int.class, value)); return true;
        case "databasehistorykafkarecoverypollintervalms":
        case "databaseHistoryKafkaRecoveryPollIntervalMs": target.getConfiguration().setDatabaseHistoryKafkaRecoveryPollIntervalMs(property(camelContext, int.class, value)); return true;
        case "databasehistorykafkatopic":
        case "databaseHistoryKafkaTopic": target.getConfiguration().setDatabaseHistoryKafkaTopic(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehostname":
        case "databaseHostname": target.getConfiguration().setDatabaseHostname(property(camelContext, java.lang.String.class, value)); return true;
        case "databasepassword":
        case "databasePassword": target.getConfiguration().setDatabasePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseport":
        case "databasePort": target.getConfiguration().setDatabasePort(property(camelContext, int.class, value)); return true;
        case "databaseservername":
        case "databaseServerName": target.getConfiguration().setDatabaseServerName(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseservertimezone":
        case "databaseServerTimezone": target.getConfiguration().setDatabaseServerTimezone(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseuser":
        case "databaseUser": target.getConfiguration().setDatabaseUser(property(camelContext, java.lang.String.class, value)); return true;
        case "decimalhandlingmode":
        case "decimalHandlingMode": target.getConfiguration().setDecimalHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "eventprocessingfailurehandlingmode":
        case "eventProcessingFailureHandlingMode": target.getConfiguration().setEventProcessingFailureHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": target.getConfiguration().setHeartbeatIntervalMs(property(camelContext, int.class, value)); return true;
        case "heartbeattopicsprefix":
        case "heartbeatTopicsPrefix": target.getConfiguration().setHeartbeatTopicsPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "internalkeyconverter":
        case "internalKeyConverter": target.getConfiguration().setInternalKeyConverter(property(camelContext, java.lang.String.class, value)); return true;
        case "internalvalueconverter":
        case "internalValueConverter": target.getConfiguration().setInternalValueConverter(property(camelContext, java.lang.String.class, value)); return true;
        case "maxbatchsize":
        case "maxBatchSize": target.getConfiguration().setMaxBatchSize(property(camelContext, int.class, value)); return true;
        case "maxqueuesize":
        case "maxQueueSize": target.getConfiguration().setMaxQueueSize(property(camelContext, int.class, value)); return true;
        case "messagekeycolumns":
        case "messageKeyColumns": target.getConfiguration().setMessageKeyColumns(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetcommitpolicy":
        case "offsetCommitPolicy": target.getConfiguration().setOffsetCommitPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetcommittimeoutms":
        case "offsetCommitTimeoutMs": target.getConfiguration().setOffsetCommitTimeoutMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "offsetflushintervalms":
        case "offsetFlushIntervalMs": target.getConfiguration().setOffsetFlushIntervalMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
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
        case "providetransactionmetadata":
        case "provideTransactionMetadata": target.getConfiguration().setProvideTransactionMetadata(property(camelContext, boolean.class, value)); return true;
        case "snapshotdelayms":
        case "snapshotDelayMs": target.getConfiguration().setSnapshotDelayMs(property(camelContext, long.class, value)); return true;
        case "snapshotfetchsize":
        case "snapshotFetchSize": target.getConfiguration().setSnapshotFetchSize(property(camelContext, int.class, value)); return true;
        case "snapshotlocktimeoutms":
        case "snapshotLockTimeoutMs": target.getConfiguration().setSnapshotLockTimeoutMs(property(camelContext, long.class, value)); return true;
        case "snapshotmode":
        case "snapshotMode": target.getConfiguration().setSnapshotMode(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotselectstatementoverrides":
        case "snapshotSelectStatementOverrides": target.getConfiguration().setSnapshotSelectStatementOverrides(property(camelContext, java.lang.String.class, value)); return true;
        case "sourcestructversion":
        case "sourceStructVersion": target.getConfiguration().setSourceStructVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "tableblacklist":
        case "tableBlacklist": target.getConfiguration().setTableBlacklist(property(camelContext, java.lang.String.class, value)); return true;
        case "tableignorebuiltin":
        case "tableIgnoreBuiltin": target.getConfiguration().setTableIgnoreBuiltin(property(camelContext, boolean.class, value)); return true;
        case "tablewhitelist":
        case "tableWhitelist": target.getConfiguration().setTableWhitelist(property(camelContext, java.lang.String.class, value)); return true;
        case "timeprecisionmode":
        case "timePrecisionMode": target.getConfiguration().setTimePrecisionMode(property(camelContext, java.lang.String.class, value)); return true;
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
        answer.put("columnBlacklist", java.lang.String.class);
        answer.put("databaseDbname", java.lang.String.class);
        answer.put("databaseHistory", java.lang.String.class);
        answer.put("databaseHistoryFileFilename", java.lang.String.class);
        answer.put("databaseHistoryKafkaBootstrapServers", java.lang.String.class);
        answer.put("databaseHistoryKafkaRecoveryAttempts", int.class);
        answer.put("databaseHistoryKafkaRecoveryPollIntervalMs", int.class);
        answer.put("databaseHistoryKafkaTopic", java.lang.String.class);
        answer.put("databaseHostname", java.lang.String.class);
        answer.put("databasePassword", java.lang.String.class);
        answer.put("databasePort", int.class);
        answer.put("databaseServerName", java.lang.String.class);
        answer.put("databaseServerTimezone", java.lang.String.class);
        answer.put("databaseUser", java.lang.String.class);
        answer.put("decimalHandlingMode", java.lang.String.class);
        answer.put("eventProcessingFailureHandlingMode", java.lang.String.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("heartbeatIntervalMs", int.class);
        answer.put("heartbeatTopicsPrefix", java.lang.String.class);
        answer.put("internalKeyConverter", java.lang.String.class);
        answer.put("internalValueConverter", java.lang.String.class);
        answer.put("maxBatchSize", int.class);
        answer.put("maxQueueSize", int.class);
        answer.put("messageKeyColumns", java.lang.String.class);
        answer.put("offsetCommitPolicy", java.lang.String.class);
        answer.put("offsetCommitTimeoutMs", long.class);
        answer.put("offsetFlushIntervalMs", long.class);
        answer.put("offsetStorage", java.lang.String.class);
        answer.put("offsetStorageFileName", java.lang.String.class);
        answer.put("offsetStoragePartitions", int.class);
        answer.put("offsetStorageReplicationFactor", int.class);
        answer.put("offsetStorageTopic", java.lang.String.class);
        answer.put("pollIntervalMs", long.class);
        answer.put("provideTransactionMetadata", boolean.class);
        answer.put("snapshotDelayMs", long.class);
        answer.put("snapshotFetchSize", int.class);
        answer.put("snapshotLockTimeoutMs", long.class);
        answer.put("snapshotMode", java.lang.String.class);
        answer.put("snapshotSelectStatementOverrides", java.lang.String.class);
        answer.put("sourceStructVersion", java.lang.String.class);
        answer.put("synchronous", boolean.class);
        answer.put("tableBlacklist", java.lang.String.class);
        answer.put("tableIgnoreBuiltin", boolean.class);
        answer.put("tableWhitelist", java.lang.String.class);
        answer.put("timePrecisionMode", java.lang.String.class);
        answer.put("tombstonesOnDelete", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        DebeziumSqlserverEndpoint target = (DebeziumSqlserverEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": return target.getConfiguration().getAdditionalProperties();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "columnblacklist":
        case "columnBlacklist": return target.getConfiguration().getColumnBlacklist();
        case "databasedbname":
        case "databaseDbname": return target.getConfiguration().getDatabaseDbname();
        case "databasehistory":
        case "databaseHistory": return target.getConfiguration().getDatabaseHistory();
        case "databasehistoryfilefilename":
        case "databaseHistoryFileFilename": return target.getConfiguration().getDatabaseHistoryFileFilename();
        case "databasehistorykafkabootstrapservers":
        case "databaseHistoryKafkaBootstrapServers": return target.getConfiguration().getDatabaseHistoryKafkaBootstrapServers();
        case "databasehistorykafkarecoveryattempts":
        case "databaseHistoryKafkaRecoveryAttempts": return target.getConfiguration().getDatabaseHistoryKafkaRecoveryAttempts();
        case "databasehistorykafkarecoverypollintervalms":
        case "databaseHistoryKafkaRecoveryPollIntervalMs": return target.getConfiguration().getDatabaseHistoryKafkaRecoveryPollIntervalMs();
        case "databasehistorykafkatopic":
        case "databaseHistoryKafkaTopic": return target.getConfiguration().getDatabaseHistoryKafkaTopic();
        case "databasehostname":
        case "databaseHostname": return target.getConfiguration().getDatabaseHostname();
        case "databasepassword":
        case "databasePassword": return target.getConfiguration().getDatabasePassword();
        case "databaseport":
        case "databasePort": return target.getConfiguration().getDatabasePort();
        case "databaseservername":
        case "databaseServerName": return target.getConfiguration().getDatabaseServerName();
        case "databaseservertimezone":
        case "databaseServerTimezone": return target.getConfiguration().getDatabaseServerTimezone();
        case "databaseuser":
        case "databaseUser": return target.getConfiguration().getDatabaseUser();
        case "decimalhandlingmode":
        case "decimalHandlingMode": return target.getConfiguration().getDecimalHandlingMode();
        case "eventprocessingfailurehandlingmode":
        case "eventProcessingFailureHandlingMode": return target.getConfiguration().getEventProcessingFailureHandlingMode();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": return target.getConfiguration().getHeartbeatIntervalMs();
        case "heartbeattopicsprefix":
        case "heartbeatTopicsPrefix": return target.getConfiguration().getHeartbeatTopicsPrefix();
        case "internalkeyconverter":
        case "internalKeyConverter": return target.getConfiguration().getInternalKeyConverter();
        case "internalvalueconverter":
        case "internalValueConverter": return target.getConfiguration().getInternalValueConverter();
        case "maxbatchsize":
        case "maxBatchSize": return target.getConfiguration().getMaxBatchSize();
        case "maxqueuesize":
        case "maxQueueSize": return target.getConfiguration().getMaxQueueSize();
        case "messagekeycolumns":
        case "messageKeyColumns": return target.getConfiguration().getMessageKeyColumns();
        case "offsetcommitpolicy":
        case "offsetCommitPolicy": return target.getConfiguration().getOffsetCommitPolicy();
        case "offsetcommittimeoutms":
        case "offsetCommitTimeoutMs": return target.getConfiguration().getOffsetCommitTimeoutMs();
        case "offsetflushintervalms":
        case "offsetFlushIntervalMs": return target.getConfiguration().getOffsetFlushIntervalMs();
        case "offsetstorage":
        case "offsetStorage": return target.getConfiguration().getOffsetStorage();
        case "offsetstoragefilename":
        case "offsetStorageFileName": return target.getConfiguration().getOffsetStorageFileName();
        case "offsetstoragepartitions":
        case "offsetStoragePartitions": return target.getConfiguration().getOffsetStoragePartitions();
        case "offsetstoragereplicationfactor":
        case "offsetStorageReplicationFactor": return target.getConfiguration().getOffsetStorageReplicationFactor();
        case "offsetstoragetopic":
        case "offsetStorageTopic": return target.getConfiguration().getOffsetStorageTopic();
        case "pollintervalms":
        case "pollIntervalMs": return target.getConfiguration().getPollIntervalMs();
        case "providetransactionmetadata":
        case "provideTransactionMetadata": return target.getConfiguration().isProvideTransactionMetadata();
        case "snapshotdelayms":
        case "snapshotDelayMs": return target.getConfiguration().getSnapshotDelayMs();
        case "snapshotfetchsize":
        case "snapshotFetchSize": return target.getConfiguration().getSnapshotFetchSize();
        case "snapshotlocktimeoutms":
        case "snapshotLockTimeoutMs": return target.getConfiguration().getSnapshotLockTimeoutMs();
        case "snapshotmode":
        case "snapshotMode": return target.getConfiguration().getSnapshotMode();
        case "snapshotselectstatementoverrides":
        case "snapshotSelectStatementOverrides": return target.getConfiguration().getSnapshotSelectStatementOverrides();
        case "sourcestructversion":
        case "sourceStructVersion": return target.getConfiguration().getSourceStructVersion();
        case "synchronous": return target.isSynchronous();
        case "tableblacklist":
        case "tableBlacklist": return target.getConfiguration().getTableBlacklist();
        case "tableignorebuiltin":
        case "tableIgnoreBuiltin": return target.getConfiguration().isTableIgnoreBuiltin();
        case "tablewhitelist":
        case "tableWhitelist": return target.getConfiguration().getTableWhitelist();
        case "timeprecisionmode":
        case "timePrecisionMode": return target.getConfiguration().getTimePrecisionMode();
        case "tombstonesondelete":
        case "tombstonesOnDelete": return target.getConfiguration().isTombstonesOnDelete();
        default: return null;
        }
    }
}

