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
public class DebeziumPostgresComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.debezium.configuration.PostgresConnectorEmbeddedDebeziumConfiguration getOrCreateConfiguration(DebeziumPostgresComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.debezium.configuration.PostgresConnectorEmbeddedDebeziumConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        DebeziumPostgresComponent target = (DebeziumPostgresComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": getOrCreateConfiguration(target).setAdditionalProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "columnblacklist":
        case "columnBlacklist": getOrCreateConfiguration(target).setColumnBlacklist(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.debezium.configuration.PostgresConnectorEmbeddedDebeziumConfiguration.class, value)); return true;
        case "databasedbname":
        case "databaseDbname": getOrCreateConfiguration(target).setDatabaseDbname(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistoryfilefilename":
        case "databaseHistoryFileFilename": getOrCreateConfiguration(target).setDatabaseHistoryFileFilename(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehostname":
        case "databaseHostname": getOrCreateConfiguration(target).setDatabaseHostname(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseinitialstatements":
        case "databaseInitialStatements": getOrCreateConfiguration(target).setDatabaseInitialStatements(property(camelContext, java.lang.String.class, value)); return true;
        case "databasepassword":
        case "databasePassword": getOrCreateConfiguration(target).setDatabasePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseport":
        case "databasePort": getOrCreateConfiguration(target).setDatabasePort(property(camelContext, int.class, value)); return true;
        case "databaseservername":
        case "databaseServerName": getOrCreateConfiguration(target).setDatabaseServerName(property(camelContext, java.lang.String.class, value)); return true;
        case "databasesslcert":
        case "databaseSslcert": getOrCreateConfiguration(target).setDatabaseSslcert(property(camelContext, java.lang.String.class, value)); return true;
        case "databasesslfactory":
        case "databaseSslfactory": getOrCreateConfiguration(target).setDatabaseSslfactory(property(camelContext, java.lang.String.class, value)); return true;
        case "databasesslkey":
        case "databaseSslkey": getOrCreateConfiguration(target).setDatabaseSslkey(property(camelContext, java.lang.String.class, value)); return true;
        case "databasesslmode":
        case "databaseSslmode": getOrCreateConfiguration(target).setDatabaseSslmode(property(camelContext, java.lang.String.class, value)); return true;
        case "databasesslpassword":
        case "databaseSslpassword": getOrCreateConfiguration(target).setDatabaseSslpassword(property(camelContext, java.lang.String.class, value)); return true;
        case "databasesslrootcert":
        case "databaseSslrootcert": getOrCreateConfiguration(target).setDatabaseSslrootcert(property(camelContext, java.lang.String.class, value)); return true;
        case "databasetcpkeepalive":
        case "databaseTcpkeepalive": getOrCreateConfiguration(target).setDatabaseTcpkeepalive(property(camelContext, boolean.class, value)); return true;
        case "databaseuser":
        case "databaseUser": getOrCreateConfiguration(target).setDatabaseUser(property(camelContext, java.lang.String.class, value)); return true;
        case "decimalhandlingmode":
        case "decimalHandlingMode": getOrCreateConfiguration(target).setDecimalHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": getOrCreateConfiguration(target).setHeartbeatIntervalMs(property(camelContext, int.class, value)); return true;
        case "heartbeattopicsprefix":
        case "heartbeatTopicsPrefix": getOrCreateConfiguration(target).setHeartbeatTopicsPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "hstorehandlingmode":
        case "hstoreHandlingMode": getOrCreateConfiguration(target).setHstoreHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "includeunknowndatatypes":
        case "includeUnknownDatatypes": getOrCreateConfiguration(target).setIncludeUnknownDatatypes(property(camelContext, boolean.class, value)); return true;
        case "internalkeyconverter":
        case "internalKeyConverter": getOrCreateConfiguration(target).setInternalKeyConverter(property(camelContext, java.lang.String.class, value)); return true;
        case "internalvalueconverter":
        case "internalValueConverter": getOrCreateConfiguration(target).setInternalValueConverter(property(camelContext, java.lang.String.class, value)); return true;
        case "intervalhandlingmode":
        case "intervalHandlingMode": getOrCreateConfiguration(target).setIntervalHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "maxbatchsize":
        case "maxBatchSize": getOrCreateConfiguration(target).setMaxBatchSize(property(camelContext, int.class, value)); return true;
        case "maxqueuesize":
        case "maxQueueSize": getOrCreateConfiguration(target).setMaxQueueSize(property(camelContext, int.class, value)); return true;
        case "messagekeycolumns":
        case "messageKeyColumns": getOrCreateConfiguration(target).setMessageKeyColumns(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetcommitpolicy":
        case "offsetCommitPolicy": getOrCreateConfiguration(target).setOffsetCommitPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetcommittimeoutms":
        case "offsetCommitTimeoutMs": getOrCreateConfiguration(target).setOffsetCommitTimeoutMs(property(camelContext, long.class, value)); return true;
        case "offsetflushintervalms":
        case "offsetFlushIntervalMs": getOrCreateConfiguration(target).setOffsetFlushIntervalMs(property(camelContext, long.class, value)); return true;
        case "offsetstorage":
        case "offsetStorage": getOrCreateConfiguration(target).setOffsetStorage(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetstoragefilename":
        case "offsetStorageFileName": getOrCreateConfiguration(target).setOffsetStorageFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetstoragepartitions":
        case "offsetStoragePartitions": getOrCreateConfiguration(target).setOffsetStoragePartitions(property(camelContext, int.class, value)); return true;
        case "offsetstoragereplicationfactor":
        case "offsetStorageReplicationFactor": getOrCreateConfiguration(target).setOffsetStorageReplicationFactor(property(camelContext, int.class, value)); return true;
        case "offsetstoragetopic":
        case "offsetStorageTopic": getOrCreateConfiguration(target).setOffsetStorageTopic(property(camelContext, java.lang.String.class, value)); return true;
        case "pluginname":
        case "pluginName": getOrCreateConfiguration(target).setPluginName(property(camelContext, java.lang.String.class, value)); return true;
        case "pollintervalms":
        case "pollIntervalMs": getOrCreateConfiguration(target).setPollIntervalMs(property(camelContext, long.class, value)); return true;
        case "publicationname":
        case "publicationName": getOrCreateConfiguration(target).setPublicationName(property(camelContext, java.lang.String.class, value)); return true;
        case "schemablacklist":
        case "schemaBlacklist": getOrCreateConfiguration(target).setSchemaBlacklist(property(camelContext, java.lang.String.class, value)); return true;
        case "schemarefreshmode":
        case "schemaRefreshMode": getOrCreateConfiguration(target).setSchemaRefreshMode(property(camelContext, java.lang.String.class, value)); return true;
        case "schemawhitelist":
        case "schemaWhitelist": getOrCreateConfiguration(target).setSchemaWhitelist(property(camelContext, java.lang.String.class, value)); return true;
        case "slotdroponstop":
        case "slotDropOnStop": getOrCreateConfiguration(target).setSlotDropOnStop(property(camelContext, boolean.class, value)); return true;
        case "slotmaxretries":
        case "slotMaxRetries": getOrCreateConfiguration(target).setSlotMaxRetries(property(camelContext, int.class, value)); return true;
        case "slotname":
        case "slotName": getOrCreateConfiguration(target).setSlotName(property(camelContext, java.lang.String.class, value)); return true;
        case "slotretrydelayms":
        case "slotRetryDelayMs": getOrCreateConfiguration(target).setSlotRetryDelayMs(property(camelContext, long.class, value)); return true;
        case "slotstreamparams":
        case "slotStreamParams": getOrCreateConfiguration(target).setSlotStreamParams(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotcustomclass":
        case "snapshotCustomClass": getOrCreateConfiguration(target).setSnapshotCustomClass(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotdelayms":
        case "snapshotDelayMs": getOrCreateConfiguration(target).setSnapshotDelayMs(property(camelContext, long.class, value)); return true;
        case "snapshotfetchsize":
        case "snapshotFetchSize": getOrCreateConfiguration(target).setSnapshotFetchSize(property(camelContext, int.class, value)); return true;
        case "snapshotlocktimeoutms":
        case "snapshotLockTimeoutMs": getOrCreateConfiguration(target).setSnapshotLockTimeoutMs(property(camelContext, long.class, value)); return true;
        case "snapshotmode":
        case "snapshotMode": getOrCreateConfiguration(target).setSnapshotMode(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotselectstatementoverrides":
        case "snapshotSelectStatementOverrides": getOrCreateConfiguration(target).setSnapshotSelectStatementOverrides(property(camelContext, java.lang.String.class, value)); return true;
        case "sourcestructversion":
        case "sourceStructVersion": getOrCreateConfiguration(target).setSourceStructVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "statusupdateintervalms":
        case "statusUpdateIntervalMs": getOrCreateConfiguration(target).setStatusUpdateIntervalMs(property(camelContext, int.class, value)); return true;
        case "tableblacklist":
        case "tableBlacklist": getOrCreateConfiguration(target).setTableBlacklist(property(camelContext, java.lang.String.class, value)); return true;
        case "tablewhitelist":
        case "tableWhitelist": getOrCreateConfiguration(target).setTableWhitelist(property(camelContext, java.lang.String.class, value)); return true;
        case "timeprecisionmode":
        case "timePrecisionMode": getOrCreateConfiguration(target).setTimePrecisionMode(property(camelContext, java.lang.String.class, value)); return true;
        case "toastedvalueplaceholder":
        case "toastedValuePlaceholder": getOrCreateConfiguration(target).setToastedValuePlaceholder(property(camelContext, java.lang.String.class, value)); return true;
        case "tombstonesondelete":
        case "tombstonesOnDelete": getOrCreateConfiguration(target).setTombstonesOnDelete(property(camelContext, boolean.class, value)); return true;
        case "xminfetchintervalms":
        case "xminFetchIntervalMs": getOrCreateConfiguration(target).setXminFetchIntervalMs(property(camelContext, long.class, value)); return true;
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
        answer.put("configuration", org.apache.camel.component.debezium.configuration.PostgresConnectorEmbeddedDebeziumConfiguration.class);
        answer.put("databaseDbname", java.lang.String.class);
        answer.put("databaseHistoryFileFilename", java.lang.String.class);
        answer.put("databaseHostname", java.lang.String.class);
        answer.put("databaseInitialStatements", java.lang.String.class);
        answer.put("databasePassword", java.lang.String.class);
        answer.put("databasePort", int.class);
        answer.put("databaseServerName", java.lang.String.class);
        answer.put("databaseSslcert", java.lang.String.class);
        answer.put("databaseSslfactory", java.lang.String.class);
        answer.put("databaseSslkey", java.lang.String.class);
        answer.put("databaseSslmode", java.lang.String.class);
        answer.put("databaseSslpassword", java.lang.String.class);
        answer.put("databaseSslrootcert", java.lang.String.class);
        answer.put("databaseTcpkeepalive", boolean.class);
        answer.put("databaseUser", java.lang.String.class);
        answer.put("decimalHandlingMode", java.lang.String.class);
        answer.put("heartbeatIntervalMs", int.class);
        answer.put("heartbeatTopicsPrefix", java.lang.String.class);
        answer.put("hstoreHandlingMode", java.lang.String.class);
        answer.put("includeUnknownDatatypes", boolean.class);
        answer.put("internalKeyConverter", java.lang.String.class);
        answer.put("internalValueConverter", java.lang.String.class);
        answer.put("intervalHandlingMode", java.lang.String.class);
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
        answer.put("pluginName", java.lang.String.class);
        answer.put("pollIntervalMs", long.class);
        answer.put("publicationName", java.lang.String.class);
        answer.put("schemaBlacklist", java.lang.String.class);
        answer.put("schemaRefreshMode", java.lang.String.class);
        answer.put("schemaWhitelist", java.lang.String.class);
        answer.put("slotDropOnStop", boolean.class);
        answer.put("slotMaxRetries", int.class);
        answer.put("slotName", java.lang.String.class);
        answer.put("slotRetryDelayMs", long.class);
        answer.put("slotStreamParams", java.lang.String.class);
        answer.put("snapshotCustomClass", java.lang.String.class);
        answer.put("snapshotDelayMs", long.class);
        answer.put("snapshotFetchSize", int.class);
        answer.put("snapshotLockTimeoutMs", long.class);
        answer.put("snapshotMode", java.lang.String.class);
        answer.put("snapshotSelectStatementOverrides", java.lang.String.class);
        answer.put("sourceStructVersion", java.lang.String.class);
        answer.put("statusUpdateIntervalMs", int.class);
        answer.put("tableBlacklist", java.lang.String.class);
        answer.put("tableWhitelist", java.lang.String.class);
        answer.put("timePrecisionMode", java.lang.String.class);
        answer.put("toastedValuePlaceholder", java.lang.String.class);
        answer.put("tombstonesOnDelete", boolean.class);
        answer.put("xminFetchIntervalMs", long.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        DebeziumPostgresComponent target = (DebeziumPostgresComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": getOrCreateConfiguration(target).getAdditionalProperties(); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.isBasicPropertyBinding(); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.isBridgeErrorHandler(); return true;
        case "columnblacklist":
        case "columnBlacklist": getOrCreateConfiguration(target).getColumnBlacklist(); return true;
        case "configuration": target.getConfiguration(); return true;
        case "databasedbname":
        case "databaseDbname": getOrCreateConfiguration(target).getDatabaseDbname(); return true;
        case "databasehistoryfilefilename":
        case "databaseHistoryFileFilename": getOrCreateConfiguration(target).getDatabaseHistoryFileFilename(); return true;
        case "databasehostname":
        case "databaseHostname": getOrCreateConfiguration(target).getDatabaseHostname(); return true;
        case "databaseinitialstatements":
        case "databaseInitialStatements": getOrCreateConfiguration(target).getDatabaseInitialStatements(); return true;
        case "databasepassword":
        case "databasePassword": getOrCreateConfiguration(target).getDatabasePassword(); return true;
        case "databaseport":
        case "databasePort": getOrCreateConfiguration(target).getDatabasePort(); return true;
        case "databaseservername":
        case "databaseServerName": getOrCreateConfiguration(target).getDatabaseServerName(); return true;
        case "databasesslcert":
        case "databaseSslcert": getOrCreateConfiguration(target).getDatabaseSslcert(); return true;
        case "databasesslfactory":
        case "databaseSslfactory": getOrCreateConfiguration(target).getDatabaseSslfactory(); return true;
        case "databasesslkey":
        case "databaseSslkey": getOrCreateConfiguration(target).getDatabaseSslkey(); return true;
        case "databasesslmode":
        case "databaseSslmode": getOrCreateConfiguration(target).getDatabaseSslmode(); return true;
        case "databasesslpassword":
        case "databaseSslpassword": getOrCreateConfiguration(target).getDatabaseSslpassword(); return true;
        case "databasesslrootcert":
        case "databaseSslrootcert": getOrCreateConfiguration(target).getDatabaseSslrootcert(); return true;
        case "databasetcpkeepalive":
        case "databaseTcpkeepalive": getOrCreateConfiguration(target).isDatabaseTcpkeepalive(); return true;
        case "databaseuser":
        case "databaseUser": getOrCreateConfiguration(target).getDatabaseUser(); return true;
        case "decimalhandlingmode":
        case "decimalHandlingMode": getOrCreateConfiguration(target).getDecimalHandlingMode(); return true;
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": getOrCreateConfiguration(target).getHeartbeatIntervalMs(); return true;
        case "heartbeattopicsprefix":
        case "heartbeatTopicsPrefix": getOrCreateConfiguration(target).getHeartbeatTopicsPrefix(); return true;
        case "hstorehandlingmode":
        case "hstoreHandlingMode": getOrCreateConfiguration(target).getHstoreHandlingMode(); return true;
        case "includeunknowndatatypes":
        case "includeUnknownDatatypes": getOrCreateConfiguration(target).isIncludeUnknownDatatypes(); return true;
        case "internalkeyconverter":
        case "internalKeyConverter": getOrCreateConfiguration(target).getInternalKeyConverter(); return true;
        case "internalvalueconverter":
        case "internalValueConverter": getOrCreateConfiguration(target).getInternalValueConverter(); return true;
        case "intervalhandlingmode":
        case "intervalHandlingMode": getOrCreateConfiguration(target).getIntervalHandlingMode(); return true;
        case "maxbatchsize":
        case "maxBatchSize": getOrCreateConfiguration(target).getMaxBatchSize(); return true;
        case "maxqueuesize":
        case "maxQueueSize": getOrCreateConfiguration(target).getMaxQueueSize(); return true;
        case "messagekeycolumns":
        case "messageKeyColumns": getOrCreateConfiguration(target).getMessageKeyColumns(); return true;
        case "offsetcommitpolicy":
        case "offsetCommitPolicy": getOrCreateConfiguration(target).getOffsetCommitPolicy(); return true;
        case "offsetcommittimeoutms":
        case "offsetCommitTimeoutMs": getOrCreateConfiguration(target).getOffsetCommitTimeoutMs(); return true;
        case "offsetflushintervalms":
        case "offsetFlushIntervalMs": getOrCreateConfiguration(target).getOffsetFlushIntervalMs(); return true;
        case "offsetstorage":
        case "offsetStorage": getOrCreateConfiguration(target).getOffsetStorage(); return true;
        case "offsetstoragefilename":
        case "offsetStorageFileName": getOrCreateConfiguration(target).getOffsetStorageFileName(); return true;
        case "offsetstoragepartitions":
        case "offsetStoragePartitions": getOrCreateConfiguration(target).getOffsetStoragePartitions(); return true;
        case "offsetstoragereplicationfactor":
        case "offsetStorageReplicationFactor": getOrCreateConfiguration(target).getOffsetStorageReplicationFactor(); return true;
        case "offsetstoragetopic":
        case "offsetStorageTopic": getOrCreateConfiguration(target).getOffsetStorageTopic(); return true;
        case "pluginname":
        case "pluginName": getOrCreateConfiguration(target).getPluginName(); return true;
        case "pollintervalms":
        case "pollIntervalMs": getOrCreateConfiguration(target).getPollIntervalMs(); return true;
        case "publicationname":
        case "publicationName": getOrCreateConfiguration(target).getPublicationName(); return true;
        case "schemablacklist":
        case "schemaBlacklist": getOrCreateConfiguration(target).getSchemaBlacklist(); return true;
        case "schemarefreshmode":
        case "schemaRefreshMode": getOrCreateConfiguration(target).getSchemaRefreshMode(); return true;
        case "schemawhitelist":
        case "schemaWhitelist": getOrCreateConfiguration(target).getSchemaWhitelist(); return true;
        case "slotdroponstop":
        case "slotDropOnStop": getOrCreateConfiguration(target).isSlotDropOnStop(); return true;
        case "slotmaxretries":
        case "slotMaxRetries": getOrCreateConfiguration(target).getSlotMaxRetries(); return true;
        case "slotname":
        case "slotName": getOrCreateConfiguration(target).getSlotName(); return true;
        case "slotretrydelayms":
        case "slotRetryDelayMs": getOrCreateConfiguration(target).getSlotRetryDelayMs(); return true;
        case "slotstreamparams":
        case "slotStreamParams": getOrCreateConfiguration(target).getSlotStreamParams(); return true;
        case "snapshotcustomclass":
        case "snapshotCustomClass": getOrCreateConfiguration(target).getSnapshotCustomClass(); return true;
        case "snapshotdelayms":
        case "snapshotDelayMs": getOrCreateConfiguration(target).getSnapshotDelayMs(); return true;
        case "snapshotfetchsize":
        case "snapshotFetchSize": getOrCreateConfiguration(target).getSnapshotFetchSize(); return true;
        case "snapshotlocktimeoutms":
        case "snapshotLockTimeoutMs": getOrCreateConfiguration(target).getSnapshotLockTimeoutMs(); return true;
        case "snapshotmode":
        case "snapshotMode": getOrCreateConfiguration(target).getSnapshotMode(); return true;
        case "snapshotselectstatementoverrides":
        case "snapshotSelectStatementOverrides": getOrCreateConfiguration(target).getSnapshotSelectStatementOverrides(); return true;
        case "sourcestructversion":
        case "sourceStructVersion": getOrCreateConfiguration(target).getSourceStructVersion(); return true;
        case "statusupdateintervalms":
        case "statusUpdateIntervalMs": getOrCreateConfiguration(target).getStatusUpdateIntervalMs(); return true;
        case "tableblacklist":
        case "tableBlacklist": getOrCreateConfiguration(target).getTableBlacklist(); return true;
        case "tablewhitelist":
        case "tableWhitelist": getOrCreateConfiguration(target).getTableWhitelist(); return true;
        case "timeprecisionmode":
        case "timePrecisionMode": getOrCreateConfiguration(target).getTimePrecisionMode(); return true;
        case "toastedvalueplaceholder":
        case "toastedValuePlaceholder": getOrCreateConfiguration(target).getToastedValuePlaceholder(); return true;
        case "tombstonesondelete":
        case "tombstonesOnDelete": getOrCreateConfiguration(target).isTombstonesOnDelete(); return true;
        case "xminfetchintervalms":
        case "xminFetchIntervalMs": getOrCreateConfiguration(target).getXminFetchIntervalMs(); return true;
        default: return null;
        }
    }
}

