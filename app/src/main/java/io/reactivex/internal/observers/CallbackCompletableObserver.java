package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class CallbackCompletableObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Consumer<Throwable>, LambdaConsumerIntrospection {
    @Override // io.reactivex.CompletableObserver
    /* renamed from: a */
    public void mo31347a(Disposable disposable) {
        DisposableHelper.m31413e(this, disposable);
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Throwable th) throws Exception {
        RxJavaPlugins.m31848b(new OnErrorNotImplementedException(th));
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
        DisposableHelper.m31409a(this);
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public void onComplete() {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            RxJavaPlugins.m31848b(th);
            lazySet(DisposableHelper.DISPOSED);
        }
    }

    @Override // io.reactivex.CompletableObserver
    public void onError(Throwable th) {
        try {
            throw null;
        } catch (Throwable th2) {
            Exceptions.m31402a(th2);
            RxJavaPlugins.m31848b(th2);
            lazySet(DisposableHelper.DISPOSED);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public boolean mo31380s() {
        return get() == DisposableHelper.DISPOSED;
    }
}
