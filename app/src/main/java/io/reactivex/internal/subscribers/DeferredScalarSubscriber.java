package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public abstract class DeferredScalarSubscriber<T, R> extends DeferredScalarSubscription<R> implements FlowableSubscriber<T> {

    /* renamed from: d */
    public Subscription f62732d;

    @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
    public void cancel() {
        super.cancel();
        this.f62732d.cancel();
    }

    /* renamed from: d */
    public void mo31352d(Subscription subscription) {
        if (SubscriptionHelper.m31804i(this.f62732d, subscription)) {
            this.f62732d = subscription;
            this.f62765b.mo31352d(this);
            subscription.request(Long.MAX_VALUE);
        }
    }

    public void onComplete() {
        this.f62765b.onComplete();
    }

    public void onError(Throwable th) {
        this.f62766c = null;
        this.f62765b.onError(th);
    }
}
