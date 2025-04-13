package io.reactivex.disposables;

import io.reactivex.annotations.NonNull;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
final class SubscriptionDisposable extends ReferenceDisposable<Subscription> {
    @Override // io.reactivex.disposables.ReferenceDisposable
    /* renamed from: a */
    public void mo31391a(@NonNull Subscription subscription) {
        subscription.cancel();
    }
}
