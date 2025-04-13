package io.reactivex.internal.operators.observable;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes3.dex */
public final class ObservableSingleMaybe<T> extends Maybe<T> {

    /* renamed from: b */
    public final ObservableSource<T> f62013b;

    public static final class SingleElementObserver<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super T> f62014b;

        /* renamed from: c */
        public Disposable f62015c;

        /* renamed from: d */
        public T f62016d;

        /* renamed from: e */
        public boolean f62017e;

        public SingleElementObserver(MaybeObserver<? super T> maybeObserver) {
            this.f62014b = maybeObserver;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62015c, disposable)) {
                this.f62015c = disposable;
                this.f62014b.mo31355a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f62015c.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f62017e) {
                return;
            }
            this.f62017e = true;
            T t = this.f62016d;
            this.f62016d = null;
            if (t == null) {
                this.f62014b.onComplete();
            } else {
                this.f62014b.onSuccess(t);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f62017e) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f62017e = true;
                this.f62014b.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f62017e) {
                return;
            }
            if (this.f62016d == null) {
                this.f62016d = t;
                return;
            }
            this.f62017e = true;
            this.f62015c.mo31379f();
            this.f62014b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62015c.mo31380s();
        }
    }

    public ObservableSingleMaybe(ObservableSource<T> observableSource) {
        this.f62013b = observableSource;
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        this.f62013b.mo31364c(new SingleElementObserver(maybeObserver));
    }
}
