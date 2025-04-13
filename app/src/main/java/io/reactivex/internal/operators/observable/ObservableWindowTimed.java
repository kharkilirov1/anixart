package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.subjects.UnicastSubject;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableWindowTimed<T> extends AbstractObservableWithUpstream<T, Observable<T>> {

    public static final class WindowExactBoundedObserver<T> extends QueueDrainObserver<T, Object, Observable<T>> implements Disposable {

        /* renamed from: h */
        public final long f62245h;

        /* renamed from: i */
        public final TimeUnit f62246i;

        /* renamed from: j */
        public final Scheduler f62247j;

        /* renamed from: k */
        public final int f62248k;

        /* renamed from: l */
        public final boolean f62249l;

        /* renamed from: m */
        public final long f62250m;

        /* renamed from: n */
        public final Scheduler.Worker f62251n;

        /* renamed from: o */
        public long f62252o;

        /* renamed from: p */
        public long f62253p;

        /* renamed from: q */
        public Disposable f62254q;

        /* renamed from: r */
        public UnicastSubject<T> f62255r;

        /* renamed from: s */
        public volatile boolean f62256s;

        /* renamed from: t */
        public final AtomicReference<Disposable> f62257t;

        public static final class ConsumerIndexHolder implements Runnable {

            /* renamed from: b */
            public final long f62258b;

            /* renamed from: c */
            public final WindowExactBoundedObserver<?> f62259c;

            public ConsumerIndexHolder(long j2, WindowExactBoundedObserver<?> windowExactBoundedObserver) {
                this.f62258b = j2;
                this.f62259c = windowExactBoundedObserver;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindowExactBoundedObserver<?> windowExactBoundedObserver = this.f62259c;
                if (windowExactBoundedObserver.f59669e) {
                    windowExactBoundedObserver.f62256s = true;
                    windowExactBoundedObserver.m31734k();
                } else {
                    windowExactBoundedObserver.f59668d.offer(this);
                }
                if (windowExactBoundedObserver.m31440e()) {
                    windowExactBoundedObserver.m31735l();
                }
            }
        }

        public WindowExactBoundedObserver(Observer<? super Observable<T>> observer, long j2, TimeUnit timeUnit, Scheduler scheduler, int i2, long j3, boolean z) {
            super(observer, new MpscLinkedQueue());
            this.f62257t = new AtomicReference<>();
            this.f62245h = j2;
            this.f62246i = null;
            this.f62247j = null;
            this.f62248k = i2;
            this.f62250m = j3;
            this.f62249l = z;
            if (z) {
                throw null;
            }
            this.f62251n = null;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            Disposable mo31378e;
            if (DisposableHelper.m31414h(this.f62254q, disposable)) {
                this.f62254q = disposable;
                Observer<? super V> observer = this.f59667c;
                observer.mo31373a(this);
                if (this.f59669e) {
                    return;
                }
                UnicastSubject<T> m31871p = UnicastSubject.m31871p(this.f62248k);
                this.f62255r = m31871p;
                observer.onNext(m31871p);
                ConsumerIndexHolder consumerIndexHolder = new ConsumerIndexHolder(this.f62253p, this);
                if (this.f62249l) {
                    Scheduler.Worker worker = this.f62251n;
                    long j2 = this.f62245h;
                    mo31378e = worker.mo31384d(consumerIndexHolder, j2, j2, this.f62246i);
                } else {
                    Scheduler scheduler = this.f62247j;
                    long j3 = this.f62245h;
                    mo31378e = scheduler.mo31378e(consumerIndexHolder, j3, j3, this.f62246i);
                }
                DisposableHelper.m31411c(this.f62257t, mo31378e);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f59669e = true;
        }

        /* renamed from: k */
        public void m31734k() {
            DisposableHelper.m31409a(this.f62257t);
            Scheduler.Worker worker = this.f62251n;
            if (worker != null) {
                worker.mo31379f();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.subjects.UnicastSubject<T>] */
        /* renamed from: l */
        public void m31735l() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.f59668d;
            Observer<? super V> observer = this.f59667c;
            UnicastSubject<T> unicastSubject = this.f62255r;
            int i2 = 1;
            while (!this.f62256s) {
                boolean z = this.f59670f;
                Object poll = mpscLinkedQueue.poll();
                boolean z2 = poll == null;
                boolean z3 = poll instanceof ConsumerIndexHolder;
                if (z && (z2 || z3)) {
                    this.f62255r = null;
                    mpscLinkedQueue.clear();
                    m31734k();
                    Throwable th = this.f59671g;
                    if (th != null) {
                        unicastSubject.onError(th);
                        return;
                    } else {
                        unicastSubject.onComplete();
                        return;
                    }
                }
                if (z2) {
                    i2 = m31444j(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else if (z3) {
                    ConsumerIndexHolder consumerIndexHolder = (ConsumerIndexHolder) poll;
                    if (this.f62249l || this.f62253p == consumerIndexHolder.f62258b) {
                        unicastSubject.onComplete();
                        this.f62252o = 0L;
                        unicastSubject = (UnicastSubject<T>) UnicastSubject.m31871p(this.f62248k);
                        this.f62255r = unicastSubject;
                        observer.onNext(unicastSubject);
                    }
                } else {
                    unicastSubject.onNext(poll);
                    long j2 = this.f62252o + 1;
                    if (j2 >= this.f62250m) {
                        this.f62253p++;
                        this.f62252o = 0L;
                        unicastSubject.onComplete();
                        unicastSubject = (UnicastSubject<T>) UnicastSubject.m31871p(this.f62248k);
                        this.f62255r = unicastSubject;
                        this.f59667c.onNext(unicastSubject);
                        if (this.f62249l) {
                            Disposable disposable = this.f62257t.get();
                            disposable.mo31379f();
                            Scheduler.Worker worker = this.f62251n;
                            ConsumerIndexHolder consumerIndexHolder2 = new ConsumerIndexHolder(this.f62253p, this);
                            long j3 = this.f62245h;
                            Disposable mo31384d = worker.mo31384d(consumerIndexHolder2, j3, j3, this.f62246i);
                            if (!this.f62257t.compareAndSet(disposable, mo31384d)) {
                                mo31384d.mo31379f();
                            }
                        }
                    } else {
                        this.f62252o = j2;
                    }
                }
            }
            this.f62254q.mo31379f();
            mpscLinkedQueue.clear();
            m31734k();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f59670f = true;
            if (m31440e()) {
                m31735l();
            }
            this.f59667c.onComplete();
            m31734k();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f59671g = th;
            this.f59670f = true;
            if (m31440e()) {
                m31735l();
            }
            this.f59667c.onError(th);
            m31734k();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f62256s) {
                return;
            }
            if (m31441g()) {
                UnicastSubject<T> unicastSubject = this.f62255r;
                unicastSubject.onNext(t);
                long j2 = this.f62252o + 1;
                if (j2 >= this.f62250m) {
                    this.f62253p++;
                    this.f62252o = 0L;
                    unicastSubject.onComplete();
                    UnicastSubject<T> m31871p = UnicastSubject.m31871p(this.f62248k);
                    this.f62255r = m31871p;
                    this.f59667c.onNext(m31871p);
                    if (this.f62249l) {
                        this.f62257t.get().mo31379f();
                        Scheduler.Worker worker = this.f62251n;
                        ConsumerIndexHolder consumerIndexHolder = new ConsumerIndexHolder(this.f62253p, this);
                        long j3 = this.f62245h;
                        DisposableHelper.m31411c(this.f62257t, worker.mo31384d(consumerIndexHolder, j3, j3, this.f62246i));
                    }
                } else {
                    this.f62252o = j2;
                }
                if (m31444j(-1) == 0) {
                    return;
                }
            } else {
                this.f59668d.offer(t);
                if (!m31440e()) {
                    return;
                }
            }
            m31735l();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f59669e;
        }
    }

    public static final class WindowExactUnboundedObserver<T> extends QueueDrainObserver<T, Object, Observable<T>> implements Disposable, Runnable {

        /* renamed from: p */
        public static final Object f62260p = new Object();

        /* renamed from: h */
        public final long f62261h;

        /* renamed from: i */
        public final TimeUnit f62262i;

        /* renamed from: j */
        public final Scheduler f62263j;

        /* renamed from: k */
        public final int f62264k;

        /* renamed from: l */
        public Disposable f62265l;

        /* renamed from: m */
        public UnicastSubject<T> f62266m;

        /* renamed from: n */
        public final AtomicReference<Disposable> f62267n;

        /* renamed from: o */
        public volatile boolean f62268o;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62265l, disposable)) {
                this.f62265l = disposable;
                this.f62266m = UnicastSubject.m31871p(this.f62264k);
                Observer<? super V> observer = this.f59667c;
                observer.mo31373a(this);
                observer.onNext(this.f62266m);
                if (this.f59669e) {
                    return;
                }
                Scheduler scheduler = this.f62263j;
                long j2 = this.f62261h;
                DisposableHelper.m31411c(this.f62267n, scheduler.mo31378e(this, j2, j2, this.f62262i));
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f59669e = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
        
            r2.onError(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        
            r2.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            r7.f62266m = null;
            r0.clear();
            io.reactivex.internal.disposables.DisposableHelper.m31409a(r7.f62267n);
            r0 = r7.f59671g;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
        
            if (r0 == null) goto L11;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.subjects.UnicastSubject<T>] */
        /* renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m31736k() {
            /*
                r7 = this;
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r7.f59668d
                io.reactivex.internal.queue.MpscLinkedQueue r0 = (io.reactivex.internal.queue.MpscLinkedQueue) r0
                io.reactivex.Observer<? super V> r1 = r7.f59667c
                io.reactivex.subjects.UnicastSubject<T> r2 = r7.f62266m
                r3 = 1
            L9:
                boolean r4 = r7.f62268o
                boolean r5 = r7.f59670f
                java.lang.Object r6 = r0.poll()
                if (r5 == 0) goto L30
                if (r6 == 0) goto L19
                java.lang.Object r5 = io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactUnboundedObserver.f62260p
                if (r6 != r5) goto L30
            L19:
                r1 = 0
                r7.f62266m = r1
                r0.clear()
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r7.f62267n
                io.reactivex.internal.disposables.DisposableHelper.m31409a(r0)
                java.lang.Throwable r0 = r7.f59671g
                if (r0 == 0) goto L2c
                r2.onError(r0)
                goto L2f
            L2c:
                r2.onComplete()
            L2f:
                return
            L30:
                if (r6 != 0) goto L3a
                int r3 = -r3
                int r3 = r7.m31444j(r3)
                if (r3 != 0) goto L9
                return
            L3a:
                java.lang.Object r5 = io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactUnboundedObserver.f62260p
                if (r6 != r5) goto L55
                r2.onComplete()
                if (r4 != 0) goto L4f
                int r2 = r7.f62264k
                io.reactivex.subjects.UnicastSubject r2 = io.reactivex.subjects.UnicastSubject.m31871p(r2)
                r7.f62266m = r2
                r1.onNext(r2)
                goto L9
            L4f:
                io.reactivex.disposables.Disposable r4 = r7.f62265l
                r4.mo31379f()
                goto L9
            L55:
                r2.onNext(r6)
                goto L9
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactUnboundedObserver.m31736k():void");
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f59670f = true;
            if (m31440e()) {
                m31736k();
            }
            DisposableHelper.m31409a(this.f62267n);
            this.f59667c.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f59671g = th;
            this.f59670f = true;
            if (m31440e()) {
                m31736k();
            }
            DisposableHelper.m31409a(this.f62267n);
            this.f59667c.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f62268o) {
                return;
            }
            if (m31441g()) {
                this.f62266m.onNext(t);
                if (m31444j(-1) == 0) {
                    return;
                }
            } else {
                this.f59668d.offer(t);
                if (!m31440e()) {
                    return;
                }
            }
            m31736k();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f59669e) {
                this.f62268o = true;
                DisposableHelper.m31409a(this.f62267n);
            }
            this.f59668d.offer(f62260p);
            if (m31440e()) {
                m31736k();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f59669e;
        }
    }

    public static final class WindowSkipObserver<T> extends QueueDrainObserver<T, Object, Observable<T>> implements Disposable, Runnable {

        /* renamed from: h */
        public final long f62269h;

        /* renamed from: i */
        public final long f62270i;

        /* renamed from: j */
        public final TimeUnit f62271j;

        /* renamed from: k */
        public final Scheduler.Worker f62272k;

        /* renamed from: l */
        public final int f62273l;

        /* renamed from: m */
        public final List<UnicastSubject<T>> f62274m;

        /* renamed from: n */
        public Disposable f62275n;

        /* renamed from: o */
        public volatile boolean f62276o;

        public final class CompletionTask implements Runnable {

            /* renamed from: b */
            public final UnicastSubject<T> f62277b;

            public CompletionTask(UnicastSubject<T> unicastSubject) {
                this.f62277b = unicastSubject;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindowSkipObserver windowSkipObserver = WindowSkipObserver.this;
                windowSkipObserver.f59668d.offer(new SubjectWork(this.f62277b, false));
                if (windowSkipObserver.m31440e()) {
                    windowSkipObserver.m31737k();
                }
            }
        }

        public static final class SubjectWork<T> {

            /* renamed from: a */
            public final UnicastSubject<T> f62279a;

            /* renamed from: b */
            public final boolean f62280b;

            public SubjectWork(UnicastSubject<T> unicastSubject, boolean z) {
                this.f62279a = unicastSubject;
                this.f62280b = z;
            }
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62275n, disposable)) {
                this.f62275n = disposable;
                this.f59667c.mo31373a(this);
                if (this.f59669e) {
                    return;
                }
                UnicastSubject<T> m31871p = UnicastSubject.m31871p(this.f62273l);
                this.f62274m.add(m31871p);
                this.f59667c.onNext(m31871p);
                this.f62272k.mo31383c(new CompletionTask(m31871p), this.f62269h, this.f62271j);
                Scheduler.Worker worker = this.f62272k;
                long j2 = this.f62270i;
                worker.mo31384d(this, j2, j2, this.f62271j);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f59669e = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: k */
        public void m31737k() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.f59668d;
            Observer<? super V> observer = this.f59667c;
            List<UnicastSubject<T>> list = this.f62274m;
            int i2 = 1;
            while (!this.f62276o) {
                boolean z = this.f59670f;
                Object poll = mpscLinkedQueue.poll();
                boolean z2 = poll == null;
                boolean z3 = poll instanceof SubjectWork;
                if (z && (z2 || z3)) {
                    mpscLinkedQueue.clear();
                    Throwable th = this.f59671g;
                    if (th != null) {
                        Iterator<UnicastSubject<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th);
                        }
                    } else {
                        Iterator<UnicastSubject<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    this.f62272k.mo31379f();
                    list.clear();
                    return;
                }
                if (z2) {
                    i2 = m31444j(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else if (z3) {
                    SubjectWork subjectWork = (SubjectWork) poll;
                    if (!subjectWork.f62280b) {
                        list.remove(subjectWork.f62279a);
                        subjectWork.f62279a.onComplete();
                        if (list.isEmpty() && this.f59669e) {
                            this.f62276o = true;
                        }
                    } else if (!this.f59669e) {
                        UnicastSubject<T> m31871p = UnicastSubject.m31871p(this.f62273l);
                        list.add(m31871p);
                        observer.onNext(m31871p);
                        this.f62272k.mo31383c(new CompletionTask(m31871p), this.f62269h, this.f62271j);
                    }
                } else {
                    Iterator<UnicastSubject<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(poll);
                    }
                }
            }
            this.f62275n.mo31379f();
            this.f62272k.mo31379f();
            mpscLinkedQueue.clear();
            list.clear();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f59670f = true;
            if (m31440e()) {
                m31737k();
            }
            this.f59667c.onComplete();
            this.f62272k.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f59671g = th;
            this.f59670f = true;
            if (m31440e()) {
                m31737k();
            }
            this.f59667c.onError(th);
            this.f62272k.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (m31441g()) {
                Iterator<UnicastSubject<T>> it = this.f62274m.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t);
                }
                if (m31444j(-1) == 0) {
                    return;
                }
            } else {
                this.f59668d.offer(t);
                if (!m31440e()) {
                    return;
                }
            }
            m31737k();
        }

        @Override // java.lang.Runnable
        public void run() {
            SubjectWork subjectWork = new SubjectWork(UnicastSubject.m31871p(this.f62273l), true);
            if (!this.f59669e) {
                this.f59668d.offer(subjectWork);
            }
            if (m31440e()) {
                m31737k();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f59669e;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super Observable<T>> observer) {
        this.f61337b.mo31364c(new WindowExactBoundedObserver(new SerializedObserver(observer), 0L, null, null, 0, 0L, false));
    }
}
