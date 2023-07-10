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

public static final class MysqlxCursor.Fetch.Builder
extends GeneratedMessageV3.Builder<MysqlxCursor.Fetch.Builder>
implements MysqlxCursor.FetchOrBuilder {
    private int bitField0_;
    private int cursorId_;
    private long fetchRows_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Cursor_Fetch_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Cursor_Fetch_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCursor.Fetch.class, MysqlxCursor.Fetch.Builder.class);
    }

    private MysqlxCursor.Fetch.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxCursor.Fetch.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public MysqlxCursor.Fetch.Builder clear() {
        super.clear();
        this.cursorId_ = 0;
        this.bitField0_ &= 0xFFFFFFFE;
        this.fetchRows_ = 0L;
        this.bitField0_ &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Cursor_Fetch_descriptor;
    }

    public MysqlxCursor.Fetch getDefaultInstanceForType() {
        return MysqlxCursor.Fetch.getDefaultInstance();
    }

    public MysqlxCursor.Fetch build() {
        MysqlxCursor.Fetch result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxCursor.Fetch.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxCursor.Fetch buildPartial() {
        MysqlxCursor.Fetch result = new MysqlxCursor.Fetch(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            result.cursorId_ = this.cursorId_;
            to_bitField0_ |= 1;
        }
        if ((from_bitField0_ & 2) != 0) {
            result.fetchRows_ = this.fetchRows_;
            to_bitField0_ |= 2;
        }
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxCursor.Fetch.Builder clone() {
        return (MysqlxCursor.Fetch.Builder)super.clone();
    }

    public MysqlxCursor.Fetch.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCursor.Fetch.Builder)super.setField(field, value);
    }

    public MysqlxCursor.Fetch.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxCursor.Fetch.Builder)super.clearField(field);
    }

    public MysqlxCursor.Fetch.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxCursor.Fetch.Builder)super.clearOneof(oneof);
    }

    public MysqlxCursor.Fetch.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxCursor.Fetch.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxCursor.Fetch.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCursor.Fetch.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxCursor.Fetch.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxCursor.Fetch) {
            return this.mergeFrom((MysqlxCursor.Fetch)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxCursor.Fetch.Builder mergeFrom(MysqlxCursor.Fetch other) {
        if (other == MysqlxCursor.Fetch.getDefaultInstance()) {
            return this;
        }
        if (other.hasCursorId()) {
            this.setCursorId(other.getCursorId());
        }
        if (other.hasFetchRows()) {
            this.setFetchRows(other.getFetchRows());
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.hasCursorId();
    }

    public MysqlxCursor.Fetch.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxCursor.Fetch parsedMessage = null;
        try {
            parsedMessage = (MysqlxCursor.Fetch)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxCursor.Fetch)e.getUnfinishedMessage();
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

    public MysqlxCursor.Fetch.Builder setCursorId(int value) {
        this.bitField0_ |= 1;
        this.cursorId_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxCursor.Fetch.Builder clearCursorId() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.cursorId_ = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasFetchRows() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public long getFetchRows() {
        return this.fetchRows_;
    }

    public MysqlxCursor.Fetch.Builder setFetchRows(long value) {
        this.bitField0_ |= 2;
        this.fetchRows_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxCursor.Fetch.Builder clearFetchRows() {
        this.bitField0_ &= 0xFFFFFFFD;
        this.fetchRows_ = 0L;
        this.onChanged();
        return this;
    }

    public final MysqlxCursor.Fetch.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCursor.Fetch.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxCursor.Fetch.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCursor.Fetch.Builder)super.mergeUnknownFields(unknownFields);
    }
}
