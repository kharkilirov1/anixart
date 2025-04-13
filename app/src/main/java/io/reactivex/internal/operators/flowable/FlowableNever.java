package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.subscriptions.EmptySubscription;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class FlowableNever extends Flowable<Object> {
    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super Object> subscriber) {
        subscriber.mo31352d(EmptySubscription.INSTANCE);
    }
}
