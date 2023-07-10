/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.protocol;

import com.mysql.cj.Messages;
import com.mysql.cj.protocol.NamedPipeSocketFactory;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

class NamedPipeSocketFactory.NamedPipeSocket
extends Socket {
    private boolean isClosed = false;
    private RandomAccessFile namedPipeFile;

    NamedPipeSocketFactory.NamedPipeSocket(String filePath, int timeout) throws IOException {
        if (filePath == null || filePath.length() == 0) {
            throw new IOException(Messages.getString("NamedPipeSocketFactory.4"));
        }
        int timeoutCountdown = timeout == 0 ? 100 : timeout;
        long startTime = System.currentTimeMillis();
        while (true) {
            try {
                this.namedPipeFile = new RandomAccessFile(filePath, "rw");
                break;
            }
            catch (FileNotFoundException e) {
                if (timeout == 0) {
                    throw new IOException("Named pipe busy error (ERROR_PIPE_BUSY).\nConsider setting a value for 'connectTimeout' or DriverManager.setLoginTimeout(int) to repeatedly try opening the named pipe before failing.", e);
                }
                if (System.currentTimeMillis() - startTime > (long)timeoutCountdown) {
                    throw e;
                }
                try {
                    TimeUnit.MILLISECONDS.sleep(10L);
                }
                catch (InterruptedException e2) {
                    throw new IOException(e2);
                }
            }
        }
    }

    @Override
    public synchronized void close() throws IOException {
        this.namedPipeFile.close();
        this.isClosed = true;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return new NamedPipeSocketFactory.RandomAccessFileInputStream(NamedPipeSocketFactory.this, this.namedPipeFile);
    }

    @Override
    public OutputStream getOutputStream() throws IOException {
        return new NamedPipeSocketFactory.RandomAccessFileOutputStream(NamedPipeSocketFactory.this, this.namedPipeFile);
    }

    @Override
    public boolean isClosed() {
        return this.isClosed;
    }

    @Override
    public void shutdownInput() throws IOException {
    }
}
