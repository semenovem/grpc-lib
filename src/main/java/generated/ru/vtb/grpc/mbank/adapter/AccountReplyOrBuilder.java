// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: registry-service.proto

package ru.vtb.grpc.mbank.adapter;

public interface AccountReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AccountReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.AccountReply.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.AccountReply.Result result = 1;</code>
   * @return The result.
   */
  ru.vtb.grpc.mbank.adapter.AccountReply.Result getResult();

  /**
   * <code>string message = 2;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}