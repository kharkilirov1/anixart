package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes3.dex */
public final class BehaviorSubject<T> extends Subject<T> {

    /* renamed from: h */
    public static final Object[] f62924h = new Object[0];

    /* renamed from: i */
    public static final BehaviorDisposable[] f62925i = new BehaviorDisposable[0];

    /* renamed from: j */
    public static final BehaviorDisposable[] f62926j = new BehaviorDisposable[0];

    /* renamed from: b */
    public final AtomicReference<Object> f62927b;

    /* renamed from: c */
    public final AtomicReference<BehaviorDisposable<T>[]> f62928c;

    /* renamed from: d */
    public final Lock f62929d;

    /* renamed from: e */
    public final Lock f62930e;

    /* renamed from: f */
    public final AtomicReference<Throwable> f62931f;

    /* renamed from: g */
    public long f62932g;

    public static final class BehaviorDisposable<T> implements Disposable, AppendOnlyLinkedArrayList.NonThrowingPredicate<Object> {

        /* renamed from: b */
        public final Observer<? super T> f62933b;

        /* renamed from: c */
        public final BehaviorSubject<T> f62934c;

        /* renamed from: d */
        public boolean f62935d;

        /* renamed from: e */
        public boolean f62936e;

        /* renamed from: f */
        public AppendOnlyLinkedArrayList<Object> f62937f;

        /* renamed from: g */
        public boolean f62938g;

        /* renamed from: h */
        public volatile boolean f62939h;

        /* renamed from: i */
        public long f62940i;

        public BehaviorDisposable(Observer<? super T> observer, BehaviorSubject<T> behaviorSubject) {
            this.f62933b = observer;
            this.f62934c = behaviorSubject;
        }

        /* renamed from: a */
        public void m31864a(Object obj, long j2) {
            if (this.f62939h) {
                return;
            }
            if (!this.f62938g) {
                synchronized (this) {
                    if (this.f62939h) {
                        return;
                    }
                    if (this.f62940i == j2) {
                        return;
                    }
                    if (this.f62936e) {
                        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f62937f;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                            this.f62937f = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.m31806b(obj);
                        return;
                    }
                    this.f62935d = true;
                    this.f62938g = true;
                }
            }
            mo31407b(obj);
        }

        @Override // io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate, io.reactivex.functions.Predicate
        /* renamed from: b */
        public boolean mo31407b(Object obj) {
            return this.f62939h || NotificationLite.m31828a(obj, this.f62933b);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (this.f62939h) {
                return;
            }
            this.f62939h = true;
            this.f62934c.m31862p(this);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62939h;
        }
    }

