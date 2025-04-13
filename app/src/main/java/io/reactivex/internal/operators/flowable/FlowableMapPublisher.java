package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableMap;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class FlowableMapPublisher<T, U> extends Flowable<U> {

    /* renamed from: c */
    public final Publisher<T> f60326c;

    /* renamed from: d */
    public final Function<? super T, ? extends U> f60327d;

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super U> subscriber) {
        this.f60326c.mo31351g(new FlowableMap.MapSubscriber(subscriber, this.f60327d));
    }
}
