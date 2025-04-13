package io.reactivex.internal.subscribers;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes3.dex */
public final class BlockingFirstSubscriber<T> extends BlockingBaseSubscriber<T> {
    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        if (this.f62729b != null) {
            RxJavaPlugins.m31848b(th);
        }
        countDown();
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        if (this.f62729b == null) {
            this.f62729b = t;
            this.f62730c.cancel();
            countDown();
        }
    }
}
