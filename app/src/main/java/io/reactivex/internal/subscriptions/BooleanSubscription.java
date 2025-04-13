package io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.Subscription;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class BooleanSubscription extends AtomicBoolean implements Subscription {
    @Override // org.reactivestreams.Subscription
    public void cancel() {
        lazySet(true);
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j2) {
        SubscriptionHelper.m31803h(j2);
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        StringBuilder m24u = C0000a.m24u("BooleanSubscription(cancelled=");
        m24u.append(get());
        m24u.append(")");
        return m24u.toString();
    }
}
