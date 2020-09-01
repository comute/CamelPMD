
/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.as2.internal;

import java.lang.reflect.Method;
import java.util.List;

import org.apache.camel.component.as2.api.AS2ClientManager;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for org.apache.camel.component.as2.api.AS2ClientManager
 */
public enum AS2ClientManagerApiMethod implements ApiMethod {

    SEND(
        org.apache.http.protocol.HttpCoreContext.class,
        "send",
        arg("ediMessage", String.class),
        arg("requestUri", String.class),
        arg("subject", String.class),
        arg("from", String.class),
        arg("as2From", String.class),
        arg("as2To", String.class),
        arg("as2MessageStructure", org.apache.camel.component.as2.api.AS2MessageStructure.class),
        arg("ediMessageContentType", org.apache.http.entity.ContentType.class),
        arg("ediMessageTransferEncoding", String.class),
        arg("signingAlgorithm", org.apache.camel.component.as2.api.AS2SignatureAlgorithm.class),
        arg("signingCertificateChain", new java.security.cert.Certificate[0].getClass()),
        arg("signingPrivateKey", java.security.PrivateKey.class),
        arg("compressionAlgorithm", org.apache.camel.component.as2.api.AS2CompressionAlgorithm.class),
        arg("dispositionNotificationTo", String.class),
        arg("signedReceiptMicAlgorithms", new String[0].getClass()),
        arg("encryptingAlgorithm", org.apache.camel.component.as2.api.AS2EncryptionAlgorithm.class),
        arg("encryptingCertificateChain", new java.security.cert.Certificate[0].getClass()));

    private static final AS2ClientManagerApiMethod[] CACHED_ENUM_VALUES = values();

    private final ApiMethod apiMethod;

    private AS2ClientManagerApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(AS2ClientManager.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    @Override
    public String toString() { return apiMethod.getName(); }

    public static AS2ClientManagerApiMethod fromValue(String value) throws IllegalArgumentException {
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
