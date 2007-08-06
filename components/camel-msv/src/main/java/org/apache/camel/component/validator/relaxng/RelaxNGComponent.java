/**
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.validator.relaxng;

import org.apache.camel.component.validator.ValidatorComponent;
import org.apache.camel.component.validator.SpringValidator;
import org.iso_relax.verifier.jaxp.validation.RELAXNGSchemaFactoryImpl;
import org.iso_relax.verifier.VerifierConfigurationException;

import javax.xml.XMLConstants;
import java.util.Map;

/**
 * @version $Revision: 1.1 $
 */
public class RelaxNGComponent extends ValidatorComponent {
    private RELAXNGSchemaFactoryImpl schemaFactory;

    public RELAXNGSchemaFactoryImpl getSchemaFactory() throws VerifierConfigurationException {
        if (schemaFactory == null) {
            schemaFactory = new RELAXNGSchemaFactoryImpl();
        }
        return schemaFactory;
    }

    public void setSchemaFactory(RELAXNGSchemaFactoryImpl schemaFactory) {
        this.schemaFactory = schemaFactory;
    }

    protected void configureValidator(SpringValidator validator, String uri, String remaining, Map parameters) throws Exception {
        validator.setSchemaLanguage(XMLConstants.RELAXNG_NS_URI);
        validator.setSchemaFactory(schemaFactory);
        super.configureValidator(validator, uri, remaining, parameters);
    }
}
