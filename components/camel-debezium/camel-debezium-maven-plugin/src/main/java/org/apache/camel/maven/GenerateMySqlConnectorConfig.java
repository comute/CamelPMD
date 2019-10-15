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
package org.apache.camel.maven;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import io.debezium.connector.mysql.MySqlConnector;
import io.debezium.connector.mysql.MySqlConnectorConfig;
import io.debezium.relational.history.FileDatabaseHistory;
import org.apache.kafka.connect.source.SourceConnector;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "generate-mysql-connector-config", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
public class GenerateMySqlConnectorConfig extends AbstractGenerateConnectorConfig {

    @Override
    protected Set<String> getRequiredFields() {
        return new HashSet<>(Arrays.asList(MySqlConnectorConfig.PASSWORD.name(), MySqlConnectorConfig.SERVER_NAME.name()));
    }

    @Override
    protected Map<String, Object> getOverrideFields() {
        final Map<String, Object> overrideFields = new HashMap<>();
        overrideFields.put(MySqlConnectorConfig.DATABASE_HISTORY.name(), FileDatabaseHistory.class);
        overrideFields.put(MySqlConnectorConfig.TOMBSTONES_ON_DELETE.name(), false);

        return overrideFields;
    }

    @Override
    protected SourceConnector getConnector() {
        return new MySqlConnector();
    }

    @Override
    protected Class<?> getConnectorConfigClass() {
        return MySqlConnectorConfig.class;
    }
}
