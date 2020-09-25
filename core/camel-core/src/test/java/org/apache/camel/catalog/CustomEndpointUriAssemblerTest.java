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
package org.apache.camel.catalog;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.ContextTestSupport;
import org.apache.camel.ExtendedCamelContext;
import org.apache.camel.spi.EndpointUriAssembler;
import org.apache.camel.support.component.EndpointUriAssemblerSupport;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomEndpointUriAssemblerTest extends ContextTestSupport {

    @Test
    public void testCustomAssemble() throws Exception {
        EndpointUriAssembler assembler = new MyAssembler();

        Map<String, Object> params = new HashMap<>();
        params.put("name", "foo");
        params.put("amount", "123");
        params.put("port", 4444);
        params.put("verbose", true);

        String uri = assembler.buildUri(context, "acme", params);
        Assertions.assertEquals("acme:foo:4444?amount=123&verbose=true", uri);
    }

    @Test
    public void testCustomAssembleRegistry() throws Exception {
        context.getRegistry().bind("myAssembler", new MyAssembler());

        Map<String, Object> params = new HashMap<>();
        params.put("name", "foo");
        params.put("amount", "123");
        params.put("port", 4444);
        params.put("verbose", true);

        EndpointUriAssembler assembler = context.adapt(ExtendedCamelContext.class).getEndpointUriAssembler("acme");
        String uri = assembler.buildUri(context, "acme", params);
        Assertions.assertEquals("acme:foo:4444?amount=123&verbose=true", uri);
    }

    @Test
    public void testCustomAssembleUnsorted() throws Exception {
        EndpointUriAssembler assembler = new MyAssembler();

        Map<String, Object> params = new LinkedHashMap<>();
        params.put("name", "foo");
        params.put("verbose", false);
        params.put("port", 4444);
        params.put("amount", "123");

        String uri = assembler.buildUri(context, "acme", params);
        Assertions.assertEquals("acme:foo:4444?amount=123&verbose=false", uri);
    }

    @Test
    public void testCustomAssembleNoMandatory() throws Exception {
        EndpointUriAssembler assembler = new MyAssembler();

        Map<String, Object> params = new LinkedHashMap<>();
        params.put("verbose", false);
        params.put("port", 4444);
        params.put("amount", "123");

        try {
            assembler.buildUri(context, "acme", params);
            Assertions.fail();
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Option name is required when creating endpoint uri with syntax acme:name:port",
                    e.getMessage());
        }
    }

    @Test
    public void testCustomAssembleDefault() throws Exception {
        EndpointUriAssembler assembler = new MyAssembler();

        Map<String, Object> params = new LinkedHashMap<>();
        params.put("name", "bar");
        params.put("verbose", false);
        params.put("amount", "123");

        String uri = assembler.buildUri(context, "acme", params);
        Assertions.assertEquals("acme:bar?amount=123&verbose=false", uri);
    }

    @Test
    public void testCustomAssembleComplex() throws Exception {
        EndpointUriAssembler assembler = new MySecondAssembler();

        Map<String, Object> params = new LinkedHashMap<>();
        params.put("name", "bar");
        params.put("path", "moes");
        params.put("verbose", true);
        params.put("amount", "123");

        String uri = assembler.buildUri(context, "acme2", params);
        Assertions.assertEquals("acme2:bar/moes?amount=123&verbose=true", uri);
    }

    @Test
    public void testCustomAssembleComplexPort() throws Exception {
        EndpointUriAssembler assembler = new MySecondAssembler();

        Map<String, Object> params = new LinkedHashMap<>();
        params.put("name", "bar");
        params.put("path", "moes");
        params.put("port", "4444");
        params.put("verbose", true);
        params.put("amount", "123");

        String uri = assembler.buildUri(context, "acme2", params);
        Assertions.assertEquals("acme2:bar/moes:4444?amount=123&verbose=true", uri);
    }

    @Test
    public void testCustomAssembleComplexNoPath() throws Exception {
        EndpointUriAssembler assembler = new MySecondAssembler();

        Map<String, Object> params = new LinkedHashMap<>();
        params.put("name", "bar");
        params.put("port", "4444");
        params.put("verbose", true);
        params.put("amount", "123");

        String uri = assembler.buildUri(context, "acme2", params);
        Assertions.assertEquals("acme2:bar:4444?amount=123&verbose=true", uri);
    }

    @Test
    public void testCustomAssembleComplexNoPathNoPort() throws Exception {
        EndpointUriAssembler assembler = new MySecondAssembler();

        Map<String, Object> params = new LinkedHashMap<>();
        params.put("name", "bar");
        params.put("verbose", true);
        params.put("amount", "123");

        String uri = assembler.buildUri(context, "acme2", params);
        Assertions.assertEquals("acme2:bar?amount=123&verbose=true", uri);
    }

    @Test
    public void testJms() throws Exception {
        EndpointUriAssembler assembler = new MyJmsAssembler();

        Map<String, Object> params = new LinkedHashMap<>();
        params.put("destinationName", "foo");
        params.put("destinationType", "topic");
        params.put("deliveryPersistent", true);

        String uri = assembler.buildUri(context, "jms2", params);
        Assertions.assertEquals("jms2:topic:foo?deliveryPersistent=true", uri);
    }

    @Test
    public void testJmsMatchDefault() throws Exception {
        EndpointUriAssembler assembler = new MyJmsAssembler();

        Map<String, Object> params = new LinkedHashMap<>();
        params.put("destinationName", "foo");
        params.put("destinationType", "queue");
        params.put("deliveryPersistent", true);

        String uri = assembler.buildUri(context, "jms2", params);
        Assertions.assertEquals("jms2:queue:foo?deliveryPersistent=true", uri);
    }

    @Test
    public void testJmsNoDefault() throws Exception {
        EndpointUriAssembler assembler = new MyJmsAssembler();

        Map<String, Object> params = new LinkedHashMap<>();
        params.put("destinationName", "foo");
        params.put("deliveryPersistent", true);

        String uri = assembler.buildUri(context, "jms2", params);
        Assertions.assertEquals("jms2:foo?deliveryPersistent=true", uri);
    }

    private class MyAssembler extends EndpointUriAssemblerSupport implements EndpointUriAssembler {

        private static final String SYNTAX = "acme:name:port";

        @Override
        public boolean isEnabled(String scheme) {
            return "acme".equals(scheme);
        }

        @Override
        public String buildUri(CamelContext camelContext, String scheme, Map<String, Object> parameters)
                throws URISyntaxException {
            // begin from syntax
            String uri = SYNTAX;

            // append path parameters
            uri = buildPathParameter(camelContext, SYNTAX, uri, "name", null, true, parameters);
            uri = buildPathParameter(camelContext, SYNTAX, uri, "port", 8080, false, parameters);
            // append remainder parameters
            uri = buildQueryParameters(camelContext, uri, parameters);

            return uri;
        }

    }

    private class MySecondAssembler extends EndpointUriAssemblerSupport implements EndpointUriAssembler {

        private static final String SYNTAX = "acme2:name/path:port";

        @Override
        public boolean isEnabled(String scheme) {
            return "acme2".equals(scheme);
        }

        @Override
        public String buildUri(CamelContext camelContext, String scheme, Map<String, Object> parameters)
                throws URISyntaxException {
            // begin from syntax
            String uri = SYNTAX;

            // append path parameters
            uri = buildPathParameter(camelContext, SYNTAX, uri, "name", null, true, parameters);
            uri = buildPathParameter(camelContext, SYNTAX, uri, "path", null, false, parameters);
            uri = buildPathParameter(camelContext, SYNTAX, uri, "port", 8080, false, parameters);
            // append remainder parameters
            uri = buildQueryParameters(camelContext, uri, parameters);

            return uri;
        }

    }

    private class MyJmsAssembler extends EndpointUriAssemblerSupport implements EndpointUriAssembler {

        private static final String SYNTAX = "jms2:destinationType:destinationName";

        @Override
        public boolean isEnabled(String scheme) {
            return "jms2".equals(scheme);
        }

        @Override
        public String buildUri(CamelContext camelContext, String scheme, Map<String, Object> parameters)
                throws URISyntaxException {

            String uri = SYNTAX;
            uri = buildPathParameter(camelContext, SYNTAX, uri, "destinationType", "queue", false, parameters);
            uri = buildPathParameter(camelContext, SYNTAX, uri, "destinationName", null, true, parameters);
            uri = buildQueryParameters(camelContext, uri, parameters);

            return uri;
        }

    }

}
