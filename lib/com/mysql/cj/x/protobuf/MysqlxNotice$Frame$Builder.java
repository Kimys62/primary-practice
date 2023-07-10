/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
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

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxNotice;
import java.io.IOException;

public static final class MysqlxNotice.Frame.Builder
extends GeneratedMessageV3.Builder<MysqlxNotice.Frame.Builder>
implements MysqlxNotice.FrameOrBuilder {
    private int bitField0_;
    private int type_;
    private int scope_ = 1;
    private ByteString payload_ = ByteString.EMPTY;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Notice_Frame_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Notice_Frame_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxNotice.Frame.class, MysqlxNotice.Frame.Builder.class);
    }

    private MysqlxNotice.Frame.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxNotice.Frame.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public MysqlxNotice.Frame.Builder clear() {
        super.clear();
        this.type_ = 0;
        this.bitField0_ &= 0xFFFFFFFE;
        this.scope_ = 1;
        this.bitField0_ &= 0xFFFFFFFD;
        this.payload_ = ByteString.EMPTY;
        this.bitField0_ &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Notice_Frame_descriptor;
    }

    public MysqlxNotice.Frame getDefaultInstanceForType() {
        return MysqlxNotice.Frame.getDefaultInstance();
    }

    public MysqlxNotice.Frame build() {
        MysqlxNotice.Frame result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxNotice.Frame.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxNotice.Frame buildPartial() {
        MysqlxNotice.Frame result = new MysqlxNotice.Frame(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            result.type_ = this.type_;
            to_bitField0_ |= 1;
        }
        if ((from_bitField0_ & 2) != 0) {
            to_bitField0_ |= 2;
        }
        result.scope_ = this.scope_;
        if ((from_bitField0_ & 4) != 0) {
            to_bitField0_ |= 4;
        }
        result.payload_ = this.payload_;
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxNotice.Frame.Builder clone() {
        return (MysqlxNotice.Frame.Builder)super.clone();
    }

    public MysqlxNotice.Frame.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxNotice.Frame.Builder)super.setField(field, value);
    }

    public MysqlxNotice.Frame.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxNotice.Frame.Builder)super.clearField(field);
    }

    public MysqlxNotice.Frame.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxNotice.Frame.Builder)super.clearOneof(oneof);
    }

    public MysqlxNotice.Frame.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxNotice.Frame.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxNotice.Frame.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxNotice.Frame.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxNotice.Frame.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxNotice.Frame) {
            return this.mergeFrom((MysqlxNotice.Frame)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxNotice.Frame.Builder mergeFrom(MysqlxNotice.Frame other) {
        if (other == MysqlxNotice.Frame.getDefaultInstance()) {
            return this;
        }
        if (other.hasType()) {
            this.setType(other.getType());
        }
        if (other.hasScope()) {
            this.setScope(other.getScope());
        }
        if (other.hasPayload()) {
            this.setPayload(other.getPayload());
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.hasType();
    }

    public MysqlxNotice.Frame.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxNotice.Frame parsedMessage = null;
        try {
            parsedMessage = (MysqlxNotice.Frame)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxNotice.Frame)e.getUnfinishedMessage();
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
    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public int getType() {
        return this.type_;
    }

    public MysqlxNotice.Frame.Builder setType(int value) {
        this.bitField0_ |= 1;
        this.type_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxNotice.Frame.Builder clearType() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.type_ = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasScope() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public MysqlxNotice.Frame.Scope getScope() {
        MysqlxNotice.Frame.Scope result = MysqlxNotice.Frame.Scope.valueOf(this.scope_);
        return result == null ? MysqlxNotice.Frame.Scope.GLOBAL : result;
    }

    public MysqlxNotice.Frame.Builder setScope(MysqlxNotice.Frame.Scope value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 2;
        this.scope_ = value.getNumber();
        this.onChanged();
        return this;
    }

    public MysqlxNotice.Frame.Builder clearScope() {
        this.bitField0_ &= 0xFFFFFFFD;
        this.scope_ = 1;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasPayload() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override
    public ByteString getPayload() {
        return this.payload_;
    }

    public MysqlxNotice.Frame.Builder setPayload(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 4;
        this.payload_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxNotice.Frame.Builder clearPayload() {
        this.bitField0_ &= 0xFFFFFFFB;
        this.payload_ = MysqlxNotice.Frame.getDefaultInstance().getPayload();
        this.onChanged();
        return this;
    }

    public final MysqlxNotice.Frame.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxNotice.Frame.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxNotice.Frame.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxNotice.Frame.Builder)super.mergeUnknownFields(unknownFields);
    }
}
