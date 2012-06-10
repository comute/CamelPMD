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
package org.apache.camel.component.flatpack;

import java.util.List;

import net.sf.flatpack.DataError;
import org.apache.camel.CamelExchangeException;
import org.apache.camel.Exchange;

/**
 * Flatpack exception.
 */
public class FlatpackException extends CamelExchangeException {

    private static final long serialVersionUID = 1L;
    private final List<DataError> errors;

    public FlatpackException(String message, Exchange exchange, List<DataError> errors) {
        super(message, exchange);
        this.errors = errors;
    }

    public List<DataError> getErrors() {
        return errors;
    }

    @Override
    public String getMessage() {
        StringBuffer sb = new StringBuffer();
        sb.append(super.getMessage());
        if (errors != null && !errors.isEmpty()) {
            sb.append("\n");
            for (Object error : errors) {
                DataError e = (DataError) error;
                sb.append(e.toString());
            }
        }
        return sb.toString();
    }

}
