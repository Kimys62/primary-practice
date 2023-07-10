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
import com.mysql.cj.x.protobuf.MysqlxExpect;
import java.io.IOException;

public static final class MysqlxExpect.Close.Builder
extends GeneratedMessageV3.Builder<MysqlxExpect.Close.Builder>
implements MysqlxExpect.CloseOrBuilder {
    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Expect_Close_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Expect_Close_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxExpect.Close.class, MysqlxExpect.Close.Builder.class);
    }

    private MysqlxExpect.Close.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxExpect.Close.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public MysqlxExpect.Close.Builder clear() {
        super.clear();
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Expect_Close_descriptor;
    }

    public MysqlxExpect.Close getDefaultInstanceForType() {
        return MysqlxExpect.Close.getDefaultInstance();
    }

    public MysqlxExpect.Close build() {
        MysqlxExpect.Close result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxExpect.Close.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxExpect.Close buildPartial() {
        MysqlxExpect.Close result = new MysqlxExpect.Close(this, null);
        this.onBuilt();
        return result;
    }

    public MysqlxExpect.Close.Builder clone() {
        return (MysqlxExpect.Close.Builder)super.clone();
    }

    public MysqlxExpect.Close.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxExpect.Close.Builder)super.setField(field, value);
    }

    public MysqlxExpect.Close.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxExpect.Close.Builder)super.clearField(field);
    }

    public MysqlxExpect.Close.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxExpect.Close.Builder)super.clearOneof(oneof);
    }

    public MysqlxExpect.Close.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxExpect.Close.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxExpect.Close.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxExpect.Close.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxExpect.Close.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxExpect.Close) {
            return this.mergeFrom((MysqlxExpect.Close)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxExpect.Close.Builder mergeFrom(MysqlxExpect.Close other) {
        if (other == MysqlxExpect.Close.getDefaultInstance()) {
            return this;
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public MysqlxExpect.Close.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxExpect.Close parsedMessage = null;
        try {
            parsedMessage = (MysqlxExpect.Close)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxExpect.Close)e.getUnfinishedMessage();
            throw e.unwrapIOException();
        }
        finally {
            if (parsedMessage != null) {
                this.mergeFrom(parsedMessage);
            }
        }
        return this;
    }

    public final MysqlxExpect.Close.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxExpect.Close.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxExpect.Close.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxExpect.Close.Builder)super.mergeUnknownFields(unknownFields);
    }
}
