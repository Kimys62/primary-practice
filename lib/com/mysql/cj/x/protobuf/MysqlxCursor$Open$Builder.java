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
import com.mysql.cj.x.protobuf.MysqlxCursor;
import java.io.IOException;

public static final class MysqlxCursor.Open.Builder
extends GeneratedMessageV3.Builder<MysqlxCursor.Open.Builder>
implements MysqlxCursor.OpenOrBuilder {
    private int bitField0_;
    private int cursorId_;
    private MysqlxCursor.Open.OneOfMessage stmt_;
    private SingleFieldBuilderV3<MysqlxCursor.Open.OneOfMessage, MysqlxCursor.Open.OneOfMessage.Builder, MysqlxCursor.Open.OneOfMessageOrBuilder> stmtBuilder_;
    private long fetchRows_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Cursor_Open_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Cursor_Open_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCursor.Open.class, MysqlxCursor.Open.Builder.class);
    }

    private MysqlxCursor.Open.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxCursor.Open.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            this.getStmtFieldBuilder();
        }
    }

    public MysqlxCursor.Open.Builder clear() {
        super.clear();
        this.cursorId_ = 0;
        this.bitField0_ &= 0xFFFFFFFE;
        if (this.stmtBuilder_ == null) {
            this.stmt_ = null;
        } else {
            this.stmtBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFD;
        this.fetchRows_ = 0L;
        this.bitField0_ &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Cursor_Open_descriptor;
    }

    public MysqlxCursor.Open getDefaultInstanceForType() {
        return MysqlxCursor.Open.getDefaultInstance();
    }

    public MysqlxCursor.Open build() {
        MysqlxCursor.Open result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxCursor.Open.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxCursor.Open buildPartial() {
        MysqlxCursor.Open result = new MysqlxCursor.Open(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            result.cursorId_ = this.cursorId_;
            to_bitField0_ |= 1;
        }
        if ((from_bitField0_ & 2) != 0) {
            if (this.stmtBuilder_ == null) {
                result.stmt_ = this.stmt_;
            } else {
                result.stmt_ = (MysqlxCursor.Open.OneOfMessage)this.stmtBuilder_.build();
            }
            to_bitField0_ |= 2;
        }
        if ((from_bitField0_ & 4) != 0) {
            result.fetchRows_ = this.fetchRows_;
            to_bitField0_ |= 4;
        }
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxCursor.Open.Builder clone() {
        return (MysqlxCursor.Open.Builder)super.clone();
    }

    public MysqlxCursor.Open.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCursor.Open.Builder)super.setField(field, value);
    }

    public MysqlxCursor.Open.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxCursor.Open.Builder)super.clearField(field);
    }

    public MysqlxCursor.Open.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxCursor.Open.Builder)super.clearOneof(oneof);
    }

    public MysqlxCursor.Open.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxCursor.Open.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxCursor.Open.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCursor.Open.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxCursor.Open.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxCursor.Open) {
            return this.mergeFrom((MysqlxCursor.Open)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxCursor.Open.Builder mergeFrom(MysqlxCursor.Open other) {
        if (other == MysqlxCursor.Open.getDefaultInstance()) {
            return this;
        }
        if (other.hasCursorId()) {
            this.setCursorId(other.getCursorId());
        }
        if (other.hasStmt()) {
            this.mergeStmt(other.getStmt());
        }
        if (other.hasFetchRows()) {
            this.setFetchRows(other.getFetchRows());
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.hasCursorId()) {
            return false;
        }
        if (!this.hasStmt()) {
            return false;
        }
        return this.getStmt().isInitialized();
    }

    public MysqlxCursor.Open.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxCursor.Open parsedMessage = null;
        try {
            parsedMessage = (MysqlxCursor.Open)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxCursor.Open)e.getUnfinishedMessage();
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
    public boolean hasCursorId() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public int getCursorId() {
        return this.cursorId_;
    }

    public MysqlxCursor.Open.Builder setCursorId(int value) {
        this.bitField0_ |= 1;
        this.cursorId_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxCursor.Open.Builder clearCursorId() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.cursorId_ = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasStmt() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public MysqlxCursor.Open.OneOfMessage getStmt() {
        if (this.stmtBuilder_ == null) {
            return this.stmt_ == null ? MysqlxCursor.Open.OneOfMessage.getDefaultInstance() : this.stmt_;
        }
        return (MysqlxCursor.Open.OneOfMessage)this.stmtBuilder_.getMessage();
    }

    public MysqlxCursor.Open.Builder setStmt(MysqlxCursor.Open.OneOfMessage value) {
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

    public MysqlxCursor.Open.Builder setStmt(MysqlxCursor.Open.OneOfMessage.Builder builderForValue) {
        if (this.stmtBuilder_ == null) {
            this.stmt_ = builderForValue.build();
            this.onChanged();
        } else {
            this.stmtBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 2;
        return this;
    }

    public MysqlxCursor.Open.Builder mergeStmt(MysqlxCursor.Open.OneOfMessage value) {
        if (this.stmtBuilder_ == null) {
            this.stmt_ = (this.bitField0_ & 2) != 0 && this.stmt_ != null && this.stmt_ != MysqlxCursor.Open.OneOfMessage.getDefaultInstance() ? MysqlxCursor.Open.OneOfMessage.newBuilder(this.stmt_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.stmtBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 2;
        return this;
    }

    public MysqlxCursor.Open.Builder clearStmt() {
        if (this.stmtBuilder_ == null) {
            this.stmt_ = null;
            this.onChanged();
        } else {
            this.stmtBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFD;
        return this;
    }

    public MysqlxCursor.Open.OneOfMessage.Builder getStmtBuilder() {
        this.bitField0_ |= 2;
        this.onChanged();
        return (MysqlxCursor.Open.OneOfMessage.Builder)this.getStmtFieldBuilder().getBuilder();
    }

    @Override
    public MysqlxCursor.Open.OneOfMessageOrBuilder getStmtOrBuilder() {
        if (this.stmtBuilder_ != null) {
            return (MysqlxCursor.Open.OneOfMessageOrBuilder)this.stmtBuilder_.getMessageOrBuilder();
        }
        return this.stmt_ == null ? MysqlxCursor.Open.OneOfMessage.getDefaultInstance() : this.stmt_;
    }

    private SingleFieldBuilderV3<MysqlxCursor.Open.OneOfMessage, MysqlxCursor.Open.OneOfMessage.Builder, MysqlxCursor.Open.OneOfMessageOrBuilder> getStmtFieldBuilder() {
        if (this.stmtBuilder_ == null) {
            this.stmtBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getStmt(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.stmt_ = null;
        }
        return this.stmtBuilder_;
    }

    @Override
    public boolean hasFetchRows() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override
    public long getFetchRows() {
        return this.fetchRows_;
    }

    public MysqlxCursor.Open.Builder setFetchRows(long value) {
        this.bitField0_ |= 4;
        this.fetchRows_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxCursor.Open.Builder clearFetchRows() {
        this.bitField0_ &= 0xFFFFFFFB;
        this.fetchRows_ = 0L;
        this.onChanged();
        return this;
    }

    public final MysqlxCursor.Open.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCursor.Open.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxCursor.Open.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCursor.Open.Builder)super.mergeUnknownFields(unknownFields);
    }
}
