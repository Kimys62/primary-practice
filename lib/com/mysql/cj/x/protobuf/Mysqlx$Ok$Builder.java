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

public static final class Mysqlx.Ok.Builder
extends GeneratedMessageV3.Builder<Mysqlx.Ok.Builder>
implements Mysqlx.OkOrBuilder {
    private int bitField0_;
    private Object msg_ = "";

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Ok_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Ok_fieldAccessorTable.ensureFieldAccessorsInitialized(Mysqlx.Ok.class, Mysqlx.Ok.Builder.class);
    }

    private Mysqlx.Ok.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private Mysqlx.Ok.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public Mysqlx.Ok.Builder clear() {
        super.clear();
        this.msg_ = "";
        this.bitField0_ &= 0xFFFFFFFE;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Ok_descriptor;
    }

    public Mysqlx.Ok getDefaultInstanceForType() {
        return Mysqlx.Ok.getDefaultInstance();
    }

    public Mysqlx.Ok build() {
        Mysqlx.Ok result = this.buildPartial();
        if (!result.isInitialized()) {
            throw Mysqlx.Ok.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public Mysqlx.Ok buildPartial() {
        Mysqlx.Ok result = new Mysqlx.Ok(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            to_bitField0_ |= 1;
        }
        result.msg_ = this.msg_;
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public Mysqlx.Ok.Builder clone() {
        return (Mysqlx.Ok.Builder)super.clone();
    }

    public Mysqlx.Ok.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (Mysqlx.Ok.Builder)super.setField(field, value);
    }

    public Mysqlx.Ok.Builder clearField(Descriptors.FieldDescriptor field) {
        return (Mysqlx.Ok.Builder)super.clearField(field);
    }

    public Mysqlx.Ok.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (Mysqlx.Ok.Builder)super.clearOneof(oneof);
    }

    public Mysqlx.Ok.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (Mysqlx.Ok.Builder)super.setRepeatedField(field, index, value);
    }

    public Mysqlx.Ok.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (Mysqlx.Ok.Builder)super.addRepeatedField(field, value);
    }

    public Mysqlx.Ok.Builder mergeFrom(Message other) {
        if (other instanceof Mysqlx.Ok) {
            return this.mergeFrom((Mysqlx.Ok)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public Mysqlx.Ok.Builder mergeFrom(Mysqlx.Ok other) {
        if (other == Mysqlx.Ok.getDefaultInstance()) {
            return this;
        }
        if (other.hasMsg()) {
            this.bitField0_ |= 1;
            this.msg_ = other.msg_;
            this.onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public Mysqlx.Ok.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        Mysqlx.Ok parsedMessage = null;
        try {
            parsedMessage = (Mysqlx.Ok)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (Mysqlx.Ok)e.getUnfinishedMessage();
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
    public boolean hasMsg() {
        return (this.bitField0_ & 1) != 0;
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

    public Mysqlx.Ok.Builder setMsg(String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.msg_ = value;
        this.onChanged();
        return this;
    }

    public Mysqlx.Ok.Builder clearMsg() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.msg_ = Mysqlx.Ok.getDefaultInstance().getMsg();
        this.onChanged();
        return this;
    }

    public Mysqlx.Ok.Builder setMsgBytes(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.msg_ = value;
        this.onChanged();
        return this;
    }

    public final Mysqlx.Ok.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (Mysqlx.Ok.Builder)super.setUnknownFields(unknownFields);
    }

    public final Mysqlx.Ok.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (Mysqlx.Ok.Builder)super.mergeUnknownFields(unknownFields);
    }
}
