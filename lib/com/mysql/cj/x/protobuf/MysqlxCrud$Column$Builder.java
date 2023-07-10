/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
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
 *  com.google.protobuf.RepeatedFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
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

public static final class MysqlxCrud.Column.Builder
extends GeneratedMessageV3.Builder<MysqlxCrud.Column.Builder>
implements MysqlxCrud.ColumnOrBuilder {
    private int bitField0_;
    private Object name_ = "";
    private Object alias_ = "";
    private List<MysqlxExpr.DocumentPathItem> documentPath_ = Collections.emptyList();
    private RepeatedFieldBuilderV3<MysqlxExpr.DocumentPathItem, MysqlxExpr.DocumentPathItem.Builder, MysqlxExpr.DocumentPathItemOrBuilder> documentPathBuilder_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Crud_Column_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Crud_Column_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.Column.class, MysqlxCrud.Column.Builder.class);
    }

    private MysqlxCrud.Column.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxCrud.Column.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            this.getDocumentPathFieldBuilder();
        }
    }

    public MysqlxCrud.Column.Builder clear() {
        super.clear();
        this.name_ = "";
        this.bitField0_ &= 0xFFFFFFFE;
        this.alias_ = "";
        this.bitField0_ &= 0xFFFFFFFD;
        if (this.documentPathBuilder_ == null) {
            this.documentPath_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFFB;
        } else {
            this.documentPathBuilder_.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Crud_Column_descriptor;
    }

    public MysqlxCrud.Column getDefaultInstanceForType() {
        return MysqlxCrud.Column.getDefaultInstance();
    }

    public MysqlxCrud.Column build() {
        MysqlxCrud.Column result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxCrud.Column.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxCrud.Column buildPartial() {
        MysqlxCrud.Column result = new MysqlxCrud.Column(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            to_bitField0_ |= 1;
        }
        result.name_ = this.name_;
        if ((from_bitField0_ & 2) != 0) {
            to_bitField0_ |= 2;
        }
        result.alias_ = this.alias_;
        if (this.documentPathBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0) {
                this.documentPath_ = Collections.unmodifiableList(this.documentPath_);
                this.bitField0_ &= 0xFFFFFFFB;
            }
            result.documentPath_ = this.documentPath_;
        } else {
            result.documentPath_ = this.documentPathBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxCrud.Column.Builder clone() {
        return (MysqlxCrud.Column.Builder)super.clone();
    }

    public MysqlxCrud.Column.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCrud.Column.Builder)super.setField(field, value);
    }

    public MysqlxCrud.Column.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxCrud.Column.Builder)super.clearField(field);
    }

    public MysqlxCrud.Column.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxCrud.Column.Builder)super.clearOneof(oneof);
    }

    public MysqlxCrud.Column.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxCrud.Column.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxCrud.Column.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCrud.Column.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxCrud.Column.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxCrud.Column) {
            return this.mergeFrom((MysqlxCrud.Column)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxCrud.Column.Builder mergeFrom(MysqlxCrud.Column other) {
        if (other == MysqlxCrud.Column.getDefaultInstance()) {
            return this;
        }
        if (other.hasName()) {
            this.bitField0_ |= 1;
            this.name_ = other.name_;
            this.onChanged();
        }
        if (other.hasAlias()) {
            this.bitField0_ |= 2;
            this.alias_ = other.alias_;
            this.onChanged();
        }
        if (this.documentPathBuilder_ == null) {
            if (!other.documentPath_.isEmpty()) {
                if (this.documentPath_.isEmpty()) {
                    this.documentPath_ = other.documentPath_;
                    this.bitField0_ &= 0xFFFFFFFB;
                } else {
                    this.ensureDocumentPathIsMutable();
                    this.documentPath_.addAll(other.documentPath_);
                }
                this.onChanged();
            }
        } else if (!other.documentPath_.isEmpty()) {
            if (this.documentPathBuilder_.isEmpty()) {
                this.documentPathBuilder_.dispose();
                this.documentPathBuilder_ = null;
                this.documentPath_ = other.documentPath_;
                this.bitField0_ &= 0xFFFFFFFB;
                this.documentPathBuilder_ = alwaysUseFieldBuilders ? this.getDocumentPathFieldBuilder() : null;
            } else {
                this.documentPathBuilder_.addAllMessages((Iterable)other.documentPath_);
            }
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.getDocumentPathCount(); ++i) {
            if (this.getDocumentPath(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public MysqlxCrud.Column.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxCrud.Column parsedMessage = null;
        try {
            parsedMessage = (MysqlxCrud.Column)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxCrud.Column)e.getUnfinishedMessage();
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
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public String getName() {
        Object ref = this.name_;
        if (!(ref instanceof String)) {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.name_ = s;
            }
            return s;
        }
        return (String)ref;
    }

    @Override
    public ByteString getNameBytes() {
        Object ref = this.name_;
        if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)((String)ref));
            this.name_ = b;
            return b;
        }
        return (ByteString)ref;
    }

    public MysqlxCrud.Column.Builder setName(String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.name_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxCrud.Column.Builder clearName() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.name_ = MysqlxCrud.Column.getDefaultInstance().getName();
        this.onChanged();
        return this;
    }

    public MysqlxCrud.Column.Builder setNameBytes(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.name_ = value;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasAlias() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public String getAlias() {
        Object ref = this.alias_;
        if (!(ref instanceof String)) {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.alias_ = s;
            }
            return s;
        }
        return (String)ref;
    }

    @Override
    public ByteString getAliasBytes() {
        Object ref = this.alias_;
        if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)((String)ref));
            this.alias_ = b;
            return b;
        }
        return (ByteString)ref;
    }

    public MysqlxCrud.Column.Builder setAlias(String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 2;
        this.alias_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxCrud.Column.Builder clearAlias() {
        this.bitField0_ &= 0xFFFFFFFD;
        this.alias_ = MysqlxCrud.Column.getDefaultInstance().getAlias();
        this.onChanged();
        return this;
    }

    public MysqlxCrud.Column.Builder setAliasBytes(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 2;
        this.alias_ = value;
        this.onChanged();
        return this;
    }

    private void ensureDocumentPathIsMutable() {
        if ((this.bitField0_ & 4) == 0) {
            this.documentPath_ = new ArrayList<MysqlxExpr.DocumentPathItem>(this.documentPath_);
            this.bitField0_ |= 4;
        }
    }

    @Override
    public List<MysqlxExpr.DocumentPathItem> getDocumentPathList() {
        if (this.documentPathBuilder_ == null) {
            return Collections.unmodifiableList(this.documentPath_);
        }
        return this.documentPathBuilder_.getMessageList();
    }

    @Override
    public int getDocumentPathCount() {
        if (this.documentPathBuilder_ == null) {
            return this.documentPath_.size();
        }
        return this.documentPathBuilder_.getCount();
    }

    @Override
    public MysqlxExpr.DocumentPathItem getDocumentPath(int index) {
        if (this.documentPathBuilder_ == null) {
            return this.documentPath_.get(index);
        }
        return (MysqlxExpr.DocumentPathItem)this.documentPathBuilder_.getMessage(index);
    }

    public MysqlxCrud.Column.Builder setDocumentPath(int index, MysqlxExpr.DocumentPathItem value) {
        if (this.documentPathBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.ensureDocumentPathIsMutable();
            this.documentPath_.set(index, value);
            this.onChanged();
        } else {
            this.documentPathBuilder_.setMessage(index, (AbstractMessage)value);
        }
        return this;
    }

    public MysqlxCrud.Column.Builder setDocumentPath(int index, MysqlxExpr.DocumentPathItem.Builder builderForValue) {
        if (this.documentPathBuilder_ == null) {
            this.ensureDocumentPathIsMutable();
            this.documentPath_.set(index, builderForValue.build());
            this.onChanged();
        } else {
            this.documentPathBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxCrud.Column.Builder addDocumentPath(MysqlxExpr.DocumentPathItem value) {
        if (this.documentPathBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.ensureDocumentPathIsMutable();
            this.documentPath_.add(value);
            this.onChanged();
        } else {
            this.documentPathBuilder_.addMessage((AbstractMessage)value);
        }
        return this;
    }

    public MysqlxCrud.Column.Builder addDocumentPath(int index, MysqlxExpr.DocumentPathItem value) {
        if (this.documentPathBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.ensureDocumentPathIsMutable();
            this.documentPath_.add(index, value);
            this.onChanged();
        } else {
            this.documentPathBuilder_.addMessage(index, (AbstractMessage)value);
        }
        return this;
    }

    public MysqlxCrud.Column.Builder addDocumentPath(MysqlxExpr.DocumentPathItem.Builder builderForValue) {
        if (this.documentPathBuilder_ == null) {
            this.ensureDocumentPathIsMutable();
            this.documentPath_.add(builderForValue.build());
            this.onChanged();
        } else {
            this.documentPathBuilder_.addMessage((AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxCrud.Column.Builder addDocumentPath(int index, MysqlxExpr.DocumentPathItem.Builder builderForValue) {
        if (this.documentPathBuilder_ == null) {
            this.ensureDocumentPathIsMutable();
            this.documentPath_.add(index, builderForValue.build());
            this.onChanged();
        } else {
            this.documentPathBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxCrud.Column.Builder addAllDocumentPath(Iterable<? extends MysqlxExpr.DocumentPathItem> values) {
        if (this.documentPathBuilder_ == null) {
            this.ensureDocumentPathIsMutable();
            AbstractMessageLite.Builder.addAll(values, this.documentPath_);
            this.onChanged();
        } else {
            this.documentPathBuilder_.addAllMessages(values);
        }
        return this;
    }

    public MysqlxCrud.Column.Builder clearDocumentPath() {
        if (this.documentPathBuilder_ == null) {
            this.documentPath_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFFB;
            this.onChanged();
        } else {
            this.documentPathBuilder_.clear();
        }
        return this;
    }

    public MysqlxCrud.Column.Builder removeDocumentPath(int index) {
        if (this.documentPathBuilder_ == null) {
            this.ensureDocumentPathIsMutable();
            this.documentPath_.remove(index);
            this.onChanged();
        } else {
            this.documentPathBuilder_.remove(index);
        }
        return this;
    }

    public MysqlxExpr.DocumentPathItem.Builder getDocumentPathBuilder(int index) {
        return (MysqlxExpr.DocumentPathItem.Builder)this.getDocumentPathFieldBuilder().getBuilder(index);
    }

    @Override
    public MysqlxExpr.DocumentPathItemOrBuilder getDocumentPathOrBuilder(int index) {
        if (this.documentPathBuilder_ == null) {
            return this.documentPath_.get(index);
        }
        return (MysqlxExpr.DocumentPathItemOrBuilder)this.documentPathBuilder_.getMessageOrBuilder(index);
    }

    @Override
    public List<? extends MysqlxExpr.DocumentPathItemOrBuilder> getDocumentPathOrBuilderList() {
        if (this.documentPathBuilder_ != null) {
            return this.documentPathBuilder_.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.documentPath_);
    }

    public MysqlxExpr.DocumentPathItem.Builder addDocumentPathBuilder() {
        return (MysqlxExpr.DocumentPathItem.Builder)this.getDocumentPathFieldBuilder().addBuilder((AbstractMessage)MysqlxExpr.DocumentPathItem.getDefaultInstance());
    }

    public MysqlxExpr.DocumentPathItem.Builder addDocumentPathBuilder(int index) {
        return (MysqlxExpr.DocumentPathItem.Builder)this.getDocumentPathFieldBuilder().addBuilder(index, (AbstractMessage)MysqlxExpr.DocumentPathItem.getDefaultInstance());
    }

    public List<MysqlxExpr.DocumentPathItem.Builder> getDocumentPathBuilderList() {
        return this.getDocumentPathFieldBuilder().getBuilderList();
    }

    private RepeatedFieldBuilderV3<MysqlxExpr.DocumentPathItem, MysqlxExpr.DocumentPathItem.Builder, MysqlxExpr.DocumentPathItemOrBuilder> getDocumentPathFieldBuilder() {
        if (this.documentPathBuilder_ == null) {
            this.documentPathBuilder_ = new RepeatedFieldBuilderV3(this.documentPath_, (this.bitField0_ & 4) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.documentPath_ = null;
        }
        return this.documentPathBuilder_;
    }

    public final MysqlxCrud.Column.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCrud.Column.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxCrud.Column.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCrud.Column.Builder)super.mergeUnknownFields(unknownFields);
    }
}
