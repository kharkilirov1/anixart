package io.reactivex.internal.observers;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class BiConsumerSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {
    @Override // io.reactivex.SingleObserver
    /* renamed from: a */
    public void mo31388a(Disposable disposable) {
        DisposableHelper.m31413e(this, disposable);
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
        DisposableHelper.m31409a(this);
    }

    @Override // io.reactivex.SingleObserver
    public void onError(Throwable th) {
        try {
            lazySet(DisposableHelper.DISPOSED);
            throw null;
        } catch (Throwable th2) {
            Exceptions.m31402a(th2);
            RxJavaPlugins.m31848b(new CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T t) {
        try {
            lazySet(DisposableHelper.DISPOSED);
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            RxJavaPlugins.m31848b(th);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public boolean mo31380s() {
        return get() == DisposableHelper.DISPOSED;
    }
}
