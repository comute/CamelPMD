/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.log;

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
public class LogEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":loggerName";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(29);
        props.add("basicPropertyBinding");
        props.add("showProperties");
        props.add("showStreams");
        props.add("showHeaders");
        props.add("showException");
        props.add("synchronous");
        props.add("showExchangeId");
        props.add("logMask");
        props.add("groupActiveOnly");
        props.add("showFiles");
        props.add("showAll");
        props.add("exchangeFormatter");
        props.add("maxChars");
        props.add("loggerName");
        props.add("level");
        props.add("groupDelay");
        props.add("showExchangePattern");
        props.add("showBodyType");
        props.add("showFuture");
        props.add("showCaughtException");
        props.add("showStackTrace");
        props.add("skipBodyLineSeparator");
        props.add("lazyStartProducer");
        props.add("marker");
        props.add("multiline");
        props.add("groupSize");
        props.add("showBody");
        props.add("style");
        props.add("groupInterval");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "log".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "loggerName", null, true, copy);
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

