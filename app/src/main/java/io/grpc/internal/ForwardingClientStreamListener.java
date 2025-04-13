package io.grpc.internal;

import com.google.common.base.MoreObjects;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.internal.ClientStreamListener;
import io.grpc.internal.StreamListener;

/* loaded from: classes3.dex */
abstract class ForwardingClientStreamListener implements ClientStreamListener {
    @Override // io.grpc.internal.StreamListener
    /* renamed from: a */
    public void mo31052a(StreamListener.MessageProducer messageProducer) {
        mo31087g().mo31052a(messageProducer);
    }

    @Override // io.grpc.internal.ClientStreamListener
    /* renamed from: d */
    public void mo31053d(Metadata metadata) {
        mo31087g().mo31053d(metadata);
    }

    @Override // io.grpc.internal.StreamListener
    /* renamed from: e */
    public void mo31054e() {
        mo31087g().mo31054e();
    }

    @Override // io.grpc.internal.ClientStreamListener
    /* renamed from: f */
    public void mo31055f(Status status, ClientStreamListener.RpcProgress rpcProgress, Metadata metadata) {
        mo31087g().mo31055f(status, rpcProgress, metadata);
    }

    /* renamed from: g */
    public abstract ClientStreamListener mo31087g();

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11171e("delegate", mo31087g());
        return m11166b.toString();
    }
}
