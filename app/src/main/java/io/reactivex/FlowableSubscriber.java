package io.reactivex;

import io.reactivex.annotations.NonNull;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public interface FlowableSubscriber<T> extends Subscriber<T> {
    @Override // org.reactivestreams.Subscriber
    /* renamed from: d */
    void mo31352d(@NonNull Subscription subscription);
}
