/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractParser
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$EnumDescriptor
 *  com.google.protobuf.Descriptors$EnumValueDescriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.GeneratedMessageV3$UnusedPrivateParameter
 *  com.google.protobuf.Internal$EnumLiteMap
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  com.google.protobuf.ProtocolMessageEnum
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxNotice;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public static final class MysqlxNotice.Frame
extends GeneratedMessageV3
implements MysqlxNotice.FrameOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    public static final int SCOPE_FIELD_NUMBER = 2;
    private int scope_;
    public static final int PAYLOAD_FIELD_NUMBER = 3;
    private ByteString payload_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxNotice.Frame DEFAULT_INSTANCE = new MysqlxNotice.Frame();
    @Deprecated
    public static final Parser<MysqlxNotice.Frame> PARSER = new AbstractParser<MysqlxNotice.Frame>(){

        public MysqlxNotice.Frame parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxNotice.Frame(input, extensionRegistry);
        }
    };

    private MysqlxNotice.Frame(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxNotice.Frame() {
        this.scope_ = 1;
        this.payload_ = ByteString.EMPTY;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxNotice.Frame();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxNotice.Frame(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
        }
        boolean mutable_bitField0_ = false;
        UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
        try {
            boolean done = false;
            block12: while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0: {
                        done = true;
                        continue block12;
                    }
                    case 8: {
                        this.bitField0_ |= 1;
                        this.type_ = input.readUInt32();
                        continue block12;
                    }
                    case 16: {
                        int rawValue = input.readEnum();
                        Scope value = Scope.valueOf(rawValue);
                        if (value == null) {
                            unknownFields.mergeVarintField(2, rawValue);
                            continue block12;
                        }
                        this.bitField0_ |= 2;
                        this.scope_ = rawValue;
                        continue block12;
                    }
                    case 26: {
                        this.bitField0_ |= 4;
                        this.payload_ = input.readBytes();
                        continue block12;
                    }
                }
                if (this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) continue;
                done = true;
            }
        }
        catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException e) {
            throw new InvalidProtocolBufferException(e).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            this.unknownFields = unknownFields.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Notice_Frame_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Notice_Frame_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxNotice.Frame.class, Builder.class);
    }

    @Override
    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public int getType() {
        return this.type_;
    }

    @Override
    public boolean hasScope() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public Scope getScope() {
        Scope result = Scope.valueOf(this.scope_);
        return result == null ? Scope.GLOBAL : result;
    }

    @Override
    public boolean hasPayload() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override
    public ByteString getPayload() {
        return this.payload_;
    }

    public final boolean isInitialized() {
        byte isInitialized = this.memoizedIsInitialized;
        if (isInitialized == 1) {
            return true;
        }
        if (isInitialized == 0) {
            return false;
        }
        if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        if ((this.bitField0_ & 1) != 0) {
            output.writeUInt32(1, this.type_);
        }
        if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(2, this.scope_);
        }
        if ((this.bitField0_ & 4) != 0) {
            output.writeBytes(3, this.payload_);
        }
        this.unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
        int size = this.memoizedSize;
        if (size != -1) {
            return size;
        }
        size = 0;
        if ((this.bitField0_ & 1) != 0) {
            size += CodedOutputStream.computeUInt32Size((int)1, (int)this.type_);
        }
        if ((this.bitField0_ & 2) != 0) {
            size += CodedOutputStream.computeEnumSize((int)2, (int)this.scope_);
        }
        if ((this.bitField0_ & 4) != 0) {
            size += CodedOutputStream.computeBytesSize((int)3, (ByteString)this.payload_);
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxNotice.Frame)) {
            return super.equals(obj);
        }
        MysqlxNotice.Frame other = (MysqlxNotice.Frame)obj;
        if (this.hasType() != other.hasType()) {
            return false;
        }
        if (this.hasType() && this.getType() != other.getType()) {
            return false;
        }
        if (this.hasScope() != other.hasScope()) {
            return false;
        }
        if (this.hasScope() && this.scope_ != other.scope_) {
            return false;
        }
        if (this.hasPayload() != other.hasPayload()) {
            return false;
        }
        if (this.hasPayload() && !this.getPayload().equals((Object)other.getPayload())) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxNotice.Frame.getDescriptor().hashCode();
        if (this.hasType()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getType();
        }
        if (this.hasScope()) {
            hash = 37 * hash + 2;
            hash = 53 * hash + this.scope_;
        }
        if (this.hasPayload()) {
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getPayload().hashCode();
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxNotice.Frame parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxNotice.Frame)PARSER.parseFrom(data);
    }

    public static MysqlxNotice.Frame parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxNotice.Frame)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxNotice.Frame parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxNotice.Frame)PARSER.parseFrom(data);
    }

    public static MysqlxNotice.Frame parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxNotice.Frame)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxNotice.Frame parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxNotice.Frame)PARSER.parseFrom(data);
    }

    public static MysqlxNotice.Frame parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxNotice.Frame)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxNotice.Frame parseFrom(InputStream input) throws IOException {
        return (MysqlxNotice.Frame)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxNotice.Frame parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxNotice.Frame)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxNotice.Frame parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxNotice.Frame)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxNotice.Frame parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxNotice.Frame)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxNotice.Frame parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxNotice.Frame)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxNotice.Frame parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxNotice.Frame)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxNotice.Frame.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxNotice.Frame prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxNotice.Frame getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxNotice.Frame> parser() {
        return PARSER;
    }

    public Parser<MysqlxNotice.Frame> getParserForType() {
        return PARSER;
    }

    public MysqlxNotice.Frame getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxNotice.FrameOrBuilder {
        private int bitField0_;
        private int type_;
        private int scope_ = 1;
        private ByteString payload_ = ByteString.EMPTY;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Notice_Frame_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Notice_Frame_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxNotice.Frame.class, Builder.class);
        }

        private Builder() {
            this.maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (alwaysUseFieldBuilders) {
                // empty if block
            }
        }

        public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= 0xFFFFFFFE;
            this.scope_ = 1;
            this.bitField0_ &= 0xFFFFFFFD;
            this.payload_ = ByteString.EMPTY;
            this.bitField0_ &= 0xFFFFFFFB;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Notice_Frame_descriptor;
        }

        public MysqlxNotice.Frame getDefaultInstanceForType() {
            return MysqlxNotice.Frame.getDefaultInstance();
        }

        public MysqlxNotice.Frame build() {
            MysqlxNotice.Frame result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxNotice.Frame buildPartial() {
            MysqlxNotice.Frame result = new MysqlxNotice.Frame(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
                result.type_ = this.type_;
                to_bitField0_ |= 1;
            }
            if ((from_bitField0_ & 2) != 0) {
                to_bitField0_ |= 2;
            }
            result.scope_ = this.scope_;
            if ((from_bitField0_ & 4) != 0) {
                to_bitField0_ |= 4;
            }
            result.payload_ = this.payload_;
            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
        }

        public Builder clone() {
            return (Builder)super.clone();
        }

        public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
        }

        public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
        }

        public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
        }

        public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
        }

        public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
        }

        public Builder mergeFrom(Message other) {
            if (other instanceof MysqlxNotice.Frame) {
                return this.mergeFrom((MysqlxNotice.Frame)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxNotice.Frame other) {
            if (other == MysqlxNotice.Frame.getDefaultInstance()) {
                return this;
            }
            if (other.hasType()) {
                this.setType(other.getType());
            }
            if (other.hasScope()) {
                this.setScope(other.getScope());
            }
            if (other.hasPayload()) {
                this.setPayload(other.getPayload());
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            return this.hasType();
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxNotice.Frame parsedMessage = null;
            try {
                parsedMessage = (MysqlxNotice.Frame)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxNotice.Frame)e.getUnfinishedMessage();
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
        public int getType() {
            return this.type_;
        }

        public Builder setType(int value) {
            this.bitField0_ |= 1;
            this.type_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearType() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.type_ = 0;
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasScope() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public Scope getScope() {
            Scope result = Scope.valueOf(this.scope_);
            return result == null ? Scope.GLOBAL : result;
        }

        public Builder setScope(Scope value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 2;
            this.scope_ = value.getNumber();
            this.onChanged();
            return this;
        }

        public Builder clearScope() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.scope_ = 1;
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasPayload() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override
        public ByteString getPayload() {
            return this.payload_;
        }

        public Builder setPayload(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 4;
            this.payload_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearPayload() {
            this.bitField0_ &= 0xFFFFFFFB;
            this.payload_ = MysqlxNotice.Frame.getDefaultInstance().getPayload();
            this.onChanged();
            return this;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
        }
    }

    public static enum Type implements ProtocolMessageEnum
    {
        WARNING(1),
        SESSION_VARIABLE_CHANGED(2),
        SESSION_STATE_CHANGED(3),
        GROUP_REPLICATION_STATE_CHANGED(4),
        SERVER_HELLO(5);

        public static final int WARNING_VALUE = 1;
        public static final int SESSION_VARIABLE_CHANGED_VALUE = 2;
        public static final int SESSION_STATE_CHANGED_VALUE = 3;
        public static final int GROUP_REPLICATION_STATE_CHANGED_VALUE = 4;
        public static final int SERVER_HELLO_VALUE = 5;
        private static final Internal.EnumLiteMap<Type> internalValueMap;
        private static final Type[] VALUES;
        private final int value;

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static Type valueOf(int value) {
            return Type.forNumber(value);
        }

        public static Type forNumber(int value) {
            switch (value) {
                case 1: {
                    return WARNING;
                }
                case 2: {
                    return SESSION_VARIABLE_CHANGED;
                }
                case 3: {
                    return SESSION_STATE_CHANGED;
                }
                case 4: {
                    return GROUP_REPLICATION_STATE_CHANGED;
                }
                case 5: {
                    return SERVER_HELLO;
                }
            }
            return null;
        }

        public static Internal.EnumLiteMap<Type> internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return (Descriptors.EnumValueDescriptor)Type.getDescriptor().getValues().get(this.ordinal());
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return Type.getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return (Descriptors.EnumDescriptor)MysqlxNotice.Frame.getDescriptor().getEnumTypes().get(1);
        }

        public static Type valueOf(Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != Type.getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            return VALUES[desc.getIndex()];
        }

        private Type(int value) {
            this.value = value;
        }

        static {
            internalValueMap = new Internal.EnumLiteMap<Type>(){

                public Type findValueByNumber(int number) {
                    return Type.forNumber(number);
                }
            };
            VALUES = Type.values();
        }
    }

    public static enum Scope implements ProtocolMessageEnum
    {
        GLOBAL(1),
        LOCAL(2);

        public static final int GLOBAL_VALUE = 1;
        public static final int LOCAL_VALUE = 2;
        private static final Internal.EnumLiteMap<Scope> internalValueMap;
        private static final Scope[] VALUES;
        private final int value;

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static Scope valueOf(int value) {
            return Scope.forNumber(value);
        }

        public static Scope forNumber(int value) {
            switch (value) {
                case 1: {
                    return GLOBAL;
                }
                case 2: {
                    return LOCAL;
                }
            }
            return null;
        }

        public static Internal.EnumLiteMap<Scope> internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return (Descriptors.EnumValueDescriptor)Scope.getDescriptor().getValues().get(this.ordinal());
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return Scope.getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return (Descriptors.EnumDescriptor)MysqlxNotice.Frame.getDescriptor().getEnumTypes().get(0);
        }

        public static Scope valueOf(Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != Scope.getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            return VALUES[desc.getIndex()];
        }

        private Scope(int value) {
            this.value = value;
        }

        static {
            internalValueMap = new Internal.EnumLiteMap<Scope>(){

                public Scope findValueByNumber(int number) {
                    return Scope.forNumber(number);
                }
            };
            VALUES = Scope.values();
        }
    }
}
