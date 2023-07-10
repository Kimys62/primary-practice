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
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.mysql.cj.x.protobuf.MysqlxExpr;
import java.io.IOException;

public static final class MysqlxExpr.Expr.Builder
extends GeneratedMessageV3.Builder<MysqlxExpr.Expr.Builder>
implements MysqlxExpr.ExprOrBuilder {
    private int bitField0_;
    private int type_ = 1;
    private MysqlxExpr.ColumnIdentifier identifier_;
    private SingleFieldBuilderV3<MysqlxExpr.ColumnIdentifier, MysqlxExpr.ColumnIdentifier.Builder, MysqlxExpr.ColumnIdentifierOrBuilder> identifierBuilder_;
    private Object variable_ = "";
    private MysqlxDatatypes.Scalar literal_;
    private SingleFieldBuilderV3<MysqlxDatatypes.Scalar, MysqlxDatatypes.Scalar.Builder, MysqlxDatatypes.ScalarOrBuilder> literalBuilder_;
    private MysqlxExpr.FunctionCall functionCall_;
    private SingleFieldBuilderV3<MysqlxExpr.FunctionCall, MysqlxExpr.FunctionCall.Builder, MysqlxExpr.FunctionCallOrBuilder> functionCallBuilder_;
    private MysqlxExpr.Operator operator_;
    private SingleFieldBuilderV3<MysqlxExpr.Operator, MysqlxExpr.Operator.Builder, MysqlxExpr.OperatorOrBuilder> operatorBuilder_;
    private int position_;
    private MysqlxExpr.Object object_;
    private SingleFieldBuilderV3<MysqlxExpr.Object, MysqlxExpr.Object.Builder, MysqlxExpr.ObjectOrBuilder> objectBuilder_;
    private MysqlxExpr.Array array_;
    private SingleFieldBuilderV3<MysqlxExpr.Array, MysqlxExpr.Array.Builder, MysqlxExpr.ArrayOrBuilder> arrayBuilder_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Expr_Expr_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Expr_Expr_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxExpr.Expr.class, MysqlxExpr.Expr.Builder.class);
    }

    private MysqlxExpr.Expr.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxExpr.Expr.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            this.getIdentifierFieldBuilder();
            this.getLiteralFieldBuilder();
            this.getFunctionCallFieldBuilder();
            this.getOperatorFieldBuilder();
            this.getObjectFieldBuilder();
            this.getArrayFieldBuilder();
        }
    }

    public MysqlxExpr.Expr.Builder clear() {
        super.clear();
        this.type_ = 1;
        this.bitField0_ &= 0xFFFFFFFE;
        if (this.identifierBuilder_ == null) {
            this.identifier_ = null;
        } else {
            this.identifierBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFD;
        this.variable_ = "";
        this.bitField0_ &= 0xFFFFFFFB;
        if (this.literalBuilder_ == null) {
            this.literal_ = null;
        } else {
            this.literalBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFF7;
        if (this.functionCallBuilder_ == null) {
            this.functionCall_ = null;
        } else {
            this.functionCallBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFEF;
        if (this.operatorBuilder_ == null) {
            this.operator_ = null;
        } else {
            this.operatorBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFDF;
        this.position_ = 0;
        this.bitField0_ &= 0xFFFFFFBF;
        if (this.objectBuilder_ == null) {
            this.object_ = null;
        } else {
            this.objectBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFF7F;
        if (this.arrayBuilder_ == null) {
            this.array_ = null;
        } else {
            this.arrayBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFEFF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Expr_Expr_descriptor;
    }

    public MysqlxExpr.Expr getDefaultInstanceForType() {
        return MysqlxExpr.Expr.getDefaultInstance();
    }

    public MysqlxExpr.Expr build() {
        MysqlxExpr.Expr result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxExpr.Expr.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxExpr.Expr buildPartial() {
        MysqlxExpr.Expr result = new MysqlxExpr.Expr(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            to_bitField0_ |= 1;
        }
        result.type_ = this.type_;
        if ((from_bitField0_ & 2) != 0) {
            if (this.identifierBuilder_ == null) {
                result.identifier_ = this.identifier_;
            } else {
                result.identifier_ = (MysqlxExpr.ColumnIdentifier)this.identifierBuilder_.build();
            }
            to_bitField0_ |= 2;
        }
        if ((from_bitField0_ & 4) != 0) {
            to_bitField0_ |= 4;
        }
        result.variable_ = this.variable_;
        if ((from_bitField0_ & 8) != 0) {
            if (this.literalBuilder_ == null) {
                result.literal_ = this.literal_;
            } else {
                result.literal_ = (MysqlxDatatypes.Scalar)this.literalBuilder_.build();
            }
            to_bitField0_ |= 8;
        }
        if ((from_bitField0_ & 0x10) != 0) {
            if (this.functionCallBuilder_ == null) {
                result.functionCall_ = this.functionCall_;
            } else {
                result.functionCall_ = (MysqlxExpr.FunctionCall)this.functionCallBuilder_.build();
            }
            to_bitField0_ |= 0x10;
        }
        if ((from_bitField0_ & 0x20) != 0) {
            if (this.operatorBuilder_ == null) {
                result.operator_ = this.operator_;
            } else {
                result.operator_ = (MysqlxExpr.Operator)this.operatorBuilder_.build();
            }
            to_bitField0_ |= 0x20;
        }
        if ((from_bitField0_ & 0x40) != 0) {
            result.position_ = this.position_;
            to_bitField0_ |= 0x40;
        }
        if ((from_bitField0_ & 0x80) != 0) {
            if (this.objectBuilder_ == null) {
                result.object_ = this.object_;
            } else {
                result.object_ = (MysqlxExpr.Object)this.objectBuilder_.build();
            }
            to_bitField0_ |= 0x80;
        }
        if ((from_bitField0_ & 0x100) != 0) {
            if (this.arrayBuilder_ == null) {
                result.array_ = this.array_;
            } else {
                result.array_ = (MysqlxExpr.Array)this.arrayBuilder_.build();
            }
            to_bitField0_ |= 0x100;
        }
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxExpr.Expr.Builder clone() {
        return (MysqlxExpr.Expr.Builder)super.clone();
    }

    public MysqlxExpr.Expr.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxExpr.Expr.Builder)super.setField(field, value);
    }

    public MysqlxExpr.Expr.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxExpr.Expr.Builder)super.clearField(field);
    }

    public MysqlxExpr.Expr.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxExpr.Expr.Builder)super.clearOneof(oneof);
    }

    public MysqlxExpr.Expr.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxExpr.Expr.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxExpr.Expr.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxExpr.Expr.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxExpr.Expr.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxExpr.Expr) {
            return this.mergeFrom((MysqlxExpr.Expr)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxExpr.Expr.Builder mergeFrom(MysqlxExpr.Expr other) {
        if (other == MysqlxExpr.Expr.getDefaultInstance()) {
            return this;
        }
        if (other.hasType()) {
            this.setType(other.getType());
        }
        if (other.hasIdentifier()) {
            this.mergeIdentifier(other.getIdentifier());
        }
        if (other.hasVariable()) {
            this.bitField0_ |= 4;
            this.variable_ = other.variable_;
            this.onChanged();
        }
        if (other.hasLiteral()) {
            this.mergeLiteral(other.getLiteral());
        }
        if (other.hasFunctionCall()) {
            this.mergeFunctionCall(other.getFunctionCall());
        }
        if (other.hasOperator()) {
            this.mergeOperator(other.getOperator());
        }
        if (other.hasPosition()) {
            this.setPosition(other.getPosition());
        }
        if (other.hasObject()) {
            this.mergeObject(other.getObject());
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
        if (this.hasIdentifier() && !this.getIdentifier().isInitialized()) {
            return false;
        }
        if (this.hasLiteral() && !this.getLiteral().isInitialized()) {
            return false;
        }
        if (this.hasFunctionCall() && !this.getFunctionCall().isInitialized()) {
            return false;
        }
        if (this.hasOperator() && !this.getOperator().isInitialized()) {
            return false;
        }
        if (this.hasObject() && !this.getObject().isInitialized()) {
            return false;
        }
        return !this.hasArray() || this.getArray().isInitialized();
    }

    public MysqlxExpr.Expr.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxExpr.Expr parsedMessage = null;
        try {
            parsedMessage = (MysqlxExpr.Expr)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxExpr.Expr)e.getUnfinishedMessage();
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
    public MysqlxExpr.Expr.Type getType() {
        MysqlxExpr.Expr.Type result = MysqlxExpr.Expr.Type.valueOf(this.type_);
        return result == null ? MysqlxExpr.Expr.Type.IDENT : result;
    }

    public MysqlxExpr.Expr.Builder setType(MysqlxExpr.Expr.Type value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.type_ = value.getNumber();
        this.onChanged();
        return this;
    }

    public MysqlxExpr.Expr.Builder clearType() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.type_ = 1;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasIdentifier() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public MysqlxExpr.ColumnIdentifier getIdentifier() {
        if (this.identifierBuilder_ == null) {
            return this.identifier_ == null ? MysqlxExpr.ColumnIdentifier.getDefaultInstance() : this.identifier_;
        }
        return (MysqlxExpr.ColumnIdentifier)this.identifierBuilder_.getMessage();
    }

    public MysqlxExpr.Expr.Builder setIdentifier(MysqlxExpr.ColumnIdentifier value) {
        if (this.identifierBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.identifier_ = value;
            this.onChanged();
        } else {
            this.identifierBuilder_.setMessage((AbstractMessage)value);
        }
        this.bitField0_ |= 2;
        return this;
    }

    public MysqlxExpr.Expr.Builder setIdentifier(MysqlxExpr.ColumnIdentifier.Builder builderForValue) {
        if (this.identifierBuilder_ == null) {
            this.identifier_ = builderForValue.build();
            this.onChanged();
        } else {
            this.identifierBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 2;
        return this;
    }

    public MysqlxExpr.Expr.Builder mergeIdentifier(MysqlxExpr.ColumnIdentifier value) {
        if (this.identifierBuilder_ == null) {
            this.identifier_ = (this.bitField0_ & 2) != 0 && this.identifier_ != null && this.identifier_ != MysqlxExpr.ColumnIdentifier.getDefaultInstance() ? MysqlxExpr.ColumnIdentifier.newBuilder(this.identifier_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.identifierBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 2;
        return this;
    }

    public MysqlxExpr.Expr.Builder clearIdentifier() {
        if (this.identifierBuilder_ == null) {
            this.identifier_ = null;
            this.onChanged();
        } else {
            this.identifierBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFD;
        return this;
    }

    public MysqlxExpr.ColumnIdentifier.Builder getIdentifierBuilder() {
        this.bitField0_ |= 2;
        this.onChanged();
        return (MysqlxExpr.ColumnIdentifier.Builder)this.getIdentifierFieldBuilder().getBuilder();
    }

    @Override
    public MysqlxExpr.ColumnIdentifierOrBuilder getIdentifierOrBuilder() {
        if (this.identifierBuilder_ != null) {
            return (MysqlxExpr.ColumnIdentifierOrBuilder)this.identifierBuilder_.getMessageOrBuilder();
        }
        return this.identifier_ == null ? MysqlxExpr.ColumnIdentifier.getDefaultInstance() : this.identifier_;
    }

    private SingleFieldBuilderV3<MysqlxExpr.ColumnIdentifier, MysqlxExpr.ColumnIdentifier.Builder, MysqlxExpr.ColumnIdentifierOrBuilder> getIdentifierFieldBuilder() {
        if (this.identifierBuilder_ == null) {
            this.identifierBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getIdentifier(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.identifier_ = null;
        }
        return this.identifierBuilder_;
    }

    @Override
    public boolean hasVariable() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override
    public String getVariable() {
        Object ref = this.variable_;
        if (!(ref instanceof String)) {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.variable_ = s;
            }
            return s;
        }
        return (String)ref;
    }

    @Override
    public ByteString getVariableBytes() {
        Object ref = this.variable_;
        if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)((String)ref));
            this.variable_ = b;
            return b;
        }
        return (ByteString)ref;
    }

    public MysqlxExpr.Expr.Builder setVariable(String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 4;
        this.variable_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxExpr.Expr.Builder clearVariable() {
        this.bitField0_ &= 0xFFFFFFFB;
        this.variable_ = MysqlxExpr.Expr.getDefaultInstance().getVariable();
        this.onChanged();
        return this;
    }

    public MysqlxExpr.Expr.Builder setVariableBytes(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 4;
        this.variable_ = value;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasLiteral() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override
    public MysqlxDatatypes.Scalar getLiteral() {
        if (this.literalBuilder_ == null) {
            return this.literal_ == null ? MysqlxDatatypes.Scalar.getDefaultInstance() : this.literal_;
        }
        return (MysqlxDatatypes.Scalar)this.literalBuilder_.getMessage();
    }

    public MysqlxExpr.Expr.Builder setLiteral(MysqlxDatatypes.Scalar value) {
        if (this.literalBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.literal_ = value;
            this.onChanged();
        } else {
            this.literalBuilder_.setMessage((AbstractMessage)value);
        }
        this.bitField0_ |= 8;
        return this;
    }

    public MysqlxExpr.Expr.Builder setLiteral(MysqlxDatatypes.Scalar.Builder builderForValue) {
        if (this.literalBuilder_ == null) {
            this.literal_ = builderForValue.build();
            this.onChanged();
        } else {
            this.literalBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 8;
        return this;
    }

    public MysqlxExpr.Expr.Builder mergeLiteral(MysqlxDatatypes.Scalar value) {
        if (this.literalBuilder_ == null) {
            this.literal_ = (this.bitField0_ & 8) != 0 && this.literal_ != null && this.literal_ != MysqlxDatatypes.Scalar.getDefaultInstance() ? MysqlxDatatypes.Scalar.newBuilder(this.literal_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.literalBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 8;
        return this;
    }

    public MysqlxExpr.Expr.Builder clearLiteral() {
        if (this.literalBuilder_ == null) {
            this.literal_ = null;
            this.onChanged();
        } else {
            this.literalBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFF7;
        return this;
    }

    public MysqlxDatatypes.Scalar.Builder getLiteralBuilder() {
        this.bitField0_ |= 8;
        this.onChanged();
        return (MysqlxDatatypes.Scalar.Builder)this.getLiteralFieldBuilder().getBuilder();
    }

    @Override
    public MysqlxDatatypes.ScalarOrBuilder getLiteralOrBuilder() {
        if (this.literalBuilder_ != null) {
            return (MysqlxDatatypes.ScalarOrBuilder)this.literalBuilder_.getMessageOrBuilder();
        }
        return this.literal_ == null ? MysqlxDatatypes.Scalar.getDefaultInstance() : this.literal_;
    }

    private SingleFieldBuilderV3<MysqlxDatatypes.Scalar, MysqlxDatatypes.Scalar.Builder, MysqlxDatatypes.ScalarOrBuilder> getLiteralFieldBuilder() {
        if (this.literalBuilder_ == null) {
            this.literalBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getLiteral(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.literal_ = null;
        }
        return this.literalBuilder_;
    }

    @Override
    public boolean hasFunctionCall() {
        return (this.bitField0_ & 0x10) != 0;
    }

    @Override
    public MysqlxExpr.FunctionCall getFunctionCall() {
        if (this.functionCallBuilder_ == null) {
            return this.functionCall_ == null ? MysqlxExpr.FunctionCall.getDefaultInstance() : this.functionCall_;
        }
        return (MysqlxExpr.FunctionCall)this.functionCallBuilder_.getMessage();
    }

    public MysqlxExpr.Expr.Builder setFunctionCall(MysqlxExpr.FunctionCall value) {
        if (this.functionCallBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.functionCall_ = value;
            this.onChanged();
        } else {
            this.functionCallBuilder_.setMessage((AbstractMessage)value);
        }
        this.bitField0_ |= 0x10;
        return this;
    }

    public MysqlxExpr.Expr.Builder setFunctionCall(MysqlxExpr.FunctionCall.Builder builderForValue) {
        if (this.functionCallBuilder_ == null) {
            this.functionCall_ = builderForValue.build();
            this.onChanged();
        } else {
            this.functionCallBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 0x10;
        return this;
    }

    public MysqlxExpr.Expr.Builder mergeFunctionCall(MysqlxExpr.FunctionCall value) {
        if (this.functionCallBuilder_ == null) {
            this.functionCall_ = (this.bitField0_ & 0x10) != 0 && this.functionCall_ != null && this.functionCall_ != MysqlxExpr.FunctionCall.getDefaultInstance() ? MysqlxExpr.FunctionCall.newBuilder(this.functionCall_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.functionCallBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 0x10;
        return this;
    }

    public MysqlxExpr.Expr.Builder clearFunctionCall() {
        if (this.functionCallBuilder_ == null) {
            this.functionCall_ = null;
            this.onChanged();
        } else {
            this.functionCallBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFEF;
        return this;
    }

    public MysqlxExpr.FunctionCall.Builder getFunctionCallBuilder() {
        this.bitField0_ |= 0x10;
        this.onChanged();
        return (MysqlxExpr.FunctionCall.Builder)this.getFunctionCallFieldBuilder().getBuilder();
    }

    @Override
    public MysqlxExpr.FunctionCallOrBuilder getFunctionCallOrBuilder() {
        if (this.functionCallBuilder_ != null) {
            return (MysqlxExpr.FunctionCallOrBuilder)this.functionCallBuilder_.getMessageOrBuilder();
        }
        return this.functionCall_ == null ? MysqlxExpr.FunctionCall.getDefaultInstance() : this.functionCall_;
    }

    private SingleFieldBuilderV3<MysqlxExpr.FunctionCall, MysqlxExpr.FunctionCall.Builder, MysqlxExpr.FunctionCallOrBuilder> getFunctionCallFieldBuilder() {
        if (this.functionCallBuilder_ == null) {
            this.functionCallBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getFunctionCall(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.functionCall_ = null;
        }
        return this.functionCallBuilder_;
    }

    @Override
    public boolean hasOperator() {
        return (this.bitField0_ & 0x20) != 0;
    }

    @Override
    public MysqlxExpr.Operator getOperator() {
        if (this.operatorBuilder_ == null) {
            return this.operator_ == null ? MysqlxExpr.Operator.getDefaultInstance() : this.operator_;
        }
        return (MysqlxExpr.Operator)this.operatorBuilder_.getMessage();
    }

    public MysqlxExpr.Expr.Builder setOperator(MysqlxExpr.Operator value) {
        if (this.operatorBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.operator_ = value;
            this.onChanged();
        } else {
            this.operatorBuilder_.setMessage((AbstractMessage)value);
        }
        this.bitField0_ |= 0x20;
        return this;
    }

    public MysqlxExpr.Expr.Builder setOperator(MysqlxExpr.Operator.Builder builderForValue) {
        if (this.operatorBuilder_ == null) {
            this.operator_ = builderForValue.build();
            this.onChanged();
        } else {
            this.operatorBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 0x20;
        return this;
    }

    public MysqlxExpr.Expr.Builder mergeOperator(MysqlxExpr.Operator value) {
        if (this.operatorBuilder_ == null) {
            this.operator_ = (this.bitField0_ & 0x20) != 0 && this.operator_ != null && this.operator_ != MysqlxExpr.Operator.getDefaultInstance() ? MysqlxExpr.Operator.newBuilder(this.operator_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.operatorBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 0x20;
        return this;
    }

    public MysqlxExpr.Expr.Builder clearOperator() {
        if (this.operatorBuilder_ == null) {
            this.operator_ = null;
            this.onChanged();
        } else {
            this.operatorBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFDF;
        return this;
    }

    public MysqlxExpr.Operator.Builder getOperatorBuilder() {
        this.bitField0_ |= 0x20;
        this.onChanged();
        return (MysqlxExpr.Operator.Builder)this.getOperatorFieldBuilder().getBuilder();
    }

    @Override
    public MysqlxExpr.OperatorOrBuilder getOperatorOrBuilder() {
        if (this.operatorBuilder_ != null) {
            return (MysqlxExpr.OperatorOrBuilder)this.operatorBuilder_.getMessageOrBuilder();
        }
        return this.operator_ == null ? MysqlxExpr.Operator.getDefaultInstance() : this.operator_;
    }

    private SingleFieldBuilderV3<MysqlxExpr.Operator, MysqlxExpr.Operator.Builder, MysqlxExpr.OperatorOrBuilder> getOperatorFieldBuilder() {
        if (this.operatorBuilder_ == null) {
            this.operatorBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getOperator(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.operator_ = null;
        }
        return this.operatorBuilder_;
    }

    @Override
    public boolean hasPosition() {
        return (this.bitField0_ & 0x40) != 0;
    }

    @Override
    public int getPosition() {
        return this.position_;
    }

    public MysqlxExpr.Expr.Builder setPosition(int value) {
        this.bitField0_ |= 0x40;
        this.position_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxExpr.Expr.Builder clearPosition() {
        this.bitField0_ &= 0xFFFFFFBF;
        this.position_ = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasObject() {
        return (this.bitField0_ & 0x80) != 0;
    }

    @Override
    public MysqlxExpr.Object getObject() {
        if (this.objectBuilder_ == null) {
            return this.object_ == null ? MysqlxExpr.Object.getDefaultInstance() : this.object_;
        }
        return (MysqlxExpr.Object)this.objectBuilder_.getMessage();
    }

    public MysqlxExpr.Expr.Builder setObject(MysqlxExpr.Object value) {
        if (this.objectBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.object_ = value;
            this.onChanged();
        } else {
            this.objectBuilder_.setMessage((AbstractMessage)value);
        }
        this.bitField0_ |= 0x80;
        return this;
    }

    public MysqlxExpr.Expr.Builder setObject(MysqlxExpr.Object.Builder builderForValue) {
        if (this.objectBuilder_ == null) {
            this.object_ = builderForValue.build();
            this.onChanged();
        } else {
            this.objectBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 0x80;
        return this;
    }

    public MysqlxExpr.Expr.Builder mergeObject(MysqlxExpr.Object value) {
        if (this.objectBuilder_ == null) {
            this.object_ = (this.bitField0_ & 0x80) != 0 && this.object_ != null && this.object_ != MysqlxExpr.Object.getDefaultInstance() ? MysqlxExpr.Object.newBuilder(this.object_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.objectBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 0x80;
        return this;
    }

    public MysqlxExpr.Expr.Builder clearObject() {
        if (this.objectBuilder_ == null) {
            this.object_ = null;
            this.onChanged();
        } else {
            this.objectBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFF7F;
        return this;
    }

    public MysqlxExpr.Object.Builder getObjectBuilder() {
        this.bitField0_ |= 0x80;
        this.onChanged();
        return (MysqlxExpr.Object.Builder)this.getObjectFieldBuilder().getBuilder();
    }

    @Override
    public MysqlxExpr.ObjectOrBuilder getObjectOrBuilder() {
        if (this.objectBuilder_ != null) {
            return (MysqlxExpr.ObjectOrBuilder)this.objectBuilder_.getMessageOrBuilder();
        }
        return this.object_ == null ? MysqlxExpr.Object.getDefaultInstance() : this.object_;
    }

    private SingleFieldBuilderV3<MysqlxExpr.Object, MysqlxExpr.Object.Builder, MysqlxExpr.ObjectOrBuilder> getObjectFieldBuilder() {
        if (this.objectBuilder_ == null) {
            this.objectBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getObject(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.object_ = null;
        }
        return this.objectBuilder_;
    }

    @Override
    public boolean hasArray() {
        return (this.bitField0_ & 0x100) != 0;
    }

    @Override
    public MysqlxExpr.Array getArray() {
        if (this.arrayBuilder_ == null) {
            return this.array_ == null ? MysqlxExpr.Array.getDefaultInstance() : this.array_;
        }
        return (MysqlxExpr.Array)this.arrayBuilder_.getMessage();
    }

    public MysqlxExpr.Expr.Builder setArray(MysqlxExpr.Array value) {
        if (this.arrayBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.array_ = value;
            this.onChanged();
        } else {
            this.arrayBuilder_.setMessage((AbstractMessage)value);
        }
        this.bitField0_ |= 0x100;
        return this;
    }

    public MysqlxExpr.Expr.Builder setArray(MysqlxExpr.Array.Builder builderForValue) {
        if (this.arrayBuilder_ == null) {
            this.array_ = builderForValue.build();
            this.onChanged();
        } else {
            this.arrayBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 0x100;
        return this;
    }

    public MysqlxExpr.Expr.Builder mergeArray(MysqlxExpr.Array value) {
        if (this.arrayBuilder_ == null) {
            this.array_ = (this.bitField0_ & 0x100) != 0 && this.array_ != null && this.array_ != MysqlxExpr.Array.getDefaultInstance() ? MysqlxExpr.Array.newBuilder(this.array_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.arrayBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 0x100;
        return this;
    }

    public MysqlxExpr.Expr.Builder clearArray() {
        if (this.arrayBuilder_ == null) {
            this.array_ = null;
            this.onChanged();
        } else {
            this.arrayBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFEFF;
        return this;
    }

    public MysqlxExpr.Array.Builder getArrayBuilder() {
        this.bitField0_ |= 0x100;
        this.onChanged();
        return (MysqlxExpr.Array.Builder)this.getArrayFieldBuilder().getBuilder();
    }

    @Override
    public MysqlxExpr.ArrayOrBuilder getArrayOrBuilder() {
        if (this.arrayBuilder_ != null) {
            return (MysqlxExpr.ArrayOrBuilder)this.arrayBuilder_.getMessageOrBuilder();
        }
        return this.array_ == null ? MysqlxExpr.Array.getDefaultInstance() : this.array_;
    }

    private SingleFieldBuilderV3<MysqlxExpr.Array, MysqlxExpr.Array.Builder, MysqlxExpr.ArrayOrBuilder> getArrayFieldBuilder() {
        if (this.arrayBuilder_ == null) {
            this.arrayBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getArray(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.array_ = null;
        }
        return this.arrayBuilder_;
    }

    public final MysqlxExpr.Expr.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxExpr.Expr.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxExpr.Expr.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxExpr.Expr.Builder)super.mergeUnknownFields(unknownFields);
    }
}
