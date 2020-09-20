
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.sip.CredentialList}.
 */
@ApiParams(apiName = "sip-credential-list", 
           description = "",
           apiMethods = {@ApiMethod(methodName = "creator", description="Create a CredentialListCreator to execute create", signatures={"com.twilio.rest.api.v2010.account.sip.CredentialListCreator creator(String friendlyName)", "com.twilio.rest.api.v2010.account.sip.CredentialListCreator creator(String pathAccountSid, String friendlyName)"}), @ApiMethod(methodName = "deleter", description="Create a CredentialListDeleter to execute delete", signatures={"com.twilio.rest.api.v2010.account.sip.CredentialListDeleter deleter(String pathSid)", "com.twilio.rest.api.v2010.account.sip.CredentialListDeleter deleter(String pathAccountSid, String pathSid)"}), @ApiMethod(methodName = "fetcher", description="Create a CredentialListFetcher to execute fetch", signatures={"com.twilio.rest.api.v2010.account.sip.CredentialListFetcher fetcher(String pathSid)", "com.twilio.rest.api.v2010.account.sip.CredentialListFetcher fetcher(String pathAccountSid, String pathSid)"}), @ApiMethod(methodName = "reader", description="Create a CredentialListReader to execute read", signatures={"com.twilio.rest.api.v2010.account.sip.CredentialListReader reader()", "com.twilio.rest.api.v2010.account.sip.CredentialListReader reader(String pathAccountSid)"}), @ApiMethod(methodName = "updater", description="Create a CredentialListUpdater to execute update", signatures={"com.twilio.rest.api.v2010.account.sip.CredentialListUpdater updater(String pathSid, String friendlyName)", "com.twilio.rest.api.v2010.account.sip.CredentialListUpdater updater(String pathAccountSid, String pathSid, String friendlyName)"}), }, aliases = {"^creator$=create", "^deleter$=delete", "^fetcher$=fetch", "^reader$=read", "^updater$=update"})
@UriParams
@Configurer
public final class SipCredentialListEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator", description="Human readable descriptive text"), @ApiMethod(methodName = "updater", description="Human readable descriptive text")})
    private String friendlyName;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator", description="The unique id of the Account that is responsible for this resource"), @ApiMethod(methodName = "deleter", description="The unique id of the Account that is responsible for this resource"), @ApiMethod(methodName = "fetcher", description="The unique id of the Account that is responsible for this resource"), @ApiMethod(methodName = "reader", description="The unique id of the Account that is responsible for this resource"), @ApiMethod(methodName = "updater", description="The unique id of the Account that is responsible for this resource")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "deleter", description="Delete by unique credential list Sid"), @ApiMethod(methodName = "fetcher", description="Fetch by unique credential list Sid"), @ApiMethod(methodName = "updater", description="Update by unique credential list Sid")})
    private String pathSid;

    public String getFriendlyName() {
        return friendlyName;
    }

    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }
}
