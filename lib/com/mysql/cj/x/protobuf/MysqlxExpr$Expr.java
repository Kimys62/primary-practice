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
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.mysql.cj.x.protobuf.MysqlxExpr;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public static final class MysqlxExpr.Expr
extends GeneratedMessageV3
implements MysqlxExpr.ExprOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    public static final int IDENTIFIER_FIELD_NUMBER = 2;
    private MysqlxExpr.ColumnIdentifier identifier_;
    public static final int VARIABLE_FIELD_NUMBER = 3;
    private volatile Object variable_;
    public static final int LITERAL_FIELD_NUMBER = 4;
    private MysqlxDatatypes.Scalar literal_;
    public static final int FUNCTION_CALL_FIELD_NUMBER = 5;
    private MysqlxExpr.FunctionCall functionCall_;
    public static final int OPERATOR_FIELD_NUMBER = 6;
    private MysqlxExpr.Operator operator_;
    public static final int POSITION_FIELD_NUMBER = 7;
    private int position_;
    public static final int OBJECT_FIELD_NUMBER = 8;
    private MysqlxExpr.Object object_;
    public static final int ARRAY_FIELD_NUMBER = 9;
    private MysqlxExpr.Array array_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxExpr.Expr DEFAULT_INSTANCE = new MysqlxExpr.Expr();
    @Deprecated
    public static final Parser<MysqlxExpr.Expr> PARSER = new AbstractParser<MysqlxExpr.Expr>(){

        public MysqlxExpr.Expr parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxExpr.Expr(input, extensionRegistry);
        }
    };

    private MysqlxExpr.Expr(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxExpr.Expr() {
        this.type_ = 1;
        this.variable_ = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxExpr.Expr();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxExpr.Expr(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
        }
        boolean mutable_bitField0_ = false;
        UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
        try {
            boolean done = false;
            block18: while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0: {
                        done = true;
                        continue block18;
                    }
                    case 8: {
                        int rawValue = input.readEnum();
                        Type value = Type.valueOf(rawValue);
                        if (value == null) {
                            unknownFields.mergeVarintField(1, rawValue);
                            continue block18;
                        }
                        this.bitField0_ |= 1;
                        this.type_ = rawValue;
                        continue block18;
                    }
                    case 18: {
                        MysqlxExpr.ColumnIdentifier.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                            subBuilder = this.identifier_.toBuilder();
                        }
                        this.identifier_ = (MysqlxExpr.ColumnIdentifier)input.readMessage(MysqlxExpr.ColumnIdentifier.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.identifier_);
                            this.identifier_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 2;
                        continue block18;
                    }
                    case 26: {
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 4;
                        this.variable_ = bs;
                        continue block18;
                    }
                    case 34: {
                        MysqlxDatatypes.Scalar.Builder subBuilder = null;
                        if ((this.bitField0_ & 8) != 0) {
                            subBuilder = this.literal_.toBuilder();
                        }
                        this.literal_ = (MysqlxDatatypes.Scalar)input.readMessage(MysqlxDatatypes.Scalar.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.literal_);
                            this.literal_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 8;
                        continue block18;
                    }
                    case 42: {
                        MysqlxExpr.FunctionCall.Builder subBuilder = null;
                        if ((this.bitField0_ & 0x10) != 0) {
                            subBuilder = this.functionCall_.toBuilder();
                        }
                        this.functionCall_ = (MysqlxExpr.FunctionCall)input.readMessage(MysqlxExpr.FunctionCall.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.functionCall_);
                            this.functionCall_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 0x10;
                        continue block18;
                    }
                    case 50: {
                        MysqlxExpr.Operator.Builder subBuilder = null;
                        if ((this.bitField0_ & 0x20) != 0) {
                            subBuilder = this.operator_.toBuilder();
                        }
                        this.operator_ = (MysqlxExpr.Operator)input.readMessage(MysqlxExpr.Operator.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.operator_);
                            this.operator_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 0x20;
                        continue block18;
                    }
                    case 56: {
                        this.bitField0_ |= 0x40;
                        this.position_ = input.readUInt32();
                        continue block18;
                    }
                    case 66: {
                        MysqlxExpr.Object.Builder subBuilder = null;
                        if ((this.bitField0_ & 0x80) != 0) {
                            subBuilder = this.object_.toBuilder();
                        }
                        this.object_ = (MysqlxExpr.Object)input.readMessage(MysqlxExpr.Object.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.object_);
                            this.object_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 0x80;
                        continue block18;
                    }
                    case 74: {
                        MysqlxExpr.Array.Builder subBuilder = null;
                        if ((this.bitField0_ & 0x100) != 0) {
                            subBuilder = this.array_.toBuilder();
                        }
                        this.array_ = (MysqlxExpr.Array)input.readMessage(MysqlxExpr.Array.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(this.array_);
                            this.array_ = subBuilder.buildPartial();
                        }
                        this.bitField0_ |= 0x100;
                        continue block18;
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
        return internal_static_Mysqlx_Expr_Expr_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Expr_Expr_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxExpr.Expr.class, Builder.class);
    }

    @Override
    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public Type getType() {
        Type result = Type.valueOf(this.type_);
        return result == null ? Type.IDENT : result;
    }

    @Override
    public boolean hasIdentifier() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public MysqlxExpr.ColumnIdentifier getIdentifier() {
        return this.identifier_ == null ? MysqlxExpr.ColumnIdentifier.getDefaultInstance() : this.identifier_;
    }

    @Override
    public MysqlxExpr.ColumnIdentifierOrBuilder getIdentifierOrBuilder() {
        return this.identifier_ == null ? MysqlxExpr.ColumnIdentifier.getDefaultInstance() : this.identifier_;
    }

    @Override
    public boolean hasVariable() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override
    public String getVariable() {
        Object ref = this.variable_;
        if (ref instanceof String) {
            return (String)ref;
        }
        ByteString bs = (ByteString)ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
            this.variable_ = s;
        }
        return s;
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

    @Override
    public boolean hasLiteral() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override
    public MysqlxDatatypes.Scalar getLiteral() {
        return this.literal_ == null ? MysqlxDatatypes.Scalar.getDefaultInstance() : this.literal_;
    }

    @Override
    public MysqlxDatatypes.ScalarOrBuilder getLiteralOrBuilder() {
        return this.literal_ == null ? MysqlxDatatypes.Scalar.getDefaultInstance() : this.literal_;
    }

    @Override
    public boolean hasFunctionCall() {
        return (this.bitField0_ & 0x10) != 0;
    }

    @Override
    public MysqlxExpr.FunctionCall getFunctionCall() {
        return this.functionCall_ == null ? MysqlxExpr.FunctionCall.getDefaultInstance() : this.functionCall_;
    }

    @Override
    public MysqlxExpr.FunctionCallOrBuilder getFunctionCallOrBuilder() {
        return this.functionCall_ == null ? MysqlxExpr.FunctionCall.getDefaultInstance() : this.functionCall_;
    }

    @Override
    public boolean hasOperator() {
        return (this.bitField0_ & 0x20) != 0;
    }

    @Override
    public MysqlxExpr.Operator getOperator() {
        return this.operator_ == null ? MysqlxExpr.Operator.getDefaultInstance() : this.operator_;
    }

    @Override
    public MysqlxExpr.OperatorOrBuilder getOperatorOrBuilder() {
        return this.operator_ == null ? MysqlxExpr.Operator.getDefaultInstance() : this.operator_;
    }

    @Override
    public boolean hasPosition() {
        return (this.bitField0_ & 0x40) != 0;
    }

    @Override
    public int getPosition() {
        return this.position_;
    }

    @Override
    public boolean hasObject() {
        return (this.bitField0_ & 0x80) != 0;
    }

    @Override
    public MysqlxExpr.Object getObject() {
        return this.object_ == null ? MysqlxExpr.Object.getDefaultInstance() : this.object_;
    }

    @Override
    public MysqlxExpr.ObjectOrBuilder getObjectOrBuilder() {
        return this.object_ == null ? MysqlxExpr.Object.getDefaultInstance() : this.object_;
    }

    @Override
    public boolean hasArray() {
        return (this.bitField0_ & 0x100) != 0;
    }

    @Override
    public MysqlxExpr.Array getArray() {
        return this.array_ == null ? MysqlxExpr.Array.getDefaultInstance() : this.array_;
    }

    @Override
    public MysqlxExpr.ArrayOrBuilder getArrayOrBuilder() {
        return this.array_ == null ? MysqlxExpr.Array.getDefaultInstance() : this.array_;
    }

    public final boolean isInitialized() {
        byte isInitialized = this.memoizedIsInitialized;
        if (isInitialized == 1) {
            return true;
        }
        if (isInitialized == 0) {
            return false;
        }
        if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (this.hasIdentifier() && !this.getIdentifier().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (this.hasLiteral() && !this.getLiteral().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (this.hasFunctionCall() && !this.getFunctionCall().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (this.hasOperator() && !this.getOperator().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (this.hasObject() && !this.getObject().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        if (this.hasArray() && !this.getArray().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.type_);
        }
        if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, (MessageLite)this.getIdentifier());
        }
        if ((this.bitField0_ & 4) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)output, (int)3, (Object)this.variable_);
        }
        if ((this.bitField0_ & 8) != 0) {
            output.writeMessage(4, (MessageLite)this.getLiteral());
        }
        if ((this.bitField0_ & 0x10) != 0) {
            output.writeMessage(5, (MessageLite)this.getFunctionCall());
        }
        if ((this.bitField0_ & 0x20) != 0) {
            output.writeMessage(6, (MessageLite)this.getOperator());
        }
        if ((this.bitField0_ & 0x40) != 0) {
            output.writeUInt32(7, this.position_);
        }
        if ((this.bitField0_ & 0x80) != 0) {
            output.writeMessage(8, (MessageLite)this.getObject());
        }
        if ((this.bitField0_ & 0x100) != 0) {
            output.writeMessage(9, (MessageLite)this.getArray());
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
            size += CodedOutputStream.computeEnumSize((int)1, (int)this.type_);
        }
        if ((this.bitField0_ & 2) != 0) {
            size += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.getIdentifier());
        }
        if ((this.bitField0_ & 4) != 0) {
            size += GeneratedMessageV3.computeStringSize((int)3, (Object)this.variable_);
        }
        if ((this.bitField0_ & 8) != 0) {
            size += CodedOutputStream.computeMessageSize((int)4, (MessageLite)this.getLiteral());
        }
        if ((this.bitField0_ & 0x10) != 0) {
            size += CodedOutputStream.computeMessageSize((int)5, (MessageLite)this.getFunctionCall());
        }
        if ((this.bitField0_ & 0x20) != 0) {
            size += CodedOutputStream.computeMessageSize((int)6, (MessageLite)this.getOperator());
        }
        if ((this.bitField0_ & 0x40) != 0) {
            size += CodedOutputStream.computeUInt32Size((int)7, (int)this.position_);
        }
        if ((this.bitField0_ & 0x80) != 0) {
            size += CodedOutputStream.computeMessageSize((int)8, (MessageLite)this.getObject());
        }
        if ((this.bitField0_ & 0x100) != 0) {
            size += CodedOutputStream.computeMessageSize((int)9, (MessageLite)this.getArray());
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxExpr.Expr)) {
            return super.equals(obj);
        }
        MysqlxExpr.Expr other = (MysqlxExpr.Expr)obj;
        if (this.hasType() != other.hasType()) {
            return false;
        }
        if (this.hasType() && this.type_ != other.type_) {
            return false;
        }
        if (this.hasIdentifier() != other.hasIdentifier()) {
            return false;
        }
        if (this.hasIdentifier() && !this.getIdentifier().equals(other.getIdentifier())) {
            return false;
        }
        if (this.hasVariable() != other.hasVariable()) {
            return false;
        }
        if (this.hasVariable() && !this.getVariable().equals(other.getVariable())) {
            return false;
        }
        if (this.hasLiteral() != other.hasLiteral()) {
            return false;
        }
        if (this.hasLiteral() && !this.getLiteral().equals(other.getLiteral())) {
            return false;
        }
        if (this.hasFunctionCall() != other.hasFunctionCall()) {
            return false;
        }
        if (this.hasFunctionCall() && !this.getFunctionCall().equals(other.getFunctionCall())) {
            return false;
        }
        if (this.hasOperator() != other.hasOperator()) {
            return false;
        }
        if (this.hasOperator() && !this.getOperator().equals(other.getOperator())) {
            return false;
        }
        if (this.hasPosition() != other.hasPosition()) {
            return false;
        }
        if (this.hasPosition() && this.getPosition() != other.getPosition()) {
            return false;
        }
        if (this.hasObject() != other.hasObject()) {
            return false;
        }
        if (this.hasObject() && !this.getObject().equals(other.getObject())) {
            return false;
        }
        if (this.hasArray() != other.hasArray()) {
            return false;
        }
        if (this.hasArray() && !this.getArray().equals(other.getArray())) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxExpr.Expr.getDescriptor().hashCode();
        if (this.hasType()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.type_;
        }
        if (this.hasIdentifier()) {
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getIdentifier().hashCode();
        }
        if (this.hasVariable()) {
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getVariable().hashCode();
        }
        if (this.hasLiteral()) {
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getLiteral().hashCode();
        }
        if (this.hasFunctionCall()) {
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getFunctionCall().hashCode();
        }
        if (this.hasOperator()) {
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getOperator().hashCode();
        }
        if (this.hasPosition()) {
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getPosition();
        }
        if (this.hasObject()) {
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getObject().hashCode();
        }
        if (this.hasArray()) {
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getArray().hashCode();
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxExpr.Expr parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxExpr.Expr)PARSER.parseFrom(data);
    }

    public static MysqlxExpr.Expr parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxExpr.Expr)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxExpr.Expr parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxExpr.Expr)PARSER.parseFrom(data);
    }

    public static MysqlxExpr.Expr parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxExpr.Expr)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxExpr.Expr parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxExpr.Expr)PARSER.parseFrom(data);
    }

    public static MysqlxExpr.Expr parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxExpr.Expr)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxExpr.Expr parseFrom(InputStream input) throws IOException {
        return (MysqlxExpr.Expr)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxExpr.Expr parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxExpr.Expr)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxExpr.Expr parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxExpr.Expr)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxExpr.Expr parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxExpr.Expr)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxExpr.Expr parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxExpr.Expr)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxExpr.Expr parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxExpr.Expr)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxExpr.Expr.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxExpr.Expr prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxExpr.Expr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxExpr.Expr> parser() {
        return PARSER;
    }

    public Parser<MysqlxExpr.Expr> getParserForType() {
        return PARSER;
    }

    public MysqlxExpr.Expr getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
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
            return internal_static_Mysqlx_Expr_Expr_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxExpr.Expr.class, Builder.class);
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
                this.getIdentifierFieldBuilder();
                this.getLiteralFieldBuilder();
                this.getFunctionCallFieldBuilder();
                this.getOperatorFieldBuilder();
                this.getObjectFieldBuilder();
                this.getArrayFieldBuilder();
            }
        }

        public Builder clear() {
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
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxExpr.Expr buildPartial() {
            MysqlxExpr.Expr result = new MysqlxExpr.Expr(this);
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
            if (other instanceof MysqlxExpr.Expr) {
                return this.mergeFrom((MysqlxExpr.Expr)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxExpr.Expr other) {
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

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
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
        public Type getType() {
            Type result = Type.valueOf(this.type_);
            return result == null ? Type.IDENT : result;
        }

        public Builder setType(Type value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 1;
            this.type_ = value.getNumber();
            this.onChanged();
            return this;
        }

        public Builder clearType() {
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

        public Builder setIdentifier(MysqlxExpr.ColumnIdentifier value) {
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

        public Builder setIdentifier(MysqlxExpr.ColumnIdentifier.Builder builderForValue) {
            if (this.identifierBuilder_ == null) {
                this.identifier_ = builderForValue.build();
                this.onChanged();
            } else {
                this.identifierBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 2;
            return this;
        }

        public Builder mergeIdentifier(MysqlxExpr.ColumnIdentifier value) {
            if (this.identifierBuilder_ == null) {
                this.identifier_ = (this.bitField0_ & 2) != 0 && this.identifier_ != null && this.identifier_ != MysqlxExpr.ColumnIdentifier.getDefaultInstance() ? MysqlxExpr.ColumnIdentifier.newBuilder(this.identifier_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.identifierBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 2;
            return this;
        }

        public Builder clearIdentifier() {
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

        public Builder setVariable(String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 4;
            this.variable_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearVariable() {
            this.bitField0_ &= 0xFFFFFFFB;
            this.variable_ = MysqlxExpr.Expr.getDefaultInstance().getVariable();
            this.onChanged();
            return this;
        }

        public Builder setVariableBytes(ByteString value) {
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

        public Builder setLiteral(MysqlxDatatypes.Scalar value) {
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

        public Builder setLiteral(MysqlxDatatypes.Scalar.Builder builderForValue) {
            if (this.literalBuilder_ == null) {
                this.literal_ = builderForValue.build();
                this.onChanged();
            } else {
                this.literalBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 8;
            return this;
        }

        public Builder mergeLiteral(MysqlxDatatypes.Scalar value) {
            if (this.literalBuilder_ == null) {
                this.literal_ = (this.bitField0_ & 8) != 0 && this.literal_ != null && this.literal_ != MysqlxDatatypes.Scalar.getDefaultInstance() ? MysqlxDatatypes.Scalar.newBuilder(this.literal_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.literalBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 8;
            return this;
        }

        public Builder clearLiteral() {
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

        public Builder setFunctionCall(MysqlxExpr.FunctionCall value) {
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

        public Builder setFunctionCall(MysqlxExpr.FunctionCall.Builder builderForValue) {
            if (this.functionCallBuilder_ == null) {
                this.functionCall_ = builderForValue.build();
                this.onChanged();
            } else {
                this.functionCallBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 0x10;
            return this;
        }

        public Builder mergeFunctionCall(MysqlxExpr.FunctionCall value) {
            if (this.functionCallBuilder_ == null) {
                this.functionCall_ = (this.bitField0_ & 0x10) != 0 && this.functionCall_ != null && this.functionCall_ != MysqlxExpr.FunctionCall.getDefaultInstance() ? MysqlxExpr.FunctionCall.newBuilder(this.functionCall_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.functionCallBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 0x10;
            return this;
        }

        public Builder clearFunctionCall() {
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

        public Builder setOperator(MysqlxExpr.Operator value) {
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

        public Builder setOperator(MysqlxExpr.Operator.Builder builderForValue) {
            if (this.operatorBuilder_ == null) {
                this.operator_ = builderForValue.build();
                this.onChanged();
            } else {
                this.operatorBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 0x20;
            return this;
        }

        public Builder mergeOperator(MysqlxExpr.Operator value) {
            if (this.operatorBuilder_ == null) {
                this.operator_ = (this.bitField0_ & 0x20) != 0 && this.operator_ != null && this.operator_ != MysqlxExpr.Operator.getDefaultInstance() ? MysqlxExpr.Operator.newBuilder(this.operator_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.operatorBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 0x20;
            return this;
        }

        public Builder clearOperator() {
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

        public Builder setPosition(int value) {
            this.bitField0_ |= 0x40;
            this.position_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearPosition() {
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

        public Builder setObject(MysqlxExpr.Object value) {
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

        public Builder setObject(MysqlxExpr.Object.Builder builderForValue) {
            if (this.objectBuilder_ == null) {
                this.object_ = builderForValue.build();
                this.onChanged();
            } else {
                this.objectBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 0x80;
            return this;
        }

        public Builder mergeObject(MysqlxExpr.Object value) {
            if (this.objectBuilder_ == null) {
                this.object_ = (this.bitField0_ & 0x80) != 0 && this.object_ != null && this.object_ != MysqlxExpr.Object.getDefaultInstance() ? MysqlxExpr.Object.newBuilder(this.object_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.objectBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 0x80;
            return this;
        }

        public Builder clearObject() {
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

        public Builder setArray(MysqlxExpr.Array value) {
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

        public Builder setArray(MysqlxExpr.Array.Builder builderForValue) {
            if (this.arrayBuilder_ == null) {
                this.array_ = builderForValue.build();
                this.onChanged();
            } else {
                this.arrayBuilder_.setMessage((AbstractMessage)builderForValue.build());
            }
            this.bitField0_ |= 0x100;
            return this;
        }

        public Builder mergeArray(MysqlxExpr.Array value) {
            if (this.arrayBuilder_ == null) {
                this.array_ = (this.bitField0_ & 0x100) != 0 && this.array_ != null && this.array_ != MysqlxExpr.Array.getDefaultInstance() ? MysqlxExpr.Array.newBuilder(this.array_).mergeFrom(value).buildPartial() : value;
                this.onChanged();
            } else {
                this.arrayBuilder_.mergeFrom((AbstractMessage)value);
            }
            this.bitField0_ |= 0x100;
            return this;
        }

        public Builder clearArray() {
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

        public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
        }
    }

    public static enum Type implements ProtocolMessageEnum
    {
        IDENT(1),
        LITERAL(2),
        VARIABLE(3),
        FUNC_CALL(4),
        OPERATOR(5),
        PLACEHOLDER(6),
        OBJECT(7),
        ARRAY(8);

        public static final int IDENT_VALUE = 1;
        public static final int LITERAL_VALUE = 2;
        public static final int VARIABLE_VALUE = 3;
        public static final int FUNC_CALL_VALUE = 4;
        public static final int OPERATOR_VALUE = 5;
        public static final int PLACEHOLDER_VALUE = 6;
        public static final int OBJECT_VALUE = 7;
        public static final int ARRAY_VALUE = 8;
        private static final Internal.EnumLiteMap<Type> internalValueMap;
        private static final Type[] VALUES;
        private final int value;

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static Type valueOf(int value) {
            return Type.forNumber(value);
        }

        public static Type forNumber(int value) {
            switch (value) {
                case 1: {
                    return IDENT;
                }
                case 2: {
                    return LITERAL;
                }
                case 3: {
                    return VARIABLE;
                }
                case 4: {
                    return FUNC_CALL;
                }
                case 5: {
                    return OPERATOR;
                }
                case 6: {
                    return PLACEHOLDER;
                }
                case 7: {
                    return OBJECT;
                }
                case 8: {
                    return ARRAY;
                }
            }
            return null;
        }

        public static Internal.EnumLiteMap<Type> internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return (Descriptors.EnumValueDescriptor)Type.getDescriptor().getValues().get(this.ordinal());
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return Type.getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return (Descriptors.EnumDescriptor)MysqlxExpr.Expr.getDescriptor().getEnumTypes().get(0);
        }

        public static Type valueOf(Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != Type.getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            return VALUES[desc.getIndex()];
        }

        private Type(int value) {
            this.value = value;
        }

        static {
            internalValueMap = new Internal.EnumLiteMap<Type>(){

                public Type findValueByNumber(int number) {
                    return Type.forNumber(number);
                }
            };
            VALUES = Type.values();
        }
    }
}
