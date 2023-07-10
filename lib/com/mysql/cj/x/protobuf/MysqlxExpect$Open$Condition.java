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
import com.mysql.cj.x.protobuf.MysqlxExpect;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public static final class MysqlxExpect.Open.Condition
extends GeneratedMessageV3
implements MysqlxExpect.Open.ConditionOrBuilder {
    private static final long serialVersionUID = 0L;
    private int bitField0_;
    public static final int CONDITION_KEY_FIELD_NUMBER = 1;
    private int conditionKey_;
    public static final int CONDITION_VALUE_FIELD_NUMBER = 2;
    private ByteString conditionValue_;
    public static final int OP_FIELD_NUMBER = 3;
    private int op_;
    private byte memoizedIsInitialized = (byte)-1;
    private static final MysqlxExpect.Open.Condition DEFAULT_INSTANCE = new MysqlxExpect.Open.Condition();
    @Deprecated
    public static final Parser<MysqlxExpect.Open.Condition> PARSER = new AbstractParser<MysqlxExpect.Open.Condition>(){

        public MysqlxExpect.Open.Condition parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MysqlxExpect.Open.Condition(input, extensionRegistry);
        }
    };

    private MysqlxExpect.Open.Condition(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private MysqlxExpect.Open.Condition() {
        this.conditionValue_ = ByteString.EMPTY;
        this.op_ = 0;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new MysqlxExpect.Open.Condition();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private MysqlxExpect.Open.Condition(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.conditionKey_ = input.readUInt32();
                        continue block12;
                    }
                    case 18: {
                        this.bitField0_ |= 2;
                        this.conditionValue_ = input.readBytes();
                        continue block12;
                    }
                    case 24: {
                        int rawValue = input.readEnum();
                        ConditionOperation value = ConditionOperation.valueOf(rawValue);
                        if (value == null) {
                            unknownFields.mergeVarintField(3, rawValue);
                            continue block12;
                        }
                        this.bitField0_ |= 4;
                        this.op_ = rawValue;
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
        return internal_static_Mysqlx_Expect_Open_Condition_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Expect_Open_Condition_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxExpect.Open.Condition.class, Builder.class);
    }

    @Override
    public boolean hasConditionKey() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override
    public int getConditionKey() {
        return this.conditionKey_;
    }

    @Override
    public boolean hasConditionValue() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public ByteString getConditionValue() {
        return this.conditionValue_;
    }

    @Override
    public boolean hasOp() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override
    public ConditionOperation getOp() {
        ConditionOperation result = ConditionOperation.valueOf(this.op_);
        return result == null ? ConditionOperation.EXPECT_OP_SET : result;
    }

    public final boolean isInitialized() {
        byte isInitialized = this.memoizedIsInitialized;
        if (isInitialized == 1) {
            return true;
        }
        if (isInitialized == 0) {
            return false;
        }
        if (!this.hasConditionKey()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        if ((this.bitField0_ & 1) != 0) {
            output.writeUInt32(1, this.conditionKey_);
        }
        if ((this.bitField0_ & 2) != 0) {
            output.writeBytes(2, this.conditionValue_);
        }
        if ((this.bitField0_ & 4) != 0) {
            output.writeEnum(3, this.op_);
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
            size += CodedOutputStream.computeUInt32Size((int)1, (int)this.conditionKey_);
        }
        if ((this.bitField0_ & 2) != 0) {
            size += CodedOutputStream.computeBytesSize((int)2, (ByteString)this.conditionValue_);
        }
        if ((this.bitField0_ & 4) != 0) {
            size += CodedOutputStream.computeEnumSize((int)3, (int)this.op_);
        }
        this.memoizedSize = size += this.unknownFields.getSerializedSize();
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysqlxExpect.Open.Condition)) {
            return super.equals(obj);
        }
        MysqlxExpect.Open.Condition other = (MysqlxExpect.Open.Condition)obj;
        if (this.hasConditionKey() != other.hasConditionKey()) {
            return false;
        }
        if (this.hasConditionKey() && this.getConditionKey() != other.getConditionKey()) {
            return false;
        }
        if (this.hasConditionValue() != other.hasConditionValue()) {
            return false;
        }
        if (this.hasConditionValue() && !this.getConditionValue().equals((Object)other.getConditionValue())) {
            return false;
        }
        if (this.hasOp() != other.hasOp()) {
            return false;
        }
        if (this.hasOp() && this.op_ != other.op_) {
            return false;
        }
        return this.unknownFields.equals((Object)other.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + MysqlxExpect.Open.Condition.getDescriptor().hashCode();
        if (this.hasConditionKey()) {
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getConditionKey();
        }
        if (this.hasConditionValue()) {
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getConditionValue().hashCode();
        }
        if (this.hasOp()) {
            hash = 37 * hash + 3;
            hash = 53 * hash + this.op_;
        }
        this.memoizedHashCode = hash = 29 * hash + this.unknownFields.hashCode();
        return hash;
    }

    public static MysqlxExpect.Open.Condition parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (MysqlxExpect.Open.Condition)PARSER.parseFrom(data);
    }

    public static MysqlxExpect.Open.Condition parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxExpect.Open.Condition)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxExpect.Open.Condition parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (MysqlxExpect.Open.Condition)PARSER.parseFrom(data);
    }

    public static MysqlxExpect.Open.Condition parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxExpect.Open.Condition)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxExpect.Open.Condition parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (MysqlxExpect.Open.Condition)PARSER.parseFrom(data);
    }

    public static MysqlxExpect.Open.Condition parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (MysqlxExpect.Open.Condition)PARSER.parseFrom(data, extensionRegistry);
    }

    public static MysqlxExpect.Open.Condition parseFrom(InputStream input) throws IOException {
        return (MysqlxExpect.Open.Condition)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxExpect.Open.Condition parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxExpect.Open.Condition)GeneratedMessageV3.parseWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxExpect.Open.Condition parseDelimitedFrom(InputStream input) throws IOException {
        return (MysqlxExpect.Open.Condition)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input);
    }

    public static MysqlxExpect.Open.Condition parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxExpect.Open.Condition)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, (InputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public static MysqlxExpect.Open.Condition parseFrom(CodedInputStream input) throws IOException {
        return (MysqlxExpect.Open.Condition)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input);
    }

    public static MysqlxExpect.Open.Condition parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (MysqlxExpect.Open.Condition)GeneratedMessageV3.parseWithIOException(PARSER, (CodedInputStream)input, (ExtensionRegistryLite)extensionRegistry);
    }

    public Builder newBuilderForType() {
        return MysqlxExpect.Open.Condition.newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MysqlxExpect.Open.Condition prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static MysqlxExpect.Open.Condition getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MysqlxExpect.Open.Condition> parser() {
        return PARSER;
    }

    public Parser<MysqlxExpect.Open.Condition> getParserForType() {
        return PARSER;
    }

    public MysqlxExpect.Open.Condition getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder
    extends GeneratedMessageV3.Builder<Builder>
    implements MysqlxExpect.Open.ConditionOrBuilder {
        private int bitField0_;
        private int conditionKey_;
        private ByteString conditionValue_ = ByteString.EMPTY;
        private int op_ = 0;

        public static final Descriptors.Descriptor getDescriptor() {
            return internal_static_Mysqlx_Expect_Open_Condition_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return internal_static_Mysqlx_Expect_Open_Condition_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxExpect.Open.Condition.class, Builder.class);
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
            this.conditionKey_ = 0;
            this.bitField0_ &= 0xFFFFFFFE;
            this.conditionValue_ = ByteString.EMPTY;
            this.bitField0_ &= 0xFFFFFFFD;
            this.op_ = 0;
            this.bitField0_ &= 0xFFFFFFFB;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internal_static_Mysqlx_Expect_Open_Condition_descriptor;
        }

        public MysqlxExpect.Open.Condition getDefaultInstanceForType() {
            return MysqlxExpect.Open.Condition.getDefaultInstance();
        }

        public MysqlxExpect.Open.Condition build() {
            MysqlxExpect.Open.Condition result = this.buildPartial();
            if (!result.isInitialized()) {
                throw Builder.newUninitializedMessageException((Message)result);
            }
            return result;
        }

        public MysqlxExpect.Open.Condition buildPartial() {
            MysqlxExpect.Open.Condition result = new MysqlxExpect.Open.Condition(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
                result.conditionKey_ = this.conditionKey_;
                to_bitField0_ |= 1;
            }
            if ((from_bitField0_ & 2) != 0) {
                to_bitField0_ |= 2;
            }
            result.conditionValue_ = this.conditionValue_;
            if ((from_bitField0_ & 4) != 0) {
                to_bitField0_ |= 4;
            }
            result.op_ = this.op_;
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
            if (other instanceof MysqlxExpect.Open.Condition) {
                return this.mergeFrom((MysqlxExpect.Open.Condition)other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(MysqlxExpect.Open.Condition other) {
            if (other == MysqlxExpect.Open.Condition.getDefaultInstance()) {
                return this;
            }
            if (other.hasConditionKey()) {
                this.setConditionKey(other.getConditionKey());
            }
            if (other.hasConditionValue()) {
                this.setConditionValue(other.getConditionValue());
            }
            if (other.hasOp()) {
                this.setOp(other.getOp());
            }
            this.mergeUnknownFields(other.unknownFields);
            this.onChanged();
            return this;
        }

        public final boolean isInitialized() {
            return this.hasConditionKey();
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MysqlxExpect.Open.Condition parsedMessage = null;
            try {
                parsedMessage = (MysqlxExpect.Open.Condition)PARSER.parsePartialFrom(input, extensionRegistry);
            }
            catch (InvalidProtocolBufferException e) {
                parsedMessage = (MysqlxExpect.Open.Condition)e.getUnfinishedMessage();
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
        public boolean hasConditionKey() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override
        public int getConditionKey() {
            return this.conditionKey_;
        }

        public Builder setConditionKey(int value) {
            this.bitField0_ |= 1;
            this.conditionKey_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearConditionKey() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.conditionKey_ = 0;
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasConditionValue() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override
        public ByteString getConditionValue() {
            return this.conditionValue_;
        }

        public Builder setConditionValue(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 2;
            this.conditionValue_ = value;
            this.onChanged();
            return this;
        }

        public Builder clearConditionValue() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.conditionValue_ = MysqlxExpect.Open.Condition.getDefaultInstance().getConditionValue();
            this.onChanged();
            return this;
        }

        @Override
        public boolean hasOp() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override
        public ConditionOperation getOp() {
            ConditionOperation result = ConditionOperation.valueOf(this.op_);
            return result == null ? ConditionOperation.EXPECT_OP_SET : result;
        }

        public Builder setOp(ConditionOperation value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.bitField0_ |= 4;
            this.op_ = value.getNumber();
            this.onChanged();
            return this;
        }

        public Builder clearOp() {
            this.bitField0_ &= 0xFFFFFFFB;
            this.op_ = 0;
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

    public static enum ConditionOperation implements ProtocolMessageEnum
    {
        EXPECT_OP_SET(0),
        EXPECT_OP_UNSET(1);

        public static final int EXPECT_OP_SET_VALUE = 0;
        public static final int EXPECT_OP_UNSET_VALUE = 1;
        private static final Internal.EnumLiteMap<ConditionOperation> internalValueMap;
        private static final ConditionOperation[] VALUES;
        private final int value;

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ConditionOperation valueOf(int value) {
            return ConditionOperation.forNumber(value);
        }

        public static ConditionOperation forNumber(int value) {
            switch (value) {
                case 0: {
                    return EXPECT_OP_SET;
                }
                case 1: {
                    return EXPECT_OP_UNSET;
                }
            }
            return null;
        }

        public static Internal.EnumLiteMap<ConditionOperation> internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return (Descriptors.EnumValueDescriptor)ConditionOperation.getDescriptor().getValues().get(this.ordinal());
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return ConditionOperation.getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return (Descriptors.EnumDescriptor)MysqlxExpect.Open.Condition.getDescriptor().getEnumTypes().get(1);
        }

        public static ConditionOperation valueOf(Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != ConditionOperation.getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            return VALUES[desc.getIndex()];
        }

        private ConditionOperation(int value) {
            this.value = value;
        }

        static {
            internalValueMap = new Internal.EnumLiteMap<ConditionOperation>(){

                public ConditionOperation findValueByNumber(int number) {
                    return ConditionOperation.forNumber(number);
                }
            };
            VALUES = ConditionOperation.values();
        }
    }

    public static enum Key implements ProtocolMessageEnum
    {
        EXPECT_NO_ERROR(1),
        EXPECT_FIELD_EXIST(2),
        EXPECT_DOCID_GENERATED(3);

        public static final int EXPECT_NO_ERROR_VALUE = 1;
        public static final int EXPECT_FIELD_EXIST_VALUE = 2;
        public static final int EXPECT_DOCID_GENERATED_VALUE = 3;
        private static final Internal.EnumLiteMap<Key> internalValueMap;
        private static final Key[] VALUES;
        private final int value;

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static Key valueOf(int value) {
            return Key.forNumber(value);
        }

        public static Key forNumber(int value) {
            switch (value) {
                case 1: {
                    return EXPECT_NO_ERROR;
                }
                case 2: {
                    return EXPECT_FIELD_EXIST;
                }
                case 3: {
                    return EXPECT_DOCID_GENERATED;
                }
            }
            return null;
        }

        public static Internal.EnumLiteMap<Key> internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return (Descriptors.EnumValueDescriptor)Key.getDescriptor().getValues().get(this.ordinal());
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return Key.getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return (Descriptors.EnumDescriptor)MysqlxExpect.Open.Condition.getDescriptor().getEnumTypes().get(0);
        }

        public static Key valueOf(Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != Key.getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            return VALUES[desc.getIndex()];
        }

        private Key(int value) {
            this.value = value;
        }

        static {
            internalValueMap = new Internal.EnumLiteMap<Key>(){

                public Key findValueByNumber(int number) {
                    return Key.forNumber(number);
                }
            };
            VALUES = Key.values();
        }
    }
}
