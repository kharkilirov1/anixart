package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes3.dex */
public final class ObservableOnErrorReturn<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class OnErrorReturnObserver<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f61856b;

        /* renamed from: c */
        public final Function<? super Throwable, ? extends T> f61857c = null;

        /* renamed from: d */
        public Disposable f61858d;

        public OnErrorReturnObserver(Observer<? super T> observer, Function<? super Throwable, ? extends T> function) {
            this.f61856b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61858d, disposable)) {
                this.f61858d = disposable;
                this.f61856b.mo31373a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61858d.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61856b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            try {
                T apply = this.f61857c.apply(th);
                if (apply != null) {
                    this.f61856b.onNext(apply);
                    this.f61856b.onComplete();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.f61856b.onError(nullPointerException);
                }
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                this.f61856b.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f61856b.onNext(t);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61858d.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f61337b.mo31364c(new OnErrorReturnObserver(observer, null));
    }
}
