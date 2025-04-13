package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableDelaySubscriptionOther<T, U> extends Flowable<T> {

    public static final class MainSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60051b;

        /* renamed from: c */
        public final Publisher<? extends T> f60052c = null;

        /* renamed from: d */
        public final MainSubscriber<T>.OtherSubscriber f60053d = new OtherSubscriber();

        /* renamed from: e */
        public final AtomicReference<Subscription> f60054e = new AtomicReference<>();

        public final class OtherSubscriber extends AtomicReference<Subscription> implements FlowableSubscriber<Object> {
            public OtherSubscriber() {
            }

            @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
            /* renamed from: d */
            public void mo31352d(Subscription subscription) {
                if (SubscriptionHelper.m31801e(this, subscription)) {
                    subscription.request(Long.MAX_VALUE);
                }
            }

            @Override // org.reactivestreams.Subscriber
            public void onComplete() {
                if (get() != SubscriptionHelper.CANCELLED) {
                    MainSubscriber mainSubscriber = MainSubscriber.this;
                    mainSubscriber.f60052c.mo31351g(mainSubscriber);
                }
            }

            @Override // org.reactivestreams.Subscriber
            public void onError(Throwable th) {
                if (get() != SubscriptionHelper.CANCELLED) {
                    MainSubscriber.this.f60051b.onError(th);
                } else {
                    RxJavaPlugins.m31848b(th);
                }
            }

            @Override // org.reactivestreams.Subscriber
            public void onNext(Object obj) {
                Subscription subscription = get();
                SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
                if (subscription != subscriptionHelper) {
                    lazySet(subscriptionHelper);
                    subscription.cancel();
                    MainSubscriber mainSubscriber = MainSubscriber.this;
                    mainSubscriber.f60052c.mo31351g(mainSubscriber);
                }
            }
        }

        public MainSubscriber(Subscriber<? super T> subscriber, Publisher<? extends T> publisher) {
            this.f60051b = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            SubscriptionHelper.m31797a(this.f60053d);
            SubscriptionHelper.m31797a(this.f60054e);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            SubscriptionHelper.m31799c(this.f60054e, this, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60051b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f60051b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.f60051b.onNext(t);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                SubscriptionHelper.m31798b(this.f60054e, this, j2);
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        subscriber.mo31352d(new MainSubscriber(subscriber, null));
        throw null;
    }
}
