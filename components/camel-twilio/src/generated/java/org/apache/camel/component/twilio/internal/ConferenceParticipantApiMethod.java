
/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio.internal;

import java.lang.reflect.Method;
import java.util.List;

import com.twilio.rest.api.v2010.account.conference.Participant;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for com.twilio.rest.api.v2010.account.conference.Participant
 */
public enum ConferenceParticipantApiMethod implements ApiMethod {

    CREATOR(
        com.twilio.rest.api.v2010.account.conference.ParticipantCreator.class,
        "creator",
        arg("pathConferenceSid", String.class),
        arg("from", com.twilio.type.PhoneNumber.class),
        arg("to", com.twilio.type.PhoneNumber.class)),

    CREATOR_1(
        com.twilio.rest.api.v2010.account.conference.ParticipantCreator.class,
        "creator",
        arg("pathAccountSid", String.class),
        arg("pathConferenceSid", String.class),
        arg("from", com.twilio.type.PhoneNumber.class),
        arg("to", com.twilio.type.PhoneNumber.class)),

    DELETER(
        com.twilio.rest.api.v2010.account.conference.ParticipantDeleter.class,
        "deleter",
        arg("pathConferenceSid", String.class),
        arg("pathCallSid", String.class)),

    DELETER_1(
        com.twilio.rest.api.v2010.account.conference.ParticipantDeleter.class,
        "deleter",
        arg("pathAccountSid", String.class),
        arg("pathConferenceSid", String.class),
        arg("pathCallSid", String.class)),

    FETCHER(
        com.twilio.rest.api.v2010.account.conference.ParticipantFetcher.class,
        "fetcher",
        arg("pathConferenceSid", String.class),
        arg("pathCallSid", String.class)),

    FETCHER_1(
        com.twilio.rest.api.v2010.account.conference.ParticipantFetcher.class,
        "fetcher",
        arg("pathAccountSid", String.class),
        arg("pathConferenceSid", String.class),
        arg("pathCallSid", String.class)),

    READER(
        com.twilio.rest.api.v2010.account.conference.ParticipantReader.class,
        "reader",
        arg("pathConferenceSid", String.class)),

    READER_1(
        com.twilio.rest.api.v2010.account.conference.ParticipantReader.class,
        "reader",
        arg("pathAccountSid", String.class),
        arg("pathConferenceSid", String.class)),

    UPDATER(
        com.twilio.rest.api.v2010.account.conference.ParticipantUpdater.class,
        "updater",
        arg("pathConferenceSid", String.class),
        arg("pathCallSid", String.class)),

    UPDATER_1(
        com.twilio.rest.api.v2010.account.conference.ParticipantUpdater.class,
        "updater",
        arg("pathAccountSid", String.class),
        arg("pathConferenceSid", String.class),
        arg("pathCallSid", String.class));

    private static final ConferenceParticipantApiMethod[] CACHED_ENUM_VALUES = values();

    private final ApiMethod apiMethod;

    private ConferenceParticipantApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(Participant.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    @Override
    public String toString() { return apiMethod.getName(); }

    public static ConferenceParticipantApiMethod fromValue(String value) throws IllegalArgumentException {
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
