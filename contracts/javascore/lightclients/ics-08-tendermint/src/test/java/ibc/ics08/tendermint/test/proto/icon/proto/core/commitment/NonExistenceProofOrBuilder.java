// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/23-commitment/proofs.proto

package com.icon.proto.core.commitment;

public interface NonExistenceProofOrBuilder extends
    // @@protoc_insertion_point(interface_extends:icon.proto.core.commitment.NonExistenceProof)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * TODO: remove this as unnecessary??? we prove a range
   * </pre>
   *
   * <code>bytes key = 1 [json_name = "key"];</code>
   * @return The key.
   */
  com.google.protobuf.ByteString getKey();

  /**
   * <code>.icon.proto.core.commitment.ExistenceProof left = 2 [json_name = "left"];</code>
   * @return Whether the left field is set.
   */
  boolean hasLeft();
  /**
   * <code>.icon.proto.core.commitment.ExistenceProof left = 2 [json_name = "left"];</code>
   * @return The left.
   */
  com.icon.proto.core.commitment.ExistenceProof getLeft();

  /**
   * <code>.icon.proto.core.commitment.ExistenceProof right = 3 [json_name = "right"];</code>
   * @return Whether the right field is set.
   */
  boolean hasRight();
  /**
   * <code>.icon.proto.core.commitment.ExistenceProof right = 3 [json_name = "right"];</code>
   * @return The right.
   */
  com.icon.proto.core.commitment.ExistenceProof getRight();
}