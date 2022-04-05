/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.file.remote;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class SftpEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":host:port/directoryName";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(126);
        props.add("allowNullBody");
        props.add("antExclude");
        props.add("antFilterCaseSensitive");
        props.add("antInclude");
        props.add("autoCreate");
        props.add("backoffErrorThreshold");
        props.add("backoffIdleThreshold");
        props.add("backoffMultiplier");
        props.add("binary");
        props.add("bindAddress");
        props.add("bridgeErrorHandler");
        props.add("bulkRequests");
        props.add("charset");
        props.add("chmod");
        props.add("chmodDirectory");
        props.add("ciphers");
        props.add("compression");
        props.add("connectTimeout");
        props.add("delay");
        props.add("delete");
        props.add("directoryName");
        props.add("disconnect");
        props.add("disconnectOnBatchComplete");
        props.add("doneFileName");
        props.add("download");
        props.add("eagerDeleteTargetFile");
        props.add("eagerMaxMessagesPerPoll");
        props.add("exceptionHandler");
        props.add("exchangePattern");
        props.add("exclude");
        props.add("excludeExt");
        props.add("exclusiveReadLockStrategy");
        props.add("existDirCheckUsingLs");
        props.add("fastExistsCheck");
        props.add("fileExist");
        props.add("fileName");
        props.add("filter");
        props.add("filterDirectory");
        props.add("filterFile");
        props.add("flatten");
        props.add("greedy");
        props.add("host");
        props.add("idempotent");
        props.add("idempotentKey");
        props.add("idempotentRepository");
        props.add("ignoreFileNotFoundOrPermissionError");
        props.add("inProgressRepository");
        props.add("include");
        props.add("includeExt");
        props.add("initialDelay");
        props.add("jailStartingDirectory");
        props.add("jschLoggingLevel");
        props.add("keepLastModified");
        props.add("keyExchangeProtocols");
        props.add("keyPair");
        props.add("knownHosts");
        props.add("knownHostsFile");
        props.add("knownHostsUri");
        props.add("lazyStartProducer");
        props.add("localWorkDirectory");
        props.add("maxDepth");
        props.add("maxMessagesPerPoll");
        props.add("maximumReconnectAttempts");
        props.add("minDepth");
        props.add("move");
        props.add("moveExisting");
        props.add("moveExistingFileStrategy");
        props.add("moveFailed");
        props.add("noop");
        props.add("onCompletionExceptionHandler");
        props.add("passiveMode");
        props.add("password");
        props.add("pollStrategy");
        props.add("port");
        props.add("preMove");
        props.add("preSort");
        props.add("preferredAuthentications");
        props.add("privateKey");
        props.add("privateKeyFile");
        props.add("privateKeyPassphrase");
        props.add("privateKeyUri");
        props.add("processStrategy");
        props.add("proxy");
        props.add("readLock");
        props.add("readLockCheckInterval");
        props.add("readLockDeleteOrphanLockFiles");
        props.add("readLockIdempotentReleaseAsync");
        props.add("readLockIdempotentReleaseAsyncPoolSize");
        props.add("readLockIdempotentReleaseDelay");
        props.add("readLockIdempotentReleaseExecutorService");
        props.add("readLockLoggingLevel");
        props.add("readLockMarkerFile");
        props.add("readLockMinAge");
        props.add("readLockMinLength");
        props.add("readLockRemoveOnCommit");
        props.add("readLockRemoveOnRollback");
        props.add("readLockTimeout");
        props.add("reconnectDelay");
        props.add("recursive");
        props.add("repeatCount");
        props.add("runLoggingLevel");
        props.add("scheduledExecutorService");
        props.add("scheduler");
        props.add("schedulerProperties");
        props.add("sendEmptyMessageWhenIdle");
        props.add("sendNoop");
        props.add("separator");
        props.add("serverAliveCountMax");
        props.add("serverAliveInterval");
        props.add("shuffle");
        props.add("soTimeout");
        props.add("sortBy");
        props.add("sorter");
        props.add("startScheduler");
        props.add("stepwise");
        props.add("streamDownload");
        props.add("strictHostKeyChecking");
        props.add("tempFileName");
        props.add("tempPrefix");
        props.add("throwExceptionOnConnectFailed");
        props.add("timeUnit");
        props.add("timeout");
        props.add("useFixedDelay");
        props.add("useList");
        props.add("useUserKnownHostsFile");
        props.add("username");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(10);
        secretProps.add("keyPair");
        secretProps.add("knownHosts");
        secretProps.add("knownHostsFile");
        secretProps.add("knownHostsUri");
        secretProps.add("password");
        secretProps.add("privateKey");
        secretProps.add("privateKeyFile");
        secretProps.add("privateKeyPassphrase");
        secretProps.add("privateKeyUri");
        secretProps.add("username");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
        Set<String> prefixes = new HashSet<>(1);
        prefixes.add("scheduler.");
        MULTI_VALUE_PREFIXES = Collections.unmodifiableSet(prefixes);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "sftp".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "host", null, true, copy);
        uri = buildPathParameter(syntax, uri, "port", null, false, copy);
        uri = buildPathParameter(syntax, uri, "directoryName", null, false, copy);
        uri = buildQueryParameters(uri, copy, encode);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public Set<String> multiValuePrefixes() {
        return MULTI_VALUE_PREFIXES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

