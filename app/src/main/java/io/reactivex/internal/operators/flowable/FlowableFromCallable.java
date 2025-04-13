package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class FlowableFromCallable<T> extends Flowable<T> implements Callable<T> {
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
                RxJavaPlugins.m31848b(th);
            } else {
                subscriber.onError(th);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        throw null;
    }
}
