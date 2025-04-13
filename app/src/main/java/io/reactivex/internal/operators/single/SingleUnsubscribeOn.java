package io.reactivex.internal.operators.single;

import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class SingleUnsubscribeOn<T> extends Single<T> {

    public static final class UnsubscribeOnSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, Runnable {

        /* renamed from: b */
        public final SingleObserver<? super T> f62570b;

        /* renamed from: c */
        public final Scheduler f62571c = null;

        /* renamed from: d */
        public Disposable f62572d;

        public UnsubscribeOnSingleObserver(SingleObserver<? super T> singleObserver, Scheduler scheduler) {
            this.f62570b = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void mo31388a(Disposable disposable) {
            if (DisposableHelper.m31413e(this, disposable)) {
                this.f62570b.mo31388a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            Disposable andSet = getAndSet(disposableHelper);
            if (andSet != disposableHelper) {
                this.f62572d = andSet;
                this.f62571c.mo31376c(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            this.f62570b.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            this.f62570b.onSuccess(t);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f62572d.mo31379f();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super T> singleObserver) {
        new UnsubscribeOnSingleObserver(singleObserver, null);
        throw null;
    }
}
