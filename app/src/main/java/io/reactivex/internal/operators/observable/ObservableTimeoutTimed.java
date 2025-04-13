package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableTimeoutTimed<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class FallbackObserver<T> implements Observer<T> {

        /* renamed from: b */
        public final Observer<? super T> f62151b;

        /* renamed from: c */
        public final AtomicReference<Disposable> f62152c;

        public FallbackObserver(Observer<? super T> observer, AtomicReference<Disposable> atomicReference) {
            this.f62151b = observer;
            this.f62152c = atomicReference;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31411c(this.f62152c, disposable);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f62151b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f62151b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f62151b.onNext(t);
        }
    }

    public static final class TimeoutFallbackObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, TimeoutSupport {

        /* renamed from: b */
        public final Observer<? super T> f62153b;

        /* renamed from: c */
        public final long f62154c;

        /* renamed from: d */
        public final TimeUnit f62155d;

        /* renamed from: e */
        public final Scheduler.Worker f62156e;

        /* renamed from: f */
        public final SequentialDisposable f62157f;

        /* renamed from: g */
        public final AtomicLong f62158g;

        /* renamed from: h */
        public final AtomicReference<Disposable> f62159h;

        /* renamed from: i */
        public ObservableSource<? extends T> f62160i;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31413e(this.f62159h, disposable);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport
        /* renamed from: b */
        public void mo31727b(long j2) {
            if (this.f62158g.compareAndSet(j2, Long.MAX_VALUE)) {
                DisposableHelper.m31409a(this.f62159h);
                ObservableSource<? extends T> observableSource = this.f62160i;
                this.f62160i = null;
                observableSource.mo31364c(new FallbackObserver(this.f62153b, this));
                this.f62156e.mo31379f();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this.f62159h);
            DisposableHelper.m31409a(this);
            this.f62156e.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f62158g.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                DisposableHelper.m31409a(this.f62157f);
                this.f62153b.onComplete();
                this.f62156e.mo31379f();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f62158g.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            DisposableHelper.m31409a(this.f62157f);
            this.f62153b.onError(th);
            this.f62156e.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            long j2 = this.f62158g.get();
            if (j2 != Long.MAX_VALUE) {
                long j3 = 1 + j2;
                if (this.f62158g.compareAndSet(j2, j3)) {
                    this.f62157f.get().mo31379f();
                    this.f62153b.onNext(t);
                    DisposableHelper.m31411c(this.f62157f, this.f62156e.mo31383c(new TimeoutTask(j3, this), this.f62154c, this.f62155d));
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }
    }

    public static final class TimeoutObserver<T> extends AtomicLong implements Observer<T>, Disposable, TimeoutSupport {

        /* renamed from: b */
        public final Observer<? super T> f62161b;

        /* renamed from: c */
        public final long f62162c;

        /* renamed from: d */
        public final TimeUnit f62163d;

        /* renamed from: e */
        public final Scheduler.Worker f62164e;

        /* renamed from: f */
        public final SequentialDisposable f62165f;

        /* renamed from: g */
        public final AtomicReference<Disposable> f62166g;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31413e(this.f62166g, disposable);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport
        /* renamed from: b */
        public void mo31727b(long j2) {
            if (compareAndSet(j2, Long.MAX_VALUE)) {
                DisposableHelper.m31409a(this.f62166g);
                this.f62161b.onError(new TimeoutException(ExceptionHelper.m31820d(this.f62162c, this.f62163d)));
                this.f62164e.mo31379f();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this.f62166g);
            this.f62164e.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                DisposableHelper.m31409a(this.f62165f);
                this.f62161b.onComplete();
                this.f62164e.mo31379f();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            DisposableHelper.m31409a(this.f62165f);
            this.f62161b.onError(th);
            this.f62164e.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            long j2 = get();
            if (j2 != Long.MAX_VALUE) {
                long j3 = 1 + j2;
                if (compareAndSet(j2, j3)) {
                    this.f62165f.get().mo31379f();
                    this.f62161b.onNext(t);
                    DisposableHelper.m31411c(this.f62165f, this.f62164e.mo31383c(new TimeoutTask(j3, this), this.f62162c, this.f62163d));
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(this.f62166g.get());
        }
    }

    public interface TimeoutSupport {
        /* renamed from: b */
        void mo31727b(long j2);
    }

    public static final class TimeoutTask implements Runnable {

        /* renamed from: b */
        public final TimeoutSupport f62167b;

        /* renamed from: c */
        public final long f62168c;

        public TimeoutTask(long j2, TimeoutSupport timeoutSupport) {
            this.f62168c = j2;
            this.f62167b = timeoutSupport;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f62167b.mo31727b(this.f62168c);
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        throw null;
    }
}
