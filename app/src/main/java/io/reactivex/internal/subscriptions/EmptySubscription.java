package io.reactivex.internal.subscriptions;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.QueueSubscription;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public enum EmptySubscription implements QueueSubscription<Object> {
    INSTANCE;

    /* renamed from: a */
    public static void m31791a(Subscriber<?> subscriber) {
        subscriber.mo31352d(INSTANCE);
        subscriber.onComplete();
    }

    /* renamed from: b */
    public static void m31792b(Throwable th, Subscriber<?> subscriber) {
        subscriber.mo31352d(INSTANCE);
        subscriber.onError(th);
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    /* renamed from: F */
    public int mo31420F(int i2) {
        return i2 & 2;
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public Object poll() {
        return null;
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j2) {
        SubscriptionHelper.m31803h(j2);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }
}
