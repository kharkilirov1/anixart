package io.reactivex.disposables;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class SerialDisposable implements Disposable {

    /* renamed from: b */
    public final AtomicReference<Disposable> f59606b = new AtomicReference<>();

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
        DisposableHelper.m31409a(this.f59606b);
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public boolean mo31380s() {
        return DisposableHelper.m31410b(this.f59606b.get());
    }
}
