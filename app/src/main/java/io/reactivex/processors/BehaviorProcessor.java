package io.reactivex.processors;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class BehaviorProcessor<T> extends FlowableProcessor<T> {

    /* renamed from: i */
    public static final Object[] f62846i = new Object[0];

    /* renamed from: j */
    public static final BehaviorSubscription[] f62847j = new BehaviorSubscription[0];

    /* renamed from: k */
    public static final BehaviorSubscription[] f62848k = new BehaviorSubscription[0];

    /* renamed from: c */
    public final AtomicReference<BehaviorSubscription<T>[]> f62849c;

    /* renamed from: d */
    public final Lock f62850d;

    /* renamed from: e */
    public final Lock f62851e;

    /* renamed from: f */
    public final AtomicReference<Object> f62852f = new AtomicReference<>();

    /* renamed from: g */
    public final AtomicReference<Throwable> f62853g;

    /* renamed from: h */
    public long f62854h;

    public static final class BehaviorSubscription<T> extends AtomicLong implements Subscription, AppendOnlyLinkedArrayList.NonThrowingPredicate<Object> {

        /* renamed from: b */
        public final Subscriber<? super T> f62855b;

        /* renamed from: c */
        public final BehaviorProcessor<T> f62856c;

        /* renamed from: d */
        public boolean f62857d;

        /* renamed from: e */
        public boolean f62858e;

        /* renamed from: f */
        public AppendOnlyLinkedArrayList<Object> f62859f;

        /* renamed from: g */
        public boolean f62860g;

        /* renamed from: h */
        public volatile boolean f62861h;

        /* renamed from: i */
        public long f62862i;

        public BehaviorSubscription(Subscriber<? super T> subscriber, BehaviorProcessor<T> behaviorProcessor) {
            this.f62855b = subscriber;
            this.f62856c = behaviorProcessor;
        }

        /* renamed from: a */
        public void m31852a(Object obj, long j2) {
            if (this.f62861h) {
                return;
            }
            if (!this.f62860g) {
                synchronized (this) {
                    if (this.f62861h) {
                        return;
                    }
                    if (this.f62862i == j2) {
                        return;
                    }
                    if (this.f62858e) {
                        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f62859f;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                            this.f62859f = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.m31806b(obj);
                        return;
                    }
                    this.f62857d = true;
                    this.f62860g = true;
                }
            }
            mo31407b(obj);
        }

        @Override // io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate, io.reactivex.functions.Predicate
        /* renamed from: b */
        public boolean mo31407b(Object obj) {
            if (this.f62861h) {
                return true;
            }
            if (NotificationLite.m31834h(obj)) {
                this.f62855b.onComplete();
                return true;
            }
            if (NotificationLite.m31835i(obj)) {
                this.f62855b.onError(NotificationLite.m31833f(obj));
                return true;
            }
            long j2 = get();
            if (j2 == 0) {
                cancel();
                this.f62855b.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                return true;
            }
            this.f62855b.onNext(obj);
            if (j2 == Long.MAX_VALUE) {
                return false;
            }
            decrementAndGet();
            return false;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f62861h) {
                return;
            }
            this.f62861h = true;
            this.f62856c.m31850h(this);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this, j2);
            }
        }
    }

    public BehaviorProcessor() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f62850d = reentrantReadWriteLock.readLock();
        this.f62851e = reentrantReadWriteLock.writeLock();
        this.f62849c = new AtomicReference<>(f62847j);
        this.f62853g = new AtomicReference<>();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        r8.m31807c(r0);
     */
    @Override // io.reactivex.Flowable
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo31350c(org.reactivestreams.Subscriber<? super T> r8) {
        /*
            r7 = this;
            io.reactivex.processors.BehaviorProcessor$BehaviorSubscription r0 = new io.reactivex.processors.BehaviorProcessor$BehaviorSubscription
            r0.<init>(r8, r7)
            r8.mo31352d(r0)
        L8:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.BehaviorProcessor$BehaviorSubscription<T>[]> r1 = r7.f62849c
            java.lang.Object r1 = r1.get()
            io.reactivex.processors.BehaviorProcessor$BehaviorSubscription[] r1 = (io.reactivex.processors.BehaviorProcessor.BehaviorSubscription[]) r1
            io.reactivex.processors.BehaviorProcessor$BehaviorSubscription[] r2 = io.reactivex.processors.BehaviorProcessor.f62848k
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L18
            r1 = 0
            goto L2b
        L18:
            int r2 = r1.length
            int r5 = r2 + 1
            io.reactivex.processors.BehaviorProcessor$BehaviorSubscription[] r5 = new io.reactivex.processors.BehaviorProcessor.BehaviorSubscription[r5]
            java.lang.System.arraycopy(r1, r3, r5, r3, r2)
            r5[r2] = r0
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.BehaviorProcessor$BehaviorSubscription<T>[]> r2 = r7.f62849c
            boolean r1 = r2.compareAndSet(r1, r5)
            if (r1 == 0) goto L8
            r1 = 1
        L2b:
            if (r1 == 0) goto L8b
            boolean r8 = r0.f62861h
            if (r8 == 0) goto L36
            r7.m31850h(r0)
            goto L9e
        L36:
            boolean r8 = r0.f62861h
            if (r8 == 0) goto L3b
            goto L9e
        L3b:
            monitor-enter(r0)
            boolean r8 = r0.f62861h     // Catch: java.lang.Throwable -> L88
            if (r8 == 0) goto L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L88
            goto L9e
        L42:
            boolean r8 = r0.f62857d     // Catch: java.lang.Throwable -> L88
            if (r8 == 0) goto L48
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L88
            goto L9e
        L48:
            io.reactivex.processors.BehaviorProcessor<T> r8 = r0.f62856c     // Catch: java.lang.Throwable -> L88
            java.util.concurrent.locks.Lock r1 = r8.f62850d     // Catch: java.lang.Throwable -> L88
            r1.lock()     // Catch: java.lang.Throwable -> L88
            long r5 = r8.f62854h     // Catch: java.lang.Throwable -> L88
            r0.f62862i = r5     // Catch: java.lang.Throwable -> L88
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r8 = r8.f62852f     // Catch: java.lang.Throwable -> L88
            java.lang.Object r8 = r8.get()     // Catch: java.lang.Throwable -> L88
            r1.unlock()     // Catch: java.lang.Throwable -> L88
            if (r8 == 0) goto L60
            r1 = 1
            goto L61
        L60:
            r1 = 0
        L61:
            r0.f62858e = r1     // Catch: java.lang.Throwable -> L88
            r0.f62857d = r4     // Catch: java.lang.Throwable -> L88
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L88
            if (r8 == 0) goto L9e
            boolean r8 = r0.mo31407b(r8)
            if (r8 == 0) goto L6f
            goto L9e
        L6f:
            boolean r8 = r0.f62861h
            if (r8 == 0) goto L74
            goto L9e
        L74:
            monitor-enter(r0)
            io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r8 = r0.f62859f     // Catch: java.lang.Throwable -> L85
            if (r8 != 0) goto L7d
            r0.f62858e = r3     // Catch: java.lang.Throwable -> L85
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L85
            goto L9e
        L7d:
            r1 = 0
            r0.f62859f = r1     // Catch: java.lang.Throwable -> L85
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L85
            r8.m31807c(r0)
            goto L6f
        L85:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L85
            throw r8
        L88:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L88
            throw r8
        L8b:
            java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r7.f62853g
            java.lang.Object r0 = r0.get()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Throwable r1 = io.reactivex.internal.util.ExceptionHelper.f62793a
            if (r0 != r1) goto L9b
            r8.onComplete()
            goto L9e
        L9b:
            r8.onError(r0)
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.processors.BehaviorProcessor.mo31350c(org.reactivestreams.Subscriber):void");
    }

    @Override // org.reactivestreams.Subscriber
    /* renamed from: d */
    public void mo31352d(Subscription subscription) {
        if (this.f62853g.get() != null) {
            subscription.cancel();
        } else {
            subscription.request(Long.MAX_VALUE);
        }
    }

    /* renamed from: h */
    public void m31850h(BehaviorSubscription<T> behaviorSubscription) {
        BehaviorSubscription<T>[] behaviorSubscriptionArr;
        BehaviorSubscription<T>[] behaviorSubscriptionArr2;
        do {
            behaviorSubscriptionArr = this.f62849c.get();
            int length = behaviorSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                } else if (behaviorSubscriptionArr[i2] == behaviorSubscription) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 < 0) {
                return;
            }
            if (length == 1) {
                behaviorSubscriptionArr2 = f62847j;
            } else {
                BehaviorSubscription<T>[] behaviorSubscriptionArr3 = new BehaviorSubscription[length - 1];
                System.arraycopy(behaviorSubscriptionArr, 0, behaviorSubscriptionArr3, 0, i2);
                System.arraycopy(behaviorSubscriptionArr, i2 + 1, behaviorSubscriptionArr3, i2, (length - i2) - 1);
                behaviorSubscriptionArr2 = behaviorSubscriptionArr3;
            }
        } while (!this.f62849c.compareAndSet(behaviorSubscriptionArr, behaviorSubscriptionArr2));
    }

    /* renamed from: i */
    public BehaviorSubscription<T>[] m31851i(Object obj) {
        BehaviorSubscription<T>[] behaviorSubscriptionArr = this.f62849c.get();
        BehaviorSubscription<T>[] behaviorSubscriptionArr2 = f62848k;
        if (behaviorSubscriptionArr != behaviorSubscriptionArr2 && (behaviorSubscriptionArr = this.f62849c.getAndSet(behaviorSubscriptionArr2)) != behaviorSubscriptionArr2) {
            Lock lock = this.f62851e;
            lock.lock();
            this.f62854h++;
            this.f62852f.lazySet(obj);
            lock.unlock();
        }
        return behaviorSubscriptionArr;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f62853g.compareAndSet(null, ExceptionHelper.f62793a)) {
            NotificationLite notificationLite = NotificationLite.COMPLETE;
            for (BehaviorSubscription<T> behaviorSubscription : m31851i(notificationLite)) {
                behaviorSubscription.m31852a(notificationLite, this.f62854h);
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        Objects.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f62853g.compareAndSet(null, th)) {
            RxJavaPlugins.m31848b(th);
            return;
        }
        Object m31832e = NotificationLite.m31832e(th);
        for (BehaviorSubscription<T> behaviorSubscription : m31851i(m31832e)) {
            behaviorSubscription.m31852a(m31832e, this.f62854h);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        Objects.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f62853g.get() != null) {
            return;
        }
        Lock lock = this.f62851e;
        lock.lock();
        this.f62854h++;
        this.f62852f.lazySet(t);
        lock.unlock();
        for (BehaviorSubscription<T> behaviorSubscription : this.f62849c.get()) {
            behaviorSubscription.m31852a(t, this.f62854h);
        }
    }
}
