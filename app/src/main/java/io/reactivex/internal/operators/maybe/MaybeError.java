package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.internal.disposables.EmptyDisposable;

/* loaded from: classes3.dex */
public final class MaybeError<T> extends Maybe<T> {
    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        maybeObserver.mo31355a(EmptyDisposable.INSTANCE);
        maybeObserver.onError(null);
    }
}
