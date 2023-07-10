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

public static final class MysqlxResultset.FetchDoneMoreResultsets.Builder
extends GeneratedMessageV3.Builder<MysqlxResultset.FetchDoneMoreResultsets.Builder>
implements MysqlxResultset.FetchDoneMoreResultsetsOrBuilder {
    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Resultset_FetchDoneMoreResultsets_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Resultset_FetchDoneMoreResultsets_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxResultset.FetchDoneMoreResultsets.class, MysqlxResultset.FetchDoneMoreResultsets.Builder.class);
    }

    private MysqlxResultset.FetchDoneMoreResultsets.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxResultset.FetchDoneMoreResultsets.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public MysqlxResultset.FetchDoneMoreResultsets.Builder clear() {
        super.clear();
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Resultset_FetchDoneMoreResultsets_descriptor;
    }

    public MysqlxResultset.FetchDoneMoreResultsets getDefaultInstanceForType() {
        return MysqlxResultset.FetchDoneMoreResultsets.getDefaultInstance();
    }

    public MysqlxResultset.FetchDoneMoreResultsets build() {
        MysqlxResultset.FetchDoneMoreResultsets result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxResultset.FetchDoneMoreResultsets.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxResultset.FetchDoneMoreResultsets buildPartial() {
        MysqlxResultset.FetchDoneMoreResultsets result = new MysqlxResultset.FetchDoneMoreResultsets(this, null);
        this.onBuilt();
        return result;
    }

    public MysqlxResultset.FetchDoneMoreResultsets.Builder clone() {
        return (MysqlxResultset.FetchDoneMoreResultsets.Builder)super.clone();
    }

    public MysqlxResultset.FetchDoneMoreResultsets.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxResultset.FetchDoneMoreResultsets.Builder)super.setField(field, value);
    }

    public MysqlxResultset.FetchDoneMoreResultsets.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxResultset.FetchDoneMoreResultsets.Builder)super.clearField(field);
    }

    public MysqlxResultset.FetchDoneMoreResultsets.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxResultset.FetchDoneMoreResultsets.Builder)super.clearOneof(oneof);
    }

    public MysqlxResultset.FetchDoneMoreResultsets.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxResultset.FetchDoneMoreResultsets.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxResultset.FetchDoneMoreResultsets.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxResultset.FetchDoneMoreResultsets.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxResultset.FetchDoneMoreResultsets.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxResultset.FetchDoneMoreResultsets) {
            return this.mergeFrom((MysqlxResultset.FetchDoneMoreResultsets)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxResultset.FetchDoneMoreResultsets.Builder mergeFrom(MysqlxResultset.FetchDoneMoreResultsets other) {
        if (other == MysqlxResultset.FetchDoneMoreResultsets.getDefaultInstance()) {
            return this;
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public MysqlxResultset.FetchDoneMoreResultsets.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxResultset.FetchDoneMoreResultsets parsedMessage = null;
        try {
            parsedMessage = (MysqlxResultset.FetchDoneMoreResultsets)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxResultset.FetchDoneMoreResultsets)e.getUnfinishedMessage();
            throw e.unwrapIOException();
        }
        finally {
            if (parsedMessage != null) {
                this.mergeFrom(parsedMessage);
            }
        }
        return this;
    }

    public final MysqlxResultset.FetchDoneMoreResultsets.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxResultset.FetchDoneMoreResultsets.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxResultset.FetchDoneMoreResultsets.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxResultset.FetchDoneMoreResultsets.Builder)super.mergeUnknownFields(unknownFields);
    }
}
