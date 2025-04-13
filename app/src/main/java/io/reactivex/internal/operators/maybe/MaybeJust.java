package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.fuseable.ScalarCallable;

/* loaded from: classes3.dex */
public final class MaybeJust<T> extends Maybe<T> implements ScalarCallable<T> {
    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        maybeObserver.mo31355a(EmptyDisposable.INSTANCE);
        maybeObserver.onSuccess(null);
    }

    @Override // java.util.concurrent.Callable
    public T call() {
        return null;
    }
}
