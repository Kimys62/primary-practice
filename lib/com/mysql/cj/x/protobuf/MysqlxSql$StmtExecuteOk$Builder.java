/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.UnknownFieldSet
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxSql;
import java.io.IOException;

public static final class MysqlxSql.StmtExecuteOk.Builder
extends GeneratedMessageV3.Builder<MysqlxSql.StmtExecuteOk.Builder>
implements MysqlxSql.StmtExecuteOkOrBuilder {
    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Sql_StmtExecuteOk_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Sql_StmtExecuteOk_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxSql.StmtExecuteOk.class, MysqlxSql.StmtExecuteOk.Builder.class);
    }

    private MysqlxSql.StmtExecuteOk.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxSql.StmtExecuteOk.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public MysqlxSql.StmtExecuteOk.Builder clear() {
        super.clear();
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Sql_StmtExecuteOk_descriptor;
    }

    public MysqlxSql.StmtExecuteOk getDefaultInstanceForType() {
        return MysqlxSql.StmtExecuteOk.getDefaultInstance();
    }

    public MysqlxSql.StmtExecuteOk build() {
        MysqlxSql.StmtExecuteOk result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxSql.StmtExecuteOk.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxSql.StmtExecuteOk buildPartial() {
        MysqlxSql.StmtExecuteOk result = new MysqlxSql.StmtExecuteOk(this, null);
        this.onBuilt();
        return result;
    }

    public MysqlxSql.StmtExecuteOk.Builder clone() {
        return (MysqlxSql.StmtExecuteOk.Builder)super.clone();
    }

    public MysqlxSql.StmtExecuteOk.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxSql.StmtExecuteOk.Builder)super.setField(field, value);
    }

    public MysqlxSql.StmtExecuteOk.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxSql.StmtExecuteOk.Builder)super.clearField(field);
    }

    public MysqlxSql.StmtExecuteOk.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxSql.StmtExecuteOk.Builder)super.clearOneof(oneof);
    }

    public MysqlxSql.StmtExecuteOk.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxSql.StmtExecuteOk.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxSql.StmtExecuteOk.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxSql.StmtExecuteOk.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxSql.StmtExecuteOk.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxSql.StmtExecuteOk) {
            return this.mergeFrom((MysqlxSql.StmtExecuteOk)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxSql.StmtExecuteOk.Builder mergeFrom(MysqlxSql.StmtExecuteOk other) {
        if (other == MysqlxSql.StmtExecuteOk.getDefaultInstance()) {
            return this;
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public MysqlxSql.StmtExecuteOk.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxSql.StmtExecuteOk parsedMessage = null;
        try {
            parsedMessage = (MysqlxSql.StmtExecuteOk)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxSql.StmtExecuteOk)e.getUnfinishedMessage();
            throw e.unwrapIOException();
        }
        finally {
            if (parsedMessage != null) {
                this.mergeFrom(parsedMessage);
            }
        }
        return this;
    }

    public final MysqlxSql.StmtExecuteOk.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxSql.StmtExecuteOk.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxSql.StmtExecuteOk.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxSql.StmtExecuteOk.Builder)super.mergeUnknownFields(unknownFields);
    }
}
