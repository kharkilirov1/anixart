package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.DisposableSubscriber;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableWindowBoundary<T, B> extends AbstractFlowableWithUpstream<T, Flowable<T>> {

    public static final class WindowBoundaryInnerSubscriber<T, B> extends DisposableSubscriber<B> {

        /* renamed from: c */
        public final WindowBoundaryMainSubscriber<T, B> f60831c;

        /* renamed from: d */
        public boolean f60832d;

        public WindowBoundaryInnerSubscriber(WindowBoundaryMainSubscriber<T, B> windowBoundaryMainSubscriber) {
            this.f60831c = windowBoundaryMainSubscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f60832d) {
                return;
            }
            this.f60832d = true;
            WindowBoundaryMainSubscriber<T, B> windowBoundaryMainSubscriber = this.f60831c;
            SubscriptionHelper.m31797a(windowBoundaryMainSubscriber.f60837e);
            windowBoundaryMainSubscriber.f60843k = true;
            windowBoundaryMainSubscriber.m31600a();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60832d) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f60832d = true;
            WindowBoundaryMainSubscriber<T, B> windowBoundaryMainSubscriber = this.f60831c;
            SubscriptionHelper.m31797a(windowBoundaryMainSubscriber.f60837e);
            if (!ExceptionHelper.m31817a(windowBoundaryMainSubscriber.f60840h, th)) {
                RxJavaPlugins.m31848b(th);
            } else {
                windowBoundaryMainSubscriber.f60843k = true;
                windowBoundaryMainSubscriber.m31600a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(B b) {
            if (this.f60832d) {
                return;
            }
            WindowBoundaryMainSubscriber<T, B> windowBoundaryMainSubscriber = this.f60831c;
            windowBoundaryMainSubscriber.f60839g.offer(WindowBoundaryMainSubscriber.f60833n);
            windowBoundaryMainSubscriber.m31600a();
        }
    }

    public static final class WindowBoundaryMainSubscriber<T, B> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, Runnable {

        /* renamed from: n */
        public static final Object f60833n = new Object();

        /* renamed from: b */
        public final Subscriber<? super Flowable<T>> f60834b;

        /* renamed from: c */
        public final int f60835c;

        /* renamed from: d */
        public final WindowBoundaryInnerSubscriber<T, B> f60836d = new WindowBoundaryInnerSubscriber<>(this);

        /* renamed from: e */
        public final AtomicReference<Subscription> f60837e = new AtomicReference<>();

        /* renamed from: f */
        public final AtomicInteger f60838f = new AtomicInteger(1);

        /* renamed from: g */
        public final MpscLinkedQueue<Object> f60839g = new MpscLinkedQueue<>();

        /* renamed from: h */
        public final AtomicThrowable f60840h = new AtomicThrowable();

        /* renamed from: i */
        public final AtomicBoolean f60841i = new AtomicBoolean();

        /* renamed from: j */
        public final AtomicLong f60842j = new AtomicLong();

        /* renamed from: k */
        public volatile boolean f60843k;

        /* renamed from: l */
        public UnicastProcessor<T> f60844l;

        /* renamed from: m */
        public long f60845m;

        public WindowBoundaryMainSubscriber(Subscriber<? super Flowable<T>> subscriber, int i2) {
            this.f60834b = subscriber;
            this.f60835c = i2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public void m31600a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super Flowable<T>> subscriber = this.f60834b;
            MpscLinkedQueue<Object> mpscLinkedQueue = this.f60839g;
            AtomicThrowable atomicThrowable = this.f60840h;
            long j2 = this.f60845m;
            int i2 = 1;
            while (this.f60838f.get() != 0) {
                UnicastProcessor<T> unicastProcessor = this.f60844l;
                boolean z = this.f60843k;
                if (z && atomicThrowable.get() != null) {
                    mpscLinkedQueue.clear();
                    Throwable m31818b = ExceptionHelper.m31818b(atomicThrowable);
                    if (unicastProcessor != 0) {
                        this.f60844l = null;
                        unicastProcessor.onError(m31818b);
                    }
                    subscriber.onError(m31818b);
                    return;
                }
                Object poll = mpscLinkedQueue.poll();
                boolean z2 = poll == null;
                if (z && z2) {
                    Throwable m31818b2 = ExceptionHelper.m31818b(atomicThrowable);
                    if (m31818b2 == null) {
                        if (unicastProcessor != 0) {
                            this.f60844l = null;
                            unicastProcessor.onComplete();
                        }
                        subscriber.onComplete();
                        return;
                    }
                    if (unicastProcessor != 0) {
                        this.f60844l = null;
                        unicastProcessor.onError(m31818b2);
                    }
                    subscriber.onError(m31818b2);
                    return;
                }
                if (z2) {
                    this.f60845m = j2;
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else if (poll != f60833n) {
                    unicastProcessor.onNext(poll);
                } else {
                    if (unicastProcessor != 0) {
                        this.f60844l = null;
                        unicastProcessor.onComplete();
                    }
                    if (!this.f60841i.get()) {
                        int i3 = this.f60835c;
                        int i4 = UnicastProcessor.f62881n;
                        UnicastProcessor<T> unicastProcessor2 = new UnicastProcessor<>(i3, this, true);
                        this.f60844l = unicastProcessor2;
                        this.f60838f.getAndIncrement();
                        if (j2 != this.f60842j.get()) {
                            j2++;
                            subscriber.onNext(unicastProcessor2);
                        } else {
                            SubscriptionHelper.m31797a(this.f60837e);
                            SubscriptionHelper.m31797a(this.f60836d.f62988b);
                            ExceptionHelper.m31817a(atomicThrowable, new MissingBackpressureException("Could not deliver a window due to lack of requests"));
                            this.f60843k = true;
                        }
                    }
                }
            }
            mpscLinkedQueue.clear();
            this.f60844l = null;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f60841i.compareAndSet(false, true)) {
                SubscriptionHelper.m31797a(this.f60836d.f62988b);
                if (this.f60838f.decrementAndGet() == 0) {
                    SubscriptionHelper.m31797a(this.f60837e);
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            SubscriptionHelper.m31802f(this.f60837e, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            SubscriptionHelper.m31797a(this.f60836d.f62988b);
            this.f60843k = true;
            m31600a();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            SubscriptionHelper.m31797a(this.f60836d.f62988b);
            if (!ExceptionHelper.m31817a(this.f60840h, th)) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f60843k = true;
                m31600a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.f60839g.offer(t);
            m31600a();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            BackpressureHelper.m31808a(this.f60842j, j2);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f60838f.decrementAndGet() == 0) {
                SubscriptionHelper.m31797a(this.f60837e);
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super Flowable<T>> subscriber) {
        WindowBoundaryMainSubscriber windowBoundaryMainSubscriber = new WindowBoundaryMainSubscriber(subscriber, 0);
        subscriber.mo31352d(windowBoundaryMainSubscriber);
        windowBoundaryMainSubscriber.f60839g.offer(WindowBoundaryMainSubscriber.f60833n);
        windowBoundaryMainSubscriber.m31600a();
        throw null;
    }
}
