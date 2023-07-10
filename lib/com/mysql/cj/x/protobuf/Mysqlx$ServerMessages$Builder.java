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
import com.mysql.cj.x.protobuf.Mysqlx;
import java.io.IOException;

public static final class Mysqlx.ServerMessages.Builder
extends GeneratedMessageV3.Builder<Mysqlx.ServerMessages.Builder>
implements Mysqlx.ServerMessagesOrBuilder {
    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_ServerMessages_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_ServerMessages_fieldAccessorTable.ensureFieldAccessorsInitialized(Mysqlx.ServerMessages.class, Mysqlx.ServerMessages.Builder.class);
    }

    private Mysqlx.ServerMessages.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private Mysqlx.ServerMessages.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public Mysqlx.ServerMessages.Builder clear() {
        super.clear();
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_ServerMessages_descriptor;
    }

    public Mysqlx.ServerMessages getDefaultInstanceForType() {
        return Mysqlx.ServerMessages.getDefaultInstance();
    }

    public Mysqlx.ServerMessages build() {
        Mysqlx.ServerMessages result = this.buildPartial();
        if (!result.isInitialized()) {
            throw Mysqlx.ServerMessages.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public Mysqlx.ServerMessages buildPartial() {
        Mysqlx.ServerMessages result = new Mysqlx.ServerMessages(this, null);
        this.onBuilt();
        return result;
    }

    public Mysqlx.ServerMessages.Builder clone() {
        return (Mysqlx.ServerMessages.Builder)super.clone();
    }

    public Mysqlx.ServerMessages.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (Mysqlx.ServerMessages.Builder)super.setField(field, value);
    }

    public Mysqlx.ServerMessages.Builder clearField(Descriptors.FieldDescriptor field) {
        return (Mysqlx.ServerMessages.Builder)super.clearField(field);
    }

    public Mysqlx.ServerMessages.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (Mysqlx.ServerMessages.Builder)super.clearOneof(oneof);
    }

    public Mysqlx.ServerMessages.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (Mysqlx.ServerMessages.Builder)super.setRepeatedField(field, index, value);
    }

    public Mysqlx.ServerMessages.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (Mysqlx.ServerMessages.Builder)super.addRepeatedField(field, value);
    }

    public Mysqlx.ServerMessages.Builder mergeFrom(Message other) {
        if (other instanceof Mysqlx.ServerMessages) {
            return this.mergeFrom((Mysqlx.ServerMessages)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public Mysqlx.ServerMessages.Builder mergeFrom(Mysqlx.ServerMessages other) {
        if (other == Mysqlx.ServerMessages.getDefaultInstance()) {
            return this;
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public Mysqlx.ServerMessages.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        Mysqlx.ServerMessages parsedMessage = null;
        try {
            parsedMessage = (Mysqlx.ServerMessages)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (Mysqlx.ServerMessages)e.getUnfinishedMessage();
            throw e.unwrapIOException();
        }
        finally {
            if (parsedMessage != null) {
                this.mergeFrom(parsedMessage);
            }
        }
        return this;
    }

    public final Mysqlx.ServerMessages.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (Mysqlx.ServerMessages.Builder)super.setUnknownFields(unknownFields);
    }

    public final Mysqlx.ServerMessages.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (Mysqlx.ServerMessages.Builder)super.mergeUnknownFields(unknownFields);
    }
}
