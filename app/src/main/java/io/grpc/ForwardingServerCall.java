package io.grpc;

/* loaded from: classes3.dex */
public abstract class ForwardingServerCall<ReqT, RespT> extends PartialForwardingServerCall<ReqT, RespT> {

    public static abstract class SimpleForwardingServerCall<ReqT, RespT> extends ForwardingServerCall<ReqT, RespT> {

        /* renamed from: a */
        public final ServerCall<ReqT, RespT> f58140a;

        public SimpleForwardingServerCall(ServerCall<ReqT, RespT> serverCall) {
            this.f58140a = serverCall;
        }

        @Override // io.grpc.ServerCall
        /* renamed from: d */
        public MethodDescriptor<ReqT, RespT> mo30870d() {
            return this.f58140a.mo30870d();
        }

        @Override // io.grpc.PartialForwardingServerCall
        /* renamed from: l */
        public ServerCall<ReqT, RespT> mo30871l() {
            return this.f58140a;
        }
    }

    @Override // io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
    /* renamed from: a */
    public void mo30861a(Status status, Metadata metadata) {
        mo30871l().mo30861a(status, metadata);
    }

    @Override // io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
    @ExperimentalApi
    /* renamed from: b */
    public Attributes mo30862b() {
        return mo30871l().mo30862b();
    }

    @Override // io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
    /* renamed from: c */
    public String mo30863c() {
        return mo30871l().mo30863c();
    }

    @Override // io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
    /* renamed from: e */
    public boolean mo30864e() {
        return mo30871l().mo30864e();
    }

    @Override // io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
    /* renamed from: g */
    public void mo30865g(int i2) {
        mo30871l().mo30865g(i2);
    }

    @Override // io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
    /* renamed from: h */
    public void mo30866h(Metadata metadata) {
        mo30871l().mo30866h(metadata);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.grpc.ServerCall
    /* renamed from: i */
    public void mo30867i(RespT respt) {
        mo30871l().mo30867i(respt);
    }

    @Override // io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
    @ExperimentalApi
    /* renamed from: j */
    public void mo30868j(String str) {
        mo30871l().mo30868j(str);
    }

    @Override // io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
    @ExperimentalApi
    /* renamed from: k */
    public void mo30869k(boolean z) {
        mo30871l().mo30869k(z);
    }
}
