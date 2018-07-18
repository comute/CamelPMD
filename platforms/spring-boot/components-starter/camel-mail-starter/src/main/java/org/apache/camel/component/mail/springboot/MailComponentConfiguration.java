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
package org.apache.camel.component.mail.springboot;

import java.util.Properties;
import javax.annotation.Generated;
import javax.mail.Session;
import org.apache.camel.component.mail.AttachmentsContentTransferEncodingResolver;
import org.apache.camel.component.mail.JavaMailSender;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.apache.camel.util.jsse.SSLContextParameters;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * To send or receive emails using imap/pop3 or smtp protocols.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.mail")
public class MailComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the pop3s component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * Sets the Mail configuration
     */
    private MailConfigurationNestedConfiguration configuration;
    /**
     * Resolver to determine Content-Type for file attachments. The option is a
     * org.apache.camel.component.mail.ContentTypeResolver type.
     */
    private String contentTypeResolver;
    /**
     * Enable usage of global SSL context parameters.
     */
    private Boolean useGlobalSslContextParameters = false;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public MailConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            MailConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getContentTypeResolver() {
        return contentTypeResolver;
    }

    public void setContentTypeResolver(String contentTypeResolver) {
        this.contentTypeResolver = contentTypeResolver;
    }

    public Boolean getUseGlobalSslContextParameters() {
        return useGlobalSslContextParameters;
    }

    public void setUseGlobalSslContextParameters(
            Boolean useGlobalSslContextParameters) {
        this.useGlobalSslContextParameters = useGlobalSslContextParameters;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public static class MailConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.mail.MailConfiguration.class;
        /**
         * To use a custom
         * {@link org.apache.camel.component.mail.JavaMailSender} for sending
         * emails.
         */
        private JavaMailSender javaMailSender;
        /**
         * The mail server host name
         */
        private String host;
        /**
         * Sets the java mail options. Will clear any default properties and
         * only use the properties provided for this method.
         */
        private Properties javaMailProperties;
        /**
         * Sets additional java mail properties, that will append/override any
         * default properties that is set based on all the other options. This
         * is useful if you need to add some special options but want to keep
         * the others as is.
         */
        private Properties additionalJavaMailProperties;
        /**
         * The password for login
         */
        private String password;
        /**
         * The Subject of the message being sent. Note: Setting the subject in
         * the header takes precedence over this option.
         */
        private String subject;
        /**
         * The port number of the mail server
         */
        private Integer port;
        /**
         * The protocol for communicating with the mail server
         */
        private String protocol;
        /**
         * Specifies the mail session that camel should use for all mail
         * interactions. Useful in scenarios where mail sessions are created and
         * managed by some other resource, such as a JavaEE container. If this
         * is not specified, Camel automatically creates the mail session for
         * you.
         */
        private Session session;
        /**
         * The username for login
         */
        private String username;
        /**
         * The from email address
         */
        private String from = "camel@localhost";
        /**
         * Deletes the messages after they have been processed. This is done by
         * setting the DELETED flag on the mail message. If false, the SEEN flag
         * is set instead. As of Camel 2.10 you can override this configuration
         * option by setting a header with the key delete to determine if the
         * mail should be deleted or not.
         */
        private Boolean delete = false;
        /**
         * Specifies whether Camel should map the received mail message to Camel
         * body/headers. If set to true, the body of the mail message is mapped
         * to the body of the Camel IN message and the mail headers are mapped
         * to IN headers. If this option is set to false then the IN message
         * contains a raw javax.mail.Message. You can retrieve this raw message
         * by calling exchange.getIn().getBody(javax.mail.Message.class).
         */
        private Boolean mapMailMessage = true;
        /**
         * The folder to poll.
         */
        private String folderName = "INBOX";
        /**
         * Option to let Camel ignore unsupported charset in the local JVM when
         * sending mails. If the charset is unsupported then charset=XXX (where
         * XXX represents the unsupported charset) is removed from the
         * content-type and it relies on the platform default instead.
         */
        private Boolean ignoreUriScheme = false;
        /**
         * Whether to limit by unseen mails only.
         */
        private Boolean unseen = true;
        /**
         * Sets the To email address. Separate multiple email addresses with
         * comma.
         */
        private String to;
        /**
         * Sets the CC email address. Separate multiple email addresses with
         * comma.
         */
        private String cc;
        /**
         * Sets the BCC email address. Separate multiple email addresses with
         * comma.
         */
        private String bcc;
        /**
         * The Reply-To recipients (the receivers of the response mail).
         * Separate multiple email addresses with a comma.
         */
        private String replyTo;
        /**
         * Sets the maximum number of messages to consume during a poll. This
         * can be used to avoid overloading a mail server, if a mailbox folder
         * contains a lot of messages. Default value of -1 means no fetch size
         * and all messages will be consumed. Setting the value to 0 is a
         * special corner case, where Camel will not consume any messages at
         * all.
         */
        private Integer fetchSize = -1;
        /**
         * Enable debug mode on the underlying mail framework. The SUN Mail
         * framework logs the debug messages to System.out by default.
         */
        private Boolean debugMode = false;
        /**
         * The connection timeout in milliseconds.
         */
        private Integer connectionTimeout = 30000;
        /**
         * To use a dummy security setting for trusting all certificates. Should
         * only be used for development mode, and not production.
         */
        private Boolean dummyTrustManager = false;
        /**
         * The mail message content type. Use text/html for HTML mails.
         */
        private String contentType = "text/plain";
        /**
         * Specifies the key to an IN message header that contains an
         * alternative email body. For example, if you send emails in text/html
         * format and want to provide an alternative mail body for non-HTML
         * email clients, set the alternative mail body with this key as a
         * header.
         */
        private String alternativeBodyHeader = "CamelMailAlternativeBody";
        /**
         * Whether to use disposition inline or attachment.
         */
        private Boolean useInlineAttachments = false;
        /**
         * Option to let Camel ignore unsupported charset in the local JVM when
         * sending mails. If the charset is unsupported then charset=XXX (where
         * XXX represents the unsupported charset) is removed from the
         * content-type and it relies on the platform default instead.
         */
        private Boolean ignoreUnsupportedCharset = false;
        /**
         * Whether the consumer should disconnect after polling. If enabled this
         * forces Camel to connect on each poll.
         */
        private Boolean disconnect = false;
        /**
         * Whether the consumer should close the folder after polling. Setting
         * this option to false and having disconnect=false as well, then the
         * consumer keep the folder open between polls.
         */
        private Boolean closeFolder = true;
        /**
         * To configure security using SSLContextParameters.
         */
        @NestedConfigurationProperty
        private SSLContextParameters sslContextParameters;
        /**
         * After processing a mail message, it can be copied to a mail folder
         * with the given name. You can override this configuration value, with
         * a header with the key copyTo, allowing you to copy messages to folder
         * names configured at runtime.
         */
        private String copyTo;
        /**
         * Will mark the javax.mail.Message as peeked before processing the mail
         * message. This applies to IMAPMessage messages types only. By using
         * peek the mail will not be eager marked as SEEN on the mail server,
         * which allows us to rollback the mail message if there is an error
         * processing in Camel.
         */
        private Boolean peek = true;
        /**
         * If the mail consumer cannot retrieve a given mail message, then this
         * option allows to skip the message and move on to retrieve the next
         * mail message.
         * <p/>
         * The default behavior would be the consumer throws an exception and no
         * mails from the batch would be able to be routed by Camel.
         */
        private Boolean skipFailedMessage = false;
        /**
         * If the mail consumer cannot retrieve a given mail message, then this
         * option allows to handle the caused exception by the consumer's error
         * handler. By enable the bridge error handler on the consumer, then the
         * Camel routing error handler can handle the exception instead.
         * <p/>
         * The default behavior would be the consumer throws an exception and no
         * mails from the batch would be able to be routed by Camel.
         */
        private Boolean handleFailedMessage = false;
        /**
         * To use a custom AttachmentsContentTransferEncodingResolver to resolve
         * what content-type-encoding to use for attachments.
         */
        private AttachmentsContentTransferEncodingResolver attachmentsContentTransferEncodingResolver;
        /**
         * This option enables transparent MIME decoding and unfolding for mail
         * headers.
         */
        private Boolean mimeDecodeHeaders = false;

        public JavaMailSender getJavaMailSender() {
            return javaMailSender;
        }

        public void setJavaMailSender(JavaMailSender javaMailSender) {
            this.javaMailSender = javaMailSender;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public Properties getJavaMailProperties() {
            return javaMailProperties;
        }

        public void setJavaMailProperties(Properties javaMailProperties) {
            this.javaMailProperties = javaMailProperties;
        }

        public Properties getAdditionalJavaMailProperties() {
            return additionalJavaMailProperties;
        }

        public void setAdditionalJavaMailProperties(
                Properties additionalJavaMailProperties) {
            this.additionalJavaMailProperties = additionalJavaMailProperties;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public String getProtocol() {
            return protocol;
        }

        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }

        public Session getSession() {
            return session;
        }

        public void setSession(Session session) {
            this.session = session;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public Boolean getDelete() {
            return delete;
        }

        public void setDelete(Boolean delete) {
            this.delete = delete;
        }

        public Boolean getMapMailMessage() {
            return mapMailMessage;
        }

        public void setMapMailMessage(Boolean mapMailMessage) {
            this.mapMailMessage = mapMailMessage;
        }

        public String getFolderName() {
            return folderName;
        }

        public void setFolderName(String folderName) {
            this.folderName = folderName;
        }

        public Boolean getIgnoreUriScheme() {
            return ignoreUriScheme;
        }

        public void setIgnoreUriScheme(Boolean ignoreUriScheme) {
            this.ignoreUriScheme = ignoreUriScheme;
        }

        public Boolean getUnseen() {
            return unseen;
        }

        public void setUnseen(Boolean unseen) {
            this.unseen = unseen;
        }

        public String getTo() {
            return to;
        }

        public void setTo(String to) {
            this.to = to;
        }

        public String getCc() {
            return cc;
        }

        public void setCc(String cc) {
            this.cc = cc;
        }

        public String getBcc() {
            return bcc;
        }

        public void setBcc(String bcc) {
            this.bcc = bcc;
        }

        public String getReplyTo() {
            return replyTo;
        }

        public void setReplyTo(String replyTo) {
            this.replyTo = replyTo;
        }

        public Integer getFetchSize() {
            return fetchSize;
        }

        public void setFetchSize(Integer fetchSize) {
            this.fetchSize = fetchSize;
        }

        public Boolean getDebugMode() {
            return debugMode;
        }

        public void setDebugMode(Boolean debugMode) {
            this.debugMode = debugMode;
        }

        public Integer getConnectionTimeout() {
            return connectionTimeout;
        }

        public void setConnectionTimeout(Integer connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
        }

        public Boolean getDummyTrustManager() {
            return dummyTrustManager;
        }

        public void setDummyTrustManager(Boolean dummyTrustManager) {
            this.dummyTrustManager = dummyTrustManager;
        }

        public String getContentType() {
            return contentType;
        }

        public void setContentType(String contentType) {
            this.contentType = contentType;
        }

        public String getAlternativeBodyHeader() {
            return alternativeBodyHeader;
        }

        public void setAlternativeBodyHeader(String alternativeBodyHeader) {
            this.alternativeBodyHeader = alternativeBodyHeader;
        }

        public Boolean getUseInlineAttachments() {
            return useInlineAttachments;
        }

        public void setUseInlineAttachments(Boolean useInlineAttachments) {
            this.useInlineAttachments = useInlineAttachments;
        }

        public Boolean getIgnoreUnsupportedCharset() {
            return ignoreUnsupportedCharset;
        }

        public void setIgnoreUnsupportedCharset(Boolean ignoreUnsupportedCharset) {
            this.ignoreUnsupportedCharset = ignoreUnsupportedCharset;
        }

        public Boolean getDisconnect() {
            return disconnect;
        }

        public void setDisconnect(Boolean disconnect) {
            this.disconnect = disconnect;
        }

        public Boolean getCloseFolder() {
            return closeFolder;
        }

        public void setCloseFolder(Boolean closeFolder) {
            this.closeFolder = closeFolder;
        }

        public SSLContextParameters getSslContextParameters() {
            return sslContextParameters;
        }

        public void setSslContextParameters(
                SSLContextParameters sslContextParameters) {
            this.sslContextParameters = sslContextParameters;
        }

        public String getCopyTo() {
            return copyTo;
        }

        public void setCopyTo(String copyTo) {
            this.copyTo = copyTo;
        }

        public Boolean getPeek() {
            return peek;
        }

        public void setPeek(Boolean peek) {
            this.peek = peek;
        }

        public Boolean getSkipFailedMessage() {
            return skipFailedMessage;
        }

        public void setSkipFailedMessage(Boolean skipFailedMessage) {
            this.skipFailedMessage = skipFailedMessage;
        }

        public Boolean getHandleFailedMessage() {
            return handleFailedMessage;
        }

        public void setHandleFailedMessage(Boolean handleFailedMessage) {
            this.handleFailedMessage = handleFailedMessage;
        }

        public AttachmentsContentTransferEncodingResolver getAttachmentsContentTransferEncodingResolver() {
            return attachmentsContentTransferEncodingResolver;
        }

        public void setAttachmentsContentTransferEncodingResolver(
                AttachmentsContentTransferEncodingResolver attachmentsContentTransferEncodingResolver) {
            this.attachmentsContentTransferEncodingResolver = attachmentsContentTransferEncodingResolver;
        }

        public Boolean getMimeDecodeHeaders() {
            return mimeDecodeHeaders;
        }

        public void setMimeDecodeHeaders(Boolean mimeDecodeHeaders) {
            this.mimeDecodeHeaders = mimeDecodeHeaders;
        }
    }
}