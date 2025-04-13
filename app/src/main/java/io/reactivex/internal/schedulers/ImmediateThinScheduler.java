package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class ImmediateThinScheduler extends Scheduler {

    /* renamed from: c */
    public static final Scheduler.Worker f62641c = new ImmediateThinWorker();

    /* renamed from: d */
    public static final Disposable f62642d;

    public static final class ImmediateThinWorker extends Scheduler.Worker {
        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        /* renamed from: b */
        public Disposable mo31382b(@NonNull Runnable runnable) {
            runnable.run();
            return ImmediateThinScheduler.f62642d;
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        /* renamed from: c */
        public Disposable mo31383c(@NonNull Runnable runnable, long j2, @NonNull TimeUnit timeUnit) {
            throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        /* renamed from: d */
        public Disposable mo31384d(@NonNull Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
            throw new UnsupportedOperationException("This scheduler doesn't support periodic execution");
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return false;
        }
    }

    static {
        Disposable m31397a = Disposables.m31397a();
        f62642d = m31397a;
        m31397a.mo31379f();
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    /* renamed from: a */
    public Scheduler.Worker mo31374a() {
        return f62641c;
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    /* renamed from: c */
    public Disposable mo31376c(@NonNull Runnable runnable) {
        runnable.run();
        return f62642d;
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    /* renamed from: d */
    public Disposable mo31377d(@NonNull Runnable runnable, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    /* renamed from: e */
    public Disposable mo31378e(@NonNull Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support periodic execution");
    }
}
