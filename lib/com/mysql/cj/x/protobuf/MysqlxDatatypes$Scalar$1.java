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
import com.mysql.cj.x.protobuf.MysqlxDatatypes;

static final class MysqlxDatatypes.Scalar.1
extends AbstractParser<MysqlxDatatypes.Scalar> {
    MysqlxDatatypes.Scalar.1() {
    }

    public MysqlxDatatypes.Scalar parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return new MysqlxDatatypes.Scalar(input, extensionRegistry, null);
    }
}
