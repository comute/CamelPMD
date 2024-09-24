/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.google.mail;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.camel.CamelContext;
import org.apache.camel.CamelExecutionException;
import org.apache.camel.support.PropertyBindingSupport;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.apache.camel.test.junit5.TestSupport;
import org.junit.jupiter.api.TestInstance;

/**
 * Abstract base class for GoogleMail Integration tests generated by Camel API component maven plugin.
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AbstractGoogleMailTestSupport extends CamelTestSupport {

    // userid of the currently authenticated user
    protected static final String CURRENT_USERID = "me";
    private static final String TEST_OPTIONS_PROPERTIES = "/test-options.properties";

    private static Properties loadProperties() {
        // read GoogleMail component configuration from TEST_OPTIONS_PROPERTIES

        return TestSupport.loadExternalPropertiesQuietly(AbstractGoogleMailTestSupport.class, TEST_OPTIONS_PROPERTIES);
    }

    // Used by JUnit to determine whether or not to run the integration tests
    @SuppressWarnings("unused")
    private static boolean hasCredentials() {
        Properties properties = loadProperties();

        return !properties.getProperty("clientId", "").isEmpty()
                && !properties.getProperty("clientSecret", "").isEmpty()
                && !properties.getProperty("accessToken", "").isEmpty()
                || !properties.getProperty("serviceAccountKey", "").isEmpty();
    }

    @Override
    protected CamelContext createCamelContext() throws Exception {

        final CamelContext context = super.createCamelContext();

        final Properties properties = loadProperties();

        Map<String, Object> options = new HashMap<>();
        for (Map.Entry<Object, Object> entry : properties.entrySet()) {
            options.put(entry.getKey().toString(), entry.getValue());
        }

        final GoogleMailConfiguration configuration = new GoogleMailConfiguration();
        PropertyBindingSupport.bindProperties(context, configuration, options);

        // add GoogleMailComponent to Camel context
        final GoogleMailComponent component = new GoogleMailComponent(context);
        component.setConfiguration(configuration);
        context.addComponent("google-mail", component);

        return context;
    }

    @SuppressWarnings("unchecked")
    protected <T> T requestBodyAndHeaders(String endpointUri, Object body, Map<String, Object> headers)
            throws CamelExecutionException {
        return (T) template().requestBodyAndHeaders(endpointUri, body, headers);
    }

    @SuppressWarnings("unchecked")
    protected <T> T requestBody(String endpoint, Object body) throws CamelExecutionException {
        return (T) template().requestBody(endpoint, body);
    }
}
