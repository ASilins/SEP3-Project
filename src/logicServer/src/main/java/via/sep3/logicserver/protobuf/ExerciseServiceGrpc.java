package via.sep3.logicserver.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: ExerciseService.proto")
public final class ExerciseServiceGrpc {

  private ExerciseServiceGrpc() {}

  public static final String SERVICE_NAME = "ExerciseService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.ExerciseObj,
      via.sep3.logicserver.protobuf.ExerciseObj> getCreateExerciseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateExercise",
      requestType = via.sep3.logicserver.protobuf.ExerciseObj.class,
      responseType = via.sep3.logicserver.protobuf.ExerciseObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.ExerciseObj,
      via.sep3.logicserver.protobuf.ExerciseObj> getCreateExerciseMethod() {
    io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.ExerciseObj, via.sep3.logicserver.protobuf.ExerciseObj> getCreateExerciseMethod;
    if ((getCreateExerciseMethod = ExerciseServiceGrpc.getCreateExerciseMethod) == null) {
      synchronized (ExerciseServiceGrpc.class) {
        if ((getCreateExerciseMethod = ExerciseServiceGrpc.getCreateExerciseMethod) == null) {
          ExerciseServiceGrpc.getCreateExerciseMethod = getCreateExerciseMethod =
              io.grpc.MethodDescriptor.<via.sep3.logicserver.protobuf.ExerciseObj, via.sep3.logicserver.protobuf.ExerciseObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateExercise"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.logicserver.protobuf.ExerciseObj.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.logicserver.protobuf.ExerciseObj.getDefaultInstance()))
              .setSchemaDescriptor(new ExerciseServiceMethodDescriptorSupplier("CreateExercise"))
              .build();
        }
      }
    }
    return getCreateExerciseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.StringObj,
      via.sep3.logicserver.protobuf.Exercises> getGetExercisesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetExercises",
      requestType = via.sep3.logicserver.protobuf.StringObj.class,
      responseType = via.sep3.logicserver.protobuf.Exercises.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.StringObj,
      via.sep3.logicserver.protobuf.Exercises> getGetExercisesMethod() {
    io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.StringObj, via.sep3.logicserver.protobuf.Exercises> getGetExercisesMethod;
    if ((getGetExercisesMethod = ExerciseServiceGrpc.getGetExercisesMethod) == null) {
      synchronized (ExerciseServiceGrpc.class) {
        if ((getGetExercisesMethod = ExerciseServiceGrpc.getGetExercisesMethod) == null) {
          ExerciseServiceGrpc.getGetExercisesMethod = getGetExercisesMethod =
              io.grpc.MethodDescriptor.<via.sep3.logicserver.protobuf.StringObj, via.sep3.logicserver.protobuf.Exercises>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetExercises"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.logicserver.protobuf.StringObj.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.logicserver.protobuf.Exercises.getDefaultInstance()))
              .setSchemaDescriptor(new ExerciseServiceMethodDescriptorSupplier("GetExercises"))
              .build();
        }
      }
    }
    return getGetExercisesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.ExerciseObj,
      via.sep3.logicserver.protobuf.StringObj> getEditExerciseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditExercise",
      requestType = via.sep3.logicserver.protobuf.ExerciseObj.class,
      responseType = via.sep3.logicserver.protobuf.StringObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.ExerciseObj,
      via.sep3.logicserver.protobuf.StringObj> getEditExerciseMethod() {
    io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.ExerciseObj, via.sep3.logicserver.protobuf.StringObj> getEditExerciseMethod;
    if ((getEditExerciseMethod = ExerciseServiceGrpc.getEditExerciseMethod) == null) {
      synchronized (ExerciseServiceGrpc.class) {
        if ((getEditExerciseMethod = ExerciseServiceGrpc.getEditExerciseMethod) == null) {
          ExerciseServiceGrpc.getEditExerciseMethod = getEditExerciseMethod =
              io.grpc.MethodDescriptor.<via.sep3.logicserver.protobuf.ExerciseObj, via.sep3.logicserver.protobuf.StringObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditExercise"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.logicserver.protobuf.ExerciseObj.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.logicserver.protobuf.StringObj.getDefaultInstance()))
              .setSchemaDescriptor(new ExerciseServiceMethodDescriptorSupplier("EditExercise"))
              .build();
        }
      }
    }
    return getEditExerciseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.IntObj,
      via.sep3.logicserver.protobuf.StringObj> getDeleteExerciseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteExercise",
      requestType = via.sep3.logicserver.protobuf.IntObj.class,
      responseType = via.sep3.logicserver.protobuf.StringObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.IntObj,
      via.sep3.logicserver.protobuf.StringObj> getDeleteExerciseMethod() {
    io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.IntObj, via.sep3.logicserver.protobuf.StringObj> getDeleteExerciseMethod;
    if ((getDeleteExerciseMethod = ExerciseServiceGrpc.getDeleteExerciseMethod) == null) {
      synchronized (ExerciseServiceGrpc.class) {
        if ((getDeleteExerciseMethod = ExerciseServiceGrpc.getDeleteExerciseMethod) == null) {
          ExerciseServiceGrpc.getDeleteExerciseMethod = getDeleteExerciseMethod =
              io.grpc.MethodDescriptor.<via.sep3.logicserver.protobuf.IntObj, via.sep3.logicserver.protobuf.StringObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteExercise"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.logicserver.protobuf.IntObj.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.logicserver.protobuf.StringObj.getDefaultInstance()))
              .setSchemaDescriptor(new ExerciseServiceMethodDescriptorSupplier("DeleteExercise"))
              .build();
        }
      }
    }
    return getDeleteExerciseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExerciseServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExerciseServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExerciseServiceStub>() {
        @java.lang.Override
        public ExerciseServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExerciseServiceStub(channel, callOptions);
        }
      };
    return ExerciseServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExerciseServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExerciseServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExerciseServiceBlockingStub>() {
        @java.lang.Override
        public ExerciseServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExerciseServiceBlockingStub(channel, callOptions);
        }
      };
    return ExerciseServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExerciseServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExerciseServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExerciseServiceFutureStub>() {
        @java.lang.Override
        public ExerciseServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExerciseServiceFutureStub(channel, callOptions);
        }
      };
    return ExerciseServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ExerciseServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createExercise(via.sep3.logicserver.protobuf.ExerciseObj request,
        io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.ExerciseObj> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateExerciseMethod(), responseObserver);
    }

