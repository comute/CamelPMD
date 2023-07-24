/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.google.storage;

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
public class GoogleCloudStorageComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.google.storage.GoogleCloudStorageConfiguration getOrCreateConfiguration(GoogleCloudStorageComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.google.storage.GoogleCloudStorageConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        GoogleCloudStorageComponent target = (GoogleCloudStorageComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autocreatebucket":
        case "autoCreateBucket": getOrCreateConfiguration(target).setAutoCreateBucket(property(camelContext, boolean.class, value)); return true;
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.google.storage.GoogleCloudStorageConfiguration.class, value)); return true;
        case "deleteafterread":
        case "deleteAfterRead": getOrCreateConfiguration(target).setDeleteAfterRead(property(camelContext, boolean.class, value)); return true;
        case "destinationbucket":
        case "destinationBucket": getOrCreateConfiguration(target).setDestinationBucket(property(camelContext, java.lang.String.class, value)); return true;
        case "downloadfilename":
        case "downloadFileName": getOrCreateConfiguration(target).setDownloadFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "filter": getOrCreateConfiguration(target).setFilter(property(camelContext, java.lang.String.class, value)); return true;
        case "healthcheckconsumerenabled":
        case "healthCheckConsumerEnabled": target.setHealthCheckConsumerEnabled(property(camelContext, boolean.class, value)); return true;
        case "healthcheckenabled":
        case "healthCheckEnabled": target.setHealthCheckEnabled(property(camelContext, boolean.class, value)); return true;
        case "healthcheckproducerenabled":
        case "healthCheckProducerEnabled": target.setHealthCheckProducerEnabled(property(camelContext, boolean.class, value)); return true;
        case "includebody":
        case "includeBody": getOrCreateConfiguration(target).setIncludeBody(property(camelContext, boolean.class, value)); return true;
        case "includefolders":
        case "includeFolders": getOrCreateConfiguration(target).setIncludeFolders(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "moveafterread":
        case "moveAfterRead": getOrCreateConfiguration(target).setMoveAfterRead(property(camelContext, boolean.class, value)); return true;
        case "objectname":
        case "objectName": getOrCreateConfiguration(target).setObjectName(property(camelContext, java.lang.String.class, value)); return true;
        case "operation": getOrCreateConfiguration(target).setOperation(property(camelContext, org.apache.camel.component.google.storage.GoogleCloudStorageOperations.class, value)); return true;
        case "serviceaccountkey":
        case "serviceAccountKey": getOrCreateConfiguration(target).setServiceAccountKey(property(camelContext, java.lang.String.class, value)); return true;
        case "storageclass":
        case "storageClass": getOrCreateConfiguration(target).setStorageClass(property(camelContext, com.google.cloud.storage.StorageClass.class, value)); return true;
        case "storageclient":
        case "storageClient": getOrCreateConfiguration(target).setStorageClient(property(camelContext, com.google.cloud.storage.Storage.class, value)); return true;
        case "storagelocation":
        case "storageLocation": getOrCreateConfiguration(target).setStorageLocation(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public String[] getAutowiredNames() {
        return new String[]{"storageClient"};
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autocreatebucket":
        case "autoCreateBucket": return boolean.class;
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "configuration": return org.apache.camel.component.google.storage.GoogleCloudStorageConfiguration.class;
        case "deleteafterread":
        case "deleteAfterRead": return boolean.class;
        case "destinationbucket":
        case "destinationBucket": return java.lang.String.class;
        case "downloadfilename":
        case "downloadFileName": return java.lang.String.class;
        case "filter": return java.lang.String.class;
        case "healthcheckconsumerenabled":
        case "healthCheckConsumerEnabled": return boolean.class;
        case "healthcheckenabled":
        case "healthCheckEnabled": return boolean.class;
        case "healthcheckproducerenabled":
        case "healthCheckProducerEnabled": return boolean.class;
        case "includebody":
        case "includeBody": return boolean.class;
        case "includefolders":
        case "includeFolders": return boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "moveafterread":
        case "moveAfterRead": return boolean.class;
        case "objectname":
        case "objectName": return java.lang.String.class;
        case "operation": return org.apache.camel.component.google.storage.GoogleCloudStorageOperations.class;
        case "serviceaccountkey":
        case "serviceAccountKey": return java.lang.String.class;
        case "storageclass":
        case "storageClass": return com.google.cloud.storage.StorageClass.class;
        case "storageclient":
        case "storageClient": return com.google.cloud.storage.Storage.class;
        case "storagelocation":
        case "storageLocation": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        GoogleCloudStorageComponent target = (GoogleCloudStorageComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autocreatebucket":
        case "autoCreateBucket": return getOrCreateConfiguration(target).isAutoCreateBucket();
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "configuration": return target.getConfiguration();
        case "deleteafterread":
        case "deleteAfterRead": return getOrCreateConfiguration(target).isDeleteAfterRead();
        case "destinationbucket":
        case "destinationBucket": return getOrCreateConfiguration(target).getDestinationBucket();
        case "downloadfilename":
        case "downloadFileName": return getOrCreateConfiguration(target).getDownloadFileName();
        case "filter": return getOrCreateConfiguration(target).getFilter();
        case "healthcheckconsumerenabled":
        case "healthCheckConsumerEnabled": return target.isHealthCheckConsumerEnabled();
        case "healthcheckenabled":
        case "healthCheckEnabled": return target.isHealthCheckEnabled();
        case "healthcheckproducerenabled":
        case "healthCheckProducerEnabled": return target.isHealthCheckProducerEnabled();
        case "includebody":
        case "includeBody": return getOrCreateConfiguration(target).isIncludeBody();
        case "includefolders":
        case "includeFolders": return getOrCreateConfiguration(target).isIncludeFolders();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "moveafterread":
        case "moveAfterRead": return getOrCreateConfiguration(target).isMoveAfterRead();
        case "objectname":
        case "objectName": return getOrCreateConfiguration(target).getObjectName();
        case "operation": return getOrCreateConfiguration(target).getOperation();
        case "serviceaccountkey":
        case "serviceAccountKey": return getOrCreateConfiguration(target).getServiceAccountKey();
        case "storageclass":
        case "storageClass": return getOrCreateConfiguration(target).getStorageClass();
        case "storageclient":
        case "storageClient": return getOrCreateConfiguration(target).getStorageClient();
        case "storagelocation":
        case "storageLocation": return getOrCreateConfiguration(target).getStorageLocation();
        default: return null;
        }
    }
}

