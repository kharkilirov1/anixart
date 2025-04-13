package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableThrottleFirstTimed<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class DebounceTimedSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription, Runnable {

        /* renamed from: b */
        public final Subscriber<? super T> f60723b;

        /* renamed from: c */
        public final long f60724c;

        /* renamed from: d */
        public final TimeUnit f60725d;

        /* renamed from: e */
        public final Scheduler.Worker f60726e;

        /* renamed from: f */
        public Subscription f60727f;

        /* renamed from: g */
        public final SequentialDisposable f60728g;

        /* renamed from: h */
        public volatile boolean f60729h;

        /* renamed from: i */
        public boolean f60730i;

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f60727f.cancel();
            this.f60726e.mo31379f();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60727f, subscription)) {
                this.f60727f = subscription;
                this.f60723b.mo31352d(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f60730i) {
                return;
            }
            this.f60730i = true;
            this.f60723b.onComplete();
            this.f60726e.mo31379f();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60730i) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f60730i = true;
            this.f60723b.onError(th);
            this.f60726e.mo31379f();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60730i || this.f60729h) {
                return;
            }
            this.f60729h = true;
            if (get() == 0) {
                this.f60730i = true;
                cancel();
                this.f60723b.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
            } else {
                this.f60723b.onNext(t);
                BackpressureHelper.m31812e(this, 1L);
                Disposable disposable = this.f60728g.get();
                if (disposable != null) {
                    disposable.mo31379f();
                }
                DisposableHelper.m31411c(this.f60728g, this.f60726e.mo31383c(this, this.f60724c, this.f60725d));
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this, j2);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f60729h = false;
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        throw null;
    }
}
