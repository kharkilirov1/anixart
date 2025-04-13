package io.reactivex.internal.operators.parallel;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.parallel.ParallelFlowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class ParallelFromPublisher<T> extends ParallelFlowable<T> {

    public static final class ParallelDispatcher<T> extends AtomicInteger implements FlowableSubscriber<T> {

        /* renamed from: b */
        public final Subscriber<? super T>[] f62346b;

        /* renamed from: c */
        public final AtomicLongArray f62347c;

        /* renamed from: d */
        public final long[] f62348d;

        /* renamed from: e */
        public final int f62349e;

        /* renamed from: f */
        public final int f62350f;

        /* renamed from: g */
        public Subscription f62351g;

        /* renamed from: h */
        public SimpleQueue<T> f62352h;

        /* renamed from: i */
        public Throwable f62353i;

        /* renamed from: j */
        public volatile boolean f62354j;

        /* renamed from: k */
        public int f62355k;

        /* renamed from: l */
        public volatile boolean f62356l;

        /* renamed from: m */
        public final AtomicInteger f62357m;

        /* renamed from: n */
        public int f62358n;

        /* renamed from: o */
        public int f62359o;

        public final class RailSubscription implements Subscription {

            /* renamed from: b */
            public final int f62360b;

            /* renamed from: c */
            public final int f62361c;

            public RailSubscription(int i2, int i3) {
                this.f62360b = i2;
                this.f62361c = i3;
            }

            @Override // org.reactivestreams.Subscription
            public void cancel() {
                if (ParallelDispatcher.this.f62347c.compareAndSet(this.f62360b + this.f62361c, 0L, 1L)) {
                    ParallelDispatcher parallelDispatcher = ParallelDispatcher.this;
                    int i2 = this.f62361c;
                    if (parallelDispatcher.f62347c.decrementAndGet(i2 + i2) == 0) {
                        parallelDispatcher.f62356l = true;
                        parallelDispatcher.f62351g.cancel();
                        if (parallelDispatcher.getAndIncrement() == 0) {
                            parallelDispatcher.f62352h.clear();
                        }
                    }
                }
            }

            @Override // org.reactivestreams.Subscription
            public void request(long j2) {
                long j3;
                if (SubscriptionHelper.m31803h(j2)) {
                    AtomicLongArray atomicLongArray = ParallelDispatcher.this.f62347c;
                    do {
                        j3 = atomicLongArray.get(this.f62360b);
                        if (j3 == Long.MAX_VALUE) {
                            return;
                        }
                    } while (!atomicLongArray.compareAndSet(this.f62360b, j3, BackpressureHelper.m31810c(j3, j2)));
                    if (ParallelDispatcher.this.f62357m.get() == this.f62361c) {
                        ParallelDispatcher.this.m31741a();
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:107:0x013c  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x0148  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m31741a() {
            /*
                Method dump skipped, instructions count: 339
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.parallel.ParallelFromPublisher.ParallelDispatcher.m31741a():void");
        }

        /* renamed from: b */
        public void m31742b() {
            Subscriber<? super T>[] subscriberArr = this.f62346b;
            int length = subscriberArr.length;
            int i2 = 0;
            while (i2 < length && !this.f62356l) {
                int i3 = i2 + 1;
                this.f62357m.lazySet(i3);
                subscriberArr[i2].mo31352d(new RailSubscription(i2, length));
                i2 = i3;
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f62351g, subscription)) {
                this.f62351g = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int mo31420F = queueSubscription.mo31420F(7);
                    if (mo31420F == 1) {
                        this.f62359o = mo31420F;
                        this.f62352h = queueSubscription;
                        this.f62354j = true;
                        m31742b();
                        m31741a();
                        return;
                    }
                    if (mo31420F == 2) {
                        this.f62359o = mo31420F;
                        this.f62352h = queueSubscription;
                        m31742b();
                        subscription.request(this.f62349e);
                        return;
                    }
                }
                this.f62352h = new SpscArrayQueue(this.f62349e);
                m31742b();
                subscription.request(this.f62349e);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f62354j = true;
            m31741a();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f62353i = th;
            this.f62354j = true;
            m31741a();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f62359o != 0 || this.f62352h.offer(t)) {
                m31741a();
                return;
            }
            this.f62351g.cancel();
            this.f62353i = new MissingBackpressureException("Queue is full?");
            this.f62354j = true;
            m31741a();
        }
    }
}
