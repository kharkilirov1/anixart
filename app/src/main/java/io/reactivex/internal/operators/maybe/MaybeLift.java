package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;

/* loaded from: classes3.dex */
public final class MaybeLift<T, R> extends AbstractMaybeWithUpstream<T, R> {
    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super R> maybeObserver) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            maybeObserver.mo31355a(EmptyDisposable.INSTANCE);
            maybeObserver.onError(th);
        }
    }
}
