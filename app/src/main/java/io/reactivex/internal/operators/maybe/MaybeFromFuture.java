package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public final class MaybeFromFuture<T> extends Maybe<T> {
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
            th = th;
            if (th instanceof ExecutionException) {
                th = th.getCause();
            }
            Exceptions.m31402a(th);
            if (m31397a.mo31380s()) {
                return;
            }
            maybeObserver.onError(th);
        }
    }
}
