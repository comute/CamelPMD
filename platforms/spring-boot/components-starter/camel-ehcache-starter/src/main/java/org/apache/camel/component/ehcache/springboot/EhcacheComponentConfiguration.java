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
package org.apache.camel.component.ehcache.springboot;

import java.util.Set;
import javax.annotation.Generated;
import org.apache.camel.component.ehcache.EhcacheComponent;
import org.ehcache.CacheManager;
import org.ehcache.config.CacheConfiguration;
import org.ehcache.config.Configuration;
import org.ehcache.event.EventFiring;
import org.ehcache.event.EventOrdering;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * The ehcache component enables you to perform caching operations using Ehcache
 * as cache implementation.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.ehcache")
public class EhcacheComponentConfiguration {

    /**
     * Sets the global component configuration
     */
    private EhcacheConfigurationNestedConfiguration configuration;
    /**
     * The cache manager
     */
    @NestedConfigurationProperty
    private CacheManager cacheManager;
    /**
     * The cache manager configuration
     */
    @NestedConfigurationProperty
    private Configuration cacheManagerConfiguration;
    /**
     * The default cache configuration to be used to create caches.
     */
    @NestedConfigurationProperty
    private CacheConfiguration<?, ?> cacheConfiguration;
    /**
     * URI pointing to the Ehcache XML configuration file's location
     */
    private String cacheConfigurationUri;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public EhcacheConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            EhcacheConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public CacheManager getCacheManager() {
        return cacheManager;
    }

    public void setCacheManager(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    public Configuration getCacheManagerConfiguration() {
        return cacheManagerConfiguration;
    }

    public void setCacheManagerConfiguration(
            Configuration cacheManagerConfiguration) {
        this.cacheManagerConfiguration = cacheManagerConfiguration;
    }

    public CacheConfiguration<?, ?> getCacheConfiguration() {
        return cacheConfiguration;
    }

    public void setCacheConfiguration(
            CacheConfiguration<?, ?> cacheConfiguration) {
        this.cacheConfiguration = cacheConfiguration;
    }

    public String getCacheConfigurationUri() {
        return cacheConfigurationUri;
    }

    public void setCacheConfigurationUri(String cacheConfigurationUri) {
        this.cacheConfigurationUri = cacheConfigurationUri;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public static class EhcacheConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.ehcache.EhcacheConfiguration.class;
        /**
         * URI pointing to the Ehcache XML configuration file's location
         */
        private String configurationUri;
        /**
         * URI pointing to the Ehcache XML configuration file's location
         * 
         * @deprecated use {@link #setConfigurationUri(String)} instead
         */
        @Deprecated
        private String configUri;
        /**
         * Configure if a cache need to be created if it does exist or can't be
         * pre-configured.
         */
        private Boolean createCacheIfNotExist = true;
        /**
         * To configure the default cache action. If an action is set in the
         * message header, then the operation from the header takes precedence.
         */
        private String action;
        /**
         * To configure the default action key. If a key is set in the message
         * header, then the key from the header takes precedence.
         */
        private Object key;
        /**
         * The cache manager
         */
        private CacheManager cacheManager;
        /**
         * The cache manager configuration
         */
        private Configuration cacheManagerConfiguration;
        private EventOrdering eventOrdering = EventOrdering.ORDERED;
        private EventFiring eventFiring = EventFiring.ASYNCHRONOUS;
        private Set eventTypes;
        /**
         * The default cache configuration to be used to create caches.
         */
        private CacheConfiguration configuration;
        /**
         * The cache key type, default "java.lang.Object"
         */
        private String keyType = "java.lang.Object";
        /**
         * The cache value type, default "java.lang.Object"
         */
        private String valueType = "java.lang.Object";

        public String getConfigurationUri() {
            return configurationUri;
        }

        public void setConfigurationUri(String configurationUri) {
            this.configurationUri = configurationUri;
        }

        @Deprecated
        @DeprecatedConfigurationProperty
        public String getConfigUri() {
            return configUri;
        }

        @Deprecated
        public void setConfigUri(String configUri) {
            this.configUri = configUri;
        }

        public Boolean getCreateCacheIfNotExist() {
            return createCacheIfNotExist;
        }

        public void setCreateCacheIfNotExist(Boolean createCacheIfNotExist) {
            this.createCacheIfNotExist = createCacheIfNotExist;
        }

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public Object getKey() {
            return key;
        }

        public void setKey(Object key) {
            this.key = key;
        }

        public CacheManager getCacheManager() {
            return cacheManager;
        }

        public void setCacheManager(CacheManager cacheManager) {
            this.cacheManager = cacheManager;
        }

        public Configuration getCacheManagerConfiguration() {
            return cacheManagerConfiguration;
        }

        public void setCacheManagerConfiguration(
                Configuration cacheManagerConfiguration) {
            this.cacheManagerConfiguration = cacheManagerConfiguration;
        }

        public EventOrdering getEventOrdering() {
            return eventOrdering;
        }

        public void setEventOrdering(EventOrdering eventOrdering) {
            this.eventOrdering = eventOrdering;
        }

        public EventFiring getEventFiring() {
            return eventFiring;
        }

        public void setEventFiring(EventFiring eventFiring) {
            this.eventFiring = eventFiring;
        }

        public Set getEventTypes() {
            return eventTypes;
        }

        public void setEventTypes(Set eventTypes) {
            this.eventTypes = eventTypes;
        }

        public CacheConfiguration getConfiguration() {
            return configuration;
        }

        public void setConfiguration(CacheConfiguration configuration) {
            this.configuration = configuration;
        }

        public String getKeyType() {
            return keyType;
        }

        public void setKeyType(String keyType) {
            this.keyType = keyType;
        }

        public String getValueType() {
            return valueType;
        }

        public void setValueType(String valueType) {
            this.valueType = valueType;
        }
    }
}