/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.paho;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class PahoEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":topic";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(34);
        props.add("serverURIs");
        props.add("basicPropertyBinding");
        props.add("customWebSocketHeaders");
        props.add("maxInflight");
        props.add("synchronous");
        props.add("automaticReconnect");
        props.add("password");
        props.add("bridgeErrorHandler");
        props.add("sslClientProps");
        props.add("qos");
        props.add("willTopic");
        props.add("mqttVersion");
        props.add("filePersistenceDirectory");
        props.add("client");
        props.add("connectionTimeout");
        props.add("executorServiceTimeout");
        props.add("httpsHostnameVerificationEnabled");
        props.add("clientId");
        props.add("socketFactory");
        props.add("exchangePattern");
        props.add("userName");
        props.add("cleanSession");
        props.add("keepAliveInterval");
        props.add("maxReconnectDelay");
        props.add("brokerUrl");
        props.add("retained");
        props.add("lazyStartProducer");
        props.add("willQos");
        props.add("sslHostnameVerifier");
        props.add("topic");
        props.add("persistence");
        props.add("willPayload");
        props.add("willRetained");
        props.add("exceptionHandler");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(2);
        secretProps.add("password");
        secretProps.add("userName");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "paho".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "topic", null, true, copy);
        uri = buildQueryParameters(uri, copy);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

