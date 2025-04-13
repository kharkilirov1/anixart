package io.reactivex.internal.subscriptions;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class AsyncSubscription extends AtomicLong implements Subscription, Disposable {

    /* renamed from: c */
    public final AtomicReference<Disposable> f62764c = new AtomicReference<>();

    /* renamed from: b */
    public final AtomicReference<Subscription> f62763b = new AtomicReference<>();

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        mo31379f();
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
        SubscriptionHelper.m31797a(this.f62763b);
        DisposableHelper.m31409a(this.f62764c);
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j2) {
        SubscriptionHelper.m31798b(this.f62763b, this, j2);
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public boolean mo31380s() {
        return this.f62763b.get() == SubscriptionHelper.CANCELLED;
    }
}
