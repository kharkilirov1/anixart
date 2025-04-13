package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableTake<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class TakeSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60682b;

        /* renamed from: c */
        public final long f60683c;

        /* renamed from: d */
        public boolean f60684d;

        /* renamed from: e */
        public Subscription f60685e;

        /* renamed from: f */
        public long f60686f;

        public TakeSubscriber(Subscriber<? super T> subscriber, long j2) {
            this.f60682b = subscriber;
            this.f60683c = j2;
            this.f60686f = j2;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f60685e.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60685e, subscription)) {
                this.f60685e = subscription;
                if (this.f60683c != 0) {
                    this.f60682b.mo31352d(this);
                    return;
                }
                subscription.cancel();
                this.f60684d = true;
                EmptySubscription.m31791a(this.f60682b);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f60684d) {
                return;
            }
            this.f60684d = true;
            this.f60682b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60684d) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f60684d = true;
            this.f60685e.cancel();
            this.f60682b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60684d) {
                return;
            }
            long j2 = this.f60686f;
            long j3 = j2 - 1;
            this.f60686f = j3;
            if (j2 > 0) {
                boolean z = j3 == 0;
                this.f60682b.onNext(t);
                if (z) {
                    this.f60685e.cancel();
                    onComplete();
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                if (get() || !compareAndSet(false, true) || j2 < this.f60683c) {
                    this.f60685e.request(j2);
                } else {
                    this.f60685e.request(Long.MAX_VALUE);
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f59782c.m31349b(new TakeSubscriber(subscriber, 0L));
    }
}
