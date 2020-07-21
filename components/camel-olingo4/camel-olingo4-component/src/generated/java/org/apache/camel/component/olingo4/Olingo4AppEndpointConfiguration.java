
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.olingo4;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for org.apache.camel.component.olingo4.api.Olingo4App
 */
@UriParams
@Configurer
public final class Olingo4AppEndpointConfiguration extends Olingo4Configuration {

    @UriParam
    private Object data;

    @UriParam
    private org.apache.olingo.commons.api.edm.Edm edm;

    @UriParam
    private java.util.Map<String,String> endpointHttpHeaders;

    @UriParam
    private String keyPredicate;

    @UriParam
    private java.util.Map<String,String> queryParams;

    @UriParam
    private String resourcePath;

    @UriParam
    private org.apache.camel.component.olingo4.api.Olingo4ResponseHandler responseHandler;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public org.apache.olingo.commons.api.edm.Edm getEdm() {
        return edm;
    }

    public void setEdm(org.apache.olingo.commons.api.edm.Edm edm) {
        this.edm = edm;
    }

    public java.util.Map<String,String> getEndpointHttpHeaders() {
        return endpointHttpHeaders;
    }

    public void setEndpointHttpHeaders(java.util.Map<String,String> endpointHttpHeaders) {
        this.endpointHttpHeaders = endpointHttpHeaders;
    }

    public String getKeyPredicate() {
        return keyPredicate;
    }

    public void setKeyPredicate(String keyPredicate) {
        this.keyPredicate = keyPredicate;
    }

    public java.util.Map<String,String> getQueryParams() {
        return queryParams;
    }

    public void setQueryParams(java.util.Map<String,String> queryParams) {
        this.queryParams = queryParams;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public org.apache.camel.component.olingo4.api.Olingo4ResponseHandler getResponseHandler() {
        return responseHandler;
    }

    public void setResponseHandler(org.apache.camel.component.olingo4.api.Olingo4ResponseHandler responseHandler) {
        this.responseHandler = responseHandler;
    }
}
