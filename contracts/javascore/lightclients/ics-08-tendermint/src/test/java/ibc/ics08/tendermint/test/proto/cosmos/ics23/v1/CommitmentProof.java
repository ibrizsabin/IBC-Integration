// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/ics23/v1/proofs.proto

package com.cosmos.ics23.v1;

/**
 * <pre>
 *CommitmentProof is either an ExistenceProof or a NonExistenceProof, or a Batch of such messages
 * </pre>
 *
 * Protobuf type {@code cosmos.ics23.v1.CommitmentProof}
 */
public  final class CommitmentProof extends
    com.google.protobuf.GeneratedMessageLite<
        CommitmentProof, CommitmentProof.Builder> implements
    // @@protoc_insertion_point(message_implements:cosmos.ics23.v1.CommitmentProof)
    CommitmentProofOrBuilder {
  private CommitmentProof() {
  }
  private int proofCase_ = 0;
  private java.lang.Object proof_;
  public enum ProofCase {
    EXIST(1),
    NONEXIST(2),
    BATCH(3),
    COMPRESSED(4),
    PROOF_NOT_SET(0);
    private final int value;
    private ProofCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ProofCase valueOf(int value) {
      return forNumber(value);
    }

    public static ProofCase forNumber(int value) {
      switch (value) {
        case 1: return EXIST;
        case 2: return NONEXIST;
        case 3: return BATCH;
        case 4: return COMPRESSED;
        case 0: return PROOF_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  @java.lang.Override
  public ProofCase
  getProofCase() {
    return ProofCase.forNumber(
        proofCase_);
  }

  private void clearProof() {
    proofCase_ = 0;
    proof_ = null;
  }

  public static final int EXIST_FIELD_NUMBER = 1;
  /**
   * <code>.cosmos.ics23.v1.ExistenceProof exist = 1 [json_name = "exist"];</code>
   */
  @java.lang.Override
  public boolean hasExist() {
    return proofCase_ == 1;
  }
  /**
   * <code>.cosmos.ics23.v1.ExistenceProof exist = 1 [json_name = "exist"];</code>
   */
  @java.lang.Override
  public com.cosmos.ics23.v1.ExistenceProof getExist() {
    if (proofCase_ == 1) {
       return (com.cosmos.ics23.v1.ExistenceProof) proof_;
    }
    return com.cosmos.ics23.v1.ExistenceProof.getDefaultInstance();
  }
  /**
   * <code>.cosmos.ics23.v1.ExistenceProof exist = 1 [json_name = "exist"];</code>
   */
  private void setExist(com.cosmos.ics23.v1.ExistenceProof value) {
    value.getClass();
  proof_ = value;
    proofCase_ = 1;
  }
  /**
   * <code>.cosmos.ics23.v1.ExistenceProof exist = 1 [json_name = "exist"];</code>
   */
  private void mergeExist(com.cosmos.ics23.v1.ExistenceProof value) {
    value.getClass();
  if (proofCase_ == 1 &&
        proof_ != com.cosmos.ics23.v1.ExistenceProof.getDefaultInstance()) {
      proof_ = com.cosmos.ics23.v1.ExistenceProof.newBuilder((com.cosmos.ics23.v1.ExistenceProof) proof_)
          .mergeFrom(value).buildPartial();
    } else {
      proof_ = value;
    }
    proofCase_ = 1;
  }
  /**
   * <code>.cosmos.ics23.v1.ExistenceProof exist = 1 [json_name = "exist"];</code>
   */
  private void clearExist() {
    if (proofCase_ == 1) {
      proofCase_ = 0;
      proof_ = null;
    }
  }

  public static final int NONEXIST_FIELD_NUMBER = 2;
  /**
   * <code>.cosmos.ics23.v1.NonExistenceProof nonexist = 2 [json_name = "nonexist"];</code>
   */
  @java.lang.Override
  public boolean hasNonexist() {
    return proofCase_ == 2;
  }
  /**
   * <code>.cosmos.ics23.v1.NonExistenceProof nonexist = 2 [json_name = "nonexist"];</code>
   */
  @java.lang.Override
  public com.cosmos.ics23.v1.NonExistenceProof getNonexist() {
    if (proofCase_ == 2) {
       return (com.cosmos.ics23.v1.NonExistenceProof) proof_;
    }
    return com.cosmos.ics23.v1.NonExistenceProof.getDefaultInstance();
  }
  /**
   * <code>.cosmos.ics23.v1.NonExistenceProof nonexist = 2 [json_name = "nonexist"];</code>
   */
  private void setNonexist(com.cosmos.ics23.v1.NonExistenceProof value) {
    value.getClass();
  proof_ = value;
    proofCase_ = 2;
  }
  /**
   * <code>.cosmos.ics23.v1.NonExistenceProof nonexist = 2 [json_name = "nonexist"];</code>
   */
  private void mergeNonexist(com.cosmos.ics23.v1.NonExistenceProof value) {
    value.getClass();
  if (proofCase_ == 2 &&
        proof_ != com.cosmos.ics23.v1.NonExistenceProof.getDefaultInstance()) {
      proof_ = com.cosmos.ics23.v1.NonExistenceProof.newBuilder((com.cosmos.ics23.v1.NonExistenceProof) proof_)
          .mergeFrom(value).buildPartial();
    } else {
      proof_ = value;
    }
    proofCase_ = 2;
  }
  /**
   * <code>.cosmos.ics23.v1.NonExistenceProof nonexist = 2 [json_name = "nonexist"];</code>
   */
  private void clearNonexist() {
    if (proofCase_ == 2) {
      proofCase_ = 0;
      proof_ = null;
    }
  }

  public static final int BATCH_FIELD_NUMBER = 3;
  /**
   * <code>.cosmos.ics23.v1.BatchProof batch = 3 [json_name = "batch"];</code>
   */
  @java.lang.Override
  public boolean hasBatch() {
    return proofCase_ == 3;
  }
  /**
   * <code>.cosmos.ics23.v1.BatchProof batch = 3 [json_name = "batch"];</code>
   */
  @java.lang.Override
  public com.cosmos.ics23.v1.BatchProof getBatch() {
    if (proofCase_ == 3) {
       return (com.cosmos.ics23.v1.BatchProof) proof_;
    }
    return com.cosmos.ics23.v1.BatchProof.getDefaultInstance();
  }
  /**
   * <code>.cosmos.ics23.v1.BatchProof batch = 3 [json_name = "batch"];</code>
   */
  private void setBatch(com.cosmos.ics23.v1.BatchProof value) {
    value.getClass();
  proof_ = value;
    proofCase_ = 3;
  }
  /**
   * <code>.cosmos.ics23.v1.BatchProof batch = 3 [json_name = "batch"];</code>
   */
  private void mergeBatch(com.cosmos.ics23.v1.BatchProof value) {
    value.getClass();
  if (proofCase_ == 3 &&
        proof_ != com.cosmos.ics23.v1.BatchProof.getDefaultInstance()) {
      proof_ = com.cosmos.ics23.v1.BatchProof.newBuilder((com.cosmos.ics23.v1.BatchProof) proof_)
          .mergeFrom(value).buildPartial();
    } else {
      proof_ = value;
    }
    proofCase_ = 3;
  }
  /**
   * <code>.cosmos.ics23.v1.BatchProof batch = 3 [json_name = "batch"];</code>
   */
  private void clearBatch() {
    if (proofCase_ == 3) {
      proofCase_ = 0;
      proof_ = null;
    }
  }

  public static final int COMPRESSED_FIELD_NUMBER = 4;
  /**
   * <code>.cosmos.ics23.v1.CompressedBatchProof compressed = 4 [json_name = "compressed"];</code>
   */
  @java.lang.Override
  public boolean hasCompressed() {
    return proofCase_ == 4;
  }
  /**
   * <code>.cosmos.ics23.v1.CompressedBatchProof compressed = 4 [json_name = "compressed"];</code>
   */
  @java.lang.Override
  public com.cosmos.ics23.v1.CompressedBatchProof getCompressed() {
    if (proofCase_ == 4) {
       return (com.cosmos.ics23.v1.CompressedBatchProof) proof_;
    }
    return com.cosmos.ics23.v1.CompressedBatchProof.getDefaultInstance();
  }
  /**
   * <code>.cosmos.ics23.v1.CompressedBatchProof compressed = 4 [json_name = "compressed"];</code>
   */
  private void setCompressed(com.cosmos.ics23.v1.CompressedBatchProof value) {
    value.getClass();
  proof_ = value;
    proofCase_ = 4;
  }
  /**
   * <code>.cosmos.ics23.v1.CompressedBatchProof compressed = 4 [json_name = "compressed"];</code>
   */
  private void mergeCompressed(com.cosmos.ics23.v1.CompressedBatchProof value) {
    value.getClass();
  if (proofCase_ == 4 &&
        proof_ != com.cosmos.ics23.v1.CompressedBatchProof.getDefaultInstance()) {
      proof_ = com.cosmos.ics23.v1.CompressedBatchProof.newBuilder((com.cosmos.ics23.v1.CompressedBatchProof) proof_)
          .mergeFrom(value).buildPartial();
    } else {
      proof_ = value;
    }
    proofCase_ = 4;
  }
  /**
   * <code>.cosmos.ics23.v1.CompressedBatchProof compressed = 4 [json_name = "compressed"];</code>
   */
  private void clearCompressed() {
    if (proofCase_ == 4) {
      proofCase_ = 0;
      proof_ = null;
    }
  }

  public static com.cosmos.ics23.v1.CommitmentProof parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.cosmos.ics23.v1.CommitmentProof parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.cosmos.ics23.v1.CommitmentProof parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.cosmos.ics23.v1.CommitmentProof parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.cosmos.ics23.v1.CommitmentProof parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.cosmos.ics23.v1.CommitmentProof parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.cosmos.ics23.v1.CommitmentProof parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.cosmos.ics23.v1.CommitmentProof parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.cosmos.ics23.v1.CommitmentProof parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.cosmos.ics23.v1.CommitmentProof parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.cosmos.ics23.v1.CommitmentProof parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.cosmos.ics23.v1.CommitmentProof parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.cosmos.ics23.v1.CommitmentProof prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   *CommitmentProof is either an ExistenceProof or a NonExistenceProof, or a Batch of such messages
   * </pre>
   *
   * Protobuf type {@code cosmos.ics23.v1.CommitmentProof}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.cosmos.ics23.v1.CommitmentProof, Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.ics23.v1.CommitmentProof)
      com.cosmos.ics23.v1.CommitmentProofOrBuilder {
    // Construct using com.cosmos.ics23.v1.CommitmentProof.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }

    @java.lang.Override
    public ProofCase
        getProofCase() {
      return instance.getProofCase();
    }

    public Builder clearProof() {
      copyOnWrite();
      instance.clearProof();
      return this;
    }


    /**
     * <code>.cosmos.ics23.v1.ExistenceProof exist = 1 [json_name = "exist"];</code>
     */
    @java.lang.Override
    public boolean hasExist() {
      return instance.hasExist();
    }
    /**
     * <code>.cosmos.ics23.v1.ExistenceProof exist = 1 [json_name = "exist"];</code>
     */
    @java.lang.Override
    public com.cosmos.ics23.v1.ExistenceProof getExist() {
      return instance.getExist();
    }
    /**
     * <code>.cosmos.ics23.v1.ExistenceProof exist = 1 [json_name = "exist"];</code>
     */
    public Builder setExist(com.cosmos.ics23.v1.ExistenceProof value) {
      copyOnWrite();
      instance.setExist(value);
      return this;
    }
    /**
     * <code>.cosmos.ics23.v1.ExistenceProof exist = 1 [json_name = "exist"];</code>
     */
    public Builder setExist(
        com.cosmos.ics23.v1.ExistenceProof.Builder builderForValue) {
      copyOnWrite();
      instance.setExist(builderForValue.build());
      return this;
    }
    /**
     * <code>.cosmos.ics23.v1.ExistenceProof exist = 1 [json_name = "exist"];</code>
     */
    public Builder mergeExist(com.cosmos.ics23.v1.ExistenceProof value) {
      copyOnWrite();
      instance.mergeExist(value);
      return this;
    }
    /**
     * <code>.cosmos.ics23.v1.ExistenceProof exist = 1 [json_name = "exist"];</code>
     */
    public Builder clearExist() {
      copyOnWrite();
      instance.clearExist();
      return this;
    }

    /**
     * <code>.cosmos.ics23.v1.NonExistenceProof nonexist = 2 [json_name = "nonexist"];</code>
     */
    @java.lang.Override
    public boolean hasNonexist() {
      return instance.hasNonexist();
    }
    /**
     * <code>.cosmos.ics23.v1.NonExistenceProof nonexist = 2 [json_name = "nonexist"];</code>
     */
    @java.lang.Override
    public com.cosmos.ics23.v1.NonExistenceProof getNonexist() {
      return instance.getNonexist();
    }
    /**
     * <code>.cosmos.ics23.v1.NonExistenceProof nonexist = 2 [json_name = "nonexist"];</code>
     */
    public Builder setNonexist(com.cosmos.ics23.v1.NonExistenceProof value) {
      copyOnWrite();
      instance.setNonexist(value);
      return this;
    }
    /**
     * <code>.cosmos.ics23.v1.NonExistenceProof nonexist = 2 [json_name = "nonexist"];</code>
     */
    public Builder setNonexist(
        com.cosmos.ics23.v1.NonExistenceProof.Builder builderForValue) {
      copyOnWrite();
      instance.setNonexist(builderForValue.build());
      return this;
    }
    /**
     * <code>.cosmos.ics23.v1.NonExistenceProof nonexist = 2 [json_name = "nonexist"];</code>
     */
    public Builder mergeNonexist(com.cosmos.ics23.v1.NonExistenceProof value) {
      copyOnWrite();
      instance.mergeNonexist(value);
      return this;
    }
    /**
     * <code>.cosmos.ics23.v1.NonExistenceProof nonexist = 2 [json_name = "nonexist"];</code>
     */
    public Builder clearNonexist() {
      copyOnWrite();
      instance.clearNonexist();
      return this;
    }

    /**
     * <code>.cosmos.ics23.v1.BatchProof batch = 3 [json_name = "batch"];</code>
     */
    @java.lang.Override
    public boolean hasBatch() {
      return instance.hasBatch();
    }
    /**
     * <code>.cosmos.ics23.v1.BatchProof batch = 3 [json_name = "batch"];</code>
     */
    @java.lang.Override
    public com.cosmos.ics23.v1.BatchProof getBatch() {
      return instance.getBatch();
    }
    /**
     * <code>.cosmos.ics23.v1.BatchProof batch = 3 [json_name = "batch"];</code>
     */
    public Builder setBatch(com.cosmos.ics23.v1.BatchProof value) {
      copyOnWrite();
      instance.setBatch(value);
      return this;
    }
    /**
     * <code>.cosmos.ics23.v1.BatchProof batch = 3 [json_name = "batch"];</code>
     */
    public Builder setBatch(
        com.cosmos.ics23.v1.BatchProof.Builder builderForValue) {
      copyOnWrite();
      instance.setBatch(builderForValue.build());
      return this;
    }
    /**
     * <code>.cosmos.ics23.v1.BatchProof batch = 3 [json_name = "batch"];</code>
     */
    public Builder mergeBatch(com.cosmos.ics23.v1.BatchProof value) {
      copyOnWrite();
      instance.mergeBatch(value);
      return this;
    }
    /**
     * <code>.cosmos.ics23.v1.BatchProof batch = 3 [json_name = "batch"];</code>
     */
    public Builder clearBatch() {
      copyOnWrite();
      instance.clearBatch();
      return this;
    }

    /**
     * <code>.cosmos.ics23.v1.CompressedBatchProof compressed = 4 [json_name = "compressed"];</code>
     */
    @java.lang.Override
    public boolean hasCompressed() {
      return instance.hasCompressed();
    }
    /**
     * <code>.cosmos.ics23.v1.CompressedBatchProof compressed = 4 [json_name = "compressed"];</code>
     */
    @java.lang.Override
    public com.cosmos.ics23.v1.CompressedBatchProof getCompressed() {
      return instance.getCompressed();
    }
    /**
     * <code>.cosmos.ics23.v1.CompressedBatchProof compressed = 4 [json_name = "compressed"];</code>
     */
    public Builder setCompressed(com.cosmos.ics23.v1.CompressedBatchProof value) {
      copyOnWrite();
      instance.setCompressed(value);
      return this;
    }
    /**
     * <code>.cosmos.ics23.v1.CompressedBatchProof compressed = 4 [json_name = "compressed"];</code>
     */
    public Builder setCompressed(
        com.cosmos.ics23.v1.CompressedBatchProof.Builder builderForValue) {
      copyOnWrite();
      instance.setCompressed(builderForValue.build());
      return this;
    }
    /**
     * <code>.cosmos.ics23.v1.CompressedBatchProof compressed = 4 [json_name = "compressed"];</code>
     */
    public Builder mergeCompressed(com.cosmos.ics23.v1.CompressedBatchProof value) {
      copyOnWrite();
      instance.mergeCompressed(value);
      return this;
    }
    /**
     * <code>.cosmos.ics23.v1.CompressedBatchProof compressed = 4 [json_name = "compressed"];</code>
     */
    public Builder clearCompressed() {
      copyOnWrite();
      instance.clearCompressed();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:cosmos.ics23.v1.CommitmentProof)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.cosmos.ics23.v1.CommitmentProof();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "proof_",
            "proofCase_",
            com.cosmos.ics23.v1.ExistenceProof.class,
            com.cosmos.ics23.v1.NonExistenceProof.class,
            com.cosmos.ics23.v1.BatchProof.class,
            com.cosmos.ics23.v1.CompressedBatchProof.class,
          };
          java.lang.String info =
              "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<" +
              "\u0000\u0003<\u0000\u0004<\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.cosmos.ics23.v1.CommitmentProof> parser = PARSER;
        if (parser == null) {
          synchronized (com.cosmos.ics23.v1.CommitmentProof.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.cosmos.ics23.v1.CommitmentProof>(
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


  // @@protoc_insertion_point(class_scope:cosmos.ics23.v1.CommitmentProof)
  private static final com.cosmos.ics23.v1.CommitmentProof DEFAULT_INSTANCE;
  static {
    CommitmentProof defaultInstance = new CommitmentProof();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      CommitmentProof.class, defaultInstance);
  }

  public static com.cosmos.ics23.v1.CommitmentProof getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<CommitmentProof> PARSER;

  public static com.google.protobuf.Parser<CommitmentProof> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

