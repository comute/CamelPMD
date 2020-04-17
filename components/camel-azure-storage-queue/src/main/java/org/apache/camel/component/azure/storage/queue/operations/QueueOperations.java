package org.apache.camel.component.azure.storage.queue.operations;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import com.azure.core.http.rest.Response;
import com.azure.storage.queue.models.SendMessageResult;
import org.apache.camel.Exchange;
import org.apache.camel.component.azure.storage.queue.QueueConfiguration;
import org.apache.camel.component.azure.storage.queue.QueueConstants;
import org.apache.camel.component.azure.storage.queue.QueueExchangeHeaders;
import org.apache.camel.component.azure.storage.queue.client.QueueClientWrapper;
import org.apache.camel.util.ObjectHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * All operations related to {@link com.azure.storage.queue.QueueClient}. This is at the queue level
 */
public class QueueOperations {

    private static final Logger LOG = LoggerFactory.getLogger(QueueOperations.class);

    private final QueueConfiguration configuration;
    private final QueueClientWrapper client;

    public QueueOperations(final QueueConfiguration configuration, final QueueClientWrapper client) {
        ObjectHelper.notNull(client, "client can not be null.");

        this.configuration = configuration;
        this.client = client;
    }

    public QueueOperationResponse createQueue(final Exchange exchange) {
        if (exchange == null) {
            return buildResponseWithEmptyBody(client.create(null, null));
        }

        final Map<String, String> metadata = QueueExchangeHeaders.getMetadataFromHeaders(exchange);
        final Duration timeout = QueueExchangeHeaders.getTimeoutFromHeaders(exchange);

        return buildResponseWithEmptyBody(client.create(metadata, timeout));
    }

    public QueueOperationResponse clearQueue(final Exchange exchange) {
        if (exchange == null) {
            return buildResponseWithEmptyBody(client.clearMessages(null));
        }

        final Duration timeout = QueueExchangeHeaders.getTimeoutFromHeaders(exchange);

        return buildResponseWithEmptyBody(client.clearMessages(timeout));
    }

    public QueueOperationResponse deleteQueue(final Exchange exchange) {
        if (exchange == null) {
            return buildResponseWithEmptyBody(client.delete(null));
        }

        final Duration timeout = QueueExchangeHeaders.getTimeoutFromHeaders(exchange);

        return buildResponseWithEmptyBody(client.delete(timeout));
    }

    public QueueOperationResponse sendMessage(final Exchange exchange) {
        ObjectHelper.notNull(exchange, "exchange cannot be null");

        final boolean queueCreated = QueueExchangeHeaders.getQueueCreatedFlagFromHeaders(exchange);

        if (!queueCreated) {
            createQueue(exchange);
        }

        final String text = QueueExchangeHeaders.getMessageTextFromHeaders(exchange);
        final Duration visibilityTimeout = getVisibilityTimeout(exchange);
        final Duration timeToLive = getTimeToLive(exchange);
        final Duration timeout = QueueExchangeHeaders.getTimeoutFromHeaders(exchange);

        return buildResponseWithEmptyBody(client.sendMessage(text, visibilityTimeout, timeToLive, timeout));
    }

    public QueueOperationResponse deleteMessage(final Exchange exchange) {
        ObjectHelper.notNull(exchange, "exchange cannot be null");

        final String messageId = QueueExchangeHeaders.getMessageIdFromHeaders(exchange);
        final String popReceipt = QueueExchangeHeaders.getPopReceiptFromHeaders(exchange);
        final Duration timeout = QueueExchangeHeaders.getTimeoutFromHeaders(exchange);

        if (ObjectHelper.isEmpty(messageId)) {
            throw new IllegalArgumentException(String.format("Message ID must be specified in camel headers '%s' for deleteMessage " +
                    "operation.", QueueConstants.MESSAGE_ID));
        }

        if (ObjectHelper.isEmpty(popReceipt)) {
            throw new IllegalArgumentException(String.format("Message Pop Receipt must be specified in camel headers '%s' for deleteMessage " +
                    "operation.", QueueConstants.POP_RECEIPT));
        }

        return buildResponseWithEmptyBody(client.deleteMessage(messageId, popReceipt, timeout));
    }

    public QueueOperationResponse receiveMessages(final Exchange exchange) {
        if (exchange == null) {
            return new QueueOperationResponse(client.receiveMessages(configuration.getMaxMessages(), configuration.getVisibilityTimeout(), null));
        }

        final Integer maxMessages = getMaxMessages(exchange);
        final Duration visibilityTimeout = getVisibilityTimeout(exchange);
        final Duration timeout = QueueExchangeHeaders.getTimeoutFromHeaders(exchange);

        return new QueueOperationResponse(client.receiveMessages(maxMessages, visibilityTimeout, timeout));
    }

    public QueueOperationResponse peekMessages(final Exchange exchange) {
        if (exchange == null) {
            return new QueueOperationResponse(client.peekMessages(configuration.getMaxMessages(), null));
        }

        final Integer maxMessages = getMaxMessages(exchange);
        final Duration timeout = QueueExchangeHeaders.getTimeoutFromHeaders(exchange);

        return new QueueOperationResponse(client.peekMessages(maxMessages, timeout));
    }

    @SuppressWarnings("rawtypes")
    private QueueOperationResponse buildResponseWithEmptyBody(final Response response) {
        return buildResponse(response, true);
    }

    @SuppressWarnings("rawtypes")
    private QueueOperationResponse buildResponseWithBody(final Response response) {
        return buildResponse(response, false);
    }

    @SuppressWarnings("rawtypes")
    private QueueOperationResponse buildResponse(final Response response, final boolean emptyBody) {
        final Object body = emptyBody ? true : response.getValue();
        QueueExchangeHeaders exchangeHeaders;

        if (response.getValue() instanceof SendMessageResult) {
            exchangeHeaders = QueueExchangeHeaders.createQueueExchangeHeadersFromSendMessageResult((SendMessageResult) response.getValue());
        } else {
            exchangeHeaders = new QueueExchangeHeaders();
        }

        exchangeHeaders.httpHeaders(response.getHeaders());

        return new QueueOperationResponse(body, exchangeHeaders.toMap());
    }

    private Duration getVisibilityTimeout(final Exchange exchange) {
        return ObjectHelper.isEmpty(QueueExchangeHeaders.getVisibilityTimeout(exchange)) ? configuration.getVisibilityTimeout()
                : QueueExchangeHeaders.getVisibilityTimeout(exchange);
    }

    private Duration getTimeToLive(final Exchange exchange) {
        return ObjectHelper.isEmpty(QueueExchangeHeaders.getTimeToLiveFromHeaders(exchange)) ? configuration.getTimeToLive()
                : QueueExchangeHeaders.getTimeToLiveFromHeaders(exchange);
    }

    private Integer getMaxMessages(final Exchange exchange) {
        return ObjectHelper.isEmpty(QueueExchangeHeaders.getMaxMessagesFromHeaders(exchange)) ? configuration.getMaxMessages()
                : QueueExchangeHeaders.getMaxMessagesFromHeaders(exchange);
    }

}
