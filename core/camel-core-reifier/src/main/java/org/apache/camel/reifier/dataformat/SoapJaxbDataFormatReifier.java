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
package org.apache.camel.reifier.dataformat;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.model.DataFormatDefinition;
import org.apache.camel.model.dataformat.SoapDataFormat;

public class SoapJaxbDataFormatReifier extends DataFormatReifier<SoapDataFormat> {

    public SoapJaxbDataFormatReifier(CamelContext camelContext, DataFormatDefinition definition) {
        super(camelContext, (SoapDataFormat) definition);
    }

    @Override
    protected void prepareDataFormatConfig(Map<String, Object> properties) {
        properties.put("elementNameStrategy", or(definition.getElementNameStrategy(),
                asRef(definition.getElementNameStrategyRef())));
        properties.put("encoding", definition.getEncoding());
        properties.put("version", definition.getVersion());
        properties.put("namespacePrefix", asRef(definition.getNamespacePrefixRef()));
        properties.put("schema", definition.getSchema());
        properties.put("contextPath", definition.getContextPath());
    }

}
