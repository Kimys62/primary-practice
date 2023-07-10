/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
 *  com.google.protobuf.Message
 *  com.google.protobuf.UnknownFieldSet
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxResultset;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public static final class MysqlxResultset.Row.Builder
extends GeneratedMessageV3.Builder<MysqlxResultset.Row.Builder>
implements MysqlxResultset.RowOrBuilder {
    private int bitField0_;
    private List<ByteString> field_ = Collections.emptyList();

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Resultset_Row_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Resultset_Row_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxResultset.Row.class, MysqlxResultset.Row.Builder.class);
    }

    private MysqlxResultset.Row.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxResultset.Row.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public MysqlxResultset.Row.Builder clear() {
        super.clear();
        this.field_ = Collections.emptyList();
        this.bitField0_ &= 0xFFFFFFFE;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Resultset_Row_descriptor;
    }

    public MysqlxResultset.Row getDefaultInstanceForType() {
        return MysqlxResultset.Row.getDefaultInstance();
    }

    public MysqlxResultset.Row build() {
        MysqlxResultset.Row result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxResultset.Row.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxResultset.Row buildPartial() {
        MysqlxResultset.Row result = new MysqlxResultset.Row(this, null);
        int from_bitField0_ = this.bitField0_;
        if ((this.bitField0_ & 1) != 0) {
            this.field_ = Collections.unmodifiableList(this.field_);
            this.bitField0_ &= 0xFFFFFFFE;
        }
        result.field_ = this.field_;
        this.onBuilt();
        return result;
    }

    public MysqlxResultset.Row.Builder clone() {
        return (MysqlxResultset.Row.Builder)super.clone();
    }

    public MysqlxResultset.Row.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxResultset.Row.Builder)super.setField(field, value);
    }

    public MysqlxResultset.Row.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxResultset.Row.Builder)super.clearField(field);
    }

    public MysqlxResultset.Row.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxResultset.Row.Builder)super.clearOneof(oneof);
    }

    public MysqlxResultset.Row.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxResultset.Row.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxResultset.Row.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxResultset.Row.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxResultset.Row.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxResultset.Row) {
            return this.mergeFrom((MysqlxResultset.Row)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxResultset.Row.Builder mergeFrom(MysqlxResultset.Row other) {
        if (other == MysqlxResultset.Row.getDefaultInstance()) {
            return this;
        }
        if (!other.field_.isEmpty()) {
            if (this.field_.isEmpty()) {
                this.field_ = other.field_;
                this.bitField0_ &= 0xFFFFFFFE;
            } else {
                this.ensureFieldIsMutable();
                this.field_.addAll(other.field_);
            }
            this.onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public MysqlxResultset.Row.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxResultset.Row parsedMessage = null;
        try {
            parsedMessage = (MysqlxResultset.Row)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxResultset.Row)e.getUnfinishedMessage();
            throw e.unwrapIOException();
        }
        finally {
            if (parsedMessage != null) {
                this.mergeFrom(parsedMessage);
            }
        }
        return this;
    }

    private void ensureFieldIsMutable() {
        if ((this.bitField0_ & 1) == 0) {
            this.field_ = new ArrayList<ByteString>(this.field_);
            this.bitField0_ |= 1;
        }
    }

    @Override
    public List<ByteString> getFieldList() {
        return (this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.field_) : this.field_;
    }

    @Override
    public int getFieldCount() {
        return this.field_.size();
    }

    @Override
    public ByteString getField(int index) {
        return this.field_.get(index);
    }

    public MysqlxResultset.Row.Builder setField(int index, ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.ensureFieldIsMutable();
        this.field_.set(index, value);
        this.onChanged();
        return this;
    }

    public MysqlxResultset.Row.Builder addField(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.ensureFieldIsMutable();
        this.field_.add(value);
        this.onChanged();
        return this;
    }

    public MysqlxResultset.Row.Builder addAllField(Iterable<? extends ByteString> values) {
        this.ensureFieldIsMutable();
        AbstractMessageLite.Builder.addAll(values, this.field_);
        this.onChanged();
        return this;
    }

    public MysqlxResultset.Row.Builder clearField() {
        this.field_ = Collections.emptyList();
        this.bitField0_ &= 0xFFFFFFFE;
        this.onChanged();
        return this;
    }

    public final MysqlxResultset.Row.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxResultset.Row.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxResultset.Row.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxResultset.Row.Builder)super.mergeUnknownFields(unknownFields);
    }
}
