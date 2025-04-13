package io.grpc;

import com.google.common.base.MoreObjects;
import io.grpc.ClientCall;

/* loaded from: classes3.dex */
abstract class PartialForwardingClientCallListener<RespT> extends ClientCall.Listener<RespT> {
    @Override // io.grpc.ClientCall.Listener
    /* renamed from: a */
    public void mo12483a(Status status, Metadata metadata) {
        mo30818e().mo12483a(status, metadata);
    }

    @Override // io.grpc.ClientCall.Listener
    /* renamed from: b */
    public void mo12484b(Metadata metadata) {
        mo30818e().mo12484b(metadata);
    }

    @Override // io.grpc.ClientCall.Listener
    /* renamed from: d */
    public void mo12486d() {
        mo30818e().mo12486d();
    }

    /* renamed from: e */
    public abstract ClientCall.Listener<?> mo30818e();

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11171e("delegate", mo30818e());
        return m11166b.toString();
    }
}
