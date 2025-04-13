package io.grpc.internal;

import io.grpc.internal.MessageDeframer;
import io.grpc.internal.StreamListener;

/* loaded from: classes3.dex */
abstract class ForwardingDeframerListener implements MessageDeframer.Listener {
    @Override // io.grpc.internal.MessageDeframer.Listener
    /* renamed from: a */
    public void mo31026a(StreamListener.MessageProducer messageProducer) {
        mo31089e().mo31026a(messageProducer);
    }

    @Override // io.grpc.internal.MessageDeframer.Listener
    /* renamed from: b */
    public void mo31013b(boolean z) {
        mo31089e().mo31013b(z);
    }

    @Override // io.grpc.internal.MessageDeframer.Listener
    /* renamed from: c */
    public void mo31034c(int i2) {
        mo31089e().mo31034c(i2);
    }

    @Override // io.grpc.internal.MessageDeframer.Listener
    /* renamed from: d */
    public void mo31035d(Throwable th) {
        mo31089e().mo31035d(th);
    }

    /* renamed from: e */
    public abstract MessageDeframer.Listener mo31089e();
}
