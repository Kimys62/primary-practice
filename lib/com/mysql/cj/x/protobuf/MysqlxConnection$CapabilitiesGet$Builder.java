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

public static final class MysqlxConnection.CapabilitiesGet.Builder
extends GeneratedMessageV3.Builder<MysqlxConnection.CapabilitiesGet.Builder>
implements MysqlxConnection.CapabilitiesGetOrBuilder {
    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Connection_CapabilitiesGet_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Connection_CapabilitiesGet_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxConnection.CapabilitiesGet.class, MysqlxConnection.CapabilitiesGet.Builder.class);
    }

    private MysqlxConnection.CapabilitiesGet.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxConnection.CapabilitiesGet.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public MysqlxConnection.CapabilitiesGet.Builder clear() {
        super.clear();
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Connection_CapabilitiesGet_descriptor;
    }

    public MysqlxConnection.CapabilitiesGet getDefaultInstanceForType() {
        return MysqlxConnection.CapabilitiesGet.getDefaultInstance();
    }

    public MysqlxConnection.CapabilitiesGet build() {
        MysqlxConnection.CapabilitiesGet result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxConnection.CapabilitiesGet.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxConnection.CapabilitiesGet buildPartial() {
        MysqlxConnection.CapabilitiesGet result = new MysqlxConnection.CapabilitiesGet(this, null);
        this.onBuilt();
        return result;
    }

    public MysqlxConnection.CapabilitiesGet.Builder clone() {
        return (MysqlxConnection.CapabilitiesGet.Builder)super.clone();
    }

    public MysqlxConnection.CapabilitiesGet.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxConnection.CapabilitiesGet.Builder)super.setField(field, value);
    }

    public MysqlxConnection.CapabilitiesGet.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxConnection.CapabilitiesGet.Builder)super.clearField(field);
    }

    public MysqlxConnection.CapabilitiesGet.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxConnection.CapabilitiesGet.Builder)super.clearOneof(oneof);
    }

    public MysqlxConnection.CapabilitiesGet.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxConnection.CapabilitiesGet.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxConnection.CapabilitiesGet.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxConnection.CapabilitiesGet.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxConnection.CapabilitiesGet.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxConnection.CapabilitiesGet) {
            return this.mergeFrom((MysqlxConnection.CapabilitiesGet)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxConnection.CapabilitiesGet.Builder mergeFrom(MysqlxConnection.CapabilitiesGet other) {
        if (other == MysqlxConnection.CapabilitiesGet.getDefaultInstance()) {
            return this;
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public MysqlxConnection.CapabilitiesGet.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxConnection.CapabilitiesGet parsedMessage = null;
        try {
            parsedMessage = (MysqlxConnection.CapabilitiesGet)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxConnection.CapabilitiesGet)e.getUnfinishedMessage();
            throw e.unwrapIOException();
        }
        finally {
            if (parsedMessage != null) {
                this.mergeFrom(parsedMessage);
            }
        }
        return this;
    }

    public final MysqlxConnection.CapabilitiesGet.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxConnection.CapabilitiesGet.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxConnection.CapabilitiesGet.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxConnection.CapabilitiesGet.Builder)super.mergeUnknownFields(unknownFields);
    }
}
