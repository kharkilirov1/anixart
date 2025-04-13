package io.reactivex;

import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.schedulers.NewThreadWorker;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.schedulers.SchedulerRunnableIntrospection;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class Scheduler {

    /* renamed from: b */
    public static final long f59573b = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    public static final class DisposeTask implements Disposable, Runnable, SchedulerRunnableIntrospection {

        /* renamed from: b */
        @NonNull
        public final Runnable f59574b;

        /* renamed from: c */
        @NonNull
        public final Worker f59575c;

        /* renamed from: d */
        @Nullable
        public Thread f59576d;

        public DisposeTask(@NonNull Runnable runnable, @NonNull Worker worker) {
            this.f59574b = runnable;
            this.f59575c = worker;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (this.f59576d == Thread.currentThread()) {
                Worker worker = this.f59575c;
                if (worker instanceof NewThreadWorker) {
                    NewThreadWorker newThreadWorker = (NewThreadWorker) worker;
                    if (newThreadWorker.f62671c) {
                        return;
                    }
                    newThreadWorker.f62671c = true;
                    newThreadWorker.f62670b.shutdown();
                    return;
                }
            }
            this.f59575c.mo31379f();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f59576d = Thread.currentThread();
            try {
                this.f59574b.run();
            } finally {
                mo31379f();
                this.f59576d = null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f59575c.mo31380s();
        }
    }

    public static final class PeriodicDirectTask implements Disposable, Runnable, SchedulerRunnableIntrospection {

        /* renamed from: b */
        @NonNull
        public final Runnable f59577b;

        /* renamed from: c */
        @NonNull
        public final Worker f59578c;

        /* renamed from: d */
        public volatile boolean f59579d;

        public PeriodicDirectTask(@NonNull Runnable runnable, @NonNull Worker worker) {
            this.f59577b = runnable;
            this.f59578c = worker;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f59579d = true;
            this.f59578c.mo31379f();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f59579d) {
                return;
            }
            try {
                this.f59577b.run();
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f59578c.mo31379f();
                throw ExceptionHelper.m31821e(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f59579d;
        }
    }

    public static abstract class Worker implements Disposable {

        public final class PeriodicTask implements Runnable, SchedulerRunnableIntrospection {

            /* renamed from: b */
            @NonNull
            public final Runnable f59580b;

            /* renamed from: c */
            @NonNull
            public final SequentialDisposable f59581c;

            /* renamed from: d */
            public final long f59582d;

            /* renamed from: e */
            public long f59583e;

            /* renamed from: f */
            public long f59584f;

            /* renamed from: g */
            public long f59585g;

            public PeriodicTask(long j2, @NonNull Runnable runnable, long j3, @NonNull SequentialDisposable sequentialDisposable, long j4) {
                this.f59580b = runnable;
                this.f59581c = sequentialDisposable;
                this.f59582d = j4;
                this.f59584f = j3;
                this.f59585g = j2;
            }

            @Override // java.lang.Runnable
            public void run() {
                long j2;
                this.f59580b.run();
                if (this.f59581c.mo31380s()) {
                    return;
                }
                Worker worker = Worker.this;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                long mo31381a = worker.mo31381a(timeUnit);
                long j3 = Scheduler.f59573b;
                long j4 = mo31381a + j3;
                long j5 = this.f59584f;
                if (j4 >= j5) {
                    long j6 = this.f59582d;
                    if (mo31381a < j5 + j6 + j3) {
                        long j7 = this.f59585g;
                        long j8 = this.f59583e + 1;
                        this.f59583e = j8;
                        j2 = (j8 * j6) + j7;
                        this.f59584f = mo31381a;
                        DisposableHelper.m31411c(this.f59581c, Worker.this.mo31383c(this, j2 - mo31381a, timeUnit));
                    }
                }
                long j9 = this.f59582d;
                j2 = mo31381a + j9;
                long j10 = this.f59583e + 1;
                this.f59583e = j10;
                this.f59585g = j2 - (j9 * j10);
                this.f59584f = mo31381a;
                DisposableHelper.m31411c(this.f59581c, Worker.this.mo31383c(this, j2 - mo31381a, timeUnit));
            }
        }

        /* renamed from: a */
        public long mo31381a(@NonNull TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @NonNull
        /* renamed from: b */
        public Disposable mo31382b(@NonNull Runnable runnable) {
            return mo31383c(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        @NonNull
        /* renamed from: c */
        public abstract Disposable mo31383c(@NonNull Runnable runnable, long j2, @NonNull TimeUnit timeUnit);

        @NonNull
        /* renamed from: d */
        public Disposable mo31384d(@NonNull Runnable runnable, long j2, long j3, @NonNull TimeUnit timeUnit) {
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            long nanos = timeUnit.toNanos(j3);
            long mo31381a = mo31381a(TimeUnit.NANOSECONDS);
            Disposable mo31383c = mo31383c(new PeriodicTask(timeUnit.toNanos(j2) + mo31381a, runnable, mo31381a, sequentialDisposable2, nanos), j2, timeUnit);
            if (mo31383c == EmptyDisposable.INSTANCE) {
                return mo31383c;
            }
            DisposableHelper.m31411c(sequentialDisposable, mo31383c);
            return sequentialDisposable2;
        }
    }

    @NonNull
    /* renamed from: a */
    public abstract Worker mo31374a();

    /* renamed from: b */
    public long mo31375b(@NonNull TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @NonNull
    /* renamed from: c */
    public Disposable mo31376c(@NonNull Runnable runnable) {
        return mo31377d(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    @NonNull
    /* renamed from: d */
    public Disposable mo31377d(@NonNull Runnable runnable, long j2, @NonNull TimeUnit timeUnit) {
        Worker mo31374a = mo31374a();
        Objects.requireNonNull(runnable, "run is null");
        DisposeTask disposeTask = new DisposeTask(runnable, mo31374a);
        mo31374a.mo31383c(disposeTask, j2, timeUnit);
        return disposeTask;
    }

    @NonNull
    /* renamed from: e */
    public Disposable mo31378e(@NonNull Runnable runnable, long j2, long j3, @NonNull TimeUnit timeUnit) {
        Worker mo31374a = mo31374a();
        Objects.requireNonNull(runnable, "run is null");
        PeriodicDirectTask periodicDirectTask = new PeriodicDirectTask(runnable, mo31374a);
        Disposable mo31384d = mo31374a.mo31384d(periodicDirectTask, j2, j3, timeUnit);
        return mo31384d == EmptyDisposable.INSTANCE ? mo31384d : periodicDirectTask;
    }
}
