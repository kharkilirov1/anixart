package io.reactivex.internal.subscribers;

/* loaded from: classes3.dex */
public final class BlockingLastSubscriber<T> extends BlockingBaseSubscriber<T> {
    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        this.f62729b = null;
        countDown();
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        this.f62729b = t;
    }
}
