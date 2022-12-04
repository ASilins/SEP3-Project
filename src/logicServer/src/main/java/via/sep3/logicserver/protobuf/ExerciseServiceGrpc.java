package via.sep3.logicserver.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: LogicServer.proto")
public final class ExerciseServiceGrpc {

  private ExerciseServiceGrpc() {}

  public static final String SERVICE_NAME = "ExerciseService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.ExerciseTO,
      via.sep3.logicserver.protobuf.ExerciseTO> getCreateExerciseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createExercise",
      requestType = via.sep3.logicserver.protobuf.ExerciseTO.class,
      responseType = via.sep3.logicserver.protobuf.ExerciseTO.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.ExerciseTO,
      via.sep3.logicserver.protobuf.ExerciseTO> getCreateExerciseMethod() {
    io.grpc.MethodDescriptor<via.sep3.logicserver.protobuf.ExerciseTO, via.sep3.logicserver.protobuf.ExerciseTO> getCreateExerciseMethod;
    if ((getCreateExerciseMethod = ExerciseServiceGrpc.getCreateExerciseMethod) == null) {
      synchronized (ExerciseServiceGrpc.class) {
        if ((getCreateExerciseMethod = ExerciseServiceGrpc.getCreateExerciseMethod) == null) {
          ExerciseServiceGrpc.getCreateExerciseMethod = getCreateExerciseMethod =
              io.grpc.MethodDescriptor.<via.sep3.logicserver.protobuf.ExerciseTO, via.sep3.logicserver.protobuf.ExerciseTO>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createExercise"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.logicserver.protobuf.ExerciseTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.logicserver.protobuf.ExerciseTO.getDefaultInstance()))
              .setSchemaDescriptor(new ExerciseServiceMethodDescriptorSupplier("createExercise"))
              .build();
        }
      }
    }
    return getCreateExerciseMethod;
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
    public void createExercise(via.sep3.logicserver.protobuf.ExerciseTO request,
        io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.ExerciseTO> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateExerciseMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateExerciseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.logicserver.protobuf.ExerciseTO,
                via.sep3.logicserver.protobuf.ExerciseTO>(
                  this, METHODID_CREATE_EXERCISE)))
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
    public void createExercise(via.sep3.logicserver.protobuf.ExerciseTO request,
        io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.ExerciseTO> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateExerciseMethod(), getCallOptions()), request, responseObserver);
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
    public via.sep3.logicserver.protobuf.ExerciseTO createExercise(via.sep3.logicserver.protobuf.ExerciseTO request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateExerciseMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.logicserver.protobuf.ExerciseTO> createExercise(
        via.sep3.logicserver.protobuf.ExerciseTO request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateExerciseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_EXERCISE = 0;

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
          serviceImpl.createExercise((via.sep3.logicserver.protobuf.ExerciseTO) request,
              (io.grpc.stub.StreamObserver<via.sep3.logicserver.protobuf.ExerciseTO>) responseObserver);
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
      return via.sep3.logicserver.protobuf.LogicServer.getDescriptor();
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
              .build();
        }
      }
    }
    return result;
  }
}
