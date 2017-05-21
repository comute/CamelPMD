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
package org.apache.camel.component.guava.eventbus.springboot;

import javax.annotation.Generated;
import com.google.common.eventbus.EventBus;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * The guava-eventbus component provides integration bridge between Camel and
 * Google Guava EventBus.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.guava-eventbus")
public class GuavaEventBusComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * To use the given Guava EventBus instance
     */
    @NestedConfigurationProperty
    private EventBus eventBus;
    /**
     * The interface with method(s) marked with the Subscribe annotation.
     * Dynamic proxy will be created over the interface so it could be
     * registered as the EventBus listener. Particularly useful when creating
     * multi-event listeners and for handling DeadEvent properly. This option
     * cannot be used together with eventClass option.
     */
    private Class listenerInterface;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public EventBus getEventBus() {
        return eventBus;
    }

    public void setEventBus(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public Class getListenerInterface() {
        return listenerInterface;
    }

    public void setListenerInterface(Class listenerInterface) {
        this.listenerInterface = listenerInterface;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }
}