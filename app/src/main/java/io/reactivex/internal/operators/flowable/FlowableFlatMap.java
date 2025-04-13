package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableFlatMap<T, U> extends AbstractFlowableWithUpstream<T, U> {

    public static final class InnerSubscriber<T, U> extends AtomicReference<Subscription> implements FlowableSubscriber<U>, Disposable {

        /* renamed from: b */
        public final long f60117b;

        /* renamed from: c */
        public final MergeSubscriber<T, U> f60118c;

        /* renamed from: d */
        public final int f60119d;

        /* renamed from: e */
        public final int f60120e;

        /* renamed from: f */
        public volatile boolean f60121f;

        /* renamed from: g */
        public volatile SimpleQueue<U> f60122g;

        /* renamed from: h */
        public long f60123h;

        /* renamed from: i */
        public int f60124i;

        public InnerSubscriber(MergeSubscriber<T, U> mergeSubscriber, long j2) {
            this.f60117b = j2;
            this.f60118c = mergeSubscriber;
            int i2 = mergeSubscriber.f60131f;
            this.f60120e = i2;
            this.f60119d = i2 >> 2;
        }

        /* renamed from: a */
        public void m31489a(long j2) {
            if (this.f60124i != 1) {
                long j3 = this.f60123h + j2;
                if (j3 < this.f60119d) {
                    this.f60123h = j3;
                } else {
                    this.f60123h = 0L;
                    get().request(j3);
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31801e(this, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int mo31420F = queueSubscription.mo31420F(7);
                    if (mo31420F == 1) {
                        this.f60124i = mo31420F;
                        this.f60122g = queueSubscription;
                        this.f60121f = true;
                        this.f60118c.m31491b();
                        return;
                    }
                    if (mo31420F == 2) {
                        this.f60124i = mo31420F;
                        this.f60122g = queueSubscription;
                    }
                }
                subscription.request(this.f60120e);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            SubscriptionHelper.m31797a(this);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60121f = true;
            this.f60118c.m31491b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            lazySet(SubscriptionHelper.CANCELLED);
            MergeSubscriber<T, U> mergeSubscriber = this.f60118c;
            if (!ExceptionHelper.m31817a(mergeSubscriber.f60134i, th)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f60121f = true;
            if (!mergeSubscriber.f60129d) {
                mergeSubscriber.f60138m.cancel();
                for (InnerSubscriber<?, ?> innerSubscriber : mergeSubscriber.f60136k.getAndSet(MergeSubscriber.f60126t)) {
                    SubscriptionHelper.m31797a(innerSubscriber);
                }
            }
            mergeSubscriber.m31491b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(U u) {
            if (this.f60124i == 2) {
                this.f60118c.m31491b();
                return;
            }
            MergeSubscriber<T, U> mergeSubscriber = this.f60118c;
            if (mergeSubscriber.get() == 0 && mergeSubscriber.compareAndSet(0, 1)) {
                long j2 = mergeSubscriber.f60137l.get();
                SimpleQueue simpleQueue = this.f60122g;
                if (j2 == 0 || !(simpleQueue == null || simpleQueue.isEmpty())) {
                    if (simpleQueue == null && (simpleQueue = this.f60122g) == null) {
                        simpleQueue = new SpscArrayQueue(mergeSubscriber.f60131f);
                        this.f60122g = simpleQueue;
                    }
                    if (!simpleQueue.offer(u)) {
                        mergeSubscriber.onError(new MissingBackpressureException("Inner queue full?!"));
                        return;
                    }
                } else {
                    mergeSubscriber.f60127b.onNext(u);
                    if (j2 != Long.MAX_VALUE) {
                        mergeSubscriber.f60137l.decrementAndGet();
                    }
                    m31489a(1L);
                }
                if (mergeSubscriber.decrementAndGet() == 0) {
                    return;
                }
            } else {
                SimpleQueue simpleQueue2 = this.f60122g;
                if (simpleQueue2 == null) {
                    simpleQueue2 = new SpscArrayQueue(mergeSubscriber.f60131f);
                    this.f60122g = simpleQueue2;
                }
                if (!simpleQueue2.offer(u)) {
                    mergeSubscriber.onError(new MissingBackpressureException("Inner queue full?!"));
                    return;
                } else if (mergeSubscriber.getAndIncrement() != 0) {
                    return;
                }
            }
            mergeSubscriber.m31492c();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return get() == SubscriptionHelper.CANCELLED;
        }
    }

    public static final class MergeSubscriber<T, U> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* renamed from: s */
        public static final InnerSubscriber<?, ?>[] f60125s = new InnerSubscriber[0];

        /* renamed from: t */
        public static final InnerSubscriber<?, ?>[] f60126t = new InnerSubscriber[0];

        /* renamed from: b */
        public final Subscriber<? super U> f60127b;

        /* renamed from: c */
        public final Function<? super T, ? extends Publisher<? extends U>> f60128c;

        /* renamed from: d */
        public final boolean f60129d;

        /* renamed from: e */
        public final int f60130e;

        /* renamed from: f */
        public final int f60131f;

        /* renamed from: g */
        public volatile SimplePlainQueue<U> f60132g;

        /* renamed from: h */
        public volatile boolean f60133h;

        /* renamed from: i */
        public final AtomicThrowable f60134i = new AtomicThrowable();

        /* renamed from: j */
        public volatile boolean f60135j;

        /* renamed from: k */
        public final AtomicReference<InnerSubscriber<?, ?>[]> f60136k;

        /* renamed from: l */
        public final AtomicLong f60137l;

        /* renamed from: m */
        public Subscription f60138m;

        /* renamed from: n */
        public long f60139n;

        /* renamed from: o */
        public long f60140o;

        /* renamed from: p */
        public int f60141p;

        /* renamed from: q */
        public int f60142q;

        /* renamed from: r */
        public final int f60143r;

        public MergeSubscriber(Subscriber<? super U> subscriber, Function<? super T, ? extends Publisher<? extends U>> function, boolean z, int i2, int i3) {
            AtomicReference<InnerSubscriber<?, ?>[]> atomicReference = new AtomicReference<>();
            this.f60136k = atomicReference;
            this.f60137l = new AtomicLong();
            this.f60127b = subscriber;
            this.f60128c = function;
            this.f60129d = z;
            this.f60130e = i2;
            this.f60131f = i3;
            this.f60143r = Math.max(1, i2 >> 1);
            atomicReference.lazySet(f60125s);
        }

        /* renamed from: a */
        public boolean m31490a() {
            if (this.f60135j) {
                SimplePlainQueue<U> simplePlainQueue = this.f60132g;
                if (simplePlainQueue != null) {
                    simplePlainQueue.clear();
                }
                return true;
            }
            if (this.f60129d || this.f60134i.get() == null) {
                return false;
            }
            SimplePlainQueue<U> simplePlainQueue2 = this.f60132g;
            if (simplePlainQueue2 != null) {
                simplePlainQueue2.clear();
            }
            Throwable m31818b = ExceptionHelper.m31818b(this.f60134i);
            if (m31818b != ExceptionHelper.f62793a) {
                this.f60127b.onError(m31818b);
            }
            return true;
        }

        /* renamed from: b */
        public void m31491b() {
            if (getAndIncrement() == 0) {
                m31492c();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:103:0x018f, code lost:
        
            r24.f60141p = r3;
            r24.f60140o = r13[r3].f60117b;
            r3 = r16;
            r5 = 0;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m31492c() {
            /*
                Method dump skipped, instructions count: 446
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber.m31492c():void");
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            SimplePlainQueue<U> simplePlainQueue;
            InnerSubscriber<?, ?>[] andSet;
            if (this.f60135j) {
                return;
            }
            this.f60135j = true;
            this.f60138m.cancel();
            InnerSubscriber<?, ?>[] innerSubscriberArr = this.f60136k.get();
            InnerSubscriber<?, ?>[] innerSubscriberArr2 = f60126t;
            if (innerSubscriberArr != innerSubscriberArr2 && (andSet = this.f60136k.getAndSet(innerSubscriberArr2)) != innerSubscriberArr2) {
                for (InnerSubscriber<?, ?> innerSubscriber : andSet) {
                    SubscriptionHelper.m31797a(innerSubscriber);
                }
                Throwable m31818b = ExceptionHelper.m31818b(this.f60134i);
                if (m31818b != null && m31818b != ExceptionHelper.f62793a) {
                    RxJavaPlugins.m31848b(m31818b);
                }
            }
            if (getAndIncrement() != 0 || (simplePlainQueue = this.f60132g) == null) {
                return;
            }
            simplePlainQueue.clear();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60138m, subscription)) {
                this.f60138m = subscription;
                this.f60127b.mo31352d(this);
                if (this.f60135j) {
                    return;
                }
                int i2 = this.f60130e;
                if (i2 == Integer.MAX_VALUE) {
                    subscription.request(Long.MAX_VALUE);
                } else {
                    subscription.request(i2);
                }
            }
        }

        /* renamed from: e */
        public SimpleQueue<U> m31493e() {
            SimplePlainQueue<U> simplePlainQueue = this.f60132g;
            if (simplePlainQueue == null) {
                simplePlainQueue = this.f60130e == Integer.MAX_VALUE ? new SpscLinkedArrayQueue<>(this.f60131f) : new SpscArrayQueue<>(this.f60130e);
                this.f60132g = simplePlainQueue;
            }
            return simplePlainQueue;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: f */
        public void m31494f(InnerSubscriber<T, U> innerSubscriber) {
            InnerSubscriber<?, ?>[] innerSubscriberArr;
            InnerSubscriber<?, ?>[] innerSubscriberArr2;
            do {
                innerSubscriberArr = this.f60136k.get();
                int length = innerSubscriberArr.length;
                if (length == 0) {
                    return;
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    } else if (innerSubscriberArr[i2] == innerSubscriber) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriberArr2 = f60125s;
                } else {
                    InnerSubscriber<?, ?>[] innerSubscriberArr3 = new InnerSubscriber[length - 1];
                    System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr3, 0, i2);
                    System.arraycopy(innerSubscriberArr, i2 + 1, innerSubscriberArr3, i2, (length - i2) - 1);
                    innerSubscriberArr2 = innerSubscriberArr3;
                }
            } while (!this.f60136k.compareAndSet(innerSubscriberArr, innerSubscriberArr2));
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f60133h) {
                return;
            }
            this.f60133h = true;
            m31491b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60133h) {
                RxJavaPlugins.m31848b(th);
            } else if (!ExceptionHelper.m31817a(this.f60134i, th)) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f60133h = true;
                m31491b();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60133h) {
                return;
            }
            try {
                Publisher<? extends U> apply = this.f60128c.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                Publisher<? extends U> publisher = apply;
                boolean z = false;
                if (!(publisher instanceof Callable)) {
                    long j2 = this.f60139n;
                    this.f60139n = 1 + j2;
                    InnerSubscriber<?, ?> innerSubscriber = new InnerSubscriber<>(this, j2);
                    while (true) {
                        InnerSubscriber<?, ?>[] innerSubscriberArr = this.f60136k.get();
                        if (innerSubscriberArr == f60126t) {
                            SubscriptionHelper.m31797a(innerSubscriber);
                            break;
                        }
                        int length = innerSubscriberArr.length;
                        InnerSubscriber<?, ?>[] innerSubscriberArr2 = new InnerSubscriber[length + 1];
                        System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                        innerSubscriberArr2[length] = innerSubscriber;
                        if (this.f60136k.compareAndSet(innerSubscriberArr, innerSubscriberArr2)) {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        publisher.mo31351g(innerSubscriber);
                        return;
                    }
                    return;
                }
                try {
                    Object call = ((Callable) publisher).call();
                    if (call == null) {
                        if (this.f60130e == Integer.MAX_VALUE || this.f60135j) {
                            return;
                        }
                        int i2 = this.f60142q + 1;
                        this.f60142q = i2;
                        int i3 = this.f60143r;
                        if (i2 == i3) {
                            this.f60142q = 0;
                            this.f60138m.request(i3);
                            return;
                        }
                        return;
                    }
                    if (get() == 0 && compareAndSet(0, 1)) {
                        long j3 = this.f60137l.get();
                        SimpleQueue<U> simpleQueue = this.f60132g;
                        if (j3 == 0 || !(simpleQueue == 0 || simpleQueue.isEmpty())) {
                            if (simpleQueue == 0) {
                                simpleQueue = m31493e();
                            }
                            if (!simpleQueue.offer(call)) {
                                onError(new IllegalStateException("Scalar queue full?!"));
                                return;
                            }
                        } else {
                            this.f60127b.onNext(call);
                            if (j3 != Long.MAX_VALUE) {
                                this.f60137l.decrementAndGet();
                            }
                            if (this.f60130e != Integer.MAX_VALUE && !this.f60135j) {
                                int i4 = this.f60142q + 1;
                                this.f60142q = i4;
                                int i5 = this.f60143r;
                                if (i4 == i5) {
                                    this.f60142q = 0;
                                    this.f60138m.request(i5);
                                }
                            }
                        }
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    } else if (!m31493e().offer(call)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    } else if (getAndIncrement() != 0) {
                        return;
                    }
                    m31492c();
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    ExceptionHelper.m31817a(this.f60134i, th);
                    m31491b();
                }
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                this.f60138m.cancel();
                onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this.f60137l, j2);
                m31491b();
            }
        }
    }

    /* renamed from: e */
    public static <T, U> FlowableSubscriber<T> m31488e(Subscriber<? super U> subscriber, Function<? super T, ? extends Publisher<? extends U>> function, boolean z, int i2, int i3) {
        return new MergeSubscriber(subscriber, null, z, i2, i3);
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super U> subscriber) {
        if (FlowableScalarXMap.m31578a(this.f59782c, subscriber, null)) {
            return;
        }
        this.f59782c.m31349b(m31488e(subscriber, null, false, 0, 0));
    }
}
