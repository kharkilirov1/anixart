package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class InnerQueuedSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Subscription {

    /* renamed from: b */
    public final InnerQueuedSubscriberSupport<T> f62737b;

    /* renamed from: c */
    public final int f62738c;

    /* renamed from: d */
    public final int f62739d;

    /* renamed from: e */
    public volatile SimpleQueue<T> f62740e;

    /* renamed from: f */
    public volatile boolean f62741f;

    /* renamed from: g */
    public long f62742g;

    /* renamed from: h */
    public int f62743h;

    public InnerQueuedSubscriber(InnerQueuedSubscriberSupport<T> innerQueuedSubscriberSupport, int i2) {
        this.f62737b = innerQueuedSubscriberSupport;
        this.f62738c = i2;
        this.f62739d = i2 - (i2 >> 2);
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        SubscriptionHelper.m31797a(this);
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    /* renamed from: d */
    public void mo31352d(Subscription subscription) {
        if (SubscriptionHelper.m31801e(this, subscription)) {
            if (subscription instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) subscription;
                int mo31420F = queueSubscription.mo31420F(3);
                if (mo31420F == 1) {
                    this.f62743h = mo31420F;
                    this.f62740e = queueSubscription;
                    this.f62741f = true;
                    this.f62737b.mo31470a(this);
                    return;
                }
                if (mo31420F == 2) {
                    this.f62743h = mo31420F;
                    this.f62740e = queueSubscription;
                    int i2 = this.f62738c;
                    subscription.request(i2 >= 0 ? i2 : Long.MAX_VALUE);
                    return;
                }
            }
            this.f62740e = QueueDrainHelper.m31842b(this.f62738c);
            int i3 = this.f62738c;
            subscription.request(i3 >= 0 ? i3 : Long.MAX_VALUE);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        this.f62737b.mo31470a(this);
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        this.f62737b.mo31473e(this, th);
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        if (this.f62743h == 0) {
            this.f62737b.mo31471b(this, t);
        } else {
            this.f62737b.mo31472c();
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j2) {
        if (this.f62743h != 1) {
            long j3 = this.f62742g + j2;
            if (j3 < this.f62739d) {
                this.f62742g = j3;
            } else {
                this.f62742g = 0L;
                get().request(j3);
            }
        }
    }
}
