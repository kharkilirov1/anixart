package io.reactivex.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.ListCompositeDisposable;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public abstract class ResourceCompletableObserver implements CompletableObserver, Disposable {

    /* renamed from: b */
    public final AtomicReference<Disposable> f62819b = new AtomicReference<>();

    /* renamed from: c */
    public final ListCompositeDisposable f62820c = new ListCompositeDisposable();

    @Override // io.reactivex.CompletableObserver
    /* renamed from: a */
    public final void mo31347a(@NonNull Disposable disposable) {
        EndConsumerHelper.m31815b(this.f62819b, disposable, getClass());
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public final void mo31379f() {
        if (DisposableHelper.m31409a(this.f62819b)) {
            this.f62820c.mo31379f();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public final boolean mo31380s() {
        return DisposableHelper.m31410b(this.f62819b.get());
    }
}
