package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableDebounce<T, U> extends AbstractObservableWithUpstream<T, T> {

    public static final class DebounceObserver<T, U> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f61545b;

        /* renamed from: d */
        public Disposable f61547d;

        /* renamed from: f */
        public volatile long f61549f;

        /* renamed from: g */
        public boolean f61550g;

        /* renamed from: e */
        public final AtomicReference<Disposable> f61548e = new AtomicReference<>();

        /* renamed from: c */
        public final Function<? super T, ? extends ObservableSource<U>> f61546c = null;

        public static final class DebounceInnerObserver<T, U> extends DisposableObserver<U> {

            /* renamed from: c */
            public final DebounceObserver<T, U> f61551c;

            /* renamed from: d */
            public final long f61552d;

            /* renamed from: e */
            public final T f61553e;

            /* renamed from: f */
            public boolean f61554f;

            /* renamed from: g */
            public final AtomicBoolean f61555g = new AtomicBoolean();

            public DebounceInnerObserver(DebounceObserver<T, U> debounceObserver, long j2, T t) {
                this.f61551c = debounceObserver;
                this.f61552d = j2;
                this.f61553e = t;
            }

            /* renamed from: b */
            public void m31660b() {
                if (this.f61555g.compareAndSet(false, true)) {
                    DebounceObserver<T, U> debounceObserver = this.f61551c;
                    long j2 = this.f61552d;
                    T t = this.f61553e;
                    if (j2 == debounceObserver.f61549f) {
                        debounceObserver.f61545b.onNext(t);
                    }
                }
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
                if (this.f61554f) {
                    return;
                }
                this.f61554f = true;
                m31660b();
            }

            @Override // io.reactivex.Observer
            public void onError(Throwable th) {
                if (this.f61554f) {
                    RxJavaPlugins.m31848b(th);
                    return;
                }
                this.f61554f = true;
                DebounceObserver<T, U> debounceObserver = this.f61551c;
                DisposableHelper.m31409a(debounceObserver.f61548e);
                debounceObserver.f61545b.onError(th);
            }

            @Override // io.reactivex.Observer
            public void onNext(U u) {
                if (this.f61554f) {
                    return;
                }
                this.f61554f = true;
                DisposableHelper.m31409a(this.f62817b);
                m31660b();
            }
        }

        public DebounceObserver(Observer<? super T> observer, Function<? super T, ? extends ObservableSource<U>> function) {
            this.f61545b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61547d, disposable)) {
                this.f61547d = disposable;
                this.f61545b.mo31373a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61547d.mo31379f();
            DisposableHelper.m31409a(this.f61548e);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f61550g) {
                return;
            }
            this.f61550g = true;
            Disposable disposable = this.f61548e.get();
            if (disposable != DisposableHelper.DISPOSED) {
                ((DebounceInnerObserver) disposable).m31660b();
                DisposableHelper.m31409a(this.f61548e);
                this.f61545b.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            DisposableHelper.m31409a(this.f61548e);
            this.f61545b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f61550g) {
                return;
            }
            long j2 = this.f61549f + 1;
            this.f61549f = j2;
            Disposable disposable = this.f61548e.get();
            if (disposable != null) {
                disposable.mo31379f();
            }
            try {
                ObservableSource<U> apply = this.f61546c.apply(t);
                Objects.requireNonNull(apply, "The ObservableSource supplied is null");
                ObservableSource<U> observableSource = apply;
                DebounceInnerObserver debounceInnerObserver = new DebounceInnerObserver(this, j2, t);
                if (this.f61548e.compareAndSet(disposable, debounceInnerObserver)) {
                    observableSource.mo31364c(debounceInnerObserver);
                }
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                mo31379f();
                this.f61545b.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61547d.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f61337b.mo31364c(new DebounceObserver(new SerializedObserver(observer), null));
    }
}
