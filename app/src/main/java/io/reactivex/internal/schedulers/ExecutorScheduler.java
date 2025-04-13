package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableContainer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.SchedulerRunnableIntrospection;
import io.reactivex.schedulers.Schedulers;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ExecutorScheduler extends Scheduler {

    /* renamed from: c */
    public static final Scheduler f62623c = Schedulers.f62899a;

    public final class DelayedDispose implements Runnable {

        /* renamed from: b */
        public final DelayedRunnable f62624b;

        public DelayedDispose(DelayedRunnable delayedRunnable) {
            this.f62624b = delayedRunnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            DelayedRunnable delayedRunnable = this.f62624b;
            SequentialDisposable sequentialDisposable = delayedRunnable.f62627c;
            ExecutorScheduler.this.mo31376c(delayedRunnable);
            DisposableHelper.m31411c(sequentialDisposable, EmptyDisposable.INSTANCE);
        }
    }

    public static final class DelayedRunnable extends AtomicReference<Runnable> implements Runnable, Disposable, SchedulerRunnableIntrospection {

        /* renamed from: b */
        public final SequentialDisposable f62626b;

        /* renamed from: c */
        public final SequentialDisposable f62627c;

        public DelayedRunnable(Runnable runnable) {
            super(runnable);
            this.f62626b = new SequentialDisposable();
            this.f62627c = new SequentialDisposable();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (getAndSet(null) != null) {
                DisposableHelper.m31409a(this.f62626b);
                DisposableHelper.m31409a(this.f62627c);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            Runnable runnable = get();
            if (runnable != null) {
                try {
                    runnable.run();
                } finally {
                    lazySet(null);
                    this.f62626b.lazySet(disposableHelper);
                    this.f62627c.lazySet(disposableHelper);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return get() == null;
        }
    }

    public static final class ExecutorWorker extends Scheduler.Worker implements Runnable {

        /* renamed from: b */
        public final boolean f62628b;

        /* renamed from: e */
        public volatile boolean f62631e;

        /* renamed from: f */
        public final AtomicInteger f62632f = new AtomicInteger();

        /* renamed from: g */
        public final CompositeDisposable f62633g = new CompositeDisposable();

        /* renamed from: c */
        public final Executor f62629c = null;

        /* renamed from: d */
        public final MpscLinkedQueue<Runnable> f62630d = new MpscLinkedQueue<>();

        public static final class BooleanRunnable extends AtomicBoolean implements Runnable, Disposable {

            /* renamed from: b */
            public final Runnable f62634b;

            public BooleanRunnable(Runnable runnable) {
                this.f62634b = runnable;
            }

            @Override // io.reactivex.disposables.Disposable
            /* renamed from: f */
            public void mo31379f() {
                lazySet(true);
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get()) {
                    return;
                }
                try {
                    this.f62634b.run();
                } finally {
                    lazySet(true);
                }
            }

            @Override // io.reactivex.disposables.Disposable
            /* renamed from: s */
            public boolean mo31380s() {
                return get();
            }
        }

        public static final class InterruptibleRunnable extends AtomicInteger implements Runnable, Disposable {

            /* renamed from: b */
            public final Runnable f62635b;

            /* renamed from: c */
            public final DisposableContainer f62636c;

            /* renamed from: d */
            public volatile Thread f62637d;

            public InterruptibleRunnable(Runnable runnable, DisposableContainer disposableContainer) {
                this.f62635b = runnable;
                this.f62636c = disposableContainer;
            }

            /* renamed from: a */
            public void m31769a() {
                DisposableContainer disposableContainer = this.f62636c;
                if (disposableContainer != null) {
                    disposableContainer.mo31394c(this);
                }
            }

            @Override // io.reactivex.disposables.Disposable
            /* renamed from: f */
            public void mo31379f() {
                while (true) {
                    int i2 = get();
                    if (i2 >= 2) {
                        return;
                    }
                    if (i2 == 0) {
                        if (compareAndSet(0, 4)) {
                            m31769a();
                            return;
                        }
                    } else if (compareAndSet(1, 3)) {
                        Thread thread = this.f62637d;
                        if (thread != null) {
                            thread.interrupt();
                            this.f62637d = null;
                        }
                        set(4);
                        m31769a();
                        return;
                    }
                }
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get() == 0) {
                    this.f62637d = Thread.currentThread();
                    if (!compareAndSet(0, 1)) {
                        this.f62637d = null;
                        return;
                    }
                    try {
                        this.f62635b.run();
                        this.f62637d = null;
                        if (compareAndSet(1, 2)) {
                            m31769a();
                            return;
                        }
                        while (get() == 3) {
                            Thread.yield();
                        }
                        Thread.interrupted();
                    } catch (Throwable th) {
                        this.f62637d = null;
                        if (compareAndSet(1, 2)) {
                            m31769a();
                        } else {
                            while (get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                        }
                        throw th;
                    }
                }
            }

            @Override // io.reactivex.disposables.Disposable
            /* renamed from: s */
            public boolean mo31380s() {
                return get() >= 2;
            }
        }

        public final class SequentialDispose implements Runnable {

            /* renamed from: b */
            public final SequentialDisposable f62638b;

            /* renamed from: c */
            public final Runnable f62639c;

            public SequentialDispose(SequentialDisposable sequentialDisposable, Runnable runnable) {
                this.f62638b = sequentialDisposable;
                this.f62639c = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                DisposableHelper.m31411c(this.f62638b, ExecutorWorker.this.mo31382b(this.f62639c));
            }
        }

        public ExecutorWorker(Executor executor, boolean z) {
            this.f62628b = z;
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        /* renamed from: b */
        public Disposable mo31382b(@NonNull Runnable runnable) {
            Disposable booleanRunnable;
            EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
            if (this.f62631e) {
                return emptyDisposable;
            }
            Objects.requireNonNull(runnable, "run is null");
            if (this.f62628b) {
                booleanRunnable = new InterruptibleRunnable(runnable, this.f62633g);
                this.f62633g.mo31393b(booleanRunnable);
            } else {
                booleanRunnable = new BooleanRunnable(runnable);
            }
            this.f62630d.offer(booleanRunnable);
            if (this.f62632f.getAndIncrement() == 0) {
                try {
                    this.f62629c.execute(this);
                } catch (RejectedExecutionException e2) {
                    this.f62631e = true;
                    this.f62630d.clear();
                    RxJavaPlugins.m31848b(e2);
                    return emptyDisposable;
                }
            }
            return booleanRunnable;
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        /* renamed from: c */
        public Disposable mo31383c(@NonNull Runnable runnable, long j2, @NonNull TimeUnit timeUnit) {
            EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
            if (j2 <= 0) {
                return mo31382b(runnable);
            }
            if (this.f62631e) {
                return emptyDisposable;
            }
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            Objects.requireNonNull(runnable, "run is null");
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(new SequentialDispose(sequentialDisposable2, runnable), this.f62633g);
            this.f62633g.mo31393b(scheduledRunnable);
            Executor executor = this.f62629c;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    scheduledRunnable.m31772a(((ScheduledExecutorService) executor).schedule((Callable) scheduledRunnable, j2, timeUnit));
                } catch (RejectedExecutionException e2) {
                    this.f62631e = true;
                    RxJavaPlugins.m31848b(e2);
                    return emptyDisposable;
                }
            } else {
                scheduledRunnable.m31772a(new DisposeOnCancel(ExecutorScheduler.f62623c.mo31377d(scheduledRunnable, j2, timeUnit)));
            }
            DisposableHelper.m31411c(sequentialDisposable, scheduledRunnable);
            return sequentialDisposable2;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (this.f62631e) {
                return;
            }
            this.f62631e = true;
            this.f62633g.mo31379f();
            if (this.f62632f.getAndIncrement() == 0) {
                this.f62630d.clear();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            MpscLinkedQueue<Runnable> mpscLinkedQueue = this.f62630d;
            int i2 = 1;
            while (!this.f62631e) {
                do {
                    Runnable poll = mpscLinkedQueue.poll();
                    if (poll != null) {
                        poll.run();
                    } else if (this.f62631e) {
                        mpscLinkedQueue.clear();
                        return;
                    } else {
                        i2 = this.f62632f.addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    }
                } while (!this.f62631e);
                mpscLinkedQueue.clear();
                return;
            }
            mpscLinkedQueue.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62631e;
        }
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    /* renamed from: a */
    public Scheduler.Worker mo31374a() {
        return new ExecutorWorker(null, false);
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    /* renamed from: c */
    public Disposable mo31376c(@NonNull Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        try {
            new ExecutorWorker.BooleanRunnable(runnable);
            throw null;
        } catch (RejectedExecutionException e2) {
            RxJavaPlugins.m31848b(e2);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    /* renamed from: d */
    public Disposable mo31377d(@NonNull Runnable runnable, long j2, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run is null");
        DelayedRunnable delayedRunnable = new DelayedRunnable(runnable);
        DisposableHelper.m31411c(delayedRunnable.f62626b, f62623c.mo31377d(new DelayedDispose(delayedRunnable), j2, timeUnit));
        return delayedRunnable;
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    /* renamed from: e */
    public Disposable mo31378e(@NonNull Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        return super.mo31378e(runnable, j2, j3, timeUnit);
    }
}
