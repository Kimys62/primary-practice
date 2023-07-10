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
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public static final class MysqlxDatatypes.Array.Builder
extends GeneratedMessageV3.Builder<MysqlxDatatypes.Array.Builder>
implements MysqlxDatatypes.ArrayOrBuilder {
    private int bitField0_;
    private List<MysqlxDatatypes.Any> value_ = Collections.emptyList();
    private RepeatedFieldBuilderV3<MysqlxDatatypes.Any, MysqlxDatatypes.Any.Builder, MysqlxDatatypes.AnyOrBuilder> valueBuilder_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Datatypes_Array_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Datatypes_Array_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxDatatypes.Array.class, MysqlxDatatypes.Array.Builder.class);
    }

    private MysqlxDatatypes.Array.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxDatatypes.Array.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            this.getValueFieldBuilder();
        }
    }

    public MysqlxDatatypes.Array.Builder clear() {
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
        return internal_static_Mysqlx_Datatypes_Array_descriptor;
    }

    public MysqlxDatatypes.Array getDefaultInstanceForType() {
        return MysqlxDatatypes.Array.getDefaultInstance();
    }

    public MysqlxDatatypes.Array build() {
        MysqlxDatatypes.Array result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxDatatypes.Array.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxDatatypes.Array buildPartial() {
        MysqlxDatatypes.Array result = new MysqlxDatatypes.Array(this, null);
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

    public MysqlxDatatypes.Array.Builder clone() {
        return (MysqlxDatatypes.Array.Builder)super.clone();
    }

    public MysqlxDatatypes.Array.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxDatatypes.Array.Builder)super.setField(field, value);
    }

    public MysqlxDatatypes.Array.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxDatatypes.Array.Builder)super.clearField(field);
    }

    public MysqlxDatatypes.Array.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxDatatypes.Array.Builder)super.clearOneof(oneof);
    }

    public MysqlxDatatypes.Array.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxDatatypes.Array.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxDatatypes.Array.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxDatatypes.Array.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxDatatypes.Array.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxDatatypes.Array) {
            return this.mergeFrom((MysqlxDatatypes.Array)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxDatatypes.Array.Builder mergeFrom(MysqlxDatatypes.Array other) {
        if (other == MysqlxDatatypes.Array.getDefaultInstance()) {
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

    public MysqlxDatatypes.Array.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxDatatypes.Array parsedMessage = null;
        try {
            parsedMessage = (MysqlxDatatypes.Array)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxDatatypes.Array)e.getUnfinishedMessage();
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
            this.value_ = new ArrayList<MysqlxDatatypes.Any>(this.value_);
            this.bitField0_ |= 1;
        }
    }

    @Override
    public List<MysqlxDatatypes.Any> getValueList() {
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
    public MysqlxDatatypes.Any getValue(int index) {
        if (this.valueBuilder_ == null) {
            return this.value_.get(index);
        }
        return (MysqlxDatatypes.Any)this.valueBuilder_.getMessage(index);
    }

    public MysqlxDatatypes.Array.Builder setValue(int index, MysqlxDatatypes.Any value) {
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

    public MysqlxDatatypes.Array.Builder setValue(int index, MysqlxDatatypes.Any.Builder builderForValue) {
        if (this.valueBuilder_ == null) {
            this.ensureValueIsMutable();
            this.value_.set(index, builderForValue.build());
            this.onChanged();
        } else {
            this.valueBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxDatatypes.Array.Builder addValue(MysqlxDatatypes.Any value) {
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

    public MysqlxDatatypes.Array.Builder addValue(int index, MysqlxDatatypes.Any value) {
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

    public MysqlxDatatypes.Array.Builder addValue(MysqlxDatatypes.Any.Builder builderForValue) {
        if (this.valueBuilder_ == null) {
            this.ensureValueIsMutable();
            this.value_.add(builderForValue.build());
            this.onChanged();
        } else {
            this.valueBuilder_.addMessage((AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxDatatypes.Array.Builder addValue(int index, MysqlxDatatypes.Any.Builder builderForValue) {
        if (this.valueBuilder_ == null) {
            this.ensureValueIsMutable();
            this.value_.add(index, builderForValue.build());
            this.onChanged();
        } else {
            this.valueBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxDatatypes.Array.Builder addAllValue(Iterable<? extends MysqlxDatatypes.Any> values) {
        if (this.valueBuilder_ == null) {
            this.ensureValueIsMutable();
            AbstractMessageLite.Builder.addAll(values, this.value_);
            this.onChanged();
        } else {
            this.valueBuilder_.addAllMessages(values);
        }
        return this;
    }

    public MysqlxDatatypes.Array.Builder clearValue() {
        if (this.valueBuilder_ == null) {
            this.value_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.valueBuilder_.clear();
        }
        return this;
    }

    public MysqlxDatatypes.Array.Builder removeValue(int index) {
        if (this.valueBuilder_ == null) {
            this.ensureValueIsMutable();
            this.value_.remove(index);
            this.onChanged();
        } else {
            this.valueBuilder_.remove(index);
        }
        return this;
    }

    public MysqlxDatatypes.Any.Builder getValueBuilder(int index) {
        return (MysqlxDatatypes.Any.Builder)this.getValueFieldBuilder().getBuilder(index);
    }

    @Override
    public MysqlxDatatypes.AnyOrBuilder getValueOrBuilder(int index) {
        if (this.valueBuilder_ == null) {
            return this.value_.get(index);
        }
        return (MysqlxDatatypes.AnyOrBuilder)this.valueBuilder_.getMessageOrBuilder(index);
    }

    @Override
    public List<? extends MysqlxDatatypes.AnyOrBuilder> getValueOrBuilderList() {
        if (this.valueBuilder_ != null) {
            return this.valueBuilder_.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.value_);
    }

    public MysqlxDatatypes.Any.Builder addValueBuilder() {
        return (MysqlxDatatypes.Any.Builder)this.getValueFieldBuilder().addBuilder((AbstractMessage)MysqlxDatatypes.Any.getDefaultInstance());
    }

    public MysqlxDatatypes.Any.Builder addValueBuilder(int index) {
        return (MysqlxDatatypes.Any.Builder)this.getValueFieldBuilder().addBuilder(index, (AbstractMessage)MysqlxDatatypes.Any.getDefaultInstance());
    }

    public List<MysqlxDatatypes.Any.Builder> getValueBuilderList() {
        return this.getValueFieldBuilder().getBuilderList();
    }

    private RepeatedFieldBuilderV3<MysqlxDatatypes.Any, MysqlxDatatypes.Any.Builder, MysqlxDatatypes.AnyOrBuilder> getValueFieldBuilder() {
        if (this.valueBuilder_ == null) {
            this.valueBuilder_ = new RepeatedFieldBuilderV3(this.value_, (this.bitField0_ & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.value_ = null;
        }
        return this.valueBuilder_;
    }

    public final MysqlxDatatypes.Array.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxDatatypes.Array.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxDatatypes.Array.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxDatatypes.Array.Builder)super.mergeUnknownFields(unknownFields);
    }
}
