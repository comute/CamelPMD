/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.azure.cosmosdb;

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
public class CosmosDbEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        CosmosDbEndpoint target = (CosmosDbEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accountkey":
        case "accountKey": target.getConfiguration().setAccountKey(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "clienttelemetryenabled":
        case "clientTelemetryEnabled": target.getConfiguration().setClientTelemetryEnabled(property(camelContext, boolean.class, value)); return true;
        case "connectionsharingacrossclientsenabled":
        case "connectionSharingAcrossClientsEnabled": target.getConfiguration().setConnectionSharingAcrossClientsEnabled(property(camelContext, boolean.class, value)); return true;
        case "consistencylevel":
        case "consistencyLevel": target.getConfiguration().setConsistencyLevel(property(camelContext, com.azure.cosmos.ConsistencyLevel.class, value)); return true;
        case "cosmosasyncclient":
        case "cosmosAsyncClient": target.getConfiguration().setCosmosAsyncClient(property(camelContext, com.azure.cosmos.CosmosAsyncClient.class, value)); return true;
        case "createcontainerifnotexists":
        case "createContainerIfNotExists": target.getConfiguration().setCreateContainerIfNotExists(property(camelContext, boolean.class, value)); return true;
        case "createdatabaseifnotexists":
        case "createDatabaseIfNotExists": target.getConfiguration().setCreateDatabaseIfNotExists(property(camelContext, boolean.class, value)); return true;
        case "databaseendpoint":
        case "databaseEndpoint": target.getConfiguration().setDatabaseEndpoint(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "multiplewriteregionsenabled":
        case "multipleWriteRegionsEnabled": target.getConfiguration().setMultipleWriteRegionsEnabled(property(camelContext, boolean.class, value)); return true;
        case "preferredregions":
        case "preferredRegions": target.getConfiguration().setPreferredRegions(property(camelContext, java.util.List.class, value)); return true;
        case "readrequestsfallbackenabled":
        case "readRequestsFallbackEnabled": target.getConfiguration().setReadRequestsFallbackEnabled(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public String[] getAutowiredNames() {
        return new String[]{"cosmosAsyncClient"};
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accountkey":
        case "accountKey": return java.lang.String.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "clienttelemetryenabled":
        case "clientTelemetryEnabled": return boolean.class;
        case "connectionsharingacrossclientsenabled":
        case "connectionSharingAcrossClientsEnabled": return boolean.class;
        case "consistencylevel":
        case "consistencyLevel": return com.azure.cosmos.ConsistencyLevel.class;
        case "cosmosasyncclient":
        case "cosmosAsyncClient": return com.azure.cosmos.CosmosAsyncClient.class;
        case "createcontainerifnotexists":
        case "createContainerIfNotExists": return boolean.class;
        case "createdatabaseifnotexists":
        case "createDatabaseIfNotExists": return boolean.class;
        case "databaseendpoint":
        case "databaseEndpoint": return java.lang.String.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "multiplewriteregionsenabled":
        case "multipleWriteRegionsEnabled": return boolean.class;
        case "preferredregions":
        case "preferredRegions": return java.util.List.class;
        case "readrequestsfallbackenabled":
        case "readRequestsFallbackEnabled": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        CosmosDbEndpoint target = (CosmosDbEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accountkey":
        case "accountKey": return target.getConfiguration().getAccountKey();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "clienttelemetryenabled":
        case "clientTelemetryEnabled": return target.getConfiguration().isClientTelemetryEnabled();
        case "connectionsharingacrossclientsenabled":
        case "connectionSharingAcrossClientsEnabled": return target.getConfiguration().isConnectionSharingAcrossClientsEnabled();
        case "consistencylevel":
        case "consistencyLevel": return target.getConfiguration().getConsistencyLevel();
        case "cosmosasyncclient":
        case "cosmosAsyncClient": return target.getConfiguration().getCosmosAsyncClient();
        case "createcontainerifnotexists":
        case "createContainerIfNotExists": return target.getConfiguration().isCreateContainerIfNotExists();
        case "createdatabaseifnotexists":
        case "createDatabaseIfNotExists": return target.getConfiguration().isCreateDatabaseIfNotExists();
        case "databaseendpoint":
        case "databaseEndpoint": return target.getConfiguration().getDatabaseEndpoint();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "multiplewriteregionsenabled":
        case "multipleWriteRegionsEnabled": return target.getConfiguration().isMultipleWriteRegionsEnabled();
        case "preferredregions":
        case "preferredRegions": return target.getConfiguration().getPreferredRegions();
        case "readrequestsfallbackenabled":
        case "readRequestsFallbackEnabled": return target.getConfiguration().isReadRequestsFallbackEnabled();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "preferredregions":
        case "preferredRegions": return java.lang.String.class;
        default: return null;
        }
    }
}

