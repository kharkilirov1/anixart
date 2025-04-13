package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes3.dex */
public final class ArrayCompositeDisposable extends AtomicReferenceArray<Disposable> implements Disposable {
    public ArrayCompositeDisposable(int i2) {
        super(i2);
    }

    /* renamed from: a */
    public boolean m31408a(int i2, Disposable disposable) {
        Disposable disposable2;
        do {
            disposable2 = get(i2);
            if (disposable2 == DisposableHelper.DISPOSED) {
                disposable.mo31379f();
                return false;
            }
        } while (!compareAndSet(i2, disposable2, disposable));
        if (disposable2 == null) {
            return true;
        }
        disposable2.mo31379f();
        return true;
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
        Disposable andSet;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (get(0) != disposableHelper) {
            int length = length();
            for (int i2 = 0; i2 < length; i2++) {
                if (get(i2) != disposableHelper && (andSet = getAndSet(i2, disposableHelper)) != disposableHelper && andSet != null) {
                    andSet.mo31379f();
                }
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public boolean mo31380s() {
        return get(0) == DisposableHelper.DISPOSED;
    }
}
