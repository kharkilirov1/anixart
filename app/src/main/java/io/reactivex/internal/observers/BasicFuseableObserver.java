package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes3.dex */
public abstract class BasicFuseableObserver<T, R> implements Observer<T>, QueueDisposable<R> {

    /* renamed from: b */
    public final Observer<? super R> f59631b;

    /* renamed from: c */
    public Disposable f59632c;

    /* renamed from: d */
    public QueueDisposable<T> f59633d;

    /* renamed from: e */
    public boolean f59634e;

    /* renamed from: f */
    public int f59635f;

    public BasicFuseableObserver(Observer<? super R> observer) {
        this.f59631b = observer;
    }

    @Override // io.reactivex.Observer
    /* renamed from: a */
    public final void mo31373a(Disposable disposable) {
        if (DisposableHelper.m31414h(this.f59632c, disposable)) {
            this.f59632c = disposable;
            if (disposable instanceof QueueDisposable) {
                this.f59633d = (QueueDisposable) disposable;
            }
            this.f59631b.mo31373a(this);
        }
    }

    /* renamed from: b */
    public final void m31429b(Throwable th) {
        Exceptions.m31402a(th);
        this.f59632c.mo31379f();
        onError(th);
    }

    /* renamed from: c */
    public final int m31430c(int i2) {
        QueueDisposable<T> queueDisposable = this.f59633d;
        if (queueDisposable == null || (i2 & 4) != 0) {
            return 0;
        }
        int mo31420F = queueDisposable.mo31420F(i2);
        if (mo31420F != 0) {
            this.f59635f = mo31420F;
        }
        return mo31420F;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        this.f59633d.clear();
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
        this.f59632c.mo31379f();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return this.f59633d.isEmpty();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (this.f59634e) {
            return;
        }
        this.f59634e = true;
        this.f59631b.onComplete();
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        if (this.f59634e) {
            RxJavaPlugins.m31848b(th);
        } else {
            this.f59634e = true;
            this.f59631b.onError(th);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public boolean mo31380s() {
        return this.f59632c.mo31380s();
    }
}
