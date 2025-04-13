package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes3.dex */
public class DeferredScalarDisposable<T> extends BasicIntQueueDisposable<T> {

    /* renamed from: b */
    public final Observer<? super T> f59644b;

    /* renamed from: c */
    public T f59645c;

    public DeferredScalarDisposable(Observer<? super T> observer) {
        this.f59644b = observer;
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    /* renamed from: F */
    public final int mo31420F(int i2) {
        if ((i2 & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    /* renamed from: b */
    public final void m31431b(T t) {
        int i2 = get();
        if ((i2 & 54) != 0) {
            return;
        }
        Observer<? super T> observer = this.f59644b;
        if (i2 == 8) {
            this.f59645c = t;
            lazySet(16);
            observer.onNext(null);
        } else {
            lazySet(2);
            observer.onNext(t);
        }
        if (get() != 4) {
            observer.onComplete();
        }
    }

    /* renamed from: c */
    public final void m31432c(Throwable th) {
        if ((get() & 54) != 0) {
            RxJavaPlugins.m31848b(th);
        } else {
            lazySet(2);
            this.f59644b.onError(th);
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        lazySet(32);
        this.f59645c = null;
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
        set(4);
        this.f59645c = null;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public final T poll() throws Exception {
        if (get() != 16) {
            return null;
        }
        T t = this.f59645c;
        this.f59645c = null;
        lazySet(32);
        return t;
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public final boolean mo31380s() {
        return get() == 4;
    }
}
