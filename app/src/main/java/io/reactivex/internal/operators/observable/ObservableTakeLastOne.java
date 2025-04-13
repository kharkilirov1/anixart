package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes3.dex */
public final class ObservableTakeLastOne<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class TakeLastOneObserver<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f62089b;

        /* renamed from: c */
        public Disposable f62090c;

        /* renamed from: d */
        public T f62091d;

        public TakeLastOneObserver(Observer<? super T> observer) {
            this.f62089b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62090c, disposable)) {
                this.f62090c = disposable;
                this.f62089b.mo31373a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f62091d = null;
            this.f62090c.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            T t = this.f62091d;
            if (t != null) {
                this.f62091d = null;
                this.f62089b.onNext(t);
            }
            this.f62089b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f62091d = null;
            this.f62089b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f62091d = t;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62090c.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f61337b.mo31364c(new TakeLastOneObserver(observer));
    }
}
