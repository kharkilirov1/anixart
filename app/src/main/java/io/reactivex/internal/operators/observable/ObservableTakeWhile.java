package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes3.dex */
public final class ObservableTakeWhile<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class TakeWhileObserver<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f62111b;

        /* renamed from: c */
        public final Predicate<? super T> f62112c = null;

        /* renamed from: d */
        public Disposable f62113d;

        /* renamed from: e */
        public boolean f62114e;

        public TakeWhileObserver(Observer<? super T> observer, Predicate<? super T> predicate) {
            this.f62111b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62113d, disposable)) {
                this.f62113d = disposable;
                this.f62111b.mo31373a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f62113d.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f62114e) {
                return;
            }
            this.f62114e = true;
            this.f62111b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f62114e) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f62114e = true;
                this.f62111b.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f62114e) {
                return;
            }
            try {
                if (this.f62112c.mo31407b(t)) {
                    this.f62111b.onNext(t);
                    return;
                }
                this.f62114e = true;
                this.f62113d.mo31379f();
                this.f62111b.onComplete();
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f62113d.mo31379f();
                onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62113d.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f61337b.mo31364c(new TakeWhileObserver(observer, null));
    }
}
