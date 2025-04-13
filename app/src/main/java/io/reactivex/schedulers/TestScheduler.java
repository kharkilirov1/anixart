package io.reactivex.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class TestScheduler extends Scheduler {

    /* renamed from: c */
    public final Queue<TimedRunnable> f62906c = new PriorityBlockingQueue(11);

    /* renamed from: d */
    public long f62907d;

    public final class TestWorker extends Scheduler.Worker {

        /* renamed from: b */
        public volatile boolean f62908b;

        public final class QueueRemove implements Runnable {

            /* renamed from: b */
            public final TimedRunnable f62910b;

            public QueueRemove(TimedRunnable timedRunnable) {
                this.f62910b = timedRunnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                TestScheduler.this.f62906c.remove(this.f62910b);
            }
        }

        public TestWorker() {
        }

        @Override // io.reactivex.Scheduler.Worker
        /* renamed from: a */
        public long mo31381a(@NonNull TimeUnit timeUnit) {
            return TestScheduler.this.mo31375b(timeUnit);
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        /* renamed from: b */
        public Disposable mo31382b(@NonNull Runnable runnable) {
            if (this.f62908b) {
                return EmptyDisposable.INSTANCE;
            }
            TestScheduler testScheduler = TestScheduler.this;
            long j2 = testScheduler.f62907d;
            testScheduler.f62907d = 1 + j2;
            TimedRunnable timedRunnable = new TimedRunnable(this, 0L, runnable, j2);
            testScheduler.f62906c.add(timedRunnable);
            return Disposables.m31398b(new QueueRemove(timedRunnable));
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        /* renamed from: c */
        public Disposable mo31383c(@NonNull Runnable runnable, long j2, @NonNull TimeUnit timeUnit) {
            if (this.f62908b) {
                return EmptyDisposable.INSTANCE;
            }
            Objects.requireNonNull(TestScheduler.this);
            long nanos = timeUnit.toNanos(j2) + 0;
            TestScheduler testScheduler = TestScheduler.this;
            long j3 = testScheduler.f62907d;
            testScheduler.f62907d = 1 + j3;
            TimedRunnable timedRunnable = new TimedRunnable(this, nanos, runnable, j3);
            testScheduler.f62906c.add(timedRunnable);
            return Disposables.m31398b(new QueueRemove(timedRunnable));
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f62908b = true;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62908b;
        }
    }

    public static final class TimedRunnable implements Comparable<TimedRunnable> {

        /* renamed from: b */
        public final long f62912b;

        /* renamed from: c */
        public final Runnable f62913c;

        /* renamed from: d */
        public final long f62914d;

        public TimedRunnable(TestWorker testWorker, long j2, Runnable runnable, long j3) {
            this.f62912b = j2;
            this.f62913c = runnable;
            this.f62914d = j3;
        }

        @Override // java.lang.Comparable
        public int compareTo(TimedRunnable timedRunnable) {
            TimedRunnable timedRunnable2 = timedRunnable;
            long j2 = this.f62912b;
            long j3 = timedRunnable2.f62912b;
            return j2 == j3 ? ObjectHelper.m31425a(this.f62914d, timedRunnable2.f62914d) : ObjectHelper.m31425a(j2, j3);
        }

        public String toString() {
            return String.format("TimedRunnable(time = %d, run = %s)", Long.valueOf(this.f62912b), this.f62913c.toString());
        }
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    /* renamed from: a */
    public Scheduler.Worker mo31374a() {
        return new TestWorker();
    }

    @Override // io.reactivex.Scheduler
    /* renamed from: b */
    public long mo31375b(@NonNull TimeUnit timeUnit) {
        return timeUnit.convert(0L, TimeUnit.NANOSECONDS);
    }
}
