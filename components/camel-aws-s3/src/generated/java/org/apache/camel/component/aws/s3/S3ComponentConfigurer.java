/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws.s3;

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
public class S3ComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("amazonS3Client", com.amazonaws.services.s3.AmazonS3.class);
        map.put("autoCreateBucket", boolean.class);
        map.put("autoDiscoverClient", boolean.class);
        map.put("configuration", org.apache.camel.component.aws.s3.S3Configuration.class);
        map.put("endpointConfiguration", com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration.class);
        map.put("pathStyleAccess", boolean.class);
        map.put("policy", java.lang.String.class);
        map.put("proxyHost", java.lang.String.class);
        map.put("proxyPort", java.lang.Integer.class);
        map.put("proxyProtocol", com.amazonaws.Protocol.class);
        map.put("region", java.lang.String.class);
        map.put("useIAMCredentials", boolean.class);
        map.put("encryptionMaterials", com.amazonaws.services.s3.model.EncryptionMaterials.class);
        map.put("useEncryption", boolean.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("deleteAfterRead", boolean.class);
        map.put("delimiter", java.lang.String.class);
        map.put("fileName", java.lang.String.class);
        map.put("includeBody", boolean.class);
        map.put("prefix", java.lang.String.class);
        map.put("autocloseBody", boolean.class);
        map.put("deleteAfterWrite", boolean.class);
        map.put("keyName", java.lang.String.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("multiPartUpload", boolean.class);
        map.put("operation", org.apache.camel.component.aws.s3.S3Operations.class);
        map.put("partSize", long.class);
        map.put("serverSideEncryption", java.lang.String.class);
        map.put("storageClass", java.lang.String.class);
        map.put("awsKMSKeyId", java.lang.String.class);
        map.put("useAwsKMS", boolean.class);
        map.put("accelerateModeEnabled", boolean.class);
        map.put("chunkedEncodingDisabled", boolean.class);
        map.put("dualstackEnabled", boolean.class);
        map.put("forceGlobalBucketAccessEnabled", boolean.class);
        map.put("payloadSigningEnabled", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("accessKey", java.lang.String.class);
        map.put("secretKey", java.lang.String.class);
        ALL_OPTIONS = map;
    }

    private org.apache.camel.component.aws.s3.S3Configuration getOrCreateConfiguration(S3Component target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.aws.s3.S3Configuration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        S3Component target = (S3Component) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acceleratemodeenabled":
        case "accelerateModeEnabled": getOrCreateConfiguration(target).setAccelerateModeEnabled(property(camelContext, boolean.class, value)); return true;
        case "accesskey":
        case "accessKey": getOrCreateConfiguration(target).setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "amazons3client":
        case "amazonS3Client": getOrCreateConfiguration(target).setAmazonS3Client(property(camelContext, com.amazonaws.services.s3.AmazonS3.class, value)); return true;
        case "autocreatebucket":
        case "autoCreateBucket": getOrCreateConfiguration(target).setAutoCreateBucket(property(camelContext, boolean.class, value)); return true;
        case "autodiscoverclient":
        case "autoDiscoverClient": getOrCreateConfiguration(target).setAutoDiscoverClient(property(camelContext, boolean.class, value)); return true;
        case "autoclosebody":
        case "autocloseBody": getOrCreateConfiguration(target).setAutocloseBody(property(camelContext, boolean.class, value)); return true;
        case "awskmskeyid":
        case "awsKMSKeyId": getOrCreateConfiguration(target).setAwsKMSKeyId(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "chunkedencodingdisabled":
        case "chunkedEncodingDisabled": getOrCreateConfiguration(target).setChunkedEncodingDisabled(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.aws.s3.S3Configuration.class, value)); return true;
        case "deleteafterread":
        case "deleteAfterRead": getOrCreateConfiguration(target).setDeleteAfterRead(property(camelContext, boolean.class, value)); return true;
        case "deleteafterwrite":
        case "deleteAfterWrite": getOrCreateConfiguration(target).setDeleteAfterWrite(property(camelContext, boolean.class, value)); return true;
        case "delimiter": getOrCreateConfiguration(target).setDelimiter(property(camelContext, java.lang.String.class, value)); return true;
        case "dualstackenabled":
        case "dualstackEnabled": getOrCreateConfiguration(target).setDualstackEnabled(property(camelContext, boolean.class, value)); return true;
        case "encryptionmaterials":
        case "encryptionMaterials": getOrCreateConfiguration(target).setEncryptionMaterials(property(camelContext, com.amazonaws.services.s3.model.EncryptionMaterials.class, value)); return true;
        case "endpointconfiguration":
        case "endpointConfiguration": getOrCreateConfiguration(target).setEndpointConfiguration(property(camelContext, com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration.class, value)); return true;
        case "filename":
        case "fileName": getOrCreateConfiguration(target).setFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "forceglobalbucketaccessenabled":
        case "forceGlobalBucketAccessEnabled": getOrCreateConfiguration(target).setForceGlobalBucketAccessEnabled(property(camelContext, boolean.class, value)); return true;
        case "includebody":
        case "includeBody": getOrCreateConfiguration(target).setIncludeBody(property(camelContext, boolean.class, value)); return true;
        case "keyname":
        case "keyName": getOrCreateConfiguration(target).setKeyName(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "multipartupload":
        case "multiPartUpload": getOrCreateConfiguration(target).setMultiPartUpload(property(camelContext, boolean.class, value)); return true;
        case "operation": getOrCreateConfiguration(target).setOperation(property(camelContext, org.apache.camel.component.aws.s3.S3Operations.class, value)); return true;
        case "partsize":
        case "partSize": getOrCreateConfiguration(target).setPartSize(property(camelContext, long.class, value)); return true;
        case "pathstyleaccess":
        case "pathStyleAccess": getOrCreateConfiguration(target).setPathStyleAccess(property(camelContext, boolean.class, value)); return true;
        case "payloadsigningenabled":
        case "payloadSigningEnabled": getOrCreateConfiguration(target).setPayloadSigningEnabled(property(camelContext, boolean.class, value)); return true;
        case "policy": getOrCreateConfiguration(target).setPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "prefix": getOrCreateConfiguration(target).setPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyhost":
        case "proxyHost": getOrCreateConfiguration(target).setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": getOrCreateConfiguration(target).setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol":
        case "proxyProtocol": getOrCreateConfiguration(target).setProxyProtocol(property(camelContext, com.amazonaws.Protocol.class, value)); return true;
        case "region": getOrCreateConfiguration(target).setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey":
        case "secretKey": getOrCreateConfiguration(target).setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "serversideencryption":
        case "serverSideEncryption": getOrCreateConfiguration(target).setServerSideEncryption(property(camelContext, java.lang.String.class, value)); return true;
        case "storageclass":
        case "storageClass": getOrCreateConfiguration(target).setStorageClass(property(camelContext, java.lang.String.class, value)); return true;
        case "useawskms":
        case "useAwsKMS": getOrCreateConfiguration(target).setUseAwsKMS(property(camelContext, boolean.class, value)); return true;
        case "useencryption":
        case "useEncryption": getOrCreateConfiguration(target).setUseEncryption(property(camelContext, boolean.class, value)); return true;
        case "useiamcredentials":
        case "useIAMCredentials": getOrCreateConfiguration(target).setUseIAMCredentials(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        S3Component target = (S3Component) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acceleratemodeenabled":
        case "accelerateModeEnabled": return getOrCreateConfiguration(target).isAccelerateModeEnabled();
        case "accesskey":
        case "accessKey": return getOrCreateConfiguration(target).getAccessKey();
        case "amazons3client":
        case "amazonS3Client": return getOrCreateConfiguration(target).getAmazonS3Client();
        case "autocreatebucket":
        case "autoCreateBucket": return getOrCreateConfiguration(target).isAutoCreateBucket();
        case "autodiscoverclient":
        case "autoDiscoverClient": return getOrCreateConfiguration(target).isAutoDiscoverClient();
        case "autoclosebody":
        case "autocloseBody": return getOrCreateConfiguration(target).isAutocloseBody();
        case "awskmskeyid":
        case "awsKMSKeyId": return getOrCreateConfiguration(target).getAwsKMSKeyId();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "chunkedencodingdisabled":
        case "chunkedEncodingDisabled": return getOrCreateConfiguration(target).isChunkedEncodingDisabled();
        case "configuration": return target.getConfiguration();
        case "deleteafterread":
        case "deleteAfterRead": return getOrCreateConfiguration(target).isDeleteAfterRead();
        case "deleteafterwrite":
        case "deleteAfterWrite": return getOrCreateConfiguration(target).isDeleteAfterWrite();
        case "delimiter": return getOrCreateConfiguration(target).getDelimiter();
        case "dualstackenabled":
        case "dualstackEnabled": return getOrCreateConfiguration(target).isDualstackEnabled();
        case "encryptionmaterials":
        case "encryptionMaterials": return getOrCreateConfiguration(target).getEncryptionMaterials();
        case "endpointconfiguration":
        case "endpointConfiguration": return getOrCreateConfiguration(target).getEndpointConfiguration();
        case "filename":
        case "fileName": return getOrCreateConfiguration(target).getFileName();
        case "forceglobalbucketaccessenabled":
        case "forceGlobalBucketAccessEnabled": return getOrCreateConfiguration(target).isForceGlobalBucketAccessEnabled();
        case "includebody":
        case "includeBody": return getOrCreateConfiguration(target).isIncludeBody();
        case "keyname":
        case "keyName": return getOrCreateConfiguration(target).getKeyName();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "multipartupload":
        case "multiPartUpload": return getOrCreateConfiguration(target).isMultiPartUpload();
        case "operation": return getOrCreateConfiguration(target).getOperation();
        case "partsize":
        case "partSize": return getOrCreateConfiguration(target).getPartSize();
        case "pathstyleaccess":
        case "pathStyleAccess": return getOrCreateConfiguration(target).isPathStyleAccess();
        case "payloadsigningenabled":
        case "payloadSigningEnabled": return getOrCreateConfiguration(target).isPayloadSigningEnabled();
        case "policy": return getOrCreateConfiguration(target).getPolicy();
        case "prefix": return getOrCreateConfiguration(target).getPrefix();
        case "proxyhost":
        case "proxyHost": return getOrCreateConfiguration(target).getProxyHost();
        case "proxyport":
        case "proxyPort": return getOrCreateConfiguration(target).getProxyPort();
        case "proxyprotocol":
        case "proxyProtocol": return getOrCreateConfiguration(target).getProxyProtocol();
        case "region": return getOrCreateConfiguration(target).getRegion();
        case "secretkey":
        case "secretKey": return getOrCreateConfiguration(target).getSecretKey();
        case "serversideencryption":
        case "serverSideEncryption": return getOrCreateConfiguration(target).getServerSideEncryption();
        case "storageclass":
        case "storageClass": return getOrCreateConfiguration(target).getStorageClass();
        case "useawskms":
        case "useAwsKMS": return getOrCreateConfiguration(target).isUseAwsKMS();
        case "useencryption":
        case "useEncryption": return getOrCreateConfiguration(target).isUseEncryption();
        case "useiamcredentials":
        case "useIAMCredentials": return getOrCreateConfiguration(target).isUseIAMCredentials();
        default: return null;
        }
    }
}

