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
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.GeneratedMessageV3$UnusedPrivateParameter
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
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
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.mysql.cj.x.protobuf.MysqlxExpr;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public static final class MysqlxCrud.LimitExpr
extends GeneratedMessageV3
implements MysqlxCrud.LimitExprOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int ROW_COUNT_FIELD_NUMBER = 1;
    private MysqlxExpr.Expr rowCount_;
    public static final int OFFSET_FIELD_NUMBER = 2;
    private MysqlxExpr.Expr offset_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxCrud.LimitExpr DEFAULT_INSTANCE = new MysqlxCrud.LimitExpr();
    @Deprecated
    public static final Parser<MysqlxCrud.LimitExpr> PARSER = new AbstractParser<MysqlxCrud.LimitExpr>(){

        public MysqlxCrud.LimitExpr parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxCrud.LimitExpr(input, extensionRegistry);
        }
    };

    private MysqlxCrud.LimitExpr(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxCrud.LimitExpr() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxCrud.LimitExpr();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxCrud.LimitExpr(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        MysqlxExpr.Expr.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                            subBuilder = this.rowCount_.toBuilder();
                        }
                        this.rowCount_ = (MysqlxExpr.Expr)input.readMessage(MysqlxExpr.Expr.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.rowCount_);
                            this.rowCount_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 1;
                        continue block11;
                    }
                    case 18: {
                        MysqlxExpr.Expr.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                            subBuilder = this.offset_.toBuilder();
                        }
                        this.offset_ = (MysqlxExpr.Expr)input.readMessage(MysqlxExpr.Expr.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.offset_);
                            this.offset_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 2;
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
        return internal_static_Mysqlx_Crud_LimitExpr_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Crud_LimitExpr_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.LimitExpr.class, Builder.class);
    }

    @Override
    public boolean hasRowCount() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public MysqlxExpr.Expr getRowCount() {
        return this.rowCount_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.rowCount_;
    }

    @Override
    public MysqlxExpr.ExprOrBuilder getRowCountOrBuilder() {
        return this.rowCount_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.rowCount_;
    }

    @Override
    public boolean hasOffset() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public MysqlxExpr.Expr getOffset() {
        return this.offset_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.offset_;
    }

    @Override
    public MysqlxExpr.ExprOrBuilder getOffsetOrBuilder() {
        return this.offset_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.offset_;
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
        if (!this.getRowCount().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (this.hasOffset() && !this.getOffset().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, (MessageLite)this.getRowCount());
        }
        if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, (MessageLite)this.getOffset());
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
            size += CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.getRowCount());
        }
        if ((this.bitField0_ & 2) != 0) {
            size += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.getOffset());
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxCrud.LimitExpr)) {
            return super.equals(obj);
        }
        MysqlxCrud.LimitExpr other = (MysqlxCrud.LimitExpr)obj;
        if (this.hasRowCount() != other.hasRowCount()) {
            return false;
        }
        if (this.hasRowCount() && !this.getRowCount().equals(other.getRowCount())) {
            return false;
        }
        if (this.hasOffset() != other.hasOffset()) {
            return false;
        }
        if (this.hasOffset() && !this.getOffset().equals(other.getOffset())) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxCrud.LimitExpr.getDescriptor().hashCode();
        if (this.hasRowCount()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getRowCount().hashCode();
        }
        if (this.hasOffset()) {
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getOffset().hashCode();
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxCrud.LimitExpr parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.LimitExpr)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.LimitExpr parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.LimitExpr)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.LimitExpr parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.LimitExpr)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.LimitExpr parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.LimitExpr)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.LimitExpr parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.LimitExpr)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.LimitExpr parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.LimitExpr)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.LimitExpr parseFrom(InputStream input) throws IOException {
        return (MysqlxCrud.LimitExpr)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxCrud.LimitExpr parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.LimitExpr)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxCrud.LimitExpr parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxCrud.LimitExpr)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxCrud.LimitExpr parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.LimitExpr)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxCrud.LimitExpr parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxCrud.LimitExpr)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxCrud.LimitExpr parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.LimitExpr)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxCrud.LimitExpr.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxCrud.LimitExpr prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxCrud.LimitExpr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxCrud.LimitExpr> parser() {
        return PARSER;
    }

    public Parser<MysqlxCrud.LimitExpr> getParserForType() {
        return PARSER;
    }

    public MysqlxCrud.LimitExpr getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxCrud.LimitExprOrBuilder {
        private int bitField0_;
        private MysqlxExpr.Expr rowCount_;
        private SingleFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> rowCountBuilder_;
        private MysqlxExpr.Expr offset_;
        private SingleFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> offsetBuilder_;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Crud_LimitExpr_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Crud_LimitExpr_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.LimitExpr.class, Builder.class);
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
                this.getRowCountFieldBuilder();
                this.getOffsetFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            if (this.rowCountBuilder_ == null) {
                this.rowCount_ = null;
            } else {
                this.rowCountBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFFE;
            if (this.offsetBuilder_ == null) {
                this.offset_ = null;
            } else {
                this.offsetBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Crud_LimitExpr_descriptor;
        }

        public MysqlxCrud.LimitExpr getDefaultInstanceForType() {
            return MysqlxCrud.LimitExpr.getDefaultInstance();
        }

        public MysqlxCrud.LimitExpr build() {
            MysqlxCrud.LimitExpr result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxCrud.LimitExpr buildPartial() {
            MysqlxCrud.LimitExpr result = new MysqlxCrud.LimitExpr(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
                if (this.rowCountBuilder_ == null) {
                    result.rowCount_ = this.rowCount_;
                } else {
                    result.rowCount_ = (MysqlxExpr.Expr)this.rowCountBuilder_.build();
                }
                to_bitField0_ |= 1;
            }
            if ((from_bitField0_ & 2) != 0) {
                if (this.offsetBuilder_ == null) {
                    result.offset_ = this.offset_;
                } else {
                    result.offset_ = (MysqlxExpr.Expr)this.offsetBuilder_.build();
                }
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
            if (other instanceof MysqlxCrud.LimitExpr) {
                return this.mergeFrom((MysqlxCrud.LimitExpr)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxCrud.LimitExpr other) {
            if (other == MysqlxCrud.LimitExpr.getDefaultInstance()) {
                return this;
            }
            if (other.hasRowCount()) {
                this.mergeRowCount(other.getRowCount());
            }
            if (other.hasOffset()) {
                this.mergeOffset(other.getOffset());
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            if (!this.hasRowCount()) {
                return false;
            }
            if (!this.getRowCount().isInitialized()) {
                return false;
            }
            return !this.hasOffset() || this.getOffset().isInitialized();
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxCrud.LimitExpr parsedMessage = null;
            try {
                parsedMessage = (MysqlxCrud.LimitExpr)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxCrud.LimitExpr)e.getUnfinishedMessage();
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
        public MysqlxExpr.Expr getRowCount() {
            if (this.rowCountBuilder_ == null) {
                return this.rowCount_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.rowCount_;
            }
            return (MysqlxExpr.Expr)this.rowCountBuilder_.getMessage();
        }

        public Builder setRowCount(MysqlxExpr.Expr value) {
            if (this.rowCountBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.rowCount_ = value;
                this.onChanged();
            } else {
                this.rowCountBuilder_.setMessage((AbstractMessage)value);
            }
            this.bitField0_ |= 1;
            return this;
        }

        public Builder setRowCount(MysqlxExpr.Expr.Builder builderForValue) {
            if (this.rowCountBuilder_ == null) {
                this.rowCount_ = builderForValue.build();
                this.onChanged();
            } else {
                this.rowCountBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 1;
            return this;
        }

        public Builder mergeRowCount(MysqlxExpr.Expr value) {
            if (this.rowCountBuilder_ == null) {
                this.rowCount_ = (this.bitField0_ & 1) != 0 && this.rowCount_ != null && this.rowCount_ != MysqlxExpr.Expr.getDefaultInstance() ? MysqlxExpr.Expr.newBuilder(this.rowCount_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.rowCountBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 1;
            return this;
        }

        public Builder clearRowCount() {
            if (this.rowCountBuilder_ == null) {
                this.rowCount_ = null;
                this.onChanged();
            } else {
                this.rowCountBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }

        public MysqlxExpr.Expr.Builder getRowCountBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (MysqlxExpr.Expr.Builder)this.getRowCountFieldBuilder().getBuilder();
        }

        @Override
        public MysqlxExpr.ExprOrBuilder getRowCountOrBuilder() {
            if (this.rowCountBuilder_ != null) {
                return (MysqlxExpr.ExprOrBuilder)this.rowCountBuilder_.getMessageOrBuilder();
            }
            return this.rowCount_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.rowCount_;
        }

        private SingleFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> getRowCountFieldBuilder() {
            if (this.rowCountBuilder_ == null) {
                this.rowCountBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getRowCount(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.rowCount_ = null;
            }
            return this.rowCountBuilder_;
        }

        @Override
        public boolean hasOffset() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public MysqlxExpr.Expr getOffset() {
            if (this.offsetBuilder_ == null) {
                return this.offset_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.offset_;
            }
            return (MysqlxExpr.Expr)this.offsetBuilder_.getMessage();
        }

        public Builder setOffset(MysqlxExpr.Expr value) {
            if (this.offsetBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.offset_ = value;
                this.onChanged();
            } else {
                this.offsetBuilder_.setMessage((AbstractMessage)value);
            }
            this.bitField0_ |= 2;
            return this;
        }

        public Builder setOffset(MysqlxExpr.Expr.Builder builderForValue) {
            if (this.offsetBuilder_ == null) {
                this.offset_ = builderForValue.build();
                this.onChanged();
            } else {
                this.offsetBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 2;
            return this;
        }

        public Builder mergeOffset(MysqlxExpr.Expr value) {
            if (this.offsetBuilder_ == null) {
                this.offset_ = (this.bitField0_ & 2) != 0 && this.offset_ != null && this.offset_ != MysqlxExpr.Expr.getDefaultInstance() ? MysqlxExpr.Expr.newBuilder(this.offset_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.offsetBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 2;
            return this;
        }

        public Builder clearOffset() {
            if (this.offsetBuilder_ == null) {
                this.offset_ = null;
                this.onChanged();
            } else {
                this.offsetBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }

        public MysqlxExpr.Expr.Builder getOffsetBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (MysqlxExpr.Expr.Builder)this.getOffsetFieldBuilder().getBuilder();
        }

        @Override
        public MysqlxExpr.ExprOrBuilder getOffsetOrBuilder() {
            if (this.offsetBuilder_ != null) {
                return (MysqlxExpr.ExprOrBuilder)this.offsetBuilder_.getMessageOrBuilder();
            }
            return this.offset_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.offset_;
        }

        private SingleFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> getOffsetFieldBuilder() {
            if (this.offsetBuilder_ == null) {
                this.offsetBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getOffset(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.offset_ = null;
            }
            return this.offsetBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
        }
    }
}
