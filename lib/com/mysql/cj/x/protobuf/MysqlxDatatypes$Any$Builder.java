/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$BuilderParent
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
 *  com.google.protobuf.SingleFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
package com.mysql.cj.x.protobuf;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import java.io.IOException;

public static final class MysqlxDatatypes.Any.Builder
extends GeneratedMessageV3.Builder<MysqlxDatatypes.Any.Builder>
implements MysqlxDatatypes.AnyOrBuilder {
    private int bitField0_;
    private int type_ = 1;
    private MysqlxDatatypes.Scalar scalar_;
    private SingleFieldBuilderV3<MysqlxDatatypes.Scalar, MysqlxDatatypes.Scalar.Builder, MysqlxDatatypes.ScalarOrBuilder> scalarBuilder_;
    private MysqlxDatatypes.Object obj_;
    private SingleFieldBuilderV3<MysqlxDatatypes.Object, MysqlxDatatypes.Object.Builder, MysqlxDatatypes.ObjectOrBuilder> objBuilder_;
    private MysqlxDatatypes.Array array_;
    private SingleFieldBuilderV3<MysqlxDatatypes.Array, MysqlxDatatypes.Array.Builder, MysqlxDatatypes.ArrayOrBuilder> arrayBuilder_;

    public static final Descriptors.Descriptor getDescriptor() {
        return internal_static_Mysqlx_Datatypes_Any_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return internal_static_Mysqlx_Datatypes_Any_fieldAccessorTable.ensureFieldAccessorsInitialized(MysqlxDatatypes.Any.class, MysqlxDatatypes.Any.Builder.class);
    }

    private MysqlxDatatypes.Any.Builder() {
        this.maybeForceBuilderInitialization();
    }

    private MysqlxDatatypes.Any.Builder(GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        this.maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (alwaysUseFieldBuilders) {
            this.getScalarFieldBuilder();
            this.getObjFieldBuilder();
            this.getArrayFieldBuilder();
        }
    }

    public MysqlxDatatypes.Any.Builder clear() {
        super.clear();
        this.type_ = 1;
        this.bitField0_ &= 0xFFFFFFFE;
        if (this.scalarBuilder_ == null) {
            this.scalar_ = null;
        } else {
            this.scalarBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFD;
        if (this.objBuilder_ == null) {
            this.obj_ = null;
        } else {
            this.objBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFB;
        if (this.arrayBuilder_ == null) {
            this.array_ = null;
        } else {
            this.arrayBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFF7;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return internal_static_Mysqlx_Datatypes_Any_descriptor;
    }

    public MysqlxDatatypes.Any getDefaultInstanceForType() {
        return MysqlxDatatypes.Any.getDefaultInstance();
    }

    public MysqlxDatatypes.Any build() {
        MysqlxDatatypes.Any result = this.buildPartial();
        if (!result.isInitialized()) {
            throw MysqlxDatatypes.Any.Builder.newUninitializedMessageException((Message)result);
        }
        return result;
    }

    public MysqlxDatatypes.Any buildPartial() {
        MysqlxDatatypes.Any result = new MysqlxDatatypes.Any(this, null);
        int from_bitField0_ = this.bitField0_;
        int to_bitField0_ = 0;
        if ((from_bitField0_ & 1) != 0) {
            to_bitField0_ |= 1;
        }
        result.type_ = this.type_;
        if ((from_bitField0_ & 2) != 0) {
            if (this.scalarBuilder_ == null) {
                result.scalar_ = this.scalar_;
            } else {
                result.scalar_ = (MysqlxDatatypes.Scalar)this.scalarBuilder_.build();
            }
            to_bitField0_ |= 2;
        }
        if ((from_bitField0_ & 4) != 0) {
            if (this.objBuilder_ == null) {
                result.obj_ = this.obj_;
            } else {
                result.obj_ = (MysqlxDatatypes.Object)this.objBuilder_.build();
            }
            to_bitField0_ |= 4;
        }
        if ((from_bitField0_ & 8) != 0) {
            if (this.arrayBuilder_ == null) {
                result.array_ = this.array_;
            } else {
                result.array_ = (MysqlxDatatypes.Array)this.arrayBuilder_.build();
            }
            to_bitField0_ |= 8;
        }
        result.bitField0_ = to_bitField0_;
        this.onBuilt();
        return result;
    }

    public MysqlxDatatypes.Any.Builder clone() {
        return (MysqlxDatatypes.Any.Builder)super.clone();
    }

    public MysqlxDatatypes.Any.Builder setField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxDatatypes.Any.Builder)super.setField(field, value);
    }

    public MysqlxDatatypes.Any.Builder clearField(Descriptors.FieldDescriptor field) {
        return (MysqlxDatatypes.Any.Builder)super.clearField(field);
    }

    public MysqlxDatatypes.Any.Builder clearOneof(Descriptors.OneofDescriptor oneof) {
        return (MysqlxDatatypes.Any.Builder)super.clearOneof(oneof);
    }

    public MysqlxDatatypes.Any.Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
        return (MysqlxDatatypes.Any.Builder)super.setRepeatedField(field, index, value);
    }

    public MysqlxDatatypes.Any.Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
        return (MysqlxDatatypes.Any.Builder)super.addRepeatedField(field, value);
    }

    public MysqlxDatatypes.Any.Builder mergeFrom(Message other) {
        if (other instanceof MysqlxDatatypes.Any) {
            return this.mergeFrom((MysqlxDatatypes.Any)other);
        }
        super.mergeFrom(other);
        return this;
    }

    public MysqlxDatatypes.Any.Builder mergeFrom(MysqlxDatatypes.Any other) {
        if (other == MysqlxDatatypes.Any.getDefaultInstance()) {
            return this;
        }
        if (other.hasType()) {
            this.setType(other.getType());
        }
        if (other.hasScalar()) {
            this.mergeScalar(other.getScalar());
        }
        if (other.hasObj()) {
            this.mergeObj(other.getObj());
        }
        if (other.hasArray()) {
            this.mergeArray(other.getArray());
        }
        this.mergeUnknownFields(other.unknownFields);
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.hasType()) {
            return false;
        }
        if (this.hasScalar() && !this.getScalar().isInitialized()) {
            return false;
        }
        if (this.hasObj() && !this.getObj().isInitialized()) {
            return false;
        }
        return !this.hasArray() || this.getArray().isInitialized();
    }

    public MysqlxDatatypes.Any.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        MysqlxDatatypes.Any parsedMessage = null;
        try {
            parsedMessage = (MysqlxDatatypes.Any)PARSER.parsePartialFrom(input, extensionRegistry);
        }
        catch (InvalidProtocolBufferException e) {
            parsedMessage = (MysqlxDatatypes.Any)e.getUnfinishedMessage();
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
    public MysqlxDatatypes.Any.Type getType() {
        MysqlxDatatypes.Any.Type result = MysqlxDatatypes.Any.Type.valueOf(this.type_);
        return result == null ? MysqlxDatatypes.Any.Type.SCALAR : result;
    }

    public MysqlxDatatypes.Any.Builder setType(MysqlxDatatypes.Any.Type value) {
        if (value == null) {
            throw new NullPointerException();
        }
        this.bitField0_ |= 1;
        this.type_ = value.getNumber();
        this.onChanged();
        return this;
    }

    public MysqlxDatatypes.Any.Builder clearType() {
        this.bitField0_ &= 0xFFFFFFFE;
        this.type_ = 1;
        this.onChanged();
        return this;
    }

    @Override
    public boolean hasScalar() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override
    public MysqlxDatatypes.Scalar getScalar() {
        if (this.scalarBuilder_ == null) {
            return this.scalar_ == null ? MysqlxDatatypes.Scalar.getDefaultInstance() : this.scalar_;
        }
        return (MysqlxDatatypes.Scalar)this.scalarBuilder_.getMessage();
    }

    public MysqlxDatatypes.Any.Builder setScalar(MysqlxDatatypes.Scalar value) {
        if (this.scalarBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.scalar_ = value;
            this.onChanged();
        } else {
            this.scalarBuilder_.setMessage((AbstractMessage)value);
        }
        this.bitField0_ |= 2;
        return this;
    }

    public MysqlxDatatypes.Any.Builder setScalar(MysqlxDatatypes.Scalar.Builder builderForValue) {
        if (this.scalarBuilder_ == null) {
            this.scalar_ = builderForValue.build();
            this.onChanged();
        } else {
            this.scalarBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 2;
        return this;
    }

    public MysqlxDatatypes.Any.Builder mergeScalar(MysqlxDatatypes.Scalar value) {
        if (this.scalarBuilder_ == null) {
            this.scalar_ = (this.bitField0_ & 2) != 0 && this.scalar_ != null && this.scalar_ != MysqlxDatatypes.Scalar.getDefaultInstance() ? MysqlxDatatypes.Scalar.newBuilder(this.scalar_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.scalarBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 2;
        return this;
    }

    public MysqlxDatatypes.Any.Builder clearScalar() {
        if (this.scalarBuilder_ == null) {
            this.scalar_ = null;
            this.onChanged();
        } else {
            this.scalarBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFD;
        return this;
    }

    public MysqlxDatatypes.Scalar.Builder getScalarBuilder() {
        this.bitField0_ |= 2;
        this.onChanged();
        return (MysqlxDatatypes.Scalar.Builder)this.getScalarFieldBuilder().getBuilder();
    }

    @Override
    public MysqlxDatatypes.ScalarOrBuilder getScalarOrBuilder() {
        if (this.scalarBuilder_ != null) {
            return (MysqlxDatatypes.ScalarOrBuilder)this.scalarBuilder_.getMessageOrBuilder();
        }
        return this.scalar_ == null ? MysqlxDatatypes.Scalar.getDefaultInstance() : this.scalar_;
    }

    private SingleFieldBuilderV3<MysqlxDatatypes.Scalar, MysqlxDatatypes.Scalar.Builder, MysqlxDatatypes.ScalarOrBuilder> getScalarFieldBuilder() {
        if (this.scalarBuilder_ == null) {
            this.scalarBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getScalar(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.scalar_ = null;
        }
        return this.scalarBuilder_;
    }

    @Override
    public boolean hasObj() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override
    public MysqlxDatatypes.Object getObj() {
        if (this.objBuilder_ == null) {
            return this.obj_ == null ? MysqlxDatatypes.Object.getDefaultInstance() : this.obj_;
        }
        return (MysqlxDatatypes.Object)this.objBuilder_.getMessage();
    }

    public MysqlxDatatypes.Any.Builder setObj(MysqlxDatatypes.Object value) {
        if (this.objBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.obj_ = value;
            this.onChanged();
        } else {
            this.objBuilder_.setMessage((AbstractMessage)value);
        }
        this.bitField0_ |= 4;
        return this;
    }

    public MysqlxDatatypes.Any.Builder setObj(MysqlxDatatypes.Object.Builder builderForValue) {
        if (this.objBuilder_ == null) {
            this.obj_ = builderForValue.build();
            this.onChanged();
        } else {
            this.objBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 4;
        return this;
    }

    public MysqlxDatatypes.Any.Builder mergeObj(MysqlxDatatypes.Object value) {
        if (this.objBuilder_ == null) {
            this.obj_ = (this.bitField0_ & 4) != 0 && this.obj_ != null && this.obj_ != MysqlxDatatypes.Object.getDefaultInstance() ? MysqlxDatatypes.Object.newBuilder(this.obj_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.objBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 4;
        return this;
    }

    public MysqlxDatatypes.Any.Builder clearObj() {
        if (this.objBuilder_ == null) {
            this.obj_ = null;
            this.onChanged();
        } else {
            this.objBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFFB;
        return this;
    }

    public MysqlxDatatypes.Object.Builder getObjBuilder() {
        this.bitField0_ |= 4;
        this.onChanged();
        return (MysqlxDatatypes.Object.Builder)this.getObjFieldBuilder().getBuilder();
    }

    @Override
    public MysqlxDatatypes.ObjectOrBuilder getObjOrBuilder() {
        if (this.objBuilder_ != null) {
            return (MysqlxDatatypes.ObjectOrBuilder)this.objBuilder_.getMessageOrBuilder();
        }
        return this.obj_ == null ? MysqlxDatatypes.Object.getDefaultInstance() : this.obj_;
    }

    private SingleFieldBuilderV3<MysqlxDatatypes.Object, MysqlxDatatypes.Object.Builder, MysqlxDatatypes.ObjectOrBuilder> getObjFieldBuilder() {
        if (this.objBuilder_ == null) {
            this.objBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getObj(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.obj_ = null;
        }
        return this.objBuilder_;
    }

    @Override
    public boolean hasArray() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override
    public MysqlxDatatypes.Array getArray() {
        if (this.arrayBuilder_ == null) {
            return this.array_ == null ? MysqlxDatatypes.Array.getDefaultInstance() : this.array_;
        }
        return (MysqlxDatatypes.Array)this.arrayBuilder_.getMessage();
    }

    public MysqlxDatatypes.Any.Builder setArray(MysqlxDatatypes.Array value) {
        if (this.arrayBuilder_ == null) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.array_ = value;
            this.onChanged();
        } else {
            this.arrayBuilder_.setMessage((AbstractMessage)value);
        }
        this.bitField0_ |= 8;
        return this;
    }

    public MysqlxDatatypes.Any.Builder setArray(MysqlxDatatypes.Array.Builder builderForValue) {
        if (this.arrayBuilder_ == null) {
            this.array_ = builderForValue.build();
            this.onChanged();
        } else {
            this.arrayBuilder_.setMessage((AbstractMessage)builderForValue.build());
        }
        this.bitField0_ |= 8;
        return this;
    }

    public MysqlxDatatypes.Any.Builder mergeArray(MysqlxDatatypes.Array value) {
        if (this.arrayBuilder_ == null) {
            this.array_ = (this.bitField0_ & 8) != 0 && this.array_ != null && this.array_ != MysqlxDatatypes.Array.getDefaultInstance() ? MysqlxDatatypes.Array.newBuilder(this.array_).mergeFrom(value).buildPartial() : value;
            this.onChanged();
        } else {
            this.arrayBuilder_.mergeFrom((AbstractMessage)value);
        }
        this.bitField0_ |= 8;
        return this;
    }

    public MysqlxDatatypes.Any.Builder clearArray() {
        if (this.arrayBuilder_ == null) {
            this.array_ = null;
            this.onChanged();
        } else {
            this.arrayBuilder_.clear();
        }
        this.bitField0_ &= 0xFFFFFFF7;
        return this;
    }

    public MysqlxDatatypes.Array.Builder getArrayBuilder() {
        this.bitField0_ |= 8;
        this.onChanged();
        return (MysqlxDatatypes.Array.Builder)this.getArrayFieldBuilder().getBuilder();
    }

    @Override
    public MysqlxDatatypes.ArrayOrBuilder getArrayOrBuilder() {
        if (this.arrayBuilder_ != null) {
            return (MysqlxDatatypes.ArrayOrBuilder)this.arrayBuilder_.getMessageOrBuilder();
        }
        return this.array_ == null ? MysqlxDatatypes.Array.getDefaultInstance() : this.array_;
    }

    private SingleFieldBuilderV3<MysqlxDatatypes.Array, MysqlxDatatypes.Array.Builder, MysqlxDatatypes.ArrayOrBuilder> getArrayFieldBuilder() {
        if (this.arrayBuilder_ == null) {
            this.arrayBuilder_ = new SingleFieldBuilderV3((AbstractMessage)this.getArray(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.array_ = null;
        }
        return this.arrayBuilder_;
    }

    public final MysqlxDatatypes.Any.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxDatatypes.Any.Builder)super.setUnknownFields(unknownFields);
    }

    public final MysqlxDatatypes.Any.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (MysqlxDatatypes.Any.Builder)super.mergeUnknownFields(unknownFields);
    }
}
