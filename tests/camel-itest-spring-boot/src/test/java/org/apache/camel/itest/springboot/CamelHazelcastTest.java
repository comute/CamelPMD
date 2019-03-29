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
package org.apache.camel.itest.springboot;

import org.apache.camel.itest.springboot.util.ArquillianPackager;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(Arquillian.class)
public class CamelHazelcastTest extends AbstractSpringBootTestSupport {

    @Deployment
    public static Archive<?> createSpringBootPackage() throws Exception {
        return ArquillianPackager.springBootPackage(createTestConfig());
    }

    public static ITestConfig createTestConfig() {
        return new ITestConfigBuilder()
                .module(inferModuleName(CamelHazelcastTest.class))
                .unitTestExclusionPattern(".*(\\.integration\\..*|IntegrationTest$|HazelcastAggregationRepositoryOperationsTest$)")
                // the test fails when running in normal conditions
                // arquillian fails, but the tests are ok
                .build();
    }

    @Test
    public void componentTests() throws Exception {
        this.runComponentTest(config, "hazelcast-list");
        this.runComponentTest(config, "hazelcast-map");
        this.runComponentTest(config, "hazelcast-replicatedmap");
        this.runComponentTest(config, "hazelcast-queue");
        this.runComponentTest(config, "hazelcast-topic");
        this.runComponentTest(config, "hazelcast-set");
        this.runComponentTest(config, "hazelcast-seda");
        this.runComponentTest(config, "hazelcast-multimap");
        this.runComponentTest(config, "hazelcast-ringbuffer");
        this.runComponentTest(config, "hazelcast-instance");
        this.runComponentTest(config, "hazelcast-atomicvalue");

        this.runModuleUnitTestsIfEnabled(config);
    }


}
