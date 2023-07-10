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

public static final class MysqlxDatatypes.Object.Builder
extends GeneratedMessageV3.Builder<MysqlxDatatypes.Object.Builder>
implements MysqlxDatatypes.ObjectOrBuilder {
    private int bitField0_;
    private List<MysqlxDatatypes.Object.ObjectField> fld_ = Collections.emptyList();
    private RepeatedFieldBuilderV3<MysqlxDatatypes.Object.ObjectField, MysqlxDatatypes.Object.ObjectField.Builder, MysqlxDatatypes.Object.ObjectFieldOrBuilder> fldBuilder_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Datatypes_Object_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Datatypes_Object_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxDatatypes.Object.class, MysqlxDatatypes.Object.Builder.class);
    }

    private MysqlxDatatypes.Object.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxDatatypes.Object.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            this.getFldFieldBuilder();
        }
    }

    public MysqlxDatatypes.Object.Builder clear() {
        super.clear();
        if (this.fldBuilder_ == null) {
            this.fld_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFFE;
        } else {
            this.fldBuilder_.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Datatypes_Object_descriptor;
    }

    public MysqlxDatatypes.Object getDefaultInstanceForType() {
        return MysqlxDatatypes.Object.getDefaultInstance();
    }

    public MysqlxDatatypes.Object build() {
        MysqlxDatatypes.Object result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxDatatypes.Object.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxDatatypes.Object buildPartial() {
        MysqlxDatatypes.Object result = new MysqlxDatatypes.Object(this, null);
        int from_bitField0_ = this.bitField0_;
        if (this.fldBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
                this.fld_ = Collections.unmodifiableList(this.fld_);
                this.bitField0_ &= 0xFFFFFFFE;
            }
            result.fld_ = this.fld_;
        } else {
            result.fld_ = this.fldBuilder_.build();
        }
        this.onBuilt();
        return result;
    }

    public MysqlxDatatypes.Object.Builder clone() {
        return (MysqlxDatatypes.Object.Builder)super.clone();
    }

    public MysqlxDatatypes.Object.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxDatatypes.Object.Builder)super.setField(field, value);
    }

    public MysqlxDatatypes.Object.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxDatatypes.Object.Builder)super.clearField(field);
    }

    public MysqlxDatatypes.Object.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxDatatypes.Object.Builder)super.clearOneof(oneof);
    }

    public MysqlxDatatypes.Object.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxDatatypes.Object.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxDatatypes.Object.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxDatatypes.Object.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxDatatypes.Object.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxDatatypes.Object) {
            return this.mergeFrom((MysqlxDatatypes.Object)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxDatatypes.Object.Builder mergeFrom(MysqlxDatatypes.Object other) {
        if (other == MysqlxDatatypes.Object.getDefaultInstance()) {
            return this;
        }
        if (this.fldBuilder_ == null) {
            if (!other.fld_.isEmpty()) {
                if (this.fld_.isEmpty()) {
                    this.fld_ = other.fld_;
                    this.bitField0_ &= 0xFFFFFFFE;
                } else {
                    this.ensureFldIsMutable();
                    this.fld_.addAll(other.fld_);
                }
                this.onChanged();
            }
        } else if (!other.fld_.isEmpty()) {
            if (this.fldBuilder_.isEmpty()) {
                this.fldBuilder_.dispose();
                this.fldBuilder_ = null;
                this.fld_ = other.fld_;
                this.bitField0_ &= 0xFFFFFFFE;
                this.fldBuilder_ = alwaysUseFieldBuilders ? this.getFldFieldBuilder() : null;
            } else {
                this.fldBuilder_.addAllMessages((Iterable)other.fld_);
            }
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.getFldCount(); ++i) {
            if (this.getFld(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public MysqlxDatatypes.Object.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxDatatypes.Object parsedMessage = null;
        try {
            parsedMessage = (MysqlxDatatypes.Object)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxDatatypes.Object)e.getUnfinishedMessage();
            throw e.unwrapIOException();
        }
        finally {
            if (parsedMessage != null) {
                this.mergeFrom(parsedMessage);
            }
        }
        return this;
    }

    private void ensureFldIsMutable() {
        if ((this.bitField0_ & 1) == 0) {
            this.fld_ = new ArrayList<MysqlxDatatypes.Object.ObjectField>(this.fld_);
            this.bitField0_ |= 1;
        }
    }

    @Override
    public List<MysqlxDatatypes.Object.ObjectField> getFldList() {
        if (this.fldBuilder_ == null) {
            return Collections.unmodifiableList(this.fld_);
        }
        return this.fldBuilder_.getMessageList();
    }

    @Override
    public int getFldCount() {
        if (this.fldBuilder_ == null) {
            return this.fld_.size();
        }
        return this.fldBuilder_.getCount();
    }

    @Override
    public MysqlxDatatypes.Object.ObjectField getFld(int index) {
        if (this.fldBuilder_ == null) {
            return this.fld_.get(index);
        }
        return (MysqlxDatatypes.Object.ObjectField)this.fldBuilder_.getMessage(index);
    }

    public MysqlxDatatypes.Object.Builder setFld(int index, MysqlxDatatypes.Object.ObjectField value) {
        if (this.fldBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.ensureFldIsMutable();
            this.fld_.set(index, value);
            this.onChanged();
        } else {
            this.fldBuilder_.setMessage(index, (AbstractMessage)value);
        }
        return this;
    }

    public MysqlxDatatypes.Object.Builder setFld(int index, MysqlxDatatypes.Object.ObjectField.Builder builderForValue) {
        if (this.fldBuilder_ == null) {
            this.ensureFldIsMutable();
            this.fld_.set(index, builderForValue.build());
            this.onChanged();
        } else {
            this.fldBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxDatatypes.Object.Builder addFld(MysqlxDatatypes.Object.ObjectField value) {
        if (this.fldBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.ensureFldIsMutable();
            this.fld_.add(value);
            this.onChanged();
        } else {
            this.fldBuilder_.addMessage((AbstractMessage)value);
        }
        return this;
    }

    public MysqlxDatatypes.Object.Builder addFld(int index, MysqlxDatatypes.Object.ObjectField value) {
        if (this.fldBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.ensureFldIsMutable();
            this.fld_.add(index, value);
            this.onChanged();
        } else {
            this.fldBuilder_.addMessage(index, (AbstractMessage)value);
        }
        return this;
    }

    public MysqlxDatatypes.Object.Builder addFld(MysqlxDatatypes.Object.ObjectField.Builder builderForValue) {
        if (this.fldBuilder_ == null) {
            this.ensureFldIsMutable();
            this.fld_.add(builderForValue.build());
            this.onChanged();
        } else {
            this.fldBuilder_.addMessage((AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxDatatypes.Object.Builder addFld(int index, MysqlxDatatypes.Object.ObjectField.Builder builderForValue) {
        if (this.fldBuilder_ == null) {
            this.ensureFldIsMutable();
            this.fld_.add(index, builderForValue.build());
            this.onChanged();
        } else {
            this.fldBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxDatatypes.Object.Builder addAllFld(Iterable<? extends MysqlxDatatypes.Object.ObjectField> values) {
        if (this.fldBuilder_ == null) {
            this.ensureFldIsMutable();
            AbstractMessageLite.Builder.addAll(values, this.fld_);
            this.onChanged();
        } else {
            this.fldBuilder_.addAllMessages(values);
        }
        return this;
    }

    public MysqlxDatatypes.Object.Builder clearFld() {
        if (this.fldBuilder_ == null) {
            this.fld_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.fldBuilder_.clear();
        }
        return this;
    }

    public MysqlxDatatypes.Object.Builder removeFld(int index) {
        if (this.fldBuilder_ == null) {
            this.ensureFldIsMutable();
            this.fld_.remove(index);
            this.onChanged();
        } else {
            this.fldBuilder_.remove(index);
        }
        return this;
    }

    public MysqlxDatatypes.Object.ObjectField.Builder getFldBuilder(int index) {
        return (MysqlxDatatypes.Object.ObjectField.Builder)this.getFldFieldBuilder().getBuilder(index);
    }

    @Override
    public MysqlxDatatypes.Object.ObjectFieldOrBuilder getFldOrBuilder(int index) {
        if (this.fldBuilder_ == null) {
            return this.fld_.get(index);
        }
        return (MysqlxDatatypes.Object.ObjectFieldOrBuilder)this.fldBuilder_.getMessageOrBuilder(index);
    }

    @Override
    public List<? extends MysqlxDatatypes.Object.ObjectFieldOrBuilder> getFldOrBuilderList() {
        if (this.fldBuilder_ != null) {
            return this.fldBuilder_.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.fld_);
    }

    public MysqlxDatatypes.Object.ObjectField.Builder addFldBuilder() {
        return (MysqlxDatatypes.Object.ObjectField.Builder)this.getFldFieldBuilder().addBuilder((AbstractMessage)MysqlxDatatypes.Object.ObjectField.getDefaultInstance());
    }

    public MysqlxDatatypes.Object.ObjectField.Builder addFldBuilder(int index) {
        return (MysqlxDatatypes.Object.ObjectField.Builder)this.getFldFieldBuilder().addBuilder(index, (AbstractMessage)MysqlxDatatypes.Object.ObjectField.getDefaultInstance());
    }

    public List<MysqlxDatatypes.Object.ObjectField.Builder> getFldBuilderList() {
        return this.getFldFieldBuilder().getBuilderList();
    }

    private RepeatedFieldBuilderV3<MysqlxDatatypes.Object.ObjectField, MysqlxDatatypes.Object.ObjectField.Builder, MysqlxDatatypes.Object.ObjectFieldOrBuilder> getFldFieldBuilder() {
        if (this.fldBuilder_ == null) {
            this.fldBuilder_ = new RepeatedFieldBuilderV3(this.fld_, (this.bitField0_ & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.fld_ = null;
        }
        return this.fldBuilder_;
    }

    public final MysqlxDatatypes.Object.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxDatatypes.Object.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxDatatypes.Object.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxDatatypes.Object.Builder)super.mergeUnknownFields(unknownFields);
    }
}
