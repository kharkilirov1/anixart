package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.fuseable.ScalarCallable;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class FlowableJust<T> extends Flowable<T> implements ScalarCallable<T> {

    /* renamed from: c */
    public final T f60309c;

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        subscriber.mo31352d(new ScalarSubscription(subscriber, this.f60309c));
    }

    @Override // java.util.concurrent.Callable
    public T call() {
        return this.f60309c;
    }
}
