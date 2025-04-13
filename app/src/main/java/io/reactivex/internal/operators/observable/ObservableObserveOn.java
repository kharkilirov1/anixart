package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes3.dex */
public final class ObservableObserveOn<T> extends AbstractObservableWithUpstream<T, T> {

    /* renamed from: c */
    public final Scheduler f61836c;

    /* renamed from: d */
    public final boolean f61837d;

    /* renamed from: e */
    public final int f61838e;

    public static final class ObserveOnObserver<T> extends BasicIntQueueDisposable<T> implements Observer<T>, Runnable {

        /* renamed from: b */
        public final Observer<? super T> f61839b;

        /* renamed from: c */
        public final Scheduler.Worker f61840c;

        /* renamed from: d */
        public final boolean f61841d;

        /* renamed from: e */
        public final int f61842e;

        /* renamed from: f */
        public SimpleQueue<T> f61843f;

        /* renamed from: g */
        public Disposable f61844g;

        /* renamed from: h */
        public Throwable f61845h;

        /* renamed from: i */
        public volatile boolean f61846i;

        /* renamed from: j */
        public volatile boolean f61847j;

        /* renamed from: k */
        public int f61848k;

        /* renamed from: l */
        public boolean f61849l;

        public ObserveOnObserver(Observer<? super T> observer, Scheduler.Worker worker, boolean z, int i2) {
            this.f61839b = observer;
            this.f61840c = worker;
            this.f61841d = z;
            this.f61842e = i2;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            if ((i2 & 2) == 0) {
                return 0;
            }
            this.f61849l = true;
            return 2;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61844g, disposable)) {
                this.f61844g = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int mo31420F = queueDisposable.mo31420F(7);
                    if (mo31420F == 1) {
                        this.f61848k = mo31420F;
                        this.f61843f = queueDisposable;
                        this.f61846i = true;
                        this.f61839b.mo31373a(this);
                        m31690c();
                        return;
                    }
                    if (mo31420F == 2) {
                        this.f61848k = mo31420F;
                        this.f61843f = queueDisposable;
                        this.f61839b.mo31373a(this);
                        return;
                    }
                }
                this.f61843f = new SpscLinkedArrayQueue(this.f61842e);
                this.f61839b.mo31373a(this);
            }
        }

        /* renamed from: b */
        public boolean m31689b(boolean z, boolean z2, Observer<? super T> observer) {
            if (this.f61847j) {
                this.f61843f.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.f61845h;
            if (this.f61841d) {
                if (!z2) {
                    return false;
                }
                this.f61847j = true;
                if (th != null) {
                    observer.onError(th);
                } else {
                    observer.onComplete();
                }
                this.f61840c.mo31379f();
                return true;
            }
            if (th != null) {
                this.f61847j = true;
                this.f61843f.clear();
                observer.onError(th);
                this.f61840c.mo31379f();
                return true;
            }
            if (!z2) {
                return false;
            }
            this.f61847j = true;
            observer.onComplete();
            this.f61840c.mo31379f();
            return true;
        }

        /* renamed from: c */
        public void m31690c() {
            if (getAndIncrement() == 0) {
                this.f61840c.mo31382b(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f61843f.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (this.f61847j) {
                return;
            }
            this.f61847j = true;
            this.f61844g.mo31379f();
            this.f61840c.mo31379f();
            if (getAndIncrement() == 0) {
                this.f61843f.clear();
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.f61843f.isEmpty();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f61846i) {
                return;
            }
            this.f61846i = true;
            m31690c();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f61846i) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f61845h = th;
            this.f61846i = true;
            m31690c();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f61846i) {
                return;
            }
            if (this.f61848k != 2) {
                this.f61843f.offer(t);
            }
            m31690c();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            return this.f61843f.poll();
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x0075, code lost:
        
            r3 = addAndGet(-r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x007a, code lost:
        
            if (r3 != 0) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
        
            return;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r7 = this;
                boolean r0 = r7.f61849l
                r1 = 1
                if (r0 == 0) goto L4f
                r0 = 1
            L6:
                boolean r2 = r7.f61847j
                if (r2 == 0) goto Lc
                goto L97
            Lc:
                boolean r2 = r7.f61846i
                java.lang.Throwable r3 = r7.f61845h
                boolean r4 = r7.f61841d
                if (r4 != 0) goto L28
                if (r2 == 0) goto L28
                if (r3 == 0) goto L28
                r7.f61847j = r1
                io.reactivex.Observer<? super T> r0 = r7.f61839b
                java.lang.Throwable r1 = r7.f61845h
                r0.onError(r1)
                io.reactivex.Scheduler$Worker r0 = r7.f61840c
                r0.mo31379f()
                goto L97
            L28:
                io.reactivex.Observer<? super T> r3 = r7.f61839b
                r4 = 0
                r3.onNext(r4)
                if (r2 == 0) goto L47
                r7.f61847j = r1
                java.lang.Throwable r0 = r7.f61845h
                if (r0 == 0) goto L3c
                io.reactivex.Observer<? super T> r1 = r7.f61839b
                r1.onError(r0)
                goto L41
            L3c:
                io.reactivex.Observer<? super T> r0 = r7.f61839b
                r0.onComplete()
            L41:
                io.reactivex.Scheduler$Worker r0 = r7.f61840c
                r0.mo31379f()
                goto L97
            L47:
                int r0 = -r0
                int r0 = r7.addAndGet(r0)
                if (r0 != 0) goto L6
                goto L97
            L4f:
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r7.f61843f
                io.reactivex.Observer<? super T> r2 = r7.f61839b
                r3 = 1
            L54:
                boolean r4 = r7.f61846i
                boolean r5 = r0.isEmpty()
                boolean r4 = r7.m31689b(r4, r5, r2)
                if (r4 == 0) goto L61
                goto L97
            L61:
                boolean r4 = r7.f61846i
                java.lang.Object r5 = r0.poll()     // Catch: java.lang.Throwable -> L81
                if (r5 != 0) goto L6b
                r6 = 1
                goto L6c
            L6b:
                r6 = 0
            L6c:
                boolean r4 = r7.m31689b(r4, r6, r2)
                if (r4 == 0) goto L73
                goto L97
            L73:
                if (r6 == 0) goto L7d
                int r3 = -r3
                int r3 = r7.addAndGet(r3)
                if (r3 != 0) goto L54
                goto L97
            L7d:
                r2.onNext(r5)
                goto L61
            L81:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.m31402a(r3)
                r7.f61847j = r1
                io.reactivex.disposables.Disposable r1 = r7.f61844g
                r1.mo31379f()
                r0.clear()
                r2.onError(r3)
                io.reactivex.Scheduler$Worker r0 = r7.f61840c
                r0.mo31379f()
            L97:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableObserveOn.ObserveOnObserver.run():void");
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61847j;
        }
    }

    public ObservableObserveOn(ObservableSource<T> observableSource, Scheduler scheduler, boolean z, int i2) {
        super(observableSource);
        this.f61836c = scheduler;
        this.f61837d = z;
        this.f61838e = i2;
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        Scheduler scheduler = this.f61836c;
        if (scheduler instanceof TrampolineScheduler) {
            this.f61337b.mo31364c(observer);
        } else {
            this.f61337b.mo31364c(new ObserveOnObserver(observer, scheduler.mo31374a(), this.f61837d, this.f61838e));
        }
    }
}
