package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableRepeatUntil<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class RepeatSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {

        /* renamed from: b */
        public final Subscriber<? super T> f60496b;

        /* renamed from: c */
        public final SubscriptionArbiter f60497c;

        /* renamed from: d */
        public final Publisher<? extends T> f60498d;

        /* renamed from: e */
        public final BooleanSupplier f60499e = null;

        /* renamed from: f */
        public long f60500f;

        public RepeatSubscriber(Subscriber<? super T> subscriber, BooleanSupplier booleanSupplier, SubscriptionArbiter subscriptionArbiter, Publisher<? extends T> publisher) {
            this.f60496b = subscriber;
            this.f60497c = subscriptionArbiter;
            this.f60498d = publisher;
        }

        /* renamed from: a */
        public void m31558a() {
            if (getAndIncrement() == 0) {
                int i2 = 1;
                while (!this.f60497c.f62777h) {
                    long j2 = this.f60500f;
                    if (j2 != 0) {
                        this.f60500f = 0L;
                        this.f60497c.m31795f(j2);
                    }
                    this.f60498d.mo31351g(this);
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
            this.f60497c.m31796g(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            try {
                if (this.f60499e.mo31405a()) {
                    this.f60496b.onComplete();
                } else {
                    m31558a();
                }
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f60496b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f60496b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.f60500f++;
            this.f60496b.onNext(t);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        subscriber.mo31352d(subscriptionArbiter);
        new RepeatSubscriber(subscriber, null, subscriptionArbiter, this.f59782c).m31558a();
    }
}
