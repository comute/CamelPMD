
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.braintree;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.braintreegateway.AddressGateway
 */
@UriParams
@Configurer
public final class AddressGatewayEndpointConfiguration extends BraintreeConfiguration {

    @UriParam
    private String customerId;

    @UriParam
    private String id;

    @UriParam
    private com.braintreegateway.AddressRequest request;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public com.braintreegateway.AddressRequest getRequest() {
        return request;
    }

    public void setRequest(com.braintreegateway.AddressRequest request) {
        this.request = request;
    }
}
