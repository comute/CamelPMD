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
package org.apache.camel.support.component;

import java.net.URISyntaxException;
import java.util.Map;
import java.util.TreeMap;

import org.apache.camel.CamelContext;
import org.apache.camel.util.ObjectHelper;
import org.apache.camel.util.URISupport;

/**
 * Base class used by Camel Package Maven Plugin when it generates source code for fast endpoint uri assembler via
 * {@link org.apache.camel.spi.EndpointUriAssembler}.
 */
public abstract class EndpointUriAssemblerSupport {

    protected String buildPathParameter(CamelContext camelContext, String syntax, String uri, String name, String defaultValue, boolean required, Map<String, String> parameters) {
        String obj = parameters.remove(name);
        if (ObjectHelper.isEmpty(obj)) {
            obj = defaultValue;
        }
        if (ObjectHelper.isEmpty(obj) && required) {
            throw new IllegalArgumentException("Option " + name + " is required when creating endpoint uri with syntax " + syntax);
        }
        if (ObjectHelper.isNotEmpty(obj)) {
            uri = uri.replace(name, obj);
        }
        return uri;
    }

    protected String buildQueryParameters(CamelContext camelContext, String uri, Map<String, String> parameters) throws URISyntaxException {
        // we want sorted parameters
        Map map = new TreeMap(parameters);
        String query = URISupport.createQueryString(map);
        if (ObjectHelper.isNotEmpty(query)) {
            uri = uri + "?" + query;
        }
        return uri;
    }
}
