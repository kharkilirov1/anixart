package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableUnsubscribeOn<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class UnsubscribeSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60790b;

        /* renamed from: c */
        public final Scheduler f60791c = null;

        /* renamed from: d */
        public Subscription f60792d;

        public final class Cancellation implements Runnable {
            public Cancellation() {
            }

            @Override // java.lang.Runnable
            public void run() {
                UnsubscribeSubscriber.this.f60792d.cancel();
            }
        }

        public UnsubscribeSubscriber(Subscriber<? super T> subscriber, Scheduler scheduler) {
            this.f60790b = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (compareAndSet(false, true)) {
                this.f60791c.mo31376c(new Cancellation());
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60792d, subscription)) {
                this.f60792d = subscription;
                this.f60790b.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (get()) {
                return;
            }
            this.f60790b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (get()) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f60790b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (get()) {
                return;
            }
            this.f60790b.onNext(t);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            this.f60792d.request(j2);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f59782c.m31349b(new UnsubscribeSubscriber(subscriber, null));
    }
}
