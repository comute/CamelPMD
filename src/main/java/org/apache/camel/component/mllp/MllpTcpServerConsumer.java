/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.mllp;

import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Processor;
import org.apache.camel.component.mllp.impl.*;
import org.apache.camel.impl.DefaultConsumer;
import org.apache.camel.processor.mllp.Hl7AcknowledgementGenerator;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.LinkedList;
import java.util.List;

/**
 * The MLLP consumer.
 */
public class MllpTcpServerConsumer extends DefaultConsumer {
    private final MllpEndpoint endpoint;

    AcceptThread acceptThread;

    List<ClientSocketThread> clientThreads = new LinkedList<ClientSocketThread>();

    public MllpTcpServerConsumer(MllpEndpoint endpoint, Processor processor) {
        super(endpoint, processor);
        log.trace("MllpTcpServerConsumer(endpoint, processor)");


        this.endpoint = endpoint;

    }

    @Override
    protected void doStart() throws Exception {
        log.debug("doStart() - creating acceptor thread");

        ServerSocket serverSocket = new ServerSocket();
        serverSocket.setReceiveBufferSize(endpoint.receiveBufferSize);
        serverSocket.setReuseAddress(endpoint.reuseAddress);

        // Accept Timeout
        serverSocket.setSoTimeout(endpoint.acceptTimeout);

        InetSocketAddress socketAddress = new InetSocketAddress(endpoint.getHostname(), endpoint.getPort());
        serverSocket.bind(socketAddress, endpoint.backlog);

        acceptThread = new AcceptThread(serverSocket);
        acceptThread.start();

        super.doStart();
    }

    @Override
    protected void doStop() throws Exception {
        log.debug("doStop()");

        switch (acceptThread.getState()) {
            case NEW:
            case RUNNABLE:
            case BLOCKED:
            case WAITING:
            case TIMED_WAITING:
                acceptThread.interrupt();
                break;
            case TERMINATED:
                // This is what we hope for
                break;
        }

        acceptThread = null;

        super.doStop();
    }

    @Override
    protected void doSuspend() throws Exception {
        log.debug("doSuspend()");

        super.doSuspend();
    }

    @Override
    protected void doResume() throws Exception {
        log.debug("doResume()");

        super.doSuspend();
    }

    @Override
    protected void doShutdown() throws Exception {
        log.debug("doShutdown()");

        super.doShutdown();
    }


    /**
     * Nested Class to handle the ServerSocket.accept requests
     */
    class AcceptThread extends Thread {
        ServerSocket serverSocket;

        AcceptThread(ServerSocket serverSocket) {
            this.setName(createThreadName(serverSocket));

            this.serverSocket = serverSocket;
        }

        /**
         * Derive a thread name from the class name, the component URI and the connection information.
         * <p/>
         * The String will in the format <class name>[endpoint key] - [local socket address]
         *
         * @return String for thread name
         */
        String createThreadName(ServerSocket serverSocket) {
            // Get the classname without the package.  This is a nested class, so we want the parent class name included
            String fullClassName = this.getClass().getName();
            String className = fullClassName.substring(fullClassName.lastIndexOf('.') + 1);

            // Get the URI without options
            String fullEndpointKey = endpoint.getEndpointKey();
            String endpointKey;
            if (fullEndpointKey.contains("?")) {
                endpointKey = fullEndpointKey.substring(0, fullEndpointKey.indexOf('?'));
            } else {
                endpointKey = fullEndpointKey;
            }

            // Now put it all together
            return String.format("%s[%s] - %s", className, endpointKey, serverSocket.getLocalSocketAddress());
        }

