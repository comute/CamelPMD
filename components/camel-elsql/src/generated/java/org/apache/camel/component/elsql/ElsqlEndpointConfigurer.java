/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.elsql;

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
public class ElsqlEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        ElsqlEndpoint target = (ElsqlEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allownamedparameters":
        case "allowNamedParameters": target.setAllowNamedParameters(property(camelContext, boolean.class, value)); return true;
        case "alwayspopulatestatement":
        case "alwaysPopulateStatement": target.setAlwaysPopulateStatement(property(camelContext, boolean.class, value)); return true;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "batch": target.setBatch(property(camelContext, boolean.class, value)); return true;
        case "breakbatchonconsumefail":
        case "breakBatchOnConsumeFail": target.setBreakBatchOnConsumeFail(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "datasource":
        case "dataSource": target.setDataSource(property(camelContext, javax.sql.DataSource.class, value)); return true;
        case "datasourceref":
        case "dataSourceRef": target.setDataSourceRef(property(camelContext, java.lang.String.class, value)); return true;
        case "databasevendor":
        case "databaseVendor": target.setDatabaseVendor(property(camelContext, org.apache.camel.component.elsql.ElSqlDatabaseVendor.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "elsqlconfig":
        case "elSqlConfig": target.setElSqlConfig(property(camelContext, com.opengamma.elsql.ElSqlConfig.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "expectedupdatecount":
        case "expectedUpdateCount": target.setExpectedUpdateCount(property(camelContext, int.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": target.setMaxMessagesPerPoll(property(camelContext, int.class, value)); return true;
        case "noop": target.setNoop(property(camelContext, boolean.class, value)); return true;
        case "onconsume":
        case "onConsume": target.setOnConsume(property(camelContext, java.lang.String.class, value)); return true;
        case "onconsumebatchcomplete":
        case "onConsumeBatchComplete": target.setOnConsumeBatchComplete(property(camelContext, java.lang.String.class, value)); return true;
        case "onconsumefailed":
        case "onConsumeFailed": target.setOnConsumeFailed(property(camelContext, java.lang.String.class, value)); return true;
        case "outputclass":
        case "outputClass": target.setOutputClass(property(camelContext, java.lang.String.class, value)); return true;
        case "outputheader":
        case "outputHeader": target.setOutputHeader(property(camelContext, java.lang.String.class, value)); return true;
        case "outputtype":
        case "outputType": target.setOutputType(property(camelContext, org.apache.camel.component.sql.SqlOutputType.class, value)); return true;
        case "parameterscount":
        case "parametersCount": target.setParametersCount(property(camelContext, int.class, value)); return true;
        case "placeholder": target.setPlaceholder(property(camelContext, java.lang.String.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "preparestatementstrategy":
        case "prepareStatementStrategy": target.setPrepareStatementStrategy(property(camelContext, org.apache.camel.component.sql.SqlPrepareStatementStrategy.class, value)); return true;
        case "processingstrategy":
        case "processingStrategy": target.setProcessingStrategy(property(camelContext, org.apache.camel.component.sql.SqlProcessingStrategy.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "routeemptyresultset":
        case "routeEmptyResultSet": target.setRouteEmptyResultSet(property(camelContext, boolean.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.Object.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "separator": target.setSeparator(property(camelContext, char.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "templateoptions":
        case "templateOptions": target.setTemplateOptions(property(camelContext, java.util.Map.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "transacted": target.setTransacted(property(camelContext, boolean.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "useiterator":
        case "useIterator": target.setUseIterator(property(camelContext, boolean.class, value)); return true;
        case "usemessagebodyforsql":
        case "useMessageBodyForSql": target.setUseMessageBodyForSql(property(camelContext, boolean.class, value)); return true;
        case "useplaceholder":
        case "usePlaceholder": target.setUsePlaceholder(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("allowNamedParameters", boolean.class);
        answer.put("alwaysPopulateStatement", boolean.class);
        answer.put("backoffErrorThreshold", int.class);
        answer.put("backoffIdleThreshold", int.class);
        answer.put("backoffMultiplier", int.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("batch", boolean.class);
        answer.put("breakBatchOnConsumeFail", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("dataSource", javax.sql.DataSource.class);
        answer.put("dataSourceRef", java.lang.String.class);
        answer.put("databaseVendor", org.apache.camel.component.elsql.ElSqlDatabaseVendor.class);
        answer.put("delay", long.class);
        answer.put("elSqlConfig", com.opengamma.elsql.ElSqlConfig.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("expectedUpdateCount", int.class);
        answer.put("greedy", boolean.class);
        answer.put("initialDelay", long.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("maxMessagesPerPoll", int.class);
        answer.put("noop", boolean.class);
        answer.put("onConsume", java.lang.String.class);
        answer.put("onConsumeBatchComplete", java.lang.String.class);
        answer.put("onConsumeFailed", java.lang.String.class);
        answer.put("outputClass", java.lang.String.class);
        answer.put("outputHeader", java.lang.String.class);
        answer.put("outputType", org.apache.camel.component.sql.SqlOutputType.class);
        answer.put("parametersCount", int.class);
        answer.put("placeholder", java.lang.String.class);
        answer.put("pollStrategy", org.apache.camel.spi.PollingConsumerPollStrategy.class);
        answer.put("prepareStatementStrategy", org.apache.camel.component.sql.SqlPrepareStatementStrategy.class);
        answer.put("processingStrategy", org.apache.camel.component.sql.SqlProcessingStrategy.class);
        answer.put("repeatCount", long.class);
        answer.put("routeEmptyResultSet", boolean.class);
        answer.put("runLoggingLevel", org.apache.camel.LoggingLevel.class);
        answer.put("scheduledExecutorService", java.util.concurrent.ScheduledExecutorService.class);
        answer.put("scheduler", java.lang.Object.class);
        answer.put("schedulerProperties", java.util.Map.class);
        answer.put("sendEmptyMessageWhenIdle", boolean.class);
        answer.put("separator", char.class);
        answer.put("startScheduler", boolean.class);
        answer.put("synchronous", boolean.class);
        answer.put("templateOptions", java.util.Map.class);
        answer.put("timeUnit", java.util.concurrent.TimeUnit.class);
        answer.put("transacted", boolean.class);
        answer.put("useFixedDelay", boolean.class);
        answer.put("useIterator", boolean.class);
        answer.put("useMessageBodyForSql", boolean.class);
        answer.put("usePlaceholder", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        ElsqlEndpoint target = (ElsqlEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allownamedparameters":
        case "allowNamedParameters": return target.isAllowNamedParameters();
        case "alwayspopulatestatement":
        case "alwaysPopulateStatement": return target.isAlwaysPopulateStatement();
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return target.getBackoffErrorThreshold();
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return target.getBackoffIdleThreshold();
        case "backoffmultiplier":
        case "backoffMultiplier": return target.getBackoffMultiplier();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "batch": return target.isBatch();
        case "breakbatchonconsumefail":
        case "breakBatchOnConsumeFail": return target.isBreakBatchOnConsumeFail();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "datasource":
        case "dataSource": return target.getDataSource();
        case "datasourceref":
        case "dataSourceRef": return target.getDataSourceRef();
        case "databasevendor":
        case "databaseVendor": return target.getDatabaseVendor();
        case "delay": return target.getDelay();
        case "elsqlconfig":
        case "elSqlConfig": return target.getElSqlConfig();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "expectedupdatecount":
        case "expectedUpdateCount": return target.getExpectedUpdateCount();
        case "greedy": return target.isGreedy();
        case "initialdelay":
        case "initialDelay": return target.getInitialDelay();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": return target.getMaxMessagesPerPoll();
        case "noop": return target.isNoop();
        case "onconsume":
        case "onConsume": return target.getOnConsume();
        case "onconsumebatchcomplete":
        case "onConsumeBatchComplete": return target.getOnConsumeBatchComplete();
        case "onconsumefailed":
        case "onConsumeFailed": return target.getOnConsumeFailed();
        case "outputclass":
        case "outputClass": return target.getOutputClass();
        case "outputheader":
        case "outputHeader": return target.getOutputHeader();
        case "outputtype":
        case "outputType": return target.getOutputType();
        case "parameterscount":
        case "parametersCount": return target.getParametersCount();
        case "placeholder": return target.getPlaceholder();
        case "pollstrategy":
        case "pollStrategy": return target.getPollStrategy();
        case "preparestatementstrategy":
        case "prepareStatementStrategy": return target.getPrepareStatementStrategy();
        case "processingstrategy":
        case "processingStrategy": return target.getProcessingStrategy();
        case "repeatcount":
        case "repeatCount": return target.getRepeatCount();
        case "routeemptyresultset":
        case "routeEmptyResultSet": return target.isRouteEmptyResultSet();
        case "runlogginglevel":
        case "runLoggingLevel": return target.getRunLoggingLevel();
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return target.getScheduledExecutorService();
        case "scheduler": return target.getScheduler();
        case "schedulerproperties":
        case "schedulerProperties": return target.getSchedulerProperties();
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return target.isSendEmptyMessageWhenIdle();
        case "separator": return target.getSeparator();
        case "startscheduler":
        case "startScheduler": return target.isStartScheduler();
        case "synchronous": return target.isSynchronous();
        case "templateoptions":
        case "templateOptions": return target.getTemplateOptions();
        case "timeunit":
        case "timeUnit": return target.getTimeUnit();
        case "transacted": return target.isTransacted();
        case "usefixeddelay":
        case "useFixedDelay": return target.isUseFixedDelay();
        case "useiterator":
        case "useIterator": return target.isUseIterator();
        case "usemessagebodyforsql":
        case "useMessageBodyForSql": return target.isUseMessageBodyForSql();
        case "useplaceholder":
        case "usePlaceholder": return target.isUsePlaceholder();
        default: return null;
        }
    }
}

