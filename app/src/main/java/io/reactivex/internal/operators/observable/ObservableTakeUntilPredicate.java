package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes3.dex */
public final class ObservableTakeUntilPredicate<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class TakeUntilPredicateObserver<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f62107b;

        /* renamed from: c */
        public final Predicate<? super T> f62108c = null;

        /* renamed from: d */
        public Disposable f62109d;

        /* renamed from: e */
        public boolean f62110e;

        public TakeUntilPredicateObserver(Observer<? super T> observer, Predicate<? super T> predicate) {
            this.f62107b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62109d, disposable)) {
                this.f62109d = disposable;
                this.f62107b.mo31373a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f62109d.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f62110e) {
                return;
            }
            this.f62110e = true;
            this.f62107b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f62110e) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f62110e = true;
                this.f62107b.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f62110e) {
                return;
            }
            this.f62107b.onNext(t);
            try {
                if (this.f62108c.mo31407b(t)) {
                    this.f62110e = true;
                    this.f62109d.mo31379f();
                    this.f62107b.onComplete();
                }
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f62109d.mo31379f();
                onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62109d.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f61337b.mo31364c(new TakeUntilPredicateObserver(observer, null));
    }
}
