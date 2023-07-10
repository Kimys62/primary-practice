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

public static interface Mysqlx.ErrorOrBuilder
extends MessageOrBuilder {
    public boolean hasSeverity();

    public Mysqlx.Error.Severity getSeverity();

    public boolean hasCode();

    public int getCode();

    public boolean hasSqlState();

    public String getSqlState();

    public ByteString getSqlStateBytes();

    public boolean hasMsg();

    public String getMsg();

    public ByteString getMsgBytes();
}
