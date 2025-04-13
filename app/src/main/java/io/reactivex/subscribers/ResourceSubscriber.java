package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.ListCompositeDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public abstract class ResourceSubscriber<T> implements FlowableSubscriber<T>, Disposable {

    /* renamed from: b */
    public final AtomicReference<Subscription> f62989b = new AtomicReference<>();

    /* renamed from: c */
    public final ListCompositeDisposable f62990c = new ListCompositeDisposable();

    /* renamed from: d */
    public final AtomicLong f62991d = new AtomicLong();

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    /* renamed from: d */
    public final void mo31352d(Subscription subscription) {
        if (EndConsumerHelper.m31816c(this.f62989b, subscription, getClass())) {
            long andSet = this.f62991d.getAndSet(0L);
            if (andSet != 0) {
                subscription.request(andSet);
            }
            SubscriptionHelper.m31798b(this.f62989b, this.f62991d, Long.MAX_VALUE);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public final void mo31379f() {
        if (SubscriptionHelper.m31797a(this.f62989b)) {
            this.f62990c.mo31379f();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public final boolean mo31380s() {
        return this.f62989b.get() == SubscriptionHelper.CANCELLED;
    }
}
