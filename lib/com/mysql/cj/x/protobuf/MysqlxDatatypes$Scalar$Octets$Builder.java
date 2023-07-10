/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import java.io.IOException;

public static final class MysqlxDatatypes.Scalar.Octets.Builder
extends GeneratedMessageV3.Builder<MysqlxDatatypes.Scalar.Octets.Builder>
implements MysqlxDatatypes.Scalar.OctetsOrBuilder {
    private int bitField0_;
    private ByteString value_ = ByteString.EMPTY;
    private int contentType_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Datatypes_Scalar_Octets_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Datatypes_Scalar_Octets_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxDatatypes.Scalar.Octets.class, MysqlxDatatypes.Scalar.Octets.Builder.class);
    }

    private MysqlxDatatypes.Scalar.Octets.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxDatatypes.Scalar.Octets.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public MysqlxDatatypes.Scalar.Octets.Builder clear() {
        super.clear();
        this.value_ = ByteString.EMPTY;
        this.bitField0_ &= 0xFFFFFFFE;
        this.contentType_ = 0;
        this.bitField0_ &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Datatypes_Scalar_Octets_descriptor;
    }

    public MysqlxDatatypes.Scalar.Octets getDefaultInstanceForType() {
        return MysqlxDatatypes.Scalar.Octets.getDefaultInstance();
    }

    public MysqlxDatatypes.Scalar.Octets build() {
        MysqlxDatatypes.Scalar.Octets result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxDatatypes.Scalar.Octets.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxDatatypes.Scalar.Octets buildPartial() {
        MysqlxDatatypes.Scalar.Octets result = new MysqlxDatatypes.Scalar.Octets(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            to_bitField0_ |= 1;
        }
        result.value_ = this.value_;
        if ((from_bitField0_ & 2) != 0) {
            result.contentType_ = this.contentType_;
            to_bitField0_ |= 2;
        }
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxDatatypes.Scalar.Octets.Builder clone() {
        return (MysqlxDatatypes.Scalar.Octets.Builder)super.clone();
    }

    public MysqlxDatatypes.Scalar.Octets.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxDatatypes.Scalar.Octets.Builder)super.setField(field, value);
    }

    public MysqlxDatatypes.Scalar.Octets.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxDatatypes.Scalar.Octets.Builder)super.clearField(field);
    }

    public MysqlxDatatypes.Scalar.Octets.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxDatatypes.Scalar.Octets.Builder)super.clearOneof(oneof);
    }

    public MysqlxDatatypes.Scalar.Octets.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxDatatypes.Scalar.Octets.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxDatatypes.Scalar.Octets.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxDatatypes.Scalar.Octets.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxDatatypes.Scalar.Octets.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxDatatypes.Scalar.Octets) {
            return this.mergeFrom((MysqlxDatatypes.Scalar.Octets)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxDatatypes.Scalar.Octets.Builder mergeFrom(MysqlxDatatypes.Scalar.Octets other) {
        if (other == MysqlxDatatypes.Scalar.Octets.getDefaultInstance()) {
            return this;
        }
        if (other.hasValue()) {
            this.setValue(other.getValue());
        }
        if (other.hasContentType()) {
            this.setContentType(other.getContentType());
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.hasValue();
    }

    public MysqlxDatatypes.Scalar.Octets.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxDatatypes.Scalar.Octets parsedMessage = null;
        try {
            parsedMessage = (MysqlxDatatypes.Scalar.Octets)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxDatatypes.Scalar.Octets)e.getUnfinishedMessage();
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
    public boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public ByteString getValue() {
        return this.value_;
    }

    public MysqlxDatatypes.Scalar.Octets.Builder setValue(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.value_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxDatatypes.Scalar.Octets.Builder clearValue() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.value_ = MysqlxDatatypes.Scalar.Octets.getDefaultInstance().getValue();
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasContentType() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public int getContentType() {
        return this.contentType_;
    }

    public MysqlxDatatypes.Scalar.Octets.Builder setContentType(int value) {
        this.bitField0_ |= 2;
        this.contentType_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxDatatypes.Scalar.Octets.Builder clearContentType() {
        this.bitField0_ &= 0xFFFFFFFD;
        this.contentType_ = 0;
        this.onChanged();
        return this;
    }

    public final MysqlxDatatypes.Scalar.Octets.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxDatatypes.Scalar.Octets.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxDatatypes.Scalar.Octets.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxDatatypes.Scalar.Octets.Builder)super.mergeUnknownFields(unknownFields);
    }
}
