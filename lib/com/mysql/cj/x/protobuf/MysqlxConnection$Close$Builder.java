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
import com.mysql.cj.x.protobuf.MysqlxConnection;
import java.io.IOException;

public static final class MysqlxConnection.Close.Builder
extends GeneratedMessageV3.Builder<MysqlxConnection.Close.Builder>
implements MysqlxConnection.CloseOrBuilder {
    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Connection_Close_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Connection_Close_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxConnection.Close.class, MysqlxConnection.Close.Builder.class);
    }

    private MysqlxConnection.Close.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxConnection.Close.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public MysqlxConnection.Close.Builder clear() {
        super.clear();
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Connection_Close_descriptor;
    }

    public MysqlxConnection.Close getDefaultInstanceForType() {
        return MysqlxConnection.Close.getDefaultInstance();
    }

    public MysqlxConnection.Close build() {
        MysqlxConnection.Close result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxConnection.Close.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxConnection.Close buildPartial() {
        MysqlxConnection.Close result = new MysqlxConnection.Close(this, null);
        this.onBuilt();
        return result;
    }

    public MysqlxConnection.Close.Builder clone() {
        return (MysqlxConnection.Close.Builder)super.clone();
    }

    public MysqlxConnection.Close.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxConnection.Close.Builder)super.setField(field, value);
    }

    public MysqlxConnection.Close.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxConnection.Close.Builder)super.clearField(field);
    }

    public MysqlxConnection.Close.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxConnection.Close.Builder)super.clearOneof(oneof);
    }

    public MysqlxConnection.Close.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxConnection.Close.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxConnection.Close.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxConnection.Close.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxConnection.Close.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxConnection.Close) {
            return this.mergeFrom((MysqlxConnection.Close)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxConnection.Close.Builder mergeFrom(MysqlxConnection.Close other) {
        if (other == MysqlxConnection.Close.getDefaultInstance()) {
            return this;
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public MysqlxConnection.Close.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxConnection.Close parsedMessage = null;
        try {
            parsedMessage = (MysqlxConnection.Close)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxConnection.Close)e.getUnfinishedMessage();
            throw e.unwrapIOException();
        }
        finally {
            if (parsedMessage != null) {
                this.mergeFrom(parsedMessage);
            }
        }
        return this;
    }

    public final MysqlxConnection.Close.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxConnection.Close.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxConnection.Close.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxConnection.Close.Builder)super.mergeUnknownFields(unknownFields);
    }
}
