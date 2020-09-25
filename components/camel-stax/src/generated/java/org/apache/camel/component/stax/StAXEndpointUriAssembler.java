/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.stax;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.EndpointUriAssembler;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class StAXEndpointUriAssembler extends org.apache.camel.support.component.EndpointUriAssemblerSupport implements EndpointUriAssembler {

    private static final String BASE = ":contentHandlerClass";

    @Override
    public boolean isEnabled(String scheme) {
        return "stax".equals(scheme);
    }

    @Override
    public String buildUri(CamelContext camelContext, String scheme, Map<String, Object> parameters) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(parameters);

        uri = buildPathParameter(camelContext, syntax, uri, "contentHandlerClass", null, true, copy);
        uri = buildQueryParameters(camelContext, uri, copy);
        return uri;
    }
}

