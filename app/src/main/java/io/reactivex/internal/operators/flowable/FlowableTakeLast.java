package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableTakeLast<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class TakeLastSubscriber<T> extends ArrayDeque<T> implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60687b;

        /* renamed from: c */
        public final int f60688c;

        /* renamed from: d */
        public Subscription f60689d;

        /* renamed from: e */
        public volatile boolean f60690e;

        /* renamed from: f */
        public volatile boolean f60691f;

        /* renamed from: g */
        public final AtomicLong f60692g = new AtomicLong();

        /* renamed from: h */
        public final AtomicInteger f60693h = new AtomicInteger();

        public TakeLastSubscriber(Subscriber<? super T> subscriber, int i2) {
            this.f60687b = subscriber;
            this.f60688c = i2;
        }

        /* renamed from: b */
        public void m31590b() {
            if (this.f60693h.getAndIncrement() == 0) {
                Subscriber<? super T> subscriber = this.f60687b;
                long j2 = this.f60692g.get();
                while (!this.f60691f) {
                    if (this.f60690e) {
                        long j3 = 0;
                        while (j3 != j2) {
                            if (this.f60691f) {
                                return;
                            }
                            T poll = poll();
                            if (poll == null) {
                                subscriber.onComplete();
                                return;
                            } else {
                                subscriber.onNext(poll);
                                j3++;
                            }
                        }
                        if (j3 != 0 && j2 != Long.MAX_VALUE) {
                            j2 = this.f60692g.addAndGet(-j3);
                        }
                    }
                    if (this.f60693h.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f60691f = true;
            this.f60689d.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60689d, subscription)) {
                this.f60689d = subscription;
                this.f60687b.mo31352d(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60690e = true;
            m31590b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f60687b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60688c == size()) {
                poll();
            }
            offer(t);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this.f60692g, j2);
                m31590b();
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f59782c.m31349b(new TakeLastSubscriber(subscriber, 0));
    }
}
