
/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.calendar.internal;

import java.lang.reflect.Method;
import java.util.List;

import com.google.api.services.calendar.Calendar.Acl;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for com.google.api.services.calendar.Calendar$Acl
 */
public enum CalendarAclApiMethod implements ApiMethod {

    DELETE(
        com.google.api.services.calendar.Calendar.Acl.Delete.class,
        "delete",
        arg("calendarId", String.class),
        arg("ruleId", String.class)),

    GET(
        com.google.api.services.calendar.Calendar.Acl.Get.class,
        "get",
        arg("calendarId", String.class),
        arg("ruleId", String.class)),

    INSERT(
        com.google.api.services.calendar.Calendar.Acl.Insert.class,
        "insert",
        arg("calendarId", String.class),
        arg("content", com.google.api.services.calendar.model.AclRule.class)),

    LIST(
        com.google.api.services.calendar.Calendar.Acl.List.class,
        "list",
        arg("calendarId", String.class)),

    PATCH(
        com.google.api.services.calendar.Calendar.Acl.Patch.class,
        "patch",
        arg("calendarId", String.class),
        arg("ruleId", String.class),
        arg("content", com.google.api.services.calendar.model.AclRule.class)),

    UPDATE(
        com.google.api.services.calendar.Calendar.Acl.Update.class,
        "update",
        arg("calendarId", String.class),
        arg("ruleId", String.class),
        arg("content", com.google.api.services.calendar.model.AclRule.class)),

    WATCH(
        com.google.api.services.calendar.Calendar.Acl.Watch.class,
        "watch",
        arg("calendarId", String.class),
        arg("contentChannel", com.google.api.services.calendar.model.Channel.class));

    private final ApiMethod apiMethod;

    private CalendarAclApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(Acl.class, resultType, name, args);
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
