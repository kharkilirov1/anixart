package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableHide<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class HideSubscriber<T> implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60275b;

        /* renamed from: c */
        public Subscription f60276c;

        public HideSubscriber(Subscriber<? super T> subscriber) {
            this.f60275b = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f60276c.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60276c, subscription)) {
                this.f60276c = subscription;
                this.f60275b.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60275b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f60275b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.f60275b.onNext(t);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            this.f60276c.request(j2);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f59782c.m31349b(new HideSubscriber(subscriber));
    }
}
