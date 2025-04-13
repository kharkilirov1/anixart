package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class ObservableUnsubscribeOn<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class UnsubscribeObserver<T> extends AtomicBoolean implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f62176b;

        /* renamed from: c */
        public final Scheduler f62177c = null;

        /* renamed from: d */
        public Disposable f62178d;

        public final class DisposeTask implements Runnable {
            public DisposeTask() {
            }

            @Override // java.lang.Runnable
            public void run() {
                UnsubscribeObserver.this.f62178d.mo31379f();
            }
        }

        public UnsubscribeObserver(Observer<? super T> observer, Scheduler scheduler) {
            this.f62176b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62178d, disposable)) {
                this.f62178d = disposable;
                this.f62176b.mo31373a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (compareAndSet(false, true)) {
                this.f62177c.mo31376c(new DisposeTask());
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (get()) {
                return;
            }
            this.f62176b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (get()) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f62176b.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (get()) {
                return;
            }
            this.f62176b.onNext(t);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return get();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f61337b.mo31364c(new UnsubscribeObserver(observer, null));
    }
}
