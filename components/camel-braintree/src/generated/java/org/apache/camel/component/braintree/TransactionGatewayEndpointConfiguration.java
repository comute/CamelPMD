
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.braintree;

import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.braintreegateway.TransactionGateway}.
 */
@ApiParams(apiName = "transaction", 
           description = "Provides methods to interact with Transactions",
           apiMethods = {@ApiMethod(methodName = "cancelRelease", description="Cancels a pending release of a transaction with the given id from escrow", signatures={"com.braintreegateway.Result<com.braintreegateway.Transaction> cancelRelease(String id)"}), @ApiMethod(methodName = "cloneTransaction", signatures={"com.braintreegateway.Result<com.braintreegateway.Transaction> cloneTransaction(String id, com.braintreegateway.TransactionCloneRequest request)"}), @ApiMethod(methodName = "credit", description="Creates a credit Transaction", signatures={"com.braintreegateway.Result<com.braintreegateway.Transaction> credit(com.braintreegateway.TransactionRequest request)"}), @ApiMethod(methodName = "find", description="Finds a Transaction by id", signatures={"com.braintreegateway.Transaction find(String id)"}), @ApiMethod(methodName = "holdInEscrow", description="Holds the transaction with the given id for escrow", signatures={"com.braintreegateway.Result<com.braintreegateway.Transaction> holdInEscrow(String id)"}), @ApiMethod(methodName = "refund", description="Refunds all or part of a previous sale Transaction", signatures={"com.braintreegateway.Result<com.braintreegateway.Transaction> refund(String id)", "com.braintreegateway.Result<com.braintreegateway.Transaction> refund(String id, java.math.BigDecimal amount)", "com.braintreegateway.Result<com.braintreegateway.Transaction> refund(String id, com.braintreegateway.TransactionRefundRequest request)"}), @ApiMethod(methodName = "releaseFromEscrow", description="Submits the transaction with the given id for release", signatures={"com.braintreegateway.Result<com.braintreegateway.Transaction> releaseFromEscrow(String id)"}), @ApiMethod(methodName = "sale", description="Creates a sale Transaction", signatures={"com.braintreegateway.Result<com.braintreegateway.Transaction> sale(com.braintreegateway.TransactionRequest request)"}), @ApiMethod(methodName = "search", description="Finds all Transactions that match the query and returns a ResourceCollection", signatures={"com.braintreegateway.ResourceCollection<com.braintreegateway.Transaction> search(com.braintreegateway.TransactionSearchRequest query)"}), @ApiMethod(methodName = "submitForPartialSettlement", description="Submits a partial settlement transaction for the given id", signatures={"com.braintreegateway.Result<com.braintreegateway.Transaction> submitForPartialSettlement(String id, java.math.BigDecimal amount)", "com.braintreegateway.Result<com.braintreegateway.Transaction> submitForPartialSettlement(String id, com.braintreegateway.TransactionRequest request)"}), @ApiMethod(methodName = "submitForSettlement", description="Submits the transaction with the given id to be settled along with a TransactionRequest object", signatures={"com.braintreegateway.Result<com.braintreegateway.Transaction> submitForSettlement(String id)", "com.braintreegateway.Result<com.braintreegateway.Transaction> submitForSettlement(String id, java.math.BigDecimal amount)", "com.braintreegateway.Result<com.braintreegateway.Transaction> submitForSettlement(String id, com.braintreegateway.TransactionRequest request)"}), @ApiMethod(methodName = "updateDetails", description="Updates details for a transaction that has been submitted for settlement", signatures={"com.braintreegateway.Result<com.braintreegateway.Transaction> updateDetails(String id, com.braintreegateway.TransactionRequest request)"}), @ApiMethod(methodName = "voidTransaction", description="Voids the transaction with the given id", signatures={"com.braintreegateway.Result<com.braintreegateway.Transaction> voidTransaction(String id)"})}, aliases = {})
@UriParams
@Configurer(extended = true)
public final class TransactionGatewayEndpointConfiguration extends BraintreeConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "refund"), @ApiMethod(methodName = "submitForPartialSettlement", description="Of the partial settlement"), @ApiMethod(methodName = "submitForSettlement", description="To settle. must be less than or equal to the authorization amount.")})
    private java.math.BigDecimal amount;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "cloneTransaction")})
    private com.braintreegateway.TransactionCloneRequest cloneRequest;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "cancelRelease", description="Of the transaction to cancel release from escrow of"), @ApiMethod(methodName = "cloneTransaction"), @ApiMethod(methodName = "find", description="The id of the Transaction"), @ApiMethod(methodName = "holdInEscrow", description="Of the transaction to hold for escrow"), @ApiMethod(methodName = "refund"), @ApiMethod(methodName = "releaseFromEscrow", description="Of the transaction to submit for release"), @ApiMethod(methodName = "submitForPartialSettlement", description="Of the transaction to add the partial settlement transaction for"), @ApiMethod(methodName = "submitForSettlement", description="Of the transaction to submit for settlement"), @ApiMethod(methodName = "updateDetails", description="Of the transaction to update the details for"), @ApiMethod(methodName = "voidTransaction", description="Of the transaction to void")})
    private String id;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "search", description="The search query")})
    private com.braintreegateway.TransactionSearchRequest query;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "refund")})
    private com.braintreegateway.TransactionRefundRequest refundRequest;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "credit", description="The request"), @ApiMethod(methodName = "sale", description="The request"), @ApiMethod(methodName = "submitForPartialSettlement", description="The request"), @ApiMethod(methodName = "submitForSettlement", description="The request"), @ApiMethod(methodName = "updateDetails", description="The request")})
    private com.braintreegateway.TransactionRequest request;

    public java.math.BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }

    public com.braintreegateway.TransactionCloneRequest getCloneRequest() {
        return cloneRequest;
    }

    public void setCloneRequest(com.braintreegateway.TransactionCloneRequest cloneRequest) {
        this.cloneRequest = cloneRequest;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public com.braintreegateway.TransactionSearchRequest getQuery() {
        return query;
    }

    public void setQuery(com.braintreegateway.TransactionSearchRequest query) {
        this.query = query;
    }

    public com.braintreegateway.TransactionRefundRequest getRefundRequest() {
        return refundRequest;
    }

    public void setRefundRequest(com.braintreegateway.TransactionRefundRequest refundRequest) {
        this.refundRequest = refundRequest;
    }

    public com.braintreegateway.TransactionRequest getRequest() {
        return request;
    }

    public void setRequest(com.braintreegateway.TransactionRequest request) {
        this.request = request;
    }
}
