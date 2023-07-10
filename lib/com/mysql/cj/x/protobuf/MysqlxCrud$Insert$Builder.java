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
 *  com.google.protobuf.SingleFieldBuilderV3
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public static final class MysqlxCrud.Insert.Builder
extends GeneratedMessageV3.Builder<MysqlxCrud.Insert.Builder>
implements MysqlxCrud.InsertOrBuilder {
    private int bitField0_;
    private MysqlxCrud.Collection collection_;
    private SingleFieldBuilderV3<MysqlxCrud.Collection, MysqlxCrud.Collection.Builder, MysqlxCrud.CollectionOrBuilder> collectionBuilder_;
    private int dataModel_ = 1;
    private List<MysqlxCrud.Column> projection_ = Collections.emptyList();
    private RepeatedFieldBuilderV3<MysqlxCrud.Column, MysqlxCrud.Column.Builder, MysqlxCrud.ColumnOrBuilder> projectionBuilder_;
    private List<MysqlxCrud.Insert.TypedRow> row_ = Collections.emptyList();
    private RepeatedFieldBuilderV3<MysqlxCrud.Insert.TypedRow, MysqlxCrud.Insert.TypedRow.Builder, MysqlxCrud.Insert.TypedRowOrBuilder> rowBuilder_;
    private List<MysqlxDatatypes.Scalar> args_ = Collections.emptyList();
    private RepeatedFieldBuilderV3<MysqlxDatatypes.Scalar, MysqlxDatatypes.Scalar.Builder, MysqlxDatatypes.ScalarOrBuilder> argsBuilder_;
    private boolean upsert_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Crud_Insert_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Crud_Insert_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.Insert.class, MysqlxCrud.Insert.Builder.class);
    }

    private MysqlxCrud.Insert.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxCrud.Insert.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            this.getCollectionFieldBuilder();
            this.getProjectionFieldBuilder();
            this.getRowFieldBuilder();
            this.getArgsFieldBuilder();
        }
    }

    public MysqlxCrud.Insert.Builder clear() {
        super.clear();
        if (this.collectionBuilder_ == null) {
            this.collection_ = null;
        } else {
            this.collectionBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFE;
        this.dataModel_ = 1;
        this.bitField0_ &= 0xFFFFFFFD;
        if (this.projectionBuilder_ == null) {
            this.projection_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFFB;
        } else {
            this.projectionBuilder_.clear();
        }
        if (this.rowBuilder_ == null) {
            this.row_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFF7;
        } else {
            this.rowBuilder_.clear();
        }
        if (this.argsBuilder_ == null) {
            this.args_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFEF;
        } else {
            this.argsBuilder_.clear();
        }
        this.upsert_ = false;
        this.bitField0_ &= 0xFFFFFFDF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Crud_Insert_descriptor;
    }

    public MysqlxCrud.Insert getDefaultInstanceForType() {
        return MysqlxCrud.Insert.getDefaultInstance();
    }

    public MysqlxCrud.Insert build() {
        MysqlxCrud.Insert result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxCrud.Insert.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxCrud.Insert buildPartial() {
        MysqlxCrud.Insert result = new MysqlxCrud.Insert(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            if (this.collectionBuilder_ == null) {
                result.collection_ = this.collection_;
            } else {
                result.collection_ = (MysqlxCrud.Collection)this.collectionBuilder_.build();
            }
            to_bitField0_ |= 1;
        }
        if ((from_bitField0_ & 2) != 0) {
            to_bitField0_ |= 2;
        }
        result.dataModel_ = this.dataModel_;
        if (this.projectionBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0) {
                this.projection_ = Collections.unmodifiableList(this.projection_);
                this.bitField0_ &= 0xFFFFFFFB;
            }
            result.projection_ = this.projection_;
        } else {
            result.projection_ = this.projectionBuilder_.build();
        }
        if (this.rowBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0) {
                this.row_ = Collections.unmodifiableList(this.row_);
                this.bitField0_ &= 0xFFFFFFF7;
            }
            result.row_ = this.row_;
        } else {
            result.row_ = this.rowBuilder_.build();
        }
        if (this.argsBuilder_ == null) {
            if ((this.bitField0_ & 0x10) != 0) {
                this.args_ = Collections.unmodifiableList(this.args_);
                this.bitField0_ &= 0xFFFFFFEF;
            }
            result.args_ = this.args_;
        } else {
            result.args_ = this.argsBuilder_.build();
        }
        if ((from_bitField0_ & 0x20) != 0) {
            result.upsert_ = this.upsert_;
            to_bitField0_ |= 4;
        }
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxCrud.Insert.Builder clone() {
        return (MysqlxCrud.Insert.Builder)super.clone();
    }

    public MysqlxCrud.Insert.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCrud.Insert.Builder)super.setField(field, value);
    }

    public MysqlxCrud.Insert.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxCrud.Insert.Builder)super.clearField(field);
    }

    public MysqlxCrud.Insert.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxCrud.Insert.Builder)super.clearOneof(oneof);
    }

    public MysqlxCrud.Insert.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxCrud.Insert.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxCrud.Insert.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCrud.Insert.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxCrud.Insert.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxCrud.Insert) {
            return this.mergeFrom((MysqlxCrud.Insert)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxCrud.Insert.Builder mergeFrom(MysqlxCrud.Insert other) {
        if (other == MysqlxCrud.Insert.getDefaultInstance()) {
            return this;
        }
        if (other.hasCollection()) {
            this.mergeCollection(other.getCollection());
        }
        if (other.hasDataModel()) {
            this.setDataModel(other.getDataModel());
        }
        if (this.projectionBuilder_ == null) {
            if (!other.projection_.isEmpty()) {
                if (this.projection_.isEmpty()) {
                    this.projection_ = other.projection_;
                    this.bitField0_ &= 0xFFFFFFFB;
                } else {
                    this.ensureProjectionIsMutable();
                    this.projection_.addAll(other.projection_);
                }
                this.onChanged();
            }
        } else if (!other.projection_.isEmpty()) {
            if (this.projectionBuilder_.isEmpty()) {
                this.projectionBuilder_.dispose();
                this.projectionBuilder_ = null;
                this.projection_ = other.projection_;
                this.bitField0_ &= 0xFFFFFFFB;
                this.projectionBuilder_ = alwaysUseFieldBuilders ? this.getProjectionFieldBuilder() : null;
            } else {
                this.projectionBuilder_.addAllMessages((Iterable)other.projection_);
            }
        }
        if (this.rowBuilder_ == null) {
            if (!other.row_.isEmpty()) {
                if (this.row_.isEmpty()) {
                    this.row_ = other.row_;
                    this.bitField0_ &= 0xFFFFFFF7;
                } else {
                    this.ensureRowIsMutable();
                    this.row_.addAll(other.row_);
                }
                this.onChanged();
            }
        } else if (!other.row_.isEmpty()) {
            if (this.rowBuilder_.isEmpty()) {
                this.rowBuilder_.dispose();
                this.rowBuilder_ = null;
                this.row_ = other.row_;
                this.bitField0_ &= 0xFFFFFFF7;
                this.rowBuilder_ = alwaysUseFieldBuilders ? this.getRowFieldBuilder() : null;
            } else {
                this.rowBuilder_.addAllMessages((Iterable)other.row_);
            }
        }
        if (this.argsBuilder_ == null) {
            if (!other.args_.isEmpty()) {
                if (this.args_.isEmpty()) {
                    this.args_ = other.args_;
                    this.bitField0_ &= 0xFFFFFFEF;
                } else {
                    this.ensureArgsIsMutable();
                    this.args_.addAll(other.args_);
                }
                this.onChanged();
            }
        } else if (!other.args_.isEmpty()) {
            if (this.argsBuilder_.isEmpty()) {
                this.argsBuilder_.dispose();
                this.argsBuilder_ = null;
                this.args_ = other.args_;
                this.bitField0_ &= 0xFFFFFFEF;
                this.argsBuilder_ = alwaysUseFieldBuilders ? this.getArgsFieldBuilder() : null;
            } else {
                this.argsBuilder_.addAllMessages((Iterable)other.args_);
            }
        }
        if (other.hasUpsert()) {
            this.setUpsert(other.getUpsert());
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        int i;
        if (!this.hasCollection()) {
            return false;
        }
        if (!this.getCollection().isInitialized()) {
            return false;
        }
        for (i = 0; i < this.getProjectionCount(); ++i) {
            if (this.getProjection(i).isInitialized()) continue;
            return false;
        }
        for (i = 0; i < this.getRowCount(); ++i) {
            if (this.getRow(i).isInitialized()) continue;
            return false;
        }
        for (i = 0; i < this.getArgsCount(); ++i) {
            if (this.getArgs(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public MysqlxCrud.Insert.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxCrud.Insert parsedMessage = null;
        try {
            parsedMessage = (MysqlxCrud.Insert)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxCrud.Insert)e.getUnfinishedMessage();
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
    public boolean hasCollection() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public MysqlxCrud.Collection getCollection() {
        if (this.collectionBuilder_ == null) {
            return this.collection_ == null ? MysqlxCrud.Collection.getDefaultInstance() : this.collection_;
        }
        return (MysqlxCrud.Collection)this.collectionBuilder_.getMessage();
    }

    public MysqlxCrud.Insert.Builder setCollection(MysqlxCrud.Collection value) {
        if (this.collectionBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.collection_ = value;
            this.onChanged();
        } else {
            this.collectionBuilder_.setMessage((AbstractMessage)value);
        }
        this.bitField0_ |= 1;
        return this;
    }

    public MysqlxCrud.Insert.Builder setCollection(MysqlxCrud.Collection.Builder builderForValue) {
        if (this.collectionBuilder_ == null) {
            this.collection_ = builderForValue.build();
            this.onChanged();
        } else {
            this.collectionBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 1;
        return this;
    }

    public MysqlxCrud.Insert.Builder mergeCollection(MysqlxCrud.Collection value) {
        if (this.collectionBuilder_ == null) {
            this.collection_ = (this.bitField0_ & 1) != 0 && this.collection_ != null && this.collection_ != MysqlxCrud.Collection.getDefaultInstance() ? MysqlxCrud.Collection.newBuilder(this.collection_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.collectionBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 1;
        return this;
    }

    public MysqlxCrud.Insert.Builder clearCollection() {
        if (this.collectionBuilder_ == null) {
            this.collection_ = null;
            this.onChanged();
        } else {
            this.collectionBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFE;
        return this;
    }

    public MysqlxCrud.Collection.Builder getCollectionBuilder() {
        this.bitField0_ |= 1;
        this.onChanged();
        return (MysqlxCrud.Collection.Builder)this.getCollectionFieldBuilder().getBuilder();
    }

    @Override
    public MysqlxCrud.CollectionOrBuilder getCollectionOrBuilder() {
        if (this.collectionBuilder_ != null) {
            return (MysqlxCrud.CollectionOrBuilder)this.collectionBuilder_.getMessageOrBuilder();
        }
        return this.collection_ == null ? MysqlxCrud.Collection.getDefaultInstance() : this.collection_;
    }

    private SingleFieldBuilderV3<MysqlxCrud.Collection, MysqlxCrud.Collection.Builder, MysqlxCrud.CollectionOrBuilder> getCollectionFieldBuilder() {
        if (this.collectionBuilder_ == null) {
            this.collectionBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getCollection(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.collection_ = null;
        }
        return this.collectionBuilder_;
    }

    @Override
    public boolean hasDataModel() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public MysqlxCrud.DataModel getDataModel() {
        MysqlxCrud.DataModel result = MysqlxCrud.DataModel.valueOf(this.dataModel_);
        return result == null ? MysqlxCrud.DataModel.DOCUMENT : result;
    }

    public MysqlxCrud.Insert.Builder setDataModel(MysqlxCrud.DataModel value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 2;
        this.dataModel_ = value.getNumber();
        this.onChanged();
        return this;
    }

    public MysqlxCrud.Insert.Builder clearDataModel() {
        this.bitField0_ &= 0xFFFFFFFD;
        this.dataModel_ = 1;
        this.onChanged();
        return this;
    }

    private void ensureProjectionIsMutable() {
        if ((this.bitField0_ & 4) == 0) {
            this.projection_ = new ArrayList<MysqlxCrud.Column>(this.projection_);
            this.bitField0_ |= 4;
        }
    }

    @Override
    public List<MysqlxCrud.Column> getProjectionList() {
        if (this.projectionBuilder_ == null) {
            return Collections.unmodifiableList(this.projection_);
        }
        return this.projectionBuilder_.getMessageList();
    }

    @Override
    public int getProjectionCount() {
        if (this.projectionBuilder_ == null) {
            return this.projection_.size();
        }
        return this.projectionBuilder_.getCount();
    }

    @Override
    public MysqlxCrud.Column getProjection(int index) {
        if (this.projectionBuilder_ == null) {
            return this.projection_.get(index);
        }
        return (MysqlxCrud.Column)this.projectionBuilder_.getMessage(index);
    }

    public MysqlxCrud.Insert.Builder setProjection(int index, MysqlxCrud.Column value) {
        if (this.projectionBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.ensureProjectionIsMutable();
            this.projection_.set(index, value);
            this.onChanged();
        } else {
            this.projectionBuilder_.setMessage(index, (AbstractMessage)value);
        }
        return this;
    }

    public MysqlxCrud.Insert.Builder setProjection(int index, MysqlxCrud.Column.Builder builderForValue) {
        if (this.projectionBuilder_ == null) {
            this.ensureProjectionIsMutable();
            this.projection_.set(index, builderForValue.build());
            this.onChanged();
        } else {
            this.projectionBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxCrud.Insert.Builder addProjection(MysqlxCrud.Column value) {
        if (this.projectionBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.ensureProjectionIsMutable();
            this.projection_.add(value);
            this.onChanged();
        } else {
            this.projectionBuilder_.addMessage((AbstractMessage)value);
        }
        return this;
    }

    public MysqlxCrud.Insert.Builder addProjection(int index, MysqlxCrud.Column value) {
        if (this.projectionBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.ensureProjectionIsMutable();
            this.projection_.add(index, value);
            this.onChanged();
        } else {
            this.projectionBuilder_.addMessage(index, (AbstractMessage)value);
        }
        return this;
    }

    public MysqlxCrud.Insert.Builder addProjection(MysqlxCrud.Column.Builder builderForValue) {
        if (this.projectionBuilder_ == null) {
            this.ensureProjectionIsMutable();
            this.projection_.add(builderForValue.build());
            this.onChanged();
        } else {
            this.projectionBuilder_.addMessage((AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxCrud.Insert.Builder addProjection(int index, MysqlxCrud.Column.Builder builderForValue) {
        if (this.projectionBuilder_ == null) {
            this.ensureProjectionIsMutable();
            this.projection_.add(index, builderForValue.build());
            this.onChanged();
        } else {
            this.projectionBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxCrud.Insert.Builder addAllProjection(Iterable<? extends MysqlxCrud.Column> values) {
        if (this.projectionBuilder_ == null) {
            this.ensureProjectionIsMutable();
            AbstractMessageLite.Builder.addAll(values, this.projection_);
            this.onChanged();
        } else {
            this.projectionBuilder_.addAllMessages(values);
        }
        return this;
    }

    public MysqlxCrud.Insert.Builder clearProjection() {
        if (this.projectionBuilder_ == null) {
            this.projection_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFFB;
            this.onChanged();
        } else {
            this.projectionBuilder_.clear();
        }
        return this;
    }

    public MysqlxCrud.Insert.Builder removeProjection(int index) {
        if (this.projectionBuilder_ == null) {
            this.ensureProjectionIsMutable();
            this.projection_.remove(index);
            this.onChanged();
        } else {
            this.projectionBuilder_.remove(index);
        }
        return this;
    }

    public MysqlxCrud.Column.Builder getProjectionBuilder(int index) {
        return (MysqlxCrud.Column.Builder)this.getProjectionFieldBuilder().getBuilder(index);
    }

    @Override
    public MysqlxCrud.ColumnOrBuilder getProjectionOrBuilder(int index) {
        if (this.projectionBuilder_ == null) {
            return this.projection_.get(index);
        }
        return (MysqlxCrud.ColumnOrBuilder)this.projectionBuilder_.getMessageOrBuilder(index);
    }

    @Override
    public List<? extends MysqlxCrud.ColumnOrBuilder> getProjectionOrBuilderList() {
        if (this.projectionBuilder_ != null) {
            return this.projectionBuilder_.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.projection_);
    }

    public MysqlxCrud.Column.Builder addProjectionBuilder() {
        return (MysqlxCrud.Column.Builder)this.getProjectionFieldBuilder().addBuilder((AbstractMessage)MysqlxCrud.Column.getDefaultInstance());
    }

    public MysqlxCrud.Column.Builder addProjectionBuilder(int index) {
        return (MysqlxCrud.Column.Builder)this.getProjectionFieldBuilder().addBuilder(index, (AbstractMessage)MysqlxCrud.Column.getDefaultInstance());
    }

    public List<MysqlxCrud.Column.Builder> getProjectionBuilderList() {
        return this.getProjectionFieldBuilder().getBuilderList();
    }

    private RepeatedFieldBuilderV3<MysqlxCrud.Column, MysqlxCrud.Column.Builder, MysqlxCrud.ColumnOrBuilder> getProjectionFieldBuilder() {
        if (this.projectionBuilder_ == null) {
            this.projectionBuilder_ = new RepeatedFieldBuilderV3(this.projection_, (this.bitField0_ & 4) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.projection_ = null;
        }
        return this.projectionBuilder_;
    }

    private void ensureRowIsMutable() {
        if ((this.bitField0_ & 8) == 0) {
            this.row_ = new ArrayList<MysqlxCrud.Insert.TypedRow>(this.row_);
            this.bitField0_ |= 8;
        }
    }

    @Override
    public List<MysqlxCrud.Insert.TypedRow> getRowList() {
        if (this.rowBuilder_ == null) {
            return Collections.unmodifiableList(this.row_);
        }
        return this.rowBuilder_.getMessageList();
    }

    @Override
    public int getRowCount() {
        if (this.rowBuilder_ == null) {
            return this.row_.size();
        }
        return this.rowBuilder_.getCount();
    }

    @Override
    public MysqlxCrud.Insert.TypedRow getRow(int index) {
        if (this.rowBuilder_ == null) {
            return this.row_.get(index);
        }
        return (MysqlxCrud.Insert.TypedRow)this.rowBuilder_.getMessage(index);
    }

    public MysqlxCrud.Insert.Builder setRow(int index, MysqlxCrud.Insert.TypedRow value) {
        if (this.rowBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.ensureRowIsMutable();
            this.row_.set(index, value);
            this.onChanged();
        } else {
            this.rowBuilder_.setMessage(index, (AbstractMessage)value);
        }
        return this;
    }

    public MysqlxCrud.Insert.Builder setRow(int index, MysqlxCrud.Insert.TypedRow.Builder builderForValue) {
        if (this.rowBuilder_ == null) {
            this.ensureRowIsMutable();
            this.row_.set(index, builderForValue.build());
            this.onChanged();
        } else {
            this.rowBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxCrud.Insert.Builder addRow(MysqlxCrud.Insert.TypedRow value) {
        if (this.rowBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.ensureRowIsMutable();
            this.row_.add(value);
            this.onChanged();
        } else {
            this.rowBuilder_.addMessage((AbstractMessage)value);
        }
        return this;
    }

    public MysqlxCrud.Insert.Builder addRow(int index, MysqlxCrud.Insert.TypedRow value) {
        if (this.rowBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.ensureRowIsMutable();
            this.row_.add(index, value);
            this.onChanged();
        } else {
            this.rowBuilder_.addMessage(index, (AbstractMessage)value);
        }
        return this;
    }

    public MysqlxCrud.Insert.Builder addRow(MysqlxCrud.Insert.TypedRow.Builder builderForValue) {
        if (this.rowBuilder_ == null) {
            this.ensureRowIsMutable();
            this.row_.add(builderForValue.build());
            this.onChanged();
        } else {
            this.rowBuilder_.addMessage((AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxCrud.Insert.Builder addRow(int index, MysqlxCrud.Insert.TypedRow.Builder builderForValue) {
        if (this.rowBuilder_ == null) {
            this.ensureRowIsMutable();
            this.row_.add(index, builderForValue.build());
            this.onChanged();
        } else {
            this.rowBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxCrud.Insert.Builder addAllRow(Iterable<? extends MysqlxCrud.Insert.TypedRow> values) {
        if (this.rowBuilder_ == null) {
            this.ensureRowIsMutable();
            AbstractMessageLite.Builder.addAll(values, this.row_);
            this.onChanged();
        } else {
            this.rowBuilder_.addAllMessages(values);
        }
        return this;
    }

    public MysqlxCrud.Insert.Builder clearRow() {
        if (this.rowBuilder_ == null) {
            this.row_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFF7;
            this.onChanged();
        } else {
            this.rowBuilder_.clear();
        }
        return this;
    }

    public MysqlxCrud.Insert.Builder removeRow(int index) {
        if (this.rowBuilder_ == null) {
            this.ensureRowIsMutable();
            this.row_.remove(index);
            this.onChanged();
        } else {
            this.rowBuilder_.remove(index);
        }
        return this;
    }

    public MysqlxCrud.Insert.TypedRow.Builder getRowBuilder(int index) {
        return (MysqlxCrud.Insert.TypedRow.Builder)this.getRowFieldBuilder().getBuilder(index);
    }

    @Override
    public MysqlxCrud.Insert.TypedRowOrBuilder getRowOrBuilder(int index) {
        if (this.rowBuilder_ == null) {
            return this.row_.get(index);
        }
        return (MysqlxCrud.Insert.TypedRowOrBuilder)this.rowBuilder_.getMessageOrBuilder(index);
    }

    @Override
    public List<? extends MysqlxCrud.Insert.TypedRowOrBuilder> getRowOrBuilderList() {
        if (this.rowBuilder_ != null) {
            return this.rowBuilder_.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.row_);
    }

    public MysqlxCrud.Insert.TypedRow.Builder addRowBuilder() {
        return (MysqlxCrud.Insert.TypedRow.Builder)this.getRowFieldBuilder().addBuilder((AbstractMessage)MysqlxCrud.Insert.TypedRow.getDefaultInstance());
    }

    public MysqlxCrud.Insert.TypedRow.Builder addRowBuilder(int index) {
        return (MysqlxCrud.Insert.TypedRow.Builder)this.getRowFieldBuilder().addBuilder(index, (AbstractMessage)MysqlxCrud.Insert.TypedRow.getDefaultInstance());
    }

    public List<MysqlxCrud.Insert.TypedRow.Builder> getRowBuilderList() {
        return this.getRowFieldBuilder().getBuilderList();
    }

    private RepeatedFieldBuilderV3<MysqlxCrud.Insert.TypedRow, MysqlxCrud.Insert.TypedRow.Builder, MysqlxCrud.Insert.TypedRowOrBuilder> getRowFieldBuilder() {
        if (this.rowBuilder_ == null) {
            this.rowBuilder_ = new RepeatedFieldBuilderV3(this.row_, (this.bitField0_ & 8) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.row_ = null;
        }
        return this.rowBuilder_;
    }

    private void ensureArgsIsMutable() {
        if ((this.bitField0_ & 0x10) == 0) {
            this.args_ = new ArrayList<MysqlxDatatypes.Scalar>(this.args_);
            this.bitField0_ |= 0x10;
        }
    }

    @Override
    public List<MysqlxDatatypes.Scalar> getArgsList() {
        if (this.argsBuilder_ == null) {
            return Collections.unmodifiableList(this.args_);
        }
        return this.argsBuilder_.getMessageList();
    }

    @Override
    public int getArgsCount() {
        if (this.argsBuilder_ == null) {
            return this.args_.size();
        }
        return this.argsBuilder_.getCount();
    }

    @Override
    public MysqlxDatatypes.Scalar getArgs(int index) {
        if (this.argsBuilder_ == null) {
            return this.args_.get(index);
        }
        return (MysqlxDatatypes.Scalar)this.argsBuilder_.getMessage(index);
    }

    public MysqlxCrud.Insert.Builder setArgs(int index, MysqlxDatatypes.Scalar value) {
        if (this.argsBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.ensureArgsIsMutable();
            this.args_.set(index, value);
            this.onChanged();
        } else {
            this.argsBuilder_.setMessage(index, (AbstractMessage)value);
        }
        return this;
    }

    public MysqlxCrud.Insert.Builder setArgs(int index, MysqlxDatatypes.Scalar.Builder builderForValue) {
        if (this.argsBuilder_ == null) {
            this.ensureArgsIsMutable();
            this.args_.set(index, builderForValue.build());
            this.onChanged();
        } else {
            this.argsBuilder_.setMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxCrud.Insert.Builder addArgs(MysqlxDatatypes.Scalar value) {
        if (this.argsBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.ensureArgsIsMutable();
            this.args_.add(value);
            this.onChanged();
        } else {
            this.argsBuilder_.addMessage((AbstractMessage)value);
        }
        return this;
    }

    public MysqlxCrud.Insert.Builder addArgs(int index, MysqlxDatatypes.Scalar value) {
        if (this.argsBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.ensureArgsIsMutable();
            this.args_.add(index, value);
            this.onChanged();
        } else {
            this.argsBuilder_.addMessage(index, (AbstractMessage)value);
        }
        return this;
    }

    public MysqlxCrud.Insert.Builder addArgs(MysqlxDatatypes.Scalar.Builder builderForValue) {
        if (this.argsBuilder_ == null) {
            this.ensureArgsIsMutable();
            this.args_.add(builderForValue.build());
            this.onChanged();
        } else {
            this.argsBuilder_.addMessage((AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxCrud.Insert.Builder addArgs(int index, MysqlxDatatypes.Scalar.Builder builderForValue) {
        if (this.argsBuilder_ == null) {
            this.ensureArgsIsMutable();
            this.args_.add(index, builderForValue.build());
            this.onChanged();
        } else {
            this.argsBuilder_.addMessage(index, (AbstractMessage)builderForValue.build());
        }
        return this;
    }

    public MysqlxCrud.Insert.Builder addAllArgs(Iterable<? extends MysqlxDatatypes.Scalar> values) {
        if (this.argsBuilder_ == null) {
            this.ensureArgsIsMutable();
            AbstractMessageLite.Builder.addAll(values, this.args_);
            this.onChanged();
        } else {
            this.argsBuilder_.addAllMessages(values);
        }
        return this;
    }

    public MysqlxCrud.Insert.Builder clearArgs() {
        if (this.argsBuilder_ == null) {
            this.args_ = Collections.emptyList();
            this.bitField0_ &= 0xFFFFFFEF;
            this.onChanged();
        } else {
            this.argsBuilder_.clear();
        }
        return this;
    }

    public MysqlxCrud.Insert.Builder removeArgs(int index) {
        if (this.argsBuilder_ == null) {
            this.ensureArgsIsMutable();
            this.args_.remove(index);
            this.onChanged();
        } else {
            this.argsBuilder_.remove(index);
        }
        return this;
    }

    public MysqlxDatatypes.Scalar.Builder getArgsBuilder(int index) {
        return (MysqlxDatatypes.Scalar.Builder)this.getArgsFieldBuilder().getBuilder(index);
    }

    @Override
    public MysqlxDatatypes.ScalarOrBuilder getArgsOrBuilder(int index) {
        if (this.argsBuilder_ == null) {
            return this.args_.get(index);
        }
        return (MysqlxDatatypes.ScalarOrBuilder)this.argsBuilder_.getMessageOrBuilder(index);
    }

    @Override
    public List<? extends MysqlxDatatypes.ScalarOrBuilder> getArgsOrBuilderList() {
        if (this.argsBuilder_ != null) {
            return this.argsBuilder_.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.args_);
    }

    public MysqlxDatatypes.Scalar.Builder addArgsBuilder() {
        return (MysqlxDatatypes.Scalar.Builder)this.getArgsFieldBuilder().addBuilder((AbstractMessage)MysqlxDatatypes.Scalar.getDefaultInstance());
    }

    public MysqlxDatatypes.Scalar.Builder addArgsBuilder(int index) {
        return (MysqlxDatatypes.Scalar.Builder)this.getArgsFieldBuilder().addBuilder(index, (AbstractMessage)MysqlxDatatypes.Scalar.getDefaultInstance());
    }

    public List<MysqlxDatatypes.Scalar.Builder> getArgsBuilderList() {
        return this.getArgsFieldBuilder().getBuilderList();
    }

    private RepeatedFieldBuilderV3<MysqlxDatatypes.Scalar, MysqlxDatatypes.Scalar.Builder, MysqlxDatatypes.ScalarOrBuilder> getArgsFieldBuilder() {
        if (this.argsBuilder_ == null) {
            this.argsBuilder_ = new RepeatedFieldBuilderV3(this.args_, (this.bitField0_ & 0x10) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.args_ = null;
        }
        return this.argsBuilder_;
    }

    @Override
    public boolean hasUpsert() {
        return (this.bitField0_ & 0x20) != 0;
    }

    @Override
    public boolean getUpsert() {
        return this.upsert_;
    }

    public MysqlxCrud.Insert.Builder setUpsert(boolean value) {
        this.bitField0_ |= 0x20;
        this.upsert_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxCrud.Insert.Builder clearUpsert() {
        this.bitField0_ &= 0xFFFFFFDF;
        this.upsert_ = false;
        this.onChanged();
        return this;
    }

    public final MysqlxCrud.Insert.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCrud.Insert.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxCrud.Insert.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCrud.Insert.Builder)super.mergeUnknownFields(unknownFields);
    }
}
