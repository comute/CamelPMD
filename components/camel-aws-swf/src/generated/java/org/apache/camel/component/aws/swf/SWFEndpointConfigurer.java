/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws.swf;

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
public class SWFEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SWFEndpoint target = (SWFEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": target.getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "activitylist":
        case "activityList": target.getConfiguration().setActivityList(property(camelContext, java.lang.String.class, value)); return true;
        case "activityschedulingoptions":
        case "activitySchedulingOptions": target.getConfiguration().setActivitySchedulingOptions(property(camelContext, com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions.class, value)); return true;
        case "activitythreadpoolsize":
        case "activityThreadPoolSize": target.getConfiguration().setActivityThreadPoolSize(property(camelContext, int.class, value)); return true;
        case "activitytypeexecutionoptions":
        case "activityTypeExecutionOptions": target.getConfiguration().setActivityTypeExecutionOptions(property(camelContext, com.amazonaws.services.simpleworkflow.flow.worker.ActivityTypeExecutionOptions.class, value)); return true;
        case "activitytyperegistrationoptions":
        case "activityTypeRegistrationOptions": target.getConfiguration().setActivityTypeRegistrationOptions(property(camelContext, com.amazonaws.services.simpleworkflow.flow.worker.ActivityTypeRegistrationOptions.class, value)); return true;
        case "amazonswclient":
        case "amazonSWClient": target.getConfiguration().setAmazonSWClient(property(camelContext, com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "childpolicy":
        case "childPolicy": target.getConfiguration().setChildPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "clientconfigurationparameters":
        case "clientConfigurationParameters": target.getConfiguration().setClientConfigurationParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "dataconverter":
        case "dataConverter": target.getConfiguration().setDataConverter(property(camelContext, com.amazonaws.services.simpleworkflow.flow.DataConverter.class, value)); return true;
        case "domainname":
        case "domainName": target.getConfiguration().setDomainName(property(camelContext, java.lang.String.class, value)); return true;
        case "eventname":
        case "eventName": target.getConfiguration().setEventName(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "executionstarttoclosetimeout":
        case "executionStartToCloseTimeout": target.getConfiguration().setExecutionStartToCloseTimeout(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": target.getConfiguration().setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "region": target.getConfiguration().setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "swclientparameters":
        case "sWClientParameters": target.getConfiguration().setSWClientParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "secretkey":
        case "secretKey": target.getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "signalname":
        case "signalName": target.getConfiguration().setSignalName(property(camelContext, java.lang.String.class, value)); return true;
        case "startworkflowoptionsparameters":
        case "startWorkflowOptionsParameters": target.getConfiguration().setStartWorkflowOptionsParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "stateresulttype":
        case "stateResultType": target.getConfiguration().setStateResultType(property(camelContext, java.lang.String.class, value)); return true;
        case "taskstarttoclosetimeout":
        case "taskStartToCloseTimeout": target.getConfiguration().setTaskStartToCloseTimeout(property(camelContext, java.lang.String.class, value)); return true;
        case "terminationdetails":
        case "terminationDetails": target.getConfiguration().setTerminationDetails(property(camelContext, java.lang.String.class, value)); return true;
        case "terminationreason":
        case "terminationReason": target.getConfiguration().setTerminationReason(property(camelContext, java.lang.String.class, value)); return true;
        case "version": target.getConfiguration().setVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "workflowlist":
        case "workflowList": target.getConfiguration().setWorkflowList(property(camelContext, java.lang.String.class, value)); return true;
        case "workflowtyperegistrationoptions":
        case "workflowTypeRegistrationOptions": target.getConfiguration().setWorkflowTypeRegistrationOptions(property(camelContext, com.amazonaws.services.simpleworkflow.flow.WorkflowTypeRegistrationOptions.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return java.lang.String.class;
        case "activitylist":
        case "activityList": return java.lang.String.class;
        case "activityschedulingoptions":
        case "activitySchedulingOptions": return com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions.class;
        case "activitythreadpoolsize":
        case "activityThreadPoolSize": return int.class;
        case "activitytypeexecutionoptions":
        case "activityTypeExecutionOptions": return com.amazonaws.services.simpleworkflow.flow.worker.ActivityTypeExecutionOptions.class;
        case "activitytyperegistrationoptions":
        case "activityTypeRegistrationOptions": return com.amazonaws.services.simpleworkflow.flow.worker.ActivityTypeRegistrationOptions.class;
        case "amazonswclient":
        case "amazonSWClient": return com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "childpolicy":
        case "childPolicy": return java.lang.String.class;
        case "clientconfigurationparameters":
        case "clientConfigurationParameters": return java.util.Map.class;
        case "dataconverter":
        case "dataConverter": return com.amazonaws.services.simpleworkflow.flow.DataConverter.class;
        case "domainname":
        case "domainName": return java.lang.String.class;
        case "eventname":
        case "eventName": return java.lang.String.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "executionstarttoclosetimeout":
        case "executionStartToCloseTimeout": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "operation": return java.lang.String.class;
        case "region": return java.lang.String.class;
        case "swclientparameters":
        case "sWClientParameters": return java.util.Map.class;
        case "secretkey":
        case "secretKey": return java.lang.String.class;
        case "signalname":
        case "signalName": return java.lang.String.class;
        case "startworkflowoptionsparameters":
        case "startWorkflowOptionsParameters": return java.util.Map.class;
        case "stateresulttype":
        case "stateResultType": return java.lang.String.class;
        case "taskstarttoclosetimeout":
        case "taskStartToCloseTimeout": return java.lang.String.class;
        case "terminationdetails":
        case "terminationDetails": return java.lang.String.class;
        case "terminationreason":
        case "terminationReason": return java.lang.String.class;
        case "version": return java.lang.String.class;
        case "workflowlist":
        case "workflowList": return java.lang.String.class;
        case "workflowtyperegistrationoptions":
        case "workflowTypeRegistrationOptions": return com.amazonaws.services.simpleworkflow.flow.WorkflowTypeRegistrationOptions.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        SWFEndpoint target = (SWFEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return target.getConfiguration().getAccessKey();
        case "activitylist":
        case "activityList": return target.getConfiguration().getActivityList();
        case "activityschedulingoptions":
        case "activitySchedulingOptions": return target.getConfiguration().getActivitySchedulingOptions();
        case "activitythreadpoolsize":
        case "activityThreadPoolSize": return target.getConfiguration().getActivityThreadPoolSize();
        case "activitytypeexecutionoptions":
        case "activityTypeExecutionOptions": return target.getConfiguration().getActivityTypeExecutionOptions();
        case "activitytyperegistrationoptions":
        case "activityTypeRegistrationOptions": return target.getConfiguration().getActivityTypeRegistrationOptions();
        case "amazonswclient":
        case "amazonSWClient": return target.getConfiguration().getAmazonSWClient();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "childpolicy":
        case "childPolicy": return target.getConfiguration().getChildPolicy();
        case "clientconfigurationparameters":
        case "clientConfigurationParameters": return target.getConfiguration().getClientConfigurationParameters();
        case "dataconverter":
        case "dataConverter": return target.getConfiguration().getDataConverter();
        case "domainname":
        case "domainName": return target.getConfiguration().getDomainName();
        case "eventname":
        case "eventName": return target.getConfiguration().getEventName();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "executionstarttoclosetimeout":
        case "executionStartToCloseTimeout": return target.getConfiguration().getExecutionStartToCloseTimeout();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "operation": return target.getConfiguration().getOperation();
        case "region": return target.getConfiguration().getRegion();
        case "swclientparameters":
        case "sWClientParameters": return target.getConfiguration().getSWClientParameters();
        case "secretkey":
        case "secretKey": return target.getConfiguration().getSecretKey();
        case "signalname":
        case "signalName": return target.getConfiguration().getSignalName();
        case "startworkflowoptionsparameters":
        case "startWorkflowOptionsParameters": return target.getConfiguration().getStartWorkflowOptionsParameters();
        case "stateresulttype":
        case "stateResultType": return target.getConfiguration().getStateResultType();
        case "taskstarttoclosetimeout":
        case "taskStartToCloseTimeout": return target.getConfiguration().getTaskStartToCloseTimeout();
        case "terminationdetails":
        case "terminationDetails": return target.getConfiguration().getTerminationDetails();
        case "terminationreason":
        case "terminationReason": return target.getConfiguration().getTerminationReason();
        case "version": return target.getConfiguration().getVersion();
        case "workflowlist":
        case "workflowList": return target.getConfiguration().getWorkflowList();
        case "workflowtyperegistrationoptions":
        case "workflowTypeRegistrationOptions": return target.getConfiguration().getWorkflowTypeRegistrationOptions();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "clientconfigurationparameters":
        case "clientConfigurationParameters": return java.lang.Object.class;
        case "swclientparameters":
        case "sWClientParameters": return java.lang.Object.class;
        case "startworkflowoptionsparameters":
        case "startWorkflowOptionsParameters": return java.lang.Object.class;
        default: return null;
        }
    }
}

