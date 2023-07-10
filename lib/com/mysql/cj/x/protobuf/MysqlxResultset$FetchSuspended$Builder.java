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

public static final class MysqlxResultset.FetchSuspended.Builder
extends GeneratedMessageV3.Builder<MysqlxResultset.FetchSuspended.Builder>
implements MysqlxResultset.FetchSuspendedOrBuilder {
    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Resultset_FetchSuspended_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Resultset_FetchSuspended_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxResultset.FetchSuspended.class, MysqlxResultset.FetchSuspended.Builder.class);
    }

    private MysqlxResultset.FetchSuspended.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxResultset.FetchSuspended.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public MysqlxResultset.FetchSuspended.Builder clear() {
        super.clear();
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Resultset_FetchSuspended_descriptor;
    }

    public MysqlxResultset.FetchSuspended getDefaultInstanceForType() {
        return MysqlxResultset.FetchSuspended.getDefaultInstance();
    }

    public MysqlxResultset.FetchSuspended build() {
        MysqlxResultset.FetchSuspended result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxResultset.FetchSuspended.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxResultset.FetchSuspended buildPartial() {
        MysqlxResultset.FetchSuspended result = new MysqlxResultset.FetchSuspended(this, null);
        this.onBuilt();
        return result;
    }

    public MysqlxResultset.FetchSuspended.Builder clone() {
        return (MysqlxResultset.FetchSuspended.Builder)super.clone();
    }

    public MysqlxResultset.FetchSuspended.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxResultset.FetchSuspended.Builder)super.setField(field, value);
    }

    public MysqlxResultset.FetchSuspended.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxResultset.FetchSuspended.Builder)super.clearField(field);
    }

    public MysqlxResultset.FetchSuspended.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxResultset.FetchSuspended.Builder)super.clearOneof(oneof);
    }

    public MysqlxResultset.FetchSuspended.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxResultset.FetchSuspended.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxResultset.FetchSuspended.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxResultset.FetchSuspended.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxResultset.FetchSuspended.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxResultset.FetchSuspended) {
            return this.mergeFrom((MysqlxResultset.FetchSuspended)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxResultset.FetchSuspended.Builder mergeFrom(MysqlxResultset.FetchSuspended other) {
        if (other == MysqlxResultset.FetchSuspended.getDefaultInstance()) {
            return this;
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public MysqlxResultset.FetchSuspended.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxResultset.FetchSuspended parsedMessage = null;
        try {
            parsedMessage = (MysqlxResultset.FetchSuspended)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxResultset.FetchSuspended)e.getUnfinishedMessage();
            throw e.unwrapIOException();
        }
        finally {
            if (parsedMessage != null) {
                this.mergeFrom(parsedMessage);
            }
        }
        return this;
    }

    public final MysqlxResultset.FetchSuspended.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxResultset.FetchSuspended.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxResultset.FetchSuspended.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxResultset.FetchSuspended.Builder)super.mergeUnknownFields(unknownFields);
    }
}
