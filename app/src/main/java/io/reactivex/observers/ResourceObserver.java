package io.reactivex.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.ListCompositeDisposable;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public abstract class ResourceObserver<T> implements Observer<T>, Disposable {

    /* renamed from: b */
    public final AtomicReference<Disposable> f62823b = new AtomicReference<>();

    /* renamed from: c */
    public final ListCompositeDisposable f62824c = new ListCompositeDisposable();

    @Override // io.reactivex.Observer
    /* renamed from: a */
    public final void mo31373a(Disposable disposable) {
        EndConsumerHelper.m31815b(this.f62823b, disposable, getClass());
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public final void mo31379f() {
        if (DisposableHelper.m31409a(this.f62823b)) {
            this.f62824c.mo31379f();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public final boolean mo31380s() {
        return DisposableHelper.m31410b(this.f62823b.get());
    }
}
