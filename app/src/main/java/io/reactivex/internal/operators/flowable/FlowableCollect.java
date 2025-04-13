package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiConsumer;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableCollect<T, U> extends AbstractFlowableWithUpstream<T, U> {

    public static final class CollectSubscriber<T, U> extends DeferredScalarSubscription<U> implements FlowableSubscriber<T> {

        /* renamed from: d */
        public final BiConsumer<? super U, ? super T> f59923d;

        /* renamed from: e */
        public final U f59924e;

        /* renamed from: f */
        public Subscription f59925f;

        /* renamed from: g */
        public boolean f59926g;

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
            super.cancel();
            this.f59925f.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f59925f, subscription)) {
                this.f59925f = subscription;
                this.f62765b.mo31352d(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f59926g) {
                return;
            }
            this.f59926g = true;
            m31789f(this.f59924e);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f59926g) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f59926g = true;
                this.f62765b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f59926g) {
                return;
            }
            try {
                this.f59923d.mo31403a(this.f59924e, t);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f59925f.cancel();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super U> subscriber) {
        try {
            throw null;
        } catch (Throwable th) {
            subscriber.mo31352d(EmptySubscription.INSTANCE);
            subscriber.onError(th);
        }
    }
}
