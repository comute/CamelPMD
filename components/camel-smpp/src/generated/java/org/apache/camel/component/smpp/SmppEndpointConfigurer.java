/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.smpp;

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
public class SmppEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SmppEndpoint target = (SmppEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "addressrange":
        case "addressRange": target.getConfiguration().setAddressRange(property(camelContext, java.lang.String.class, value)); return true;
        case "alphabet": target.getConfiguration().setAlphabet(property(camelContext, byte.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "datacoding":
        case "dataCoding": target.getConfiguration().setDataCoding(property(camelContext, byte.class, value)); return true;
        case "destaddr":
        case "destAddr": target.getConfiguration().setDestAddr(property(camelContext, java.lang.String.class, value)); return true;
        case "destaddrnpi":
        case "destAddrNpi": target.getConfiguration().setDestAddrNpi(property(camelContext, byte.class, value)); return true;
        case "destaddrton":
        case "destAddrTon": target.getConfiguration().setDestAddrTon(property(camelContext, byte.class, value)); return true;
        case "encoding": target.getConfiguration().setEncoding(property(camelContext, java.lang.String.class, value)); return true;
        case "enquirelinktimer":
        case "enquireLinkTimer": target.getConfiguration().setEnquireLinkTimer(property(camelContext, java.lang.Integer.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "httpproxyhost":
        case "httpProxyHost": target.getConfiguration().setHttpProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxypassword":
        case "httpProxyPassword": target.getConfiguration().setHttpProxyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxyport":
        case "httpProxyPort": target.getConfiguration().setHttpProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "httpproxyusername":
        case "httpProxyUsername": target.getConfiguration().setHttpProxyUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "initialreconnectdelay":
        case "initialReconnectDelay": target.getConfiguration().setInitialReconnectDelay(property(camelContext, long.class, value)); return true;
        case "lazysessioncreation":
        case "lazySessionCreation": target.getConfiguration().setLazySessionCreation(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxreconnect":
        case "maxReconnect": target.getConfiguration().setMaxReconnect(property(camelContext, int.class, value)); return true;
        case "numberingplanindicator":
        case "numberingPlanIndicator": target.getConfiguration().setNumberingPlanIndicator(property(camelContext, byte.class, value)); return true;
        case "password": target.getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "pduprocessordegree":
        case "pduProcessorDegree": target.getConfiguration().setPduProcessorDegree(property(camelContext, java.lang.Integer.class, value)); return true;
        case "pduprocessorqueuecapacity":
        case "pduProcessorQueueCapacity": target.getConfiguration().setPduProcessorQueueCapacity(property(camelContext, java.lang.Integer.class, value)); return true;
        case "priorityflag":
        case "priorityFlag": target.getConfiguration().setPriorityFlag(property(camelContext, byte.class, value)); return true;
        case "protocolid":
        case "protocolId": target.getConfiguration().setProtocolId(property(camelContext, byte.class, value)); return true;
        case "proxyheaders":
        case "proxyHeaders": target.getConfiguration().setProxyHeaders(property(camelContext, java.util.Map.class, value)); return true;
        case "reconnectdelay":
        case "reconnectDelay": target.getConfiguration().setReconnectDelay(property(camelContext, long.class, value)); return true;
        case "registereddelivery":
        case "registeredDelivery": target.getConfiguration().setRegisteredDelivery(property(camelContext, byte.class, value)); return true;
        case "replaceifpresentflag":
        case "replaceIfPresentFlag": target.getConfiguration().setReplaceIfPresentFlag(property(camelContext, byte.class, value)); return true;
        case "servicetype":
        case "serviceType": target.getConfiguration().setServiceType(property(camelContext, java.lang.String.class, value)); return true;
        case "sessionstatelistener":
        case "sessionStateListener": target.getConfiguration().setSessionStateListener(property(camelContext, org.jsmpp.session.SessionStateListener.class, value)); return true;
        case "singledlr":
        case "singleDLR": target.getConfiguration().setSingleDLR(property(camelContext, boolean.class, value)); return true;
        case "sourceaddr":
        case "sourceAddr": target.getConfiguration().setSourceAddr(property(camelContext, java.lang.String.class, value)); return true;
        case "sourceaddrnpi":
        case "sourceAddrNpi": target.getConfiguration().setSourceAddrNpi(property(camelContext, byte.class, value)); return true;
        case "sourceaddrton":
        case "sourceAddrTon": target.getConfiguration().setSourceAddrTon(property(camelContext, byte.class, value)); return true;
        case "splittingpolicy":
        case "splittingPolicy": target.getConfiguration().setSplittingPolicy(property(camelContext, org.apache.camel.component.smpp.SmppSplittingPolicy.class, value)); return true;
        case "systemid":
        case "systemId": target.getConfiguration().setSystemId(property(camelContext, java.lang.String.class, value)); return true;
        case "systemtype":
        case "systemType": target.getConfiguration().setSystemType(property(camelContext, java.lang.String.class, value)); return true;
        case "transactiontimer":
        case "transactionTimer": target.getConfiguration().setTransactionTimer(property(camelContext, java.lang.Integer.class, value)); return true;
        case "typeofnumber":
        case "typeOfNumber": target.getConfiguration().setTypeOfNumber(property(camelContext, byte.class, value)); return true;
        case "usingssl":
        case "usingSSL": target.getConfiguration().setUsingSSL(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "addressrange":
        case "addressRange": return java.lang.String.class;
        case "alphabet": return byte.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "datacoding":
        case "dataCoding": return byte.class;
        case "destaddr":
        case "destAddr": return java.lang.String.class;
        case "destaddrnpi":
        case "destAddrNpi": return byte.class;
        case "destaddrton":
        case "destAddrTon": return byte.class;
        case "encoding": return java.lang.String.class;
        case "enquirelinktimer":
        case "enquireLinkTimer": return java.lang.Integer.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "httpproxyhost":
        case "httpProxyHost": return java.lang.String.class;
        case "httpproxypassword":
        case "httpProxyPassword": return java.lang.String.class;
        case "httpproxyport":
        case "httpProxyPort": return java.lang.Integer.class;
        case "httpproxyusername":
        case "httpProxyUsername": return java.lang.String.class;
        case "initialreconnectdelay":
        case "initialReconnectDelay": return long.class;
        case "lazysessioncreation":
        case "lazySessionCreation": return boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "maxreconnect":
        case "maxReconnect": return int.class;
        case "numberingplanindicator":
        case "numberingPlanIndicator": return byte.class;
        case "password": return java.lang.String.class;
        case "pduprocessordegree":
        case "pduProcessorDegree": return java.lang.Integer.class;
        case "pduprocessorqueuecapacity":
        case "pduProcessorQueueCapacity": return java.lang.Integer.class;
        case "priorityflag":
        case "priorityFlag": return byte.class;
        case "protocolid":
        case "protocolId": return byte.class;
        case "proxyheaders":
        case "proxyHeaders": return java.util.Map.class;
        case "reconnectdelay":
        case "reconnectDelay": return long.class;
        case "registereddelivery":
        case "registeredDelivery": return byte.class;
        case "replaceifpresentflag":
        case "replaceIfPresentFlag": return byte.class;
        case "servicetype":
        case "serviceType": return java.lang.String.class;
        case "sessionstatelistener":
        case "sessionStateListener": return org.jsmpp.session.SessionStateListener.class;
        case "singledlr":
        case "singleDLR": return boolean.class;
        case "sourceaddr":
        case "sourceAddr": return java.lang.String.class;
        case "sourceaddrnpi":
        case "sourceAddrNpi": return byte.class;
        case "sourceaddrton":
        case "sourceAddrTon": return byte.class;
        case "splittingpolicy":
        case "splittingPolicy": return org.apache.camel.component.smpp.SmppSplittingPolicy.class;
        case "systemid":
        case "systemId": return java.lang.String.class;
        case "systemtype":
        case "systemType": return java.lang.String.class;
        case "transactiontimer":
        case "transactionTimer": return java.lang.Integer.class;
        case "typeofnumber":
        case "typeOfNumber": return byte.class;
        case "usingssl":
        case "usingSSL": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        SmppEndpoint target = (SmppEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "addressrange":
        case "addressRange": return target.getConfiguration().getAddressRange();
        case "alphabet": return target.getConfiguration().getAlphabet();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "datacoding":
        case "dataCoding": return target.getConfiguration().getDataCoding();
        case "destaddr":
        case "destAddr": return target.getConfiguration().getDestAddr();
        case "destaddrnpi":
        case "destAddrNpi": return target.getConfiguration().getDestAddrNpi();
        case "destaddrton":
        case "destAddrTon": return target.getConfiguration().getDestAddrTon();
        case "encoding": return target.getConfiguration().getEncoding();
        case "enquirelinktimer":
        case "enquireLinkTimer": return target.getConfiguration().getEnquireLinkTimer();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "httpproxyhost":
        case "httpProxyHost": return target.getConfiguration().getHttpProxyHost();
        case "httpproxypassword":
        case "httpProxyPassword": return target.getConfiguration().getHttpProxyPassword();
        case "httpproxyport":
        case "httpProxyPort": return target.getConfiguration().getHttpProxyPort();
        case "httpproxyusername":
        case "httpProxyUsername": return target.getConfiguration().getHttpProxyUsername();
        case "initialreconnectdelay":
        case "initialReconnectDelay": return target.getConfiguration().getInitialReconnectDelay();
        case "lazysessioncreation":
        case "lazySessionCreation": return target.getConfiguration().isLazySessionCreation();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxreconnect":
        case "maxReconnect": return target.getConfiguration().getMaxReconnect();
        case "numberingplanindicator":
        case "numberingPlanIndicator": return target.getConfiguration().getNumberingPlanIndicator();
        case "password": return target.getConfiguration().getPassword();
        case "pduprocessordegree":
        case "pduProcessorDegree": return target.getConfiguration().getPduProcessorDegree();
        case "pduprocessorqueuecapacity":
        case "pduProcessorQueueCapacity": return target.getConfiguration().getPduProcessorQueueCapacity();
        case "priorityflag":
        case "priorityFlag": return target.getConfiguration().getPriorityFlag();
        case "protocolid":
        case "protocolId": return target.getConfiguration().getProtocolId();
        case "proxyheaders":
        case "proxyHeaders": return target.getConfiguration().getProxyHeaders();
        case "reconnectdelay":
        case "reconnectDelay": return target.getConfiguration().getReconnectDelay();
        case "registereddelivery":
        case "registeredDelivery": return target.getConfiguration().getRegisteredDelivery();
        case "replaceifpresentflag":
        case "replaceIfPresentFlag": return target.getConfiguration().getReplaceIfPresentFlag();
        case "servicetype":
        case "serviceType": return target.getConfiguration().getServiceType();
        case "sessionstatelistener":
        case "sessionStateListener": return target.getConfiguration().getSessionStateListener();
        case "singledlr":
        case "singleDLR": return target.getConfiguration().isSingleDLR();
        case "sourceaddr":
        case "sourceAddr": return target.getConfiguration().getSourceAddr();
        case "sourceaddrnpi":
        case "sourceAddrNpi": return target.getConfiguration().getSourceAddrNpi();
        case "sourceaddrton":
        case "sourceAddrTon": return target.getConfiguration().getSourceAddrTon();
        case "splittingpolicy":
        case "splittingPolicy": return target.getConfiguration().getSplittingPolicy();
        case "systemid":
        case "systemId": return target.getConfiguration().getSystemId();
        case "systemtype":
        case "systemType": return target.getConfiguration().getSystemType();
        case "transactiontimer":
        case "transactionTimer": return target.getConfiguration().getTransactionTimer();
        case "typeofnumber":
        case "typeOfNumber": return target.getConfiguration().getTypeOfNumber();
        case "usingssl":
        case "usingSSL": return target.getConfiguration().isUsingSSL();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "proxyheaders":
        case "proxyHeaders": return java.lang.String.class;
        default: return null;
        }
    }
}

