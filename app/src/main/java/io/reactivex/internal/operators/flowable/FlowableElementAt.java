package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableElementAt<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class ElementAtSubscriber<T> extends DeferredScalarSubscription<T> implements FlowableSubscriber<T> {

        /* renamed from: d */
        public final long f60097d;

        /* renamed from: e */
        public final T f60098e;

        /* renamed from: f */
        public final boolean f60099f;

        /* renamed from: g */
        public Subscription f60100g;

        /* renamed from: h */
        public long f60101h;

        /* renamed from: i */
        public boolean f60102i;

        public ElementAtSubscriber(Subscriber<? super T> subscriber, long j2, T t, boolean z) {
            super(subscriber);
            this.f60097d = j2;
            this.f60098e = null;
            this.f60099f = z;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
            super.cancel();
            this.f60100g.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60100g, subscription)) {
                this.f60100g = subscription;
                this.f62765b.mo31352d(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f60102i) {
                return;
            }
            this.f60102i = true;
            T t = this.f60098e;
            if (t != null) {
                m31789f(t);
            } else if (this.f60099f) {
                this.f62765b.onError(new NoSuchElementException());
            } else {
                this.f62765b.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60102i) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f60102i = true;
                this.f62765b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60102i) {
                return;
            }
            long j2 = this.f60101h;
            if (j2 != this.f60097d) {
                this.f60101h = j2 + 1;
                return;
            }
            this.f60102i = true;
            this.f60100g.cancel();
            m31789f(t);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f59782c.m31349b(new ElementAtSubscriber(subscriber, 0L, null, false));
    }
}
