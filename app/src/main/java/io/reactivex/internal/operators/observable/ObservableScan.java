package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ObservableScan<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class ScanObserver<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f61975b;

        /* renamed from: c */
        public final BiFunction<T, T, T> f61976c = null;

        /* renamed from: d */
        public Disposable f61977d;

        /* renamed from: e */
        public T f61978e;

        /* renamed from: f */
        public boolean f61979f;

        public ScanObserver(Observer<? super T> observer, BiFunction<T, T, T> biFunction) {
            this.f61975b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61977d, disposable)) {
                this.f61977d = disposable;
                this.f61975b.mo31373a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61977d.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f61979f) {
                return;
            }
            this.f61979f = true;
            this.f61975b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f61979f) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f61979f = true;
                this.f61975b.onError(th);
            }
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.Object] */
        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f61979f) {
                return;
            }
            Observer<? super T> observer = this.f61975b;
            T t2 = this.f61978e;
            if (t2 == null) {
                this.f61978e = t;
                observer.onNext(t);
                return;
            }
            try {
                T apply = this.f61976c.apply(t2, t);
                Objects.requireNonNull(apply, "The value returned by the accumulator is null");
                this.f61978e = apply;
                observer.onNext(apply);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61977d.mo31379f();
                onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61977d.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f61337b.mo31364c(new ScanObserver(observer, null));
    }
}
