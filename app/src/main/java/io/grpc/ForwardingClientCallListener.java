package io.grpc;

import io.grpc.ClientCall;

/* loaded from: classes3.dex */
public abstract class ForwardingClientCallListener<RespT> extends PartialForwardingClientCallListener<RespT> {

    public static abstract class SimpleForwardingClientCallListener<RespT> extends ForwardingClientCallListener<RespT> {

        /* renamed from: a */
        public final ClientCall.Listener<RespT> f58139a;

        @Override // io.grpc.PartialForwardingClientCallListener
        /* renamed from: e */
        public ClientCall.Listener<RespT> mo30818e() {
            return this.f58139a;
        }
    }

    @Override // io.grpc.PartialForwardingClientCallListener, io.grpc.ClientCall.Listener
    /* renamed from: a */
    public void mo12483a(Status status, Metadata metadata) {
        mo30818e().mo12483a(status, metadata);
    }

    @Override // io.grpc.PartialForwardingClientCallListener, io.grpc.ClientCall.Listener
    /* renamed from: b */
    public void mo12484b(Metadata metadata) {
        mo30818e().mo12484b(metadata);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.grpc.ClientCall.Listener
    /* renamed from: c */
    public void mo12485c(RespT respt) {
        mo30818e().mo12485c(respt);
    }
}
