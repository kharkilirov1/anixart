package io.grpc.internal;

import io.grpc.Context;

/* loaded from: classes3.dex */
abstract class ContextRunnable implements Runnable {

    /* renamed from: b */
    public final Context f58533b;

    public ContextRunnable(Context context) {
        this.f58533b = context;
    }

    /* renamed from: a */
    public abstract void mo31050a();

    @Override // java.lang.Runnable
    public final void run() {
        Context mo30831b = this.f58533b.mo30831b();
        try {
            mo31050a();
        } finally {
            this.f58533b.mo30833h(mo30831b);
        }
    }
}
