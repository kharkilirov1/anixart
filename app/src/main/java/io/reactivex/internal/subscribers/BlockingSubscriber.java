package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class BlockingSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Subscription {

    /* renamed from: b */
    public static final Object f62731b = new Object();

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        if (SubscriptionHelper.m31797a(this)) {
            throw null;
        }
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    /* renamed from: d */
    public void mo31352d(Subscription subscription) {
        if (SubscriptionHelper.m31801e(this, subscription)) {
            throw null;
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        throw null;
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j2) {
        get().request(j2);
    }
}
