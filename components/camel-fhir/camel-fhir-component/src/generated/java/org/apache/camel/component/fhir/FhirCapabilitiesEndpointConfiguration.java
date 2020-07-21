
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.fhir;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for org.apache.camel.component.fhir.api.FhirCapabilities
 */
@UriParams
@Configurer
public final class FhirCapabilitiesEndpointConfiguration extends FhirConfiguration {

    @UriParam
    private java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters,Object> extraParameters;

    @UriParam
    private Class<org.hl7.fhir.instance.model.api.IBaseConformance> type;

    public java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters,Object> getExtraParameters() {
        return extraParameters;
    }

    public void setExtraParameters(java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters,Object> extraParameters) {
        this.extraParameters = extraParameters;
    }

    public Class<org.hl7.fhir.instance.model.api.IBaseConformance> getType() {
        return type;
    }

    public void setType(Class<org.hl7.fhir.instance.model.api.IBaseConformance> type) {
        this.type = type;
    }
}
