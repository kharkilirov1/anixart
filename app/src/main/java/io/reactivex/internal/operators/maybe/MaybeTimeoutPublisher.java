package io.reactivex.internal.operators.maybe;

import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class MaybeTimeoutPublisher<T, U> extends AbstractMaybeWithUpstream<T, T> {

    public static final class TimeoutFallbackMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {

        /* renamed from: b */
        public final MaybeObserver<? super T> f61145b;

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            DisposableHelper.m31413e(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f61145b.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.f61145b.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.f61145b.onSuccess(t);
        }
    }

    public static final class TimeoutMainMaybeObserver<T, U> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super T> f61146b;

        /* renamed from: c */
        public final TimeoutOtherMaybeObserver<T, U> f61147c = new TimeoutOtherMaybeObserver<>(this);

        /* renamed from: d */
        public final MaybeSource<? extends T> f61148d = null;

        /* renamed from: e */
        public final TimeoutFallbackMaybeObserver<T> f61149e = null;

        public TimeoutMainMaybeObserver(MaybeObserver<? super T> maybeObserver, MaybeSource<? extends T> maybeSource) {
            this.f61146b = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            DisposableHelper.m31413e(this, disposable);
        }

        /* renamed from: b */
        public void m31627b() {
            if (DisposableHelper.m31409a(this)) {
                MaybeSource<? extends T> maybeSource = this.f61148d;
                if (maybeSource == null) {
                    this.f61146b.onError(new TimeoutException());
                } else {
                    maybeSource.mo31353b(this.f61149e);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
            SubscriptionHelper.m31797a(this.f61147c);
            TimeoutFallbackMaybeObserver<T> timeoutFallbackMaybeObserver = this.f61149e;
            if (timeoutFallbackMaybeObserver != null) {
                DisposableHelper.m31409a(timeoutFallbackMaybeObserver);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            SubscriptionHelper.m31797a(this.f61147c);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f61146b.onComplete();
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            SubscriptionHelper.m31797a(this.f61147c);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f61146b.onError(th);
            } else {
                RxJavaPlugins.m31848b(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            SubscriptionHelper.m31797a(this.f61147c);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f61146b.onSuccess(t);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }
    }

    public static final class TimeoutOtherMaybeObserver<T, U> extends AtomicReference<Subscription> implements FlowableSubscriber<Object> {

        /* renamed from: b */
        public final TimeoutMainMaybeObserver<T, U> f61150b;

        public TimeoutOtherMaybeObserver(TimeoutMainMaybeObserver<T, U> timeoutMainMaybeObserver) {
            this.f61150b = timeoutMainMaybeObserver;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            SubscriptionHelper.m31802f(this, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f61150b.m31627b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            TimeoutMainMaybeObserver<T, U> timeoutMainMaybeObserver = this.f61150b;
            if (DisposableHelper.m31409a(timeoutMainMaybeObserver)) {
                timeoutMainMaybeObserver.f61146b.onError(th);
            } else {
                RxJavaPlugins.m31848b(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            get().cancel();
            this.f61150b.m31627b();
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        maybeObserver.mo31355a(new TimeoutMainMaybeObserver(maybeObserver, null));
        throw null;
    }
}
