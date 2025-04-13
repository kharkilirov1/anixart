package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableSwitchIfEmpty<T> extends AbstractFlowableWithUpstream<T, T> {

    /* renamed from: d */
    public final Publisher<? extends T> f60659d;

    public static final class SwitchIfEmptySubscriber<T> implements FlowableSubscriber<T> {

        /* renamed from: b */
        public final Subscriber<? super T> f60660b;

        /* renamed from: c */
        public final Publisher<? extends T> f60661c;

        /* renamed from: e */
        public boolean f60663e = true;

        /* renamed from: d */
        public final SubscriptionArbiter f60662d = new SubscriptionArbiter(false);

        public SwitchIfEmptySubscriber(Subscriber<? super T> subscriber, Publisher<? extends T> publisher) {
            this.f60660b = subscriber;
            this.f60661c = publisher;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            this.f60662d.m31796g(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (!this.f60663e) {
                this.f60660b.onComplete();
            } else {
                this.f60663e = false;
                this.f60661c.mo31351g(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f60660b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60663e) {
                this.f60663e = false;
            }
            this.f60660b.onNext(t);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        SwitchIfEmptySubscriber switchIfEmptySubscriber = new SwitchIfEmptySubscriber(subscriber, this.f60659d);
        subscriber.mo31352d(switchIfEmptySubscriber.f60662d);
        this.f59782c.m31349b(switchIfEmptySubscriber);
    }
}
