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
 *  com.google.protobuf.Internal$EnumLiteMap
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.MessageLite
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
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public static final class MysqlxDatatypes.Any
extends GeneratedMessageV3
implements MysqlxDatatypes.AnyOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    public static final int SCALAR_FIELD_NUMBER = 2;
    private MysqlxDatatypes.Scalar scalar_;
    public static final int OBJ_FIELD_NUMBER = 3;
    private MysqlxDatatypes.Object obj_;
    public static final int ARRAY_FIELD_NUMBER = 4;
    private MysqlxDatatypes.Array array_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxDatatypes.Any DEFAULT_INSTANCE = new MysqlxDatatypes.Any();
    @Deprecated
    public static final Parser<MysqlxDatatypes.Any> PARSER = new AbstractParser<MysqlxDatatypes.Any>(){

        public MysqlxDatatypes.Any parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxDatatypes.Any(input, extensionRegistry);
        }
    };

    private MysqlxDatatypes.Any(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxDatatypes.Any() {
        this.type_ = 1;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxDatatypes.Any();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxDatatypes.Any(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
        }
        boolean mutable_bitField0_ = false;
        UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
        try {
            boolean done = false;
            block13: while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0: {
                        done = true;
                        continue block13;
                    }
                    case 8: {
                        int rawValue = input.readEnum();
                        Type value = Type.valueOf(rawValue);
                        if (value == null) {
                            unknownFields.mergeVarintField(1, rawValue);
                            continue block13;
                        }
                        this.bitField0_ |= 1;
                        this.type_ = rawValue;
                        continue block13;
                    }
                    case 18: {
                        MysqlxDatatypes.Scalar.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                            subBuilder = this.scalar_.toBuilder();
                        }
                        this.scalar_ = (MysqlxDatatypes.Scalar)input.readMessage(MysqlxDatatypes.Scalar.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.scalar_);
                            this.scalar_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 2;
                        continue block13;
                    }
                    case 26: {
                        MysqlxDatatypes.Object.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                            subBuilder = this.obj_.toBuilder();
                        }
                        this.obj_ = (MysqlxDatatypes.Object)input.readMessage(MysqlxDatatypes.Object.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.obj_);
                            this.obj_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 4;
                        continue block13;
                    }
                    case 34: {
                        MysqlxDatatypes.Array.Builder subBuilder = null;
                        if ((this.bitField0_ & 8) != 0) {
                            subBuilder = this.array_.toBuilder();
                        }
                        this.array_ = (MysqlxDatatypes.Array)input.readMessage(MysqlxDatatypes.Array.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.array_);
                            this.array_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 8;
                        continue block13;
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
        return internal_static_Mysqlx_Datatypes_Any_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Datatypes_Any_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxDatatypes.Any.class, Builder.class);
    }

    @Override
    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public Type getType() {
        Type result = Type.valueOf(this.type_);
        return result == null ? Type.SCALAR : result;
    }

    @Override
    public boolean hasScalar() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public MysqlxDatatypes.Scalar getScalar() {
        return this.scalar_ == null ? MysqlxDatatypes.Scalar.getDefaultInstance() : this.scalar_;
    }

    @Override
    public MysqlxDatatypes.ScalarOrBuilder getScalarOrBuilder() {
        return this.scalar_ == null ? MysqlxDatatypes.Scalar.getDefaultInstance() : this.scalar_;
    }

    @Override
    public boolean hasObj() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override
    public MysqlxDatatypes.Object getObj() {
        return this.obj_ == null ? MysqlxDatatypes.Object.getDefaultInstance() : this.obj_;
    }

    @Override
    public MysqlxDatatypes.ObjectOrBuilder getObjOrBuilder() {
        return this.obj_ == null ? MysqlxDatatypes.Object.getDefaultInstance() : this.obj_;
    }

    @Override
    public boolean hasArray() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override
    public MysqlxDatatypes.Array getArray() {
        return this.array_ == null ? MysqlxDatatypes.Array.getDefaultInstance() : this.array_;
    }

    @Override
    public MysqlxDatatypes.ArrayOrBuilder getArrayOrBuilder() {
        return this.array_ == null ? MysqlxDatatypes.Array.getDefaultInstance() : this.array_;
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
        if (this.hasScalar() && !this.getScalar().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (this.hasObj() && !this.getObj().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (this.hasArray() && !this.getArray().isInitialized()) {
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
            output.writeMessage(2, (MessageLite)this.getScalar());
        }
        if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(3, (MessageLite)this.getObj());
        }
        if ((this.bitField0_ & 8) != 0) {
            output.writeMessage(4, (MessageLite)this.getArray());
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
            size += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.getScalar());
        }
        if ((this.bitField0_ & 4) != 0) {
            size += CodedOutputStream.computeMessageSize((int)3, (MessageLite)this.getObj());
        }
        if ((this.bitField0_ & 8) != 0) {
            size += CodedOutputStream.computeMessageSize((int)4, (MessageLite)this.getArray());
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxDatatypes.Any)) {
            return super.equals(obj);
        }
        MysqlxDatatypes.Any other = (MysqlxDatatypes.Any)obj;
        if (this.hasType() != other.hasType()) {
            return false;
        }
        if (this.hasType() && this.type_ != other.type_) {
            return false;
        }
        if (this.hasScalar() != other.hasScalar()) {
            return false;
        }
        if (this.hasScalar() && !this.getScalar().equals(other.getScalar())) {
            return false;
        }
        if (this.hasObj() != other.hasObj()) {
            return false;
        }
        if (this.hasObj() && !this.getObj().equals(other.getObj())) {
            return false;
        }
        if (this.hasArray() != other.hasArray()) {
            return false;
        }
        if (this.hasArray() && !this.getArray().equals(other.getArray())) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxDatatypes.Any.getDescriptor().hashCode();
        if (this.hasType()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.type_;
        }
        if (this.hasScalar()) {
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getScalar().hashCode();
        }
        if (this.hasObj()) {
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getObj().hashCode();
        }
        if (this.hasArray()) {
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getArray().hashCode();
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxDatatypes.Any parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxDatatypes.Any)PARSER.parseFrom(data);
    }

    public static MysqlxDatatypes.Any parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxDatatypes.Any)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxDatatypes.Any parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxDatatypes.Any)PARSER.parseFrom(data);
    }

    public static MysqlxDatatypes.Any parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxDatatypes.Any)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxDatatypes.Any parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxDatatypes.Any)PARSER.parseFrom(data);
    }

    public static MysqlxDatatypes.Any parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxDatatypes.Any)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxDatatypes.Any parseFrom(InputStream input) throws IOException {
        return (MysqlxDatatypes.Any)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxDatatypes.Any parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxDatatypes.Any)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxDatatypes.Any parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxDatatypes.Any)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxDatatypes.Any parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxDatatypes.Any)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxDatatypes.Any parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxDatatypes.Any)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxDatatypes.Any parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxDatatypes.Any)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxDatatypes.Any.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxDatatypes.Any prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxDatatypes.Any getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxDatatypes.Any> parser() {
        return PARSER;
    }

    public Parser<MysqlxDatatypes.Any> getParserForType() {
        return PARSER;
    }

    public MysqlxDatatypes.Any getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxDatatypes.AnyOrBuilder {
        private int bitField0_;
        private int type_ = 1;
        private MysqlxDatatypes.Scalar scalar_;
        private SingleFieldBuilderV3<MysqlxDatatypes.Scalar, MysqlxDatatypes.Scalar.Builder, MysqlxDatatypes.ScalarOrBuilder> scalarBuilder_;
        private MysqlxDatatypes.Object obj_;
        private SingleFieldBuilderV3<MysqlxDatatypes.Object, MysqlxDatatypes.Object.Builder, MysqlxDatatypes.ObjectOrBuilder> objBuilder_;
        private MysqlxDatatypes.Array array_;
        private SingleFieldBuilderV3<MysqlxDatatypes.Array, MysqlxDatatypes.Array.Builder, MysqlxDatatypes.ArrayOrBuilder> arrayBuilder_;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Datatypes_Any_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Datatypes_Any_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxDatatypes.Any.class, Builder.class);
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
                this.getScalarFieldBuilder();
                this.getObjFieldBuilder();
                this.getArrayFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            this.type_ = 1;
            this.bitField0_ &= 0xFFFFFFFE;
            if (this.scalarBuilder_ == null) {
                this.scalar_ = null;
            } else {
                this.scalarBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFFD;
            if (this.objBuilder_ == null) {
                this.obj_ = null;
            } else {
                this.objBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFFB;
            if (this.arrayBuilder_ == null) {
                this.array_ = null;
            } else {
                this.arrayBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFF7;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Datatypes_Any_descriptor;
        }

        public MysqlxDatatypes.Any getDefaultInstanceForType() {
            return MysqlxDatatypes.Any.getDefaultInstance();
        }

        public MysqlxDatatypes.Any build() {
            MysqlxDatatypes.Any result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxDatatypes.Any buildPartial() {
            MysqlxDatatypes.Any result = new MysqlxDatatypes.Any(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
                to_bitField0_ |= 1;
            }
            result.type_ = this.type_;
            if ((from_bitField0_ & 2) != 0) {
                if (this.scalarBuilder_ == null) {
                    result.scalar_ = this.scalar_;
                } else {
                    result.scalar_ = (MysqlxDatatypes.Scalar)this.scalarBuilder_.build();
                }
                to_bitField0_ |= 2;
            }
            if ((from_bitField0_ & 4) != 0) {
                if (this.objBuilder_ == null) {
                    result.obj_ = this.obj_;
                } else {
                    result.obj_ = (MysqlxDatatypes.Object)this.objBuilder_.build();
                }
                to_bitField0_ |= 4;
            }
            if ((from_bitField0_ & 8) != 0) {
                if (this.arrayBuilder_ == null) {
                    result.array_ = this.array_;
                } else {
                    result.array_ = (MysqlxDatatypes.Array)this.arrayBuilder_.build();
                }
                to_bitField0_ |= 8;
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
            if (other instanceof MysqlxDatatypes.Any) {
                return this.mergeFrom((MysqlxDatatypes.Any)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxDatatypes.Any other) {
            if (other == MysqlxDatatypes.Any.getDefaultInstance()) {
                return this;
            }
            if (other.hasType()) {
                this.setType(other.getType());
            }
            if (other.hasScalar()) {
                this.mergeScalar(other.getScalar());
            }
            if (other.hasObj()) {
                this.mergeObj(other.getObj());
            }
            if (other.hasArray()) {
                this.mergeArray(other.getArray());
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            if (!this.hasType()) {
                return false;
            }
            if (this.hasScalar() && !this.getScalar().isInitialized()) {
                return false;
            }
            if (this.hasObj() && !this.getObj().isInitialized()) {
                return false;
            }
            return !this.hasArray() || this.getArray().isInitialized();
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxDatatypes.Any parsedMessage = null;
            try {
                parsedMessage = (MysqlxDatatypes.Any)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxDatatypes.Any)e.getUnfinishedMessage();
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
            return result == null ? Type.SCALAR : result;
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
        public boolean hasScalar() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public MysqlxDatatypes.Scalar getScalar() {
            if (this.scalarBuilder_ == null) {
                return this.scalar_ == null ? MysqlxDatatypes.Scalar.getDefaultInstance() : this.scalar_;
            }
            return (MysqlxDatatypes.Scalar)this.scalarBuilder_.getMessage();
        }

        public Builder setScalar(MysqlxDatatypes.Scalar value) {
            if (this.scalarBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.scalar_ = value;
                this.onChanged();
            } else {
                this.scalarBuilder_.setMessage((AbstractMessage)value);
            }
            this.bitField0_ |= 2;
            return this;
        }

        public Builder setScalar(MysqlxDatatypes.Scalar.Builder builderForValue) {
            if (this.scalarBuilder_ == null) {
                this.scalar_ = builderForValue.build();
                this.onChanged();
            } else {
                this.scalarBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 2;
            return this;
        }

        public Builder mergeScalar(MysqlxDatatypes.Scalar value) {
            if (this.scalarBuilder_ == null) {
                this.scalar_ = (this.bitField0_ & 2) != 0 && this.scalar_ != null && this.scalar_ != MysqlxDatatypes.Scalar.getDefaultInstance() ? MysqlxDatatypes.Scalar.newBuilder(this.scalar_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.scalarBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 2;
            return this;
        }

        public Builder clearScalar() {
            if (this.scalarBuilder_ == null) {
                this.scalar_ = null;
                this.onChanged();
            } else {
                this.scalarBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }

        public MysqlxDatatypes.Scalar.Builder getScalarBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (MysqlxDatatypes.Scalar.Builder)this.getScalarFieldBuilder().getBuilder();
        }

        @Override
        public MysqlxDatatypes.ScalarOrBuilder getScalarOrBuilder() {
            if (this.scalarBuilder_ != null) {
                return (MysqlxDatatypes.ScalarOrBuilder)this.scalarBuilder_.getMessageOrBuilder();
            }
            return this.scalar_ == null ? MysqlxDatatypes.Scalar.getDefaultInstance() : this.scalar_;
        }

        private SingleFieldBuilderV3<MysqlxDatatypes.Scalar, MysqlxDatatypes.Scalar.Builder, MysqlxDatatypes.ScalarOrBuilder> getScalarFieldBuilder() {
            if (this.scalarBuilder_ == null) {
                this.scalarBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getScalar(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.scalar_ = null;
            }
            return this.scalarBuilder_;
        }

        @Override
        public boolean hasObj() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override
        public MysqlxDatatypes.Object getObj() {
            if (this.objBuilder_ == null) {
                return this.obj_ == null ? MysqlxDatatypes.Object.getDefaultInstance() : this.obj_;
            }
            return (MysqlxDatatypes.Object)this.objBuilder_.getMessage();
        }

        public Builder setObj(MysqlxDatatypes.Object value) {
            if (this.objBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.obj_ = value;
                this.onChanged();
            } else {
                this.objBuilder_.setMessage((AbstractMessage)value);
            }
            this.bitField0_ |= 4;
            return this;
        }

        public Builder setObj(MysqlxDatatypes.Object.Builder builderForValue) {
            if (this.objBuilder_ == null) {
                this.obj_ = builderForValue.build();
                this.onChanged();
            } else {
                this.objBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 4;
            return this;
        }

        public Builder mergeObj(MysqlxDatatypes.Object value) {
            if (this.objBuilder_ == null) {
                this.obj_ = (this.bitField0_ & 4) != 0 && this.obj_ != null && this.obj_ != MysqlxDatatypes.Object.getDefaultInstance() ? MysqlxDatatypes.Object.newBuilder(this.obj_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.objBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 4;
            return this;
        }

        public Builder clearObj() {
            if (this.objBuilder_ == null) {
                this.obj_ = null;
                this.onChanged();
            } else {
                this.objBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFFB;
            return this;
        }

        public MysqlxDatatypes.Object.Builder getObjBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (MysqlxDatatypes.Object.Builder)this.getObjFieldBuilder().getBuilder();
        }

        @Override
        public MysqlxDatatypes.ObjectOrBuilder getObjOrBuilder() {
            if (this.objBuilder_ != null) {
                return (MysqlxDatatypes.ObjectOrBuilder)this.objBuilder_.getMessageOrBuilder();
            }
            return this.obj_ == null ? MysqlxDatatypes.Object.getDefaultInstance() : this.obj_;
        }

        private SingleFieldBuilderV3<MysqlxDatatypes.Object, MysqlxDatatypes.Object.Builder, MysqlxDatatypes.ObjectOrBuilder> getObjFieldBuilder() {
            if (this.objBuilder_ == null) {
                this.objBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getObj(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.obj_ = null;
            }
            return this.objBuilder_;
        }

        @Override
        public boolean hasArray() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override
        public MysqlxDatatypes.Array getArray() {
            if (this.arrayBuilder_ == null) {
                return this.array_ == null ? MysqlxDatatypes.Array.getDefaultInstance() : this.array_;
            }
            return (MysqlxDatatypes.Array)this.arrayBuilder_.getMessage();
        }

        public Builder setArray(MysqlxDatatypes.Array value) {
            if (this.arrayBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.array_ = value;
                this.onChanged();
            } else {
                this.arrayBuilder_.setMessage((AbstractMessage)value);
            }
            this.bitField0_ |= 8;
            return this;
        }

        public Builder setArray(MysqlxDatatypes.Array.Builder builderForValue) {
            if (this.arrayBuilder_ == null) {
                this.array_ = builderForValue.build();
                this.onChanged();
            } else {
                this.arrayBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 8;
            return this;
        }

        public Builder mergeArray(MysqlxDatatypes.Array value) {
            if (this.arrayBuilder_ == null) {
                this.array_ = (this.bitField0_ & 8) != 0 && this.array_ != null && this.array_ != MysqlxDatatypes.Array.getDefaultInstance() ? MysqlxDatatypes.Array.newBuilder(this.array_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.arrayBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 8;
            return this;
        }

        public Builder clearArray() {
            if (this.arrayBuilder_ == null) {
                this.array_ = null;
                this.onChanged();
            } else {
                this.arrayBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFF7;
            return this;
        }

        public MysqlxDatatypes.Array.Builder getArrayBuilder() {
            this.bitField0_ |= 8;
            this.onChanged();
            return (MysqlxDatatypes.Array.Builder)this.getArrayFieldBuilder().getBuilder();
        }

        @Override
        public MysqlxDatatypes.ArrayOrBuilder getArrayOrBuilder() {
            if (this.arrayBuilder_ != null) {
                return (MysqlxDatatypes.ArrayOrBuilder)this.arrayBuilder_.getMessageOrBuilder();
            }
            return this.array_ == null ? MysqlxDatatypes.Array.getDefaultInstance() : this.array_;
        }

        private SingleFieldBuilderV3<MysqlxDatatypes.Array, MysqlxDatatypes.Array.Builder, MysqlxDatatypes.ArrayOrBuilder> getArrayFieldBuilder() {
            if (this.arrayBuilder_ == null) {
                this.arrayBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getArray(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.array_ = null;
            }
            return this.arrayBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
        }
    }

    public static enum Type implements ProtocolMessageEnum
    {
        SCALAR(1),
        OBJECT(2),
        ARRAY(3);

        public static final int SCALAR_VALUE = 1;
        public static final int OBJECT_VALUE = 2;
        public static final int ARRAY_VALUE = 3;
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
                    return SCALAR;
                }
                case 2: {
                    return OBJECT;
                }
                case 3: {
                    return ARRAY;
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
            return (Descriptors.EnumDescriptor)MysqlxDatatypes.Any.getDescriptor().getEnumTypes().get(0);
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
