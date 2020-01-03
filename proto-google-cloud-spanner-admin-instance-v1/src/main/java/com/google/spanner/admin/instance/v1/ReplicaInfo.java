/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/admin/instance/v1/spanner_instance_admin.proto

package com.google.spanner.admin.instance.v1;

/** Protobuf type {@code google.spanner.admin.instance.v1.ReplicaInfo} */
public final class ReplicaInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.spanner.admin.instance.v1.ReplicaInfo)
    ReplicaInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ReplicaInfo.newBuilder() to construct.
  private ReplicaInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ReplicaInfo() {
    location_ = "";
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ReplicaInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ReplicaInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              location_ = s;
              break;
            }
          case 16:
            {
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
          case 24:
            {
              defaultLeaderLocation_ = input.readBool();
              break;
            }
          default:
            {
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
    return com.google.spanner.admin.instance.v1.SpannerInstanceAdminProto
        .internal_static_google_spanner_admin_instance_v1_ReplicaInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.spanner.admin.instance.v1.SpannerInstanceAdminProto
        .internal_static_google_spanner_admin_instance_v1_ReplicaInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.spanner.admin.instance.v1.ReplicaInfo.class,
            com.google.spanner.admin.instance.v1.ReplicaInfo.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Indicates the type of replica.  See the [replica types
   * documentation](https://cloud.google.com/spanner/docs/replication#replica_types)
   * for more details.
   * </pre>
   *
   * Protobuf enum {@code google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType}
   */
  public enum ReplicaType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>TYPE_UNSPECIFIED = 0;</code>
     */
    TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Read-write replicas support both reads and writes. These replicas:
     * * Maintain a full copy of your data.
     * * Serve reads.
     * * Can vote whether to commit a write.
     * * Participate in leadership election.
     * * Are eligible to become a leader.
     * </pre>
     *
     * <code>READ_WRITE = 1;</code>
     */
    READ_WRITE(1),
    /**
     *
     *
     * <pre>
     * Read-only replicas only support reads (not writes). Read-only replicas:
     * * Maintain a full copy of your data.
     * * Serve reads.
     * * Do not participate in voting to commit writes.
     * * Are not eligible to become a leader.
     * </pre>
     *
     * <code>READ_ONLY = 2;</code>
     */
    READ_ONLY(2),
    /**
     *
     *
     * <pre>
     * Witness replicas don't support reads but do participate in voting to
     * commit writes. Witness replicas:
     * * Do not maintain a full copy of data.
     * * Do not serve reads.
     * * Vote whether to commit writes.
     * * Participate in leader election but are not eligible to become leader.
     * </pre>
     *
     * <code>WITNESS = 3;</code>
     */
    WITNESS(3),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Read-write replicas support both reads and writes. These replicas:
     * * Maintain a full copy of your data.
     * * Serve reads.
     * * Can vote whether to commit a write.
     * * Participate in leadership election.
     * * Are eligible to become a leader.
     * </pre>
     *
     * <code>READ_WRITE = 1;</code>
     */
    public static final int READ_WRITE_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Read-only replicas only support reads (not writes). Read-only replicas:
     * * Maintain a full copy of your data.
     * * Serve reads.
     * * Do not participate in voting to commit writes.
     * * Are not eligible to become a leader.
     * </pre>
     *
     * <code>READ_ONLY = 2;</code>
     */
    public static final int READ_ONLY_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Witness replicas don't support reads but do participate in voting to
     * commit writes. Witness replicas:
     * * Do not maintain a full copy of data.
     * * Do not serve reads.
     * * Vote whether to commit writes.
     * * Participate in leader election but are not eligible to become leader.
     * </pre>
     *
     * <code>WITNESS = 3;</code>
     */
    public static final int WITNESS_VALUE = 3;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ReplicaType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ReplicaType forNumber(int value) {
      switch (value) {
        case 0:
          return TYPE_UNSPECIFIED;
        case 1:
          return READ_WRITE;
        case 2:
          return READ_ONLY;
        case 3:
          return WITNESS;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ReplicaType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<ReplicaType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ReplicaType>() {
          public ReplicaType findValueByNumber(int number) {
            return ReplicaType.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.spanner.admin.instance.v1.ReplicaInfo.getDescriptor().getEnumTypes().get(0);
    }

    private static final ReplicaType[] VALUES = values();

    public static ReplicaType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ReplicaType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType)
  }

  public static final int LOCATION_FIELD_NUMBER = 1;
  private volatile java.lang.Object location_;
  /**
   *
   *
   * <pre>
   * The location of the serving resources, e.g. "us-central1".
   * </pre>
   *
   * <code>string location = 1;</code>
   *
   * @return The location.
   */
  public java.lang.String getLocation() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      location_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The location of the serving resources, e.g. "us-central1".
   * </pre>
   *
   * <code>string location = 1;</code>
   *
   * @return The bytes for location.
   */
  public com.google.protobuf.ByteString getLocationBytes() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      location_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_;
  /**
   *
   *
   * <pre>
   * The type of replica.
   * </pre>
   *
   * <code>.google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType type = 2;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   *
   *
   * <pre>
   * The type of replica.
   * </pre>
   *
   * <code>.google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType type = 2;</code>
   *
   * @return The type.
   */
  public com.google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType getType() {
    @SuppressWarnings("deprecation")
    com.google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType result =
        com.google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType.valueOf(type_);
    return result == null
        ? com.google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType.UNRECOGNIZED
        : result;
  }

  public static final int DEFAULT_LEADER_LOCATION_FIELD_NUMBER = 3;
  private boolean defaultLeaderLocation_;
  /**
   *
   *
   * <pre>
   * If true, this location is designated as the default leader location where
   * leader replicas are placed. See the [region types
   * documentation](https://cloud.google.com/spanner/docs/instances#region_types)
   * for more details.
   * </pre>
   *
   * <code>bool default_leader_location = 3;</code>
   *
   * @return The defaultLeaderLocation.
   */
  public boolean getDefaultLeaderLocation() {
    return defaultLeaderLocation_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getLocationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, location_);
    }
    if (type_
        != com.google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType.TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, type_);
    }
    if (defaultLeaderLocation_ != false) {
      output.writeBool(3, defaultLeaderLocation_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getLocationBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, location_);
    }
    if (type_
        != com.google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType.TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, type_);
    }
    if (defaultLeaderLocation_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, defaultLeaderLocation_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.spanner.admin.instance.v1.ReplicaInfo)) {
      return super.equals(obj);
    }
    com.google.spanner.admin.instance.v1.ReplicaInfo other =
        (com.google.spanner.admin.instance.v1.ReplicaInfo) obj;

    if (!getLocation().equals(other.getLocation())) return false;
    if (type_ != other.type_) return false;
    if (getDefaultLeaderLocation() != other.getDefaultLeaderLocation()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + DEFAULT_LEADER_LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getDefaultLeaderLocation());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.spanner.admin.instance.v1.ReplicaInfo parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.admin.instance.v1.ReplicaInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.admin.instance.v1.ReplicaInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.admin.instance.v1.ReplicaInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.admin.instance.v1.ReplicaInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.admin.instance.v1.ReplicaInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.admin.instance.v1.ReplicaInfo parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.admin.instance.v1.ReplicaInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.admin.instance.v1.ReplicaInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.spanner.admin.instance.v1.ReplicaInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.admin.instance.v1.ReplicaInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.admin.instance.v1.ReplicaInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.spanner.admin.instance.v1.ReplicaInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /** Protobuf type {@code google.spanner.admin.instance.v1.ReplicaInfo} */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.spanner.admin.instance.v1.ReplicaInfo)
      com.google.spanner.admin.instance.v1.ReplicaInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.spanner.admin.instance.v1.SpannerInstanceAdminProto
          .internal_static_google_spanner_admin_instance_v1_ReplicaInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.spanner.admin.instance.v1.SpannerInstanceAdminProto
          .internal_static_google_spanner_admin_instance_v1_ReplicaInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.spanner.admin.instance.v1.ReplicaInfo.class,
              com.google.spanner.admin.instance.v1.ReplicaInfo.Builder.class);
    }

    // Construct using com.google.spanner.admin.instance.v1.ReplicaInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      location_ = "";

      type_ = 0;

      defaultLeaderLocation_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.spanner.admin.instance.v1.SpannerInstanceAdminProto
          .internal_static_google_spanner_admin_instance_v1_ReplicaInfo_descriptor;
    }

    @java.lang.Override
    public com.google.spanner.admin.instance.v1.ReplicaInfo getDefaultInstanceForType() {
      return com.google.spanner.admin.instance.v1.ReplicaInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.spanner.admin.instance.v1.ReplicaInfo build() {
      com.google.spanner.admin.instance.v1.ReplicaInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.spanner.admin.instance.v1.ReplicaInfo buildPartial() {
      com.google.spanner.admin.instance.v1.ReplicaInfo result =
          new com.google.spanner.admin.instance.v1.ReplicaInfo(this);
      result.location_ = location_;
      result.type_ = type_;
      result.defaultLeaderLocation_ = defaultLeaderLocation_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.spanner.admin.instance.v1.ReplicaInfo) {
        return mergeFrom((com.google.spanner.admin.instance.v1.ReplicaInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.spanner.admin.instance.v1.ReplicaInfo other) {
      if (other == com.google.spanner.admin.instance.v1.ReplicaInfo.getDefaultInstance())
        return this;
      if (!other.getLocation().isEmpty()) {
        location_ = other.location_;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.getDefaultLeaderLocation() != false) {
        setDefaultLeaderLocation(other.getDefaultLeaderLocation());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.spanner.admin.instance.v1.ReplicaInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.spanner.admin.instance.v1.ReplicaInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object location_ = "";
    /**
     *
     *
     * <pre>
     * The location of the serving resources, e.g. "us-central1".
     * </pre>
     *
     * <code>string location = 1;</code>
     *
     * @return The location.
     */
    public java.lang.String getLocation() {
      java.lang.Object ref = location_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        location_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The location of the serving resources, e.g. "us-central1".
     * </pre>
     *
     * <code>string location = 1;</code>
     *
     * @return The bytes for location.
     */
    public com.google.protobuf.ByteString getLocationBytes() {
      java.lang.Object ref = location_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        location_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The location of the serving resources, e.g. "us-central1".
     * </pre>
     *
     * <code>string location = 1;</code>
     *
     * @param value The location to set.
     * @return This builder for chaining.
     */
    public Builder setLocation(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      location_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The location of the serving resources, e.g. "us-central1".
     * </pre>
     *
     * <code>string location = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLocation() {

      location_ = getDefaultInstance().getLocation();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The location of the serving resources, e.g. "us-central1".
     * </pre>
     *
     * <code>string location = 1;</code>
     *
     * @param value The bytes for location to set.
     * @return This builder for chaining.
     */
    public Builder setLocationBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      location_ = value;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     *
     *
     * <pre>
     * The type of replica.
     * </pre>
     *
     * <code>.google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType type = 2;</code>
     *
     * @return The enum numeric value on the wire for type.
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     *
     *
     * <pre>
     * The type of replica.
     * </pre>
     *
     * <code>.google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType type = 2;</code>
     *
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of replica.
     * </pre>
     *
     * <code>.google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType type = 2;</code>
     *
     * @return The type.
     */
    public com.google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType getType() {
      @SuppressWarnings("deprecation")
      com.google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType result =
          com.google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType.valueOf(type_);
      return result == null
          ? com.google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The type of replica.
     * </pre>
     *
     * <code>.google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType type = 2;</code>
     *
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType value) {
      if (value == null) {
        throw new NullPointerException();
      }

      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of replica.
     * </pre>
     *
     * <code>.google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType type = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearType() {

      type_ = 0;
      onChanged();
      return this;
    }

    private boolean defaultLeaderLocation_;
    /**
     *
     *
     * <pre>
     * If true, this location is designated as the default leader location where
     * leader replicas are placed. See the [region types
     * documentation](https://cloud.google.com/spanner/docs/instances#region_types)
     * for more details.
     * </pre>
     *
     * <code>bool default_leader_location = 3;</code>
     *
     * @return The defaultLeaderLocation.
     */
    public boolean getDefaultLeaderLocation() {
      return defaultLeaderLocation_;
    }
    /**
     *
     *
     * <pre>
     * If true, this location is designated as the default leader location where
     * leader replicas are placed. See the [region types
     * documentation](https://cloud.google.com/spanner/docs/instances#region_types)
     * for more details.
     * </pre>
     *
     * <code>bool default_leader_location = 3;</code>
     *
     * @param value The defaultLeaderLocation to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultLeaderLocation(boolean value) {

      defaultLeaderLocation_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If true, this location is designated as the default leader location where
     * leader replicas are placed. See the [region types
     * documentation](https://cloud.google.com/spanner/docs/instances#region_types)
     * for more details.
     * </pre>
     *
     * <code>bool default_leader_location = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDefaultLeaderLocation() {

      defaultLeaderLocation_ = false;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.spanner.admin.instance.v1.ReplicaInfo)
  }

  // @@protoc_insertion_point(class_scope:google.spanner.admin.instance.v1.ReplicaInfo)
  private static final com.google.spanner.admin.instance.v1.ReplicaInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.spanner.admin.instance.v1.ReplicaInfo();
  }

  public static com.google.spanner.admin.instance.v1.ReplicaInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReplicaInfo> PARSER =
      new com.google.protobuf.AbstractParser<ReplicaInfo>() {
        @java.lang.Override
        public ReplicaInfo parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ReplicaInfo(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ReplicaInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReplicaInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.spanner.admin.instance.v1.ReplicaInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}