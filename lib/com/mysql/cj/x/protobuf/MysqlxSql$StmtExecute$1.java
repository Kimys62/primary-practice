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
import com.mysql.cj.x.protobuf.MysqlxSql;

static final class MysqlxSql.StmtExecute.1
extends AbstractParser<MysqlxSql.StmtExecute> {
    MysqlxSql.StmtExecute.1() {
    }

    public MysqlxSql.StmtExecute parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return new MysqlxSql.StmtExecute(input, extensionRegistry, null);
    }
}