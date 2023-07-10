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

public static final class MysqlxDatatypes.Scalar.String.Builder
extends GeneratedMessageV3.Builder<MysqlxDatatypes.Scalar.String.Builder>
implements MysqlxDatatypes.Scalar.StringOrBuilder {
    private int bitField0_;
    private ByteString value_ = ByteString.EMPTY;
    private long collation_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Datatypes_Scalar_String_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Datatypes_Scalar_String_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxDatatypes.Scalar.String.class, MysqlxDatatypes.Scalar.String.Builder.class);
    }

    private MysqlxDatatypes.Scalar.String.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxDatatypes.Scalar.String.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public MysqlxDatatypes.Scalar.String.Builder clear() {
        super.clear();
        this.value_ = ByteString.EMPTY;
        this.bitField0_ &= 0xFFFFFFFE;
        this.collation_ = 0L;
        this.bitField0_ &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Datatypes_Scalar_String_descriptor;
    }

    public MysqlxDatatypes.Scalar.String getDefaultInstanceForType() {
        return MysqlxDatatypes.Scalar.String.getDefaultInstance();
    }

    public MysqlxDatatypes.Scalar.String build() {
        MysqlxDatatypes.Scalar.String result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxDatatypes.Scalar.String.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxDatatypes.Scalar.String buildPartial() {
        MysqlxDatatypes.Scalar.String result = new MysqlxDatatypes.Scalar.String(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            to_bitField0_ |= 1;
        }
        result.value_ = this.value_;
        if ((from_bitField0_ & 2) != 0) {
            result.collation_ = this.collation_;
            to_bitField0_ |= 2;
        }
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxDatatypes.Scalar.String.Builder clone() {
        return (MysqlxDatatypes.Scalar.String.Builder)super.clone();
    }

    public MysqlxDatatypes.Scalar.String.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxDatatypes.Scalar.String.Builder)super.setField(field, value);
    }

    public MysqlxDatatypes.Scalar.String.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxDatatypes.Scalar.String.Builder)super.clearField(field);
    }

    public MysqlxDatatypes.Scalar.String.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxDatatypes.Scalar.String.Builder)super.clearOneof(oneof);
    }

    public MysqlxDatatypes.Scalar.String.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxDatatypes.Scalar.String.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxDatatypes.Scalar.String.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxDatatypes.Scalar.String.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxDatatypes.Scalar.String.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxDatatypes.Scalar.String) {
            return this.mergeFrom((MysqlxDatatypes.Scalar.String)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxDatatypes.Scalar.String.Builder mergeFrom(MysqlxDatatypes.Scalar.String other) {
        if (other == MysqlxDatatypes.Scalar.String.getDefaultInstance()) {
            return this;
        }
        if (other.hasValue()) {
            this.setValue(other.getValue());
        }
        if (other.hasCollation()) {
            this.setCollation(other.getCollation());
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.hasValue();
    }

    public MysqlxDatatypes.Scalar.String.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxDatatypes.Scalar.String parsedMessage = null;
        try {
            parsedMessage = (MysqlxDatatypes.Scalar.String)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxDatatypes.Scalar.String)e.getUnfinishedMessage();
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

    public MysqlxDatatypes.Scalar.String.Builder setValue(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.value_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxDatatypes.Scalar.String.Builder clearValue() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.value_ = MysqlxDatatypes.Scalar.String.getDefaultInstance().getValue();
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasCollation() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public long getCollation() {
        return this.collation_;
    }

    public MysqlxDatatypes.Scalar.String.Builder setCollation(long value) {
        this.bitField0_ |= 2;
        this.collation_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxDatatypes.Scalar.String.Builder clearCollation() {
        this.bitField0_ &= 0xFFFFFFFD;
        this.collation_ = 0L;
        this.onChanged();
        return this;
    }

    public final MysqlxDatatypes.Scalar.String.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxDatatypes.Scalar.String.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxDatatypes.Scalar.String.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxDatatypes.Scalar.String.Builder)super.mergeUnknownFields(unknownFields);
    }
}
