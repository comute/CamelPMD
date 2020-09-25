/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.crypto.cms;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.EndpointUriAssembler;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class CryptoCmsEndpointUriAssembler extends org.apache.camel.support.component.EndpointUriAssemblerSupport implements EndpointUriAssembler {

    private static final String BASE = ":cryptoOperation:name";

    @Override
    public boolean isEnabled(String scheme) {
        return "crypto-cms".equals(scheme);
    }

    @Override
    public String buildUri(CamelContext camelContext, String scheme, Map<String, Object> parameters) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(parameters);

        uri = buildPathParameter(camelContext, syntax, uri, "cryptoOperation", null, true, copy);
        uri = buildPathParameter(camelContext, syntax, uri, "name", null, true, copy);
        uri = buildQueryParameters(camelContext, uri, copy);
        return uri;
    }
}

