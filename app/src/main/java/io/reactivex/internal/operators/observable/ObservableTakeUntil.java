package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableTakeUntil<T, U> extends AbstractObservableWithUpstream<T, T> {

    public static final class TakeUntilMainObserver<T, U> extends AtomicInteger implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f62102b;

        /* renamed from: c */
        public final AtomicReference<Disposable> f62103c = new AtomicReference<>();

        /* renamed from: d */
        public final TakeUntilMainObserver<T, U>.OtherObserver f62104d = new OtherObserver();

        /* renamed from: e */
        public final AtomicThrowable f62105e = new AtomicThrowable();

        public final class OtherObserver extends AtomicReference<Disposable> implements Observer<U> {
            public OtherObserver() {
            }

            @Override // io.reactivex.Observer
            /* renamed from: a */
            public void mo31373a(Disposable disposable) {
                DisposableHelper.m31413e(this, disposable);
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
                TakeUntilMainObserver takeUntilMainObserver = TakeUntilMainObserver.this;
                DisposableHelper.m31409a(takeUntilMainObserver.f62103c);
                HalfSerializer.m31822a(takeUntilMainObserver.f62102b, takeUntilMainObserver, takeUntilMainObserver.f62105e);
            }

            @Override // io.reactivex.Observer
            public void onError(Throwable th) {
                TakeUntilMainObserver takeUntilMainObserver = TakeUntilMainObserver.this;
                DisposableHelper.m31409a(takeUntilMainObserver.f62103c);
                HalfSerializer.m31824c(takeUntilMainObserver.f62102b, th, takeUntilMainObserver, takeUntilMainObserver.f62105e);
            }

            @Override // io.reactivex.Observer
            public void onNext(U u) {
                DisposableHelper.m31409a(this);
                TakeUntilMainObserver takeUntilMainObserver = TakeUntilMainObserver.this;
                DisposableHelper.m31409a(takeUntilMainObserver.f62103c);
                HalfSerializer.m31822a(takeUntilMainObserver.f62102b, takeUntilMainObserver, takeUntilMainObserver.f62105e);
            }
        }

        public TakeUntilMainObserver(Observer<? super T> observer) {
            this.f62102b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31413e(this.f62103c, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this.f62103c);
            DisposableHelper.m31409a(this.f62104d);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            DisposableHelper.m31409a(this.f62104d);
            HalfSerializer.m31822a(this.f62102b, this, this.f62105e);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            DisposableHelper.m31409a(this.f62104d);
            HalfSerializer.m31824c(this.f62102b, th, this, this.f62105e);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            HalfSerializer.m31826e(this.f62102b, t, this, this.f62105e);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(this.f62103c.get());
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        observer.mo31373a(new TakeUntilMainObserver(observer));
        throw null;
    }
}
