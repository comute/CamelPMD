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
package org.apache.camel.main.download;

import org.apache.camel.Exchange;
import org.apache.camel.TypeConversionException;
import org.apache.camel.support.TypeConverterSupport;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * During export then we can be more flexible and allow missing property placeholders to resolve to a hardcoded value,
 * so we can keep attempting to export.
 */
public class ExportTypeConverter extends TypeConverterSupport {

    @Override
    public <T> T convertTo(Class<T> type, Exchange exchange, Object value) throws TypeConversionException {
        if (PropertyConfigurerSupport.MAGIC_VALUE.equals(value)) {
            // attempt to convert to the given type using different common inputs (boolean, numeric, string)
            T answer = exchange.getContext().getTypeConverter().tryConvertTo(type, exchange, "true");
            if (answer == null) {
                answer = exchange.getContext().getTypeConverter().tryConvertTo(type, exchange, "1");
            }
            if (answer == null) {
                answer = exchange.getContext().getTypeConverter().tryConvertTo(type, exchange,
                        PropertyConfigurerSupport.MAGIC_VALUE);
            }
            return answer;
        }
        return null;
    }
}
