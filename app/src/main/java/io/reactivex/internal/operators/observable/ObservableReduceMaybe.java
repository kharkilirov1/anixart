package io.reactivex.internal.operators.observable;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ObservableReduceMaybe<T> extends Maybe<T> {

    public static final class ReduceObserver<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super T> f61877b;

        /* renamed from: c */
        public final BiFunction<T, T, T> f61878c;

        /* renamed from: d */
        public boolean f61879d;

        /* renamed from: e */
        public T f61880e;

        /* renamed from: f */
        public Disposable f61881f;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61881f, disposable)) {
                this.f61881f = disposable;
                this.f61877b.mo31355a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61881f.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f61879d) {
                return;
            }
            this.f61879d = true;
            T t = this.f61880e;
            this.f61880e = null;
            if (t != null) {
                this.f61877b.onSuccess(t);
            } else {
                this.f61877b.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f61879d) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f61879d = true;
            this.f61880e = null;
            this.f61877b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f61879d) {
                return;
            }
            T t2 = this.f61880e;
            if (t2 == null) {
                this.f61880e = t;
                return;
            }
            try {
                T apply = this.f61878c.apply(t2, t);
                Objects.requireNonNull(apply, "The reducer returned a null value");
                this.f61880e = apply;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61881f.mo31379f();
                onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61881f.mo31380s();
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        throw null;
    }
}
