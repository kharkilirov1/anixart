package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableThrottleLatest<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class ThrottleLatestObserver<T> extends AtomicInteger implements Observer<T>, Disposable, Runnable {

        /* renamed from: b */
        public final Observer<? super T> f62122b;

        /* renamed from: c */
        public final long f62123c;

        /* renamed from: d */
        public final TimeUnit f62124d;

        /* renamed from: e */
        public final Scheduler.Worker f62125e;

        /* renamed from: f */
        public final boolean f62126f;

        /* renamed from: g */
        public final AtomicReference<T> f62127g;

        /* renamed from: h */
        public Disposable f62128h;

        /* renamed from: i */
        public volatile boolean f62129i;

        /* renamed from: j */
        public Throwable f62130j;

        /* renamed from: k */
        public volatile boolean f62131k;

        /* renamed from: l */
        public volatile boolean f62132l;

        /* renamed from: m */
        public boolean f62133m;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62128h, disposable)) {
                this.f62128h = disposable;
                this.f62122b.mo31373a(this);
            }
        }

        /* renamed from: b */
        public void m31726b() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<T> atomicReference = this.f62127g;
            Observer<? super T> observer = this.f62122b;
            int i2 = 1;
            while (!this.f62131k) {
                boolean z = this.f62129i;
                if (z && this.f62130j != null) {
                    atomicReference.lazySet(null);
                    observer.onError(this.f62130j);
                    this.f62125e.mo31379f();
                    return;
                }
                boolean z2 = atomicReference.get() == null;
                if (z) {
                    T andSet = atomicReference.getAndSet(null);
                    if (!z2 && this.f62126f) {
                        observer.onNext(andSet);
                    }
                    observer.onComplete();
                    this.f62125e.mo31379f();
                    return;
                }
                if (z2) {
                    if (this.f62132l) {
                        this.f62133m = false;
                        this.f62132l = false;
                    }
                } else if (!this.f62133m || this.f62132l) {
                    observer.onNext(atomicReference.getAndSet(null));
                    this.f62132l = false;
                    this.f62133m = true;
                    this.f62125e.mo31383c(this, this.f62123c, this.f62124d);
                }
                i2 = addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f62131k = true;
            this.f62128h.mo31379f();
            this.f62125e.mo31379f();
            if (getAndIncrement() == 0) {
                this.f62127g.lazySet(null);
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f62129i = true;
            m31726b();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f62130j = th;
            this.f62129i = true;
            m31726b();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f62127g.set(t);
            m31726b();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f62132l = true;
            m31726b();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62131k;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        throw null;
    }
}
