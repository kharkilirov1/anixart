package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.schedulers.Timed;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableTimeInterval<T> extends AbstractFlowableWithUpstream<T, Timed<T>> {

    public static final class TimeIntervalSubscriber<T> implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super Timed<T>> f60745b;

        /* renamed from: e */
        public Subscription f60748e;

        /* renamed from: f */
        public long f60749f;

        /* renamed from: d */
        public final Scheduler f60747d = null;

        /* renamed from: c */
        public final TimeUnit f60746c = null;

        public TimeIntervalSubscriber(Subscriber<? super Timed<T>> subscriber, TimeUnit timeUnit, Scheduler scheduler) {
            this.f60745b = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f60748e.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60748e, subscription)) {
                this.f60749f = this.f60747d.mo31375b(this.f60746c);
                this.f60748e = subscription;
                this.f60745b.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60745b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f60745b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            long mo31375b = this.f60747d.mo31375b(this.f60746c);
            long j2 = this.f60749f;
            this.f60749f = mo31375b;
            this.f60745b.onNext(new Timed(t, mo31375b - j2, this.f60746c));
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            this.f60748e.request(j2);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super Timed<T>> subscriber) {
        this.f59782c.m31349b(new TimeIntervalSubscriber(subscriber, null, null));
    }
}