    /**
     */
    public void getExercises(via.sep3.logicserver.protobuf.StringObj request,
        io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.Exercises> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetExercisesMethod(), responseObserver);
    }

    /**
     */
    public void editExercise(via.sep3.logicserver.protobuf.ExerciseObj request,
        io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.StringObj> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditExerciseMethod(), responseObserver);
    }

    /**
     */
    public void deleteExercise(via.sep3.logicserver.protobuf.IntObj request,
        io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.StringObj> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteExerciseMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateExerciseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.logicserver.protobuf.ExerciseObj,
                via.sep3.logicserver.protobuf.ExerciseObj>(
                  this, METHODID_CREATE_EXERCISE)))
          .addMethod(
            getGetExercisesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.logicserver.protobuf.StringObj,
                via.sep3.logicserver.protobuf.Exercises>(
                  this, METHODID_GET_EXERCISES)))
          .addMethod(
            getEditExerciseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.logicserver.protobuf.ExerciseObj,
                via.sep3.logicserver.protobuf.StringObj>(
                  this, METHODID_EDIT_EXERCISE)))
          .addMethod(
            getDeleteExerciseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.logicserver.protobuf.IntObj,
                via.sep3.logicserver.protobuf.StringObj>(
                  this, METHODID_DELETE_EXERCISE)))
          .build();
    }
  }

  /**
   */
  public static final class ExerciseServiceStub extends io.grpc.stub.AbstractAsyncStub<ExerciseServiceStub> {
    private ExerciseServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExerciseServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExerciseServiceStub(channel, callOptions);
    }

    /**
     */
    public void createExercise(via.sep3.logicserver.protobuf.ExerciseObj request,
        io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.ExerciseObj> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateExerciseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getExercises(via.sep3.logicserver.protobuf.StringObj request,
        io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.Exercises> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetExercisesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editExercise(via.sep3.logicserver.protobuf.ExerciseObj request,
        io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.StringObj> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditExerciseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteExercise(via.sep3.logicserver.protobuf.IntObj request,
        io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.StringObj> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteExerciseMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ExerciseServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ExerciseServiceBlockingStub> {
    private ExerciseServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExerciseServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExerciseServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sep3.logicserver.protobuf.ExerciseObj createExercise(via.sep3.logicserver.protobuf.ExerciseObj request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateExerciseMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.logicserver.protobuf.Exercises getExercises(via.sep3.logicserver.protobuf.StringObj request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetExercisesMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.logicserver.protobuf.StringObj editExercise(via.sep3.logicserver.protobuf.ExerciseObj request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditExerciseMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.logicserver.protobuf.StringObj deleteExercise(via.sep3.logicserver.protobuf.IntObj request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteExerciseMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ExerciseServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ExerciseServiceFutureStub> {
    private ExerciseServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExerciseServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExerciseServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.logicserver.protobuf.ExerciseObj> createExercise(
        via.sep3.logicserver.protobuf.ExerciseObj request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateExerciseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.logicserver.protobuf.Exercises> getExercises(
        via.sep3.logicserver.protobuf.StringObj request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetExercisesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.logicserver.protobuf.StringObj> editExercise(
        via.sep3.logicserver.protobuf.ExerciseObj request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditExerciseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.logicserver.protobuf.StringObj> deleteExercise(
        via.sep3.logicserver.protobuf.IntObj request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteExerciseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_EXERCISE = 0;
  private static final int METHODID_GET_EXERCISES = 1;
  private static final int METHODID_EDIT_EXERCISE = 2;
  private static final int METHODID_DELETE_EXERCISE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ExerciseServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ExerciseServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_EXERCISE:
          serviceImpl.createExercise((via.sep3.logicserver.protobuf.ExerciseObj) request,
              (io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.ExerciseObj>) responseObserver);
          break;
        case METHODID_GET_EXERCISES:
          serviceImpl.getExercises((via.sep3.logicserver.protobuf.StringObj) request,
              (io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.Exercises>) responseObserver);
          break;
        case METHODID_EDIT_EXERCISE:
          serviceImpl.editExercise((via.sep3.logicserver.protobuf.ExerciseObj) request,
              (io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.StringObj>) responseObserver);
          break;
        case METHODID_DELETE_EXERCISE:
          serviceImpl.deleteExercise((via.sep3.logicserver.protobuf.IntObj) request,
              (io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.StringObj>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ExerciseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExerciseServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sep3.logicserver.protobuf.ExerciseServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ExerciseService");
    }
  }

  private static final class ExerciseServiceFileDescriptorSupplier
      extends ExerciseServiceBaseDescriptorSupplier {
    ExerciseServiceFileDescriptorSupplier() {}
  }

  private static final class ExerciseServiceMethodDescriptorSupplier
      extends ExerciseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ExerciseServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ExerciseServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExerciseServiceFileDescriptorSupplier())
              .addMethod(getCreateExerciseMethod())
              .addMethod(getGetExercisesMethod())
              .addMethod(getEditExerciseMethod())
              .addMethod(getDeleteExerciseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
