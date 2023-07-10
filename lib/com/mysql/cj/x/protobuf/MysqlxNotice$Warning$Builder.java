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
import com.mysql.cj.x.protobuf.MysqlxNotice;
import java.io.IOException;

public static final class MysqlxNotice.Warning.Builder
extends GeneratedMessageV3.Builder<MysqlxNotice.Warning.Builder>
implements MysqlxNotice.WarningOrBuilder {
    private int bitField0_;
    private int level_ = 2;
    private int code_;
    private Object msg_ = "";

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Notice_Warning_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Notice_Warning_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxNotice.Warning.class, MysqlxNotice.Warning.Builder.class);
    }

    private MysqlxNotice.Warning.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxNotice.Warning.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public MysqlxNotice.Warning.Builder clear() {
        super.clear();
        this.level_ = 2;
        this.bitField0_ &= 0xFFFFFFFE;
        this.code_ = 0;
        this.bitField0_ &= 0xFFFFFFFD;
        this.msg_ = "";
        this.bitField0_ &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Notice_Warning_descriptor;
    }

    public MysqlxNotice.Warning getDefaultInstanceForType() {
        return MysqlxNotice.Warning.getDefaultInstance();
    }

    public MysqlxNotice.Warning build() {
        MysqlxNotice.Warning result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxNotice.Warning.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxNotice.Warning buildPartial() {
        MysqlxNotice.Warning result = new MysqlxNotice.Warning(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            to_bitField0_ |= 1;
        }
        result.level_ = this.level_;
        if ((from_bitField0_ & 2) != 0) {
            result.code_ = this.code_;
            to_bitField0_ |= 2;
        }
        if ((from_bitField0_ & 4) != 0) {
            to_bitField0_ |= 4;
        }
        result.msg_ = this.msg_;
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxNotice.Warning.Builder clone() {
        return (MysqlxNotice.Warning.Builder)super.clone();
    }

    public MysqlxNotice.Warning.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxNotice.Warning.Builder)super.setField(field, value);
    }

    public MysqlxNotice.Warning.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxNotice.Warning.Builder)super.clearField(field);
    }

    public MysqlxNotice.Warning.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxNotice.Warning.Builder)super.clearOneof(oneof);
    }

    public MysqlxNotice.Warning.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxNotice.Warning.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxNotice.Warning.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxNotice.Warning.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxNotice.Warning.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxNotice.Warning) {
            return this.mergeFrom((MysqlxNotice.Warning)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxNotice.Warning.Builder mergeFrom(MysqlxNotice.Warning other) {
        if (other == MysqlxNotice.Warning.getDefaultInstance()) {
            return this;
        }
        if (other.hasLevel()) {
            this.setLevel(other.getLevel());
        }
        if (other.hasCode()) {
            this.setCode(other.getCode());
        }
        if (other.hasMsg()) {
            this.bitField0_ |= 4;
            this.msg_ = other.msg_;
            this.onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.hasCode()) {
            return false;
        }
        return this.hasMsg();
    }

    public MysqlxNotice.Warning.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxNotice.Warning parsedMessage = null;
        try {
            parsedMessage = (MysqlxNotice.Warning)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxNotice.Warning)e.getUnfinishedMessage();
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
    public boolean hasLevel() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public MysqlxNotice.Warning.Level getLevel() {
        MysqlxNotice.Warning.Level result = MysqlxNotice.Warning.Level.valueOf(this.level_);
        return result == null ? MysqlxNotice.Warning.Level.WARNING : result;
    }

    public MysqlxNotice.Warning.Builder setLevel(MysqlxNotice.Warning.Level value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.level_ = value.getNumber();
        this.onChanged();
        return this;
    }

    public MysqlxNotice.Warning.Builder clearLevel() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.level_ = 2;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasCode() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public int getCode() {
        return this.code_;
    }

    public MysqlxNotice.Warning.Builder setCode(int value) {
        this.bitField0_ |= 2;
        this.code_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxNotice.Warning.Builder clearCode() {
        this.bitField0_ &= 0xFFFFFFFD;
        this.code_ = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasMsg() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override
    public String getMsg() {
        Object ref = this.msg_;
        if (!(ref instanceof String)) {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.msg_ = s;
            }
            return s;
        }
        return (String)ref;
    }

    @Override
    public ByteString getMsgBytes() {
        Object ref = this.msg_;
        if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)((String)ref));
            this.msg_ = b;
            return b;
        }
        return (ByteString)ref;
    }

    public MysqlxNotice.Warning.Builder setMsg(String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 4;
        this.msg_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxNotice.Warning.Builder clearMsg() {
        this.bitField0_ &= 0xFFFFFFFB;
        this.msg_ = MysqlxNotice.Warning.getDefaultInstance().getMsg();
        this.onChanged();
        return this;
    }

    public MysqlxNotice.Warning.Builder setMsgBytes(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 4;
        this.msg_ = value;
        this.onChanged();
        return this;
    }

    public final MysqlxNotice.Warning.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxNotice.Warning.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxNotice.Warning.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxNotice.Warning.Builder)super.mergeUnknownFields(unknownFields);
    }
}
