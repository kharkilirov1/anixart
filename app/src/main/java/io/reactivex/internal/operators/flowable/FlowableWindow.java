package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableWindow<T> extends AbstractFlowableWithUpstream<T, Flowable<T>> {

    public static final class WindowExactSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, Runnable {

        /* renamed from: b */
        public final Subscriber<? super Flowable<T>> f60799b;

        /* renamed from: c */
        public final long f60800c;

        /* renamed from: d */
        public final AtomicBoolean f60801d;

        /* renamed from: e */
        public final int f60802e;

        /* renamed from: f */
        public long f60803f;

        /* renamed from: g */
        public Subscription f60804g;

        /* renamed from: h */
        public UnicastProcessor<T> f60805h;

        public WindowExactSubscriber(Subscriber<? super Flowable<T>> subscriber, long j2, int i2) {
            super(1);
            this.f60799b = subscriber;
            this.f60800c = j2;
            this.f60801d = new AtomicBoolean();
            this.f60802e = i2;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f60801d.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60804g, subscription)) {
                this.f60804g = subscription;
                this.f60799b.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            UnicastProcessor<T> unicastProcessor = this.f60805h;
            if (unicastProcessor != null) {
                this.f60805h = null;
                unicastProcessor.onComplete();
            }
            this.f60799b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            UnicastProcessor<T> unicastProcessor = this.f60805h;
            if (unicastProcessor != null) {
                this.f60805h = null;
                unicastProcessor.onError(th);
            }
            this.f60799b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            long j2 = this.f60803f;
            UnicastProcessor<T> unicastProcessor = this.f60805h;
            if (j2 == 0) {
                getAndIncrement();
                int i2 = this.f60802e;
                int i3 = UnicastProcessor.f62881n;
                UnicastProcessor<T> unicastProcessor2 = new UnicastProcessor<>(i2, this, true);
                this.f60805h = unicastProcessor2;
                this.f60799b.onNext(unicastProcessor2);
                unicastProcessor = unicastProcessor2;
            }
            long j3 = j2 + 1;
            unicastProcessor.onNext(t);
            if (j3 != this.f60800c) {
                this.f60803f = j3;
                return;
            }
            this.f60803f = 0L;
            this.f60805h = null;
            unicastProcessor.onComplete();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                this.f60804g.request(BackpressureHelper.m31811d(this.f60800c, j2));
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.f60804g.cancel();
            }
        }
    }

    public static final class WindowOverlapSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, Runnable {

        /* renamed from: b */
        public final Subscriber<? super Flowable<T>> f60806b;

        /* renamed from: c */
        public final SpscLinkedArrayQueue<UnicastProcessor<T>> f60807c;

        /* renamed from: d */
        public final long f60808d;

        /* renamed from: e */
        public final long f60809e;

        /* renamed from: f */
        public final ArrayDeque<UnicastProcessor<T>> f60810f;

        /* renamed from: g */
        public final AtomicBoolean f60811g;

        /* renamed from: h */
        public final AtomicBoolean f60812h;

        /* renamed from: i */
        public final AtomicLong f60813i;

        /* renamed from: j */
        public final AtomicInteger f60814j;

        /* renamed from: k */
        public final int f60815k;

        /* renamed from: l */
        public long f60816l;

        /* renamed from: m */
        public long f60817m;

        /* renamed from: n */
        public Subscription f60818n;

        /* renamed from: o */
        public volatile boolean f60819o;

        /* renamed from: p */
        public Throwable f60820p;

        /* renamed from: q */
        public volatile boolean f60821q;

        /* renamed from: a */
        public boolean m31598a(boolean z, boolean z2, Subscriber<?> subscriber, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            if (this.f60821q) {
                spscLinkedArrayQueue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.f60820p;
            if (th != null) {
                spscLinkedArrayQueue.clear();
                subscriber.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            subscriber.onComplete();
            return true;
        }

        /* renamed from: b */
        public void m31599b() {
            if (this.f60814j.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super Flowable<T>> subscriber = this.f60806b;
            SpscLinkedArrayQueue<UnicastProcessor<T>> spscLinkedArrayQueue = this.f60807c;
            int i2 = 1;
            do {
                long j2 = this.f60813i.get();
                long j3 = 0;
                while (j3 != j2) {
                    boolean z = this.f60819o;
                    UnicastProcessor<T> poll = spscLinkedArrayQueue.poll();
                    boolean z2 = poll == null;
                    if (m31598a(z, z2, subscriber, spscLinkedArrayQueue)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    subscriber.onNext(poll);
                    j3++;
                }
                if (j3 == j2 && m31598a(this.f60819o, spscLinkedArrayQueue.isEmpty(), subscriber, spscLinkedArrayQueue)) {
                    return;
                }
                if (j3 != 0 && j2 != Long.MAX_VALUE) {
                    this.f60813i.addAndGet(-j3);
                }
                i2 = this.f60814j.addAndGet(-i2);
            } while (i2 != 0);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f60821q = true;
            if (this.f60811g.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60818n, subscription)) {
                this.f60818n = subscription;
                this.f60806b.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f60819o) {
                return;
            }
            Iterator<UnicastProcessor<T>> it = this.f60810f.iterator();
            while (it.hasNext()) {
                it.next().onComplete();
            }
            this.f60810f.clear();
            this.f60819o = true;
            m31599b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60819o) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            Iterator<UnicastProcessor<T>> it = this.f60810f.iterator();
            while (it.hasNext()) {
                it.next().onError(th);
            }
            this.f60810f.clear();
            this.f60820p = th;
            this.f60819o = true;
            m31599b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60819o) {
                return;
            }
            long j2 = this.f60816l;
            if (j2 == 0 && !this.f60821q) {
                getAndIncrement();
                int i2 = this.f60815k;
                int i3 = UnicastProcessor.f62881n;
                UnicastProcessor<T> unicastProcessor = new UnicastProcessor<>(i2, this, true);
                this.f60810f.offer(unicastProcessor);
                this.f60807c.offer(unicastProcessor);
                m31599b();
            }
            long j3 = j2 + 1;
            Iterator<UnicastProcessor<T>> it = this.f60810f.iterator();
            while (it.hasNext()) {
                it.next().onNext(t);
            }
            long j4 = this.f60817m + 1;
            if (j4 == this.f60808d) {
                this.f60817m = j4 - this.f60809e;
                UnicastProcessor<T> poll = this.f60810f.poll();
                if (poll != null) {
                    poll.onComplete();
                }
            } else {
                this.f60817m = j4;
            }
            if (j3 == this.f60809e) {
                this.f60816l = 0L;
            } else {
                this.f60816l = j3;
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this.f60813i, j2);
                if (this.f60812h.get() || !this.f60812h.compareAndSet(false, true)) {
                    this.f60818n.request(BackpressureHelper.m31811d(this.f60809e, j2));
                } else {
                    this.f60818n.request(BackpressureHelper.m31810c(this.f60808d, BackpressureHelper.m31811d(this.f60809e, j2 - 1)));
                }
                m31599b();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.f60818n.cancel();
            }
        }
    }

    public static final class WindowSkipSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, Runnable {

        /* renamed from: b */
        public final Subscriber<? super Flowable<T>> f60822b;

        /* renamed from: c */
        public final long f60823c;

        /* renamed from: d */
        public final long f60824d;

        /* renamed from: e */
        public final AtomicBoolean f60825e;

        /* renamed from: f */
        public final AtomicBoolean f60826f;

        /* renamed from: g */
        public final int f60827g;

        /* renamed from: h */
        public long f60828h;

        /* renamed from: i */
        public Subscription f60829i;

        /* renamed from: j */
        public UnicastProcessor<T> f60830j;

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f60825e.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60829i, subscription)) {
                this.f60829i = subscription;
                this.f60822b.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            UnicastProcessor<T> unicastProcessor = this.f60830j;
            if (unicastProcessor != null) {
                this.f60830j = null;
                unicastProcessor.onComplete();
            }
            this.f60822b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            UnicastProcessor<T> unicastProcessor = this.f60830j;
            if (unicastProcessor != null) {
                this.f60830j = null;
                unicastProcessor.onError(th);
            }
            this.f60822b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            long j2 = this.f60828h;
            UnicastProcessor<T> unicastProcessor = this.f60830j;
            if (j2 == 0) {
                getAndIncrement();
                int i2 = this.f60827g;
                int i3 = UnicastProcessor.f62881n;
                UnicastProcessor<T> unicastProcessor2 = new UnicastProcessor<>(i2, this, true);
                this.f60830j = unicastProcessor2;
                this.f60822b.onNext(unicastProcessor2);
                unicastProcessor = unicastProcessor2;
            }
            long j3 = j2 + 1;
            if (unicastProcessor != null) {
                unicastProcessor.onNext(t);
            }
            if (j3 == this.f60823c) {
                this.f60830j = null;
                unicastProcessor.onComplete();
            }
            if (j3 == this.f60824d) {
                this.f60828h = 0L;
            } else {
                this.f60828h = j3;
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                if (this.f60826f.get() || !this.f60826f.compareAndSet(false, true)) {
                    this.f60829i.request(BackpressureHelper.m31811d(this.f60824d, j2));
                } else {
                    this.f60829i.request(BackpressureHelper.m31810c(BackpressureHelper.m31811d(this.f60823c, j2), BackpressureHelper.m31811d(this.f60824d - this.f60823c, j2 - 1)));
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.f60829i.cancel();
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super Flowable<T>> subscriber) {
        this.f59782c.m31349b(new WindowExactSubscriber(subscriber, 0L, 0));
    }
}
