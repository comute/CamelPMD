/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.web3j;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class Web3jEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        Web3jEndpoint target = (Web3jEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "address": target.getConfiguration().setAddress(property(camelContext, java.lang.String.class, value)); return true;
        case "addresses": target.getConfiguration().setAddresses(property(camelContext, java.util.List.class, value)); return true;
        case "atblock":
        case "atBlock": target.getConfiguration().setAtBlock(property(camelContext, java.lang.String.class, value)); return true;
        case "blockhash":
        case "blockHash": target.getConfiguration().setBlockHash(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "clientid":
        case "clientId": target.getConfiguration().setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "data": target.getConfiguration().setData(property(camelContext, java.lang.String.class, value)); return true;
        case "databasename":
        case "databaseName": target.getConfiguration().setDatabaseName(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "filterid":
        case "filterId": target.getConfiguration().setFilterId(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "fromaddress":
        case "fromAddress": target.getConfiguration().setFromAddress(property(camelContext, java.lang.String.class, value)); return true;
        case "fromblock":
        case "fromBlock": target.getConfiguration().setFromBlock(property(camelContext, java.lang.String.class, value)); return true;
        case "fulltransactionobjects":
        case "fullTransactionObjects": target.getConfiguration().setFullTransactionObjects(property(camelContext, boolean.class, value)); return true;
        case "gaslimit":
        case "gasLimit": target.getConfiguration().setGasLimit(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "gasprice":
        case "gasPrice": target.getConfiguration().setGasPrice(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "hashrate": target.getConfiguration().setHashrate(property(camelContext, java.lang.String.class, value)); return true;
        case "headerpowhash":
        case "headerPowHash": target.getConfiguration().setHeaderPowHash(property(camelContext, java.lang.String.class, value)); return true;
        case "index": target.getConfiguration().setIndex(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "keyname":
        case "keyName": target.getConfiguration().setKeyName(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "mixdigest":
        case "mixDigest": target.getConfiguration().setMixDigest(property(camelContext, java.lang.String.class, value)); return true;
        case "nonce": target.getConfiguration().setNonce(property(camelContext, java.lang.String.class, value)); return true;
        case "operation": target.getConfiguration().setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "position": target.getConfiguration().setPosition(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "priority": target.getConfiguration().setPriority(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "privatefor":
        case "privateFor": target.getConfiguration().setPrivateFor(property(camelContext, java.util.List.class, value)); return true;
        case "quorumapi":
        case "quorumAPI": target.getConfiguration().setQuorumAPI(property(camelContext, boolean.class, value)); return true;
        case "sha3hashofdatatosign":
        case "sha3HashOfDataToSign": target.getConfiguration().setSha3HashOfDataToSign(property(camelContext, java.lang.String.class, value)); return true;
        case "signedtransactiondata":
        case "signedTransactionData": target.getConfiguration().setSignedTransactionData(property(camelContext, java.lang.String.class, value)); return true;
        case "sourcecode":
        case "sourceCode": target.getConfiguration().setSourceCode(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "toaddress":
        case "toAddress": target.getConfiguration().setToAddress(property(camelContext, java.lang.String.class, value)); return true;
        case "toblock":
        case "toBlock": target.getConfiguration().setToBlock(property(camelContext, java.lang.String.class, value)); return true;
        case "topics": target.getConfiguration().setTopics(property(camelContext, java.lang.String.class, value)); return true;
        case "transactionhash":
        case "transactionHash": target.getConfiguration().setTransactionHash(property(camelContext, java.lang.String.class, value)); return true;
        case "ttl": target.getConfiguration().setTtl(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "value": target.getConfiguration().setValue(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "web3j": target.getConfiguration().setWeb3j(property(camelContext, org.web3j.protocol.Web3j.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "address": return java.lang.String.class;
        case "addresses": return java.util.List.class;
        case "atblock":
        case "atBlock": return java.lang.String.class;
        case "blockhash":
        case "blockHash": return java.lang.String.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "clientid":
        case "clientId": return java.lang.String.class;
        case "data": return java.lang.String.class;
        case "databasename":
        case "databaseName": return java.lang.String.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "filterid":
        case "filterId": return java.math.BigInteger.class;
        case "fromaddress":
        case "fromAddress": return java.lang.String.class;
        case "fromblock":
        case "fromBlock": return java.lang.String.class;
        case "fulltransactionobjects":
        case "fullTransactionObjects": return boolean.class;
        case "gaslimit":
        case "gasLimit": return java.math.BigInteger.class;
        case "gasprice":
        case "gasPrice": return java.math.BigInteger.class;
        case "hashrate": return java.lang.String.class;
        case "headerpowhash":
        case "headerPowHash": return java.lang.String.class;
        case "index": return java.math.BigInteger.class;
        case "keyname":
        case "keyName": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "mixdigest":
        case "mixDigest": return java.lang.String.class;
        case "nonce": return java.lang.String.class;
        case "operation": return java.lang.String.class;
        case "position": return java.math.BigInteger.class;
        case "priority": return java.math.BigInteger.class;
        case "privatefor":
        case "privateFor": return java.util.List.class;
        case "quorumapi":
        case "quorumAPI": return boolean.class;
        case "sha3hashofdatatosign":
        case "sha3HashOfDataToSign": return java.lang.String.class;
        case "signedtransactiondata":
        case "signedTransactionData": return java.lang.String.class;
        case "sourcecode":
        case "sourceCode": return java.lang.String.class;
        case "synchronous": return boolean.class;
        case "toaddress":
        case "toAddress": return java.lang.String.class;
        case "toblock":
        case "toBlock": return java.lang.String.class;
        case "topics": return java.lang.String.class;
        case "transactionhash":
        case "transactionHash": return java.lang.String.class;
        case "ttl": return java.math.BigInteger.class;
        case "value": return java.math.BigInteger.class;
        case "web3j": return org.web3j.protocol.Web3j.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        Web3jEndpoint target = (Web3jEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "address": return target.getConfiguration().getAddress();
        case "addresses": return target.getConfiguration().getAddresses();
        case "atblock":
        case "atBlock": return target.getConfiguration().getAtBlock();
        case "blockhash":
        case "blockHash": return target.getConfiguration().getBlockHash();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "clientid":
        case "clientId": return target.getConfiguration().getClientId();
        case "data": return target.getConfiguration().getData();
        case "databasename":
        case "databaseName": return target.getConfiguration().getDatabaseName();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "filterid":
        case "filterId": return target.getConfiguration().getFilterId();
        case "fromaddress":
        case "fromAddress": return target.getConfiguration().getFromAddress();
        case "fromblock":
        case "fromBlock": return target.getConfiguration().getFromBlock();
        case "fulltransactionobjects":
        case "fullTransactionObjects": return target.getConfiguration().isFullTransactionObjects();
        case "gaslimit":
        case "gasLimit": return target.getConfiguration().getGasLimit();
        case "gasprice":
        case "gasPrice": return target.getConfiguration().getGasPrice();
        case "hashrate": return target.getConfiguration().getHashrate();
        case "headerpowhash":
        case "headerPowHash": return target.getConfiguration().getHeaderPowHash();
        case "index": return target.getConfiguration().getIndex();
        case "keyname":
        case "keyName": return target.getConfiguration().getKeyName();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "mixdigest":
        case "mixDigest": return target.getConfiguration().getMixDigest();
        case "nonce": return target.getConfiguration().getNonce();
        case "operation": return target.getConfiguration().getOperation();
        case "position": return target.getConfiguration().getPosition();
        case "priority": return target.getConfiguration().getPriority();
        case "privatefor":
        case "privateFor": return target.getConfiguration().getPrivateFor();
        case "quorumapi":
        case "quorumAPI": return target.getConfiguration().isQuorumAPI();
        case "sha3hashofdatatosign":
        case "sha3HashOfDataToSign": return target.getConfiguration().getSha3HashOfDataToSign();
        case "signedtransactiondata":
        case "signedTransactionData": return target.getConfiguration().getSignedTransactionData();
        case "sourcecode":
        case "sourceCode": return target.getConfiguration().getSourceCode();
        case "synchronous": return target.isSynchronous();
        case "toaddress":
        case "toAddress": return target.getConfiguration().getToAddress();
        case "toblock":
        case "toBlock": return target.getConfiguration().getToBlock();
        case "topics": return target.getConfiguration().getTopics();
        case "transactionhash":
        case "transactionHash": return target.getConfiguration().getTransactionHash();
        case "ttl": return target.getConfiguration().getTtl();
        case "value": return target.getConfiguration().getValue();
        case "web3j": return target.getConfiguration().getWeb3j();
        default: return null;
        }
    }
}

