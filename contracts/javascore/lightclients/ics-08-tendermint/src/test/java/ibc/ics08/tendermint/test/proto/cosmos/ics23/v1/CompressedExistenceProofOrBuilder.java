// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/ics23/v1/proofs.proto

package com.cosmos.ics23.v1;

public interface CompressedExistenceProofOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.ics23.v1.CompressedExistenceProof)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>bytes key = 1 [json_name = "key"];</code>
   * @return The key.
   */
  com.google.protobuf.ByteString getKey();

  /**
   * <code>bytes value = 2 [json_name = "value"];</code>
   * @return The value.
   */
  com.google.protobuf.ByteString getValue();

  /**
   * <code>.cosmos.ics23.v1.LeafOp leaf = 3 [json_name = "leaf"];</code>
   * @return Whether the leaf field is set.
   */
  boolean hasLeaf();
  /**
   * <code>.cosmos.ics23.v1.LeafOp leaf = 3 [json_name = "leaf"];</code>
   * @return The leaf.
   */
  com.cosmos.ics23.v1.LeafOp getLeaf();

  /**
   * <pre>
   * these are indexes into the lookup_inners table in CompressedBatchProof
   * </pre>
   *
   * <code>repeated int32 path = 4 [json_name = "path"];</code>
   * @return A list containing the path.
   */
  java.util.List<java.lang.Integer> getPathList();
  /**
   * <pre>
   * these are indexes into the lookup_inners table in CompressedBatchProof
   * </pre>
   *
   * <code>repeated int32 path = 4 [json_name = "path"];</code>
   * @return The count of path.
   */
  int getPathCount();
  /**
   * <pre>
   * these are indexes into the lookup_inners table in CompressedBatchProof
   * </pre>
   *
   * <code>repeated int32 path = 4 [json_name = "path"];</code>
   * @param index The index of the element to return.
   * @return The path at the given index.
   */
  int getPath(int index);
}