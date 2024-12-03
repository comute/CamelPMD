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

package org.apache.camel.test.infra.messaging.services;

import java.util.function.Function;

import org.apache.camel.test.infra.common.services.SimpleTestServiceBuilder;
import org.testcontainers.containers.GenericContainer;

public final class MessagingServiceFactory {

    private MessagingServiceFactory() {

    }

    public static SimpleTestServiceBuilder<MessagingTestService> builder() {
        return new SimpleTestServiceBuilder<>("messaging");
    }

    public static MessagingTestService createService() {
        return builder()
                .addRemoteMapping(MessagingRemoteTestService::new)
                .build();
    }

    public static class MessagingRemoteTestService extends MessagingRemoteService implements MessagingTestService {
    }

    public static class MessagingLocalContainerTestService<T extends GenericContainer<T>> extends MessagingLocalContainerService
            implements MessagingTestService {
        public MessagingLocalContainerTestService(GenericContainer container, Function endpointFunction) {
            super(container, endpointFunction);
        }
    }
}
