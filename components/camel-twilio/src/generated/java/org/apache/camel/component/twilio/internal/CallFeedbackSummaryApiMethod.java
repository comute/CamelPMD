/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio.internal;

import java.lang.reflect.Method;
import java.util.List;

import com.twilio.rest.api.v2010.account.call.FeedbackSummary;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for com.twilio.rest.api.v2010.account.call.FeedbackSummary
 */
public enum CallFeedbackSummaryApiMethod implements ApiMethod {

    CREATOR(
        com.twilio.rest.api.v2010.account.call.FeedbackSummaryCreator.class,
        "creator",
        arg("startDate", java.time.LocalDate.class),
        arg("endDate", java.time.LocalDate.class)),

    CREATOR_1(
        com.twilio.rest.api.v2010.account.call.FeedbackSummaryCreator.class,
        "creator",
        arg("pathAccountSid", String.class),
        arg("startDate", java.time.LocalDate.class),
        arg("endDate", java.time.LocalDate.class)),

    DELETER(
        com.twilio.rest.api.v2010.account.call.FeedbackSummaryDeleter.class,
        "deleter",
        arg("pathSid", String.class)),

    DELETER_1(
        com.twilio.rest.api.v2010.account.call.FeedbackSummaryDeleter.class,
        "deleter",
        arg("pathAccountSid", String.class),
        arg("pathSid", String.class)),

    FETCHER(
        com.twilio.rest.api.v2010.account.call.FeedbackSummaryFetcher.class,
        "fetcher",
        arg("pathSid", String.class)),

    FETCHER_1(
        com.twilio.rest.api.v2010.account.call.FeedbackSummaryFetcher.class,
        "fetcher",
        arg("pathAccountSid", String.class),
        arg("pathSid", String.class));

    private final ApiMethod apiMethod;

    private CallFeedbackSummaryApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(FeedbackSummary.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    @Override
    public Class<?> getResultType() { return apiMethod.getResultType(); }

    @Override
    public List<String> getArgNames() { return apiMethod.getArgNames(); }

    @Override
    public List<Class<?>> getArgTypes() { return apiMethod.getArgTypes(); }

    @Override
    public Method getMethod() { return apiMethod.getMethod(); }
}