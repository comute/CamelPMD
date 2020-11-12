/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.spring.ws;

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
public class SpringWebserviceEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SpringWebserviceEndpoint target = (SpringWebserviceEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowresponseattachmentoverride":
        case "allowResponseAttachmentOverride": target.getConfiguration().setAllowResponseAttachmentOverride(property(camelContext, boolean.class, value)); return true;
        case "allowresponseheaderoverride":
        case "allowResponseHeaderOverride": target.getConfiguration().setAllowResponseHeaderOverride(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "endpointdispatcher":
        case "endpointDispatcher": target.getConfiguration().setEndpointDispatcher(property(camelContext, org.apache.camel.component.spring.ws.bean.CamelEndpointDispatcher.class, value)); return true;
        case "endpointmapping":
        case "endpointMapping": target.getConfiguration().setEndpointMapping(property(camelContext, org.apache.camel.component.spring.ws.bean.CamelSpringWSEndpointMapping.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "faultaction":
        case "faultAction": target.getConfiguration().setFaultAction(property(camelContext, java.net.URI.class, value)); return true;
        case "faultto":
        case "faultTo": target.getConfiguration().setFaultTo(property(camelContext, java.net.URI.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "messagefactory":
        case "messageFactory": target.getConfiguration().setMessageFactory(property(camelContext, org.springframework.ws.WebServiceMessageFactory.class, value)); return true;
        case "messagefilter":
        case "messageFilter": target.getConfiguration().setMessageFilter(property(camelContext, org.apache.camel.component.spring.ws.filter.MessageFilter.class, value)); return true;
        case "messageidstrategy":
        case "messageIdStrategy": target.getConfiguration().setMessageIdStrategy(property(camelContext, org.springframework.ws.soap.addressing.messageid.MessageIdStrategy.class, value)); return true;
        case "messagesender":
        case "messageSender": target.getConfiguration().setMessageSender(property(camelContext, org.springframework.ws.transport.WebServiceMessageSender.class, value)); return true;
        case "outputaction":
        case "outputAction": target.getConfiguration().setOutputAction(property(camelContext, java.net.URI.class, value)); return true;
        case "replyto":
        case "replyTo": target.getConfiguration().setReplyTo(property(camelContext, java.net.URI.class, value)); return true;
        case "soapaction":
        case "soapAction": target.getConfiguration().setSoapAction(property(camelContext, java.lang.String.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.getConfiguration().setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "timeout": target.getConfiguration().setTimeout(property(camelContext, int.class, value)); return true;
        case "webservicetemplate":
        case "webServiceTemplate": target.getConfiguration().setWebServiceTemplate(property(camelContext, org.springframework.ws.client.core.WebServiceTemplate.class, value)); return true;
        case "wsaddressingaction":
        case "wsAddressingAction": target.getConfiguration().setWsAddressingAction(property(camelContext, java.net.URI.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowresponseattachmentoverride":
        case "allowResponseAttachmentOverride": return boolean.class;
        case "allowresponseheaderoverride":
        case "allowResponseHeaderOverride": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "endpointdispatcher":
        case "endpointDispatcher": return org.apache.camel.component.spring.ws.bean.CamelEndpointDispatcher.class;
        case "endpointmapping":
        case "endpointMapping": return org.apache.camel.component.spring.ws.bean.CamelSpringWSEndpointMapping.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "faultaction":
        case "faultAction": return java.net.URI.class;
        case "faultto":
        case "faultTo": return java.net.URI.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "messagefactory":
        case "messageFactory": return org.springframework.ws.WebServiceMessageFactory.class;
        case "messagefilter":
        case "messageFilter": return org.apache.camel.component.spring.ws.filter.MessageFilter.class;
        case "messageidstrategy":
        case "messageIdStrategy": return org.springframework.ws.soap.addressing.messageid.MessageIdStrategy.class;
        case "messagesender":
        case "messageSender": return org.springframework.ws.transport.WebServiceMessageSender.class;
        case "outputaction":
        case "outputAction": return java.net.URI.class;
        case "replyto":
        case "replyTo": return java.net.URI.class;
        case "soapaction":
        case "soapAction": return java.lang.String.class;
        case "sslcontextparameters":
        case "sslContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        case "synchronous": return boolean.class;
        case "timeout": return int.class;
        case "webservicetemplate":
        case "webServiceTemplate": return org.springframework.ws.client.core.WebServiceTemplate.class;
        case "wsaddressingaction":
        case "wsAddressingAction": return java.net.URI.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        SpringWebserviceEndpoint target = (SpringWebserviceEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowresponseattachmentoverride":
        case "allowResponseAttachmentOverride": return target.getConfiguration().isAllowResponseAttachmentOverride();
        case "allowresponseheaderoverride":
        case "allowResponseHeaderOverride": return target.getConfiguration().isAllowResponseHeaderOverride();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "endpointdispatcher":
        case "endpointDispatcher": return target.getConfiguration().getEndpointDispatcher();
        case "endpointmapping":
        case "endpointMapping": return target.getConfiguration().getEndpointMapping();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "faultaction":
        case "faultAction": return target.getConfiguration().getFaultAction();
        case "faultto":
        case "faultTo": return target.getConfiguration().getFaultTo();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "messagefactory":
        case "messageFactory": return target.getConfiguration().getMessageFactory();
        case "messagefilter":
        case "messageFilter": return target.getConfiguration().getMessageFilter();
        case "messageidstrategy":
        case "messageIdStrategy": return target.getConfiguration().getMessageIdStrategy();
        case "messagesender":
        case "messageSender": return target.getConfiguration().getMessageSender();
        case "outputaction":
        case "outputAction": return target.getConfiguration().getOutputAction();
        case "replyto":
        case "replyTo": return target.getConfiguration().getReplyTo();
        case "soapaction":
        case "soapAction": return target.getConfiguration().getSoapAction();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getConfiguration().getSslContextParameters();
        case "synchronous": return target.isSynchronous();
        case "timeout": return target.getConfiguration().getTimeout();
        case "webservicetemplate":
        case "webServiceTemplate": return target.getConfiguration().getWebServiceTemplate();
        case "wsaddressingaction":
        case "wsAddressingAction": return target.getConfiguration().getWsAddressingAction();
        default: return null;
        }
    }
}

