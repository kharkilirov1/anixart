package io.reactivex.processors;

import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class UnicastProcessor<T> extends FlowableProcessor<T> {

    /* renamed from: n */
    public static final /* synthetic */ int f62881n = 0;

    /* renamed from: c */
    public final SpscLinkedArrayQueue<T> f62882c;

    /* renamed from: d */
    public final AtomicReference<Runnable> f62883d;

    /* renamed from: e */
    public final boolean f62884e;

    /* renamed from: f */
    public volatile boolean f62885f;

    /* renamed from: g */
    public Throwable f62886g;

    /* renamed from: h */
    public final AtomicReference<Subscriber<? super T>> f62887h;

    /* renamed from: i */
    public volatile boolean f62888i;

    /* renamed from: j */
    public final AtomicBoolean f62889j;

    /* renamed from: k */
    public final BasicIntQueueSubscription<T> f62890k;

    /* renamed from: l */
    public final AtomicLong f62891l;

    /* renamed from: m */
    public boolean f62892m;

    public final class UnicastQueueSubscription extends BasicIntQueueSubscription<T> {
        public UnicastQueueSubscription() {
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            if ((i2 & 2) == 0) {
                return 0;
            }
            UnicastProcessor.this.f62892m = true;
            return 2;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (UnicastProcessor.this.f62888i) {
                return;
            }
            UnicastProcessor.this.f62888i = true;
            UnicastProcessor.this.m31858j();
            UnicastProcessor unicastProcessor = UnicastProcessor.this;
            if (unicastProcessor.f62892m || unicastProcessor.f62890k.getAndIncrement() != 0) {
                return;
            }
            UnicastProcessor.this.f62882c.clear();
            UnicastProcessor.this.f62887h.lazySet(null);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            UnicastProcessor.this.f62882c.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return UnicastProcessor.this.f62882c.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            return UnicastProcessor.this.f62882c.poll();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(UnicastProcessor.this.f62891l, j2);
                UnicastProcessor.this.m31859k();
            }
        }
    }

    public UnicastProcessor(int i2, Runnable runnable, boolean z) {
        ObjectHelper.m31427c(i2, "capacityHint");
        this.f62882c = new SpscLinkedArrayQueue<>(i2);
        this.f62883d = new AtomicReference<>(runnable);
        this.f62884e = z;
        this.f62887h = new AtomicReference<>();
        this.f62889j = new AtomicBoolean();
        this.f62890k = new UnicastQueueSubscription();
        this.f62891l = new AtomicLong();
    }

    @CheckReturnValue
    @NonNull
    /* renamed from: i */
    public static <T> UnicastProcessor<T> m31856i(int i2) {
        return new UnicastProcessor<>(i2, null, true);
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        if (this.f62889j.get() || !this.f62889j.compareAndSet(false, true)) {
            IllegalStateException illegalStateException = new IllegalStateException("This processor allows only a single Subscriber");
            subscriber.mo31352d(EmptySubscription.INSTANCE);
            subscriber.onError(illegalStateException);
        } else {
            subscriber.mo31352d(this.f62890k);
            this.f62887h.set(subscriber);
            if (this.f62888i) {
                this.f62887h.lazySet(null);
            } else {
                m31859k();
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    /* renamed from: d */
    public void mo31352d(Subscription subscription) {
        if (this.f62885f || this.f62888i) {
            subscription.cancel();
        } else {
            subscription.request(Long.MAX_VALUE);
        }
    }

    /* renamed from: h */
    public boolean m31857h(boolean z, boolean z2, boolean z3, Subscriber<? super T> subscriber, SpscLinkedArrayQueue<T> spscLinkedArrayQueue) {
        if (this.f62888i) {
            spscLinkedArrayQueue.clear();
            this.f62887h.lazySet(null);
            return true;
        }
        if (!z2) {
            return false;
        }
        if (z && this.f62886g != null) {
            spscLinkedArrayQueue.clear();
            this.f62887h.lazySet(null);
            subscriber.onError(this.f62886g);
            return true;
        }
        if (!z3) {
            return false;
        }
        Throwable th = this.f62886g;
        this.f62887h.lazySet(null);
        if (th != null) {
            subscriber.onError(th);
        } else {
            subscriber.onComplete();
        }
        return true;
    }

    /* renamed from: j */
    public void m31858j() {
        Runnable andSet = this.f62883d.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
    }

    /* renamed from: k */
    public void m31859k() {
        long j2;
        if (this.f62890k.getAndIncrement() != 0) {
            return;
        }
        int i2 = 1;
        Subscriber<? super T> subscriber = this.f62887h.get();
        int i3 = 1;
        while (subscriber == null) {
            i3 = this.f62890k.addAndGet(-i3);
            if (i3 == 0) {
                return;
            }
            subscriber = this.f62887h.get();
            i2 = 1;
        }
        if (this.f62892m) {
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.f62882c;
            int i4 = (this.f62884e ? 1 : 0) ^ i2;
            while (!this.f62888i) {
                boolean z = this.f62885f;
                if (i4 != 0 && z && this.f62886g != null) {
                    spscLinkedArrayQueue.clear();
                    this.f62887h.lazySet(null);
                    subscriber.onError(this.f62886g);
                    return;
                }
                subscriber.onNext(null);
                if (z) {
                    this.f62887h.lazySet(null);
                    Throwable th = this.f62886g;
                    if (th != null) {
                        subscriber.onError(th);
                        return;
                    } else {
                        subscriber.onComplete();
                        return;
                    }
                }
                i2 = this.f62890k.addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            }
            spscLinkedArrayQueue.clear();
            this.f62887h.lazySet(null);
            return;
        }
        SpscLinkedArrayQueue<T> spscLinkedArrayQueue2 = this.f62882c;
        boolean z2 = !this.f62884e;
        int i5 = 1;
        do {
            long j3 = this.f62891l.get();
            long j4 = 0;
            while (true) {
                if (j3 == j4) {
                    j2 = j4;
                    break;
                }
                boolean z3 = this.f62885f;
                T poll = spscLinkedArrayQueue2.poll();
                boolean z4 = poll == null;
                j2 = j4;
                if (m31857h(z2, z3, z4, subscriber, spscLinkedArrayQueue2)) {
                    return;
                }
                if (z4) {
                    break;
                }
                subscriber.onNext(poll);
                j4 = j2 + 1;
            }
            if (j3 == j4 && m31857h(z2, this.f62885f, spscLinkedArrayQueue2.isEmpty(), subscriber, spscLinkedArrayQueue2)) {
                return;
            }
            if (j2 != 0 && j3 != Long.MAX_VALUE) {
                this.f62891l.addAndGet(-j2);
            }
            i5 = this.f62890k.addAndGet(-i5);
        } while (i5 != 0);
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f62885f || this.f62888i) {
            return;
        }
        this.f62885f = true;
        m31858j();
        m31859k();
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        Objects.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f62885f || this.f62888i) {
            RxJavaPlugins.m31848b(th);
            return;
        }
        this.f62886g = th;
        this.f62885f = true;
        m31858j();
        m31859k();
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        Objects.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f62885f || this.f62888i) {
            return;
        }
        this.f62882c.offer(t);
        m31859k();
    }
}
