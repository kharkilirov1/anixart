package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableOnBackpressureDrop<T> extends AbstractFlowableWithUpstream<T, T> implements Consumer<T> {

    /* renamed from: d */
    public final Consumer<? super T> f60410d;

    public static final class BackpressureDropSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60411b;

        /* renamed from: c */
        public final Consumer<? super T> f60412c;

        /* renamed from: d */
        public Subscription f60413d;

        /* renamed from: e */
        public boolean f60414e;

        public BackpressureDropSubscriber(Subscriber<? super T> subscriber, Consumer<? super T> consumer) {
            this.f60411b = subscriber;
            this.f60412c = consumer;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f60413d.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60413d, subscription)) {
                this.f60413d = subscription;
                this.f60411b.mo31352d(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f60414e) {
                return;
            }
            this.f60414e = true;
            this.f60411b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60414e) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f60414e = true;
                this.f60411b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60414e) {
                return;
            }
            if (get() != 0) {
                this.f60411b.onNext(t);
                BackpressureHelper.m31812e(this, 1L);
                return;
            }
            try {
                this.f60412c.accept(t);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f60413d.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this, j2);
            }
        }
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(T t) {
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f59782c.m31349b(new BackpressureDropSubscriber(subscriber, this.f60410d));
    }
}
