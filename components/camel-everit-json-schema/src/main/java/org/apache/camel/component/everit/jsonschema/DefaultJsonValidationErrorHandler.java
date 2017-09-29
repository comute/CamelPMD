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
package org.apache.camel.component.everit.jsonschema;

import org.apache.camel.Exchange;
import org.apache.camel.ValidationException;

public class DefaultJsonValidationErrorHandler implements
        JsonValidatorErrorHandler {

    @Override
    public void reset() {
        // Do nothing since we do not keep state
    }
    
    @Override
    public void handleErrors(Exchange exchange,
            org.everit.json.schema.Schema schema,
            Exception e)
            throws ValidationException {
        if (e instanceof org.everit.json.schema.ValidationException) {
            throw new JsonSchemaValidationException(exchange, schema, (org.everit.json.schema.ValidationException)e);
        } else {
            throw new JsonSchemaValidationException(exchange, schema, e);
        }
    }

}
