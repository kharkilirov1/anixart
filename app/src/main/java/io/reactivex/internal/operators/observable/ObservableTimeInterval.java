package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.schedulers.Timed;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class ObservableTimeInterval<T> extends AbstractObservableWithUpstream<T, Timed<T>> {

    public static final class TimeIntervalObserver<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super Timed<T>> f62134b;

        /* renamed from: e */
        public long f62137e;

        /* renamed from: f */
        public Disposable f62138f;

        /* renamed from: d */
        public final Scheduler f62136d = null;

        /* renamed from: c */
        public final TimeUnit f62135c = null;

        public TimeIntervalObserver(Observer<? super Timed<T>> observer, TimeUnit timeUnit, Scheduler scheduler) {
            this.f62134b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62138f, disposable)) {
                this.f62138f = disposable;
                this.f62137e = this.f62136d.mo31375b(this.f62135c);
                this.f62134b.mo31373a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f62138f.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f62134b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f62134b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            long mo31375b = this.f62136d.mo31375b(this.f62135c);
            long j2 = this.f62137e;
            this.f62137e = mo31375b;
            this.f62134b.onNext(new Timed(t, mo31375b - j2, this.f62135c));
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62138f.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super Timed<T>> observer) {
        this.f61337b.mo31364c(new TimeIntervalObserver(observer, null, null));
    }
}
