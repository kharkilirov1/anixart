package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class FlowableFromPublisher<T> extends Flowable<T> {

    /* renamed from: c */
    public final Publisher<? extends T> f60213c;

    public FlowableFromPublisher(Publisher<? extends T> publisher) {
        this.f60213c = publisher;
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f60213c.mo31351g(subscriber);
    }
}
