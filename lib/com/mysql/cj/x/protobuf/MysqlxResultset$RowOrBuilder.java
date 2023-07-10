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
import java.util.List;

public static interface MysqlxResultset.RowOrBuilder
extends MessageOrBuilder {
    public List<ByteString> getFieldList();

    public int getFieldCount();

    public ByteString getField(int var1);
}
