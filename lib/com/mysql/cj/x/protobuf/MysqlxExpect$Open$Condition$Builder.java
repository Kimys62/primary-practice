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
import com.mysql.cj.x.protobuf.MysqlxExpect;
import java.io.IOException;

public static final class MysqlxExpect.Open.Condition.Builder
extends GeneratedMessageV3.Builder<MysqlxExpect.Open.Condition.Builder>
implements MysqlxExpect.Open.ConditionOrBuilder {
    private int bitField0_;
    private int conditionKey_;
    private ByteString conditionValue_ = ByteString.EMPTY;
    private int op_ = 0;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Expect_Open_Condition_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Expect_Open_Condition_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxExpect.Open.Condition.class, MysqlxExpect.Open.Condition.Builder.class);
    }

    private MysqlxExpect.Open.Condition.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxExpect.Open.Condition.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public MysqlxExpect.Open.Condition.Builder clear() {
        super.clear();
        this.conditionKey_ = 0;
        this.bitField0_ &= 0xFFFFFFFE;
        this.conditionValue_ = ByteString.EMPTY;
        this.bitField0_ &= 0xFFFFFFFD;
        this.op_ = 0;
        this.bitField0_ &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Expect_Open_Condition_descriptor;
    }

    public MysqlxExpect.Open.Condition getDefaultInstanceForType() {
        return MysqlxExpect.Open.Condition.getDefaultInstance();
    }

    public MysqlxExpect.Open.Condition build() {
        MysqlxExpect.Open.Condition result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxExpect.Open.Condition.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxExpect.Open.Condition buildPartial() {
        MysqlxExpect.Open.Condition result = new MysqlxExpect.Open.Condition(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            result.conditionKey_ = this.conditionKey_;
            to_bitField0_ |= 1;
        }
        if ((from_bitField0_ & 2) != 0) {
            to_bitField0_ |= 2;
        }
        result.conditionValue_ = this.conditionValue_;
        if ((from_bitField0_ & 4) != 0) {
            to_bitField0_ |= 4;
        }
        result.op_ = this.op_;
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxExpect.Open.Condition.Builder clone() {
        return (MysqlxExpect.Open.Condition.Builder)super.clone();
    }

    public MysqlxExpect.Open.Condition.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxExpect.Open.Condition.Builder)super.setField(field, value);
    }

    public MysqlxExpect.Open.Condition.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxExpect.Open.Condition.Builder)super.clearField(field);
    }

    public MysqlxExpect.Open.Condition.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxExpect.Open.Condition.Builder)super.clearOneof(oneof);
    }

    public MysqlxExpect.Open.Condition.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxExpect.Open.Condition.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxExpect.Open.Condition.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxExpect.Open.Condition.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxExpect.Open.Condition.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxExpect.Open.Condition) {
            return this.mergeFrom((MysqlxExpect.Open.Condition)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxExpect.Open.Condition.Builder mergeFrom(MysqlxExpect.Open.Condition other) {
        if (other == MysqlxExpect.Open.Condition.getDefaultInstance()) {
            return this;
        }
        if (other.hasConditionKey()) {
            this.setConditionKey(other.getConditionKey());
        }
        if (other.hasConditionValue()) {
            this.setConditionValue(other.getConditionValue());
        }
        if (other.hasOp()) {
            this.setOp(other.getOp());
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.hasConditionKey();
    }

    public MysqlxExpect.Open.Condition.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxExpect.Open.Condition parsedMessage = null;
        try {
            parsedMessage = (MysqlxExpect.Open.Condition)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxExpect.Open.Condition)e.getUnfinishedMessage();
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
    public boolean hasConditionKey() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public int getConditionKey() {
        return this.conditionKey_;
    }

    public MysqlxExpect.Open.Condition.Builder setConditionKey(int value) {
        this.bitField0_ |= 1;
        this.conditionKey_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxExpect.Open.Condition.Builder clearConditionKey() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.conditionKey_ = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasConditionValue() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public ByteString getConditionValue() {
        return this.conditionValue_;
    }

    public MysqlxExpect.Open.Condition.Builder setConditionValue(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 2;
        this.conditionValue_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxExpect.Open.Condition.Builder clearConditionValue() {
        this.bitField0_ &= 0xFFFFFFFD;
        this.conditionValue_ = MysqlxExpect.Open.Condition.getDefaultInstance().getConditionValue();
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasOp() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override
    public MysqlxExpect.Open.Condition.ConditionOperation getOp() {
        MysqlxExpect.Open.Condition.ConditionOperation result = MysqlxExpect.Open.Condition.ConditionOperation.valueOf(this.op_);
        return result == null ? MysqlxExpect.Open.Condition.ConditionOperation.EXPECT_OP_SET : result;
    }

    public MysqlxExpect.Open.Condition.Builder setOp(MysqlxExpect.Open.Condition.ConditionOperation value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 4;
        this.op_ = value.getNumber();
        this.onChanged();
        return this;
    }

    public MysqlxExpect.Open.Condition.Builder clearOp() {
        this.bitField0_ &= 0xFFFFFFFB;
        this.op_ = 0;
        this.onChanged();
        return this;
    }

    public final MysqlxExpect.Open.Condition.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxExpect.Open.Condition.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxExpect.Open.Condition.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxExpect.Open.Condition.Builder)super.mergeUnknownFields(unknownFields);
    }
}
