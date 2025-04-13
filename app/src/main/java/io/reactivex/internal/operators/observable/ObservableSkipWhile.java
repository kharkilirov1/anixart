package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes3.dex */
public final class ObservableSkipWhile<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class SkipWhileObserver<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f62050b;

        /* renamed from: c */
        public final Predicate<? super T> f62051c = null;

        /* renamed from: d */
        public Disposable f62052d;

        /* renamed from: e */
        public boolean f62053e;

        public SkipWhileObserver(Observer<? super T> observer, Predicate<? super T> predicate) {
            this.f62050b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62052d, disposable)) {
                this.f62052d = disposable;
                this.f62050b.mo31373a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f62052d.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f62050b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f62050b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f62053e) {
                this.f62050b.onNext(t);
                return;
            }
            try {
                if (this.f62051c.mo31407b(t)) {
                    return;
                }
                this.f62053e = true;
                this.f62050b.onNext(t);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f62052d.mo31379f();
                this.f62050b.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62052d.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f61337b.mo31364c(new SkipWhileObserver(observer, null));
    }
}
