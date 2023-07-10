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
import com.mysql.cj.x.protobuf.MysqlxExpr;

public static interface MysqlxExpr.DocumentPathItemOrBuilder
extends MessageOrBuilder {
    public boolean hasType();

    public MysqlxExpr.DocumentPathItem.Type getType();

    public boolean hasValue();

    public String getValue();

    public ByteString getValueBytes();

    public boolean hasIndex();

    public int getIndex();
}
