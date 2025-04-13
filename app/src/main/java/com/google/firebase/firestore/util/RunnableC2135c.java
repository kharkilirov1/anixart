package com.google.firebase.firestore.util;

import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.firebase.firestore.util.c */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2135c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f23031b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f23032c;

    /* renamed from: d */
    public final /* synthetic */ Object f23033d;

    public /* synthetic */ RunnableC2135c(Object obj, Runnable runnable, int i2) {
        this.f23031b = i2;
        this.f23033d = obj;
        this.f23032c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23031b) {
            case 0:
                ThrottledForwardingExecutor throttledForwardingExecutor = (ThrottledForwardingExecutor) this.f23033d;
                Runnable runnable = this.f23032c;
                Objects.requireNonNull(throttledForwardingExecutor);
                runnable.run();
                throttledForwardingExecutor.f23026c.release();
                break;
            default:
                BackgroundQueue backgroundQueue = (BackgroundQueue) this.f23033d;
                Runnable runnable2 = this.f23032c;
                Objects.requireNonNull(backgroundQueue);
                runnable2.run();
                backgroundQueue.f23013b.release();
                break;
        }
    }
}
