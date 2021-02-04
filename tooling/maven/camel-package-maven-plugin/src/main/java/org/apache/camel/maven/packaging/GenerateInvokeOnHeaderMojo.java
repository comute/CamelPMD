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
package org.apache.camel.maven.packaging;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.plugins.annotations.ResolutionScope;
import org.jboss.jandex.AnnotationInstance;
import org.jboss.jandex.DotName;
import org.jboss.jandex.Index;
import org.jboss.jandex.IndexReader;
import org.jboss.jandex.Type;

/**
 * Abstract class for @InvokeOnHeader factory generator.
 */
@Mojo(name = "generate-invoke-on-header", threadSafe = true, defaultPhase = LifecyclePhase.PROCESS_CLASSES,
      requiresDependencyCollection = ResolutionScope.COMPILE,
      requiresDependencyResolution = ResolutionScope.COMPILE)
public class GenerateInvokeOnHeaderMojo extends AbstractGeneratorMojo {

    public static final DotName HEADER_ANNOTATION = DotName.createSimple("org.apache.camel.spi.InvokeOnHeader");

    /**
     * The project build directory
     */
    @Parameter(defaultValue = "${project.build.directory}")
    protected File buildDir;

    @Parameter(defaultValue = "${project.basedir}/src/generated/java")
    protected File sourcesOutputDir;
    @Parameter(defaultValue = "${project.basedir}/src/generated/resources")
    protected File resourcesOutputDir;

    private static class InvokeOnHeaderModel {
        private String key;
        private String methodName;
        private boolean isVoid;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getMethodName() {
            return methodName;
        }

        public void setMethodName(String methodName) {
            this.methodName = methodName;
        }

        public boolean isVoid() {
            return isVoid;
        }

        public void setVoid(boolean aVoid) {
            isVoid = aVoid;
        }
    }

    public GenerateInvokeOnHeaderMojo() {
    }

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        if ("pom".equals(project.getPackaging())) {
            return;
        }

        buildDir = new File(project.getBuild().getDirectory());

        if (sourcesOutputDir == null) {
            sourcesOutputDir = new File(project.getBasedir(), "src/generated/java");
        }
        if (resourcesOutputDir == null) {
            resourcesOutputDir = new File(project.getBasedir(), "src/generated/resources");
        }

        Path output = Paths.get(project.getBuild().getOutputDirectory());
        Index index;
        try (InputStream is = Files.newInputStream(output.resolve("META-INF/jandex.idx"))) {
            index = new IndexReader(is).read();
        } catch (IOException e) {
            throw new MojoExecutionException("IOException: " + e.getMessage(), e);
        }

        Map<String, Set<InvokeOnHeaderModel>> classes = new HashMap<>();
        List<AnnotationInstance> annotations = index.getAnnotations(HEADER_ANNOTATION);
        annotations.forEach(a -> {
            String currentClass = a.target().asMethod().declaringClass().name().toString();
            String value = a.value().asString();
            String methodName = a.target().asMethod().name();
            boolean isVoid = Type.Kind.VOID == a.target().asMethod().returnType().kind();
            Set<InvokeOnHeaderModel> set = classes.computeIfAbsent(currentClass, k -> new HashSet<>());
            InvokeOnHeaderModel model = new InvokeOnHeaderModel();
            model.setKey(value);
            model.setMethodName(methodName);
            model.setVoid(isVoid);
            set.add(model);
        });

        try {
            for (Map.Entry<String, Set<InvokeOnHeaderModel>> entry : classes.entrySet()) {
                createInvokeOnHeaderFactory(entry.getKey(), entry.getValue());
            }
        } catch (IOException e) {
            throw new MojoExecutionException("IOException: " + e.getMessage(), e);
        }
    }

    protected void createInvokeOnHeaderFactory(String fqn, Set<InvokeOnHeaderModel> models) throws IOException {
        String tfqn = generateInvokeOnHeaderFactory(fqn, models, sourcesOutputDir);
        updateResource(resourcesOutputDir.toPath(),
                "META-INF/services/org/apache/camel/invoke-on-header/" + fqn,
                "# " + GENERATED_MSG + NL + "class=" + tfqn + NL);
    }

    @Deprecated
    private String generateInvokeOnHeaderFactory(
            String fqn, Set<InvokeOnHeaderModel> models, File outputDir) {

        int pos = fqn.lastIndexOf('.');
        String pn = fqn.substring(0, pos);
        String cn = fqn.substring(pos + 1) + "InvokeOnHeaderFactory";
        String en = fqn;
        String pfqn = fqn;
        String psn = "org.apache.camel.support.component.InvokeOnHeaderSupport";

        StringWriter sw = new StringWriter();
        generateInvokeOnHeaderSource(pn, cn, en, pfqn, psn, sw, models);

        String source = sw.toString();

        String fileName = pn.replace('.', '/') + "/" + cn + ".java";
        outputDir.mkdirs();
        boolean updated = updateResource(buildContext, outputDir.toPath().resolve(fileName), source);
        if (updated) {
            getLog().info("Updated " + fileName);
        }
        return pfqn + "." + cn;
    }

    private void generateInvokeOnHeaderSource(
            String pn, String cn, String en, String pfqn, String psn, StringWriter w, Set<InvokeOnHeaderModel> models) {
        w.write("/* " + AbstractGeneratorMojo.GENERATED_MSG + " */\n");
        w.write("package " + pn + ";\n");
        w.write("\n");
        w.write("import org.apache.camel.Exchange;\n");
        w.write("import org.apache.camel.spi.InvokeOnHeaderStrategy;\n");
        w.write("import " + pfqn + ";\n");
        w.write("\n");
        w.write("/**\n");
        w.write(" * " + AbstractGeneratorMojo.GENERATED_MSG + "\n");
        w.write(" */\n");
        w.write("@SuppressWarnings(\"unchecked\")\n");
        w.write("public class " + cn + " implements InvokeOnHeaderStrategy");
        w.write(" {\n");
        w.write("\n");

        // sort options A..Z so they always have same order
        if (!models.isEmpty()) {
            models = models.stream().sorted(Comparator.comparing(InvokeOnHeaderModel::getKey)).collect(Collectors.toSet());
        }

        w.write("    @Override\n");
        w.write("    public Object invoke(Object obj, String key, Exchange exchange) throws Exception {\n");
        w.write("        " + en + " target = (" + en + ") obj;\n");
        if (!models.isEmpty()) {
            w.write("        switch (key) {\n");
            for (InvokeOnHeaderModel option : models) {
                String invoke = "target." + option.getMethodName() + "(exchange.getMessage())";
                if (!option.getKey().toLowerCase().equals(option.getKey())) {
                    w.write(String.format("        case \"%s\":\n", option.getKey().toLowerCase()));
                }
                if (option.isVoid()) {
                    w.write(String.format("        case \"%s\": %s; return null;\n", option.getKey(), invoke));
                } else {
                    w.write(String.format("        case \"%s\": return %s;\n", option.getKey(), invoke));
                }
            }
            w.write("        default: return null;\n");
            w.write("        }\n");
        }
        w.write("    }\n");
        w.write("\n");

        w.write("}\n");
        w.write("\n");
    }

}
