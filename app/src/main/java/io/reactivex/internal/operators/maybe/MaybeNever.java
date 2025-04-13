package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.internal.disposables.EmptyDisposable;

/* loaded from: classes3.dex */
public final class MaybeNever extends Maybe<Object> {
    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super Object> maybeObserver) {
        maybeObserver.mo31355a(EmptyDisposable.NEVER);
    }
}
