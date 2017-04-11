/**
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
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.mock;
import static org.easymock.EasyMock.replay;
import static org.junit.Assert.assertEquals;

public class AbstractCamelCatalogTest {

    AbstractCamelCatalog catalog = new AbstractCamelCatalog() {
    };

    JSonSchemaResolver resolver;

    @Before
    public void setupMockCatalog() {
        resolver = mock(JSonSchemaResolver.class);

        catalog.setJSonSchemaResolver(resolver);
    }

    @Test
    public void shouldConstructEndpointUris() throws URISyntaxException {
        expect(resolver.getComponentJSonSchema("comp")).andReturn("{\n"//
            + "  \"component\": {\n"//
            + "    \"syntax\": \"comp:param1:param2\"\n"//
            + "  }\n"//
            + "}");

        replay(resolver);

        final Map<String, String> properties = new HashMap<>();
        properties.put("param1", "value1");
        properties.put("param2", "value2");
        properties.put("param3", "value3");

        final String endpointUri = catalog.doAsEndpointUri("comp", properties, "&", false);

        assertEquals("comp:value1:value2?param3=value3", endpointUri);
    }

    @Test
    public void shouldConstructEndpointUrisWithPropertyPlaceholders() throws URISyntaxException {
        expect(resolver.getComponentJSonSchema("comp")).andReturn("{\n"//
            + "  \"component\": {\n"//
            + "    \"syntax\": \"comp:param1:param2\"\n"//
            + "  }\n"//
            + "}");

        replay(resolver);

        final Map<String, String> properties = new HashMap<>();
        properties.put("param1", "{{prop1}}");
        properties.put("param2", "{{prop2}}");
        properties.put("param3", "{{prop3}}");

        final String endpointUri = catalog.doAsEndpointUri("comp", properties, "&", false);

        assertEquals("comp:{{prop1}}:{{prop2}}?param3={{prop3}}", endpointUri);
    }

    @Test
    public void shouldConstructEndpointUrisWhenValuesContainTokens() throws URISyntaxException {
        expect(resolver.getComponentJSonSchema("comp")).andReturn("{\n"//
            + "  \"component\": {\n"//
            + "    \"syntax\": \"comp:param1:param2\"\n"//
            + "  }\n"//
            + "}");

        replay(resolver);

        final Map<String, String> properties = new HashMap<>();
        properties.put("param1", "{value1}");
        properties.put("param2", "/value2/");
        properties.put("param3", "/value3/{param}");

        final String endpointUri = catalog.doAsEndpointUri("comp", properties, "&", false);

        assertEquals("comp:{value1}:/value2/?param3=/value3/{param}", endpointUri);
    }
}
