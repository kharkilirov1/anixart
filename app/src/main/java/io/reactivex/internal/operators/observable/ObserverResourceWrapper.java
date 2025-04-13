package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObserverResourceWrapper<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {

    /* renamed from: b */
    public final Observer<? super T> f62318b;

    /* renamed from: c */
    public final AtomicReference<Disposable> f62319c;

    @Override // io.reactivex.Observer
    /* renamed from: a */
    public void mo31373a(Disposable disposable) {
        if (DisposableHelper.m31413e(this.f62319c, disposable)) {
            this.f62318b.mo31373a(this);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
        DisposableHelper.m31409a(this.f62319c);
        DisposableHelper.m31409a(this);
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        mo31379f();
        this.f62318b.onComplete();
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        mo31379f();
        this.f62318b.onError(th);
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        this.f62318b.onNext(t);
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public boolean mo31380s() {
        return this.f62319c.get() == DisposableHelper.DISPOSED;
    }
}
