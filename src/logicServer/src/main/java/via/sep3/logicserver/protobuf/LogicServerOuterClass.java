// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LogicServer.proto

package via.sep3.logicserver.protobuf;

public final class LogicServerOuterClass {
  private LogicServerOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CreatedMember_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CreatedMember_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResponseMember_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResponseMember_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021LogicServer.proto\"3\n\rCreatedMember\022\020\n\010" +
      "username\030\001 \001(\t\022\020\n\010password\030\002 \001(\t\"\"\n\016Resp" +
      "onseMember\022\020\n\010username\030\002 \001(\t2>\n\013LogicSer" +
      "ver\022/\n\014createMember\022\016.CreatedMember\032\017.Re" +
      "sponseMemberB!\n\035via.sep3.logicserver.pro" +
      "tobufP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CreatedMember_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CreatedMember_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CreatedMember_descriptor,
        new java.lang.String[] { "Username", "Password", });
    internal_static_ResponseMember_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ResponseMember_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResponseMember_descriptor,
        new java.lang.String[] { "Username", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
