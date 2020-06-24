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
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.minio.MinioComponent;

/**
 * Represents a Minio endpoint.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface MinioComponentBuilderFactory {

    /**
     * Minio (camel-minio)
     * Represents a Minio endpoint.
     * 
     * Category: storage,cloud,file
     * Since: 3.5
     * Maven coordinates: org.apache.camel:camel-minio
     */
    static MinioComponentBuilder minio() {
        return new MinioComponentBuilderImpl();
    }

    /**
     * Builder for the Minio component.
     */
    interface MinioComponentBuilder extends ComponentBuilder<MinioComponent> {
        /**
         * Some description of this option(getAccessKey), and what it does.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default MinioComponentBuilder accessKey(java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * The component configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.minio.MinioConfiguration</code>
         * type.
         * 
         * Group: common
         */
        default MinioComponentBuilder configuration(
                org.apache.camel.component.minio.MinioConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Some description of this option(isPathStyleAccess), and what it does.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default MinioComponentBuilder pathStyleAccess(boolean pathStyleAccess) {
            doSetProperty("pathStyleAccess", pathStyleAccess);
            return this;
        }
        /**
         * Some description of this option(getPolicy), and what it does.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default MinioComponentBuilder policy(java.lang.String policy) {
            doSetProperty("policy", policy);
            return this;
        }
        /**
         * Some description of this option(getSecretKey), and what it does.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default MinioComponentBuilder secretKey(java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Some description of this option(isSecure), and what it does.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default MinioComponentBuilder secure(boolean secure) {
            doSetProperty("secure", secure);
            return this;
        }
        /**
         * Some description of this option(isAutocloseBody), and what it does.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default MinioComponentBuilder autocloseBody(boolean autocloseBody) {
            doSetProperty("autocloseBody", autocloseBody);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default MinioComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Some description of this option(isDeleteAfterRead), and what it does.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default MinioComponentBuilder deleteAfterRead(boolean deleteAfterRead) {
            doSetProperty("deleteAfterRead", deleteAfterRead);
            return this;
        }
        /**
         * Some description of this option(getFileName), and what it does.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default MinioComponentBuilder fileName(java.lang.String fileName) {
            doSetProperty("fileName", fileName);
            return this;
        }
        /**
         * Some description of this option(isIncludeBody), and what it does.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default MinioComponentBuilder includeBody(boolean includeBody) {
            doSetProperty("includeBody", includeBody);
            return this;
        }
        /**
         * Some description of this option(getPrefix), and what it does.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default MinioComponentBuilder prefix(java.lang.String prefix) {
            doSetProperty("prefix", prefix);
            return this;
        }
        /**
         * Some description of this option(isDeleteAfterWrite), and what it
         * does.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default MinioComponentBuilder deleteAfterWrite(boolean deleteAfterWrite) {
            doSetProperty("deleteAfterWrite", deleteAfterWrite);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default MinioComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Some description of this option(isMultiPartUpload), and what it does.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default MinioComponentBuilder multiPartUpload(boolean multiPartUpload) {
            doSetProperty("multiPartUpload", multiPartUpload);
            return this;
        }
        /**
         * Some description of this option(getOperation), and what it does.
         * 
         * The option is a:
         * <code>org.apache.camel.component.minio.MinioOperations</code> type.
         * 
         * Group: producer
         */
        default MinioComponentBuilder operation(
                org.apache.camel.component.minio.MinioOperations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Some description of this option(getPartSize), and what it does.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 26214400
         * Group: producer
         */
        default MinioComponentBuilder partSize(long partSize) {
            doSetProperty("partSize", partSize);
            return this;
        }
        /**
         * Some description of this option(getRegion), and what it does.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default MinioComponentBuilder region(java.lang.String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Some description of this option(getServerSideEncryption), and what it
         * does.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default MinioComponentBuilder serverSideEncryption(
                java.lang.String serverSideEncryption) {
            doSetProperty("serverSideEncryption", serverSideEncryption);
            return this;
        }
        /**
         * Some description of this option(getStorageClass), and what it does.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default MinioComponentBuilder storageClass(java.lang.String storageClass) {
            doSetProperty("storageClass", storageClass);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default MinioComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
    }

    class MinioComponentBuilderImpl
            extends
                AbstractComponentBuilder<MinioComponent>
            implements
                MinioComponentBuilder {
        @Override
        protected MinioComponent buildConcreteComponent() {
            return new MinioComponent();
        }
        private org.apache.camel.component.minio.MinioConfiguration getOrCreateConfiguration(
                org.apache.camel.component.minio.MinioComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.minio.MinioConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "accessKey": getOrCreateConfiguration((MinioComponent) component).setAccessKey((java.lang.String) value); return true;
            case "configuration": ((MinioComponent) component).setConfiguration((org.apache.camel.component.minio.MinioConfiguration) value); return true;
            case "pathStyleAccess": getOrCreateConfiguration((MinioComponent) component).setPathStyleAccess((boolean) value); return true;
            case "policy": getOrCreateConfiguration((MinioComponent) component).setPolicy((java.lang.String) value); return true;
            case "secretKey": getOrCreateConfiguration((MinioComponent) component).setSecretKey((java.lang.String) value); return true;
            case "secure": getOrCreateConfiguration((MinioComponent) component).setSecure((boolean) value); return true;
            case "autocloseBody": getOrCreateConfiguration((MinioComponent) component).setAutocloseBody((boolean) value); return true;
            case "bridgeErrorHandler": ((MinioComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "deleteAfterRead": getOrCreateConfiguration((MinioComponent) component).setDeleteAfterRead((boolean) value); return true;
            case "fileName": getOrCreateConfiguration((MinioComponent) component).setObjectName((java.lang.String) value); return true;
            case "includeBody": getOrCreateConfiguration((MinioComponent) component).setIncludeBody((boolean) value); return true;
            case "prefix": getOrCreateConfiguration((MinioComponent) component).setPrefix((java.lang.String) value); return true;
            case "deleteAfterWrite": getOrCreateConfiguration((MinioComponent) component).setDeleteAfterWrite((boolean) value); return true;
            case "lazyStartProducer": ((MinioComponent) component).setLazyStartProducer((boolean) value); return true;
            case "multiPartUpload": getOrCreateConfiguration((MinioComponent) component).setMultiPartUpload((boolean) value); return true;
            case "operation": getOrCreateConfiguration((MinioComponent) component).setOperation((org.apache.camel.component.minio.MinioOperations) value); return true;
            case "partSize": getOrCreateConfiguration((MinioComponent) component).setPartSize((long) value); return true;
            case "region": getOrCreateConfiguration((MinioComponent) component).setRegion((java.lang.String) value); return true;
            case "serverSideEncryption": getOrCreateConfiguration((MinioComponent) component).setServerSideEncryption((java.lang.String) value); return true;
            case "storageClass": getOrCreateConfiguration((MinioComponent) component).setStorageClass((java.lang.String) value); return true;
            case "basicPropertyBinding": ((MinioComponent) component).setBasicPropertyBinding((boolean) value); return true;
            default: return false;
            }
        }
    }
}