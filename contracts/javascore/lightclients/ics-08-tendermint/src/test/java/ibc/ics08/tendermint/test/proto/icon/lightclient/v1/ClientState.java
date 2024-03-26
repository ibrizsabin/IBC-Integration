// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: icon/lightclient/v1/light.proto

package com.icon.lightclient.v1;

/**
 * Protobuf type {@code icon.lightclient.v1.ClientState}
 */
public  final class ClientState extends
    com.google.protobuf.GeneratedMessageLite<
        ClientState, ClientState.Builder> implements
    // @@protoc_insertion_point(message_implements:icon.lightclient.v1.ClientState)
    ClientStateOrBuilder {
  private ClientState() {
    srcNetworkId_ = "";
  }
  public static final int TRUSTING_PERIOD_FIELD_NUMBER = 1;
  private long trustingPeriod_;
  /**
   * <code>uint64 trusting_period = 1 [json_name = "trustingPeriod"];</code>
   * @return The trustingPeriod.
   */
  @java.lang.Override
  public long getTrustingPeriod() {
    return trustingPeriod_;
  }
  /**
   * <code>uint64 trusting_period = 1 [json_name = "trustingPeriod"];</code>
   * @param value The trustingPeriod to set.
   */
  private void setTrustingPeriod(long value) {
    
    trustingPeriod_ = value;
  }
  /**
   * <code>uint64 trusting_period = 1 [json_name = "trustingPeriod"];</code>
   */
  private void clearTrustingPeriod() {
    
    trustingPeriod_ = 0L;
  }

  public static final int FROZEN_HEIGHT_FIELD_NUMBER = 2;
  private long frozenHeight_;
  /**
   * <code>uint64 frozen_height = 2 [json_name = "frozenHeight"];</code>
   * @return The frozenHeight.
   */
  @java.lang.Override
  public long getFrozenHeight() {
    return frozenHeight_;
  }
  /**
   * <code>uint64 frozen_height = 2 [json_name = "frozenHeight"];</code>
   * @param value The frozenHeight to set.
   */
  private void setFrozenHeight(long value) {
    
    frozenHeight_ = value;
  }
  /**
   * <code>uint64 frozen_height = 2 [json_name = "frozenHeight"];</code>
   */
  private void clearFrozenHeight() {
    
    frozenHeight_ = 0L;
  }

  public static final int MAX_CLOCK_DRIFT_FIELD_NUMBER = 3;
  private long maxClockDrift_;
  /**
   * <code>uint64 max_clock_drift = 3 [json_name = "maxClockDrift"];</code>
   * @return The maxClockDrift.
   */
  @java.lang.Override
  public long getMaxClockDrift() {
    return maxClockDrift_;
  }
  /**
   * <code>uint64 max_clock_drift = 3 [json_name = "maxClockDrift"];</code>
   * @param value The maxClockDrift to set.
   */
  private void setMaxClockDrift(long value) {
    
    maxClockDrift_ = value;
  }
  /**
   * <code>uint64 max_clock_drift = 3 [json_name = "maxClockDrift"];</code>
   */
  private void clearMaxClockDrift() {
    
    maxClockDrift_ = 0L;
  }

  public static final int LATEST_HEIGHT_FIELD_NUMBER = 4;
  private long latestHeight_;
  /**
   * <code>uint64 latest_height = 4 [json_name = "latestHeight"];</code>
   * @return The latestHeight.
   */
  @java.lang.Override
  public long getLatestHeight() {
    return latestHeight_;
  }
  /**
   * <code>uint64 latest_height = 4 [json_name = "latestHeight"];</code>
   * @param value The latestHeight to set.
   */
  private void setLatestHeight(long value) {
    
    latestHeight_ = value;
  }
  /**
   * <code>uint64 latest_height = 4 [json_name = "latestHeight"];</code>
   */
  private void clearLatestHeight() {
    
    latestHeight_ = 0L;
  }

  public static final int SRC_NETWORK_ID_FIELD_NUMBER = 5;
  private java.lang.String srcNetworkId_;
  /**
   * <code>string src_network_id = 5 [json_name = "srcNetworkId"];</code>
   * @return The srcNetworkId.
   */
  @java.lang.Override
  public java.lang.String getSrcNetworkId() {
    return srcNetworkId_;
  }
  /**
   * <code>string src_network_id = 5 [json_name = "srcNetworkId"];</code>
   * @return The bytes for srcNetworkId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSrcNetworkIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(srcNetworkId_);
  }
  /**
   * <code>string src_network_id = 5 [json_name = "srcNetworkId"];</code>
   * @param value The srcNetworkId to set.
   */
  private void setSrcNetworkId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    srcNetworkId_ = value;
  }
  /**
   * <code>string src_network_id = 5 [json_name = "srcNetworkId"];</code>
   */
  private void clearSrcNetworkId() {
    
    srcNetworkId_ = getDefaultInstance().getSrcNetworkId();
  }
  /**
   * <code>string src_network_id = 5 [json_name = "srcNetworkId"];</code>
   * @param value The bytes for srcNetworkId to set.
   */
  private void setSrcNetworkIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    srcNetworkId_ = value.toStringUtf8();
    
  }

  public static final int NETWORK_ID_FIELD_NUMBER = 6;
  private long networkId_;
  /**
   * <code>uint64 network_id = 6 [json_name = "networkId"];</code>
   * @return The networkId.
   */
  @java.lang.Override
  public long getNetworkId() {
    return networkId_;
  }
  /**
   * <code>uint64 network_id = 6 [json_name = "networkId"];</code>
   * @param value The networkId to set.
   */
  private void setNetworkId(long value) {
    
    networkId_ = value;
  }
  /**
   * <code>uint64 network_id = 6 [json_name = "networkId"];</code>
   */
  private void clearNetworkId() {
    
    networkId_ = 0L;
  }

  public static final int NETWORK_TYPE_ID_FIELD_NUMBER = 7;
  private long networkTypeId_;
  /**
   * <code>uint64 network_type_id = 7 [json_name = "networkTypeId"];</code>
   * @return The networkTypeId.
   */
  @java.lang.Override
  public long getNetworkTypeId() {
    return networkTypeId_;
  }
  /**
   * <code>uint64 network_type_id = 7 [json_name = "networkTypeId"];</code>
   * @param value The networkTypeId to set.
   */
  private void setNetworkTypeId(long value) {
    
    networkTypeId_ = value;
  }
  /**
   * <code>uint64 network_type_id = 7 [json_name = "networkTypeId"];</code>
   */
  private void clearNetworkTypeId() {
    
    networkTypeId_ = 0L;
  }

  public static com.icon.lightclient.v1.ClientState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.icon.lightclient.v1.ClientState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.icon.lightclient.v1.ClientState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.icon.lightclient.v1.ClientState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.icon.lightclient.v1.ClientState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.icon.lightclient.v1.ClientState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.icon.lightclient.v1.ClientState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.icon.lightclient.v1.ClientState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.icon.lightclient.v1.ClientState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.icon.lightclient.v1.ClientState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.icon.lightclient.v1.ClientState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.icon.lightclient.v1.ClientState parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.icon.lightclient.v1.ClientState prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code icon.lightclient.v1.ClientState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.icon.lightclient.v1.ClientState, Builder> implements
      // @@protoc_insertion_point(builder_implements:icon.lightclient.v1.ClientState)
      com.icon.lightclient.v1.ClientStateOrBuilder {
    // Construct using com.icon.lightclient.v1.ClientState.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>uint64 trusting_period = 1 [json_name = "trustingPeriod"];</code>
     * @return The trustingPeriod.
     */
    @java.lang.Override
    public long getTrustingPeriod() {
      return instance.getTrustingPeriod();
    }
    /**
     * <code>uint64 trusting_period = 1 [json_name = "trustingPeriod"];</code>
     * @param value The trustingPeriod to set.
     * @return This builder for chaining.
     */
    public Builder setTrustingPeriod(long value) {
      copyOnWrite();
      instance.setTrustingPeriod(value);
      return this;
    }
    /**
     * <code>uint64 trusting_period = 1 [json_name = "trustingPeriod"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTrustingPeriod() {
      copyOnWrite();
      instance.clearTrustingPeriod();
      return this;
    }

    /**
     * <code>uint64 frozen_height = 2 [json_name = "frozenHeight"];</code>
     * @return The frozenHeight.
     */
    @java.lang.Override
    public long getFrozenHeight() {
      return instance.getFrozenHeight();
    }
    /**
     * <code>uint64 frozen_height = 2 [json_name = "frozenHeight"];</code>
     * @param value The frozenHeight to set.
     * @return This builder for chaining.
     */
    public Builder setFrozenHeight(long value) {
      copyOnWrite();
      instance.setFrozenHeight(value);
      return this;
    }
    /**
     * <code>uint64 frozen_height = 2 [json_name = "frozenHeight"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFrozenHeight() {
      copyOnWrite();
      instance.clearFrozenHeight();
      return this;
    }

    /**
     * <code>uint64 max_clock_drift = 3 [json_name = "maxClockDrift"];</code>
     * @return The maxClockDrift.
     */
    @java.lang.Override
    public long getMaxClockDrift() {
      return instance.getMaxClockDrift();
    }
    /**
     * <code>uint64 max_clock_drift = 3 [json_name = "maxClockDrift"];</code>
     * @param value The maxClockDrift to set.
     * @return This builder for chaining.
     */
    public Builder setMaxClockDrift(long value) {
      copyOnWrite();
      instance.setMaxClockDrift(value);
      return this;
    }
    /**
     * <code>uint64 max_clock_drift = 3 [json_name = "maxClockDrift"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxClockDrift() {
      copyOnWrite();
      instance.clearMaxClockDrift();
      return this;
    }

    /**
     * <code>uint64 latest_height = 4 [json_name = "latestHeight"];</code>
     * @return The latestHeight.
     */
    @java.lang.Override
    public long getLatestHeight() {
      return instance.getLatestHeight();
    }
    /**
     * <code>uint64 latest_height = 4 [json_name = "latestHeight"];</code>
     * @param value The latestHeight to set.
     * @return This builder for chaining.
     */
    public Builder setLatestHeight(long value) {
      copyOnWrite();
      instance.setLatestHeight(value);
      return this;
    }
    /**
     * <code>uint64 latest_height = 4 [json_name = "latestHeight"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLatestHeight() {
      copyOnWrite();
      instance.clearLatestHeight();
      return this;
    }

    /**
     * <code>string src_network_id = 5 [json_name = "srcNetworkId"];</code>
     * @return The srcNetworkId.
     */
    @java.lang.Override
    public java.lang.String getSrcNetworkId() {
      return instance.getSrcNetworkId();
    }
    /**
     * <code>string src_network_id = 5 [json_name = "srcNetworkId"];</code>
     * @return The bytes for srcNetworkId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSrcNetworkIdBytes() {
      return instance.getSrcNetworkIdBytes();
    }
    /**
     * <code>string src_network_id = 5 [json_name = "srcNetworkId"];</code>
     * @param value The srcNetworkId to set.
     * @return This builder for chaining.
     */
    public Builder setSrcNetworkId(
        java.lang.String value) {
      copyOnWrite();
      instance.setSrcNetworkId(value);
      return this;
    }
    /**
     * <code>string src_network_id = 5 [json_name = "srcNetworkId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSrcNetworkId() {
      copyOnWrite();
      instance.clearSrcNetworkId();
      return this;
    }
    /**
     * <code>string src_network_id = 5 [json_name = "srcNetworkId"];</code>
     * @param value The bytes for srcNetworkId to set.
     * @return This builder for chaining.
     */
    public Builder setSrcNetworkIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setSrcNetworkIdBytes(value);
      return this;
    }

    /**
     * <code>uint64 network_id = 6 [json_name = "networkId"];</code>
     * @return The networkId.
     */
    @java.lang.Override
    public long getNetworkId() {
      return instance.getNetworkId();
    }
    /**
     * <code>uint64 network_id = 6 [json_name = "networkId"];</code>
     * @param value The networkId to set.
     * @return This builder for chaining.
     */
    public Builder setNetworkId(long value) {
      copyOnWrite();
      instance.setNetworkId(value);
      return this;
    }
    /**
     * <code>uint64 network_id = 6 [json_name = "networkId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNetworkId() {
      copyOnWrite();
      instance.clearNetworkId();
      return this;
    }

    /**
     * <code>uint64 network_type_id = 7 [json_name = "networkTypeId"];</code>
     * @return The networkTypeId.
     */
    @java.lang.Override
    public long getNetworkTypeId() {
      return instance.getNetworkTypeId();
    }
    /**
     * <code>uint64 network_type_id = 7 [json_name = "networkTypeId"];</code>
     * @param value The networkTypeId to set.
     * @return This builder for chaining.
     */
    public Builder setNetworkTypeId(long value) {
      copyOnWrite();
      instance.setNetworkTypeId(value);
      return this;
    }
    /**
     * <code>uint64 network_type_id = 7 [json_name = "networkTypeId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNetworkTypeId() {
      copyOnWrite();
      instance.clearNetworkTypeId();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:icon.lightclient.v1.ClientState)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.icon.lightclient.v1.ClientState();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "trustingPeriod_",
            "frozenHeight_",
            "maxClockDrift_",
            "latestHeight_",
            "srcNetworkId_",
            "networkId_",
            "networkTypeId_",
          };
          java.lang.String info =
              "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0003\u0002\u0003" +
              "\u0003\u0003\u0004\u0003\u0005\u0208\u0006\u0003\u0007\u0003";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.icon.lightclient.v1.ClientState> parser = PARSER;
        if (parser == null) {
          synchronized (com.icon.lightclient.v1.ClientState.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.icon.lightclient.v1.ClientState>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:icon.lightclient.v1.ClientState)
  private static final com.icon.lightclient.v1.ClientState DEFAULT_INSTANCE;
  static {
    ClientState defaultInstance = new ClientState();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ClientState.class, defaultInstance);
  }

  public static com.icon.lightclient.v1.ClientState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ClientState> PARSER;

  public static com.google.protobuf.Parser<ClientState> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

