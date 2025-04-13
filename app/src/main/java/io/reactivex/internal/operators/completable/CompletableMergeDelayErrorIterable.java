package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.exceptions.Exceptions;

/* loaded from: classes3.dex */
public final class CompletableMergeDelayErrorIterable extends Completable {
    @Override // io.reactivex.Completable
    /* renamed from: c */
    public void mo31346c(CompletableObserver completableObserver) {
        completableObserver.mo31347a(new CompositeDisposable());
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            completableObserver.onError(th);
        }
    }
}
