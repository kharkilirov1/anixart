package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableTakeLastTimed<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class TakeLastTimedSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60695b;

        /* renamed from: c */
        public final long f60696c;

        /* renamed from: d */
        public final long f60697d;

        /* renamed from: g */
        public final SpscLinkedArrayQueue<Object> f60700g;

        /* renamed from: h */
        public final boolean f60701h;

        /* renamed from: i */
        public Subscription f60702i;

        /* renamed from: k */
        public volatile boolean f60704k;

        /* renamed from: l */
        public volatile boolean f60705l;

        /* renamed from: m */
        public Throwable f60706m;

        /* renamed from: j */
        public final AtomicLong f60703j = new AtomicLong();

        /* renamed from: e */
        public final TimeUnit f60698e = null;

        /* renamed from: f */
        public final Scheduler f60699f = null;

        public TakeLastTimedSubscriber(Subscriber<? super T> subscriber, long j2, long j3, TimeUnit timeUnit, Scheduler scheduler, int i2, boolean z) {
            this.f60695b = subscriber;
            this.f60696c = j2;
            this.f60697d = j3;
            this.f60700g = new SpscLinkedArrayQueue<>(i2);
            this.f60701h = z;
        }

        /* renamed from: a */
        public boolean m31591a(boolean z, Subscriber<? super T> subscriber, boolean z2) {
            if (this.f60704k) {
                this.f60700g.clear();
                return true;
            }
            if (z2) {
                if (!z) {
                    return false;
                }
                Throwable th = this.f60706m;
                if (th != null) {
                    subscriber.onError(th);
                } else {
                    subscriber.onComplete();
                }
                return true;
            }
            Throwable th2 = this.f60706m;
            if (th2 != null) {
                this.f60700g.clear();
                subscriber.onError(th2);
                return true;
            }
            if (!z) {
                return false;
            }
            subscriber.onComplete();
            return true;
        }

        /* renamed from: b */
        public void m31592b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = this.f60695b;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.f60700g;
            boolean z = this.f60701h;
            int i2 = 1;
            do {
                if (this.f60705l) {
                    if (m31591a(spscLinkedArrayQueue.isEmpty(), subscriber, z)) {
                        return;
                    }
                    long j2 = this.f60703j.get();
                    long j3 = 0;
                    while (true) {
                        if (m31591a(spscLinkedArrayQueue.peek() == null, subscriber, z)) {
                            return;
                        }
                        if (j2 != j3) {
                            spscLinkedArrayQueue.poll();
                            subscriber.onNext(spscLinkedArrayQueue.poll());
                            j3++;
                        } else if (j3 != 0) {
                            BackpressureHelper.m31812e(this.f60703j, j3);
                        }
                    }
                }
                i2 = addAndGet(-i2);
            } while (i2 != 0);
        }

        /* renamed from: c */
        public void m31593c(long j2, SpscLinkedArrayQueue<Object> spscLinkedArrayQueue) {
            long j3 = this.f60697d;
            long j4 = this.f60696c;
            boolean z = j4 == Long.MAX_VALUE;
            while (!spscLinkedArrayQueue.isEmpty()) {
                if (((Long) spscLinkedArrayQueue.peek()).longValue() >= j2 - j3 && (z || (spscLinkedArrayQueue.m31766d() >> 1) <= j4)) {
                    return;
                }
                spscLinkedArrayQueue.poll();
                spscLinkedArrayQueue.poll();
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f60704k) {
                return;
            }
            this.f60704k = true;
            this.f60702i.cancel();
            if (getAndIncrement() == 0) {
                this.f60700g.clear();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60702i, subscription)) {
                this.f60702i = subscription;
                this.f60695b.mo31352d(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            m31593c(this.f60699f.mo31375b(this.f60698e), this.f60700g);
            this.f60705l = true;
            m31592b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60701h) {
                m31593c(this.f60699f.mo31375b(this.f60698e), this.f60700g);
            }
            this.f60706m = th;
            this.f60705l = true;
            m31592b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.f60700g;
            long mo31375b = this.f60699f.mo31375b(this.f60698e);
            spscLinkedArrayQueue.m31765c(Long.valueOf(mo31375b), t);
            m31593c(mo31375b, spscLinkedArrayQueue);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this.f60703j, j2);
                m31592b();
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f59782c.m31349b(new TakeLastTimedSubscriber(subscriber, 0L, 0L, null, null, 0, false));
    }
}
