/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractParser
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.InvalidProtocolBufferException
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.mysql.cj.x.protobuf.MysqlxConnection;

static final class MysqlxConnection.CapabilitiesSet.1
extends AbstractParser<MysqlxConnection.CapabilitiesSet> {
    MysqlxConnection.CapabilitiesSet.1() {
    }

    public MysqlxConnection.CapabilitiesSet parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return new MysqlxConnection.CapabilitiesSet(input, extensionRegistry, null);
    }
}
