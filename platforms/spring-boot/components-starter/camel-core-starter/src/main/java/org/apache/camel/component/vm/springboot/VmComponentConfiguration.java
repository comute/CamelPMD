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
package org.apache.camel.component.vm.springboot;

import org.apache.camel.Exchange;
import org.apache.camel.component.seda.BlockingQueueFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * The vm component provides asynchronous call to another endpoint from the same
 * CamelContext.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.vm")
public class VmComponentConfiguration {

    /**
     * Sets the default maximum capacity of the SEDA queue (i.e. the number of
     * messages it can hold).
     */
    private Integer queueSize;
    /**
     * Sets the default number of concurrent threads processing exchanges.
     */
    private Integer concurrentConsumers = 1;
    /**
     * Sets the default queue factory.
     */
    @NestedConfigurationProperty
    private BlockingQueueFactory<Exchange> defaultQueueFactory;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public Integer getQueueSize() {
        return queueSize;
    }

    public void setQueueSize(Integer queueSize) {
        this.queueSize = queueSize;
    }

    public Integer getConcurrentConsumers() {
        return concurrentConsumers;
    }

    public void setConcurrentConsumers(Integer concurrentConsumers) {
        this.concurrentConsumers = concurrentConsumers;
    }

    public BlockingQueueFactory<Exchange> getDefaultQueueFactory() {
        return defaultQueueFactory;
    }

    public void setDefaultQueueFactory(
            BlockingQueueFactory<Exchange> defaultQueueFactory) {
        this.defaultQueueFactory = defaultQueueFactory;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }
}