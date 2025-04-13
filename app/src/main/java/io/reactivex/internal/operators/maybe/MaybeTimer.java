package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class MaybeTimer extends Maybe<Long> {

    public static final class TimerDisposable extends AtomicReference<Disposable> implements Disposable, Runnable {

        /* renamed from: b */
        public final MaybeObserver<? super Long> f61151b;

        public TimerDisposable(MaybeObserver<? super Long> maybeObserver) {
            this.f61151b = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f61151b.onSuccess(0L);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super Long> maybeObserver) {
        maybeObserver.mo31355a(new TimerDisposable(maybeObserver));
        throw null;
    }
}
