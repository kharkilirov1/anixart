package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class SingleMap<T, R> extends Single<R> {

    public static final class MapSingleObserver<T, R> implements SingleObserver<T> {

        /* renamed from: b */
        public final SingleObserver<? super R> f62538b;

        /* renamed from: c */
        public final Function<? super T, ? extends R> f62539c;

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void mo31388a(Disposable disposable) {
            this.f62538b.mo31388a(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            this.f62538b.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            try {
                R apply = this.f62539c.apply(t);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                this.f62538b.onSuccess(apply);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f62538b.onError(th);
            }
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super R> singleObserver) {
        throw null;
    }
}
