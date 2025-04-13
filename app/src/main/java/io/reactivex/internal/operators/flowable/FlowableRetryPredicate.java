package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableRetryPredicate<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class RetrySubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {

        /* renamed from: b */
        public final Subscriber<? super T> f60550b;

        /* renamed from: c */
        public final SubscriptionArbiter f60551c;

        /* renamed from: d */
        public final Publisher<? extends T> f60552d;

        /* renamed from: e */
        public final Predicate<? super Throwable> f60553e = null;

        /* renamed from: f */
        public long f60554f;

        /* renamed from: g */
        public long f60555g;

        public RetrySubscriber(Subscriber<? super T> subscriber, long j2, Predicate<? super Throwable> predicate, SubscriptionArbiter subscriptionArbiter, Publisher<? extends T> publisher) {
            this.f60550b = subscriber;
            this.f60551c = subscriptionArbiter;
            this.f60552d = publisher;
            this.f60554f = j2;
        }

        /* renamed from: a */
        public void m31572a() {
            if (getAndIncrement() == 0) {
                int i2 = 1;
                while (!this.f60551c.f62777h) {
                    long j2 = this.f60555g;
                    if (j2 != 0) {
                        this.f60555g = 0L;
                        this.f60551c.m31795f(j2);
                    }
                    this.f60552d.mo31351g(this);
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
            this.f60551c.m31796g(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60550b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            long j2 = this.f60554f;
            if (j2 != Long.MAX_VALUE) {
                this.f60554f = j2 - 1;
            }
            if (j2 == 0) {
                this.f60550b.onError(th);
                return;
            }
            try {
                if (this.f60553e.mo31407b(th)) {
                    m31572a();
                } else {
                    this.f60550b.onError(th);
                }
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                this.f60550b.onError(new CompositeException(th, th2));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.f60555g++;
            this.f60550b.onNext(t);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        subscriber.mo31352d(subscriptionArbiter);
        new RetrySubscriber(subscriber, 0L, null, subscriptionArbiter, this.f59782c).m31572a();
    }
}
