package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowablePublishMulticast<T, R> extends AbstractFlowableWithUpstream<T, R> {

    public static final class MulticastProcessor<T> extends Flowable<T> implements FlowableSubscriber<T>, Disposable {

        /* renamed from: n */
        public static final MulticastSubscription[] f60443n = new MulticastSubscription[0];

        /* renamed from: o */
        public static final MulticastSubscription[] f60444o = new MulticastSubscription[0];

        /* renamed from: e */
        public final int f60447e;

        /* renamed from: f */
        public final int f60448f;

        /* renamed from: g */
        public final boolean f60449g;

        /* renamed from: i */
        public volatile SimpleQueue<T> f60451i;

        /* renamed from: j */
        public int f60452j;

        /* renamed from: k */
        public volatile boolean f60453k;

        /* renamed from: l */
        public Throwable f60454l;

        /* renamed from: m */
        public int f60455m;

        /* renamed from: c */
        public final AtomicInteger f60445c = new AtomicInteger();

        /* renamed from: h */
        public final AtomicReference<Subscription> f60450h = new AtomicReference<>();

        /* renamed from: d */
        public final AtomicReference<MulticastSubscription<T>[]> f60446d = new AtomicReference<>(f60443n);

        public MulticastProcessor(int i2, boolean z) {
            this.f60447e = i2;
            this.f60448f = i2 - (i2 >> 2);
            this.f60449g = z;
        }

        @Override // io.reactivex.Flowable
        /* renamed from: c */
        public void mo31350c(Subscriber<? super T> subscriber) {
            boolean z;
            MulticastSubscription<T> multicastSubscription = new MulticastSubscription<>(subscriber, this);
            subscriber.mo31352d(multicastSubscription);
            while (true) {
                MulticastSubscription<T>[] multicastSubscriptionArr = this.f60446d.get();
                if (multicastSubscriptionArr == f60444o) {
                    z = false;
                    break;
                }
                int length = multicastSubscriptionArr.length;
                MulticastSubscription<T>[] multicastSubscriptionArr2 = new MulticastSubscription[length + 1];
                System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr2, 0, length);
                multicastSubscriptionArr2[length] = multicastSubscription;
                if (this.f60446d.compareAndSet(multicastSubscriptionArr, multicastSubscriptionArr2)) {
                    z = true;
                    break;
                }
            }
            if (z) {
                if (multicastSubscription.get() == Long.MIN_VALUE) {
                    m31550j(multicastSubscription);
                    return;
                } else {
                    m31548h();
                    return;
                }
            }
            Throwable th = this.f60454l;
            if (th != null) {
                subscriber.onError(th);
            } else {
                subscriber.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31801e(this.f60450h, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int mo31420F = queueSubscription.mo31420F(3);
                    if (mo31420F == 1) {
                        this.f60452j = mo31420F;
                        this.f60451i = queueSubscription;
                        this.f60453k = true;
                        m31548h();
                        return;
                    }
                    if (mo31420F == 2) {
                        this.f60452j = mo31420F;
                        this.f60451i = queueSubscription;
                        int i2 = this.f60447e;
                        subscription.request(i2 >= 0 ? i2 : Long.MAX_VALUE);
                        return;
                    }
                }
                this.f60451i = QueueDrainHelper.m31842b(this.f60447e);
                int i3 = this.f60447e;
                subscription.request(i3 >= 0 ? i3 : Long.MAX_VALUE);
            }
        }

        /* renamed from: e */
        public void m31547e() {
            for (MulticastSubscription<T> multicastSubscription : this.f60446d.getAndSet(f60444o)) {
                if (multicastSubscription.get() != Long.MIN_VALUE) {
                    multicastSubscription.f60456b.onComplete();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            SimpleQueue<T> simpleQueue;
            SubscriptionHelper.m31797a(this.f60450h);
            if (this.f60445c.getAndIncrement() != 0 || (simpleQueue = this.f60451i) == null) {
                return;
            }
            simpleQueue.clear();
        }

        /* renamed from: h */
        public void m31548h() {
            AtomicReference<MulticastSubscription<T>[]> atomicReference;
            Throwable th;
            Throwable th2;
            if (this.f60445c.getAndIncrement() != 0) {
                return;
            }
            SimpleQueue<T> simpleQueue = this.f60451i;
            int i2 = this.f60455m;
            int i3 = this.f60448f;
            boolean z = this.f60452j != 1;
            AtomicReference<MulticastSubscription<T>[]> atomicReference2 = this.f60446d;
            MulticastSubscription<T>[] multicastSubscriptionArr = atomicReference2.get();
            int i4 = 1;
            while (true) {
                int length = multicastSubscriptionArr.length;
                if (simpleQueue == null || length == 0) {
                    atomicReference = atomicReference2;
                } else {
                    int length2 = multicastSubscriptionArr.length;
                    long j2 = Long.MAX_VALUE;
                    long j3 = Long.MAX_VALUE;
                    int i5 = 0;
                    while (i5 < length2) {
                        MulticastSubscription<T> multicastSubscription = multicastSubscriptionArr[i5];
                        AtomicReference<MulticastSubscription<T>[]> atomicReference3 = atomicReference2;
                        long j4 = multicastSubscription.get() - multicastSubscription.f60458d;
                        if (j4 == Long.MIN_VALUE) {
                            length--;
                        } else if (j3 > j4) {
                            j3 = j4;
                        }
                        i5++;
                        atomicReference2 = atomicReference3;
                    }
                    atomicReference = atomicReference2;
                    long j5 = 0;
                    if (length == 0) {
                        j3 = 0;
                    }
                    while (j3 != j5) {
                        if (mo31380s()) {
                            simpleQueue.clear();
                            return;
                        }
                        boolean z2 = this.f60453k;
                        if (z2 && !this.f60449g && (th2 = this.f60454l) != null) {
                            m31549i(th2);
                            return;
                        }
                        try {
                            T poll = simpleQueue.poll();
                            boolean z3 = poll == null;
                            if (z2 && z3) {
                                Throwable th3 = this.f60454l;
                                if (th3 != null) {
                                    m31549i(th3);
                                    return;
                                } else {
                                    m31547e();
                                    return;
                                }
                            }
                            if (z3) {
                                break;
                            }
                            int length3 = multicastSubscriptionArr.length;
                            int i6 = 0;
                            boolean z4 = false;
                            while (i6 < length3) {
                                MulticastSubscription<T> multicastSubscription2 = multicastSubscriptionArr[i6];
                                long j6 = multicastSubscription2.get();
                                if (j6 != Long.MIN_VALUE) {
                                    if (j6 != j2) {
                                        multicastSubscription2.f60458d++;
                                    }
                                    multicastSubscription2.f60456b.onNext(poll);
                                } else {
                                    z4 = true;
                                }
                                i6++;
                                j2 = Long.MAX_VALUE;
                            }
                            j3--;
                            if (z && (i2 = i2 + 1) == i3) {
                                this.f60450h.get().request(i3);
                                i2 = 0;
                            }
                            MulticastSubscription<T>[] multicastSubscriptionArr2 = atomicReference.get();
                            if (z4 || multicastSubscriptionArr2 != multicastSubscriptionArr) {
                                multicastSubscriptionArr = multicastSubscriptionArr2;
                                break;
                            } else {
                                j5 = 0;
                                j2 = Long.MAX_VALUE;
                            }
                        } catch (Throwable th4) {
                            Exceptions.m31402a(th4);
                            SubscriptionHelper.m31797a(this.f60450h);
                            m31549i(th4);
                            return;
                        }
                    }
                    if (j3 == j5) {
                        if (mo31380s()) {
                            simpleQueue.clear();
                            return;
                        }
                        boolean z5 = this.f60453k;
                        if (z5 && !this.f60449g && (th = this.f60454l) != null) {
                            m31549i(th);
                            return;
                        }
                        if (z5 && simpleQueue.isEmpty()) {
                            Throwable th5 = this.f60454l;
                            if (th5 != null) {
                                m31549i(th5);
                                return;
                            } else {
                                m31547e();
                                return;
                            }
                        }
                    }
                }
                this.f60455m = i2;
                i4 = this.f60445c.addAndGet(-i4);
                if (i4 == 0) {
                    return;
                }
                if (simpleQueue == null) {
                    simpleQueue = this.f60451i;
                }
                multicastSubscriptionArr = atomicReference.get();
                atomicReference2 = atomicReference;
            }
        }

        /* renamed from: i */
        public void m31549i(Throwable th) {
            for (MulticastSubscription<T> multicastSubscription : this.f60446d.getAndSet(f60444o)) {
                if (multicastSubscription.get() != Long.MIN_VALUE) {
                    multicastSubscription.f60456b.onError(th);
                }
            }
        }

        /* renamed from: j */
        public void m31550j(MulticastSubscription<T> multicastSubscription) {
            MulticastSubscription<T>[] multicastSubscriptionArr;
            MulticastSubscription<T>[] multicastSubscriptionArr2;
            do {
                multicastSubscriptionArr = this.f60446d.get();
                int length = multicastSubscriptionArr.length;
                if (length == 0) {
                    return;
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    } else if (multicastSubscriptionArr[i2] == multicastSubscription) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 < 0) {
                    return;
                }
                if (length == 1) {
                    multicastSubscriptionArr2 = f60443n;
                } else {
                    MulticastSubscription<T>[] multicastSubscriptionArr3 = new MulticastSubscription[length - 1];
                    System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr3, 0, i2);
                    System.arraycopy(multicastSubscriptionArr, i2 + 1, multicastSubscriptionArr3, i2, (length - i2) - 1);
                    multicastSubscriptionArr2 = multicastSubscriptionArr3;
                }
            } while (!this.f60446d.compareAndSet(multicastSubscriptionArr, multicastSubscriptionArr2));
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f60453k) {
                return;
            }
            this.f60453k = true;
            m31548h();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60453k) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f60454l = th;
            this.f60453k = true;
            m31548h();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60453k) {
                return;
            }
            if (this.f60452j != 0 || this.f60451i.offer(t)) {
                m31548h();
            } else {
                this.f60450h.get().cancel();
                onError(new MissingBackpressureException());
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f60450h.get() == SubscriptionHelper.CANCELLED;
        }
    }

    public static final class MulticastSubscription<T> extends AtomicLong implements Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60456b;

        /* renamed from: c */
        public final MulticastProcessor<T> f60457c;

        /* renamed from: d */
        public long f60458d;

        public MulticastSubscription(Subscriber<? super T> subscriber, MulticastProcessor<T> multicastProcessor) {
            this.f60456b = subscriber;
            this.f60457c = multicastProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f60457c.m31550j(this);
                this.f60457c.m31548h();
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31809b(this, j2);
                this.f60457c.m31548h();
            }
        }
    }

    public static final class OutputCanceller<R> implements FlowableSubscriber<R>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super R> f60459b;

        /* renamed from: c */
        public final MulticastProcessor<?> f60460c;

        /* renamed from: d */
        public Subscription f60461d;

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f60461d.cancel();
            this.f60460c.mo31379f();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60461d, subscription)) {
                this.f60461d = subscription;
                this.f60459b.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60459b.onComplete();
            this.f60460c.mo31379f();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f60459b.onError(th);
            this.f60460c.mo31379f();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(R r) {
            this.f60459b.onNext(r);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            this.f60461d.request(j2);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super R> subscriber) {
        new MulticastProcessor(0, false);
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            subscriber.mo31352d(EmptySubscription.INSTANCE);
            subscriber.onError(th);
        }
    }
}
