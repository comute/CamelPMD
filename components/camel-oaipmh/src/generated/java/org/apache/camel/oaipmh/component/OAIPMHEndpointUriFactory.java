/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.oaipmh.component;

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
public class OAIPMHEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":baseUrl";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(32);
        props.add("basicPropertyBinding");
        props.add("backoffMultiplier");
        props.add("metadataPrefix");
        props.add("synchronous");
        props.add("initialDelay");
        props.add("ssl");
        props.add("scheduler");
        props.add("bridgeErrorHandler");
        props.add("useFixedDelay");
        props.add("runLoggingLevel");
        props.add("backoffErrorThreshold");
        props.add("greedy");
        props.add("from");
        props.add("scheduledExecutorService");
        props.add("repeatCount");
        props.add("timeUnit");
        props.add("ignoreSSLWarnings");
        props.add("identifier");
        props.add("set");
        props.add("sendEmptyMessageWhenIdle");
        props.add("schedulerProperties");
        props.add("verb");
        props.add("exchangePattern");
        props.add("backoffIdleThreshold");
        props.add("onlyFirst");
        props.add("baseUrl");
        props.add("lazyStartProducer");
        props.add("delay");
        props.add("pollStrategy");
        props.add("startScheduler");
        props.add("until");
        props.add("exceptionHandler");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "oaipmh".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "baseUrl", null, true, copy);
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
        return true;
    }
}

