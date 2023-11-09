package org.apache.camel.component.kafka.integration;

import org.apache.camel.Endpoint;
import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.kafka.KafkaConstants;
import org.apache.camel.component.kafka.MockConsumerInterceptor;
import org.apache.camel.component.kafka.consumer.KafkaManualCommit;
import org.apache.camel.component.kafka.testutil.CamelKafkaUtil;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.awaitility.Awaitility;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * this will test basic breakOnFirstError functionality
 * uses allowManualCommit and KafkaManualCommit
 * because relying on Camel default to use NOOP Commit Manager
 * this means the route implementation MUST manage all offset commits
 * 
 * will demonstrate how to retry
 */
class KafkaBreakOnFirstErrorWithBatchUsingKafkaManualCommitRetryIT extends BaseEmbeddedKafkaTestSupport {

    private static final Logger LOG = LoggerFactory.getLogger(KafkaBreakOnFirstErrorWithBatchUsingKafkaManualCommitRetryIT.class);

    public static final String ROUTE_ID = "breakOnFirstErrorBatchRetryIT";
    public static final String TOPIC = "test-foobar";

    @EndpointInject("kafka:" + TOPIC
            + "?groupId=KafkaBreakOnFirstErrorIT"
            + "&autoOffsetReset=earliest"
            + "&autoCommitEnable=false"
            + "&allowManualCommit=true"
            + "&breakOnFirstError=true"
            + "&maxPollRecords=3"
            + "&pollTimeoutMs=1000"
            + "&keyDeserializer=org.apache.kafka.common.serialization.StringDeserializer"
            + "&valueDeserializer=org.apache.kafka.common.serialization.StringDeserializer"
            + "&interceptorClasses=org.apache.camel.component.kafka.MockConsumerInterceptor")
    private Endpoint from;

    @EndpointInject("mock:result")
    private MockEndpoint to;

    private org.apache.kafka.clients.producer.KafkaProducer<String, String> producer;

    @BeforeEach
    public void before() {
        Properties props = getDefaultProperties();
        producer = new org.apache.kafka.clients.producer.KafkaProducer<>(props);
        MockConsumerInterceptor.recordsCaptured.clear();
    }

    @AfterEach
    public void after() {
        if (producer != null) {
            producer.close();
        }
        // clean all test topics
        kafkaAdminClient.deleteTopics(Collections.singletonList(TOPIC)).all();
    }
    
    /**
     * will continue to retry the message that is in error
     */
    @Test
    public void kafkaBreakOnFirstErrorBasicCapabilityWithoutOnExcepton() throws Exception {
        to.reset();
        
        this.publishMessagesToKafka();
        
        context.getRouteController().stopRoute(ROUTE_ID);
        context.getRouteController().startRoute(ROUTE_ID);
        
        Awaitility.await()
            .atMost(3, TimeUnit.SECONDS)
            .until(() -> to.getExchanges().size() > 7);
        
        
        assertFalse(to.getExchanges().stream()
            .anyMatch(exc -> "message-4".equals(exc.getMessage().getBody(String.class))));

        assertFalse(to.getExchanges().stream()
            .anyMatch(exc -> "message-5".equals(exc.getMessage().getBody(String.class))));

       assertTrue(to.getExchanges().stream() 
           .filter(exc -> "message-3".equals(exc.getMessage().getBody(String.class)))
           .count() > 1);
       
        to.assertIsSatisfied(3000);
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {

            @Override
            public void configure() {
                onException(Exception.class)
                    .handled(false)
                    // adding error message to end
                    // so we can account for it
                    .to(to)
                    // we are not 
                    // going to commit offset
                    // so will retry
                    .end();
                
                from(from)
                    .routeId(ROUTE_ID)
                    .process(exchange -> {
                        LOG.debug(CamelKafkaUtil.buildKafkaLogMessage("Consuming", exchange, true));
                    })
                    .process(exchange -> {
                        ifIsPayloadWithErrorThrowException(exchange);
                    })
                    .to(to)
                    .process(exchange -> {
                        doCommitOffset(exchange);
                    });
            }
        };
    }

    private void publishMessagesToKafka() {
        for (int i = 0; i < 6; i++) {
            String msg = "message-" + i;
            ProducerRecord<String, String> data = new ProducerRecord<>(TOPIC, null, msg);
            producer.send(data);
        }
    }
    
    private void doCommitOffset(Exchange exchange) {
        LOG.debug(CamelKafkaUtil.buildKafkaLogMessage("Committing", exchange, true));
        KafkaManualCommit manual = exchange.getMessage()
            .getHeader(KafkaConstants.MANUAL_COMMIT, KafkaManualCommit.class);
        assertNotNull(manual);
        manual.commit();
    }
    
    private void ifIsPayloadWithErrorThrowException(Exchange exchange) {
        String payload = exchange.getMessage().getBody(String.class);
        if (payload.equals("message-3")) {
            throw new RuntimeException("ERROR TRIGGERED BY TEST");
        }
    }
    
}