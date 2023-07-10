/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.protocol;

import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;

class NamedPipeSocketFactory.RandomAccessFileOutputStream
extends OutputStream {
    RandomAccessFile raFile;

    NamedPipeSocketFactory.RandomAccessFileOutputStream(RandomAccessFile file) {
        this.raFile = file;
    }

    @Override
    public void close() throws IOException {
        this.raFile.close();
    }

    @Override
    public void write(byte[] b) throws IOException {
        this.raFile.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        this.raFile.write(b, off, len);
    }

    @Override
    public void write(int b) throws IOException {
    }
}
