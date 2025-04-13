package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.operators.flowable.FlowableGroupJoin;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractFlowableWithUpstream<TLeft, R> {

    public static final class JoinSubscription<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements Subscription, FlowableGroupJoin.JoinSupport {

        /* renamed from: p */
        public static final Integer f60291p = 1;

        /* renamed from: q */
        public static final Integer f60292q = 2;

        /* renamed from: r */
        public static final Integer f60293r = 3;

        /* renamed from: s */
        public static final Integer f60294s = 4;

        /* renamed from: b */
        public final Subscriber<? super R> f60295b;

        /* renamed from: m */
        public int f60306m;

        /* renamed from: n */
        public int f60307n;

        /* renamed from: o */
        public volatile boolean f60308o;

        /* renamed from: c */
        public final AtomicLong f60296c = new AtomicLong();

        /* renamed from: e */
        public final CompositeDisposable f60298e = new CompositeDisposable();

        /* renamed from: d */
        public final SpscLinkedArrayQueue<Object> f60297d = new SpscLinkedArrayQueue<>(Flowable.f59569b);

        /* renamed from: f */
        public final Map<Integer, TLeft> f60299f = new LinkedHashMap();

        /* renamed from: g */
        public final Map<Integer, TRight> f60300g = new LinkedHashMap();

        /* renamed from: h */
        public final AtomicReference<Throwable> f60301h = new AtomicReference<>();

        /* renamed from: i */
        public final Function<? super TLeft, ? extends Publisher<TLeftEnd>> f60302i = null;

        /* renamed from: j */
        public final Function<? super TRight, ? extends Publisher<TRightEnd>> f60303j = null;

        /* renamed from: k */
        public final BiFunction<? super TLeft, ? super TRight, ? extends R> f60304k = null;

        /* renamed from: l */
        public final AtomicInteger f60305l = new AtomicInteger(2);

        public JoinSubscription(Subscriber<? super R> subscriber, Function<? super TLeft, ? extends Publisher<TLeftEnd>> function, Function<? super TRight, ? extends Publisher<TRightEnd>> function2, BiFunction<? super TLeft, ? super TRight, ? extends R> biFunction) {
            this.f60295b = subscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        /* renamed from: a */
        public void mo31518a(Throwable th) {
            if (ExceptionHelper.m31817a(this.f60301h, th)) {
                m31526f();
            } else {
                RxJavaPlugins.m31848b(th);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        /* renamed from: b */
        public void mo31519b(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f60301h, th)) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f60305l.decrementAndGet();
                m31526f();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        /* renamed from: c */
        public void mo31520c(boolean z, Object obj) {
            synchronized (this) {
                this.f60297d.m31765c(z ? f60291p : f60292q, obj);
            }
            m31526f();
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f60308o) {
                return;
            }
            this.f60308o = true;
            this.f60298e.mo31379f();
            if (getAndIncrement() == 0) {
                this.f60297d.clear();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        /* renamed from: d */
        public void mo31521d(boolean z, FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber) {
            synchronized (this) {
                this.f60297d.m31765c(z ? f60293r : f60294s, leftRightEndSubscriber);
            }
            m31526f();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        /* renamed from: e */
        public void mo31522e(FlowableGroupJoin.LeftRightSubscriber leftRightSubscriber) {
            this.f60298e.mo31394c(leftRightSubscriber);
            this.f60305l.decrementAndGet();
            m31526f();
        }

        /* renamed from: f */
        public void m31526f() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.f60297d;
            Subscriber<? super R> subscriber = this.f60295b;
            boolean z = true;
            int i2 = 1;
            while (!this.f60308o) {
                if (this.f60301h.get() != null) {
                    spscLinkedArrayQueue.clear();
                    this.f60298e.mo31379f();
                    m31527g(subscriber);
                    return;
                }
                boolean z2 = this.f60305l.get() == 0;
                Integer num = (Integer) spscLinkedArrayQueue.poll();
                boolean z3 = num == null;
                if (z2 && z3) {
                    this.f60299f.clear();
                    this.f60300g.clear();
                    this.f60298e.mo31379f();
                    subscriber.onComplete();
                    return;
                }
                if (z3) {
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else {
                    Object poll = spscLinkedArrayQueue.poll();
                    if (num == f60291p) {
                        int i3 = this.f60306m;
                        this.f60306m = i3 + 1;
                        this.f60299f.put(Integer.valueOf(i3), poll);
                        try {
                            Publisher apply = this.f60302i.apply(poll);
                            Objects.requireNonNull(apply, "The leftEnd returned a null Publisher");
                            Publisher publisher = apply;
                            FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber = new FlowableGroupJoin.LeftRightEndSubscriber(this, z, i3);
                            this.f60298e.mo31393b(leftRightEndSubscriber);
                            publisher.mo31351g(leftRightEndSubscriber);
                            if (this.f60301h.get() != null) {
                                spscLinkedArrayQueue.clear();
                                this.f60298e.mo31379f();
                                m31527g(subscriber);
                                return;
                            }
                            long j2 = this.f60296c.get();
                            Iterator<TRight> it = this.f60300g.values().iterator();
                            long j3 = 0;
                            while (it.hasNext()) {
                                try {
                                    R apply2 = this.f60304k.apply(poll, it.next());
                                    Objects.requireNonNull(apply2, "The resultSelector returned a null value");
                                    if (j3 == j2) {
                                        ExceptionHelper.m31817a(this.f60301h, new MissingBackpressureException("Could not emit value due to lack of requests"));
                                        spscLinkedArrayQueue.clear();
                                        this.f60298e.mo31379f();
                                        m31527g(subscriber);
                                        return;
                                    }
                                    subscriber.onNext(apply2);
                                    j3++;
                                } catch (Throwable th) {
                                    m31528h(th, subscriber, spscLinkedArrayQueue);
                                    return;
                                }
                            }
                            if (j3 != 0) {
                                BackpressureHelper.m31812e(this.f60296c, j3);
                            }
                        } catch (Throwable th2) {
                            m31528h(th2, subscriber, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == f60292q) {
                        int i4 = this.f60307n;
                        this.f60307n = i4 + 1;
                        this.f60300g.put(Integer.valueOf(i4), poll);
                        try {
                            Publisher apply3 = this.f60303j.apply(poll);
                            Objects.requireNonNull(apply3, "The rightEnd returned a null Publisher");
                            Publisher publisher2 = apply3;
                            FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber2 = new FlowableGroupJoin.LeftRightEndSubscriber(this, false, i4);
                            this.f60298e.mo31393b(leftRightEndSubscriber2);
                            publisher2.mo31351g(leftRightEndSubscriber2);
                            if (this.f60301h.get() != null) {
                                spscLinkedArrayQueue.clear();
                                this.f60298e.mo31379f();
                                m31527g(subscriber);
                                return;
                            }
                            long j4 = this.f60296c.get();
                            Iterator<TLeft> it2 = this.f60299f.values().iterator();
                            long j5 = 0;
                            while (it2.hasNext()) {
                                try {
                                    R apply4 = this.f60304k.apply(it2.next(), poll);
                                    Objects.requireNonNull(apply4, "The resultSelector returned a null value");
                                    if (j5 == j4) {
                                        ExceptionHelper.m31817a(this.f60301h, new MissingBackpressureException("Could not emit value due to lack of requests"));
                                        spscLinkedArrayQueue.clear();
                                        this.f60298e.mo31379f();
                                        m31527g(subscriber);
                                        return;
                                    }
                                    subscriber.onNext(apply4);
                                    j5++;
                                } catch (Throwable th3) {
                                    m31528h(th3, subscriber, spscLinkedArrayQueue);
                                    return;
                                }
                            }
                            if (j5 != 0) {
                                BackpressureHelper.m31812e(this.f60296c, j5);
                            }
                        } catch (Throwable th4) {
                            m31528h(th4, subscriber, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == f60293r) {
                        FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber3 = (FlowableGroupJoin.LeftRightEndSubscriber) poll;
                        this.f60299f.remove(Integer.valueOf(leftRightEndSubscriber3.f60272d));
                        this.f60298e.mo31392a(leftRightEndSubscriber3);
                    } else if (num == f60294s) {
                        FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber4 = (FlowableGroupJoin.LeftRightEndSubscriber) poll;
                        this.f60300g.remove(Integer.valueOf(leftRightEndSubscriber4.f60272d));
                        this.f60298e.mo31392a(leftRightEndSubscriber4);
                    }
                    z = true;
                }
            }
            spscLinkedArrayQueue.clear();
        }

        /* renamed from: g */
        public void m31527g(Subscriber<?> subscriber) {
            Throwable m31818b = ExceptionHelper.m31818b(this.f60301h);
            this.f60299f.clear();
            this.f60300g.clear();
            subscriber.onError(m31818b);
        }

        /* renamed from: h */
        public void m31528h(Throwable th, Subscriber<?> subscriber, SimpleQueue<?> simpleQueue) {
            Exceptions.m31402a(th);
            ExceptionHelper.m31817a(this.f60301h, th);
            ((SpscLinkedArrayQueue) simpleQueue).clear();
            this.f60298e.mo31379f();
            m31527g(subscriber);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this.f60296c, j2);
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super R> subscriber) {
        JoinSubscription joinSubscription = new JoinSubscription(subscriber, null, null, null);
        subscriber.mo31352d(joinSubscription);
        FlowableGroupJoin.LeftRightSubscriber leftRightSubscriber = new FlowableGroupJoin.LeftRightSubscriber(joinSubscription, true);
        joinSubscription.f60298e.mo31393b(leftRightSubscriber);
        joinSubscription.f60298e.mo31393b(new FlowableGroupJoin.LeftRightSubscriber(joinSubscription, false));
        this.f59782c.m31349b(leftRightSubscriber);
        throw null;
    }
}
