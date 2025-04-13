package io.reactivex.internal.operators.single;

import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class SingleSubscribeOn<T> extends Single<T> {

    /* renamed from: b */
    public final SingleSource<? extends T> f62550b;

    /* renamed from: c */
    public final Scheduler f62551c;

    public static final class SubscribeOnObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, Runnable {

        /* renamed from: b */
        public final SingleObserver<? super T> f62552b;

        /* renamed from: c */
        public final SequentialDisposable f62553c = new SequentialDisposable();

        /* renamed from: d */
        public final SingleSource<? extends T> f62554d;

        public SubscribeOnObserver(SingleObserver<? super T> singleObserver, SingleSource<? extends T> singleSource) {
            this.f62552b = singleObserver;
            this.f62554d = singleSource;
        }

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void mo31388a(Disposable disposable) {
            DisposableHelper.m31413e(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
            DisposableHelper.m31409a(this.f62553c);
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            this.f62552b.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            this.f62552b.onSuccess(t);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f62554d.mo31385b(this);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }
    }

    public SingleSubscribeOn(SingleSource<? extends T> singleSource, Scheduler scheduler) {
        this.f62550b = singleSource;
        this.f62551c = scheduler;
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super T> singleObserver) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(singleObserver, this.f62550b);
        singleObserver.mo31388a(subscribeOnObserver);
        DisposableHelper.m31411c(subscribeOnObserver.f62553c, this.f62551c.mo31376c(subscribeOnObserver));
    }
}
