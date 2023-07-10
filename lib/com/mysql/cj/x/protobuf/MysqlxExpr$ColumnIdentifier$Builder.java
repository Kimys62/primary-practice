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
import com.mysql.cj.x.protobuf.MysqlxExpr;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public static final class MysqlxExpr.ColumnIdentifier.Builder
extends GeneratedMessageV3.Builder<MysqlxExpr.ColumnIdentifier.Builder>
implements MysqlxExpr.ColumnIdentifierOrBuilder {
    private int bitField0_;
    private List<MysqlxExpr.DocumentPathItem> documentPath_ = Collections.emptyList();
    private RepeatedFieldBuilderV3<MysqlxExpr.DocumentPathItem, MysqlxExpr.DocumentPathItem.Builder, MysqlxExpr.DocumentPathItemOrBuilder> documentPathBuilder_;
    private Object name_ = "";
    private Object tableName_ = "";
    private Object schemaName_ = "";

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Expr_ColumnIdentifier_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Expr_ColumnIdentifier_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxExpr.ColumnIdentifier.class, MysqlxExpr.ColumnIdentifier.Builder.class);
    }

    private MysqlxExpr.ColumnIdentifier.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxExpr.ColumnIdentifier.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            this.getDocumentPathFieldBuilder();
        }
    }

    public MysqlxExpr.ColumnIdentifier.Builder clear() {
        super.clear();
        if (this.documentPathBuilder_ == null) {
            this.documentPath_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFFE;
        } else {
            this.documentPathBuilder_.clear();
        }
        this.name_ = "";
        this.bitField0_ &= 0xFFFFFFFD;
        this.tableName_ = "";
        this.bitField0_ &= 0xFFFFFFFB;
        this.schemaName_ = "";
        this.bitField0_ &= 0xFFFFFFF7;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Expr_ColumnIdentifier_descriptor;
    }

    public MysqlxExpr.ColumnIdentifier getDefaultInstanceForType() {
        return MysqlxExpr.ColumnIdentifier.getDefaultInstance();
    }

    public MysqlxExpr.ColumnIdentifier build() {
        MysqlxExpr.ColumnIdentifier result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxExpr.ColumnIdentifier.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxExpr.ColumnIdentifier buildPartial() {
        MysqlxExpr.ColumnIdentifier result = new MysqlxExpr.ColumnIdentifier(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if (this.documentPathBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
                this.documentPath_ = Collections.unmodifiableList(this.documentPath_);
                this.bitField0_ &= 0xFFFFFFFE;
            }
            result.documentPath_ = this.documentPath_;
        } else {
            result.documentPath_ = this.documentPathBuilder_.build();
        }
        if ((from_bitField0_ & 2) != 0) {
            to_bitField0_ |= 1;
        }
        result.name_ = this.name_;
        if ((from_bitField0_ & 4) != 0) {
            to_bitField0_ |= 2;
        }
        result.tableName_ = this.tableName_;
        if ((from_bitField0_ & 8) != 0) {
            to_bitField0_ |= 4;
        }
        result.schemaName_ = this.schemaName_;
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxExpr.ColumnIdentifier.Builder clone() {
        return (MysqlxExpr.ColumnIdentifier.Builder)super.clone();
    }

    public MysqlxExpr.ColumnIdentifier.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxExpr.ColumnIdentifier.Builder)super.setField(field, value);
    }

    public MysqlxExpr.ColumnIdentifier.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxExpr.ColumnIdentifier.Builder)super.clearField(field);
    }

    public MysqlxExpr.ColumnIdentifier.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxExpr.ColumnIdentifier.Builder)super.clearOneof(oneof);
    }

    public MysqlxExpr.ColumnIdentifier.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxExpr.ColumnIdentifier.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxExpr.ColumnIdentifier.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxExpr.ColumnIdentifier.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxExpr.ColumnIdentifier.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxExpr.ColumnIdentifier) {
            return this.mergeFrom((MysqlxExpr.ColumnIdentifier)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxExpr.ColumnIdentifier.Builder mergeFrom(MysqlxExpr.ColumnIdentifier other) {
        if (other == MysqlxExpr.ColumnIdentifier.getDefaultInstance()) {
            return this;
        }
        if (this.documentPathBuilder_ == null) {
            if (!other.documentPath_.isEmpty()) {
                if (this.documentPath_.isEmpty()) {
                    this.documentPath_ = other.documentPath_;
                    this.bitField0_ &= 0xFFFFFFFE;
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
                this.bitField0_ &= 0xFFFFFFFE;
                this.documentPathBuilder_ = alwaysUseFieldBuilders ? this.getDocumentPathFieldBuilder() : null;
            } else {
                this.documentPathBuilder_.addAllMessages((Iterable)other.documentPath_);
            }
        }
        if (other.hasName()) {
            this.bitField0_ |= 2;
            this.name_ = other.name_;
            this.onChanged();
        }
        if (other.hasTableName()) {
            this.bitField0_ |= 4;
            this.tableName_ = other.tableName_;
            this.onChanged();
        }
        if (other.hasSchemaName()) {
            this.bitField0_ |= 8;
            this.schemaName_ = other.schemaName_;
            this.onChanged();
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

    public MysqlxExpr.ColumnIdentifier.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxExpr.ColumnIdentifier parsedMessage = null;
        try {
            parsedMessage = (MysqlxExpr.ColumnIdentifier)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxExpr.ColumnIdentifier)e.getUnfinishedMessage();
            throw e.unwrapIOException();
        }
        finally {
            if (parsedMessage != null) {
                this.mergeFrom(parsedMessage);
            }
        }
        return this;
    }

    private void ensureDocumentPathIsMutable() {
        if ((this.bitField0_ & 1) == 0) {
            this.documentPath_ = new ArrayList<MysqlxExpr.DocumentPathItem>(this.documentPath_);
            this.bitField0_ |= 1;
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

    public MysqlxExpr.ColumnIdentifier.Builder setDocumentPath(int index, MysqlxExpr.DocumentPathItem value) {
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

    public MysqlxExpr.ColumnIdentifier.Builder setDocumentPath(int index, MysqlxExpr.DocumentPathItem.Builder builderForValue) {
        if (this.documentPathBuilder_ == null) {
            this.ensureDocumentPathIsMutable();
            this.documentPath_.set(index, builderForValue.build());
            this.onChanged();
        } else {
            this.documentPathBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxExpr.ColumnIdentifier.Builder addDocumentPath(MysqlxExpr.DocumentPathItem value) {
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

    public MysqlxExpr.ColumnIdentifier.Builder addDocumentPath(int index, MysqlxExpr.DocumentPathItem value) {
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

    public MysqlxExpr.ColumnIdentifier.Builder addDocumentPath(MysqlxExpr.DocumentPathItem.Builder builderForValue) {
        if (this.documentPathBuilder_ == null) {
            this.ensureDocumentPathIsMutable();
            this.documentPath_.add(builderForValue.build());
            this.onChanged();
        } else {
            this.documentPathBuilder_.addMessage((AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxExpr.ColumnIdentifier.Builder addDocumentPath(int index, MysqlxExpr.DocumentPathItem.Builder builderForValue) {
        if (this.documentPathBuilder_ == null) {
            this.ensureDocumentPathIsMutable();
            this.documentPath_.add(index, builderForValue.build());
            this.onChanged();
        } else {
            this.documentPathBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxExpr.ColumnIdentifier.Builder addAllDocumentPath(Iterable<? extends MysqlxExpr.DocumentPathItem> values) {
        if (this.documentPathBuilder_ == null) {
            this.ensureDocumentPathIsMutable();
            AbstractMessageLite.Builder.addAll(values, this.documentPath_);
            this.onChanged();
        } else {
            this.documentPathBuilder_.addAllMessages(values);
        }
        return this;
    }

    public MysqlxExpr.ColumnIdentifier.Builder clearDocumentPath() {
        if (this.documentPathBuilder_ == null) {
            this.documentPath_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.documentPathBuilder_.clear();
        }
        return this;
    }

    public MysqlxExpr.ColumnIdentifier.Builder removeDocumentPath(int index) {
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
            this.documentPathBuilder_ = new RepeatedFieldBuilderV3(this.documentPath_, (this.bitField0_ & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.documentPath_ = null;
        }
        return this.documentPathBuilder_;
    }

    @Override
    public boolean hasName() {
        return (this.bitField0_ & 2) != 0;
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

    public MysqlxExpr.ColumnIdentifier.Builder setName(String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 2;
        this.name_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxExpr.ColumnIdentifier.Builder clearName() {
        this.bitField0_ &= 0xFFFFFFFD;
        this.name_ = MysqlxExpr.ColumnIdentifier.getDefaultInstance().getName();
        this.onChanged();
        return this;
    }

    public MysqlxExpr.ColumnIdentifier.Builder setNameBytes(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 2;
        this.name_ = value;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasTableName() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override
    public String getTableName() {
        Object ref = this.tableName_;
        if (!(ref instanceof String)) {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.tableName_ = s;
            }
            return s;
        }
        return (String)ref;
    }

    @Override
    public ByteString getTableNameBytes() {
        Object ref = this.tableName_;
        if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)((String)ref));
            this.tableName_ = b;
            return b;
        }
        return (ByteString)ref;
    }

    public MysqlxExpr.ColumnIdentifier.Builder setTableName(String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 4;
        this.tableName_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxExpr.ColumnIdentifier.Builder clearTableName() {
        this.bitField0_ &= 0xFFFFFFFB;
        this.tableName_ = MysqlxExpr.ColumnIdentifier.getDefaultInstance().getTableName();
        this.onChanged();
        return this;
    }

    public MysqlxExpr.ColumnIdentifier.Builder setTableNameBytes(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 4;
        this.tableName_ = value;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasSchemaName() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override
    public String getSchemaName() {
        Object ref = this.schemaName_;
        if (!(ref instanceof String)) {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.schemaName_ = s;
            }
            return s;
        }
        return (String)ref;
    }

    @Override
    public ByteString getSchemaNameBytes() {
        Object ref = this.schemaName_;
        if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)((String)ref));
            this.schemaName_ = b;
            return b;
        }
        return (ByteString)ref;
    }

    public MysqlxExpr.ColumnIdentifier.Builder setSchemaName(String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 8;
        this.schemaName_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxExpr.ColumnIdentifier.Builder clearSchemaName() {
        this.bitField0_ &= 0xFFFFFFF7;
        this.schemaName_ = MysqlxExpr.ColumnIdentifier.getDefaultInstance().getSchemaName();
        this.onChanged();
        return this;
    }

    public MysqlxExpr.ColumnIdentifier.Builder setSchemaNameBytes(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 8;
        this.schemaName_ = value;
        this.onChanged();
        return this;
    }

    public final MysqlxExpr.ColumnIdentifier.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxExpr.ColumnIdentifier.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxExpr.ColumnIdentifier.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxExpr.ColumnIdentifier.Builder)super.mergeUnknownFields(unknownFields);
    }
}
