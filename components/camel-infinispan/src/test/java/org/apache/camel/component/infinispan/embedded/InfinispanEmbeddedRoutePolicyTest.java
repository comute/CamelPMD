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
package org.apache.camel.component.infinispan.embedded;

import org.apache.camel.component.infinispan.InfinispanRoutePolicy;
import org.apache.camel.component.infinispan.InfinispanRoutePolicyTestSupport;
import org.junit.jupiter.api.BeforeEach;

public class InfinispanEmbeddedRoutePolicyTest extends InfinispanEmbeddedTestSupport
        implements InfinispanRoutePolicyTestSupport {

    @BeforeEach
    protected void beforeEach() {
        // cleanup the default test cache before each run
        getCache().clear();
    }

    // *****************************
    //
    // *****************************

    @Override
    public InfinispanRoutePolicy createRoutePolicy(String lockValue) {
        InfinispanEmbeddedConfiguration configuration = new InfinispanEmbeddedConfiguration();
        configuration.setCacheContainer(cacheContainer);

        InfinispanEmbeddedRoutePolicy policy = new InfinispanEmbeddedRoutePolicy(configuration);
        policy.setLockMapName(getCacheName());
        policy.setLockKey("lock-key");
        policy.setLockValue(lockValue);

        return policy;
    }
}
