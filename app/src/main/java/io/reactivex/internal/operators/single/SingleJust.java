package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.internal.disposables.EmptyDisposable;

/* loaded from: classes3.dex */
public final class SingleJust<T> extends Single<T> {
    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super T> singleObserver) {
        singleObserver.mo31388a(EmptyDisposable.INSTANCE);
        singleObserver.onSuccess(null);
    }
}
