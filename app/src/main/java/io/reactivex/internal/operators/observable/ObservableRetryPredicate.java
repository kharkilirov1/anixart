package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class ObservableRetryPredicate<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class RepeatObserver<T> extends AtomicInteger implements Observer<T> {

        /* renamed from: b */
        public final Observer<? super T> f61945b;

        /* renamed from: c */
        public final SequentialDisposable f61946c;

        /* renamed from: d */
        public final ObservableSource<? extends T> f61947d;

        /* renamed from: e */
        public final Predicate<? super Throwable> f61948e = null;

        /* renamed from: f */
        public long f61949f;

        public RepeatObserver(Observer<? super T> observer, long j2, Predicate<? super Throwable> predicate, SequentialDisposable sequentialDisposable, ObservableSource<? extends T> observableSource) {
            this.f61945b = observer;
            this.f61946c = sequentialDisposable;
            this.f61947d = observableSource;
            this.f61949f = j2;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31411c(this.f61946c, disposable);
        }

        /* renamed from: b */
        public void m31710b() {
            if (getAndIncrement() == 0) {
                int i2 = 1;
                while (!this.f61946c.mo31380s()) {
                    this.f61947d.mo31364c(this);
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61945b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            long j2 = this.f61949f;
            if (j2 != Long.MAX_VALUE) {
                this.f61949f = j2 - 1;
            }
            if (j2 == 0) {
                this.f61945b.onError(th);
                return;
            }
            try {
                if (this.f61948e.mo31407b(th)) {
                    m31710b();
                } else {
                    this.f61945b.onError(th);
                }
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                this.f61945b.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f61945b.onNext(t);
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.mo31373a(sequentialDisposable);
        new RepeatObserver(observer, 0L, null, sequentialDisposable, this.f61337b).m31710b();
    }
}
