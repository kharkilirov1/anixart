package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableCache<T> extends AbstractFlowableWithUpstream<T, T> implements FlowableSubscriber<T> {

    /* renamed from: d */
    public volatile long f59910d;

    /* renamed from: e */
    public Node<T> f59911e;

    /* renamed from: f */
    public int f59912f;

    /* renamed from: g */
    public Throwable f59913g;

    /* renamed from: h */
    public volatile boolean f59914h;

    public static final class CacheSubscription<T> extends AtomicInteger implements Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f59915b;

        /* renamed from: c */
        public final FlowableCache<T> f59916c;

        /* renamed from: f */
        public int f59919f;

        /* renamed from: g */
        public long f59920g;

        /* renamed from: e */
        public Node<T> f59918e = null;

        /* renamed from: d */
        public final AtomicLong f59917d = new AtomicLong();

        public CacheSubscription(Subscriber<? super T> subscriber, FlowableCache<T> flowableCache) {
            this.f59915b = subscriber;
            this.f59916c = flowableCache;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f59917d.getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE) {
                return;
            }
            Objects.requireNonNull(this.f59916c);
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31809b(this.f59917d, j2);
                this.f59916c.m31458e(this);
            }
        }
    }

    public static final class Node<T> {

        /* renamed from: a */
        public final T[] f59921a;

        /* renamed from: b */
        public volatile Node<T> f59922b;

        public Node(int i2) {
            this.f59921a = (T[]) new Object[i2];
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        subscriber.mo31352d(new CacheSubscription(subscriber, this));
        throw null;
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    /* renamed from: d */
    public void mo31352d(Subscription subscription) {
        subscription.request(Long.MAX_VALUE);
    }

    /* renamed from: e */
    public void m31458e(CacheSubscription<T> cacheSubscription) {
        if (cacheSubscription.getAndIncrement() != 0) {
            return;
        }
        long j2 = cacheSubscription.f59920g;
        int i2 = cacheSubscription.f59919f;
        Node<T> node = cacheSubscription.f59918e;
        AtomicLong atomicLong = cacheSubscription.f59917d;
        Subscriber<? super T> subscriber = cacheSubscription.f59915b;
        int i3 = 1;
        while (true) {
            boolean z = this.f59914h;
            boolean z2 = this.f59910d == j2;
            if (z && z2) {
                cacheSubscription.f59918e = null;
                Throwable th = this.f59913g;
                if (th != null) {
                    subscriber.onError(th);
                    return;
                } else {
                    subscriber.onComplete();
                    return;
                }
            }
            if (!z2) {
                long j3 = atomicLong.get();
                if (j3 == Long.MIN_VALUE) {
                    cacheSubscription.f59918e = null;
                    return;
                } else if (j3 != j2) {
                    if (i2 == 0) {
                        node = node.f59922b;
                        i2 = 0;
                    }
                    subscriber.onNext(node.f59921a[i2]);
                    i2++;
                    j2++;
                }
            }
            cacheSubscription.f59920g = j2;
            cacheSubscription.f59919f = i2;
            cacheSubscription.f59918e = node;
            i3 = cacheSubscription.addAndGet(-i3);
            if (i3 == 0) {
                return;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        this.f59914h = true;
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        if (this.f59914h) {
            RxJavaPlugins.m31848b(th);
        } else {
            this.f59913g = th;
            this.f59914h = true;
            throw null;
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        int i2 = this.f59912f;
        if (i2 == 0) {
            Node<T> node = new Node<>(i2);
            node.f59921a[0] = t;
            this.f59912f = 1;
            this.f59911e.f59922b = node;
            this.f59911e = node;
        } else {
            this.f59911e.f59921a[i2] = t;
            this.f59912f = i2 + 1;
        }
        this.f59910d++;
        throw null;
    }
}
