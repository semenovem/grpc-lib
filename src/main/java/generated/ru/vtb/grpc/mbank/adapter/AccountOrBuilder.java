// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: registry-service.proto

package ru.vtb.grpc.mbank.adapter;

public interface AccountOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Account)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string bic = 1;</code>
   * @return The bic.
   */
  java.lang.String getBic();
  /**
   * <code>string bic = 1;</code>
   * @return The bytes for bic.
   */
  com.google.protobuf.ByteString
      getBicBytes();

  /**
   * <code>string kpp = 2;</code>
   * @return The kpp.
   */
  java.lang.String getKpp();
  /**
   * <code>string kpp = 2;</code>
   * @return The bytes for kpp.
   */
  com.google.protobuf.ByteString
      getKppBytes();

  /**
   * <code>string settlement_account = 3;</code>
   * @return The settlementAccount.
   */
  java.lang.String getSettlementAccount();
  /**
   * <code>string settlement_account = 3;</code>
   * @return The bytes for settlementAccount.
   */
  com.google.protobuf.ByteString
      getSettlementAccountBytes();

  /**
   * <code>string correspondent_account = 4;</code>
   * @return The correspondentAccount.
   */
  java.lang.String getCorrespondentAccount();
  /**
   * <code>string correspondent_account = 4;</code>
   * @return The bytes for correspondentAccount.
   */
  com.google.protobuf.ByteString
      getCorrespondentAccountBytes();
}
