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
package org.apache.camel.component.mail;

import java.net.URI;
import java.util.Properties;
import java.util.Map;
import java.util.HashMap;

import javax.mail.Session;
import javax.mail.Message;

import org.springframework.mail.javamail.JavaMailSenderImpl;

/**
 * Represents the configuration data for communicating over email
 *
 * @version $Revision$
 */
public class MailConfiguration {

    public static final String DEFAULT_FOLDER_NAME = "INBOX";
    public static final String DEFAULT_FROM = "camel@localhost";

    private Properties javaMailProperties;
    private String protocol;
    private String host;
    private int port = -1;
    private String username;
    private String password;
    private Session session;
    private String defaultEncoding;
    private String from = DEFAULT_FROM;
    private String folderName = DEFAULT_FOLDER_NAME;
    private boolean deleteProcessedMessages = true;
    private boolean ignoreUriScheme;
    private boolean processOnlyUnseenMessages;
    private Map<Message.RecipientType, String> recipients = new HashMap<Message.RecipientType, String>();
    private int fetchSize = -1;
    private boolean debugMode;

    public MailConfiguration() {
    }

    public void configure(URI uri) {
        String value = uri.getHost();
        if (value != null) {
            setHost(value);
        }

        if (!isIgnoreUriScheme()) {
            String scheme = uri.getScheme();
            if (scheme != null) {
                setProtocol(scheme);
            }
        }

        String userInfo = uri.getUserInfo();
        if (userInfo != null) {
            setUsername(userInfo);

            // set default destination to userInfo@host for backwards compatibility
            // can be overridden by URI parameters
            String address = userInfo + "@" + host;
            recipients.put(Message.RecipientType.TO, address);
        }

        int port = uri.getPort();
        if (port >= 0) {
            setPort(port);
        } else {
            // resolve default port if no port number was provided
            setPort(MailUtils.getDefaultPortForProtocol(uri.getScheme()));
        }
    }

    protected JavaMailSenderImpl createJavaMailSender() {
        JavaMailSenderImpl answer = new JavaMailSenderImpl();

        // sets the debug mode of the underlying mail framework
        answer.getSession().setDebug(debugMode);

        if (defaultEncoding != null) {
            answer.setDefaultEncoding(defaultEncoding);
        }
        if (host != null) {
            answer.setHost(host);
        }
        if (javaMailProperties != null) {
            answer.setJavaMailProperties(javaMailProperties);
        }
        if (port >= 0) {
            answer.setPort(port);
        }
        if (password != null) {
            answer.setPassword(password);
        }
        if (protocol != null) {
            answer.setProtocol(protocol);
        }
        if (session != null) {
            answer.setSession(session);
        }
        if (username != null) {
            answer.setUsername(username);
        }
        return answer;
    }

    // Properties
    // -------------------------------------------------------------------------

    public String getDefaultEncoding() {
        return defaultEncoding;
    }

    public void setDefaultEncoding(String defaultEncoding) {
        this.defaultEncoding = defaultEncoding;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
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
        if (! recipients.containsKey(Message.RecipientType.TO)) {
            // set default destination to username@host for backwards compatibility
            // can be overridden by URI parameters
            String address = username + "@" + host;
            recipients.put(Message.RecipientType.TO, address);
        }
    }

    /**
     * Gets the destination (recipient <tt>To</tt> email address).
     *
     * @deprecated use {@link #getRecipients()}
     */
    public String getDestination() {
        // for backwards compatibility
        return recipients.get(Message.RecipientType.TO);
    }

    /**
     * Sets the destination (recipient <tt>To</tt> email address).
     *
     * @deprecated use {@link #setTo(String)}
     */
    public void setDestination(String destination) {
        // for backwards compatibility
        recipients.put(Message.RecipientType.TO, destination);
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public boolean isDeleteProcessedMessages() {
        return deleteProcessedMessages;
    }

    public void setDeleteProcessedMessages(boolean deleteProcessedMessages) {
        this.deleteProcessedMessages = deleteProcessedMessages;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public boolean isIgnoreUriScheme() {
        return ignoreUriScheme;
    }

    public void setIgnoreUriScheme(boolean ignoreUriScheme) {
        this.ignoreUriScheme = ignoreUriScheme;
    }

    public boolean isProcessOnlyUnseenMessages() {
        return processOnlyUnseenMessages;
    }

    public void setProcessOnlyUnseenMessages(boolean processOnlyUnseenMessages) {
        this.processOnlyUnseenMessages = processOnlyUnseenMessages;
    }

    /**
     * Sets the <tt>To</tt> email address. Separate multiple email addresses with comma.
     */
    public void setTo(String address) {
        recipients.put(Message.RecipientType.TO, address);
    }

    /**
     * Sets the <tt>CC</tt> email address. Separate multiple email addresses with comma.
     */
    public void setCC(String address) {
        recipients.put(Message.RecipientType.CC, address);
    }

    /**
     * Sets the <tt>BCC</tt> email address. Separate multiple email addresses with comma.
     */
    public void setBCC(String address) {
        recipients.put(Message.RecipientType.BCC, address);
    }

    public Map<Message.RecipientType, String> getRecipients() {
        return recipients;
    }

    public int getFetchSize() {
        return fetchSize;
    }

    public void setFetchSize(int fetchSize) {
        this.fetchSize = fetchSize;
    }

    public boolean isDebugMode() {
        return debugMode;
    }

    public void setDebugMode(boolean debugMode) {
        this.debugMode = debugMode;
    }
}
