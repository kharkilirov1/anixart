package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableThrottleLatest<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class ThrottleLatestSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, Runnable {

        /* renamed from: b */
        public final Subscriber<? super T> f60731b;

        /* renamed from: c */
        public final long f60732c;

        /* renamed from: d */
        public final TimeUnit f60733d;

        /* renamed from: e */
        public final Scheduler.Worker f60734e;

        /* renamed from: f */
        public final boolean f60735f;

        /* renamed from: g */
        public final AtomicReference<T> f60736g;

        /* renamed from: h */
        public final AtomicLong f60737h;

        /* renamed from: i */
        public Subscription f60738i;

        /* renamed from: j */
        public volatile boolean f60739j;

        /* renamed from: k */
        public Throwable f60740k;

        /* renamed from: l */
        public volatile boolean f60741l;

        /* renamed from: m */
        public volatile boolean f60742m;

        /* renamed from: n */
        public long f60743n;

        /* renamed from: o */
        public boolean f60744o;

        /* renamed from: a */
        public void m31594a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<T> atomicReference = this.f60736g;
            AtomicLong atomicLong = this.f60737h;
            Subscriber<? super T> subscriber = this.f60731b;
            int i2 = 1;
            while (!this.f60741l) {
                boolean z = this.f60739j;
                if (z && this.f60740k != null) {
                    atomicReference.lazySet(null);
                    subscriber.onError(this.f60740k);
                    this.f60734e.mo31379f();
                    return;
                }
                boolean z2 = atomicReference.get() == null;
                if (z) {
                    if (z2 || !this.f60735f) {
                        atomicReference.lazySet(null);
                        subscriber.onComplete();
                    } else {
                        T andSet = atomicReference.getAndSet(null);
                        long j2 = this.f60743n;
                        if (j2 != atomicLong.get()) {
                            this.f60743n = j2 + 1;
                            subscriber.onNext(andSet);
                            subscriber.onComplete();
                        } else {
                            subscriber.onError(new MissingBackpressureException("Could not emit final value due to lack of requests"));
                        }
                    }
                    this.f60734e.mo31379f();
                    return;
                }
                if (z2) {
                    if (this.f60742m) {
                        this.f60744o = false;
                        this.f60742m = false;
                    }
                } else if (!this.f60744o || this.f60742m) {
                    T andSet2 = atomicReference.getAndSet(null);
                    long j3 = this.f60743n;
                    if (j3 == atomicLong.get()) {
                        this.f60738i.cancel();
                        subscriber.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
                        this.f60734e.mo31379f();
                        return;
                    } else {
                        subscriber.onNext(andSet2);
                        this.f60743n = j3 + 1;
                        this.f60742m = false;
                        this.f60744o = true;
                        this.f60734e.mo31383c(this, this.f60732c, this.f60733d);
                    }
                }
                i2 = addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f60741l = true;
            this.f60738i.cancel();
            this.f60734e.mo31379f();
            if (getAndIncrement() == 0) {
                this.f60736g.lazySet(null);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60738i, subscription)) {
                this.f60738i = subscription;
                this.f60731b.mo31352d(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60739j = true;
            m31594a();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f60740k = th;
            this.f60739j = true;
            m31594a();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.f60736g.set(t);
            m31594a();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this.f60737h, j2);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f60742m = true;
            m31594a();
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        throw null;
    }
}
