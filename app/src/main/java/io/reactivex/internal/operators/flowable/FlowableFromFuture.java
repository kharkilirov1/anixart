package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class FlowableFromFuture<T> extends Flowable<T> {
    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(subscriber);
        subscriber.mo31352d(deferredScalarSubscription);
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            if (deferredScalarSubscription.m31790h()) {
                return;
            }
            subscriber.onError(th);
        }
    }
}
