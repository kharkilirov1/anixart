package io.reactivex.internal.operators.observable;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;

/* loaded from: classes3.dex */
public final class ObservableReduceWithSingle<T, R> extends Single<R> {
    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super R> singleObserver) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            singleObserver.mo31388a(EmptyDisposable.INSTANCE);
            singleObserver.onError(th);
        }
    }
}
