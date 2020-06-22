/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.olingo4;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.olingo4.Olingo4AppEndpointConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class Olingo4AppEndpointConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.olingo4.Olingo4AppEndpointConfiguration target = (org.apache.camel.component.olingo4.Olingo4AppEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "ApiName": target.setApiName(property(camelContext, org.apache.camel.component.olingo4.internal.Olingo4ApiName.class, value)); return true;
        case "connecttimeout":
        case "ConnectTimeout": target.setConnectTimeout(property(camelContext, int.class, value)); return true;
        case "contenttype":
        case "ContentType": target.setContentType(property(camelContext, java.lang.String.class, value)); return true;
        case "data":
        case "Data": target.setData(property(camelContext, java.lang.Object.class, value)); return true;
        case "edm":
        case "Edm": target.setEdm(property(camelContext, org.apache.olingo.commons.api.edm.Edm.class, value)); return true;
        case "endpointhttpheaders":
        case "EndpointHttpHeaders": target.setEndpointHttpHeaders(property(camelContext, java.util.Map.class, value)); return true;
        case "filteralreadyseen":
        case "FilterAlreadySeen": target.setFilterAlreadySeen(property(camelContext, boolean.class, value)); return true;
        case "httpasyncclientbuilder":
        case "HttpAsyncClientBuilder": target.setHttpAsyncClientBuilder(property(camelContext, org.apache.http.impl.nio.client.HttpAsyncClientBuilder.class, value)); return true;
        case "httpclientbuilder":
        case "HttpClientBuilder": target.setHttpClientBuilder(property(camelContext, org.apache.http.impl.client.HttpClientBuilder.class, value)); return true;
        case "httpheaders":
        case "HttpHeaders": target.setHttpHeaders(property(camelContext, java.util.Map.class, value)); return true;
        case "keypredicate":
        case "KeyPredicate": target.setKeyPredicate(property(camelContext, java.lang.String.class, value)); return true;
        case "methodname":
        case "MethodName": target.setMethodName(property(camelContext, java.lang.String.class, value)); return true;
        case "proxy":
        case "Proxy": target.setProxy(property(camelContext, org.apache.http.HttpHost.class, value)); return true;
        case "queryparams":
        case "QueryParams": target.setQueryParams(property(camelContext, java.util.Map.class, value)); return true;
        case "resourcepath":
        case "ResourcePath": target.setResourcePath(property(camelContext, java.lang.String.class, value)); return true;
        case "responsehandler":
        case "ResponseHandler": target.setResponseHandler(property(camelContext, org.apache.camel.component.olingo4.api.Olingo4ResponseHandler.class, value)); return true;
        case "serviceuri":
        case "ServiceUri": target.setServiceUri(property(camelContext, java.lang.String.class, value)); return true;
        case "sockettimeout":
        case "SocketTimeout": target.setSocketTimeout(property(camelContext, int.class, value)); return true;
        case "splitresult":
        case "SplitResult": target.setSplitResult(property(camelContext, boolean.class, value)); return true;
        case "sslcontextparameters":
        case "SslContextParameters": target.setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("ApiName", org.apache.camel.component.olingo4.internal.Olingo4ApiName.class);
        answer.put("ConnectTimeout", int.class);
        answer.put("ContentType", java.lang.String.class);
        answer.put("Data", java.lang.Object.class);
        answer.put("Edm", org.apache.olingo.commons.api.edm.Edm.class);
        answer.put("EndpointHttpHeaders", java.util.Map.class);
        answer.put("FilterAlreadySeen", boolean.class);
        answer.put("HttpAsyncClientBuilder", org.apache.http.impl.nio.client.HttpAsyncClientBuilder.class);
        answer.put("HttpClientBuilder", org.apache.http.impl.client.HttpClientBuilder.class);
        answer.put("HttpHeaders", java.util.Map.class);
        answer.put("KeyPredicate", java.lang.String.class);
        answer.put("MethodName", java.lang.String.class);
        answer.put("Proxy", org.apache.http.HttpHost.class);
        answer.put("QueryParams", java.util.Map.class);
        answer.put("ResourcePath", java.lang.String.class);
        answer.put("ResponseHandler", org.apache.camel.component.olingo4.api.Olingo4ResponseHandler.class);
        answer.put("ServiceUri", java.lang.String.class);
        answer.put("SocketTimeout", int.class);
        answer.put("SplitResult", boolean.class);
        answer.put("SslContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.olingo4.Olingo4AppEndpointConfiguration target = (org.apache.camel.component.olingo4.Olingo4AppEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "ApiName": return target.getApiName();
        case "connecttimeout":
        case "ConnectTimeout": return target.getConnectTimeout();
        case "contenttype":
        case "ContentType": return target.getContentType();
        case "data":
        case "Data": return target.getData();
        case "edm":
        case "Edm": return target.getEdm();
        case "endpointhttpheaders":
        case "EndpointHttpHeaders": return target.getEndpointHttpHeaders();
        case "filteralreadyseen":
        case "FilterAlreadySeen": return target.isFilterAlreadySeen();
        case "httpasyncclientbuilder":
        case "HttpAsyncClientBuilder": return target.getHttpAsyncClientBuilder();
        case "httpclientbuilder":
        case "HttpClientBuilder": return target.getHttpClientBuilder();
        case "httpheaders":
        case "HttpHeaders": return target.getHttpHeaders();
        case "keypredicate":
        case "KeyPredicate": return target.getKeyPredicate();
        case "methodname":
        case "MethodName": return target.getMethodName();
        case "proxy":
        case "Proxy": return target.getProxy();
        case "queryparams":
        case "QueryParams": return target.getQueryParams();
        case "resourcepath":
        case "ResourcePath": return target.getResourcePath();
        case "responsehandler":
        case "ResponseHandler": return target.getResponseHandler();
        case "serviceuri":
        case "ServiceUri": return target.getServiceUri();
        case "sockettimeout":
        case "SocketTimeout": return target.getSocketTimeout();
        case "splitresult":
        case "SplitResult": return target.isSplitResult();
        case "sslcontextparameters":
        case "SslContextParameters": return target.getSslContextParameters();
        default: return null;
        }
    }
}

