package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.CountDownLatch;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public abstract class BlockingBaseSubscriber<T> extends CountDownLatch implements FlowableSubscriber<T> {

    /* renamed from: b */
    public T f62729b;

    /* renamed from: c */
    public Subscription f62730c;

    public BlockingBaseSubscriber() {
        super(1);
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    /* renamed from: d */
    public final void mo31352d(Subscription subscription) {
        if (SubscriptionHelper.m31804i(this.f62730c, subscription)) {
            this.f62730c = subscription;
            subscription.request(Long.MAX_VALUE);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        countDown();
    }
}
