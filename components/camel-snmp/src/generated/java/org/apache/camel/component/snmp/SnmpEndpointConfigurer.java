/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.snmp;

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
public class SnmpEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("host", java.lang.String.class);
        map.put("port", java.lang.Integer.class);
        map.put("oids", org.apache.camel.component.snmp.OIDList.class);
        map.put("protocol", java.lang.String.class);
        map.put("retries", int.class);
        map.put("snmpCommunity", java.lang.String.class);
        map.put("snmpContextEngineId", java.lang.String.class);
        map.put("snmpContextName", java.lang.String.class);
        map.put("snmpVersion", int.class);
        map.put("timeout", int.class);
        map.put("type", org.apache.camel.component.snmp.SnmpActionType.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("delay", long.class);
        map.put("sendEmptyMessageWhenIdle", boolean.class);
        map.put("treeList", boolean.class);
        map.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        map.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        map.put("pollStrategy", org.apache.camel.spi.PollingConsumerPollStrategy.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("synchronous", boolean.class);
        map.put("backoffErrorThreshold", int.class);
        map.put("backoffIdleThreshold", int.class);
        map.put("backoffMultiplier", int.class);
        map.put("greedy", boolean.class);
        map.put("initialDelay", long.class);
        map.put("repeatCount", long.class);
        map.put("runLoggingLevel", org.apache.camel.LoggingLevel.class);
        map.put("scheduledExecutorService", java.util.concurrent.ScheduledExecutorService.class);
        map.put("scheduler", java.lang.Object.class);
        map.put("schedulerProperties", java.util.Map.class);
        map.put("startScheduler", boolean.class);
        map.put("timeUnit", java.util.concurrent.TimeUnit.class);
        map.put("useFixedDelay", boolean.class);
        map.put("authenticationPassphrase", java.lang.String.class);
        map.put("authenticationProtocol", java.lang.String.class);
        map.put("privacyPassphrase", java.lang.String.class);
        map.put("privacyProtocol", java.lang.String.class);
        map.put("securityLevel", int.class);
        map.put("securityName", java.lang.String.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SnmpEndpoint target = (SnmpEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "authenticationpassphrase":
        case "authenticationPassphrase": target.setAuthenticationPassphrase(property(camelContext, java.lang.String.class, value)); return true;
        case "authenticationprotocol":
        case "authenticationProtocol": target.setAuthenticationProtocol(property(camelContext, java.lang.String.class, value)); return true;
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
        case "delay": target.setDelay(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "oids": target.setOids(property(camelContext, org.apache.camel.component.snmp.OIDList.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "privacypassphrase":
        case "privacyPassphrase": target.setPrivacyPassphrase(property(camelContext, java.lang.String.class, value)); return true;
        case "privacyprotocol":
        case "privacyProtocol": target.setPrivacyProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "protocol": target.setProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "retries": target.setRetries(property(camelContext, int.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.Object.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "securitylevel":
        case "securityLevel": target.setSecurityLevel(property(camelContext, int.class, value)); return true;
        case "securityname":
        case "securityName": target.setSecurityName(property(camelContext, java.lang.String.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "snmpcommunity":
        case "snmpCommunity": target.setSnmpCommunity(property(camelContext, java.lang.String.class, value)); return true;
        case "snmpcontextengineid":
        case "snmpContextEngineId": target.setSnmpContextEngineId(property(camelContext, java.lang.String.class, value)); return true;
        case "snmpcontextname":
        case "snmpContextName": target.setSnmpContextName(property(camelContext, java.lang.String.class, value)); return true;
        case "snmpversion":
        case "snmpVersion": target.setSnmpVersion(property(camelContext, int.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "timeout": target.setTimeout(property(camelContext, int.class, value)); return true;
        case "treelist":
        case "treeList": target.setTreeList(property(camelContext, boolean.class, value)); return true;
        case "type": target.setType(property(camelContext, org.apache.camel.component.snmp.SnmpActionType.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        SnmpEndpoint target = (SnmpEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "authenticationpassphrase":
        case "authenticationPassphrase": return target.getAuthenticationPassphrase();
        case "authenticationprotocol":
        case "authenticationProtocol": return target.getAuthenticationProtocol();
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
        case "delay": return target.getDelay();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "greedy": return target.isGreedy();
        case "initialdelay":
        case "initialDelay": return target.getInitialDelay();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "oids": return target.getOids();
        case "pollstrategy":
        case "pollStrategy": return target.getPollStrategy();
        case "privacypassphrase":
        case "privacyPassphrase": return target.getPrivacyPassphrase();
        case "privacyprotocol":
        case "privacyProtocol": return target.getPrivacyProtocol();
        case "protocol": return target.getProtocol();
        case "repeatcount":
        case "repeatCount": return target.getRepeatCount();
        case "retries": return target.getRetries();
        case "runlogginglevel":
        case "runLoggingLevel": return target.getRunLoggingLevel();
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return target.getScheduledExecutorService();
        case "scheduler": return target.getScheduler();
        case "schedulerproperties":
        case "schedulerProperties": return target.getSchedulerProperties();
        case "securitylevel":
        case "securityLevel": return target.getSecurityLevel();
        case "securityname":
        case "securityName": return target.getSecurityName();
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return target.isSendEmptyMessageWhenIdle();
        case "snmpcommunity":
        case "snmpCommunity": return target.getSnmpCommunity();
        case "snmpcontextengineid":
        case "snmpContextEngineId": return target.getSnmpContextEngineId();
        case "snmpcontextname":
        case "snmpContextName": return target.getSnmpContextName();
        case "snmpversion":
        case "snmpVersion": return target.getSnmpVersion();
        case "startscheduler":
        case "startScheduler": return target.isStartScheduler();
        case "synchronous": return target.isSynchronous();
        case "timeunit":
        case "timeUnit": return target.getTimeUnit();
        case "timeout": return target.getTimeout();
        case "treelist":
        case "treeList": return target.isTreeList();
        case "type": return target.getType();
        case "usefixeddelay":
        case "useFixedDelay": return target.isUseFixedDelay();
        default: return null;
        }
    }
}

