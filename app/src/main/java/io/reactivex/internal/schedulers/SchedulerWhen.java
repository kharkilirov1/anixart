package io.reactivex.internal.schedulers;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.processors.FlowableProcessor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class SchedulerWhen extends Scheduler implements Disposable {

    /* renamed from: c */
    public static final Disposable f62686c = new SubscribedDisposable();

    public static final class CreateWorkerFunction implements Function<ScheduledAction, Completable> {

        /* renamed from: b */
        public final Scheduler.Worker f62687b;

        public final class WorkerCompletable extends Completable {

            /* renamed from: b */
            public final ScheduledAction f62688b;

            public WorkerCompletable(ScheduledAction scheduledAction) {
                this.f62688b = scheduledAction;
            }

            @Override // io.reactivex.Completable
            /* renamed from: c */
            public void mo31346c(CompletableObserver completableObserver) {
                Disposable disposable;
                completableObserver.mo31347a(this.f62688b);
                ScheduledAction scheduledAction = this.f62688b;
                Scheduler.Worker worker = CreateWorkerFunction.this.f62687b;
                Disposable disposable2 = scheduledAction.get();
                Disposable disposable3 = SchedulerWhen.f62686c;
                if (disposable2 != EmptyDisposable.INSTANCE && disposable2 == (disposable = SchedulerWhen.f62686c)) {
                    Disposable mo31774a = scheduledAction.mo31774a(worker, completableObserver);
                    if (scheduledAction.compareAndSet(disposable, mo31774a)) {
                        return;
                    }
                    mo31774a.mo31379f();
                }
            }
        }

        @Override // io.reactivex.functions.Function
        public Completable apply(ScheduledAction scheduledAction) throws Exception {
            return new WorkerCompletable(scheduledAction);
        }
    }

    public static class DelayedAction extends ScheduledAction {

        /* renamed from: b */
        public final Runnable f62690b;

        /* renamed from: c */
        public final long f62691c;

        /* renamed from: d */
        public final TimeUnit f62692d;

        public DelayedAction(Runnable runnable, long j2, TimeUnit timeUnit) {
            this.f62690b = runnable;
            this.f62691c = j2;
            this.f62692d = timeUnit;
        }

        @Override // io.reactivex.internal.schedulers.SchedulerWhen.ScheduledAction
        /* renamed from: a */
        public Disposable mo31774a(Scheduler.Worker worker, CompletableObserver completableObserver) {
            return worker.mo31383c(new OnCompletedAction(this.f62690b, completableObserver), this.f62691c, this.f62692d);
        }
    }

    public static class ImmediateAction extends ScheduledAction {

        /* renamed from: b */
        public final Runnable f62693b;

        public ImmediateAction(Runnable runnable) {
            this.f62693b = runnable;
        }

        @Override // io.reactivex.internal.schedulers.SchedulerWhen.ScheduledAction
        /* renamed from: a */
        public Disposable mo31774a(Scheduler.Worker worker, CompletableObserver completableObserver) {
            return worker.mo31382b(new OnCompletedAction(this.f62693b, completableObserver));
        }
    }

    public static class OnCompletedAction implements Runnable {

        /* renamed from: b */
        public final CompletableObserver f62694b;

        /* renamed from: c */
        public final Runnable f62695c;

        public OnCompletedAction(Runnable runnable, CompletableObserver completableObserver) {
            this.f62695c = runnable;
            this.f62694b = completableObserver;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f62695c.run();
            } finally {
                this.f62694b.onComplete();
            }
        }
    }

    public static final class QueueWorker extends Scheduler.Worker {

        /* renamed from: b */
        public final AtomicBoolean f62696b;

        /* renamed from: c */
        public final FlowableProcessor<ScheduledAction> f62697c;

        /* renamed from: d */
        public final Scheduler.Worker f62698d;

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        /* renamed from: b */
        public Disposable mo31382b(@NonNull Runnable runnable) {
            ImmediateAction immediateAction = new ImmediateAction(runnable);
            this.f62697c.onNext(immediateAction);
            return immediateAction;
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        /* renamed from: c */
        public Disposable mo31383c(@NonNull Runnable runnable, long j2, @NonNull TimeUnit timeUnit) {
            DelayedAction delayedAction = new DelayedAction(runnable, j2, timeUnit);
            this.f62697c.onNext(delayedAction);
            return delayedAction;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (this.f62696b.compareAndSet(false, true)) {
                this.f62697c.onComplete();
                this.f62698d.mo31379f();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62696b.get();
        }
    }

    public static abstract class ScheduledAction extends AtomicReference<Disposable> implements Disposable {
        public ScheduledAction() {
            super(SchedulerWhen.f62686c);
        }

        /* renamed from: a */
        public abstract Disposable mo31774a(Scheduler.Worker worker, CompletableObserver completableObserver);

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            Disposable disposable;
            EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
            Disposable disposable2 = SchedulerWhen.f62686c;
            do {
                disposable = get();
                Disposable disposable3 = SchedulerWhen.f62686c;
                if (disposable == emptyDisposable) {
                    return;
                }
            } while (!compareAndSet(disposable, emptyDisposable));
            if (disposable != SchedulerWhen.f62686c) {
                disposable.mo31379f();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return get().mo31380s();
        }
    }

    public static final class SubscribedDisposable implements Disposable {
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

    @Override // io.reactivex.Scheduler
    @NonNull
    /* renamed from: a */
    public Scheduler.Worker mo31374a() {
        throw null;
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
        throw null;
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public boolean mo31380s() {
        throw null;
    }
}
