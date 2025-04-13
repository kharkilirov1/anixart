package io.reactivex.observers;

import io.reactivex.SingleObserver;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public abstract class DisposableSingleObserver<T> implements SingleObserver<T>, Disposable {

    /* renamed from: b */
    public final AtomicReference<Disposable> f62818b = new AtomicReference<>();

    @Override // io.reactivex.SingleObserver
    /* renamed from: a */
    public final void mo31388a(@NonNull Disposable disposable) {
        EndConsumerHelper.m31815b(this.f62818b, disposable, getClass());
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public final void mo31379f() {
        DisposableHelper.m31409a(this.f62818b);
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public final boolean mo31380s() {
        return this.f62818b.get() == DisposableHelper.DISPOSED;
    }
}
