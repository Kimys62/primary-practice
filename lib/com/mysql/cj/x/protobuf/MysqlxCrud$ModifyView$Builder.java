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
 *  com.google.protobuf.LazyStringArrayList
 *  com.google.protobuf.LazyStringList
 *  com.google.protobuf.Message
 *  com.google.protobuf.ProtocolStringList
 *  com.google.protobuf.SingleFieldBuilderV3
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
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

public static final class MysqlxCrud.ModifyView.Builder
extends GeneratedMessageV3.Builder<MysqlxCrud.ModifyView.Builder>
implements MysqlxCrud.ModifyViewOrBuilder {
    private int bitField0_;
    private MysqlxCrud.Collection collection_;
    private SingleFieldBuilderV3<MysqlxCrud.Collection, MysqlxCrud.Collection.Builder, MysqlxCrud.CollectionOrBuilder> collectionBuilder_;
    private Object definer_ = "";
    private int algorithm_ = 1;
    private int security_ = 1;
    private int check_ = 1;
    private LazyStringList column_ = LazyStringArrayList.EMPTY;
    private MysqlxCrud.Find stmt_;
    private SingleFieldBuilderV3<MysqlxCrud.Find, MysqlxCrud.Find.Builder, MysqlxCrud.FindOrBuilder> stmtBuilder_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Crud_ModifyView_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Crud_ModifyView_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.ModifyView.class, MysqlxCrud.ModifyView.Builder.class);
    }

    private MysqlxCrud.ModifyView.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxCrud.ModifyView.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            this.getCollectionFieldBuilder();
            this.getStmtFieldBuilder();
        }
    }

    public MysqlxCrud.ModifyView.Builder clear() {
        super.clear();
        if (this.collectionBuilder_ == null) {
            this.collection_ = null;
        } else {
            this.collectionBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFE;
        this.definer_ = "";
        this.bitField0_ &= 0xFFFFFFFD;
        this.algorithm_ = 1;
        this.bitField0_ &= 0xFFFFFFFB;
        this.security_ = 1;
        this.bitField0_ &= 0xFFFFFFF7;
        this.check_ = 1;
        this.bitField0_ &= 0xFFFFFFEF;
        this.column_ = LazyStringArrayList.EMPTY;
        this.bitField0_ &= 0xFFFFFFDF;
        if (this.stmtBuilder_ == null) {
            this.stmt_ = null;
        } else {
            this.stmtBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFBF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Crud_ModifyView_descriptor;
    }

    public MysqlxCrud.ModifyView getDefaultInstanceForType() {
        return MysqlxCrud.ModifyView.getDefaultInstance();
    }

    public MysqlxCrud.ModifyView build() {
        MysqlxCrud.ModifyView result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxCrud.ModifyView.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxCrud.ModifyView buildPartial() {
        MysqlxCrud.ModifyView result = new MysqlxCrud.ModifyView(this, null);
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
        result.definer_ = this.definer_;
        if ((from_bitField0_ & 4) != 0) {
            to_bitField0_ |= 4;
        }
        result.algorithm_ = this.algorithm_;
        if ((from_bitField0_ & 8) != 0) {
            to_bitField0_ |= 8;
        }
        result.security_ = this.security_;
        if ((from_bitField0_ & 0x10) != 0) {
            to_bitField0_ |= 0x10;
        }
        result.check_ = this.check_;
        if ((this.bitField0_ & 0x20) != 0) {
            this.column_ = this.column_.getUnmodifiableView();
            this.bitField0_ &= 0xFFFFFFDF;
        }
        result.column_ = this.column_;
        if ((from_bitField0_ & 0x40) != 0) {
            if (this.stmtBuilder_ == null) {
                result.stmt_ = this.stmt_;
            } else {
                result.stmt_ = (MysqlxCrud.Find)this.stmtBuilder_.build();
            }
            to_bitField0_ |= 0x20;
        }
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxCrud.ModifyView.Builder clone() {
        return (MysqlxCrud.ModifyView.Builder)super.clone();
    }

    public MysqlxCrud.ModifyView.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCrud.ModifyView.Builder)super.setField(field, value);
    }

    public MysqlxCrud.ModifyView.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxCrud.ModifyView.Builder)super.clearField(field);
    }

    public MysqlxCrud.ModifyView.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxCrud.ModifyView.Builder)super.clearOneof(oneof);
    }

    public MysqlxCrud.ModifyView.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxCrud.ModifyView.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxCrud.ModifyView.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCrud.ModifyView.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxCrud.ModifyView.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxCrud.ModifyView) {
            return this.mergeFrom((MysqlxCrud.ModifyView)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxCrud.ModifyView.Builder mergeFrom(MysqlxCrud.ModifyView other) {
        if (other == MysqlxCrud.ModifyView.getDefaultInstance()) {
            return this;
        }
        if (other.hasCollection()) {
            this.mergeCollection(other.getCollection());
        }
        if (other.hasDefiner()) {
            this.bitField0_ |= 2;
            this.definer_ = other.definer_;
            this.onChanged();
        }
        if (other.hasAlgorithm()) {
            this.setAlgorithm(other.getAlgorithm());
        }
        if (other.hasSecurity()) {
            this.setSecurity(other.getSecurity());
        }
        if (other.hasCheck()) {
            this.setCheck(other.getCheck());
        }
        if (!other.column_.isEmpty()) {
            if (this.column_.isEmpty()) {
                this.column_ = other.column_;
                this.bitField0_ &= 0xFFFFFFDF;
            } else {
                this.ensureColumnIsMutable();
                this.column_.addAll((Collection)other.column_);
            }
            this.onChanged();
        }
        if (other.hasStmt()) {
            this.mergeStmt(other.getStmt());
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.hasCollection()) {
            return false;
        }
        if (!this.getCollection().isInitialized()) {
            return false;
        }
        return !this.hasStmt() || this.getStmt().isInitialized();
    }

    public MysqlxCrud.ModifyView.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxCrud.ModifyView parsedMessage = null;
        try {
            parsedMessage = (MysqlxCrud.ModifyView)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxCrud.ModifyView)e.getUnfinishedMessage();
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

    public MysqlxCrud.ModifyView.Builder setCollection(MysqlxCrud.Collection value) {
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

    public MysqlxCrud.ModifyView.Builder setCollection(MysqlxCrud.Collection.Builder builderForValue) {
        if (this.collectionBuilder_ == null) {
            this.collection_ = builderForValue.build();
            this.onChanged();
        } else {
            this.collectionBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 1;
        return this;
    }

    public MysqlxCrud.ModifyView.Builder mergeCollection(MysqlxCrud.Collection value) {
        if (this.collectionBuilder_ == null) {
            this.collection_ = (this.bitField0_ & 1) != 0 && this.collection_ != null && this.collection_ != MysqlxCrud.Collection.getDefaultInstance() ? MysqlxCrud.Collection.newBuilder(this.collection_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.collectionBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 1;
        return this;
    }

    public MysqlxCrud.ModifyView.Builder clearCollection() {
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
    public boolean hasDefiner() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public String getDefiner() {
        Object ref = this.definer_;
        if (!(ref instanceof String)) {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.definer_ = s;
            }
            return s;
        }
        return (String)ref;
    }

    @Override
    public ByteString getDefinerBytes() {
        Object ref = this.definer_;
        if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)((String)ref));
            this.definer_ = b;
            return b;
        }
        return (ByteString)ref;
    }

    public MysqlxCrud.ModifyView.Builder setDefiner(String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 2;
        this.definer_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxCrud.ModifyView.Builder clearDefiner() {
        this.bitField0_ &= 0xFFFFFFFD;
        this.definer_ = MysqlxCrud.ModifyView.getDefaultInstance().getDefiner();
        this.onChanged();
        return this;
    }

    public MysqlxCrud.ModifyView.Builder setDefinerBytes(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 2;
        this.definer_ = value;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasAlgorithm() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override
    public MysqlxCrud.ViewAlgorithm getAlgorithm() {
        MysqlxCrud.ViewAlgorithm result = MysqlxCrud.ViewAlgorithm.valueOf(this.algorithm_);
        return result == null ? MysqlxCrud.ViewAlgorithm.UNDEFINED : result;
    }

    public MysqlxCrud.ModifyView.Builder setAlgorithm(MysqlxCrud.ViewAlgorithm value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 4;
        this.algorithm_ = value.getNumber();
        this.onChanged();
        return this;
    }

    public MysqlxCrud.ModifyView.Builder clearAlgorithm() {
        this.bitField0_ &= 0xFFFFFFFB;
        this.algorithm_ = 1;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasSecurity() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override
    public MysqlxCrud.ViewSqlSecurity getSecurity() {
        MysqlxCrud.ViewSqlSecurity result = MysqlxCrud.ViewSqlSecurity.valueOf(this.security_);
        return result == null ? MysqlxCrud.ViewSqlSecurity.INVOKER : result;
    }

    public MysqlxCrud.ModifyView.Builder setSecurity(MysqlxCrud.ViewSqlSecurity value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 8;
        this.security_ = value.getNumber();
        this.onChanged();
        return this;
    }

    public MysqlxCrud.ModifyView.Builder clearSecurity() {
        this.bitField0_ &= 0xFFFFFFF7;
        this.security_ = 1;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasCheck() {
        return (this.bitField0_ & 0x10) != 0;
    }

    @Override
    public MysqlxCrud.ViewCheckOption getCheck() {
        MysqlxCrud.ViewCheckOption result = MysqlxCrud.ViewCheckOption.valueOf(this.check_);
        return result == null ? MysqlxCrud.ViewCheckOption.LOCAL : result;
    }

    public MysqlxCrud.ModifyView.Builder setCheck(MysqlxCrud.ViewCheckOption value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 0x10;
        this.check_ = value.getNumber();
        this.onChanged();
        return this;
    }

    public MysqlxCrud.ModifyView.Builder clearCheck() {
        this.bitField0_ &= 0xFFFFFFEF;
        this.check_ = 1;
        this.onChanged();
        return this;
    }

    private void ensureColumnIsMutable() {
        if ((this.bitField0_ & 0x20) == 0) {
            this.column_ = new LazyStringArrayList(this.column_);
            this.bitField0_ |= 0x20;
        }
    }

    public ProtocolStringList getColumnList() {
        return this.column_.getUnmodifiableView();
    }

    @Override
    public int getColumnCount() {
        return this.column_.size();
    }

    @Override
    public String getColumn(int index) {
        return (String)this.column_.get(index);
    }

    @Override
    public ByteString getColumnBytes(int index) {
        return this.column_.getByteString(index);
    }

    public MysqlxCrud.ModifyView.Builder setColumn(int index, String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.ensureColumnIsMutable();
        this.column_.set(index, (Object)value);
        this.onChanged();
        return this;
    }

    public MysqlxCrud.ModifyView.Builder addColumn(String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.ensureColumnIsMutable();
        this.column_.add((Object)value);
        this.onChanged();
        return this;
    }

    public MysqlxCrud.ModifyView.Builder addAllColumn(Iterable<String> values) {
        this.ensureColumnIsMutable();
        AbstractMessageLite.Builder.addAll(values, (List)this.column_);
        this.onChanged();
        return this;
    }

    public MysqlxCrud.ModifyView.Builder clearColumn() {
        this.column_ = LazyStringArrayList.EMPTY;
        this.bitField0_ &= 0xFFFFFFDF;
        this.onChanged();
        return this;
    }

    public MysqlxCrud.ModifyView.Builder addColumnBytes(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.ensureColumnIsMutable();
        this.column_.add(value);
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasStmt() {
        return (this.bitField0_ & 0x40) != 0;
    }

    @Override
    public MysqlxCrud.Find getStmt() {
        if (this.stmtBuilder_ == null) {
            return this.stmt_ == null ? MysqlxCrud.Find.getDefaultInstance() : this.stmt_;
        }
        return (MysqlxCrud.Find)this.stmtBuilder_.getMessage();
    }

    public MysqlxCrud.ModifyView.Builder setStmt(MysqlxCrud.Find value) {
        if (this.stmtBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.stmt_ = value;
            this.onChanged();
        } else {
            this.stmtBuilder_.setMessage((AbstractMessage)value);
        }
        this.bitField0_ |= 0x40;
        return this;
    }

    public MysqlxCrud.ModifyView.Builder setStmt(MysqlxCrud.Find.Builder builderForValue) {
        if (this.stmtBuilder_ == null) {
            this.stmt_ = builderForValue.build();
            this.onChanged();
        } else {
            this.stmtBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 0x40;
        return this;
    }

    public MysqlxCrud.ModifyView.Builder mergeStmt(MysqlxCrud.Find value) {
        if (this.stmtBuilder_ == null) {
            this.stmt_ = (this.bitField0_ & 0x40) != 0 && this.stmt_ != null && this.stmt_ != MysqlxCrud.Find.getDefaultInstance() ? MysqlxCrud.Find.newBuilder(this.stmt_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.stmtBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 0x40;
        return this;
    }

    public MysqlxCrud.ModifyView.Builder clearStmt() {
        if (this.stmtBuilder_ == null) {
            this.stmt_ = null;
            this.onChanged();
        } else {
            this.stmtBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFBF;
        return this;
    }

    public MysqlxCrud.Find.Builder getStmtBuilder() {
        this.bitField0_ |= 0x40;
        this.onChanged();
        return (MysqlxCrud.Find.Builder)this.getStmtFieldBuilder().getBuilder();
    }

    @Override
    public MysqlxCrud.FindOrBuilder getStmtOrBuilder() {
        if (this.stmtBuilder_ != null) {
            return (MysqlxCrud.FindOrBuilder)this.stmtBuilder_.getMessageOrBuilder();
        }
        return this.stmt_ == null ? MysqlxCrud.Find.getDefaultInstance() : this.stmt_;
    }

    private SingleFieldBuilderV3<MysqlxCrud.Find, MysqlxCrud.Find.Builder, MysqlxCrud.FindOrBuilder> getStmtFieldBuilder() {
        if (this.stmtBuilder_ == null) {
            this.stmtBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getStmt(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.stmt_ = null;
        }
        return this.stmtBuilder_;
    }

    public final MysqlxCrud.ModifyView.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCrud.ModifyView.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxCrud.ModifyView.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCrud.ModifyView.Builder)super.mergeUnknownFields(unknownFields);
    }
}
