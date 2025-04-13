package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableFlatMap<T, U> extends AbstractObservableWithUpstream<T, U> {

    public static final class InnerObserver<T, U> extends AtomicReference<Disposable> implements Observer<U> {

        /* renamed from: b */
        public final long f61636b;

        /* renamed from: c */
        public final MergeObserver<T, U> f61637c;

        /* renamed from: d */
        public volatile boolean f61638d;

        /* renamed from: e */
        public volatile SimpleQueue<U> f61639e;

        /* renamed from: f */
        public int f61640f;

        public InnerObserver(MergeObserver<T, U> mergeObserver, long j2) {
            this.f61636b = j2;
            this.f61637c = mergeObserver;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31413e(this, disposable) && (disposable instanceof QueueDisposable)) {
                QueueDisposable queueDisposable = (QueueDisposable) disposable;
                int mo31420F = queueDisposable.mo31420F(7);
                if (mo31420F == 1) {
                    this.f61640f = mo31420F;
                    this.f61639e = queueDisposable;
                    this.f61638d = true;
                    this.f61637c.m31664d();
                    return;
                }
                if (mo31420F == 2) {
                    this.f61640f = mo31420F;
                    this.f61639e = queueDisposable;
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61638d = true;
            this.f61637c.m31664d();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f61637c.f61650i, th)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            MergeObserver<T, U> mergeObserver = this.f61637c;
            if (!mergeObserver.f61645d) {
                mergeObserver.m31663c();
            }
            this.f61638d = true;
            this.f61637c.m31664d();
        }

        @Override // io.reactivex.Observer
        public void onNext(U u) {
            if (this.f61640f != 0) {
                this.f61637c.m31664d();
                return;
            }
            MergeObserver<T, U> mergeObserver = this.f61637c;
            if (mergeObserver.get() == 0 && mergeObserver.compareAndSet(0, 1)) {
                mergeObserver.f61643b.onNext(u);
                if (mergeObserver.decrementAndGet() == 0) {
                    return;
                }
            } else {
                SimpleQueue simpleQueue = this.f61639e;
                if (simpleQueue == null) {
                    simpleQueue = new SpscLinkedArrayQueue(mergeObserver.f61647f);
                    this.f61639e = simpleQueue;
                }
                simpleQueue.offer(u);
                if (mergeObserver.getAndIncrement() != 0) {
                    return;
                }
            }
            mergeObserver.m31665e();
        }
    }

    public static final class MergeObserver<T, U> extends AtomicInteger implements Disposable, Observer<T> {

        /* renamed from: r */
        public static final InnerObserver<?, ?>[] f61641r = new InnerObserver[0];

        /* renamed from: s */
        public static final InnerObserver<?, ?>[] f61642s = new InnerObserver[0];

        /* renamed from: b */
        public final Observer<? super U> f61643b;

        /* renamed from: d */
        public final boolean f61645d;

        /* renamed from: e */
        public final int f61646e;

        /* renamed from: f */
        public final int f61647f;

        /* renamed from: g */
        public volatile SimplePlainQueue<U> f61648g;

        /* renamed from: h */
        public volatile boolean f61649h;

        /* renamed from: j */
        public volatile boolean f61651j;

        /* renamed from: k */
        public final AtomicReference<InnerObserver<?, ?>[]> f61652k;

        /* renamed from: l */
        public Disposable f61653l;

        /* renamed from: m */
        public long f61654m;

        /* renamed from: n */
        public long f61655n;

        /* renamed from: o */
        public int f61656o;

        /* renamed from: p */
        public Queue<ObservableSource<? extends U>> f61657p;

        /* renamed from: q */
        public int f61658q;

        /* renamed from: i */
        public final AtomicThrowable f61650i = new AtomicThrowable();

        /* renamed from: c */
        public final Function<? super T, ? extends ObservableSource<? extends U>> f61644c = null;

        public MergeObserver(Observer<? super U> observer, Function<? super T, ? extends ObservableSource<? extends U>> function, boolean z, int i2, int i3) {
            this.f61643b = observer;
            this.f61645d = z;
            this.f61646e = i2;
            this.f61647f = i3;
            if (i2 != Integer.MAX_VALUE) {
                this.f61657p = new ArrayDeque(i2);
            }
            this.f61652k = new AtomicReference<>(f61641r);
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61653l, disposable)) {
                this.f61653l = disposable;
                this.f61643b.mo31373a(this);
            }
        }

        /* renamed from: b */
        public boolean m31662b() {
            if (this.f61651j) {
                return true;
            }
            Throwable th = this.f61650i.get();
            if (this.f61645d || th == null) {
                return false;
            }
            m31663c();
            Throwable m31818b = ExceptionHelper.m31818b(this.f61650i);
            if (m31818b != ExceptionHelper.f62793a) {
                this.f61643b.onError(m31818b);
            }
            return true;
        }

        /* renamed from: c */
        public boolean m31663c() {
            InnerObserver<?, ?>[] andSet;
            this.f61653l.mo31379f();
            InnerObserver<?, ?>[] innerObserverArr = this.f61652k.get();
            InnerObserver<?, ?>[] innerObserverArr2 = f61642s;
            if (innerObserverArr == innerObserverArr2 || (andSet = this.f61652k.getAndSet(innerObserverArr2)) == innerObserverArr2) {
                return false;
            }
            for (InnerObserver<?, ?> innerObserver : andSet) {
                DisposableHelper.m31409a(innerObserver);
            }
            return true;
        }

        /* renamed from: d */
        public void m31664d() {
            if (getAndIncrement() == 0) {
                m31665e();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:131:0x0004, code lost:
        
            continue;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m31665e() {
            /*
                Method dump skipped, instructions count: 299
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver.m31665e():void");
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            Throwable m31818b;
            if (this.f61651j) {
                return;
            }
            this.f61651j = true;
            if (!m31663c() || (m31818b = ExceptionHelper.m31818b(this.f61650i)) == null || m31818b == ExceptionHelper.f62793a) {
                return;
            }
            RxJavaPlugins.m31848b(m31818b);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        public void m31666g(InnerObserver<T, U> innerObserver) {
            InnerObserver<?, ?>[] innerObserverArr;
            InnerObserver<?, ?>[] innerObserverArr2;
            do {
                innerObserverArr = this.f61652k.get();
                int length = innerObserverArr.length;
                if (length == 0) {
                    return;
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    } else if (innerObserverArr[i2] == innerObserver) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 < 0) {
                    return;
                }
                if (length == 1) {
                    innerObserverArr2 = f61641r;
                } else {
                    InnerObserver<?, ?>[] innerObserverArr3 = new InnerObserver[length - 1];
                    System.arraycopy(innerObserverArr, 0, innerObserverArr3, 0, i2);
                    System.arraycopy(innerObserverArr, i2 + 1, innerObserverArr3, i2, (length - i2) - 1);
                    innerObserverArr2 = innerObserverArr3;
                }
            } while (!this.f61652k.compareAndSet(innerObserverArr, innerObserverArr2));
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
        
            if (decrementAndGet() == 0) goto L31;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v22 */
        /* JADX WARN: Type inference failed for: r3v23 */
        /* JADX WARN: Type inference failed for: r3v8, types: [io.reactivex.internal.fuseable.SimpleQueue] */
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m31667h(io.reactivex.ObservableSource<? extends U> r8) {
            /*
                r7 = this;
            L0:
                boolean r0 = r8 instanceof java.util.concurrent.Callable
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L8e
                java.util.concurrent.Callable r8 = (java.util.concurrent.Callable) r8
                r0 = 2147483647(0x7fffffff, float:NaN)
                java.lang.Object r8 = r8.call()     // Catch: java.lang.Throwable -> L60
                if (r8 != 0) goto L12
                goto L6c
            L12:
                int r3 = r7.get()
                if (r3 != 0) goto L2a
                boolean r3 = r7.compareAndSet(r1, r2)
                if (r3 == 0) goto L2a
                io.reactivex.Observer<? super U> r3 = r7.f61643b
                r3.onNext(r8)
                int r8 = r7.decrementAndGet()
                if (r8 != 0) goto L5c
                goto L6c
            L2a:
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r3 = r7.f61648g
                if (r3 != 0) goto L43
                int r3 = r7.f61646e
                if (r3 != r0) goto L3a
                io.reactivex.internal.queue.SpscLinkedArrayQueue r3 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                int r4 = r7.f61647f
                r3.<init>(r4)
                goto L41
            L3a:
                io.reactivex.internal.queue.SpscArrayQueue r3 = new io.reactivex.internal.queue.SpscArrayQueue
                int r4 = r7.f61646e
                r3.<init>(r4)
            L41:
                r7.f61648g = r3
            L43:
                boolean r8 = r3.offer(r8)
                if (r8 != 0) goto L54
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r3 = "Scalar queue full?!"
                r8.<init>(r3)
                r7.onError(r8)
                goto L6c
            L54:
                int r8 = r7.getAndIncrement()
                if (r8 == 0) goto L5c
                r8 = 0
                goto L6d
            L5c:
                r7.m31665e()
                goto L6c
            L60:
                r8 = move-exception
                io.reactivex.exceptions.Exceptions.m31402a(r8)
                io.reactivex.internal.util.AtomicThrowable r3 = r7.f61650i
                io.reactivex.internal.util.ExceptionHelper.m31817a(r3, r8)
                r7.m31664d()
            L6c:
                r8 = 1
            L6d:
                if (r8 == 0) goto Lc2
                int r8 = r7.f61646e
                if (r8 == r0) goto Lc2
                monitor-enter(r7)
                java.util.Queue<io.reactivex.ObservableSource<? extends U>> r8 = r7.f61657p     // Catch: java.lang.Throwable -> L8b
                java.lang.Object r8 = r8.poll()     // Catch: java.lang.Throwable -> L8b
                io.reactivex.ObservableSource r8 = (io.reactivex.ObservableSource) r8     // Catch: java.lang.Throwable -> L8b
                if (r8 != 0) goto L84
                int r0 = r7.f61658q     // Catch: java.lang.Throwable -> L8b
                int r0 = r0 - r2
                r7.f61658q = r0     // Catch: java.lang.Throwable -> L8b
                r1 = 1
            L84:
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L8b
                if (r1 == 0) goto L0
                r7.m31664d()
                goto Lc2
            L8b:
                r8 = move-exception
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L8b
                throw r8
            L8e:
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver r0 = new io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver
                long r3 = r7.f61654m
                r5 = 1
                long r5 = r5 + r3
                r7.f61654m = r5
                r0.<init>(r7, r3)
            L9a:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver<?, ?>[]> r3 = r7.f61652k
                java.lang.Object r3 = r3.get()
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver[] r3 = (io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[]) r3
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver<?, ?>[] r4 = io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver.f61642s
                if (r3 != r4) goto Laa
                io.reactivex.internal.disposables.DisposableHelper.m31409a(r0)
                goto Lbd
            Laa:
                int r4 = r3.length
                int r5 = r4 + 1
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver[] r5 = new io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[r5]
                java.lang.System.arraycopy(r3, r1, r5, r1, r4)
                r5[r4] = r0
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver<?, ?>[]> r4 = r7.f61652k
                boolean r3 = r4.compareAndSet(r3, r5)
                if (r3 == 0) goto L9a
                r1 = 1
            Lbd:
                if (r1 == 0) goto Lc2
                r8.mo31364c(r0)
            Lc2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver.m31667h(io.reactivex.ObservableSource):void");
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f61649h) {
                return;
            }
            this.f61649h = true;
            m31664d();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f61649h) {
                RxJavaPlugins.m31848b(th);
            } else if (!ExceptionHelper.m31817a(this.f61650i, th)) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f61649h = true;
                m31664d();
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f61649h) {
                return;
            }
            try {
                ObservableSource<? extends U> apply = this.f61644c.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                ObservableSource<? extends U> observableSource = apply;
                if (this.f61646e != Integer.MAX_VALUE) {
                    synchronized (this) {
                        int i2 = this.f61658q;
                        if (i2 == this.f61646e) {
                            this.f61657p.offer(observableSource);
                            return;
                        }
                        this.f61658q = i2 + 1;
                    }
                }
                m31667h(observableSource);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61653l.mo31379f();
                onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61651j;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super U> observer) {
        if (ObservableScalarXMap.m31717a(this.f61337b, observer, null)) {
            return;
        }
        this.f61337b.mo31364c(new MergeObserver(observer, null, false, 0, 0));
    }
}
