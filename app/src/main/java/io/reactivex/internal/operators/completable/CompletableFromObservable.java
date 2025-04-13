package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/* loaded from: classes3.dex */
public final class CompletableFromObservable<T> extends Completable {

    public static final class CompletableFromObservableObserver<T> implements Observer<T> {

        /* renamed from: b */
        public final CompletableObserver f59724b;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            this.f59724b.mo31347a(disposable);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f59724b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f59724b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
        }
    }

    @Override // io.reactivex.Completable
    /* renamed from: c */
    public void mo31346c(CompletableObserver completableObserver) {
        throw null;
    }
}
