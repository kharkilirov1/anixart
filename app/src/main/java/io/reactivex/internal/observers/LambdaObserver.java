package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class LambdaObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, LambdaConsumerIntrospection {

    /* renamed from: b */
    public final Consumer<? super T> f59663b;

    /* renamed from: c */
    public final Consumer<? super Throwable> f59664c;

    /* renamed from: d */
    public final Action f59665d;

    /* renamed from: e */
    public final Consumer<? super Disposable> f59666e;

    public LambdaObserver(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Consumer<? super Disposable> consumer3) {
        this.f59663b = consumer;
        this.f59664c = consumer2;
        this.f59665d = action;
        this.f59666e = consumer3;
    }

    @Override // io.reactivex.Observer
    /* renamed from: a */
    public void mo31373a(Disposable disposable) {
        if (DisposableHelper.m31413e(this, disposable)) {
            try {
                this.f59666e.accept(this);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                disposable.mo31379f();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
        DisposableHelper.m31409a(this);
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (mo31380s()) {
            return;
        }
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.f59665d.run();
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            RxJavaPlugins.m31848b(th);
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        if (mo31380s()) {
            RxJavaPlugins.m31848b(th);
            return;
        }
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.f59664c.accept(th);
        } catch (Throwable th2) {
            Exceptions.m31402a(th2);
            RxJavaPlugins.m31848b(new CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        if (mo31380s()) {
            return;
        }
        try {
            this.f59663b.accept(t);
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            get().mo31379f();
            onError(th);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public boolean mo31380s() {
        return get() == DisposableHelper.DISPOSED;
    }
}
