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
package org.apache.camel.component.springrabbit;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.spi.HeaderFilterStrategy;
import org.springframework.amqp.core.MessageDeliveryMode;
import org.springframework.amqp.core.MessageProperties;

public class DefaultMessagePropertiesConverter implements MessagePropertiesConverter {

    private final CamelContext camelContext;
    private final HeaderFilterStrategy headerFilterStrategy;

    public DefaultMessagePropertiesConverter(CamelContext camelContext, HeaderFilterStrategy headerFilterStrategy) {
        this.camelContext = camelContext;
        this.headerFilterStrategy = headerFilterStrategy;
    }

    @Override
    public MessageProperties toMessageProperties(Exchange exchange) {
        MessageProperties answer = new MessageProperties();
        Message message = exchange.getMessage();

        Object deliveryMode = message.removeHeader(SpringRabbitMQConstants.DELIVERY_MODE);
        if (deliveryMode != null) {
            answer.setDeliveryMode(deliveryMode instanceof MessageDeliveryMode ? (MessageDeliveryMode) deliveryMode
                    : MessageDeliveryMode.fromInt(Integer.parseInt(deliveryMode.toString())));
        }
        Object type = message.removeHeader(SpringRabbitMQConstants.TYPE);
        if (type != null) {
            answer.setType(type.toString());
        }
        Object contentType = message.removeHeader(SpringRabbitMQConstants.CONTENT_TYPE);
        if (contentType != null) {
            answer.setContentType(contentType.toString());
        }
        Object contentLength = message.removeHeader(SpringRabbitMQConstants.CONTENT_LENGTH);
        if (contentLength != null) {
            answer.setContentLength(Long.parseLong(contentLength.toString()));
        }
        Object contentEncoding = message.removeHeader(SpringRabbitMQConstants.CONTENT_ENCODING);
        if (contentEncoding != null) {
            answer.setContentEncoding(contentEncoding.toString());
        }
        Object messageId = message.removeHeader(SpringRabbitMQConstants.MESSAGE_ID);
        if (messageId != null) {
            answer.setMessageId(messageId.toString());
        }
        Object correlationId = message.removeHeader(SpringRabbitMQConstants.CORRELATION_ID);
        if (correlationId != null) {
            answer.setCorrelationId(correlationId.toString());
        }
        Object replyTo = message.removeHeader(SpringRabbitMQConstants.REPLY_TO);
        if (replyTo != null) {
            answer.setReplyTo(replyTo.toString());
        }
        Object expiration = message.removeHeader(SpringRabbitMQConstants.EXPIRATION);
        if (expiration != null) {
            answer.setExpiration(expiration.toString());
        }
        Object timestamp = message.removeHeader(SpringRabbitMQConstants.TIMESTAMP);
        if (timestamp != null) {
            answer.setTimestamp(timestamp instanceof Date ? (Date) timestamp
                    : new Date(Long.parseLong(timestamp.toString())));
        }
        Object userId = message.removeHeader(SpringRabbitMQConstants.USER_ID);
        if (userId != null) {
            answer.setUserId(userId.toString());
        }
        Object appId = message.removeHeader(SpringRabbitMQConstants.APP_ID);
        if (appId != null) {
            answer.setAppId(appId.toString());
        }
        Object priority = message.removeHeader(SpringRabbitMQConstants.PRIORITY);
        if (priority != null) {
            answer.setPriority(Integer.parseInt(priority.toString()));
        }
        Object clusterId = message.removeHeader(SpringRabbitMQConstants.CLUSTER_ID);
        if (clusterId != null) {
            answer.setClusterId(clusterId.toString());
        }

        Set<Map.Entry<String, Object>> entries = message.getHeaders().entrySet();
        for (Map.Entry<String, Object> entry : entries) {
            String headerName = entry.getKey();
            Object headerValue = entry.getValue();
            appendOutputHeader(answer, headerName, headerValue, exchange);
        }

        return answer;
    }

