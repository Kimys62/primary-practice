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
import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.mysql.cj.x.protobuf.MysqlxExpr;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public static final class MysqlxCrud.UpdateOperation
extends GeneratedMessageV3
implements MysqlxCrud.UpdateOperationOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int SOURCE_FIELD_NUMBER = 1;
    private MysqlxExpr.ColumnIdentifier source_;
    public static final int OPERATION_FIELD_NUMBER = 2;
    private int operation_;
    public static final int VALUE_FIELD_NUMBER = 3;
    private MysqlxExpr.Expr value_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxCrud.UpdateOperation DEFAULT_INSTANCE = new MysqlxCrud.UpdateOperation();
    @Deprecated
    public static final Parser<MysqlxCrud.UpdateOperation> PARSER = new AbstractParser<MysqlxCrud.UpdateOperation>(){

        public MysqlxCrud.UpdateOperation parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxCrud.UpdateOperation(input, extensionRegistry);
        }
    };

    private MysqlxCrud.UpdateOperation(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxCrud.UpdateOperation() {
        this.operation_ = 1;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxCrud.UpdateOperation();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxCrud.UpdateOperation(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
        }
        boolean mutable_bitField0_ = false;
        UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
        try {
            boolean done = false;
            block12: while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0: {
                        done = true;
                        continue block12;
                    }
                    case 10: {
                        MysqlxExpr.ColumnIdentifier.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                            subBuilder = this.source_.toBuilder();
                        }
                        this.source_ = (MysqlxExpr.ColumnIdentifier)input.readMessage(MysqlxExpr.ColumnIdentifier.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.source_);
                            this.source_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 1;
                        continue block12;
                    }
                    case 16: {
                        int rawValue = input.readEnum();
                        UpdateType value = UpdateType.valueOf(rawValue);
                        if (value == null) {
                            unknownFields.mergeVarintField(2, rawValue);
                            continue block12;
                        }
                        this.bitField0_ |= 2;
                        this.operation_ = rawValue;
                        continue block12;
                    }
                    case 26: {
                        MysqlxExpr.Expr.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                            subBuilder = this.value_.toBuilder();
                        }
                        this.value_ = (MysqlxExpr.Expr)input.readMessage(MysqlxExpr.Expr.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.value_);
                            this.value_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 4;
                        continue block12;
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
        return internal_static_Mysqlx_Crud_UpdateOperation_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Crud_UpdateOperation_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.UpdateOperation.class, Builder.class);
    }

    @Override
    public boolean hasSource() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public MysqlxExpr.ColumnIdentifier getSource() {
        return this.source_ == null ? MysqlxExpr.ColumnIdentifier.getDefaultInstance() : this.source_;
    }

    @Override
    public MysqlxExpr.ColumnIdentifierOrBuilder getSourceOrBuilder() {
        return this.source_ == null ? MysqlxExpr.ColumnIdentifier.getDefaultInstance() : this.source_;
    }

    @Override
    public boolean hasOperation() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public UpdateType getOperation() {
        UpdateType result = UpdateType.valueOf(this.operation_);
        return result == null ? UpdateType.SET : result;
    }

    @Override
    public boolean hasValue() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override
    public MysqlxExpr.Expr getValue() {
        return this.value_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.value_;
    }

    @Override
    public MysqlxExpr.ExprOrBuilder getValueOrBuilder() {
        return this.value_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.value_;
    }

    public final boolean isInitialized() {
        byte isInitialized = this.memoizedIsInitialized;
        if (isInitialized == 1) {
            return true;
        }
        if (isInitialized == 0) {
            return false;
        }
        if (!this.hasSource()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (!this.hasOperation()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (!this.getSource().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (this.hasValue() && !this.getValue().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, (MessageLite)this.getSource());
        }
        if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(2, this.operation_);
        }
        if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(3, (MessageLite)this.getValue());
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
            size += CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.getSource());
        }
        if ((this.bitField0_ & 2) != 0) {
            size += CodedOutputStream.computeEnumSize((int)2, (int)this.operation_);
        }
        if ((this.bitField0_ & 4) != 0) {
            size += CodedOutputStream.computeMessageSize((int)3, (MessageLite)this.getValue());
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxCrud.UpdateOperation)) {
            return super.equals(obj);
        }
        MysqlxCrud.UpdateOperation other = (MysqlxCrud.UpdateOperation)obj;
        if (this.hasSource() != other.hasSource()) {
            return false;
        }
        if (this.hasSource() && !this.getSource().equals(other.getSource())) {
            return false;
        }
        if (this.hasOperation() != other.hasOperation()) {
            return false;
        }
        if (this.hasOperation() && this.operation_ != other.operation_) {
            return false;
        }
        if (this.hasValue() != other.hasValue()) {
            return false;
        }
        if (this.hasValue() && !this.getValue().equals(other.getValue())) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxCrud.UpdateOperation.getDescriptor().hashCode();
        if (this.hasSource()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getSource().hashCode();
        }
        if (this.hasOperation()) {
            hash = 37 * hash + 2;
            hash = 53 * hash + this.operation_;
        }
        if (this.hasValue()) {
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getValue().hashCode();
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxCrud.UpdateOperation parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.UpdateOperation)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.UpdateOperation parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.UpdateOperation)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.UpdateOperation parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.UpdateOperation)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.UpdateOperation parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.UpdateOperation)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.UpdateOperation parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.UpdateOperation)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.UpdateOperation parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.UpdateOperation)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.UpdateOperation parseFrom(InputStream input) throws IOException {
        return (MysqlxCrud.UpdateOperation)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxCrud.UpdateOperation parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.UpdateOperation)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxCrud.UpdateOperation parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxCrud.UpdateOperation)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxCrud.UpdateOperation parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.UpdateOperation)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxCrud.UpdateOperation parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxCrud.UpdateOperation)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxCrud.UpdateOperation parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.UpdateOperation)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxCrud.UpdateOperation.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxCrud.UpdateOperation prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxCrud.UpdateOperation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxCrud.UpdateOperation> parser() {
        return PARSER;
    }

    public Parser<MysqlxCrud.UpdateOperation> getParserForType() {
        return PARSER;
    }

    public MysqlxCrud.UpdateOperation getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxCrud.UpdateOperationOrBuilder {
        private int bitField0_;
        private MysqlxExpr.ColumnIdentifier source_;
        private SingleFieldBuilderV3<MysqlxExpr.ColumnIdentifier, MysqlxExpr.ColumnIdentifier.Builder, MysqlxExpr.ColumnIdentifierOrBuilder> sourceBuilder_;
        private int operation_ = 1;
        private MysqlxExpr.Expr value_;
        private SingleFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> valueBuilder_;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Crud_UpdateOperation_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Crud_UpdateOperation_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.UpdateOperation.class, Builder.class);
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
                this.getSourceFieldBuilder();
                this.getValueFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            if (this.sourceBuilder_ == null) {
                this.source_ = null;
            } else {
                this.sourceBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFFE;
            this.operation_ = 1;
            this.bitField0_ &= 0xFFFFFFFD;
            if (this.valueBuilder_ == null) {
                this.value_ = null;
            } else {
                this.valueBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFFB;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Crud_UpdateOperation_descriptor;
        }

        public MysqlxCrud.UpdateOperation getDefaultInstanceForType() {
            return MysqlxCrud.UpdateOperation.getDefaultInstance();
        }

        public MysqlxCrud.UpdateOperation build() {
            MysqlxCrud.UpdateOperation result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxCrud.UpdateOperation buildPartial() {
            MysqlxCrud.UpdateOperation result = new MysqlxCrud.UpdateOperation(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
                if (this.sourceBuilder_ == null) {
                    result.source_ = this.source_;
                } else {
                    result.source_ = (MysqlxExpr.ColumnIdentifier)this.sourceBuilder_.build();
                }
                to_bitField0_ |= 1;
            }
            if ((from_bitField0_ & 2) != 0) {
                to_bitField0_ |= 2;
            }
            result.operation_ = this.operation_;
            if ((from_bitField0_ & 4) != 0) {
                if (this.valueBuilder_ == null) {
                    result.value_ = this.value_;
                } else {
                    result.value_ = (MysqlxExpr.Expr)this.valueBuilder_.build();
                }
                to_bitField0_ |= 4;
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
            if (other instanceof MysqlxCrud.UpdateOperation) {
                return this.mergeFrom((MysqlxCrud.UpdateOperation)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxCrud.UpdateOperation other) {
            if (other == MysqlxCrud.UpdateOperation.getDefaultInstance()) {
                return this;
            }
            if (other.hasSource()) {
                this.mergeSource(other.getSource());
            }
            if (other.hasOperation()) {
                this.setOperation(other.getOperation());
            }
            if (other.hasValue()) {
                this.mergeValue(other.getValue());
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            if (!this.hasSource()) {
                return false;
            }
            if (!this.hasOperation()) {
                return false;
            }
            if (!this.getSource().isInitialized()) {
                return false;
            }
            return !this.hasValue() || this.getValue().isInitialized();
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxCrud.UpdateOperation parsedMessage = null;
            try {
                parsedMessage = (MysqlxCrud.UpdateOperation)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxCrud.UpdateOperation)e.getUnfinishedMessage();
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
        public boolean hasSource() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public MysqlxExpr.ColumnIdentifier getSource() {
            if (this.sourceBuilder_ == null) {
                return this.source_ == null ? MysqlxExpr.ColumnIdentifier.getDefaultInstance() : this.source_;
            }
            return (MysqlxExpr.ColumnIdentifier)this.sourceBuilder_.getMessage();
        }

        public Builder setSource(MysqlxExpr.ColumnIdentifier value) {
            if (this.sourceBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.source_ = value;
                this.onChanged();
            } else {
                this.sourceBuilder_.setMessage((AbstractMessage)value);
            }
            this.bitField0_ |= 1;
            return this;
        }

        public Builder setSource(MysqlxExpr.ColumnIdentifier.Builder builderForValue) {
            if (this.sourceBuilder_ == null) {
                this.source_ = builderForValue.build();
                this.onChanged();
            } else {
                this.sourceBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 1;
            return this;
        }

        public Builder mergeSource(MysqlxExpr.ColumnIdentifier value) {
            if (this.sourceBuilder_ == null) {
                this.source_ = (this.bitField0_ & 1) != 0 && this.source_ != null && this.source_ != MysqlxExpr.ColumnIdentifier.getDefaultInstance() ? MysqlxExpr.ColumnIdentifier.newBuilder(this.source_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.sourceBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 1;
            return this;
        }

        public Builder clearSource() {
            if (this.sourceBuilder_ == null) {
                this.source_ = null;
                this.onChanged();
            } else {
                this.sourceBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }

        public MysqlxExpr.ColumnIdentifier.Builder getSourceBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (MysqlxExpr.ColumnIdentifier.Builder)this.getSourceFieldBuilder().getBuilder();
        }

        @Override
        public MysqlxExpr.ColumnIdentifierOrBuilder getSourceOrBuilder() {
            if (this.sourceBuilder_ != null) {
                return (MysqlxExpr.ColumnIdentifierOrBuilder)this.sourceBuilder_.getMessageOrBuilder();
            }
            return this.source_ == null ? MysqlxExpr.ColumnIdentifier.getDefaultInstance() : this.source_;
        }

        private SingleFieldBuilderV3<MysqlxExpr.ColumnIdentifier, MysqlxExpr.ColumnIdentifier.Builder, MysqlxExpr.ColumnIdentifierOrBuilder> getSourceFieldBuilder() {
            if (this.sourceBuilder_ == null) {
                this.sourceBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getSource(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.source_ = null;
            }
            return this.sourceBuilder_;
        }

        @Override
        public boolean hasOperation() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public UpdateType getOperation() {
            UpdateType result = UpdateType.valueOf(this.operation_);
            return result == null ? UpdateType.SET : result;
        }

        public Builder setOperation(UpdateType value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 2;
            this.operation_ = value.getNumber();
            this.onChanged();
            return this;
        }

        public Builder clearOperation() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.operation_ = 1;
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasValue() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override
        public MysqlxExpr.Expr getValue() {
            if (this.valueBuilder_ == null) {
                return this.value_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.value_;
            }
            return (MysqlxExpr.Expr)this.valueBuilder_.getMessage();
        }

        public Builder setValue(MysqlxExpr.Expr value) {
            if (this.valueBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.value_ = value;
                this.onChanged();
            } else {
                this.valueBuilder_.setMessage((AbstractMessage)value);
            }
            this.bitField0_ |= 4;
            return this;
        }

        public Builder setValue(MysqlxExpr.Expr.Builder builderForValue) {
            if (this.valueBuilder_ == null) {
                this.value_ = builderForValue.build();
                this.onChanged();
            } else {
                this.valueBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 4;
            return this;
        }

        public Builder mergeValue(MysqlxExpr.Expr value) {
            if (this.valueBuilder_ == null) {
                this.value_ = (this.bitField0_ & 4) != 0 && this.value_ != null && this.value_ != MysqlxExpr.Expr.getDefaultInstance() ? MysqlxExpr.Expr.newBuilder(this.value_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.valueBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 4;
            return this;
        }

        public Builder clearValue() {
            if (this.valueBuilder_ == null) {
                this.value_ = null;
                this.onChanged();
            } else {
                this.valueBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFFB;
            return this;
        }

        public MysqlxExpr.Expr.Builder getValueBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (MysqlxExpr.Expr.Builder)this.getValueFieldBuilder().getBuilder();
        }

        @Override
        public MysqlxExpr.ExprOrBuilder getValueOrBuilder() {
            if (this.valueBuilder_ != null) {
                return (MysqlxExpr.ExprOrBuilder)this.valueBuilder_.getMessageOrBuilder();
            }
            return this.value_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.value_;
        }

        private SingleFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> getValueFieldBuilder() {
            if (this.valueBuilder_ == null) {
                this.valueBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getValue(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.value_ = null;
            }
            return this.valueBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
        }
    }

    public static enum UpdateType implements ProtocolMessageEnum
    {
        SET(1),
        ITEM_REMOVE(2),
        ITEM_SET(3),
        ITEM_REPLACE(4),
        ITEM_MERGE(5),
        ARRAY_INSERT(6),
        ARRAY_APPEND(7),
        MERGE_PATCH(8);

        public static final int SET_VALUE = 1;
        public static final int ITEM_REMOVE_VALUE = 2;
        public static final int ITEM_SET_VALUE = 3;
        public static final int ITEM_REPLACE_VALUE = 4;
        public static final int ITEM_MERGE_VALUE = 5;
        public static final int ARRAY_INSERT_VALUE = 6;
        public static final int ARRAY_APPEND_VALUE = 7;
        public static final int MERGE_PATCH_VALUE = 8;
        private static final Internal.EnumLiteMap<UpdateType> internalValueMap;
        private static final UpdateType[] VALUES;
        private final int value;

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static UpdateType valueOf(int value) {
            return UpdateType.forNumber(value);
        }

        public static UpdateType forNumber(int value) {
            switch (value) {
                case 1: {
                    return SET;
                }
                case 2: {
                    return ITEM_REMOVE;
                }
                case 3: {
                    return ITEM_SET;
                }
                case 4: {
                    return ITEM_REPLACE;
                }
                case 5: {
                    return ITEM_MERGE;
                }
                case 6: {
                    return ARRAY_INSERT;
                }
                case 7: {
                    return ARRAY_APPEND;
                }
                case 8: {
                    return MERGE_PATCH;
                }
            }
            return null;
        }

        public static Internal.EnumLiteMap<UpdateType> internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return (Descriptors.EnumValueDescriptor)UpdateType.getDescriptor().getValues().get(this.ordinal());
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return UpdateType.getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return (Descriptors.EnumDescriptor)MysqlxCrud.UpdateOperation.getDescriptor().getEnumTypes().get(0);
        }

        public static UpdateType valueOf(Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != UpdateType.getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            return VALUES[desc.getIndex()];
        }

        private UpdateType(int value) {
            this.value = value;
        }

        static {
            internalValueMap = new Internal.EnumLiteMap<UpdateType>(){

                public UpdateType findValueByNumber(int number) {
                    return UpdateType.forNumber(number);
                }
            };
            VALUES = UpdateType.values();
        }
    }
}
