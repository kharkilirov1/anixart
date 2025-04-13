package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
final class InstantPeriodicTask implements Callable<Void>, Disposable {

    /* renamed from: g */
    public static final FutureTask<Void> f62643g = new FutureTask<>(Functions.f59620a, null);

    /* renamed from: b */
    public final Runnable f62644b;

    /* renamed from: e */
    public final ExecutorService f62647e;

    /* renamed from: f */
    public Thread f62648f;

    /* renamed from: d */
    public final AtomicReference<Future<?>> f62646d = new AtomicReference<>();

    /* renamed from: c */
    public final AtomicReference<Future<?>> f62645c = new AtomicReference<>();

    public InstantPeriodicTask(Runnable runnable, ExecutorService executorService) {
        this.f62644b = runnable;
        this.f62647e = executorService;
    }

    /* renamed from: a */
    public void m31770a(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.f62646d.get();
            if (future2 == f62643g) {
                future.cancel(this.f62648f != Thread.currentThread());
                return;
            }
        } while (!this.f62646d.compareAndSet(future2, future));
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        this.f62648f = Thread.currentThread();
        try {
            this.f62644b.run();
            Future<?> submit = this.f62647e.submit(this);
            while (true) {
                Future<?> future = this.f62645c.get();
                if (future == f62643g) {
                    submit.cancel(this.f62648f != Thread.currentThread());
                } else if (this.f62645c.compareAndSet(future, submit)) {
                    break;
                }
            }
            this.f62648f = null;
        } catch (Throwable th) {
            this.f62648f = null;
            RxJavaPlugins.m31848b(th);
        }
        return null;
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
        AtomicReference<Future<?>> atomicReference = this.f62646d;
        FutureTask<Void> futureTask = f62643g;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.f62648f != Thread.currentThread());
        }
        Future<?> andSet2 = this.f62645c.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.f62648f != Thread.currentThread());
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public boolean mo31380s() {
        return this.f62646d.get() == f62643g;
    }
}
