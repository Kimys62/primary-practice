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
import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.mysql.cj.x.protobuf.MysqlxExpr;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public static final class MysqlxCrud.Insert.TypedRow
extends GeneratedMessageV3
implements MysqlxCrud.Insert.TypedRowOrBuilder {
    private static final long serialVersionUID = 0L;
    public static final int FIELD_FIELD_NUMBER = 1;
    private List<MysqlxExpr.Expr> field_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxCrud.Insert.TypedRow DEFAULT_INSTANCE = new MysqlxCrud.Insert.TypedRow();
    @Deprecated
    public static final Parser<MysqlxCrud.Insert.TypedRow> PARSER = new AbstractParser<MysqlxCrud.Insert.TypedRow>(){

        public MysqlxCrud.Insert.TypedRow parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxCrud.Insert.TypedRow(input, extensionRegistry);
        }
    };

    private MysqlxCrud.Insert.TypedRow(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxCrud.Insert.TypedRow() {
        this.field_ = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxCrud.Insert.TypedRow();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxCrud.Insert.TypedRow(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.field_ = new ArrayList<MysqlxExpr.Expr>();
                            mutable_bitField0_ |= true;
                        }
                        this.field_.add((MysqlxExpr.Expr)input.readMessage(MysqlxExpr.Expr.PARSER, extensionRegistry));
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
                this.field_ = Collections.unmodifiableList(this.field_);
            }
            this.unknownFields = unknownFields.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Crud_Insert_TypedRow_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Crud_Insert_TypedRow_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.Insert.TypedRow.class, Builder.class);
    }

    @Override
    public List<MysqlxExpr.Expr> getFieldList() {
        return this.field_;
    }

    @Override
    public List<? extends MysqlxExpr.ExprOrBuilder> getFieldOrBuilderList() {
        return this.field_;
    }

    @Override
    public int getFieldCount() {
        return this.field_.size();
    }

    @Override
    public MysqlxExpr.Expr getField(int index) {
        return this.field_.get(index);
    }

    @Override
    public MysqlxExpr.ExprOrBuilder getFieldOrBuilder(int index) {
        return this.field_.get(index);
    }

    public final boolean isInitialized() {
        byte isInitialized = this.memoizedIsInitialized;
        if (isInitialized == 1) {
            return true;
        }
        if (isInitialized == 0) {
            return false;
        }
        for (int i = 0; i < this.getFieldCount(); ++i) {
            if (this.getField(i).isInitialized()) continue;
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        for (int i = 0; i < this.field_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.field_.get(i));
        }
        this.unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
        int size = this.memoizedSize;
        if (size != -1) {
            return size;
        }
        size = 0;
        for (int i = 0; i < this.field_.size(); ++i) {
            size += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.field_.get(i)));
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxCrud.Insert.TypedRow)) {
            return super.equals(obj);
        }
        MysqlxCrud.Insert.TypedRow other = (MysqlxCrud.Insert.TypedRow)obj;
        if (!this.getFieldList().equals(other.getFieldList())) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxCrud.Insert.TypedRow.getDescriptor().hashCode();
        if (this.getFieldCount() > 0) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getFieldList().hashCode();
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxCrud.Insert.TypedRow parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Insert.TypedRow)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.Insert.TypedRow parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Insert.TypedRow)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.Insert.TypedRow parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Insert.TypedRow)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.Insert.TypedRow parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Insert.TypedRow)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.Insert.TypedRow parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Insert.TypedRow)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.Insert.TypedRow parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Insert.TypedRow)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.Insert.TypedRow parseFrom(InputStream input) throws IOException {
        return (MysqlxCrud.Insert.TypedRow)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxCrud.Insert.TypedRow parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.Insert.TypedRow)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxCrud.Insert.TypedRow parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxCrud.Insert.TypedRow)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxCrud.Insert.TypedRow parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.Insert.TypedRow)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxCrud.Insert.TypedRow parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxCrud.Insert.TypedRow)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxCrud.Insert.TypedRow parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.Insert.TypedRow)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxCrud.Insert.TypedRow.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxCrud.Insert.TypedRow prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxCrud.Insert.TypedRow getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxCrud.Insert.TypedRow> parser() {
        return PARSER;
    }

    public Parser<MysqlxCrud.Insert.TypedRow> getParserForType() {
        return PARSER;
    }

    public MysqlxCrud.Insert.TypedRow getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxCrud.Insert.TypedRowOrBuilder {
        private int bitField0_;
        private List<MysqlxExpr.Expr> field_ = Collections.emptyList();
        private RepeatedFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> fieldBuilder_;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Crud_Insert_TypedRow_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Crud_Insert_TypedRow_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.Insert.TypedRow.class, Builder.class);
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
                this.getFieldFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            if (this.fieldBuilder_ == null) {
                this.field_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFFE;
            } else {
                this.fieldBuilder_.clear();
            }
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Crud_Insert_TypedRow_descriptor;
        }

        public MysqlxCrud.Insert.TypedRow getDefaultInstanceForType() {
            return MysqlxCrud.Insert.TypedRow.getDefaultInstance();
        }

        public MysqlxCrud.Insert.TypedRow build() {
            MysqlxCrud.Insert.TypedRow result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxCrud.Insert.TypedRow buildPartial() {
            MysqlxCrud.Insert.TypedRow result = new MysqlxCrud.Insert.TypedRow(this);
            int from_bitField0_ = this.bitField0_;
            if (this.fieldBuilder_ == null) {
                if ((this.bitField0_ & 1) != 0) {
                    this.field_ = Collections.unmodifiableList(this.field_);
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.field_ = this.field_;
            } else {
                result.field_ = this.fieldBuilder_.build();
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
            if (other instanceof MysqlxCrud.Insert.TypedRow) {
                return this.mergeFrom((MysqlxCrud.Insert.TypedRow)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxCrud.Insert.TypedRow other) {
            if (other == MysqlxCrud.Insert.TypedRow.getDefaultInstance()) {
                return this;
            }
            if (this.fieldBuilder_ == null) {
                if (!other.field_.isEmpty()) {
                    if (this.field_.isEmpty()) {
                        this.field_ = other.field_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    } else {
                        this.ensureFieldIsMutable();
                        this.field_.addAll(other.field_);
                    }
                    this.onChanged();
                }
            } else if (!other.field_.isEmpty()) {
                if (this.fieldBuilder_.isEmpty()) {
                    this.fieldBuilder_.dispose();
                    this.fieldBuilder_ = null;
                    this.field_ = other.field_;
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.fieldBuilder_ = alwaysUseFieldBuilders ? this.getFieldFieldBuilder() : null;
                } else {
                    this.fieldBuilder_.addAllMessages((Iterable)other.field_);
                }
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            for (int i = 0; i < this.getFieldCount(); ++i) {
                if (this.getField(i).isInitialized()) continue;
                return false;
            }
            return true;
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxCrud.Insert.TypedRow parsedMessage = null;
            try {
                parsedMessage = (MysqlxCrud.Insert.TypedRow)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxCrud.Insert.TypedRow)e.getUnfinishedMessage();
                throw e.unwrapIOException();
            }
            finally {
                if (parsedMessage != null) {
                    this.mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private void ensureFieldIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.field_ = new ArrayList<MysqlxExpr.Expr>(this.field_);
                this.bitField0_ |= 1;
            }
        }

        @Override
        public List<MysqlxExpr.Expr> getFieldList() {
            if (this.fieldBuilder_ == null) {
                return Collections.unmodifiableList(this.field_);
            }
            return this.fieldBuilder_.getMessageList();
        }

        @Override
        public int getFieldCount() {
            if (this.fieldBuilder_ == null) {
                return this.field_.size();
            }
            return this.fieldBuilder_.getCount();
        }

        @Override
        public MysqlxExpr.Expr getField(int index) {
            if (this.fieldBuilder_ == null) {
                return this.field_.get(index);
            }
            return (MysqlxExpr.Expr)this.fieldBuilder_.getMessage(index);
        }

        public Builder setField(int index, MysqlxExpr.Expr value) {
            if (this.fieldBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureFieldIsMutable();
                this.field_.set(index, value);
                this.onChanged();
            } else {
                this.fieldBuilder_.setMessage(index, (AbstractMessage)value);
            }
            return this;
        }

        public Builder setField(int index, MysqlxExpr.Expr.Builder builderForValue) {
            if (this.fieldBuilder_ == null) {
                this.ensureFieldIsMutable();
                this.field_.set(index, builderForValue.build());
                this.onChanged();
            } else {
                this.fieldBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addField(MysqlxExpr.Expr value) {
            if (this.fieldBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureFieldIsMutable();
                this.field_.add(value);
                this.onChanged();
            } else {
                this.fieldBuilder_.addMessage((AbstractMessage)value);
            }
            return this;
        }

        public Builder addField(int index, MysqlxExpr.Expr value) {
            if (this.fieldBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureFieldIsMutable();
                this.field_.add(index, value);
                this.onChanged();
            } else {
                this.fieldBuilder_.addMessage(index, (AbstractMessage)value);
            }
            return this;
        }

        public Builder addField(MysqlxExpr.Expr.Builder builderForValue) {
            if (this.fieldBuilder_ == null) {
                this.ensureFieldIsMutable();
                this.field_.add(builderForValue.build());
                this.onChanged();
            } else {
                this.fieldBuilder_.addMessage((AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addField(int index, MysqlxExpr.Expr.Builder builderForValue) {
            if (this.fieldBuilder_ == null) {
                this.ensureFieldIsMutable();
                this.field_.add(index, builderForValue.build());
                this.onChanged();
            } else {
                this.fieldBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
            }
            return this;
        }

        public Builder addAllField(Iterable<? extends MysqlxExpr.Expr> values) {
            if (this.fieldBuilder_ == null) {
                this.ensureFieldIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.field_);
                this.onChanged();
            } else {
                this.fieldBuilder_.addAllMessages(values);
            }
            return this;
        }

        public Builder clearField() {
            if (this.fieldBuilder_ == null) {
                this.field_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
            } else {
                this.fieldBuilder_.clear();
            }
            return this;
        }

        public Builder removeField(int index) {
            if (this.fieldBuilder_ == null) {
                this.ensureFieldIsMutable();
                this.field_.remove(index);
                this.onChanged();
            } else {
                this.fieldBuilder_.remove(index);
            }
            return this;
        }

        public MysqlxExpr.Expr.Builder getFieldBuilder(int index) {
            return (MysqlxExpr.Expr.Builder)this.getFieldFieldBuilder().getBuilder(index);
        }

        @Override
        public MysqlxExpr.ExprOrBuilder getFieldOrBuilder(int index) {
            if (this.fieldBuilder_ == null) {
                return this.field_.get(index);
            }
            return (MysqlxExpr.ExprOrBuilder)this.fieldBuilder_.getMessageOrBuilder(index);
        }

        @Override
        public List<? extends MysqlxExpr.ExprOrBuilder> getFieldOrBuilderList() {
            if (this.fieldBuilder_ != null) {
                return this.fieldBuilder_.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.field_);
        }

        public MysqlxExpr.Expr.Builder addFieldBuilder() {
            return (MysqlxExpr.Expr.Builder)this.getFieldFieldBuilder().addBuilder((AbstractMessage)MysqlxExpr.Expr.getDefaultInstance());
        }

        public MysqlxExpr.Expr.Builder addFieldBuilder(int index) {
            return (MysqlxExpr.Expr.Builder)this.getFieldFieldBuilder().addBuilder(index, (AbstractMessage)MysqlxExpr.Expr.getDefaultInstance());
        }

        public List<MysqlxExpr.Expr.Builder> getFieldBuilderList() {
            return this.getFieldFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> getFieldFieldBuilder() {
            if (this.fieldBuilder_ == null) {
                this.fieldBuilder_ = new RepeatedFieldBuilderV3(this.field_, (this.bitField0_ & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.field_ = null;
            }
            return this.fieldBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
        }
    }
}
