package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes3.dex */
public abstract class DeferredScalarObserver<T, R> extends DeferredScalarDisposable<R> implements Observer<T> {

    /* renamed from: d */
    public Disposable f59646d;

    @Override // io.reactivex.Observer
    /* renamed from: a */
    public void mo31373a(Disposable disposable) {
        if (DisposableHelper.m31414h(this.f59646d, disposable)) {
            this.f59646d = disposable;
            this.f59644b.mo31373a(this);
        }
    }

    @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
        super.mo31379f();
        this.f59646d.mo31379f();
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        T t = this.f59645c;
        if (t != null) {
            this.f59645c = null;
            m31431b(t);
        } else {
            if ((get() & 54) != 0) {
                return;
            }
            lazySet(2);
            this.f59644b.onComplete();
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        this.f59645c = null;
        m31432c(th);
    }
}
