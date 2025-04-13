package io.reactivex.internal.operators.flowable;

import io.reactivex.subscribers.SerializedSubscriber;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class FlowableSerialized<T> extends AbstractFlowableWithUpstream<T, T> {
    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f59782c.m31349b(new SerializedSubscriber(subscriber));
    }
}
