package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EmptyComponent;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableDetach<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class DetachSubscriber<T> implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public Subscriber<? super T> f60060b;

        /* renamed from: c */
        public Subscription f60061c;

        public DetachSubscriber(Subscriber<? super T> subscriber) {
            this.f60060b = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            Subscription subscription = this.f60061c;
            EmptyComponent emptyComponent = EmptyComponent.INSTANCE;
            this.f60061c = emptyComponent;
            this.f60060b = emptyComponent;
            subscription.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60061c, subscription)) {
                this.f60061c = subscription;
                this.f60060b.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            Subscriber<? super T> subscriber = this.f60060b;
            EmptyComponent emptyComponent = EmptyComponent.INSTANCE;
            this.f60061c = emptyComponent;
            this.f60060b = emptyComponent;
            subscriber.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            Subscriber<? super T> subscriber = this.f60060b;
            EmptyComponent emptyComponent = EmptyComponent.INSTANCE;
            this.f60061c = emptyComponent;
            this.f60060b = emptyComponent;
            subscriber.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.f60060b.onNext(t);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            this.f60061c.request(j2);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f59782c.m31349b(new DetachSubscriber(subscriber));
    }
}
