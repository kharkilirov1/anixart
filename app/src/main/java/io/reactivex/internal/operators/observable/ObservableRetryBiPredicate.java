package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class ObservableRetryBiPredicate<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class RetryBiObserver<T> extends AtomicInteger implements Observer<T> {

        /* renamed from: b */
        public final Observer<? super T> f61940b;

        /* renamed from: c */
        public final SequentialDisposable f61941c;

        /* renamed from: d */
        public final ObservableSource<? extends T> f61942d;

        /* renamed from: e */
        public final BiPredicate<? super Integer, ? super Throwable> f61943e = null;

        /* renamed from: f */
        public int f61944f;

        public RetryBiObserver(Observer<? super T> observer, BiPredicate<? super Integer, ? super Throwable> biPredicate, SequentialDisposable sequentialDisposable, ObservableSource<? extends T> observableSource) {
            this.f61940b = observer;
            this.f61941c = sequentialDisposable;
            this.f61942d = observableSource;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31411c(this.f61941c, disposable);
        }

        /* renamed from: b */
        public void m31709b() {
            if (getAndIncrement() == 0) {
                int i2 = 1;
                while (!this.f61941c.mo31380s()) {
                    this.f61942d.mo31364c(this);
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61940b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            try {
                BiPredicate<? super Integer, ? super Throwable> biPredicate = this.f61943e;
                int i2 = this.f61944f + 1;
                this.f61944f = i2;
                if (biPredicate.mo31404a(Integer.valueOf(i2), th)) {
                    m31709b();
                } else {
                    this.f61940b.onError(th);
                }
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                this.f61940b.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f61940b.onNext(t);
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.mo31373a(sequentialDisposable);
        new RetryBiObserver(observer, null, sequentialDisposable, this.f61337b).m31709b();
    }
}
