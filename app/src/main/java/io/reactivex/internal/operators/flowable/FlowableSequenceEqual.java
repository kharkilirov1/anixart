package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableSequenceEqual<T> extends Flowable<Boolean> {

    public static final class EqualCoordinator<T> extends DeferredScalarSubscription<Boolean> implements EqualCoordinatorHelper {

        /* renamed from: d */
        public final BiPredicate<? super T, ? super T> f60589d;

        /* renamed from: e */
        public final EqualSubscriber<T> f60590e;

        /* renamed from: f */
        public final EqualSubscriber<T> f60591f;

        /* renamed from: g */
        public final AtomicThrowable f60592g;

        /* renamed from: h */
        public final AtomicInteger f60593h;

        /* renamed from: i */
        public T f60594i;

        /* renamed from: j */
        public T f60595j;

        public EqualCoordinator(Subscriber<? super Boolean> subscriber, int i2, BiPredicate<? super T, ? super T> biPredicate) {
            super(subscriber);
            this.f60589d = null;
            this.f60593h = new AtomicInteger();
            this.f60590e = new EqualSubscriber<>(this, i2);
            this.f60591f = new EqualSubscriber<>(this, i2);
            this.f60592g = new AtomicThrowable();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        /* renamed from: b */
        public void mo31580b(Throwable th) {
            if (ExceptionHelper.m31817a(this.f60592g, th)) {
                mo31581c();
            } else {
                RxJavaPlugins.m31848b(th);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        /* renamed from: c */
        public void mo31581c() {
            if (this.f60593h.getAndIncrement() != 0) {
                return;
            }
            int i2 = 1;
            do {
                SimpleQueue<T> simpleQueue = this.f60590e.f60600f;
                SimpleQueue<T> simpleQueue2 = this.f60591f.f60600f;
                if (simpleQueue != null && simpleQueue2 != null) {
                    while (!m31790h()) {
                        if (this.f60592g.get() != null) {
                            m31582i();
                            this.f62765b.onError(ExceptionHelper.m31818b(this.f60592g));
                            return;
                        }
                        boolean z = this.f60590e.f60601g;
                        T t = this.f60594i;
                        if (t == null) {
                            try {
                                t = simpleQueue.poll();
                                this.f60594i = t;
                            } catch (Throwable th) {
                                Exceptions.m31402a(th);
                                m31582i();
                                ExceptionHelper.m31817a(this.f60592g, th);
                                this.f62765b.onError(ExceptionHelper.m31818b(this.f60592g));
                                return;
                            }
                        }
                        boolean z2 = t == null;
                        boolean z3 = this.f60591f.f60601g;
                        T t2 = this.f60595j;
                        if (t2 == null) {
                            try {
                                t2 = simpleQueue2.poll();
                                this.f60595j = t2;
                            } catch (Throwable th2) {
                                Exceptions.m31402a(th2);
                                m31582i();
                                ExceptionHelper.m31817a(this.f60592g, th2);
                                this.f62765b.onError(ExceptionHelper.m31818b(this.f60592g));
                                return;
                            }
                        }
                        boolean z4 = t2 == null;
                        if (z && z3 && z2 && z4) {
                            m31789f(Boolean.TRUE);
                            return;
                        }
                        if (z && z3 && z2 != z4) {
                            m31582i();
                            m31789f(Boolean.FALSE);
                            return;
                        }
                        if (!z2 && !z4) {
                            try {
                                if (!this.f60589d.mo31404a(t, t2)) {
                                    m31582i();
                                    m31789f(Boolean.FALSE);
                                    return;
                                } else {
                                    this.f60594i = null;
                                    this.f60595j = null;
                                    this.f60590e.m31584b();
                                    this.f60591f.m31584b();
                                }
                            } catch (Throwable th3) {
                                Exceptions.m31402a(th3);
                                m31582i();
                                ExceptionHelper.m31817a(this.f60592g, th3);
                                this.f62765b.onError(ExceptionHelper.m31818b(this.f60592g));
                                return;
                            }
                        }
                    }
                    this.f60590e.m31583a();
                    this.f60591f.m31583a();
                    return;
                }
                if (m31790h()) {
                    this.f60590e.m31583a();
                    this.f60591f.m31583a();
                    return;
                } else if (this.f60592g.get() != null) {
                    m31582i();
                    this.f62765b.onError(ExceptionHelper.m31818b(this.f60592g));
                    return;
                }
                i2 = this.f60593h.addAndGet(-i2);
            } while (i2 != 0);
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
            super.cancel();
            SubscriptionHelper.m31797a(this.f60590e);
            SubscriptionHelper.m31797a(this.f60591f);
            if (this.f60593h.getAndIncrement() == 0) {
                this.f60590e.m31583a();
                this.f60591f.m31583a();
            }
        }

        /* renamed from: i */
        public void m31582i() {
            SubscriptionHelper.m31797a(this.f60590e);
            this.f60590e.m31583a();
            SubscriptionHelper.m31797a(this.f60591f);
            this.f60591f.m31583a();
        }
    }

    public interface EqualCoordinatorHelper {
        /* renamed from: b */
        void mo31580b(Throwable th);

        /* renamed from: c */
        void mo31581c();
    }

    public static final class EqualSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T> {

        /* renamed from: b */
        public final EqualCoordinatorHelper f60596b;

        /* renamed from: c */
        public final int f60597c;

        /* renamed from: d */
        public final int f60598d;

        /* renamed from: e */
        public long f60599e;

        /* renamed from: f */
        public volatile SimpleQueue<T> f60600f;

        /* renamed from: g */
        public volatile boolean f60601g;

        /* renamed from: h */
        public int f60602h;

        public EqualSubscriber(EqualCoordinatorHelper equalCoordinatorHelper, int i2) {
            this.f60596b = equalCoordinatorHelper;
            this.f60598d = i2 - (i2 >> 2);
            this.f60597c = i2;
        }

        /* renamed from: a */
        public void m31583a() {
            SimpleQueue<T> simpleQueue = this.f60600f;
            if (simpleQueue != null) {
                simpleQueue.clear();
            }
        }

        /* renamed from: b */
        public void m31584b() {
            if (this.f60602h != 1) {
                long j2 = this.f60599e + 1;
                if (j2 < this.f60598d) {
                    this.f60599e = j2;
                } else {
                    this.f60599e = 0L;
                    get().request(j2);
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31801e(this, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int mo31420F = queueSubscription.mo31420F(3);
                    if (mo31420F == 1) {
                        this.f60602h = mo31420F;
                        this.f60600f = queueSubscription;
                        this.f60601g = true;
                        this.f60596b.mo31581c();
                        return;
                    }
                    if (mo31420F == 2) {
                        this.f60602h = mo31420F;
                        this.f60600f = queueSubscription;
                        subscription.request(this.f60597c);
                        return;
                    }
                }
                this.f60600f = new SpscArrayQueue(this.f60597c);
                subscription.request(this.f60597c);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60601g = true;
            this.f60596b.mo31581c();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f60596b.mo31580b(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60602h != 0 || this.f60600f.offer(t)) {
                this.f60596b.mo31581c();
            } else {
                this.f60596b.mo31580b(new MissingBackpressureException());
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super Boolean> subscriber) {
        subscriber.mo31352d(new EqualCoordinator(subscriber, 0, null));
        throw null;
    }
}
