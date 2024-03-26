// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/types/validator.proto

package com.tendermint.types;

/**
 * Protobuf type {@code tendermint.types.SimpleValidator}
 */
public  final class SimpleValidator extends
    com.google.protobuf.GeneratedMessageLite<
        SimpleValidator, SimpleValidator.Builder> implements
    // @@protoc_insertion_point(message_implements:tendermint.types.SimpleValidator)
    SimpleValidatorOrBuilder {
  private SimpleValidator() {
  }
  public static final int PUB_KEY_FIELD_NUMBER = 1;
  private com.tendermint.crypto.PublicKey pubKey_;
  /**
   * <code>.tendermint.crypto.PublicKey pub_key = 1 [json_name = "pubKey"];</code>
   */
  @java.lang.Override
  public boolean hasPubKey() {
    return pubKey_ != null;
  }
  /**
   * <code>.tendermint.crypto.PublicKey pub_key = 1 [json_name = "pubKey"];</code>
   */
  @java.lang.Override
  public com.tendermint.crypto.PublicKey getPubKey() {
    return pubKey_ == null ? com.tendermint.crypto.PublicKey.getDefaultInstance() : pubKey_;
  }
  /**
   * <code>.tendermint.crypto.PublicKey pub_key = 1 [json_name = "pubKey"];</code>
   */
  private void setPubKey(com.tendermint.crypto.PublicKey value) {
    value.getClass();
  pubKey_ = value;
    
    }
  /**
   * <code>.tendermint.crypto.PublicKey pub_key = 1 [json_name = "pubKey"];</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergePubKey(com.tendermint.crypto.PublicKey value) {
    value.getClass();
  if (pubKey_ != null &&
        pubKey_ != com.tendermint.crypto.PublicKey.getDefaultInstance()) {
      pubKey_ =
        com.tendermint.crypto.PublicKey.newBuilder(pubKey_).mergeFrom(value).buildPartial();
    } else {
      pubKey_ = value;
    }
    
  }
  /**
   * <code>.tendermint.crypto.PublicKey pub_key = 1 [json_name = "pubKey"];</code>
   */
  private void clearPubKey() {  pubKey_ = null;
    
  }

  public static final int VOTING_POWER_FIELD_NUMBER = 2;
  private long votingPower_;
  /**
   * <code>int64 voting_power = 2 [json_name = "votingPower"];</code>
   * @return The votingPower.
   */
  @java.lang.Override
  public long getVotingPower() {
    return votingPower_;
  }
  /**
   * <code>int64 voting_power = 2 [json_name = "votingPower"];</code>
   * @param value The votingPower to set.
   */
  private void setVotingPower(long value) {
    
    votingPower_ = value;
  }
  /**
   * <code>int64 voting_power = 2 [json_name = "votingPower"];</code>
   */
  private void clearVotingPower() {
    
    votingPower_ = 0L;
  }

  public static com.tendermint.types.SimpleValidator parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tendermint.types.SimpleValidator parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tendermint.types.SimpleValidator parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tendermint.types.SimpleValidator parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tendermint.types.SimpleValidator parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tendermint.types.SimpleValidator parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tendermint.types.SimpleValidator parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.tendermint.types.SimpleValidator parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.tendermint.types.SimpleValidator parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.tendermint.types.SimpleValidator parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.tendermint.types.SimpleValidator parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.tendermint.types.SimpleValidator parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.tendermint.types.SimpleValidator prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code tendermint.types.SimpleValidator}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.tendermint.types.SimpleValidator, Builder> implements
      // @@protoc_insertion_point(builder_implements:tendermint.types.SimpleValidator)
      com.tendermint.types.SimpleValidatorOrBuilder {
    // Construct using com.tendermint.types.SimpleValidator.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>.tendermint.crypto.PublicKey pub_key = 1 [json_name = "pubKey"];</code>
     */
    @java.lang.Override
    public boolean hasPubKey() {
      return instance.hasPubKey();
    }
    /**
     * <code>.tendermint.crypto.PublicKey pub_key = 1 [json_name = "pubKey"];</code>
     */
    @java.lang.Override
    public com.tendermint.crypto.PublicKey getPubKey() {
      return instance.getPubKey();
    }
    /**
     * <code>.tendermint.crypto.PublicKey pub_key = 1 [json_name = "pubKey"];</code>
     */
    public Builder setPubKey(com.tendermint.crypto.PublicKey value) {
      copyOnWrite();
      instance.setPubKey(value);
      return this;
      }
    /**
     * <code>.tendermint.crypto.PublicKey pub_key = 1 [json_name = "pubKey"];</code>
     */
    public Builder setPubKey(
        com.tendermint.crypto.PublicKey.Builder builderForValue) {
      copyOnWrite();
      instance.setPubKey(builderForValue.build());
      return this;
    }
    /**
     * <code>.tendermint.crypto.PublicKey pub_key = 1 [json_name = "pubKey"];</code>
     */
    public Builder mergePubKey(com.tendermint.crypto.PublicKey value) {
      copyOnWrite();
      instance.mergePubKey(value);
      return this;
    }
    /**
     * <code>.tendermint.crypto.PublicKey pub_key = 1 [json_name = "pubKey"];</code>
     */
    public Builder clearPubKey() {  copyOnWrite();
      instance.clearPubKey();
      return this;
    }

    /**
     * <code>int64 voting_power = 2 [json_name = "votingPower"];</code>
     * @return The votingPower.
     */
    @java.lang.Override
    public long getVotingPower() {
      return instance.getVotingPower();
    }
    /**
     * <code>int64 voting_power = 2 [json_name = "votingPower"];</code>
     * @param value The votingPower to set.
     * @return This builder for chaining.
     */
    public Builder setVotingPower(long value) {
      copyOnWrite();
      instance.setVotingPower(value);
      return this;
    }
    /**
     * <code>int64 voting_power = 2 [json_name = "votingPower"];</code>
     * @return This builder for chaining.
     */
    public Builder clearVotingPower() {
      copyOnWrite();
      instance.clearVotingPower();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:tendermint.types.SimpleValidator)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.tendermint.types.SimpleValidator();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "pubKey_",
            "votingPower_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0002" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.tendermint.types.SimpleValidator> parser = PARSER;
        if (parser == null) {
          synchronized (com.tendermint.types.SimpleValidator.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.tendermint.types.SimpleValidator>(
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


  // @@protoc_insertion_point(class_scope:tendermint.types.SimpleValidator)
  private static final com.tendermint.types.SimpleValidator DEFAULT_INSTANCE;
  static {
    SimpleValidator defaultInstance = new SimpleValidator();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      SimpleValidator.class, defaultInstance);
  }

  public static com.tendermint.types.SimpleValidator getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<SimpleValidator> PARSER;

  public static com.google.protobuf.Parser<SimpleValidator> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

