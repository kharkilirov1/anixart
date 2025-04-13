package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ObservableFlattenIterable<T, R> extends AbstractObservableWithUpstream<T, R> {

    public static final class FlattenIterableObserver<T, R> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super R> f61695b;

        /* renamed from: c */
        public final Function<? super T, ? extends Iterable<? extends R>> f61696c = null;

        /* renamed from: d */
        public Disposable f61697d;

        public FlattenIterableObserver(Observer<? super R> observer, Function<? super T, ? extends Iterable<? extends R>> function) {
            this.f61695b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61697d, disposable)) {
                this.f61697d = disposable;
                this.f61695b.mo31373a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61697d.mo31379f();
            this.f61697d = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            Disposable disposable = this.f61697d;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper) {
                return;
            }
            this.f61697d = disposableHelper;
            this.f61695b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            Disposable disposable = this.f61697d;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f61697d = disposableHelper;
                this.f61695b.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f61697d == DisposableHelper.DISPOSED) {
                return;
            }
            try {
                Observer<? super R> observer = this.f61695b;
                for (R r : this.f61696c.apply(t)) {
                    try {
                        try {
                            Objects.requireNonNull(r, "The iterator returned a null value");
                            observer.onNext(r);
                        } catch (Throwable th) {
                            Exceptions.m31402a(th);
                            this.f61697d.mo31379f();
                            onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        Exceptions.m31402a(th2);
                        this.f61697d.mo31379f();
                        onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                Exceptions.m31402a(th3);
                this.f61697d.mo31379f();
                onError(th3);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61697d.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super R> observer) {
        this.f61337b.mo31364c(new FlattenIterableObserver(observer, null));
    }
}
