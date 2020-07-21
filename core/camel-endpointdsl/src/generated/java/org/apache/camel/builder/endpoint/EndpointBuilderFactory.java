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
//CHECKSTYLE:OFF
package org.apache.camel.builder.endpoint;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Generated;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface EndpointBuilderFactory
        extends
            org.apache.camel.builder.endpoint.dsl.AMQPEndpointBuilderFactory.AMQPBuilders,
            org.apache.camel.builder.endpoint.dsl.AS2EndpointBuilderFactory.AS2Builders,
            org.apache.camel.builder.endpoint.dsl.AWS2EC2EndpointBuilderFactory.AWS2EC2Builders,
            org.apache.camel.builder.endpoint.dsl.AWS2S3EndpointBuilderFactory.AWS2S3Builders,
            org.apache.camel.builder.endpoint.dsl.ActiveMQEndpointBuilderFactory.ActiveMQBuilders,
            org.apache.camel.builder.endpoint.dsl.AhcEndpointBuilderFactory.AhcBuilders,
            org.apache.camel.builder.endpoint.dsl.ApnsEndpointBuilderFactory.ApnsBuilders,
            org.apache.camel.builder.endpoint.dsl.ArangoDbEndpointBuilderFactory.ArangoDbBuilders,
            org.apache.camel.builder.endpoint.dsl.AsteriskEndpointBuilderFactory.AsteriskBuilders,
            org.apache.camel.builder.endpoint.dsl.Athena2EndpointBuilderFactory.Athena2Builders,
            org.apache.camel.builder.endpoint.dsl.AtmosEndpointBuilderFactory.AtmosBuilders,
            org.apache.camel.builder.endpoint.dsl.AtmosphereWebsocketEndpointBuilderFactory.AtmosphereWebsocketBuilders,
            org.apache.camel.builder.endpoint.dsl.AtomEndpointBuilderFactory.AtomBuilders,
            org.apache.camel.builder.endpoint.dsl.AtomixMapEndpointBuilderFactory.AtomixMapBuilders,
            org.apache.camel.builder.endpoint.dsl.AtomixMessagingEndpointBuilderFactory.AtomixMessagingBuilders,
            org.apache.camel.builder.endpoint.dsl.AtomixMultiMapEndpointBuilderFactory.AtomixMultiMapBuilders,
            org.apache.camel.builder.endpoint.dsl.AtomixQueueEndpointBuilderFactory.AtomixQueueBuilders,
            org.apache.camel.builder.endpoint.dsl.AtomixSetEndpointBuilderFactory.AtomixSetBuilders,
            org.apache.camel.builder.endpoint.dsl.AtomixValueEndpointBuilderFactory.AtomixValueBuilders,
            org.apache.camel.builder.endpoint.dsl.AvroEndpointBuilderFactory.AvroBuilders,
            org.apache.camel.builder.endpoint.dsl.BeanEndpointBuilderFactory.BeanBuilders,
            org.apache.camel.builder.endpoint.dsl.BeanValidatorEndpointBuilderFactory.BeanValidatorBuilders,
            org.apache.camel.builder.endpoint.dsl.BeanstalkEndpointBuilderFactory.BeanstalkBuilders,
            org.apache.camel.builder.endpoint.dsl.BlobEndpointBuilderFactory.BlobBuilders,
            org.apache.camel.builder.endpoint.dsl.BlobServiceEndpointBuilderFactory.BlobServiceBuilders,
            org.apache.camel.builder.endpoint.dsl.BonitaEndpointBuilderFactory.BonitaBuilders,
            org.apache.camel.builder.endpoint.dsl.BoxEndpointBuilderFactory.BoxBuilders,
            org.apache.camel.builder.endpoint.dsl.BraintreeEndpointBuilderFactory.BraintreeBuilders,
            org.apache.camel.builder.endpoint.dsl.BrowseEndpointBuilderFactory.BrowseBuilders,
            org.apache.camel.builder.endpoint.dsl.CMEndpointBuilderFactory.CMBuilders,
            org.apache.camel.builder.endpoint.dsl.CMISEndpointBuilderFactory.CMISBuilders,
            org.apache.camel.builder.endpoint.dsl.CaffeineCacheEndpointBuilderFactory.CaffeineCacheBuilders,
            org.apache.camel.builder.endpoint.dsl.CaffeineLoadCacheEndpointBuilderFactory.CaffeineLoadCacheBuilders,
            org.apache.camel.builder.endpoint.dsl.CassandraEndpointBuilderFactory.CassandraBuilders,
            org.apache.camel.builder.endpoint.dsl.ChatScriptEndpointBuilderFactory.ChatScriptBuilders,
            org.apache.camel.builder.endpoint.dsl.ChunkEndpointBuilderFactory.ChunkBuilders,
            org.apache.camel.builder.endpoint.dsl.CinderEndpointBuilderFactory.CinderBuilders,
            org.apache.camel.builder.endpoint.dsl.ClassEndpointBuilderFactory.ClassBuilders,
            org.apache.camel.builder.endpoint.dsl.ClientEndpointBuilderFactory.ClientBuilders,
            org.apache.camel.builder.endpoint.dsl.CoAPEndpointBuilderFactory.CoAPBuilders,
            org.apache.camel.builder.endpoint.dsl.CometdEndpointBuilderFactory.CometdBuilders,
            org.apache.camel.builder.endpoint.dsl.ConsulEndpointBuilderFactory.ConsulBuilders,
            org.apache.camel.builder.endpoint.dsl.ControlBusEndpointBuilderFactory.ControlBusBuilders,
            org.apache.camel.builder.endpoint.dsl.CordaEndpointBuilderFactory.CordaBuilders,
            org.apache.camel.builder.endpoint.dsl.CouchDbEndpointBuilderFactory.CouchDbBuilders,
            org.apache.camel.builder.endpoint.dsl.CouchbaseEndpointBuilderFactory.CouchbaseBuilders,
            org.apache.camel.builder.endpoint.dsl.CronEndpointBuilderFactory.CronBuilders,
            org.apache.camel.builder.endpoint.dsl.CryptoCmsEndpointBuilderFactory.CryptoCmsBuilders,
            org.apache.camel.builder.endpoint.dsl.Cw2EndpointBuilderFactory.Cw2Builders,
            org.apache.camel.builder.endpoint.dsl.CwEndpointBuilderFactory.CwBuilders,
            org.apache.camel.builder.endpoint.dsl.CxfEndpointBuilderFactory.CxfBuilders,
            org.apache.camel.builder.endpoint.dsl.CxfRsEndpointBuilderFactory.CxfRsBuilders,
            org.apache.camel.builder.endpoint.dsl.DJLEndpointBuilderFactory.DJLBuilders,
            org.apache.camel.builder.endpoint.dsl.DataFormatEndpointBuilderFactory.DataFormatBuilders,
            org.apache.camel.builder.endpoint.dsl.DataSetEndpointBuilderFactory.DataSetBuilders,
            org.apache.camel.builder.endpoint.dsl.DataSetTestEndpointBuilderFactory.DataSetTestBuilders,
            org.apache.camel.builder.endpoint.dsl.Ddb2EndpointBuilderFactory.Ddb2Builders,
            org.apache.camel.builder.endpoint.dsl.Ddb2StreamEndpointBuilderFactory.Ddb2StreamBuilders,
            org.apache.camel.builder.endpoint.dsl.DdbEndpointBuilderFactory.DdbBuilders,
            org.apache.camel.builder.endpoint.dsl.DdbStreamEndpointBuilderFactory.DdbStreamBuilders,
            org.apache.camel.builder.endpoint.dsl.DebeziumMongodbEndpointBuilderFactory.DebeziumMongodbBuilders,
            org.apache.camel.builder.endpoint.dsl.DebeziumMySqlEndpointBuilderFactory.DebeziumMySqlBuilders,
            org.apache.camel.builder.endpoint.dsl.DebeziumPostgresEndpointBuilderFactory.DebeziumPostgresBuilders,
            org.apache.camel.builder.endpoint.dsl.DebeziumSqlserverEndpointBuilderFactory.DebeziumSqlserverBuilders,
            org.apache.camel.builder.endpoint.dsl.DigitalOceanEndpointBuilderFactory.DigitalOceanBuilders,
            org.apache.camel.builder.endpoint.dsl.DigitalSignatureEndpointBuilderFactory.DigitalSignatureBuilders,
            org.apache.camel.builder.endpoint.dsl.DirectEndpointBuilderFactory.DirectBuilders,
            org.apache.camel.builder.endpoint.dsl.DirectVmEndpointBuilderFactory.DirectVmBuilders,
            org.apache.camel.builder.endpoint.dsl.DisruptorEndpointBuilderFactory.DisruptorBuilders,
            org.apache.camel.builder.endpoint.dsl.DisruptorVmEndpointBuilderFactory.DisruptorVmBuilders,
            org.apache.camel.builder.endpoint.dsl.DnsEndpointBuilderFactory.DnsBuilders,
            org.apache.camel.builder.endpoint.dsl.DockerEndpointBuilderFactory.DockerBuilders,
            org.apache.camel.builder.endpoint.dsl.DozerEndpointBuilderFactory.DozerBuilders,
            org.apache.camel.builder.endpoint.dsl.DrillEndpointBuilderFactory.DrillBuilders,
            org.apache.camel.builder.endpoint.dsl.DropboxEndpointBuilderFactory.DropboxBuilders,
            org.apache.camel.builder.endpoint.dsl.EC2EndpointBuilderFactory.EC2Builders,
            org.apache.camel.builder.endpoint.dsl.ECS2EndpointBuilderFactory.ECS2Builders,
            org.apache.camel.builder.endpoint.dsl.ECSEndpointBuilderFactory.ECSBuilders,
            org.apache.camel.builder.endpoint.dsl.EKS2EndpointBuilderFactory.EKS2Builders,
            org.apache.camel.builder.endpoint.dsl.EKSEndpointBuilderFactory.EKSBuilders,
            org.apache.camel.builder.endpoint.dsl.EhcacheEndpointBuilderFactory.EhcacheBuilders,
            org.apache.camel.builder.endpoint.dsl.ElasticsearchEndpointBuilderFactory.ElasticsearchBuilders,
            org.apache.camel.builder.endpoint.dsl.ElsqlEndpointBuilderFactory.ElsqlBuilders,
            org.apache.camel.builder.endpoint.dsl.EtcdKeysEndpointBuilderFactory.EtcdKeysBuilders,
            org.apache.camel.builder.endpoint.dsl.EtcdStatsEndpointBuilderFactory.EtcdStatsBuilders,
            org.apache.camel.builder.endpoint.dsl.EtcdWatchEndpointBuilderFactory.EtcdWatchBuilders,
            org.apache.camel.builder.endpoint.dsl.EventEndpointBuilderFactory.EventBuilders,
            org.apache.camel.builder.endpoint.dsl.ExecEndpointBuilderFactory.ExecBuilders,
            org.apache.camel.builder.endpoint.dsl.FacebookEndpointBuilderFactory.FacebookBuilders,
            org.apache.camel.builder.endpoint.dsl.FhirEndpointBuilderFactory.FhirBuilders,
            org.apache.camel.builder.endpoint.dsl.FileEndpointBuilderFactory.FileBuilders,
            org.apache.camel.builder.endpoint.dsl.FileWatchEndpointBuilderFactory.FileWatchBuilders,
            org.apache.camel.builder.endpoint.dsl.FlatpackEndpointBuilderFactory.FlatpackBuilders,
            org.apache.camel.builder.endpoint.dsl.FlinkEndpointBuilderFactory.FlinkBuilders,
            org.apache.camel.builder.endpoint.dsl.FopEndpointBuilderFactory.FopBuilders,
            org.apache.camel.builder.endpoint.dsl.FreemarkerEndpointBuilderFactory.FreemarkerBuilders,
            org.apache.camel.builder.endpoint.dsl.FtpEndpointBuilderFactory.FtpBuilders,
            org.apache.camel.builder.endpoint.dsl.FtpsEndpointBuilderFactory.FtpsBuilders,
            org.apache.camel.builder.endpoint.dsl.GangliaEndpointBuilderFactory.GangliaBuilders,
            org.apache.camel.builder.endpoint.dsl.GeoCoderEndpointBuilderFactory.GeoCoderBuilders,
            org.apache.camel.builder.endpoint.dsl.GitEndpointBuilderFactory.GitBuilders,
            org.apache.camel.builder.endpoint.dsl.GitHubEndpointBuilderFactory.GitHubBuilders,
            org.apache.camel.builder.endpoint.dsl.GlanceEndpointBuilderFactory.GlanceBuilders,
            org.apache.camel.builder.endpoint.dsl.GoogleBigQueryEndpointBuilderFactory.GoogleBigQueryBuilders,
            org.apache.camel.builder.endpoint.dsl.GoogleBigQuerySQLEndpointBuilderFactory.GoogleBigQuerySQLBuilders,
            org.apache.camel.builder.endpoint.dsl.GoogleCalendarEndpointBuilderFactory.GoogleCalendarBuilders,
            org.apache.camel.builder.endpoint.dsl.GoogleCalendarStreamEndpointBuilderFactory.GoogleCalendarStreamBuilders,
            org.apache.camel.builder.endpoint.dsl.GoogleDriveEndpointBuilderFactory.GoogleDriveBuilders,
            org.apache.camel.builder.endpoint.dsl.GoogleMailEndpointBuilderFactory.GoogleMailBuilders,
            org.apache.camel.builder.endpoint.dsl.GoogleMailStreamEndpointBuilderFactory.GoogleMailStreamBuilders,
            org.apache.camel.builder.endpoint.dsl.GooglePubsubEndpointBuilderFactory.GooglePubsubBuilders,
            org.apache.camel.builder.endpoint.dsl.GoogleSheetsEndpointBuilderFactory.GoogleSheetsBuilders,
            org.apache.camel.builder.endpoint.dsl.GoogleSheetsStreamEndpointBuilderFactory.GoogleSheetsStreamBuilders,
            org.apache.camel.builder.endpoint.dsl.GoraEndpointBuilderFactory.GoraBuilders,
            org.apache.camel.builder.endpoint.dsl.GrapeEndpointBuilderFactory.GrapeBuilders,
            org.apache.camel.builder.endpoint.dsl.GraphqlEndpointBuilderFactory.GraphqlBuilders,
            org.apache.camel.builder.endpoint.dsl.GridFsEndpointBuilderFactory.GridFsBuilders,
            org.apache.camel.builder.endpoint.dsl.GrpcEndpointBuilderFactory.GrpcBuilders,
            org.apache.camel.builder.endpoint.dsl.GuavaEventBusEndpointBuilderFactory.GuavaEventBusBuilders,
            org.apache.camel.builder.endpoint.dsl.HBaseEndpointBuilderFactory.HBaseBuilders,
            org.apache.camel.builder.endpoint.dsl.HazelcastAtomicnumberEndpointBuilderFactory.HazelcastAtomicnumberBuilders,
            org.apache.camel.builder.endpoint.dsl.HazelcastInstanceEndpointBuilderFactory.HazelcastInstanceBuilders,
            org.apache.camel.builder.endpoint.dsl.HazelcastListEndpointBuilderFactory.HazelcastListBuilders,
            org.apache.camel.builder.endpoint.dsl.HazelcastMapEndpointBuilderFactory.HazelcastMapBuilders,
            org.apache.camel.builder.endpoint.dsl.HazelcastMultimapEndpointBuilderFactory.HazelcastMultimapBuilders,
            org.apache.camel.builder.endpoint.dsl.HazelcastQueueEndpointBuilderFactory.HazelcastQueueBuilders,
            org.apache.camel.builder.endpoint.dsl.HazelcastReplicatedmapEndpointBuilderFactory.HazelcastReplicatedmapBuilders,
            org.apache.camel.builder.endpoint.dsl.HazelcastRingbufferEndpointBuilderFactory.HazelcastRingbufferBuilders,
            org.apache.camel.builder.endpoint.dsl.HazelcastSedaEndpointBuilderFactory.HazelcastSedaBuilders,
            org.apache.camel.builder.endpoint.dsl.HazelcastSetEndpointBuilderFactory.HazelcastSetBuilders,
            org.apache.camel.builder.endpoint.dsl.HazelcastTopicEndpointBuilderFactory.HazelcastTopicBuilders,
            org.apache.camel.builder.endpoint.dsl.HdfsEndpointBuilderFactory.HdfsBuilders,
            org.apache.camel.builder.endpoint.dsl.HipchatEndpointBuilderFactory.HipchatBuilders,
            org.apache.camel.builder.endpoint.dsl.HttpEndpointBuilderFactory.HttpBuilders,
            org.apache.camel.builder.endpoint.dsl.IAM2EndpointBuilderFactory.IAM2Builders,
            org.apache.camel.builder.endpoint.dsl.IAMEndpointBuilderFactory.IAMBuilders,
            org.apache.camel.builder.endpoint.dsl.IOTAEndpointBuilderFactory.IOTABuilders,
            org.apache.camel.builder.endpoint.dsl.IPFSEndpointBuilderFactory.IPFSBuilders,
            org.apache.camel.builder.endpoint.dsl.IgniteCacheEndpointBuilderFactory.IgniteCacheBuilders,
            org.apache.camel.builder.endpoint.dsl.IgniteComputeEndpointBuilderFactory.IgniteComputeBuilders,
            org.apache.camel.builder.endpoint.dsl.IgniteEventsEndpointBuilderFactory.IgniteEventsBuilders,
            org.apache.camel.builder.endpoint.dsl.IgniteIdGenEndpointBuilderFactory.IgniteIdGenBuilders,
            org.apache.camel.builder.endpoint.dsl.IgniteMessagingEndpointBuilderFactory.IgniteMessagingBuilders,
            org.apache.camel.builder.endpoint.dsl.IgniteQueueEndpointBuilderFactory.IgniteQueueBuilders,
            org.apache.camel.builder.endpoint.dsl.IgniteSetEndpointBuilderFactory.IgniteSetBuilders,
            org.apache.camel.builder.endpoint.dsl.InfinispanEndpointBuilderFactory.InfinispanBuilders,
            org.apache.camel.builder.endpoint.dsl.InfluxDbEndpointBuilderFactory.InfluxDbBuilders,
            org.apache.camel.builder.endpoint.dsl.IrcEndpointBuilderFactory.IrcBuilders,
            org.apache.camel.builder.endpoint.dsl.IronMQEndpointBuilderFactory.IronMQBuilders,
            org.apache.camel.builder.endpoint.dsl.JBPMEndpointBuilderFactory.JBPMBuilders,
            org.apache.camel.builder.endpoint.dsl.JCacheEndpointBuilderFactory.JCacheBuilders,
            org.apache.camel.builder.endpoint.dsl.JGroupsEndpointBuilderFactory.JGroupsBuilders,
            org.apache.camel.builder.endpoint.dsl.JGroupsRaftEndpointBuilderFactory.JGroupsRaftBuilders,
            org.apache.camel.builder.endpoint.dsl.JMXEndpointBuilderFactory.JMXBuilders,
            org.apache.camel.builder.endpoint.dsl.JSR356WebSocketEndpointBuilderFactory.JSR356WebSocketBuilders,
            org.apache.camel.builder.endpoint.dsl.JcloudsEndpointBuilderFactory.JcloudsBuilders,
            org.apache.camel.builder.endpoint.dsl.JcrEndpointBuilderFactory.JcrBuilders,
            org.apache.camel.builder.endpoint.dsl.JdbcEndpointBuilderFactory.JdbcBuilders,
            org.apache.camel.builder.endpoint.dsl.JettyHttpEndpointBuilderFactory.JettyHttpBuilders,
            org.apache.camel.builder.endpoint.dsl.JingEndpointBuilderFactory.JingBuilders,
            org.apache.camel.builder.endpoint.dsl.JiraEndpointBuilderFactory.JiraBuilders,
            org.apache.camel.builder.endpoint.dsl.JmsEndpointBuilderFactory.JmsBuilders,
            org.apache.camel.builder.endpoint.dsl.JoltEndpointBuilderFactory.JoltBuilders,
            org.apache.camel.builder.endpoint.dsl.JooqEndpointBuilderFactory.JooqBuilders,
            org.apache.camel.builder.endpoint.dsl.JpaEndpointBuilderFactory.JpaBuilders,
            org.apache.camel.builder.endpoint.dsl.JsltEndpointBuilderFactory.JsltBuilders,
            org.apache.camel.builder.endpoint.dsl.JsonValidatorEndpointBuilderFactory.JsonValidatorBuilders,
            org.apache.camel.builder.endpoint.dsl.JsonataEndpointBuilderFactory.JsonataBuilders,
            org.apache.camel.builder.endpoint.dsl.Jt400EndpointBuilderFactory.Jt400Builders,
            org.apache.camel.builder.endpoint.dsl.KMS2EndpointBuilderFactory.KMS2Builders,
            org.apache.camel.builder.endpoint.dsl.KMSEndpointBuilderFactory.KMSBuilders,
            org.apache.camel.builder.endpoint.dsl.KafkaEndpointBuilderFactory.KafkaBuilders,
            org.apache.camel.builder.endpoint.dsl.KeystoneEndpointBuilderFactory.KeystoneBuilders,
            org.apache.camel.builder.endpoint.dsl.Kinesis2EndpointBuilderFactory.Kinesis2Builders,
            org.apache.camel.builder.endpoint.dsl.KinesisEndpointBuilderFactory.KinesisBuilders,
            org.apache.camel.builder.endpoint.dsl.KinesisFirehose2EndpointBuilderFactory.KinesisFirehose2Builders,
            org.apache.camel.builder.endpoint.dsl.KinesisFirehoseEndpointBuilderFactory.KinesisFirehoseBuilders,
            org.apache.camel.builder.endpoint.dsl.KubernetesConfigMapsEndpointBuilderFactory.KubernetesConfigMapsBuilders,
            org.apache.camel.builder.endpoint.dsl.KubernetesDeploymentsEndpointBuilderFactory.KubernetesDeploymentsBuilders,
            org.apache.camel.builder.endpoint.dsl.KubernetesHPAEndpointBuilderFactory.KubernetesHPABuilders,
            org.apache.camel.builder.endpoint.dsl.KubernetesJobEndpointBuilderFactory.KubernetesJobBuilders,
            org.apache.camel.builder.endpoint.dsl.KubernetesNamespacesEndpointBuilderFactory.KubernetesNamespacesBuilders,
            org.apache.camel.builder.endpoint.dsl.KubernetesNodesEndpointBuilderFactory.KubernetesNodesBuilders,
            org.apache.camel.builder.endpoint.dsl.KubernetesPersistentVolumesClaimsEndpointBuilderFactory.KubernetesPersistentVolumesClaimsBuilders,
            org.apache.camel.builder.endpoint.dsl.KubernetesPersistentVolumesEndpointBuilderFactory.KubernetesPersistentVolumesBuilders,
            org.apache.camel.builder.endpoint.dsl.KubernetesPodsEndpointBuilderFactory.KubernetesPodsBuilders,
            org.apache.camel.builder.endpoint.dsl.KubernetesReplicationControllersEndpointBuilderFactory.KubernetesReplicationControllersBuilders,
            org.apache.camel.builder.endpoint.dsl.KubernetesResourcesQuotaEndpointBuilderFactory.KubernetesResourcesQuotaBuilders,
            org.apache.camel.builder.endpoint.dsl.KubernetesSecretsEndpointBuilderFactory.KubernetesSecretsBuilders,
            org.apache.camel.builder.endpoint.dsl.KubernetesServiceAccountsEndpointBuilderFactory.KubernetesServiceAccountsBuilders,
            org.apache.camel.builder.endpoint.dsl.KubernetesServicesEndpointBuilderFactory.KubernetesServicesBuilders,
            org.apache.camel.builder.endpoint.dsl.KuduEndpointBuilderFactory.KuduBuilders,
            org.apache.camel.builder.endpoint.dsl.Lambda2EndpointBuilderFactory.Lambda2Builders,
            org.apache.camel.builder.endpoint.dsl.LambdaEndpointBuilderFactory.LambdaBuilders,
            org.apache.camel.builder.endpoint.dsl.LanguageEndpointBuilderFactory.LanguageBuilders,
            org.apache.camel.builder.endpoint.dsl.LdapEndpointBuilderFactory.LdapBuilders,
            org.apache.camel.builder.endpoint.dsl.LdifEndpointBuilderFactory.LdifBuilders,
            org.apache.camel.builder.endpoint.dsl.LogEndpointBuilderFactory.LogBuilders,
            org.apache.camel.builder.endpoint.dsl.LuceneEndpointBuilderFactory.LuceneBuilders,
            org.apache.camel.builder.endpoint.dsl.LumberjackEndpointBuilderFactory.LumberjackBuilders,
            org.apache.camel.builder.endpoint.dsl.MQ2EndpointBuilderFactory.MQ2Builders,
            org.apache.camel.builder.endpoint.dsl.MQEndpointBuilderFactory.MQBuilders,
            org.apache.camel.builder.endpoint.dsl.MSK2EndpointBuilderFactory.MSK2Builders,
            org.apache.camel.builder.endpoint.dsl.MSKEndpointBuilderFactory.MSKBuilders,
            org.apache.camel.builder.endpoint.dsl.MailEndpointBuilderFactory.MailBuilders,
            org.apache.camel.builder.endpoint.dsl.MasterEndpointBuilderFactory.MasterBuilders,
            org.apache.camel.builder.endpoint.dsl.MetricsEndpointBuilderFactory.MetricsBuilders,
            org.apache.camel.builder.endpoint.dsl.MicroProfileMetricsEndpointBuilderFactory.MicroProfileMetricsBuilders,
            org.apache.camel.builder.endpoint.dsl.MicrometerEndpointBuilderFactory.MicrometerBuilders,
            org.apache.camel.builder.endpoint.dsl.MiloClientEndpointBuilderFactory.MiloClientBuilders,
            org.apache.camel.builder.endpoint.dsl.MiloServerEndpointBuilderFactory.MiloServerBuilders,
            org.apache.camel.builder.endpoint.dsl.MinaEndpointBuilderFactory.MinaBuilders,
            org.apache.camel.builder.endpoint.dsl.MllpEndpointBuilderFactory.MllpBuilders,
            org.apache.camel.builder.endpoint.dsl.MockEndpointBuilderFactory.MockBuilders,
            org.apache.camel.builder.endpoint.dsl.MongoDbEndpointBuilderFactory.MongoDbBuilders,
            org.apache.camel.builder.endpoint.dsl.MsvEndpointBuilderFactory.MsvBuilders,
            org.apache.camel.builder.endpoint.dsl.MustacheEndpointBuilderFactory.MustacheBuilders,
            org.apache.camel.builder.endpoint.dsl.MvelEndpointBuilderFactory.MvelBuilders,
            org.apache.camel.builder.endpoint.dsl.MyBatisBeanEndpointBuilderFactory.MyBatisBeanBuilders,
            org.apache.camel.builder.endpoint.dsl.MyBatisEndpointBuilderFactory.MyBatisBuilders,
            org.apache.camel.builder.endpoint.dsl.NagiosEndpointBuilderFactory.NagiosBuilders,
            org.apache.camel.builder.endpoint.dsl.NatsEndpointBuilderFactory.NatsBuilders,
            org.apache.camel.builder.endpoint.dsl.NetWeaverEndpointBuilderFactory.NetWeaverBuilders,
            org.apache.camel.builder.endpoint.dsl.NettyEndpointBuilderFactory.NettyBuilders,
            org.apache.camel.builder.endpoint.dsl.NettyHttpEndpointBuilderFactory.NettyHttpBuilders,
            org.apache.camel.builder.endpoint.dsl.NeutronEndpointBuilderFactory.NeutronBuilders,
            org.apache.camel.builder.endpoint.dsl.NitriteEndpointBuilderFactory.NitriteBuilders,
            org.apache.camel.builder.endpoint.dsl.NovaEndpointBuilderFactory.NovaBuilders,
            org.apache.camel.builder.endpoint.dsl.NsqEndpointBuilderFactory.NsqBuilders,
            org.apache.camel.builder.endpoint.dsl.Olingo2EndpointBuilderFactory.Olingo2Builders,
            org.apache.camel.builder.endpoint.dsl.Olingo4EndpointBuilderFactory.Olingo4Builders,
            org.apache.camel.builder.endpoint.dsl.OpenshiftBuildConfigsEndpointBuilderFactory.OpenshiftBuildConfigsBuilders,
            org.apache.camel.builder.endpoint.dsl.OpenshiftBuildsEndpointBuilderFactory.OpenshiftBuildsBuilders,
            org.apache.camel.builder.endpoint.dsl.OptaPlannerEndpointBuilderFactory.OptaPlannerBuilders,
            org.apache.camel.builder.endpoint.dsl.PahoEndpointBuilderFactory.PahoBuilders,
            org.apache.camel.builder.endpoint.dsl.PdfEndpointBuilderFactory.PdfBuilders,
            org.apache.camel.builder.endpoint.dsl.PgEventEndpointBuilderFactory.PgEventBuilders,
            org.apache.camel.builder.endpoint.dsl.PgReplicationSlotEndpointBuilderFactory.PgReplicationSlotBuilders,
            org.apache.camel.builder.endpoint.dsl.PlatformHttpEndpointBuilderFactory.PlatformHttpBuilders,
            org.apache.camel.builder.endpoint.dsl.PrinterEndpointBuilderFactory.PrinterBuilders,
            org.apache.camel.builder.endpoint.dsl.PubNubEndpointBuilderFactory.PubNubBuilders,
            org.apache.camel.builder.endpoint.dsl.PulsarEndpointBuilderFactory.PulsarBuilders,
            org.apache.camel.builder.endpoint.dsl.QuartzEndpointBuilderFactory.QuartzBuilders,
            org.apache.camel.builder.endpoint.dsl.QueueEndpointBuilderFactory.QueueBuilders,
            org.apache.camel.builder.endpoint.dsl.QueueServiceEndpointBuilderFactory.QueueServiceBuilders,
            org.apache.camel.builder.endpoint.dsl.QuickfixjEndpointBuilderFactory.QuickfixjBuilders,
            org.apache.camel.builder.endpoint.dsl.RabbitMQEndpointBuilderFactory.RabbitMQBuilders,
            org.apache.camel.builder.endpoint.dsl.ReactiveStreamsEndpointBuilderFactory.ReactiveStreamsBuilders,
            org.apache.camel.builder.endpoint.dsl.RedisEndpointBuilderFactory.RedisBuilders,
            org.apache.camel.builder.endpoint.dsl.RefEndpointBuilderFactory.RefBuilders,
            org.apache.camel.builder.endpoint.dsl.RestApiEndpointBuilderFactory.RestApiBuilders,
            org.apache.camel.builder.endpoint.dsl.RestEndpointBuilderFactory.RestBuilders,
            org.apache.camel.builder.endpoint.dsl.RestOpenApiEndpointBuilderFactory.RestOpenApiBuilders,
            org.apache.camel.builder.endpoint.dsl.RestSwaggerEndpointBuilderFactory.RestSwaggerBuilders,
            org.apache.camel.builder.endpoint.dsl.ResteasyEndpointBuilderFactory.ResteasyBuilders,
            org.apache.camel.builder.endpoint.dsl.RobotFrameworkEndpointBuilderFactory.RobotFrameworkBuilders,
            org.apache.camel.builder.endpoint.dsl.RssEndpointBuilderFactory.RssBuilders,
            org.apache.camel.builder.endpoint.dsl.S3EndpointBuilderFactory.S3Builders,
            org.apache.camel.builder.endpoint.dsl.SWFEndpointBuilderFactory.SWFBuilders,
            org.apache.camel.builder.endpoint.dsl.SagaEndpointBuilderFactory.SagaBuilders,
            org.apache.camel.builder.endpoint.dsl.SalesforceEndpointBuilderFactory.SalesforceBuilders,
            org.apache.camel.builder.endpoint.dsl.SchedulerEndpointBuilderFactory.SchedulerBuilders,
            org.apache.camel.builder.endpoint.dsl.SchematronEndpointBuilderFactory.SchematronBuilders,
            org.apache.camel.builder.endpoint.dsl.ScpEndpointBuilderFactory.ScpBuilders,
            org.apache.camel.builder.endpoint.dsl.SdbEndpointBuilderFactory.SdbBuilders,
            org.apache.camel.builder.endpoint.dsl.SedaEndpointBuilderFactory.SedaBuilders,
            org.apache.camel.builder.endpoint.dsl.ServerEndpointBuilderFactory.ServerBuilders,
            org.apache.camel.builder.endpoint.dsl.ServiceEndpointBuilderFactory.ServiceBuilders,
            org.apache.camel.builder.endpoint.dsl.ServiceNowEndpointBuilderFactory.ServiceNowBuilders,
            org.apache.camel.builder.endpoint.dsl.ServletEndpointBuilderFactory.ServletBuilders,
            org.apache.camel.builder.endpoint.dsl.Ses2EndpointBuilderFactory.Ses2Builders,
            org.apache.camel.builder.endpoint.dsl.SesEndpointBuilderFactory.SesBuilders,
            org.apache.camel.builder.endpoint.dsl.SftpEndpointBuilderFactory.SftpBuilders,
            org.apache.camel.builder.endpoint.dsl.SipEndpointBuilderFactory.SipBuilders,
            org.apache.camel.builder.endpoint.dsl.Sjms2EndpointBuilderFactory.Sjms2Builders,
            org.apache.camel.builder.endpoint.dsl.SjmsBatchEndpointBuilderFactory.SjmsBatchBuilders,
            org.apache.camel.builder.endpoint.dsl.SjmsEndpointBuilderFactory.SjmsBuilders,
            org.apache.camel.builder.endpoint.dsl.SlackEndpointBuilderFactory.SlackBuilders,
            org.apache.camel.builder.endpoint.dsl.SmppEndpointBuilderFactory.SmppBuilders,
            org.apache.camel.builder.endpoint.dsl.SnmpEndpointBuilderFactory.SnmpBuilders,
            org.apache.camel.builder.endpoint.dsl.Sns2EndpointBuilderFactory.Sns2Builders,
            org.apache.camel.builder.endpoint.dsl.SnsEndpointBuilderFactory.SnsBuilders,
            org.apache.camel.builder.endpoint.dsl.SolrEndpointBuilderFactory.SolrBuilders,
            org.apache.camel.builder.endpoint.dsl.SoroushBotEndpointBuilderFactory.SoroushBotBuilders,
            org.apache.camel.builder.endpoint.dsl.SparkEndpointBuilderFactory.SparkBuilders,
            org.apache.camel.builder.endpoint.dsl.SplunkEndpointBuilderFactory.SplunkBuilders,
            org.apache.camel.builder.endpoint.dsl.SplunkHECEndpointBuilderFactory.SplunkHECBuilders,
            org.apache.camel.builder.endpoint.dsl.SpringBatchEndpointBuilderFactory.SpringBatchBuilders,
            org.apache.camel.builder.endpoint.dsl.SpringIntegrationEndpointBuilderFactory.SpringIntegrationBuilders,
            org.apache.camel.builder.endpoint.dsl.SpringLdapEndpointBuilderFactory.SpringLdapBuilders,
            org.apache.camel.builder.endpoint.dsl.SpringWebserviceEndpointBuilderFactory.SpringWebserviceBuilders,
            org.apache.camel.builder.endpoint.dsl.SqlEndpointBuilderFactory.SqlBuilders,
            org.apache.camel.builder.endpoint.dsl.SqlStoredEndpointBuilderFactory.SqlStoredBuilders,
            org.apache.camel.builder.endpoint.dsl.Sqs2EndpointBuilderFactory.Sqs2Builders,
            org.apache.camel.builder.endpoint.dsl.SqsEndpointBuilderFactory.SqsBuilders,
            org.apache.camel.builder.endpoint.dsl.SshEndpointBuilderFactory.SshBuilders,
            org.apache.camel.builder.endpoint.dsl.StAXEndpointBuilderFactory.StAXBuilders,
            org.apache.camel.builder.endpoint.dsl.StompEndpointBuilderFactory.StompBuilders,
            org.apache.camel.builder.endpoint.dsl.StreamEndpointBuilderFactory.StreamBuilders,
            org.apache.camel.builder.endpoint.dsl.StringTemplateEndpointBuilderFactory.StringTemplateBuilders,
            org.apache.camel.builder.endpoint.dsl.StubEndpointBuilderFactory.StubBuilders,
            org.apache.camel.builder.endpoint.dsl.SwiftEndpointBuilderFactory.SwiftBuilders,
            org.apache.camel.builder.endpoint.dsl.TelegramEndpointBuilderFactory.TelegramBuilders,
            org.apache.camel.builder.endpoint.dsl.ThriftEndpointBuilderFactory.ThriftBuilders,
            org.apache.camel.builder.endpoint.dsl.TikaEndpointBuilderFactory.TikaBuilders,
            org.apache.camel.builder.endpoint.dsl.TimerEndpointBuilderFactory.TimerBuilders,
            org.apache.camel.builder.endpoint.dsl.Translate2EndpointBuilderFactory.Translate2Builders,
            org.apache.camel.builder.endpoint.dsl.TranslateEndpointBuilderFactory.TranslateBuilders,
            org.apache.camel.builder.endpoint.dsl.TwilioEndpointBuilderFactory.TwilioBuilders,
            org.apache.camel.builder.endpoint.dsl.TwitterDirectMessageEndpointBuilderFactory.TwitterDirectMessageBuilders,
            org.apache.camel.builder.endpoint.dsl.TwitterSearchEndpointBuilderFactory.TwitterSearchBuilders,
            org.apache.camel.builder.endpoint.dsl.TwitterTimelineEndpointBuilderFactory.TwitterTimelineBuilders,
            org.apache.camel.builder.endpoint.dsl.UndertowEndpointBuilderFactory.UndertowBuilders,
            org.apache.camel.builder.endpoint.dsl.ValidatorEndpointBuilderFactory.ValidatorBuilders,
            org.apache.camel.builder.endpoint.dsl.VelocityEndpointBuilderFactory.VelocityBuilders,
            org.apache.camel.builder.endpoint.dsl.VertxEndpointBuilderFactory.VertxBuilders,
            org.apache.camel.builder.endpoint.dsl.VertxWebsocketEndpointBuilderFactory.VertxWebsocketBuilders,
            org.apache.camel.builder.endpoint.dsl.VmEndpointBuilderFactory.VmBuilders,
            org.apache.camel.builder.endpoint.dsl.WeatherEndpointBuilderFactory.WeatherBuilders,
            org.apache.camel.builder.endpoint.dsl.Web3jEndpointBuilderFactory.Web3jBuilders,
            org.apache.camel.builder.endpoint.dsl.WebhookEndpointBuilderFactory.WebhookBuilders,
            org.apache.camel.builder.endpoint.dsl.WebsocketEndpointBuilderFactory.WebsocketBuilders,
            org.apache.camel.builder.endpoint.dsl.WekaEndpointBuilderFactory.WekaBuilders,
            org.apache.camel.builder.endpoint.dsl.WordpressEndpointBuilderFactory.WordpressBuilders,
            org.apache.camel.builder.endpoint.dsl.WorkdayEndpointBuilderFactory.WorkdayBuilders,
            org.apache.camel.builder.endpoint.dsl.WsEndpointBuilderFactory.WsBuilders,
            org.apache.camel.builder.endpoint.dsl.XChangeEndpointBuilderFactory.XChangeBuilders,
            org.apache.camel.builder.endpoint.dsl.XJEndpointBuilderFactory.XJBuilders,
            org.apache.camel.builder.endpoint.dsl.XQueryEndpointBuilderFactory.XQueryBuilders,
            org.apache.camel.builder.endpoint.dsl.XmlSignerEndpointBuilderFactory.XmlSignerBuilders,
            org.apache.camel.builder.endpoint.dsl.XmlVerifierEndpointBuilderFactory.XmlVerifierBuilders,
            org.apache.camel.builder.endpoint.dsl.XmppEndpointBuilderFactory.XmppBuilders,
            org.apache.camel.builder.endpoint.dsl.XsltEndpointBuilderFactory.XsltBuilders,
            org.apache.camel.builder.endpoint.dsl.XsltSaxonEndpointBuilderFactory.XsltSaxonBuilders,
            org.apache.camel.builder.endpoint.dsl.YammerEndpointBuilderFactory.YammerBuilders,
            org.apache.camel.builder.endpoint.dsl.ZendeskEndpointBuilderFactory.ZendeskBuilders,
            org.apache.camel.builder.endpoint.dsl.ZooKeeperEndpointBuilderFactory.ZooKeeperBuilders,
            org.apache.camel.builder.endpoint.dsl.ZooKeeperMasterEndpointBuilderFactory.ZooKeeperMasterBuilders {

    default org.apache.camel.Expression endpoints(
            org.apache.camel.builder.EndpointProducerBuilder... endpoints) {
        return new org.apache.camel.support.ExpressionAdapter() {
            List<org.apache.camel.Expression> expressions = Stream.of(endpoints)
                .map(org.apache.camel.builder.EndpointProducerBuilder::expr)
                .collect(Collectors.toList());
        
            @Override
            public Object evaluate(org.apache.camel.Exchange exchange) {
                return expressions.stream().map(e -> e.evaluate(exchange, Object.class)).collect(Collectors.toList());
            }
        };
    }
}
//CHECKSTYLE:ON