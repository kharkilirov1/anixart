package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableTakeUntil<T, U> extends AbstractFlowableWithUpstream<T, T> {

    public static final class TakeUntilMainSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60709b;

        /* renamed from: c */
        public final AtomicLong f60710c = new AtomicLong();

        /* renamed from: d */
        public final AtomicReference<Subscription> f60711d = new AtomicReference<>();

        /* renamed from: f */
        public final TakeUntilMainSubscriber<T>.OtherSubscriber f60713f = new OtherSubscriber();

        /* renamed from: e */
        public final AtomicThrowable f60712e = new AtomicThrowable();

        public final class OtherSubscriber extends AtomicReference<Subscription> implements FlowableSubscriber<Object> {
            public OtherSubscriber() {
            }

            @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
            /* renamed from: d */
            public void mo31352d(Subscription subscription) {
                SubscriptionHelper.m31802f(this, subscription, Long.MAX_VALUE);
            }

            @Override // org.reactivestreams.Subscriber
            public void onComplete() {
                SubscriptionHelper.m31797a(TakeUntilMainSubscriber.this.f60711d);
                TakeUntilMainSubscriber takeUntilMainSubscriber = TakeUntilMainSubscriber.this;
                HalfSerializer.m31823b(takeUntilMainSubscriber.f60709b, takeUntilMainSubscriber, takeUntilMainSubscriber.f60712e);
            }

            @Override // org.reactivestreams.Subscriber
            public void onError(Throwable th) {
                SubscriptionHelper.m31797a(TakeUntilMainSubscriber.this.f60711d);
                TakeUntilMainSubscriber takeUntilMainSubscriber = TakeUntilMainSubscriber.this;
                HalfSerializer.m31825d(takeUntilMainSubscriber.f60709b, th, takeUntilMainSubscriber, takeUntilMainSubscriber.f60712e);
            }

            @Override // org.reactivestreams.Subscriber
            public void onNext(Object obj) {
                SubscriptionHelper.m31797a(this);
                onComplete();
            }
        }

        public TakeUntilMainSubscriber(Subscriber<? super T> subscriber) {
            this.f60709b = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            SubscriptionHelper.m31797a(this.f60711d);
            SubscriptionHelper.m31797a(this.f60713f);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            SubscriptionHelper.m31799c(this.f60711d, this.f60710c, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            SubscriptionHelper.m31797a(this.f60713f);
            HalfSerializer.m31823b(this.f60709b, this, this.f60712e);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            SubscriptionHelper.m31797a(this.f60713f);
            HalfSerializer.m31825d(this.f60709b, th, this, this.f60712e);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            HalfSerializer.m31827f(this.f60709b, t, this, this.f60712e);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            SubscriptionHelper.m31798b(this.f60711d, this.f60710c, j2);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        subscriber.mo31352d(new TakeUntilMainSubscriber(subscriber));
        throw null;
    }
}
