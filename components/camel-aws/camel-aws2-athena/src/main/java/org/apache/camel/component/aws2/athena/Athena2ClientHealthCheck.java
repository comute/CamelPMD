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

package org.apache.camel.component.aws2.athena;

import java.util.Map;

import org.apache.camel.health.HealthCheckResultBuilder;
import org.apache.camel.impl.health.AbstractHealthCheck;
import org.apache.camel.util.ObjectHelper;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.awscore.exception.AwsServiceException;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.athena.AthenaClient;
import software.amazon.awssdk.services.athena.AthenaClientBuilder;

public class Athena2ClientHealthCheck extends AbstractHealthCheck {

    private final Athena2Endpoint athena2Endpoint;
    private final String clientId;

    public Athena2ClientHealthCheck(Athena2Endpoint athena2Endpoint, String clientId) {
        super("camel", "aws2-athena-client-" + clientId);
        this.athena2Endpoint = athena2Endpoint;
        this.clientId = clientId;
    }

    @Override
    public boolean isLiveness() {
        // this health check is only readiness
        return false;
    }

    @Override
    protected void doCall(HealthCheckResultBuilder builder, Map<String, Object> options) {

        try {
            if (ObjectHelper.isNotEmpty(athena2Endpoint.getConfiguration().getRegion())) {
                if (!AthenaClient.serviceMetadata().regions()
                        .contains(Region.of(athena2Endpoint.getConfiguration().getRegion()))) {
                    builder.message("The service is not supported in this region");
                    builder.down();
                    return;
                }
            }
            AthenaClient client;
            if (Boolean.FALSE.equals(athena2Endpoint.getConfiguration().isUseDefaultCredentialsProvider())) {
                AwsBasicCredentials cred = AwsBasicCredentials.create(athena2Endpoint.getConfiguration().getAccessKey(),
                        athena2Endpoint.getConfiguration().getSecretKey());
                AthenaClientBuilder clientBuilder = AthenaClient.builder();
                client = clientBuilder.credentialsProvider(StaticCredentialsProvider.create(cred))
                        .region(Region.of(athena2Endpoint.getConfiguration().getRegion())).build();
            } else if (ObjectHelper.isNotEmpty(athena2Endpoint.getConfiguration().getAmazonAthenaClient())) {
                client = athena2Endpoint.getConfiguration().getAmazonAthenaClient();
            } else {
                AthenaClientBuilder clientBuilder = AthenaClient.builder();
                client = clientBuilder.region(Region.of(athena2Endpoint.getConfiguration().getRegion())).build();
            }
            client.listQueryExecutions();
        } catch (AwsServiceException e) {
            builder.message(e.getMessage());
            builder.error(e);
            if (ObjectHelper.isNotEmpty(e.statusCode())) {
                builder.detail(SERVICE_STATUS_CODE, e.statusCode());
            }
            if (ObjectHelper.isNotEmpty(e.awsErrorDetails().errorCode())) {
                builder.detail(SERVICE_ERROR_CODE, e.awsErrorDetails().errorCode());
            }
            builder.down();
            return;

        } catch (Exception e) {
            builder.error(e);
            builder.down();
            return;
        }
        builder.up();
    }
}
