/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.mongodb;

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
public class MongoDbEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":connectionBean";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(28);
        props.add("connectionBean");
        props.add("outputType");
        props.add("writeConcern");
        props.add("database");
        props.add("password");
        props.add("bridgeErrorHandler");
        props.add("tailTrackField");
        props.add("cursorRegenerationDelay");
        props.add("writeResultAsHeader");
        props.add("hosts");
        props.add("tailTrackDb");
        props.add("collectionIndex");
        props.add("exchangePattern");
        props.add("persistentTailTracking");
        props.add("collection");
        props.add("mongoConnection");
        props.add("persistentId");
        props.add("tailTrackCollection");
        props.add("consumerType");
        props.add("streamFilter");
        props.add("lazyStartProducer");
        props.add("dynamicity");
        props.add("tailTrackIncreasingField");
        props.add("readPreference");
        props.add("operation");
        props.add("exceptionHandler");
        props.add("createCollection");
        props.add("username");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(2);
        secretProps.add("password");
        secretProps.add("username");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
        MULTI_VALUE_PREFIXES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "mongodb".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "connectionBean", null, true, copy);
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
    public Set<String> multiValuePrefixes() {
        return MULTI_VALUE_PREFIXES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

