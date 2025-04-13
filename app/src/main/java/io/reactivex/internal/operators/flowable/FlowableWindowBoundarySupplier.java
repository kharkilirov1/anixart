package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.DisposableSubscriber;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableWindowBoundarySupplier<T, B> extends AbstractFlowableWithUpstream<T, Flowable<T>> {

    public static final class WindowBoundaryInnerSubscriber<T, B> extends DisposableSubscriber<B> {

        /* renamed from: c */
        public final WindowBoundaryMainSubscriber<T, B> f60861c;

        /* renamed from: d */
        public boolean f60862d;

        public WindowBoundaryInnerSubscriber(WindowBoundaryMainSubscriber<T, B> windowBoundaryMainSubscriber) {
            this.f60861c = windowBoundaryMainSubscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f60862d) {
                return;
            }
            this.f60862d = true;
            WindowBoundaryMainSubscriber<T, B> windowBoundaryMainSubscriber = this.f60861c;
            windowBoundaryMainSubscriber.f60874k.cancel();
            windowBoundaryMainSubscriber.f60875l = true;
            windowBoundaryMainSubscriber.m31603b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60862d) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f60862d = true;
            WindowBoundaryMainSubscriber<T, B> windowBoundaryMainSubscriber = this.f60861c;
            windowBoundaryMainSubscriber.f60874k.cancel();
            if (!ExceptionHelper.m31817a(windowBoundaryMainSubscriber.f60870g, th)) {
                RxJavaPlugins.m31848b(th);
            } else {
                windowBoundaryMainSubscriber.f60875l = true;
                windowBoundaryMainSubscriber.m31603b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(B b) {
            if (this.f60862d) {
                return;
            }
            this.f60862d = true;
            SubscriptionHelper.m31797a(this.f62988b);
            WindowBoundaryMainSubscriber<T, B> windowBoundaryMainSubscriber = this.f60861c;
            windowBoundaryMainSubscriber.f60867d.compareAndSet(this, null);
            windowBoundaryMainSubscriber.f60869f.offer(WindowBoundaryMainSubscriber.f60864p);
            windowBoundaryMainSubscriber.m31603b();
        }
    }

    public static final class WindowBoundaryMainSubscriber<T, B> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, Runnable {

        /* renamed from: o */
        public static final WindowBoundaryInnerSubscriber<Object, Object> f60863o = new WindowBoundaryInnerSubscriber<>(null);

        /* renamed from: p */
        public static final Object f60864p = new Object();

        /* renamed from: b */
        public final Subscriber<? super Flowable<T>> f60865b;

        /* renamed from: c */
        public final int f60866c;

        /* renamed from: d */
        public final AtomicReference<WindowBoundaryInnerSubscriber<T, B>> f60867d = new AtomicReference<>();

        /* renamed from: e */
        public final AtomicInteger f60868e = new AtomicInteger(1);

        /* renamed from: f */
        public final MpscLinkedQueue<Object> f60869f = new MpscLinkedQueue<>();

        /* renamed from: g */
        public final AtomicThrowable f60870g = new AtomicThrowable();

        /* renamed from: h */
        public final AtomicBoolean f60871h = new AtomicBoolean();

        /* renamed from: i */
        public final Callable<? extends Publisher<B>> f60872i = null;

        /* renamed from: j */
        public final AtomicLong f60873j = new AtomicLong();

        /* renamed from: k */
        public Subscription f60874k;

        /* renamed from: l */
        public volatile boolean f60875l;

        /* renamed from: m */
        public UnicastProcessor<T> f60876m;

        /* renamed from: n */
        public long f60877n;

        public WindowBoundaryMainSubscriber(Subscriber<? super Flowable<T>> subscriber, int i2, Callable<? extends Publisher<B>> callable) {
            this.f60865b = subscriber;
            this.f60866c = i2;
        }

        /* renamed from: a */
        public void m31602a() {
            AtomicReference<WindowBoundaryInnerSubscriber<T, B>> atomicReference = this.f60867d;
            WindowBoundaryInnerSubscriber<Object, Object> windowBoundaryInnerSubscriber = f60863o;
            Disposable disposable = (Disposable) atomicReference.getAndSet(windowBoundaryInnerSubscriber);
            if (disposable == null || disposable == windowBoundaryInnerSubscriber) {
                return;
            }
            disposable.mo31379f();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public void m31603b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super Flowable<T>> subscriber = this.f60865b;
            MpscLinkedQueue<Object> mpscLinkedQueue = this.f60869f;
            AtomicThrowable atomicThrowable = this.f60870g;
            long j2 = this.f60877n;
            int i2 = 1;
            while (this.f60868e.get() != 0) {
                UnicastProcessor<T> unicastProcessor = this.f60876m;
                boolean z = this.f60875l;
                if (z && atomicThrowable.get() != null) {
                    mpscLinkedQueue.clear();
                    Throwable m31818b = ExceptionHelper.m31818b(atomicThrowable);
                    if (unicastProcessor != 0) {
                        this.f60876m = null;
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
                            this.f60876m = null;
                            unicastProcessor.onComplete();
                        }
                        subscriber.onComplete();
                        return;
                    }
                    if (unicastProcessor != 0) {
                        this.f60876m = null;
                        unicastProcessor.onError(m31818b2);
                    }
                    subscriber.onError(m31818b2);
                    return;
                }
                if (z2) {
                    this.f60877n = j2;
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else if (poll != f60864p) {
                    unicastProcessor.onNext(poll);
                } else {
                    if (unicastProcessor != 0) {
                        this.f60876m = null;
                        unicastProcessor.onComplete();
                    }
                    if (!this.f60871h.get()) {
                        if (j2 != this.f60873j.get()) {
                            int i3 = this.f60866c;
                            int i4 = UnicastProcessor.f62881n;
                            UnicastProcessor<T> unicastProcessor2 = new UnicastProcessor<>(i3, this, true);
                            this.f60876m = unicastProcessor2;
                            this.f60868e.getAndIncrement();
                            try {
                                Publisher<B> call = this.f60872i.call();
                                Objects.requireNonNull(call, "The other Callable returned a null Publisher");
                                Publisher<B> publisher = call;
                                WindowBoundaryInnerSubscriber<T, B> windowBoundaryInnerSubscriber = new WindowBoundaryInnerSubscriber<>(this);
                                if (this.f60867d.compareAndSet(null, windowBoundaryInnerSubscriber)) {
                                    publisher.mo31351g(windowBoundaryInnerSubscriber);
                                    j2++;
                                    subscriber.onNext(unicastProcessor2);
                                }
                            } catch (Throwable th) {
                                Exceptions.m31402a(th);
                                ExceptionHelper.m31817a(atomicThrowable, th);
                                this.f60875l = true;
                            }
                        } else {
                            this.f60874k.cancel();
                            m31602a();
                            ExceptionHelper.m31817a(atomicThrowable, new MissingBackpressureException("Could not deliver a window due to lack of requests"));
                            this.f60875l = true;
                        }
                    }
                }
            }
            mpscLinkedQueue.clear();
            this.f60876m = null;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f60871h.compareAndSet(false, true)) {
                m31602a();
                if (this.f60868e.decrementAndGet() == 0) {
                    this.f60874k.cancel();
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60874k, subscription)) {
                this.f60874k = subscription;
                this.f60865b.mo31352d(this);
                this.f60869f.offer(f60864p);
                m31603b();
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            m31602a();
            this.f60875l = true;
            m31603b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            m31602a();
            if (!ExceptionHelper.m31817a(this.f60870g, th)) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f60875l = true;
                m31603b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.f60869f.offer(t);
            m31603b();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            BackpressureHelper.m31808a(this.f60873j, j2);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f60868e.decrementAndGet() == 0) {
                this.f60874k.cancel();
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super Flowable<T>> subscriber) {
        this.f59782c.m31349b(new WindowBoundaryMainSubscriber(subscriber, 0, null));
    }
}
