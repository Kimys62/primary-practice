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
import com.mysql.cj.x.protobuf.MysqlxResultset;
import java.io.IOException;

public static final class MysqlxResultset.FetchDone.Builder
extends GeneratedMessageV3.Builder<MysqlxResultset.FetchDone.Builder>
implements MysqlxResultset.FetchDoneOrBuilder {
    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Resultset_FetchDone_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Resultset_FetchDone_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxResultset.FetchDone.class, MysqlxResultset.FetchDone.Builder.class);
    }

    private MysqlxResultset.FetchDone.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxResultset.FetchDone.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public MysqlxResultset.FetchDone.Builder clear() {
        super.clear();
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Resultset_FetchDone_descriptor;
    }

    public MysqlxResultset.FetchDone getDefaultInstanceForType() {
        return MysqlxResultset.FetchDone.getDefaultInstance();
    }

    public MysqlxResultset.FetchDone build() {
        MysqlxResultset.FetchDone result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxResultset.FetchDone.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxResultset.FetchDone buildPartial() {
        MysqlxResultset.FetchDone result = new MysqlxResultset.FetchDone(this, null);
        this.onBuilt();
        return result;
    }

    public MysqlxResultset.FetchDone.Builder clone() {
        return (MysqlxResultset.FetchDone.Builder)super.clone();
    }

    public MysqlxResultset.FetchDone.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxResultset.FetchDone.Builder)super.setField(field, value);
    }

    public MysqlxResultset.FetchDone.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxResultset.FetchDone.Builder)super.clearField(field);
    }

    public MysqlxResultset.FetchDone.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxResultset.FetchDone.Builder)super.clearOneof(oneof);
    }

    public MysqlxResultset.FetchDone.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxResultset.FetchDone.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxResultset.FetchDone.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxResultset.FetchDone.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxResultset.FetchDone.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxResultset.FetchDone) {
            return this.mergeFrom((MysqlxResultset.FetchDone)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxResultset.FetchDone.Builder mergeFrom(MysqlxResultset.FetchDone other) {
        if (other == MysqlxResultset.FetchDone.getDefaultInstance()) {
            return this;
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public MysqlxResultset.FetchDone.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxResultset.FetchDone parsedMessage = null;
        try {
            parsedMessage = (MysqlxResultset.FetchDone)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxResultset.FetchDone)e.getUnfinishedMessage();
            throw e.unwrapIOException();
        }
        finally {
            if (parsedMessage != null) {
                this.mergeFrom(parsedMessage);
            }
        }
        return this;
    }

    public final MysqlxResultset.FetchDone.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxResultset.FetchDone.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxResultset.FetchDone.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxResultset.FetchDone.Builder)super.mergeUnknownFields(unknownFields);
    }
}
