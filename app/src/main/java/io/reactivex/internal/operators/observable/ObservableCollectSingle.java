package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes3.dex */
public final class ObservableCollectSingle<T, U> extends Single<U> implements FuseToObservable<U> {

    public static final class CollectObserver<T, U> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super U> f61466b;

        /* renamed from: c */
        public final BiConsumer<? super U, ? super T> f61467c;

        /* renamed from: d */
        public final U f61468d;

        /* renamed from: e */
        public Disposable f61469e;

        /* renamed from: f */
        public boolean f61470f;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61469e, disposable)) {
                this.f61469e = disposable;
                this.f61466b.mo31388a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61469e.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f61470f) {
                return;
            }
            this.f61470f = true;
            this.f61466b.onSuccess(this.f61468d);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f61470f) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f61470f = true;
                this.f61466b.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f61470f) {
                return;
            }
            try {
                this.f61467c.mo31403a(this.f61468d, t);
            } catch (Throwable th) {
                this.f61469e.mo31379f();
                onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61469e.mo31380s();
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super U> singleObserver) {
        try {
            throw null;
        } catch (Throwable th) {
            singleObserver.mo31388a(EmptyDisposable.INSTANCE);
            singleObserver.onError(th);
        }
    }
}
