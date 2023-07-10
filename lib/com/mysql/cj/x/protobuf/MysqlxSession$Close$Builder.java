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
import com.mysql.cj.x.protobuf.MysqlxSession;
import java.io.IOException;

public static final class MysqlxSession.Close.Builder
extends GeneratedMessageV3.Builder<MysqlxSession.Close.Builder>
implements MysqlxSession.CloseOrBuilder {
    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Session_Close_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Session_Close_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxSession.Close.class, MysqlxSession.Close.Builder.class);
    }

    private MysqlxSession.Close.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxSession.Close.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public MysqlxSession.Close.Builder clear() {
        super.clear();
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Session_Close_descriptor;
    }

    public MysqlxSession.Close getDefaultInstanceForType() {
        return MysqlxSession.Close.getDefaultInstance();
    }

    public MysqlxSession.Close build() {
        MysqlxSession.Close result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxSession.Close.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxSession.Close buildPartial() {
        MysqlxSession.Close result = new MysqlxSession.Close(this, null);
        this.onBuilt();
        return result;
    }

    public MysqlxSession.Close.Builder clone() {
        return (MysqlxSession.Close.Builder)super.clone();
    }

    public MysqlxSession.Close.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxSession.Close.Builder)super.setField(field, value);
    }

    public MysqlxSession.Close.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxSession.Close.Builder)super.clearField(field);
    }

    public MysqlxSession.Close.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxSession.Close.Builder)super.clearOneof(oneof);
    }

    public MysqlxSession.Close.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxSession.Close.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxSession.Close.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxSession.Close.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxSession.Close.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxSession.Close) {
            return this.mergeFrom((MysqlxSession.Close)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxSession.Close.Builder mergeFrom(MysqlxSession.Close other) {
        if (other == MysqlxSession.Close.getDefaultInstance()) {
            return this;
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public MysqlxSession.Close.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxSession.Close parsedMessage = null;
        try {
            parsedMessage = (MysqlxSession.Close)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxSession.Close)e.getUnfinishedMessage();
            throw e.unwrapIOException();
        }
        finally {
            if (parsedMessage != null) {
                this.mergeFrom(parsedMessage);
            }
        }
        return this;
    }

    public final MysqlxSession.Close.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxSession.Close.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxSession.Close.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxSession.Close.Builder)super.mergeUnknownFields(unknownFields);
    }
}
