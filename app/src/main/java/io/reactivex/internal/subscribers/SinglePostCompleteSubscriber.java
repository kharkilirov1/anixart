package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public abstract class SinglePostCompleteSubscriber<T, R> extends AtomicLong implements FlowableSubscriber<T>, Subscription {

    /* renamed from: b */
    public final Subscriber<? super R> f62751b;

    /* renamed from: c */
    public Subscription f62752c;

    /* renamed from: d */
    public R f62753d;

    /* renamed from: e */
    public long f62754e;

    public SinglePostCompleteSubscriber(Subscriber<? super R> subscriber) {
        this.f62751b = subscriber;
    }

    /* renamed from: b */
    public final void m31788b(R r) {
        long j2 = this.f62754e;
        if (j2 != 0) {
            BackpressureHelper.m31812e(this, j2);
        }
        while (true) {
            long j3 = get();
            if ((j3 & Long.MIN_VALUE) != 0) {
                mo31529c(r);
                return;
            }
            if ((j3 & Long.MAX_VALUE) != 0) {
                lazySet(-9223372036854775807L);
                this.f62751b.onNext(r);
                this.f62751b.onComplete();
                return;
            } else {
                this.f62753d = r;
                if (compareAndSet(0L, Long.MIN_VALUE)) {
                    return;
                } else {
                    this.f62753d = null;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo31529c(R r) {
    }

    public void cancel() {
        this.f62752c.cancel();
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    /* renamed from: d */
    public void mo31352d(Subscription subscription) {
        if (SubscriptionHelper.m31804i(this.f62752c, subscription)) {
            this.f62752c = subscription;
            this.f62751b.mo31352d(this);
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j2) {
        long j3;
        if (SubscriptionHelper.m31803h(j2)) {
            do {
                j3 = get();
                if ((j3 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                        this.f62751b.onNext(this.f62753d);
                        this.f62751b.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j3, BackpressureHelper.m31810c(j3, j2)));
            this.f62752c.request(j2);
        }
    }
}
