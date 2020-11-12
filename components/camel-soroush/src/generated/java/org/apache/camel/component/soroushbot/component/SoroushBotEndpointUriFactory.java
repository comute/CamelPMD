/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.soroushbot.component;

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
public class SoroushBotEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":action";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(22);
        props.add("retryWaitingTime");
        props.add("queueCapacityPerThread");
        props.add("backOffStrategy");
        props.add("retryExponentialCoefficient");
        props.add("synchronous");
        props.add("maxConnectionRetry");
        props.add("exchangePattern");
        props.add("autoDownload");
        props.add("reconnectIdleConnectionTimeout");
        props.add("retryLinearIncrement");
        props.add("concurrentConsumers");
        props.add("autoUploadFile");
        props.add("downloadThumbnail");
        props.add("forceUpload");
        props.add("authorizationToken");
        props.add("lazyStartProducer");
        props.add("bridgeErrorHandler");
        props.add("action");
        props.add("connectionTimeout");
        props.add("exceptionHandler");
        props.add("forceDownload");
        props.add("maxRetryWaitingTime");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(1);
        secretProps.add("authorizationToken");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "soroush".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "action", null, true, copy);
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

