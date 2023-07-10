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
import com.mysql.cj.x.protobuf.MysqlxCrud;
import java.io.IOException;

public static final class MysqlxCrud.Collection.Builder
extends GeneratedMessageV3.Builder<MysqlxCrud.Collection.Builder>
implements MysqlxCrud.CollectionOrBuilder {
    private int bitField0_;
    private Object name_ = "";
    private Object schema_ = "";

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Crud_Collection_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Crud_Collection_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxCrud.Collection.class, MysqlxCrud.Collection.Builder.class);
    }

    private MysqlxCrud.Collection.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxCrud.Collection.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public MysqlxCrud.Collection.Builder clear() {
        super.clear();
        this.name_ = "";
        this.bitField0_ &= 0xFFFFFFFE;
        this.schema_ = "";
        this.bitField0_ &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Crud_Collection_descriptor;
    }

    public MysqlxCrud.Collection getDefaultInstanceForType() {
        return MysqlxCrud.Collection.getDefaultInstance();
    }

    public MysqlxCrud.Collection build() {
        MysqlxCrud.Collection result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxCrud.Collection.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxCrud.Collection buildPartial() {
        MysqlxCrud.Collection result = new MysqlxCrud.Collection(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            to_bitField0_ |= 1;
        }
        result.name_ = this.name_;
        if ((from_bitField0_ & 2) != 0) {
            to_bitField0_ |= 2;
        }
        result.schema_ = this.schema_;
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxCrud.Collection.Builder clone() {
        return (MysqlxCrud.Collection.Builder)super.clone();
    }

    public MysqlxCrud.Collection.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCrud.Collection.Builder)super.setField(field, value);
    }

    public MysqlxCrud.Collection.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxCrud.Collection.Builder)super.clearField(field);
    }

    public MysqlxCrud.Collection.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxCrud.Collection.Builder)super.clearOneof(oneof);
    }

    public MysqlxCrud.Collection.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxCrud.Collection.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxCrud.Collection.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxCrud.Collection.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxCrud.Collection.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxCrud.Collection) {
            return this.mergeFrom((MysqlxCrud.Collection)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxCrud.Collection.Builder mergeFrom(MysqlxCrud.Collection other) {
        if (other == MysqlxCrud.Collection.getDefaultInstance()) {
            return this;
        }
        if (other.hasName()) {
            this.bitField0_ |= 1;
            this.name_ = other.name_;
            this.onChanged();
        }
        if (other.hasSchema()) {
            this.bitField0_ |= 2;
            this.schema_ = other.schema_;
            this.onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.hasName();
    }

    public MysqlxCrud.Collection.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxCrud.Collection parsedMessage = null;
        try {
            parsedMessage = (MysqlxCrud.Collection)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxCrud.Collection)e.getUnfinishedMessage();
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
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public String getName() {
        Object ref = this.name_;
        if (!(ref instanceof String)) {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.name_ = s;
            }
            return s;
        }
        return (String)ref;
    }

    @Override
    public ByteString getNameBytes() {
        Object ref = this.name_;
        if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)((String)ref));
            this.name_ = b;
            return b;
        }
        return (ByteString)ref;
    }

    public MysqlxCrud.Collection.Builder setName(String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.name_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxCrud.Collection.Builder clearName() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.name_ = MysqlxCrud.Collection.getDefaultInstance().getName();
        this.onChanged();
        return this;
    }

    public MysqlxCrud.Collection.Builder setNameBytes(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.name_ = value;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasSchema() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public String getSchema() {
        Object ref = this.schema_;
        if (!(ref instanceof String)) {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.schema_ = s;
            }
            return s;
        }
        return (String)ref;
    }

    @Override
    public ByteString getSchemaBytes() {
        Object ref = this.schema_;
        if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)((String)ref));
            this.schema_ = b;
            return b;
        }
        return (ByteString)ref;
    }

    public MysqlxCrud.Collection.Builder setSchema(String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 2;
        this.schema_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxCrud.Collection.Builder clearSchema() {
        this.bitField0_ &= 0xFFFFFFFD;
        this.schema_ = MysqlxCrud.Collection.getDefaultInstance().getSchema();
        this.onChanged();
        return this;
    }

    public MysqlxCrud.Collection.Builder setSchemaBytes(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 2;
        this.schema_ = value;
        this.onChanged();
        return this;
    }

    public final MysqlxCrud.Collection.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCrud.Collection.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxCrud.Collection.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxCrud.Collection.Builder)super.mergeUnknownFields(unknownFields);
    }
}
