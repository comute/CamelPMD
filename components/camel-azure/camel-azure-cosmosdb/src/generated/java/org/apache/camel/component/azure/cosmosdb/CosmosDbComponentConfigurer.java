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
public class CosmosDbComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.azure.cosmosdb.CosmosDbConfiguration getOrCreateConfiguration(CosmosDbComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.azure.cosmosdb.CosmosDbConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        CosmosDbComponent target = (CosmosDbComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accountkey":
        case "accountKey": getOrCreateConfiguration(target).setAccountKey(property(camelContext, java.lang.String.class, value)); return true;
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.azure.cosmosdb.CosmosDbConfiguration.class, value)); return true;
        case "cosmosasyncclient":
        case "cosmosAsyncClient": getOrCreateConfiguration(target).setCosmosAsyncClient(property(camelContext, com.azure.cosmos.CosmosAsyncClient.class, value)); return true;
        case "createcontainerifnotexists":
        case "createContainerIfNotExists": getOrCreateConfiguration(target).setCreateContainerIfNotExists(property(camelContext, boolean.class, value)); return true;
        case "createdatabaseifnotexists":
        case "createDatabaseIfNotExists": getOrCreateConfiguration(target).setCreateDatabaseIfNotExists(property(camelContext, boolean.class, value)); return true;
        case "databaseendpoint":
        case "databaseEndpoint": getOrCreateConfiguration(target).setDatabaseEndpoint(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
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
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "configuration": return org.apache.camel.component.azure.cosmosdb.CosmosDbConfiguration.class;
        case "cosmosasyncclient":
        case "cosmosAsyncClient": return com.azure.cosmos.CosmosAsyncClient.class;
        case "createcontainerifnotexists":
        case "createContainerIfNotExists": return boolean.class;
        case "createdatabaseifnotexists":
        case "createDatabaseIfNotExists": return boolean.class;
        case "databaseendpoint":
        case "databaseEndpoint": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        CosmosDbComponent target = (CosmosDbComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accountkey":
        case "accountKey": return getOrCreateConfiguration(target).getAccountKey();
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "configuration": return target.getConfiguration();
        case "cosmosasyncclient":
        case "cosmosAsyncClient": return getOrCreateConfiguration(target).getCosmosAsyncClient();
        case "createcontainerifnotexists":
        case "createContainerIfNotExists": return getOrCreateConfiguration(target).isCreateContainerIfNotExists();
        case "createdatabaseifnotexists":
        case "createDatabaseIfNotExists": return getOrCreateConfiguration(target).isCreateDatabaseIfNotExists();
        case "databaseendpoint":
        case "databaseEndpoint": return getOrCreateConfiguration(target).getDatabaseEndpoint();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        default: return null;
        }
    }
}

