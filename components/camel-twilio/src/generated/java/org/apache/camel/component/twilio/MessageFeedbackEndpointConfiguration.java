
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.twilio.rest.api.v2010.account.message.Feedback
 */
@UriParams(apiName = "message-feedback")
@Configurer
public final class MessageFeedbackEndpointConfiguration extends TwilioConfiguration {
    @UriParam(description = "The SID of the Account that will create the resource")
    private String pathAccountSid;
    @UriParam(description = "The SID of the Message resource for which the feedback was provided")
    private String pathMessageSid;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathMessageSid() {
        return pathMessageSid;
    }

    public void setPathMessageSid(String pathMessageSid) {
        this.pathMessageSid = pathMessageSid;
    }
}
