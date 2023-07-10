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
import com.mysql.cj.x.protobuf.MysqlxResultset;
import java.io.IOException;

public static final class MysqlxResultset.ColumnMetaData.Builder
extends GeneratedMessageV3.Builder<MysqlxResultset.ColumnMetaData.Builder>
implements MysqlxResultset.ColumnMetaDataOrBuilder {
    private int bitField0_;
    private int type_ = 1;
    private ByteString name_ = ByteString.EMPTY;
    private ByteString originalName_ = ByteString.EMPTY;
    private ByteString table_ = ByteString.EMPTY;
    private ByteString originalTable_ = ByteString.EMPTY;
    private ByteString schema_ = ByteString.EMPTY;
    private ByteString catalog_ = ByteString.EMPTY;
    private long collation_;
    private int fractionalDigits_;
    private int length_;
    private int flags_;
    private int contentType_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Resultset_ColumnMetaData_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Resultset_ColumnMetaData_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxResultset.ColumnMetaData.class, MysqlxResultset.ColumnMetaData.Builder.class);
    }

    private MysqlxResultset.ColumnMetaData.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxResultset.ColumnMetaData.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public MysqlxResultset.ColumnMetaData.Builder clear() {
        super.clear();
        this.type_ = 1;
        this.bitField0_ &= 0xFFFFFFFE;
        this.name_ = ByteString.EMPTY;
        this.bitField0_ &= 0xFFFFFFFD;
        this.originalName_ = ByteString.EMPTY;
        this.bitField0_ &= 0xFFFFFFFB;
        this.table_ = ByteString.EMPTY;
        this.bitField0_ &= 0xFFFFFFF7;
        this.originalTable_ = ByteString.EMPTY;
        this.bitField0_ &= 0xFFFFFFEF;
        this.schema_ = ByteString.EMPTY;
        this.bitField0_ &= 0xFFFFFFDF;
        this.catalog_ = ByteString.EMPTY;
        this.bitField0_ &= 0xFFFFFFBF;
        this.collation_ = 0L;
        this.bitField0_ &= 0xFFFFFF7F;
        this.fractionalDigits_ = 0;
        this.bitField0_ &= 0xFFFFFEFF;
        this.length_ = 0;
        this.bitField0_ &= 0xFFFFFDFF;
        this.flags_ = 0;
        this.bitField0_ &= 0xFFFFFBFF;
        this.contentType_ = 0;
        this.bitField0_ &= 0xFFFFF7FF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Resultset_ColumnMetaData_descriptor;
    }

    public MysqlxResultset.ColumnMetaData getDefaultInstanceForType() {
        return MysqlxResultset.ColumnMetaData.getDefaultInstance();
    }

    public MysqlxResultset.ColumnMetaData build() {
        MysqlxResultset.ColumnMetaData result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxResultset.ColumnMetaData.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxResultset.ColumnMetaData buildPartial() {
        MysqlxResultset.ColumnMetaData result = new MysqlxResultset.ColumnMetaData(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            to_bitField0_ |= 1;
        }
        result.type_ = this.type_;
        if ((from_bitField0_ & 2) != 0) {
            to_bitField0_ |= 2;
        }
        result.name_ = this.name_;
        if ((from_bitField0_ & 4) != 0) {
            to_bitField0_ |= 4;
        }
        result.originalName_ = this.originalName_;
        if ((from_bitField0_ & 8) != 0) {
            to_bitField0_ |= 8;
        }
        result.table_ = this.table_;
        if ((from_bitField0_ & 0x10) != 0) {
            to_bitField0_ |= 0x10;
        }
        result.originalTable_ = this.originalTable_;
        if ((from_bitField0_ & 0x20) != 0) {
            to_bitField0_ |= 0x20;
        }
        result.schema_ = this.schema_;
        if ((from_bitField0_ & 0x40) != 0) {
            to_bitField0_ |= 0x40;
        }
        result.catalog_ = this.catalog_;
        if ((from_bitField0_ & 0x80) != 0) {
            result.collation_ = this.collation_;
            to_bitField0_ |= 0x80;
        }
        if ((from_bitField0_ & 0x100) != 0) {
            result.fractionalDigits_ = this.fractionalDigits_;
            to_bitField0_ |= 0x100;
        }
        if ((from_bitField0_ & 0x200) != 0) {
            result.length_ = this.length_;
            to_bitField0_ |= 0x200;
        }
        if ((from_bitField0_ & 0x400) != 0) {
            result.flags_ = this.flags_;
            to_bitField0_ |= 0x400;
        }
        if ((from_bitField0_ & 0x800) != 0) {
            result.contentType_ = this.contentType_;
            to_bitField0_ |= 0x800;
        }
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxResultset.ColumnMetaData.Builder clone() {
        return (MysqlxResultset.ColumnMetaData.Builder)super.clone();
    }

    public MysqlxResultset.ColumnMetaData.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxResultset.ColumnMetaData.Builder)super.setField(field, value);
    }

    public MysqlxResultset.ColumnMetaData.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxResultset.ColumnMetaData.Builder)super.clearField(field);
    }

    public MysqlxResultset.ColumnMetaData.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxResultset.ColumnMetaData.Builder)super.clearOneof(oneof);
    }

    public MysqlxResultset.ColumnMetaData.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxResultset.ColumnMetaData.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxResultset.ColumnMetaData.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxResultset.ColumnMetaData.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxResultset.ColumnMetaData.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxResultset.ColumnMetaData) {
            return this.mergeFrom((MysqlxResultset.ColumnMetaData)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxResultset.ColumnMetaData.Builder mergeFrom(MysqlxResultset.ColumnMetaData other) {
        if (other == MysqlxResultset.ColumnMetaData.getDefaultInstance()) {
            return this;
        }
        if (other.hasType()) {
            this.setType(other.getType());
        }
        if (other.hasName()) {
            this.setName(other.getName());
        }
        if (other.hasOriginalName()) {
            this.setOriginalName(other.getOriginalName());
        }
        if (other.hasTable()) {
            this.setTable(other.getTable());
        }
        if (other.hasOriginalTable()) {
            this.setOriginalTable(other.getOriginalTable());
        }
        if (other.hasSchema()) {
            this.setSchema(other.getSchema());
        }
        if (other.hasCatalog()) {
            this.setCatalog(other.getCatalog());
        }
        if (other.hasCollation()) {
            this.setCollation(other.getCollation());
        }
        if (other.hasFractionalDigits()) {
            this.setFractionalDigits(other.getFractionalDigits());
        }
        if (other.hasLength()) {
            this.setLength(other.getLength());
        }
        if (other.hasFlags()) {
            this.setFlags(other.getFlags());
        }
        if (other.hasContentType()) {
            this.setContentType(other.getContentType());
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.hasType();
    }

    public MysqlxResultset.ColumnMetaData.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxResultset.ColumnMetaData parsedMessage = null;
        try {
            parsedMessage = (MysqlxResultset.ColumnMetaData)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxResultset.ColumnMetaData)e.getUnfinishedMessage();
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
    public MysqlxResultset.ColumnMetaData.FieldType getType() {
        MysqlxResultset.ColumnMetaData.FieldType result = MysqlxResultset.ColumnMetaData.FieldType.valueOf(this.type_);
        return result == null ? MysqlxResultset.ColumnMetaData.FieldType.SINT : result;
    }

    public MysqlxResultset.ColumnMetaData.Builder setType(MysqlxResultset.ColumnMetaData.FieldType value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.type_ = value.getNumber();
        this.onChanged();
        return this;
    }

    public MysqlxResultset.ColumnMetaData.Builder clearType() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.type_ = 1;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasName() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public ByteString getName() {
        return this.name_;
    }

    public MysqlxResultset.ColumnMetaData.Builder setName(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 2;
        this.name_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxResultset.ColumnMetaData.Builder clearName() {
        this.bitField0_ &= 0xFFFFFFFD;
        this.name_ = MysqlxResultset.ColumnMetaData.getDefaultInstance().getName();
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasOriginalName() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override
    public ByteString getOriginalName() {
        return this.originalName_;
    }

    public MysqlxResultset.ColumnMetaData.Builder setOriginalName(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 4;
        this.originalName_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxResultset.ColumnMetaData.Builder clearOriginalName() {
        this.bitField0_ &= 0xFFFFFFFB;
        this.originalName_ = MysqlxResultset.ColumnMetaData.getDefaultInstance().getOriginalName();
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasTable() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override
    public ByteString getTable() {
        return this.table_;
    }

    public MysqlxResultset.ColumnMetaData.Builder setTable(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 8;
        this.table_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxResultset.ColumnMetaData.Builder clearTable() {
        this.bitField0_ &= 0xFFFFFFF7;
        this.table_ = MysqlxResultset.ColumnMetaData.getDefaultInstance().getTable();
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasOriginalTable() {
        return (this.bitField0_ & 0x10) != 0;
    }

    @Override
    public ByteString getOriginalTable() {
        return this.originalTable_;
    }

    public MysqlxResultset.ColumnMetaData.Builder setOriginalTable(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 0x10;
        this.originalTable_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxResultset.ColumnMetaData.Builder clearOriginalTable() {
        this.bitField0_ &= 0xFFFFFFEF;
        this.originalTable_ = MysqlxResultset.ColumnMetaData.getDefaultInstance().getOriginalTable();
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasSchema() {
        return (this.bitField0_ & 0x20) != 0;
    }

    @Override
    public ByteString getSchema() {
        return this.schema_;
    }

    public MysqlxResultset.ColumnMetaData.Builder setSchema(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 0x20;
        this.schema_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxResultset.ColumnMetaData.Builder clearSchema() {
        this.bitField0_ &= 0xFFFFFFDF;
        this.schema_ = MysqlxResultset.ColumnMetaData.getDefaultInstance().getSchema();
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasCatalog() {
        return (this.bitField0_ & 0x40) != 0;
    }

    @Override
    public ByteString getCatalog() {
        return this.catalog_;
    }

    public MysqlxResultset.ColumnMetaData.Builder setCatalog(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 0x40;
        this.catalog_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxResultset.ColumnMetaData.Builder clearCatalog() {
        this.bitField0_ &= 0xFFFFFFBF;
        this.catalog_ = MysqlxResultset.ColumnMetaData.getDefaultInstance().getCatalog();
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasCollation() {
        return (this.bitField0_ & 0x80) != 0;
    }

    @Override
    public long getCollation() {
        return this.collation_;
    }

    public MysqlxResultset.ColumnMetaData.Builder setCollation(long value) {
        this.bitField0_ |= 0x80;
        this.collation_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxResultset.ColumnMetaData.Builder clearCollation() {
        this.bitField0_ &= 0xFFFFFF7F;
        this.collation_ = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasFractionalDigits() {
        return (this.bitField0_ & 0x100) != 0;
    }

    @Override
    public int getFractionalDigits() {
        return this.fractionalDigits_;
    }

    public MysqlxResultset.ColumnMetaData.Builder setFractionalDigits(int value) {
        this.bitField0_ |= 0x100;
        this.fractionalDigits_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxResultset.ColumnMetaData.Builder clearFractionalDigits() {
        this.bitField0_ &= 0xFFFFFEFF;
        this.fractionalDigits_ = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasLength() {
        return (this.bitField0_ & 0x200) != 0;
    }

    @Override
    public int getLength() {
        return this.length_;
    }

    public MysqlxResultset.ColumnMetaData.Builder setLength(int value) {
        this.bitField0_ |= 0x200;
        this.length_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxResultset.ColumnMetaData.Builder clearLength() {
        this.bitField0_ &= 0xFFFFFDFF;
        this.length_ = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasFlags() {
        return (this.bitField0_ & 0x400) != 0;
    }

    @Override
    public int getFlags() {
        return this.flags_;
    }

    public MysqlxResultset.ColumnMetaData.Builder setFlags(int value) {
        this.bitField0_ |= 0x400;
        this.flags_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxResultset.ColumnMetaData.Builder clearFlags() {
        this.bitField0_ &= 0xFFFFFBFF;
        this.flags_ = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasContentType() {
        return (this.bitField0_ & 0x800) != 0;
    }

    @Override
    public int getContentType() {
        return this.contentType_;
    }

    public MysqlxResultset.ColumnMetaData.Builder setContentType(int value) {
        this.bitField0_ |= 0x800;
        this.contentType_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxResultset.ColumnMetaData.Builder clearContentType() {
        this.bitField0_ &= 0xFFFFF7FF;
        this.contentType_ = 0;
        this.onChanged();
        return this;
    }

    public final MysqlxResultset.ColumnMetaData.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxResultset.ColumnMetaData.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxResultset.ColumnMetaData.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxResultset.ColumnMetaData.Builder)super.mergeUnknownFields(unknownFields);
    }
}
