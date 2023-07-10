/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$BuilderParent
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
 *  com.google.protobuf.SingleFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import java.io.IOException;

public static final class MysqlxCrud.DropView.Builder
extends GeneratedMessageV3.Builder<MysqlxCrud.DropView.Builder>
implements MysqlxCrud.DropViewOrBuilder {
    private int bitField0_;
    private MysqlxCrud.Collection collection_;
    private SingleFieldBuilderV3<MysqlxCrud.Collection, MysqlxCrud.Collection.Builder, MysqlxCrud.CollectionOrBuilder> collectionBuilder_;
    private boolean ifExists_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Crud_DropView_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Crud_DropView_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.DropView.class, MysqlxCrud.DropView.Builder.class);
    }

    private MysqlxCrud.DropView.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxCrud.DropView.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            this.getCollectionFieldBuilder();
        }
    }

    public MysqlxCrud.DropView.Builder clear() {
        super.clear();
        if (this.collectionBuilder_ == null) {
            this.collection_ = null;
        } else {
            this.collectionBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFE;
        this.ifExists_ = false;
        this.bitField0_ &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Crud_DropView_descriptor;
    }

    public MysqlxCrud.DropView getDefaultInstanceForType() {
        return MysqlxCrud.DropView.getDefaultInstance();
    }

    public MysqlxCrud.DropView build() {
        MysqlxCrud.DropView result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxCrud.DropView.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxCrud.DropView buildPartial() {
        MysqlxCrud.DropView result = new MysqlxCrud.DropView(this, null);
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
            result.ifExists_ = this.ifExists_;
            to_bitField0_ |= 2;
        }
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxCrud.DropView.Builder clone() {
        return (MysqlxCrud.DropView.Builder)super.clone();
    }

    public MysqlxCrud.DropView.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCrud.DropView.Builder)super.setField(field, value);
    }

    public MysqlxCrud.DropView.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxCrud.DropView.Builder)super.clearField(field);
    }

    public MysqlxCrud.DropView.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxCrud.DropView.Builder)super.clearOneof(oneof);
    }

    public MysqlxCrud.DropView.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxCrud.DropView.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxCrud.DropView.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCrud.DropView.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxCrud.DropView.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxCrud.DropView) {
            return this.mergeFrom((MysqlxCrud.DropView)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxCrud.DropView.Builder mergeFrom(MysqlxCrud.DropView other) {
        if (other == MysqlxCrud.DropView.getDefaultInstance()) {
            return this;
        }
        if (other.hasCollection()) {
            this.mergeCollection(other.getCollection());
        }
        if (other.hasIfExists()) {
            this.setIfExists(other.getIfExists());
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.hasCollection()) {
            return false;
        }
        return this.getCollection().isInitialized();
    }

    public MysqlxCrud.DropView.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxCrud.DropView parsedMessage = null;
        try {
            parsedMessage = (MysqlxCrud.DropView)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxCrud.DropView)e.getUnfinishedMessage();
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

    public MysqlxCrud.DropView.Builder setCollection(MysqlxCrud.Collection value) {
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

    public MysqlxCrud.DropView.Builder setCollection(MysqlxCrud.Collection.Builder builderForValue) {
        if (this.collectionBuilder_ == null) {
            this.collection_ = builderForValue.build();
            this.onChanged();
        } else {
            this.collectionBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 1;
        return this;
    }

    public MysqlxCrud.DropView.Builder mergeCollection(MysqlxCrud.Collection value) {
        if (this.collectionBuilder_ == null) {
            this.collection_ = (this.bitField0_ & 1) != 0 && this.collection_ != null && this.collection_ != MysqlxCrud.Collection.getDefaultInstance() ? MysqlxCrud.Collection.newBuilder(this.collection_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.collectionBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 1;
        return this;
    }

    public MysqlxCrud.DropView.Builder clearCollection() {
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
    public boolean hasIfExists() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public boolean getIfExists() {
        return this.ifExists_;
    }

    public MysqlxCrud.DropView.Builder setIfExists(boolean value) {
        this.bitField0_ |= 2;
        this.ifExists_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxCrud.DropView.Builder clearIfExists() {
        this.bitField0_ &= 0xFFFFFFFD;
        this.ifExists_ = false;
        this.onChanged();
        return this;
    }

    public final MysqlxCrud.DropView.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCrud.DropView.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxCrud.DropView.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCrud.DropView.Builder)super.mergeUnknownFields(unknownFields);
    }
}
