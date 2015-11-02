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
package org.apache.camel.spring.boot.parent;

import org.apache.camel.CamelContext;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.junit.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.GenericApplicationContext;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/* Don't use
 * @RunWith(SpringJUnit4ClassRunner.class)
 * @SpringApplicationConfiguration(classes = Configuration.class)
 *
 * The point of the test is to manually setup a parent/child context
 * relationship and check if routes are initialized exactly once
 */
public class SpringBootWithParentContextTest {

    @Test
    public void shouldCollectRoutesOnlyInRootContext() {
        GenericApplicationContext parent = new GenericApplicationContext();
        parent.refresh();

        ConfigurableApplicationContext applicationContext =
                new SpringApplicationBuilder(Configuration.class).web(false).parent(parent).run();

        CamelContext camelContext = applicationContext.getBean(CamelContext.class);

        assertTrue("Camel context should be started", camelContext.getStatus().isStarted());
        assertNotNull("A 'test' route should be created", camelContext.getRoute("test"));
    }

}

@SpringBootApplication
class Configuration {

    @Bean
    RoutesBuilder routes() {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("seda:test")
                        .id("test")
                        .to("mock:test");
            }
        };
    }

}