/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.google.drive;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.google.drive.DriveChildrenEndpointConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class DriveChildrenEndpointConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("AccessToken", java.lang.String.class);
        map.put("ApiName", org.apache.camel.component.google.drive.internal.GoogleDriveApiName.class);
        map.put("ApplicationName", java.lang.String.class);
        map.put("ChildId", java.lang.String.class);
        map.put("ClientId", java.lang.String.class);
        map.put("ClientSecret", java.lang.String.class);
        map.put("Content", com.google.api.services.drive.model.ChildReference.class);
        map.put("FolderId", java.lang.String.class);
        map.put("MethodName", java.lang.String.class);
        map.put("RefreshToken", java.lang.String.class);
        map.put("Scopes", java.util.List.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addConfigurerClearer(DriveChildrenEndpointConfigurationConfigurer::clearConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.google.drive.DriveChildrenEndpointConfiguration target = (org.apache.camel.component.google.drive.DriveChildrenEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "AccessToken": target.setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "apiname":
        case "ApiName": target.setApiName(property(camelContext, org.apache.camel.component.google.drive.internal.GoogleDriveApiName.class, value)); return true;
        case "applicationname":
        case "ApplicationName": target.setApplicationName(property(camelContext, java.lang.String.class, value)); return true;
        case "childid":
        case "ChildId": target.setChildId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientid":
        case "ClientId": target.setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientsecret":
        case "ClientSecret": target.setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "content":
        case "Content": target.setContent(property(camelContext, com.google.api.services.drive.model.ChildReference.class, value)); return true;
        case "folderid":
        case "FolderId": target.setFolderId(property(camelContext, java.lang.String.class, value)); return true;
        case "methodname":
        case "MethodName": target.setMethodName(property(camelContext, java.lang.String.class, value)); return true;
        case "refreshtoken":
        case "RefreshToken": target.setRefreshToken(property(camelContext, java.lang.String.class, value)); return true;
        case "scopes":
        case "Scopes": target.setScopes(property(camelContext, java.util.List.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    public static void clearBootstrapConfigurers() {
    }

    public static void clearConfigurers() {
        ALL_OPTIONS.clear();
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.google.drive.DriveChildrenEndpointConfiguration target = (org.apache.camel.component.google.drive.DriveChildrenEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "AccessToken": return target.getAccessToken();
        case "apiname":
        case "ApiName": return target.getApiName();
        case "applicationname":
        case "ApplicationName": return target.getApplicationName();
        case "childid":
        case "ChildId": return target.getChildId();
        case "clientid":
        case "ClientId": return target.getClientId();
        case "clientsecret":
        case "ClientSecret": return target.getClientSecret();
        case "content":
        case "Content": return target.getContent();
        case "folderid":
        case "FolderId": return target.getFolderId();
        case "methodname":
        case "MethodName": return target.getMethodName();
        case "refreshtoken":
        case "RefreshToken": return target.getRefreshToken();
        case "scopes":
        case "Scopes": return target.getScopes();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "scopes":
        case "Scopes": return java.lang.String.class;
        default: return null;
        }
    }
}

