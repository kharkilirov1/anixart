package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.operators.observable.ObservableTimeoutTimed;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableTimeout<T, U, V> extends AbstractObservableWithUpstream<T, T> {

    public static final class TimeoutConsumer extends AtomicReference<Disposable> implements Observer<Object>, Disposable {

        /* renamed from: b */
        public final TimeoutSelectorSupport f62139b;

        /* renamed from: c */
        public final long f62140c;

        public TimeoutConsumer(long j2, TimeoutSelectorSupport timeoutSelectorSupport) {
            this.f62140c = j2;
            this.f62139b = timeoutSelectorSupport;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31413e(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            Object obj = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (obj != disposableHelper) {
                lazySet(disposableHelper);
                this.f62139b.mo31727b(this.f62140c);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            Object obj = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (obj == disposableHelper) {
                RxJavaPlugins.m31848b(th);
            } else {
                lazySet(disposableHelper);
                this.f62139b.mo31728c(this.f62140c, th);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            Disposable disposable = (Disposable) get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable != disposableHelper) {
                disposable.mo31379f();
                lazySet(disposableHelper);
                this.f62139b.mo31727b(this.f62140c);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }
    }

    public static final class TimeoutFallbackObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, TimeoutSelectorSupport {

        /* renamed from: b */
        public final Observer<? super T> f62141b;

        /* renamed from: c */
        public final Function<? super T, ? extends ObservableSource<?>> f62142c;

        /* renamed from: d */
        public final SequentialDisposable f62143d;

        /* renamed from: e */
        public final AtomicLong f62144e;

        /* renamed from: f */
        public final AtomicReference<Disposable> f62145f;

        /* renamed from: g */
        public ObservableSource<? extends T> f62146g;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31413e(this.f62145f, disposable);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport
        /* renamed from: b */
        public void mo31727b(long j2) {
            if (this.f62144e.compareAndSet(j2, Long.MAX_VALUE)) {
                DisposableHelper.m31409a(this.f62145f);
                ObservableSource<? extends T> observableSource = this.f62146g;
                this.f62146g = null;
                observableSource.mo31364c(new ObservableTimeoutTimed.FallbackObserver(this.f62141b, this));
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutSelectorSupport
        /* renamed from: c */
        public void mo31728c(long j2, Throwable th) {
            if (!this.f62144e.compareAndSet(j2, Long.MAX_VALUE)) {
                RxJavaPlugins.m31848b(th);
            } else {
                DisposableHelper.m31409a(this);
                this.f62141b.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this.f62145f);
            DisposableHelper.m31409a(this);
            DisposableHelper.m31409a(this.f62143d);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f62144e.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                DisposableHelper.m31409a(this.f62143d);
                this.f62141b.onComplete();
                DisposableHelper.m31409a(this.f62143d);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f62144e.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            DisposableHelper.m31409a(this.f62143d);
            this.f62141b.onError(th);
            DisposableHelper.m31409a(this.f62143d);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            long j2 = this.f62144e.get();
            if (j2 != Long.MAX_VALUE) {
                long j3 = 1 + j2;
                if (this.f62144e.compareAndSet(j2, j3)) {
                    Disposable disposable = this.f62143d.get();
                    if (disposable != null) {
                        disposable.mo31379f();
                    }
                    this.f62141b.onNext(t);
                    try {
                        ObservableSource<?> apply = this.f62142c.apply(t);
                        Objects.requireNonNull(apply, "The itemTimeoutIndicator returned a null ObservableSource.");
                        ObservableSource<?> observableSource = apply;
                        TimeoutConsumer timeoutConsumer = new TimeoutConsumer(j3, this);
                        if (DisposableHelper.m31411c(this.f62143d, timeoutConsumer)) {
                            observableSource.mo31364c(timeoutConsumer);
                        }
                    } catch (Throwable th) {
                        Exceptions.m31402a(th);
                        this.f62145f.get().mo31379f();
                        this.f62144e.getAndSet(Long.MAX_VALUE);
                        this.f62141b.onError(th);
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }
    }

    public static final class TimeoutObserver<T> extends AtomicLong implements Observer<T>, Disposable, TimeoutSelectorSupport {

        /* renamed from: b */
        public final Observer<? super T> f62147b;

        /* renamed from: c */
        public final Function<? super T, ? extends ObservableSource<?>> f62148c = null;

        /* renamed from: d */
        public final SequentialDisposable f62149d = new SequentialDisposable();

        /* renamed from: e */
        public final AtomicReference<Disposable> f62150e = new AtomicReference<>();

        public TimeoutObserver(Observer<? super T> observer, Function<? super T, ? extends ObservableSource<?>> function) {
            this.f62147b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31413e(this.f62150e, disposable);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport
        /* renamed from: b */
        public void mo31727b(long j2) {
            if (compareAndSet(j2, Long.MAX_VALUE)) {
                DisposableHelper.m31409a(this.f62150e);
                this.f62147b.onError(new TimeoutException());
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutSelectorSupport
        /* renamed from: c */
        public void mo31728c(long j2, Throwable th) {
            if (!compareAndSet(j2, Long.MAX_VALUE)) {
                RxJavaPlugins.m31848b(th);
            } else {
                DisposableHelper.m31409a(this.f62150e);
                this.f62147b.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this.f62150e);
            DisposableHelper.m31409a(this.f62149d);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                DisposableHelper.m31409a(this.f62149d);
                this.f62147b.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.m31848b(th);
            } else {
                DisposableHelper.m31409a(this.f62149d);
                this.f62147b.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            long j2 = get();
            if (j2 != Long.MAX_VALUE) {
                long j3 = 1 + j2;
                if (compareAndSet(j2, j3)) {
                    Disposable disposable = this.f62149d.get();
                    if (disposable != null) {
                        disposable.mo31379f();
                    }
                    this.f62147b.onNext(t);
                    try {
                        ObservableSource<?> apply = this.f62148c.apply(t);
                        Objects.requireNonNull(apply, "The itemTimeoutIndicator returned a null ObservableSource.");
                        ObservableSource<?> observableSource = apply;
                        TimeoutConsumer timeoutConsumer = new TimeoutConsumer(j3, this);
                        if (DisposableHelper.m31411c(this.f62149d, timeoutConsumer)) {
                            observableSource.mo31364c(timeoutConsumer);
                        }
                    } catch (Throwable th) {
                        Exceptions.m31402a(th);
                        this.f62150e.get().mo31379f();
                        getAndSet(Long.MAX_VALUE);
                        this.f62147b.onError(th);
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(this.f62150e.get());
        }
    }

    public interface TimeoutSelectorSupport extends ObservableTimeoutTimed.TimeoutSupport {
        /* renamed from: c */
        void mo31728c(long j2, Throwable th);
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        TimeoutObserver timeoutObserver = new TimeoutObserver(observer, null);
        observer.mo31373a(timeoutObserver);
        this.f61337b.mo31364c(timeoutObserver);
    }
}
