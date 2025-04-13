package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class StrictSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

    /* renamed from: b */
    public final Subscriber<? super T> f62755b;

    /* renamed from: c */
    public final AtomicThrowable f62756c = new AtomicThrowable();

    /* renamed from: d */
    public final AtomicLong f62757d = new AtomicLong();

    /* renamed from: e */
    public final AtomicReference<Subscription> f62758e = new AtomicReference<>();

    /* renamed from: f */
    public final AtomicBoolean f62759f = new AtomicBoolean();

    /* renamed from: g */
    public volatile boolean f62760g;

    public StrictSubscriber(Subscriber<? super T> subscriber) {
        this.f62755b = subscriber;
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        if (this.f62760g) {
            return;
        }
        SubscriptionHelper.m31797a(this.f62758e);
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    /* renamed from: d */
    public void mo31352d(Subscription subscription) {
        if (this.f62759f.compareAndSet(false, true)) {
            this.f62755b.mo31352d(this);
            SubscriptionHelper.m31799c(this.f62758e, this.f62757d, subscription);
            return;
        }
        subscription.cancel();
        cancel();
        IllegalStateException illegalStateException = new IllegalStateException("§2.12 violated: onSubscribe must be called at most once");
        this.f62760g = true;
        HalfSerializer.m31825d(this.f62755b, illegalStateException, this, this.f62756c);
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        this.f62760g = true;
        HalfSerializer.m31823b(this.f62755b, this, this.f62756c);
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        this.f62760g = true;
        HalfSerializer.m31825d(this.f62755b, th, this, this.f62756c);
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        HalfSerializer.m31827f(this.f62755b, t, this, this.f62756c);
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j2) {
        if (j2 > 0) {
            SubscriptionHelper.m31798b(this.f62758e, this.f62757d, j2);
            return;
        }
        cancel();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(C0000a.m11h("§3.9 violated: positive request amount required but it was ", j2));
        this.f62760g = true;
        HalfSerializer.m31825d(this.f62755b, illegalArgumentException, this, this.f62756c);
    }
}
