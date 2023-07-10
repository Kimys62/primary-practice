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
import com.mysql.cj.x.protobuf.MysqlxNotice;

public static interface MysqlxNotice.WarningOrBuilder
extends MessageOrBuilder {
    public boolean hasLevel();

    public MysqlxNotice.Warning.Level getLevel();

    public boolean hasCode();

    public int getCode();

    public boolean hasMsg();

    public String getMsg();

    public ByteString getMsgBytes();
}
