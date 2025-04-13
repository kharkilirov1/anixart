package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Action;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableOnBackpressureBuffer<T> extends AbstractFlowableWithUpstream<T, T> {

    /* renamed from: d */
    public final int f60385d;

    /* renamed from: e */
    public final boolean f60386e;

    /* renamed from: f */
    public final boolean f60387f;

    /* renamed from: g */
    public final Action f60388g;

    public static final class BackpressureBufferSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {

        /* renamed from: b */
        public final Subscriber<? super T> f60389b;

        /* renamed from: c */
        public final SimplePlainQueue<T> f60390c;

        /* renamed from: d */
        public final boolean f60391d;

        /* renamed from: e */
        public final Action f60392e;

        /* renamed from: f */
        public Subscription f60393f;

        /* renamed from: g */
        public volatile boolean f60394g;

        /* renamed from: h */
        public volatile boolean f60395h;

        /* renamed from: i */
        public Throwable f60396i;

        /* renamed from: j */
        public final AtomicLong f60397j = new AtomicLong();

        /* renamed from: k */
        public boolean f60398k;

        public BackpressureBufferSubscriber(Subscriber<? super T> subscriber, int i2, boolean z, boolean z2, Action action) {
            this.f60389b = subscriber;
            this.f60392e = action;
            this.f60391d = z2;
            this.f60390c = z ? new SpscLinkedArrayQueue<>(i2) : new SpscArrayQueue<>(i2);
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            if ((i2 & 2) == 0) {
                return 0;
            }
            this.f60398k = true;
            return 2;
        }

        /* renamed from: c */
        public void m31539c() {
            if (getAndIncrement() == 0) {
                SimplePlainQueue<T> simplePlainQueue = this.f60390c;
                Subscriber<? super T> subscriber = this.f60389b;
                int i2 = 1;
                while (!m31540f(this.f60395h, simplePlainQueue.isEmpty(), subscriber)) {
                    long j2 = this.f60397j.get();
                    long j3 = 0;
                    while (j3 != j2) {
                        boolean z = this.f60395h;
                        T poll = simplePlainQueue.poll();
                        boolean z2 = poll == null;
                        if (m31540f(z, z2, subscriber)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        subscriber.onNext(poll);
                        j3++;
                    }
                    if (j3 == j2 && m31540f(this.f60395h, simplePlainQueue.isEmpty(), subscriber)) {
                        return;
                    }
                    if (j3 != 0 && j2 != Long.MAX_VALUE) {
                        this.f60397j.addAndGet(-j3);
                    }
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f60394g) {
                return;
            }
            this.f60394g = true;
            this.f60393f.cancel();
            if (getAndIncrement() == 0) {
                this.f60390c.clear();
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f60390c.clear();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60393f, subscription)) {
                this.f60393f = subscription;
                this.f60389b.mo31352d(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        /* renamed from: f */
        public boolean m31540f(boolean z, boolean z2, Subscriber<? super T> subscriber) {
            if (this.f60394g) {
                this.f60390c.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.f60391d) {
                if (!z2) {
                    return false;
                }
                Throwable th = this.f60396i;
                if (th != null) {
                    subscriber.onError(th);
                } else {
                    subscriber.onComplete();
                }
                return true;
            }
            Throwable th2 = this.f60396i;
            if (th2 != null) {
                this.f60390c.clear();
                subscriber.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            subscriber.onComplete();
            return true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.f60390c.isEmpty();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60395h = true;
            if (this.f60398k) {
                this.f60389b.onComplete();
            } else {
                m31539c();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f60396i = th;
            this.f60395h = true;
            if (this.f60398k) {
                this.f60389b.onError(th);
            } else {
                m31539c();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60390c.offer(t)) {
                if (this.f60398k) {
                    this.f60389b.onNext(null);
                    return;
                } else {
                    m31539c();
                    return;
                }
            }
            this.f60393f.cancel();
            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
            try {
                this.f60392e.run();
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                missingBackpressureException.initCause(th);
            }
            onError(missingBackpressureException);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            return this.f60390c.poll();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (this.f60398k || !SubscriptionHelper.m31803h(j2)) {
                return;
            }
            BackpressureHelper.m31808a(this.f60397j, j2);
            m31539c();
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f59782c.m31349b(new BackpressureBufferSubscriber(subscriber, this.f60385d, this.f60386e, this.f60387f, this.f60388g));
    }
}
