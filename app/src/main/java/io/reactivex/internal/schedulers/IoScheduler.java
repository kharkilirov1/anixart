package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class IoScheduler extends Scheduler {

    /* renamed from: e */
    public static final RxThreadFactory f62649e;

    /* renamed from: f */
    public static final RxThreadFactory f62650f;

    /* renamed from: i */
    public static final ThreadWorker f62653i;

    /* renamed from: j */
    public static final CachedWorkerPool f62654j;

    /* renamed from: c */
    public final ThreadFactory f62655c;

    /* renamed from: d */
    public final AtomicReference<CachedWorkerPool> f62656d;

    /* renamed from: h */
    public static final TimeUnit f62652h = TimeUnit.SECONDS;

    /* renamed from: g */
    public static final long f62651g = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    public static final class CachedWorkerPool implements Runnable {

        /* renamed from: b */
        public final long f62657b;

        /* renamed from: c */
        public final ConcurrentLinkedQueue<ThreadWorker> f62658c;

        /* renamed from: d */
        public final CompositeDisposable f62659d;

        /* renamed from: e */
        public final ScheduledExecutorService f62660e;

        /* renamed from: f */
        public final Future<?> f62661f;

        /* renamed from: g */
        public final ThreadFactory f62662g;

        public CachedWorkerPool(long j2, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledFuture<?> scheduledFuture;
            long nanos = timeUnit != null ? timeUnit.toNanos(j2) : 0L;
            this.f62657b = nanos;
            this.f62658c = new ConcurrentLinkedQueue<>();
            this.f62659d = new CompositeDisposable();
            this.f62662g = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, IoScheduler.f62650f);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.f62660e = scheduledExecutorService;
            this.f62661f = scheduledFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f62658c.isEmpty()) {
                return;
            }
            long nanoTime = System.nanoTime();
            Iterator<ThreadWorker> it = this.f62658c.iterator();
            while (it.hasNext()) {
                ThreadWorker next = it.next();
                if (next.f62667d > nanoTime) {
                    return;
                }
                if (this.f62658c.remove(next)) {
                    this.f62659d.mo31392a(next);
                }
            }
        }
    }

    public static final class EventLoopWorker extends Scheduler.Worker {

        /* renamed from: c */
        public final CachedWorkerPool f62664c;

        /* renamed from: d */
        public final ThreadWorker f62665d;

        /* renamed from: e */
        public final AtomicBoolean f62666e = new AtomicBoolean();

        /* renamed from: b */
        public final CompositeDisposable f62663b = new CompositeDisposable();

        public EventLoopWorker(CachedWorkerPool cachedWorkerPool) {
            ThreadWorker threadWorker;
            ThreadWorker threadWorker2;
            this.f62664c = cachedWorkerPool;
            if (cachedWorkerPool.f62659d.f59605c) {
                threadWorker2 = IoScheduler.f62653i;
            } else {
                while (true) {
                    if (cachedWorkerPool.f62658c.isEmpty()) {
                        threadWorker = new ThreadWorker(cachedWorkerPool.f62662g);
                        cachedWorkerPool.f62659d.mo31393b(threadWorker);
                        break;
                    } else {
                        threadWorker = cachedWorkerPool.f62658c.poll();
                        if (threadWorker != null) {
                            break;
                        }
                    }
                }
                threadWorker2 = threadWorker;
            }
            this.f62665d = threadWorker2;
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        /* renamed from: c */
        public Disposable mo31383c(@NonNull Runnable runnable, long j2, @NonNull TimeUnit timeUnit) {
            return this.f62663b.f59605c ? EmptyDisposable.INSTANCE : this.f62665d.m31771e(runnable, j2, timeUnit, this.f62663b);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (this.f62666e.compareAndSet(false, true)) {
                this.f62663b.mo31379f();
                CachedWorkerPool cachedWorkerPool = this.f62664c;
                ThreadWorker threadWorker = this.f62665d;
                Objects.requireNonNull(cachedWorkerPool);
                threadWorker.f62667d = System.nanoTime() + cachedWorkerPool.f62657b;
                cachedWorkerPool.f62658c.offer(threadWorker);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62666e.get();
        }
    }

    public static final class ThreadWorker extends NewThreadWorker {

        /* renamed from: d */
        public long f62667d;

        public ThreadWorker(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f62667d = 0L;
        }
    }

    static {
        ThreadWorker threadWorker = new ThreadWorker(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        f62653i = threadWorker;
        threadWorker.mo31379f();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxCachedThreadScheduler", max);
        f62649e = rxThreadFactory;
        f62650f = new RxThreadFactory("RxCachedWorkerPoolEvictor", max);
        CachedWorkerPool cachedWorkerPool = new CachedWorkerPool(0L, null, rxThreadFactory);
        f62654j = cachedWorkerPool;
        cachedWorkerPool.f62659d.mo31379f();
        Future<?> future = cachedWorkerPool.f62661f;
        if (future != null) {
            future.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = cachedWorkerPool.f62660e;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public IoScheduler() {
        RxThreadFactory rxThreadFactory = f62649e;
        this.f62655c = rxThreadFactory;
        CachedWorkerPool cachedWorkerPool = f62654j;
        AtomicReference<CachedWorkerPool> atomicReference = new AtomicReference<>(cachedWorkerPool);
        this.f62656d = atomicReference;
        CachedWorkerPool cachedWorkerPool2 = new CachedWorkerPool(f62651g, f62652h, rxThreadFactory);
        if (atomicReference.compareAndSet(cachedWorkerPool, cachedWorkerPool2)) {
            return;
        }
        cachedWorkerPool2.f62659d.mo31379f();
        Future<?> future = cachedWorkerPool2.f62661f;
        if (future != null) {
            future.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = cachedWorkerPool2.f62660e;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    /* renamed from: a */
    public Scheduler.Worker mo31374a() {
        return new EventLoopWorker(this.f62656d.get());
    }
}
