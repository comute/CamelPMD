/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.xmpp;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.EndpointUriAssembler;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class XmppEndpointUriAssembler extends org.apache.camel.support.component.EndpointUriAssemblerSupport implements EndpointUriAssembler {

    private static final String BASE = ":host:port/participant";

    @Override
    public boolean isEnabled(String scheme) {
        return "xmpp".equals(scheme);
    }

    @Override
    public String buildUri(CamelContext camelContext, String scheme, Map<String, Object> parameters) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(parameters);

        uri = buildPathParameter(camelContext, syntax, uri, "host", null, true, copy);
        uri = buildPathParameter(camelContext, syntax, uri, "port", null, true, copy);
        uri = buildPathParameter(camelContext, syntax, uri, "participant", null, false, copy);
        uri = buildQueryParameters(camelContext, uri, copy);
        return uri;
    }
}

