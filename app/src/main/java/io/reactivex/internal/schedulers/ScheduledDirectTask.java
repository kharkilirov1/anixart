package io.reactivex.internal.schedulers;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class ScheduledDirectTask extends AbstractDirectTask implements Callable<Void> {
    public ScheduledDirectTask(Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        this.f62607c = Thread.currentThread();
        try {
            this.f62606b.run();
            return null;
        } finally {
            lazySet(AbstractDirectTask.f62604d);
            this.f62607c = null;
        }
    }
}
