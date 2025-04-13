package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Cancellable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class CancellableDisposable extends AtomicReference<Cancellable> implements Disposable {
    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
        Cancellable andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.cancel();
        } catch (Exception e2) {
            Exceptions.m31402a(e2);
            RxJavaPlugins.m31848b(e2);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public boolean mo31380s() {
        return get() == null;
    }
}
