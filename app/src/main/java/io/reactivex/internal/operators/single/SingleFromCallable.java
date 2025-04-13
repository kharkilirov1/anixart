package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes3.dex */
public final class SingleFromCallable<T> extends Single<T> {
    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super T> singleObserver) {
        Disposable m31397a = Disposables.m31397a();
        singleObserver.mo31388a(m31397a);
        if (m31397a.mo31380s()) {
            return;
        }
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            if (m31397a.mo31380s()) {
                RxJavaPlugins.m31848b(th);
            } else {
                singleObserver.onError(th);
            }
        }
    }
}
