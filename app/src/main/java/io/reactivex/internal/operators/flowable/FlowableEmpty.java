package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.fuseable.ScalarCallable;
import io.reactivex.internal.subscriptions.EmptySubscription;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class FlowableEmpty extends Flowable<Object> implements ScalarCallable<Object> {
    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super Object> subscriber) {
        subscriber.mo31352d(EmptySubscription.INSTANCE);
        subscriber.onComplete();
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return null;
    }
}
