package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class BlockingObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {

    /* renamed from: b */
    public static final Object f59641b = new Object();

    @Override // io.reactivex.Observer
    /* renamed from: a */
    public void mo31373a(Disposable disposable) {
        DisposableHelper.m31413e(this, disposable);
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
        if (DisposableHelper.m31409a(this)) {
            throw null;
        }
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        throw null;
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        throw null;
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        throw null;
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public boolean mo31380s() {
        return get() == DisposableHelper.DISPOSED;
    }
}
