package io.reactivex.disposables;

import io.reactivex.annotations.NonNull;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
abstract class ReferenceDisposable<T> extends AtomicReference<T> implements Disposable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferenceDisposable(T t) {
        super(t);
        Objects.requireNonNull(t, "value is null");
    }

    /* renamed from: a */
    public abstract void mo31391a(@NonNull T t);

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public final void mo31379f() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        mo31391a(andSet);
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public final boolean mo31380s() {
        return get() == null;
    }
}
