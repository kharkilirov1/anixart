package io.reactivex.internal.observers;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ConsumerSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, LambdaConsumerIntrospection {

    /* renamed from: b */
    public final Consumer<? super T> f59642b;

    /* renamed from: c */
    public final Consumer<? super Throwable> f59643c;

    public ConsumerSingleObserver(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        this.f59642b = consumer;
        this.f59643c = consumer2;
    }

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
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.f59643c.accept(th);
        } catch (Throwable th2) {
            Exceptions.m31402a(th2);
            RxJavaPlugins.m31848b(new CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T t) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.f59642b.accept(t);
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
