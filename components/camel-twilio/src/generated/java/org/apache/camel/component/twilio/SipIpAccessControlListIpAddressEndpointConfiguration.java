
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.twilio.rest.api.v2010.account.sip.ipaccesscontrollist.IpAddress
 */
@UriParams(apiName = "sip-ip-access-control-list-ip-address")
@Configurer
public final class SipIpAccessControlListIpAddressEndpointConfiguration extends TwilioConfiguration {
    @UriParam(description = "A human readable descriptive text for this resource, up to 64 characters long.")
    private String friendlyName;
    @UriParam(description = "An IP address in dotted decimal notation from which you want to accept traffic. Any SIP requests from this IP address will be allowed by Twilio. IPv4 only supported today.")
    private String ipAddress;
    @UriParam(description = "The unique sid that identifies this account")
    private String pathAccountSid;
    @UriParam(description = "The IpAccessControlList Sid with which to associate the created IpAddress resource")
    private String pathIpAccessControlListSid;
    @UriParam(description = "A string that identifies the resource to delete")
    private String pathSid;

    public String getFriendlyName() {
        return friendlyName;
    }

    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathIpAccessControlListSid() {
        return pathIpAccessControlListSid;
    }

    public void setPathIpAccessControlListSid(String pathIpAccessControlListSid) {
        this.pathIpAccessControlListSid = pathIpAccessControlListSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }
}
