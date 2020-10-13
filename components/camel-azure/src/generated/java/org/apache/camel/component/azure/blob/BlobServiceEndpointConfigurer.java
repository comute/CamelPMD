/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.azure.blob;

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
public class BlobServiceEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("containerOrBlobUri", java.lang.String.class);
        map.put("azureBlobClient", com.microsoft.azure.storage.blob.CloudBlob.class);
        map.put("blobOffset", java.lang.Long.class);
        map.put("blobType", org.apache.camel.component.azure.blob.BlobType.class);
        map.put("closeStreamAfterRead", boolean.class);
        map.put("credentials", com.microsoft.azure.storage.StorageCredentials.class);
        map.put("dataLength", java.lang.Long.class);
        map.put("fileDir", java.lang.String.class);
        map.put("publicForRead", boolean.class);
        map.put("streamReadSize", int.class);
        map.put("validateClientURI", boolean.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        map.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        map.put("blobMetadata", java.util.Map.class);
        map.put("blobPrefix", java.lang.String.class);
        map.put("closeStreamAfterWrite", boolean.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("operation", org.apache.camel.component.azure.blob.BlobServiceOperations.class);
        map.put("streamWriteSize", int.class);
        map.put("useFlatListing", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("synchronous", boolean.class);
        map.put("credentialsAccountKey", java.lang.String.class);
        map.put("credentialsAccountName", java.lang.String.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        BlobServiceEndpoint target = (BlobServiceEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "azureblobclient":
        case "azureBlobClient": target.getConfiguration().setAzureBlobClient(property(camelContext, com.microsoft.azure.storage.blob.CloudBlob.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "blobmetadata":
        case "blobMetadata": target.getConfiguration().setBlobMetadata(property(camelContext, java.util.Map.class, value)); return true;
        case "bloboffset":
        case "blobOffset": target.getConfiguration().setBlobOffset(property(camelContext, java.lang.Long.class, value)); return true;
        case "blobprefix":
        case "blobPrefix": target.getConfiguration().setBlobPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "blobtype":
        case "blobType": target.getConfiguration().setBlobType(property(camelContext, org.apache.camel.component.azure.blob.BlobType.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "closestreamafterread":
        case "closeStreamAfterRead": target.getConfiguration().setCloseStreamAfterRead(property(camelContext, boolean.class, value)); return true;
        case "closestreamafterwrite":
        case "closeStreamAfterWrite": target.getConfiguration().setCloseStreamAfterWrite(property(camelContext, boolean.class, value)); return true;
        case "credentials": target.getConfiguration().setCredentials(property(camelContext, com.microsoft.azure.storage.StorageCredentials.class, value)); return true;
        case "credentialsaccountkey":
        case "credentialsAccountKey": target.getConfiguration().setCredentialsAccountKey(property(camelContext, java.lang.String.class, value)); return true;
        case "credentialsaccountname":
        case "credentialsAccountName": target.getConfiguration().setCredentialsAccountName(property(camelContext, java.lang.String.class, value)); return true;
        case "datalength":
        case "dataLength": target.getConfiguration().setDataLength(property(camelContext, java.lang.Long.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "filedir":
        case "fileDir": target.getConfiguration().setFileDir(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": target.getConfiguration().setOperation(property(camelContext, org.apache.camel.component.azure.blob.BlobServiceOperations.class, value)); return true;
        case "publicforread":
        case "publicForRead": target.getConfiguration().setPublicForRead(property(camelContext, boolean.class, value)); return true;
        case "streamreadsize":
        case "streamReadSize": target.getConfiguration().setStreamReadSize(property(camelContext, int.class, value)); return true;
        case "streamwritesize":
        case "streamWriteSize": target.getConfiguration().setStreamWriteSize(property(camelContext, int.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "useflatlisting":
        case "useFlatListing": target.getConfiguration().setUseFlatListing(property(camelContext, boolean.class, value)); return true;
        case "validateclienturi":
        case "validateClientURI": target.getConfiguration().setValidateClientURI(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        BlobServiceEndpoint target = (BlobServiceEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "azureblobclient":
        case "azureBlobClient": return target.getConfiguration().getAzureBlobClient();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "blobmetadata":
        case "blobMetadata": return target.getConfiguration().getBlobMetadata();
        case "bloboffset":
        case "blobOffset": return target.getConfiguration().getBlobOffset();
        case "blobprefix":
        case "blobPrefix": return target.getConfiguration().getBlobPrefix();
        case "blobtype":
        case "blobType": return target.getConfiguration().getBlobType();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "closestreamafterread":
        case "closeStreamAfterRead": return target.getConfiguration().isCloseStreamAfterRead();
        case "closestreamafterwrite":
        case "closeStreamAfterWrite": return target.getConfiguration().isCloseStreamAfterWrite();
        case "credentials": return target.getConfiguration().getCredentials();
        case "credentialsaccountkey":
        case "credentialsAccountKey": return target.getConfiguration().getCredentialsAccountKey();
        case "credentialsaccountname":
        case "credentialsAccountName": return target.getConfiguration().getCredentialsAccountName();
        case "datalength":
        case "dataLength": return target.getConfiguration().getDataLength();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "filedir":
        case "fileDir": return target.getConfiguration().getFileDir();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "operation": return target.getConfiguration().getOperation();
        case "publicforread":
        case "publicForRead": return target.getConfiguration().isPublicForRead();
        case "streamreadsize":
        case "streamReadSize": return target.getConfiguration().getStreamReadSize();
        case "streamwritesize":
        case "streamWriteSize": return target.getConfiguration().getStreamWriteSize();
        case "synchronous": return target.isSynchronous();
        case "useflatlisting":
        case "useFlatListing": return target.getConfiguration().isUseFlatListing();
        case "validateclienturi":
        case "validateClientURI": return target.getConfiguration().isValidateClientURI();
        default: return null;
        }
    }
}

