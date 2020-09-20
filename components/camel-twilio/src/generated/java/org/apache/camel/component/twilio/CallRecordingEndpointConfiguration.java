
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
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.call.Recording}.
 */
@ApiParams(apiName = "call-recording", 
           description = "",
           apiMethods = {@ApiMethod(methodName = "creator", description="Create a RecordingCreator to execute create", signatures={"com.twilio.rest.api.v2010.account.call.RecordingCreator creator(String pathCallSid)", "com.twilio.rest.api.v2010.account.call.RecordingCreator creator(String pathAccountSid, String pathCallSid)"}), @ApiMethod(methodName = "deleter", description="Create a RecordingDeleter to execute delete", signatures={"com.twilio.rest.api.v2010.account.call.RecordingDeleter deleter(String pathCallSid, String pathSid)", "com.twilio.rest.api.v2010.account.call.RecordingDeleter deleter(String pathAccountSid, String pathCallSid, String pathSid)"}), @ApiMethod(methodName = "fetcher", description="Create a RecordingFetcher to execute fetch", signatures={"com.twilio.rest.api.v2010.account.call.RecordingFetcher fetcher(String pathCallSid, String pathSid)", "com.twilio.rest.api.v2010.account.call.RecordingFetcher fetcher(String pathAccountSid, String pathCallSid, String pathSid)"}), @ApiMethod(methodName = "reader", description="Create a RecordingReader to execute read", signatures={"com.twilio.rest.api.v2010.account.call.RecordingReader reader(String pathCallSid)", "com.twilio.rest.api.v2010.account.call.RecordingReader reader(String pathAccountSid, String pathCallSid)"}), @ApiMethod(methodName = "updater", description="Create a RecordingUpdater to execute update", signatures={"com.twilio.rest.api.v2010.account.call.RecordingUpdater updater(String pathCallSid, String pathSid, com.twilio.rest.api.v2010.account.call.Recording$Status status)", "com.twilio.rest.api.v2010.account.call.RecordingUpdater updater(String pathAccountSid, String pathCallSid, String pathSid, com.twilio.rest.api.v2010.account.call.Recording$Status status)"}), }, aliases = {"^creator$=create", "^deleter$=delete", "^fetcher$=fetch", "^reader$=read", "^updater$=update"})
@UriParams
@Configurer
public final class CallRecordingEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator", description="The SID of the Account that will create the resource"), @ApiMethod(methodName = "deleter", description="The SID of the Account that created the resources to delete"), @ApiMethod(methodName = "fetcher", description="The SID of the Account that created the resource to fetch"), @ApiMethod(methodName = "reader", description="The SID of the Account that created the resources to read"), @ApiMethod(methodName = "updater", description="The SID of the Account that created the resource to update")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator", description="The SID of the Call to associate the resource with"), @ApiMethod(methodName = "creator", description="The SID of the Call to associate the resource with"), @ApiMethod(methodName = "deleter", description="The Call SID of the resources to delete"), @ApiMethod(methodName = "deleter", description="The SID of the Call to associate the resource with"), @ApiMethod(methodName = "fetcher", description="The Call SID of the resource to fetch"), @ApiMethod(methodName = "fetcher", description="The SID of the Call to associate the resource with"), @ApiMethod(methodName = "reader", description="The Call SID of the resources to read"), @ApiMethod(methodName = "reader", description="The SID of the Call to associate the resource with"), @ApiMethod(methodName = "updater", description="The Call SID of the resource to update"), @ApiMethod(methodName = "updater", description="The SID of the Call to associate the resource with")})
    private String pathCallSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "deleter", description="The unique string that identifies the resource"), @ApiMethod(methodName = "fetcher", description="The unique string that identifies the resource"), @ApiMethod(methodName = "updater", description="The unique string that identifies the resource")})
    private String pathSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "updater", description="The new status of the recording")})
    private com.twilio.rest.api.v2010.account.call.Recording.Status status;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathCallSid() {
        return pathCallSid;
    }

    public void setPathCallSid(String pathCallSid) {
        this.pathCallSid = pathCallSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }

    public com.twilio.rest.api.v2010.account.call.Recording.Status getStatus() {
        return status;
    }

    public void setStatus(com.twilio.rest.api.v2010.account.call.Recording.Status status) {
        this.status = status;
    }
}
