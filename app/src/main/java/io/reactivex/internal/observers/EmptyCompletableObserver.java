package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class EmptyCompletableObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable, LambdaConsumerIntrospection {
    @Override // io.reactivex.CompletableObserver
    /* renamed from: a */
    public void mo31347a(Disposable disposable) {
        DisposableHelper.m31413e(this, disposable);
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
        DisposableHelper.m31409a(this);
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public void onComplete() {
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // io.reactivex.CompletableObserver
    public void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        RxJavaPlugins.m31848b(new OnErrorNotImplementedException(th));
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public boolean mo31380s() {
        return get() == DisposableHelper.DISPOSED;
    }
}
