package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class ObservableLastSingle<T> extends Single<T> {

    public static final class LastObserver<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super T> f61796b;

        /* renamed from: c */
        public final T f61797c;

        /* renamed from: d */
        public Disposable f61798d;

        /* renamed from: e */
        public T f61799e;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61798d, disposable)) {
                this.f61798d = disposable;
                this.f61796b.mo31388a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61798d.mo31379f();
            this.f61798d = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61798d = DisposableHelper.DISPOSED;
            T t = this.f61799e;
            if (t != null) {
                this.f61799e = null;
                this.f61796b.onSuccess(t);
                return;
            }
            T t2 = this.f61797c;
            if (t2 != null) {
                this.f61796b.onSuccess(t2);
            } else {
                this.f61796b.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f61798d = DisposableHelper.DISPOSED;
            this.f61799e = null;
            this.f61796b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f61799e = t;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61798d == DisposableHelper.DISPOSED;
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super T> singleObserver) {
        throw null;
    }
}
