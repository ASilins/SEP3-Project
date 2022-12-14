package via.sep3.logicserver.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: WorkoutService.proto")
public final class WorkoutServiceGrpc {

  private WorkoutServiceGrpc() {}

  public static final String SERVICE_NAME = "WorkoutService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.StringObj,
      via.sep3.logicserver.protobuf.Workouts> getGetWorkoutsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWorkouts",
      requestType = via.sep3.logicserver.protobuf.StringObj.class,
      responseType = via.sep3.logicserver.protobuf.Workouts.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.StringObj,
      via.sep3.logicserver.protobuf.Workouts> getGetWorkoutsMethod() {
    io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.StringObj, via.sep3.logicserver.protobuf.Workouts> getGetWorkoutsMethod;
    if ((getGetWorkoutsMethod = WorkoutServiceGrpc.getGetWorkoutsMethod) == null) {
      synchronized (WorkoutServiceGrpc.class) {
        if ((getGetWorkoutsMethod = WorkoutServiceGrpc.getGetWorkoutsMethod) == null) {
          WorkoutServiceGrpc.getGetWorkoutsMethod = getGetWorkoutsMethod =
              io.grpc.MethodDescriptor.<via.sep3.logicserver.protobuf.StringObj, via.sep3.logicserver.protobuf.Workouts>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWorkouts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.logicserver.protobuf.StringObj.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.logicserver.protobuf.Workouts.getDefaultInstance()))
              .setSchemaDescriptor(new WorkoutServiceMethodDescriptorSupplier("GetWorkouts"))
              .build();
        }
      }
    }
    return getGetWorkoutsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.IntObj,
      via.sep3.logicserver.protobuf.WorkoutObj> getGetWorkoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWorkout",
      requestType = via.sep3.logicserver.protobuf.IntObj.class,
      responseType = via.sep3.logicserver.protobuf.WorkoutObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.IntObj,
      via.sep3.logicserver.protobuf.WorkoutObj> getGetWorkoutMethod() {
    io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.IntObj, via.sep3.logicserver.protobuf.WorkoutObj> getGetWorkoutMethod;
    if ((getGetWorkoutMethod = WorkoutServiceGrpc.getGetWorkoutMethod) == null) {
      synchronized (WorkoutServiceGrpc.class) {
        if ((getGetWorkoutMethod = WorkoutServiceGrpc.getGetWorkoutMethod) == null) {
          WorkoutServiceGrpc.getGetWorkoutMethod = getGetWorkoutMethod =
              io.grpc.MethodDescriptor.<via.sep3.logicserver.protobuf.IntObj, via.sep3.logicserver.protobuf.WorkoutObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWorkout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.logicserver.protobuf.IntObj.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.logicserver.protobuf.WorkoutObj.getDefaultInstance()))
              .setSchemaDescriptor(new WorkoutServiceMethodDescriptorSupplier("GetWorkout"))
              .build();
        }
      }
    }
    return getGetWorkoutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.AssignWorkoutObj,
      via.sep3.logicserver.protobuf.AssignWorkoutObj> getAssignWorkoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignWorkout",
      requestType = via.sep3.logicserver.protobuf.AssignWorkoutObj.class,
      responseType = via.sep3.logicserver.protobuf.AssignWorkoutObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.AssignWorkoutObj,
      via.sep3.logicserver.protobuf.AssignWorkoutObj> getAssignWorkoutMethod() {
    io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.AssignWorkoutObj, via.sep3.logicserver.protobuf.AssignWorkoutObj> getAssignWorkoutMethod;
    if ((getAssignWorkoutMethod = WorkoutServiceGrpc.getAssignWorkoutMethod) == null) {
      synchronized (WorkoutServiceGrpc.class) {
        if ((getAssignWorkoutMethod = WorkoutServiceGrpc.getAssignWorkoutMethod) == null) {
          WorkoutServiceGrpc.getAssignWorkoutMethod = getAssignWorkoutMethod =
              io.grpc.MethodDescriptor.<via.sep3.logicserver.protobuf.AssignWorkoutObj, via.sep3.logicserver.protobuf.AssignWorkoutObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignWorkout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.logicserver.protobuf.AssignWorkoutObj.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.logicserver.protobuf.AssignWorkoutObj.getDefaultInstance()))
              .setSchemaDescriptor(new WorkoutServiceMethodDescriptorSupplier("AssignWorkout"))
              .build();
        }
      }
    }
    return getAssignWorkoutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.WorkoutObj,
      via.sep3.logicserver.protobuf.StringObj> getEditWorkoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditWorkout",
      requestType = via.sep3.logicserver.protobuf.WorkoutObj.class,
      responseType = via.sep3.logicserver.protobuf.StringObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.WorkoutObj,
      via.sep3.logicserver.protobuf.StringObj> getEditWorkoutMethod() {
    io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.WorkoutObj, via.sep3.logicserver.protobuf.StringObj> getEditWorkoutMethod;
    if ((getEditWorkoutMethod = WorkoutServiceGrpc.getEditWorkoutMethod) == null) {
      synchronized (WorkoutServiceGrpc.class) {
        if ((getEditWorkoutMethod = WorkoutServiceGrpc.getEditWorkoutMethod) == null) {
          WorkoutServiceGrpc.getEditWorkoutMethod = getEditWorkoutMethod =
              io.grpc.MethodDescriptor.<via.sep3.logicserver.protobuf.WorkoutObj, via.sep3.logicserver.protobuf.StringObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditWorkout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.logicserver.protobuf.WorkoutObj.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.logicserver.protobuf.StringObj.getDefaultInstance()))
              .setSchemaDescriptor(new WorkoutServiceMethodDescriptorSupplier("EditWorkout"))
              .build();
        }
      }
    }
    return getEditWorkoutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.IntObj,
      via.sep3.logicserver.protobuf.StringObj> getDeleteWorkoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteWorkout",
      requestType = via.sep3.logicserver.protobuf.IntObj.class,
      responseType = via.sep3.logicserver.protobuf.StringObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.IntObj,
      via.sep3.logicserver.protobuf.StringObj> getDeleteWorkoutMethod() {
    io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.IntObj, via.sep3.logicserver.protobuf.StringObj> getDeleteWorkoutMethod;
    if ((getDeleteWorkoutMethod = WorkoutServiceGrpc.getDeleteWorkoutMethod) == null) {
      synchronized (WorkoutServiceGrpc.class) {
        if ((getDeleteWorkoutMethod = WorkoutServiceGrpc.getDeleteWorkoutMethod) == null) {
          WorkoutServiceGrpc.getDeleteWorkoutMethod = getDeleteWorkoutMethod =
              io.grpc.MethodDescriptor.<via.sep3.logicserver.protobuf.IntObj, via.sep3.logicserver.protobuf.StringObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteWorkout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.logicserver.protobuf.IntObj.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.logicserver.protobuf.StringObj.getDefaultInstance()))
              .setSchemaDescriptor(new WorkoutServiceMethodDescriptorSupplier("DeleteWorkout"))
              .build();
        }
      }
    }
    return getDeleteWorkoutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.WorkoutObj,
      via.sep3.logicserver.protobuf.WorkoutObj> getCreateWorkoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWorkout",
      requestType = via.sep3.logicserver.protobuf.WorkoutObj.class,
      responseType = via.sep3.logicserver.protobuf.WorkoutObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.WorkoutObj,
      via.sep3.logicserver.protobuf.WorkoutObj> getCreateWorkoutMethod() {
    io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.WorkoutObj, via.sep3.logicserver.protobuf.WorkoutObj> getCreateWorkoutMethod;
    if ((getCreateWorkoutMethod = WorkoutServiceGrpc.getCreateWorkoutMethod) == null) {
      synchronized (WorkoutServiceGrpc.class) {
        if ((getCreateWorkoutMethod = WorkoutServiceGrpc.getCreateWorkoutMethod) == null) {
          WorkoutServiceGrpc.getCreateWorkoutMethod = getCreateWorkoutMethod =
              io.grpc.MethodDescriptor.<via.sep3.logicserver.protobuf.WorkoutObj, via.sep3.logicserver.protobuf.WorkoutObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWorkout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.logicserver.protobuf.WorkoutObj.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.logicserver.protobuf.WorkoutObj.getDefaultInstance()))
              .setSchemaDescriptor(new WorkoutServiceMethodDescriptorSupplier("CreateWorkout"))
              .build();
        }
      }
    }
    return getCreateWorkoutMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WorkoutServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkoutServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkoutServiceStub>() {
        @java.lang.Override
        public WorkoutServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkoutServiceStub(channel, callOptions);
        }
      };
    return WorkoutServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WorkoutServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkoutServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkoutServiceBlockingStub>() {
        @java.lang.Override
        public WorkoutServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkoutServiceBlockingStub(channel, callOptions);
        }
      };
    return WorkoutServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WorkoutServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkoutServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkoutServiceFutureStub>() {
        @java.lang.Override
        public WorkoutServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkoutServiceFutureStub(channel, callOptions);
        }
      };
    return WorkoutServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class WorkoutServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getWorkouts(via.sep3.logicserver.protobuf.StringObj request,
        io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.Workouts> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWorkoutsMethod(), responseObserver);
    }

    /**
     */
    public void getWorkout(via.sep3.logicserver.protobuf.IntObj request,
        io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.WorkoutObj> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWorkoutMethod(), responseObserver);
    }

    /**
     */
    public void assignWorkout(via.sep3.logicserver.protobuf.AssignWorkoutObj request,
        io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.AssignWorkoutObj> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignWorkoutMethod(), responseObserver);
    }

    /**
     */
    public void editWorkout(via.sep3.logicserver.protobuf.WorkoutObj request,
        io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.StringObj> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditWorkoutMethod(), responseObserver);
    }

    /**
     */
    public void deleteWorkout(via.sep3.logicserver.protobuf.IntObj request,
        io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.StringObj> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteWorkoutMethod(), responseObserver);
    }

    /**
     */
    public void createWorkout(via.sep3.logicserver.protobuf.WorkoutObj request,
        io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.WorkoutObj> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateWorkoutMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetWorkoutsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.logicserver.protobuf.StringObj,
                via.sep3.logicserver.protobuf.Workouts>(
                  this, METHODID_GET_WORKOUTS)))
          .addMethod(
            getGetWorkoutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.logicserver.protobuf.IntObj,
                via.sep3.logicserver.protobuf.WorkoutObj>(
                  this, METHODID_GET_WORKOUT)))
          .addMethod(
            getAssignWorkoutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.logicserver.protobuf.AssignWorkoutObj,
                via.sep3.logicserver.protobuf.AssignWorkoutObj>(
                  this, METHODID_ASSIGN_WORKOUT)))
          .addMethod(
            getEditWorkoutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.logicserver.protobuf.WorkoutObj,
                via.sep3.logicserver.protobuf.StringObj>(
                  this, METHODID_EDIT_WORKOUT)))
          .addMethod(
            getDeleteWorkoutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.logicserver.protobuf.IntObj,
                via.sep3.logicserver.protobuf.StringObj>(
                  this, METHODID_DELETE_WORKOUT)))
          .addMethod(
            getCreateWorkoutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.logicserver.protobuf.WorkoutObj,
                via.sep3.logicserver.protobuf.WorkoutObj>(
                  this, METHODID_CREATE_WORKOUT)))
          .build();
    }
  }

  /**
   */
  public static final class WorkoutServiceStub extends io.grpc.stub.AbstractAsyncStub<WorkoutServiceStub> {
    private WorkoutServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkoutServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkoutServiceStub(channel, callOptions);
    }

    /**
     */
    public void getWorkouts(via.sep3.logicserver.protobuf.StringObj request,
        io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.Workouts> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWorkoutsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWorkout(via.sep3.logicserver.protobuf.IntObj request,
        io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.WorkoutObj> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWorkoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void assignWorkout(via.sep3.logicserver.protobuf.AssignWorkoutObj request,
        io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.AssignWorkoutObj> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignWorkoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editWorkout(via.sep3.logicserver.protobuf.WorkoutObj request,
        io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.StringObj> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditWorkoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteWorkout(via.sep3.logicserver.protobuf.IntObj request,
        io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.StringObj> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteWorkoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createWorkout(via.sep3.logicserver.protobuf.WorkoutObj request,
        io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.WorkoutObj> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateWorkoutMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WorkoutServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<WorkoutServiceBlockingStub> {
    private WorkoutServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkoutServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkoutServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sep3.logicserver.protobuf.Workouts getWorkouts(via.sep3.logicserver.protobuf.StringObj request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWorkoutsMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.logicserver.protobuf.WorkoutObj getWorkout(via.sep3.logicserver.protobuf.IntObj request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWorkoutMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.logicserver.protobuf.AssignWorkoutObj assignWorkout(via.sep3.logicserver.protobuf.AssignWorkoutObj request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignWorkoutMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.logicserver.protobuf.StringObj editWorkout(via.sep3.logicserver.protobuf.WorkoutObj request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditWorkoutMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.logicserver.protobuf.StringObj deleteWorkout(via.sep3.logicserver.protobuf.IntObj request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteWorkoutMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.logicserver.protobuf.WorkoutObj createWorkout(via.sep3.logicserver.protobuf.WorkoutObj request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateWorkoutMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WorkoutServiceFutureStub extends io.grpc.stub.AbstractFutureStub<WorkoutServiceFutureStub> {
    private WorkoutServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkoutServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkoutServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.logicserver.protobuf.Workouts> getWorkouts(
        via.sep3.logicserver.protobuf.StringObj request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWorkoutsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.logicserver.protobuf.WorkoutObj> getWorkout(
        via.sep3.logicserver.protobuf.IntObj request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWorkoutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.logicserver.protobuf.AssignWorkoutObj> assignWorkout(
        via.sep3.logicserver.protobuf.AssignWorkoutObj request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignWorkoutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.logicserver.protobuf.StringObj> editWorkout(
        via.sep3.logicserver.protobuf.WorkoutObj request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditWorkoutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.logicserver.protobuf.StringObj> deleteWorkout(
        via.sep3.logicserver.protobuf.IntObj request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteWorkoutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.logicserver.protobuf.WorkoutObj> createWorkout(
        via.sep3.logicserver.protobuf.WorkoutObj request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateWorkoutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_WORKOUTS = 0;
  private static final int METHODID_GET_WORKOUT = 1;
  private static final int METHODID_ASSIGN_WORKOUT = 2;
  private static final int METHODID_EDIT_WORKOUT = 3;
  private static final int METHODID_DELETE_WORKOUT = 4;
  private static final int METHODID_CREATE_WORKOUT = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WorkoutServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WorkoutServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_WORKOUTS:
          serviceImpl.getWorkouts((via.sep3.logicserver.protobuf.StringObj) request,
              (io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.Workouts>) responseObserver);
          break;
        case METHODID_GET_WORKOUT:
          serviceImpl.getWorkout((via.sep3.logicserver.protobuf.IntObj) request,
              (io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.WorkoutObj>) responseObserver);
          break;
        case METHODID_ASSIGN_WORKOUT:
          serviceImpl.assignWorkout((via.sep3.logicserver.protobuf.AssignWorkoutObj) request,
              (io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.AssignWorkoutObj>) responseObserver);
          break;
        case METHODID_EDIT_WORKOUT:
          serviceImpl.editWorkout((via.sep3.logicserver.protobuf.WorkoutObj) request,
              (io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.StringObj>) responseObserver);
          break;
        case METHODID_DELETE_WORKOUT:
          serviceImpl.deleteWorkout((via.sep3.logicserver.protobuf.IntObj) request,
              (io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.StringObj>) responseObserver);
          break;
        case METHODID_CREATE_WORKOUT:
          serviceImpl.createWorkout((via.sep3.logicserver.protobuf.WorkoutObj) request,
              (io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.WorkoutObj>) responseObserver);
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

  private static abstract class WorkoutServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WorkoutServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sep3.logicserver.protobuf.WorkoutServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WorkoutService");
    }
  }

  private static final class WorkoutServiceFileDescriptorSupplier
      extends WorkoutServiceBaseDescriptorSupplier {
    WorkoutServiceFileDescriptorSupplier() {}
  }

  private static final class WorkoutServiceMethodDescriptorSupplier
      extends WorkoutServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WorkoutServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (WorkoutServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WorkoutServiceFileDescriptorSupplier())
              .addMethod(getGetWorkoutsMethod())
              .addMethod(getGetWorkoutMethod())
              .addMethod(getAssignWorkoutMethod())
              .addMethod(getEditWorkoutMethod())
              .addMethod(getDeleteWorkoutMethod())
              .addMethod(getCreateWorkoutMethod())
              .build();
        }
      }
    }
    return result;
  }
}
