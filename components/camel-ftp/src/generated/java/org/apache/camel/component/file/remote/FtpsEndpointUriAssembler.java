/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.file.remote;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.EndpointUriAssembler;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class FtpsEndpointUriAssembler extends org.apache.camel.support.component.EndpointUriAssemblerSupport implements EndpointUriAssembler {

    private static final String BASE = ":host:port/directoryName";

    @Override
    public boolean isEnabled(String scheme) {
        return "ftps".equals(scheme);
    }

    @Override
    public String buildUri(CamelContext camelContext, String scheme, Map<String, Object> parameters) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(parameters);

        uri = buildPathParameter(camelContext, syntax, uri, "host", null, true, copy);
        uri = buildPathParameter(camelContext, syntax, uri, "port", null, false, copy);
        uri = buildPathParameter(camelContext, syntax, uri, "directoryName", null, false, copy);
        uri = buildQueryParameters(camelContext, uri, copy);
        return uri;
    }
}

