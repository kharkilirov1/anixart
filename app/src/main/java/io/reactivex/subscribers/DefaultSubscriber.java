package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.Objects;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public abstract class DefaultSubscriber<T> implements FlowableSubscriber<T> {

    /* renamed from: b */
    public Subscription f62987b;

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    /* renamed from: d */
    public final void mo31352d(Subscription subscription) {
        boolean z;
        Subscription subscription2 = this.f62987b;
        Class<?> cls = getClass();
        Objects.requireNonNull(subscription, "next is null");
        if (subscription2 != null) {
            subscription.cancel();
            if (subscription2 != SubscriptionHelper.CANCELLED) {
                EndConsumerHelper.m31814a(cls);
            }
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f62987b = subscription;
            subscription.request(Long.MAX_VALUE);
        }
    }
}
