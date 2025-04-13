package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class SingleDoOnSuccess<T> extends Single<T> {

    public final class DoOnSuccess implements SingleObserver<T> {

        /* renamed from: b */
        public final SingleObserver<? super T> f62491b;

        /* renamed from: c */
        public final /* synthetic */ SingleDoOnSuccess f62492c;

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void mo31388a(Disposable disposable) {
            this.f62491b.mo31388a(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            this.f62491b.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            try {
                Objects.requireNonNull(this.f62492c);
                throw null;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f62491b.onError(th);
            }
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super T> singleObserver) {
        throw null;
    }
}
