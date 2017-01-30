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
package org.apache.camel.maven.connector;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.maven.artifact.Artifact;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.jar.AbstractJarMojo;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.plugins.annotations.ResolutionScope;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.*;
import java.util.stream.Collectors;

@Mojo(name = "jar", defaultPhase = LifecyclePhase.PREPARE_PACKAGE, requiresProject = true, threadSafe = true,
        requiresDependencyResolution = ResolutionScope.RUNTIME)
public class ConnectorMojo extends AbstractJarMojo {

    /**
     * Directory containing the classes and resource files that should be packaged into the JAR.
     */
    @Parameter(defaultValue = "${project.build.outputDirectory}", required = true)
    private File classesDirectory;

    /**
     * Whether to include the git url for the git repository of the source code for the Camel connector
     */
    @Parameter(defaultValue = "false")
    private boolean includeGitUrl;

    private ObjectMapper mapper = new ObjectMapper();
    {
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    @Override
    protected File getClassesDirectory() {
        return classesDirectory;
    }

    @Override
    protected String getClassifier() {
        // no classifier
        return null;
    }

    @Override
    protected String getType() {
        return "jar";
    }

    @Override
    public File createArchive() throws MojoExecutionException {

        String gitUrl = null;

        // find the component dependency and get its .json file
        File file = new File(classesDirectory, "camel-connector.json");
        if (file.exists()) {

            if (includeGitUrl) {
                // we want to include the git url of the project
                File gitFolder = GitHelper.findGitFolder();
                try {
                    gitUrl = GitHelper.extractGitUrl(gitFolder);
                } catch (IOException e) {
                    throw new MojoExecutionException("Cannot extract gitUrl due " + e.getMessage(), e);
                }
                if (gitUrl == null) {
                    getLog().warn("No .git directory found for connector");
                }
            }

            try {
                ComponentDTO allNewJsons = new ComponentDTO();

                ArrayList<Map> connectorConfigs = new ArrayList<Map>();

                Map data = mapper.readValue(file, Map.class);
                if( data.containsKey("connectors") ) {
                    connectorConfigs.addAll((Collection<? extends Map>) data.get("connectors"));
                } else {
                    connectorConfigs.add(data);
                    data = new HashMap();
                }

                for (Map config : connectorConfigs) {

                    // Lets merge the 2 maps so you can define common settings in the parent and override
                    // in the child connector level.
                    HashMap dto = new HashMap(data);
                    dto.putAll(config);

                    ComponentDTO newJson = processConnector(gitUrl, file, dto);
                    allNewJsons= newJson;
                    // allNewJsons.add(newJson);
                }

                // also write the file in the root folder so its easier to find that for tooling
                File out = new File(classesDirectory,"camel-connector-schema.json");
                FileOutputStream fos = new FileOutputStream(out, false);
                mapper.writeValue(fos, allNewJsons);
                fos.close();

                // build json schema for component that only has the selectable options
            } catch (Exception e) {
                throw new MojoExecutionException("Error in camel-connector-maven-plugin", e);
            }
        }

        return super.createArchive();
    }

    /**
     * Little helper class to read/write the json models.
     */
    public static class ComponentDTO {
        public ComponentHeaderDTO component = new ComponentHeaderDTO();
        public Map<String, Map> componentProperties = new HashMap<>();
        public Map<String, Map> properties = new HashMap<>();
    }

    public static class ComponentHeaderDTO {
        public String gitUrl;
        public String kind;
        public String baseScheme;
        public String scheme;
        public String syntax;
        public String title;
        public String description;
        public String label;
        public Boolean deprecated;
        public String async;
        public Boolean producerOnly;
        public Boolean consumerOnly;
        public String lenientProperties;
        public String javaType;
        public String groupId;
        public String artifactId;
        public String version;
    }

    private ComponentDTO processConnector(String gitUrl, File file, Map dto) throws MojoExecutionException, Exception, JsonProcessingException {
        // embed gitUrl in camel-connector.json file
        if (gitUrl != null) {
            String existingGitUrl = (String) dto.get("gitUrl");
            if (existingGitUrl == null || !existingGitUrl.equals(gitUrl)) {
                dto.put("gitUrl", gitUrl);
                // update file
                mapper.writerWithDefaultPrettyPrinter().writeValue(file, dto);
                // update source file also
                File root = classesDirectory.getParentFile().getParentFile();
                file = new File(root, "src/main/resources/camel-connector.json");
                if (file.exists()) {
                    getLog().info("Updating gitUrl to " + file);
                    mapper.writerWithDefaultPrettyPrinter().writeValue(file, dto);
                }
            }
        }

        File schema = embedCamelComponentSchema(file);
        ComponentDTO newJson = null;
        if (schema != null) {

            ComponentDTO json = mapper.readValue(schema, ComponentDTO.class);

            newJson = new ComponentDTO();

            newJson.component = buildComponentHeaderSchema(json, dto, gitUrl);
            getLog().debug(mapper.writeValueAsString(newJson.component));

            newJson.componentProperties = buildComponentOptionsSchema(json, dto);
            getLog().debug(mapper.writeValueAsString(newJson.componentProperties));

            newJson.properties = buildEndpointOptionsSchema(json, dto);
            getLog().debug(mapper.writeValueAsString(newJson.properties));

            // generate the json file
            String newScheme = newJson.component.scheme;

            // write the json file to the target directory as if camel apt would do it
            String javaType = (String) dto.get("javaType");
            String dir = javaType.substring(0, javaType.lastIndexOf("."));
            dir = dir.replace('.', '/');
            File subDir = new File(classesDirectory, dir);
            String name = newScheme + ".json";
            File out = new File(subDir, name);

            FileOutputStream fos = new FileOutputStream(out, false);
            mapper.writeValue(fos, newJson);
            fos.close();
        }
        return newJson;
    }

    private String extractJavaType(String scheme) throws Exception {
        File file = new File(classesDirectory, "META-INF/services/org/apache/camel/component/" + scheme);
        if (file.exists()) {
            List<String> lines = FileHelper.loadFile(file);
            String fqn = extractClass(lines);
            return fqn;
        }
        return null;
    }

    private String getOption(List<Map<String, String>> rows, String key) {
        for (Map<String, String> row : rows) {
            if (row.containsKey(key)) {
                return row.get(key);
            }
        }
        return null;
    }

    private Map<String, Map> buildComponentOptionsSchema(ComponentDTO source, Map dto) throws JsonProcessingException {
        HashMap<String, Map> rc = new HashMap<>();
        // we do not offer editing component properties (yet) so skip this for now..
//        for (Map.Entry<String, Map> entry : source.componentProperties.entrySet()) {
//            rc.put(entry.getKey(), entry.getValue());
//        }
        return rc;
    }

    private Map<String, Map> buildEndpointOptionsSchema(ComponentDTO source, Map dto) throws JsonProcessingException {
        // find the endpoint options
        List options = (List) dto.get("endpointOptions");
        Map values = (Map) dto.get("endpointValues");
        Map overrides = (Map) dto.get("endpointOverrides");

        HashMap<String, Map> rc = new HashMap<>();
        for (Map.Entry<String, Map> entry : source.properties.entrySet()) {
            HashMap<String, String> row = new HashMap<>(entry.getValue());
            String key = entry.getKey();

            if (options == null || !options.contains(key)) {
                continue;
            }

            // do we have a new default value for this row?
            if (values != null && values.containsKey(key)) {
                String newDefaultValue = (String) values.get(key);
                if (newDefaultValue != null) {
                    row.put("defaultValue", newDefaultValue);
                }
            }

            // is there any overrides for this row?
            if (overrides != null && overrides.containsKey(key)) {
                Map over = (Map) overrides.get(key);
                if (over != null) {
                    row.putAll(over);
                }
            }
            rc.put(key, row);
        }
        return rc;
    }


    private ComponentHeaderDTO buildComponentHeaderSchema(ComponentDTO soruce, Map dto, String gitUrl) throws Exception {
        String baseScheme = (String) dto.get("baseScheme");
        String title = (String) dto.get("name");
        String scheme = StringHelper.camelCaseToDash(title);
        String baseSyntax = soruce.component.syntax;
        String syntax = baseSyntax.replaceFirst(baseScheme, scheme);

        String description = (String) dto.get("description");
        // dto has labels
        String label = null;
        List<String> labels = (List<String>) dto.get("labels");
        if (labels != null) {
            label = labels.stream().collect(Collectors.joining(","));
        }
        String async = soruce.component.async;
        String pattern = (String) dto.get("pattern");
        boolean producerOnly = "To".equalsIgnoreCase(pattern);
        boolean consumerOnly = "From".equalsIgnoreCase(pattern);
        String lenientProperties = soruce.component.lenientProperties;
        String javaType = extractJavaType(scheme);
        String groupId = getProject().getGroupId();
        String artifactId = getProject().getArtifactId();
        String version = getProject().getVersion();

        ComponentHeaderDTO rc = new ComponentHeaderDTO();
        rc.gitUrl = gitUrl;
        rc.kind = "component";
        rc.baseScheme = StringHelper.nullSafe(baseScheme);
        rc.scheme = scheme;
        rc.syntax = syntax;
        rc.title = title;
        rc.description = description;
        rc.label = label;
        rc.deprecated = false;
        rc.async = async;
        rc.producerOnly = producerOnly;
        rc.consumerOnly = consumerOnly;
        rc.lenientProperties = lenientProperties;
        rc.javaType = javaType;
        rc.groupId = groupId;
        rc.artifactId = artifactId;
        rc.version = version;
        return rc;
    }

    /**
     * Finds and embeds the Camel component JSon schema file
     */
    private File embedCamelComponentSchema(File file) throws MojoExecutionException {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Map dto = mapper.readValue(file, Map.class);

            String scheme = extractScheme(dto);
            String groupId = extractGroupId(dto);
            String artifactId = extractArtifactId(dto);
            String version = extractVersion(dto);

            // find the artifact on the classpath that has the Camel component this connector is using
            // then we want to grab its json schema file to embed in this JAR so we have all files together

            if (scheme != null && groupId != null && artifactId != null) {
                for (Object obj : getProject().getDependencyArtifacts()) {
                    Artifact artifact = (Artifact) obj;
                    if ("jar".equals(artifact.getType())) {
                        if (groupId.equals(artifact.getGroupId()) && artifactId.equals(artifact.getArtifactId()) && version.equals(artifact.getVersion())) {
                            // load the component file inside the file
                            URL url = new URL("file:" + artifact.getFile());
                            URLClassLoader child = new URLClassLoader(new URL[]{url}, this.getClass().getClassLoader());

                            InputStream is = child.getResourceAsStream("META-INF/services/org/apache/camel/component/" + scheme);
                            if (is != null) {
                                List<String> lines = FileHelper.loadFile(is);
                                String fqn = extractClass(lines);
                                is.close();

                                // only keep package
                                String pck = fqn.substring(0, fqn.lastIndexOf("."));
                                String name = pck.replace(".", "/") + "/" + scheme + ".json";

                                is = child.getResourceAsStream(name);
                                if (is != null) {
                                    List<String> schema = FileHelper.loadFile(is);
                                    is.close();

                                    // write schema to file
                                    File out = new File(classesDirectory, "camel-component-schema.json");
                                    FileOutputStream fos = new FileOutputStream(out, false);
                                    for (String line : schema) {
                                        fos.write(line.getBytes());
                                        fos.write("\n".getBytes());
                                    }
                                    fos.close();

                                    getLog().info("Embedded camel-component-schema.json file for Camel component " + scheme);

                                    return out;
                                }
                            }
                        }
                    }
                }
            }

        } catch (Exception e) {
            throw new MojoExecutionException("Cannot read file camel-connector.json", e);
        }

        return null;
    }

    private String extractClass(List<String> lines) {
        for (String line : lines) {
            line = line.trim();
            if (line.startsWith("class=")) {
                return line.substring(6);
            }
        }
        return null;
    }

    private String extractScheme(Map map) {
        return (String) map.get("baseScheme");
    }

    private String extractGroupId(Map map) {
        return (String) map.get("baseGroupId");
    }

    private String extractArtifactId(Map map) {
        return (String) map.get("baseArtifactId");
    }

    private String extractVersion(Map map) {
        return (String) map.get("baseVersion");
    }

}
