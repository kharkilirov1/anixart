package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class ObservableRepeat<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class RepeatObserver<T> extends AtomicInteger implements Observer<T> {

        /* renamed from: b */
        public final Observer<? super T> f61894b;

        /* renamed from: c */
        public final SequentialDisposable f61895c;

        /* renamed from: d */
        public final ObservableSource<? extends T> f61896d;

        /* renamed from: e */
        public long f61897e;

        public RepeatObserver(Observer<? super T> observer, long j2, SequentialDisposable sequentialDisposable, ObservableSource<? extends T> observableSource) {
            this.f61894b = observer;
            this.f61895c = sequentialDisposable;
            this.f61896d = observableSource;
            this.f61897e = j2;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31411c(this.f61895c, disposable);
        }

        /* renamed from: b */
        public void m31694b() {
            if (getAndIncrement() == 0) {
                int i2 = 1;
                while (!this.f61895c.mo31380s()) {
                    this.f61896d.mo31364c(this);
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            long j2 = this.f61897e;
            if (j2 != Long.MAX_VALUE) {
                this.f61897e = j2 - 1;
            }
            if (j2 != 0) {
                m31694b();
            } else {
                this.f61894b.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f61894b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f61894b.onNext(t);
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.mo31373a(sequentialDisposable);
        new RepeatObserver(observer, -1L, sequentialDisposable, this.f61337b).m31694b();
    }
}
