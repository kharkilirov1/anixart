package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableBufferBoundary<T, U extends Collection<? super T>, Open, Close> extends AbstractFlowableWithUpstream<T, U> {

    public static final class BufferBoundarySubscriber<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super C> f59853b;

        /* renamed from: j */
        public volatile boolean f59861j;

        /* renamed from: l */
        public volatile boolean f59863l;

        /* renamed from: m */
        public long f59864m;

        /* renamed from: o */
        public long f59866o;

        /* renamed from: c */
        public final Callable<C> f59854c = null;

        /* renamed from: d */
        public final Publisher<? extends Open> f59855d = null;

        /* renamed from: e */
        public final Function<? super Open, ? extends Publisher<? extends Close>> f59856e = null;

        /* renamed from: k */
        public final SpscLinkedArrayQueue<C> f59862k = new SpscLinkedArrayQueue<>(Flowable.f59569b);

        /* renamed from: f */
        public final CompositeDisposable f59857f = new CompositeDisposable();

        /* renamed from: g */
        public final AtomicLong f59858g = new AtomicLong();

        /* renamed from: h */
        public final AtomicReference<Subscription> f59859h = new AtomicReference<>();

        /* renamed from: n */
        public Map<Long, C> f59865n = new LinkedHashMap();

        /* renamed from: i */
        public final AtomicThrowable f59860i = new AtomicThrowable();

        public static final class BufferOpenSubscriber<Open> extends AtomicReference<Subscription> implements FlowableSubscriber<Open>, Disposable {

            /* renamed from: b */
            public final BufferBoundarySubscriber<?, ?, Open, ?> f59867b;

            public BufferOpenSubscriber(BufferBoundarySubscriber<?, ?, Open, ?> bufferBoundarySubscriber) {
                this.f59867b = bufferBoundarySubscriber;
            }

            @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
            /* renamed from: d */
            public void mo31352d(Subscription subscription) {
                SubscriptionHelper.m31802f(this, subscription, Long.MAX_VALUE);
            }

            @Override // io.reactivex.disposables.Disposable
            /* renamed from: f */
            public void mo31379f() {
                SubscriptionHelper.m31797a(this);
            }

            @Override // org.reactivestreams.Subscriber
            public void onComplete() {
                lazySet(SubscriptionHelper.CANCELLED);
                BufferBoundarySubscriber<?, ?, Open, ?> bufferBoundarySubscriber = this.f59867b;
                bufferBoundarySubscriber.f59857f.mo31394c(this);
                if (bufferBoundarySubscriber.f59857f.m31396e() == 0) {
                    SubscriptionHelper.m31797a(bufferBoundarySubscriber.f59859h);
                    bufferBoundarySubscriber.f59861j = true;
                    bufferBoundarySubscriber.m31455b();
                }
            }

            @Override // org.reactivestreams.Subscriber
            public void onError(Throwable th) {
                lazySet(SubscriptionHelper.CANCELLED);
                BufferBoundarySubscriber<?, ?, Open, ?> bufferBoundarySubscriber = this.f59867b;
                SubscriptionHelper.m31797a(bufferBoundarySubscriber.f59859h);
                bufferBoundarySubscriber.f59857f.mo31394c(this);
                bufferBoundarySubscriber.onError(th);
            }

            @Override // org.reactivestreams.Subscriber
            public void onNext(Open open) {
                BufferBoundarySubscriber<?, ?, Open, ?> bufferBoundarySubscriber = this.f59867b;
                Objects.requireNonNull(bufferBoundarySubscriber);
                try {
                    Object call = bufferBoundarySubscriber.f59854c.call();
                    Objects.requireNonNull(call, "The bufferSupplier returned a null Collection");
                    Collection collection = (Collection) call;
                    Publisher<? extends Object> apply = bufferBoundarySubscriber.f59856e.apply(open);
                    Objects.requireNonNull(apply, "The bufferClose returned a null Publisher");
                    Publisher<? extends Object> publisher = apply;
                    long j2 = bufferBoundarySubscriber.f59864m;
                    bufferBoundarySubscriber.f59864m = 1 + j2;
                    synchronized (bufferBoundarySubscriber) {
                        Map<Long, ?> map = bufferBoundarySubscriber.f59865n;
                        if (map != null) {
                            map.put(Long.valueOf(j2), collection);
                            BufferCloseSubscriber bufferCloseSubscriber = new BufferCloseSubscriber(bufferBoundarySubscriber, j2);
                            bufferBoundarySubscriber.f59857f.mo31393b(bufferCloseSubscriber);
                            publisher.mo31351g(bufferCloseSubscriber);
                        }
                    }
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    SubscriptionHelper.m31797a(bufferBoundarySubscriber.f59859h);
                    bufferBoundarySubscriber.onError(th);
                }
            }

            @Override // io.reactivex.disposables.Disposable
            /* renamed from: s */
            public boolean mo31380s() {
                return get() == SubscriptionHelper.CANCELLED;
            }
        }

        public BufferBoundarySubscriber(Subscriber<? super C> subscriber, Publisher<? extends Open> publisher, Function<? super Open, ? extends Publisher<? extends Close>> function, Callable<C> callable) {
            this.f59853b = subscriber;
        }

        /* renamed from: a */
        public void m31454a(BufferCloseSubscriber<T, C> bufferCloseSubscriber, long j2) {
            boolean z;
            this.f59857f.mo31394c(bufferCloseSubscriber);
            if (this.f59857f.m31396e() == 0) {
                SubscriptionHelper.m31797a(this.f59859h);
                z = true;
            } else {
                z = false;
            }
            synchronized (this) {
                Map<Long, C> map = this.f59865n;
                if (map == null) {
                    return;
                }
                this.f59862k.offer(map.remove(Long.valueOf(j2)));
                if (z) {
                    this.f59861j = true;
                }
                m31455b();
            }
        }

        /* renamed from: b */
        public void m31455b() {
            if (getAndIncrement() != 0) {
                return;
            }
            long j2 = this.f59866o;
            Subscriber<? super C> subscriber = this.f59853b;
            SpscLinkedArrayQueue<C> spscLinkedArrayQueue = this.f59862k;
            int i2 = 1;
            do {
                long j3 = this.f59858g.get();
                while (j2 != j3) {
                    if (this.f59863l) {
                        spscLinkedArrayQueue.clear();
                        return;
                    }
                    boolean z = this.f59861j;
                    if (z && this.f59860i.get() != null) {
                        spscLinkedArrayQueue.clear();
                        subscriber.onError(ExceptionHelper.m31818b(this.f59860i));
                        return;
                    }
                    C poll = spscLinkedArrayQueue.poll();
                    boolean z2 = poll == null;
                    if (z && z2) {
                        subscriber.onComplete();
                        return;
                    } else {
                        if (z2) {
                            break;
                        }
                        subscriber.onNext(poll);
                        j2++;
                    }
                }
                if (j2 == j3) {
                    if (this.f59863l) {
                        spscLinkedArrayQueue.clear();
                        return;
                    }
                    if (this.f59861j) {
                        if (this.f59860i.get() != null) {
                            spscLinkedArrayQueue.clear();
                            subscriber.onError(ExceptionHelper.m31818b(this.f59860i));
                            return;
                        } else if (spscLinkedArrayQueue.isEmpty()) {
                            subscriber.onComplete();
                            return;
                        }
                    }
                }
                this.f59866o = j2;
                i2 = addAndGet(-i2);
            } while (i2 != 0);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (SubscriptionHelper.m31797a(this.f59859h)) {
                this.f59863l = true;
                this.f59857f.mo31379f();
                synchronized (this) {
                    this.f59865n = null;
                }
                if (getAndIncrement() != 0) {
                    this.f59862k.clear();
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31801e(this.f59859h, subscription)) {
                BufferOpenSubscriber bufferOpenSubscriber = new BufferOpenSubscriber(this);
                this.f59857f.mo31393b(bufferOpenSubscriber);
                this.f59855d.mo31351g(bufferOpenSubscriber);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f59857f.mo31379f();
            synchronized (this) {
                Map<Long, C> map = this.f59865n;
                if (map == null) {
                    return;
                }
                Iterator<C> it = map.values().iterator();
                while (it.hasNext()) {
                    this.f59862k.offer(it.next());
                }
                this.f59865n = null;
                this.f59861j = true;
                m31455b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f59860i, th)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f59857f.mo31379f();
            synchronized (this) {
                this.f59865n = null;
            }
            this.f59861j = true;
            m31455b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            synchronized (this) {
                Map<Long, C> map = this.f59865n;
                if (map == null) {
                    return;
                }
                Iterator<C> it = map.values().iterator();
                while (it.hasNext()) {
                    it.next().add(t);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            BackpressureHelper.m31808a(this.f59858g, j2);
            m31455b();
        }
    }

    public static final class BufferCloseSubscriber<T, C extends Collection<? super T>> extends AtomicReference<Subscription> implements FlowableSubscriber<Object>, Disposable {

        /* renamed from: b */
        public final BufferBoundarySubscriber<T, C, ?, ?> f59868b;

        /* renamed from: c */
        public final long f59869c;

        public BufferCloseSubscriber(BufferBoundarySubscriber<T, C, ?, ?> bufferBoundarySubscriber, long j2) {
            this.f59868b = bufferBoundarySubscriber;
            this.f59869c = j2;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            SubscriptionHelper.m31802f(this, subscription, Long.MAX_VALUE);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            SubscriptionHelper.m31797a(this);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            Subscription subscription = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription != subscriptionHelper) {
                lazySet(subscriptionHelper);
                this.f59868b.m31454a(this, this.f59869c);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            Subscription subscription = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription == subscriptionHelper) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            lazySet(subscriptionHelper);
            BufferBoundarySubscriber<T, C, ?, ?> bufferBoundarySubscriber = this.f59868b;
            SubscriptionHelper.m31797a(bufferBoundarySubscriber.f59859h);
            bufferBoundarySubscriber.f59857f.mo31394c(this);
            bufferBoundarySubscriber.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            Subscription subscription = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription != subscriptionHelper) {
                lazySet(subscriptionHelper);
                subscription.cancel();
                this.f59868b.m31454a(this, this.f59869c);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return get() == SubscriptionHelper.CANCELLED;
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super U> subscriber) {
        BufferBoundarySubscriber bufferBoundarySubscriber = new BufferBoundarySubscriber(subscriber, null, null, null);
        subscriber.mo31352d(bufferBoundarySubscriber);
        this.f59782c.m31349b(bufferBoundarySubscriber);
    }
}
