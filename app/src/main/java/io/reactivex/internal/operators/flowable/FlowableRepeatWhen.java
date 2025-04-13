package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.processors.FlowableProcessor;
import io.reactivex.processors.UnicastProcessor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableRepeatWhen<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class RepeatWhenSubscriber<T> extends WhenSourceSubscriber<T, Object> {
        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            m31559h(0);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f60506l.cancel();
            this.f60504j.onError(th);
        }
    }

    public static final class WhenReceiver<T, U> extends AtomicInteger implements FlowableSubscriber<Object>, Subscription {

        /* renamed from: b */
        public final Publisher<T> f60501b;

        /* renamed from: c */
        public final AtomicReference<Subscription> f60502c;

        /* renamed from: d */
        public final AtomicLong f60503d;

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            SubscriptionHelper.m31797a(this.f60502c);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            SubscriptionHelper.m31799c(this.f60502c, this.f60503d, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (getAndIncrement() == 0) {
                while (this.f60502c.get() != SubscriptionHelper.CANCELLED) {
                    this.f60501b.mo31351g(null);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            SubscriptionHelper.m31798b(this.f60502c, this.f60503d, j2);
        }
    }

    public static abstract class WhenSourceSubscriber<T, U> extends SubscriptionArbiter implements FlowableSubscriber<T> {

        /* renamed from: j */
        public final Subscriber<? super T> f60504j;

        /* renamed from: k */
        public final FlowableProcessor<U> f60505k;

        /* renamed from: l */
        public final Subscription f60506l;

        /* renamed from: m */
        public long f60507m;

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f60506l.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public final void mo31352d(Subscription subscription) {
            m31796g(subscription);
        }

        /* renamed from: h */
        public final void m31559h(U u) {
            m31796g(EmptySubscription.INSTANCE);
            long j2 = this.f60507m;
            if (j2 != 0) {
                this.f60507m = 0L;
                m31795f(j2);
            }
            this.f60506l.request(1L);
            this.f60505k.onNext(u);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.f60507m++;
            this.f60504j.onNext(t);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        UnicastProcessor.m31856i(8).m31853e();
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            subscriber.mo31352d(EmptySubscription.INSTANCE);
            subscriber.onError(th);
        }
    }
}
