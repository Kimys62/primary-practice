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
import com.mysql.cj.x.protobuf.MysqlxPrepare;
import java.io.IOException;

public static final class MysqlxPrepare.Prepare.Builder
extends GeneratedMessageV3.Builder<MysqlxPrepare.Prepare.Builder>
implements MysqlxPrepare.PrepareOrBuilder {
    private int bitField0_;
    private int stmtId_;
    private MysqlxPrepare.Prepare.OneOfMessage stmt_;
    private SingleFieldBuilderV3<MysqlxPrepare.Prepare.OneOfMessage, MysqlxPrepare.Prepare.OneOfMessage.Builder, MysqlxPrepare.Prepare.OneOfMessageOrBuilder> stmtBuilder_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Prepare_Prepare_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Prepare_Prepare_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxPrepare.Prepare.class, MysqlxPrepare.Prepare.Builder.class);
    }

    private MysqlxPrepare.Prepare.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxPrepare.Prepare.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            this.getStmtFieldBuilder();
        }
    }

    public MysqlxPrepare.Prepare.Builder clear() {
        super.clear();
        this.stmtId_ = 0;
        this.bitField0_ &= 0xFFFFFFFE;
        if (this.stmtBuilder_ == null) {
            this.stmt_ = null;
        } else {
            this.stmtBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Prepare_Prepare_descriptor;
    }

    public MysqlxPrepare.Prepare getDefaultInstanceForType() {
        return MysqlxPrepare.Prepare.getDefaultInstance();
    }

    public MysqlxPrepare.Prepare build() {
        MysqlxPrepare.Prepare result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxPrepare.Prepare.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxPrepare.Prepare buildPartial() {
        MysqlxPrepare.Prepare result = new MysqlxPrepare.Prepare(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            result.stmtId_ = this.stmtId_;
            to_bitField0_ |= 1;
        }
        if ((from_bitField0_ & 2) != 0) {
            if (this.stmtBuilder_ == null) {
                result.stmt_ = this.stmt_;
            } else {
                result.stmt_ = (MysqlxPrepare.Prepare.OneOfMessage)this.stmtBuilder_.build();
            }
            to_bitField0_ |= 2;
        }
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxPrepare.Prepare.Builder clone() {
        return (MysqlxPrepare.Prepare.Builder)super.clone();
    }

    public MysqlxPrepare.Prepare.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxPrepare.Prepare.Builder)super.setField(field, value);
    }

    public MysqlxPrepare.Prepare.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxPrepare.Prepare.Builder)super.clearField(field);
    }

    public MysqlxPrepare.Prepare.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxPrepare.Prepare.Builder)super.clearOneof(oneof);
    }

    public MysqlxPrepare.Prepare.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxPrepare.Prepare.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxPrepare.Prepare.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxPrepare.Prepare.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxPrepare.Prepare.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxPrepare.Prepare) {
            return this.mergeFrom((MysqlxPrepare.Prepare)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxPrepare.Prepare.Builder mergeFrom(MysqlxPrepare.Prepare other) {
        if (other == MysqlxPrepare.Prepare.getDefaultInstance()) {
            return this;
        }
        if (other.hasStmtId()) {
            this.setStmtId(other.getStmtId());
        }
        if (other.hasStmt()) {
            this.mergeStmt(other.getStmt());
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.hasStmtId()) {
            return false;
        }
        if (!this.hasStmt()) {
            return false;
        }
        return this.getStmt().isInitialized();
    }

    public MysqlxPrepare.Prepare.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxPrepare.Prepare parsedMessage = null;
        try {
            parsedMessage = (MysqlxPrepare.Prepare)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxPrepare.Prepare)e.getUnfinishedMessage();
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
    public boolean hasStmtId() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public int getStmtId() {
        return this.stmtId_;
    }

    public MysqlxPrepare.Prepare.Builder setStmtId(int value) {
        this.bitField0_ |= 1;
        this.stmtId_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxPrepare.Prepare.Builder clearStmtId() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.stmtId_ = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasStmt() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public MysqlxPrepare.Prepare.OneOfMessage getStmt() {
        if (this.stmtBuilder_ == null) {
            return this.stmt_ == null ? MysqlxPrepare.Prepare.OneOfMessage.getDefaultInstance() : this.stmt_;
        }
        return (MysqlxPrepare.Prepare.OneOfMessage)this.stmtBuilder_.getMessage();
    }

    public MysqlxPrepare.Prepare.Builder setStmt(MysqlxPrepare.Prepare.OneOfMessage value) {
        if (this.stmtBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.stmt_ = value;
            this.onChanged();
        } else {
            this.stmtBuilder_.setMessage((AbstractMessage)value);
        }
        this.bitField0_ |= 2;
        return this;
    }

    public MysqlxPrepare.Prepare.Builder setStmt(MysqlxPrepare.Prepare.OneOfMessage.Builder builderForValue) {
        if (this.stmtBuilder_ == null) {
            this.stmt_ = builderForValue.build();
            this.onChanged();
        } else {
            this.stmtBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 2;
        return this;
    }

    public MysqlxPrepare.Prepare.Builder mergeStmt(MysqlxPrepare.Prepare.OneOfMessage value) {
        if (this.stmtBuilder_ == null) {
            this.stmt_ = (this.bitField0_ & 2) != 0 && this.stmt_ != null && this.stmt_ != MysqlxPrepare.Prepare.OneOfMessage.getDefaultInstance() ? MysqlxPrepare.Prepare.OneOfMessage.newBuilder(this.stmt_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.stmtBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 2;
        return this;
    }

    public MysqlxPrepare.Prepare.Builder clearStmt() {
        if (this.stmtBuilder_ == null) {
            this.stmt_ = null;
            this.onChanged();
        } else {
            this.stmtBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFD;
        return this;
    }

    public MysqlxPrepare.Prepare.OneOfMessage.Builder getStmtBuilder() {
        this.bitField0_ |= 2;
        this.onChanged();
        return (MysqlxPrepare.Prepare.OneOfMessage.Builder)this.getStmtFieldBuilder().getBuilder();
    }

    @Override
    public MysqlxPrepare.Prepare.OneOfMessageOrBuilder getStmtOrBuilder() {
        if (this.stmtBuilder_ != null) {
            return (MysqlxPrepare.Prepare.OneOfMessageOrBuilder)this.stmtBuilder_.getMessageOrBuilder();
        }
        return this.stmt_ == null ? MysqlxPrepare.Prepare.OneOfMessage.getDefaultInstance() : this.stmt_;
    }

    private SingleFieldBuilderV3<MysqlxPrepare.Prepare.OneOfMessage, MysqlxPrepare.Prepare.OneOfMessage.Builder, MysqlxPrepare.Prepare.OneOfMessageOrBuilder> getStmtFieldBuilder() {
        if (this.stmtBuilder_ == null) {
            this.stmtBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getStmt(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.stmt_ = null;
        }
        return this.stmtBuilder_;
    }

    public final MysqlxPrepare.Prepare.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxPrepare.Prepare.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxPrepare.Prepare.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxPrepare.Prepare.Builder)super.mergeUnknownFields(unknownFields);
    }
}
