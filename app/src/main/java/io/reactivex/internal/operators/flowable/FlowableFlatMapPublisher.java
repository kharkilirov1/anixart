package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class FlowableFlatMapPublisher<T, U> extends Flowable<U> {
    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super U> subscriber) {
        if (FlowableScalarXMap.m31578a(null, subscriber, null)) {
            return;
        }
        FlowableFlatMap.m31488e(subscriber, null, false, 0, 0);
        throw null;
    }
}
