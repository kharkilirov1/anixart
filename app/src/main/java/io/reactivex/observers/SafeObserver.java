package io.reactivex.observers;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes3.dex */
public final class SafeObserver<T> implements Observer<T>, Disposable {

    /* renamed from: b */
    public Disposable f62827b;

    /* renamed from: c */
    public boolean f62828c;

    @Override // io.reactivex.Observer
    /* renamed from: a */
    public void mo31373a(@NonNull Disposable disposable) {
        if (DisposableHelper.m31414h(this.f62827b, disposable)) {
            this.f62827b = disposable;
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f62828c = true;
                try {
                    disposable.mo31379f();
                    RxJavaPlugins.m31848b(th);
                } catch (Throwable th2) {
                    Exceptions.m31402a(th2);
                    RxJavaPlugins.m31848b(new CompositeException(th, th2));
                }
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
        this.f62827b.mo31379f();
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (this.f62828c) {
            return;
        }
        this.f62828c = true;
        if (this.f62827b != null) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                RxJavaPlugins.m31848b(th);
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            throw null;
        } catch (Throwable th2) {
            Exceptions.m31402a(th2);
            RxJavaPlugins.m31848b(new CompositeException(nullPointerException, th2));
        }
    }

    @Override // io.reactivex.Observer
    public void onError(@NonNull Throwable th) {
        if (this.f62828c) {
            RxJavaPlugins.m31848b(th);
            return;
        }
        this.f62828c = true;
        if (this.f62827b == null) {
            NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
            try {
                throw null;
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                RxJavaPlugins.m31848b(new CompositeException(th, nullPointerException, th2));
                return;
            }
        }
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        try {
            throw null;
        } catch (Throwable th3) {
            Exceptions.m31402a(th3);
            RxJavaPlugins.m31848b(new CompositeException(th, th3));
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(@NonNull T t) {
        if (this.f62828c) {
            return;
        }
        if (this.f62827b == null) {
            this.f62828c = true;
            NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                RxJavaPlugins.m31848b(new CompositeException(nullPointerException, th));
                return;
            }
        }
        if (t == null) {
            NullPointerException nullPointerException2 = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.f62827b.mo31379f();
                onError(nullPointerException2);
                return;
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                onError(new CompositeException(nullPointerException2, th2));
                return;
            }
        }
        try {
            throw null;
        } catch (Throwable th3) {
            Exceptions.m31402a(th3);
            try {
                this.f62827b.mo31379f();
                onError(th3);
            } catch (Throwable th4) {
                Exceptions.m31402a(th4);
                onError(new CompositeException(th3, th4));
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public boolean mo31380s() {
        return this.f62827b.mo31380s();
    }
}
