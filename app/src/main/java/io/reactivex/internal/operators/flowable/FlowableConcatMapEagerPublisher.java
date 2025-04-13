package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.operators.flowable.FlowableConcatMapEager;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class FlowableConcatMapEagerPublisher<T, R> extends Flowable<R> {
    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super R> subscriber) {
        new FlowableConcatMapEager.ConcatMapEagerDelayErrorSubscriber(subscriber, null, 0, 0, null);
        throw null;
    }
}
