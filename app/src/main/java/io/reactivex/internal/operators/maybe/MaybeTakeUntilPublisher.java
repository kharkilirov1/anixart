package io.reactivex.internal.operators.maybe;

import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class MaybeTakeUntilPublisher<T, U> extends AbstractMaybeWithUpstream<T, T> {

    public static final class TakeUntilMainMaybeObserver<T, U> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super T> f61136b;

        /* renamed from: c */
        public final TakeUntilOtherMaybeObserver<U> f61137c = new TakeUntilOtherMaybeObserver<>(this);

        public static final class TakeUntilOtherMaybeObserver<U> extends AtomicReference<Subscription> implements FlowableSubscriber<U> {

            /* renamed from: b */
            public final TakeUntilMainMaybeObserver<?, U> f61138b;

            public TakeUntilOtherMaybeObserver(TakeUntilMainMaybeObserver<?, U> takeUntilMainMaybeObserver) {
                this.f61138b = takeUntilMainMaybeObserver;
            }

            @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
            /* renamed from: d */
            public void mo31352d(Subscription subscription) {
                SubscriptionHelper.m31802f(this, subscription, Long.MAX_VALUE);
            }

            @Override // org.reactivestreams.Subscriber
            public void onComplete() {
                TakeUntilMainMaybeObserver<?, U> takeUntilMainMaybeObserver = this.f61138b;
                if (DisposableHelper.m31409a(takeUntilMainMaybeObserver)) {
                    takeUntilMainMaybeObserver.f61136b.onComplete();
                }
            }

            @Override // org.reactivestreams.Subscriber
            public void onError(Throwable th) {
                TakeUntilMainMaybeObserver<?, U> takeUntilMainMaybeObserver = this.f61138b;
                if (DisposableHelper.m31409a(takeUntilMainMaybeObserver)) {
                    takeUntilMainMaybeObserver.f61136b.onError(th);
                } else {
                    RxJavaPlugins.m31848b(th);
                }
            }

            @Override // org.reactivestreams.Subscriber
            public void onNext(Object obj) {
                SubscriptionHelper.m31797a(this);
                TakeUntilMainMaybeObserver<?, U> takeUntilMainMaybeObserver = this.f61138b;
                if (DisposableHelper.m31409a(takeUntilMainMaybeObserver)) {
                    takeUntilMainMaybeObserver.f61136b.onComplete();
                }
            }
        }

        public TakeUntilMainMaybeObserver(MaybeObserver<? super T> maybeObserver) {
            this.f61136b = maybeObserver;
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
            SubscriptionHelper.m31797a(this.f61137c);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            SubscriptionHelper.m31797a(this.f61137c);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f61136b.onComplete();
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            SubscriptionHelper.m31797a(this.f61137c);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f61136b.onError(th);
            } else {
                RxJavaPlugins.m31848b(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            SubscriptionHelper.m31797a(this.f61137c);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f61136b.onSuccess(t);
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
