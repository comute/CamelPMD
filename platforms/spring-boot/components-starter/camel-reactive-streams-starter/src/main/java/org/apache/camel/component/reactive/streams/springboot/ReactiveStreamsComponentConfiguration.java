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
package org.apache.camel.component.reactive.streams.springboot;

import org.apache.camel.component.reactive.streams.ReactiveStreamsBackpressureStrategy;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The Camel reactive-streams endpoint.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.reactive-streams")
public class ReactiveStreamsComponentConfiguration {

    /**
     * Configures the internal engine for Reactive Streams.
     */
    private ReactiveStreamsEngineConfigurationNestedConfiguration internalEngineConfiguration;
    /**
     * The backpressure strategy to use when pushing events to a slow
     * subscriber.
     */
    private ReactiveStreamsBackpressureStrategy backpressureStrategy;

    public ReactiveStreamsEngineConfigurationNestedConfiguration getInternalEngineConfiguration() {
        return internalEngineConfiguration;
    }

    public void setInternalEngineConfiguration(
            ReactiveStreamsEngineConfigurationNestedConfiguration internalEngineConfiguration) {
        this.internalEngineConfiguration = internalEngineConfiguration;
    }

    public ReactiveStreamsBackpressureStrategy getBackpressureStrategy() {
        return backpressureStrategy;
    }

    public void setBackpressureStrategy(
            ReactiveStreamsBackpressureStrategy backpressureStrategy) {
        this.backpressureStrategy = backpressureStrategy;
    }

    public static class ReactiveStreamsEngineConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.reactive.streams.engine.ReactiveStreamsEngineConfiguration.class;
        /**
         * The name of the thread pool used by the reactive streams internal
         * engine.
         */
        private String threadPoolName;
        /**
         * The minimum number of threads used by the reactive streams internal
         * engine.
         */
        private Integer threadPoolMinSize;
        /**
         * The maximum number of threads used by the reactive streams internal
         * engine.
         */
        private Integer threadPoolMaxSize;

        public String getThreadPoolName() {
            return threadPoolName;
        }

        public void setThreadPoolName(String threadPoolName) {
            this.threadPoolName = threadPoolName;
        }

        public Integer getThreadPoolMinSize() {
            return threadPoolMinSize;
        }

        public void setThreadPoolMinSize(Integer threadPoolMinSize) {
            this.threadPoolMinSize = threadPoolMinSize;
        }

        public Integer getThreadPoolMaxSize() {
            return threadPoolMaxSize;
        }

        public void setThreadPoolMaxSize(Integer threadPoolMaxSize) {
            this.threadPoolMaxSize = threadPoolMaxSize;
        }
    }
}