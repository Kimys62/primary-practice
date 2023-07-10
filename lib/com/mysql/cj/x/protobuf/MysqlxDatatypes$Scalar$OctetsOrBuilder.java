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

public static interface MysqlxDatatypes.Scalar.OctetsOrBuilder
extends MessageOrBuilder {
    public boolean hasValue();

    public ByteString getValue();

    public boolean hasContentType();

    public int getContentType();
}
