package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class ObservableSingleSingle<T> extends Single<T> {

    /* renamed from: b */
    public final ObservableSource<? extends T> f62018b;

    /* renamed from: c */
    public final T f62019c = null;

    public static final class SingleElementObserver<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super T> f62020b;

        /* renamed from: c */
        public final T f62021c;

        /* renamed from: d */
        public Disposable f62022d;

        /* renamed from: e */
        public T f62023e;

        /* renamed from: f */
        public boolean f62024f;

        public SingleElementObserver(SingleObserver<? super T> singleObserver, T t) {
            this.f62020b = singleObserver;
            this.f62021c = t;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62022d, disposable)) {
                this.f62022d = disposable;
                this.f62020b.mo31388a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f62022d.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f62024f) {
                return;
            }
            this.f62024f = true;
            T t = this.f62023e;
            this.f62023e = null;
            if (t == null) {
                t = this.f62021c;
            }
            if (t != null) {
                this.f62020b.onSuccess(t);
            } else {
                this.f62020b.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f62024f) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f62024f = true;
                this.f62020b.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f62024f) {
                return;
            }
            if (this.f62023e == null) {
                this.f62023e = t;
                return;
            }
            this.f62024f = true;
            this.f62022d.mo31379f();
            this.f62020b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62022d.mo31380s();
        }
    }

    public ObservableSingleSingle(ObservableSource<? extends T> observableSource, T t) {
        this.f62018b = observableSource;
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super T> singleObserver) {
        this.f62018b.mo31364c(new SingleElementObserver(singleObserver, this.f62019c));
    }
}
