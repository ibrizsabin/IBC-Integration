// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/04-channel/Channel.proto

package com.icon.proto.core.channel;

/**
 * <pre>
 * PacketState defines the generic type necessary to retrieve and store
 * packet commitments, acknowledgements, and receipts.
 * Caller is responsible for knowing the context necessary to interpret this
 * state as a commitment, acknowledgement, or a receipt.
 * </pre>
 *
 * Protobuf type {@code icon.proto.core.channel.PacketState}
 */
public  final class PacketState extends
    com.google.protobuf.GeneratedMessageLite<
        PacketState, PacketState.Builder> implements
    // @@protoc_insertion_point(message_implements:icon.proto.core.channel.PacketState)
    PacketStateOrBuilder {
  private PacketState() {
    portId_ = "";
    channelId_ = "";
    data_ = com.google.protobuf.ByteString.EMPTY;
  }
  public static final int PORT_ID_FIELD_NUMBER = 1;
  private java.lang.String portId_;
  /**
   * <pre>
   * channel port identifier.
   * </pre>
   *
   * <code>string port_id = 1 [json_name = "portId"];</code>
   * @return The portId.
   */
  @java.lang.Override
  public java.lang.String getPortId() {
    return portId_;
  }
  /**
   * <pre>
   * channel port identifier.
   * </pre>
   *
   * <code>string port_id = 1 [json_name = "portId"];</code>
   * @return The bytes for portId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPortIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(portId_);
  }
  /**
   * <pre>
   * channel port identifier.
   * </pre>
   *
   * <code>string port_id = 1 [json_name = "portId"];</code>
   * @param value The portId to set.
   */
  private void setPortId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    portId_ = value;
  }
  /**
   * <pre>
   * channel port identifier.
   * </pre>
   *
   * <code>string port_id = 1 [json_name = "portId"];</code>
   */
  private void clearPortId() {
    
    portId_ = getDefaultInstance().getPortId();
  }
  /**
   * <pre>
   * channel port identifier.
   * </pre>
   *
   * <code>string port_id = 1 [json_name = "portId"];</code>
   * @param value The bytes for portId to set.
   */
  private void setPortIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    portId_ = value.toStringUtf8();
    
  }

  public static final int CHANNEL_ID_FIELD_NUMBER = 2;
  private java.lang.String channelId_;
  /**
   * <pre>
   * channel unique identifier.
   * </pre>
   *
   * <code>string channel_id = 2 [json_name = "channelId"];</code>
   * @return The channelId.
   */
  @java.lang.Override
  public java.lang.String getChannelId() {
    return channelId_;
  }
  /**
   * <pre>
   * channel unique identifier.
   * </pre>
   *
   * <code>string channel_id = 2 [json_name = "channelId"];</code>
   * @return The bytes for channelId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getChannelIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(channelId_);
  }
  /**
   * <pre>
   * channel unique identifier.
   * </pre>
   *
   * <code>string channel_id = 2 [json_name = "channelId"];</code>
   * @param value The channelId to set.
   */
  private void setChannelId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    channelId_ = value;
  }
  /**
   * <pre>
   * channel unique identifier.
   * </pre>
   *
   * <code>string channel_id = 2 [json_name = "channelId"];</code>
   */
  private void clearChannelId() {
    
    channelId_ = getDefaultInstance().getChannelId();
  }
  /**
   * <pre>
   * channel unique identifier.
   * </pre>
   *
   * <code>string channel_id = 2 [json_name = "channelId"];</code>
   * @param value The bytes for channelId to set.
   */
  private void setChannelIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    channelId_ = value.toStringUtf8();
    
  }

  public static final int SEQUENCE_FIELD_NUMBER = 3;
  private long sequence_;
  /**
   * <pre>
   * packet sequence.
   * </pre>
   *
   * <code>uint64 sequence = 3 [json_name = "sequence"];</code>
   * @return The sequence.
   */
  @java.lang.Override
  public long getSequence() {
    return sequence_;
  }
  /**
   * <pre>
   * packet sequence.
   * </pre>
   *
   * <code>uint64 sequence = 3 [json_name = "sequence"];</code>
   * @param value The sequence to set.
   */
  private void setSequence(long value) {
    
    sequence_ = value;
  }
  /**
   * <pre>
   * packet sequence.
   * </pre>
   *
   * <code>uint64 sequence = 3 [json_name = "sequence"];</code>
   */
  private void clearSequence() {
    
    sequence_ = 0L;
  }

  public static final int DATA_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString data_;
  /**
   * <pre>
   * embedded data that represents packet state.
   * </pre>
   *
   * <code>bytes data = 4 [json_name = "data"];</code>
   * @return The data.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getData() {
    return data_;
  }
  /**
   * <pre>
   * embedded data that represents packet state.
   * </pre>
   *
   * <code>bytes data = 4 [json_name = "data"];</code>
   * @param value The data to set.
   */
  private void setData(com.google.protobuf.ByteString value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    data_ = value;
  }
  /**
   * <pre>
   * embedded data that represents packet state.
   * </pre>
   *
   * <code>bytes data = 4 [json_name = "data"];</code>
   */
  private void clearData() {
    
    data_ = getDefaultInstance().getData();
  }

  public static com.icon.proto.core.channel.PacketState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.icon.proto.core.channel.PacketState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.icon.proto.core.channel.PacketState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.icon.proto.core.channel.PacketState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.icon.proto.core.channel.PacketState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.icon.proto.core.channel.PacketState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.icon.proto.core.channel.PacketState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.icon.proto.core.channel.PacketState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.icon.proto.core.channel.PacketState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.icon.proto.core.channel.PacketState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.icon.proto.core.channel.PacketState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.icon.proto.core.channel.PacketState parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.icon.proto.core.channel.PacketState prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * PacketState defines the generic type necessary to retrieve and store
   * packet commitments, acknowledgements, and receipts.
   * Caller is responsible for knowing the context necessary to interpret this
   * state as a commitment, acknowledgement, or a receipt.
   * </pre>
   *
   * Protobuf type {@code icon.proto.core.channel.PacketState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.icon.proto.core.channel.PacketState, Builder> implements
      // @@protoc_insertion_point(builder_implements:icon.proto.core.channel.PacketState)
      com.icon.proto.core.channel.PacketStateOrBuilder {
    // Construct using com.icon.proto.core.channel.PacketState.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * channel port identifier.
     * </pre>
     *
     * <code>string port_id = 1 [json_name = "portId"];</code>
     * @return The portId.
     */
    @java.lang.Override
    public java.lang.String getPortId() {
      return instance.getPortId();
    }
    /**
     * <pre>
     * channel port identifier.
     * </pre>
     *
     * <code>string port_id = 1 [json_name = "portId"];</code>
     * @return The bytes for portId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPortIdBytes() {
      return instance.getPortIdBytes();
    }
    /**
     * <pre>
     * channel port identifier.
     * </pre>
     *
     * <code>string port_id = 1 [json_name = "portId"];</code>
     * @param value The portId to set.
     * @return This builder for chaining.
     */
    public Builder setPortId(
        java.lang.String value) {
      copyOnWrite();
      instance.setPortId(value);
      return this;
    }
    /**
     * <pre>
     * channel port identifier.
     * </pre>
     *
     * <code>string port_id = 1 [json_name = "portId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPortId() {
      copyOnWrite();
      instance.clearPortId();
      return this;
    }
    /**
     * <pre>
     * channel port identifier.
     * </pre>
     *
     * <code>string port_id = 1 [json_name = "portId"];</code>
     * @param value The bytes for portId to set.
     * @return This builder for chaining.
     */
    public Builder setPortIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setPortIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * channel unique identifier.
     * </pre>
     *
     * <code>string channel_id = 2 [json_name = "channelId"];</code>
     * @return The channelId.
     */
    @java.lang.Override
    public java.lang.String getChannelId() {
      return instance.getChannelId();
    }
    /**
     * <pre>
     * channel unique identifier.
     * </pre>
     *
     * <code>string channel_id = 2 [json_name = "channelId"];</code>
     * @return The bytes for channelId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getChannelIdBytes() {
      return instance.getChannelIdBytes();
    }
    /**
     * <pre>
     * channel unique identifier.
     * </pre>
     *
     * <code>string channel_id = 2 [json_name = "channelId"];</code>
     * @param value The channelId to set.
     * @return This builder for chaining.
     */
    public Builder setChannelId(
        java.lang.String value) {
      copyOnWrite();
      instance.setChannelId(value);
      return this;
    }
    /**
     * <pre>
     * channel unique identifier.
     * </pre>
     *
     * <code>string channel_id = 2 [json_name = "channelId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearChannelId() {
      copyOnWrite();
      instance.clearChannelId();
      return this;
    }
    /**
     * <pre>
     * channel unique identifier.
     * </pre>
     *
     * <code>string channel_id = 2 [json_name = "channelId"];</code>
     * @param value The bytes for channelId to set.
     * @return This builder for chaining.
     */
    public Builder setChannelIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setChannelIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * packet sequence.
     * </pre>
     *
     * <code>uint64 sequence = 3 [json_name = "sequence"];</code>
     * @return The sequence.
     */
    @java.lang.Override
    public long getSequence() {
      return instance.getSequence();
    }
    /**
     * <pre>
     * packet sequence.
     * </pre>
     *
     * <code>uint64 sequence = 3 [json_name = "sequence"];</code>
     * @param value The sequence to set.
     * @return This builder for chaining.
     */
    public Builder setSequence(long value) {
      copyOnWrite();
      instance.setSequence(value);
      return this;
    }
    /**
     * <pre>
     * packet sequence.
     * </pre>
     *
     * <code>uint64 sequence = 3 [json_name = "sequence"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSequence() {
      copyOnWrite();
      instance.clearSequence();
      return this;
    }

    /**
     * <pre>
     * embedded data that represents packet state.
     * </pre>
     *
     * <code>bytes data = 4 [json_name = "data"];</code>
     * @return The data.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getData() {
      return instance.getData();
    }
    /**
     * <pre>
     * embedded data that represents packet state.
     * </pre>
     *
     * <code>bytes data = 4 [json_name = "data"];</code>
     * @param value The data to set.
     * @return This builder for chaining.
     */
    public Builder setData(com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setData(value);
      return this;
    }
    /**
     * <pre>
     * embedded data that represents packet state.
     * </pre>
     *
     * <code>bytes data = 4 [json_name = "data"];</code>
     * @return This builder for chaining.
     */
    public Builder clearData() {
      copyOnWrite();
      instance.clearData();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:icon.proto.core.channel.PacketState)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.icon.proto.core.channel.PacketState();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "portId_",
            "channelId_",
            "sequence_",
            "data_",
          };
          java.lang.String info =
              "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
              "\u0003\u0003\u0004\n";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.icon.proto.core.channel.PacketState> parser = PARSER;
        if (parser == null) {
          synchronized (com.icon.proto.core.channel.PacketState.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.icon.proto.core.channel.PacketState>(
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


  // @@protoc_insertion_point(class_scope:icon.proto.core.channel.PacketState)
  private static final com.icon.proto.core.channel.PacketState DEFAULT_INSTANCE;
  static {
    PacketState defaultInstance = new PacketState();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      PacketState.class, defaultInstance);
  }

  public static com.icon.proto.core.channel.PacketState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<PacketState> PARSER;

  public static com.google.protobuf.Parser<PacketState> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

