package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class SingleScheduler extends Scheduler {

    /* renamed from: d */
    public static final RxThreadFactory f62699d;

    /* renamed from: e */
    public static final ScheduledExecutorService f62700e;

    /* renamed from: c */
    public final AtomicReference<ScheduledExecutorService> f62701c;

    public static final class ScheduledWorker extends Scheduler.Worker {

        /* renamed from: b */
        public final ScheduledExecutorService f62702b;

        /* renamed from: c */
        public final CompositeDisposable f62703c = new CompositeDisposable();

        /* renamed from: d */
        public volatile boolean f62704d;

        public ScheduledWorker(ScheduledExecutorService scheduledExecutorService) {
            this.f62702b = scheduledExecutorService;
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        /* renamed from: c */
        public Disposable mo31383c(@NonNull Runnable runnable, long j2, @NonNull TimeUnit timeUnit) {
            EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
            if (this.f62704d) {
                return emptyDisposable;
            }
            Objects.requireNonNull(runnable, "run is null");
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(runnable, this.f62703c);
            this.f62703c.mo31393b(scheduledRunnable);
            try {
                scheduledRunnable.m31772a(j2 <= 0 ? this.f62702b.submit((Callable) scheduledRunnable) : this.f62702b.schedule((Callable) scheduledRunnable, j2, timeUnit));
                return scheduledRunnable;
            } catch (RejectedExecutionException e2) {
                mo31379f();
                RxJavaPlugins.m31848b(e2);
                return emptyDisposable;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (this.f62704d) {
                return;
            }
            this.f62704d = true;
            this.f62703c.mo31379f();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62704d;
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f62700e = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        f62699d = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public SingleScheduler() {
        RxThreadFactory rxThreadFactory = f62699d;
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f62701c = atomicReference;
        atomicReference.lazySet(SchedulerPoolFactory.m31773a(rxThreadFactory));
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    /* renamed from: a */
    public Scheduler.Worker mo31374a() {
        return new ScheduledWorker(this.f62701c.get());
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    /* renamed from: d */
    public Disposable mo31377d(@NonNull Runnable runnable, long j2, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run is null");
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable);
        try {
            scheduledDirectTask.m31767a(j2 <= 0 ? this.f62701c.get().submit(scheduledDirectTask) : this.f62701c.get().schedule(scheduledDirectTask, j2, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e2) {
            RxJavaPlugins.m31848b(e2);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    /* renamed from: e */
    public Disposable mo31378e(@NonNull Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        if (j3 > 0) {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnable);
            try {
                scheduledDirectPeriodicTask.m31767a(this.f62701c.get().scheduleAtFixedRate(scheduledDirectPeriodicTask, j2, j3, timeUnit));
                return scheduledDirectPeriodicTask;
            } catch (RejectedExecutionException e2) {
                RxJavaPlugins.m31848b(e2);
                return emptyDisposable;
            }
        }
        ScheduledExecutorService scheduledExecutorService = this.f62701c.get();
        InstantPeriodicTask instantPeriodicTask = new InstantPeriodicTask(runnable, scheduledExecutorService);
        try {
            instantPeriodicTask.m31770a(j2 <= 0 ? scheduledExecutorService.submit(instantPeriodicTask) : scheduledExecutorService.schedule(instantPeriodicTask, j2, timeUnit));
            return instantPeriodicTask;
        } catch (RejectedExecutionException e3) {
            RxJavaPlugins.m31848b(e3);
            return emptyDisposable;
        }
    }
}
