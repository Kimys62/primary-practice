/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.protocol;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

class NamedPipeSocketFactory.RandomAccessFileInputStream
extends InputStream {
    RandomAccessFile raFile;

    NamedPipeSocketFactory.RandomAccessFileInputStream(RandomAccessFile file) {
        this.raFile = file;
    }

    @Override
    public int available() throws IOException {
        return -1;
    }

    @Override
    public void close() throws IOException {
        this.raFile.close();
    }

    @Override
    public int read() throws IOException {
        return this.raFile.read();
    }

    @Override
    public int read(byte[] b) throws IOException {
        return this.raFile.read(b);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        return this.raFile.read(b, off, len);
    }
}
