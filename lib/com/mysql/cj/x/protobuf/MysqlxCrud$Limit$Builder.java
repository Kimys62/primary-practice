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
import com.mysql.cj.x.protobuf.MysqlxCrud;
import java.io.IOException;

public static final class MysqlxCrud.Limit.Builder
extends GeneratedMessageV3.Builder<MysqlxCrud.Limit.Builder>
implements MysqlxCrud.LimitOrBuilder {
    private int bitField0_;
    private long rowCount_;
    private long offset_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Crud_Limit_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Crud_Limit_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.Limit.class, MysqlxCrud.Limit.Builder.class);
    }

    private MysqlxCrud.Limit.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxCrud.Limit.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public MysqlxCrud.Limit.Builder clear() {
        super.clear();
        this.rowCount_ = 0L;
        this.bitField0_ &= 0xFFFFFFFE;
        this.offset_ = 0L;
        this.bitField0_ &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Crud_Limit_descriptor;
    }

    public MysqlxCrud.Limit getDefaultInstanceForType() {
        return MysqlxCrud.Limit.getDefaultInstance();
    }

    public MysqlxCrud.Limit build() {
        MysqlxCrud.Limit result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxCrud.Limit.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxCrud.Limit buildPartial() {
        MysqlxCrud.Limit result = new MysqlxCrud.Limit(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            result.rowCount_ = this.rowCount_;
            to_bitField0_ |= 1;
        }
        if ((from_bitField0_ & 2) != 0) {
            result.offset_ = this.offset_;
            to_bitField0_ |= 2;
        }
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxCrud.Limit.Builder clone() {
        return (MysqlxCrud.Limit.Builder)super.clone();
    }

    public MysqlxCrud.Limit.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCrud.Limit.Builder)super.setField(field, value);
    }

    public MysqlxCrud.Limit.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxCrud.Limit.Builder)super.clearField(field);
    }

    public MysqlxCrud.Limit.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxCrud.Limit.Builder)super.clearOneof(oneof);
    }

    public MysqlxCrud.Limit.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxCrud.Limit.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxCrud.Limit.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCrud.Limit.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxCrud.Limit.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxCrud.Limit) {
            return this.mergeFrom((MysqlxCrud.Limit)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxCrud.Limit.Builder mergeFrom(MysqlxCrud.Limit other) {
        if (other == MysqlxCrud.Limit.getDefaultInstance()) {
            return this;
        }
        if (other.hasRowCount()) {
            this.setRowCount(other.getRowCount());
        }
        if (other.hasOffset()) {
            this.setOffset(other.getOffset());
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.hasRowCount();
    }

    public MysqlxCrud.Limit.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxCrud.Limit parsedMessage = null;
        try {
            parsedMessage = (MysqlxCrud.Limit)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxCrud.Limit)e.getUnfinishedMessage();
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
    public boolean hasRowCount() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public long getRowCount() {
        return this.rowCount_;
    }

    public MysqlxCrud.Limit.Builder setRowCount(long value) {
        this.bitField0_ |= 1;
        this.rowCount_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxCrud.Limit.Builder clearRowCount() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.rowCount_ = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasOffset() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public long getOffset() {
        return this.offset_;
    }

    public MysqlxCrud.Limit.Builder setOffset(long value) {
        this.bitField0_ |= 2;
        this.offset_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxCrud.Limit.Builder clearOffset() {
        this.bitField0_ &= 0xFFFFFFFD;
        this.offset_ = 0L;
        this.onChanged();
        return this;
    }

    public final MysqlxCrud.Limit.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCrud.Limit.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxCrud.Limit.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCrud.Limit.Builder)super.mergeUnknownFields(unknownFields);
    }
}
