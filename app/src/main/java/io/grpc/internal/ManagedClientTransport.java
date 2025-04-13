package io.grpc.internal;

import io.grpc.Status;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes3.dex */
public interface ManagedClientTransport extends ClientTransport {

    public interface Listener {
        /* renamed from: a */
        void mo31127a();

        /* renamed from: b */
        void mo31128b(Status status);

        /* renamed from: c */
        void mo31129c();

        /* renamed from: d */
        void mo31130d(boolean z);
    }

    /* renamed from: a */
    void mo30968a(Status status);

    /* renamed from: b */
    void mo30969b(Status status);

    @CheckReturnValue
    @Nullable
    /* renamed from: c */
    Runnable mo30970c(Listener listener);
}
