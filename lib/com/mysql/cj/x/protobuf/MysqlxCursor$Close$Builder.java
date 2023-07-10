/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
 *  com.google.protobuf.UnknownFieldSet
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxCursor;
import java.io.IOException;

public static final class MysqlxCursor.Close.Builder
extends GeneratedMessageV3.Builder<MysqlxCursor.Close.Builder>
implements MysqlxCursor.CloseOrBuilder {
    private int bitField0_;
    private int cursorId_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Cursor_Close_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Cursor_Close_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCursor.Close.class, MysqlxCursor.Close.Builder.class);
    }

    private MysqlxCursor.Close.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxCursor.Close.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public MysqlxCursor.Close.Builder clear() {
        super.clear();
        this.cursorId_ = 0;
        this.bitField0_ &= 0xFFFFFFFE;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Cursor_Close_descriptor;
    }

    public MysqlxCursor.Close getDefaultInstanceForType() {
        return MysqlxCursor.Close.getDefaultInstance();
    }

    public MysqlxCursor.Close build() {
        MysqlxCursor.Close result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxCursor.Close.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxCursor.Close buildPartial() {
        MysqlxCursor.Close result = new MysqlxCursor.Close(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            result.cursorId_ = this.cursorId_;
            to_bitField0_ |= 1;
        }
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxCursor.Close.Builder clone() {
        return (MysqlxCursor.Close.Builder)super.clone();
    }

    public MysqlxCursor.Close.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCursor.Close.Builder)super.setField(field, value);
    }

    public MysqlxCursor.Close.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxCursor.Close.Builder)super.clearField(field);
    }

    public MysqlxCursor.Close.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxCursor.Close.Builder)super.clearOneof(oneof);
    }

    public MysqlxCursor.Close.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxCursor.Close.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxCursor.Close.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCursor.Close.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxCursor.Close.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxCursor.Close) {
            return this.mergeFrom((MysqlxCursor.Close)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxCursor.Close.Builder mergeFrom(MysqlxCursor.Close other) {
        if (other == MysqlxCursor.Close.getDefaultInstance()) {
            return this;
        }
        if (other.hasCursorId()) {
            this.setCursorId(other.getCursorId());
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.hasCursorId();
    }

    public MysqlxCursor.Close.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxCursor.Close parsedMessage = null;
        try {
            parsedMessage = (MysqlxCursor.Close)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxCursor.Close)e.getUnfinishedMessage();
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

    public MysqlxCursor.Close.Builder setCursorId(int value) {
        this.bitField0_ |= 1;
        this.cursorId_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxCursor.Close.Builder clearCursorId() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.cursorId_ = 0;
        this.onChanged();
        return this;
    }

    public final MysqlxCursor.Close.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCursor.Close.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxCursor.Close.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCursor.Close.Builder)super.mergeUnknownFields(unknownFields);
    }
}
