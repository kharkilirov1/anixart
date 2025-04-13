package io.reactivex.android.schedulers;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class HandlerScheduler extends Scheduler {

    /* renamed from: c */
    public final Handler f59591c;

    /* renamed from: d */
    public final boolean f59592d;

    public static final class HandlerWorker extends Scheduler.Worker {

        /* renamed from: b */
        public final Handler f59593b;

        /* renamed from: c */
        public final boolean f59594c;

        /* renamed from: d */
        public volatile boolean f59595d;

        public HandlerWorker(Handler handler, boolean z) {
            this.f59593b = handler;
            this.f59594c = z;
        }

        @Override // io.reactivex.Scheduler.Worker
        @SuppressLint
        /* renamed from: c */
        public Disposable mo31383c(Runnable runnable, long j2, TimeUnit timeUnit) {
            EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
            Objects.requireNonNull(runnable, "run == null");
            Objects.requireNonNull(timeUnit, "unit == null");
            if (this.f59595d) {
                return emptyDisposable;
            }
            Handler handler = this.f59593b;
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(handler, runnable);
            Message obtain = Message.obtain(handler, scheduledRunnable);
            obtain.obj = this;
            if (this.f59594c) {
                obtain.setAsynchronous(true);
            }
            this.f59593b.sendMessageDelayed(obtain, timeUnit.toMillis(j2));
            if (!this.f59595d) {
                return scheduledRunnable;
            }
            this.f59593b.removeCallbacks(scheduledRunnable);
            return emptyDisposable;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f59595d = true;
            this.f59593b.removeCallbacksAndMessages(this);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f59595d;
        }
    }

    public static final class ScheduledRunnable implements Runnable, Disposable {

        /* renamed from: b */
        public final Handler f59596b;

        /* renamed from: c */
        public final Runnable f59597c;

        /* renamed from: d */
        public volatile boolean f59598d;

        public ScheduledRunnable(Handler handler, Runnable runnable) {
            this.f59596b = handler;
            this.f59597c = runnable;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f59596b.removeCallbacks(this);
            this.f59598d = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f59597c.run();
            } catch (Throwable th) {
                RxJavaPlugins.m31848b(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f59598d;
        }
    }

    public HandlerScheduler(Handler handler, boolean z) {
        this.f59591c = handler;
        this.f59592d = z;
    }

    @Override // io.reactivex.Scheduler
    /* renamed from: a */
    public Scheduler.Worker mo31374a() {
        return new HandlerWorker(this.f59591c, this.f59592d);
    }

    @Override // io.reactivex.Scheduler
    /* renamed from: d */
    public Disposable mo31377d(Runnable runnable, long j2, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run == null");
        Objects.requireNonNull(timeUnit, "unit == null");
        Handler handler = this.f59591c;
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(handler, runnable);
        handler.postDelayed(scheduledRunnable, timeUnit.toMillis(j2));
        return scheduledRunnable;
    }
}
