// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ExerciseService.proto

package via.sep3.logicserver.protobuf;

public interface ExerciseObjOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ExerciseObj)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 Id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>string Name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string Name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string Description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string Description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>int32 Duration = 4;</code>
   * @return The duration.
   */
  int getDuration();
}
