package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class AsyncSubject<T> extends Subject<T> {

    /* renamed from: e */
    public static final AsyncDisposable[] f62918e = new AsyncDisposable[0];

    /* renamed from: f */
    public static final AsyncDisposable[] f62919f = new AsyncDisposable[0];

    /* renamed from: b */
    public final AtomicReference<AsyncDisposable<T>[]> f62920b = new AtomicReference<>(f62918e);

    /* renamed from: c */
    public Throwable f62921c;

    /* renamed from: d */
    public T f62922d;

    public static final class AsyncDisposable<T> extends DeferredScalarDisposable<T> {

        /* renamed from: d */
        public final AsyncSubject<T> f62923d;

        public AsyncDisposable(Observer<? super T> observer, AsyncSubject<T> asyncSubject) {
            super(observer);
            this.f62923d = asyncSubject;
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (getAndSet(4) != 4) {
                this.f62923d.m31861p(this);
            }
        }
    }

    @Override // io.reactivex.Observer
    /* renamed from: a */
    public void mo31373a(Disposable disposable) {
        if (this.f62920b.get() == f62919f) {
            disposable.mo31379f();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        boolean z;
        AsyncDisposable<T> asyncDisposable = new AsyncDisposable<>(observer, this);
        observer.mo31373a(asyncDisposable);
        while (true) {
            AsyncDisposable<T>[] asyncDisposableArr = this.f62920b.get();
            z = false;
            if (asyncDisposableArr == f62919f) {
                break;
            }
            int length = asyncDisposableArr.length;
            AsyncDisposable<T>[] asyncDisposableArr2 = new AsyncDisposable[length + 1];
            System.arraycopy(asyncDisposableArr, 0, asyncDisposableArr2, 0, length);
            asyncDisposableArr2[length] = asyncDisposable;
            if (this.f62920b.compareAndSet(asyncDisposableArr, asyncDisposableArr2)) {
                z = true;
                break;
            }
        }
        if (z) {
            if (asyncDisposable.mo31380s()) {
                m31861p(asyncDisposable);
                return;
            }
            return;
        }
        Throwable th = this.f62921c;
        if (th != null) {
            observer.onError(th);
            return;
        }
        T t = this.f62922d;
        if (t != null) {
            asyncDisposable.m31431b(t);
        } else {
            if (asyncDisposable.mo31380s()) {
                return;
            }
            asyncDisposable.f59644b.onComplete();
        }
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        AsyncDisposable<T>[] asyncDisposableArr = this.f62920b.get();
        AsyncDisposable<T>[] asyncDisposableArr2 = f62919f;
        if (asyncDisposableArr == asyncDisposableArr2) {
            return;
        }
        T t = this.f62922d;
        AsyncDisposable<T>[] andSet = this.f62920b.getAndSet(asyncDisposableArr2);
        int i2 = 0;
        if (t != null) {
            int length = andSet.length;
            while (i2 < length) {
                andSet[i2].m31431b(t);
                i2++;
            }
            return;
        }
        int length2 = andSet.length;
        while (i2 < length2) {
            AsyncDisposable<T> asyncDisposable = andSet[i2];
            if (!asyncDisposable.mo31380s()) {
                asyncDisposable.f59644b.onComplete();
            }
            i2++;
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        Objects.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AsyncDisposable<T>[] asyncDisposableArr = this.f62920b.get();
        AsyncDisposable<T>[] asyncDisposableArr2 = f62919f;
        if (asyncDisposableArr == asyncDisposableArr2) {
            RxJavaPlugins.m31848b(th);
            return;
        }
        this.f62922d = null;
        this.f62921c = th;
        for (AsyncDisposable<T> asyncDisposable : this.f62920b.getAndSet(asyncDisposableArr2)) {
            if (asyncDisposable.mo31380s()) {
                RxJavaPlugins.m31848b(th);
            } else {
                asyncDisposable.f59644b.onError(th);
            }
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        Objects.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f62920b.get() == f62919f) {
            return;
        }
        this.f62922d = t;
    }

    /* renamed from: p */
    public void m31861p(AsyncDisposable<T> asyncDisposable) {
        AsyncDisposable<T>[] asyncDisposableArr;
        AsyncDisposable<T>[] asyncDisposableArr2;
        do {
            asyncDisposableArr = this.f62920b.get();
            int length = asyncDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                } else if (asyncDisposableArr[i2] == asyncDisposable) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 < 0) {
                return;
            }
            if (length == 1) {
                asyncDisposableArr2 = f62918e;
            } else {
                AsyncDisposable<T>[] asyncDisposableArr3 = new AsyncDisposable[length - 1];
                System.arraycopy(asyncDisposableArr, 0, asyncDisposableArr3, 0, i2);
                System.arraycopy(asyncDisposableArr, i2 + 1, asyncDisposableArr3, i2, (length - i2) - 1);
                asyncDisposableArr2 = asyncDisposableArr3;
            }
        } while (!this.f62920b.compareAndSet(asyncDisposableArr, asyncDisposableArr2));
    }
}
