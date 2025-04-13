package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableRepeat<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class RepeatSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {

        /* renamed from: b */
        public final Subscriber<? super T> f60491b;

        /* renamed from: c */
        public final SubscriptionArbiter f60492c;

        /* renamed from: d */
        public final Publisher<? extends T> f60493d;

        /* renamed from: e */
        public long f60494e;

        /* renamed from: f */
        public long f60495f;

        public RepeatSubscriber(Subscriber<? super T> subscriber, long j2, SubscriptionArbiter subscriptionArbiter, Publisher<? extends T> publisher) {
            this.f60491b = subscriber;
            this.f60492c = subscriptionArbiter;
            this.f60493d = publisher;
            this.f60494e = j2;
        }

        /* renamed from: a */
        public void m31557a() {
            if (getAndIncrement() == 0) {
                int i2 = 1;
                while (!this.f60492c.f62777h) {
                    long j2 = this.f60495f;
                    if (j2 != 0) {
                        this.f60495f = 0L;
                        this.f60492c.m31795f(j2);
                    }
                    this.f60493d.mo31351g(this);
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            this.f60492c.m31796g(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            long j2 = this.f60494e;
            if (j2 != Long.MAX_VALUE) {
                this.f60494e = j2 - 1;
            }
            if (j2 != 0) {
                m31557a();
            } else {
                this.f60491b.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f60491b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.f60495f++;
            this.f60491b.onNext(t);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        subscriber.mo31352d(subscriptionArbiter);
        new RepeatSubscriber(subscriber, -1L, subscriptionArbiter, this.f59782c).m31557a();
    }
}
