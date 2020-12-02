/*
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
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.Expression;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Copy files to/from remote hosts using the secure copy protocol (SCP).
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ScpEndpointBuilderFactory {


    /**
     * Builder for endpoint for the SCP component.
     */
    public interface ScpEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedScpEndpointBuilder advanced() {
            return (AdvancedScpEndpointBuilder) this;
        }
        /**
         * Allows you to set chmod on the stored file. For example chmod=664.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: 664
         * Group: producer
         */
        default ScpEndpointBuilder chmod(String chmod) {
            doSetProperty("chmod", chmod);
            return this;
        }
        /**
         * Whether or not to disconnect from remote FTP server right after use.
         * Disconnect will only disconnect the current connection to the FTP
         * server. If you have a consumer which you want to stop, then you need
         * to stop the consumer/route instead.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default ScpEndpointBuilder disconnect(boolean disconnect) {
            doSetProperty("disconnect", disconnect);
            return this;
        }
        /**
         * Whether or not to disconnect from remote FTP server right after use.
         * Disconnect will only disconnect the current connection to the FTP
         * server. If you have a consumer which you want to stop, then you need
         * to stop the consumer/route instead.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default ScpEndpointBuilder disconnect(String disconnect) {
            doSetProperty("disconnect", disconnect);
            return this;
        }
        /**
         * Use Expression such as File Language to dynamically set the filename.
         * For consumers, it's used as a filename filter. For producers, it's
         * used to evaluate the filename to write. If an expression is set, it
         * take precedence over the CamelFileName header. (Note: The header
         * itself can also be an Expression). The expression options support
         * both String and Expression types. If the expression is a String type,
         * it is always evaluated using the File Language. If the expression is
         * an Expression type, the specified Expression type is used - this
         * allows you, for instance, to use OGNL expressions. For the consumer,
         * you can use it to filter filenames, so you can for instance consume
         * today's file using the File Language syntax:
         * mydata-${date:now:yyyyMMdd}.txt. The producers support the
         * CamelOverruleFileName header which takes precedence over any existing
         * CamelFileName header; the CamelOverruleFileName is a header that is
         * used only once, and makes it easier as this avoids to temporary store
         * CamelFileName and have to restore it afterwards.
         * 
         * The option is a: <code>org.apache.camel.Expression</code> type.
         * 
         * Group: producer
         */
        default ScpEndpointBuilder fileName(Expression fileName) {
            doSetProperty("fileName", fileName);
            return this;
        }
        /**
         * Use Expression such as File Language to dynamically set the filename.
         * For consumers, it's used as a filename filter. For producers, it's
         * used to evaluate the filename to write. If an expression is set, it
         * take precedence over the CamelFileName header. (Note: The header
         * itself can also be an Expression). The expression options support
         * both String and Expression types. If the expression is a String type,
         * it is always evaluated using the File Language. If the expression is
         * an Expression type, the specified Expression type is used - this
         * allows you, for instance, to use OGNL expressions. For the consumer,
         * you can use it to filter filenames, so you can for instance consume
         * today's file using the File Language syntax:
         * mydata-${date:now:yyyyMMdd}.txt. The producers support the
         * CamelOverruleFileName header which takes precedence over any existing
         * CamelFileName header; the CamelOverruleFileName is a header that is
         * used only once, and makes it easier as this avoids to temporary store
         * CamelFileName and have to restore it afterwards.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.Expression</code> type.
         * 
         * Group: producer
         */
        default ScpEndpointBuilder fileName(String fileName) {
            doSetProperty("fileName", fileName);
            return this;
        }
        /**
         * Flatten is used to flatten the file name path to strip any leading
         * paths, so it's just the file name. This allows you to consume
         * recursively into sub-directories, but when you eg write the files to
         * another directory they will be written in a single directory. Setting
         * this to true on the producer enforces that any file name in
         * CamelFileName header will be stripped for any leading paths.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default ScpEndpointBuilder flatten(boolean flatten) {
            doSetProperty("flatten", flatten);
            return this;
        }
        /**
         * Flatten is used to flatten the file name path to strip any leading
         * paths, so it's just the file name. This allows you to consume
         * recursively into sub-directories, but when you eg write the files to
         * another directory they will be written in a single directory. Setting
         * this to true on the producer enforces that any file name in
         * CamelFileName header will be stripped for any leading paths.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default ScpEndpointBuilder flatten(String flatten) {
            doSetProperty("flatten", flatten);
            return this;
        }
        /**
         * Used for jailing (restricting) writing files to the starting
         * directory (and sub) only. This is enabled by default to not allow
         * Camel to write files to outside directories (to be more secured out
         * of the box). You can turn this off to allow writing files to
         * directories outside the starting directory, such as parent or root
         * folders.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default ScpEndpointBuilder jailStartingDirectory(
                boolean jailStartingDirectory) {
            doSetProperty("jailStartingDirectory", jailStartingDirectory);
            return this;
        }
        /**
         * Used for jailing (restricting) writing files to the starting
         * directory (and sub) only. This is enabled by default to not allow
         * Camel to write files to outside directories (to be more secured out
         * of the box). You can turn this off to allow writing files to
         * directories outside the starting directory, such as parent or root
         * folders.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default ScpEndpointBuilder jailStartingDirectory(
                String jailStartingDirectory) {
            doSetProperty("jailStartingDirectory", jailStartingDirectory);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default ScpEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default ScpEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Sets whether to use strict host key checking. Possible values are:
         * no, yes.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: no
         * Group: producer
         */
        default ScpEndpointBuilder strictHostKeyChecking(
                String strictHostKeyChecking) {
            doSetProperty("strictHostKeyChecking", strictHostKeyChecking);
            return this;
        }
        /**
         * Sets the known_hosts file, so that the jsch endpoint can do host key
         * verification. You can prefix with classpath: to load the file from
         * classpath instead of file system.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default ScpEndpointBuilder knownHostsFile(String knownHostsFile) {
            doSetProperty("knownHostsFile", knownHostsFile);
            return this;
        }
        /**
         * Password to use for login.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default ScpEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Set a comma separated list of authentications that will be used in
         * order of preference. Possible authentication methods are defined by
         * JCraft JSCH. Some examples include:
         * gssapi-with-mic,publickey,keyboard-interactive,password If not
         * specified the JSCH and/or system defaults will be used.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default ScpEndpointBuilder preferredAuthentications(
                String preferredAuthentications) {
            doSetProperty("preferredAuthentications", preferredAuthentications);
            return this;
        }
        /**
         * Set the private key bytes to that the endpoint can do private key
         * verification. This must be used only if privateKeyFile wasn't set.
         * Otherwise the file will have the priority.
         * 
         * The option is a: <code>byte[]</code> type.
         * 
         * Group: security
         */
        default ScpEndpointBuilder privateKeyBytes(Byte[] privateKeyBytes) {
            doSetProperty("privateKeyBytes", privateKeyBytes);
            return this;
        }
        /**
         * Set the private key bytes to that the endpoint can do private key
         * verification. This must be used only if privateKeyFile wasn't set.
         * Otherwise the file will have the priority.
         * 
         * The option will be converted to a <code>byte[]</code> type.
         * 
         * Group: security
         */
        default ScpEndpointBuilder privateKeyBytes(String privateKeyBytes) {
            doSetProperty("privateKeyBytes", privateKeyBytes);
            return this;
        }
        /**
         * Set the private key file to that the endpoint can do private key
         * verification. You can prefix with classpath: to load the file from
         * classpath instead of file system.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default ScpEndpointBuilder privateKeyFile(String privateKeyFile) {
            doSetProperty("privateKeyFile", privateKeyFile);
            return this;
        }
        /**
         * Set the private key file passphrase to that the endpoint can do
         * private key verification.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default ScpEndpointBuilder privateKeyFilePassphrase(
                String privateKeyFilePassphrase) {
            doSetProperty("privateKeyFilePassphrase", privateKeyFilePassphrase);
            return this;
        }
        /**
         * Username to use for login.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default ScpEndpointBuilder username(String username) {
            doSetProperty("username", username);
            return this;
        }
        /**
         * If knownHostFile has not been explicit configured, then use the host
         * file from System.getProperty(user.home) /.ssh/known_hosts.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: security
         */
        default ScpEndpointBuilder useUserKnownHostsFile(
                boolean useUserKnownHostsFile) {
            doSetProperty("useUserKnownHostsFile", useUserKnownHostsFile);
            return this;
        }
        /**
         * If knownHostFile has not been explicit configured, then use the host
         * file from System.getProperty(user.home) /.ssh/known_hosts.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: security
         */
        default ScpEndpointBuilder useUserKnownHostsFile(
                String useUserKnownHostsFile) {
            doSetProperty("useUserKnownHostsFile", useUserKnownHostsFile);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the SCP component.
     */
    public interface AdvancedScpEndpointBuilder
            extends
                EndpointProducerBuilder {
        default ScpEndpointBuilder basic() {
            return (ScpEndpointBuilder) this;
        }
        /**
         * Used to specify if a null body is allowed during file writing. If set
         * to true then an empty file will be created, when set to false, and
         * attempting to send a null body to the file component, a
         * GenericFileWriteException of 'Cannot write null body to file.' will
         * be thrown. If the fileExist option is set to 'Override', then the
         * file will be truncated, and if set to append the file will remain
         * unchanged.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer (advanced)
         */
        default AdvancedScpEndpointBuilder allowNullBody(boolean allowNullBody) {
            doSetProperty("allowNullBody", allowNullBody);
            return this;
        }
        /**
         * Used to specify if a null body is allowed during file writing. If set
         * to true then an empty file will be created, when set to false, and
         * attempting to send a null body to the file component, a
         * GenericFileWriteException of 'Cannot write null body to file.' will
         * be thrown. If the fileExist option is set to 'Override', then the
         * file will be truncated, and if set to append the file will remain
         * unchanged.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer (advanced)
         */
        default AdvancedScpEndpointBuilder allowNullBody(String allowNullBody) {
            doSetProperty("allowNullBody", allowNullBody);
            return this;
        }
        /**
         * Whether or not to disconnect from remote FTP server right after a
         * Batch upload is complete. disconnectOnBatchComplete will only
         * disconnect the current connection to the FTP server.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer (advanced)
         */
        default AdvancedScpEndpointBuilder disconnectOnBatchComplete(
                boolean disconnectOnBatchComplete) {
            doSetProperty("disconnectOnBatchComplete", disconnectOnBatchComplete);
            return this;
        }
        /**
         * Whether or not to disconnect from remote FTP server right after a
         * Batch upload is complete. disconnectOnBatchComplete will only
         * disconnect the current connection to the FTP server.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer (advanced)
         */
        default AdvancedScpEndpointBuilder disconnectOnBatchComplete(
                String disconnectOnBatchComplete) {
            doSetProperty("disconnectOnBatchComplete", disconnectOnBatchComplete);
            return this;
        }
        /**
         * Strategy (Custom Strategy) used to move file with special naming
         * token to use when fileExist=Move is configured. By default, there is
         * an implementation used if no custom strategy is provided.
         * 
         * The option is a:
         * <code>org.apache.camel.component.file.strategy.FileMoveExistingStrategy</code> type.
         * 
         * Group: producer (advanced)
         */
        default AdvancedScpEndpointBuilder moveExistingFileStrategy(
                Object moveExistingFileStrategy) {
            doSetProperty("moveExistingFileStrategy", moveExistingFileStrategy);
            return this;
        }
        /**
         * Strategy (Custom Strategy) used to move file with special naming
         * token to use when fileExist=Move is configured. By default, there is
         * an implementation used if no custom strategy is provided.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.file.strategy.FileMoveExistingStrategy</code> type.
         * 
         * Group: producer (advanced)
         */
        default AdvancedScpEndpointBuilder moveExistingFileStrategy(
                String moveExistingFileStrategy) {
            doSetProperty("moveExistingFileStrategy", moveExistingFileStrategy);
            return this;
        }
        /**
         * Sets the connect timeout for waiting for a connection to be
         * established Used by both FTPClient and JSCH.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 10000
         * Group: advanced
         */
        default AdvancedScpEndpointBuilder connectTimeout(int connectTimeout) {
            doSetProperty("connectTimeout", connectTimeout);
            return this;
        }
        /**
         * Sets the connect timeout for waiting for a connection to be
         * established Used by both FTPClient and JSCH.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 10000
         * Group: advanced
         */
        default AdvancedScpEndpointBuilder connectTimeout(String connectTimeout) {
            doSetProperty("connectTimeout", connectTimeout);
            return this;
        }
        /**
         * Sets the so timeout FTP and FTPS Only for Camel 2.4. SFTP for Camel
         * 2.14.3/2.15.3/2.16 onwards. Is the SocketOptions.SO_TIMEOUT value in
         * millis. Recommended option is to set this to 300000 so as not have a
         * hanged connection. On SFTP this option is set as timeout on the JSCH
         * Session instance.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 5m
         * Group: advanced
         */
        default AdvancedScpEndpointBuilder soTimeout(int soTimeout) {
            doSetProperty("soTimeout", soTimeout);
            return this;
        }
        /**
         * Sets the so timeout FTP and FTPS Only for Camel 2.4. SFTP for Camel
         * 2.14.3/2.15.3/2.16 onwards. Is the SocketOptions.SO_TIMEOUT value in
         * millis. Recommended option is to set this to 300000 so as not have a
         * hanged connection. On SFTP this option is set as timeout on the JSCH
         * Session instance.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 5m
         * Group: advanced
         */
        default AdvancedScpEndpointBuilder soTimeout(String soTimeout) {
            doSetProperty("soTimeout", soTimeout);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedScpEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedScpEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets the data timeout for waiting for reply Used only by FTPClient.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 30s
         * Group: advanced
         */
        default AdvancedScpEndpointBuilder timeout(int timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * Sets the data timeout for waiting for reply Used only by FTPClient.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 30s
         * Group: advanced
         */
        default AdvancedScpEndpointBuilder timeout(String timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * Set a comma separated list of ciphers that will be used in order of
         * preference. Possible cipher names are defined by JCraft JSCH. Some
         * examples include:
         * aes128-ctr,aes128-cbc,3des-ctr,3des-cbc,blowfish-cbc,aes192-cbc,aes256-cbc. If not specified the default list from JSCH will be used.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security (advanced)
         */
        default AdvancedScpEndpointBuilder ciphers(String ciphers) {
            doSetProperty("ciphers", ciphers);
            return this;
        }
    }

    public interface ScpBuilders {
        /**
         * SCP (camel-jsch)
         * Copy files to/from remote hosts using the secure copy protocol (SCP).
         * 
         * Category: file
         * Since: 2.10
         * Maven coordinates: org.apache.camel:camel-jsch
         * 
         * Syntax: <code>scp:host:port/directoryName</code>
         * 
         * Path parameter: host (required)
         * Hostname of the FTP server
         * 
         * Path parameter: port
         * Port of the FTP server
         * 
         * Path parameter: directoryName
         * The starting directory
         * 
         * @param path host:port/directoryName
         */
        default ScpEndpointBuilder scp(String path) {
            return ScpEndpointBuilderFactory.endpointBuilder("scp", path);
        }
        /**
         * SCP (camel-jsch)
         * Copy files to/from remote hosts using the secure copy protocol (SCP).
         * 
         * Category: file
         * Since: 2.10
         * Maven coordinates: org.apache.camel:camel-jsch
         * 
         * Syntax: <code>scp:host:port/directoryName</code>
         * 
         * Path parameter: host (required)
         * Hostname of the FTP server
         * 
         * Path parameter: port
         * Port of the FTP server
         * 
         * Path parameter: directoryName
         * The starting directory
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path host:port/directoryName
         */
        default ScpEndpointBuilder scp(String componentName, String path) {
            return ScpEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static ScpEndpointBuilder endpointBuilder(String componentName, String path) {
        class ScpEndpointBuilderImpl extends AbstractEndpointBuilder implements ScpEndpointBuilder, AdvancedScpEndpointBuilder {
            public ScpEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new ScpEndpointBuilderImpl(path);
    }
}