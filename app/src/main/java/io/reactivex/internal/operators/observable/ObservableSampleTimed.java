package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableSampleTimed<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class SampleTimedEmitLast<T> extends SampleTimedObserver<T> {

        /* renamed from: h */
        public final AtomicInteger f61959h;

        @Override // io.reactivex.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
        /* renamed from: b */
        public void mo31712b() {
            m31713c();
            if (this.f61959h.decrementAndGet() == 0) {
                this.f61960b.onComplete();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f61959h.incrementAndGet() == 2) {
                m31713c();
                if (this.f61959h.decrementAndGet() == 0) {
                    this.f61960b.onComplete();
                }
            }
        }
    }

    public static final class SampleTimedNoLast<T> extends SampleTimedObserver<T> {
        public SampleTimedNoLast(Observer<? super T> observer, long j2, TimeUnit timeUnit, Scheduler scheduler) {
            super(observer, j2, null, null);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
        /* renamed from: b */
        public void mo31712b() {
            this.f61960b.onComplete();
        }

        @Override // java.lang.Runnable
        public void run() {
            m31713c();
        }
    }

    public static abstract class SampleTimedObserver<T> extends AtomicReference<T> implements Observer<T>, Disposable, Runnable {

        /* renamed from: b */
        public final Observer<? super T> f61960b;

        /* renamed from: c */
        public final long f61961c;

        /* renamed from: d */
        public final TimeUnit f61962d;

        /* renamed from: e */
        public final Scheduler f61963e;

        /* renamed from: f */
        public final AtomicReference<Disposable> f61964f = new AtomicReference<>();

        /* renamed from: g */
        public Disposable f61965g;

        public SampleTimedObserver(Observer<? super T> observer, long j2, TimeUnit timeUnit, Scheduler scheduler) {
            this.f61960b = observer;
            this.f61961c = j2;
            this.f61962d = timeUnit;
            this.f61963e = scheduler;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61965g, disposable)) {
                this.f61965g = disposable;
                this.f61960b.mo31373a(this);
                Scheduler scheduler = this.f61963e;
                long j2 = this.f61961c;
                DisposableHelper.m31411c(this.f61964f, scheduler.mo31378e(this, j2, j2, this.f61962d));
            }
        }

        /* renamed from: b */
        public abstract void mo31712b();

        /* renamed from: c */
        public void m31713c() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.f61960b.onNext(andSet);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this.f61964f);
            this.f61965g.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            DisposableHelper.m31409a(this.f61964f);
            mo31712b();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            DisposableHelper.m31409a(this.f61964f);
            this.f61960b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61965g.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f61337b.mo31364c(new SampleTimedNoLast(new SerializedObserver(observer), 0L, null, null));
    }
}
