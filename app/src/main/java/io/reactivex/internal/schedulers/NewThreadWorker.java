package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableContainer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class NewThreadWorker extends Scheduler.Worker {

    /* renamed from: b */
    public final ScheduledExecutorService f62670b;

    /* renamed from: c */
    public volatile boolean f62671c;

    public NewThreadWorker(ThreadFactory threadFactory) {
        this.f62670b = SchedulerPoolFactory.m31773a(threadFactory);
    }

    @Override // io.reactivex.Scheduler.Worker
    @NonNull
    /* renamed from: b */
    public Disposable mo31382b(@NonNull Runnable runnable) {
        return mo31383c(runnable, 0L, null);
    }

    @Override // io.reactivex.Scheduler.Worker
    @NonNull
    /* renamed from: c */
    public Disposable mo31383c(@NonNull Runnable runnable, long j2, @NonNull TimeUnit timeUnit) {
        return this.f62671c ? EmptyDisposable.INSTANCE : m31771e(runnable, j2, timeUnit, null);
    }

    @NonNull
    /* renamed from: e */
    public ScheduledRunnable m31771e(Runnable runnable, long j2, @NonNull TimeUnit timeUnit, @Nullable DisposableContainer disposableContainer) {
        Objects.requireNonNull(runnable, "run is null");
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(runnable, disposableContainer);
        if (disposableContainer != null && !disposableContainer.mo31393b(scheduledRunnable)) {
            return scheduledRunnable;
        }
        try {
            scheduledRunnable.m31772a(j2 <= 0 ? this.f62670b.submit((Callable) scheduledRunnable) : this.f62670b.schedule((Callable) scheduledRunnable, j2, timeUnit));
        } catch (RejectedExecutionException e2) {
            if (disposableContainer != null) {
                disposableContainer.mo31392a(scheduledRunnable);
            }
            RxJavaPlugins.m31848b(e2);
        }
        return scheduledRunnable;
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
        if (this.f62671c) {
            return;
        }
        this.f62671c = true;
        this.f62670b.shutdownNow();
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public boolean mo31380s() {
        return this.f62671c;
    }
}
