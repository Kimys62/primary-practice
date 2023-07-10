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

public static final class MysqlxCrud.Order
extends GeneratedMessageV3
implements MysqlxCrud.OrderOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int EXPR_FIELD_NUMBER = 1;
    private MysqlxExpr.Expr expr_;
    public static final int DIRECTION_FIELD_NUMBER = 2;
    private int direction_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxCrud.Order DEFAULT_INSTANCE = new MysqlxCrud.Order();
    @Deprecated
    public static final Parser<MysqlxCrud.Order> PARSER = new AbstractParser<MysqlxCrud.Order>(){

        public MysqlxCrud.Order parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxCrud.Order(input, extensionRegistry);
        }
    };

    private MysqlxCrud.Order(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxCrud.Order() {
        this.direction_ = 1;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxCrud.Order();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxCrud.Order(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            subBuilder = this.expr_.toBuilder();
                        }
                        this.expr_ = (MysqlxExpr.Expr)input.readMessage(MysqlxExpr.Expr.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.expr_);
                            this.expr_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 1;
                        continue block11;
                    }
                    case 16: {
                        int rawValue = input.readEnum();
                        Direction value = Direction.valueOf(rawValue);
                        if (value == null) {
                            unknownFields.mergeVarintField(2, rawValue);
                            continue block11;
                        }
                        this.bitField0_ |= 2;
                        this.direction_ = rawValue;
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
        return internal_static_Mysqlx_Crud_Order_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Crud_Order_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.Order.class, Builder.class);
    }

    @Override
    public boolean hasExpr() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public MysqlxExpr.Expr getExpr() {
        return this.expr_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.expr_;
    }

    @Override
    public MysqlxExpr.ExprOrBuilder getExprOrBuilder() {
        return this.expr_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.expr_;
    }

    @Override
    public boolean hasDirection() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public Direction getDirection() {
        Direction result = Direction.valueOf(this.direction_);
        return result == null ? Direction.ASC : result;
    }

    public final boolean isInitialized() {
        byte isInitialized = this.memoizedIsInitialized;
        if (isInitialized == 1) {
            return true;
        }
        if (isInitialized == 0) {
            return false;
        }
        if (!this.hasExpr()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (!this.getExpr().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, (MessageLite)this.getExpr());
        }
        if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(2, this.direction_);
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
            size += CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.getExpr());
        }
        if ((this.bitField0_ & 2) != 0) {
            size += CodedOutputStream.computeEnumSize((int)2, (int)this.direction_);
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxCrud.Order)) {
            return super.equals(obj);
        }
        MysqlxCrud.Order other = (MysqlxCrud.Order)obj;
        if (this.hasExpr() != other.hasExpr()) {
            return false;
        }
        if (this.hasExpr() && !this.getExpr().equals(other.getExpr())) {
            return false;
        }
        if (this.hasDirection() != other.hasDirection()) {
            return false;
        }
        if (this.hasDirection() && this.direction_ != other.direction_) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxCrud.Order.getDescriptor().hashCode();
        if (this.hasExpr()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getExpr().hashCode();
        }
        if (this.hasDirection()) {
            hash = 37 * hash + 2;
            hash = 53 * hash + this.direction_;
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxCrud.Order parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Order)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.Order parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Order)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.Order parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Order)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.Order parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Order)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.Order parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Order)PARSER.parseFrom(data);
    }

    public static MysqlxCrud.Order parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxCrud.Order)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxCrud.Order parseFrom(InputStream input) throws IOException {
        return (MysqlxCrud.Order)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxCrud.Order parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.Order)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxCrud.Order parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxCrud.Order)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxCrud.Order parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.Order)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxCrud.Order parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxCrud.Order)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxCrud.Order parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxCrud.Order)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxCrud.Order.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxCrud.Order prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxCrud.Order getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxCrud.Order> parser() {
        return PARSER;
    }

    public Parser<MysqlxCrud.Order> getParserForType() {
        return PARSER;
    }

    public MysqlxCrud.Order getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxCrud.OrderOrBuilder {
        private int bitField0_;
        private MysqlxExpr.Expr expr_;
        private SingleFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> exprBuilder_;
        private int direction_ = 1;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Crud_Order_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Crud_Order_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.Order.class, Builder.class);
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
                this.getExprFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            if (this.exprBuilder_ == null) {
                this.expr_ = null;
            } else {
                this.exprBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFFE;
            this.direction_ = 1;
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Crud_Order_descriptor;
        }

        public MysqlxCrud.Order getDefaultInstanceForType() {
            return MysqlxCrud.Order.getDefaultInstance();
        }

        public MysqlxCrud.Order build() {
            MysqlxCrud.Order result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxCrud.Order buildPartial() {
            MysqlxCrud.Order result = new MysqlxCrud.Order(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
                if (this.exprBuilder_ == null) {
                    result.expr_ = this.expr_;
                } else {
                    result.expr_ = (MysqlxExpr.Expr)this.exprBuilder_.build();
                }
                to_bitField0_ |= 1;
            }
            if ((from_bitField0_ & 2) != 0) {
                to_bitField0_ |= 2;
            }
            result.direction_ = this.direction_;
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
            if (other instanceof MysqlxCrud.Order) {
                return this.mergeFrom((MysqlxCrud.Order)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxCrud.Order other) {
            if (other == MysqlxCrud.Order.getDefaultInstance()) {
                return this;
            }
            if (other.hasExpr()) {
                this.mergeExpr(other.getExpr());
            }
            if (other.hasDirection()) {
                this.setDirection(other.getDirection());
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            if (!this.hasExpr()) {
                return false;
            }
            return this.getExpr().isInitialized();
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxCrud.Order parsedMessage = null;
            try {
                parsedMessage = (MysqlxCrud.Order)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxCrud.Order)e.getUnfinishedMessage();
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
        public boolean hasExpr() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public MysqlxExpr.Expr getExpr() {
            if (this.exprBuilder_ == null) {
                return this.expr_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.expr_;
            }
            return (MysqlxExpr.Expr)this.exprBuilder_.getMessage();
        }

        public Builder setExpr(MysqlxExpr.Expr value) {
            if (this.exprBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.expr_ = value;
                this.onChanged();
            } else {
                this.exprBuilder_.setMessage((AbstractMessage)value);
            }
            this.bitField0_ |= 1;
            return this;
        }

        public Builder setExpr(MysqlxExpr.Expr.Builder builderForValue) {
            if (this.exprBuilder_ == null) {
                this.expr_ = builderForValue.build();
                this.onChanged();
            } else {
                this.exprBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 1;
            return this;
        }

        public Builder mergeExpr(MysqlxExpr.Expr value) {
            if (this.exprBuilder_ == null) {
                this.expr_ = (this.bitField0_ & 1) != 0 && this.expr_ != null && this.expr_ != MysqlxExpr.Expr.getDefaultInstance() ? MysqlxExpr.Expr.newBuilder(this.expr_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.exprBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 1;
            return this;
        }

        public Builder clearExpr() {
            if (this.exprBuilder_ == null) {
                this.expr_ = null;
                this.onChanged();
            } else {
                this.exprBuilder_.clear();
            }
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }

        public MysqlxExpr.Expr.Builder getExprBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (MysqlxExpr.Expr.Builder)this.getExprFieldBuilder().getBuilder();
        }

        @Override
        public MysqlxExpr.ExprOrBuilder getExprOrBuilder() {
            if (this.exprBuilder_ != null) {
                return (MysqlxExpr.ExprOrBuilder)this.exprBuilder_.getMessageOrBuilder();
            }
            return this.expr_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.expr_;
        }

        private SingleFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> getExprFieldBuilder() {
            if (this.exprBuilder_ == null) {
                this.exprBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getExpr(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
                this.expr_ = null;
            }
            return this.exprBuilder_;
        }

        @Override
        public boolean hasDirection() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public Direction getDirection() {
            Direction result = Direction.valueOf(this.direction_);
            return result == null ? Direction.ASC : result;
        }

        public Builder setDirection(Direction value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 2;
            this.direction_ = value.getNumber();
            this.onChanged();
            return this;
        }

        public Builder clearDirection() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.direction_ = 1;
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

    public static enum Direction implements ProtocolMessageEnum
    {
        ASC(1),
        DESC(2);

        public static final int ASC_VALUE = 1;
        public static final int DESC_VALUE = 2;
        private static final Internal.EnumLiteMap<Direction> internalValueMap;
        private static final Direction[] VALUES;
        private final int value;

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static Direction valueOf(int value) {
            return Direction.forNumber(value);
        }

        public static Direction forNumber(int value) {
            switch (value) {
                case 1: {
                    return ASC;
                }
                case 2: {
                    return DESC;
                }
            }
            return null;
        }

        public static Internal.EnumLiteMap<Direction> internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return (Descriptors.EnumValueDescriptor)Direction.getDescriptor().getValues().get(this.ordinal());
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return Direction.getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return (Descriptors.EnumDescriptor)MysqlxCrud.Order.getDescriptor().getEnumTypes().get(0);
        }

        public static Direction valueOf(Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != Direction.getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            return VALUES[desc.getIndex()];
        }

        private Direction(int value) {
            this.value = value;
        }

        static {
            internalValueMap = new Internal.EnumLiteMap<Direction>(){

                public Direction findValueByNumber(int number) {
                    return Direction.forNumber(number);
                }
            };
            VALUES = Direction.values();
        }
    }
}
