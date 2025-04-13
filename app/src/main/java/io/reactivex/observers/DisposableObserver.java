package io.reactivex.observers;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public abstract class DisposableObserver<T> implements Observer<T>, Disposable {

    /* renamed from: b */
    public final AtomicReference<Disposable> f62817b = new AtomicReference<>();

    @Override // io.reactivex.Observer
    /* renamed from: a */
    public final void mo31373a(@NonNull Disposable disposable) {
        EndConsumerHelper.m31815b(this.f62817b, disposable, getClass());
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public final void mo31379f() {
        DisposableHelper.m31409a(this.f62817b);
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public final boolean mo31380s() {
        return this.f62817b.get() == DisposableHelper.DISPOSED;
    }
}
