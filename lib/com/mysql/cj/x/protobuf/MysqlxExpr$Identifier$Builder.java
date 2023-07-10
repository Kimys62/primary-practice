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
import com.mysql.cj.x.protobuf.MysqlxExpr;
import java.io.IOException;

public static final class MysqlxExpr.Identifier.Builder
extends GeneratedMessageV3.Builder<MysqlxExpr.Identifier.Builder>
implements MysqlxExpr.IdentifierOrBuilder {
    private int bitField0_;
    private Object name_ = "";
    private Object schemaName_ = "";

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Expr_Identifier_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Expr_Identifier_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxExpr.Identifier.class, MysqlxExpr.Identifier.Builder.class);
    }

    private MysqlxExpr.Identifier.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxExpr.Identifier.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public MysqlxExpr.Identifier.Builder clear() {
        super.clear();
        this.name_ = "";
        this.bitField0_ &= 0xFFFFFFFE;
        this.schemaName_ = "";
        this.bitField0_ &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Expr_Identifier_descriptor;
    }

    public MysqlxExpr.Identifier getDefaultInstanceForType() {
        return MysqlxExpr.Identifier.getDefaultInstance();
    }

    public MysqlxExpr.Identifier build() {
        MysqlxExpr.Identifier result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxExpr.Identifier.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxExpr.Identifier buildPartial() {
        MysqlxExpr.Identifier result = new MysqlxExpr.Identifier(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            to_bitField0_ |= 1;
        }
        result.name_ = this.name_;
        if ((from_bitField0_ & 2) != 0) {
            to_bitField0_ |= 2;
        }
        result.schemaName_ = this.schemaName_;
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxExpr.Identifier.Builder clone() {
        return (MysqlxExpr.Identifier.Builder)super.clone();
    }

    public MysqlxExpr.Identifier.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxExpr.Identifier.Builder)super.setField(field, value);
    }

    public MysqlxExpr.Identifier.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxExpr.Identifier.Builder)super.clearField(field);
    }

    public MysqlxExpr.Identifier.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxExpr.Identifier.Builder)super.clearOneof(oneof);
    }

    public MysqlxExpr.Identifier.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxExpr.Identifier.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxExpr.Identifier.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxExpr.Identifier.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxExpr.Identifier.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxExpr.Identifier) {
            return this.mergeFrom((MysqlxExpr.Identifier)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxExpr.Identifier.Builder mergeFrom(MysqlxExpr.Identifier other) {
        if (other == MysqlxExpr.Identifier.getDefaultInstance()) {
            return this;
        }
        if (other.hasName()) {
            this.bitField0_ |= 1;
            this.name_ = other.name_;
            this.onChanged();
        }
        if (other.hasSchemaName()) {
            this.bitField0_ |= 2;
            this.schemaName_ = other.schemaName_;
            this.onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.hasName();
    }

    public MysqlxExpr.Identifier.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxExpr.Identifier parsedMessage = null;
        try {
            parsedMessage = (MysqlxExpr.Identifier)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxExpr.Identifier)e.getUnfinishedMessage();
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

    public MysqlxExpr.Identifier.Builder setName(String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.name_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxExpr.Identifier.Builder clearName() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.name_ = MysqlxExpr.Identifier.getDefaultInstance().getName();
        this.onChanged();
        return this;
    }

    public MysqlxExpr.Identifier.Builder setNameBytes(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.name_ = value;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasSchemaName() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public String getSchemaName() {
        Object ref = this.schemaName_;
        if (!(ref instanceof String)) {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.schemaName_ = s;
            }
            return s;
        }
        return (String)ref;
    }

    @Override
    public ByteString getSchemaNameBytes() {
        Object ref = this.schemaName_;
        if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)((String)ref));
            this.schemaName_ = b;
            return b;
        }
        return (ByteString)ref;
    }

    public MysqlxExpr.Identifier.Builder setSchemaName(String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 2;
        this.schemaName_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxExpr.Identifier.Builder clearSchemaName() {
        this.bitField0_ &= 0xFFFFFFFD;
        this.schemaName_ = MysqlxExpr.Identifier.getDefaultInstance().getSchemaName();
        this.onChanged();
        return this;
    }

    public MysqlxExpr.Identifier.Builder setSchemaNameBytes(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 2;
        this.schemaName_ = value;
        this.onChanged();
        return this;
    }

    public final MysqlxExpr.Identifier.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxExpr.Identifier.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxExpr.Identifier.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxExpr.Identifier.Builder)super.mergeUnknownFields(unknownFields);
    }
}
