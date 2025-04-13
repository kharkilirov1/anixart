package io.reactivex.observers;

import io.reactivex.MaybeObserver;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public abstract class DisposableMaybeObserver<T> implements MaybeObserver<T>, Disposable {

    /* renamed from: b */
    public final AtomicReference<Disposable> f62816b = new AtomicReference<>();

    @Override // io.reactivex.MaybeObserver
    /* renamed from: a */
    public final void mo31355a(@NonNull Disposable disposable) {
        EndConsumerHelper.m31815b(this.f62816b, disposable, getClass());
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public final void mo31379f() {
        DisposableHelper.m31409a(this.f62816b);
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public final boolean mo31380s() {
        return this.f62816b.get() == DisposableHelper.DISPOSED;
    }
}
