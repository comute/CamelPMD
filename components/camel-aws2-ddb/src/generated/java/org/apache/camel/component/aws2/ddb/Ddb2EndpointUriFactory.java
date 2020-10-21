/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.ddb;

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
public class Ddb2EndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":tableName";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(19);
        props.add("amazonDDBClient");
        props.add("basicPropertyBinding");
        props.add("autoDiscoverClient");
        props.add("proxyProtocol");
        props.add("readCapacity");
        props.add("secretKey");
        props.add("synchronous");
        props.add("keyAttributeType");
        props.add("proxyHost");
        props.add("tableName");
        props.add("trustAllCertificates");
        props.add("proxyPort");
        props.add("keyAttributeName");
        props.add("lazyStartProducer");
        props.add("accessKey");
        props.add("consistentRead");
        props.add("region");
        props.add("operation");
        props.add("writeCapacity");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(2);
        secretProps.add("secretKey");
        secretProps.add("accessKey");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "aws2-ddb".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "tableName", null, true, copy);
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

