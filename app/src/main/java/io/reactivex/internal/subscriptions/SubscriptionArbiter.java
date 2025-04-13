package io.reactivex.internal.subscriptions;

import io.reactivex.internal.util.BackpressureHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public class SubscriptionArbiter extends AtomicInteger implements Subscription {

    /* renamed from: b */
    public Subscription f62771b;

    /* renamed from: c */
    public long f62772c;

    /* renamed from: d */
    public final AtomicReference<Subscription> f62773d = new AtomicReference<>();

    /* renamed from: e */
    public final AtomicLong f62774e = new AtomicLong();

    /* renamed from: f */
    public final AtomicLong f62775f = new AtomicLong();

    /* renamed from: g */
    public final boolean f62776g;

    /* renamed from: h */
    public volatile boolean f62777h;

    /* renamed from: i */
    public boolean f62778i;

    public SubscriptionArbiter(boolean z) {
        this.f62776g = z;
    }

    /* renamed from: a */
    final void m31793a() {
        if (getAndIncrement() != 0) {
            return;
        }
        m31794e();
    }

    public void cancel() {
        if (this.f62777h) {
            return;
        }
        this.f62777h = true;
        m31793a();
    }

    /* renamed from: e */
    final void m31794e() {
        int i2 = 1;
        Subscription subscription = null;
        long j2 = 0;
        do {
            Subscription subscription2 = this.f62773d.get();
            if (subscription2 != null) {
                subscription2 = this.f62773d.getAndSet(null);
            }
            long j3 = this.f62774e.get();
            if (j3 != 0) {
                j3 = this.f62774e.getAndSet(0L);
            }
            long j4 = this.f62775f.get();
            if (j4 != 0) {
                j4 = this.f62775f.getAndSet(0L);
            }
            Subscription subscription3 = this.f62771b;
            if (this.f62777h) {
                if (subscription3 != null) {
                    subscription3.cancel();
                    this.f62771b = null;
                }
                if (subscription2 != null) {
                    subscription2.cancel();
                }
            } else {
                long j5 = this.f62772c;
                if (j5 != Long.MAX_VALUE) {
                    j5 = BackpressureHelper.m31810c(j5, j3);
                    if (j5 != Long.MAX_VALUE) {
                        j5 -= j4;
                        if (j5 < 0) {
                            SubscriptionHelper.m31800d(j5);
                            j5 = 0;
                        }
                    }
                    this.f62772c = j5;
                }
                if (subscription2 != null) {
                    if (subscription3 != null && this.f62776g) {
                        subscription3.cancel();
                    }
                    this.f62771b = subscription2;
                    if (j5 != 0) {
                        j2 = BackpressureHelper.m31810c(j2, j5);
                        subscription = subscription2;
                    }
                } else if (subscription3 != null && j3 != 0) {
                    j2 = BackpressureHelper.m31810c(j2, j3);
                    subscription = subscription3;
                }
            }
            i2 = addAndGet(-i2);
        } while (i2 != 0);
        if (j2 != 0) {
            subscription.request(j2);
        }
    }

    /* renamed from: f */
    public final void m31795f(long j2) {
        if (this.f62778i) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            BackpressureHelper.m31808a(this.f62775f, j2);
            m31793a();
            return;
        }
        long j3 = this.f62772c;
        if (j3 != Long.MAX_VALUE) {
            long j4 = j3 - j2;
            if (j4 < 0) {
                SubscriptionHelper.m31800d(j4);
                j4 = 0;
            }
            this.f62772c = j4;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        m31794e();
    }

    /* renamed from: g */
    public final void m31796g(Subscription subscription) {
        if (this.f62777h) {
            subscription.cancel();
            return;
        }
        Objects.requireNonNull(subscription, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            Subscription andSet = this.f62773d.getAndSet(subscription);
            if (andSet != null && this.f62776g) {
                andSet.cancel();
            }
            m31793a();
            return;
        }
        Subscription subscription2 = this.f62771b;
        if (subscription2 != null && this.f62776g) {
            subscription2.cancel();
        }
        this.f62771b = subscription;
        long j2 = this.f62772c;
        if (decrementAndGet() != 0) {
            m31794e();
        }
        if (j2 != 0) {
            subscription.request(j2);
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j2) {
        if (!SubscriptionHelper.m31803h(j2) || this.f62778i) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            BackpressureHelper.m31808a(this.f62774e, j2);
            m31793a();
            return;
        }
        long j3 = this.f62772c;
        if (j3 != Long.MAX_VALUE) {
            long m31810c = BackpressureHelper.m31810c(j3, j2);
            this.f62772c = m31810c;
            if (m31810c == Long.MAX_VALUE) {
                this.f62778i = true;
            }
        }
        Subscription subscription = this.f62771b;
        if (decrementAndGet() != 0) {
            m31794e();
        }
        if (subscription != null) {
            subscription.request(j2);
        }
    }
}
