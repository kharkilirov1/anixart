package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.QueueDrain;
import io.reactivex.internal.util.QueueDrainHelper;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public abstract class QueueDrainSubscriber<T, U, V> extends QueueDrainSubscriberPad4 implements FlowableSubscriber<T>, QueueDrain<U, V> {

    /* renamed from: d */
    public final Subscriber<? super V> f62744d;

    /* renamed from: e */
    public final SimplePlainQueue<U> f62745e;

    /* renamed from: f */
    public volatile boolean f62746f;

    /* renamed from: g */
    public volatile boolean f62747g;

    /* renamed from: h */
    public Throwable f62748h;

    public QueueDrainSubscriber(Subscriber<? super V> subscriber, SimplePlainQueue<U> simplePlainQueue) {
        this.f62744d = subscriber;
        this.f62745e = simplePlainQueue;
    }

    /* renamed from: a */
    public boolean mo31456a(Subscriber<? super V> subscriber, U u) {
        return false;
    }

    /* renamed from: b */
    public final boolean m31780b() {
        return this.f62750b.getAndIncrement() == 0;
    }

    /* renamed from: c */
    public final boolean m31781c() {
        return this.f62750b.get() == 0 && this.f62750b.compareAndSet(0, 1);
    }

    /* renamed from: e */
    public final void m31782e(U u, boolean z, Disposable disposable) {
        Subscriber<? super V> subscriber = this.f62744d;
        SimplePlainQueue<U> simplePlainQueue = this.f62745e;
        if (m31781c()) {
            long j2 = this.f62749c.get();
            if (j2 == 0) {
                disposable.mo31379f();
                subscriber.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            } else {
                if (mo31456a(subscriber, u) && j2 != Long.MAX_VALUE) {
                    m31785i(1L);
                }
                if (m31784h(-1) == 0) {
                    return;
                }
            }
        } else {
            simplePlainQueue.offer(u);
            if (!m31780b()) {
                return;
            }
        }
        QueueDrainHelper.m31844d(simplePlainQueue, subscriber, z, disposable, this);
    }

    /* renamed from: g */
    public final void m31783g(U u, boolean z, Disposable disposable) {
        Subscriber<? super V> subscriber = this.f62744d;
        SimplePlainQueue<U> simplePlainQueue = this.f62745e;
        if (m31781c()) {
            long j2 = this.f62749c.get();
            if (j2 == 0) {
                this.f62746f = true;
                disposable.mo31379f();
                subscriber.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            } else if (simplePlainQueue.isEmpty()) {
                if (mo31456a(subscriber, u) && j2 != Long.MAX_VALUE) {
                    m31785i(1L);
                }
                if (m31784h(-1) == 0) {
                    return;
                }
            } else {
                simplePlainQueue.offer(u);
            }
        } else {
            simplePlainQueue.offer(u);
            if (!m31780b()) {
                return;
            }
        }
        QueueDrainHelper.m31844d(simplePlainQueue, subscriber, z, disposable, this);
    }

    /* renamed from: h */
    public final int m31784h(int i2) {
        return this.f62750b.addAndGet(i2);
    }

    /* renamed from: i */
    public final long m31785i(long j2) {
        return this.f62749c.addAndGet(-j2);
    }

    /* renamed from: j */
    public final long m31786j() {
        return this.f62749c.get();
    }

    /* renamed from: k */
    public final void m31787k(long j2) {
        if (SubscriptionHelper.m31803h(j2)) {
            BackpressureHelper.m31808a(this.f62749c, j2);
        }
    }
}
