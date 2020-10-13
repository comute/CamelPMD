/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.vertx.websocket;

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
public class VertxWebsocketEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":host:port/path";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(15);
        props.add("clientOptions");
        props.add("basicPropertyBinding");
        props.add("synchronous");
        props.add("sendToAll");
        props.add("exchangePattern");
        props.add("sslContextParameters");
        props.add("path");
        props.add("allowedOriginPattern");
        props.add("router");
        props.add("lazyStartProducer");
        props.add("bridgeErrorHandler");
        props.add("serverOptions");
        props.add("port");
        props.add("host");
        props.add("exceptionHandler");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "vertx-websocket".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "host", "0.0.0.0", false, copy);
        uri = buildPathParameter(syntax, uri, "port", 0, false, copy);
        uri = buildPathParameter(syntax, uri, "path", "/", true, copy);
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

