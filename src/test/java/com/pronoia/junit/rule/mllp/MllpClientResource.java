package com.pronoia.junit.rule.mllp;

import org.junit.rules.ExternalResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;

public class MllpClientResource extends ExternalResource {

    static final char START_OF_BLOCK = 0x0b;
    static final char END_OF_BLOCK = 0x1c;
    static final char END_OF_DATA = 0x0d;

    Logger log = LoggerFactory.getLogger(this.getClass());

    Socket clientSocket;
    InputStream inputStream;
    OutputStream outputStream;

    String mllpHost = "localhost";
    int mllpPort = 7777;

    boolean sendStartOfBlock = true;
    boolean sendEndOfBlock = true;
    boolean sendEndOfData = true;

    int soTimeout = 5000;
    boolean reuseAddress = false;
    boolean tcpNoDelay = true;


    public MllpClientResource(int port) {
        this.mllpPort = port;
    }

    public MllpClientResource(String host, int port) {
        this.mllpHost = host;
        this.mllpPort = port;
    }

    @Override
    protected void before() throws Throwable {
        this.connect();
        super.before();
    }

    @Override
    protected void after() {
        super.after();
        this.disconnect();
    }


    public void connect() {
        try {
            clientSocket = new Socket(mllpHost, mllpPort);

            clientSocket.setSoTimeout(soTimeout);
            clientSocket.setSoLinger(false, -1);
            clientSocket.setReuseAddress(reuseAddress);
            clientSocket.setTcpNoDelay(tcpNoDelay);

            inputStream = clientSocket.getInputStream();
            outputStream = new BufferedOutputStream(clientSocket.getOutputStream(), 2048);
        } catch (IOException e) {
            log.error("Unable to establish connection to {}:{}\n{}", mllpHost, mllpPort, e);
            throw new RuntimeException("Unable to establish Connection", e);
        }
    }

    public void disconnect() {
        try {
            if (null != inputStream) {
                clientSocket.close();
            }
        } catch (IOException e) {
            log.warn("Exception encountered closing connection to {}:{}\n{}", mllpHost, mllpPort, e);
        } finally {
            inputStream = null;
            outputStream = null;
            clientSocket = null;
        }
    }

    public boolean isConnected() {
        return clientSocket.isConnected() && !clientSocket.isClosed();
    }

    public void sendRaw(String data) {
        boolean disconnectAfterSend = false;
        this.sendRaw(data, disconnectAfterSend);
    }

    public void sendRaw(String data, boolean disconnectAfterSend) {
        byte[] payloadBytes = data.getBytes();

        try {
            outputStream.write(payloadBytes, 0, payloadBytes.length);
        } catch (IOException e) {
            log.error("Unable to send raw string", e);
            throw new RuntimeException("Unable to send raw string", e);
        }
    }

    public void sendMessage(String hl7Message) {
        boolean disconnectAfterSend = false;
        this.sendMessage(hl7Message, disconnectAfterSend);
    }

    public void sendMessage(String hl7Message, boolean disconnectAfterSend) {
        if (null == clientSocket) {
            this.connect();
        }

        if (!clientSocket.isConnected()) {
            throw new IllegalStateException("Cannot send message - client is not connected");
        }
        if (null == outputStream) {
            throw new IllegalStateException("Cannot send message - output stream is null");
        }
        byte[] payloadBytes = hl7Message.getBytes();
        try {
            if (sendStartOfBlock) {
                outputStream.write(START_OF_BLOCK);
            } else {
                log.warn("Not sending START_OF_BLOCK");
            }
            outputStream.write(payloadBytes, 0, payloadBytes.length);
            if (sendEndOfBlock) {
                outputStream.write(END_OF_BLOCK);
            } else {
                log.warn("Not sending END_OF_BLOCK");
            }
            if (sendEndOfData) {
                outputStream.write(END_OF_DATA);
            } else {
                log.warn("Not sending END_OF_DATA");
            }
            outputStream.flush();
            if (disconnectAfterSend) {
                this.disconnect();
            }
        } catch (IOException e) {
            log.error("Unable to send HL7 message", e);
            throw new RuntimeException("Unable to send HL7 message", e);
        }
    }

    public String receiveAcknowledgement() throws SocketException, SocketTimeoutException {
        return receiveAcknowledgement(soTimeout);
    }

