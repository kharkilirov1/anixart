package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableReduce<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class ReduceSubscriber<T> extends DeferredScalarSubscription<T> implements FlowableSubscriber<T> {

        /* renamed from: d */
        public final BiFunction<T, T, T> f60472d;

        /* renamed from: e */
        public Subscription f60473e;

        public ReduceSubscriber(Subscriber<? super T> subscriber, BiFunction<T, T, T> biFunction) {
            super(subscriber);
            this.f60472d = null;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
            super.cancel();
            this.f60473e.cancel();
            this.f60473e = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60473e, subscription)) {
                this.f60473e = subscription;
                this.f62765b.mo31352d(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            Subscription subscription = this.f60473e;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription == subscriptionHelper) {
                return;
            }
            this.f60473e = subscriptionHelper;
            T t = this.f62766c;
            if (t != null) {
                m31789f(t);
            } else {
                this.f62765b.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            Subscription subscription = this.f60473e;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription == subscriptionHelper) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f60473e = subscriptionHelper;
                this.f62765b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60473e == SubscriptionHelper.CANCELLED) {
                return;
            }
            T t2 = this.f62766c;
            if (t2 == null) {
                this.f62766c = t;
                return;
            }
            try {
                T apply = this.f60472d.apply(t2, t);
                Objects.requireNonNull(apply, "The reducer returned a null value");
                this.f62766c = apply;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f60473e.cancel();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f59782c.m31349b(new ReduceSubscriber(subscriber, null));
    }
}
