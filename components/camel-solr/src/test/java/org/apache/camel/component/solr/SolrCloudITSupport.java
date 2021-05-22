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
package org.apache.camel.component.solr;

import org.apache.camel.CamelContext;
import org.apache.camel.test.infra.solr.services.SolrLocalContainerCloudService;
import org.apache.camel.test.infra.solr.services.SolrLocalContainerService;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.extension.RegisterExtension;

public class SolrCloudITSupport extends CamelTestSupport {

    @RegisterExtension
    static SolrLocalContainerService service = new SolrLocalContainerCloudService();

    @Override
    protected CamelContext createCamelContext() throws Exception {
        CamelContext context = super.createCamelContext();
        SolrComponent solr = context.getComponent("solr", SolrComponent.class);
        return context;
    }

    protected String getSolrBaseUrl() {
        return service.getSolrBaseUrl();
    }

}
