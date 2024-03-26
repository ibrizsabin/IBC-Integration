// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/commitment/v1/commitment.proto

package com.ibc.core.commitment.v1;

/**
 * <pre>
 * MerklePath is the path used to verify commitment proofs, which can be an
 * arbitrary structured object (defined by a commitment type).
 * MerklePath is represented from root-to-leaf
 * </pre>
 *
 * Protobuf type {@code ibc.core.commitment.v1.MerklePath}
 */
public  final class MerklePath extends
    com.google.protobuf.GeneratedMessageLite<
        MerklePath, MerklePath.Builder> implements
    // @@protoc_insertion_point(message_implements:ibc.core.commitment.v1.MerklePath)
    MerklePathOrBuilder {
  private MerklePath() {
    keyPath_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  public static final int KEY_PATH_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<java.lang.String> keyPath_;
  /**
   * <code>repeated string key_path = 1 [json_name = "keyPath"];</code>
   * @return A list containing the keyPath.
   */
  @java.lang.Override
  public java.util.List<java.lang.String> getKeyPathList() {
    return keyPath_;
  }
  /**
   * <code>repeated string key_path = 1 [json_name = "keyPath"];</code>
   * @return The count of keyPath.
   */
  @java.lang.Override
  public int getKeyPathCount() {
    return keyPath_.size();
  }
  /**
   * <code>repeated string key_path = 1 [json_name = "keyPath"];</code>
   * @param index The index of the element to return.
   * @return The keyPath at the given index.
   */
  @java.lang.Override
  public java.lang.String getKeyPath(int index) {
    return keyPath_.get(index);
  }
  /**
   * <code>repeated string key_path = 1 [json_name = "keyPath"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the keyPath at the given index.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKeyPathBytes(int index) {
    return com.google.protobuf.ByteString.copyFromUtf8(
        keyPath_.get(index));
  }
  private void ensureKeyPathIsMutable() {
    com.google.protobuf.Internal.ProtobufList<java.lang.String> tmp =
        keyPath_;  if (!tmp.isModifiable()) {
      keyPath_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }
  /**
   * <code>repeated string key_path = 1 [json_name = "keyPath"];</code>
   * @param index The index to set the value at.
   * @param value The keyPath to set.
   */
  private void setKeyPath(
      int index, java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  ensureKeyPathIsMutable();
    keyPath_.set(index, value);
  }
  /**
   * <code>repeated string key_path = 1 [json_name = "keyPath"];</code>
   * @param value The keyPath to add.
   */
  private void addKeyPath(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  ensureKeyPathIsMutable();
    keyPath_.add(value);
  }
  /**
   * <code>repeated string key_path = 1 [json_name = "keyPath"];</code>
   * @param values The keyPath to add.
   */
  private void addAllKeyPath(
      java.lang.Iterable<java.lang.String> values) {
    ensureKeyPathIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, keyPath_);
  }
  /**
   * <code>repeated string key_path = 1 [json_name = "keyPath"];</code>
   */
  private void clearKeyPath() {
    keyPath_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  /**
   * <code>repeated string key_path = 1 [json_name = "keyPath"];</code>
   * @param value The bytes of the keyPath to add.
   */
  private void addKeyPathBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    ensureKeyPathIsMutable();
    keyPath_.add(value.toStringUtf8());
  }

  public static com.ibc.core.commitment.v1.MerklePath parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.ibc.core.commitment.v1.MerklePath parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.ibc.core.commitment.v1.MerklePath parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.ibc.core.commitment.v1.MerklePath parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.ibc.core.commitment.v1.MerklePath parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.ibc.core.commitment.v1.MerklePath parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.ibc.core.commitment.v1.MerklePath parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.ibc.core.commitment.v1.MerklePath parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.ibc.core.commitment.v1.MerklePath parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.ibc.core.commitment.v1.MerklePath parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.ibc.core.commitment.v1.MerklePath parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.ibc.core.commitment.v1.MerklePath parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.ibc.core.commitment.v1.MerklePath prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * MerklePath is the path used to verify commitment proofs, which can be an
   * arbitrary structured object (defined by a commitment type).
   * MerklePath is represented from root-to-leaf
   * </pre>
   *
   * Protobuf type {@code ibc.core.commitment.v1.MerklePath}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.ibc.core.commitment.v1.MerklePath, Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.core.commitment.v1.MerklePath)
      com.ibc.core.commitment.v1.MerklePathOrBuilder {
    // Construct using com.ibc.core.commitment.v1.MerklePath.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>repeated string key_path = 1 [json_name = "keyPath"];</code>
     * @return A list containing the keyPath.
     */
    @java.lang.Override
    public java.util.List<java.lang.String>
        getKeyPathList() {
      return java.util.Collections.unmodifiableList(
          instance.getKeyPathList());
    }
    /**
     * <code>repeated string key_path = 1 [json_name = "keyPath"];</code>
     * @return The count of keyPath.
     */
    @java.lang.Override
    public int getKeyPathCount() {
      return instance.getKeyPathCount();
    }
    /**
     * <code>repeated string key_path = 1 [json_name = "keyPath"];</code>
     * @param index The index of the element to return.
     * @return The keyPath at the given index.
     */
    @java.lang.Override
    public java.lang.String getKeyPath(int index) {
      return instance.getKeyPath(index);
    }
    /**
     * <code>repeated string key_path = 1 [json_name = "keyPath"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the keyPath at the given index.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getKeyPathBytes(int index) {
      return instance.getKeyPathBytes(index);
    }
    /**
     * <code>repeated string key_path = 1 [json_name = "keyPath"];</code>
     * @param index The index to set the value at.
     * @param value The keyPath to set.
     * @return This builder for chaining.
     */
    public Builder setKeyPath(
        int index, java.lang.String value) {
      copyOnWrite();
      instance.setKeyPath(index, value);
      return this;
    }
    /**
     * <code>repeated string key_path = 1 [json_name = "keyPath"];</code>
     * @param value The keyPath to add.
     * @return This builder for chaining.
     */
    public Builder addKeyPath(
        java.lang.String value) {
      copyOnWrite();
      instance.addKeyPath(value);
      return this;
    }
    /**
     * <code>repeated string key_path = 1 [json_name = "keyPath"];</code>
     * @param values The keyPath to add.
     * @return This builder for chaining.
     */
    public Builder addAllKeyPath(
        java.lang.Iterable<java.lang.String> values) {
      copyOnWrite();
      instance.addAllKeyPath(values);
      return this;
    }
    /**
     * <code>repeated string key_path = 1 [json_name = "keyPath"];</code>
     * @return This builder for chaining.
     */
    public Builder clearKeyPath() {
      copyOnWrite();
      instance.clearKeyPath();
      return this;
    }
    /**
     * <code>repeated string key_path = 1 [json_name = "keyPath"];</code>
     * @param value The bytes of the keyPath to add.
     * @return This builder for chaining.
     */
    public Builder addKeyPathBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.addKeyPathBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:ibc.core.commitment.v1.MerklePath)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.ibc.core.commitment.v1.MerklePath();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "keyPath_",
          };
          java.lang.String info =
              "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u021a";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.ibc.core.commitment.v1.MerklePath> parser = PARSER;
        if (parser == null) {
          synchronized (com.ibc.core.commitment.v1.MerklePath.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.ibc.core.commitment.v1.MerklePath>(
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


  // @@protoc_insertion_point(class_scope:ibc.core.commitment.v1.MerklePath)
  private static final com.ibc.core.commitment.v1.MerklePath DEFAULT_INSTANCE;
  static {
    MerklePath defaultInstance = new MerklePath();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      MerklePath.class, defaultInstance);
  }

  public static com.ibc.core.commitment.v1.MerklePath getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<MerklePath> PARSER;

  public static com.google.protobuf.Parser<MerklePath> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

