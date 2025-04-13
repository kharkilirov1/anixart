package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class MaybeFromRunnable<T> extends Maybe<T> implements Callable<T> {
    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        Disposable m31397a = Disposables.m31397a();
        maybeObserver.mo31355a(m31397a);
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
                maybeObserver.onError(th);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        throw null;
    }
}
