package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class SingleTimer extends Single<Long> {

    public static final class TimerDisposable extends AtomicReference<Disposable> implements Disposable, Runnable {

        /* renamed from: b */
        public final SingleObserver<? super Long> f62565b;

        public TimerDisposable(SingleObserver<? super Long> singleObserver) {
            this.f62565b = singleObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f62565b.onSuccess(0L);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super Long> singleObserver) {
        singleObserver.mo31388a(new TimerDisposable(singleObserver));
        throw null;
    }
}
