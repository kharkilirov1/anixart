package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.ArrayDeque;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableSkipLast<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class SkipLastSubscriber<T> extends ArrayDeque<T> implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60626b;

        /* renamed from: c */
        public final int f60627c;

        /* renamed from: d */
        public Subscription f60628d;

        public SkipLastSubscriber(Subscriber<? super T> subscriber, int i2) {
            super(i2);
            this.f60626b = subscriber;
            this.f60627c = i2;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f60628d.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60628d, subscription)) {
                this.f60628d = subscription;
                this.f60626b.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60626b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f60626b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60627c == size()) {
                this.f60626b.onNext(poll());
            } else {
                this.f60628d.request(1L);
            }
            offer(t);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            this.f60628d.request(j2);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f59782c.m31349b(new SkipLastSubscriber(subscriber, 0));
    }
}
