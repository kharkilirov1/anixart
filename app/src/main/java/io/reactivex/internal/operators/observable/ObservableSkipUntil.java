package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;

/* loaded from: classes3.dex */
public final class ObservableSkipUntil<T, U> extends AbstractObservableWithUpstream<T, T> {

    public final class SkipUntil implements Observer<U> {

        /* renamed from: b */
        public final ArrayCompositeDisposable f62041b;

        /* renamed from: c */
        public final SkipUntilObserver<T> f62042c;

        /* renamed from: d */
        public final SerializedObserver<T> f62043d;

        /* renamed from: e */
        public Disposable f62044e;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62044e, disposable)) {
                this.f62044e = disposable;
                this.f62041b.m31408a(1, disposable);
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f62042c.f62048e = true;
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f62041b.mo31379f();
            this.f62043d.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(U u) {
            this.f62044e.mo31379f();
            this.f62042c.f62048e = true;
        }
    }

    public static final class SkipUntilObserver<T> implements Observer<T> {

        /* renamed from: b */
        public final Observer<? super T> f62045b;

        /* renamed from: c */
        public final ArrayCompositeDisposable f62046c;

        /* renamed from: d */
        public Disposable f62047d;

        /* renamed from: e */
        public volatile boolean f62048e;

        /* renamed from: f */
        public boolean f62049f;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62047d, disposable)) {
                this.f62047d = disposable;
                this.f62046c.m31408a(0, disposable);
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f62046c.mo31379f();
            this.f62045b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f62046c.mo31379f();
            this.f62045b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f62049f) {
                this.f62045b.onNext(t);
            } else if (this.f62048e) {
                this.f62049f = true;
                this.f62045b.onNext(t);
            }
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        new SerializedObserver(observer).mo31373a(new ArrayCompositeDisposable(2));
        throw null;
    }
}
