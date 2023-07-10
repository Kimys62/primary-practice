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
import com.mysql.cj.x.protobuf.Mysqlx;
import java.io.IOException;

public static final class Mysqlx.Error.Builder
extends GeneratedMessageV3.Builder<Mysqlx.Error.Builder>
implements Mysqlx.ErrorOrBuilder {
    private int bitField0_;
    private int severity_ = 0;
    private int code_;
    private Object sqlState_ = "";
    private Object msg_ = "";

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Error_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Error_fieldAccessorTable.ensureFieldAccessorsInitialized(Mysqlx.Error.class, Mysqlx.Error.Builder.class);
    }

    private Mysqlx.Error.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private Mysqlx.Error.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public Mysqlx.Error.Builder clear() {
        super.clear();
        this.severity_ = 0;
        this.bitField0_ &= 0xFFFFFFFE;
        this.code_ = 0;
        this.bitField0_ &= 0xFFFFFFFD;
        this.sqlState_ = "";
        this.bitField0_ &= 0xFFFFFFFB;
        this.msg_ = "";
        this.bitField0_ &= 0xFFFFFFF7;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Error_descriptor;
    }

    public Mysqlx.Error getDefaultInstanceForType() {
        return Mysqlx.Error.getDefaultInstance();
    }

    public Mysqlx.Error build() {
        Mysqlx.Error result = this.buildPartial();
        if (!result.isInitialized()) {
            throw Mysqlx.Error.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public Mysqlx.Error buildPartial() {
        Mysqlx.Error result = new Mysqlx.Error(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            to_bitField0_ |= 1;
        }
        result.severity_ = this.severity_;
        if ((from_bitField0_ & 2) != 0) {
            result.code_ = this.code_;
            to_bitField0_ |= 2;
        }
        if ((from_bitField0_ & 4) != 0) {
            to_bitField0_ |= 4;
        }
        result.sqlState_ = this.sqlState_;
        if ((from_bitField0_ & 8) != 0) {
            to_bitField0_ |= 8;
        }
        result.msg_ = this.msg_;
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public Mysqlx.Error.Builder clone() {
        return (Mysqlx.Error.Builder)super.clone();
    }

    public Mysqlx.Error.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (Mysqlx.Error.Builder)super.setField(field, value);
    }

    public Mysqlx.Error.Builder clearField(Descriptors.FieldDescriptor field) {
        return (Mysqlx.Error.Builder)super.clearField(field);
    }

    public Mysqlx.Error.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (Mysqlx.Error.Builder)super.clearOneof(oneof);
    }

    public Mysqlx.Error.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (Mysqlx.Error.Builder)super.setRepeatedField(field, index, value);
    }

    public Mysqlx.Error.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (Mysqlx.Error.Builder)super.addRepeatedField(field, value);
    }

    public Mysqlx.Error.Builder mergeFrom(Message other) {
        if (other instanceof Mysqlx.Error) {
            return this.mergeFrom((Mysqlx.Error)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public Mysqlx.Error.Builder mergeFrom(Mysqlx.Error other) {
        if (other == Mysqlx.Error.getDefaultInstance()) {
            return this;
        }
        if (other.hasSeverity()) {
            this.setSeverity(other.getSeverity());
        }
        if (other.hasCode()) {
            this.setCode(other.getCode());
        }
        if (other.hasSqlState()) {
            this.bitField0_ |= 4;
            this.sqlState_ = other.sqlState_;
            this.onChanged();
        }
        if (other.hasMsg()) {
            this.bitField0_ |= 8;
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
        if (!this.hasSqlState()) {
            return false;
        }
        return this.hasMsg();
    }

    public Mysqlx.Error.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        Mysqlx.Error parsedMessage = null;
        try {
            parsedMessage = (Mysqlx.Error)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (Mysqlx.Error)e.getUnfinishedMessage();
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
    public boolean hasSeverity() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public Mysqlx.Error.Severity getSeverity() {
        Mysqlx.Error.Severity result = Mysqlx.Error.Severity.valueOf(this.severity_);
        return result == null ? Mysqlx.Error.Severity.ERROR : result;
    }

    public Mysqlx.Error.Builder setSeverity(Mysqlx.Error.Severity value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.severity_ = value.getNumber();
        this.onChanged();
        return this;
    }

    public Mysqlx.Error.Builder clearSeverity() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.severity_ = 0;
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

    public Mysqlx.Error.Builder setCode(int value) {
        this.bitField0_ |= 2;
        this.code_ = value;
        this.onChanged();
        return this;
    }

    public Mysqlx.Error.Builder clearCode() {
        this.bitField0_ &= 0xFFFFFFFD;
        this.code_ = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasSqlState() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override
    public String getSqlState() {
        Object ref = this.sqlState_;
        if (!(ref instanceof String)) {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.sqlState_ = s;
            }
            return s;
        }
        return (String)ref;
    }

    @Override
    public ByteString getSqlStateBytes() {
        Object ref = this.sqlState_;
        if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)((String)ref));
            this.sqlState_ = b;
            return b;
        }
        return (ByteString)ref;
    }

    public Mysqlx.Error.Builder setSqlState(String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 4;
        this.sqlState_ = value;
        this.onChanged();
        return this;
    }

    public Mysqlx.Error.Builder clearSqlState() {
        this.bitField0_ &= 0xFFFFFFFB;
        this.sqlState_ = Mysqlx.Error.getDefaultInstance().getSqlState();
        this.onChanged();
        return this;
    }

    public Mysqlx.Error.Builder setSqlStateBytes(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 4;
        this.sqlState_ = value;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasMsg() {
        return (this.bitField0_ & 8) != 0;
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

    public Mysqlx.Error.Builder setMsg(String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 8;
        this.msg_ = value;
        this.onChanged();
        return this;
    }

    public Mysqlx.Error.Builder clearMsg() {
        this.bitField0_ &= 0xFFFFFFF7;
        this.msg_ = Mysqlx.Error.getDefaultInstance().getMsg();
        this.onChanged();
        return this;
    }

    public Mysqlx.Error.Builder setMsgBytes(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 8;
        this.msg_ = value;
        this.onChanged();
        return this;
    }

    public final Mysqlx.Error.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (Mysqlx.Error.Builder)super.setUnknownFields(unknownFields);
    }

    public final Mysqlx.Error.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (Mysqlx.Error.Builder)super.mergeUnknownFields(unknownFields);
    }
}
