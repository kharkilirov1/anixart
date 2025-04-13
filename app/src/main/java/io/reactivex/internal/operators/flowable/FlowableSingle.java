package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableSingle<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class SingleElementSubscriber<T> extends DeferredScalarSubscription<T> implements FlowableSubscriber<T> {

        /* renamed from: d */
        public final T f60610d;

        /* renamed from: e */
        public final boolean f60611e;

        /* renamed from: f */
        public Subscription f60612f;

        /* renamed from: g */
        public boolean f60613g;

        public SingleElementSubscriber(Subscriber<? super T> subscriber, T t, boolean z) {
            super(subscriber);
            this.f60610d = null;
            this.f60611e = z;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
            super.cancel();
            this.f60612f.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60612f, subscription)) {
                this.f60612f = subscription;
                this.f62765b.mo31352d(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f60613g) {
                return;
            }
            this.f60613g = true;
            T t = this.f62766c;
            this.f62766c = null;
            if (t == null) {
                t = this.f60610d;
            }
            if (t != null) {
                m31789f(t);
            } else if (this.f60611e) {
                this.f62765b.onError(new NoSuchElementException());
            } else {
                this.f62765b.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60613g) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f60613g = true;
                this.f62765b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60613g) {
                return;
            }
            if (this.f62766c == null) {
                this.f62766c = t;
                return;
            }
            this.f60613g = true;
            this.f60612f.cancel();
            this.f62765b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f59782c.m31349b(new SingleElementSubscriber(subscriber, null, false));
    }
}
