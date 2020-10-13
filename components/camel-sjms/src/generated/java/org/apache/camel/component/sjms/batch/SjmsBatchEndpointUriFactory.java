/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.sjms.batch;

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
public class SjmsBatchEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":destinationName";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(25);
        props.add("basicPropertyBinding");
        props.add("aggregationStrategy");
        props.add("mapJmsMessage");
        props.add("synchronous");
        props.add("includeAllJMSXProperties");
        props.add("eagerCheckCompletion");
        props.add("timeoutCheckerExecutorService");
        props.add("bridgeErrorHandler");
        props.add("jmsKeyFormatStrategy");
        props.add("keepAliveDelay");
        props.add("completionInterval");
        props.add("headerFilterStrategy");
        props.add("destinationName");
        props.add("messageCreatedStrategy");
        props.add("asyncStartListener");
        props.add("completionPredicate");
        props.add("allowNullBody");
        props.add("consumerCount");
        props.add("recoveryInterval");
        props.add("sendEmptyMessageWhenIdle");
        props.add("pollDuration");
        props.add("exchangePattern");
        props.add("completionSize");
        props.add("completionTimeout");
        props.add("exceptionHandler");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "sjms-batch".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "destinationName", null, true, copy);
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

