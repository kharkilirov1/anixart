package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableScanSeed<T, R> extends AbstractFlowableWithUpstream<T, R> {

    public static final class ScanSeedSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super R> f60577b;

        /* renamed from: c */
        public final BiFunction<R, ? super T, R> f60578c;

        /* renamed from: d */
        public final SimplePlainQueue<R> f60579d;

        /* renamed from: e */
        public final AtomicLong f60580e;

        /* renamed from: f */
        public final int f60581f;

        /* renamed from: g */
        public final int f60582g;

        /* renamed from: h */
        public volatile boolean f60583h;

        /* renamed from: i */
        public volatile boolean f60584i;

        /* renamed from: j */
        public Throwable f60585j;

        /* renamed from: k */
        public Subscription f60586k;

        /* renamed from: l */
        public R f60587l;

        /* renamed from: m */
        public int f60588m;

        /* renamed from: a */
        public void m31579a() {
            Throwable th;
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.f60577b;
            SimplePlainQueue<R> simplePlainQueue = this.f60579d;
            int i2 = this.f60582g;
            int i3 = this.f60588m;
            int i4 = 1;
            do {
                long j2 = this.f60580e.get();
                long j3 = 0;
                while (j3 != j2) {
                    if (this.f60583h) {
                        simplePlainQueue.clear();
                        return;
                    }
                    boolean z = this.f60584i;
                    if (z && (th = this.f60585j) != null) {
                        simplePlainQueue.clear();
                        subscriber.onError(th);
                        return;
                    }
                    R poll = simplePlainQueue.poll();
                    boolean z2 = poll == null;
                    if (z && z2) {
                        subscriber.onComplete();
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    subscriber.onNext(poll);
                    j3++;
                    i3++;
                    if (i3 == i2) {
                        this.f60586k.request(i2);
                        i3 = 0;
                    }
                }
                if (j3 == j2 && this.f60584i) {
                    Throwable th2 = this.f60585j;
                    if (th2 != null) {
                        simplePlainQueue.clear();
                        subscriber.onError(th2);
                        return;
                    } else if (simplePlainQueue.isEmpty()) {
                        subscriber.onComplete();
                        return;
                    }
                }
                if (j3 != 0) {
                    BackpressureHelper.m31812e(this.f60580e, j3);
                }
                this.f60588m = i3;
                i4 = addAndGet(-i4);
            } while (i4 != 0);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f60583h = true;
            this.f60586k.cancel();
            if (getAndIncrement() == 0) {
                this.f60579d.clear();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60586k, subscription)) {
                this.f60586k = subscription;
                this.f60577b.mo31352d(this);
                subscription.request(this.f60581f - 1);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f60584i) {
                return;
            }
            this.f60584i = true;
            m31579a();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60584i) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f60585j = th;
            this.f60584i = true;
            m31579a();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60584i) {
                return;
            }
            try {
                R apply = this.f60578c.apply(this.f60587l, t);
                Objects.requireNonNull(apply, "The accumulator returned a null value");
                this.f60587l = apply;
                this.f60579d.offer(apply);
                m31579a();
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f60586k.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this.f60580e, j2);
                m31579a();
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super R> subscriber) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            subscriber.mo31352d(EmptySubscription.INSTANCE);
            subscriber.onError(th);
        }
    }
}
