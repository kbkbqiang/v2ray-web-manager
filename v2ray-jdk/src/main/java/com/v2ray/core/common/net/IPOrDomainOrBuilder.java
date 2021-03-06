// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/common/net/address.proto

package com.v2ray.core.common.net;

public interface IPOrDomainOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.common.net.IPOrDomain)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * IP address. Must by either 4 or 16 bytes.
   * </pre>
   *
   * <code>bytes ip = 1;</code>
   */
  com.google.protobuf.ByteString getIp();

  /**
   * <pre>
   * Domain address.
   * </pre>
   *
   * <code>string domain = 2;</code>
   */
  String getDomain();
  /**
   * <pre>
   * Domain address.
   * </pre>
   *
   * <code>string domain = 2;</code>
   */
  com.google.protobuf.ByteString
      getDomainBytes();

  public IPOrDomain.AddressCase getAddressCase();
}
