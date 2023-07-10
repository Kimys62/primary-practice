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

public static final class MysqlxCrud.Projection
extends GeneratedMessageV3
implements MysqlxCrud.ProjectionOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int SOURCE_FIELD_NUMBER = 1;
    private MysqlxExpr.Expr source_;
    public static final int ALIAS_FIELD_NUMBER = 2;
    private volatile Object alias_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxCrud.Projection DEFAULT_INSTANCE = new MysqlxCrud.Projection();
    @Deprecated
    public static final Parser<MysqlxCrud.Projection> PARSER = new AbstractParser<MysqlxCrud.Projection>(){

        public MysqlxCrud.Projection parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxCrud.Projection(input, extensionRegistry);
        }
    };

    private MysqlxCrud.Projection(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxCrud.Projection() {
        this.alias_ = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxCrud.Projection();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxCrud.Projection(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            subBuilder = this.source_.toBuilder();
                        }
                        this.source_ = (MysqlxExpr.Expr)input.readMessage(MysqlxExpr.Expr.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.source_);
                            this.source_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 1;
                        continue block11;
                    }
                    case 18: {
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.alias_ = bs;
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
        return internal_static_Mysqlx_Crud_Projection_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Crud_Projection_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.Projection.class, Builder.class);
    }

    @Override
    public boolean hasSource() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public MysqlxExpr.Expr getSource() {
        return this.source_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.source_;
    }

    @Override
    public MysqlxExpr.ExprOrBuilder getSourceOrBuilder() {
        return this.source_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.source_;
    }

    @Override
    public boolean hasAlias() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public String getAlias() {
        Object ref = this.alias_;
        if (ref instanceof String) {
            return (String)ref;
        }
        ByteString bs = (ByteString)ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
            this.alias_ = s;
        }
        return s;
    }

    @Override
    public ByteString getAliasBytes() {
        Object ref = this.alias_;
        if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)((String)ref));
            this.alias_ = b;
            return b;
        }
        return (ByteString)ref;
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
        if (!this.getSource().isInitialized()) {
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
            GeneratedMessageV3.writeString((CodedOutputStream)output, (int)2, (Object)this.alias_);
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
            size += GeneratedMessageV3.computeStringSize((int)2, (Object)this.alias_);
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxCrud.Projection)) {
            return super.equals(obj);
        }
        MysqlxCrud.Projection other = (MysqlxCrud.Projection)obj;
        if (this.hasSource() != other.hasSource()) {
            return false;
        }
        if (this.hasSource() && !this.getSource().equals(other.getSource())) {
            return false;
        }
        if (this.hasAlias() != other.hasAlias()) {
            return false;
        }
        if (this.hasAlias() && !this.getAlias().equals(other.getAlias())) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxCrud.Projection.getDescriptor().hashCode();
        if (this.hasSource()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getSource().hashCode();
        }
        if (this.hasAlias()) {
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getAlias().hashCode();
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxCrud.Projection parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Projection)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.Projection parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Projection)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.Projection parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Projection)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.Projection parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Projection)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.Projection parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Projection)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.Projection parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Projection)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.Projection parseFrom(InputStream input) throws IOException {
        return (MysqlxCrud.Projection)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxCrud.Projection parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.Projection)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxCrud.Projection parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxCrud.Projection)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxCrud.Projection parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.Projection)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxCrud.Projection parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxCrud.Projection)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxCrud.Projection parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.Projection)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxCrud.Projection.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxCrud.Projection prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxCrud.Projection getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxCrud.Projection> parser() {
        return PARSER;
    }

    public Parser<MysqlxCrud.Projection> getParserForType() {
        return PARSER;
    }

    public MysqlxCrud.Projection getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxCrud.ProjectionOrBuilder {
        private int bitField0_;
        private MysqlxExpr.Expr source_;
        private SingleFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> sourceBuilder_;
        private Object alias_ = "";

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Crud_Projection_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Crud_Projection_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.Projection.class, Builder.class);
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
            this.alias_ = "";
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Crud_Projection_descriptor;
        }

        public MysqlxCrud.Projection getDefaultInstanceForType() {
            return MysqlxCrud.Projection.getDefaultInstance();
        }

        public MysqlxCrud.Projection build() {
            MysqlxCrud.Projection result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxCrud.Projection buildPartial() {
            MysqlxCrud.Projection result = new MysqlxCrud.Projection(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
                if (this.sourceBuilder_ == null) {
                    result.source_ = this.source_;
                } else {
                    result.source_ = (MysqlxExpr.Expr)this.sourceBuilder_.build();
                }
                to_bitField0_ |= 1;
            }
            if ((from_bitField0_ & 2) != 0) {
                to_bitField0_ |= 2;
            }
            result.alias_ = this.alias_;
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
            if (other instanceof MysqlxCrud.Projection) {
                return this.mergeFrom((MysqlxCrud.Projection)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxCrud.Projection other) {
            if (other == MysqlxCrud.Projection.getDefaultInstance()) {
                return this;
            }
            if (other.hasSource()) {
                this.mergeSource(other.getSource());
            }
            if (other.hasAlias()) {
                this.bitField0_ |= 2;
                this.alias_ = other.alias_;
                this.onChanged();
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            if (!this.hasSource()) {
                return false;
            }
            return this.getSource().isInitialized();
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxCrud.Projection parsedMessage = null;
            try {
                parsedMessage = (MysqlxCrud.Projection)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxCrud.Projection)e.getUnfinishedMessage();
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
        public MysqlxExpr.Expr getSource() {
            if (this.sourceBuilder_ == null) {
                return this.source_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.source_;
            }
            return (MysqlxExpr.Expr)this.sourceBuilder_.getMessage();
        }

        public Builder setSource(MysqlxExpr.Expr value) {
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

        public Builder setSource(MysqlxExpr.Expr.Builder builderForValue) {
            if (this.sourceBuilder_ == null) {
                this.source_ = builderForValue.build();
                this.onChanged();
            } else {
                this.sourceBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 1;
            return this;
        }

        public Builder mergeSource(MysqlxExpr.Expr value) {
            if (this.sourceBuilder_ == null) {
                this.source_ = (this.bitField0_ & 1) != 0 && this.source_ != null && this.source_ != MysqlxExpr.Expr.getDefaultInstance() ? MysqlxExpr.Expr.newBuilder(this.source_).mergeFrom(value).buildPartial() : value;
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

        public MysqlxExpr.Expr.Builder getSourceBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (MysqlxExpr.Expr.Builder)this.getSourceFieldBuilder().getBuilder();
        }

        @Override
        public MysqlxExpr.ExprOrBuilder getSourceOrBuilder() {
            if (this.sourceBuilder_ != null) {
                return (MysqlxExpr.ExprOrBuilder)this.sourceBuilder_.getMessageOrBuilder();
            }
            return this.source_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.source_;
        }

        private SingleFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> getSourceFieldBuilder() {
            if (this.sourceBuilder_ == null) {
                this.sourceBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getSource(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.source_ = null;
            }
            return this.sourceBuilder_;
        }

        @Override
        public boolean hasAlias() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public String getAlias() {
            Object ref = this.alias_;
            if (!(ref instanceof String)) {
                ByteString bs = (ByteString)ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    this.alias_ = s;
                }
                return s;
            }
            return (String)ref;
        }

        @Override
        public ByteString getAliasBytes() {
            Object ref = this.alias_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String)((String)ref));
                this.alias_ = b;
                return b;
            }
            return (ByteString)ref;
        }

        public Builder setAlias(String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 2;
            this.alias_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearAlias() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.alias_ = MysqlxCrud.Projection.getDefaultInstance().getAlias();
            this.onChanged();
            return this;
        }

        public Builder setAliasBytes(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 2;
            this.alias_ = value;
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
