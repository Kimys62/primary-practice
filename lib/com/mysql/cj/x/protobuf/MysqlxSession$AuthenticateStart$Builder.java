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
import com.mysql.cj.x.protobuf.MysqlxSession;
import java.io.IOException;

public static final class MysqlxSession.AuthenticateStart.Builder
extends GeneratedMessageV3.Builder<MysqlxSession.AuthenticateStart.Builder>
implements MysqlxSession.AuthenticateStartOrBuilder {
    private int bitField0_;
    private Object mechName_ = "";
    private ByteString authData_ = ByteString.EMPTY;
    private ByteString initialResponse_ = ByteString.EMPTY;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Session_AuthenticateStart_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Session_AuthenticateStart_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxSession.AuthenticateStart.class, MysqlxSession.AuthenticateStart.Builder.class);
    }

    private MysqlxSession.AuthenticateStart.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxSession.AuthenticateStart.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            // empty if block
        }
    }

    public MysqlxSession.AuthenticateStart.Builder clear() {
        super.clear();
        this.mechName_ = "";
        this.bitField0_ &= 0xFFFFFFFE;
        this.authData_ = ByteString.EMPTY;
        this.bitField0_ &= 0xFFFFFFFD;
        this.initialResponse_ = ByteString.EMPTY;
        this.bitField0_ &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Session_AuthenticateStart_descriptor;
    }

    public MysqlxSession.AuthenticateStart getDefaultInstanceForType() {
        return MysqlxSession.AuthenticateStart.getDefaultInstance();
    }

    public MysqlxSession.AuthenticateStart build() {
        MysqlxSession.AuthenticateStart result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxSession.AuthenticateStart.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxSession.AuthenticateStart buildPartial() {
        MysqlxSession.AuthenticateStart result = new MysqlxSession.AuthenticateStart(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            to_bitField0_ |= 1;
        }
        result.mechName_ = this.mechName_;
        if ((from_bitField0_ & 2) != 0) {
            to_bitField0_ |= 2;
        }
        result.authData_ = this.authData_;
        if ((from_bitField0_ & 4) != 0) {
            to_bitField0_ |= 4;
        }
        result.initialResponse_ = this.initialResponse_;
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxSession.AuthenticateStart.Builder clone() {
        return (MysqlxSession.AuthenticateStart.Builder)super.clone();
    }

    public MysqlxSession.AuthenticateStart.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxSession.AuthenticateStart.Builder)super.setField(field, value);
    }

    public MysqlxSession.AuthenticateStart.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxSession.AuthenticateStart.Builder)super.clearField(field);
    }

    public MysqlxSession.AuthenticateStart.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxSession.AuthenticateStart.Builder)super.clearOneof(oneof);
    }

    public MysqlxSession.AuthenticateStart.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxSession.AuthenticateStart.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxSession.AuthenticateStart.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxSession.AuthenticateStart.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxSession.AuthenticateStart.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxSession.AuthenticateStart) {
            return this.mergeFrom((MysqlxSession.AuthenticateStart)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxSession.AuthenticateStart.Builder mergeFrom(MysqlxSession.AuthenticateStart other) {
        if (other == MysqlxSession.AuthenticateStart.getDefaultInstance()) {
            return this;
        }
        if (other.hasMechName()) {
            this.bitField0_ |= 1;
            this.mechName_ = other.mechName_;
            this.onChanged();
        }
        if (other.hasAuthData()) {
            this.setAuthData(other.getAuthData());
        }
        if (other.hasInitialResponse()) {
            this.setInitialResponse(other.getInitialResponse());
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.hasMechName();
    }

    public MysqlxSession.AuthenticateStart.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxSession.AuthenticateStart parsedMessage = null;
        try {
            parsedMessage = (MysqlxSession.AuthenticateStart)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxSession.AuthenticateStart)e.getUnfinishedMessage();
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
    public boolean hasMechName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public String getMechName() {
        Object ref = this.mechName_;
        if (!(ref instanceof String)) {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.mechName_ = s;
            }
            return s;
        }
        return (String)ref;
    }

    @Override
    public ByteString getMechNameBytes() {
        Object ref = this.mechName_;
        if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)((String)ref));
            this.mechName_ = b;
            return b;
        }
        return (ByteString)ref;
    }

    public MysqlxSession.AuthenticateStart.Builder setMechName(String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.mechName_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxSession.AuthenticateStart.Builder clearMechName() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.mechName_ = MysqlxSession.AuthenticateStart.getDefaultInstance().getMechName();
        this.onChanged();
        return this;
    }

    public MysqlxSession.AuthenticateStart.Builder setMechNameBytes(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.mechName_ = value;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasAuthData() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public ByteString getAuthData() {
        return this.authData_;
    }

    public MysqlxSession.AuthenticateStart.Builder setAuthData(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 2;
        this.authData_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxSession.AuthenticateStart.Builder clearAuthData() {
        this.bitField0_ &= 0xFFFFFFFD;
        this.authData_ = MysqlxSession.AuthenticateStart.getDefaultInstance().getAuthData();
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasInitialResponse() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override
    public ByteString getInitialResponse() {
        return this.initialResponse_;
    }

    public MysqlxSession.AuthenticateStart.Builder setInitialResponse(ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 4;
        this.initialResponse_ = value;
        this.onChanged();
        return this;
    }

    public MysqlxSession.AuthenticateStart.Builder clearInitialResponse() {
        this.bitField0_ &= 0xFFFFFFFB;
        this.initialResponse_ = MysqlxSession.AuthenticateStart.getDefaultInstance().getInitialResponse();
        this.onChanged();
        return this;
    }

    public final MysqlxSession.AuthenticateStart.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxSession.AuthenticateStart.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxSession.AuthenticateStart.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxSession.AuthenticateStart.Builder)super.mergeUnknownFields(unknownFields);
    }
}
