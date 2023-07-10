/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractParser
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$EnumDescriptor
 *  com.google.protobuf.Descriptors$EnumValueDescriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.GeneratedMessageV3$UnusedPrivateParameter
 *  com.google.protobuf.Internal
 *  com.google.protobuf.Internal$EnumLiteMap
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageOrBuilder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.ProtocolMessageEnum
 *  com.google.protobuf.SingleFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public static final class MysqlxDatatypes.Scalar
extends GeneratedMessageV3
implements MysqlxDatatypes.ScalarOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    public static final int V_SIGNED_INT_FIELD_NUMBER = 2;
    private long vSignedInt_;
    public static final int V_UNSIGNED_INT_FIELD_NUMBER = 3;
    private long vUnsignedInt_;
    public static final int V_OCTETS_FIELD_NUMBER = 5;
    private Octets vOctets_;
    public static final int V_DOUBLE_FIELD_NUMBER = 6;
    private double vDouble_;
    public static final int V_FLOAT_FIELD_NUMBER = 7;
    private float vFloat_;
    public static final int V_BOOL_FIELD_NUMBER = 8;
    private boolean vBool_;
    public static final int V_STRING_FIELD_NUMBER = 9;
    private String vString_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxDatatypes.Scalar DEFAULT_INSTANCE = new MysqlxDatatypes.Scalar();
    @Deprecated
    public static final Parser<MysqlxDatatypes.Scalar> PARSER = new AbstractParser<MysqlxDatatypes.Scalar>(){

        public MysqlxDatatypes.Scalar parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxDatatypes.Scalar(input, extensionRegistry);
        }
    };

    private MysqlxDatatypes.Scalar(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxDatatypes.Scalar() {
        this.type_ = 1;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxDatatypes.Scalar();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxDatatypes.Scalar(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
        }
        boolean mutable_bitField0_ = false;
        UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
        try {
            boolean done = false;
            block17: while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0: {
                        done = true;
                        continue block17;
                    }
                    case 8: {
                        int rawValue = input.readEnum();
                        Type value = Type.valueOf(rawValue);
                        if (value == null) {
                            unknownFields.mergeVarintField(1, rawValue);
                            continue block17;
                        }
                        this.bitField0_ |= 1;
                        this.type_ = rawValue;
                        continue block17;
                    }
                    case 16: {
                        this.bitField0_ |= 2;
                        this.vSignedInt_ = input.readSInt64();
                        continue block17;
                    }
                    case 24: {
                        this.bitField0_ |= 4;
                        this.vUnsignedInt_ = input.readUInt64();
                        continue block17;
                    }
                    case 42: {
                        Octets.Builder subBuilder = null;
                        if ((this.bitField0_ & 8) != 0) {
                            subBuilder = this.vOctets_.toBuilder();
                        }
                        this.vOctets_ = (Octets)input.readMessage(Octets.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.vOctets_);
                            this.vOctets_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 8;
                        continue block17;
                    }
                    case 49: {
                        this.bitField0_ |= 0x10;
                        this.vDouble_ = input.readDouble();
                        continue block17;
                    }
                    case 61: {
                        this.bitField0_ |= 0x20;
                        this.vFloat_ = input.readFloat();
                        continue block17;
                    }
                    case 64: {
                        this.bitField0_ |= 0x40;
                        this.vBool_ = input.readBool();
                        continue block17;
                    }
                    case 74: {
                        String.Builder subBuilder = null;
                        if ((this.bitField0_ & 0x80) != 0) {
                            subBuilder = this.vString_.toBuilder();
                        }
                        this.vString_ = (String)input.readMessage(String.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.vString_);
                            this.vString_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 0x80;
                        continue block17;
                    }
                }
                if (this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) continue;
                done = true;
            }
        }
        catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException e) {
            throw new InvalidProtocolBufferException(e).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            this.unknownFields = unknownFields.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Datatypes_Scalar_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Datatypes_Scalar_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxDatatypes.Scalar.class, Builder.class);
    }

    @Override
    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public Type getType() {
        Type result = Type.valueOf(this.type_);
        return result == null ? Type.V_SINT : result;
    }

    @Override
    public boolean hasVSignedInt() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public long getVSignedInt() {
        return this.vSignedInt_;
    }

    @Override
    public boolean hasVUnsignedInt() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override
    public long getVUnsignedInt() {
        return this.vUnsignedInt_;
    }

    @Override
    public boolean hasVOctets() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override
    public Octets getVOctets() {
        return this.vOctets_ == null ? Octets.getDefaultInstance() : this.vOctets_;
    }

    @Override
    public OctetsOrBuilder getVOctetsOrBuilder() {
        return this.vOctets_ == null ? Octets.getDefaultInstance() : this.vOctets_;
    }

    @Override
    public boolean hasVDouble() {
        return (this.bitField0_ & 0x10) != 0;
    }

    @Override
    public double getVDouble() {
        return this.vDouble_;
    }

    @Override
    public boolean hasVFloat() {
        return (this.bitField0_ & 0x20) != 0;
    }

    @Override
    public float getVFloat() {
        return this.vFloat_;
    }

    @Override
    public boolean hasVBool() {
        return (this.bitField0_ & 0x40) != 0;
    }

    @Override
    public boolean getVBool() {
        return this.vBool_;
    }

    @Override
    public boolean hasVString() {
        return (this.bitField0_ & 0x80) != 0;
    }

    @Override
    public String getVString() {
        return this.vString_ == null ? String.getDefaultInstance() : this.vString_;
    }

    @Override
    public StringOrBuilder getVStringOrBuilder() {
        return this.vString_ == null ? String.getDefaultInstance() : this.vString_;
    }

    public final boolean isInitialized() {
        byte isInitialized = this.memoizedIsInitialized;
        if (isInitialized == 1) {
            return true;
        }
        if (isInitialized == 0) {
            return false;
        }
        if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (this.hasVOctets() && !this.getVOctets().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (this.hasVString() && !this.getVString().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.type_);
        }
        if ((this.bitField0_ & 2) != 0) {
            output.writeSInt64(2, this.vSignedInt_);
        }
        if ((this.bitField0_ & 4) != 0) {
            output.writeUInt64(3, this.vUnsignedInt_);
        }
        if ((this.bitField0_ & 8) != 0) {
            output.writeMessage(5, (MessageLite)this.getVOctets());
        }
        if ((this.bitField0_ & 0x10) != 0) {
            output.writeDouble(6, this.vDouble_);
        }
        if ((this.bitField0_ & 0x20) != 0) {
            output.writeFloat(7, this.vFloat_);
        }
        if ((this.bitField0_ & 0x40) != 0) {
            output.writeBool(8, this.vBool_);
        }
        if ((this.bitField0_ & 0x80) != 0) {
            output.writeMessage(9, (MessageLite)this.getVString());
        }
        this.unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
        int size = this.memoizedSize;
        if (size != -1) {
            return size;
        }
        size = 0;
        if ((this.bitField0_ & 1) != 0) {
            size += CodedOutputStream.computeEnumSize((int)1, (int)this.type_);
        }
        if ((this.bitField0_ & 2) != 0) {
            size += CodedOutputStream.computeSInt64Size((int)2, (long)this.vSignedInt_);
        }
        if ((this.bitField0_ & 4) != 0) {
            size += CodedOutputStream.computeUInt64Size((int)3, (long)this.vUnsignedInt_);
        }
        if ((this.bitField0_ & 8) != 0) {
            size += CodedOutputStream.computeMessageSize((int)5, (MessageLite)this.getVOctets());
        }
        if ((this.bitField0_ & 0x10) != 0) {
            size += CodedOutputStream.computeDoubleSize((int)6, (double)this.vDouble_);
        }
        if ((this.bitField0_ & 0x20) != 0) {
            size += CodedOutputStream.computeFloatSize((int)7, (float)this.vFloat_);
        }
        if ((this.bitField0_ & 0x40) != 0) {
            size += CodedOutputStream.computeBoolSize((int)8, (boolean)this.vBool_);
        }
        if ((this.bitField0_ & 0x80) != 0) {
            size += CodedOutputStream.computeMessageSize((int)9, (MessageLite)this.getVString());
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxDatatypes.Scalar)) {
            return super.equals(obj);
        }
        MysqlxDatatypes.Scalar other = (MysqlxDatatypes.Scalar)obj;
        if (this.hasType() != other.hasType()) {
            return false;
        }
        if (this.hasType() && this.type_ != other.type_) {
            return false;
        }
        if (this.hasVSignedInt() != other.hasVSignedInt()) {
            return false;
        }
        if (this.hasVSignedInt() && this.getVSignedInt() != other.getVSignedInt()) {
            return false;
        }
        if (this.hasVUnsignedInt() != other.hasVUnsignedInt()) {
            return false;
        }
        if (this.hasVUnsignedInt() && this.getVUnsignedInt() != other.getVUnsignedInt()) {
            return false;
        }
        if (this.hasVOctets() != other.hasVOctets()) {
            return false;
        }
        if (this.hasVOctets() && !this.getVOctets().equals(other.getVOctets())) {
            return false;
        }
        if (this.hasVDouble() != other.hasVDouble()) {
            return false;
        }
        if (this.hasVDouble() && Double.doubleToLongBits(this.getVDouble()) != Double.doubleToLongBits(other.getVDouble())) {
            return false;
        }
        if (this.hasVFloat() != other.hasVFloat()) {
            return false;
        }
        if (this.hasVFloat() && Float.floatToIntBits(this.getVFloat()) != Float.floatToIntBits(other.getVFloat())) {
            return false;
        }
        if (this.hasVBool() != other.hasVBool()) {
            return false;
        }
        if (this.hasVBool() && this.getVBool() != other.getVBool()) {
            return false;
        }
        if (this.hasVString() != other.hasVString()) {
            return false;
        }
        if (this.hasVString() && !this.getVString().equals(other.getVString())) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxDatatypes.Scalar.getDescriptor().hashCode();
        if (this.hasType()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.type_;
        }
        if (this.hasVSignedInt()) {
            hash = 37 * hash + 2;
            hash = 53 * hash + Internal.hashLong((long)this.getVSignedInt());
        }
        if (this.hasVUnsignedInt()) {
            hash = 37 * hash + 3;
            hash = 53 * hash + Internal.hashLong((long)this.getVUnsignedInt());
        }
        if (this.hasVOctets()) {
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getVOctets().hashCode();
        }
        if (this.hasVDouble()) {
            hash = 37 * hash + 6;
            hash = 53 * hash + Internal.hashLong((long)Double.doubleToLongBits(this.getVDouble()));
        }
        if (this.hasVFloat()) {
            hash = 37 * hash + 7;
            hash = 53 * hash + Float.floatToIntBits(this.getVFloat());
        }
        if (this.hasVBool()) {
            hash = 37 * hash + 8;
            hash = 53 * hash + Internal.hashBoolean((boolean)this.getVBool());
        }
        if (this.hasVString()) {
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getVString().hashCode();
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxDatatypes.Scalar parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxDatatypes.Scalar)PARSER.parseFrom(data);
    }

    public static MysqlxDatatypes.Scalar parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxDatatypes.Scalar)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxDatatypes.Scalar parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxDatatypes.Scalar)PARSER.parseFrom(data);
    }

    public static MysqlxDatatypes.Scalar parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxDatatypes.Scalar)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxDatatypes.Scalar parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxDatatypes.Scalar)PARSER.parseFrom(data);
    }

    public static MysqlxDatatypes.Scalar parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxDatatypes.Scalar)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxDatatypes.Scalar parseFrom(InputStream input) throws IOException {
        return (MysqlxDatatypes.Scalar)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxDatatypes.Scalar parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxDatatypes.Scalar)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxDatatypes.Scalar parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxDatatypes.Scalar)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxDatatypes.Scalar parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxDatatypes.Scalar)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxDatatypes.Scalar parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxDatatypes.Scalar)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxDatatypes.Scalar parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxDatatypes.Scalar)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxDatatypes.Scalar.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxDatatypes.Scalar prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxDatatypes.Scalar getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxDatatypes.Scalar> parser() {
        return PARSER;
    }

    public Parser<MysqlxDatatypes.Scalar> getParserForType() {
        return PARSER;
    }

    public MysqlxDatatypes.Scalar getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxDatatypes.ScalarOrBuilder {
        private int bitField0_;
        private int type_ = 1;
        private long vSignedInt_;
        private long vUnsignedInt_;
        private Octets vOctets_;
        private SingleFieldBuilderV3<Octets, Octets.Builder, OctetsOrBuilder> vOctetsBuilder_;
        private double vDouble_;
        private float vFloat_;
        private boolean vBool_;
        private String vString_;
        private SingleFieldBuilderV3<String, String.Builder, StringOrBuilder> vStringBuilder_;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Datatypes_Scalar_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Datatypes_Scalar_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxDatatypes.Scalar.class, Builder.class);
        }

        private Builder() {
            this.maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (alwaysUseFieldBuilders) {
                this.getVOctetsFieldBuilder();
                this.getVStringFieldBuilder();
            }
        }

        public Builder clear() {
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
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxDatatypes.Scalar buildPartial() {
            MysqlxDatatypes.Scalar result = new MysqlxDatatypes.Scalar(this);
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
                    result.vOctets_ = (Octets)this.vOctetsBuilder_.build();
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
                    result.vString_ = (String)this.vStringBuilder_.build();
                }
                to_bitField0_ |= 0x80;
            }
            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
        }

        public Builder clone() {
            return (Builder)super.clone();
        }

        public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
        }

        public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
        }

        public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
        }

        public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
        }

        public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
        }

        public Builder mergeFrom(Message other) {
            if (other instanceof MysqlxDatatypes.Scalar) {
                return this.mergeFrom((MysqlxDatatypes.Scalar)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxDatatypes.Scalar other) {
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

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
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
        public Type getType() {
            Type result = Type.valueOf(this.type_);
            return result == null ? Type.V_SINT : result;
        }

        public Builder setType(Type value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 1;
            this.type_ = value.getNumber();
            this.onChanged();
            return this;
        }

        public Builder clearType() {
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

        public Builder setVSignedInt(long value) {
            this.bitField0_ |= 2;
            this.vSignedInt_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearVSignedInt() {
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

        public Builder setVUnsignedInt(long value) {
            this.bitField0_ |= 4;
            this.vUnsignedInt_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearVUnsignedInt() {
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
        public Octets getVOctets() {
            if (this.vOctetsBuilder_ == null) {
                return this.vOctets_ == null ? Octets.getDefaultInstance() : this.vOctets_;
            }
            return (Octets)this.vOctetsBuilder_.getMessage();
        }

        public Builder setVOctets(Octets value) {
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

        public Builder setVOctets(Octets.Builder builderForValue) {
            if (this.vOctetsBuilder_ == null) {
                this.vOctets_ = builderForValue.build();
                this.onChanged();
            } else {
                this.vOctetsBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 8;
            return this;
        }

        public Builder mergeVOctets(Octets value) {
            if (this.vOctetsBuilder_ == null) {
                this.vOctets_ = (this.bitField0_ & 8) != 0 && this.vOctets_ != null && this.vOctets_ != Octets.getDefaultInstance() ? Octets.newBuilder(this.vOctets_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.vOctetsBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 8;
            return this;
        }

        public Builder clearVOctets() {
            if (this.vOctetsBuilder_ == null) {
                this.vOctets_ = null;
                this.onChanged();
            } else {
                this.vOctetsBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFF7;
            return this;
        }

        public Octets.Builder getVOctetsBuilder() {
            this.bitField0_ |= 8;
            this.onChanged();
            return (Octets.Builder)this.getVOctetsFieldBuilder().getBuilder();
        }

        @Override
        public OctetsOrBuilder getVOctetsOrBuilder() {
            if (this.vOctetsBuilder_ != null) {
                return (OctetsOrBuilder)this.vOctetsBuilder_.getMessageOrBuilder();
            }
            return this.vOctets_ == null ? Octets.getDefaultInstance() : this.vOctets_;
        }

        private SingleFieldBuilderV3<Octets, Octets.Builder, OctetsOrBuilder> getVOctetsFieldBuilder() {
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

        public Builder setVDouble(double value) {
            this.bitField0_ |= 0x10;
            this.vDouble_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearVDouble() {
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

        public Builder setVFloat(float value) {
            this.bitField0_ |= 0x20;
            this.vFloat_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearVFloat() {
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

        public Builder setVBool(boolean value) {
            this.bitField0_ |= 0x40;
            this.vBool_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearVBool() {
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
        public String getVString() {
            if (this.vStringBuilder_ == null) {
                return this.vString_ == null ? String.getDefaultInstance() : this.vString_;
            }
            return (String)this.vStringBuilder_.getMessage();
        }

        public Builder setVString(String value) {
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

        public Builder setVString(String.Builder builderForValue) {
            if (this.vStringBuilder_ == null) {
                this.vString_ = builderForValue.build();
                this.onChanged();
            } else {
                this.vStringBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 0x80;
            return this;
        }

        public Builder mergeVString(String value) {
            if (this.vStringBuilder_ == null) {
                this.vString_ = (this.bitField0_ & 0x80) != 0 && this.vString_ != null && this.vString_ != String.getDefaultInstance() ? String.newBuilder(this.vString_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.vStringBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 0x80;
            return this;
        }

        public Builder clearVString() {
            if (this.vStringBuilder_ == null) {
                this.vString_ = null;
                this.onChanged();
            } else {
                this.vStringBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFF7F;
            return this;
        }

        public String.Builder getVStringBuilder() {
            this.bitField0_ |= 0x80;
            this.onChanged();
            return (String.Builder)this.getVStringFieldBuilder().getBuilder();
        }

        @Override
        public StringOrBuilder getVStringOrBuilder() {
            if (this.vStringBuilder_ != null) {
                return (StringOrBuilder)this.vStringBuilder_.getMessageOrBuilder();
            }
            return this.vString_ == null ? String.getDefaultInstance() : this.vString_;
        }

        private SingleFieldBuilderV3<String, String.Builder, StringOrBuilder> getVStringFieldBuilder() {
            if (this.vStringBuilder_ == null) {
                this.vStringBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getVString(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.vString_ = null;
            }
            return this.vStringBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
        }
    }

    public static final class Octets
    extends GeneratedMessageV3
    implements OctetsOrBuilder {
        private static final long serialVersionUID = 0L;
        private int bitField0_;
        public static final int VALUE_FIELD_NUMBER = 1;
        private ByteString value_;
        public static final int CONTENT_TYPE_FIELD_NUMBER = 2;
        private int contentType_;
        private byte memoizedIsInitialized = (byte)-1;
        private static final Octets DEFAULT_INSTANCE = new Octets();
        @Deprecated
        public static final Parser<Octets> PARSER = new AbstractParser<Octets>(){

            public Octets parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new Octets(input, extensionRegistry);
            }
        };

        private Octets(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private Octets() {
            this.value_ = ByteString.EMPTY;
        }

        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
            return new Octets();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Octets(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            boolean mutable_bitField0_ = false;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                block11: while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue block11;
                        }
                        case 10: {
                            this.bitField0_ |= 1;
                            this.value_ = input.readBytes();
                            continue block11;
                        }
                        case 16: {
                            this.bitField0_ |= 2;
                            this.contentType_ = input.readUInt32();
                            continue block11;
                        }
                    }
                    if (this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) continue;
                    done = true;
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage((MessageLite)this);
            }
            catch (IOException e) {
                throw new InvalidProtocolBufferException(e).setUnfinishedMessage((MessageLite)this);
            }
            finally {
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Datatypes_Scalar_Octets_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Datatypes_Scalar_Octets_fieldAccessorTable.ensureFieldAccessorsInitialized(Octets.class, Builder.class);
        }

        @Override
        public boolean hasValue() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public ByteString getValue() {
            return this.value_;
        }

        @Override
        public boolean hasContentType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public int getContentType() {
            return this.contentType_;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            if (!this.hasValue()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                output.writeBytes(1, this.value_);
            }
            if ((this.bitField0_ & 2) != 0) {
                output.writeUInt32(2, this.contentType_);
            }
            this.unknownFields.writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
                size += CodedOutputStream.computeBytesSize((int)1, (ByteString)this.value_);
            }
            if ((this.bitField0_ & 2) != 0) {
                size += CodedOutputStream.computeUInt32Size((int)2, (int)this.contentType_);
            }
            this.memoizedSize = size += this.unknownFields.getSerializedSize();
            return size;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Octets)) {
                return super.equals(obj);
            }
            Octets other = (Octets)obj;
            if (this.hasValue() != other.hasValue()) {
                return false;
            }
            if (this.hasValue() && !this.getValue().equals((Object)other.getValue())) {
                return false;
            }
            if (this.hasContentType() != other.hasContentType()) {
                return false;
            }
            if (this.hasContentType() && this.getContentType() != other.getContentType()) {
                return false;
            }
            return this.unknownFields.equals((Object)other.unknownFields);
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + Octets.getDescriptor().hashCode();
            if (this.hasValue()) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getValue().hashCode();
            }
            if (this.hasContentType()) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getContentType();
            }
            this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
            return hash;
        }

        public static Octets parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (Octets)PARSER.parseFrom(data);
        }

        public static Octets parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Octets)PARSER.parseFrom(data, extensionRegistry);
        }

        public static Octets parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (Octets)PARSER.parseFrom(data);
        }

        public static Octets parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Octets)PARSER.parseFrom(data, extensionRegistry);
        }

        public static Octets parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (Octets)PARSER.parseFrom(data);
        }

        public static Octets parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Octets)PARSER.parseFrom(data, extensionRegistry);
        }

        public static Octets parseFrom(InputStream input) throws IOException {
            return (Octets)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
        }

        public static Octets parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Octets)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
        }

        public static Octets parseDelimitedFrom(InputStream input) throws IOException {
            return (Octets)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
        }

        public static Octets parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Octets)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
        }

        public static Octets parseFrom(CodedInputStream input) throws IOException {
            return (Octets)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
        }

        public static Octets parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Octets)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
        }

        public Builder newBuilderForType() {
            return Octets.newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Octets prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static Octets getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Octets> parser() {
            return PARSER;
        }

        public Parser<Octets> getParserForType() {
            return PARSER;
        }

        public Octets getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder
        extends GeneratedMessageV3.Builder<Builder>
        implements OctetsOrBuilder {
            private int bitField0_;
            private ByteString value_ = ByteString.EMPTY;
            private int contentType_;

            public static final Descriptors.Descriptor getDescriptor() {
                return internal_static_Mysqlx_Datatypes_Scalar_Octets_descriptor;
            }

            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return internal_static_Mysqlx_Datatypes_Scalar_Octets_fieldAccessorTable.ensureFieldAccessorsInitialized(Octets.class, Builder.class);
            }

            private Builder() {
                this.maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (alwaysUseFieldBuilders) {
                    // empty if block
                }
            }

            public Builder clear() {
                super.clear();
                this.value_ = ByteString.EMPTY;
                this.bitField0_ &= 0xFFFFFFFE;
                this.contentType_ = 0;
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return internal_static_Mysqlx_Datatypes_Scalar_Octets_descriptor;
            }

            public Octets getDefaultInstanceForType() {
                return Octets.getDefaultInstance();
            }

            public Octets build() {
                Octets result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw Builder.newUninitializedMessageException((Message)result);
                }
                return result;
            }

            public Octets buildPartial() {
                Octets result = new Octets(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 1) != 0) {
                    to_bitField0_ |= 1;
                }
                result.value_ = this.value_;
                if ((from_bitField0_ & 2) != 0) {
                    result.contentType_ = this.contentType_;
                    to_bitField0_ |= 2;
                }
                result.bitField0_ = to_bitField0_;
                this.onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder)super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (Builder)super.setField(field, value);
            }

            public Builder clearField(Descriptors.FieldDescriptor field) {
                return (Builder)super.clearField(field);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (Builder)super.clearOneof(oneof);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (Builder)super.setRepeatedField(field, index, value);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (Builder)super.addRepeatedField(field, value);
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof Octets) {
                    return this.mergeFrom((Octets)other);
                }
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(Octets other) {
                if (other == Octets.getDefaultInstance()) {
                    return this;
                }
                if (other.hasValue()) {
                    this.setValue(other.getValue());
                }
                if (other.hasContentType()) {
                    this.setContentType(other.getContentType());
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return this.hasValue();
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                Octets parsedMessage = null;
                try {
                    parsedMessage = (Octets)PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (Octets)e.getUnfinishedMessage();
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
            public boolean hasValue() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override
            public ByteString getValue() {
                return this.value_;
            }

            public Builder setValue(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 1;
                this.value_ = value;
                this.onChanged();
                return this;
            }

            public Builder clearValue() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.value_ = Octets.getDefaultInstance().getValue();
                this.onChanged();
                return this;
            }

            @Override
            public boolean hasContentType() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override
            public int getContentType() {
                return this.contentType_;
            }

            public Builder setContentType(int value) {
                this.bitField0_ |= 2;
                this.contentType_ = value;
                this.onChanged();
                return this;
            }

            public Builder clearContentType() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.contentType_ = 0;
                this.onChanged();
                return this;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (Builder)super.setUnknownFields(unknownFields);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (Builder)super.mergeUnknownFields(unknownFields);
            }
        }
    }

    public static interface OctetsOrBuilder
    extends MessageOrBuilder {
        public boolean hasValue();

        public ByteString getValue();

        public boolean hasContentType();

        public int getContentType();
    }

    public static final class String
    extends GeneratedMessageV3
    implements StringOrBuilder {
        private static final long serialVersionUID = 0L;
        private int bitField0_;
        public static final int VALUE_FIELD_NUMBER = 1;
        private ByteString value_;
        public static final int COLLATION_FIELD_NUMBER = 2;
        private long collation_;
        private byte memoizedIsInitialized = (byte)-1;
        private static final String DEFAULT_INSTANCE = new String();
        @Deprecated
        public static final Parser<String> PARSER = new AbstractParser<String>(){

            public String parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new String(input, extensionRegistry);
            }
        };

        private String(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private String() {
            this.value_ = ByteString.EMPTY;
        }

        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
            return new String();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private String(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            boolean mutable_bitField0_ = false;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                block11: while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue block11;
                        }
                        case 10: {
                            this.bitField0_ |= 1;
                            this.value_ = input.readBytes();
                            continue block11;
                        }
                        case 16: {
                            this.bitField0_ |= 2;
                            this.collation_ = input.readUInt64();
                            continue block11;
                        }
                    }
                    if (this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) continue;
                    done = true;
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage((MessageLite)this);
            }
            catch (IOException e) {
                throw new InvalidProtocolBufferException(e).setUnfinishedMessage((MessageLite)this);
            }
            finally {
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Datatypes_Scalar_String_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Datatypes_Scalar_String_fieldAccessorTable.ensureFieldAccessorsInitialized(String.class, Builder.class);
        }

        @Override
        public boolean hasValue() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public ByteString getValue() {
            return this.value_;
        }

        @Override
        public boolean hasCollation() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public long getCollation() {
            return this.collation_;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            if (!this.hasValue()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                output.writeBytes(1, this.value_);
            }
            if ((this.bitField0_ & 2) != 0) {
                output.writeUInt64(2, this.collation_);
            }
            this.unknownFields.writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
                size += CodedOutputStream.computeBytesSize((int)1, (ByteString)this.value_);
            }
            if ((this.bitField0_ & 2) != 0) {
                size += CodedOutputStream.computeUInt64Size((int)2, (long)this.collation_);
            }
            this.memoizedSize = size += this.unknownFields.getSerializedSize();
            return size;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof String)) {
                return super.equals(obj);
            }
            String other = (String)obj;
            if (this.hasValue() != other.hasValue()) {
                return false;
            }
            if (this.hasValue() && !this.getValue().equals((Object)other.getValue())) {
                return false;
            }
            if (this.hasCollation() != other.hasCollation()) {
                return false;
            }
            if (this.hasCollation() && this.getCollation() != other.getCollation()) {
                return false;
            }
            return this.unknownFields.equals((Object)other.unknownFields);
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + String.getDescriptor().hashCode();
            if (this.hasValue()) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getValue().hashCode();
            }
            if (this.hasCollation()) {
                hash = 37 * hash + 2;
                hash = 53 * hash + Internal.hashLong((long)this.getCollation());
            }
            this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
            return hash;
        }

        public static String parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (String)PARSER.parseFrom(data);
        }

        public static String parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (String)PARSER.parseFrom(data, extensionRegistry);
        }

        public static String parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (String)PARSER.parseFrom(data);
        }

        public static String parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (String)PARSER.parseFrom(data, extensionRegistry);
        }

        public static String parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (String)PARSER.parseFrom(data);
        }

        public static String parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (String)PARSER.parseFrom(data, extensionRegistry);
        }

        public static String parseFrom(InputStream input) throws IOException {
            return (String)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
        }

        public static String parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (String)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
        }

        public static String parseDelimitedFrom(InputStream input) throws IOException {
            return (String)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
        }

        public static String parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (String)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
        }

        public static String parseFrom(CodedInputStream input) throws IOException {
            return (String)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
        }

        public static String parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (String)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
        }

        public Builder newBuilderForType() {
            return String.newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(String prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static String getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<String> parser() {
            return PARSER;
        }

        public Parser<String> getParserForType() {
            return PARSER;
        }

        public String getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder
        extends GeneratedMessageV3.Builder<Builder>
        implements StringOrBuilder {
            private int bitField0_;
            private ByteString value_ = ByteString.EMPTY;
            private long collation_;

            public static final Descriptors.Descriptor getDescriptor() {
                return internal_static_Mysqlx_Datatypes_Scalar_String_descriptor;
            }

            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return internal_static_Mysqlx_Datatypes_Scalar_String_fieldAccessorTable.ensureFieldAccessorsInitialized(String.class, Builder.class);
            }

            private Builder() {
                this.maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (alwaysUseFieldBuilders) {
                    // empty if block
                }
            }

            public Builder clear() {
                super.clear();
                this.value_ = ByteString.EMPTY;
                this.bitField0_ &= 0xFFFFFFFE;
                this.collation_ = 0L;
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return internal_static_Mysqlx_Datatypes_Scalar_String_descriptor;
            }

            public String getDefaultInstanceForType() {
                return String.getDefaultInstance();
            }

            public String build() {
                String result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw Builder.newUninitializedMessageException((Message)result);
                }
                return result;
            }

            public String buildPartial() {
                String result = new String(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 1) != 0) {
                    to_bitField0_ |= 1;
                }
                result.value_ = this.value_;
                if ((from_bitField0_ & 2) != 0) {
                    result.collation_ = this.collation_;
                    to_bitField0_ |= 2;
                }
                result.bitField0_ = to_bitField0_;
                this.onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder)super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (Builder)super.setField(field, value);
            }

            public Builder clearField(Descriptors.FieldDescriptor field) {
                return (Builder)super.clearField(field);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (Builder)super.clearOneof(oneof);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (Builder)super.setRepeatedField(field, index, value);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (Builder)super.addRepeatedField(field, value);
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof String) {
                    return this.mergeFrom((String)other);
                }
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(String other) {
                if (other == String.getDefaultInstance()) {
                    return this;
                }
                if (other.hasValue()) {
                    this.setValue(other.getValue());
                }
                if (other.hasCollation()) {
                    this.setCollation(other.getCollation());
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return this.hasValue();
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                String parsedMessage = null;
                try {
                    parsedMessage = (String)PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (String)e.getUnfinishedMessage();
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
            public boolean hasValue() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override
            public ByteString getValue() {
                return this.value_;
            }

            public Builder setValue(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 1;
                this.value_ = value;
                this.onChanged();
                return this;
            }

            public Builder clearValue() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.value_ = String.getDefaultInstance().getValue();
                this.onChanged();
                return this;
            }

            @Override
            public boolean hasCollation() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override
            public long getCollation() {
                return this.collation_;
            }

            public Builder setCollation(long value) {
                this.bitField0_ |= 2;
                this.collation_ = value;
                this.onChanged();
                return this;
            }

            public Builder clearCollation() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.collation_ = 0L;
                this.onChanged();
                return this;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (Builder)super.setUnknownFields(unknownFields);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (Builder)super.mergeUnknownFields(unknownFields);
            }
        }
    }

    public static interface StringOrBuilder
    extends MessageOrBuilder {
        public boolean hasValue();

        public ByteString getValue();

        public boolean hasCollation();

        public long getCollation();
    }

    public static enum Type implements ProtocolMessageEnum
    {
        V_SINT(1),
        V_UINT(2),
        V_NULL(3),
        V_OCTETS(4),
        V_DOUBLE(5),
        V_FLOAT(6),
        V_BOOL(7),
        V_STRING(8);

        public static final int V_SINT_VALUE = 1;
        public static final int V_UINT_VALUE = 2;
        public static final int V_NULL_VALUE = 3;
        public static final int V_OCTETS_VALUE = 4;
        public static final int V_DOUBLE_VALUE = 5;
        public static final int V_FLOAT_VALUE = 6;
        public static final int V_BOOL_VALUE = 7;
        public static final int V_STRING_VALUE = 8;
        private static final Internal.EnumLiteMap<Type> internalValueMap;
        private static final Type[] VALUES;
        private final int value;

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static Type valueOf(int value) {
            return Type.forNumber(value);
        }

        public static Type forNumber(int value) {
            switch (value) {
                case 1: {
                    return V_SINT;
                }
                case 2: {
                    return V_UINT;
                }
                case 3: {
                    return V_NULL;
                }
                case 4: {
                    return V_OCTETS;
                }
                case 5: {
                    return V_DOUBLE;
                }
                case 6: {
                    return V_FLOAT;
                }
                case 7: {
                    return V_BOOL;
                }
                case 8: {
                    return V_STRING;
                }
            }
            return null;
        }

        public static Internal.EnumLiteMap<Type> internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return (Descriptors.EnumValueDescriptor)Type.getDescriptor().getValues().get(this.ordinal());
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return Type.getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return (Descriptors.EnumDescriptor)MysqlxDatatypes.Scalar.getDescriptor().getEnumTypes().get(0);
        }

        public static Type valueOf(Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != Type.getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            return VALUES[desc.getIndex()];
        }

        private Type(int value) {
            this.value = value;
        }

        static {
            internalValueMap = new Internal.EnumLiteMap<Type>(){

                public Type findValueByNumber(int number) {
                    return Type.forNumber(number);
                }
            };
            VALUES = Type.values();
        }
    }
}
