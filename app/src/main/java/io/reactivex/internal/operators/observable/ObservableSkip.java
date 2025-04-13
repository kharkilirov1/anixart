package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes3.dex */
public final class ObservableSkip<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class SkipObserver<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f62025b;

        /* renamed from: c */
        public long f62026c;

        /* renamed from: d */
        public Disposable f62027d;

        public SkipObserver(Observer<? super T> observer, long j2) {
            this.f62025b = observer;
            this.f62026c = j2;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62027d, disposable)) {
                this.f62027d = disposable;
                this.f62025b.mo31373a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f62027d.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f62025b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f62025b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            long j2 = this.f62026c;
            if (j2 != 0) {
                this.f62026c = j2 - 1;
            } else {
                this.f62025b.onNext(t);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62027d.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f61337b.mo31364c(new SkipObserver(observer, 0L));
    }
}
