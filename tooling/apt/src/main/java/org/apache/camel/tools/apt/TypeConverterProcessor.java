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
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.processing.Filer;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.tools.FileObject;
import javax.tools.StandardLocation;

import static org.apache.camel.tooling.util.Strings.canonicalClassName;

@SupportedAnnotationTypes({"org.apache.camel.Converter"})
public class TypeConverterProcessor extends AbstractCamelAnnotationProcessor {

    boolean acceptClass(Element element) {
        // we accept any class that is not using @Converter(loader = true)
        return !isLoaderEnabled(element);
    }

    @Override
    protected void doProcess(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) throws Exception {
        TypeElement converterAnnotationType = this.processingEnv.getElementUtils().getTypeElement("org.apache.camel.Converter");
        Set<? extends Element> elements = roundEnv.getElementsAnnotatedWith(converterAnnotationType);

        Map<String, Element> converterClasses = new TreeMap<>();
        for (Element element : elements) {
            if (element instanceof TypeElement) {
                TypeElement te = (TypeElement)element;

                // we only support top-level classes (not inner classes)
                if (!te.getNestingKind().isNested() && acceptClass(te)) {
                    final String javaTypeName = canonicalClassName(te.getQualifiedName().toString());
                    converterClasses.put(javaTypeName, element);
                }
            }
        }

        // skip all converter classes from core as we just want to use the
        // optimized TypeConverterLoader files
        if (!converterClasses.isEmpty() && !converterClasses.containsKey("org.apache.camel.converter.IOConverter")
            && !converterClasses.containsKey("org.apache.camel.converter.jaxp.DomConverter") && !converterClasses.containsKey("org.apache.camel.converter.jaxp.XmlConverter")
            && !converterClasses.containsKey("org.apache.camel.util.xml.StreamSourceConverter")
            && !converterClasses.containsKey("org.apache.camel.converter.stream.StreamCacheConverter")) {
            Filer filer = processingEnv.getFiler();
            FileObject resource = filer.createResource(StandardLocation.CLASS_OUTPUT, "", "META-INF/services/org/apache/camel/TypeConverter",
                                                       converterClasses.values().toArray(new Element[0]));
            try (Writer w = resource.openWriter()) {
                w.append("# Generated by camel annotation processor\n");
                for (String s : converterClasses.keySet()) {
                    w.append(s).append("\n");
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
