
/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio.internal;

import java.lang.reflect.Method;
import java.util.List;

import com.twilio.rest.api.v2010.account.sip.domain.IpAccessControlListMapping;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for com.twilio.rest.api.v2010.account.sip.domain.IpAccessControlListMapping
 */
public enum SipDomainIpAccessControlListMappingApiMethod implements ApiMethod {

    CREATOR(
        com.twilio.rest.api.v2010.account.sip.domain.IpAccessControlListMappingCreator.class,
        "creator",
        arg("pathDomainSid", String.class),
        arg("ipAccessControlListSid", String.class)),

    CREATOR_1(
        com.twilio.rest.api.v2010.account.sip.domain.IpAccessControlListMappingCreator.class,
        "creator",
        arg("pathAccountSid", String.class),
        arg("pathDomainSid", String.class),
        arg("ipAccessControlListSid", String.class)),

    DELETER(
        com.twilio.rest.api.v2010.account.sip.domain.IpAccessControlListMappingDeleter.class,
        "deleter",
        arg("pathDomainSid", String.class),
        arg("pathSid", String.class)),

    DELETER_1(
        com.twilio.rest.api.v2010.account.sip.domain.IpAccessControlListMappingDeleter.class,
        "deleter",
        arg("pathAccountSid", String.class),
        arg("pathDomainSid", String.class),
        arg("pathSid", String.class)),

    FETCHER(
        com.twilio.rest.api.v2010.account.sip.domain.IpAccessControlListMappingFetcher.class,
        "fetcher",
        arg("pathDomainSid", String.class),
        arg("pathSid", String.class)),

    FETCHER_1(
        com.twilio.rest.api.v2010.account.sip.domain.IpAccessControlListMappingFetcher.class,
        "fetcher",
        arg("pathAccountSid", String.class),
        arg("pathDomainSid", String.class),
        arg("pathSid", String.class)),

    READER(
        com.twilio.rest.api.v2010.account.sip.domain.IpAccessControlListMappingReader.class,
        "reader",
        arg("pathDomainSid", String.class)),

    READER_1(
        com.twilio.rest.api.v2010.account.sip.domain.IpAccessControlListMappingReader.class,
        "reader",
        arg("pathAccountSid", String.class),
        arg("pathDomainSid", String.class));

    private static final SipDomainIpAccessControlListMappingApiMethod[] CACHED_ENUM_VALUES = values();

    private final ApiMethod apiMethod;

    private SipDomainIpAccessControlListMappingApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(IpAccessControlListMapping.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    @Override
    public String toString() { return apiMethod.getName(); }

    public static SipDomainIpAccessControlListMappingApiMethod fromValue(String value) throws IllegalArgumentException {
        for (int i = 0; i < CACHED_ENUM_VALUES.length; i++) {
            if (CACHED_ENUM_VALUES[i].getName().equalsIgnoreCase(value)) {
                return CACHED_ENUM_VALUES[i];
            }
        }
        throw new IllegalArgumentException("Invalid value " + value);
    }

    @Override
    public Class<?> getResultType() { return apiMethod.getResultType(); }

    @Override
    public List<String> getArgNames() { return apiMethod.getArgNames(); }

    @Override
    public List<Class<?>> getArgTypes() { return apiMethod.getArgTypes(); }

    @Override
    public Method getMethod() { return apiMethod.getMethod(); }
}
