package io.reactivex.internal.operators.single;

import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class SingleObserveOn<T> extends Single<T> {

    /* renamed from: b */
    public final SingleSource<T> f62540b;

    /* renamed from: c */
    public final Scheduler f62541c;

    public static final class ObserveOnSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, Runnable {

        /* renamed from: b */
        public final SingleObserver<? super T> f62542b;

        /* renamed from: c */
        public final Scheduler f62543c;

        /* renamed from: d */
        public T f62544d;

        /* renamed from: e */
        public Throwable f62545e;

        public ObserveOnSingleObserver(SingleObserver<? super T> singleObserver, Scheduler scheduler) {
            this.f62542b = singleObserver;
            this.f62543c = scheduler;
        }

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void mo31388a(Disposable disposable) {
            if (DisposableHelper.m31413e(this, disposable)) {
                this.f62542b.mo31388a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            this.f62545e = th;
            DisposableHelper.m31411c(this, this.f62543c.mo31376c(this));
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            this.f62544d = t;
            DisposableHelper.m31411c(this, this.f62543c.mo31376c(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.f62545e;
            if (th != null) {
                this.f62542b.onError(th);
            } else {
                this.f62542b.onSuccess(this.f62544d);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }
    }

    public SingleObserveOn(SingleSource<T> singleSource, Scheduler scheduler) {
        this.f62540b = singleSource;
        this.f62541c = scheduler;
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super T> singleObserver) {
        this.f62540b.mo31385b(new ObserveOnSingleObserver(singleObserver, this.f62541c));
    }
}
