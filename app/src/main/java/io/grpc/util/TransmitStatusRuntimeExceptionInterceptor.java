package io.grpc.util;

import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import io.grpc.Attributes;
import io.grpc.ExperimentalApi;
import io.grpc.ForwardingServerCall;
import io.grpc.ForwardingServerCallListener;
import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.internal.SerializingExecutor;
import java.util.concurrent.ExecutionException;
import javax.annotation.Nullable;

@ExperimentalApi
/* loaded from: classes3.dex */
public final class TransmitStatusRuntimeExceptionInterceptor implements ServerInterceptor {

    public static class SerializingServerCall<ReqT, RespT> extends ForwardingServerCall.SimpleForwardingServerCall<ReqT, RespT> {

        /* renamed from: b */
        public final SerializingExecutor f59541b;

        /* renamed from: c */
        public boolean f59542c;

        public SerializingServerCall(ServerCall<ReqT, RespT> serverCall) {
            super(serverCall);
            this.f59541b = new SerializingExecutor(MoreExecutors.m12201a());
            this.f59542c = false;
        }

        @Override // io.grpc.ForwardingServerCall, io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
        /* renamed from: a */
        public void mo30861a(final Status status, final Metadata metadata) {
            this.f59541b.execute(new Runnable() { // from class: io.grpc.util.TransmitStatusRuntimeExceptionInterceptor.SerializingServerCall.4
                @Override // java.lang.Runnable
                public void run() {
                    SerializingServerCall serializingServerCall = SerializingServerCall.this;
                    if (serializingServerCall.f59542c) {
                        return;
                    }
                    serializingServerCall.f59542c = true;
                    SerializingServerCall.super.mo30861a(status, metadata);
                }
            });
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.grpc.ForwardingServerCall, io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
        /* renamed from: b */
        public Attributes mo30862b() {
            final SettableFuture settableFuture = new SettableFuture();
            this.f59541b.execute(new Runnable() { // from class: io.grpc.util.TransmitStatusRuntimeExceptionInterceptor.SerializingServerCall.9
                @Override // java.lang.Runnable
                public void run() {
                    settableFuture.mo12149n(SerializingServerCall.super.mo30862b());
                }
            });
            try {
                return (Attributes) settableFuture.get();
            } catch (InterruptedException e2) {
                throw new RuntimeException("Encountered error during serialized access", e2);
            } catch (ExecutionException e3) {
                throw new RuntimeException("Encountered error during serialized access", e3);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.grpc.ForwardingServerCall, io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
        @Nullable
        /* renamed from: c */
        public String mo30863c() {
            final SettableFuture settableFuture = new SettableFuture();
            this.f59541b.execute(new Runnable() { // from class: io.grpc.util.TransmitStatusRuntimeExceptionInterceptor.SerializingServerCall.10
                @Override // java.lang.Runnable
                public void run() {
                    settableFuture.mo12149n(SerializingServerCall.super.mo30863c());
                }
            });
            try {
                return (String) settableFuture.get();
            } catch (InterruptedException e2) {
                throw new RuntimeException("Encountered error during serialized access", e2);
            } catch (ExecutionException e3) {
                throw new RuntimeException("Encountered error during serialized access", e3);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.grpc.ForwardingServerCall, io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
        /* renamed from: e */
        public boolean mo30864e() {
            final SettableFuture settableFuture = new SettableFuture();
            this.f59541b.execute(new Runnable() { // from class: io.grpc.util.TransmitStatusRuntimeExceptionInterceptor.SerializingServerCall.6
                @Override // java.lang.Runnable
                public void run() {
                    settableFuture.mo12149n(Boolean.valueOf(SerializingServerCall.super.mo30864e()));
                }
            });
            try {
                return ((Boolean) settableFuture.get()).booleanValue();
            } catch (InterruptedException e2) {
                throw new RuntimeException("Encountered error during serialized access", e2);
            } catch (ExecutionException e3) {
                throw new RuntimeException("Encountered error during serialized access", e3);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
        /* renamed from: f */
        public boolean mo30933f() {
            final SettableFuture settableFuture = new SettableFuture();
            this.f59541b.execute(new Runnable() { // from class: io.grpc.util.TransmitStatusRuntimeExceptionInterceptor.SerializingServerCall.5
                @Override // java.lang.Runnable
                public void run() {
                    settableFuture.mo12149n(Boolean.valueOf(SerializingServerCall.super.mo30933f()));
                }
            });
            try {
                return ((Boolean) settableFuture.get()).booleanValue();
            } catch (InterruptedException e2) {
                throw new RuntimeException("Encountered error during serialized access", e2);
            } catch (ExecutionException e3) {
                throw new RuntimeException("Encountered error during serialized access", e3);
            }
        }

        @Override // io.grpc.ForwardingServerCall, io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
        /* renamed from: g */
        public void mo30865g(final int i2) {
            this.f59541b.execute(new Runnable() { // from class: io.grpc.util.TransmitStatusRuntimeExceptionInterceptor.SerializingServerCall.2
                @Override // java.lang.Runnable
                public void run() {
                    SerializingServerCall.super.mo30865g(i2);
                }
            });
        }

        @Override // io.grpc.ForwardingServerCall, io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
        /* renamed from: h */
        public void mo30866h(final Metadata metadata) {
            this.f59541b.execute(new Runnable() { // from class: io.grpc.util.TransmitStatusRuntimeExceptionInterceptor.SerializingServerCall.3
                @Override // java.lang.Runnable
                public void run() {
                    SerializingServerCall.super.mo30866h(metadata);
                }
            });
        }

        @Override // io.grpc.ForwardingServerCall, io.grpc.ServerCall
        /* renamed from: i */
        public void mo30867i(final RespT respt) {
            this.f59541b.execute(new Runnable() { // from class: io.grpc.util.TransmitStatusRuntimeExceptionInterceptor.SerializingServerCall.1
                @Override // java.lang.Runnable
                public void run() {
                    SerializingServerCall.super.mo30867i(respt);
                }
            });
        }

        @Override // io.grpc.ForwardingServerCall, io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
        /* renamed from: j */
        public void mo30868j(final String str) {
            this.f59541b.execute(new Runnable() { // from class: io.grpc.util.TransmitStatusRuntimeExceptionInterceptor.SerializingServerCall.8
                @Override // java.lang.Runnable
                public void run() {
                    SerializingServerCall.super.mo30868j(str);
                }
            });
        }

        @Override // io.grpc.ForwardingServerCall, io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
        /* renamed from: k */
        public void mo30869k(final boolean z) {
            this.f59541b.execute(new Runnable() { // from class: io.grpc.util.TransmitStatusRuntimeExceptionInterceptor.SerializingServerCall.7
                @Override // java.lang.Runnable
                public void run() {
                    SerializingServerCall.super.mo30869k(z);
                }
            });
        }
    }

    @Override // io.grpc.ServerInterceptor
    /* renamed from: a */
    public <ReqT, RespT> ServerCall.Listener<ReqT> mo30935a(ServerCall<ReqT, RespT> serverCall, Metadata metadata, ServerCallHandler<ReqT, RespT> serverCallHandler) {
        final SerializingServerCall serializingServerCall = new SerializingServerCall(serverCall);
        return new ForwardingServerCallListener.SimpleForwardingServerCallListener<ReqT>(this, serverCallHandler.mo30934a(serializingServerCall, metadata)) { // from class: io.grpc.util.TransmitStatusRuntimeExceptionInterceptor.1
            @Override // io.grpc.PartialForwardingServerCallListener, io.grpc.ServerCall.Listener
            /* renamed from: a */
            public void mo30846a() {
                try {
                    super.mo30846a();
                } catch (StatusRuntimeException e2) {
                    m31333g(e2);
                }
            }

            @Override // io.grpc.PartialForwardingServerCallListener, io.grpc.ServerCall.Listener
            /* renamed from: b */
            public void mo30847b() {
                try {
                    super.mo30847b();
                } catch (StatusRuntimeException e2) {
                    m31333g(e2);
                }
            }

            @Override // io.grpc.PartialForwardingServerCallListener, io.grpc.ServerCall.Listener
            /* renamed from: c */
            public void mo30848c() {
                try {
                    super.mo30848c();
                } catch (StatusRuntimeException e2) {
                    m31333g(e2);
                }
            }

            @Override // io.grpc.ForwardingServerCallListener, io.grpc.ServerCall.Listener
            /* renamed from: d */
            public void mo30849d(ReqT reqt) {
                try {
                    super.mo30849d(reqt);
                } catch (StatusRuntimeException e2) {
                    m31333g(e2);
                }
            }

            @Override // io.grpc.PartialForwardingServerCallListener, io.grpc.ServerCall.Listener
            /* renamed from: e */
            public void mo30850e() {
                try {
                    super.mo30850e();
                } catch (StatusRuntimeException e2) {
                    m31333g(e2);
                }
            }

            /* renamed from: g */
            public final void m31333g(StatusRuntimeException statusRuntimeException) {
                Metadata metadata2 = statusRuntimeException.f58319c;
                if (metadata2 == null) {
                    metadata2 = new Metadata();
                }
                serializingServerCall.mo30861a(statusRuntimeException.f58318b, metadata2);
            }
        };
    }
}
