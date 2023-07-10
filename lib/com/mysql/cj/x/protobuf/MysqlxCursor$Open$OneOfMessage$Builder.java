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
import com.mysql.cj.x.protobuf.MysqlxPrepare;
import java.io.IOException;

public static final class MysqlxCursor.Open.OneOfMessage.Builder
extends GeneratedMessageV3.Builder<MysqlxCursor.Open.OneOfMessage.Builder>
implements MysqlxCursor.Open.OneOfMessageOrBuilder {
    private int bitField0_;
    private int type_ = 0;
    private MysqlxPrepare.Execute prepareExecute_;
    private SingleFieldBuilderV3<MysqlxPrepare.Execute, MysqlxPrepare.Execute.Builder, MysqlxPrepare.ExecuteOrBuilder> prepareExecuteBuilder_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Cursor_Open_OneOfMessage_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Cursor_Open_OneOfMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCursor.Open.OneOfMessage.class, MysqlxCursor.Open.OneOfMessage.Builder.class);
    }

    private MysqlxCursor.Open.OneOfMessage.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxCursor.Open.OneOfMessage.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            this.getPrepareExecuteFieldBuilder();
        }
    }

    public MysqlxCursor.Open.OneOfMessage.Builder clear() {
        super.clear();
        this.type_ = 0;
        this.bitField0_ &= 0xFFFFFFFE;
        if (this.prepareExecuteBuilder_ == null) {
            this.prepareExecute_ = null;
        } else {
            this.prepareExecuteBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Cursor_Open_OneOfMessage_descriptor;
    }

    public MysqlxCursor.Open.OneOfMessage getDefaultInstanceForType() {
        return MysqlxCursor.Open.OneOfMessage.getDefaultInstance();
    }

    public MysqlxCursor.Open.OneOfMessage build() {
        MysqlxCursor.Open.OneOfMessage result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxCursor.Open.OneOfMessage.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxCursor.Open.OneOfMessage buildPartial() {
        MysqlxCursor.Open.OneOfMessage result = new MysqlxCursor.Open.OneOfMessage(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            to_bitField0_ |= 1;
        }
        result.type_ = this.type_;
        if ((from_bitField0_ & 2) != 0) {
            if (this.prepareExecuteBuilder_ == null) {
                result.prepareExecute_ = this.prepareExecute_;
            } else {
                result.prepareExecute_ = (MysqlxPrepare.Execute)this.prepareExecuteBuilder_.build();
            }
            to_bitField0_ |= 2;
        }
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxCursor.Open.OneOfMessage.Builder clone() {
        return (MysqlxCursor.Open.OneOfMessage.Builder)super.clone();
    }

    public MysqlxCursor.Open.OneOfMessage.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCursor.Open.OneOfMessage.Builder)super.setField(field, value);
    }

    public MysqlxCursor.Open.OneOfMessage.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxCursor.Open.OneOfMessage.Builder)super.clearField(field);
    }

    public MysqlxCursor.Open.OneOfMessage.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxCursor.Open.OneOfMessage.Builder)super.clearOneof(oneof);
    }

    public MysqlxCursor.Open.OneOfMessage.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxCursor.Open.OneOfMessage.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxCursor.Open.OneOfMessage.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCursor.Open.OneOfMessage.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxCursor.Open.OneOfMessage.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxCursor.Open.OneOfMessage) {
            return this.mergeFrom((MysqlxCursor.Open.OneOfMessage)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxCursor.Open.OneOfMessage.Builder mergeFrom(MysqlxCursor.Open.OneOfMessage other) {
        if (other == MysqlxCursor.Open.OneOfMessage.getDefaultInstance()) {
            return this;
        }
        if (other.hasType()) {
            this.setType(other.getType());
        }
        if (other.hasPrepareExecute()) {
            this.mergePrepareExecute(other.getPrepareExecute());
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.hasType()) {
            return false;
        }
        return !this.hasPrepareExecute() || this.getPrepareExecute().isInitialized();
    }

    public MysqlxCursor.Open.OneOfMessage.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxCursor.Open.OneOfMessage parsedMessage = null;
        try {
            parsedMessage = (MysqlxCursor.Open.OneOfMessage)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxCursor.Open.OneOfMessage)e.getUnfinishedMessage();
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
    public MysqlxCursor.Open.OneOfMessage.Type getType() {
        MysqlxCursor.Open.OneOfMessage.Type result = MysqlxCursor.Open.OneOfMessage.Type.valueOf(this.type_);
        return result == null ? MysqlxCursor.Open.OneOfMessage.Type.PREPARE_EXECUTE : result;
    }

    public MysqlxCursor.Open.OneOfMessage.Builder setType(MysqlxCursor.Open.OneOfMessage.Type value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.type_ = value.getNumber();
        this.onChanged();
        return this;
    }

    public MysqlxCursor.Open.OneOfMessage.Builder clearType() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.type_ = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasPrepareExecute() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public MysqlxPrepare.Execute getPrepareExecute() {
        if (this.prepareExecuteBuilder_ == null) {
            return this.prepareExecute_ == null ? MysqlxPrepare.Execute.getDefaultInstance() : this.prepareExecute_;
        }
        return (MysqlxPrepare.Execute)this.prepareExecuteBuilder_.getMessage();
    }

    public MysqlxCursor.Open.OneOfMessage.Builder setPrepareExecute(MysqlxPrepare.Execute value) {
        if (this.prepareExecuteBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.prepareExecute_ = value;
            this.onChanged();
        } else {
            this.prepareExecuteBuilder_.setMessage((AbstractMessage)value);
        }
        this.bitField0_ |= 2;
        return this;
    }

    public MysqlxCursor.Open.OneOfMessage.Builder setPrepareExecute(MysqlxPrepare.Execute.Builder builderForValue) {
        if (this.prepareExecuteBuilder_ == null) {
            this.prepareExecute_ = builderForValue.build();
            this.onChanged();
        } else {
            this.prepareExecuteBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 2;
        return this;
    }

    public MysqlxCursor.Open.OneOfMessage.Builder mergePrepareExecute(MysqlxPrepare.Execute value) {
        if (this.prepareExecuteBuilder_ == null) {
            this.prepareExecute_ = (this.bitField0_ & 2) != 0 && this.prepareExecute_ != null && this.prepareExecute_ != MysqlxPrepare.Execute.getDefaultInstance() ? MysqlxPrepare.Execute.newBuilder(this.prepareExecute_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.prepareExecuteBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 2;
        return this;
    }

    public MysqlxCursor.Open.OneOfMessage.Builder clearPrepareExecute() {
        if (this.prepareExecuteBuilder_ == null) {
            this.prepareExecute_ = null;
            this.onChanged();
        } else {
            this.prepareExecuteBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFD;
        return this;
    }

    public MysqlxPrepare.Execute.Builder getPrepareExecuteBuilder() {
        this.bitField0_ |= 2;
        this.onChanged();
        return (MysqlxPrepare.Execute.Builder)this.getPrepareExecuteFieldBuilder().getBuilder();
    }

    @Override
    public MysqlxPrepare.ExecuteOrBuilder getPrepareExecuteOrBuilder() {
        if (this.prepareExecuteBuilder_ != null) {
            return (MysqlxPrepare.ExecuteOrBuilder)this.prepareExecuteBuilder_.getMessageOrBuilder();
        }
        return this.prepareExecute_ == null ? MysqlxPrepare.Execute.getDefaultInstance() : this.prepareExecute_;
    }

    private SingleFieldBuilderV3<MysqlxPrepare.Execute, MysqlxPrepare.Execute.Builder, MysqlxPrepare.ExecuteOrBuilder> getPrepareExecuteFieldBuilder() {
        if (this.prepareExecuteBuilder_ == null) {
            this.prepareExecuteBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getPrepareExecute(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.prepareExecute_ = null;
        }
        return this.prepareExecuteBuilder_;
    }

    public final MysqlxCursor.Open.OneOfMessage.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCursor.Open.OneOfMessage.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxCursor.Open.OneOfMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCursor.Open.OneOfMessage.Builder)super.mergeUnknownFields(unknownFields);
    }
}
