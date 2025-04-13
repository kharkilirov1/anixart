package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableCount<T> extends AbstractFlowableWithUpstream<T, Long> {

    public static final class CountSubscriber extends DeferredScalarSubscription<Long> implements FlowableSubscriber<Object> {

        /* renamed from: d */
        public Subscription f60001d;

        /* renamed from: e */
        public long f60002e;

        public CountSubscriber(Subscriber<? super Long> subscriber) {
            super(subscriber);
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
            super.cancel();
            this.f60001d.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60001d, subscription)) {
                this.f60001d = subscription;
                this.f62765b.mo31352d(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            m31789f(Long.valueOf(this.f60002e));
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f62765b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            this.f60002e++;
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super Long> subscriber) {
        this.f59782c.m31349b(new CountSubscriber(subscriber));
    }
}
