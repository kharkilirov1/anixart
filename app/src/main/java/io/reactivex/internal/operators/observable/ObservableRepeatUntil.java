package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class ObservableRepeatUntil<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class RepeatUntilObserver<T> extends AtomicInteger implements Observer<T> {

        /* renamed from: b */
        public final Observer<? super T> f61898b;

        /* renamed from: c */
        public final SequentialDisposable f61899c;

        /* renamed from: d */
        public final ObservableSource<? extends T> f61900d;

        /* renamed from: e */
        public final BooleanSupplier f61901e = null;

        public RepeatUntilObserver(Observer<? super T> observer, BooleanSupplier booleanSupplier, SequentialDisposable sequentialDisposable, ObservableSource<? extends T> observableSource) {
            this.f61898b = observer;
            this.f61899c = sequentialDisposable;
            this.f61900d = observableSource;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31411c(this.f61899c, disposable);
        }

        /* renamed from: b */
        public void m31695b() {
            if (getAndIncrement() == 0) {
                int i2 = 1;
                do {
                    this.f61900d.mo31364c(this);
                    i2 = addAndGet(-i2);
                } while (i2 != 0);
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            try {
                if (this.f61901e.mo31405a()) {
                    this.f61898b.onComplete();
                } else {
                    m31695b();
                }
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61898b.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f61898b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f61898b.onNext(t);
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.mo31373a(sequentialDisposable);
        new RepeatUntilObserver(observer, null, sequentialDisposable, this.f61337b).m31695b();
    }
}
