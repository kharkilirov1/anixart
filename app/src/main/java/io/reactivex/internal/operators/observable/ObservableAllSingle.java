package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes3.dex */
public final class ObservableAllSingle<T> extends Single<Boolean> implements FuseToObservable<Boolean> {

    public static final class AllObserver<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super Boolean> f61362b;

        /* renamed from: c */
        public final Predicate<? super T> f61363c;

        /* renamed from: d */
        public Disposable f61364d;

        /* renamed from: e */
        public boolean f61365e;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61364d, disposable)) {
                this.f61364d = disposable;
                this.f61362b.mo31388a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61364d.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f61365e) {
                return;
            }
            this.f61365e = true;
            this.f61362b.onSuccess(Boolean.TRUE);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f61365e) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f61365e = true;
                this.f61362b.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f61365e) {
                return;
            }
            try {
                if (this.f61363c.mo31407b(t)) {
                    return;
                }
                this.f61365e = true;
                this.f61364d.mo31379f();
                this.f61362b.onSuccess(Boolean.FALSE);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61364d.mo31379f();
                onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61364d.mo31380s();
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super Boolean> singleObserver) {
        throw null;
    }
}
