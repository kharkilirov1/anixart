package com.google.firebase.firestore.util;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;

/* loaded from: classes2.dex */
class ThrottledForwardingExecutor implements Executor {

    /* renamed from: b */
    public final Executor f23025b;

    /* renamed from: c */
    public final Semaphore f23026c;

    public ThrottledForwardingExecutor(int i2, Executor executor) {
        this.f23026c = new Semaphore(i2);
        this.f23025b = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (!this.f23026c.tryAcquire()) {
            runnable.run();
            return;
        }
        try {
            this.f23025b.execute(new RunnableC2135c(this, runnable, 0));
        } catch (RejectedExecutionException unused) {
            runnable.run();
        }
    }
}
