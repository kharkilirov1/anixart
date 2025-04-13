package io.reactivex.internal.operators.single;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;

/* loaded from: classes3.dex */
public final class SingleToObservable<T> extends Observable<T> {

    /* renamed from: b */
    public final SingleSource<? extends T> f62568b;

    public static final class SingleToObservableObserver<T> extends DeferredScalarDisposable<T> implements SingleObserver<T> {

        /* renamed from: d */
        public Disposable f62569d;

        public SingleToObservableObserver(Observer<? super T> observer) {
            super(observer);
        }

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void mo31388a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62569d, disposable)) {
                this.f62569d = disposable;
                this.f59644b.mo31373a(this);
            }
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            super.mo31379f();
            this.f62569d.mo31379f();
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            m31432c(th);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            m31431b(t);
        }
    }

    public SingleToObservable(SingleSource<? extends T> singleSource) {
        this.f62568b = singleSource;
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f62568b.mo31385b(new SingleToObservableObserver(observer));
    }
}
