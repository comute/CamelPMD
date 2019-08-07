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
package org.apache.camel.component.properties.springboot;

import java.util.List;
import javax.annotation.Generated;
import org.apache.camel.component.properties.PropertiesLocation;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The properties component is used for using property placeholders in endpoint
 * uris.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.properties")
public class PropertiesComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the properties component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * A list of locations to load properties. This option will override any
     * default locations and only use the locations from this option.
     */
    private List<PropertiesLocation> locations;
    /**
     * A list of locations to load properties. You can use comma to separate
     * multiple locations. This option will override any default locations and
     * only use the locations from this option.
     */
    private String location;
    /**
     * Encoding to use when loading properties file from the file system or
     * classpath. If no encoding has been set, then the properties files is
     * loaded using ISO-8859-1 encoding (latin-1) as documented by
     * java.util.Properties#load(java.io.InputStream)
     */
    private String encoding;
    /**
     * To use a custom PropertiesParser. The option is a
     * org.apache.camel.component.properties.PropertiesParser type.
     */
    private String propertiesParser;
    /**
     * If false, the component does not attempt to find a default for the key by
     * looking after the colon separator.
     */
    private Boolean defaultFallbackEnabled = true;
    /**
     * Whether to silently ignore if a location cannot be located, such as a
     * properties file not found.
     */
    private Boolean ignoreMissingLocation = false;
    /**
     * Sets initial properties which will be used before any locations are
     * resolved. The option is a java.util.Properties type.
     */
    private String initialProperties;
    /**
     * Sets a special list of override properties that take precedence and will
     * use first, if a property exist. The option is a java.util.Properties
     * type.
     */
    private String overrideProperties;
    /**
     * Sets the JVM system property mode (0 = never, 1 = fallback, 2 =
     * override). The default mode (override) is to use system properties if
     * present, and override any existing properties. OS environment variable
     * mode is checked before JVM system property mode
     */
    private Integer systemPropertiesMode = 2;
    /**
     * Sets the OS environment variables mode (0 = never, 1 = fallback, 2 =
     * override). The default mode (override) is to use OS environment variables
     * if present, and override any existing properties. OS environment variable
     * mode is checked before JVM system property mode
     */
    private Integer environmentVariableMode = 2;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;

    public List<PropertiesLocation> getLocations() {
        return locations;
    }

    public void setLocations(List<PropertiesLocation> locations) {
        this.locations = locations;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public String getPropertiesParser() {
        return propertiesParser;
    }

    public void setPropertiesParser(String propertiesParser) {
        this.propertiesParser = propertiesParser;
    }

    public Boolean getDefaultFallbackEnabled() {
        return defaultFallbackEnabled;
    }

    public void setDefaultFallbackEnabled(Boolean defaultFallbackEnabled) {
        this.defaultFallbackEnabled = defaultFallbackEnabled;
    }

    public Boolean getIgnoreMissingLocation() {
        return ignoreMissingLocation;
    }

    public void setIgnoreMissingLocation(Boolean ignoreMissingLocation) {
        this.ignoreMissingLocation = ignoreMissingLocation;
    }

    public String getInitialProperties() {
        return initialProperties;
    }

    public void setInitialProperties(String initialProperties) {
        this.initialProperties = initialProperties;
    }

    public String getOverrideProperties() {
        return overrideProperties;
    }

    public void setOverrideProperties(String overrideProperties) {
        this.overrideProperties = overrideProperties;
    }

    public Integer getSystemPropertiesMode() {
        return systemPropertiesMode;
    }

    public void setSystemPropertiesMode(Integer systemPropertiesMode) {
        this.systemPropertiesMode = systemPropertiesMode;
    }

    public Integer getEnvironmentVariableMode() {
        return environmentVariableMode;
    }

    public void setEnvironmentVariableMode(Integer environmentVariableMode) {
        this.environmentVariableMode = environmentVariableMode;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }
}