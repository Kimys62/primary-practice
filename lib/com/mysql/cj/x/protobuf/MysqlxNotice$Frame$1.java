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
import com.mysql.cj.x.protobuf.MysqlxNotice;

static final class MysqlxNotice.Frame.1
extends AbstractParser<MysqlxNotice.Frame> {
    MysqlxNotice.Frame.1() {
    }

    public MysqlxNotice.Frame parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return new MysqlxNotice.Frame(input, extensionRegistry, null);
    }
}