    public String receiveAcknowledgement(int timout) throws SocketException, SocketTimeoutException {
        if (!isConnected()) {
            throw new IllegalStateException("Cannot receive acknowledgement - client is not connected");
        }
        if (null == outputStream) {
            throw new IllegalStateException("Cannot receive acknowledgement - output stream is null");
        }

        clientSocket.setSoTimeout(timout);
        StringBuilder acknowledgement = new StringBuilder();
        try {
            int firstByte = inputStream.read();
            if (START_OF_BLOCK != firstByte) {
                if ( isConnected() ) {
                    log.error("Acknowledgement did not start with START_OF_BLOCK: {}", firstByte);
                    throw new RuntimeException("Message did not start with START_OF_BLOCK");
                } else {
                    throw new RuntimeException( "Connection terminated");
                }
            }
            boolean readingMessage = true;
            while (readingMessage) {
                int nextByte = inputStream.read();
                switch (nextByte) {
                    case -1:
                        throw new RuntimeException("Reached end of stream before END_OF_BLOCK");
                    case START_OF_BLOCK:
                        throw new RuntimeException("Received START_OF_BLOCK before END_OF_BLOCK");
                    case END_OF_BLOCK:
                        if (END_OF_DATA != inputStream.read()) {
                            throw new RuntimeException("END_OF_BLOCK was not followed by END_OF_DATA");
                        }
                        readingMessage = false;
                        break;
                    default:
                        acknowledgement.append((char) nextByte);
                }
            }
        }catch (SocketTimeoutException timeoutEx) {
            log.error( "Timeout while reading acknowledgement", timeoutEx);
            throw timeoutEx;
        } catch (IOException e) {
            log.error("Unable to read HL7 acknowledgement", e);
            throw new RuntimeException("Unable to read HL7 acknowledgement", e);
        }

        return acknowledgement.toString();
    }

    public String receiveAvailableInput() throws SocketException, SocketTimeoutException {
        return receiveAvailableInput(soTimeout);
    }

    public String receiveAvailableInput(int timeout) throws SocketException, SocketTimeoutException {
        clientSocket.setSoTimeout(timeout);
        StringBuilder availableInput = new StringBuilder();

        try {
            do {
                availableInput.append((char) inputStream.read());
            } while (0 < inputStream.available());
        } catch (SocketTimeoutException timeoutEx ) {
            log.error( "Timeout while receiving available input", timeoutEx);
            throw timeoutEx;
        } catch (IOException e) {
            log.warn("Exception encountered eating available input", e);
        }

        return availableInput.toString();
    }

    public String eatAvailableInput() throws SocketException, SocketTimeoutException {
        return eatAvailableInput(soTimeout);
    }

    public String eatAvailableInput(int timeout) throws SocketException {
        clientSocket.setSoTimeout(timeout);

        StringBuilder availableInput = new StringBuilder();
        try {
            while ( 0 < inputStream.available() ) {
                availableInput.append((char) inputStream.read());
            }
        } catch (IOException e) {
            log.warn("Exception encountered eating available input", e);
        }

        return availableInput.toString();
    }

    public boolean isSendStartOfBlock() {
        return sendStartOfBlock;
    }

    public void setSendStartOfBlock(boolean sendStartOfBlock) {
        this.sendStartOfBlock = sendStartOfBlock;
    }

    public boolean isSendEndOfBlock() {
        return sendEndOfBlock;
    }

    public void setSendEndOfBlock(boolean sendEndOfBlock) {
        this.sendEndOfBlock = sendEndOfBlock;
    }

    public boolean isSendEndOfData() {
        return sendEndOfData;
    }

    public void setSendEndOfData(boolean sendEndOfData) {
        this.sendEndOfData = sendEndOfData;
    }

    public int getSoTimeout() {
        return soTimeout;
    }

    public void setSoTimeout(int soTimeout) {
        this.soTimeout = soTimeout;
    }

    public boolean isReuseAddress() {
        return reuseAddress;
    }

    public void setReuseAddress(boolean reuseAddress) {
        this.reuseAddress = reuseAddress;
    }

    public boolean isTcpNoDelay() {
        return tcpNoDelay;
    }

    public void setTcpNoDelay(boolean tcpNoDelay) {
        this.tcpNoDelay = tcpNoDelay;
    }
}