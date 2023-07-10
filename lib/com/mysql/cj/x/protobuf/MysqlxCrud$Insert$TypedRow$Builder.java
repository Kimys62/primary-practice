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
import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.mysql.cj.x.protobuf.MysqlxExpr;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public static final class MysqlxCrud.Insert.TypedRow.Builder
extends GeneratedMessageV3.Builder<MysqlxCrud.Insert.TypedRow.Builder>
implements MysqlxCrud.Insert.TypedRowOrBuilder {
    private int bitField0_;
    private List<MysqlxExpr.Expr> field_ = Collections.emptyList();
    private RepeatedFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> fieldBuilder_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Crud_Insert_TypedRow_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Crud_Insert_TypedRow_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.Insert.TypedRow.class, MysqlxCrud.Insert.TypedRow.Builder.class);
    }

    private MysqlxCrud.Insert.TypedRow.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxCrud.Insert.TypedRow.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            this.getFieldFieldBuilder();
        }
    }

    public MysqlxCrud.Insert.TypedRow.Builder clear() {
        super.clear();
        if (this.fieldBuilder_ == null) {
            this.field_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFFE;
        } else {
            this.fieldBuilder_.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Crud_Insert_TypedRow_descriptor;
    }

    public MysqlxCrud.Insert.TypedRow getDefaultInstanceForType() {
        return MysqlxCrud.Insert.TypedRow.getDefaultInstance();
    }

    public MysqlxCrud.Insert.TypedRow build() {
        MysqlxCrud.Insert.TypedRow result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxCrud.Insert.TypedRow.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxCrud.Insert.TypedRow buildPartial() {
        MysqlxCrud.Insert.TypedRow result = new MysqlxCrud.Insert.TypedRow(this, null);
        int from_bitField0_ = this.bitField0_;
        if (this.fieldBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
                this.field_ = Collections.unmodifiableList(this.field_);
                this.bitField0_ &= 0xFFFFFFFE;
            }
            result.field_ = this.field_;
        } else {
            result.field_ = this.fieldBuilder_.build();
        }
        this.onBuilt();
        return result;
    }

    public MysqlxCrud.Insert.TypedRow.Builder clone() {
        return (MysqlxCrud.Insert.TypedRow.Builder)super.clone();
    }

    public MysqlxCrud.Insert.TypedRow.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCrud.Insert.TypedRow.Builder)super.setField(field, value);
    }

    public MysqlxCrud.Insert.TypedRow.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxCrud.Insert.TypedRow.Builder)super.clearField(field);
    }

    public MysqlxCrud.Insert.TypedRow.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxCrud.Insert.TypedRow.Builder)super.clearOneof(oneof);
    }

    public MysqlxCrud.Insert.TypedRow.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxCrud.Insert.TypedRow.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxCrud.Insert.TypedRow.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCrud.Insert.TypedRow.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxCrud.Insert.TypedRow.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxCrud.Insert.TypedRow) {
            return this.mergeFrom((MysqlxCrud.Insert.TypedRow)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxCrud.Insert.TypedRow.Builder mergeFrom(MysqlxCrud.Insert.TypedRow other) {
        if (other == MysqlxCrud.Insert.TypedRow.getDefaultInstance()) {
            return this;
        }
        if (this.fieldBuilder_ == null) {
            if (!other.field_.isEmpty()) {
                if (this.field_.isEmpty()) {
                    this.field_ = other.field_;
                    this.bitField0_ &= 0xFFFFFFFE;
                } else {
                    this.ensureFieldIsMutable();
                    this.field_.addAll(other.field_);
                }
                this.onChanged();
            }
        } else if (!other.field_.isEmpty()) {
            if (this.fieldBuilder_.isEmpty()) {
                this.fieldBuilder_.dispose();
                this.fieldBuilder_ = null;
                this.field_ = other.field_;
                this.bitField0_ &= 0xFFFFFFFE;
                this.fieldBuilder_ = alwaysUseFieldBuilders ? this.getFieldFieldBuilder() : null;
            } else {
                this.fieldBuilder_.addAllMessages((Iterable)other.field_);
            }
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.getFieldCount(); ++i) {
            if (this.getField(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public MysqlxCrud.Insert.TypedRow.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxCrud.Insert.TypedRow parsedMessage = null;
        try {
            parsedMessage = (MysqlxCrud.Insert.TypedRow)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxCrud.Insert.TypedRow)e.getUnfinishedMessage();
            throw e.unwrapIOException();
        }
        finally {
            if (parsedMessage != null) {
                this.mergeFrom(parsedMessage);
            }
        }
        return this;
    }

    private void ensureFieldIsMutable() {
        if ((this.bitField0_ & 1) == 0) {
            this.field_ = new ArrayList<MysqlxExpr.Expr>(this.field_);
            this.bitField0_ |= 1;
        }
    }

    @Override
    public List<MysqlxExpr.Expr> getFieldList() {
        if (this.fieldBuilder_ == null) {
            return Collections.unmodifiableList(this.field_);
        }
        return this.fieldBuilder_.getMessageList();
    }

    @Override
    public int getFieldCount() {
        if (this.fieldBuilder_ == null) {
            return this.field_.size();
        }
        return this.fieldBuilder_.getCount();
    }

    @Override
    public MysqlxExpr.Expr getField(int index) {
        if (this.fieldBuilder_ == null) {
            return this.field_.get(index);
        }
        return (MysqlxExpr.Expr)this.fieldBuilder_.getMessage(index);
    }

    public MysqlxCrud.Insert.TypedRow.Builder setField(int index, MysqlxExpr.Expr value) {
        if (this.fieldBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.ensureFieldIsMutable();
            this.field_.set(index, value);
            this.onChanged();
        } else {
            this.fieldBuilder_.setMessage(index, (AbstractMessage)value);
        }
        return this;
    }

    public MysqlxCrud.Insert.TypedRow.Builder setField(int index, MysqlxExpr.Expr.Builder builderForValue) {
        if (this.fieldBuilder_ == null) {
            this.ensureFieldIsMutable();
            this.field_.set(index, builderForValue.build());
            this.onChanged();
        } else {
            this.fieldBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxCrud.Insert.TypedRow.Builder addField(MysqlxExpr.Expr value) {
        if (this.fieldBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.ensureFieldIsMutable();
            this.field_.add(value);
            this.onChanged();
        } else {
            this.fieldBuilder_.addMessage((AbstractMessage)value);
        }
        return this;
    }

    public MysqlxCrud.Insert.TypedRow.Builder addField(int index, MysqlxExpr.Expr value) {
        if (this.fieldBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.ensureFieldIsMutable();
            this.field_.add(index, value);
            this.onChanged();
        } else {
            this.fieldBuilder_.addMessage(index, (AbstractMessage)value);
        }
        return this;
    }

    public MysqlxCrud.Insert.TypedRow.Builder addField(MysqlxExpr.Expr.Builder builderForValue) {
        if (this.fieldBuilder_ == null) {
            this.ensureFieldIsMutable();
            this.field_.add(builderForValue.build());
            this.onChanged();
        } else {
            this.fieldBuilder_.addMessage((AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxCrud.Insert.TypedRow.Builder addField(int index, MysqlxExpr.Expr.Builder builderForValue) {
        if (this.fieldBuilder_ == null) {
            this.ensureFieldIsMutable();
            this.field_.add(index, builderForValue.build());
            this.onChanged();
        } else {
            this.fieldBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxCrud.Insert.TypedRow.Builder addAllField(Iterable<? extends MysqlxExpr.Expr> values) {
        if (this.fieldBuilder_ == null) {
            this.ensureFieldIsMutable();
            AbstractMessageLite.Builder.addAll(values, this.field_);
            this.onChanged();
        } else {
            this.fieldBuilder_.addAllMessages(values);
        }
        return this;
    }

    public MysqlxCrud.Insert.TypedRow.Builder clearField() {
        if (this.fieldBuilder_ == null) {
            this.field_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.fieldBuilder_.clear();
        }
        return this;
    }

    public MysqlxCrud.Insert.TypedRow.Builder removeField(int index) {
        if (this.fieldBuilder_ == null) {
            this.ensureFieldIsMutable();
            this.field_.remove(index);
            this.onChanged();
        } else {
            this.fieldBuilder_.remove(index);
        }
        return this;
    }

    public MysqlxExpr.Expr.Builder getFieldBuilder(int index) {
        return (MysqlxExpr.Expr.Builder)this.getFieldFieldBuilder().getBuilder(index);
    }

    @Override
    public MysqlxExpr.ExprOrBuilder getFieldOrBuilder(int index) {
        if (this.fieldBuilder_ == null) {
            return this.field_.get(index);
        }
        return (MysqlxExpr.ExprOrBuilder)this.fieldBuilder_.getMessageOrBuilder(index);
    }

    @Override
    public List<? extends MysqlxExpr.ExprOrBuilder> getFieldOrBuilderList() {
        if (this.fieldBuilder_ != null) {
            return this.fieldBuilder_.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.field_);
    }

    public MysqlxExpr.Expr.Builder addFieldBuilder() {
        return (MysqlxExpr.Expr.Builder)this.getFieldFieldBuilder().addBuilder((AbstractMessage)MysqlxExpr.Expr.getDefaultInstance());
    }

    public MysqlxExpr.Expr.Builder addFieldBuilder(int index) {
        return (MysqlxExpr.Expr.Builder)this.getFieldFieldBuilder().addBuilder(index, (AbstractMessage)MysqlxExpr.Expr.getDefaultInstance());
    }

    public List<MysqlxExpr.Expr.Builder> getFieldBuilderList() {
        return this.getFieldFieldBuilder().getBuilderList();
    }

    private RepeatedFieldBuilderV3<MysqlxExpr.Expr, MysqlxExpr.Expr.Builder, MysqlxExpr.ExprOrBuilder> getFieldFieldBuilder() {
        if (this.fieldBuilder_ == null) {
            this.fieldBuilder_ = new RepeatedFieldBuilderV3(this.field_, (this.bitField0_ & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.field_ = null;
        }
        return this.fieldBuilder_;
    }

    public final MysqlxCrud.Insert.TypedRow.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCrud.Insert.TypedRow.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxCrud.Insert.TypedRow.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCrud.Insert.TypedRow.Builder)super.mergeUnknownFields(unknownFields);
    }
}
