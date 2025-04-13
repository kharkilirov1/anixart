package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableDebounceTimed<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class DebounceEmitter<T> extends AtomicReference<Disposable> implements Runnable, Disposable {

        /* renamed from: b */
        public final T f61556b;

        /* renamed from: c */
        public final long f61557c;

        /* renamed from: d */
        public final DebounceTimedObserver<T> f61558d;

        /* renamed from: e */
        public final AtomicBoolean f61559e = new AtomicBoolean();

        public DebounceEmitter(T t, long j2, DebounceTimedObserver<T> debounceTimedObserver) {
            this.f61556b = t;
            this.f61557c = j2;
            this.f61558d = debounceTimedObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f61559e.compareAndSet(false, true)) {
                DebounceTimedObserver<T> debounceTimedObserver = this.f61558d;
                long j2 = this.f61557c;
                T t = this.f61556b;
                if (j2 == debounceTimedObserver.f61566h) {
                    debounceTimedObserver.f61560b.onNext(t);
                    DisposableHelper.m31409a(this);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return get() == DisposableHelper.DISPOSED;
        }
    }

    public static final class DebounceTimedObserver<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f61560b;

        /* renamed from: c */
        public final long f61561c;

        /* renamed from: d */
        public final TimeUnit f61562d;

        /* renamed from: e */
        public final Scheduler.Worker f61563e;

        /* renamed from: f */
        public Disposable f61564f;

        /* renamed from: g */
        public Disposable f61565g;

        /* renamed from: h */
        public volatile long f61566h;

        /* renamed from: i */
        public boolean f61567i;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61564f, disposable)) {
                this.f61564f = disposable;
                this.f61560b.mo31373a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61564f.mo31379f();
            this.f61563e.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f61567i) {
                return;
            }
            this.f61567i = true;
            Disposable disposable = this.f61565g;
            if (disposable != null) {
                disposable.mo31379f();
            }
            DebounceEmitter debounceEmitter = (DebounceEmitter) disposable;
            if (debounceEmitter != null) {
                debounceEmitter.run();
            }
            this.f61560b.onComplete();
            this.f61563e.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f61567i) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            Disposable disposable = this.f61565g;
            if (disposable != null) {
                disposable.mo31379f();
            }
            this.f61567i = true;
            this.f61560b.onError(th);
            this.f61563e.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f61567i) {
                return;
            }
            long j2 = this.f61566h + 1;
            this.f61566h = j2;
            Disposable disposable = this.f61565g;
            if (disposable != null) {
                disposable.mo31379f();
            }
            DebounceEmitter debounceEmitter = new DebounceEmitter(t, j2, this);
            this.f61565g = debounceEmitter;
            DisposableHelper.m31411c(debounceEmitter, this.f61563e.mo31383c(debounceEmitter, this.f61561c, this.f61562d));
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61563e.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        throw null;
    }
}
