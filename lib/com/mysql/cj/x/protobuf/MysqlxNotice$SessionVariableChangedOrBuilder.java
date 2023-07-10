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

public static interface MysqlxNotice.SessionVariableChangedOrBuilder
extends MessageOrBuilder {
    public boolean hasParam();

    public String getParam();

    public ByteString getParamBytes();

    public boolean hasValue();

    public MysqlxDatatypes.Scalar getValue();

    public MysqlxDatatypes.ScalarOrBuilder getValueOrBuilder();
}
