package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableInterval extends Observable<Long> {

    /* renamed from: b */
    public final Scheduler f61766b;

    /* renamed from: c */
    public final long f61767c;

    /* renamed from: d */
    public final long f61768d;

    /* renamed from: e */
    public final TimeUnit f61769e;

    public static final class IntervalObserver extends AtomicReference<Disposable> implements Disposable, Runnable {

        /* renamed from: b */
        public final Observer<? super Long> f61770b;

        /* renamed from: c */
        public long f61771c;

        public IntervalObserver(Observer<? super Long> observer) {
            this.f61770b = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() != DisposableHelper.DISPOSED) {
                Observer<? super Long> observer = this.f61770b;
                long j2 = this.f61771c;
                this.f61771c = 1 + j2;
                observer.onNext(Long.valueOf(j2));
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return get() == DisposableHelper.DISPOSED;
        }
    }

    public ObservableInterval(long j2, long j3, TimeUnit timeUnit, Scheduler scheduler) {
        this.f61767c = j2;
        this.f61768d = j3;
        this.f61769e = timeUnit;
        this.f61766b = scheduler;
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super Long> observer) {
        IntervalObserver intervalObserver = new IntervalObserver(observer);
        observer.mo31373a(intervalObserver);
        Scheduler scheduler = this.f61766b;
        if (!(scheduler instanceof TrampolineScheduler)) {
            DisposableHelper.m31413e(intervalObserver, scheduler.mo31378e(intervalObserver, this.f61767c, this.f61768d, this.f61769e));
            return;
        }
        Scheduler.Worker mo31374a = scheduler.mo31374a();
        DisposableHelper.m31413e(intervalObserver, mo31374a);
        mo31374a.mo31384d(intervalObserver, this.f61767c, this.f61768d, this.f61769e);
    }
}
