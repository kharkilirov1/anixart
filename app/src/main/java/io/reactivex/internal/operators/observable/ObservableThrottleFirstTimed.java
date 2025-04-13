package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableThrottleFirstTimed<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class DebounceTimedObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, Runnable {

        /* renamed from: b */
        public final Observer<? super T> f62115b;

        /* renamed from: c */
        public final long f62116c;

        /* renamed from: d */
        public final TimeUnit f62117d;

        /* renamed from: e */
        public final Scheduler.Worker f62118e;

        /* renamed from: f */
        public Disposable f62119f;

        /* renamed from: g */
        public volatile boolean f62120g;

        /* renamed from: h */
        public boolean f62121h;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62119f, disposable)) {
                this.f62119f = disposable;
                this.f62115b.mo31373a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f62119f.mo31379f();
            this.f62118e.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f62121h) {
                return;
            }
            this.f62121h = true;
            this.f62115b.onComplete();
            this.f62118e.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f62121h) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f62121h = true;
            this.f62115b.onError(th);
            this.f62118e.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f62120g || this.f62121h) {
                return;
            }
            this.f62120g = true;
            this.f62115b.onNext(t);
            Disposable disposable = get();
            if (disposable != null) {
                disposable.mo31379f();
            }
            DisposableHelper.m31411c(this, this.f62118e.mo31383c(this, this.f62116c, this.f62117d));
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f62120g = false;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62118e.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        throw null;
    }
}
