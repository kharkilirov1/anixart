package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableSkip<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class SkipSubscriber<T> implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60623b;

        /* renamed from: c */
        public long f60624c;

        /* renamed from: d */
        public Subscription f60625d;

        public SkipSubscriber(Subscriber<? super T> subscriber, long j2) {
            this.f60623b = subscriber;
            this.f60624c = j2;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f60625d.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60625d, subscription)) {
                long j2 = this.f60624c;
                this.f60625d = subscription;
                this.f60623b.mo31352d(this);
                subscription.request(j2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60623b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f60623b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            long j2 = this.f60624c;
            if (j2 != 0) {
                this.f60624c = j2 - 1;
            } else {
                this.f60623b.onNext(t);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            this.f60625d.request(j2);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f59782c.m31349b(new SkipSubscriber(subscriber, 0L));
    }
}
