package io.grpc;

import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ExperimentalApi
@ThreadSafe
/* loaded from: classes3.dex */
public abstract class ServerStreamTracer extends StreamTracer {

    public static abstract class Factory {
    }

    @Deprecated
    public static final class ReadOnlyServerCall<ReqT, RespT> extends ForwardingServerCall<ReqT, RespT> {

        /* renamed from: a */
        public final ServerCallInfo<ReqT, RespT> f58275a;

        @Override // io.grpc.ForwardingServerCall, io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
        /* renamed from: b */
        public Attributes mo30862b() {
            return this.f58275a.mo30937a();
        }

        @Override // io.grpc.ForwardingServerCall, io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
        /* renamed from: c */
        public String mo30863c() {
            return this.f58275a.mo30938b();
        }

        @Override // io.grpc.ServerCall
        /* renamed from: d */
        public MethodDescriptor<ReqT, RespT> mo30870d() {
            return this.f58275a.mo30939c();
        }

        @Override // io.grpc.ForwardingServerCall, io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
        /* renamed from: e */
        public boolean mo30864e() {
            return false;
        }

        @Override // io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
        /* renamed from: f */
        public boolean mo30933f() {
            return false;
        }

        @Override // io.grpc.PartialForwardingServerCall
        /* renamed from: l */
        public ServerCall<ReqT, RespT> mo30871l() {
            throw new UnsupportedOperationException();
        }
    }

    public static abstract class ServerCallInfo<ReqT, RespT> {
        /* renamed from: a */
        public abstract Attributes mo30937a();

        @Nullable
        /* renamed from: b */
        public abstract String mo30938b();

        /* renamed from: c */
        public abstract MethodDescriptor<ReqT, RespT> mo30939c();
    }
}
