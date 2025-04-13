package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes3.dex */
public final class ObservableAny<T> extends AbstractObservableWithUpstream<T, Boolean> {

    public static final class AnyObserver<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super Boolean> f61372b;

        /* renamed from: c */
        public final Predicate<? super T> f61373c = null;

        /* renamed from: d */
        public Disposable f61374d;

        /* renamed from: e */
        public boolean f61375e;

        public AnyObserver(Observer<? super Boolean> observer, Predicate<? super T> predicate) {
            this.f61372b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61374d, disposable)) {
                this.f61374d = disposable;
                this.f61372b.mo31373a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61374d.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f61375e) {
                return;
            }
            this.f61375e = true;
            this.f61372b.onNext(Boolean.FALSE);
            this.f61372b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f61375e) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f61375e = true;
                this.f61372b.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f61375e) {
                return;
            }
            try {
                if (this.f61373c.mo31407b(t)) {
                    this.f61375e = true;
                    this.f61374d.mo31379f();
                    this.f61372b.onNext(Boolean.TRUE);
                    this.f61372b.onComplete();
                }
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61374d.mo31379f();
                onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61374d.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super Boolean> observer) {
        this.f61337b.mo31364c(new AnyObserver(observer, null));
    }
}
