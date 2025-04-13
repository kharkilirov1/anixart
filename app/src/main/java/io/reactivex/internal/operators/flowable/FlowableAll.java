package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableAll<T> extends AbstractFlowableWithUpstream<T, Boolean> {

    public static final class AllSubscriber<T> extends DeferredScalarSubscription<Boolean> implements FlowableSubscriber<T> {

        /* renamed from: d */
        public final Predicate<? super T> f59806d;

        /* renamed from: e */
        public Subscription f59807e;

        /* renamed from: f */
        public boolean f59808f;

        public AllSubscriber(Subscriber<? super Boolean> subscriber, Predicate<? super T> predicate) {
            super(subscriber);
            this.f59806d = null;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
            super.cancel();
            this.f59807e.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f59807e, subscription)) {
                this.f59807e = subscription;
                this.f62765b.mo31352d(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f59808f) {
                return;
            }
            this.f59808f = true;
            m31789f(Boolean.TRUE);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f59808f) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f59808f = true;
                this.f62765b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f59808f) {
                return;
            }
            try {
                if (this.f59806d.mo31407b(t)) {
                    return;
                }
                this.f59808f = true;
                this.f59807e.cancel();
                m31789f(Boolean.FALSE);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f59807e.cancel();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super Boolean> subscriber) {
        this.f59782c.m31349b(new AllSubscriber(subscriber, null));
    }
}
