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

public static interface MysqlxSession.AuthenticateStartOrBuilder
extends MessageOrBuilder {
    public boolean hasMechName();

    public String getMechName();

    public ByteString getMechNameBytes();

    public boolean hasAuthData();

    public ByteString getAuthData();

    public boolean hasInitialResponse();

    public ByteString getInitialResponse();
}
