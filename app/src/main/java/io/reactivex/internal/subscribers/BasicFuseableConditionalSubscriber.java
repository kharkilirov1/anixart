package io.reactivex.internal.subscribers;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public abstract class BasicFuseableConditionalSubscriber<T, R> implements ConditionalSubscriber<T>, QueueSubscription<R> {

    /* renamed from: b */
    public final ConditionalSubscriber<? super R> f62719b;

    /* renamed from: c */
    public Subscription f62720c;

    /* renamed from: d */
    public QueueSubscription<T> f62721d;

    /* renamed from: e */
    public boolean f62722e;

    /* renamed from: f */
    public int f62723f;

    public BasicFuseableConditionalSubscriber(ConditionalSubscriber<? super R> conditionalSubscriber) {
        this.f62719b = conditionalSubscriber;
    }

    /* renamed from: a */
    public final void m31776a(Throwable th) {
        Exceptions.m31402a(th);
        this.f62720c.cancel();
        onError(th);
    }

    /* renamed from: b */
    public final int m31777b(int i2) {
        QueueSubscription<T> queueSubscription = this.f62721d;
        if (queueSubscription == null || (i2 & 4) != 0) {
            return 0;
        }
        int mo31420F = queueSubscription.mo31420F(i2);
        if (mo31420F != 0) {
            this.f62723f = mo31420F;
        }
        return mo31420F;
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        this.f62720c.cancel();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        this.f62721d.clear();
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    /* renamed from: d */
    public final void mo31352d(Subscription subscription) {
        if (SubscriptionHelper.m31804i(this.f62720c, subscription)) {
            this.f62720c = subscription;
            if (subscription instanceof QueueSubscription) {
                this.f62721d = (QueueSubscription) subscription;
            }
            this.f62719b.mo31352d(this);
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return this.f62721d.isEmpty();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f62722e) {
            return;
        }
        this.f62722e = true;
        this.f62719b.onComplete();
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        if (this.f62722e) {
            RxJavaPlugins.m31848b(th);
        } else {
            this.f62722e = true;
            this.f62719b.onError(th);
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j2) {
        this.f62720c.request(j2);
    }
}
