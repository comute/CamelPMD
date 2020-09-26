/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.sip;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class SipEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":uri";
    private static final String[] SCHEMES = new String[]{"sip", "sips"};

    @Override
    public boolean isEnabled(String scheme) {
        for (String s : SCHEMES) {
            if (s.equals(scheme)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> parameters) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(parameters);

        uri = buildPathParameter(syntax, uri, "uri", null, true, copy);
        uri = buildQueryParameters(uri, copy);
        return uri;
    }
}

