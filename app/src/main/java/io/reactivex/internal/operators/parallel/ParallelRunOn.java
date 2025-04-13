package io.reactivex.internal.operators.parallel;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class ParallelRunOn<T> extends ParallelFlowable<T> {

    public static abstract class BaseRunOnSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, Runnable {

        /* renamed from: b */
        public final int f62412b;

        /* renamed from: c */
        public final int f62413c;

        /* renamed from: d */
        public final SpscArrayQueue<T> f62414d;

        /* renamed from: e */
        public final Scheduler.Worker f62415e;

        /* renamed from: f */
        public Subscription f62416f;

        /* renamed from: g */
        public volatile boolean f62417g;

        /* renamed from: h */
        public Throwable f62418h;

        /* renamed from: i */
        public final AtomicLong f62419i;

        /* renamed from: j */
        public volatile boolean f62420j;

        /* renamed from: k */
        public int f62421k;

        /* renamed from: a */
        public final void m31755a() {
            if (getAndIncrement() == 0) {
                this.f62415e.mo31382b(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f62420j) {
                return;
            }
            this.f62420j = true;
            this.f62416f.cancel();
            this.f62415e.mo31379f();
            if (getAndIncrement() == 0) {
                this.f62414d.clear();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f62417g) {
                return;
            }
            this.f62417g = true;
            m31755a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f62417g) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f62418h = th;
            this.f62417g = true;
            m31755a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.f62417g) {
                return;
            }
            if (this.f62414d.offer(t)) {
                m31755a();
            } else {
                this.f62416f.cancel();
                onError(new MissingBackpressureException("Queue is full?!"));
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this.f62419i, j2);
                m31755a();
            }
        }
    }

    public final class MultiWorkerCallback implements SchedulerMultiWorkerSupport.WorkerCallback {
    }

    public static final class RunOnConditionalSubscriber<T> extends BaseRunOnSubscriber<T> {

        /* renamed from: l */
        public final ConditionalSubscriber<? super T> f62422l;

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f62416f, subscription)) {
                this.f62416f = subscription;
                this.f62422l.mo31352d(this);
                subscription.request(this.f62412b);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th;
            int i2 = this.f62421k;
            SpscArrayQueue<T> spscArrayQueue = this.f62414d;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.f62422l;
            int i3 = this.f62413c;
            int i4 = 1;
            while (true) {
                long j2 = this.f62419i.get();
                long j3 = 0;
                while (j3 != j2) {
                    if (this.f62420j) {
                        spscArrayQueue.clear();
                        return;
                    }
                    boolean z = this.f62417g;
                    if (z && (th = this.f62418h) != null) {
                        spscArrayQueue.clear();
                        conditionalSubscriber.onError(th);
                        this.f62415e.mo31379f();
                        return;
                    }
                    T poll = spscArrayQueue.poll();
                    boolean z2 = poll == null;
                    if (z && z2) {
                        conditionalSubscriber.onComplete();
                        this.f62415e.mo31379f();
                        return;
                    } else {
                        if (z2) {
                            break;
                        }
                        if (conditionalSubscriber.mo31428E(poll)) {
                            j3++;
                        }
                        i2++;
                        if (i2 == i3) {
                            this.f62416f.request(i2);
                            i2 = 0;
                        }
                    }
                }
                if (j3 == j2) {
                    if (this.f62420j) {
                        spscArrayQueue.clear();
                        return;
                    }
                    if (this.f62417g) {
                        Throwable th2 = this.f62418h;
                        if (th2 != null) {
                            spscArrayQueue.clear();
                            conditionalSubscriber.onError(th2);
                            this.f62415e.mo31379f();
                            return;
                        } else if (spscArrayQueue.isEmpty()) {
                            conditionalSubscriber.onComplete();
                            this.f62415e.mo31379f();
                            return;
                        }
                    }
                }
                if (j3 != 0 && j2 != Long.MAX_VALUE) {
                    this.f62419i.addAndGet(-j3);
                }
                int i5 = get();
                if (i5 == i4) {
                    this.f62421k = i2;
                    i4 = addAndGet(-i4);
                    if (i4 == 0) {
                        return;
                    }
                } else {
                    i4 = i5;
                }
            }
        }
    }

    public static final class RunOnSubscriber<T> extends BaseRunOnSubscriber<T> {

        /* renamed from: l */
        public final Subscriber<? super T> f62423l;

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f62416f, subscription)) {
                this.f62416f = subscription;
                this.f62423l.mo31352d(this);
                subscription.request(this.f62412b);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th;
            int i2 = this.f62421k;
            SpscArrayQueue<T> spscArrayQueue = this.f62414d;
            Subscriber<? super T> subscriber = this.f62423l;
            int i3 = this.f62413c;
            int i4 = 1;
            while (true) {
                long j2 = this.f62419i.get();
                long j3 = 0;
                while (j3 != j2) {
                    if (this.f62420j) {
                        spscArrayQueue.clear();
                        return;
                    }
                    boolean z = this.f62417g;
                    if (z && (th = this.f62418h) != null) {
                        spscArrayQueue.clear();
                        subscriber.onError(th);
                        this.f62415e.mo31379f();
                        return;
                    }
                    T poll = spscArrayQueue.poll();
                    boolean z2 = poll == null;
                    if (z && z2) {
                        subscriber.onComplete();
                        this.f62415e.mo31379f();
                        return;
                    } else {
                        if (z2) {
                            break;
                        }
                        subscriber.onNext(poll);
                        j3++;
                        i2++;
                        if (i2 == i3) {
                            this.f62416f.request(i2);
                            i2 = 0;
                        }
                    }
                }
                if (j3 == j2) {
                    if (this.f62420j) {
                        spscArrayQueue.clear();
                        return;
                    }
                    if (this.f62417g) {
                        Throwable th2 = this.f62418h;
                        if (th2 != null) {
                            spscArrayQueue.clear();
                            subscriber.onError(th2);
                            this.f62415e.mo31379f();
                            return;
                        } else if (spscArrayQueue.isEmpty()) {
                            subscriber.onComplete();
                            this.f62415e.mo31379f();
                            return;
                        }
                    }
                }
                if (j3 != 0 && j2 != Long.MAX_VALUE) {
                    this.f62419i.addAndGet(-j3);
                }
                int i5 = get();
                if (i5 == i4) {
                    this.f62421k = i2;
                    i4 = addAndGet(-i4);
                    if (i4 == 0) {
                        return;
                    }
                } else {
                    i4 = i5;
                }
            }
        }
    }
}
