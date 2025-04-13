package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;
import io.reactivex.internal.observers.DeferredScalarDisposable;

/* loaded from: classes3.dex */
public final class MaybeToObservable<T> extends Observable<T> implements HasUpstreamMaybeSource<T> {

    public static final class MaybeToObservableObserver<T> extends DeferredScalarDisposable<T> implements MaybeObserver<T> {

        /* renamed from: d */
        public Disposable f61154d;

        public MaybeToObservableObserver(Observer<? super T> observer) {
            super(observer);
        }

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61154d, disposable)) {
                this.f61154d = disposable;
                this.f59644b.mo31373a(this);
            }
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            super.mo31379f();
            this.f61154d.mo31379f();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            if ((get() & 54) != 0) {
                return;
            }
            lazySet(2);
            this.f59644b.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            m31432c(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            m31431b(t);
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        new MaybeToObservableObserver(observer);
        throw null;
    }
}
