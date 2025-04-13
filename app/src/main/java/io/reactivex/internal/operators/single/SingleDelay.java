package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class SingleDelay<T> extends Single<T> {

    public final class Delay implements SingleObserver<T> {

        /* renamed from: b */
        public final SequentialDisposable f62446b;

        /* renamed from: c */
        public final SingleObserver<? super T> f62447c;

        /* renamed from: d */
        public final /* synthetic */ SingleDelay f62448d;

        public final class OnError implements Runnable {

            /* renamed from: b */
            public final Throwable f62449b;

            /* renamed from: c */
            public final /* synthetic */ Delay f62450c;

            @Override // java.lang.Runnable
            public void run() {
                this.f62450c.f62447c.onError(this.f62449b);
            }
        }

        public final class OnSuccess implements Runnable {

            /* renamed from: b */
            public final T f62451b;

            /* renamed from: c */
            public final /* synthetic */ Delay f62452c;

            @Override // java.lang.Runnable
            public void run() {
                this.f62452c.f62447c.onSuccess(this.f62451b);
            }
        }

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void mo31388a(Disposable disposable) {
            DisposableHelper.m31411c(this.f62446b, disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            Objects.requireNonNull(this.f62448d);
            Objects.requireNonNull(this.f62448d);
            Objects.requireNonNull(this.f62448d);
            throw null;
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            Objects.requireNonNull(this.f62448d);
            Objects.requireNonNull(this.f62448d);
            Objects.requireNonNull(this.f62448d);
            throw null;
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super T> singleObserver) {
        singleObserver.mo31388a(new SequentialDisposable());
        throw null;
    }
}
