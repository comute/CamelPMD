package org.apache.camel.component.debezium.configuration;

import io.debezium.config.Configuration;
import io.debezium.connector.oracle.OracleConnector;
import org.apache.camel.spi.Metadata;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

@UriParams
public class OracleConnectorEmbeddedDebeziumConfiguration
        extends
            EmbeddedDebeziumConfiguration {

    private static final String LABEL_NAME = "consumer,oracle";
    @UriParam(label = LABEL_NAME, defaultValue = "shared")
    private String snapshotLockingMode = "shared";
    @UriParam(label = LABEL_NAME, defaultValue = "false")
    private boolean logMiningBufferDropOnStop = false;
    @UriParam(label = LABEL_NAME)
    private String messageKeyColumns;
    @UriParam(label = LABEL_NAME, defaultValue = "0")
    private int queryFetchSize = 0;
    @UriParam(label = LABEL_NAME)
    private String logMiningArchiveDestinationName;
    @UriParam(label = LABEL_NAME)
    private String columnBlacklist;
    @UriParam(label = LABEL_NAME, defaultValue = "0ms", javaType = "java.time.Duration")
    private long logMiningSleepTimeMinMs = 0;
    @UriParam(label = LABEL_NAME)
    private String tableBlacklist;
    @UriParam(label = LABEL_NAME, defaultValue = "true")
    private boolean includeSchemaChanges = true;
    @UriParam(label = LABEL_NAME, defaultValue = "__debezium_unavailable_value")
    private String unavailableValuePlaceholder = "__debezium_unavailable_value";
    @UriParam(label = LABEL_NAME)
    private String heartbeatActionQuery;
    @UriParam(label = LABEL_NAME, defaultValue = "500ms", javaType = "java.time.Duration")
    private long pollIntervalMs = 500;
    @UriParam(label = LABEL_NAME, defaultValue = "100ms", javaType = "java.time.Duration")
    private int databaseHistoryKafkaRecoveryPollIntervalMs = 100;
    @UriParam(label = LABEL_NAME)
    private String signalDataCollection;
    @UriParam(label = LABEL_NAME, defaultValue = "false")
    private boolean lobEnabled = false;
    @UriParam(label = LABEL_NAME, defaultValue = "numeric")
    private String intervalHandlingMode = "numeric";
    @UriParam(label = LABEL_NAME, defaultValue = "false")
    private boolean databaseHistoryStoreOnlyCapturedTablesDdl = false;
    @UriParam(label = LABEL_NAME)
    private String converters;
    @UriParam(label = LABEL_NAME, defaultValue = "__debezium-heartbeat")
    private String heartbeatTopicsPrefix = "__debezium-heartbeat";
    @UriParam(label = LABEL_NAME, defaultValue = "false")
    private boolean logMiningArchiveLogOnlyMode = false;
    @UriParam(label = LABEL_NAME)
    private int snapshotFetchSize;
    @UriParam(label = LABEL_NAME)
    private String logMiningBufferInfinispanCacheSchemaChanges;
    @UriParam(label = LABEL_NAME, defaultValue = "10s", javaType = "java.time.Duration")
    private long snapshotLockTimeoutMs = 10000;
    @UriParam(label = LABEL_NAME, defaultValue = "3s", javaType = "java.time.Duration")
    private long logMiningSleepTimeMaxMs = 3000;
    @UriParam(label = LABEL_NAME, defaultValue = "1000000")
    private long logMiningScnGapDetectionGapSizeMin = 1000000;
    @UriParam(label = LABEL_NAME)
    private String databaseUser;
    @UriParam(label = LABEL_NAME)
    private String databaseDbname;
    @UriParam(label = LABEL_NAME)
    private String datatypePropagateSourceType;
    @UriParam(label = LABEL_NAME, defaultValue = "false")
    private boolean sanitizeFieldNames = false;
    @UriParam(label = LABEL_NAME, defaultValue = "1s", javaType = "java.time.Duration")
    private long logMiningSleepTimeDefaultMs = 1000;
    @UriParam(label = LABEL_NAME)
    private String snapshotSelectStatementOverrides;
    @UriParam(label = LABEL_NAME)
    private String databaseHistoryKafkaBootstrapServers;
    @UriParam(label = LABEL_NAME, defaultValue = "v2")
    private String sourceStructVersion = "v2";
    @UriParam(label = LABEL_NAME, defaultValue = "0ms", javaType = "java.time.Duration")
    private int heartbeatIntervalMs = 0;
    @UriParam(label = LABEL_NAME)
    private String columnWhitelist;
    @UriParam(label = LABEL_NAME, defaultValue = "10s", javaType = "java.time.Duration")
    private long logMiningArchiveLogOnlyScnPollIntervalMs = 10000;
    @UriParam(label = LABEL_NAME)
    private String columnIncludeList;
    @UriParam(label = LABEL_NAME)
    private String logMiningUsernameExcludeList;
    @UriParam(label = LABEL_NAME)
    private String columnPropagateSourceType;
    @UriParam(label = LABEL_NAME)
    private String logMiningBufferInfinispanCacheProcessedTransactions;
    @UriParam(label = LABEL_NAME)
    private String tableExcludeList;
    @UriParam(label = LABEL_NAME)
    @Metadata(required = true)
    private String databasePassword;
    @UriParam(label = LABEL_NAME)
    private String logMiningBufferInfinispanCacheEvents;
    @UriParam(label = LABEL_NAME, defaultValue = "false")
    private boolean databaseHistoryStoreOnlyMonitoredTablesDdl = false;
    @UriParam(label = LABEL_NAME, defaultValue = "2048")
    private int maxBatchSize = 2048;
    @UriParam(label = LABEL_NAME)
    private String skippedOperations;
    @UriParam(label = LABEL_NAME)
    private String logMiningBufferInfinispanCacheTransactions;
    @UriParam(label = LABEL_NAME, defaultValue = "20s", javaType = "java.time.Duration")
    private long logMiningScnGapDetectionTimeIntervalMaxMs = 20000;
    @UriParam(label = LABEL_NAME, defaultValue = "initial")
    private String snapshotMode = "initial";
    @UriParam(label = LABEL_NAME, defaultValue = "io.debezium.relational.history.KafkaDatabaseHistory")
    private String databaseHistory = "io.debezium.relational.history.KafkaDatabaseHistory";
    @UriParam(label = LABEL_NAME, defaultValue = "8192")
    private int maxQueueSize = 8192;
    @UriParam(label = LABEL_NAME)
    private String racNodes;
    @UriParam(label = LABEL_NAME)
    private String databaseHistoryKafkaTopic;
    @UriParam(label = LABEL_NAME, defaultValue = "10s", javaType = "java.time.Duration")
    private long retriableRestartConnectorWaitMs = 10000;
    @UriParam(label = LABEL_NAME, defaultValue = "0ms", javaType = "java.time.Duration")
    private long snapshotDelayMs = 0;
    @UriParam(label = LABEL_NAME, defaultValue = "redo_log_catalog")
    private String logMiningStrategy = "redo_log_catalog";
    @UriParam(label = LABEL_NAME, defaultValue = "100")
    private int databaseHistoryKafkaRecoveryAttempts = 100;
    @UriParam(label = LABEL_NAME, defaultValue = "false")
    private boolean provideTransactionMetadata = false;
    @UriParam(label = LABEL_NAME)
    private String tableWhitelist;
    @UriParam(label = LABEL_NAME, defaultValue = "false")
    private boolean tombstonesOnDelete = false;
    @UriParam(label = LABEL_NAME, defaultValue = "precise")
    private String decimalHandlingMode = "precise";
    @UriParam(label = LABEL_NAME, defaultValue = "bytes")
    private String binaryHandlingMode = "bytes";
    @UriParam(label = LABEL_NAME, defaultValue = "false")
    private boolean includeSchemaComments = false;
    @UriParam(label = LABEL_NAME, defaultValue = "false")
    private boolean databaseHistorySkipUnparseableDdl = false;
    @UriParam(label = LABEL_NAME)
    private String databaseOutServerName;
    @UriParam(label = LABEL_NAME, defaultValue = "0")
    private long logMiningArchiveLogHours = 0;
    @UriParam(label = LABEL_NAME, defaultValue = "0")
    private long logMiningTransactionRetentionHours = 0;
    @UriParam(label = LABEL_NAME)
    private String snapshotIncludeCollectionList;
    @UriParam(label = LABEL_NAME)
    private String databaseHistoryFileFilename;
    @UriParam(label = LABEL_NAME, defaultValue = "100000")
    private long logMiningBatchSizeMax = 100000;
    @UriParam(label = LABEL_NAME)
    private String databasePdbName;
    @UriParam(label = LABEL_NAME, defaultValue = "LogMiner")
    private String databaseConnectionAdapter = "LogMiner";
    @UriParam(label = LABEL_NAME, defaultValue = "0")
    private long maxQueueSizeInBytes = 0;
    @UriParam(label = LABEL_NAME, defaultValue = "memory")
    private String logMiningBufferType = "memory";
    @UriParam(label = LABEL_NAME, defaultValue = "${database.server.name}.transaction")
    private String transactionTopic = "${database.server.name}.transaction";
    @UriParam(label = LABEL_NAME)
    private String databaseUrl;
    @UriParam(label = LABEL_NAME, defaultValue = "adaptive")
    private String timePrecisionMode = "adaptive";
    @UriParam(label = LABEL_NAME)
    @Metadata(required = true)
    private String databaseServerName;
    @UriParam(label = LABEL_NAME, defaultValue = "fail")
    private String eventProcessingFailureHandlingMode = "fail";
    @UriParam(label = LABEL_NAME, defaultValue = "1")
    private int snapshotMaxThreads = 1;
    @UriParam(label = LABEL_NAME, defaultValue = "1528")
    private int databasePort = 1528;
    @UriParam(label = LABEL_NAME, defaultValue = "200ms", javaType = "java.time.Duration")
    private long logMiningSleepTimeIncrementMs = 200;
    @UriParam(label = LABEL_NAME)
    private String columnExcludeList;
    @UriParam(label = LABEL_NAME)
    private String databaseHostname;
    @UriParam(label = LABEL_NAME, defaultValue = "1000")
    private long logMiningBatchSizeMin = 1000;
    @UriParam(label = LABEL_NAME, defaultValue = "20000")
    private long logMiningBatchSizeDefault = 20000;
    @UriParam(label = LABEL_NAME)
    private String snapshotEnhancePredicateScn;
    @UriParam(label = LABEL_NAME)
    private String tableIncludeList;

    /**
     * Controls how the connector holds locks on tables while performing the
     * schema snapshot. The default is 'shared', which means the connector will
     * hold a table lock that prevents exclusive table access for just the
     * initial portion of the snapshot while the database schemas and other
     * metadata are being read. The remaining work in a snapshot involves
     * selecting all rows from each table, and this is done using a flashback
     * query that requires no locks. However, in some cases it may be desirable
     * to avoid locks entirely which can be done by specifying 'none'. This mode
     * is only safe to use if no schema changes are happening while the snapshot
     * is taken.
     */
    public void setSnapshotLockingMode(String snapshotLockingMode) {
        this.snapshotLockingMode = snapshotLockingMode;
    }

    public String getSnapshotLockingMode() {
        return snapshotLockingMode;
    }

    /**
     * When set to true the underlying buffer cache is not retained when the
     * connector is stopped. When set to false (the default), the buffer cache
     * is retained across restarts.
     */
    public void setLogMiningBufferDropOnStop(boolean logMiningBufferDropOnStop) {
        this.logMiningBufferDropOnStop = logMiningBufferDropOnStop;
    }

    public boolean isLogMiningBufferDropOnStop() {
        return logMiningBufferDropOnStop;
    }

    /**
     * A semicolon-separated list of expressions that match fully-qualified
     * tables and column(s) to be used as message key. Each expression must
     * match the pattern '<fully-qualified table name>:<key columns>',where the
     * table names could be defined as (DB_NAME.TABLE_NAME) or
     * (SCHEMA_NAME.TABLE_NAME), depending on the specific connector,and the key
     * columns are a comma-separated list of columns representing the custom
     * key. For any table without an explicit key configuration the table's
     * primary key column(s) will be used as message key.Example:
     * dbserver1.inventory.orderlines:orderId,orderLineId;dbserver1.inventory.orders:id
     */
    public void setMessageKeyColumns(String messageKeyColumns) {
        this.messageKeyColumns = messageKeyColumns;
    }

    public String getMessageKeyColumns() {
        return messageKeyColumns;
    }

    /**
     * The maximum number of records that should be loaded into memory while
     * streaming.  A value of `0` uses the default JDBC fetch size.
     */
    public void setQueryFetchSize(int queryFetchSize) {
        this.queryFetchSize = queryFetchSize;
    }

    public int getQueryFetchSize() {
        return queryFetchSize;
    }

    /**
     * Sets the specific archive log destination as the source for reading
     * archive logs.When not set, the connector will automatically select the
     * first LOCAL and VALID destination.
     */
    public void setLogMiningArchiveDestinationName(
            String logMiningArchiveDestinationName) {
        this.logMiningArchiveDestinationName = logMiningArchiveDestinationName;
    }

    public String getLogMiningArchiveDestinationName() {
        return logMiningArchiveDestinationName;
    }

    /**
     * Regular expressions matching columns to exclude from change events
     * (deprecated, use "column.exclude.list" instead)
     */
    public void setColumnBlacklist(String columnBlacklist) {
        this.columnBlacklist = columnBlacklist;
    }

    public String getColumnBlacklist() {
        return columnBlacklist;
    }

    /**
     * The minimum amount of time that the connector will sleep after reading
     * data from redo/archive logs and before starting reading data again. Value
     * is in milliseconds.
     */
    public void setLogMiningSleepTimeMinMs(long logMiningSleepTimeMinMs) {
        this.logMiningSleepTimeMinMs = logMiningSleepTimeMinMs;
    }

    public long getLogMiningSleepTimeMinMs() {
        return logMiningSleepTimeMinMs;
    }

    /**
     * A comma-separated list of regular expressions that match the
     * fully-qualified names of tables to be excluded from monitoring
     * (deprecated, use "table.exclude.list" instead)
     */
    public void setTableBlacklist(String tableBlacklist) {
        this.tableBlacklist = tableBlacklist;
    }

    public String getTableBlacklist() {
        return tableBlacklist;
    }

    /**
     * Whether the connector should publish changes in the database schema to a
     * Kafka topic with the same name as the database server ID. Each schema
     * change will be recorded using a key that contains the database name and
     * whose value include logical description of the new schema and optionally
     * the DDL statement(s).The default is 'true'. This is independent of how
     * the connector internally records database history.
     */
    public void setIncludeSchemaChanges(boolean includeSchemaChanges) {
        this.includeSchemaChanges = includeSchemaChanges;
    }

    public boolean isIncludeSchemaChanges() {
        return includeSchemaChanges;
    }

    /**
     * Specify the constant that will be provided by Debezium to indicate that
     * the original value is unavailable and not provided by the database.
     */
    public void setUnavailableValuePlaceholder(
            String unavailableValuePlaceholder) {
        this.unavailableValuePlaceholder = unavailableValuePlaceholder;
    }

    public String getUnavailableValuePlaceholder() {
        return unavailableValuePlaceholder;
    }

    /**
     * The query executed with every heartbeat.
     */
    public void setHeartbeatActionQuery(String heartbeatActionQuery) {
        this.heartbeatActionQuery = heartbeatActionQuery;
    }

    public String getHeartbeatActionQuery() {
        return heartbeatActionQuery;
    }

    /**
     * Time to wait for new change events to appear after receiving no events,
     * given in milliseconds. Defaults to 500 ms.
     */
    public void setPollIntervalMs(long pollIntervalMs) {
        this.pollIntervalMs = pollIntervalMs;
    }

    public long getPollIntervalMs() {
        return pollIntervalMs;
    }

    /**
     * The number of milliseconds to wait while polling for persisted data
     * during recovery.
     */
    public void setDatabaseHistoryKafkaRecoveryPollIntervalMs(
            int databaseHistoryKafkaRecoveryPollIntervalMs) {
        this.databaseHistoryKafkaRecoveryPollIntervalMs = databaseHistoryKafkaRecoveryPollIntervalMs;
    }

    public int getDatabaseHistoryKafkaRecoveryPollIntervalMs() {
        return databaseHistoryKafkaRecoveryPollIntervalMs;
    }

    /**
     * The name of the data collection that is used to send signals/commands to
     * Debezium. Signaling is disabled when not set.
     */
    public void setSignalDataCollection(String signalDataCollection) {
        this.signalDataCollection = signalDataCollection;
    }

    public String getSignalDataCollection() {
        return signalDataCollection;
    }

    /**
     * When set to `false`, the default, LOB fields will not be captured nor
     * emitted. When set to `true`, the connector will capture LOB fields and
     * emit changes for those fields like any other column type.
     */
    public void setLobEnabled(boolean lobEnabled) {
        this.lobEnabled = lobEnabled;
    }

    public boolean isLobEnabled() {
        return lobEnabled;
    }

    /**
     * Specify how INTERVAL columns should be represented in change events,
     * including:'string' represents values as an exact ISO formatted
     * string'numeric' (default) represents values using the inexact conversion
     * into microseconds
     */
    public void setIntervalHandlingMode(String intervalHandlingMode) {
        this.intervalHandlingMode = intervalHandlingMode;
    }

    public String getIntervalHandlingMode() {
        return intervalHandlingMode;
    }

    /**
     * Controls what DDL will Debezium store in database history. By default
     * (false) Debezium will store all incoming DDL statements. If set to true,
     * then only DDL that manipulates a captured table will be stored.
     */
    public void setDatabaseHistoryStoreOnlyCapturedTablesDdl(
            boolean databaseHistoryStoreOnlyCapturedTablesDdl) {
        this.databaseHistoryStoreOnlyCapturedTablesDdl = databaseHistoryStoreOnlyCapturedTablesDdl;
    }

    public boolean isDatabaseHistoryStoreOnlyCapturedTablesDdl() {
        return databaseHistoryStoreOnlyCapturedTablesDdl;
    }

    /**
     * Optional list of custom converters that would be used instead of default
     * ones. The converters are defined using '<converter.prefix>.type' config
     * option and configured using options '<converter.prefix>.<option>'
     */
    public void setConverters(String converters) {
        this.converters = converters;
    }

    public String getConverters() {
        return converters;
    }

    /**
     * The prefix that is used to name heartbeat topics.Defaults to
     * __debezium-heartbeat.
     */
    public void setHeartbeatTopicsPrefix(String heartbeatTopicsPrefix) {
        this.heartbeatTopicsPrefix = heartbeatTopicsPrefix;
    }

    public String getHeartbeatTopicsPrefix() {
        return heartbeatTopicsPrefix;
    }

    /**
     * When set to `false`, the default, the connector will mine both archive
     * log and redo logs to emit change events. When set to `true`, the
     * connector will only mine archive logs. There are circumstances where its
     * advantageous to only mine archive logs and accept latency in event
     * emission due to frequent revolving redo logs.
     */
    public void setLogMiningArchiveLogOnlyMode(
            boolean logMiningArchiveLogOnlyMode) {
        this.logMiningArchiveLogOnlyMode = logMiningArchiveLogOnlyMode;
    }

    public boolean isLogMiningArchiveLogOnlyMode() {
        return logMiningArchiveLogOnlyMode;
    }

    /**
     * The maximum number of records that should be loaded into memory while
     * performing a snapshot
     */
    public void setSnapshotFetchSize(int snapshotFetchSize) {
        this.snapshotFetchSize = snapshotFetchSize;
    }

    public int getSnapshotFetchSize() {
        return snapshotFetchSize;
    }

    /**
     * Specifies the XML configuration for the Infinispan 'schema-changes' cache
     */
    public void setLogMiningBufferInfinispanCacheSchemaChanges(
            String logMiningBufferInfinispanCacheSchemaChanges) {
        this.logMiningBufferInfinispanCacheSchemaChanges = logMiningBufferInfinispanCacheSchemaChanges;
    }

    public String getLogMiningBufferInfinispanCacheSchemaChanges() {
        return logMiningBufferInfinispanCacheSchemaChanges;
    }

    /**
     * The maximum number of millis to wait for table locks at the beginning of
     * a snapshot. If locks cannot be acquired in this time frame, the snapshot
     * will be aborted. Defaults to 10 seconds
     */
    public void setSnapshotLockTimeoutMs(long snapshotLockTimeoutMs) {
        this.snapshotLockTimeoutMs = snapshotLockTimeoutMs;
    }

    public long getSnapshotLockTimeoutMs() {
        return snapshotLockTimeoutMs;
    }

    /**
     * The maximum amount of time that the connector will sleep after reading
     * data from redo/archive logs and before starting reading data again. Value
     * is in milliseconds.
     */
    public void setLogMiningSleepTimeMaxMs(long logMiningSleepTimeMaxMs) {
        this.logMiningSleepTimeMaxMs = logMiningSleepTimeMaxMs;
    }

    public long getLogMiningSleepTimeMaxMs() {
        return logMiningSleepTimeMaxMs;
    }

    /**
     * Used for SCN gap detection, if the difference between current SCN and
     * previous end SCN is bigger than this value, and the time difference of
     * current SCN and previous end SCN is smaller than
     * log.mining.scn.gap.detection.time.interval.max.ms, consider it a SCN gap.
     */
    public void setLogMiningScnGapDetectionGapSizeMin(
            long logMiningScnGapDetectionGapSizeMin) {
        this.logMiningScnGapDetectionGapSizeMin = logMiningScnGapDetectionGapSizeMin;
    }

    public long getLogMiningScnGapDetectionGapSizeMin() {
        return logMiningScnGapDetectionGapSizeMin;
    }

    /**
     * Name of the database user to be used when connecting to the database.
     */
    public void setDatabaseUser(String databaseUser) {
        this.databaseUser = databaseUser;
    }

    public String getDatabaseUser() {
        return databaseUser;
    }

    /**
     * The name of the database from which the connector should capture changes
     */
    public void setDatabaseDbname(String databaseDbname) {
        this.databaseDbname = databaseDbname;
    }

    public String getDatabaseDbname() {
        return databaseDbname;
    }

    /**
     * A comma-separated list of regular expressions matching the
     * database-specific data type names that adds the data type's original type
     * and original length as parameters to the corresponding field schemas in
     * the emitted change records.
     */
    public void setDatatypePropagateSourceType(
            String datatypePropagateSourceType) {
        this.datatypePropagateSourceType = datatypePropagateSourceType;
    }

    public String getDatatypePropagateSourceType() {
        return datatypePropagateSourceType;
    }

    /**
     * Whether field names will be sanitized to Avro naming conventions
     */
    public void setSanitizeFieldNames(boolean sanitizeFieldNames) {
        this.sanitizeFieldNames = sanitizeFieldNames;
    }

    public boolean isSanitizeFieldNames() {
        return sanitizeFieldNames;
    }

    /**
     * The amount of time that the connector will sleep after reading data from
     * redo/archive logs and before starting reading data again. Value is in
     * milliseconds.
     */
    public void setLogMiningSleepTimeDefaultMs(long logMiningSleepTimeDefaultMs) {
        this.logMiningSleepTimeDefaultMs = logMiningSleepTimeDefaultMs;
    }

    public long getLogMiningSleepTimeDefaultMs() {
        return logMiningSleepTimeDefaultMs;
    }

    /**
     *  This property contains a comma-separated list of fully-qualified tables
     * (DB_NAME.TABLE_NAME) or (SCHEMA_NAME.TABLE_NAME), depending on
     * thespecific connectors. Select statements for the individual tables are
     * specified in further configuration properties, one for each table,
     * identified by the id
     * 'snapshot.select.statement.overrides.[DB_NAME].[TABLE_NAME]' or
     * 'snapshot.select.statement.overrides.[SCHEMA_NAME].[TABLE_NAME]',
     * respectively. The value of those properties is the select statement to
     * use when retrieving data from the specific table during snapshotting. A
     * possible use case for large append-only tables is setting a specific
     * point where to start (resume) snapshotting, in case a previous
     * snapshotting was interrupted.
     */
    public void setSnapshotSelectStatementOverrides(
            String snapshotSelectStatementOverrides) {
        this.snapshotSelectStatementOverrides = snapshotSelectStatementOverrides;
    }

    public String getSnapshotSelectStatementOverrides() {
        return snapshotSelectStatementOverrides;
    }

    /**
     * A list of host/port pairs that the connector will use for establishing
     * the initial connection to the Kafka cluster for retrieving database
     * schema history previously stored by the connector. This should point to
     * the same Kafka cluster used by the Kafka Connect process.
     */
    public void setDatabaseHistoryKafkaBootstrapServers(
            String databaseHistoryKafkaBootstrapServers) {
        this.databaseHistoryKafkaBootstrapServers = databaseHistoryKafkaBootstrapServers;
    }

    public String getDatabaseHistoryKafkaBootstrapServers() {
        return databaseHistoryKafkaBootstrapServers;
    }

    /**
     * A version of the format of the publicly visible source part in the
     * message
     */
    public void setSourceStructVersion(String sourceStructVersion) {
        this.sourceStructVersion = sourceStructVersion;
    }

    public String getSourceStructVersion() {
        return sourceStructVersion;
    }

    /**
     * Length of an interval in milli-seconds in in which the connector
     * periodically sends heartbeat messages to a heartbeat topic. Use 0 to
     * disable heartbeat messages. Disabled by default.
     */
    public void setHeartbeatIntervalMs(int heartbeatIntervalMs) {
        this.heartbeatIntervalMs = heartbeatIntervalMs;
    }

    public int getHeartbeatIntervalMs() {
        return heartbeatIntervalMs;
    }

    /**
     * Regular expressions matching columns to include in change events
     * (deprecated, use "column.include.list" instead)
     */
    public void setColumnWhitelist(String columnWhitelist) {
        this.columnWhitelist = columnWhitelist;
    }

    public String getColumnWhitelist() {
        return columnWhitelist;
    }

    /**
     * The interval in milliseconds to wait between polls checking to see if the
     * SCN is in the archive logs.
     */
    public void setLogMiningArchiveLogOnlyScnPollIntervalMs(
            long logMiningArchiveLogOnlyScnPollIntervalMs) {
        this.logMiningArchiveLogOnlyScnPollIntervalMs = logMiningArchiveLogOnlyScnPollIntervalMs;
    }

    public long getLogMiningArchiveLogOnlyScnPollIntervalMs() {
        return logMiningArchiveLogOnlyScnPollIntervalMs;
    }

    /**
     * Regular expressions matching columns to include in change events
     */
    public void setColumnIncludeList(String columnIncludeList) {
        this.columnIncludeList = columnIncludeList;
    }

    public String getColumnIncludeList() {
        return columnIncludeList;
    }

    /**
     * Comma separated list of usernames to exclude from LogMiner query.
     */
    public void setLogMiningUsernameExcludeList(
            String logMiningUsernameExcludeList) {
        this.logMiningUsernameExcludeList = logMiningUsernameExcludeList;
    }

    public String getLogMiningUsernameExcludeList() {
        return logMiningUsernameExcludeList;
    }

    /**
     * A comma-separated list of regular expressions matching fully-qualified
     * names of columns that  adds the columns original type and original length
     * as parameters to the corresponding field schemas in the emitted change
     * records.
     */
    public void setColumnPropagateSourceType(String columnPropagateSourceType) {
        this.columnPropagateSourceType = columnPropagateSourceType;
    }

    public String getColumnPropagateSourceType() {
        return columnPropagateSourceType;
    }

    /**
     * Specifies the XML configuration for the Infinispan
     * 'processed-transactions' cache
     */
    public void setLogMiningBufferInfinispanCacheProcessedTransactions(
            String logMiningBufferInfinispanCacheProcessedTransactions) {
        this.logMiningBufferInfinispanCacheProcessedTransactions = logMiningBufferInfinispanCacheProcessedTransactions;
    }

    public String getLogMiningBufferInfinispanCacheProcessedTransactions() {
        return logMiningBufferInfinispanCacheProcessedTransactions;
    }

    /**
     * A comma-separated list of regular expressions that match the
     * fully-qualified names of tables to be excluded from monitoring
     */
    public void setTableExcludeList(String tableExcludeList) {
        this.tableExcludeList = tableExcludeList;
    }

    public String getTableExcludeList() {
        return tableExcludeList;
    }

    /**
     * Password of the database user to be used when connecting to the database.
     */
    public void setDatabasePassword(String databasePassword) {
        this.databasePassword = databasePassword;
    }

    public String getDatabasePassword() {
        return databasePassword;
    }

    /**
     * Specifies the XML configuration for the Infinispan 'events' cache
     */
    public void setLogMiningBufferInfinispanCacheEvents(
            String logMiningBufferInfinispanCacheEvents) {
        this.logMiningBufferInfinispanCacheEvents = logMiningBufferInfinispanCacheEvents;
    }

    public String getLogMiningBufferInfinispanCacheEvents() {
        return logMiningBufferInfinispanCacheEvents;
    }

    /**
     * Controls what DDL will Debezium store in database history. By default
     * (false) Debezium will store all incoming DDL statements. If set to true,
     * then only DDL that manipulates a monitored table will be stored
     * (deprecated, use "database.history.store.only.captured.tables.ddl"
     * instead)
     */
    public void setDatabaseHistoryStoreOnlyMonitoredTablesDdl(
            boolean databaseHistoryStoreOnlyMonitoredTablesDdl) {
        this.databaseHistoryStoreOnlyMonitoredTablesDdl = databaseHistoryStoreOnlyMonitoredTablesDdl;
    }

    public boolean isDatabaseHistoryStoreOnlyMonitoredTablesDdl() {
        return databaseHistoryStoreOnlyMonitoredTablesDdl;
    }

    /**
     * Maximum size of each batch of source records. Defaults to 2048.
     */
    public void setMaxBatchSize(int maxBatchSize) {
        this.maxBatchSize = maxBatchSize;
    }

    public int getMaxBatchSize() {
        return maxBatchSize;
    }

    /**
     * The comma-separated list of operations to skip during streaming, defined
     * as: 'c' for inserts/create; 'u' for updates; 'd' for deletes. By default,
     * no operations will be skipped.
     */
    public void setSkippedOperations(String skippedOperations) {
        this.skippedOperations = skippedOperations;
    }

    public String getSkippedOperations() {
        return skippedOperations;
    }

    /**
     * Specifies the XML configuration for the Infinispan 'transactions' cache
     */
    public void setLogMiningBufferInfinispanCacheTransactions(
            String logMiningBufferInfinispanCacheTransactions) {
        this.logMiningBufferInfinispanCacheTransactions = logMiningBufferInfinispanCacheTransactions;
    }

    public String getLogMiningBufferInfinispanCacheTransactions() {
        return logMiningBufferInfinispanCacheTransactions;
    }

    /**
     * Used for SCN gap detection, if the difference between current SCN and
     * previous end SCN is bigger than
     * log.mining.scn.gap.detection.gap.size.min, and the time difference of
     * current SCN and previous end SCN is smaller than  this value, consider it
     * a SCN gap.
     */
    public void setLogMiningScnGapDetectionTimeIntervalMaxMs(
            long logMiningScnGapDetectionTimeIntervalMaxMs) {
        this.logMiningScnGapDetectionTimeIntervalMaxMs = logMiningScnGapDetectionTimeIntervalMaxMs;
    }

    public long getLogMiningScnGapDetectionTimeIntervalMaxMs() {
        return logMiningScnGapDetectionTimeIntervalMaxMs;
    }

    /**
     * The criteria for running a snapshot upon startup of the connector.
     * Options include: 'initial' (the default) to specify the connector should
     * run a snapshot only when no offsets are available for the logical server
     * name; 'schema_only' to specify the connector should run a snapshot of the
     * schema when no offsets are available for the logical server name. 
     */
    public void setSnapshotMode(String snapshotMode) {
        this.snapshotMode = snapshotMode;
    }

    public String getSnapshotMode() {
        return snapshotMode;
    }

    /**
     * The name of the DatabaseHistory class that should be used to store and
     * recover database schema changes. The configuration properties for the
     * history are prefixed with the 'database.history.' string.
     */
    public void setDatabaseHistory(String databaseHistory) {
        this.databaseHistory = databaseHistory;
    }

    public String getDatabaseHistory() {
        return databaseHistory;
    }

    /**
     * Maximum size of the queue for change events read from the database log
     * but not yet recorded or forwarded. Defaults to 8192, and should always be
     * larger than the maximum batch size.
     */
    public void setMaxQueueSize(int maxQueueSize) {
        this.maxQueueSize = maxQueueSize;
    }

    public int getMaxQueueSize() {
        return maxQueueSize;
    }

    /**
     * A comma-separated list of RAC node hostnames or ip addresses
     */
    public void setRacNodes(String racNodes) {
        this.racNodes = racNodes;
    }

    public String getRacNodes() {
        return racNodes;
    }

    /**
     * The name of the topic for the database schema history
     */
    public void setDatabaseHistoryKafkaTopic(String databaseHistoryKafkaTopic) {
        this.databaseHistoryKafkaTopic = databaseHistoryKafkaTopic;
    }

    public String getDatabaseHistoryKafkaTopic() {
        return databaseHistoryKafkaTopic;
    }

    /**
     * Time to wait before restarting connector after retriable exception
     * occurs. Defaults to 10000ms.
     */
    public void setRetriableRestartConnectorWaitMs(
            long retriableRestartConnectorWaitMs) {
        this.retriableRestartConnectorWaitMs = retriableRestartConnectorWaitMs;
    }

    public long getRetriableRestartConnectorWaitMs() {
        return retriableRestartConnectorWaitMs;
    }

    /**
     * A delay period before a snapshot will begin, given in milliseconds.
     * Defaults to 0 ms.
     */
    public void setSnapshotDelayMs(long snapshotDelayMs) {
        this.snapshotDelayMs = snapshotDelayMs;
    }

    public long getSnapshotDelayMs() {
        return snapshotDelayMs;
    }

    /**
     * There are strategies: Online catalog with faster mining but no captured
     * DDL. Another - with data dictionary loaded into REDO LOG files
     */
    public void setLogMiningStrategy(String logMiningStrategy) {
        this.logMiningStrategy = logMiningStrategy;
    }

    public String getLogMiningStrategy() {
        return logMiningStrategy;
    }

    /**
     * The number of attempts in a row that no data are returned from Kafka
     * before recover completes. The maximum amount of time to wait after
     * receiving no data is (recovery.attempts) x (recovery.poll.interval.ms).
     */
    public void setDatabaseHistoryKafkaRecoveryAttempts(
            int databaseHistoryKafkaRecoveryAttempts) {
        this.databaseHistoryKafkaRecoveryAttempts = databaseHistoryKafkaRecoveryAttempts;
    }

    public int getDatabaseHistoryKafkaRecoveryAttempts() {
        return databaseHistoryKafkaRecoveryAttempts;
    }

    /**
     * Enables transaction metadata extraction together with event counting
     */
    public void setProvideTransactionMetadata(boolean provideTransactionMetadata) {
        this.provideTransactionMetadata = provideTransactionMetadata;
    }

    public boolean isProvideTransactionMetadata() {
        return provideTransactionMetadata;
    }

    /**
     * The tables for which changes are to be captured (deprecated, use
     * "table.include.list" instead)
     */
    public void setTableWhitelist(String tableWhitelist) {
        this.tableWhitelist = tableWhitelist;
    }

    public String getTableWhitelist() {
        return tableWhitelist;
    }

    /**
     * Whether delete operations should be represented by a delete event and a
     * subsquenttombstone event (true) or only by a delete event (false).
     * Emitting the tombstone event (the default behavior) allows Kafka to
     * completely delete all events pertaining to the given key once the source
     * record got deleted.
     */
    public void setTombstonesOnDelete(boolean tombstonesOnDelete) {
        this.tombstonesOnDelete = tombstonesOnDelete;
    }

    public boolean isTombstonesOnDelete() {
        return tombstonesOnDelete;
    }

    /**
     * Specify how DECIMAL and NUMERIC columns should be represented in change
     * events, including:'precise' (the default) uses java.math.BigDecimal to
     * represent values, which are encoded in the change events using a binary
     * representation and Kafka Connect's
     * 'org.apache.kafka.connect.data.Decimal' type; 'string' uses string to
     * represent values; 'double' represents values using Java's 'double', which
     * may not offer the precision but will be far easier to use in consumers.
     */
    public void setDecimalHandlingMode(String decimalHandlingMode) {
        this.decimalHandlingMode = decimalHandlingMode;
    }

    public String getDecimalHandlingMode() {
        return decimalHandlingMode;
    }

    /**
     * Specify how binary (blob, binary, etc.) columns should be represented in
     * change events, including:'bytes' represents binary data as byte array
     * (default)'base64' represents binary data as base64-encoded string'hex'
     * represents binary data as hex-encoded (base16) string
     */
    public void setBinaryHandlingMode(String binaryHandlingMode) {
        this.binaryHandlingMode = binaryHandlingMode;
    }

    public String getBinaryHandlingMode() {
        return binaryHandlingMode;
    }

    /**
     * Whether the connector parse table and column's comment to metadata
     * object.Note: Enable this option will bring the implications on memory
     * usage. The number and size of ColumnImpl objects is what largely impacts
     * how much memory is consumed by the Debezium connectors, and adding a
     * String to each of them can potentially be quite heavy. The default is
     * 'false'.
     */
    public void setIncludeSchemaComments(boolean includeSchemaComments) {
        this.includeSchemaComments = includeSchemaComments;
    }

    public boolean isIncludeSchemaComments() {
        return includeSchemaComments;
    }

    /**
     * Controls the action Debezium will take when it meets a DDL statement in
     * binlog, that it cannot parse.By default the connector will stop operating
     * but by changing the setting it can ignore the statements which it cannot
     * parse. If skipping is enabled then Debezium can miss metadata changes.
     */
    public void setDatabaseHistorySkipUnparseableDdl(
            boolean databaseHistorySkipUnparseableDdl) {
        this.databaseHistorySkipUnparseableDdl = databaseHistorySkipUnparseableDdl;
    }

    public boolean isDatabaseHistorySkipUnparseableDdl() {
        return databaseHistorySkipUnparseableDdl;
    }

    /**
     * Name of the XStream Out server to connect to.
     */
    public void setDatabaseOutServerName(String databaseOutServerName) {
        this.databaseOutServerName = databaseOutServerName;
    }

    public String getDatabaseOutServerName() {
        return databaseOutServerName;
    }

    /**
     * The number of hours in the past from SYSDATE to mine archive logs.  Using
     * 0 mines all available archive logs
     */
    public void setLogMiningArchiveLogHours(long logMiningArchiveLogHours) {
        this.logMiningArchiveLogHours = logMiningArchiveLogHours;
    }

    public long getLogMiningArchiveLogHours() {
        return logMiningArchiveLogHours;
    }

    /**
     * Hours to keep long running transactions in transaction buffer between log
     * mining sessions.  By default, all transactions are retained.
     */
    public void setLogMiningTransactionRetentionHours(
            long logMiningTransactionRetentionHours) {
        this.logMiningTransactionRetentionHours = logMiningTransactionRetentionHours;
    }

    public long getLogMiningTransactionRetentionHours() {
        return logMiningTransactionRetentionHours;
    }

    /**
     * this setting must be set to specify a list of tables/collections whose
     * snapshot must be taken on creating or restarting the connector.
     */
    public void setSnapshotIncludeCollectionList(
            String snapshotIncludeCollectionList) {
        this.snapshotIncludeCollectionList = snapshotIncludeCollectionList;
    }

    public String getSnapshotIncludeCollectionList() {
        return snapshotIncludeCollectionList;
    }

    /**
     * The path to the file that will be used to record the database history
     */
    public void setDatabaseHistoryFileFilename(
            String databaseHistoryFileFilename) {
        this.databaseHistoryFileFilename = databaseHistoryFileFilename;
    }

    public String getDatabaseHistoryFileFilename() {
        return databaseHistoryFileFilename;
    }

    /**
     * The maximum SCN interval size that this connector will use when reading
     * from redo/archive logs.
     */
    public void setLogMiningBatchSizeMax(long logMiningBatchSizeMax) {
        this.logMiningBatchSizeMax = logMiningBatchSizeMax;
    }

    public long getLogMiningBatchSizeMax() {
        return logMiningBatchSizeMax;
    }

    /**
     * Name of the pluggable database when working with a multi-tenant set-up.
     * The CDB name must be given via database.dbname in this case.
     */
    public void setDatabasePdbName(String databasePdbName) {
        this.databasePdbName = databasePdbName;
    }

    public String getDatabasePdbName() {
        return databasePdbName;
    }

    /**
     * The adapter to use when capturing changes from the database. Options
     * include: 'logminer': (the default) to capture changes using native Oracle
     * LogMiner; 'xstream' to capture changes using Oracle XStreams
     */
    public void setDatabaseConnectionAdapter(String databaseConnectionAdapter) {
        this.databaseConnectionAdapter = databaseConnectionAdapter;
    }

    public String getDatabaseConnectionAdapter() {
        return databaseConnectionAdapter;
    }

    /**
     * Maximum size of the queue in bytes for change events read from the
     * database log but not yet recorded or forwarded. Defaults to 0. Mean the
     * feature is not enabled
     */
    public void setMaxQueueSizeInBytes(long maxQueueSizeInBytes) {
        this.maxQueueSizeInBytes = maxQueueSizeInBytes;
    }

    public long getMaxQueueSizeInBytes() {
        return maxQueueSizeInBytes;
    }

    /**
     * The buffer type controls how the connector manages buffering transaction
     * data.
     * 
     * memory - Uses the JVM process' heap to buffer all transaction data.
     * 
     * infinispan_embedded - This option uses an embedded Infinispan cache to
     * buffer transaction data and persist it to disk.
     * 
     * infinispan_remote - This option uses a remote Infinispan cluster to
     * buffer transaction data and persist it to disk.
     */
    public void setLogMiningBufferType(String logMiningBufferType) {
        this.logMiningBufferType = logMiningBufferType;
    }

    public String getLogMiningBufferType() {
        return logMiningBufferType;
    }

    /**
     * The name of the transaction metadata topic. The placeholder
     * ${database.server.name} can be used for referring to the connector's
     * logical name; defaults to ${database.server.name}.transaction.
     */
    public void setTransactionTopic(String transactionTopic) {
        this.transactionTopic = transactionTopic;
    }

    public String getTransactionTopic() {
        return transactionTopic;
    }

    /**
     * Complete JDBC URL as an alternative to specifying hostname, port and
     * database provided as a way to support alternative connection scenarios.
     */
    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    /**
     * Time, date, and timestamps can be represented with different kinds of
     * precisions, including:'adaptive' (the default) bases the precision of
     * time, date, and timestamp values on the database column's precision;
     * 'adaptive_time_microseconds' like 'adaptive' mode, but TIME fields always
     * use microseconds precision;'connect' always represents time, date, and
     * timestamp values using Kafka Connect's built-in representations for Time,
     * Date, and Timestamp, which uses millisecond precision regardless of the
     * database columns' precision .
     */
    public void setTimePrecisionMode(String timePrecisionMode) {
        this.timePrecisionMode = timePrecisionMode;
    }

    public String getTimePrecisionMode() {
        return timePrecisionMode;
    }

    /**
     * Unique name that identifies the database server and all recorded offsets,
     * and that is used as a prefix for all schemas and topics. Each distinct
     * installation should have a separate namespace and be monitored by at most
     * one Debezium connector.
     */
    public void setDatabaseServerName(String databaseServerName) {
        this.databaseServerName = databaseServerName;
    }

    public String getDatabaseServerName() {
        return databaseServerName;
    }

    /**
     * Specify how failures during processing of events (i.e. when encountering
     * a corrupted event) should be handled, including:'fail' (the default) an
     * exception indicating the problematic event and its position is raised,
     * causing the connector to be stopped; 'warn' the problematic event and its
     * position will be logged and the event will be skipped;'ignore' the
     * problematic event will be skipped.
     */
    public void setEventProcessingFailureHandlingMode(
            String eventProcessingFailureHandlingMode) {
        this.eventProcessingFailureHandlingMode = eventProcessingFailureHandlingMode;
    }

    public String getEventProcessingFailureHandlingMode() {
        return eventProcessingFailureHandlingMode;
    }

    /**
     * The maximum number of threads used to perform the snapshot.  Defaults to
     * 1.
     */
    public void setSnapshotMaxThreads(int snapshotMaxThreads) {
        this.snapshotMaxThreads = snapshotMaxThreads;
    }

    public int getSnapshotMaxThreads() {
        return snapshotMaxThreads;
    }

    /**
     * Port of the database server.
     */
    public void setDatabasePort(int databasePort) {
        this.databasePort = databasePort;
    }

    public int getDatabasePort() {
        return databasePort;
    }

    /**
     * The maximum amount of time that the connector will use to tune the
     * optimal sleep time when reading data from LogMiner. Value is in
     * milliseconds.
     */
    public void setLogMiningSleepTimeIncrementMs(
            long logMiningSleepTimeIncrementMs) {
        this.logMiningSleepTimeIncrementMs = logMiningSleepTimeIncrementMs;
    }

    public long getLogMiningSleepTimeIncrementMs() {
        return logMiningSleepTimeIncrementMs;
    }

    /**
     * Regular expressions matching columns to exclude from change events
     */
    public void setColumnExcludeList(String columnExcludeList) {
        this.columnExcludeList = columnExcludeList;
    }

    public String getColumnExcludeList() {
        return columnExcludeList;
    }

    /**
     * Resolvable hostname or IP address of the database server.
     */
    public void setDatabaseHostname(String databaseHostname) {
        this.databaseHostname = databaseHostname;
    }

    public String getDatabaseHostname() {
        return databaseHostname;
    }

    /**
     * The minimum SCN interval size that this connector will try to read from
     * redo/archive logs. Active batch size will be also increased/decreased by
     * this amount for tuning connector throughput when needed.
     */
    public void setLogMiningBatchSizeMin(long logMiningBatchSizeMin) {
        this.logMiningBatchSizeMin = logMiningBatchSizeMin;
    }

    public long getLogMiningBatchSizeMin() {
        return logMiningBatchSizeMin;
    }

    /**
     * The starting SCN interval size that the connector will use for reading
     * data from redo/archive logs.
     */
    public void setLogMiningBatchSizeDefault(long logMiningBatchSizeDefault) {
        this.logMiningBatchSizeDefault = logMiningBatchSizeDefault;
    }

    public long getLogMiningBatchSizeDefault() {
        return logMiningBatchSizeDefault;
    }

    /**
     * A token to replace on snapshot predicate template
     */
    public void setSnapshotEnhancePredicateScn(
            String snapshotEnhancePredicateScn) {
        this.snapshotEnhancePredicateScn = snapshotEnhancePredicateScn;
    }

    public String getSnapshotEnhancePredicateScn() {
        return snapshotEnhancePredicateScn;
    }

    /**
     * The tables for which changes are to be captured
     */
    public void setTableIncludeList(String tableIncludeList) {
        this.tableIncludeList = tableIncludeList;
    }

    public String getTableIncludeList() {
        return tableIncludeList;
    }

    @Override
    protected Configuration createConnectorConfiguration() {
        final Configuration.Builder configBuilder = Configuration.create();
        
        addPropertyIfNotNull(configBuilder, "snapshot.locking.mode", snapshotLockingMode);
        addPropertyIfNotNull(configBuilder, "log.mining.buffer.drop.on.stop", logMiningBufferDropOnStop);
        addPropertyIfNotNull(configBuilder, "message.key.columns", messageKeyColumns);
        addPropertyIfNotNull(configBuilder, "query.fetch.size", queryFetchSize);
        addPropertyIfNotNull(configBuilder, "log.mining.archive.destination.name", logMiningArchiveDestinationName);
        addPropertyIfNotNull(configBuilder, "column.blacklist", columnBlacklist);
        addPropertyIfNotNull(configBuilder, "log.mining.sleep.time.min.ms", logMiningSleepTimeMinMs);
        addPropertyIfNotNull(configBuilder, "table.blacklist", tableBlacklist);
        addPropertyIfNotNull(configBuilder, "include.schema.changes", includeSchemaChanges);
        addPropertyIfNotNull(configBuilder, "unavailable.value.placeholder", unavailableValuePlaceholder);
        addPropertyIfNotNull(configBuilder, "heartbeat.action.query", heartbeatActionQuery);
        addPropertyIfNotNull(configBuilder, "poll.interval.ms", pollIntervalMs);
        addPropertyIfNotNull(configBuilder, "database.history.kafka.recovery.poll.interval.ms", databaseHistoryKafkaRecoveryPollIntervalMs);
        addPropertyIfNotNull(configBuilder, "signal.data.collection", signalDataCollection);
        addPropertyIfNotNull(configBuilder, "lob.enabled", lobEnabled);
        addPropertyIfNotNull(configBuilder, "interval.handling.mode", intervalHandlingMode);
        addPropertyIfNotNull(configBuilder, "database.history.store.only.captured.tables.ddl", databaseHistoryStoreOnlyCapturedTablesDdl);
        addPropertyIfNotNull(configBuilder, "converters", converters);
        addPropertyIfNotNull(configBuilder, "heartbeat.topics.prefix", heartbeatTopicsPrefix);
        addPropertyIfNotNull(configBuilder, "log.mining.archive.log.only.mode", logMiningArchiveLogOnlyMode);
        addPropertyIfNotNull(configBuilder, "snapshot.fetch.size", snapshotFetchSize);
        addPropertyIfNotNull(configBuilder, "log.mining.buffer.infinispan.cache.schema_changes", logMiningBufferInfinispanCacheSchemaChanges);
        addPropertyIfNotNull(configBuilder, "snapshot.lock.timeout.ms", snapshotLockTimeoutMs);
        addPropertyIfNotNull(configBuilder, "log.mining.sleep.time.max.ms", logMiningSleepTimeMaxMs);
        addPropertyIfNotNull(configBuilder, "log.mining.scn.gap.detection.gap.size.min", logMiningScnGapDetectionGapSizeMin);
        addPropertyIfNotNull(configBuilder, "database.user", databaseUser);
        addPropertyIfNotNull(configBuilder, "database.dbname", databaseDbname);
        addPropertyIfNotNull(configBuilder, "datatype.propagate.source.type", datatypePropagateSourceType);
        addPropertyIfNotNull(configBuilder, "sanitize.field.names", sanitizeFieldNames);
        addPropertyIfNotNull(configBuilder, "log.mining.sleep.time.default.ms", logMiningSleepTimeDefaultMs);
        addPropertyIfNotNull(configBuilder, "snapshot.select.statement.overrides", snapshotSelectStatementOverrides);
        addPropertyIfNotNull(configBuilder, "database.history.kafka.bootstrap.servers", databaseHistoryKafkaBootstrapServers);
        addPropertyIfNotNull(configBuilder, "source.struct.version", sourceStructVersion);
        addPropertyIfNotNull(configBuilder, "heartbeat.interval.ms", heartbeatIntervalMs);
        addPropertyIfNotNull(configBuilder, "column.whitelist", columnWhitelist);
        addPropertyIfNotNull(configBuilder, "log.mining.archive.log.only.scn.poll.interval.ms", logMiningArchiveLogOnlyScnPollIntervalMs);
        addPropertyIfNotNull(configBuilder, "column.include.list", columnIncludeList);
        addPropertyIfNotNull(configBuilder, "log.mining.username.exclude.list", logMiningUsernameExcludeList);
        addPropertyIfNotNull(configBuilder, "column.propagate.source.type", columnPropagateSourceType);
        addPropertyIfNotNull(configBuilder, "log.mining.buffer.infinispan.cache.processed_transactions", logMiningBufferInfinispanCacheProcessedTransactions);
        addPropertyIfNotNull(configBuilder, "table.exclude.list", tableExcludeList);
        addPropertyIfNotNull(configBuilder, "database.password", databasePassword);
        addPropertyIfNotNull(configBuilder, "log.mining.buffer.infinispan.cache.events", logMiningBufferInfinispanCacheEvents);
        addPropertyIfNotNull(configBuilder, "database.history.store.only.monitored.tables.ddl", databaseHistoryStoreOnlyMonitoredTablesDdl);
        addPropertyIfNotNull(configBuilder, "max.batch.size", maxBatchSize);
        addPropertyIfNotNull(configBuilder, "skipped.operations", skippedOperations);
        addPropertyIfNotNull(configBuilder, "log.mining.buffer.infinispan.cache.transactions", logMiningBufferInfinispanCacheTransactions);
        addPropertyIfNotNull(configBuilder, "log.mining.scn.gap.detection.time.interval.max.ms", logMiningScnGapDetectionTimeIntervalMaxMs);
        addPropertyIfNotNull(configBuilder, "snapshot.mode", snapshotMode);
        addPropertyIfNotNull(configBuilder, "database.history", databaseHistory);
        addPropertyIfNotNull(configBuilder, "max.queue.size", maxQueueSize);
        addPropertyIfNotNull(configBuilder, "rac.nodes", racNodes);
        addPropertyIfNotNull(configBuilder, "database.history.kafka.topic", databaseHistoryKafkaTopic);
        addPropertyIfNotNull(configBuilder, "retriable.restart.connector.wait.ms", retriableRestartConnectorWaitMs);
        addPropertyIfNotNull(configBuilder, "snapshot.delay.ms", snapshotDelayMs);
        addPropertyIfNotNull(configBuilder, "log.mining.strategy", logMiningStrategy);
        addPropertyIfNotNull(configBuilder, "database.history.kafka.recovery.attempts", databaseHistoryKafkaRecoveryAttempts);
        addPropertyIfNotNull(configBuilder, "provide.transaction.metadata", provideTransactionMetadata);
        addPropertyIfNotNull(configBuilder, "table.whitelist", tableWhitelist);
        addPropertyIfNotNull(configBuilder, "tombstones.on.delete", tombstonesOnDelete);
        addPropertyIfNotNull(configBuilder, "decimal.handling.mode", decimalHandlingMode);
        addPropertyIfNotNull(configBuilder, "binary.handling.mode", binaryHandlingMode);
        addPropertyIfNotNull(configBuilder, "include.schema.comments", includeSchemaComments);
        addPropertyIfNotNull(configBuilder, "database.history.skip.unparseable.ddl", databaseHistorySkipUnparseableDdl);
        addPropertyIfNotNull(configBuilder, "database.out.server.name", databaseOutServerName);
        addPropertyIfNotNull(configBuilder, "log.mining.archive.log.hours", logMiningArchiveLogHours);
        addPropertyIfNotNull(configBuilder, "log.mining.transaction.retention.hours", logMiningTransactionRetentionHours);
        addPropertyIfNotNull(configBuilder, "snapshot.include.collection.list", snapshotIncludeCollectionList);
        addPropertyIfNotNull(configBuilder, "database.history.file.filename", databaseHistoryFileFilename);
        addPropertyIfNotNull(configBuilder, "log.mining.batch.size.max", logMiningBatchSizeMax);
        addPropertyIfNotNull(configBuilder, "database.pdb.name", databasePdbName);
        addPropertyIfNotNull(configBuilder, "database.connection.adapter", databaseConnectionAdapter);
        addPropertyIfNotNull(configBuilder, "max.queue.size.in.bytes", maxQueueSizeInBytes);
        addPropertyIfNotNull(configBuilder, "log.mining.buffer.type", logMiningBufferType);
        addPropertyIfNotNull(configBuilder, "transaction.topic", transactionTopic);
        addPropertyIfNotNull(configBuilder, "database.url", databaseUrl);
        addPropertyIfNotNull(configBuilder, "time.precision.mode", timePrecisionMode);
        addPropertyIfNotNull(configBuilder, "database.server.name", databaseServerName);
        addPropertyIfNotNull(configBuilder, "event.processing.failure.handling.mode", eventProcessingFailureHandlingMode);
        addPropertyIfNotNull(configBuilder, "snapshot.max.threads", snapshotMaxThreads);
        addPropertyIfNotNull(configBuilder, "database.port", databasePort);
        addPropertyIfNotNull(configBuilder, "log.mining.sleep.time.increment.ms", logMiningSleepTimeIncrementMs);
        addPropertyIfNotNull(configBuilder, "column.exclude.list", columnExcludeList);
        addPropertyIfNotNull(configBuilder, "database.hostname", databaseHostname);
        addPropertyIfNotNull(configBuilder, "log.mining.batch.size.min", logMiningBatchSizeMin);
        addPropertyIfNotNull(configBuilder, "log.mining.batch.size.default", logMiningBatchSizeDefault);
        addPropertyIfNotNull(configBuilder, "snapshot.enhance.predicate.scn", snapshotEnhancePredicateScn);
        addPropertyIfNotNull(configBuilder, "table.include.list", tableIncludeList);
        
        return configBuilder.build();
    }

    @Override
    protected Class configureConnectorClass() {
        return OracleConnector.class;
    }

    @Override
    protected ConfigurationValidation validateConnectorConfiguration() {
        if (isFieldValueNotSet(databasePassword)) {
        	return ConfigurationValidation.notValid("Required field 'databasePassword' must be set.");
        }
        if (isFieldValueNotSet(databaseServerName)) {
        	return ConfigurationValidation.notValid("Required field 'databaseServerName' must be set.");
        }
        return ConfigurationValidation.valid();
    }

    @Override
    public String getConnectorDatabaseType() {
        return "oracle";
    }
}