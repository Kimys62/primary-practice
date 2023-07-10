/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
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
 *  com.google.protobuf.RepeatedFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxExpect;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public static final class MysqlxExpect.Open.Builder
extends GeneratedMessageV3.Builder<MysqlxExpect.Open.Builder>
implements MysqlxExpect.OpenOrBuilder {
    private int bitField0_;
    private int op_ = 0;
    private List<MysqlxExpect.Open.Condition> cond_ = Collections.emptyList();
    private RepeatedFieldBuilderV3<MysqlxExpect.Open.Condition, MysqlxExpect.Open.Condition.Builder, MysqlxExpect.Open.ConditionOrBuilder> condBuilder_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Expect_Open_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Expect_Open_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxExpect.Open.class, MysqlxExpect.Open.Builder.class);
    }

    private MysqlxExpect.Open.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxExpect.Open.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            this.getCondFieldBuilder();
        }
    }

    public MysqlxExpect.Open.Builder clear() {
        super.clear();
        this.op_ = 0;
        this.bitField0_ &= 0xFFFFFFFE;
        if (this.condBuilder_ == null) {
            this.cond_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFFD;
        } else {
            this.condBuilder_.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Expect_Open_descriptor;
    }

    public MysqlxExpect.Open getDefaultInstanceForType() {
        return MysqlxExpect.Open.getDefaultInstance();
    }

    public MysqlxExpect.Open build() {
        MysqlxExpect.Open result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxExpect.Open.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxExpect.Open buildPartial() {
        MysqlxExpect.Open result = new MysqlxExpect.Open(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            to_bitField0_ |= 1;
        }
        result.op_ = this.op_;
        if (this.condBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0) {
                this.cond_ = Collections.unmodifiableList(this.cond_);
                this.bitField0_ &= 0xFFFFFFFD;
            }
            result.cond_ = this.cond_;
        } else {
            result.cond_ = this.condBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxExpect.Open.Builder clone() {
        return (MysqlxExpect.Open.Builder)super.clone();
    }

    public MysqlxExpect.Open.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxExpect.Open.Builder)super.setField(field, value);
    }

    public MysqlxExpect.Open.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxExpect.Open.Builder)super.clearField(field);
    }

    public MysqlxExpect.Open.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxExpect.Open.Builder)super.clearOneof(oneof);
    }

    public MysqlxExpect.Open.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxExpect.Open.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxExpect.Open.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxExpect.Open.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxExpect.Open.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxExpect.Open) {
            return this.mergeFrom((MysqlxExpect.Open)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxExpect.Open.Builder mergeFrom(MysqlxExpect.Open other) {
        if (other == MysqlxExpect.Open.getDefaultInstance()) {
            return this;
        }
        if (other.hasOp()) {
            this.setOp(other.getOp());
        }
        if (this.condBuilder_ == null) {
            if (!other.cond_.isEmpty()) {
                if (this.cond_.isEmpty()) {
                    this.cond_ = other.cond_;
                    this.bitField0_ &= 0xFFFFFFFD;
                } else {
                    this.ensureCondIsMutable();
                    this.cond_.addAll(other.cond_);
                }
                this.onChanged();
            }
        } else if (!other.cond_.isEmpty()) {
            if (this.condBuilder_.isEmpty()) {
                this.condBuilder_.dispose();
                this.condBuilder_ = null;
                this.cond_ = other.cond_;
                this.bitField0_ &= 0xFFFFFFFD;
                this.condBuilder_ = alwaysUseFieldBuilders ? this.getCondFieldBuilder() : null;
            } else {
                this.condBuilder_.addAllMessages((Iterable)other.cond_);
            }
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.getCondCount(); ++i) {
            if (this.getCond(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public MysqlxExpect.Open.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxExpect.Open parsedMessage = null;
        try {
            parsedMessage = (MysqlxExpect.Open)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxExpect.Open)e.getUnfinishedMessage();
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
    public boolean hasOp() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public MysqlxExpect.Open.CtxOperation getOp() {
        MysqlxExpect.Open.CtxOperation result = MysqlxExpect.Open.CtxOperation.valueOf(this.op_);
        return result == null ? MysqlxExpect.Open.CtxOperation.EXPECT_CTX_COPY_PREV : result;
    }

    public MysqlxExpect.Open.Builder setOp(MysqlxExpect.Open.CtxOperation value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.op_ = value.getNumber();
        this.onChanged();
        return this;
    }

    public MysqlxExpect.Open.Builder clearOp() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.op_ = 0;
        this.onChanged();
        return this;
    }

    private void ensureCondIsMutable() {
        if ((this.bitField0_ & 2) == 0) {
            this.cond_ = new ArrayList<MysqlxExpect.Open.Condition>(this.cond_);
            this.bitField0_ |= 2;
        }
    }

    @Override
    public List<MysqlxExpect.Open.Condition> getCondList() {
        if (this.condBuilder_ == null) {
            return Collections.unmodifiableList(this.cond_);
        }
        return this.condBuilder_.getMessageList();
    }

    @Override
    public int getCondCount() {
        if (this.condBuilder_ == null) {
            return this.cond_.size();
        }
        return this.condBuilder_.getCount();
    }

    @Override
    public MysqlxExpect.Open.Condition getCond(int index) {
        if (this.condBuilder_ == null) {
            return this.cond_.get(index);
        }
        return (MysqlxExpect.Open.Condition)this.condBuilder_.getMessage(index);
    }

    public MysqlxExpect.Open.Builder setCond(int index, MysqlxExpect.Open.Condition value) {
        if (this.condBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.ensureCondIsMutable();
            this.cond_.set(index, value);
            this.onChanged();
        } else {
            this.condBuilder_.setMessage(index, (AbstractMessage)value);
        }
        return this;
    }

    public MysqlxExpect.Open.Builder setCond(int index, MysqlxExpect.Open.Condition.Builder builderForValue) {
        if (this.condBuilder_ == null) {
            this.ensureCondIsMutable();
            this.cond_.set(index, builderForValue.build());
            this.onChanged();
        } else {
            this.condBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxExpect.Open.Builder addCond(MysqlxExpect.Open.Condition value) {
        if (this.condBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.ensureCondIsMutable();
            this.cond_.add(value);
            this.onChanged();
        } else {
            this.condBuilder_.addMessage((AbstractMessage)value);
        }
        return this;
    }

    public MysqlxExpect.Open.Builder addCond(int index, MysqlxExpect.Open.Condition value) {
        if (this.condBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.ensureCondIsMutable();
            this.cond_.add(index, value);
            this.onChanged();
        } else {
            this.condBuilder_.addMessage(index, (AbstractMessage)value);
        }
        return this;
    }

    public MysqlxExpect.Open.Builder addCond(MysqlxExpect.Open.Condition.Builder builderForValue) {
        if (this.condBuilder_ == null) {
            this.ensureCondIsMutable();
            this.cond_.add(builderForValue.build());
            this.onChanged();
        } else {
            this.condBuilder_.addMessage((AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxExpect.Open.Builder addCond(int index, MysqlxExpect.Open.Condition.Builder builderForValue) {
        if (this.condBuilder_ == null) {
            this.ensureCondIsMutable();
            this.cond_.add(index, builderForValue.build());
            this.onChanged();
        } else {
            this.condBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxExpect.Open.Builder addAllCond(Iterable<? extends MysqlxExpect.Open.Condition> values) {
        if (this.condBuilder_ == null) {
            this.ensureCondIsMutable();
            AbstractMessageLite.Builder.addAll(values, this.cond_);
            this.onChanged();
        } else {
            this.condBuilder_.addAllMessages(values);
        }
        return this;
    }

    public MysqlxExpect.Open.Builder clearCond() {
        if (this.condBuilder_ == null) {
            this.cond_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.condBuilder_.clear();
        }
        return this;
    }

    public MysqlxExpect.Open.Builder removeCond(int index) {
        if (this.condBuilder_ == null) {
            this.ensureCondIsMutable();
            this.cond_.remove(index);
            this.onChanged();
        } else {
            this.condBuilder_.remove(index);
        }
        return this;
    }

    public MysqlxExpect.Open.Condition.Builder getCondBuilder(int index) {
        return (MysqlxExpect.Open.Condition.Builder)this.getCondFieldBuilder().getBuilder(index);
    }

    @Override
    public MysqlxExpect.Open.ConditionOrBuilder getCondOrBuilder(int index) {
        if (this.condBuilder_ == null) {
            return this.cond_.get(index);
        }
        return (MysqlxExpect.Open.ConditionOrBuilder)this.condBuilder_.getMessageOrBuilder(index);
    }

    @Override
    public List<? extends MysqlxExpect.Open.ConditionOrBuilder> getCondOrBuilderList() {
        if (this.condBuilder_ != null) {
            return this.condBuilder_.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.cond_);
    }

    public MysqlxExpect.Open.Condition.Builder addCondBuilder() {
        return (MysqlxExpect.Open.Condition.Builder)this.getCondFieldBuilder().addBuilder((AbstractMessage)MysqlxExpect.Open.Condition.getDefaultInstance());
    }

    public MysqlxExpect.Open.Condition.Builder addCondBuilder(int index) {
        return (MysqlxExpect.Open.Condition.Builder)this.getCondFieldBuilder().addBuilder(index, (AbstractMessage)MysqlxExpect.Open.Condition.getDefaultInstance());
    }

    public List<MysqlxExpect.Open.Condition.Builder> getCondBuilderList() {
        return this.getCondFieldBuilder().getBuilderList();
    }

    private RepeatedFieldBuilderV3<MysqlxExpect.Open.Condition, MysqlxExpect.Open.Condition.Builder, MysqlxExpect.Open.ConditionOrBuilder> getCondFieldBuilder() {
        if (this.condBuilder_ == null) {
            this.condBuilder_ = new RepeatedFieldBuilderV3(this.cond_, (this.bitField0_ & 2) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.cond_ = null;
        }
        return this.condBuilder_;
    }

    public final MysqlxExpect.Open.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxExpect.Open.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxExpect.Open.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxExpect.Open.Builder)super.mergeUnknownFields(unknownFields);
    }
}