    @Override
    public Map<String, Object> fromMessageProperties(MessageProperties messageProperties, Exchange exchange) {
        Map<String, Object> answer = new HashMap<>();

        if (messageProperties != null) {
            Set<Map.Entry<String, Object>> entries = messageProperties.getHeaders().entrySet();
            for (Map.Entry<String, Object> entry : entries) {
                String headerName = entry.getKey();
                Object headerValue = entry.getValue();
                appendInputHeader(answer, headerName, headerValue, exchange);
            }

            if (messageProperties.getRedelivered() != null) {
                answer.put(SpringRabbitMQConstants.REDELIVERED, messageProperties.getRedelivered());
            }
            if (messageProperties.getDeliveryTag() > 0) {
                answer.put(SpringRabbitMQConstants.DELIVERY_TAG, messageProperties.getDeliveryTag());
            }
            if (messageProperties.getReceivedExchange() != null) {
                answer.put(SpringRabbitMQConstants.EXCHANGE_NAME, messageProperties.getReceivedExchange());
            }
            if (messageProperties.getReceivedRoutingKey() != null) {
                answer.put(SpringRabbitMQConstants.ROUTING_KEY, messageProperties.getReceivedRoutingKey());
            }
            if (messageProperties.getReceivedDeliveryMode() != null) {
                answer.put(SpringRabbitMQConstants.DELIVERY_MODE, messageProperties.getReceivedDeliveryMode());
            }
            if (messageProperties.getType() != null) {
                answer.put(SpringRabbitMQConstants.TYPE, messageProperties.getType());
            }
            if (messageProperties.getContentType() != null) {
                answer.put(SpringRabbitMQConstants.CONTENT_TYPE, messageProperties.getContentType());
            }
            if (messageProperties.getContentLength() > 0) {
                answer.put(SpringRabbitMQConstants.CONTENT_LENGTH, messageProperties.getContentLength());
            }
            if (messageProperties.getContentEncoding() != null) {
                answer.put(SpringRabbitMQConstants.CONTENT_ENCODING, messageProperties.getContentEncoding());
            }
            if (messageProperties.getMessageId() != null) {
                answer.put(SpringRabbitMQConstants.MESSAGE_ID, messageProperties.getMessageId());
            }
            if (messageProperties.getCorrelationId() != null) {
                answer.put(SpringRabbitMQConstants.CORRELATION_ID, messageProperties.getCorrelationId());
            }
            if (messageProperties.getReplyTo() != null) {
                answer.put(SpringRabbitMQConstants.REPLY_TO, messageProperties.getReplyTo());
            }
            if (messageProperties.getExpiration() != null) {
                answer.put(SpringRabbitMQConstants.EXPIRATION, messageProperties.getExpiration());
            }
            if (messageProperties.getTimestamp() != null) {
                answer.put(SpringRabbitMQConstants.TIMESTAMP, messageProperties.getTimestamp());
            }
            if (messageProperties.getReceivedUserId() != null) {
                answer.put(SpringRabbitMQConstants.USER_ID, messageProperties.getReceivedUserId());
            }
            if (messageProperties.getAppId() != null) {
                answer.put(SpringRabbitMQConstants.APP_ID, messageProperties.getAppId());
            }
            if (messageProperties.getPriority() != null) {
                answer.put(SpringRabbitMQConstants.PRIORITY, messageProperties.getPriority());
            }
            if (messageProperties.getClusterId() != null) {
                answer.put(SpringRabbitMQConstants.CLUSTER_ID, messageProperties.getClusterId());
            }
        }

        return answer;
    }

    private void appendOutputHeader(MessageProperties answer, String headerName, Object headerValue, Exchange ex) {
        if (shouldOutputHeader(headerName, headerValue, ex)) {
            answer.setHeader(headerName, headerValue);
        }
    }

    private void appendInputHeader(Map<String, Object> answer, String headerName, Object headerValue, Exchange ex) {
        if (shouldInputHeader(headerName, headerValue, ex)) {
            answer.put(headerName, headerValue);
        }
    }

    /**
     * Strategy to allow filtering of headers which are put on the RabbitMQ message
     */
    protected boolean shouldOutputHeader(String headerName, Object headerValue, Exchange exchange) {
        return headerFilterStrategy == null
                || !headerFilterStrategy.applyFilterToCamelHeaders(headerName, headerValue, exchange);
    }

    /**
     * Strategy to allow filtering from RabbitMQ message to Camel message
     */
    protected boolean shouldInputHeader(String headerName, Object headerValue, Exchange exchange) {
        return headerFilterStrategy == null
                || !headerFilterStrategy.applyFilterToExternalHeaders(headerName, headerValue, exchange);
    }
}
