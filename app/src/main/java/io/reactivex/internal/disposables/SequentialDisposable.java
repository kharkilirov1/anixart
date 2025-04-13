package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class SequentialDisposable extends AtomicReference<Disposable> implements Disposable {
    public SequentialDisposable() {
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
        DisposableHelper.m31409a(this);
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public boolean mo31380s() {
        return DisposableHelper.m31410b(get());
    }

    public SequentialDisposable(Disposable disposable) {
        lazySet(disposable);
    }
}
