package io.reactivex.internal.subscriptions;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class ArrayCompositeSubscription extends AtomicReferenceArray<Subscription> implements Disposable {
    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
        Subscription andSet;
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (get(0) != subscriptionHelper) {
            int length = length();
            for (int i2 = 0; i2 < length; i2++) {
                if (get(i2) != subscriptionHelper && (andSet = getAndSet(i2, subscriptionHelper)) != subscriptionHelper && andSet != null) {
                    andSet.cancel();
                }
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public boolean mo31380s() {
        return get(0) == SubscriptionHelper.CANCELLED;
    }
}
