
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.twilio.rest.api.v2010.account.usage.record.LastMonth
 */
@UriParams
@Configurer
public final class UsageRecordLastMonthEndpointConfiguration extends TwilioConfiguration {

    @UriParam
    private String pathAccountSid;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }
}
