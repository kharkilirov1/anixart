package io.reactivex.internal.schedulers;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes3.dex */
public final class ScheduledDirectPeriodicTask extends AbstractDirectTask implements Runnable {
    public ScheduledDirectPeriodicTask(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f62607c = Thread.currentThread();
        try {
            this.f62606b.run();
            this.f62607c = null;
        } catch (Throwable th) {
            this.f62607c = null;
            lazySet(AbstractDirectTask.f62604d);
            RxJavaPlugins.m31848b(th);
        }
    }
}
