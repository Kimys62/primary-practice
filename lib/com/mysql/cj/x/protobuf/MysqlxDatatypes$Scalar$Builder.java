/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$BuilderParent
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
 *  com.google.protobuf.SingleFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import java.io.IOException;

public static final class MysqlxDatatypes.Scalar.Builder
extends GeneratedMessageV3.Builder<MysqlxDatatypes.Scalar.Builder>
implements MysqlxDatatypes.ScalarOrBuilder {
    private int bitField0_;
    private int type_ = 1;
    private long vSignedInt_;
    private long vUnsignedInt_;
    private MysqlxDatatypes.Scalar.Octets vOctets_;
    private SingleFieldBuilderV3<MysqlxDatatypes.Scalar.Octets, MysqlxDatatypes.Scalar.Octets.Builder, MysqlxDatatypes.Scalar.OctetsOrBuilder> vOctetsBuilder_;
    private double vDouble_;
    private float vFloat_;
    private boolean vBool_;
    private MysqlxDatatypes.Scalar.String vString_;
    private SingleFieldBuilderV3<MysqlxDatatypes.Scalar.String, MysqlxDatatypes.Scalar.String.Builder, MysqlxDatatypes.Scalar.StringOrBuilder> vStringBuilder_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Datatypes_Scalar_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Datatypes_Scalar_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxDatatypes.Scalar.class, MysqlxDatatypes.Scalar.Builder.class);
    }

    private MysqlxDatatypes.Scalar.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxDatatypes.Scalar.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            this.getVOctetsFieldBuilder();
            this.getVStringFieldBuilder();
        }
    }

    public MysqlxDatatypes.Scalar.Builder clear() {
        super.clear();
        this.type_ = 1;
        this.bitField0_ &= 0xFFFFFFFE;
        this.vSignedInt_ = 0L;
        this.bitField0_ &= 0xFFFFFFFD;
        this.vUnsignedInt_ = 0L;
        this.bitField0_ &= 0xFFFFFFFB;
        if (this.vOctetsBuilder_ == null) {
            this.vOctets_ = null;
        } else {
            this.vOctetsBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFF7;
        this.vDouble_ = 0.0;
        this.bitField0_ &= 0xFFFFFFEF;
        this.vFloat_ = 0.0f;
        this.bitField0_ &= 0xFFFFFFDF;
        this.vBool_ = false;
        this.bitField0_ &= 0xFFFFFFBF;
        if (this.vStringBuilder_ == null) {
            this.vString_ = null;
        } else {
            this.vStringBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFF7F;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Datatypes_Scalar_descriptor;
    }

    public MysqlxDatatypes.Scalar getDefaultInstanceForType() {
        return MysqlxDatatypes.Scalar.getDefaultInstance();
    }

    public MysqlxDatatypes.Scalar build() {
        MysqlxDatatypes.Scalar result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxDatatypes.Scalar.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxDatatypes.Scalar buildPartial() {
        MysqlxDatatypes.Scalar result = new MysqlxDatatypes.Scalar(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            to_bitField0_ |= 1;
        }
        result.type_ = this.type_;
        if ((from_bitField0_ & 2) != 0) {
            result.vSignedInt_ = this.vSignedInt_;
            to_bitField0_ |= 2;
        }
        if ((from_bitField0_ & 4) != 0) {
            result.vUnsignedInt_ = this.vUnsignedInt_;
            to_bitField0_ |= 4;
        }
        if ((from_bitField0_ & 8) != 0) {
            if (this.vOctetsBuilder_ == null) {
                result.vOctets_ = this.vOctets_;
            } else {
                result.vOctets_ = (MysqlxDatatypes.Scalar.Octets)this.vOctetsBuilder_.build();
            }
            to_bitField0_ |= 8;
        }
        if ((from_bitField0_ & 0x10) != 0) {
            result.vDouble_ = this.vDouble_;
            to_bitField0_ |= 0x10;
        }
        if ((from_bitField0_ & 0x20) != 0) {
            result.vFloat_ = this.vFloat_;
            to_bitField0_ |= 0x20;
        }
        if ((from_bitField0_ & 0x40) != 0) {
            result.vBool_ = this.vBool_;
            to_bitField0_ |= 0x40;
        }
        if ((from_bitField0_ & 0x80) != 0) {
            if (this.vStringBuilder_ == null) {
                result.vString_ = this.vString_;
            } else {
                result.vString_ = (MysqlxDatatypes.Scalar.String)this.vStringBuilder_.build();
            }
            to_bitField0_ |= 0x80;
        }
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxDatatypes.Scalar.Builder clone() {
        return (MysqlxDatatypes.Scalar.Builder)super.clone();
    }

    public MysqlxDatatypes.Scalar.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxDatatypes.Scalar.Builder)super.setField(field, value);
    }

    public MysqlxDatatypes.Scalar.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxDatatypes.Scalar.Builder)super.clearField(field);
    }

    public MysqlxDatatypes.Scalar.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxDatatypes.Scalar.Builder)super.clearOneof(oneof);
    }

    public MysqlxDatatypes.Scalar.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxDatatypes.Scalar.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxDatatypes.Scalar.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxDatatypes.Scalar.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxDatatypes.Scalar.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxDatatypes.Scalar) {
            return this.mergeFrom((MysqlxDatatypes.Scalar)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxDatatypes.Scalar.Builder mergeFrom(MysqlxDatatypes.Scalar other) {
        if (other == MysqlxDatatypes.Scalar.getDefaultInstance()) {
            return this;
        }
        if (other.hasType()) {
            this.setType(other.getType());
        }
        if (other.hasVSignedInt()) {
            this.setVSignedInt(other.getVSignedInt());
        }
        if (other.hasVUnsignedInt()) {
            this.setVUnsignedInt(other.getVUnsignedInt());
        }
        if (other.hasVOctets()) {
            this.mergeVOctets(other.getVOctets());
        }
        if (other.hasVDouble()) {
            this.setVDouble(other.getVDouble());
        }
        if (other.hasVFloat()) {
            this.setVFloat(other.getVFloat());
        }
        if (other.hasVBool()) {
            this.setVBool(other.getVBool());
        }
        if (other.hasVString()) {
            this.mergeVString(other.getVString());
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.hasType()) {
            return false;
        }
        if (this.hasVOctets() && !this.getVOctets().isInitialized()) {
            return false;
        }
        return !this.hasVString() || this.getVString().isInitialized();
    }

    public MysqlxDatatypes.Scalar.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxDatatypes.Scalar parsedMessage = null;
        try {
            parsedMessage = (MysqlxDatatypes.Scalar)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxDatatypes.Scalar)e.getUnfinishedMessage();
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
    public MysqlxDatatypes.Scalar.Type getType() {
        MysqlxDatatypes.Scalar.Type result = MysqlxDatatypes.Scalar.Type.valueOf(this.type_);
        return result == null ? MysqlxDatatypes.Scalar.Type.V_SINT : result;
    }

    public MysqlxDatatypes.Scalar.Builder setType(MysqlxDatatypes.Scalar.Type value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.type_ = value.getNumber();
        this.onChanged();
        return this;
    }

    public MysqlxDatatypes.Scalar.Builder clearType() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.type_ = 1;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasVSignedInt() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public long getVSignedInt() {
        return this.vSignedInt_;
    }

    public MysqlxDatatypes.Scalar.Builder setVSignedInt(long value) {
        this.bitField0_ |= 2;
        this.vSignedInt_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxDatatypes.Scalar.Builder clearVSignedInt() {
        this.bitField0_ &= 0xFFFFFFFD;
        this.vSignedInt_ = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasVUnsignedInt() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override
    public long getVUnsignedInt() {
        return this.vUnsignedInt_;
    }

    public MysqlxDatatypes.Scalar.Builder setVUnsignedInt(long value) {
        this.bitField0_ |= 4;
        this.vUnsignedInt_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxDatatypes.Scalar.Builder clearVUnsignedInt() {
        this.bitField0_ &= 0xFFFFFFFB;
        this.vUnsignedInt_ = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasVOctets() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override
    public MysqlxDatatypes.Scalar.Octets getVOctets() {
        if (this.vOctetsBuilder_ == null) {
            return this.vOctets_ == null ? MysqlxDatatypes.Scalar.Octets.getDefaultInstance() : this.vOctets_;
        }
        return (MysqlxDatatypes.Scalar.Octets)this.vOctetsBuilder_.getMessage();
    }

    public MysqlxDatatypes.Scalar.Builder setVOctets(MysqlxDatatypes.Scalar.Octets value) {
        if (this.vOctetsBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.vOctets_ = value;
            this.onChanged();
        } else {
            this.vOctetsBuilder_.setMessage((AbstractMessage)value);
        }
        this.bitField0_ |= 8;
        return this;
    }

    public MysqlxDatatypes.Scalar.Builder setVOctets(MysqlxDatatypes.Scalar.Octets.Builder builderForValue) {
        if (this.vOctetsBuilder_ == null) {
            this.vOctets_ = builderForValue.build();
            this.onChanged();
        } else {
            this.vOctetsBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 8;
        return this;
    }

    public MysqlxDatatypes.Scalar.Builder mergeVOctets(MysqlxDatatypes.Scalar.Octets value) {
        if (this.vOctetsBuilder_ == null) {
            this.vOctets_ = (this.bitField0_ & 8) != 0 && this.vOctets_ != null && this.vOctets_ != MysqlxDatatypes.Scalar.Octets.getDefaultInstance() ? MysqlxDatatypes.Scalar.Octets.newBuilder(this.vOctets_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.vOctetsBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 8;
        return this;
    }

    public MysqlxDatatypes.Scalar.Builder clearVOctets() {
        if (this.vOctetsBuilder_ == null) {
            this.vOctets_ = null;
            this.onChanged();
        } else {
            this.vOctetsBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFF7;
        return this;
    }

    public MysqlxDatatypes.Scalar.Octets.Builder getVOctetsBuilder() {
        this.bitField0_ |= 8;
        this.onChanged();
        return (MysqlxDatatypes.Scalar.Octets.Builder)this.getVOctetsFieldBuilder().getBuilder();
    }

    @Override
    public MysqlxDatatypes.Scalar.OctetsOrBuilder getVOctetsOrBuilder() {
        if (this.vOctetsBuilder_ != null) {
            return (MysqlxDatatypes.Scalar.OctetsOrBuilder)this.vOctetsBuilder_.getMessageOrBuilder();
        }
        return this.vOctets_ == null ? MysqlxDatatypes.Scalar.Octets.getDefaultInstance() : this.vOctets_;
    }

    private SingleFieldBuilderV3<MysqlxDatatypes.Scalar.Octets, MysqlxDatatypes.Scalar.Octets.Builder, MysqlxDatatypes.Scalar.OctetsOrBuilder> getVOctetsFieldBuilder() {
        if (this.vOctetsBuilder_ == null) {
            this.vOctetsBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getVOctets(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.vOctets_ = null;
        }
        return this.vOctetsBuilder_;
    }

    @Override
    public boolean hasVDouble() {
        return (this.bitField0_ & 0x10) != 0;
    }

    @Override
    public double getVDouble() {
        return this.vDouble_;
    }

    public MysqlxDatatypes.Scalar.Builder setVDouble(double value) {
        this.bitField0_ |= 0x10;
        this.vDouble_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxDatatypes.Scalar.Builder clearVDouble() {
        this.bitField0_ &= 0xFFFFFFEF;
        this.vDouble_ = 0.0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasVFloat() {
        return (this.bitField0_ & 0x20) != 0;
    }

    @Override
    public float getVFloat() {
        return this.vFloat_;
    }

    public MysqlxDatatypes.Scalar.Builder setVFloat(float value) {
        this.bitField0_ |= 0x20;
        this.vFloat_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxDatatypes.Scalar.Builder clearVFloat() {
        this.bitField0_ &= 0xFFFFFFDF;
        this.vFloat_ = 0.0f;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasVBool() {
        return (this.bitField0_ & 0x40) != 0;
    }

    @Override
    public boolean getVBool() {
        return this.vBool_;
    }

    public MysqlxDatatypes.Scalar.Builder setVBool(boolean value) {
        this.bitField0_ |= 0x40;
        this.vBool_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxDatatypes.Scalar.Builder clearVBool() {
        this.bitField0_ &= 0xFFFFFFBF;
        this.vBool_ = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasVString() {
        return (this.bitField0_ & 0x80) != 0;
    }

    @Override
    public MysqlxDatatypes.Scalar.String getVString() {
        if (this.vStringBuilder_ == null) {
            return this.vString_ == null ? MysqlxDatatypes.Scalar.String.getDefaultInstance() : this.vString_;
        }
        return (MysqlxDatatypes.Scalar.String)this.vStringBuilder_.getMessage();
    }

    public MysqlxDatatypes.Scalar.Builder setVString(MysqlxDatatypes.Scalar.String value) {
        if (this.vStringBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.vString_ = value;
            this.onChanged();
        } else {
            this.vStringBuilder_.setMessage((AbstractMessage)value);
        }
        this.bitField0_ |= 0x80;
        return this;
    }

    public MysqlxDatatypes.Scalar.Builder setVString(MysqlxDatatypes.Scalar.String.Builder builderForValue) {
        if (this.vStringBuilder_ == null) {
            this.vString_ = builderForValue.build();
            this.onChanged();
        } else {
            this.vStringBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 0x80;
        return this;
    }

    public MysqlxDatatypes.Scalar.Builder mergeVString(MysqlxDatatypes.Scalar.String value) {
        if (this.vStringBuilder_ == null) {
            this.vString_ = (this.bitField0_ & 0x80) != 0 && this.vString_ != null && this.vString_ != MysqlxDatatypes.Scalar.String.getDefaultInstance() ? MysqlxDatatypes.Scalar.String.newBuilder(this.vString_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.vStringBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 0x80;
        return this;
    }

    public MysqlxDatatypes.Scalar.Builder clearVString() {
        if (this.vStringBuilder_ == null) {
            this.vString_ = null;
            this.onChanged();
        } else {
            this.vStringBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFF7F;
        return this;
    }

    public MysqlxDatatypes.Scalar.String.Builder getVStringBuilder() {
        this.bitField0_ |= 0x80;
        this.onChanged();
        return (MysqlxDatatypes.Scalar.String.Builder)this.getVStringFieldBuilder().getBuilder();
    }

    @Override
    public MysqlxDatatypes.Scalar.StringOrBuilder getVStringOrBuilder() {
        if (this.vStringBuilder_ != null) {
            return (MysqlxDatatypes.Scalar.StringOrBuilder)this.vStringBuilder_.getMessageOrBuilder();
        }
        return this.vString_ == null ? MysqlxDatatypes.Scalar.String.getDefaultInstance() : this.vString_;
    }

    private SingleFieldBuilderV3<MysqlxDatatypes.Scalar.String, MysqlxDatatypes.Scalar.String.Builder, MysqlxDatatypes.Scalar.StringOrBuilder> getVStringFieldBuilder() {
        if (this.vStringBuilder_ == null) {
            this.vStringBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getVString(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.vString_ = null;
        }
        return this.vStringBuilder_;
    }

    public final MysqlxDatatypes.Scalar.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxDatatypes.Scalar.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxDatatypes.Scalar.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxDatatypes.Scalar.Builder)super.mergeUnknownFields(unknownFields);
    }
}
