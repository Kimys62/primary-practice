/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractParser
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.GeneratedMessageV3$UnusedPrivateParameter
 *  com.google.protobuf.Internal
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
package com.mysql.cj.x.protobuf;

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
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public static final class MysqlxDatatypes.Scalar.String
extends GeneratedMessageV3
implements MysqlxDatatypes.Scalar.StringOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int VALUE_FIELD_NUMBER = 1;
    private ByteString value_;
    public static final int COLLATION_FIELD_NUMBER = 2;
    private long collation_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxDatatypes.Scalar.String DEFAULT_INSTANCE = new MysqlxDatatypes.Scalar.String();
    @Deprecated
    public static final Parser<MysqlxDatatypes.Scalar.String> PARSER = new AbstractParser<MysqlxDatatypes.Scalar.String>(){

        public MysqlxDatatypes.Scalar.String parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxDatatypes.Scalar.String(input, extensionRegistry);
        }
    };

    private MysqlxDatatypes.Scalar.String(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxDatatypes.Scalar.String() {
        this.value_ = ByteString.EMPTY;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxDatatypes.Scalar.String();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxDatatypes.Scalar.String(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
        return internal_static_Mysqlx_Datatypes_Scalar_String_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxDatatypes.Scalar.String.class, Builder.class);
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
        if (!(obj instanceof MysqlxDatatypes.Scalar.String)) {
            return super.equals(obj);
        }
        MysqlxDatatypes.Scalar.String other = (MysqlxDatatypes.Scalar.String)obj;
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
        hash = 19 * hash + MysqlxDatatypes.Scalar.String.getDescriptor().hashCode();
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

    public static MysqlxDatatypes.Scalar.String parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxDatatypes.Scalar.String)PARSER.parseFrom(data);
    }

    public static MysqlxDatatypes.Scalar.String parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxDatatypes.Scalar.String)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxDatatypes.Scalar.String parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxDatatypes.Scalar.String)PARSER.parseFrom(data);
    }

    public static MysqlxDatatypes.Scalar.String parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxDatatypes.Scalar.String)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxDatatypes.Scalar.String parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxDatatypes.Scalar.String)PARSER.parseFrom(data);
    }

    public static MysqlxDatatypes.Scalar.String parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxDatatypes.Scalar.String)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxDatatypes.Scalar.String parseFrom(InputStream input) throws IOException {
        return (MysqlxDatatypes.Scalar.String)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxDatatypes.Scalar.String parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxDatatypes.Scalar.String)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxDatatypes.Scalar.String parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxDatatypes.Scalar.String)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxDatatypes.Scalar.String parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxDatatypes.Scalar.String)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxDatatypes.Scalar.String parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxDatatypes.Scalar.String)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxDatatypes.Scalar.String parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxDatatypes.Scalar.String)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxDatatypes.Scalar.String.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxDatatypes.Scalar.String prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxDatatypes.Scalar.String getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxDatatypes.Scalar.String> parser() {
        return PARSER;
    }

    public Parser<MysqlxDatatypes.Scalar.String> getParserForType() {
        return PARSER;
    }

    public MysqlxDatatypes.Scalar.String getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxDatatypes.Scalar.StringOrBuilder {
        private int bitField0_;
        private ByteString value_ = ByteString.EMPTY;
        private long collation_;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Datatypes_Scalar_String_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Datatypes_Scalar_String_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxDatatypes.Scalar.String.class, Builder.class);
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

        public MysqlxDatatypes.Scalar.String getDefaultInstanceForType() {
            return MysqlxDatatypes.Scalar.String.getDefaultInstance();
        }

        public MysqlxDatatypes.Scalar.String build() {
            MysqlxDatatypes.Scalar.String result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxDatatypes.Scalar.String buildPartial() {
            MysqlxDatatypes.Scalar.String result = new MysqlxDatatypes.Scalar.String(this);
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
            if (other instanceof MysqlxDatatypes.Scalar.String) {
                return this.mergeFrom((MysqlxDatatypes.Scalar.String)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxDatatypes.Scalar.String other) {
            if (other == MysqlxDatatypes.Scalar.String.getDefaultInstance()) {
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
            MysqlxDatatypes.Scalar.String parsedMessage = null;
            try {
                parsedMessage = (MysqlxDatatypes.Scalar.String)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxDatatypes.Scalar.String)e.getUnfinishedMessage();
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
            this.value_ = MysqlxDatatypes.Scalar.String.getDefaultInstance().getValue();
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
