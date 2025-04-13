package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.internal.disposables.EmptyDisposable;

/* loaded from: classes3.dex */
public final class SingleNever extends Single<Object> {
    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super Object> singleObserver) {
        singleObserver.mo31388a(EmptyDisposable.NEVER);
    }
}
