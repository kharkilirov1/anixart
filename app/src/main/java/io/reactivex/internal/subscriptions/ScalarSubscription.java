package io.reactivex.internal.subscriptions;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.QueueSubscription;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class ScalarSubscription<T> extends AtomicInteger implements QueueSubscription<T> {

    /* renamed from: b */
    public final T f62769b;

    /* renamed from: c */
    public final Subscriber<? super T> f62770c;

    public ScalarSubscription(Subscriber<? super T> subscriber, T t) {
        this.f62770c = subscriber;
        this.f62769b = t;
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    /* renamed from: F */
    public int mo31420F(int i2) {
        return i2 & 1;
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        lazySet(2);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        lazySet(1);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return get() != 0;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f62769b;
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j2) {
        if (SubscriptionHelper.m31803h(j2) && compareAndSet(0, 1)) {
            Subscriber<? super T> subscriber = this.f62770c;
            subscriber.onNext(this.f62769b);
            if (get() != 2) {
                subscriber.onComplete();
            }
        }
    }
}
