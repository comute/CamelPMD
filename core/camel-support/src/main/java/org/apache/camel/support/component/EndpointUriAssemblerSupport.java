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

    protected String buildPathParameter(
            CamelContext camelContext, String syntax, String uri, String name, Object defaultValue, boolean required,
            Map<String, Object> parameters) {
        Object obj = parameters.remove(name);
        if (ObjectHelper.isEmpty(obj) && defaultValue != null && required) {
            obj = camelContext.getTypeConverter().convertTo(String.class, defaultValue);
        }
        if (ObjectHelper.isEmpty(obj) && required) {
            throw new IllegalArgumentException(
                    "Option " + name + " is required when creating endpoint uri with syntax " + syntax);
        }
        if (ObjectHelper.isNotEmpty(obj)) {
            String str = camelContext.getTypeConverter().convertTo(String.class, obj);
            uri = uri.replace(name, str);
        } else {
            // the option is optional and we have no default or value for it, so we need to remove it from the syntax
            int pos = uri.indexOf(name);
            if (pos != -1) {
                // remove from syntax
                uri = uri.replaceFirst(name, "");
                pos = pos - 1;
                // remove the separator char
                char ch = uri.charAt(pos);
                if (!Character.isLetterOrDigit(ch)) {
                    uri = uri.substring(0, pos) + uri.substring(pos + 1);
                }
            }
        }

        return uri;
    }

    protected String buildQueryParameters(CamelContext camelContext, String uri, Map<String, Object> parameters)
            throws URISyntaxException {
        // we want sorted parameters
        Map<String, Object> map = new TreeMap<>(parameters);
        String query = URISupport.createQueryString(map);
        if (ObjectHelper.isNotEmpty(query)) {
            uri = uri + "?" + query;
        }
        return uri;
    }
}
