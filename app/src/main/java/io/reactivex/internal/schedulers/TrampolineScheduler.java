package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class TrampolineScheduler extends Scheduler {

    /* renamed from: c */
    public static final TrampolineScheduler f62705c = new TrampolineScheduler();

    public static final class SleepingRunnable implements Runnable {

        /* renamed from: b */
        public final Runnable f62706b;

        /* renamed from: c */
        public final TrampolineWorker f62707c;

        /* renamed from: d */
        public final long f62708d;

        public SleepingRunnable(Runnable runnable, TrampolineWorker trampolineWorker, long j2) {
            this.f62706b = runnable;
            this.f62707c = trampolineWorker;
            this.f62708d = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f62707c.f62716e) {
                return;
            }
            long mo31381a = this.f62707c.mo31381a(TimeUnit.MILLISECONDS);
            long j2 = this.f62708d;
            if (j2 > mo31381a) {
                try {
                    Thread.sleep(j2 - mo31381a);
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    RxJavaPlugins.m31848b(e2);
                    return;
                }
            }
            if (this.f62707c.f62716e) {
                return;
            }
            this.f62706b.run();
        }
    }

    public static final class TimedRunnable implements Comparable<TimedRunnable> {

        /* renamed from: b */
        public final Runnable f62709b;

        /* renamed from: c */
        public final long f62710c;

        /* renamed from: d */
        public final int f62711d;

        /* renamed from: e */
        public volatile boolean f62712e;

        public TimedRunnable(Runnable runnable, Long l2, int i2) {
            this.f62709b = runnable;
            this.f62710c = l2.longValue();
            this.f62711d = i2;
        }

        @Override // java.lang.Comparable
        public int compareTo(TimedRunnable timedRunnable) {
            TimedRunnable timedRunnable2 = timedRunnable;
            int m31425a = ObjectHelper.m31425a(this.f62710c, timedRunnable2.f62710c);
            if (m31425a != 0) {
                return m31425a;
            }
            int i2 = this.f62711d;
            int i3 = timedRunnable2.f62711d;
            if (i2 < i3) {
                return -1;
            }
            return i2 > i3 ? 1 : 0;
        }
    }

    public static final class TrampolineWorker extends Scheduler.Worker {

        /* renamed from: b */
        public final PriorityBlockingQueue<TimedRunnable> f62713b = new PriorityBlockingQueue<>();

        /* renamed from: c */
        public final AtomicInteger f62714c = new AtomicInteger();

        /* renamed from: d */
        public final AtomicInteger f62715d = new AtomicInteger();

        /* renamed from: e */
        public volatile boolean f62716e;

        public final class AppendToQueueTask implements Runnable {

            /* renamed from: b */
            public final TimedRunnable f62717b;

            public AppendToQueueTask(TimedRunnable timedRunnable) {
                this.f62717b = timedRunnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f62717b.f62712e = true;
                TrampolineWorker.this.f62713b.remove(this.f62717b);
            }
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        /* renamed from: b */
        public Disposable mo31382b(@NonNull Runnable runnable) {
            return m31775e(runnable, mo31381a(TimeUnit.MILLISECONDS));
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        /* renamed from: c */
        public Disposable mo31383c(@NonNull Runnable runnable, long j2, @NonNull TimeUnit timeUnit) {
            long millis = timeUnit.toMillis(j2) + mo31381a(TimeUnit.MILLISECONDS);
            return m31775e(new SleepingRunnable(runnable, this, millis), millis);
        }

        /* renamed from: e */
        public Disposable m31775e(Runnable runnable, long j2) {
            EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
            if (this.f62716e) {
                return emptyDisposable;
            }
            TimedRunnable timedRunnable = new TimedRunnable(runnable, Long.valueOf(j2), this.f62715d.incrementAndGet());
            this.f62713b.add(timedRunnable);
            if (this.f62714c.getAndIncrement() != 0) {
                return Disposables.m31398b(new AppendToQueueTask(timedRunnable));
            }
            int i2 = 1;
            while (!this.f62716e) {
                TimedRunnable poll = this.f62713b.poll();
                if (poll == null) {
                    i2 = this.f62714c.addAndGet(-i2);
                    if (i2 == 0) {
                        return emptyDisposable;
                    }
                } else if (!poll.f62712e) {
                    poll.f62709b.run();
                }
            }
            this.f62713b.clear();
            return emptyDisposable;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f62716e = true;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62716e;
        }
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    /* renamed from: a */
    public Scheduler.Worker mo31374a() {
        return new TrampolineWorker();
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    /* renamed from: c */
    public Disposable mo31376c(@NonNull Runnable runnable) {
        runnable.run();
        return EmptyDisposable.INSTANCE;
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    /* renamed from: d */
    public Disposable mo31377d(@NonNull Runnable runnable, long j2, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j2);
            Objects.requireNonNull(runnable, "run is null");
            runnable.run();
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            RxJavaPlugins.m31848b(e2);
        }
        return EmptyDisposable.INSTANCE;
    }
}
