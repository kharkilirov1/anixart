package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes3.dex */
public final class ObservableAll<T> extends AbstractObservableWithUpstream<T, Boolean> {

    public static final class AllObserver<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super Boolean> f61358b;

        /* renamed from: c */
        public final Predicate<? super T> f61359c = null;

        /* renamed from: d */
        public Disposable f61360d;

        /* renamed from: e */
        public boolean f61361e;

        public AllObserver(Observer<? super Boolean> observer, Predicate<? super T> predicate) {
            this.f61358b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61360d, disposable)) {
                this.f61360d = disposable;
                this.f61358b.mo31373a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61360d.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f61361e) {
                return;
            }
            this.f61361e = true;
            this.f61358b.onNext(Boolean.TRUE);
            this.f61358b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f61361e) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f61361e = true;
                this.f61358b.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f61361e) {
                return;
            }
            try {
                if (this.f61359c.mo31407b(t)) {
                    return;
                }
                this.f61361e = true;
                this.f61360d.mo31379f();
                this.f61358b.onNext(Boolean.FALSE);
                this.f61358b.onComplete();
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61360d.mo31379f();
                onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61360d.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super Boolean> observer) {
        this.f61337b.mo31364c(new AllObserver(observer, null));
    }
}