        /**
         * The main ServerSocket.accept() loop
         * <p/>
         * NOTE:  When a connection is received, the Socket is checked after a brief delay in an attempt to determine
         * if this is a load-balancer probe.  The test is done before the ClientSocketThread is created to avoid creating
         * a large number of short lived threads, which is what can occur if the load balancer polling interval is very
         * short.
         */
        public void run() {
            log.debug("Starting acceptor thread");

            while (serverSocket.isBound() && !serverSocket.isClosed()) {
                try {
                    /* ? set this here ? */
                    // serverSocket.setSoTimeout( 10000 );
                    // TODO: Need to check maxConnections and figure out what to do when exceeded
                    Socket socket = serverSocket.accept();

                    /* Wait a bit and then check and see if the socket is really there - it could be a load balancer
                     pinging the port
                      */
                    Thread.sleep(100);
                    if (socket.isConnected() && !socket.isClosed()) {
                        log.debug("Socket appears to be there - check for available data");
                        InputStream inputStream;
                        try {
                            inputStream = socket.getInputStream();
                        } catch (IOException ioEx) {
                            // Bad Socket -
                            log.warn( "Failed to retrieve the InputStream for socket after the initial connection was acceptedf");
                            // TODO: Log something here
                            try {
                                socket.close();
                            } catch (Exception closeEx) {
                                log.warn( "Exception encountered closing socket after a failed attempt to retrieve the InputStream for socket after the initial connection was accepted");
                                // TODO: Log something here
                            }
                            continue;
                        }

                        if (0 < inputStream.available()) {
                            // Something is there - start the client thread
                            ClientSocketThread clientThread = new ClientSocketThread(socket, null);
                            clientThreads.add(clientThread);
                            clientThread.start();
                            continue;
                        }

                        // The easy check failed - so trigger a blocking read
                        socket.setSoTimeout(100);
                        try {
                            int tmpByte = inputStream.read();
                            socket.setSoTimeout(endpoint.responseTimeout);
                            if (-1 == tmpByte) {
                                log.debug("Socket.read() returned END_OF_STREAM - closing Socket");
                                socket.close();
                            } else {
                                ClientSocketThread clientThread = new ClientSocketThread(socket, tmpByte);
                                clientThreads.add(clientThread);
                                clientThread.start();
                            }
                        } catch (SocketTimeoutException timeoutEx) {
                            // No data, but the socket is there
                            log.debug("No Data - but the socket is there.  Starting ClientSocketThread");
                            ClientSocketThread clientThread = new ClientSocketThread(socket, null);
                            clientThreads.add(clientThread);
                            clientThread.start();
                        }
                    }
                } catch (SocketTimeoutException timeoutEx) {
                    // No new clients
                    log.trace("SocketTimeoutException waiting for new connections - no new connections");
                } catch (InterruptedException interruptEx) {
                    log.info("accept loop interrupted - closing ServerSocket");
                    try {
                        serverSocket.close();
                    } catch (Exception ex) {
                        log.warn("Exception encountered closing ServerSocket after InterruptedException", ex);
                    }
                } catch (Exception ex) {
                    log.error("Exception accepting new connection", ex);
                }
            }
        }

    }

    class ClientSocketThread extends Thread {
        Socket clientSocket;
        Hl7AcknowledgementGenerator acknowledgementGenerator = new Hl7AcknowledgementGenerator();

        Integer initialByte = null;

        ClientSocketThread(Socket clientSocket, Integer initialByte) throws IOException {
            this.initialByte = initialByte;
            this.setName(createThreadName(clientSocket));
            this.clientSocket = clientSocket;
            this.clientSocket.setKeepAlive(endpoint.keepAlive);
            this.clientSocket.setTcpNoDelay(endpoint.tcpNoDelay);
            this.clientSocket.setReceiveBufferSize(endpoint.receiveBufferSize);
            this.clientSocket.setSendBufferSize(endpoint.sendBufferSize);
            this.clientSocket.setReuseAddress(endpoint.reuseAddress);
            this.clientSocket.setSoLinger(false, -1);

            // Read Timeout
            this.clientSocket.setSoTimeout(endpoint.responseTimeout);

        }

