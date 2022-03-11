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
package org.apache.camel.dsl.support;

import org.apache.camel.CamelContext;
import org.apache.camel.Converter;
import org.apache.camel.LoggingLevel;
import org.apache.camel.TypeConverterExists;
import org.apache.camel.spi.TypeConverterRegistry;

public class TypeConverterCompilePostProcessor implements CompilePostProcessor {

    @Override
    public void postCompile(CamelContext camelContext, String name, Class<?> clazz, Object instance) throws Exception {
        if (clazz.getAnnotation(Converter.class) != null) {
            TypeConverterRegistry tcr = camelContext.getTypeConverterRegistry();
            TypeConverterExists exists = tcr.getTypeConverterExists();
            LoggingLevel level = tcr.getTypeConverterExistsLoggingLevel();
            // force type converter to override as we could be re-loading
            tcr.setTypeConverterExists(TypeConverterExists.Override);
            tcr.setTypeConverterExistsLoggingLevel(LoggingLevel.OFF);
            try {
                tcr.addTypeConverters(clazz);
            } finally {
                tcr.setTypeConverterExists(exists);
                tcr.setTypeConverterExistsLoggingLevel(level);
            }
        }
    }

}
