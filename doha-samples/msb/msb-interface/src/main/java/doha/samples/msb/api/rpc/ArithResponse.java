/*
 * Copyright (C) 2019~2023 dinstone<dinstone@163.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: authir.proto

package doha.samples.msb.api.rpc;

/**
 * Protobuf type {@code message.ArithResponse}
 */
public final class ArithResponse extends com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:message.ArithResponse)
        ArithResponseOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use ArithResponse.newBuilder() to construct.
    private ArithResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ArithResponse() {
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(UnusedPrivateParameter unused) {
        return new ArithResponse();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private ArithResponse(com.google.protobuf.CodedInputStream input,
                          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
        }
        com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
            boolean done = false;
            while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0:
                        done = true;
                        break;
                    case 9: {

                        c_ = input.readDouble();
                        break;
                    }
                    default: {
                        if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                            done = true;
                        }
                        break;
                    }
                }
            }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
        } finally {
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return ArithProto.internal_static_message_ArithResponse_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ArithProto.internal_static_message_ArithResponse_fieldAccessorTable
                .ensureFieldAccessorsInitialized(ArithResponse.class,
                        ArithResponse.Builder.class);
    }

    public static final int C_FIELD_NUMBER = 1;
    private double c_;

    /**
     * <code>double c = 1;</code>
     *
     * @return The c.
     */
    @Override
    public double getC() {
        return c_;
    }

    private byte memoizedIsInitialized = -1;

    @Override
    public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1)
            return true;
        if (isInitialized == 0)
            return false;

        memoizedIsInitialized = 1;
        return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
        if (c_ != 0D) {
            output.writeDouble(1, c_);
        }
        unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1)
            return size;

        size = 0;
        if (c_ != 0D) {
            size += com.google.protobuf.CodedOutputStream.computeDoubleSize(1, c_);
        }
        size += unknownFields.getSerializedSize();
        memoizedSize = size;
        return size;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ArithResponse)) {
            return super.equals(obj);
        }
        ArithResponse other = (ArithResponse) obj;

        if (Double.doubleToLongBits(getC()) != Double.doubleToLongBits(other.getC()))
            return false;
        if (!unknownFields.equals(other.unknownFields))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        hash = (37 * hash) + C_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(Double.doubleToLongBits(getC()));
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static ArithResponse parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static ArithResponse parseFrom(java.nio.ByteBuffer data,
                                          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static ArithResponse parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static ArithResponse parseFrom(com.google.protobuf.ByteString data,
                                          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static ArithResponse parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static ArithResponse parseFrom(byte[] data,
                                          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static ArithResponse parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static ArithResponse parseFrom(java.io.InputStream input,
                                          com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static ArithResponse parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static ArithResponse parseDelimitedFrom(java.io.InputStream input,
                                                   com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static ArithResponse parseFrom(com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static ArithResponse parseFrom(com.google.protobuf.CodedInputStream input,
                                          com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ArithResponse prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @Override
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    /**
     * Protobuf type {@code message.ArithResponse}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:message.ArithResponse)
            ArithResponseOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return ArithProto.internal_static_message_ArithResponse_descriptor;
        }

        @Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArithProto.internal_static_message_ArithResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(ArithResponse.class,
                            ArithResponse.Builder.class);
        }

        // Construct using ArithResponse.newBuilder()
        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
            }
        }

        @Override
        public Builder clear() {
            super.clear();
            c_ = 0D;

            return this;
        }

        @Override
        public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
            return ArithProto.internal_static_message_ArithResponse_descriptor;
        }

        @Override
        public ArithResponse getDefaultInstanceForType() {
            return ArithResponse.getDefaultInstance();
        }

        @Override
        public ArithResponse build() {
            ArithResponse result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @Override
        public ArithResponse buildPartial() {
            ArithResponse result = new ArithResponse(this);
            result.c_ = c_;
            onBuilt();
            return result;
        }

        @Override
        public Builder clone() {
            return super.clone();
        }

        @Override
        public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
            return super.setField(field, value);
        }

        @Override
        public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
            return super.clearField(field);
        }

        @Override
        public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
            return super.clearOneof(oneof);
        }

        @Override
        public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index,
                                        Object value) {
            return super.setRepeatedField(field, index, value);
        }

        @Override
        public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
            return super.addRepeatedField(field, value);
        }

        @Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof ArithResponse) {
                return mergeFrom((ArithResponse) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(ArithResponse other) {
            if (other == ArithResponse.getDefaultInstance())
                return this;
            if (other.getC() != 0D) {
                setC(other.getC());
            }
            this.mergeUnknownFields(other.unknownFields);
            onChanged();
            return this;
        }

        @Override
        public final boolean isInitialized() {
            return true;
        }

        @Override
        public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
                                 com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            ArithResponse parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (ArithResponse) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private double c_;

        /**
         * <code>double c = 1;</code>
         *
         * @return The c.
         */
        @Override
        public double getC() {
            return c_;
        }

        /**
         * <code>double c = 1;</code>
         *
         * @param value The c to set.
         * @return This builder for chaining.
         */
        public Builder setC(double value) {

            c_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>double c = 1;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearC() {

            c_ = 0D;
            onChanged();
            return this;
        }

        @Override
        public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.setUnknownFields(unknownFields);
        }

        @Override
        public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.mergeUnknownFields(unknownFields);
        }

        // @@protoc_insertion_point(builder_scope:message.ArithResponse)
    }

    // @@protoc_insertion_point(class_scope:message.ArithResponse)
    private static final ArithResponse DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new ArithResponse();
    }

    public static ArithResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ArithResponse> PARSER = new com.google.protobuf.AbstractParser<ArithResponse>() {
        @Override
        public ArithResponse parsePartialFrom(com.google.protobuf.CodedInputStream input,
                                              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new ArithResponse(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<ArithResponse> parser() {
        return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ArithResponse> getParserForType() {
        return PARSER;
    }

    @Override
    public ArithResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}
