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
package org.apache.camel.tools.apt;

import java.io.Writer;
import java.util.Map;
import java.util.StringJoiner;

import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.tools.FileObject;
import javax.tools.StandardLocation;

@SupportedAnnotationTypes({"org.apache.camel.Converter"})
public class TypeConverterLoaderGenerator extends AbstractTypeConverterGenerator {

    @Override
    boolean acceptClass(Element element) {
        return isLoaderEnabled(element);
    }

    @Override
    String convertersKey(String currentClass) {
        return currentClass;
    }

    @Override
    void writeConverters(Map<String, ClassConverters> converters) throws Exception {
        // now write all the converters
        for (Map.Entry<String, ClassConverters> entry : converters.entrySet()) {
            String key = entry.getKey();
            ClassConverters value = entry.getValue();
            writeConverters(key, "Loader", value);
        }
        writeConverterLoaderMetaInfo(converters);
    }

    private void writeConverterLoaderMetaInfo(Map<String, ClassConverters> converters) throws Exception {
        StringJoiner sj = new StringJoiner(",");
        for (Map.Entry<String, ClassConverters> entry : converters.entrySet()) {
            String key = entry.getKey();
            ClassConverters value = entry.getValue();
            if (!value.isEmpty()) {
                sj.add(key);
            }
        }

        if (sj.length() > 0) {
            FileObject fo = processingEnv.getFiler().createResource(StandardLocation.CLASS_OUTPUT, "", "META-INF/services/org/apache/camel/TypeConverterLoader");
            try (Writer writer = fo.openWriter()) {
                writer.append("# Generated by camel annotation processor\n");
                for (String fqn : sj.toString().split(",")) {
                    writer.append(fqn).append("Loader\n");
                }
            }
        }
    }

    private static boolean isLoaderEnabled(Element element) {
        for (AnnotationMirror ann : element.getAnnotationMirrors()) {
            for (Map.Entry<? extends ExecutableElement, ? extends AnnotationValue> entry : ann.getElementValues().entrySet()) {
                if ("generateLoader".equals(entry.getKey().getSimpleName().toString())) {
                    return (Boolean)entry.getValue().getValue();
                }
            }
        }
        return false;
    }

}
