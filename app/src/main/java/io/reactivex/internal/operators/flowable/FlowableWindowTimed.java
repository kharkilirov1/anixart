package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableWindowTimed<T> extends AbstractFlowableWithUpstream<T, Flowable<T>> {

    public static final class WindowExactBoundedSubscriber<T> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements Subscription {

        /* renamed from: i */
        public final long f60878i;

        /* renamed from: j */
        public final TimeUnit f60879j;

        /* renamed from: k */
        public final Scheduler f60880k;

        /* renamed from: l */
        public final int f60881l;

        /* renamed from: m */
        public final boolean f60882m;

        /* renamed from: n */
        public final long f60883n;

        /* renamed from: o */
        public final Scheduler.Worker f60884o;

        /* renamed from: p */
        public long f60885p;

        /* renamed from: q */
        public long f60886q;

        /* renamed from: r */
        public Subscription f60887r;

        /* renamed from: s */
        public UnicastProcessor<T> f60888s;

        /* renamed from: t */
        public volatile boolean f60889t;

        /* renamed from: u */
        public final SequentialDisposable f60890u;

        public static final class ConsumerIndexHolder implements Runnable {

            /* renamed from: b */
            public final long f60891b;

            /* renamed from: c */
            public final WindowExactBoundedSubscriber<?> f60892c;

            public ConsumerIndexHolder(long j2, WindowExactBoundedSubscriber<?> windowExactBoundedSubscriber) {
                this.f60891b = j2;
                this.f60892c = windowExactBoundedSubscriber;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindowExactBoundedSubscriber<?> windowExactBoundedSubscriber = this.f60892c;
                if (windowExactBoundedSubscriber.f62746f) {
                    windowExactBoundedSubscriber.f60889t = true;
                    windowExactBoundedSubscriber.m31604f();
                } else {
                    windowExactBoundedSubscriber.f62745e.offer(this);
                }
                if (windowExactBoundedSubscriber.m31780b()) {
                    windowExactBoundedSubscriber.m31605l();
                }
            }
        }

        public WindowExactBoundedSubscriber(Subscriber<? super Flowable<T>> subscriber, long j2, TimeUnit timeUnit, Scheduler scheduler, int i2, long j3, boolean z) {
            super(subscriber, new MpscLinkedQueue());
            this.f60890u = new SequentialDisposable();
            this.f60878i = j2;
            this.f60879j = null;
            this.f60880k = null;
            this.f60881l = i2;
            this.f60883n = j3;
            this.f60882m = z;
            if (z) {
                throw null;
            }
            this.f60884o = null;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f62746f = true;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            Disposable mo31378e;
            if (SubscriptionHelper.m31804i(this.f60887r, subscription)) {
                this.f60887r = subscription;
                Subscriber<? super V> subscriber = this.f62744d;
                subscriber.mo31352d(this);
                if (this.f62746f) {
                    return;
                }
                UnicastProcessor<T> m31856i = UnicastProcessor.m31856i(this.f60881l);
                this.f60888s = m31856i;
                long m31786j = m31786j();
                if (m31786j == 0) {
                    this.f62746f = true;
                    subscription.cancel();
                    subscriber.onError(new MissingBackpressureException("Could not deliver initial window due to lack of requests."));
                    return;
                }
                subscriber.onNext(m31856i);
                if (m31786j != Long.MAX_VALUE) {
                    m31785i(1L);
                }
                ConsumerIndexHolder consumerIndexHolder = new ConsumerIndexHolder(this.f60886q, this);
                if (this.f60882m) {
                    Scheduler.Worker worker = this.f60884o;
                    long j2 = this.f60878i;
                    mo31378e = worker.mo31384d(consumerIndexHolder, j2, j2, this.f60879j);
                } else {
                    Scheduler scheduler = this.f60880k;
                    long j3 = this.f60878i;
                    mo31378e = scheduler.mo31378e(consumerIndexHolder, j3, j3, this.f60879j);
                }
                if (DisposableHelper.m31411c(this.f60890u, mo31378e)) {
                    subscription.request(Long.MAX_VALUE);
                }
            }
        }

        /* renamed from: f */
        public void m31604f() {
            DisposableHelper.m31409a(this.f60890u);
            Scheduler.Worker worker = this.f60884o;
            if (worker != null) {
                worker.mo31379f();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
        
            if (r17.f60886q == r7.f60891b) goto L33;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m31605l() {
            /*
                Method dump skipped, instructions count: 285
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber.m31605l():void");
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f62747g = true;
            if (m31780b()) {
                m31605l();
            }
            this.f62744d.onComplete();
            m31604f();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f62748h = th;
            this.f62747g = true;
            if (m31780b()) {
                m31605l();
            }
            this.f62744d.onError(th);
            m31604f();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60889t) {
                return;
            }
            if (m31781c()) {
                UnicastProcessor<T> unicastProcessor = this.f60888s;
                unicastProcessor.onNext(t);
                long j2 = this.f60885p + 1;
                if (j2 >= this.f60883n) {
                    this.f60886q++;
                    this.f60885p = 0L;
                    unicastProcessor.onComplete();
                    long m31786j = m31786j();
                    if (m31786j == 0) {
                        this.f60888s = null;
                        this.f60887r.cancel();
                        this.f62744d.onError(new MissingBackpressureException("Could not deliver window due to lack of requests"));
                        m31604f();
                        return;
                    }
                    UnicastProcessor<T> m31856i = UnicastProcessor.m31856i(this.f60881l);
                    this.f60888s = m31856i;
                    this.f62744d.onNext(m31856i);
                    if (m31786j != Long.MAX_VALUE) {
                        m31785i(1L);
                    }
                    if (this.f60882m) {
                        this.f60890u.get().mo31379f();
                        Scheduler.Worker worker = this.f60884o;
                        ConsumerIndexHolder consumerIndexHolder = new ConsumerIndexHolder(this.f60886q, this);
                        long j3 = this.f60878i;
                        DisposableHelper.m31411c(this.f60890u, worker.mo31384d(consumerIndexHolder, j3, j3, this.f60879j));
                    }
                } else {
                    this.f60885p = j2;
                }
                if (m31784h(-1) == 0) {
                    return;
                }
            } else {
                this.f62745e.offer(t);
                if (!m31780b()) {
                    return;
                }
            }
            m31605l();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            m31787k(j2);
        }
    }

    public static final class WindowExactUnboundedSubscriber<T> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements Subscription, Runnable {

        /* renamed from: q */
        public static final Object f60893q = new Object();

        /* renamed from: i */
        public final long f60894i;

        /* renamed from: j */
        public final TimeUnit f60895j;

        /* renamed from: k */
        public final Scheduler f60896k;

        /* renamed from: l */
        public final int f60897l;

        /* renamed from: m */
        public Subscription f60898m;

        /* renamed from: n */
        public UnicastProcessor<T> f60899n;

        /* renamed from: o */
        public final SequentialDisposable f60900o;

        /* renamed from: p */
        public volatile boolean f60901p;

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f62746f = true;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60898m, subscription)) {
                this.f60898m = subscription;
                this.f60899n = UnicastProcessor.m31856i(this.f60897l);
                Subscriber<? super V> subscriber = this.f62744d;
                subscriber.mo31352d(this);
                long m31786j = m31786j();
                if (m31786j == 0) {
                    this.f62746f = true;
                    subscription.cancel();
                    subscriber.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
                    return;
                }
                subscriber.onNext(this.f60899n);
                if (m31786j != Long.MAX_VALUE) {
                    m31785i(1L);
                }
                if (this.f62746f) {
                    return;
                }
                SequentialDisposable sequentialDisposable = this.f60900o;
                Scheduler scheduler = this.f60896k;
                long j2 = this.f60894i;
                if (DisposableHelper.m31411c(sequentialDisposable, scheduler.mo31378e(this, j2, j2, this.f60895j))) {
                    subscription.request(Long.MAX_VALUE);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
        
            r2.onError(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        
            r2.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            r10.f60899n = null;
            r0.clear();
            io.reactivex.internal.disposables.DisposableHelper.m31409a(r10.f60900o);
            r0 = r10.f62748h;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
        
            if (r0 == null) goto L11;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.processors.UnicastProcessor<T>] */
        /* renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m31606l() {
            /*
                r10 = this;
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r10.f62745e
                org.reactivestreams.Subscriber<? super V> r1 = r10.f62744d
                io.reactivex.processors.UnicastProcessor<T> r2 = r10.f60899n
                r3 = 1
            L7:
                boolean r4 = r10.f60901p
                boolean r5 = r10.f62747g
                java.lang.Object r6 = r0.poll()
                r7 = 0
                if (r5 == 0) goto L2e
                if (r6 == 0) goto L18
                java.lang.Object r5 = io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactUnboundedSubscriber.f60893q
                if (r6 != r5) goto L2e
            L18:
                r10.f60899n = r7
                r0.clear()
                io.reactivex.internal.disposables.SequentialDisposable r0 = r10.f60900o
                io.reactivex.internal.disposables.DisposableHelper.m31409a(r0)
                java.lang.Throwable r0 = r10.f62748h
                if (r0 == 0) goto L2a
                r2.onError(r0)
                goto L2d
            L2a:
                r2.onComplete()
            L2d:
                return
            L2e:
                if (r6 != 0) goto L38
                int r3 = -r3
                int r3 = r10.m31784h(r3)
                if (r3 != 0) goto L7
                return
            L38:
                java.lang.Object r5 = io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactUnboundedSubscriber.f60893q
                if (r6 != r5) goto L87
                r2.onComplete()
                if (r4 != 0) goto L81
                int r2 = r10.f60897l
                io.reactivex.processors.UnicastProcessor r2 = io.reactivex.processors.UnicastProcessor.m31856i(r2)
                r10.f60899n = r2
                long r4 = r10.m31786j()
                r8 = 0
                int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r6 == 0) goto L65
                r1.onNext(r2)
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 == 0) goto L7
                r4 = 1
                r10.m31785i(r4)
                goto L7
            L65:
                r10.f60899n = r7
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r10.f62745e
                r0.clear()
                org.reactivestreams.Subscription r0 = r10.f60898m
                r0.cancel()
                io.reactivex.internal.disposables.SequentialDisposable r0 = r10.f60900o
                io.reactivex.internal.disposables.DisposableHelper.m31409a(r0)
                io.reactivex.exceptions.MissingBackpressureException r0 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r2 = "Could not deliver first window due to lack of requests."
                r0.<init>(r2)
                r1.onError(r0)
                return
            L81:
                org.reactivestreams.Subscription r4 = r10.f60898m
                r4.cancel()
                goto L7
            L87:
                r2.onNext(r6)
                goto L7
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactUnboundedSubscriber.m31606l():void");
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f62747g = true;
            if (m31780b()) {
                m31606l();
            }
            this.f62744d.onComplete();
            DisposableHelper.m31409a(this.f60900o);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f62748h = th;
            this.f62747g = true;
            if (m31780b()) {
                m31606l();
            }
            this.f62744d.onError(th);
            DisposableHelper.m31409a(this.f60900o);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60901p) {
                return;
            }
            if (m31781c()) {
                this.f60899n.onNext(t);
                if (m31784h(-1) == 0) {
                    return;
                }
            } else {
                this.f62745e.offer(t);
                if (!m31780b()) {
                    return;
                }
            }
            m31606l();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            m31787k(j2);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f62746f) {
                this.f60901p = true;
                DisposableHelper.m31409a(this.f60900o);
            }
            this.f62745e.offer(f60893q);
            if (m31780b()) {
                m31606l();
            }
        }
    }

    public static final class WindowSkipSubscriber<T> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements Subscription, Runnable {

        /* renamed from: i */
        public final long f60902i;

        /* renamed from: j */
        public final long f60903j;

        /* renamed from: k */
        public final TimeUnit f60904k;

        /* renamed from: l */
        public final Scheduler.Worker f60905l;

        /* renamed from: m */
        public final int f60906m;

        /* renamed from: n */
        public final List<UnicastProcessor<T>> f60907n;

        /* renamed from: o */
        public Subscription f60908o;

        /* renamed from: p */
        public volatile boolean f60909p;

        public final class Completion implements Runnable {

            /* renamed from: b */
            public final UnicastProcessor<T> f60910b;

            public Completion(UnicastProcessor<T> unicastProcessor) {
                this.f60910b = unicastProcessor;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindowSkipSubscriber windowSkipSubscriber = WindowSkipSubscriber.this;
                windowSkipSubscriber.f62745e.offer(new SubjectWork(this.f60910b, false));
                if (windowSkipSubscriber.m31780b()) {
                    windowSkipSubscriber.m31607l();
                }
            }
        }

        public static final class SubjectWork<T> {

            /* renamed from: a */
            public final UnicastProcessor<T> f60912a;

            /* renamed from: b */
            public final boolean f60913b;

            public SubjectWork(UnicastProcessor<T> unicastProcessor, boolean z) {
                this.f60912a = unicastProcessor;
                this.f60913b = z;
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f62746f = true;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60908o, subscription)) {
                this.f60908o = subscription;
                this.f62744d.mo31352d(this);
                if (this.f62746f) {
                    return;
                }
                long m31786j = m31786j();
                if (m31786j == 0) {
                    subscription.cancel();
                    this.f62744d.onError(new MissingBackpressureException("Could not emit the first window due to lack of requests"));
                    return;
                }
                UnicastProcessor<T> m31856i = UnicastProcessor.m31856i(this.f60906m);
                this.f60907n.add(m31856i);
                this.f62744d.onNext(m31856i);
                if (m31786j != Long.MAX_VALUE) {
                    m31785i(1L);
                }
                this.f60905l.mo31383c(new Completion(m31856i), this.f60902i, this.f60904k);
                Scheduler.Worker worker = this.f60905l;
                long j2 = this.f60903j;
                worker.mo31384d(this, j2, j2, this.f60904k);
                subscription.request(Long.MAX_VALUE);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: l */
        public void m31607l() {
            SimpleQueue simpleQueue = this.f62745e;
            Subscriber<? super V> subscriber = this.f62744d;
            List<UnicastProcessor<T>> list = this.f60907n;
            int i2 = 1;
            while (!this.f60909p) {
                boolean z = this.f62747g;
                Object poll = simpleQueue.poll();
                boolean z2 = poll == null;
                boolean z3 = poll instanceof SubjectWork;
                if (z && (z2 || z3)) {
                    simpleQueue.clear();
                    Throwable th = this.f62748h;
                    if (th != null) {
                        Iterator<UnicastProcessor<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th);
                        }
                    } else {
                        Iterator<UnicastProcessor<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    list.clear();
                    this.f60905l.mo31379f();
                    return;
                }
                if (z2) {
                    i2 = m31784h(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else if (z3) {
                    SubjectWork subjectWork = (SubjectWork) poll;
                    if (!subjectWork.f60913b) {
                        list.remove(subjectWork.f60912a);
                        subjectWork.f60912a.onComplete();
                        if (list.isEmpty() && this.f62746f) {
                            this.f60909p = true;
                        }
                    } else if (!this.f62746f) {
                        long m31786j = m31786j();
                        if (m31786j != 0) {
                            UnicastProcessor<T> m31856i = UnicastProcessor.m31856i(this.f60906m);
                            list.add(m31856i);
                            subscriber.onNext(m31856i);
                            if (m31786j != Long.MAX_VALUE) {
                                m31785i(1L);
                            }
                            this.f60905l.mo31383c(new Completion(m31856i), this.f60902i, this.f60904k);
                        } else {
                            subscriber.onError(new MissingBackpressureException("Can't emit window due to lack of requests"));
                        }
                    }
                } else {
                    Iterator<UnicastProcessor<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(poll);
                    }
                }
            }
            this.f60908o.cancel();
            this.f60905l.mo31379f();
            simpleQueue.clear();
            list.clear();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f62747g = true;
            if (m31780b()) {
                m31607l();
            }
            this.f62744d.onComplete();
            this.f60905l.mo31379f();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f62748h = th;
            this.f62747g = true;
            if (m31780b()) {
                m31607l();
            }
            this.f62744d.onError(th);
            this.f60905l.mo31379f();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (m31781c()) {
                Iterator<UnicastProcessor<T>> it = this.f60907n.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t);
                }
                if (m31784h(-1) == 0) {
                    return;
                }
            } else {
                this.f62745e.offer(t);
                if (!m31780b()) {
                    return;
                }
            }
            m31607l();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            m31787k(j2);
        }

        @Override // java.lang.Runnable
        public void run() {
            SubjectWork subjectWork = new SubjectWork(UnicastProcessor.m31856i(this.f60906m), true);
            if (!this.f62746f) {
                this.f62745e.offer(subjectWork);
            }
            if (m31780b()) {
                m31607l();
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super Flowable<T>> subscriber) {
        this.f59782c.m31349b(new WindowExactBoundedSubscriber(new SerializedSubscriber(subscriber), 0L, null, null, 0, 0L, false));
    }
}
