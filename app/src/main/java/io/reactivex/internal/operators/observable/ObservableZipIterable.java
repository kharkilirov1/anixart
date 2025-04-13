package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ObservableZipIterable<T, U, V> extends Observable<V> {

    public static final class ZipIterableObserver<T, U, V> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super V> f62313b;

        /* renamed from: c */
        public final Iterator<U> f62314c;

        /* renamed from: d */
        public final BiFunction<? super T, ? super U, ? extends V> f62315d;

        /* renamed from: e */
        public Disposable f62316e;

        /* renamed from: f */
        public boolean f62317f;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62316e, disposable)) {
                this.f62316e = disposable;
                this.f62313b.mo31373a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f62316e.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f62317f) {
                return;
            }
            this.f62317f = true;
            this.f62313b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f62317f) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f62317f = true;
                this.f62313b.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f62317f) {
                return;
            }
            try {
                U next = this.f62314c.next();
                Objects.requireNonNull(next, "The iterator returned a null value");
                try {
                    V apply = this.f62315d.apply(t, next);
                    Objects.requireNonNull(apply, "The zipper function returned a null value");
                    this.f62313b.onNext(apply);
                    try {
                        if (this.f62314c.hasNext()) {
                            return;
                        }
                        this.f62317f = true;
                        this.f62316e.mo31379f();
                        this.f62313b.onComplete();
                    } catch (Throwable th) {
                        Exceptions.m31402a(th);
                        this.f62317f = true;
                        this.f62316e.mo31379f();
                        this.f62313b.onError(th);
                    }
                } catch (Throwable th2) {
                    Exceptions.m31402a(th2);
                    this.f62317f = true;
                    this.f62316e.mo31379f();
                    this.f62313b.onError(th2);
                }
            } catch (Throwable th3) {
                Exceptions.m31402a(th3);
                this.f62317f = true;
                this.f62316e.mo31379f();
                this.f62313b.onError(th3);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62316e.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super V> observer) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            observer.mo31373a(EmptyDisposable.INSTANCE);
            observer.onError(th);
        }
    }
}
