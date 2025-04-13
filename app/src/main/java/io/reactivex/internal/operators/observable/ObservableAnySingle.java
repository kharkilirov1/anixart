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
public final class ObservableAnySingle<T> extends Single<Boolean> implements FuseToObservable<Boolean> {

    public static final class AnyObserver<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super Boolean> f61376b;

        /* renamed from: c */
        public final Predicate<? super T> f61377c;

        /* renamed from: d */
        public Disposable f61378d;

        /* renamed from: e */
        public boolean f61379e;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61378d, disposable)) {
                this.f61378d = disposable;
                this.f61376b.mo31388a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61378d.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f61379e) {
                return;
            }
            this.f61379e = true;
            this.f61376b.onSuccess(Boolean.FALSE);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f61379e) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f61379e = true;
                this.f61376b.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f61379e) {
                return;
            }
            try {
                if (this.f61377c.mo31407b(t)) {
                    this.f61379e = true;
                    this.f61378d.mo31379f();
                    this.f61376b.onSuccess(Boolean.TRUE);
                }
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61378d.mo31379f();
                onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61378d.mo31380s();
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super Boolean> singleObserver) {
        throw null;
    }
}
