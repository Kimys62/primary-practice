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

public static interface MysqlxNotice.FrameOrBuilder
extends MessageOrBuilder {
    public boolean hasType();

    public int getType();

    public boolean hasScope();

    public MysqlxNotice.Frame.Scope getScope();

    public boolean hasPayload();

    public ByteString getPayload();
}
