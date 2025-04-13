package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableSubscribeOn<T> extends AbstractObservableWithUpstream<T, T> {

    /* renamed from: c */
    public final Scheduler f62054c;

    public static final class SubscribeOnObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f62055b;

        /* renamed from: c */
        public final AtomicReference<Disposable> f62056c = new AtomicReference<>();

        public SubscribeOnObserver(Observer<? super T> observer) {
            this.f62055b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31413e(this.f62056c, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this.f62056c);
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f62055b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f62055b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f62055b.onNext(t);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }
    }

    public final class SubscribeTask implements Runnable {

        /* renamed from: b */
        public final SubscribeOnObserver<T> f62057b;

        public SubscribeTask(SubscribeOnObserver<T> subscribeOnObserver) {
            this.f62057b = subscribeOnObserver;
        }

        @Override // java.lang.Runnable
        public void run() {
            ObservableSubscribeOn.this.f61337b.mo31364c(this.f62057b);
        }
    }

    public ObservableSubscribeOn(ObservableSource<T> observableSource, Scheduler scheduler) {
        super(observableSource);
        this.f62054c = scheduler;
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(observer);
        observer.mo31373a(subscribeOnObserver);
        DisposableHelper.m31413e(subscribeOnObserver, this.f62054c.mo31376c(new SubscribeTask(subscribeOnObserver)));
    }
}
