package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes3.dex */
public final class ObservableOnErrorNext<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class OnErrorNextObserver<T> implements Observer<T> {

        /* renamed from: b */
        public final Observer<? super T> f61850b;

        /* renamed from: d */
        public final boolean f61852d;

        /* renamed from: f */
        public boolean f61854f;

        /* renamed from: g */
        public boolean f61855g;

        /* renamed from: c */
        public final Function<? super Throwable, ? extends ObservableSource<? extends T>> f61851c = null;

        /* renamed from: e */
        public final SequentialDisposable f61853e = new SequentialDisposable();

        public OnErrorNextObserver(Observer<? super T> observer, Function<? super Throwable, ? extends ObservableSource<? extends T>> function, boolean z) {
            this.f61850b = observer;
            this.f61852d = z;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31411c(this.f61853e, disposable);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f61855g) {
                return;
            }
            this.f61855g = true;
            this.f61854f = true;
            this.f61850b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f61854f) {
                if (this.f61855g) {
                    RxJavaPlugins.m31848b(th);
                    return;
                } else {
                    this.f61850b.onError(th);
                    return;
                }
            }
            this.f61854f = true;
            if (this.f61852d && !(th instanceof Exception)) {
                this.f61850b.onError(th);
                return;
            }
            try {
                ObservableSource<? extends T> apply = this.f61851c.apply(th);
                if (apply != null) {
                    apply.mo31364c(this);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("Observable is null");
                nullPointerException.initCause(th);
                this.f61850b.onError(nullPointerException);
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                this.f61850b.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f61855g) {
                return;
            }
            this.f61850b.onNext(t);
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        OnErrorNextObserver onErrorNextObserver = new OnErrorNextObserver(observer, null, false);
        observer.mo31373a(onErrorNextObserver.f61853e);
        this.f61337b.mo31364c(onErrorNextObserver);
    }
}
