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
package org.apache.camel.component.kafka;

import kafka.consumer.ConsumerConfig;
import kafka.consumer.KafkaStream;
import kafka.javaapi.consumer.ConsumerConnector;
import kafka.message.MessageAndMetadata;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.impl.DefaultConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.*;

/**
 *
 */
public class KafkaConsumer extends DefaultConsumer {

    private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);

    protected ExecutorService executor;
    private final KafkaEndpoint endpoint;
    private final Processor processor;
    private Map<ConsumerConnector, CyclicBarrier> consumerBarriers;

    public KafkaConsumer(KafkaEndpoint endpoint, Processor processor) {
        super(endpoint, processor);
        this.endpoint = endpoint;
        this.processor = processor;
        this.consumerBarriers = new HashMap<ConsumerConnector, CyclicBarrier>();
        if (endpoint.getZookeeperConnect() == null) {
            throw new IllegalArgumentException("zookeeper host or zookeeper connect must be specified");
        }
        if (endpoint.getGroupId() == null) {
            throw new IllegalArgumentException("groupId must not be null");
        }
    }

    Properties getProps() {
        Properties props = endpoint.getConfiguration().createConsumerProperties();
        props.put("zookeeper.connect", endpoint.getZookeeperConnect());
        props.put("group.id", endpoint.getGroupId());
        return props;
    }

    @Override
    protected void doStart() throws Exception {
        super.doStart();
        log.info("Starting Kafka consumer");
        executor = endpoint.createExecutor();

        for (int i = 0; i < endpoint.getConsumersCount(); i++) {
            ConsumerConnector consumer = kafka.consumer.Consumer.createJavaConsumerConnector(new ConsumerConfig(getProps()));
            Map<String, Integer> topicCountMap = new HashMap<String, Integer>();
            topicCountMap.put(endpoint.getTopic(), endpoint.getConsumerStreams());
            Map<String, List<KafkaStream<byte[], byte[]>>> consumerMap = consumer.createMessageStreams(topicCountMap);
            List<KafkaStream<byte[], byte[]>> streams = consumerMap.get(endpoint.getTopic());
            if (endpoint.isAutoCommitEnable() != null && Boolean.FALSE == endpoint.isAutoCommitEnable().booleanValue()) {
                CyclicBarrier barrier = new CyclicBarrier(endpoint.getConsumerStreams(), new CommitOffsetTask(consumer));
                for (final KafkaStream<byte[], byte[]> stream : streams) {
                    executor.submit(new BatchingConsumerTask(stream, barrier));
                }
                consumerBarriers.put(consumer, barrier);
            } else{
                for (final KafkaStream<byte[], byte[]> stream : streams) {
                    executor.submit(new AutoCommitConsumerTask(stream));
                }
                consumerBarriers.put(consumer, null);
            }
        }

    }

    @Override
    protected void doStop() throws Exception {
        super.doStop();
        log.info("Stopping Kafka consumer");
        for (ConsumerConnector consumer : consumerBarriers.keySet()) {
            if (consumer != null) {
                consumer.shutdown();
            }
        }
        if (executor != null) {
            if (getEndpoint() != null && getEndpoint().getCamelContext() != null) {
                getEndpoint().getCamelContext().getExecutorServiceManager().shutdownNow(executor);
            } else {
                executor.shutdownNow();
            }
        }
        executor = null;
    }

    class BatchingConsumerTask implements Runnable {

        private KafkaStream<byte[], byte[]> stream;
        private CyclicBarrier berrier;

        public BatchingConsumerTask(KafkaStream<byte[], byte[]> stream, CyclicBarrier berrier) {
            this.stream = stream;
            this.berrier = berrier;
        }

        public void run() {
            int processed = 0;
            for (MessageAndMetadata<byte[], byte[]> mm : stream) {
                Exchange exchange = endpoint.createKafkaExchange(mm);
                try {
                    processor.process(exchange);
                } catch (Exception e) {
                    LOG.error(e.getMessage(), e);
                }
                processed++;
                if (processed >= endpoint.getBatchSize()) {
                    try {
                        berrier.await(endpoint.getBarrierAwaitTimeoutMs(), TimeUnit.MILLISECONDS);
                        processed = 0;
                    } catch (InterruptedException e) {
                        LOG.error(e.getMessage(), e);
                        break;
                    } catch (BrokenBarrierException e) {
                        LOG.error(e.getMessage(), e);
                        break;
                    } catch (TimeoutException e) {
                        LOG.error(e.getMessage(), e);
                    }
                }
            }
        }
    }

    class CommitOffsetTask implements Runnable {

        private ConsumerConnector consumer;

        public CommitOffsetTask(ConsumerConnector consumer) {
            this.consumer = consumer;
        }

        @Override
        public void run() {
            consumer.commitOffsets();
        }
    }

    class AutoCommitConsumerTask implements Runnable {

        private KafkaStream<byte[], byte[]> stream;

        public AutoCommitConsumerTask(KafkaStream<byte[], byte[]> stream) {
            this.stream = stream;
        }

        public void run() {
            for (MessageAndMetadata<byte[], byte[]> mm : stream) {
                Exchange exchange = endpoint.createKafkaExchange(mm);
                try {
                    processor.process(exchange);
                } catch (Exception e) {
                    LOG.error(e.getMessage(), e);
                }
            }
        }
    }
}

