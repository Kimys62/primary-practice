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

public static final class MysqlxResultset.FetchDoneMoreOutParams.Builder
extends GeneratedMessageV3.Builder<MysqlxResultset.FetchDoneMoreOutParams.Builder>
implements MysqlxResultset.FetchDoneMoreOutParamsOrBuilder {
    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Resultset_FetchDoneMoreOutParams_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Resultset_FetchDoneMoreOutParams_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxResultset.FetchDoneMoreOutParams.class, MysqlxResultset.FetchDoneMoreOutParams.Builder.class);
    }

    private MysqlxResultset.FetchDoneMoreOutParams.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxResultset.FetchDoneMoreOutParams.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public MysqlxResultset.FetchDoneMoreOutParams.Builder clear() {
        super.clear();
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Resultset_FetchDoneMoreOutParams_descriptor;
    }

    public MysqlxResultset.FetchDoneMoreOutParams getDefaultInstanceForType() {
        return MysqlxResultset.FetchDoneMoreOutParams.getDefaultInstance();
    }

    public MysqlxResultset.FetchDoneMoreOutParams build() {
        MysqlxResultset.FetchDoneMoreOutParams result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxResultset.FetchDoneMoreOutParams.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxResultset.FetchDoneMoreOutParams buildPartial() {
        MysqlxResultset.FetchDoneMoreOutParams result = new MysqlxResultset.FetchDoneMoreOutParams(this, null);
        this.onBuilt();
        return result;
    }

    public MysqlxResultset.FetchDoneMoreOutParams.Builder clone() {
        return (MysqlxResultset.FetchDoneMoreOutParams.Builder)super.clone();
    }

    public MysqlxResultset.FetchDoneMoreOutParams.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxResultset.FetchDoneMoreOutParams.Builder)super.setField(field, value);
    }

    public MysqlxResultset.FetchDoneMoreOutParams.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxResultset.FetchDoneMoreOutParams.Builder)super.clearField(field);
    }

    public MysqlxResultset.FetchDoneMoreOutParams.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxResultset.FetchDoneMoreOutParams.Builder)super.clearOneof(oneof);
    }

    public MysqlxResultset.FetchDoneMoreOutParams.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxResultset.FetchDoneMoreOutParams.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxResultset.FetchDoneMoreOutParams.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxResultset.FetchDoneMoreOutParams.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxResultset.FetchDoneMoreOutParams.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxResultset.FetchDoneMoreOutParams) {
            return this.mergeFrom((MysqlxResultset.FetchDoneMoreOutParams)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxResultset.FetchDoneMoreOutParams.Builder mergeFrom(MysqlxResultset.FetchDoneMoreOutParams other) {
        if (other == MysqlxResultset.FetchDoneMoreOutParams.getDefaultInstance()) {
            return this;
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public MysqlxResultset.FetchDoneMoreOutParams.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxResultset.FetchDoneMoreOutParams parsedMessage = null;
        try {
            parsedMessage = (MysqlxResultset.FetchDoneMoreOutParams)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxResultset.FetchDoneMoreOutParams)e.getUnfinishedMessage();
            throw e.unwrapIOException();
        }
        finally {
            if (parsedMessage != null) {
                this.mergeFrom(parsedMessage);
            }
        }
        return this;
    }

    public final MysqlxResultset.FetchDoneMoreOutParams.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxResultset.FetchDoneMoreOutParams.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxResultset.FetchDoneMoreOutParams.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxResultset.FetchDoneMoreOutParams.Builder)super.mergeUnknownFields(unknownFields);
    }
}
