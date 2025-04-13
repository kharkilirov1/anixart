package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableRetryBiPredicate<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class RetryBiSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {

        /* renamed from: b */
        public final Subscriber<? super T> f60544b;

        /* renamed from: c */
        public final SubscriptionArbiter f60545c;

        /* renamed from: d */
        public final Publisher<? extends T> f60546d;

        /* renamed from: e */
        public final BiPredicate<? super Integer, ? super Throwable> f60547e = null;

        /* renamed from: f */
        public int f60548f;

        /* renamed from: g */
        public long f60549g;

        public RetryBiSubscriber(Subscriber<? super T> subscriber, BiPredicate<? super Integer, ? super Throwable> biPredicate, SubscriptionArbiter subscriptionArbiter, Publisher<? extends T> publisher) {
            this.f60544b = subscriber;
            this.f60545c = subscriptionArbiter;
            this.f60546d = publisher;
        }

        /* renamed from: a */
        public void m31571a() {
            if (getAndIncrement() == 0) {
                int i2 = 1;
                while (!this.f60545c.f62777h) {
                    long j2 = this.f60549g;
                    if (j2 != 0) {
                        this.f60549g = 0L;
                        this.f60545c.m31795f(j2);
                    }
                    this.f60546d.mo31351g(this);
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
            this.f60545c.m31796g(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60544b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            try {
                BiPredicate<? super Integer, ? super Throwable> biPredicate = this.f60547e;
                int i2 = this.f60548f + 1;
                this.f60548f = i2;
                if (biPredicate.mo31404a(Integer.valueOf(i2), th)) {
                    m31571a();
                } else {
                    this.f60544b.onError(th);
                }
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                this.f60544b.onError(new CompositeException(th, th2));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.f60549g++;
            this.f60544b.onNext(t);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        subscriber.mo31352d(subscriptionArbiter);
        new RetryBiSubscriber(subscriber, null, subscriptionArbiter, this.f59782c).m31571a();
    }
}
