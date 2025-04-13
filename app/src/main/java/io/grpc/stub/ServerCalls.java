package io.grpc.stub;

import com.google.common.base.Preconditions;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.Status;
import io.grpc.StatusException;
import io.grpc.StatusRuntimeException;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ServerCalls {

    public interface BidiStreamingMethod<ReqT, RespT> extends StreamingRequestMethod<ReqT, RespT> {
    }

    public interface ClientStreamingMethod<ReqT, RespT> extends StreamingRequestMethod<ReqT, RespT> {
    }

    public static class NoopStreamObserver<V> implements StreamObserver<V> {
        @Override // io.grpc.stub.StreamObserver
        /* renamed from: a */
        public void mo31322a() {
        }

        @Override // io.grpc.stub.StreamObserver
        public void onError(Throwable th) {
        }

        @Override // io.grpc.stub.StreamObserver
        public void onNext(V v) {
        }
    }

    public static final class ServerCallStreamObserverImpl<ReqT, RespT> extends ServerCallStreamObserver<RespT> {

        /* renamed from: a */
        public final ServerCall<ReqT, RespT> f59501a;

        /* renamed from: b */
        public final boolean f59502b;

        /* renamed from: c */
        public volatile boolean f59503c;

        /* renamed from: d */
        public boolean f59504d;

        /* renamed from: e */
        public boolean f59505e = false;

        /* renamed from: f */
        public boolean f59506f = false;

        public ServerCallStreamObserverImpl(ServerCall<ReqT, RespT> serverCall, boolean z) {
            this.f59501a = serverCall;
            this.f59502b = z;
        }

        @Override // io.grpc.stub.StreamObserver
        /* renamed from: a */
        public void mo31322a() {
            this.f59501a.mo30861a(Status.f58278e, new Metadata());
            this.f59506f = true;
        }

        @Override // io.grpc.stub.StreamObserver
        public void onError(Throwable th) {
            Metadata metadata;
            List<Status> list = Status.f58277d;
            Throwable th2 = th;
            while (true) {
                if (th2 == null) {
                    metadata = null;
                    break;
                } else if (th2 instanceof StatusException) {
                    metadata = ((StatusException) th2).f58316c;
                    break;
                } else {
                    if (th2 instanceof StatusRuntimeException) {
                        metadata = ((StatusRuntimeException) th2).f58319c;
                        break;
                    }
                    th2 = th2.getCause();
                }
            }
            if (metadata == null) {
                metadata = new Metadata();
            }
            this.f59501a.mo30861a(Status.m30943d(th), metadata);
            this.f59505e = true;
        }

        @Override // io.grpc.stub.StreamObserver
        public void onNext(RespT respt) {
            if (this.f59503c && this.f59502b) {
                throw new StatusRuntimeException(Status.f58279f.m30947g("call already cancelled. Use ServerCallStreamObserver.setOnCancelHandler() to disable this exception"));
            }
            Preconditions.m11192p(!this.f59505e, "Stream was terminated by error, no further calls are allowed");
            Preconditions.m11192p(!this.f59506f, "Stream is already completed, no further calls are allowed");
            if (!this.f59504d) {
                this.f59501a.mo30866h(new Metadata());
                this.f59504d = true;
            }
            this.f59501a.mo30867i(respt);
        }
    }

    public interface ServerStreamingMethod<ReqT, RespT> extends UnaryRequestMethod<ReqT, RespT> {
    }

    public interface StreamingRequestMethod<ReqT, RespT> {
    }

    public static final class StreamingServerCallHandler<ReqT, RespT> implements ServerCallHandler<ReqT, RespT> {

        public final class StreamingServerCallListener extends ServerCall.Listener<ReqT> {

            /* renamed from: a */
            public final StreamObserver<ReqT> f59507a;

            /* renamed from: b */
            public final ServerCallStreamObserverImpl<ReqT, RespT> f59508b;

            /* renamed from: c */
            public final ServerCall<ReqT, RespT> f59509c;

            /* renamed from: d */
            public boolean f59510d;

            @Override // io.grpc.ServerCall.Listener
            /* renamed from: a */
            public void mo30846a() {
                Objects.requireNonNull(this.f59508b);
                this.f59508b.f59503c = true;
                if (this.f59510d) {
                    return;
                }
                this.f59507a.onError(new StatusRuntimeException(Status.f58279f.m30947g("client cancelled")));
            }

            @Override // io.grpc.ServerCall.Listener
            /* renamed from: b */
            public void mo30847b() {
                Objects.requireNonNull(this.f59508b);
            }

            @Override // io.grpc.ServerCall.Listener
            /* renamed from: c */
            public void mo30848c() {
                this.f59510d = true;
                this.f59507a.mo31322a();
            }

            @Override // io.grpc.ServerCall.Listener
            /* renamed from: d */
            public void mo30849d(ReqT reqt) {
                this.f59507a.onNext(reqt);
                Objects.requireNonNull(this.f59508b);
                this.f59509c.mo30865g(1);
            }

            @Override // io.grpc.ServerCall.Listener
            /* renamed from: e */
            public void mo30850e() {
                Objects.requireNonNull(this.f59508b);
            }
        }

        @Override // io.grpc.ServerCallHandler
        /* renamed from: a */
        public ServerCall.Listener<ReqT> mo30934a(ServerCall<ReqT, RespT> serverCall, Metadata metadata) {
            throw null;
        }
    }

    public interface UnaryMethod<ReqT, RespT> extends UnaryRequestMethod<ReqT, RespT> {
    }

    public interface UnaryRequestMethod<ReqT, RespT> {
    }

    public static final class UnaryServerCallHandler<ReqT, RespT> implements ServerCallHandler<ReqT, RespT> {

        public final class UnaryServerCallListener extends ServerCall.Listener<ReqT> {

            /* renamed from: a */
            public final ServerCall<ReqT, RespT> f59511a;

            /* renamed from: b */
            public final ServerCallStreamObserverImpl<ReqT, RespT> f59512b;

            /* renamed from: c */
            public boolean f59513c = true;

            /* renamed from: d */
            public ReqT f59514d;

            public UnaryServerCallListener(ServerCallStreamObserverImpl<ReqT, RespT> serverCallStreamObserverImpl, ServerCall<ReqT, RespT> serverCall) {
                this.f59511a = serverCall;
                this.f59512b = serverCallStreamObserverImpl;
            }

            @Override // io.grpc.ServerCall.Listener
            /* renamed from: a */
            public void mo30846a() {
                Objects.requireNonNull(this.f59512b);
                this.f59512b.f59503c = true;
            }

            @Override // io.grpc.ServerCall.Listener
            /* renamed from: b */
            public void mo30847b() {
                Objects.requireNonNull(this.f59512b);
            }

            @Override // io.grpc.ServerCall.Listener
            /* renamed from: c */
            public void mo30848c() {
                if (this.f59513c) {
                    if (this.f59514d == null) {
                        this.f59511a.mo30861a(Status.f58286m.m30947g("Half-closed without a request"), new Metadata());
                    } else {
                        Objects.requireNonNull(UnaryServerCallHandler.this);
                        throw null;
                    }
                }
            }

            @Override // io.grpc.ServerCall.Listener
            /* renamed from: d */
            public void mo30849d(ReqT reqt) {
                if (this.f59514d == null) {
                    this.f59514d = reqt;
                } else {
                    this.f59511a.mo30861a(Status.f58286m.m30947g("Too many requests"), new Metadata());
                    this.f59513c = false;
                }
            }

            @Override // io.grpc.ServerCall.Listener
            /* renamed from: e */
            public void mo30850e() {
                Objects.requireNonNull(this.f59512b);
            }
        }

        @Override // io.grpc.ServerCallHandler
        /* renamed from: a */
        public ServerCall.Listener<ReqT> mo30934a(ServerCall<ReqT, RespT> serverCall, Metadata metadata) {
            MethodDescriptor.MethodType methodType = serverCall.mo30870d().f58221a;
            Objects.requireNonNull(methodType);
            Preconditions.m11179c(methodType == MethodDescriptor.MethodType.UNARY || methodType == MethodDescriptor.MethodType.SERVER_STREAMING, "asyncUnaryRequestCall is only for clientSendsOneMessage methods");
            ServerCallStreamObserverImpl serverCallStreamObserverImpl = new ServerCallStreamObserverImpl(serverCall, false);
            serverCall.mo30865g(2);
            return new UnaryServerCallListener(serverCallStreamObserverImpl, serverCall);
        }
    }
}
