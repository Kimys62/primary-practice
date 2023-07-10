/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
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
 *  com.google.protobuf.RepeatedFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxExpr;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public static final class MysqlxExpr.Array
extends GeneratedMessageV3
implements MysqlxExpr.ArrayOrBuilder {
    private static final long serialVersionUID = 0L;
    public static final int VALUE_FIELD_NUMBER = 1;
    private List<MysqlxExpr.Expr> value_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxExpr.Array DEFAULT_INSTANCE = new MysqlxExpr.Array();
    @Deprecated
    public static final Parser<MysqlxExpr.Array> PARSER = new AbstractParser<MysqlxExpr.Array>(){

        public MysqlxExpr.Array parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxExpr.Array(input, extensionRegistry);
        }
    };

    private MysqlxExpr.Array(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxExpr.Array() {
        this.value_ = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxExpr.Array();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxExpr.Array(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
        }
        boolean mutable_bitField0_ = false;
        UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
        try {
            boolean done = false;
            block10: while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0: {
                        done = true;
                        continue block10;
                    }
                    case 10: {
                        if (!(mutable_bitField0_ & true)) {
                            this.value_ = new ArrayList<MysqlxExpr.Expr>();
                            mutable_bitField0_ |= true;
                        }
                        this.value_.add((MysqlxExpr.Expr)input.readMessage(MysqlxExpr.Expr.PARSER, extensionRegistry));
                        continue block10;
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
            if (mutable_bitField0_ & true) {
                this.value_ = Collections.unmodifiableList(this.value_);
            }
            this.unknownFields = unknownFields.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Expr_Array_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Expr_Array_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxExpr.Array.class, Builder.class);
    }

    @Override
    public List<MysqlxExpr.Expr> getValueList() {
        return this.value_;
    }

    @Override
    public List<? extends MysqlxExpr.ExprOrBuilder> getValueOrBuilderList() {
        return this.value_;
    }

    @Override
    public int getValueCount() {
        return this.value_.size();
    }

    @Override
    public MysqlxExpr.Expr getValue(int index) {
        return this.value_.get(index);
    }

    @Override
    public MysqlxExpr.ExprOrBuilder getValueOrBuilder(int index) {
        return this.value_.get(index);
    }

    public final boolean isInitialized() {
        byte isInitialized = this.memoizedIsInitialized;
        if (isInitialized == 1) {
            return true;
        }
        if (isInitialized == 0) {
            return false;
        }
        for (int i = 0; i < this.getValueCount(); ++i) {
            if (this.getValue(i).isInitialized()) continue;
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        for (int i = 0; i < this.value_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.value_.get(i));
        }
        this.unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
        int size = this.memoizedSize;
        if (size != -1) {
            return size;
        }
        size = 0;
        for (int i = 0; i < this.value_.size(); ++i) {
            size += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.value_.get(i)));
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxExpr.Array)) {
            return super.equals(obj);
        }
        MysqlxExpr.Array other = (MysqlxExpr.Array)obj;
        if (!this.getValueList().equals(other.getValueList())) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxExpr.Array.getDescriptor().hashCode();
        if (this.getValueCount() > 0) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getValueList().hashCode();
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxExpr.Array parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxExpr.Array)PARSER.parseFrom(data);
    }

    public static MysqlxExpr.Array parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxExpr.Array)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxExpr.Array parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxExpr.Array)PARSER.parseFrom(data);
    }

    public static MysqlxExpr.Array parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxExpr.Array)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxExpr.Array parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxExpr.Array)PARSER.parseFrom(data);
    }

    public static MysqlxExpr.Array parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxExpr.Array)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxExpr.Array parseFrom(InputStream input) throws IOException {
        return (MysqlxExpr.Array)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxExpr.Array parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxExpr.Array)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxExpr.Array parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxExpr.Array)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxExpr.Array parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxExpr.Array)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxExpr.Array parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxExpr.Array)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxExpr.Array parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxExpr.Array)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxExpr.Array.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxExpr.Array prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxExpr.Array getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxExpr.Array> parser() {
        return PARSER;
    }

    public Parser<MysqlxExpr.Array> getParserForType() {
        return PARSER;
    }

    public MysqlxExpr.Array getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxExpr.ArrayOrBuilder {
        private int bitField0_;
        private List<MysqlxExpr.Expr> value_ = Collections.emptyList();
        private RepeatedFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> valueBuilder_;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Expr_Array_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Expr_Array_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxExpr.Array.class, Builder.class);
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
                this.getValueFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            if (this.valueBuilder_ == null) {
                this.value_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFFE;
            } else {
                this.valueBuilder_.clear();
            }
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Expr_Array_descriptor;
        }

        public MysqlxExpr.Array getDefaultInstanceForType() {
            return MysqlxExpr.Array.getDefaultInstance();
        }

        public MysqlxExpr.Array build() {
            MysqlxExpr.Array result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxExpr.Array buildPartial() {
            MysqlxExpr.Array result = new MysqlxExpr.Array(this);
            int from_bitField0_ = this.bitField0_;
            if (this.valueBuilder_ == null) {
                if ((this.bitField0_ & 1) != 0) {
                    this.value_ = Collections.unmodifiableList(this.value_);
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.value_ = this.value_;
            } else {
                result.value_ = this.valueBuilder_.build();
            }
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
            if (other instanceof MysqlxExpr.Array) {
                return this.mergeFrom((MysqlxExpr.Array)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxExpr.Array other) {
            if (other == MysqlxExpr.Array.getDefaultInstance()) {
                return this;
            }
            if (this.valueBuilder_ == null) {
                if (!other.value_.isEmpty()) {
                    if (this.value_.isEmpty()) {
                        this.value_ = other.value_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    } else {
                        this.ensureValueIsMutable();
                        this.value_.addAll(other.value_);
                    }
                    this.onChanged();
                }
            } else if (!other.value_.isEmpty()) {
                if (this.valueBuilder_.isEmpty()) {
                    this.valueBuilder_.dispose();
                    this.valueBuilder_ = null;
                    this.value_ = other.value_;
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.valueBuilder_ = alwaysUseFieldBuilders ? this.getValueFieldBuilder() : null;
                } else {
                    this.valueBuilder_.addAllMessages((Iterable)other.value_);
                }
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            for (int i = 0; i < this.getValueCount(); ++i) {
                if (this.getValue(i).isInitialized()) continue;
                return false;
            }
            return true;
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxExpr.Array parsedMessage = null;
            try {
                parsedMessage = (MysqlxExpr.Array)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxExpr.Array)e.getUnfinishedMessage();
                throw e.unwrapIOException();
            }
            finally {
                if (parsedMessage != null) {
                    this.mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private void ensureValueIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.value_ = new ArrayList<MysqlxExpr.Expr>(this.value_);
                this.bitField0_ |= 1;
            }
        }

        @Override
        public List<MysqlxExpr.Expr> getValueList() {
            if (this.valueBuilder_ == null) {
                return Collections.unmodifiableList(this.value_);
            }
            return this.valueBuilder_.getMessageList();
        }

        @Override
        public int getValueCount() {
            if (this.valueBuilder_ == null) {
                return this.value_.size();
            }
            return this.valueBuilder_.getCount();
        }

        @Override
        public MysqlxExpr.Expr getValue(int index) {
            if (this.valueBuilder_ == null) {
                return this.value_.get(index);
            }
            return (MysqlxExpr.Expr)this.valueBuilder_.getMessage(index);
        }

        public Builder setValue(int index, MysqlxExpr.Expr value) {
            if (this.valueBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureValueIsMutable();
                this.value_.set(index, value);
                this.onChanged();
            } else {
                this.valueBuilder_.setMessage(index, (AbstractMessage)value);
            }
            return this;
        }

        public Builder setValue(int index, MysqlxExpr.Expr.Builder builderForValue) {
            if (this.valueBuilder_ == null) {
                this.ensureValueIsMutable();
                this.value_.set(index, builderForValue.build());
                this.onChanged();
            } else {
                this.valueBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addValue(MysqlxExpr.Expr value) {
            if (this.valueBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureValueIsMutable();
                this.value_.add(value);
                this.onChanged();
            } else {
                this.valueBuilder_.addMessage((AbstractMessage)value);
            }
            return this;
        }

        public Builder addValue(int index, MysqlxExpr.Expr value) {
            if (this.valueBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureValueIsMutable();
                this.value_.add(index, value);
                this.onChanged();
            } else {
                this.valueBuilder_.addMessage(index, (AbstractMessage)value);
            }
            return this;
        }

        public Builder addValue(MysqlxExpr.Expr.Builder builderForValue) {
            if (this.valueBuilder_ == null) {
                this.ensureValueIsMutable();
                this.value_.add(builderForValue.build());
                this.onChanged();
            } else {
                this.valueBuilder_.addMessage((AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addValue(int index, MysqlxExpr.Expr.Builder builderForValue) {
            if (this.valueBuilder_ == null) {
                this.ensureValueIsMutable();
                this.value_.add(index, builderForValue.build());
                this.onChanged();
            } else {
                this.valueBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addAllValue(Iterable<? extends MysqlxExpr.Expr> values) {
            if (this.valueBuilder_ == null) {
                this.ensureValueIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.value_);
                this.onChanged();
            } else {
                this.valueBuilder_.addAllMessages(values);
            }
            return this;
        }

        public Builder clearValue() {
            if (this.valueBuilder_ == null) {
                this.value_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
            } else {
                this.valueBuilder_.clear();
            }
            return this;
        }

        public Builder removeValue(int index) {
            if (this.valueBuilder_ == null) {
                this.ensureValueIsMutable();
                this.value_.remove(index);
                this.onChanged();
            } else {
                this.valueBuilder_.remove(index);
            }
            return this;
        }

        public MysqlxExpr.Expr.Builder getValueBuilder(int index) {
            return (MysqlxExpr.Expr.Builder)this.getValueFieldBuilder().getBuilder(index);
        }

        @Override
        public MysqlxExpr.ExprOrBuilder getValueOrBuilder(int index) {
            if (this.valueBuilder_ == null) {
                return this.value_.get(index);
            }
            return (MysqlxExpr.ExprOrBuilder)this.valueBuilder_.getMessageOrBuilder(index);
        }

        @Override
        public List<? extends MysqlxExpr.ExprOrBuilder> getValueOrBuilderList() {
            if (this.valueBuilder_ != null) {
                return this.valueBuilder_.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.value_);
        }

        public MysqlxExpr.Expr.Builder addValueBuilder() {
            return (MysqlxExpr.Expr.Builder)this.getValueFieldBuilder().addBuilder((AbstractMessage)MysqlxExpr.Expr.getDefaultInstance());
        }

        public MysqlxExpr.Expr.Builder addValueBuilder(int index) {
            return (MysqlxExpr.Expr.Builder)this.getValueFieldBuilder().addBuilder(index, (AbstractMessage)MysqlxExpr.Expr.getDefaultInstance());
        }

        public List<MysqlxExpr.Expr.Builder> getValueBuilderList() {
            return this.getValueFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> getValueFieldBuilder() {
            if (this.valueBuilder_ == null) {
                this.valueBuilder_ = new RepeatedFieldBuilderV3(this.value_, (this.bitField0_ & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
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
}
