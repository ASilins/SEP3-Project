// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: Protos/LogicServer.proto
// </auto-generated>
#pragma warning disable 0414, 1591, 8981
#region Designer generated code

using grpc = global::Grpc.Core;

namespace GrpcClient {
  public static partial class LogicServer
  {
    static readonly string __ServiceName = "LogicServer";

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static void __Helper_SerializeMessage(global::Google.Protobuf.IMessage message, grpc::SerializationContext context)
    {
      #if !GRPC_DISABLE_PROTOBUF_BUFFER_SERIALIZATION
      if (message is global::Google.Protobuf.IBufferMessage)
      {
        context.SetPayloadLength(message.CalculateSize());
        global::Google.Protobuf.MessageExtensions.WriteTo(message, context.GetBufferWriter());
        context.Complete();
        return;
      }
      #endif
      context.Complete(global::Google.Protobuf.MessageExtensions.ToByteArray(message));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static class __Helper_MessageCache<T>
    {
      public static readonly bool IsBufferMessage = global::System.Reflection.IntrospectionExtensions.GetTypeInfo(typeof(global::Google.Protobuf.IBufferMessage)).IsAssignableFrom(typeof(T));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static T __Helper_DeserializeMessage<T>(grpc::DeserializationContext context, global::Google.Protobuf.MessageParser<T> parser) where T : global::Google.Protobuf.IMessage<T>
    {
      #if !GRPC_DISABLE_PROTOBUF_BUFFER_SERIALIZATION
      if (__Helper_MessageCache<T>.IsBufferMessage)
      {
        return parser.ParseFrom(context.PayloadAsReadOnlySequence());
      }
      #endif
      return parser.ParseFrom(context.PayloadAsNewBuffer());
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::GrpcClient.MemberTO> __Marshaller_MemberTO = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::GrpcClient.MemberTO.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::GrpcClient.ResponseMember> __Marshaller_ResponseMember = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::GrpcClient.ResponseMember.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::GrpcClient.ExerciseTO> __Marshaller_ExerciseTO = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::GrpcClient.ExerciseTO.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::GrpcClient.EmptyPar> __Marshaller_EmptyPar = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::GrpcClient.EmptyPar.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::GrpcClient.ExercisesTO> __Marshaller_ExercisesTO = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::GrpcClient.ExercisesTO.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::GrpcClient.WorkoutsTO> __Marshaller_WorkoutsTO = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::GrpcClient.WorkoutsTO.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::GrpcClient.WorkoutId> __Marshaller_WorkoutId = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::GrpcClient.WorkoutId.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::GrpcClient.WorkoutO> __Marshaller_WorkoutO = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::GrpcClient.WorkoutO.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::GrpcClient.FollowWorkoutTO> __Marshaller_FollowWorkoutTO = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::GrpcClient.FollowWorkoutTO.Parser));

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::GrpcClient.MemberTO, global::GrpcClient.ResponseMember> __Method_createMember = new grpc::Method<global::GrpcClient.MemberTO, global::GrpcClient.ResponseMember>(
        grpc::MethodType.Unary,
        __ServiceName,
        "createMember",
        __Marshaller_MemberTO,
        __Marshaller_ResponseMember);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::GrpcClient.MemberTO, global::GrpcClient.ResponseMember> __Method_loginMember = new grpc::Method<global::GrpcClient.MemberTO, global::GrpcClient.ResponseMember>(
        grpc::MethodType.Unary,
        __ServiceName,
        "loginMember",
        __Marshaller_MemberTO,
        __Marshaller_ResponseMember);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::GrpcClient.ExerciseTO, global::GrpcClient.ExerciseTO> __Method_createExercise = new grpc::Method<global::GrpcClient.ExerciseTO, global::GrpcClient.ExerciseTO>(
        grpc::MethodType.Unary,
        __ServiceName,
        "createExercise",
        __Marshaller_ExerciseTO,
        __Marshaller_ExerciseTO);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::GrpcClient.EmptyPar, global::GrpcClient.ExercisesTO> __Method_getExercises = new grpc::Method<global::GrpcClient.EmptyPar, global::GrpcClient.ExercisesTO>(
        grpc::MethodType.Unary,
        __ServiceName,
        "getExercises",
        __Marshaller_EmptyPar,
        __Marshaller_ExercisesTO);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::GrpcClient.EmptyPar, global::GrpcClient.WorkoutsTO> __Method_getWorkouts = new grpc::Method<global::GrpcClient.EmptyPar, global::GrpcClient.WorkoutsTO>(
        grpc::MethodType.Unary,
        __ServiceName,
        "getWorkouts",
        __Marshaller_EmptyPar,
        __Marshaller_WorkoutsTO);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::GrpcClient.WorkoutId, global::GrpcClient.WorkoutO> __Method_getWorkout = new grpc::Method<global::GrpcClient.WorkoutId, global::GrpcClient.WorkoutO>(
        grpc::MethodType.Unary,
        __ServiceName,
        "getWorkout",
        __Marshaller_WorkoutId,
        __Marshaller_WorkoutO);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::GrpcClient.FollowWorkoutTO, global::GrpcClient.FollowWorkoutTO> __Method_assignWorkout = new grpc::Method<global::GrpcClient.FollowWorkoutTO, global::GrpcClient.FollowWorkoutTO>(
        grpc::MethodType.Unary,
        __ServiceName,
        "assignWorkout",
        __Marshaller_FollowWorkoutTO,
        __Marshaller_FollowWorkoutTO);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::GrpcClient.WorkoutO, global::GrpcClient.WorkoutO> __Method_editWorkout = new grpc::Method<global::GrpcClient.WorkoutO, global::GrpcClient.WorkoutO>(
        grpc::MethodType.Unary,
        __ServiceName,
        "editWorkout",
        __Marshaller_WorkoutO,
        __Marshaller_WorkoutO);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::GrpcClient.WorkoutId, global::GrpcClient.EmptyPar> __Method_deleteWorkout = new grpc::Method<global::GrpcClient.WorkoutId, global::GrpcClient.EmptyPar>(
        grpc::MethodType.Unary,
        __ServiceName,
        "deleteWorkout",
        __Marshaller_WorkoutId,
        __Marshaller_EmptyPar);

    /// <summary>Service descriptor</summary>
    public static global::Google.Protobuf.Reflection.ServiceDescriptor Descriptor
    {
      get { return global::GrpcClient.LogicServerReflection.Descriptor.Services[0]; }
    }

    /// <summary>Client for LogicServer</summary>
    public partial class LogicServerClient : grpc::ClientBase<LogicServerClient>
    {
      /// <summary>Creates a new client for LogicServer</summary>
      /// <param name="channel">The channel to use to make remote calls.</param>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public LogicServerClient(grpc::ChannelBase channel) : base(channel)
      {
      }
      /// <summary>Creates a new client for LogicServer that uses a custom <c>CallInvoker</c>.</summary>
      /// <param name="callInvoker">The callInvoker to use to make remote calls.</param>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public LogicServerClient(grpc::CallInvoker callInvoker) : base(callInvoker)
      {
      }
      /// <summary>Protected parameterless constructor to allow creation of test doubles.</summary>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      protected LogicServerClient() : base()
      {
      }
      /// <summary>Protected constructor to allow creation of configured clients.</summary>
      /// <param name="configuration">The client configuration.</param>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      protected LogicServerClient(ClientBaseConfiguration configuration) : base(configuration)
      {
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::GrpcClient.ResponseMember createMember(global::GrpcClient.MemberTO request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return createMember(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::GrpcClient.ResponseMember createMember(global::GrpcClient.MemberTO request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_createMember, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::GrpcClient.ResponseMember> createMemberAsync(global::GrpcClient.MemberTO request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return createMemberAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::GrpcClient.ResponseMember> createMemberAsync(global::GrpcClient.MemberTO request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_createMember, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::GrpcClient.ResponseMember loginMember(global::GrpcClient.MemberTO request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return loginMember(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::GrpcClient.ResponseMember loginMember(global::GrpcClient.MemberTO request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_loginMember, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::GrpcClient.ResponseMember> loginMemberAsync(global::GrpcClient.MemberTO request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return loginMemberAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::GrpcClient.ResponseMember> loginMemberAsync(global::GrpcClient.MemberTO request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_loginMember, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::GrpcClient.ExerciseTO createExercise(global::GrpcClient.ExerciseTO request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return createExercise(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::GrpcClient.ExerciseTO createExercise(global::GrpcClient.ExerciseTO request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_createExercise, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::GrpcClient.ExerciseTO> createExerciseAsync(global::GrpcClient.ExerciseTO request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return createExerciseAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::GrpcClient.ExerciseTO> createExerciseAsync(global::GrpcClient.ExerciseTO request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_createExercise, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::GrpcClient.ExercisesTO getExercises(global::GrpcClient.EmptyPar request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return getExercises(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::GrpcClient.ExercisesTO getExercises(global::GrpcClient.EmptyPar request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_getExercises, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::GrpcClient.ExercisesTO> getExercisesAsync(global::GrpcClient.EmptyPar request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return getExercisesAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::GrpcClient.ExercisesTO> getExercisesAsync(global::GrpcClient.EmptyPar request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_getExercises, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::GrpcClient.WorkoutsTO getWorkouts(global::GrpcClient.EmptyPar request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return getWorkouts(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::GrpcClient.WorkoutsTO getWorkouts(global::GrpcClient.EmptyPar request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_getWorkouts, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::GrpcClient.WorkoutsTO> getWorkoutsAsync(global::GrpcClient.EmptyPar request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return getWorkoutsAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::GrpcClient.WorkoutsTO> getWorkoutsAsync(global::GrpcClient.EmptyPar request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_getWorkouts, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::GrpcClient.WorkoutO getWorkout(global::GrpcClient.WorkoutId request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return getWorkout(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::GrpcClient.WorkoutO getWorkout(global::GrpcClient.WorkoutId request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_getWorkout, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::GrpcClient.WorkoutO> getWorkoutAsync(global::GrpcClient.WorkoutId request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return getWorkoutAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::GrpcClient.WorkoutO> getWorkoutAsync(global::GrpcClient.WorkoutId request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_getWorkout, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::GrpcClient.FollowWorkoutTO assignWorkout(global::GrpcClient.FollowWorkoutTO request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return assignWorkout(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::GrpcClient.FollowWorkoutTO assignWorkout(global::GrpcClient.FollowWorkoutTO request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_assignWorkout, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::GrpcClient.FollowWorkoutTO> assignWorkoutAsync(global::GrpcClient.FollowWorkoutTO request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return assignWorkoutAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::GrpcClient.FollowWorkoutTO> assignWorkoutAsync(global::GrpcClient.FollowWorkoutTO request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_assignWorkout, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::GrpcClient.WorkoutO editWorkout(global::GrpcClient.WorkoutO request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return editWorkout(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::GrpcClient.WorkoutO editWorkout(global::GrpcClient.WorkoutO request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_editWorkout, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::GrpcClient.WorkoutO> editWorkoutAsync(global::GrpcClient.WorkoutO request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return editWorkoutAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::GrpcClient.WorkoutO> editWorkoutAsync(global::GrpcClient.WorkoutO request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_editWorkout, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::GrpcClient.EmptyPar deleteWorkout(global::GrpcClient.WorkoutId request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return deleteWorkout(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::GrpcClient.EmptyPar deleteWorkout(global::GrpcClient.WorkoutId request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_deleteWorkout, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::GrpcClient.EmptyPar> deleteWorkoutAsync(global::GrpcClient.WorkoutId request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return deleteWorkoutAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::GrpcClient.EmptyPar> deleteWorkoutAsync(global::GrpcClient.WorkoutId request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_deleteWorkout, null, options, request);
      }
      /// <summary>Creates a new instance of client from given <c>ClientBaseConfiguration</c>.</summary>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      protected override LogicServerClient NewInstance(ClientBaseConfiguration configuration)
      {
        return new LogicServerClient(configuration);
      }
    }

  }
}
#endregion
