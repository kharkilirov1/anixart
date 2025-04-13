package io.reactivex.internal.operators.observable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.FuseToObservable;

/* loaded from: classes3.dex */
public final class ObservableIgnoreElementsCompletable<T> extends Completable implements FuseToObservable<T> {

    /* renamed from: b */
    public final ObservableSource<T> f61760b;

    public static final class IgnoreObservable<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final CompletableObserver f61761b;

        /* renamed from: c */
        public Disposable f61762c;

        public IgnoreObservable(CompletableObserver completableObserver) {
            this.f61761b = completableObserver;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            this.f61762c = disposable;
            this.f61761b.mo31347a(this);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61762c.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61761b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f61761b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61762c.mo31380s();
        }
    }

    public ObservableIgnoreElementsCompletable(ObservableSource<T> observableSource) {
        this.f61760b = observableSource;
    }

    @Override // io.reactivex.Completable
    /* renamed from: c */
    public void mo31346c(CompletableObserver completableObserver) {
        this.f61760b.mo31364c(new IgnoreObservable(completableObserver));
    }
}
