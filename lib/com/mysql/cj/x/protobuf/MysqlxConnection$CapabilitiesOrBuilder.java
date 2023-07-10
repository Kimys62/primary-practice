/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageOrBuilder
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.MessageOrBuilder;
import com.mysql.cj.x.protobuf.MysqlxConnection;
import java.util.List;

public static interface MysqlxConnection.CapabilitiesOrBuilder
extends MessageOrBuilder {
    public List<MysqlxConnection.Capability> getCapabilitiesList();

    public MysqlxConnection.Capability getCapabilities(int var1);

    public int getCapabilitiesCount();

    public List<? extends MysqlxConnection.CapabilityOrBuilder> getCapabilitiesOrBuilderList();

    public MysqlxConnection.CapabilityOrBuilder getCapabilitiesOrBuilder(int var1);
}
