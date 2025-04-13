package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ForEachWhileObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {

    /* renamed from: b */
    public boolean f59651b;

    @Override // io.reactivex.Observer
    /* renamed from: a */
    public void mo31373a(Disposable disposable) {
        DisposableHelper.m31413e(this, disposable);
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
        DisposableHelper.m31409a(this);
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (this.f59651b) {
            return;
        }
        this.f59651b = true;
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            RxJavaPlugins.m31848b(th);
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        if (this.f59651b) {
            RxJavaPlugins.m31848b(th);
            return;
        }
        this.f59651b = true;
        try {
            throw null;
        } catch (Throwable th2) {
            Exceptions.m31402a(th2);
            RxJavaPlugins.m31848b(new CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        if (this.f59651b) {
            return;
        }
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            DisposableHelper.m31409a(this);
            onError(th);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public boolean mo31380s() {
        return DisposableHelper.m31410b(get());
    }
}
