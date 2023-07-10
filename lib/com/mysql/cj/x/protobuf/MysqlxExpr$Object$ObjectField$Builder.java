/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.SingleFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxExpr;
import java.io.IOException;

public static final class MysqlxExpr.Object.ObjectField.Builder
extends GeneratedMessageV3.Builder<MysqlxExpr.Object.ObjectField.Builder>
implements MysqlxExpr.Object.ObjectFieldOrBuilder {
    private int bitField0_;
    private Object key_ = "";
    private MysqlxExpr.Expr value_;
    private SingleFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> valueBuilder_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Expr_Object_ObjectField_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Expr_Object_ObjectField_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxExpr.Object.ObjectField.class, MysqlxExpr.Object.ObjectField.Builder.class);
    }

    private MysqlxExpr.Object.ObjectField.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxExpr.Object.ObjectField.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            this.getValueFieldBuilder();
        }
    }

    public MysqlxExpr.Object.ObjectField.Builder clear() {
        super.clear();
        this.key_ = "";
        this.bitField0_ &= 0xFFFFFFFE;
        if (this.valueBuilder_ == null) {
            this.value_ = null;
        } else {
            this.valueBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Expr_Object_ObjectField_descriptor;
    }

    public MysqlxExpr.Object.ObjectField getDefaultInstanceForType() {
        return MysqlxExpr.Object.ObjectField.getDefaultInstance();
    }

    public MysqlxExpr.Object.ObjectField build() {
        MysqlxExpr.Object.ObjectField result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxExpr.Object.ObjectField.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxExpr.Object.ObjectField buildPartial() {
        MysqlxExpr.Object.ObjectField result = new MysqlxExpr.Object.ObjectField(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            to_bitField0_ |= 1;
        }
        result.key_ = this.key_;
        if ((from_bitField0_ & 2) != 0) {
            if (this.valueBuilder_ == null) {
                result.value_ = this.value_;
            } else {
                result.value_ = (MysqlxExpr.Expr)this.valueBuilder_.build();
            }
            to_bitField0_ |= 2;
        }
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxExpr.Object.ObjectField.Builder clone() {
        return (MysqlxExpr.Object.ObjectField.Builder)super.clone();
    }

    public MysqlxExpr.Object.ObjectField.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxExpr.Object.ObjectField.Builder)super.setField(field, value);
    }

    public MysqlxExpr.Object.ObjectField.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxExpr.Object.ObjectField.Builder)super.clearField(field);
    }

    public MysqlxExpr.Object.ObjectField.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxExpr.Object.ObjectField.Builder)super.clearOneof(oneof);
    }

    public MysqlxExpr.Object.ObjectField.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxExpr.Object.ObjectField.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxExpr.Object.ObjectField.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxExpr.Object.ObjectField.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxExpr.Object.ObjectField.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxExpr.Object.ObjectField) {
            return this.mergeFrom((MysqlxExpr.Object.ObjectField)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxExpr.Object.ObjectField.Builder mergeFrom(MysqlxExpr.Object.ObjectField other) {
        if (other == MysqlxExpr.Object.ObjectField.getDefaultInstance()) {
            return this;
        }
        if (other.hasKey()) {
            this.bitField0_ |= 1;
            this.key_ = other.key_;
            this.onChanged();
        }
        if (other.hasValue()) {
            this.mergeValue(other.getValue());
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.hasKey()) {
            return false;
        }
        if (!this.hasValue()) {
            return false;
        }
        return this.getValue().isInitialized();
    }

    public MysqlxExpr.Object.ObjectField.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxExpr.Object.ObjectField parsedMessage = null;
        try {
            parsedMessage = (MysqlxExpr.Object.ObjectField)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxExpr.Object.ObjectField)e.getUnfinishedMessage();
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
    public boolean hasKey() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public String getKey() {
        Object ref = this.key_;
        if (!(ref instanceof String)) {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.key_ = s;
            }
            return s;
        }
        return (String)ref;
    }

    @Override
    public ByteString getKeyBytes() {
        Object ref = this.key_;
        if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)((String)ref));
            this.key_ = b;
            return b;
        }
        return (ByteString)ref;
    }

    public MysqlxExpr.Object.ObjectField.Builder setKey(String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.key_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxExpr.Object.ObjectField.Builder clearKey() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.key_ = MysqlxExpr.Object.ObjectField.getDefaultInstance().getKey();
        this.onChanged();
        return this;
    }

    public MysqlxExpr.Object.ObjectField.Builder setKeyBytes(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.key_ = value;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasValue() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public MysqlxExpr.Expr getValue() {
        if (this.valueBuilder_ == null) {
            return this.value_ == null ? MysqlxExpr.Expr.getDefaultInstance() : this.value_;
        }
        return (MysqlxExpr.Expr)this.valueBuilder_.getMessage();
    }

    public MysqlxExpr.Object.ObjectField.Builder setValue(MysqlxExpr.Expr value) {
        if (this.valueBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.value_ = value;
            this.onChanged();
        } else {
            this.valueBuilder_.setMessage((AbstractMessage)value);
        }
        this.bitField0_ |= 2;
        return this;
    }

    public MysqlxExpr.Object.ObjectField.Builder setValue(MysqlxExpr.Expr.Builder builderForValue) {
        if (this.valueBuilder_ == null) {
            this.value_ = builderForValue.build();
            this.onChanged();
        } else {
            this.valueBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 2;
        return this;
    }

    public MysqlxExpr.Object.ObjectField.Builder mergeValue(MysqlxExpr.Expr value) {
        if (this.valueBuilder_ == null) {
            this.value_ = (this.bitField0_ & 2) != 0 && this.value_ != null && this.value_ != MysqlxExpr.Expr.getDefaultInstance() ? MysqlxExpr.Expr.newBuilder(this.value_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.valueBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 2;
        return this;
    }

    public MysqlxExpr.Object.ObjectField.Builder clearValue() {
        if (this.valueBuilder_ == null) {
            this.value_ = null;
            this.onChanged();
        } else {
            this.valueBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFD;
        return this;
    }

    public MysqlxExpr.Expr.Builder getValueBuilder() {
        this.bitField0_ |= 2;
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

    public final MysqlxExpr.Object.ObjectField.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxExpr.Object.ObjectField.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxExpr.Object.ObjectField.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxExpr.Object.ObjectField.Builder)super.mergeUnknownFields(unknownFields);
    }
}
