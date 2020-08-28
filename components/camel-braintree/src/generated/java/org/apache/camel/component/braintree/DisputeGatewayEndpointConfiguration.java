
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.braintree;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.braintreegateway.DisputeGateway
 */
@UriParams
@Configurer
public final class DisputeGatewayEndpointConfiguration extends BraintreeConfiguration {
    @UriParam(description = "The content of the text evidence for the dispute")
    private String content;
    @UriParam(description = "The dispute id to add text evidence to")
    private String disputeId;
    @UriParam(description = "The document id of a previously uploaded document")
    private String documentId;
    @UriParam(description = "The evidence id to remove")
    private String evidenceId;
    @UriParam(description = "The file evidence request for the dispute")
    private com.braintreegateway.FileEvidenceRequest fileEvidenceRequest;
    @UriParam(description = "The dispute id to accept")
    private String id;
    @UriParam(description = "The query for what disputes to find")
    private com.braintreegateway.DisputeSearchRequest query;
    @UriParam(description = "The text evidence request for the dispute")
    private com.braintreegateway.TextEvidenceRequest textEvidenceRequest;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDisputeId() {
        return disputeId;
    }

    public void setDisputeId(String disputeId) {
        this.disputeId = disputeId;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getEvidenceId() {
        return evidenceId;
    }

    public void setEvidenceId(String evidenceId) {
        this.evidenceId = evidenceId;
    }

    public com.braintreegateway.FileEvidenceRequest getFileEvidenceRequest() {
        return fileEvidenceRequest;
    }

    public void setFileEvidenceRequest(com.braintreegateway.FileEvidenceRequest fileEvidenceRequest) {
        this.fileEvidenceRequest = fileEvidenceRequest;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public com.braintreegateway.DisputeSearchRequest getQuery() {
        return query;
    }

    public void setQuery(com.braintreegateway.DisputeSearchRequest query) {
        this.query = query;
    }

    public com.braintreegateway.TextEvidenceRequest getTextEvidenceRequest() {
        return textEvidenceRequest;
    }

    public void setTextEvidenceRequest(com.braintreegateway.TextEvidenceRequest textEvidenceRequest) {
        this.textEvidenceRequest = textEvidenceRequest;
    }
}
