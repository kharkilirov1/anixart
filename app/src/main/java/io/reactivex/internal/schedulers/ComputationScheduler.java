package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.ListCompositeDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ComputationScheduler extends Scheduler implements SchedulerMultiWorkerSupport {

    /* renamed from: e */
    public static final FixedSchedulerPool f62608e;

    /* renamed from: f */
    public static final RxThreadFactory f62609f;

    /* renamed from: g */
    public static final int f62610g;

    /* renamed from: h */
    public static final PoolWorker f62611h;

    /* renamed from: c */
    public final ThreadFactory f62612c;

    /* renamed from: d */
    public final AtomicReference<FixedSchedulerPool> f62613d;

    public static final class EventLoopWorker extends Scheduler.Worker {

        /* renamed from: b */
        public final ListCompositeDisposable f62614b;

        /* renamed from: c */
        public final CompositeDisposable f62615c;

        /* renamed from: d */
        public final ListCompositeDisposable f62616d;

        /* renamed from: e */
        public final PoolWorker f62617e;

        /* renamed from: f */
        public volatile boolean f62618f;

        public EventLoopWorker(PoolWorker poolWorker) {
            this.f62617e = poolWorker;
            ListCompositeDisposable listCompositeDisposable = new ListCompositeDisposable();
            this.f62614b = listCompositeDisposable;
            CompositeDisposable compositeDisposable = new CompositeDisposable();
            this.f62615c = compositeDisposable;
            ListCompositeDisposable listCompositeDisposable2 = new ListCompositeDisposable();
            this.f62616d = listCompositeDisposable2;
            listCompositeDisposable2.mo31393b(listCompositeDisposable);
            listCompositeDisposable2.mo31393b(compositeDisposable);
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        /* renamed from: b */
        public Disposable mo31382b(@NonNull Runnable runnable) {
            return this.f62618f ? EmptyDisposable.INSTANCE : this.f62617e.m31771e(runnable, 0L, TimeUnit.MILLISECONDS, this.f62614b);
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        /* renamed from: c */
        public Disposable mo31383c(@NonNull Runnable runnable, long j2, @NonNull TimeUnit timeUnit) {
            return this.f62618f ? EmptyDisposable.INSTANCE : this.f62617e.m31771e(runnable, j2, timeUnit, this.f62615c);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (this.f62618f) {
                return;
            }
            this.f62618f = true;
            this.f62616d.mo31379f();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62618f;
        }
    }

    public static final class FixedSchedulerPool implements SchedulerMultiWorkerSupport {

        /* renamed from: b */
        public final int f62619b;

        /* renamed from: c */
        public final PoolWorker[] f62620c;

        /* renamed from: d */
        public long f62621d;

        public FixedSchedulerPool(int i2, ThreadFactory threadFactory) {
            this.f62619b = i2;
            this.f62620c = new PoolWorker[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                this.f62620c[i3] = new PoolWorker(threadFactory);
            }
        }

        /* renamed from: a */
        public PoolWorker m31768a() {
            int i2 = this.f62619b;
            if (i2 == 0) {
                return ComputationScheduler.f62611h;
            }
            PoolWorker[] poolWorkerArr = this.f62620c;
            long j2 = this.f62621d;
            this.f62621d = 1 + j2;
            return poolWorkerArr[(int) (j2 % i2)];
        }
    }

    public static final class PoolWorker extends NewThreadWorker {
        public PoolWorker(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        f62610g = availableProcessors;
        PoolWorker poolWorker = new PoolWorker(new RxThreadFactory("RxComputationShutdown"));
        f62611h = poolWorker;
        poolWorker.mo31379f();
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f62609f = rxThreadFactory;
        FixedSchedulerPool fixedSchedulerPool = new FixedSchedulerPool(0, rxThreadFactory);
        f62608e = fixedSchedulerPool;
        for (PoolWorker poolWorker2 : fixedSchedulerPool.f62620c) {
            poolWorker2.mo31379f();
        }
    }

    public ComputationScheduler() {
        RxThreadFactory rxThreadFactory = f62609f;
        this.f62612c = rxThreadFactory;
        FixedSchedulerPool fixedSchedulerPool = f62608e;
        AtomicReference<FixedSchedulerPool> atomicReference = new AtomicReference<>(fixedSchedulerPool);
        this.f62613d = atomicReference;
        FixedSchedulerPool fixedSchedulerPool2 = new FixedSchedulerPool(f62610g, rxThreadFactory);
        if (atomicReference.compareAndSet(fixedSchedulerPool, fixedSchedulerPool2)) {
            return;
        }
        for (PoolWorker poolWorker : fixedSchedulerPool2.f62620c) {
            poolWorker.mo31379f();
        }
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    /* renamed from: a */
    public Scheduler.Worker mo31374a() {
        return new EventLoopWorker(this.f62613d.get().m31768a());
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    /* renamed from: d */
    public Disposable mo31377d(@NonNull Runnable runnable, long j2, TimeUnit timeUnit) {
        PoolWorker m31768a = this.f62613d.get().m31768a();
        Objects.requireNonNull(m31768a);
        Objects.requireNonNull(runnable, "run is null");
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable);
        try {
            scheduledDirectTask.m31767a(j2 <= 0 ? m31768a.f62670b.submit(scheduledDirectTask) : m31768a.f62670b.schedule(scheduledDirectTask, j2, timeUnit));
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
        PoolWorker m31768a = this.f62613d.get().m31768a();
        Objects.requireNonNull(m31768a);
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        if (j3 <= 0) {
            InstantPeriodicTask instantPeriodicTask = new InstantPeriodicTask(runnable, m31768a.f62670b);
            try {
                instantPeriodicTask.m31770a(j2 <= 0 ? m31768a.f62670b.submit(instantPeriodicTask) : m31768a.f62670b.schedule(instantPeriodicTask, j2, timeUnit));
                return instantPeriodicTask;
            } catch (RejectedExecutionException e2) {
                RxJavaPlugins.m31848b(e2);
                return emptyDisposable;
            }
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnable);
        try {
            scheduledDirectPeriodicTask.m31767a(m31768a.f62670b.scheduleAtFixedRate(scheduledDirectPeriodicTask, j2, j3, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e3) {
            RxJavaPlugins.m31848b(e3);
            return emptyDisposable;
        }
    }
}
