package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes3.dex */
public final class SingleDoAfterSuccess<T> extends Single<T> {

    public static final class DoAfterObserver<T> implements SingleObserver<T>, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super T> f62469b;

        /* renamed from: c */
        public final Consumer<? super T> f62470c;

        /* renamed from: d */
        public Disposable f62471d;

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void mo31388a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62471d, disposable)) {
                this.f62471d = disposable;
                this.f62469b.mo31388a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f62471d.mo31379f();
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            this.f62469b.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            this.f62469b.onSuccess(t);
            try {
                this.f62470c.accept(t);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                RxJavaPlugins.m31848b(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62471d.mo31380s();
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super T> singleObserver) {
        throw null;
    }
}
