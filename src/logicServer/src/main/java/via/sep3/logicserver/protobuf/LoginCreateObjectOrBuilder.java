// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MemberService.proto

package via.sep3.logicserver.protobuf;

public interface LoginCreateObjectOrBuilder extends
    // @@protoc_insertion_point(interface_extends:LoginCreateObject)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string Username = 1;</code>
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   * <code>string Username = 1;</code>
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString
      getUsernameBytes();

  /**
   * <code>bytes Password = 2;</code>
   * @return The password.
   */
  com.google.protobuf.ByteString getPassword();

  /**
   * <code>bytes Salt = 3;</code>
   * @return The salt.
   */
  com.google.protobuf.ByteString getSalt();
}
