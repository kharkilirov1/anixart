package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class MaybeTakeUntilMaybe<T, U> extends AbstractMaybeWithUpstream<T, T> {

    public static final class TakeUntilMainMaybeObserver<T, U> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super T> f61133b;

        /* renamed from: c */
        public final TakeUntilOtherMaybeObserver<U> f61134c = new TakeUntilOtherMaybeObserver<>(this);

        public static final class TakeUntilOtherMaybeObserver<U> extends AtomicReference<Disposable> implements MaybeObserver<U> {

            /* renamed from: b */
            public final TakeUntilMainMaybeObserver<?, U> f61135b;

            public TakeUntilOtherMaybeObserver(TakeUntilMainMaybeObserver<?, U> takeUntilMainMaybeObserver) {
                this.f61135b = takeUntilMainMaybeObserver;
            }

            @Override // io.reactivex.MaybeObserver
            /* renamed from: a */
            public void mo31355a(Disposable disposable) {
                DisposableHelper.m31413e(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                TakeUntilMainMaybeObserver<?, U> takeUntilMainMaybeObserver = this.f61135b;
                if (DisposableHelper.m31409a(takeUntilMainMaybeObserver)) {
                    takeUntilMainMaybeObserver.f61133b.onComplete();
                }
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(Throwable th) {
                TakeUntilMainMaybeObserver<?, U> takeUntilMainMaybeObserver = this.f61135b;
                if (DisposableHelper.m31409a(takeUntilMainMaybeObserver)) {
                    takeUntilMainMaybeObserver.f61133b.onError(th);
                } else {
                    RxJavaPlugins.m31848b(th);
                }
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(Object obj) {
                TakeUntilMainMaybeObserver<?, U> takeUntilMainMaybeObserver = this.f61135b;
                if (DisposableHelper.m31409a(takeUntilMainMaybeObserver)) {
                    takeUntilMainMaybeObserver.f61133b.onComplete();
                }
            }
        }

        public TakeUntilMainMaybeObserver(MaybeObserver<? super T> maybeObserver) {
            this.f61133b = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            DisposableHelper.m31413e(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
            DisposableHelper.m31409a(this.f61134c);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            DisposableHelper.m31409a(this.f61134c);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f61133b.onComplete();
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            DisposableHelper.m31409a(this.f61134c);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f61133b.onError(th);
            } else {
                RxJavaPlugins.m31848b(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            DisposableHelper.m31409a(this.f61134c);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f61133b.onSuccess(t);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        maybeObserver.mo31355a(new TakeUntilMainMaybeObserver(maybeObserver));
        throw null;
    }
}
