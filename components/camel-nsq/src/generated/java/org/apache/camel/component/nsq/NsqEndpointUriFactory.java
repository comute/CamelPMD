/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.nsq;

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
public class NsqEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":topic";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(20);
        props.add("customNSQLookup");
        props.add("basicPropertyBinding");
        props.add("requeueInterval");
        props.add("lookupInterval");
        props.add("synchronous");
        props.add("autoFinish");
        props.add("poolSize");
        props.add("channel");
        props.add("exchangePattern");
        props.add("sslContextParameters");
        props.add("userAgent");
        props.add("lookupServerPort");
        props.add("secure");
        props.add("lazyStartProducer");
        props.add("servers");
        props.add("bridgeErrorHandler");
        props.add("port");
        props.add("topic");
        props.add("exceptionHandler");
        props.add("messageTimeout");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "nsq".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "topic", null, true, copy);
        uri = buildQueryParameters(uri, copy, encode);
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

