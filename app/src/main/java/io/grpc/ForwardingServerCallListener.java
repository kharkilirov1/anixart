package io.grpc;

import io.grpc.ServerCall;

/* loaded from: classes3.dex */
public abstract class ForwardingServerCallListener<ReqT> extends PartialForwardingServerCallListener<ReqT> {

    public static abstract class SimpleForwardingServerCallListener<ReqT> extends ForwardingServerCallListener<ReqT> {

        /* renamed from: a */
        public final ServerCall.Listener<ReqT> f58141a;

        public SimpleForwardingServerCallListener(ServerCall.Listener<ReqT> listener) {
            this.f58141a = listener;
        }

        @Override // io.grpc.PartialForwardingServerCallListener
        /* renamed from: f */
        public ServerCall.Listener<ReqT> mo30872f() {
            return this.f58141a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.grpc.ServerCall.Listener
    /* renamed from: d */
    public void mo30849d(ReqT reqt) {
        mo30872f().mo30849d(reqt);
    }
}
