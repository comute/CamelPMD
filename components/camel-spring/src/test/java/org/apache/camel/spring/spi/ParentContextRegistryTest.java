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
package org.apache.camel.spring.spi;

import org.apache.camel.spring.SpringTestSupport;
import org.junit.Assert;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collections;
import java.util.List;

public class ParentContextRegistryTest extends SpringTestSupport {
    private static final List<String> expectedBean = Collections.singletonList("TestValue");
    @Override
    protected AbstractXmlApplicationContext createApplicationContext() {
        ClassPathXmlApplicationContext parentContext = new ClassPathXmlApplicationContext(
                "parentContextRegistryTestParent.xml", ParentContextRegistryTest.class);
        return new ClassPathXmlApplicationContext(
                new String[] {"parentContextRegistryTestChild.xml"},
                ParentContextRegistryTest.class, parentContext
        );
    }

    public void testLookupByName() {
        Assert.assertEquals(expectedBean, context.getRegistry().lookupByName("testParentBean"));
    }

    public void testLookupByNameAndType() {
        Assert.assertEquals(expectedBean, context.getRegistry().lookupByNameAndType("testParentBean", List.class));
    }

    public void testFindByType() {
        Assert.assertEquals(Collections.singleton(expectedBean), context.getRegistry().findByType(List.class));
    }

    public void testFindByTypeWithName() {
        Assert.assertEquals(Collections.singletonMap("testParentBean", expectedBean),
                context.getRegistry().findByTypeWithName(List.class));
    }
}
