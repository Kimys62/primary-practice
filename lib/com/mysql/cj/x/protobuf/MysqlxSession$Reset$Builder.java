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

public static final class MysqlxSession.Reset.Builder
extends GeneratedMessageV3.Builder<MysqlxSession.Reset.Builder>
implements MysqlxSession.ResetOrBuilder {
    private int bitField0_;
    private boolean keepOpen_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Session_Reset_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Session_Reset_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxSession.Reset.class, MysqlxSession.Reset.Builder.class);
    }

    private MysqlxSession.Reset.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxSession.Reset.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public MysqlxSession.Reset.Builder clear() {
        super.clear();
        this.keepOpen_ = false;
        this.bitField0_ &= 0xFFFFFFFE;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Session_Reset_descriptor;
    }

    public MysqlxSession.Reset getDefaultInstanceForType() {
        return MysqlxSession.Reset.getDefaultInstance();
    }

    public MysqlxSession.Reset build() {
        MysqlxSession.Reset result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxSession.Reset.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxSession.Reset buildPartial() {
        MysqlxSession.Reset result = new MysqlxSession.Reset(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            result.keepOpen_ = this.keepOpen_;
            to_bitField0_ |= 1;
        }
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxSession.Reset.Builder clone() {
        return (MysqlxSession.Reset.Builder)super.clone();
    }

    public MysqlxSession.Reset.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxSession.Reset.Builder)super.setField(field, value);
    }

    public MysqlxSession.Reset.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxSession.Reset.Builder)super.clearField(field);
    }

    public MysqlxSession.Reset.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxSession.Reset.Builder)super.clearOneof(oneof);
    }

    public MysqlxSession.Reset.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxSession.Reset.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxSession.Reset.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxSession.Reset.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxSession.Reset.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxSession.Reset) {
            return this.mergeFrom((MysqlxSession.Reset)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxSession.Reset.Builder mergeFrom(MysqlxSession.Reset other) {
        if (other == MysqlxSession.Reset.getDefaultInstance()) {
            return this;
        }
        if (other.hasKeepOpen()) {
            this.setKeepOpen(other.getKeepOpen());
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public MysqlxSession.Reset.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxSession.Reset parsedMessage = null;
        try {
            parsedMessage = (MysqlxSession.Reset)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxSession.Reset)e.getUnfinishedMessage();
            throw e.unwrapIOException();
        }
        finally {
            if (parsedMessage != null) {
                this.mergeFrom(parsedMessage);
            }
        }
        return this;
    }

    @Override
    public boolean hasKeepOpen() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public boolean getKeepOpen() {
        return this.keepOpen_;
    }

    public MysqlxSession.Reset.Builder setKeepOpen(boolean value) {
        this.bitField0_ |= 1;
        this.keepOpen_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxSession.Reset.Builder clearKeepOpen() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.keepOpen_ = false;
        this.onChanged();
        return this;
    }

    public final MysqlxSession.Reset.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxSession.Reset.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxSession.Reset.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxSession.Reset.Builder)super.mergeUnknownFields(unknownFields);
    }
}
