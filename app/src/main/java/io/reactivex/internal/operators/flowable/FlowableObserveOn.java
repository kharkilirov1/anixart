package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableObserveOn<T> extends AbstractFlowableWithUpstream<T, T> {

    /* renamed from: d */
    public final Scheduler f60366d;

    /* renamed from: e */
    public final boolean f60367e;

    /* renamed from: f */
    public final int f60368f;

    public static abstract class BaseObserveOnSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T>, Runnable {

        /* renamed from: b */
        public final Scheduler.Worker f60369b;

        /* renamed from: c */
        public final boolean f60370c;

        /* renamed from: d */
        public final int f60371d;

        /* renamed from: e */
        public final int f60372e;

        /* renamed from: f */
        public final AtomicLong f60373f = new AtomicLong();

        /* renamed from: g */
        public Subscription f60374g;

        /* renamed from: h */
        public SimpleQueue<T> f60375h;

        /* renamed from: i */
        public volatile boolean f60376i;

        /* renamed from: j */
        public volatile boolean f60377j;

        /* renamed from: k */
        public Throwable f60378k;

        /* renamed from: l */
        public int f60379l;

        /* renamed from: m */
        public long f60380m;

        /* renamed from: n */
        public boolean f60381n;

        public BaseObserveOnSubscriber(Scheduler.Worker worker, boolean z, int i2) {
            this.f60369b = worker;
            this.f60370c = z;
            this.f60371d = i2;
            this.f60372e = i2 - (i2 >> 2);
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public final int mo31420F(int i2) {
            if ((i2 & 2) == 0) {
                return 0;
            }
            this.f60381n = true;
            return 2;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f60376i) {
                return;
            }
            this.f60376i = true;
            this.f60374g.cancel();
            this.f60369b.mo31379f();
            if (getAndIncrement() == 0) {
                this.f60375h.clear();
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f60375h.clear();
        }

        /* renamed from: f */
        public final boolean m31534f(boolean z, boolean z2, Subscriber<?> subscriber) {
            if (this.f60376i) {
                this.f60375h.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.f60370c) {
                if (!z2) {
                    return false;
                }
                this.f60376i = true;
                Throwable th = this.f60378k;
                if (th != null) {
                    subscriber.onError(th);
                } else {
                    subscriber.onComplete();
                }
                this.f60369b.mo31379f();
                return true;
            }
            Throwable th2 = this.f60378k;
            if (th2 != null) {
                this.f60376i = true;
                this.f60375h.clear();
                subscriber.onError(th2);
                this.f60369b.mo31379f();
                return true;
            }
            if (!z2) {
                return false;
            }
            this.f60376i = true;
            subscriber.onComplete();
            this.f60369b.mo31379f();
            return true;
        }

        /* renamed from: h */
        public abstract void mo31535h();

        /* renamed from: i */
        public abstract void mo31536i();

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f60375h.isEmpty();
        }

        /* renamed from: j */
        public abstract void mo31537j();

        /* renamed from: k */
        public final void m31538k() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.f60369b.mo31382b(this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f60377j) {
                return;
            }
            this.f60377j = true;
            m31538k();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f60377j) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f60378k = th;
            this.f60377j = true;
            m31538k();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.f60377j) {
                return;
            }
            if (this.f60379l == 2) {
                m31538k();
                return;
            }
            if (!this.f60375h.offer(t)) {
                this.f60374g.cancel();
                this.f60378k = new MissingBackpressureException("Queue is full?!");
                this.f60377j = true;
            }
            m31538k();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this.f60373f, j2);
                m31538k();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f60381n) {
                mo31536i();
            } else if (this.f60379l == 1) {
                mo31537j();
            } else {
                mo31535h();
            }
        }
    }

    public static final class ObserveOnConditionalSubscriber<T> extends BaseObserveOnSubscriber<T> {

        /* renamed from: o */
        public final ConditionalSubscriber<? super T> f60382o;

        /* renamed from: p */
        public long f60383p;

        public ObserveOnConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Scheduler.Worker worker, boolean z, int i2) {
            super(worker, z, i2);
            this.f60382o = conditionalSubscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60374g, subscription)) {
                this.f60374g = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int mo31420F = queueSubscription.mo31420F(7);
                    if (mo31420F == 1) {
                        this.f60379l = 1;
                        this.f60375h = queueSubscription;
                        this.f60377j = true;
                        this.f60382o.mo31352d(this);
                        return;
                    }
                    if (mo31420F == 2) {
                        this.f60379l = 2;
                        this.f60375h = queueSubscription;
                        this.f60382o.mo31352d(this);
                        subscription.request(this.f60371d);
                        return;
                    }
                }
                this.f60375h = new SpscArrayQueue(this.f60371d);
                this.f60382o.mo31352d(this);
                subscription.request(this.f60371d);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        /* renamed from: h */
        public void mo31535h() {
            ConditionalSubscriber<? super T> conditionalSubscriber = this.f60382o;
            SimpleQueue<T> simpleQueue = this.f60375h;
            long j2 = this.f60380m;
            long j3 = this.f60383p;
            int i2 = 1;
            while (true) {
                long j4 = this.f60373f.get();
                while (j2 != j4) {
                    boolean z = this.f60377j;
                    try {
                        T poll = simpleQueue.poll();
                        boolean z2 = poll == null;
                        if (m31534f(z, z2, conditionalSubscriber)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        if (conditionalSubscriber.mo31428E(poll)) {
                            j2++;
                        }
                        j3++;
                        if (j3 == this.f60372e) {
                            this.f60374g.request(j3);
                            j3 = 0;
                        }
                    } catch (Throwable th) {
                        Exceptions.m31402a(th);
                        this.f60376i = true;
                        this.f60374g.cancel();
                        simpleQueue.clear();
                        conditionalSubscriber.onError(th);
                        this.f60369b.mo31379f();
                        return;
                    }
                }
                if (j2 == j4 && m31534f(this.f60377j, simpleQueue.isEmpty(), conditionalSubscriber)) {
                    return;
                }
                int i3 = get();
                if (i2 == i3) {
                    this.f60380m = j2;
                    this.f60383p = j3;
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else {
                    i2 = i3;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        /* renamed from: i */
        public void mo31536i() {
            int i2 = 1;
            while (!this.f60376i) {
                boolean z = this.f60377j;
                this.f60382o.onNext(null);
                if (z) {
                    this.f60376i = true;
                    Throwable th = this.f60378k;
                    if (th != null) {
                        this.f60382o.onError(th);
                    } else {
                        this.f60382o.onComplete();
                    }
                    this.f60369b.mo31379f();
                    return;
                }
                i2 = addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        /* renamed from: j */
        public void mo31537j() {
            ConditionalSubscriber<? super T> conditionalSubscriber = this.f60382o;
            SimpleQueue<T> simpleQueue = this.f60375h;
            long j2 = this.f60380m;
            int i2 = 1;
            while (true) {
                long j3 = this.f60373f.get();
                while (j2 != j3) {
                    try {
                        T poll = simpleQueue.poll();
                        if (this.f60376i) {
                            return;
                        }
                        if (poll == null) {
                            this.f60376i = true;
                            conditionalSubscriber.onComplete();
                            this.f60369b.mo31379f();
                            return;
                        } else if (conditionalSubscriber.mo31428E(poll)) {
                            j2++;
                        }
                    } catch (Throwable th) {
                        Exceptions.m31402a(th);
                        this.f60376i = true;
                        this.f60374g.cancel();
                        conditionalSubscriber.onError(th);
                        this.f60369b.mo31379f();
                        return;
                    }
                }
                if (this.f60376i) {
                    return;
                }
                if (simpleQueue.isEmpty()) {
                    this.f60376i = true;
                    conditionalSubscriber.onComplete();
                    this.f60369b.mo31379f();
                    return;
                } else {
                    int i3 = get();
                    if (i2 == i3) {
                        this.f60380m = j2;
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        i2 = i3;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            T poll = this.f60375h.poll();
            if (poll != null && this.f60379l != 1) {
                long j2 = this.f60383p + 1;
                if (j2 == this.f60372e) {
                    this.f60383p = 0L;
                    this.f60374g.request(j2);
                } else {
                    this.f60383p = j2;
                }
            }
            return poll;
        }
    }

    public static final class ObserveOnSubscriber<T> extends BaseObserveOnSubscriber<T> {

        /* renamed from: o */
        public final Subscriber<? super T> f60384o;

        public ObserveOnSubscriber(Subscriber<? super T> subscriber, Scheduler.Worker worker, boolean z, int i2) {
            super(worker, z, i2);
            this.f60384o = subscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60374g, subscription)) {
                this.f60374g = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int mo31420F = queueSubscription.mo31420F(7);
                    if (mo31420F == 1) {
                        this.f60379l = 1;
                        this.f60375h = queueSubscription;
                        this.f60377j = true;
                        this.f60384o.mo31352d(this);
                        return;
                    }
                    if (mo31420F == 2) {
                        this.f60379l = 2;
                        this.f60375h = queueSubscription;
                        this.f60384o.mo31352d(this);
                        subscription.request(this.f60371d);
                        return;
                    }
                }
                this.f60375h = new SpscArrayQueue(this.f60371d);
                this.f60384o.mo31352d(this);
                subscription.request(this.f60371d);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        /* renamed from: h */
        public void mo31535h() {
            Subscriber<? super T> subscriber = this.f60384o;
            SimpleQueue<T> simpleQueue = this.f60375h;
            long j2 = this.f60380m;
            int i2 = 1;
            while (true) {
                long j3 = this.f60373f.get();
                while (j2 != j3) {
                    boolean z = this.f60377j;
                    try {
                        T poll = simpleQueue.poll();
                        boolean z2 = poll == null;
                        if (m31534f(z, z2, subscriber)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        subscriber.onNext(poll);
                        j2++;
                        if (j2 == this.f60372e) {
                            if (j3 != Long.MAX_VALUE) {
                                j3 = this.f60373f.addAndGet(-j2);
                            }
                            this.f60374g.request(j2);
                            j2 = 0;
                        }
                    } catch (Throwable th) {
                        Exceptions.m31402a(th);
                        this.f60376i = true;
                        this.f60374g.cancel();
                        simpleQueue.clear();
                        subscriber.onError(th);
                        this.f60369b.mo31379f();
                        return;
                    }
                }
                if (j2 == j3 && m31534f(this.f60377j, simpleQueue.isEmpty(), subscriber)) {
                    return;
                }
                int i3 = get();
                if (i2 == i3) {
                    this.f60380m = j2;
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else {
                    i2 = i3;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        /* renamed from: i */
        public void mo31536i() {
            int i2 = 1;
            while (!this.f60376i) {
                boolean z = this.f60377j;
                this.f60384o.onNext(null);
                if (z) {
                    this.f60376i = true;
                    Throwable th = this.f60378k;
                    if (th != null) {
                        this.f60384o.onError(th);
                    } else {
                        this.f60384o.onComplete();
                    }
                    this.f60369b.mo31379f();
                    return;
                }
                i2 = addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        /* renamed from: j */
        public void mo31537j() {
            Subscriber<? super T> subscriber = this.f60384o;
            SimpleQueue<T> simpleQueue = this.f60375h;
            long j2 = this.f60380m;
            int i2 = 1;
            while (true) {
                long j3 = this.f60373f.get();
                while (j2 != j3) {
                    try {
                        T poll = simpleQueue.poll();
                        if (this.f60376i) {
                            return;
                        }
                        if (poll == null) {
                            this.f60376i = true;
                            subscriber.onComplete();
                            this.f60369b.mo31379f();
                            return;
                        }
                        subscriber.onNext(poll);
                        j2++;
                    } catch (Throwable th) {
                        Exceptions.m31402a(th);
                        this.f60376i = true;
                        this.f60374g.cancel();
                        subscriber.onError(th);
                        this.f60369b.mo31379f();
                        return;
                    }
                }
                if (this.f60376i) {
                    return;
                }
                if (simpleQueue.isEmpty()) {
                    this.f60376i = true;
                    subscriber.onComplete();
                    this.f60369b.mo31379f();
                    return;
                } else {
                    int i3 = get();
                    if (i2 == i3) {
                        this.f60380m = j2;
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        i2 = i3;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            T poll = this.f60375h.poll();
            if (poll != null && this.f60379l != 1) {
                long j2 = this.f60380m + 1;
                if (j2 == this.f60372e) {
                    this.f60380m = 0L;
                    this.f60374g.request(j2);
                } else {
                    this.f60380m = j2;
                }
            }
            return poll;
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        Scheduler.Worker mo31374a = this.f60366d.mo31374a();
        if (subscriber instanceof ConditionalSubscriber) {
            this.f59782c.m31349b(new ObserveOnConditionalSubscriber((ConditionalSubscriber) subscriber, mo31374a, this.f60367e, this.f60368f));
        } else {
            this.f59782c.m31349b(new ObserveOnSubscriber(subscriber, mo31374a, this.f60367e, this.f60368f));
        }
    }
}
