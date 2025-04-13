package io.reactivex.internal.operators.mixed;

import io.reactivex.CompletableObserver;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class CompletableAndThenObservable<R> extends Observable<R> {

    public static final class AndThenObservableObserver<R> extends AtomicReference<Disposable> implements Observer<R>, CompletableObserver, Disposable {

        /* renamed from: b */
        public final Observer<? super R> f61174b;

        /* renamed from: c */
        public ObservableSource<? extends R> f61175c = null;

        public AndThenObservableObserver(Observer<? super R> observer, ObservableSource<? extends R> observableSource) {
            this.f61174b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31411c(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            ObservableSource<? extends R> observableSource = this.f61175c;
            if (observableSource == null) {
                this.f61174b.onComplete();
            } else {
                this.f61175c = null;
                observableSource.mo31364c(this);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f61174b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(R r) {
            this.f61174b.onNext(r);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super R> observer) {
        observer.mo31373a(new AndThenObservableObserver(observer, null));
        throw null;
    }
}
