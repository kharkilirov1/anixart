package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ObservableReduceSeedSingle<T, R> extends Single<R> {

    public static final class ReduceSeedObserver<T, R> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super R> f61882b;

        /* renamed from: c */
        public final BiFunction<R, ? super T, R> f61883c;

        /* renamed from: d */
        public R f61884d;

        /* renamed from: e */
        public Disposable f61885e;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61885e, disposable)) {
                this.f61885e = disposable;
                this.f61882b.mo31388a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61885e.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            R r = this.f61884d;
            if (r != null) {
                this.f61884d = null;
                this.f61882b.onSuccess(r);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f61884d == null) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f61884d = null;
                this.f61882b.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            R r = this.f61884d;
            if (r != null) {
                try {
                    R apply = this.f61883c.apply(r, t);
                    Objects.requireNonNull(apply, "The reducer returned a null value");
                    this.f61884d = apply;
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    this.f61885e.mo31379f();
                    onError(th);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61885e.mo31380s();
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super R> singleObserver) {
        throw null;
    }
}
