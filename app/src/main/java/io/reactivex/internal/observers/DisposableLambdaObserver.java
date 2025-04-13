package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes3.dex */
public final class DisposableLambdaObserver<T> implements Observer<T>, Disposable {

    /* renamed from: b */
    public final Observer<? super T> f59647b;

    /* renamed from: c */
    public final Consumer<? super Disposable> f59648c;

    /* renamed from: d */
    public final Action f59649d;

    /* renamed from: e */
    public Disposable f59650e;

    public DisposableLambdaObserver(Observer<? super T> observer, Consumer<? super Disposable> consumer, Action action) {
        this.f59647b = observer;
        this.f59648c = consumer;
        this.f59649d = action;
    }

    @Override // io.reactivex.Observer
    /* renamed from: a */
    public void mo31373a(Disposable disposable) {
        try {
            this.f59648c.accept(disposable);
            if (DisposableHelper.m31414h(this.f59650e, disposable)) {
                this.f59650e = disposable;
                this.f59647b.mo31373a(this);
            }
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            disposable.mo31379f();
            this.f59650e = DisposableHelper.DISPOSED;
            EmptyDisposable.m31418d(th, this.f59647b);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
        Disposable disposable = this.f59650e;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (disposable != disposableHelper) {
            this.f59650e = disposableHelper;
            try {
                this.f59649d.run();
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                RxJavaPlugins.m31848b(th);
            }
            disposable.mo31379f();
        }
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        Disposable disposable = this.f59650e;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (disposable != disposableHelper) {
            this.f59650e = disposableHelper;
            this.f59647b.onComplete();
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        Disposable disposable = this.f59650e;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (disposable == disposableHelper) {
            RxJavaPlugins.m31848b(th);
        } else {
            this.f59650e = disposableHelper;
            this.f59647b.onError(th);
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        this.f59647b.onNext(t);
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public boolean mo31380s() {
        return this.f59650e.mo31380s();
    }
}
