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
import com.mysql.cj.x.protobuf.MysqlxCrud;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public static final class MysqlxCrud.Limit
extends GeneratedMessageV3
implements MysqlxCrud.LimitOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int ROW_COUNT_FIELD_NUMBER = 1;
    private long rowCount_;
    public static final int OFFSET_FIELD_NUMBER = 2;
    private long offset_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxCrud.Limit DEFAULT_INSTANCE = new MysqlxCrud.Limit();
    @Deprecated
    public static final Parser<MysqlxCrud.Limit> PARSER = new AbstractParser<MysqlxCrud.Limit>(){

        public MysqlxCrud.Limit parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxCrud.Limit(input, extensionRegistry);
        }
    };

    private MysqlxCrud.Limit(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxCrud.Limit() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxCrud.Limit();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxCrud.Limit(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                    case 8: {
                        this.bitField0_ |= 1;
                        this.rowCount_ = input.readUInt64();
                        continue block11;
                    }
                    case 16: {
                        this.bitField0_ |= 2;
                        this.offset_ = input.readUInt64();
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
        return internal_static_Mysqlx_Crud_Limit_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Crud_Limit_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.Limit.class, Builder.class);
    }

    @Override
    public boolean hasRowCount() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public long getRowCount() {
        return this.rowCount_;
    }

    @Override
    public boolean hasOffset() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public long getOffset() {
        return this.offset_;
    }

    public final boolean isInitialized() {
        byte isInitialized = this.memoizedIsInitialized;
        if (isInitialized == 1) {
            return true;
        }
        if (isInitialized == 0) {
            return false;
        }
        if (!this.hasRowCount()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        if ((this.bitField0_ & 1) != 0) {
            output.writeUInt64(1, this.rowCount_);
        }
        if ((this.bitField0_ & 2) != 0) {
            output.writeUInt64(2, this.offset_);
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
            size += CodedOutputStream.computeUInt64Size((int)1, (long)this.rowCount_);
        }
        if ((this.bitField0_ & 2) != 0) {
            size += CodedOutputStream.computeUInt64Size((int)2, (long)this.offset_);
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxCrud.Limit)) {
            return super.equals(obj);
        }
        MysqlxCrud.Limit other = (MysqlxCrud.Limit)obj;
        if (this.hasRowCount() != other.hasRowCount()) {
            return false;
        }
        if (this.hasRowCount() && this.getRowCount() != other.getRowCount()) {
            return false;
        }
        if (this.hasOffset() != other.hasOffset()) {
            return false;
        }
        if (this.hasOffset() && this.getOffset() != other.getOffset()) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxCrud.Limit.getDescriptor().hashCode();
        if (this.hasRowCount()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + Internal.hashLong((long)this.getRowCount());
        }
        if (this.hasOffset()) {
            hash = 37 * hash + 2;
            hash = 53 * hash + Internal.hashLong((long)this.getOffset());
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxCrud.Limit parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Limit)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.Limit parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Limit)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.Limit parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Limit)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.Limit parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Limit)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.Limit parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Limit)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.Limit parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Limit)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.Limit parseFrom(InputStream input) throws IOException {
        return (MysqlxCrud.Limit)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxCrud.Limit parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.Limit)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxCrud.Limit parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxCrud.Limit)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxCrud.Limit parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.Limit)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxCrud.Limit parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxCrud.Limit)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxCrud.Limit parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.Limit)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxCrud.Limit.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxCrud.Limit prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxCrud.Limit getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxCrud.Limit> parser() {
        return PARSER;
    }

    public Parser<MysqlxCrud.Limit> getParserForType() {
        return PARSER;
    }

    public MysqlxCrud.Limit getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxCrud.LimitOrBuilder {
        private int bitField0_;
        private long rowCount_;
        private long offset_;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Crud_Limit_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Crud_Limit_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.Limit.class, Builder.class);
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
            this.rowCount_ = 0L;
            this.bitField0_ &= 0xFFFFFFFE;
            this.offset_ = 0L;
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Crud_Limit_descriptor;
        }

        public MysqlxCrud.Limit getDefaultInstanceForType() {
            return MysqlxCrud.Limit.getDefaultInstance();
        }

        public MysqlxCrud.Limit build() {
            MysqlxCrud.Limit result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxCrud.Limit buildPartial() {
            MysqlxCrud.Limit result = new MysqlxCrud.Limit(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
                result.rowCount_ = this.rowCount_;
                to_bitField0_ |= 1;
            }
            if ((from_bitField0_ & 2) != 0) {
                result.offset_ = this.offset_;
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
            if (other instanceof MysqlxCrud.Limit) {
                return this.mergeFrom((MysqlxCrud.Limit)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxCrud.Limit other) {
            if (other == MysqlxCrud.Limit.getDefaultInstance()) {
                return this;
            }
            if (other.hasRowCount()) {
                this.setRowCount(other.getRowCount());
            }
            if (other.hasOffset()) {
                this.setOffset(other.getOffset());
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            return this.hasRowCount();
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxCrud.Limit parsedMessage = null;
            try {
                parsedMessage = (MysqlxCrud.Limit)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxCrud.Limit)e.getUnfinishedMessage();
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
        public boolean hasRowCount() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public long getRowCount() {
            return this.rowCount_;
        }

        public Builder setRowCount(long value) {
            this.bitField0_ |= 1;
            this.rowCount_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearRowCount() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.rowCount_ = 0L;
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasOffset() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public long getOffset() {
            return this.offset_;
        }

        public Builder setOffset(long value) {
            this.bitField0_ |= 2;
            this.offset_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearOffset() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.offset_ = 0L;
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
