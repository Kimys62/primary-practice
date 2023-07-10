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
import com.mysql.cj.x.protobuf.MysqlxDatatypes;

public static interface MysqlxDatatypes.Object.ObjectFieldOrBuilder
extends MessageOrBuilder {
    public boolean hasKey();

    public String getKey();

    public ByteString getKeyBytes();

    public boolean hasValue();

    public MysqlxDatatypes.Any getValue();

    public MysqlxDatatypes.AnyOrBuilder getValueOrBuilder();
}
