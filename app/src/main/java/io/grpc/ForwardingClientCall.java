package io.grpc;

import io.grpc.ClientCall;

/* loaded from: classes3.dex */
public abstract class ForwardingClientCall<ReqT, RespT> extends PartialForwardingClientCall<ReqT, RespT> {

    public static abstract class SimpleForwardingClientCall<ReqT, RespT> extends ForwardingClientCall<ReqT, RespT> {

        /* renamed from: a */
        public final ClientCall<ReqT, RespT> f58138a;

        public SimpleForwardingClientCall(ClientCall<ReqT, RespT> clientCall) {
            this.f58138a = clientCall;
        }

        @Override // io.grpc.PartialForwardingClientCall
        /* renamed from: g */
        public ClientCall<ReqT, RespT> mo12488g() {
            return this.f58138a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.grpc.ClientCall
    /* renamed from: d */
    public void mo30814d(ReqT reqt) {
        mo12488g().mo30814d(reqt);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.grpc.ClientCall
    /* renamed from: f */
    public void mo30816f(ClientCall.Listener<RespT> listener, Metadata metadata) {
        mo12488g().mo30816f(listener, metadata);
    }
}
