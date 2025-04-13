package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes3.dex */
public final class ObservableTake<T> extends AbstractObservableWithUpstream<T, T> {

    /* renamed from: c */
    public final long f62080c;

    public static final class TakeObserver<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f62081b;

        /* renamed from: c */
        public boolean f62082c;

        /* renamed from: d */
        public Disposable f62083d;

        /* renamed from: e */
        public long f62084e;

        public TakeObserver(Observer<? super T> observer, long j2) {
            this.f62081b = observer;
            this.f62084e = j2;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62083d, disposable)) {
                this.f62083d = disposable;
                if (this.f62084e != 0) {
                    this.f62081b.mo31373a(this);
                    return;
                }
                this.f62082c = true;
                disposable.mo31379f();
                EmptyDisposable.m31415a(this.f62081b);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f62083d.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f62082c) {
                return;
            }
            this.f62082c = true;
            this.f62083d.mo31379f();
            this.f62081b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f62082c) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f62082c = true;
            this.f62083d.mo31379f();
            this.f62081b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f62082c) {
                return;
            }
            long j2 = this.f62084e;
            long j3 = j2 - 1;
            this.f62084e = j3;
            if (j2 > 0) {
                boolean z = j3 == 0;
                this.f62081b.onNext(t);
                if (z) {
                    onComplete();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62083d.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f61337b.mo31364c(new TakeObserver(observer, this.f62080c));
    }
}
