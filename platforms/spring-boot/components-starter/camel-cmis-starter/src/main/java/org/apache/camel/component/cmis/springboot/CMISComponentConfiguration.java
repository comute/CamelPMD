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
package org.apache.camel.component.cmis.springboot;

import javax.annotation.Generated;
import org.apache.camel.component.cmis.CMISSessionFacadeFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * The cmis component uses the Apache Chemistry client API and allows you to
 * add/read nodes to/from a CMIS compliant content repositories.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.cmis")
public class CMISComponentConfiguration {

    /**
     * To use a custom CMISSessionFacadeFactory to create the CMISSessionFacade
     * instances
     */
    @NestedConfigurationProperty
    private CMISSessionFacadeFactory sessionFacadeFactory;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public CMISSessionFacadeFactory getSessionFacadeFactory() {
        return sessionFacadeFactory;
    }

    public void setSessionFacadeFactory(
            CMISSessionFacadeFactory sessionFacadeFactory) {
        this.sessionFacadeFactory = sessionFacadeFactory;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }
}
