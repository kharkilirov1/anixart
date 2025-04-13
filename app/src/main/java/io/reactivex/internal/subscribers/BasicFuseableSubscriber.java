package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public abstract class BasicFuseableSubscriber<T, R> implements FlowableSubscriber<T>, QueueSubscription<R> {

    /* renamed from: b */
    public final Subscriber<? super R> f62724b;

    /* renamed from: c */
    public Subscription f62725c;

    /* renamed from: d */
    public QueueSubscription<T> f62726d;

    /* renamed from: e */
    public boolean f62727e;

    /* renamed from: f */
    public int f62728f;

    public BasicFuseableSubscriber(Subscriber<? super R> subscriber) {
        this.f62724b = subscriber;
    }

    /* renamed from: a */
    public final void m31778a(Throwable th) {
        Exceptions.m31402a(th);
        this.f62725c.cancel();
        onError(th);
    }

    /* renamed from: b */
    public final int m31779b(int i2) {
        QueueSubscription<T> queueSubscription = this.f62726d;
        if (queueSubscription == null || (i2 & 4) != 0) {
            return 0;
        }
        int mo31420F = queueSubscription.mo31420F(i2);
        if (mo31420F != 0) {
            this.f62728f = mo31420F;
        }
        return mo31420F;
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        this.f62725c.cancel();
    }

    public void clear() {
        this.f62726d.clear();
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    /* renamed from: d */
    public final void mo31352d(Subscription subscription) {
        if (SubscriptionHelper.m31804i(this.f62725c, subscription)) {
            this.f62725c = subscription;
            if (subscription instanceof QueueSubscription) {
                this.f62726d = (QueueSubscription) subscription;
            }
            this.f62724b.mo31352d(this);
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return this.f62726d.isEmpty();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f62727e) {
            return;
        }
        this.f62727e = true;
        this.f62724b.onComplete();
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        if (this.f62727e) {
            RxJavaPlugins.m31848b(th);
        } else {
            this.f62727e = true;
            this.f62724b.onError(th);
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j2) {
        this.f62725c.request(j2);
    }
}
