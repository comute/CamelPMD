
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
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.recording.Transcription}.
 */
@ApiParams(apiName = "recording-transcription", 
           description = "",
           apiMethods = {@ApiMethod(methodName = "deleter", description="Create a TranscriptionDeleter to execute delete", signatures={"com.twilio.rest.api.v2010.account.recording.TranscriptionDeleter deleter(String pathRecordingSid, String pathSid)", "com.twilio.rest.api.v2010.account.recording.TranscriptionDeleter deleter(String pathAccountSid, String pathRecordingSid, String pathSid)"}), @ApiMethod(methodName = "fetcher", description="Create a TranscriptionFetcher to execute fetch", signatures={"com.twilio.rest.api.v2010.account.recording.TranscriptionFetcher fetcher(String pathRecordingSid, String pathSid)", "com.twilio.rest.api.v2010.account.recording.TranscriptionFetcher fetcher(String pathAccountSid, String pathRecordingSid, String pathSid)"}), @ApiMethod(methodName = "reader", description="Create a TranscriptionReader to execute read", signatures={"com.twilio.rest.api.v2010.account.recording.TranscriptionReader reader(String pathRecordingSid)", "com.twilio.rest.api.v2010.account.recording.TranscriptionReader reader(String pathAccountSid, String pathRecordingSid)"}), }, aliases = {"^creator$=create", "^deleter$=delete", "^fetcher$=fetch", "^reader$=read", "^updater$=update"})
@UriParams
@Configurer
public final class RecordingTranscriptionEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "deleter", description="The SID of the Account that created the resources to delete"), @ApiMethod(methodName = "fetcher", description="The SID of the Account that created the resource to fetch"), @ApiMethod(methodName = "reader", description="The SID of the Account that created the resources to read")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "deleter", description="The SID of the recording that created the transcription to delete"), @ApiMethod(methodName = "deleter", description="The SID of the recording that created the transcription to delete"), @ApiMethod(methodName = "fetcher", description="The SID of the recording that created the transcriptions to fetch"), @ApiMethod(methodName = "fetcher", description="The SID of the recording that created the transcription to delete"), @ApiMethod(methodName = "reader", description="The SID of the recording that created the transcriptions to read"), @ApiMethod(methodName = "reader", description="The SID of the recording that created the transcription to delete")})
    private String pathRecordingSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "deleter", description="The unique string that identifies the resource"), @ApiMethod(methodName = "fetcher", description="The unique string that identifies the resource")})
    private String pathSid;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathRecordingSid() {
        return pathRecordingSid;
    }

    public void setPathRecordingSid(String pathRecordingSid) {
        this.pathRecordingSid = pathRecordingSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }
}
