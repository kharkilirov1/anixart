package io.grpc.internal;

import io.grpc.internal.MessageDeframer;
import io.grpc.internal.StreamListener;
import java.io.Closeable;

/* loaded from: classes3.dex */
final class SquelchLateMessagesAvailableDeframerListener extends ForwardingDeframerListener {

    /* renamed from: a */
    public final MessageDeframer.Listener f59155a;

    /* renamed from: b */
    public boolean f59156b;

    public SquelchLateMessagesAvailableDeframerListener(MessageDeframer.Listener listener) {
        this.f59155a = listener;
    }

    @Override // io.grpc.internal.ForwardingDeframerListener, io.grpc.internal.MessageDeframer.Listener
    /* renamed from: a */
    public void mo31026a(StreamListener.MessageProducer messageProducer) {
        if (!this.f59156b) {
            super.mo31026a(messageProducer);
        } else if (messageProducer instanceof Closeable) {
            GrpcUtil.m31092c((Closeable) messageProducer);
        }
    }

    @Override // io.grpc.internal.ForwardingDeframerListener, io.grpc.internal.MessageDeframer.Listener
    /* renamed from: b */
    public void mo31013b(boolean z) {
        this.f59156b = true;
        super.mo31013b(z);
    }

    @Override // io.grpc.internal.ForwardingDeframerListener, io.grpc.internal.MessageDeframer.Listener
    /* renamed from: d */
    public void mo31035d(Throwable th) {
        this.f59156b = true;
        super.mo31035d(th);
    }

    @Override // io.grpc.internal.ForwardingDeframerListener
    /* renamed from: e */
    public MessageDeframer.Listener mo31089e() {
        return this.f59155a;
    }
}
