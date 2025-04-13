package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableSkipUntil<T, U> extends AbstractFlowableWithUpstream<T, T> {

    public static final class SkipUntilMainSubscriber<T> extends AtomicInteger implements ConditionalSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60640b;

        /* renamed from: c */
        public final AtomicReference<Subscription> f60641c = new AtomicReference<>();

        /* renamed from: d */
        public final AtomicLong f60642d = new AtomicLong();

        /* renamed from: e */
        public final SkipUntilMainSubscriber<T>.OtherSubscriber f60643e = new OtherSubscriber();

        /* renamed from: f */
        public final AtomicThrowable f60644f = new AtomicThrowable();

        /* renamed from: g */
        public volatile boolean f60645g;

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
                SkipUntilMainSubscriber.this.f60645g = true;
            }

            @Override // org.reactivestreams.Subscriber
            public void onError(Throwable th) {
                SubscriptionHelper.m31797a(SkipUntilMainSubscriber.this.f60641c);
                SkipUntilMainSubscriber skipUntilMainSubscriber = SkipUntilMainSubscriber.this;
                HalfSerializer.m31825d(skipUntilMainSubscriber.f60640b, th, skipUntilMainSubscriber, skipUntilMainSubscriber.f60644f);
            }

            @Override // org.reactivestreams.Subscriber
            public void onNext(Object obj) {
                SkipUntilMainSubscriber.this.f60645g = true;
                get().cancel();
            }
        }

        public SkipUntilMainSubscriber(Subscriber<? super T> subscriber) {
            this.f60640b = subscriber;
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* renamed from: E */
        public boolean mo31428E(T t) {
            if (!this.f60645g) {
                return false;
            }
            HalfSerializer.m31827f(this.f60640b, t, this, this.f60644f);
            return true;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            SubscriptionHelper.m31797a(this.f60641c);
            SubscriptionHelper.m31797a(this.f60643e);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            SubscriptionHelper.m31799c(this.f60641c, this.f60642d, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            SubscriptionHelper.m31797a(this.f60643e);
            HalfSerializer.m31823b(this.f60640b, this, this.f60644f);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            SubscriptionHelper.m31797a(this.f60643e);
            HalfSerializer.m31825d(this.f60640b, th, this, this.f60644f);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (mo31428E(t)) {
                return;
            }
            this.f60641c.get().request(1L);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            SubscriptionHelper.m31798b(this.f60641c, this.f60642d, j2);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        subscriber.mo31352d(new SkipUntilMainSubscriber(subscriber));
        throw null;
    }
}
