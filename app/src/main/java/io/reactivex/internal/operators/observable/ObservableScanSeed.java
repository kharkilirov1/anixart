package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ObservableScanSeed<T, R> extends AbstractObservableWithUpstream<T, R> {

    public static final class ScanSeedObserver<T, R> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super R> f61980b;

        /* renamed from: c */
        public final BiFunction<R, ? super T, R> f61981c;

        /* renamed from: d */
        public R f61982d;

        /* renamed from: e */
        public Disposable f61983e;

        /* renamed from: f */
        public boolean f61984f;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61983e, disposable)) {
                this.f61983e = disposable;
                this.f61980b.mo31373a(this);
                this.f61980b.onNext(this.f61982d);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61983e.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f61984f) {
                return;
            }
            this.f61984f = true;
            this.f61980b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f61984f) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f61984f = true;
                this.f61980b.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f61984f) {
                return;
            }
            try {
                R apply = this.f61981c.apply(this.f61982d, t);
                Objects.requireNonNull(apply, "The accumulator returned a null value");
                this.f61982d = apply;
                this.f61980b.onNext(apply);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61983e.mo31379f();
                onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61983e.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super R> observer) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            observer.mo31373a(EmptyDisposable.INSTANCE);
            observer.onError(th);
        }
    }
}