    public BehaviorSubject() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f62929d = reentrantReadWriteLock.readLock();
        this.f62930e = reentrantReadWriteLock.writeLock();
        this.f62928c = new AtomicReference<>(f62925i);
        this.f62927b = new AtomicReference<>();
        this.f62931f = new AtomicReference<>();
    }

    @Override // io.reactivex.Observer
    /* renamed from: a */
    public void mo31373a(Disposable disposable) {
        if (this.f62931f.get() != null) {
            disposable.mo31379f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        r8.m31807c(r0);
     */
    @Override // io.reactivex.Observable
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo31371m(io.reactivex.Observer<? super T> r8) {
        /*
            r7 = this;
            io.reactivex.subjects.BehaviorSubject$BehaviorDisposable r0 = new io.reactivex.subjects.BehaviorSubject$BehaviorDisposable
            r0.<init>(r8, r7)
            r8.mo31373a(r0)
        L8:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.BehaviorSubject$BehaviorDisposable<T>[]> r1 = r7.f62928c
            java.lang.Object r1 = r1.get()
            io.reactivex.subjects.BehaviorSubject$BehaviorDisposable[] r1 = (io.reactivex.subjects.BehaviorSubject.BehaviorDisposable[]) r1
            io.reactivex.subjects.BehaviorSubject$BehaviorDisposable[] r2 = io.reactivex.subjects.BehaviorSubject.f62926j
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L18
            r1 = 0
            goto L2b
        L18:
            int r2 = r1.length
            int r5 = r2 + 1
            io.reactivex.subjects.BehaviorSubject$BehaviorDisposable[] r5 = new io.reactivex.subjects.BehaviorSubject.BehaviorDisposable[r5]
            java.lang.System.arraycopy(r1, r3, r5, r3, r2)
            r5[r2] = r0
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.BehaviorSubject$BehaviorDisposable<T>[]> r2 = r7.f62928c
            boolean r1 = r2.compareAndSet(r1, r5)
            if (r1 == 0) goto L8
            r1 = 1
        L2b:
            if (r1 == 0) goto L8b
            boolean r8 = r0.f62939h
            if (r8 == 0) goto L36
            r7.m31862p(r0)
            goto L9e
        L36:
            boolean r8 = r0.f62939h
            if (r8 == 0) goto L3b
            goto L9e
        L3b:
            monitor-enter(r0)
            boolean r8 = r0.f62939h     // Catch: java.lang.Throwable -> L88
            if (r8 == 0) goto L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L88
            goto L9e
        L42:
            boolean r8 = r0.f62935d     // Catch: java.lang.Throwable -> L88
            if (r8 == 0) goto L48
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L88
            goto L9e
        L48:
            io.reactivex.subjects.BehaviorSubject<T> r8 = r0.f62934c     // Catch: java.lang.Throwable -> L88
            java.util.concurrent.locks.Lock r1 = r8.f62929d     // Catch: java.lang.Throwable -> L88
            r1.lock()     // Catch: java.lang.Throwable -> L88
            long r5 = r8.f62932g     // Catch: java.lang.Throwable -> L88
            r0.f62940i = r5     // Catch: java.lang.Throwable -> L88
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r8 = r8.f62927b     // Catch: java.lang.Throwable -> L88
            java.lang.Object r8 = r8.get()     // Catch: java.lang.Throwable -> L88
            r1.unlock()     // Catch: java.lang.Throwable -> L88
            if (r8 == 0) goto L60
            r1 = 1
            goto L61
        L60:
            r1 = 0
        L61:
            r0.f62936e = r1     // Catch: java.lang.Throwable -> L88
            r0.f62935d = r4     // Catch: java.lang.Throwable -> L88
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L88
            if (r8 == 0) goto L9e
            boolean r8 = r0.mo31407b(r8)
            if (r8 == 0) goto L6f
            goto L9e
        L6f:
            boolean r8 = r0.f62939h
            if (r8 == 0) goto L74
            goto L9e
        L74:
            monitor-enter(r0)
            io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r8 = r0.f62937f     // Catch: java.lang.Throwable -> L85
            if (r8 != 0) goto L7d
            r0.f62936e = r3     // Catch: java.lang.Throwable -> L85
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L85
            goto L9e
        L7d:
            r1 = 0
            r0.f62937f = r1     // Catch: java.lang.Throwable -> L85
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
            java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r7.f62931f
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
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.subjects.BehaviorSubject.mo31371m(io.reactivex.Observer):void");
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (this.f62931f.compareAndSet(null, ExceptionHelper.f62793a)) {
            NotificationLite notificationLite = NotificationLite.COMPLETE;
            AtomicReference<BehaviorDisposable<T>[]> atomicReference = this.f62928c;
            BehaviorDisposable<T>[] behaviorDisposableArr = f62926j;
            BehaviorDisposable<T>[] andSet = atomicReference.getAndSet(behaviorDisposableArr);
            if (andSet != behaviorDisposableArr) {
                m31863q(notificationLite);
            }
            for (BehaviorDisposable<T> behaviorDisposable : andSet) {
                behaviorDisposable.m31864a(notificationLite, this.f62932g);
            }
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        Objects.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f62931f.compareAndSet(null, th)) {
            RxJavaPlugins.m31848b(th);
            return;
        }
        Object m31832e = NotificationLite.m31832e(th);
        AtomicReference<BehaviorDisposable<T>[]> atomicReference = this.f62928c;
        BehaviorDisposable<T>[] behaviorDisposableArr = f62926j;
        BehaviorDisposable<T>[] andSet = atomicReference.getAndSet(behaviorDisposableArr);
        if (andSet != behaviorDisposableArr) {
            m31863q(m31832e);
        }
        for (BehaviorDisposable<T> behaviorDisposable : andSet) {
            behaviorDisposable.m31864a(m31832e, this.f62932g);
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        Objects.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f62931f.get() != null) {
            return;
        }
        m31863q(t);
        for (BehaviorDisposable<T> behaviorDisposable : this.f62928c.get()) {
            behaviorDisposable.m31864a(t, this.f62932g);
        }
    }

    /* renamed from: p */
    public void m31862p(BehaviorDisposable<T> behaviorDisposable) {
        BehaviorDisposable<T>[] behaviorDisposableArr;
        BehaviorDisposable<T>[] behaviorDisposableArr2;
        do {
            behaviorDisposableArr = this.f62928c.get();
            int length = behaviorDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                } else if (behaviorDisposableArr[i2] == behaviorDisposable) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 < 0) {
                return;
            }
            if (length == 1) {
                behaviorDisposableArr2 = f62925i;
            } else {
                BehaviorDisposable<T>[] behaviorDisposableArr3 = new BehaviorDisposable[length - 1];
                System.arraycopy(behaviorDisposableArr, 0, behaviorDisposableArr3, 0, i2);
                System.arraycopy(behaviorDisposableArr, i2 + 1, behaviorDisposableArr3, i2, (length - i2) - 1);
                behaviorDisposableArr2 = behaviorDisposableArr3;
            }
        } while (!this.f62928c.compareAndSet(behaviorDisposableArr, behaviorDisposableArr2));
    }

    /* renamed from: q */
    public void m31863q(Object obj) {
        this.f62930e.lock();
        this.f62932g++;
        this.f62927b.lazySet(obj);
        this.f62930e.unlock();
    }
}
