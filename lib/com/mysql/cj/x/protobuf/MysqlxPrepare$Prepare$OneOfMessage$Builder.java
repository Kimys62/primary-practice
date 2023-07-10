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
import com.mysql.cj.x.protobuf.MysqlxPrepare;
import com.mysql.cj.x.protobuf.MysqlxSql;
import java.io.IOException;

public static final class MysqlxPrepare.Prepare.OneOfMessage.Builder
extends GeneratedMessageV3.Builder<MysqlxPrepare.Prepare.OneOfMessage.Builder>
implements MysqlxPrepare.Prepare.OneOfMessageOrBuilder {
    private int bitField0_;
    private int type_ = 0;
    private MysqlxCrud.Find find_;
    private SingleFieldBuilderV3<MysqlxCrud.Find, MysqlxCrud.Find.Builder, MysqlxCrud.FindOrBuilder> findBuilder_;
    private MysqlxCrud.Insert insert_;
    private SingleFieldBuilderV3<MysqlxCrud.Insert, MysqlxCrud.Insert.Builder, MysqlxCrud.InsertOrBuilder> insertBuilder_;
    private MysqlxCrud.Update update_;
    private SingleFieldBuilderV3<MysqlxCrud.Update, MysqlxCrud.Update.Builder, MysqlxCrud.UpdateOrBuilder> updateBuilder_;
    private MysqlxCrud.Delete delete_;
    private SingleFieldBuilderV3<MysqlxCrud.Delete, MysqlxCrud.Delete.Builder, MysqlxCrud.DeleteOrBuilder> deleteBuilder_;
    private MysqlxSql.StmtExecute stmtExecute_;
    private SingleFieldBuilderV3<MysqlxSql.StmtExecute, MysqlxSql.StmtExecute.Builder, MysqlxSql.StmtExecuteOrBuilder> stmtExecuteBuilder_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Prepare_Prepare_OneOfMessage_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Prepare_Prepare_OneOfMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxPrepare.Prepare.OneOfMessage.class, MysqlxPrepare.Prepare.OneOfMessage.Builder.class);
    }

    private MysqlxPrepare.Prepare.OneOfMessage.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxPrepare.Prepare.OneOfMessage.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            this.getFindFieldBuilder();
            this.getInsertFieldBuilder();
            this.getUpdateFieldBuilder();
            this.getDeleteFieldBuilder();
            this.getStmtExecuteFieldBuilder();
        }
    }

    public MysqlxPrepare.Prepare.OneOfMessage.Builder clear() {
        super.clear();
        this.type_ = 0;
        this.bitField0_ &= 0xFFFFFFFE;
        if (this.findBuilder_ == null) {
            this.find_ = null;
        } else {
            this.findBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFD;
        if (this.insertBuilder_ == null) {
            this.insert_ = null;
        } else {
            this.insertBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFB;
        if (this.updateBuilder_ == null) {
            this.update_ = null;
        } else {
            this.updateBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFF7;
        if (this.deleteBuilder_ == null) {
            this.delete_ = null;
        } else {
            this.deleteBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFEF;
        if (this.stmtExecuteBuilder_ == null) {
            this.stmtExecute_ = null;
        } else {
            this.stmtExecuteBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFDF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Prepare_Prepare_OneOfMessage_descriptor;
    }

    public MysqlxPrepare.Prepare.OneOfMessage getDefaultInstanceForType() {
        return MysqlxPrepare.Prepare.OneOfMessage.getDefaultInstance();
    }

    public MysqlxPrepare.Prepare.OneOfMessage build() {
        MysqlxPrepare.Prepare.OneOfMessage result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxPrepare.Prepare.OneOfMessage.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxPrepare.Prepare.OneOfMessage buildPartial() {
        MysqlxPrepare.Prepare.OneOfMessage result = new MysqlxPrepare.Prepare.OneOfMessage(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            to_bitField0_ |= 1;
        }
        result.type_ = this.type_;
        if ((from_bitField0_ & 2) != 0) {
            if (this.findBuilder_ == null) {
                result.find_ = this.find_;
            } else {
                result.find_ = (MysqlxCrud.Find)this.findBuilder_.build();
            }
            to_bitField0_ |= 2;
        }
        if ((from_bitField0_ & 4) != 0) {
            if (this.insertBuilder_ == null) {
                result.insert_ = this.insert_;
            } else {
                result.insert_ = (MysqlxCrud.Insert)this.insertBuilder_.build();
            }
            to_bitField0_ |= 4;
        }
        if ((from_bitField0_ & 8) != 0) {
            if (this.updateBuilder_ == null) {
                result.update_ = this.update_;
            } else {
                result.update_ = (MysqlxCrud.Update)this.updateBuilder_.build();
            }
            to_bitField0_ |= 8;
        }
        if ((from_bitField0_ & 0x10) != 0) {
            if (this.deleteBuilder_ == null) {
                result.delete_ = this.delete_;
            } else {
                result.delete_ = (MysqlxCrud.Delete)this.deleteBuilder_.build();
            }
            to_bitField0_ |= 0x10;
        }
        if ((from_bitField0_ & 0x20) != 0) {
            if (this.stmtExecuteBuilder_ == null) {
                result.stmtExecute_ = this.stmtExecute_;
            } else {
                result.stmtExecute_ = (MysqlxSql.StmtExecute)this.stmtExecuteBuilder_.build();
            }
            to_bitField0_ |= 0x20;
        }
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxPrepare.Prepare.OneOfMessage.Builder clone() {
        return (MysqlxPrepare.Prepare.OneOfMessage.Builder)super.clone();
    }

    public MysqlxPrepare.Prepare.OneOfMessage.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxPrepare.Prepare.OneOfMessage.Builder)super.setField(field, value);
    }

    public MysqlxPrepare.Prepare.OneOfMessage.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxPrepare.Prepare.OneOfMessage.Builder)super.clearField(field);
    }

    public MysqlxPrepare.Prepare.OneOfMessage.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxPrepare.Prepare.OneOfMessage.Builder)super.clearOneof(oneof);
    }

    public MysqlxPrepare.Prepare.OneOfMessage.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxPrepare.Prepare.OneOfMessage.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxPrepare.Prepare.OneOfMessage.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxPrepare.Prepare.OneOfMessage.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxPrepare.Prepare.OneOfMessage.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxPrepare.Prepare.OneOfMessage) {
            return this.mergeFrom((MysqlxPrepare.Prepare.OneOfMessage)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxPrepare.Prepare.OneOfMessage.Builder mergeFrom(MysqlxPrepare.Prepare.OneOfMessage other) {
        if (other == MysqlxPrepare.Prepare.OneOfMessage.getDefaultInstance()) {
            return this;
        }
        if (other.hasType()) {
            this.setType(other.getType());
        }
        if (other.hasFind()) {
            this.mergeFind(other.getFind());
        }
        if (other.hasInsert()) {
            this.mergeInsert(other.getInsert());
        }
        if (other.hasUpdate()) {
            this.mergeUpdate(other.getUpdate());
        }
        if (other.hasDelete()) {
            this.mergeDelete(other.getDelete());
        }
        if (other.hasStmtExecute()) {
            this.mergeStmtExecute(other.getStmtExecute());
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.hasType()) {
            return false;
        }
        if (this.hasFind() && !this.getFind().isInitialized()) {
            return false;
        }
        if (this.hasInsert() && !this.getInsert().isInitialized()) {
            return false;
        }
        if (this.hasUpdate() && !this.getUpdate().isInitialized()) {
            return false;
        }
        if (this.hasDelete() && !this.getDelete().isInitialized()) {
            return false;
        }
        return !this.hasStmtExecute() || this.getStmtExecute().isInitialized();
    }

    public MysqlxPrepare.Prepare.OneOfMessage.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxPrepare.Prepare.OneOfMessage parsedMessage = null;
        try {
            parsedMessage = (MysqlxPrepare.Prepare.OneOfMessage)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxPrepare.Prepare.OneOfMessage)e.getUnfinishedMessage();
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
    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public MysqlxPrepare.Prepare.OneOfMessage.Type getType() {
        MysqlxPrepare.Prepare.OneOfMessage.Type result = MysqlxPrepare.Prepare.OneOfMessage.Type.valueOf(this.type_);
        return result == null ? MysqlxPrepare.Prepare.OneOfMessage.Type.FIND : result;
    }

    public MysqlxPrepare.Prepare.OneOfMessage.Builder setType(MysqlxPrepare.Prepare.OneOfMessage.Type value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.type_ = value.getNumber();
        this.onChanged();
        return this;
    }

    public MysqlxPrepare.Prepare.OneOfMessage.Builder clearType() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.type_ = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasFind() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public MysqlxCrud.Find getFind() {
        if (this.findBuilder_ == null) {
            return this.find_ == null ? MysqlxCrud.Find.getDefaultInstance() : this.find_;
        }
        return (MysqlxCrud.Find)this.findBuilder_.getMessage();
    }

    public MysqlxPrepare.Prepare.OneOfMessage.Builder setFind(MysqlxCrud.Find value) {
        if (this.findBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.find_ = value;
            this.onChanged();
        } else {
            this.findBuilder_.setMessage((AbstractMessage)value);
        }
        this.bitField0_ |= 2;
        return this;
    }

    public MysqlxPrepare.Prepare.OneOfMessage.Builder setFind(MysqlxCrud.Find.Builder builderForValue) {
        if (this.findBuilder_ == null) {
            this.find_ = builderForValue.build();
            this.onChanged();
        } else {
            this.findBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 2;
        return this;
    }

    public MysqlxPrepare.Prepare.OneOfMessage.Builder mergeFind(MysqlxCrud.Find value) {
        if (this.findBuilder_ == null) {
            this.find_ = (this.bitField0_ & 2) != 0 && this.find_ != null && this.find_ != MysqlxCrud.Find.getDefaultInstance() ? MysqlxCrud.Find.newBuilder(this.find_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.findBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 2;
        return this;
    }

    public MysqlxPrepare.Prepare.OneOfMessage.Builder clearFind() {
        if (this.findBuilder_ == null) {
            this.find_ = null;
            this.onChanged();
        } else {
            this.findBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFD;
        return this;
    }

    public MysqlxCrud.Find.Builder getFindBuilder() {
        this.bitField0_ |= 2;
        this.onChanged();
        return (MysqlxCrud.Find.Builder)this.getFindFieldBuilder().getBuilder();
    }

    @Override
    public MysqlxCrud.FindOrBuilder getFindOrBuilder() {
        if (this.findBuilder_ != null) {
            return (MysqlxCrud.FindOrBuilder)this.findBuilder_.getMessageOrBuilder();
        }
        return this.find_ == null ? MysqlxCrud.Find.getDefaultInstance() : this.find_;
    }

    private SingleFieldBuilderV3<MysqlxCrud.Find, MysqlxCrud.Find.Builder, MysqlxCrud.FindOrBuilder> getFindFieldBuilder() {
        if (this.findBuilder_ == null) {
            this.findBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getFind(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.find_ = null;
        }
        return this.findBuilder_;
    }

    @Override
    public boolean hasInsert() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override
    public MysqlxCrud.Insert getInsert() {
        if (this.insertBuilder_ == null) {
            return this.insert_ == null ? MysqlxCrud.Insert.getDefaultInstance() : this.insert_;
        }
        return (MysqlxCrud.Insert)this.insertBuilder_.getMessage();
    }

    public MysqlxPrepare.Prepare.OneOfMessage.Builder setInsert(MysqlxCrud.Insert value) {
        if (this.insertBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.insert_ = value;
            this.onChanged();
        } else {
            this.insertBuilder_.setMessage((AbstractMessage)value);
        }
        this.bitField0_ |= 4;
        return this;
    }

    public MysqlxPrepare.Prepare.OneOfMessage.Builder setInsert(MysqlxCrud.Insert.Builder builderForValue) {
        if (this.insertBuilder_ == null) {
            this.insert_ = builderForValue.build();
            this.onChanged();
        } else {
            this.insertBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 4;
        return this;
    }

    public MysqlxPrepare.Prepare.OneOfMessage.Builder mergeInsert(MysqlxCrud.Insert value) {
        if (this.insertBuilder_ == null) {
            this.insert_ = (this.bitField0_ & 4) != 0 && this.insert_ != null && this.insert_ != MysqlxCrud.Insert.getDefaultInstance() ? MysqlxCrud.Insert.newBuilder(this.insert_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.insertBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 4;
        return this;
    }

    public MysqlxPrepare.Prepare.OneOfMessage.Builder clearInsert() {
        if (this.insertBuilder_ == null) {
            this.insert_ = null;
            this.onChanged();
        } else {
            this.insertBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFB;
        return this;
    }

    public MysqlxCrud.Insert.Builder getInsertBuilder() {
        this.bitField0_ |= 4;
        this.onChanged();
        return (MysqlxCrud.Insert.Builder)this.getInsertFieldBuilder().getBuilder();
    }

    @Override
    public MysqlxCrud.InsertOrBuilder getInsertOrBuilder() {
        if (this.insertBuilder_ != null) {
            return (MysqlxCrud.InsertOrBuilder)this.insertBuilder_.getMessageOrBuilder();
        }
        return this.insert_ == null ? MysqlxCrud.Insert.getDefaultInstance() : this.insert_;
    }

    private SingleFieldBuilderV3<MysqlxCrud.Insert, MysqlxCrud.Insert.Builder, MysqlxCrud.InsertOrBuilder> getInsertFieldBuilder() {
        if (this.insertBuilder_ == null) {
            this.insertBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getInsert(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.insert_ = null;
        }
        return this.insertBuilder_;
    }

    @Override
    public boolean hasUpdate() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override
    public MysqlxCrud.Update getUpdate() {
        if (this.updateBuilder_ == null) {
            return this.update_ == null ? MysqlxCrud.Update.getDefaultInstance() : this.update_;
        }
        return (MysqlxCrud.Update)this.updateBuilder_.getMessage();
    }

    public MysqlxPrepare.Prepare.OneOfMessage.Builder setUpdate(MysqlxCrud.Update value) {
        if (this.updateBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.update_ = value;
            this.onChanged();
        } else {
            this.updateBuilder_.setMessage((AbstractMessage)value);
        }
        this.bitField0_ |= 8;
        return this;
    }

    public MysqlxPrepare.Prepare.OneOfMessage.Builder setUpdate(MysqlxCrud.Update.Builder builderForValue) {
        if (this.updateBuilder_ == null) {
            this.update_ = builderForValue.build();
            this.onChanged();
        } else {
            this.updateBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 8;
        return this;
    }

    public MysqlxPrepare.Prepare.OneOfMessage.Builder mergeUpdate(MysqlxCrud.Update value) {
        if (this.updateBuilder_ == null) {
            this.update_ = (this.bitField0_ & 8) != 0 && this.update_ != null && this.update_ != MysqlxCrud.Update.getDefaultInstance() ? MysqlxCrud.Update.newBuilder(this.update_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.updateBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 8;
        return this;
    }

    public MysqlxPrepare.Prepare.OneOfMessage.Builder clearUpdate() {
        if (this.updateBuilder_ == null) {
            this.update_ = null;
            this.onChanged();
        } else {
            this.updateBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFF7;
        return this;
    }

    public MysqlxCrud.Update.Builder getUpdateBuilder() {
        this.bitField0_ |= 8;
        this.onChanged();
        return (MysqlxCrud.Update.Builder)this.getUpdateFieldBuilder().getBuilder();
    }

    @Override
    public MysqlxCrud.UpdateOrBuilder getUpdateOrBuilder() {
        if (this.updateBuilder_ != null) {
            return (MysqlxCrud.UpdateOrBuilder)this.updateBuilder_.getMessageOrBuilder();
        }
        return this.update_ == null ? MysqlxCrud.Update.getDefaultInstance() : this.update_;
    }

    private SingleFieldBuilderV3<MysqlxCrud.Update, MysqlxCrud.Update.Builder, MysqlxCrud.UpdateOrBuilder> getUpdateFieldBuilder() {
        if (this.updateBuilder_ == null) {
            this.updateBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getUpdate(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.update_ = null;
        }
        return this.updateBuilder_;
    }

    @Override
    public boolean hasDelete() {
        return (this.bitField0_ & 0x10) != 0;
    }

    @Override
    public MysqlxCrud.Delete getDelete() {
        if (this.deleteBuilder_ == null) {
            return this.delete_ == null ? MysqlxCrud.Delete.getDefaultInstance() : this.delete_;
        }
        return (MysqlxCrud.Delete)this.deleteBuilder_.getMessage();
    }

    public MysqlxPrepare.Prepare.OneOfMessage.Builder setDelete(MysqlxCrud.Delete value) {
        if (this.deleteBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.delete_ = value;
            this.onChanged();
        } else {
            this.deleteBuilder_.setMessage((AbstractMessage)value);
        }
        this.bitField0_ |= 0x10;
        return this;
    }

    public MysqlxPrepare.Prepare.OneOfMessage.Builder setDelete(MysqlxCrud.Delete.Builder builderForValue) {
        if (this.deleteBuilder_ == null) {
            this.delete_ = builderForValue.build();
            this.onChanged();
        } else {
            this.deleteBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 0x10;
        return this;
    }

    public MysqlxPrepare.Prepare.OneOfMessage.Builder mergeDelete(MysqlxCrud.Delete value) {
        if (this.deleteBuilder_ == null) {
            this.delete_ = (this.bitField0_ & 0x10) != 0 && this.delete_ != null && this.delete_ != MysqlxCrud.Delete.getDefaultInstance() ? MysqlxCrud.Delete.newBuilder(this.delete_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.deleteBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 0x10;
        return this;
    }

    public MysqlxPrepare.Prepare.OneOfMessage.Builder clearDelete() {
        if (this.deleteBuilder_ == null) {
            this.delete_ = null;
            this.onChanged();
        } else {
            this.deleteBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFEF;
        return this;
    }

    public MysqlxCrud.Delete.Builder getDeleteBuilder() {
        this.bitField0_ |= 0x10;
        this.onChanged();
        return (MysqlxCrud.Delete.Builder)this.getDeleteFieldBuilder().getBuilder();
    }

    @Override
    public MysqlxCrud.DeleteOrBuilder getDeleteOrBuilder() {
        if (this.deleteBuilder_ != null) {
            return (MysqlxCrud.DeleteOrBuilder)this.deleteBuilder_.getMessageOrBuilder();
        }
        return this.delete_ == null ? MysqlxCrud.Delete.getDefaultInstance() : this.delete_;
    }

    private SingleFieldBuilderV3<MysqlxCrud.Delete, MysqlxCrud.Delete.Builder, MysqlxCrud.DeleteOrBuilder> getDeleteFieldBuilder() {
        if (this.deleteBuilder_ == null) {
            this.deleteBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getDelete(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.delete_ = null;
        }
        return this.deleteBuilder_;
    }

    @Override
    public boolean hasStmtExecute() {
        return (this.bitField0_ & 0x20) != 0;
    }

    @Override
    public MysqlxSql.StmtExecute getStmtExecute() {
        if (this.stmtExecuteBuilder_ == null) {
            return this.stmtExecute_ == null ? MysqlxSql.StmtExecute.getDefaultInstance() : this.stmtExecute_;
        }
        return (MysqlxSql.StmtExecute)this.stmtExecuteBuilder_.getMessage();
    }

    public MysqlxPrepare.Prepare.OneOfMessage.Builder setStmtExecute(MysqlxSql.StmtExecute value) {
        if (this.stmtExecuteBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.stmtExecute_ = value;
            this.onChanged();
        } else {
            this.stmtExecuteBuilder_.setMessage((AbstractMessage)value);
        }
        this.bitField0_ |= 0x20;
        return this;
    }

    public MysqlxPrepare.Prepare.OneOfMessage.Builder setStmtExecute(MysqlxSql.StmtExecute.Builder builderForValue) {
        if (this.stmtExecuteBuilder_ == null) {
            this.stmtExecute_ = builderForValue.build();
            this.onChanged();
        } else {
            this.stmtExecuteBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 0x20;
        return this;
    }

    public MysqlxPrepare.Prepare.OneOfMessage.Builder mergeStmtExecute(MysqlxSql.StmtExecute value) {
        if (this.stmtExecuteBuilder_ == null) {
            this.stmtExecute_ = (this.bitField0_ & 0x20) != 0 && this.stmtExecute_ != null && this.stmtExecute_ != MysqlxSql.StmtExecute.getDefaultInstance() ? MysqlxSql.StmtExecute.newBuilder(this.stmtExecute_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.stmtExecuteBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 0x20;
        return this;
    }

    public MysqlxPrepare.Prepare.OneOfMessage.Builder clearStmtExecute() {
        if (this.stmtExecuteBuilder_ == null) {
            this.stmtExecute_ = null;
            this.onChanged();
        } else {
            this.stmtExecuteBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFDF;
        return this;
    }

    public MysqlxSql.StmtExecute.Builder getStmtExecuteBuilder() {
        this.bitField0_ |= 0x20;
        this.onChanged();
        return (MysqlxSql.StmtExecute.Builder)this.getStmtExecuteFieldBuilder().getBuilder();
    }

    @Override
    public MysqlxSql.StmtExecuteOrBuilder getStmtExecuteOrBuilder() {
        if (this.stmtExecuteBuilder_ != null) {
            return (MysqlxSql.StmtExecuteOrBuilder)this.stmtExecuteBuilder_.getMessageOrBuilder();
        }
        return this.stmtExecute_ == null ? MysqlxSql.StmtExecute.getDefaultInstance() : this.stmtExecute_;
    }

    private SingleFieldBuilderV3<MysqlxSql.StmtExecute, MysqlxSql.StmtExecute.Builder, MysqlxSql.StmtExecuteOrBuilder> getStmtExecuteFieldBuilder() {
        if (this.stmtExecuteBuilder_ == null) {
            this.stmtExecuteBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getStmtExecute(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.stmtExecute_ = null;
        }
        return this.stmtExecuteBuilder_;
    }

    public final MysqlxPrepare.Prepare.OneOfMessage.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxPrepare.Prepare.OneOfMessage.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxPrepare.Prepare.OneOfMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxPrepare.Prepare.OneOfMessage.Builder)super.mergeUnknownFields(unknownFields);
    }
}
