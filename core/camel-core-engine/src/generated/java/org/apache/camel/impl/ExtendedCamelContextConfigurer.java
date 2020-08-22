/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.impl;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.ExtendedCamelContext;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ExtendedCamelContextConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.ExtendedCamelContext target = (org.apache.camel.ExtendedCamelContext) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowuseoriginalmessage":
        case "AllowUseOriginalMessage": target.setAllowUseOriginalMessage(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "applicationcontextclassloader":
        case "ApplicationContextClassLoader": target.setApplicationContextClassLoader(property(camelContext, java.lang.ClassLoader.class, value)); return true;
        case "asyncprocessorawaitmanager":
        case "AsyncProcessorAwaitManager": target.setAsyncProcessorAwaitManager(property(camelContext, org.apache.camel.spi.AsyncProcessorAwaitManager.class, value)); return true;
        case "autostartup":
        case "AutoStartup": target.setAutoStartup(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "backlogtracing":
        case "BacklogTracing": target.setBacklogTracing(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "beanintrospection":
        case "BeanIntrospection": target.setBeanIntrospection(property(camelContext, org.apache.camel.spi.BeanIntrospection.class, value)); return true;
        case "caseinsensitiveheaders":
        case "CaseInsensitiveHeaders": target.setCaseInsensitiveHeaders(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "classresolver":
        case "ClassResolver": target.setClassResolver(property(camelContext, org.apache.camel.spi.ClassResolver.class, value)); return true;
        case "componentnameresolver":
        case "ComponentNameResolver": target.setComponentNameResolver(property(camelContext, org.apache.camel.spi.ComponentNameResolver.class, value)); return true;
        case "componentresolver":
        case "ComponentResolver": target.setComponentResolver(property(camelContext, org.apache.camel.spi.ComponentResolver.class, value)); return true;
        case "configurerresolver":
        case "ConfigurerResolver": target.setConfigurerResolver(property(camelContext, org.apache.camel.spi.ConfigurerResolver.class, value)); return true;
        case "dataformatresolver":
        case "DataFormatResolver": target.setDataFormatResolver(property(camelContext, org.apache.camel.spi.DataFormatResolver.class, value)); return true;
        case "debugger":
        case "Debugger": target.setDebugger(property(camelContext, org.apache.camel.spi.Debugger.class, value)); return true;
        case "debugging":
        case "Debugging": target.setDebugging(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "delayer":
        case "Delayer": target.setDelayer(property(camelContext, java.lang.Long.class, value)); return true;
        case "errorhandlerfactory":
        case "ErrorHandlerFactory": target.setErrorHandlerFactory(property(camelContext, org.apache.camel.ErrorHandlerFactory.class, value)); return true;
        case "eventnotificationapplicable":
        case "EventNotificationApplicable": target.setEventNotificationApplicable(property(camelContext, boolean.class, value)); return true;
        case "executorservicemanager":
        case "ExecutorServiceManager": target.setExecutorServiceManager(property(camelContext, org.apache.camel.spi.ExecutorServiceManager.class, value)); return true;
        case "factoryfinderresolver":
        case "FactoryFinderResolver": target.setFactoryFinderResolver(property(camelContext, org.apache.camel.spi.FactoryFinderResolver.class, value)); return true;
        case "globaloptions":
        case "GlobalOptions": target.setGlobalOptions(property(camelContext, java.util.Map.class, value)); return true;
        case "headersmapfactory":
        case "HeadersMapFactory": target.setHeadersMapFactory(property(camelContext, org.apache.camel.spi.HeadersMapFactory.class, value)); return true;
        case "inflightrepository":
        case "InflightRepository": target.setInflightRepository(property(camelContext, org.apache.camel.spi.InflightRepository.class, value)); return true;
        case "injector":
        case "Injector": target.setInjector(property(camelContext, org.apache.camel.spi.Injector.class, value)); return true;
        case "languageresolver":
        case "LanguageResolver": target.setLanguageResolver(property(camelContext, org.apache.camel.spi.LanguageResolver.class, value)); return true;
        case "loadtypeconverters":
        case "LoadTypeConverters": target.setLoadTypeConverters(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "logexhaustedmessagebody":
        case "LogExhaustedMessageBody": target.setLogExhaustedMessageBody(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "logmask":
        case "LogMask": target.setLogMask(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "mdcloggingkeyspattern":
        case "MDCLoggingKeysPattern": target.setMDCLoggingKeysPattern(property(camelContext, java.lang.String.class, value)); return true;
        case "managementname":
        case "ManagementName": target.setManagementName(property(camelContext, java.lang.String.class, value)); return true;
        case "managementnamestrategy":
        case "ManagementNameStrategy": target.setManagementNameStrategy(property(camelContext, org.apache.camel.spi.ManagementNameStrategy.class, value)); return true;
        case "managementstrategy":
        case "ManagementStrategy": target.setManagementStrategy(property(camelContext, org.apache.camel.spi.ManagementStrategy.class, value)); return true;
        case "messagehistory":
        case "MessageHistory": target.setMessageHistory(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "messagehistoryfactory":
        case "MessageHistoryFactory": target.setMessageHistoryFactory(property(camelContext, org.apache.camel.spi.MessageHistoryFactory.class, value)); return true;
        case "modeljaxbcontextfactory":
        case "ModelJAXBContextFactory": target.setModelJAXBContextFactory(property(camelContext, org.apache.camel.spi.ModelJAXBContextFactory.class, value)); return true;
        case "modeltoxmldumper":
        case "ModelToXMLDumper": target.setModelToXMLDumper(property(camelContext, org.apache.camel.spi.ModelToXMLDumper.class, value)); return true;
        case "name":
        case "Name": target.setName(property(camelContext, java.lang.String.class, value)); return true;
        case "namestrategy":
        case "NameStrategy": target.setNameStrategy(property(camelContext, org.apache.camel.spi.CamelContextNameStrategy.class, value)); return true;
        case "nodeidfactory":
        case "NodeIdFactory": target.setNodeIdFactory(property(camelContext, org.apache.camel.spi.NodeIdFactory.class, value)); return true;
        case "packagescanclassresolver":
        case "PackageScanClassResolver": target.setPackageScanClassResolver(property(camelContext, org.apache.camel.spi.PackageScanClassResolver.class, value)); return true;
        case "packagescanresourceresolver":
        case "PackageScanResourceResolver": target.setPackageScanResourceResolver(property(camelContext, org.apache.camel.spi.PackageScanResourceResolver.class, value)); return true;
        case "processorfactory":
        case "ProcessorFactory": target.setProcessorFactory(property(camelContext, org.apache.camel.spi.ProcessorFactory.class, value)); return true;
        case "propertiescomponent":
        case "PropertiesComponent": target.setPropertiesComponent(property(camelContext, org.apache.camel.spi.PropertiesComponent.class, value)); return true;
        case "reactiveexecutor":
        case "ReactiveExecutor": target.setReactiveExecutor(property(camelContext, org.apache.camel.spi.ReactiveExecutor.class, value)); return true;
        case "registry":
        case "Registry": target.setRegistry(property(camelContext, org.apache.camel.spi.Registry.class, value)); return true;
        case "restbindingjaxbdataformatfactory":
        case "RestBindingJaxbDataFormatFactory": target.setRestBindingJaxbDataFormatFactory(property(camelContext, org.apache.camel.spi.RestBindingJaxbDataFormatFactory.class, value)); return true;
        case "restconfiguration":
        case "RestConfiguration": target.setRestConfiguration(property(camelContext, org.apache.camel.spi.RestConfiguration.class, value)); return true;
        case "restregistry":
        case "RestRegistry": target.setRestRegistry(property(camelContext, org.apache.camel.spi.RestRegistry.class, value)); return true;
        case "routecontroller":
        case "RouteController": target.setRouteController(property(camelContext, org.apache.camel.spi.RouteController.class, value)); return true;
        case "runtimecamelcatalog":
        case "RuntimeCamelCatalog": target.setRuntimeCamelCatalog(property(camelContext, org.apache.camel.catalog.RuntimeCamelCatalog.class, value)); return true;
        case "runtimeendpointregistry":
        case "RuntimeEndpointRegistry": target.setRuntimeEndpointRegistry(property(camelContext, org.apache.camel.spi.RuntimeEndpointRegistry.class, value)); return true;
        case "sslcontextparameters":
        case "SSLContextParameters": target.setSSLContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "shutdownroute":
        case "ShutdownRoute": target.setShutdownRoute(property(camelContext, org.apache.camel.ShutdownRoute.class, value)); return true;
        case "shutdownrunningtask":
        case "ShutdownRunningTask": target.setShutdownRunningTask(property(camelContext, org.apache.camel.ShutdownRunningTask.class, value)); return true;
        case "shutdownstrategy":
        case "ShutdownStrategy": target.setShutdownStrategy(property(camelContext, org.apache.camel.spi.ShutdownStrategy.class, value)); return true;
        case "streamcaching":
        case "StreamCaching": target.setStreamCaching(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "streamcachingstrategy":
        case "StreamCachingStrategy": target.setStreamCachingStrategy(property(camelContext, org.apache.camel.spi.StreamCachingStrategy.class, value)); return true;
        case "tracer":
        case "Tracer": target.setTracer(property(camelContext, org.apache.camel.spi.Tracer.class, value)); return true;
        case "tracing":
        case "Tracing": target.setTracing(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "tracingpattern":
        case "TracingPattern": target.setTracingPattern(property(camelContext, java.lang.String.class, value)); return true;
        case "typeconverterregistry":
        case "TypeConverterRegistry": target.setTypeConverterRegistry(property(camelContext, org.apache.camel.spi.TypeConverterRegistry.class, value)); return true;
        case "typeconverterstatisticsenabled":
        case "TypeConverterStatisticsEnabled": target.setTypeConverterStatisticsEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "unitofworkfactory":
        case "UnitOfWorkFactory": target.setUnitOfWorkFactory(property(camelContext, org.apache.camel.spi.UnitOfWorkFactory.class, value)); return true;
        case "usebreadcrumb":
        case "UseBreadcrumb": target.setUseBreadcrumb(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "usedatatype":
        case "UseDataType": target.setUseDataType(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "usemdclogging":
        case "UseMDCLogging": target.setUseMDCLogging(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "uuidgenerator":
        case "UuidGenerator": target.setUuidGenerator(property(camelContext, org.apache.camel.spi.UuidGenerator.class, value)); return true;
        case "xmlroutesdefinitionloader":
        case "XMLRoutesDefinitionLoader": target.setXMLRoutesDefinitionLoader(property(camelContext, org.apache.camel.spi.XMLRoutesDefinitionLoader.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("AllowUseOriginalMessage", java.lang.Boolean.class);
        answer.put("ApplicationContextClassLoader", java.lang.ClassLoader.class);
        answer.put("AsyncProcessorAwaitManager", org.apache.camel.spi.AsyncProcessorAwaitManager.class);
        answer.put("AutoStartup", java.lang.Boolean.class);
        answer.put("BacklogTracing", java.lang.Boolean.class);
        answer.put("BeanIntrospection", org.apache.camel.spi.BeanIntrospection.class);
        answer.put("CaseInsensitiveHeaders", java.lang.Boolean.class);
        answer.put("ClassResolver", org.apache.camel.spi.ClassResolver.class);
        answer.put("ComponentNameResolver", org.apache.camel.spi.ComponentNameResolver.class);
        answer.put("ComponentResolver", org.apache.camel.spi.ComponentResolver.class);
        answer.put("ConfigurerResolver", org.apache.camel.spi.ConfigurerResolver.class);
        answer.put("DataFormatResolver", org.apache.camel.spi.DataFormatResolver.class);
        answer.put("Debugger", org.apache.camel.spi.Debugger.class);
        answer.put("Debugging", java.lang.Boolean.class);
        answer.put("Delayer", java.lang.Long.class);
        answer.put("ErrorHandlerFactory", org.apache.camel.ErrorHandlerFactory.class);
        answer.put("EventNotificationApplicable", boolean.class);
        answer.put("ExecutorServiceManager", org.apache.camel.spi.ExecutorServiceManager.class);
        answer.put("FactoryFinderResolver", org.apache.camel.spi.FactoryFinderResolver.class);
        answer.put("GlobalOptions", java.util.Map.class);
        answer.put("HeadersMapFactory", org.apache.camel.spi.HeadersMapFactory.class);
        answer.put("InflightRepository", org.apache.camel.spi.InflightRepository.class);
        answer.put("Injector", org.apache.camel.spi.Injector.class);
        answer.put("LanguageResolver", org.apache.camel.spi.LanguageResolver.class);
        answer.put("LoadTypeConverters", java.lang.Boolean.class);
        answer.put("LogExhaustedMessageBody", java.lang.Boolean.class);
        answer.put("LogMask", java.lang.Boolean.class);
        answer.put("MDCLoggingKeysPattern", java.lang.String.class);
        answer.put("ManagementName", java.lang.String.class);
        answer.put("ManagementNameStrategy", org.apache.camel.spi.ManagementNameStrategy.class);
        answer.put("ManagementStrategy", org.apache.camel.spi.ManagementStrategy.class);
        answer.put("MessageHistory", java.lang.Boolean.class);
        answer.put("MessageHistoryFactory", org.apache.camel.spi.MessageHistoryFactory.class);
        answer.put("ModelJAXBContextFactory", org.apache.camel.spi.ModelJAXBContextFactory.class);
        answer.put("ModelToXMLDumper", org.apache.camel.spi.ModelToXMLDumper.class);
        answer.put("Name", java.lang.String.class);
        answer.put("NameStrategy", org.apache.camel.spi.CamelContextNameStrategy.class);
        answer.put("NodeIdFactory", org.apache.camel.spi.NodeIdFactory.class);
        answer.put("PackageScanClassResolver", org.apache.camel.spi.PackageScanClassResolver.class);
        answer.put("PackageScanResourceResolver", org.apache.camel.spi.PackageScanResourceResolver.class);
        answer.put("ProcessorFactory", org.apache.camel.spi.ProcessorFactory.class);
        answer.put("PropertiesComponent", org.apache.camel.spi.PropertiesComponent.class);
        answer.put("ReactiveExecutor", org.apache.camel.spi.ReactiveExecutor.class);
        answer.put("Registry", org.apache.camel.spi.Registry.class);
        answer.put("RestBindingJaxbDataFormatFactory", org.apache.camel.spi.RestBindingJaxbDataFormatFactory.class);
        answer.put("RestConfiguration", org.apache.camel.spi.RestConfiguration.class);
        answer.put("RestRegistry", org.apache.camel.spi.RestRegistry.class);
        answer.put("RouteController", org.apache.camel.spi.RouteController.class);
        answer.put("RuntimeCamelCatalog", org.apache.camel.catalog.RuntimeCamelCatalog.class);
        answer.put("RuntimeEndpointRegistry", org.apache.camel.spi.RuntimeEndpointRegistry.class);
        answer.put("SSLContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        answer.put("ShutdownRoute", org.apache.camel.ShutdownRoute.class);
        answer.put("ShutdownRunningTask", org.apache.camel.ShutdownRunningTask.class);
        answer.put("ShutdownStrategy", org.apache.camel.spi.ShutdownStrategy.class);
        answer.put("StreamCaching", java.lang.Boolean.class);
        answer.put("StreamCachingStrategy", org.apache.camel.spi.StreamCachingStrategy.class);
        answer.put("Tracer", org.apache.camel.spi.Tracer.class);
        answer.put("Tracing", java.lang.Boolean.class);
        answer.put("TracingPattern", java.lang.String.class);
        answer.put("TypeConverterRegistry", org.apache.camel.spi.TypeConverterRegistry.class);
        answer.put("TypeConverterStatisticsEnabled", java.lang.Boolean.class);
        answer.put("UnitOfWorkFactory", org.apache.camel.spi.UnitOfWorkFactory.class);
        answer.put("UseBreadcrumb", java.lang.Boolean.class);
        answer.put("UseDataType", java.lang.Boolean.class);
        answer.put("UseMDCLogging", java.lang.Boolean.class);
        answer.put("UuidGenerator", org.apache.camel.spi.UuidGenerator.class);
        answer.put("XMLRoutesDefinitionLoader", org.apache.camel.spi.XMLRoutesDefinitionLoader.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.ExtendedCamelContext target = (org.apache.camel.ExtendedCamelContext) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowuseoriginalmessage":
        case "AllowUseOriginalMessage": return target.isAllowUseOriginalMessage();
        case "applicationcontextclassloader":
        case "ApplicationContextClassLoader": return target.getApplicationContextClassLoader();
        case "asyncprocessorawaitmanager":
        case "AsyncProcessorAwaitManager": return target.getAsyncProcessorAwaitManager();
        case "autostartup":
        case "AutoStartup": return target.isAutoStartup();
        case "backlogtracing":
        case "BacklogTracing": return target.isBacklogTracing();
        case "beanintrospection":
        case "BeanIntrospection": return target.getBeanIntrospection();
        case "caseinsensitiveheaders":
        case "CaseInsensitiveHeaders": return target.isCaseInsensitiveHeaders();
        case "classresolver":
        case "ClassResolver": return target.getClassResolver();
        case "componentnameresolver":
        case "ComponentNameResolver": return target.getComponentNameResolver();
        case "componentresolver":
        case "ComponentResolver": return target.getComponentResolver();
        case "configurerresolver":
        case "ConfigurerResolver": return target.getConfigurerResolver();
        case "dataformatresolver":
        case "DataFormatResolver": return target.getDataFormatResolver();
        case "debugger":
        case "Debugger": return target.getDebugger();
        case "debugging":
        case "Debugging": return target.isDebugging();
        case "delayer":
        case "Delayer": return target.getDelayer();
        case "errorhandlerfactory":
        case "ErrorHandlerFactory": return target.getErrorHandlerFactory();
        case "eventnotificationapplicable":
        case "EventNotificationApplicable": return target.isEventNotificationApplicable();
        case "executorservicemanager":
        case "ExecutorServiceManager": return target.getExecutorServiceManager();
        case "factoryfinderresolver":
        case "FactoryFinderResolver": return target.getFactoryFinderResolver();
        case "globaloptions":
        case "GlobalOptions": return target.getGlobalOptions();
        case "headersmapfactory":
        case "HeadersMapFactory": return target.getHeadersMapFactory();
        case "inflightrepository":
        case "InflightRepository": return target.getInflightRepository();
        case "injector":
        case "Injector": return target.getInjector();
        case "languageresolver":
        case "LanguageResolver": return target.getLanguageResolver();
        case "loadtypeconverters":
        case "LoadTypeConverters": return target.isLoadTypeConverters();
        case "logexhaustedmessagebody":
        case "LogExhaustedMessageBody": return target.isLogExhaustedMessageBody();
        case "logmask":
        case "LogMask": return target.isLogMask();
        case "mdcloggingkeyspattern":
        case "MDCLoggingKeysPattern": return target.getMDCLoggingKeysPattern();
        case "managementname":
        case "ManagementName": return target.getManagementName();
        case "managementnamestrategy":
        case "ManagementNameStrategy": return target.getManagementNameStrategy();
        case "managementstrategy":
        case "ManagementStrategy": return target.getManagementStrategy();
        case "messagehistory":
        case "MessageHistory": return target.isMessageHistory();
        case "messagehistoryfactory":
        case "MessageHistoryFactory": return target.getMessageHistoryFactory();
        case "modeljaxbcontextfactory":
        case "ModelJAXBContextFactory": return target.getModelJAXBContextFactory();
        case "modeltoxmldumper":
        case "ModelToXMLDumper": return target.getModelToXMLDumper();
        case "name":
        case "Name": return target.getName();
        case "namestrategy":
        case "NameStrategy": return target.getNameStrategy();
        case "nodeidfactory":
        case "NodeIdFactory": return target.getNodeIdFactory();
        case "packagescanclassresolver":
        case "PackageScanClassResolver": return target.getPackageScanClassResolver();
        case "packagescanresourceresolver":
        case "PackageScanResourceResolver": return target.getPackageScanResourceResolver();
        case "processorfactory":
        case "ProcessorFactory": return target.getProcessorFactory();
        case "propertiescomponent":
        case "PropertiesComponent": return target.getPropertiesComponent();
        case "reactiveexecutor":
        case "ReactiveExecutor": return target.getReactiveExecutor();
        case "registry":
        case "Registry": return target.getRegistry();
        case "restbindingjaxbdataformatfactory":
        case "RestBindingJaxbDataFormatFactory": return target.getRestBindingJaxbDataFormatFactory();
        case "restconfiguration":
        case "RestConfiguration": return target.getRestConfiguration();
        case "restregistry":
        case "RestRegistry": return target.getRestRegistry();
        case "routecontroller":
        case "RouteController": return target.getRouteController();
        case "runtimecamelcatalog":
        case "RuntimeCamelCatalog": return target.getRuntimeCamelCatalog();
        case "runtimeendpointregistry":
        case "RuntimeEndpointRegistry": return target.getRuntimeEndpointRegistry();
        case "sslcontextparameters":
        case "SSLContextParameters": return target.getSSLContextParameters();
        case "shutdownroute":
        case "ShutdownRoute": return target.getShutdownRoute();
        case "shutdownrunningtask":
        case "ShutdownRunningTask": return target.getShutdownRunningTask();
        case "shutdownstrategy":
        case "ShutdownStrategy": return target.getShutdownStrategy();
        case "streamcaching":
        case "StreamCaching": return target.isStreamCaching();
        case "streamcachingstrategy":
        case "StreamCachingStrategy": return target.getStreamCachingStrategy();
        case "tracer":
        case "Tracer": return target.getTracer();
        case "tracing":
        case "Tracing": return target.isTracing();
        case "tracingpattern":
        case "TracingPattern": return target.getTracingPattern();
        case "typeconverterregistry":
        case "TypeConverterRegistry": return target.getTypeConverterRegistry();
        case "typeconverterstatisticsenabled":
        case "TypeConverterStatisticsEnabled": return target.isTypeConverterStatisticsEnabled();
        case "unitofworkfactory":
        case "UnitOfWorkFactory": return target.getUnitOfWorkFactory();
        case "usebreadcrumb":
        case "UseBreadcrumb": return target.isUseBreadcrumb();
        case "usedatatype":
        case "UseDataType": return target.isUseDataType();
        case "usemdclogging":
        case "UseMDCLogging": return target.isUseMDCLogging();
        case "uuidgenerator":
        case "UuidGenerator": return target.getUuidGenerator();
        case "xmlroutesdefinitionloader":
        case "XMLRoutesDefinitionLoader": return target.getXMLRoutesDefinitionLoader();
        default: return null;
        }
    }

    @Override
    public Object getOptionNestedType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "globaloptions":
        case "GlobalOptions": return java.lang.String.class;
        default: return null;
        }
    }
}

