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

public static final class MysqlxNotice.GroupReplicationStateChanged
extends GeneratedMessageV3
implements MysqlxNotice.GroupReplicationStateChangedOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    public static final int VIEW_ID_FIELD_NUMBER = 2;
    private volatile Object viewId_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxNotice.GroupReplicationStateChanged DEFAULT_INSTANCE = new MysqlxNotice.GroupReplicationStateChanged();
    @Deprecated
    public static final Parser<MysqlxNotice.GroupReplicationStateChanged> PARSER = new AbstractParser<MysqlxNotice.GroupReplicationStateChanged>(){

        public MysqlxNotice.GroupReplicationStateChanged parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxNotice.GroupReplicationStateChanged(input, extensionRegistry);
        }
    };

    private MysqlxNotice.GroupReplicationStateChanged(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxNotice.GroupReplicationStateChanged() {
        this.viewId_ = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxNotice.GroupReplicationStateChanged();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxNotice.GroupReplicationStateChanged(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
        }
        boolean mutable_bitField0_ = false;
        UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
        try {
            boolean done = false;
            block11: while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0: {
                        done = true;
                        continue block11;
                    }
                    case 8: {
                        this.bitField0_ |= 1;
                        this.type_ = input.readUInt32();
                        continue block11;
                    }
                    case 18: {
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.viewId_ = bs;
                        continue block11;
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
        return internal_static_Mysqlx_Notice_GroupReplicationStateChanged_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Notice_GroupReplicationStateChanged_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxNotice.GroupReplicationStateChanged.class, Builder.class);
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
    public boolean hasViewId() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public String getViewId() {
        Object ref = this.viewId_;
        if (ref instanceof String) {
            return (String)ref;
        }
        ByteString bs = (ByteString)ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
            this.viewId_ = s;
        }
        return s;
    }

    @Override
    public ByteString getViewIdBytes() {
        Object ref = this.viewId_;
        if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)((String)ref));
            this.viewId_ = b;
            return b;
        }
        return (ByteString)ref;
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
            GeneratedMessageV3.writeString((CodedOutputStream)output, (int)2, (Object)this.viewId_);
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
            size += GeneratedMessageV3.computeStringSize((int)2, (Object)this.viewId_);
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxNotice.GroupReplicationStateChanged)) {
            return super.equals(obj);
        }
        MysqlxNotice.GroupReplicationStateChanged other = (MysqlxNotice.GroupReplicationStateChanged)obj;
        if (this.hasType() != other.hasType()) {
            return false;
        }
        if (this.hasType() && this.getType() != other.getType()) {
            return false;
        }
        if (this.hasViewId() != other.hasViewId()) {
            return false;
        }
        if (this.hasViewId() && !this.getViewId().equals(other.getViewId())) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxNotice.GroupReplicationStateChanged.getDescriptor().hashCode();
        if (this.hasType()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getType();
        }
        if (this.hasViewId()) {
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getViewId().hashCode();
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxNotice.GroupReplicationStateChanged parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxNotice.GroupReplicationStateChanged)PARSER.parseFrom(data);
    }

    public static MysqlxNotice.GroupReplicationStateChanged parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxNotice.GroupReplicationStateChanged)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxNotice.GroupReplicationStateChanged parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxNotice.GroupReplicationStateChanged)PARSER.parseFrom(data);
    }

    public static MysqlxNotice.GroupReplicationStateChanged parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxNotice.GroupReplicationStateChanged)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxNotice.GroupReplicationStateChanged parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxNotice.GroupReplicationStateChanged)PARSER.parseFrom(data);
    }

    public static MysqlxNotice.GroupReplicationStateChanged parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxNotice.GroupReplicationStateChanged)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxNotice.GroupReplicationStateChanged parseFrom(InputStream input) throws IOException {
        return (MysqlxNotice.GroupReplicationStateChanged)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxNotice.GroupReplicationStateChanged parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxNotice.GroupReplicationStateChanged)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxNotice.GroupReplicationStateChanged parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxNotice.GroupReplicationStateChanged)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxNotice.GroupReplicationStateChanged parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxNotice.GroupReplicationStateChanged)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxNotice.GroupReplicationStateChanged parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxNotice.GroupReplicationStateChanged)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxNotice.GroupReplicationStateChanged parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxNotice.GroupReplicationStateChanged)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxNotice.GroupReplicationStateChanged.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxNotice.GroupReplicationStateChanged prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxNotice.GroupReplicationStateChanged getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxNotice.GroupReplicationStateChanged> parser() {
        return PARSER;
    }

    public Parser<MysqlxNotice.GroupReplicationStateChanged> getParserForType() {
        return PARSER;
    }

    public MysqlxNotice.GroupReplicationStateChanged getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxNotice.GroupReplicationStateChangedOrBuilder {
        private int bitField0_;
        private int type_;
        private Object viewId_ = "";

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Notice_GroupReplicationStateChanged_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Notice_GroupReplicationStateChanged_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxNotice.GroupReplicationStateChanged.class, Builder.class);
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
            this.viewId_ = "";
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Notice_GroupReplicationStateChanged_descriptor;
        }

        public MysqlxNotice.GroupReplicationStateChanged getDefaultInstanceForType() {
            return MysqlxNotice.GroupReplicationStateChanged.getDefaultInstance();
        }

        public MysqlxNotice.GroupReplicationStateChanged build() {
            MysqlxNotice.GroupReplicationStateChanged result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxNotice.GroupReplicationStateChanged buildPartial() {
            MysqlxNotice.GroupReplicationStateChanged result = new MysqlxNotice.GroupReplicationStateChanged(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
                result.type_ = this.type_;
                to_bitField0_ |= 1;
            }
            if ((from_bitField0_ & 2) != 0) {
                to_bitField0_ |= 2;
            }
            result.viewId_ = this.viewId_;
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
            if (other instanceof MysqlxNotice.GroupReplicationStateChanged) {
                return this.mergeFrom((MysqlxNotice.GroupReplicationStateChanged)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxNotice.GroupReplicationStateChanged other) {
            if (other == MysqlxNotice.GroupReplicationStateChanged.getDefaultInstance()) {
                return this;
            }
            if (other.hasType()) {
                this.setType(other.getType());
            }
            if (other.hasViewId()) {
                this.bitField0_ |= 2;
                this.viewId_ = other.viewId_;
                this.onChanged();
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            return this.hasType();
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxNotice.GroupReplicationStateChanged parsedMessage = null;
            try {
                parsedMessage = (MysqlxNotice.GroupReplicationStateChanged)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxNotice.GroupReplicationStateChanged)e.getUnfinishedMessage();
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
        public boolean hasViewId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public String getViewId() {
            Object ref = this.viewId_;
            if (!(ref instanceof String)) {
                ByteString bs = (ByteString)ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    this.viewId_ = s;
                }
                return s;
            }
            return (String)ref;
        }

        @Override
        public ByteString getViewIdBytes() {
            Object ref = this.viewId_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String)((String)ref));
                this.viewId_ = b;
                return b;
            }
            return (ByteString)ref;
        }

        public Builder setViewId(String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 2;
            this.viewId_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearViewId() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.viewId_ = MysqlxNotice.GroupReplicationStateChanged.getDefaultInstance().getViewId();
            this.onChanged();
            return this;
        }

        public Builder setViewIdBytes(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 2;
            this.viewId_ = value;
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
        MEMBERSHIP_QUORUM_LOSS(1),
        MEMBERSHIP_VIEW_CHANGE(2),
        MEMBER_ROLE_CHANGE(3),
        MEMBER_STATE_CHANGE(4);

        public static final int MEMBERSHIP_QUORUM_LOSS_VALUE = 1;
        public static final int MEMBERSHIP_VIEW_CHANGE_VALUE = 2;
        public static final int MEMBER_ROLE_CHANGE_VALUE = 3;
        public static final int MEMBER_STATE_CHANGE_VALUE = 4;
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
                    return MEMBERSHIP_QUORUM_LOSS;
                }
                case 2: {
                    return MEMBERSHIP_VIEW_CHANGE;
                }
                case 3: {
                    return MEMBER_ROLE_CHANGE;
                }
                case 4: {
                    return MEMBER_STATE_CHANGE;
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
            return (Descriptors.EnumDescriptor)MysqlxNotice.GroupReplicationStateChanged.getDescriptor().getEnumTypes().get(0);
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
}
