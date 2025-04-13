package io.reactivex.observers;

import io.reactivex.MaybeObserver;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.ListCompositeDisposable;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public abstract class ResourceMaybeObserver<T> implements MaybeObserver<T>, Disposable {

    /* renamed from: b */
    public final AtomicReference<Disposable> f62821b = new AtomicReference<>();

    /* renamed from: c */
    public final ListCompositeDisposable f62822c = new ListCompositeDisposable();

    @Override // io.reactivex.MaybeObserver
    /* renamed from: a */
    public final void mo31355a(@NonNull Disposable disposable) {
        EndConsumerHelper.m31815b(this.f62821b, disposable, getClass());
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public final void mo31379f() {
        if (DisposableHelper.m31409a(this.f62821b)) {
            this.f62822c.mo31379f();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public final boolean mo31380s() {
        return DisposableHelper.m31410b(this.f62821b.get());
    }
}
