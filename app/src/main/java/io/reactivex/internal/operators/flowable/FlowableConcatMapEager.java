package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscribers.InnerQueuedSubscriber;
import io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableConcatMapEager<T, R> extends AbstractFlowableWithUpstream<T, R> {

    public static final class ConcatMapEagerDelayErrorSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, InnerQueuedSubscriberSupport<R> {

        /* renamed from: b */
        public final Subscriber<? super R> f59980b;

        /* renamed from: d */
        public final int f59982d;

        /* renamed from: e */
        public final int f59983e;

        /* renamed from: i */
        public final SpscLinkedArrayQueue<InnerQueuedSubscriber<R>> f59987i;

        /* renamed from: j */
        public Subscription f59988j;

        /* renamed from: k */
        public volatile boolean f59989k;

        /* renamed from: l */
        public volatile boolean f59990l;

        /* renamed from: m */
        public volatile InnerQueuedSubscriber<R> f59991m;

        /* renamed from: c */
        public final Function<? super T, ? extends Publisher<? extends R>> f59981c = null;

        /* renamed from: f */
        public final ErrorMode f59984f = null;

        /* renamed from: g */
        public final AtomicThrowable f59985g = new AtomicThrowable();

        /* renamed from: h */
        public final AtomicLong f59986h = new AtomicLong();

        public ConcatMapEagerDelayErrorSubscriber(Subscriber<? super R> subscriber, Function<? super T, ? extends Publisher<? extends R>> function, int i2, int i3, ErrorMode errorMode) {
            this.f59980b = subscriber;
            this.f59982d = i2;
            this.f59983e = i3;
            this.f59987i = new SpscLinkedArrayQueue<>(Math.min(i3, i2));
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        /* renamed from: a */
        public void mo31470a(InnerQueuedSubscriber<R> innerQueuedSubscriber) {
            innerQueuedSubscriber.f62741f = true;
            mo31472c();
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        /* renamed from: b */
        public void mo31471b(InnerQueuedSubscriber<R> innerQueuedSubscriber, R r) {
            if (innerQueuedSubscriber.f62740e.offer(r)) {
                mo31472c();
            } else {
                SubscriptionHelper.m31797a(innerQueuedSubscriber);
                mo31473e(innerQueuedSubscriber, new MissingBackpressureException());
            }
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        /* renamed from: c */
        public void mo31472c() {
            boolean z;
            long j2;
            long j3;
            SimpleQueue<R> simpleQueue;
            ErrorMode errorMode = ErrorMode.IMMEDIATE;
            if (getAndIncrement() != 0) {
                return;
            }
            InnerQueuedSubscriber<R> innerQueuedSubscriber = this.f59991m;
            Subscriber<? super R> subscriber = this.f59980b;
            ErrorMode errorMode2 = this.f59984f;
            int i2 = 1;
            while (true) {
                long j4 = this.f59986h.get();
                if (innerQueuedSubscriber == null) {
                    if (errorMode2 != ErrorMode.END && this.f59985g.get() != null) {
                        m31474f();
                        subscriber.onError(ExceptionHelper.m31818b(this.f59985g));
                        return;
                    }
                    boolean z2 = this.f59990l;
                    InnerQueuedSubscriber<R> poll = this.f59987i.poll();
                    if (z2 && poll == null) {
                        Throwable m31818b = ExceptionHelper.m31818b(this.f59985g);
                        if (m31818b != null) {
                            subscriber.onError(m31818b);
                            return;
                        } else {
                            subscriber.onComplete();
                            return;
                        }
                    }
                    if (poll != null) {
                        this.f59991m = poll;
                    }
                    innerQueuedSubscriber = poll;
                }
                InnerQueuedSubscriber<R> innerQueuedSubscriber2 = null;
                if (innerQueuedSubscriber == null || (simpleQueue = innerQueuedSubscriber.f62740e) == null) {
                    z = false;
                    j2 = 0;
                    j3 = 0;
                } else {
                    j3 = 0;
                    while (j3 != j4) {
                        if (this.f59989k) {
                            m31474f();
                            return;
                        }
                        if (errorMode2 == errorMode && this.f59985g.get() != null) {
                            this.f59991m = innerQueuedSubscriber2;
                            SubscriptionHelper.m31797a(innerQueuedSubscriber);
                            m31474f();
                            subscriber.onError(ExceptionHelper.m31818b(this.f59985g));
                            return;
                        }
                        boolean z3 = innerQueuedSubscriber.f62741f;
                        try {
                            R poll2 = simpleQueue.poll();
                            boolean z4 = poll2 == null;
                            if (z3 && z4) {
                                this.f59991m = innerQueuedSubscriber2;
                                this.f59988j.request(1L);
                                innerQueuedSubscriber = innerQueuedSubscriber2;
                                z = true;
                                break;
                            }
                            if (z4) {
                                break;
                            }
                            subscriber.onNext(poll2);
                            j3++;
                            if (innerQueuedSubscriber.f62743h != 1) {
                                long j5 = innerQueuedSubscriber.f62742g + 1;
                                if (j5 == innerQueuedSubscriber.f62739d) {
                                    innerQueuedSubscriber.f62742g = 0L;
                                    innerQueuedSubscriber.get().request(j5);
                                } else {
                                    innerQueuedSubscriber.f62742g = j5;
                                }
                            }
                            innerQueuedSubscriber2 = null;
                        } catch (Throwable th) {
                            Exceptions.m31402a(th);
                            this.f59991m = null;
                            SubscriptionHelper.m31797a(innerQueuedSubscriber);
                            m31474f();
                            subscriber.onError(th);
                            return;
                        }
                    }
                    z = false;
                    if (j3 == j4) {
                        if (this.f59989k) {
                            m31474f();
                            return;
                        }
                        if (errorMode2 == errorMode && this.f59985g.get() != null) {
                            this.f59991m = null;
                            SubscriptionHelper.m31797a(innerQueuedSubscriber);
                            m31474f();
                            subscriber.onError(ExceptionHelper.m31818b(this.f59985g));
                            return;
                        }
                        boolean z5 = innerQueuedSubscriber.f62741f;
                        boolean isEmpty = simpleQueue.isEmpty();
                        if (z5 && isEmpty) {
                            this.f59991m = null;
                            this.f59988j.request(1L);
                            innerQueuedSubscriber = null;
                            z = true;
                        }
                    }
                    j2 = 0;
                }
                if (j3 != j2 && j4 != Long.MAX_VALUE) {
                    this.f59986h.addAndGet(-j3);
                }
                if (!z && (i2 = addAndGet(-i2)) == 0) {
                    return;
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f59989k) {
                return;
            }
            this.f59989k = true;
            this.f59988j.cancel();
            if (getAndIncrement() == 0) {
                do {
                    m31474f();
                } while (decrementAndGet() != 0);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f59988j, subscription)) {
                this.f59988j = subscription;
                this.f59980b.mo31352d(this);
                int i2 = this.f59982d;
                subscription.request(i2 == Integer.MAX_VALUE ? Long.MAX_VALUE : i2);
            }
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        /* renamed from: e */
        public void mo31473e(InnerQueuedSubscriber<R> innerQueuedSubscriber, Throwable th) {
            if (!ExceptionHelper.m31817a(this.f59985g, th)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            innerQueuedSubscriber.f62741f = true;
            if (this.f59984f != ErrorMode.END) {
                this.f59988j.cancel();
            }
            mo31472c();
        }

        /* renamed from: f */
        public void m31474f() {
            InnerQueuedSubscriber<R> innerQueuedSubscriber = this.f59991m;
            this.f59991m = null;
            if (innerQueuedSubscriber != null) {
                SubscriptionHelper.m31797a(innerQueuedSubscriber);
            }
            while (true) {
                InnerQueuedSubscriber<R> poll = this.f59987i.poll();
                if (poll == null) {
                    return;
                } else {
                    SubscriptionHelper.m31797a(poll);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f59990l = true;
            mo31472c();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f59985g, th)) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f59990l = true;
                mo31472c();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            try {
                Publisher<? extends R> apply = this.f59981c.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                Publisher<? extends R> publisher = apply;
                InnerQueuedSubscriber<R> innerQueuedSubscriber = new InnerQueuedSubscriber<>(this, this.f59983e);
                if (this.f59989k) {
                    return;
                }
                this.f59987i.offer(innerQueuedSubscriber);
                publisher.mo31351g(innerQueuedSubscriber);
                if (this.f59989k) {
                    SubscriptionHelper.m31797a(innerQueuedSubscriber);
                    if (getAndIncrement() == 0) {
                        do {
                            m31474f();
                        } while (decrementAndGet() != 0);
                    }
                }
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f59988j.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this.f59986h, j2);
                mo31472c();
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super R> subscriber) {
        this.f59782c.m31349b(new ConcatMapEagerDelayErrorSubscriber(subscriber, null, 0, 0, null));
    }
}