        /**
         * derive a thread name from the class name, the component URI and the connection information
         * <p/>
         * The String will in the format <class name>[endpoint key] - [local socket address] -> [remote socket address]
         *
         * @return
         */
        String createThreadName(Socket socket) {
            // Get the classname without the package.  This is a nested class, so we want the parent class name included
            String fullClassName = this.getClass().getName();
            String className = fullClassName.substring(fullClassName.lastIndexOf('.') + 1);

            // Get the URI without options
            String fullEndpointKey = endpoint.getEndpointKey();
            String endpointKey;
            if (fullEndpointKey.contains("?")) {
                endpointKey = fullEndpointKey.substring(0, fullEndpointKey.indexOf('?'));
            } else {
                endpointKey = fullEndpointKey;
            }

            // Now put it all together
            return String.format("%s[%s] - %s -> %s", className, endpointKey, socket.getLocalSocketAddress(), socket.getRemoteSocketAddress());
        }

        @Override
        public void run() {

            while (clientSocket.isConnected() && !clientSocket.isClosed()) {
                // create the exchange
                Exchange exchange = endpoint.createExchange(ExchangePattern.InOut);

                byte[] hl7MessageBytes = null;
                // Send the message on for processing and wait for the response
                log.debug("Reading data ....");
                try {
                    if (null != initialByte && MllpConstants.START_OF_BLOCK == initialByte) {
                        initialByte = null;
                        hl7MessageBytes = MllpUtil.closeFrame(clientSocket);
                    } else {
                        initialByte = null;
                        MllpUtil.openFrame(clientSocket);
                        hl7MessageBytes = MllpUtil.closeFrame(clientSocket);
                    }
                } catch (MllpException mllpEx) {
                    exchange.setException(mllpEx);
                    return;
                } catch (SocketTimeoutException timeoutEx) {
                    // When thrown by openFrame, it indicates that no data was available - but no error
                    continue;
                }

                log.debug("Populating the exchange with received data");
                if (endpoint.useString) {
                    String hl7Message = new String(hl7MessageBytes, endpoint.charset);
                    exchange.getIn().setBody(hl7Message, String.class);
                } else {
                    exchange.getIn().setBody(hl7MessageBytes, byte[].class);
                }

                log.debug("Calling processor");
                try {
                    getProcessor().process(exchange);
                    // Got the response - send the acknowledgement

                    // Find the acknowledgement body
                    byte[] acknowledgementMessageBytes;
                    if (endpoint.autoAck) {
                        if (null == exchange.getException()) {
                            acknowledgementMessageBytes = acknowledgementGenerator.generateApplicationAcceptAcknowledgementMessage(hl7MessageBytes);
                        } else {
                            acknowledgementMessageBytes = acknowledgementGenerator.generateApplicationErrorAcknowledgementMessage(hl7MessageBytes);
                        }
                    } else {
                        // TODO:  Change this to use a message property (for the acknowledgement )
                        Object exchangeBody;
                        if (exchange.hasOut()) {
                            exchangeBody = exchange.getOut().getBody();
                        } else {
                            exchangeBody = exchange.getIn().getBody();
                        }
                        if (null == exchangeBody) {
                            // TODO:  Probably need to do more here
                            exchange.setException(new IllegalArgumentException("Null Exchange Body sent for acknowledgement"));
                            continue;
                        } else {
                            if (exchangeBody instanceof byte[]) {
                                acknowledgementMessageBytes = (byte[]) exchangeBody;
                            } else if (exchangeBody instanceof String) {
                                acknowledgementMessageBytes = ((String) exchangeBody).getBytes(endpoint.charset);
                            } else {
                                exchange.setException(new IllegalArgumentException("Exchange Body must be String or byte[] for acknowledgement"));
                                continue;
                            }
                        }
                    }
                    MllpUtil.writeFramedPayload(clientSocket, acknowledgementMessageBytes);
                    // TODO: Populate a header with the acknowledgement written
                } catch (Exception e) {
                    exchange.setException(e);
                }

            }

            log.info("ClientSocketThread exiting");

        }


    }
}

