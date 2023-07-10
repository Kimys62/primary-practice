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
import com.mysql.cj.x.protobuf.MysqlxPrepare;
import java.io.IOException;

public static final class MysqlxPrepare.Deallocate.Builder
extends GeneratedMessageV3.Builder<MysqlxPrepare.Deallocate.Builder>
implements MysqlxPrepare.DeallocateOrBuilder {
    private int bitField0_;
    private int stmtId_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Prepare_Deallocate_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Prepare_Deallocate_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxPrepare.Deallocate.class, MysqlxPrepare.Deallocate.Builder.class);
    }

    private MysqlxPrepare.Deallocate.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxPrepare.Deallocate.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public MysqlxPrepare.Deallocate.Builder clear() {
        super.clear();
        this.stmtId_ = 0;
        this.bitField0_ &= 0xFFFFFFFE;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Prepare_Deallocate_descriptor;
    }

    public MysqlxPrepare.Deallocate getDefaultInstanceForType() {
        return MysqlxPrepare.Deallocate.getDefaultInstance();
    }

    public MysqlxPrepare.Deallocate build() {
        MysqlxPrepare.Deallocate result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxPrepare.Deallocate.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxPrepare.Deallocate buildPartial() {
        MysqlxPrepare.Deallocate result = new MysqlxPrepare.Deallocate(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            result.stmtId_ = this.stmtId_;
            to_bitField0_ |= 1;
        }
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxPrepare.Deallocate.Builder clone() {
        return (MysqlxPrepare.Deallocate.Builder)super.clone();
    }

    public MysqlxPrepare.Deallocate.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxPrepare.Deallocate.Builder)super.setField(field, value);
    }

    public MysqlxPrepare.Deallocate.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxPrepare.Deallocate.Builder)super.clearField(field);
    }

    public MysqlxPrepare.Deallocate.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxPrepare.Deallocate.Builder)super.clearOneof(oneof);
    }

    public MysqlxPrepare.Deallocate.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxPrepare.Deallocate.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxPrepare.Deallocate.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxPrepare.Deallocate.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxPrepare.Deallocate.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxPrepare.Deallocate) {
            return this.mergeFrom((MysqlxPrepare.Deallocate)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxPrepare.Deallocate.Builder mergeFrom(MysqlxPrepare.Deallocate other) {
        if (other == MysqlxPrepare.Deallocate.getDefaultInstance()) {
            return this;
        }
        if (other.hasStmtId()) {
            this.setStmtId(other.getStmtId());
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.hasStmtId();
    }

    public MysqlxPrepare.Deallocate.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxPrepare.Deallocate parsedMessage = null;
        try {
            parsedMessage = (MysqlxPrepare.Deallocate)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxPrepare.Deallocate)e.getUnfinishedMessage();
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

    public MysqlxPrepare.Deallocate.Builder setStmtId(int value) {
        this.bitField0_ |= 1;
        this.stmtId_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxPrepare.Deallocate.Builder clearStmtId() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.stmtId_ = 0;
        this.onChanged();
        return this;
    }

    public final MysqlxPrepare.Deallocate.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxPrepare.Deallocate.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxPrepare.Deallocate.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxPrepare.Deallocate.Builder)super.mergeUnknownFields(unknownFields);
    }
}
