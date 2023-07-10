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
import com.mysql.cj.x.protobuf.MysqlxNotice;
import java.io.IOException;

public static final class MysqlxNotice.ServerHello.Builder
extends GeneratedMessageV3.Builder<MysqlxNotice.ServerHello.Builder>
implements MysqlxNotice.ServerHelloOrBuilder {
    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Notice_ServerHello_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Notice_ServerHello_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxNotice.ServerHello.class, MysqlxNotice.ServerHello.Builder.class);
    }

    private MysqlxNotice.ServerHello.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxNotice.ServerHello.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public MysqlxNotice.ServerHello.Builder clear() {
        super.clear();
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Notice_ServerHello_descriptor;
    }

    public MysqlxNotice.ServerHello getDefaultInstanceForType() {
        return MysqlxNotice.ServerHello.getDefaultInstance();
    }

    public MysqlxNotice.ServerHello build() {
        MysqlxNotice.ServerHello result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxNotice.ServerHello.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxNotice.ServerHello buildPartial() {
        MysqlxNotice.ServerHello result = new MysqlxNotice.ServerHello(this, null);
        this.onBuilt();
        return result;
    }

    public MysqlxNotice.ServerHello.Builder clone() {
        return (MysqlxNotice.ServerHello.Builder)super.clone();
    }

    public MysqlxNotice.ServerHello.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxNotice.ServerHello.Builder)super.setField(field, value);
    }

    public MysqlxNotice.ServerHello.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxNotice.ServerHello.Builder)super.clearField(field);
    }

    public MysqlxNotice.ServerHello.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxNotice.ServerHello.Builder)super.clearOneof(oneof);
    }

    public MysqlxNotice.ServerHello.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxNotice.ServerHello.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxNotice.ServerHello.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxNotice.ServerHello.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxNotice.ServerHello.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxNotice.ServerHello) {
            return this.mergeFrom((MysqlxNotice.ServerHello)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxNotice.ServerHello.Builder mergeFrom(MysqlxNotice.ServerHello other) {
        if (other == MysqlxNotice.ServerHello.getDefaultInstance()) {
            return this;
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public MysqlxNotice.ServerHello.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxNotice.ServerHello parsedMessage = null;
        try {
            parsedMessage = (MysqlxNotice.ServerHello)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxNotice.ServerHello)e.getUnfinishedMessage();
            throw e.unwrapIOException();
        }
        finally {
            if (parsedMessage != null) {
                this.mergeFrom(parsedMessage);
            }
        }
        return this;
    }

    public final MysqlxNotice.ServerHello.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxNotice.ServerHello.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxNotice.ServerHello.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxNotice.ServerHello.Builder)super.mergeUnknownFields(unknownFields);
    }
}
