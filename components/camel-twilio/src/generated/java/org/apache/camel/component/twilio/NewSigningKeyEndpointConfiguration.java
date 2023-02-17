
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.NewSigningKey}.
 */
@ApiParams(apiName = "new-signing-key", 
           description = "",
           apiMethods = {@ApiMethod(methodName = "creator", signatures={"com.twilio.rest.api.v2010.account.NewSigningKeyCreator creator()", "com.twilio.rest.api.v2010.account.NewSigningKeyCreator creator(String pathAccountSid)"}), }, aliases = {"^creator$=create", "^deleter$=delete", "^fetcher$=fetch", "^reader$=read", "^updater$=update"})
@UriParams
@Configurer(extended = true)
public final class NewSigningKeyEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator")})
    private String pathAccountSid;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }
}
