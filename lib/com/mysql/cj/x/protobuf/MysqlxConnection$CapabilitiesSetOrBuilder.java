/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageOrBuilder
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.MessageOrBuilder;
import com.mysql.cj.x.protobuf.MysqlxConnection;

public static interface MysqlxConnection.CapabilitiesSetOrBuilder
extends MessageOrBuilder {
    public boolean hasCapabilities();

    public MysqlxConnection.Capabilities getCapabilities();

    public MysqlxConnection.CapabilitiesOrBuilder getCapabilitiesOrBuilder();
}
