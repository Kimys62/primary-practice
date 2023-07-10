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
import com.mysql.cj.x.protobuf.MysqlxExpr;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public static final class MysqlxExpr.Object.Builder
extends GeneratedMessageV3.Builder<MysqlxExpr.Object.Builder>
implements MysqlxExpr.ObjectOrBuilder {
    private int bitField0_;
    private List<MysqlxExpr.Object.ObjectField> fld_ = Collections.emptyList();
    private RepeatedFieldBuilderV3<MysqlxExpr.Object.ObjectField, MysqlxExpr.Object.ObjectField.Builder, MysqlxExpr.Object.ObjectFieldOrBuilder> fldBuilder_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Expr_Object_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Expr_Object_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxExpr.Object.class, MysqlxExpr.Object.Builder.class);
    }

    private MysqlxExpr.Object.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxExpr.Object.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            this.getFldFieldBuilder();
        }
    }

    public MysqlxExpr.Object.Builder clear() {
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
        return internal_static_Mysqlx_Expr_Object_descriptor;
    }

    public MysqlxExpr.Object getDefaultInstanceForType() {
        return MysqlxExpr.Object.getDefaultInstance();
    }

    public MysqlxExpr.Object build() {
        MysqlxExpr.Object result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxExpr.Object.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxExpr.Object buildPartial() {
        MysqlxExpr.Object result = new MysqlxExpr.Object(this, null);
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

    public MysqlxExpr.Object.Builder clone() {
        return (MysqlxExpr.Object.Builder)super.clone();
    }

    public MysqlxExpr.Object.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxExpr.Object.Builder)super.setField(field, value);
    }

    public MysqlxExpr.Object.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxExpr.Object.Builder)super.clearField(field);
    }

    public MysqlxExpr.Object.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxExpr.Object.Builder)super.clearOneof(oneof);
    }

    public MysqlxExpr.Object.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxExpr.Object.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxExpr.Object.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxExpr.Object.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxExpr.Object.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxExpr.Object) {
            return this.mergeFrom((MysqlxExpr.Object)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxExpr.Object.Builder mergeFrom(MysqlxExpr.Object other) {
        if (other == MysqlxExpr.Object.getDefaultInstance()) {
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

    public MysqlxExpr.Object.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxExpr.Object parsedMessage = null;
        try {
            parsedMessage = (MysqlxExpr.Object)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxExpr.Object)e.getUnfinishedMessage();
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
            this.fld_ = new ArrayList<MysqlxExpr.Object.ObjectField>(this.fld_);
            this.bitField0_ |= 1;
        }
    }

    @Override
    public List<MysqlxExpr.Object.ObjectField> getFldList() {
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
    public MysqlxExpr.Object.ObjectField getFld(int index) {
        if (this.fldBuilder_ == null) {
            return this.fld_.get(index);
        }
        return (MysqlxExpr.Object.ObjectField)this.fldBuilder_.getMessage(index);
    }

    public MysqlxExpr.Object.Builder setFld(int index, MysqlxExpr.Object.ObjectField value) {
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

    public MysqlxExpr.Object.Builder setFld(int index, MysqlxExpr.Object.ObjectField.Builder builderForValue) {
        if (this.fldBuilder_ == null) {
            this.ensureFldIsMutable();
            this.fld_.set(index, builderForValue.build());
            this.onChanged();
        } else {
            this.fldBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxExpr.Object.Builder addFld(MysqlxExpr.Object.ObjectField value) {
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

    public MysqlxExpr.Object.Builder addFld(int index, MysqlxExpr.Object.ObjectField value) {
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

    public MysqlxExpr.Object.Builder addFld(MysqlxExpr.Object.ObjectField.Builder builderForValue) {
        if (this.fldBuilder_ == null) {
            this.ensureFldIsMutable();
            this.fld_.add(builderForValue.build());
            this.onChanged();
        } else {
            this.fldBuilder_.addMessage((AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxExpr.Object.Builder addFld(int index, MysqlxExpr.Object.ObjectField.Builder builderForValue) {
        if (this.fldBuilder_ == null) {
            this.ensureFldIsMutable();
            this.fld_.add(index, builderForValue.build());
            this.onChanged();
        } else {
            this.fldBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxExpr.Object.Builder addAllFld(Iterable<? extends MysqlxExpr.Object.ObjectField> values) {
        if (this.fldBuilder_ == null) {
            this.ensureFldIsMutable();
            AbstractMessageLite.Builder.addAll(values, this.fld_);
            this.onChanged();
        } else {
            this.fldBuilder_.addAllMessages(values);
        }
        return this;
    }

    public MysqlxExpr.Object.Builder clearFld() {
        if (this.fldBuilder_ == null) {
            this.fld_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.fldBuilder_.clear();
        }
        return this;
    }

    public MysqlxExpr.Object.Builder removeFld(int index) {
        if (this.fldBuilder_ == null) {
            this.ensureFldIsMutable();
            this.fld_.remove(index);
            this.onChanged();
        } else {
            this.fldBuilder_.remove(index);
        }
        return this;
    }

    public MysqlxExpr.Object.ObjectField.Builder getFldBuilder(int index) {
        return (MysqlxExpr.Object.ObjectField.Builder)this.getFldFieldBuilder().getBuilder(index);
    }

    @Override
    public MysqlxExpr.Object.ObjectFieldOrBuilder getFldOrBuilder(int index) {
        if (this.fldBuilder_ == null) {
            return this.fld_.get(index);
        }
        return (MysqlxExpr.Object.ObjectFieldOrBuilder)this.fldBuilder_.getMessageOrBuilder(index);
    }

    @Override
    public List<? extends MysqlxExpr.Object.ObjectFieldOrBuilder> getFldOrBuilderList() {
        if (this.fldBuilder_ != null) {
            return this.fldBuilder_.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.fld_);
    }

    public MysqlxExpr.Object.ObjectField.Builder addFldBuilder() {
        return (MysqlxExpr.Object.ObjectField.Builder)this.getFldFieldBuilder().addBuilder((AbstractMessage)MysqlxExpr.Object.ObjectField.getDefaultInstance());
    }

    public MysqlxExpr.Object.ObjectField.Builder addFldBuilder(int index) {
        return (MysqlxExpr.Object.ObjectField.Builder)this.getFldFieldBuilder().addBuilder(index, (AbstractMessage)MysqlxExpr.Object.ObjectField.getDefaultInstance());
    }

    public List<MysqlxExpr.Object.ObjectField.Builder> getFldBuilderList() {
        return this.getFldFieldBuilder().getBuilderList();
    }

    private RepeatedFieldBuilderV3<MysqlxExpr.Object.ObjectField, MysqlxExpr.Object.ObjectField.Builder, MysqlxExpr.Object.ObjectFieldOrBuilder> getFldFieldBuilder() {
        if (this.fldBuilder_ == null) {
            this.fldBuilder_ = new RepeatedFieldBuilderV3(this.fld_, (this.bitField0_ & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.fld_ = null;
        }
        return this.fldBuilder_;
    }

    public final MysqlxExpr.Object.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxExpr.Object.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxExpr.Object.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxExpr.Object.Builder)super.mergeUnknownFields(unknownFields);
    }
}
