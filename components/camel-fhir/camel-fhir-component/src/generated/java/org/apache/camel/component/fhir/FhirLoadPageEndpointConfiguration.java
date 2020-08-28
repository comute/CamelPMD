
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.fhir;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for org.apache.camel.component.fhir.api.FhirLoadPage
 */
@UriParams
@Configurer
public final class FhirLoadPageEndpointConfiguration extends FhirConfiguration {
    @UriParam
    private org.hl7.fhir.instance.model.api.IBaseBundle bundle;
    @UriParam
    private java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters,Object> extraParameters;
    @UriParam
    private Class<org.hl7.fhir.instance.model.api.IBaseBundle> returnType;
    @UriParam
    private String url;

    public org.hl7.fhir.instance.model.api.IBaseBundle getBundle() {
        return bundle;
    }

    public void setBundle(org.hl7.fhir.instance.model.api.IBaseBundle bundle) {
        this.bundle = bundle;
    }

    public java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters,Object> getExtraParameters() {
        return extraParameters;
    }

    public void setExtraParameters(java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters,Object> extraParameters) {
        this.extraParameters = extraParameters;
    }

    public Class<org.hl7.fhir.instance.model.api.IBaseBundle> getReturnType() {
        return returnType;
    }

    public void setReturnType(Class<org.hl7.fhir.instance.model.api.IBaseBundle> returnType) {
        this.returnType = returnType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
