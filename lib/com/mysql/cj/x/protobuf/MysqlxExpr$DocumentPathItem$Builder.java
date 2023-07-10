/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
 *  com.google.protobuf.UnknownFieldSet
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxExpr;
import java.io.IOException;

public static final class MysqlxExpr.DocumentPathItem.Builder
extends GeneratedMessageV3.Builder<MysqlxExpr.DocumentPathItem.Builder>
implements MysqlxExpr.DocumentPathItemOrBuilder {
    private int bitField0_;
    private int type_ = 1;
    private Object value_ = "";
    private int index_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Expr_DocumentPathItem_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Expr_DocumentPathItem_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxExpr.DocumentPathItem.class, MysqlxExpr.DocumentPathItem.Builder.class);
    }

    private MysqlxExpr.DocumentPathItem.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxExpr.DocumentPathItem.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public MysqlxExpr.DocumentPathItem.Builder clear() {
        super.clear();
        this.type_ = 1;
        this.bitField0_ &= 0xFFFFFFFE;
        this.value_ = "";
        this.bitField0_ &= 0xFFFFFFFD;
        this.index_ = 0;
        this.bitField0_ &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Expr_DocumentPathItem_descriptor;
    }

    public MysqlxExpr.DocumentPathItem getDefaultInstanceForType() {
        return MysqlxExpr.DocumentPathItem.getDefaultInstance();
    }

    public MysqlxExpr.DocumentPathItem build() {
        MysqlxExpr.DocumentPathItem result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxExpr.DocumentPathItem.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxExpr.DocumentPathItem buildPartial() {
        MysqlxExpr.DocumentPathItem result = new MysqlxExpr.DocumentPathItem(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            to_bitField0_ |= 1;
        }
        result.type_ = this.type_;
        if ((from_bitField0_ & 2) != 0) {
            to_bitField0_ |= 2;
        }
        result.value_ = this.value_;
        if ((from_bitField0_ & 4) != 0) {
            result.index_ = this.index_;
            to_bitField0_ |= 4;
        }
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxExpr.DocumentPathItem.Builder clone() {
        return (MysqlxExpr.DocumentPathItem.Builder)super.clone();
    }

    public MysqlxExpr.DocumentPathItem.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxExpr.DocumentPathItem.Builder)super.setField(field, value);
    }

    public MysqlxExpr.DocumentPathItem.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxExpr.DocumentPathItem.Builder)super.clearField(field);
    }

    public MysqlxExpr.DocumentPathItem.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxExpr.DocumentPathItem.Builder)super.clearOneof(oneof);
    }

    public MysqlxExpr.DocumentPathItem.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxExpr.DocumentPathItem.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxExpr.DocumentPathItem.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxExpr.DocumentPathItem.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxExpr.DocumentPathItem.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxExpr.DocumentPathItem) {
            return this.mergeFrom((MysqlxExpr.DocumentPathItem)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxExpr.DocumentPathItem.Builder mergeFrom(MysqlxExpr.DocumentPathItem other) {
        if (other == MysqlxExpr.DocumentPathItem.getDefaultInstance()) {
            return this;
        }
        if (other.hasType()) {
            this.setType(other.getType());
        }
        if (other.hasValue()) {
            this.bitField0_ |= 2;
            this.value_ = other.value_;
            this.onChanged();
        }
        if (other.hasIndex()) {
            this.setIndex(other.getIndex());
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.hasType();
    }

    public MysqlxExpr.DocumentPathItem.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxExpr.DocumentPathItem parsedMessage = null;
        try {
            parsedMessage = (MysqlxExpr.DocumentPathItem)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxExpr.DocumentPathItem)e.getUnfinishedMessage();
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
    public MysqlxExpr.DocumentPathItem.Type getType() {
        MysqlxExpr.DocumentPathItem.Type result = MysqlxExpr.DocumentPathItem.Type.valueOf(this.type_);
        return result == null ? MysqlxExpr.DocumentPathItem.Type.MEMBER : result;
    }

    public MysqlxExpr.DocumentPathItem.Builder setType(MysqlxExpr.DocumentPathItem.Type value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.type_ = value.getNumber();
        this.onChanged();
        return this;
    }

    public MysqlxExpr.DocumentPathItem.Builder clearType() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.type_ = 1;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasValue() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public String getValue() {
        Object ref = this.value_;
        if (!(ref instanceof String)) {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.value_ = s;
            }
            return s;
        }
        return (String)ref;
    }

    @Override
    public ByteString getValueBytes() {
        Object ref = this.value_;
        if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)((String)ref));
            this.value_ = b;
            return b;
        }
        return (ByteString)ref;
    }

    public MysqlxExpr.DocumentPathItem.Builder setValue(String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 2;
        this.value_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxExpr.DocumentPathItem.Builder clearValue() {
        this.bitField0_ &= 0xFFFFFFFD;
        this.value_ = MysqlxExpr.DocumentPathItem.getDefaultInstance().getValue();
        this.onChanged();
        return this;
    }

    public MysqlxExpr.DocumentPathItem.Builder setValueBytes(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 2;
        this.value_ = value;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasIndex() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override
    public int getIndex() {
        return this.index_;
    }

    public MysqlxExpr.DocumentPathItem.Builder setIndex(int value) {
        this.bitField0_ |= 4;
        this.index_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxExpr.DocumentPathItem.Builder clearIndex() {
        this.bitField0_ &= 0xFFFFFFFB;
        this.index_ = 0;
        this.onChanged();
        return this;
    }

    public final MysqlxExpr.DocumentPathItem.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxExpr.DocumentPathItem.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxExpr.DocumentPathItem.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxExpr.DocumentPathItem.Builder)super.mergeUnknownFields(unknownFields);
    }
}
