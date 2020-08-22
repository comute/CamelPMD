/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.box;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.box.BoxGroupsManagerEndpointConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class BoxGroupsManagerEndpointConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.box.BoxGroupsManagerEndpointConfiguration target = (org.apache.camel.component.box.BoxGroupsManagerEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstokencache":
        case "AccessTokenCache": target.setAccessTokenCache(property(camelContext, com.box.sdk.IAccessTokenCache.class, value)); return true;
        case "apiname":
        case "ApiName": target.setApiName(property(camelContext, org.apache.camel.component.box.internal.BoxApiName.class, value)); return true;
        case "authenticationtype":
        case "AuthenticationType": target.setAuthenticationType(property(camelContext, java.lang.String.class, value)); return true;
        case "clientid":
        case "ClientId": target.setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientsecret":
        case "ClientSecret": target.setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "description":
        case "Description": target.setDescription(property(camelContext, java.lang.String.class, value)); return true;
        case "encryptionalgorithm":
        case "EncryptionAlgorithm": target.setEncryptionAlgorithm(property(camelContext, com.box.sdk.EncryptionAlgorithm.class, value)); return true;
        case "enterpriseid":
        case "EnterpriseId": target.setEnterpriseId(property(camelContext, java.lang.String.class, value)); return true;
        case "externalsyncidentifier":
        case "ExternalSyncIdentifier": target.setExternalSyncIdentifier(property(camelContext, java.lang.String.class, value)); return true;
        case "groupid":
        case "GroupId": target.setGroupId(property(camelContext, java.lang.String.class, value)); return true;
        case "groupinfo":
        case "GroupInfo": target.setGroupInfo(property(camelContext, com.box.sdk.BoxGroup.Info.class, value)); return true;
        case "groupmembershipid":
        case "GroupMembershipId": target.setGroupMembershipId(property(camelContext, java.lang.String.class, value)); return true;
        case "httpparams":
        case "HttpParams": target.setHttpParams(property(camelContext, java.util.Map.class, value)); return true;
        case "info":
        case "Info": target.setInfo(property(camelContext, com.box.sdk.BoxGroupMembership.Info.class, value)); return true;
        case "invitabilitylevel":
        case "InvitabilityLevel": target.setInvitabilityLevel(property(camelContext, java.lang.String.class, value)); return true;
        case "maxcacheentries":
        case "MaxCacheEntries": target.setMaxCacheEntries(property(camelContext, int.class, value)); return true;
        case "memberviewabilitylevel":
        case "MemberViewabilityLevel": target.setMemberViewabilityLevel(property(camelContext, java.lang.String.class, value)); return true;
        case "methodname":
        case "MethodName": target.setMethodName(property(camelContext, java.lang.String.class, value)); return true;
        case "name":
        case "Name": target.setName(property(camelContext, java.lang.String.class, value)); return true;
        case "privatekeyfile":
        case "PrivateKeyFile": target.setPrivateKeyFile(property(camelContext, java.lang.String.class, value)); return true;
        case "privatekeypassword":
        case "PrivateKeyPassword": target.setPrivateKeyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "provenance":
        case "Provenance": target.setProvenance(property(camelContext, java.lang.String.class, value)); return true;
        case "publickeyid":
        case "PublicKeyId": target.setPublicKeyId(property(camelContext, java.lang.String.class, value)); return true;
        case "role":
        case "Role": target.setRole(property(camelContext, com.box.sdk.BoxGroupMembership.Role.class, value)); return true;
        case "sslcontextparameters":
        case "SslContextParameters": target.setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "userid":
        case "UserId": target.setUserId(property(camelContext, java.lang.String.class, value)); return true;
        case "username":
        case "UserName": target.setUserName(property(camelContext, java.lang.String.class, value)); return true;
        case "userpassword":
        case "UserPassword": target.setUserPassword(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("AccessTokenCache", com.box.sdk.IAccessTokenCache.class);
        answer.put("ApiName", org.apache.camel.component.box.internal.BoxApiName.class);
        answer.put("AuthenticationType", java.lang.String.class);
        answer.put("ClientId", java.lang.String.class);
        answer.put("ClientSecret", java.lang.String.class);
        answer.put("Description", java.lang.String.class);
        answer.put("EncryptionAlgorithm", com.box.sdk.EncryptionAlgorithm.class);
        answer.put("EnterpriseId", java.lang.String.class);
        answer.put("ExternalSyncIdentifier", java.lang.String.class);
        answer.put("GroupId", java.lang.String.class);
        answer.put("GroupInfo", com.box.sdk.BoxGroup.Info.class);
        answer.put("GroupMembershipId", java.lang.String.class);
        answer.put("HttpParams", java.util.Map.class);
        answer.put("Info", com.box.sdk.BoxGroupMembership.Info.class);
        answer.put("InvitabilityLevel", java.lang.String.class);
        answer.put("MaxCacheEntries", int.class);
        answer.put("MemberViewabilityLevel", java.lang.String.class);
        answer.put("MethodName", java.lang.String.class);
        answer.put("Name", java.lang.String.class);
        answer.put("PrivateKeyFile", java.lang.String.class);
        answer.put("PrivateKeyPassword", java.lang.String.class);
        answer.put("Provenance", java.lang.String.class);
        answer.put("PublicKeyId", java.lang.String.class);
        answer.put("Role", com.box.sdk.BoxGroupMembership.Role.class);
        answer.put("SslContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        answer.put("UserId", java.lang.String.class);
        answer.put("UserName", java.lang.String.class);
        answer.put("UserPassword", java.lang.String.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.box.BoxGroupsManagerEndpointConfiguration target = (org.apache.camel.component.box.BoxGroupsManagerEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstokencache":
        case "AccessTokenCache": return target.getAccessTokenCache();
        case "apiname":
        case "ApiName": return target.getApiName();
        case "authenticationtype":
        case "AuthenticationType": return target.getAuthenticationType();
        case "clientid":
        case "ClientId": return target.getClientId();
        case "clientsecret":
        case "ClientSecret": return target.getClientSecret();
        case "description":
        case "Description": return target.getDescription();
        case "encryptionalgorithm":
        case "EncryptionAlgorithm": return target.getEncryptionAlgorithm();
        case "enterpriseid":
        case "EnterpriseId": return target.getEnterpriseId();
        case "externalsyncidentifier":
        case "ExternalSyncIdentifier": return target.getExternalSyncIdentifier();
        case "groupid":
        case "GroupId": return target.getGroupId();
        case "groupinfo":
        case "GroupInfo": return target.getGroupInfo();
        case "groupmembershipid":
        case "GroupMembershipId": return target.getGroupMembershipId();
        case "httpparams":
        case "HttpParams": return target.getHttpParams();
        case "info":
        case "Info": return target.getInfo();
        case "invitabilitylevel":
        case "InvitabilityLevel": return target.getInvitabilityLevel();
        case "maxcacheentries":
        case "MaxCacheEntries": return target.getMaxCacheEntries();
        case "memberviewabilitylevel":
        case "MemberViewabilityLevel": return target.getMemberViewabilityLevel();
        case "methodname":
        case "MethodName": return target.getMethodName();
        case "name":
        case "Name": return target.getName();
        case "privatekeyfile":
        case "PrivateKeyFile": return target.getPrivateKeyFile();
        case "privatekeypassword":
        case "PrivateKeyPassword": return target.getPrivateKeyPassword();
        case "provenance":
        case "Provenance": return target.getProvenance();
        case "publickeyid":
        case "PublicKeyId": return target.getPublicKeyId();
        case "role":
        case "Role": return target.getRole();
        case "sslcontextparameters":
        case "SslContextParameters": return target.getSslContextParameters();
        case "userid":
        case "UserId": return target.getUserId();
        case "username":
        case "UserName": return target.getUserName();
        case "userpassword":
        case "UserPassword": return target.getUserPassword();
        default: return null;
        }
    }

    @Override
    public Object getOptionNestedType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "httpparams":
        case "HttpParams": return java.lang.Object.class;
        default: return null;
        }
    }
}

