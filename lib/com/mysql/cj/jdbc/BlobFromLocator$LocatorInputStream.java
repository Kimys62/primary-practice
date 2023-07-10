/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc;

import com.mysql.cj.Messages;
import com.mysql.cj.jdbc.exceptions.SQLError;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class BlobFromLocator.LocatorInputStream
extends InputStream {
    long currentPositionInBlob = 0L;
    long length = 0L;
    PreparedStatement pStmt = null;

    BlobFromLocator.LocatorInputStream() throws SQLException {
        this.length = BlobFromLocator.this.length();
        this.pStmt = BlobFromLocator.this.createGetBytesStatement();
    }

    BlobFromLocator.LocatorInputStream(long pos, long len) throws SQLException {
        this.length = pos + len;
        this.currentPositionInBlob = pos;
        long blobLength = BlobFromLocator.this.length();
        if (pos + len > blobLength) {
            throw SQLError.createSQLException(Messages.getString("Blob.invalidStreamLength", new Object[]{blobLength, pos, len}), "S1009", BlobFromLocator.this.exceptionInterceptor);
        }
        if (pos < 1L) {
            throw SQLError.createSQLException(Messages.getString("Blob.invalidStreamPos"), "S1009", BlobFromLocator.this.exceptionInterceptor);
        }
        if (pos > blobLength) {
            throw SQLError.createSQLException(Messages.getString("Blob.invalidStreamPos"), "S1009", BlobFromLocator.this.exceptionInterceptor);
        }
    }

    @Override
    public int read() throws IOException {
        if (this.currentPositionInBlob + 1L > this.length) {
            return -1;
        }
        try {
            byte[] asBytes = BlobFromLocator.this.getBytesInternal(this.pStmt, this.currentPositionInBlob++ + 1L, 1);
            if (asBytes == null) {
                return -1;
            }
            return asBytes[0];
        }
        catch (SQLException sqlEx) {
            throw new IOException(sqlEx.toString());
        }
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        if (this.currentPositionInBlob + 1L > this.length) {
            return -1;
        }
        try {
            byte[] asBytes = BlobFromLocator.this.getBytesInternal(this.pStmt, this.currentPositionInBlob + 1L, len);
            if (asBytes == null) {
                return -1;
            }
            System.arraycopy(asBytes, 0, b, off, asBytes.length);
            this.currentPositionInBlob += (long)asBytes.length;
            return asBytes.length;
        }
        catch (SQLException sqlEx) {
            throw new IOException(sqlEx.toString());
        }
    }

    @Override
    public int read(byte[] b) throws IOException {
        if (this.currentPositionInBlob + 1L > this.length) {
            return -1;
        }
        try {
            byte[] asBytes = BlobFromLocator.this.getBytesInternal(this.pStmt, this.currentPositionInBlob + 1L, b.length);
            if (asBytes == null) {
                return -1;
            }
            System.arraycopy(asBytes, 0, b, 0, asBytes.length);
            this.currentPositionInBlob += (long)asBytes.length;
            return asBytes.length;
        }
        catch (SQLException sqlEx) {
            throw new IOException(sqlEx.toString());
        }
    }

    @Override
    public void close() throws IOException {
        if (this.pStmt != null) {
            try {
                this.pStmt.close();
            }
            catch (SQLException sqlEx) {
                throw new IOException(sqlEx.toString());
            }
        }
        super.close();
    }
}
