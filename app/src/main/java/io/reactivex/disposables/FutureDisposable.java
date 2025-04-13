package io.reactivex.disposables;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
final class FutureDisposable extends AtomicReference<Future<?>> implements Disposable {
    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
        Future<?> andSet = getAndSet(null);
        if (andSet != null) {
            andSet.cancel(false);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public boolean mo31380s() {
        Future<?> future = get();
        return future == null || future.isDone();
    }
}
