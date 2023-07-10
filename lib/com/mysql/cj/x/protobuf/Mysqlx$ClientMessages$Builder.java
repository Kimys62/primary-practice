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

public static final class Mysqlx.ClientMessages.Builder
extends GeneratedMessageV3.Builder<Mysqlx.ClientMessages.Builder>
implements Mysqlx.ClientMessagesOrBuilder {
    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_ClientMessages_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_ClientMessages_fieldAccessorTable.ensureFieldAccessorsInitialized(Mysqlx.ClientMessages.class, Mysqlx.ClientMessages.Builder.class);
    }

    private Mysqlx.ClientMessages.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private Mysqlx.ClientMessages.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public Mysqlx.ClientMessages.Builder clear() {
        super.clear();
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_ClientMessages_descriptor;
    }

    public Mysqlx.ClientMessages getDefaultInstanceForType() {
        return Mysqlx.ClientMessages.getDefaultInstance();
    }

    public Mysqlx.ClientMessages build() {
        Mysqlx.ClientMessages result = this.buildPartial();
        if (!result.isInitialized()) {
            throw Mysqlx.ClientMessages.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public Mysqlx.ClientMessages buildPartial() {
        Mysqlx.ClientMessages result = new Mysqlx.ClientMessages(this, null);
        this.onBuilt();
        return result;
    }

    public Mysqlx.ClientMessages.Builder clone() {
        return (Mysqlx.ClientMessages.Builder)super.clone();
    }

    public Mysqlx.ClientMessages.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (Mysqlx.ClientMessages.Builder)super.setField(field, value);
    }

    public Mysqlx.ClientMessages.Builder clearField(Descriptors.FieldDescriptor field) {
        return (Mysqlx.ClientMessages.Builder)super.clearField(field);
    }

    public Mysqlx.ClientMessages.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (Mysqlx.ClientMessages.Builder)super.clearOneof(oneof);
    }

    public Mysqlx.ClientMessages.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (Mysqlx.ClientMessages.Builder)super.setRepeatedField(field, index, value);
    }

    public Mysqlx.ClientMessages.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (Mysqlx.ClientMessages.Builder)super.addRepeatedField(field, value);
    }

    public Mysqlx.ClientMessages.Builder mergeFrom(Message other) {
        if (other instanceof Mysqlx.ClientMessages) {
            return this.mergeFrom((Mysqlx.ClientMessages)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public Mysqlx.ClientMessages.Builder mergeFrom(Mysqlx.ClientMessages other) {
        if (other == Mysqlx.ClientMessages.getDefaultInstance()) {
            return this;
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public Mysqlx.ClientMessages.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        Mysqlx.ClientMessages parsedMessage = null;
        try {
            parsedMessage = (Mysqlx.ClientMessages)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (Mysqlx.ClientMessages)e.getUnfinishedMessage();
            throw e.unwrapIOException();
        }
        finally {
            if (parsedMessage != null) {
                this.mergeFrom(parsedMessage);
            }
        }
        return this;
    }

    public final Mysqlx.ClientMessages.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (Mysqlx.ClientMessages.Builder)super.setUnknownFields(unknownFields);
    }

    public final Mysqlx.ClientMessages.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (Mysqlx.ClientMessages.Builder)super.mergeUnknownFields(unknownFields);
    }
}
