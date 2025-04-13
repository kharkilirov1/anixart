package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class FlowableConcatMapPublisher<T, R> extends Flowable<R> {
    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super R> subscriber) {
        if (FlowableScalarXMap.m31578a(null, subscriber, null)) {
            return;
        }
        FlowableConcatMap.m31464e(subscriber, null, 0, null);
        throw null;
    }
}
