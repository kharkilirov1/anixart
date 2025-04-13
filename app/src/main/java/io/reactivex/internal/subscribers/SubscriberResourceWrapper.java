package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class SubscriberResourceWrapper<T> extends AtomicReference<Disposable> implements FlowableSubscriber<T>, Disposable, Subscription {

    /* renamed from: b */
    public final Subscriber<? super T> f62761b;

    /* renamed from: c */
    public final AtomicReference<Subscription> f62762c;

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        mo31379f();
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    /* renamed from: d */
    public void mo31352d(Subscription subscription) {
        if (SubscriptionHelper.m31801e(this.f62762c, subscription)) {
            this.f62761b.mo31352d(this);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
        SubscriptionHelper.m31797a(this.f62762c);
        DisposableHelper.m31409a(this);
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        DisposableHelper.m31409a(this);
        this.f62761b.onComplete();
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        DisposableHelper.m31409a(this);
        this.f62761b.onError(th);
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        this.f62761b.onNext(t);
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j2) {
        if (SubscriptionHelper.m31803h(j2)) {
            this.f62762c.get().request(j2);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public boolean mo31380s() {
        return this.f62762c.get() == SubscriptionHelper.CANCELLED;
    }
}
