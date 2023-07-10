/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageOrBuilder
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.mysql.cj.x.protobuf.Mysqlx;

public static interface MysqlxConnection.CompressionOrBuilder
extends MessageOrBuilder {
    public boolean hasUncompressedSize();

    public long getUncompressedSize();

    public boolean hasServerMessages();

    public Mysqlx.ServerMessages.Type getServerMessages();

    public boolean hasClientMessages();

    public Mysqlx.ClientMessages.Type getClientMessages();

    public boolean hasPayload();

    public ByteString getPayload();
}
