package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableSubscribeOn<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class SubscribeOnSubscriber<T> extends AtomicReference<Thread> implements FlowableSubscriber<T>, Subscription, Runnable {

        /* renamed from: b */
        public final Subscriber<? super T> f60651b;

        /* renamed from: c */
        public final Scheduler.Worker f60652c;

        /* renamed from: d */
        public final AtomicReference<Subscription> f60653d;

        /* renamed from: e */
        public final AtomicLong f60654e;

        /* renamed from: f */
        public final boolean f60655f;

        /* renamed from: g */
        public Publisher<T> f60656g;

        public static final class Request implements Runnable {

            /* renamed from: b */
            public final Subscription f60657b;

            /* renamed from: c */
            public final long f60658c;

            public Request(Subscription subscription, long j2) {
                this.f60657b = subscription;
                this.f60658c = j2;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f60657b.request(this.f60658c);
            }
        }

        /* renamed from: a */
        public void m31587a(long j2, Subscription subscription) {
            if (this.f60655f || Thread.currentThread() == get()) {
                subscription.request(j2);
            } else {
                this.f60652c.mo31382b(new Request(subscription, j2));
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            SubscriptionHelper.m31797a(this.f60653d);
            this.f60652c.mo31379f();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31801e(this.f60653d, subscription)) {
                long andSet = this.f60654e.getAndSet(0L);
                if (andSet != 0) {
                    m31587a(andSet, subscription);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60651b.onComplete();
            this.f60652c.mo31379f();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f60651b.onError(th);
            this.f60652c.mo31379f();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.f60651b.onNext(t);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                Subscription subscription = this.f60653d.get();
                if (subscription != null) {
                    m31587a(j2, subscription);
                    return;
                }
                BackpressureHelper.m31808a(this.f60654e, j2);
                Subscription subscription2 = this.f60653d.get();
                if (subscription2 != null) {
                    long andSet = this.f60654e.getAndSet(0L);
                    if (andSet != 0) {
                        m31587a(andSet, subscription2);
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            lazySet(Thread.currentThread());
            Publisher<T> publisher = this.f60656g;
            this.f60656g = null;
            publisher.mo31351g(this);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        throw null;
    }
}
