package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public abstract class DisposableSubscriber<T> implements FlowableSubscriber<T>, Disposable {

    /* renamed from: b */
    public final AtomicReference<Subscription> f62988b = new AtomicReference<>();

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    /* renamed from: d */
    public final void mo31352d(Subscription subscription) {
        if (EndConsumerHelper.m31816c(this.f62988b, subscription, getClass())) {
            this.f62988b.get().request(Long.MAX_VALUE);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public final void mo31379f() {
        SubscriptionHelper.m31797a(this.f62988b);
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public final boolean mo31380s() {
        return this.f62988b.get() == SubscriptionHelper.CANCELLED;
    }
}
