package io.grpc.internal;

import io.grpc.InternalChannelz;
import io.grpc.InternalInstrumented;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes3.dex */
public interface ClientTransport extends InternalInstrumented<InternalChannelz.SocketStats> {

    public interface PingCallback {
        /* renamed from: a */
        void mo31061a(Throwable th);

        /* renamed from: b */
        void mo31062b(long j2);
    }

    /* renamed from: f */
    void mo30971f(PingCallback pingCallback, Executor executor);
}
