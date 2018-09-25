/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.as2.springboot;

import java.security.PrivateKey;
import java.security.cert.Certificate;
import javax.annotation.Generated;
import org.apache.camel.component.as2.api.AS2EncryptionAlgorithm;
import org.apache.camel.component.as2.api.AS2MessageStructure;
import org.apache.camel.component.as2.internal.AS2ApiName;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.apache.http.entity.ContentType;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Component used for transferring data secure and reliable over the internet
 * using the AS2 protocol.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.as2")
public class AS2ComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the as2 component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * To use the shared configuration
     */
    private AS2ConfigurationNestedConfiguration configuration;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public AS2ConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            AS2ConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public static class AS2ConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.as2.AS2Configuration.class;
        /**
         * What kind of operation to perform
         */
        private AS2ApiName apiName;
        /**
         * What sub operation to use for the selected operation
         */
        private String methodName;
        /**
         * The version of the AS2 protocol.
         */
        private String as2Version = "1.1";
        /**
         * The value included in the User-Agent message header identifying the
         * AS2 user agent.
         */
        private String userAgent = "Camel AS2 Client Endpoint";
        /**
         * The value included in the Server message header identifying the AS2
         * Server.
         */
        private String server = "Camel AS2 Server Endpoint";
        /**
         * The Server Fully Qualified Domain Name (FQDN). Used in message ids
         * sent by endpoint.
         */
        private String serverFqdn = "camel.apache.org";
        /**
         * The host name (IP or DNS name) of target host.
         */
        private String targetHostname;
        /**
         * The port number of target host. -1 indicates the scheme default port.
         */
        private Integer targetPortNumber;
        /**
         * The Client Fully Qualified Domain Name (FQDN). Used in message ids
         * sent by endpoint.
         */
        private String clientFqdn = "camel.apache.org";
        /**
         * The port number of server.
         */
        private Integer serverPortNumber;
        /**
         * The request URI of EDI message.
         */
        private String requestUri = "/";
        /**
         * The content type of EDI message. One of application/edifact,
         * application/edi-x12, application/edi-consent
         */
        private ContentType ediMessageType;
        /**
         * The transfer encoding of EDI message.
         */
        private String ediMessageTransferEncoding;
        /**
         * The structure of AS2 Message. One of: PLAIN - No encryption, no
         * signature, SIGNED - No encryption, signature, ENCRYPTED - Encryption,
         * no signature, ENCRYPTED_SIGNED - Encryption, signature
         */
        private AS2MessageStructure as2MessageStructure;
        /**
         * The value of Subject header of AS2 message.
         */
        private String subject;
        /**
         * The value of the From header of AS2 message.
         */
        private String from;
        /**
         * The value of the AS2From header of AS2 message.
         */
        private String as2From;
        /**
         * The value of the AS2To header of AS2 message.
         */
        private String as2To;
        /**
         * The name of algorithm used to sign EDI message.
         */
        private String signingAlgorithmName;
        /**
         * The chain of certificates used to sign EDI message.
         */
        private Certificate[] signingCertificateChain;
        /**
         * The key used to sign the EDI message.
         */
        private PrivateKey signingPrivateKey;
        /**
         * The value of the Disposition-Notification-To header. Assigning a
         * value to this parameter requests a message disposition notification
         * (MDN) for the AS2 message.
         */
        private String dispositionNotificationTo;
        /**
         * The list of algorithms, in order of preference, requested to generate
         * a message integrity check (MIC) returned in message dispostion
         * notification (MDN)
         */
        private String[] signedReceiptMicAlgorithms;
        /**
         * The algorithm used to encrypt EDI message.
         */
        private AS2EncryptionAlgorithm encryptingAlgorithm;
        /**
         * The chain of certificates used to encrypt EDI message.
         */
        private Certificate[] encryptingCertificateChain;
        /**
         * The key used to encrypt the EDI message.
         */
        private PrivateKey encryptingPrivateKey;

        public AS2ApiName getApiName() {
            return apiName;
        }

        public void setApiName(AS2ApiName apiName) {
            this.apiName = apiName;
        }

        public String getMethodName() {
            return methodName;
        }

        public void setMethodName(String methodName) {
            this.methodName = methodName;
        }

        public String getAs2Version() {
            return as2Version;
        }

        public void setAs2Version(String as2Version) {
            this.as2Version = as2Version;
        }

        public String getUserAgent() {
            return userAgent;
        }

        public void setUserAgent(String userAgent) {
            this.userAgent = userAgent;
        }

        public String getServer() {
            return server;
        }

        public void setServer(String server) {
            this.server = server;
        }

        public String getServerFqdn() {
            return serverFqdn;
        }

        public void setServerFqdn(String serverFqdn) {
            this.serverFqdn = serverFqdn;
        }

        public String getTargetHostname() {
            return targetHostname;
        }

        public void setTargetHostname(String targetHostname) {
            this.targetHostname = targetHostname;
        }

        public Integer getTargetPortNumber() {
            return targetPortNumber;
        }

        public void setTargetPortNumber(Integer targetPortNumber) {
            this.targetPortNumber = targetPortNumber;
        }

        public String getClientFqdn() {
            return clientFqdn;
        }

        public void setClientFqdn(String clientFqdn) {
            this.clientFqdn = clientFqdn;
        }

        public Integer getServerPortNumber() {
            return serverPortNumber;
        }

        public void setServerPortNumber(Integer serverPortNumber) {
            this.serverPortNumber = serverPortNumber;
        }

        public String getRequestUri() {
            return requestUri;
        }

        public void setRequestUri(String requestUri) {
            this.requestUri = requestUri;
        }

        public ContentType getEdiMessageType() {
            return ediMessageType;
        }

        public void setEdiMessageType(ContentType ediMessageType) {
            this.ediMessageType = ediMessageType;
        }

        public String getEdiMessageTransferEncoding() {
            return ediMessageTransferEncoding;
        }

        public void setEdiMessageTransferEncoding(
                String ediMessageTransferEncoding) {
            this.ediMessageTransferEncoding = ediMessageTransferEncoding;
        }

        public AS2MessageStructure getAs2MessageStructure() {
            return as2MessageStructure;
        }

        public void setAs2MessageStructure(
                AS2MessageStructure as2MessageStructure) {
            this.as2MessageStructure = as2MessageStructure;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public String getAs2From() {
            return as2From;
        }

        public void setAs2From(String as2From) {
            this.as2From = as2From;
        }

        public String getAs2To() {
            return as2To;
        }

        public void setAs2To(String as2To) {
            this.as2To = as2To;
        }

        public String getSigningAlgorithmName() {
            return signingAlgorithmName;
        }

        public void setSigningAlgorithmName(String signingAlgorithmName) {
            this.signingAlgorithmName = signingAlgorithmName;
        }

        public Certificate[] getSigningCertificateChain() {
            return signingCertificateChain;
        }

        public void setSigningCertificateChain(
                Certificate[] signingCertificateChain) {
            this.signingCertificateChain = signingCertificateChain;
        }

        public PrivateKey getSigningPrivateKey() {
            return signingPrivateKey;
        }

        public void setSigningPrivateKey(PrivateKey signingPrivateKey) {
            this.signingPrivateKey = signingPrivateKey;
        }

        public String getDispositionNotificationTo() {
            return dispositionNotificationTo;
        }

        public void setDispositionNotificationTo(
                String dispositionNotificationTo) {
            this.dispositionNotificationTo = dispositionNotificationTo;
        }

        public String[] getSignedReceiptMicAlgorithms() {
            return signedReceiptMicAlgorithms;
        }

        public void setSignedReceiptMicAlgorithms(
                String[] signedReceiptMicAlgorithms) {
            this.signedReceiptMicAlgorithms = signedReceiptMicAlgorithms;
        }

        public AS2EncryptionAlgorithm getEncryptingAlgorithm() {
            return encryptingAlgorithm;
        }

        public void setEncryptingAlgorithm(
                AS2EncryptionAlgorithm encryptingAlgorithm) {
            this.encryptingAlgorithm = encryptingAlgorithm;
        }

        public Certificate[] getEncryptingCertificateChain() {
            return encryptingCertificateChain;
        }

        public void setEncryptingCertificateChain(
                Certificate[] encryptingCertificateChain) {
            this.encryptingCertificateChain = encryptingCertificateChain;
        }

        public PrivateKey getEncryptingPrivateKey() {
            return encryptingPrivateKey;
        }

        public void setEncryptingPrivateKey(PrivateKey encryptingPrivateKey) {
            this.encryptingPrivateKey = encryptingPrivateKey;
        }
    }
}