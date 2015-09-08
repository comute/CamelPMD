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
package org.apache.camel.component.netty4;

import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoop;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.apache.camel.CamelContext;
import org.apache.camel.CamelException;
import org.apache.camel.support.ServiceSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A {@link NettyServerBootstrapFactory} which is used by a single consumer (not shared).
 */
public class ClientModeTCPNettyServerBootstrapFactory extends ServiceSupport implements NettyServerBootstrapFactory {

    protected static final Logger LOG = LoggerFactory.getLogger(ClientModeTCPNettyServerBootstrapFactory.class);
    
    private CamelContext camelContext;
    private ThreadFactory threadFactory;
    private NettyServerBootstrapConfiguration configuration;
    private ChannelInitializer<Channel> pipelineFactory;
    private Bootstrap clientBootstrap;
    private Channel channel;
    private EventLoopGroup workerGroup;

    public ClientModeTCPNettyServerBootstrapFactory() {
    }

    public void init(CamelContext camelContext, NettyServerBootstrapConfiguration configuration, ChannelInitializer<Channel> pipelineFactory) {
        this.camelContext = camelContext;
        this.configuration = configuration;
        this.pipelineFactory = pipelineFactory;
    }

    public void init(ThreadFactory threadFactory, NettyServerBootstrapConfiguration configuration, ChannelInitializer<Channel> pipelineFactory) {
        this.threadFactory = threadFactory;
        this.configuration = configuration;
        this.pipelineFactory = pipelineFactory;
    }

    public void addChannel(Channel channel) {
        // we don't need to track the channel in client mode
    }

    public void removeChannel(Channel channel) {
        // we don't need to track the channel in client mode
    }

    public void addConsumer(NettyConsumer consumer) {
        // does not allow sharing
    }

    public void removeConsumer(NettyConsumer consumer) {
        // does not allow sharing
    }

    @Override
    protected void doStart() throws Exception {
        if (camelContext == null && threadFactory == null) {
            throw new IllegalArgumentException("Either CamelContext or ThreadFactory must be set on " + this);
        }
        startServerBootstrap();
    }

    @Override
    protected void doStop() throws Exception {
        stopServerBootstrap();
    }

    @Override
    protected void doResume() throws Exception {
        LOG.debug("ClientModeServerBootstrap connect to {}:{}", configuration.getHost(), configuration.getPort());
        ChannelFuture connectFuture = clientBootstrap.connect(new InetSocketAddress(configuration.getHost(), configuration.getPort()));
        channel = openChannel(connectFuture);
    }

    @Override
    protected void doSuspend() throws Exception {
        if (channel != null) {
            LOG.debug("ClientModeServerBootstrap unbinding from {}:{}", configuration.getHost(), configuration.getPort());
            channel.close().sync();
            channel = null;
        }
    }

    protected void startServerBootstrap() throws Exception {
        // prefer using explicit configured thread pools
        
        EventLoopGroup wg = configuration.getWorkerGroup();

        if (wg == null) {
            // create new pool which we should shutdown when stopping as its not shared
            workerGroup = new NettyWorkerPoolBuilder()
                    .withWorkerCount(configuration.getWorkerCount())
                    .withName("NettyServerTCPWorker")
                    .build();
            wg = workerGroup;
        }
        
        clientBootstrap = new Bootstrap();
        clientBootstrap.channel(NioSocketChannel.class);
        clientBootstrap.group(wg);
        clientBootstrap.option(ChannelOption.SO_KEEPALIVE, configuration.isKeepAlive());
        clientBootstrap.option(ChannelOption.TCP_NODELAY, configuration.isTcpNoDelay());
        clientBootstrap.option(ChannelOption.SO_REUSEADDR, configuration.isReuseAddress());
        clientBootstrap.option(ChannelOption.CONNECT_TIMEOUT_MILLIS, configuration.getConnectTimeout());

        
        LOG.debug("Created ClientBootstrap {}", clientBootstrap);
        clientBootstrap.handler(pipelineFactory);
        ChannelFuture channelFuture = clientBootstrap.connect(new InetSocketAddress(configuration.getHost(), configuration.getPort()));
        if (LOG.isDebugEnabled()) {
            LOG.debug("Created new TCP client bootstrap connecting to {}:{} with options: {}",
                    new Object[]{configuration.getHost(), configuration.getPort(), clientBootstrap});
        }
        LOG.info("ClientModeServerBootstrap binding to {}:{}", configuration.getHost(), configuration.getPort());
        channel = openChannel(channelFuture);
    }

    protected void stopServerBootstrap() {
        // close all channels
        LOG.info("ClientModeServerBootstrap unbinding from {}:{}", configuration.getHost(), configuration.getPort());
        
        if (workerGroup != null) {
            workerGroup.shutdownGracefully();
            workerGroup = null;
        }
    }

    protected void doReconnectIfNeeded() throws Exception {
        if (channel == null || !channel.isActive()) {
            LOG.debug("ClientModeServerBootstrap re-connect to {}:{}", configuration.getHost(), configuration.getPort());
            ChannelFuture connectFuture = clientBootstrap.connect(new InetSocketAddress(configuration.getHost(), configuration.getPort()));
            channel = openChannel(connectFuture);
        }
    }

    protected Channel openChannel(final ChannelFuture channelFuture) throws Exception {
        // blocking for channel to be done
        if (LOG.isTraceEnabled()) {
            LOG.trace("Waiting for operation to complete {} for {} millis", channelFuture, configuration.getConnectTimeout());
        }
        // here we need to wait it in other thread
        final CountDownLatch channelLatch = new CountDownLatch(1);
        channelFuture.addListener(new ChannelFutureListener() {
            @Override
            public void operationComplete(ChannelFuture cf) throws Exception {
                channelLatch.countDown();
            }
        });

        try {
            channelLatch.await(configuration.getConnectTimeout(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException ex) {
            throw new CamelException("Interrupted while waiting for " + "connection to " + configuration.getAddress());
        }

        if (!channelFuture.isDone() || !channelFuture.isSuccess()) {
            //check if reconnect is enabled and schedule a reconnect, if from handler then dont schedule a reconnect
            if (configuration.isReconnect()) {
                final EventLoop loop = channelFuture.channel().eventLoop();
                loop.schedule(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            LOG.trace("Re-connecting to {} if needed", configuration.getAddress());
                            doReconnectIfNeeded();
                        } catch (Exception e) {
                            LOG.warn("Error during re-connect to " + configuration.getAddress() + ". Will attempt again in "
                                    + configuration.getReconnectInterval() + " millis. This exception is ignored.", e);
                        }
                    }
                }, configuration.getReconnectInterval(), TimeUnit.MILLISECONDS);
            } else {
                ConnectException cause = new ConnectException("Cannot connect to " + configuration.getAddress());
                if (channelFuture.cause() != null) {
                    cause.initCause(channelFuture.cause());
                }
                throw cause;
            }
        }
        Channel answer = channelFuture.channel();

        if (LOG.isDebugEnabled()) {
            LOG.debug("Creating connector to address: {}", configuration.getAddress());
        }
        return answer;
    }

}
