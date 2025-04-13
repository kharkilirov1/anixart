package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes3.dex */
public final class CompletableFromAction extends Completable {
    @Override // io.reactivex.Completable
    /* renamed from: c */
    public void mo31346c(CompletableObserver completableObserver) {
        Disposable m31397a = Disposables.m31397a();
        completableObserver.mo31347a(m31397a);
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            if (m31397a.mo31380s()) {
                RxJavaPlugins.m31848b(th);
            } else {
                completableObserver.onError(th);
            }
        }
    }
}
