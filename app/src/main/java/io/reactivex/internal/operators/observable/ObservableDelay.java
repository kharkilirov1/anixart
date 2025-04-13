package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class ObservableDelay<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class DelayObserver<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f61569b;

        /* renamed from: c */
        public final long f61570c;

        /* renamed from: d */
        public final TimeUnit f61571d;

        /* renamed from: e */
        public final Scheduler.Worker f61572e;

        /* renamed from: f */
        public final boolean f61573f;

        /* renamed from: g */
        public Disposable f61574g;

        public final class OnComplete implements Runnable {
            public OnComplete() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    DelayObserver.this.f61569b.onComplete();
                } finally {
                    DelayObserver.this.f61572e.mo31379f();
                }
            }
        }

        public final class OnError implements Runnable {

            /* renamed from: b */
            public final Throwable f61576b;

            public OnError(Throwable th) {
                this.f61576b = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    DelayObserver.this.f61569b.onError(this.f61576b);
                } finally {
                    DelayObserver.this.f61572e.mo31379f();
                }
            }
        }

        public final class OnNext implements Runnable {

            /* renamed from: b */
            public final T f61578b;

            public OnNext(T t) {
                this.f61578b = t;
            }

            @Override // java.lang.Runnable
            public void run() {
                DelayObserver.this.f61569b.onNext(this.f61578b);
            }
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61574g, disposable)) {
                this.f61574g = disposable;
                this.f61569b.mo31373a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61574g.mo31379f();
            this.f61572e.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61572e.mo31383c(new OnComplete(), this.f61570c, this.f61571d);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f61572e.mo31383c(new OnError(th), this.f61573f ? this.f61570c : 0L, this.f61571d);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f61572e.mo31383c(new OnNext(t), this.f61570c, this.f61571d);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61572e.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        throw null;
    }
}
