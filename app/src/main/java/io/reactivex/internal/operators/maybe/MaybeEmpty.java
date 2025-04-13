package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.fuseable.ScalarCallable;

/* loaded from: classes3.dex */
public final class MaybeEmpty extends Maybe<Object> implements ScalarCallable<Object> {
    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super Object> maybeObserver) {
        maybeObserver.mo31355a(EmptyDisposable.INSTANCE);
        maybeObserver.onComplete();
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return null;
    }
}
