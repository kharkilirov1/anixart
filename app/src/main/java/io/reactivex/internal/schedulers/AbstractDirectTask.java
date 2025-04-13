package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.SchedulerRunnableIntrospection;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
abstract class AbstractDirectTask extends AtomicReference<Future<?>> implements Disposable, SchedulerRunnableIntrospection {

    /* renamed from: d */
    public static final FutureTask<Void> f62604d;

    /* renamed from: e */
    public static final FutureTask<Void> f62605e;

    /* renamed from: b */
    public final Runnable f62606b;

    /* renamed from: c */
    public Thread f62607c;

    static {
        Runnable runnable = Functions.f59620a;
        f62604d = new FutureTask<>(runnable, null);
        f62605e = new FutureTask<>(runnable, null);
    }

    public AbstractDirectTask(Runnable runnable) {
        this.f62606b = runnable;
    }

    /* renamed from: a */
    public final void m31767a(Future<?> future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == f62604d) {
                return;
            }
            if (future2 == f62605e) {
                future.cancel(this.f62607c != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public final void mo31379f() {
        FutureTask<Void> futureTask;
        Future<?> future = get();
        if (future == f62604d || future == (futureTask = f62605e) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f62607c != Thread.currentThread());
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public final boolean mo31380s() {
        Future<?> future = get();
        return future == f62604d || future == f62605e;
    }
}
