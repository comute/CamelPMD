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
package org.apache.camel.component.stitch;

import java.util.Map;

import org.apache.camel.Endpoint;
import org.apache.camel.spi.Metadata;
import org.apache.camel.spi.annotations.Component;
import org.apache.camel.support.DefaultComponent;
import org.apache.camel.util.ObjectHelper;

/**
 * Stitch component
 */
@Component("stitch")
public class StitchComponent extends DefaultComponent {

    @Metadata
    private StitchConfiguration configuration = new StitchConfiguration();

    public StitchComponent() {
    }

    @Override
    protected Endpoint createEndpoint(String uri, String remaining, Map<String, Object> parameters) throws Exception {

        if (ObjectHelper.isEmpty(remaining)) {
            throw new IllegalArgumentException("Table name must be configured on endpoint using syntax stitch:tableName");
        }

        final StitchConfiguration configuration
                = this.configuration != null ? this.configuration.copy() : new StitchConfiguration();

        configuration.setTableName(remaining);

        final StitchEndpoint endpoint = new StitchEndpoint(uri, this, configuration);
        setProperties(endpoint, parameters);

        validateConfigurations(configuration);

        return endpoint;
    }

    /**
     * The component configurations
     */
    public StitchConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(StitchConfiguration configuration) {
        this.configuration = configuration;
    }

    private void validateConfigurations(final StitchConfiguration configuration) {
        if (ObjectHelper.isEmpty(configuration.getToken())) {
            throw new IllegalArgumentException("Token must be configured in 'token' option.");
        }
    }
}
