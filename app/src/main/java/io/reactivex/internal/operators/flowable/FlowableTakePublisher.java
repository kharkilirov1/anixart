package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.operators.flowable.FlowableTake;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class FlowableTakePublisher<T> extends Flowable<T> {

    /* renamed from: c */
    public final Publisher<T> f60707c;

    /* renamed from: d */
    public final long f60708d;

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f60707c.mo31351g(new FlowableTake.TakeSubscriber(subscriber, this.f60708d));
    }
}
