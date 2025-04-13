package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableBuffer<T, C extends Collection<? super T>> extends AbstractFlowableWithUpstream<T, C> {

    public static final class PublisherBufferExactSubscriber<T, C extends Collection<? super T>> implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super C> f59827b;

        /* renamed from: c */
        public final Callable<C> f59828c = null;

        /* renamed from: d */
        public final int f59829d;

        /* renamed from: e */
        public C f59830e;

        /* renamed from: f */
        public Subscription f59831f;

        /* renamed from: g */
        public boolean f59832g;

        /* renamed from: h */
        public int f59833h;

        public PublisherBufferExactSubscriber(Subscriber<? super C> subscriber, int i2, Callable<C> callable) {
            this.f59827b = subscriber;
            this.f59829d = i2;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f59831f.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f59831f, subscription)) {
                this.f59831f = subscription;
                this.f59827b.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f59832g) {
                return;
            }
            this.f59832g = true;
            C c2 = this.f59830e;
            if (c2 != null && !c2.isEmpty()) {
                this.f59827b.onNext(c2);
            }
            this.f59827b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f59832g) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f59832g = true;
                this.f59827b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f59832g) {
                return;
            }
            C c2 = this.f59830e;
            if (c2 == null) {
                try {
                    C call = this.f59828c.call();
                    Objects.requireNonNull(call, "The bufferSupplier returned a null buffer");
                    c2 = call;
                    this.f59830e = c2;
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    this.f59831f.cancel();
                    onError(th);
                    return;
                }
            }
            c2.add(t);
            int i2 = this.f59833h + 1;
            if (i2 != this.f59829d) {
                this.f59833h = i2;
                return;
            }
            this.f59833h = 0;
            this.f59830e = null;
            this.f59827b.onNext(c2);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                this.f59831f.request(BackpressureHelper.m31811d(j2, this.f59829d));
            }
        }
    }

    public static final class PublisherBufferOverlappingSubscriber<T, C extends Collection<? super T>> extends AtomicLong implements FlowableSubscriber<T>, Subscription, BooleanSupplier {

        /* renamed from: b */
        public final Subscriber<? super C> f59834b;

        /* renamed from: c */
        public final Callable<C> f59835c;

        /* renamed from: d */
        public final int f59836d;

        /* renamed from: e */
        public final int f59837e;

        /* renamed from: f */
        public final ArrayDeque<C> f59838f;

        /* renamed from: g */
        public final AtomicBoolean f59839g;

        /* renamed from: h */
        public Subscription f59840h;

        /* renamed from: i */
        public boolean f59841i;

        /* renamed from: j */
        public int f59842j;

        /* renamed from: k */
        public volatile boolean f59843k;

        /* renamed from: l */
        public long f59844l;

        @Override // io.reactivex.functions.BooleanSupplier
        /* renamed from: a */
        public boolean mo31405a() {
            return this.f59843k;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f59843k = true;
            this.f59840h.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f59840h, subscription)) {
                this.f59840h = subscription;
                this.f59834b.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            long j2;
            long j3;
            if (this.f59841i) {
                return;
            }
            this.f59841i = true;
            long j4 = this.f59844l;
            if (j4 != 0) {
                BackpressureHelper.m31812e(this, j4);
            }
            Subscriber<? super C> subscriber = this.f59834b;
            ArrayDeque<C> arrayDeque = this.f59838f;
            if (arrayDeque.isEmpty()) {
                subscriber.onComplete();
                return;
            }
            if (QueueDrainHelper.m31845e(get(), subscriber, arrayDeque, this, this)) {
                return;
            }
            do {
                j2 = get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    return;
                } else {
                    j3 = Long.MIN_VALUE | j2;
                }
            } while (!compareAndSet(j2, j3));
            if (j2 != 0) {
                QueueDrainHelper.m31845e(j3, subscriber, arrayDeque, this, this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f59841i) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f59841i = true;
            this.f59838f.clear();
            this.f59834b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f59841i) {
                return;
            }
            ArrayDeque<C> arrayDeque = this.f59838f;
            int i2 = this.f59842j;
            int i3 = i2 + 1;
            if (i2 == 0) {
                try {
                    C call = this.f59835c.call();
                    Objects.requireNonNull(call, "The bufferSupplier returned a null buffer");
                    arrayDeque.offer(call);
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            Collection collection = (Collection) arrayDeque.peek();
            if (collection != null && collection.size() + 1 == this.f59836d) {
                arrayDeque.poll();
                collection.add(t);
                this.f59844l++;
                this.f59834b.onNext(collection);
            }
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((Collection) it.next()).add(t);
            }
            if (i3 == this.f59837e) {
                i3 = 0;
            }
            this.f59842j = i3;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            long j3;
            boolean z;
            if (SubscriptionHelper.m31803h(j2)) {
                Subscriber<? super C> subscriber = this.f59834b;
                ArrayDeque<C> arrayDeque = this.f59838f;
                do {
                    j3 = get();
                } while (!compareAndSet(j3, BackpressureHelper.m31810c(Long.MAX_VALUE & j3, j2) | (j3 & Long.MIN_VALUE)));
                if (j3 == Long.MIN_VALUE) {
                    QueueDrainHelper.m31845e(j2 | Long.MIN_VALUE, subscriber, arrayDeque, this, this);
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
                if (this.f59839g.get() || !this.f59839g.compareAndSet(false, true)) {
                    this.f59840h.request(BackpressureHelper.m31811d(this.f59837e, j2));
                } else {
                    this.f59840h.request(BackpressureHelper.m31810c(this.f59836d, BackpressureHelper.m31811d(this.f59837e, j2 - 1)));
                }
            }
        }
    }

    public static final class PublisherBufferSkipSubscriber<T, C extends Collection<? super T>> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super C> f59845b;

        /* renamed from: c */
        public final Callable<C> f59846c;

        /* renamed from: d */
        public final int f59847d;

        /* renamed from: e */
        public final int f59848e;

        /* renamed from: f */
        public C f59849f;

        /* renamed from: g */
        public Subscription f59850g;

        /* renamed from: h */
        public boolean f59851h;

        /* renamed from: i */
        public int f59852i;

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f59850g.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f59850g, subscription)) {
                this.f59850g = subscription;
                this.f59845b.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f59851h) {
                return;
            }
            this.f59851h = true;
            C c2 = this.f59849f;
            this.f59849f = null;
            if (c2 != null) {
                this.f59845b.onNext(c2);
            }
            this.f59845b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f59851h) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f59851h = true;
            this.f59849f = null;
            this.f59845b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f59851h) {
                return;
            }
            C c2 = this.f59849f;
            int i2 = this.f59852i;
            int i3 = i2 + 1;
            if (i2 == 0) {
                try {
                    C call = this.f59846c.call();
                    Objects.requireNonNull(call, "The bufferSupplier returned a null buffer");
                    c2 = call;
                    this.f59849f = c2;
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    this.f59850g.cancel();
                    onError(th);
                    return;
                }
            }
            if (c2 != null) {
                c2.add(t);
                if (c2.size() == this.f59847d) {
                    this.f59849f = null;
                    this.f59845b.onNext(c2);
                }
            }
            if (i3 == this.f59848e) {
                i3 = 0;
            }
            this.f59852i = i3;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                if (get() != 0 || !compareAndSet(0, 1)) {
                    this.f59850g.request(BackpressureHelper.m31811d(this.f59848e, j2));
                    return;
                }
                this.f59850g.request(BackpressureHelper.m31810c(BackpressureHelper.m31811d(j2, this.f59847d), BackpressureHelper.m31811d(this.f59848e - this.f59847d, j2 - 1)));
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super C> subscriber) {
        this.f59782c.m31349b(new PublisherBufferExactSubscriber(subscriber, 0, null));
    }
}
