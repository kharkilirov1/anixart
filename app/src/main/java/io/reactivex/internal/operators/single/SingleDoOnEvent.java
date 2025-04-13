package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class SingleDoOnEvent<T> extends Single<T> {

    public final class DoOnEvent implements SingleObserver<T> {

        /* renamed from: b */
        public final SingleObserver<? super T> f62484b;

        /* renamed from: c */
        public final /* synthetic */ SingleDoOnEvent f62485c;

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void mo31388a(Disposable disposable) {
            this.f62484b.mo31388a(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            try {
                Objects.requireNonNull(this.f62485c);
                throw null;
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                this.f62484b.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            try {
                Objects.requireNonNull(this.f62485c);
                throw null;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f62484b.onError(th);
            }
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super T> singleObserver) {
        throw null;
    }
}
