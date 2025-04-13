package io.reactivex.disposables;

import io.reactivex.annotations.NonNull;
import p000a.C0000a;

/* loaded from: classes3.dex */
final class RunnableDisposable extends ReferenceDisposable<Runnable> {
    public RunnableDisposable(Runnable runnable) {
        super(runnable);
    }

    @Override // io.reactivex.disposables.ReferenceDisposable
    /* renamed from: a */
    public void mo31391a(@NonNull Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        StringBuilder m24u = C0000a.m24u("RunnableDisposable(disposed=");
        m24u.append(mo31380s());
        m24u.append(", ");
        m24u.append(get());
        m24u.append(")");
        return m24u.toString();
    }
}
