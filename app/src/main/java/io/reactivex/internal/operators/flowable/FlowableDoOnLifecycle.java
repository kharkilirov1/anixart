package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.LongConsumer;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableDoOnLifecycle<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class SubscriptionLambdaSubscriber<T> implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60092b;

        /* renamed from: f */
        public Subscription f60096f;

        /* renamed from: c */
        public final Consumer<? super Subscription> f60093c = null;

        /* renamed from: e */
        public final Action f60095e = null;

        /* renamed from: d */
        public final LongConsumer f60094d = null;

        public SubscriptionLambdaSubscriber(Subscriber<? super T> subscriber, Consumer<? super Subscription> consumer, LongConsumer longConsumer, Action action) {
            this.f60092b = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            Subscription subscription = this.f60096f;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription != subscriptionHelper) {
                this.f60096f = subscriptionHelper;
                try {
                    this.f60095e.run();
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    RxJavaPlugins.m31848b(th);
                }
                subscription.cancel();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            try {
                this.f60093c.accept(subscription);
                if (SubscriptionHelper.m31804i(this.f60096f, subscription)) {
                    this.f60096f = subscription;
                    this.f60092b.mo31352d(this);
                }
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                subscription.cancel();
                this.f60096f = SubscriptionHelper.CANCELLED;
                EmptySubscription.m31792b(th, this.f60092b);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f60096f != SubscriptionHelper.CANCELLED) {
                this.f60092b.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60096f != SubscriptionHelper.CANCELLED) {
                this.f60092b.onError(th);
            } else {
                RxJavaPlugins.m31848b(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.f60092b.onNext(t);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            try {
                this.f60094d.mo31406a(j2);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                RxJavaPlugins.m31848b(th);
            }
            this.f60096f.request(j2);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f59782c.m31349b(new SubscriptionLambdaSubscriber(subscriber, null, null, null));
    }
}
