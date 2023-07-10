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

public static interface MysqlxNotice.GroupReplicationStateChangedOrBuilder
extends MessageOrBuilder {
    public boolean hasType();

    public int getType();

    public boolean hasViewId();

    public String getViewId();

    public ByteString getViewIdBytes();
}
