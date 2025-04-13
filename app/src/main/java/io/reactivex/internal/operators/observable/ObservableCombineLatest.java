package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableCombineLatest<T, R> extends Observable<R> {

    /* renamed from: b */
    public final ObservableSource<? extends T>[] f61471b;

    /* renamed from: c */
    public final Iterable<? extends ObservableSource<? extends T>> f61472c = null;

    /* renamed from: d */
    public final Function<? super Object[], ? extends R> f61473d;

    /* renamed from: e */
    public final int f61474e;

    /* renamed from: f */
    public final boolean f61475f;

    public static final class CombinerObserver<T, R> extends AtomicReference<Disposable> implements Observer<T> {

        /* renamed from: b */
        public final LatestCoordinator<T, R> f61476b;

        /* renamed from: c */
        public final int f61477c;

        public CombinerObserver(LatestCoordinator<T, R> latestCoordinator, int i2) {
            this.f61476b = latestCoordinator;
            this.f61477c = i2;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31413e(this, disposable);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
        
            if (r4 == r2.length) goto L15;
         */
        @Override // io.reactivex.Observer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onComplete() {
            /*
                r5 = this;
                io.reactivex.internal.operators.observable.ObservableCombineLatest$LatestCoordinator<T, R> r0 = r5.f61476b
                int r1 = r5.f61477c
                monitor-enter(r0)
                java.lang.Object[] r2 = r0.f61481e     // Catch: java.lang.Throwable -> L29
                if (r2 != 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
                goto L28
            Lb:
                r1 = r2[r1]     // Catch: java.lang.Throwable -> L29
                r3 = 1
                if (r1 != 0) goto L12
                r1 = 1
                goto L13
            L12:
                r1 = 0
            L13:
                if (r1 != 0) goto L1d
                int r4 = r0.f61488l     // Catch: java.lang.Throwable -> L29
                int r4 = r4 + r3
                r0.f61488l = r4     // Catch: java.lang.Throwable -> L29
                int r2 = r2.length     // Catch: java.lang.Throwable -> L29
                if (r4 != r2) goto L1f
            L1d:
                r0.f61485i = r3     // Catch: java.lang.Throwable -> L29
            L1f:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
                if (r1 == 0) goto L25
                r0.m31653a()
            L25:
                r0.m31655c()
            L28:
                return
            L29:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableCombineLatest.CombinerObserver.onComplete():void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
        
            if (r3 == r5.length) goto L18;
         */
        @Override // io.reactivex.Observer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onError(java.lang.Throwable r5) {
            /*
                r4 = this;
                io.reactivex.internal.operators.observable.ObservableCombineLatest$LatestCoordinator<T, R> r0 = r4.f61476b
                int r1 = r4.f61477c
                io.reactivex.internal.util.AtomicThrowable r2 = r0.f61486j
                boolean r2 = io.reactivex.internal.util.ExceptionHelper.m31817a(r2, r5)
                if (r2 == 0) goto L3a
                boolean r5 = r0.f61483g
                r2 = 1
                if (r5 == 0) goto L31
                monitor-enter(r0)
                java.lang.Object[] r5 = r0.f61481e     // Catch: java.lang.Throwable -> L2e
                if (r5 != 0) goto L18
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
                goto L3d
            L18:
                r1 = r5[r1]     // Catch: java.lang.Throwable -> L2e
                if (r1 != 0) goto L1e
                r1 = 1
                goto L1f
            L1e:
                r1 = 0
            L1f:
                if (r1 != 0) goto L29
                int r3 = r0.f61488l     // Catch: java.lang.Throwable -> L2e
                int r3 = r3 + r2
                r0.f61488l = r3     // Catch: java.lang.Throwable -> L2e
                int r5 = r5.length     // Catch: java.lang.Throwable -> L2e
                if (r3 != r5) goto L2b
            L29:
                r0.f61485i = r2     // Catch: java.lang.Throwable -> L2e
            L2b:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
                r2 = r1
                goto L31
            L2e:
                r5 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
                throw r5
            L31:
                if (r2 == 0) goto L36
                r0.m31653a()
            L36:
                r0.m31655c()
                goto L3d
            L3a:
                io.reactivex.plugins.RxJavaPlugins.m31848b(r5)
            L3d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableCombineLatest.CombinerObserver.onError(java.lang.Throwable):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onNext(T t) {
            boolean z;
            LatestCoordinator<T, R> latestCoordinator = this.f61476b;
            int i2 = this.f61477c;
            synchronized (latestCoordinator) {
                Object[] objArr = latestCoordinator.f61481e;
                if (objArr == null) {
                    return;
                }
                Object obj = objArr[i2];
                int i3 = latestCoordinator.f61487k;
                if (obj == null) {
                    i3++;
                    latestCoordinator.f61487k = i3;
                }
                objArr[i2] = t;
                if (i3 == objArr.length) {
                    latestCoordinator.f61482f.offer(objArr.clone());
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    latestCoordinator.m31655c();
                }
            }
        }
    }

    public static final class LatestCoordinator<T, R> extends AtomicInteger implements Disposable {

        /* renamed from: b */
        public final Observer<? super R> f61478b;

        /* renamed from: c */
        public final Function<? super Object[], ? extends R> f61479c;

        /* renamed from: d */
        public final CombinerObserver<T, R>[] f61480d;

        /* renamed from: e */
        public Object[] f61481e;

        /* renamed from: f */
        public final SpscLinkedArrayQueue<Object[]> f61482f;

        /* renamed from: g */
        public final boolean f61483g;

        /* renamed from: h */
        public volatile boolean f61484h;

        /* renamed from: i */
        public volatile boolean f61485i;

        /* renamed from: j */
        public final AtomicThrowable f61486j = new AtomicThrowable();

        /* renamed from: k */
        public int f61487k;

        /* renamed from: l */
        public int f61488l;

        public LatestCoordinator(Observer<? super R> observer, Function<? super Object[], ? extends R> function, int i2, int i3, boolean z) {
            this.f61478b = observer;
            this.f61479c = function;
            this.f61483g = z;
            this.f61481e = new Object[i2];
            CombinerObserver<T, R>[] combinerObserverArr = new CombinerObserver[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                combinerObserverArr[i4] = new CombinerObserver<>(this, i4);
            }
            this.f61480d = combinerObserverArr;
            this.f61482f = new SpscLinkedArrayQueue<>(i3);
        }

        /* renamed from: a */
        public void m31653a() {
            for (CombinerObserver<T, R> combinerObserver : this.f61480d) {
                DisposableHelper.m31409a(combinerObserver);
            }
        }

        /* renamed from: b */
        public void m31654b(SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            synchronized (this) {
                this.f61481e = null;
            }
            spscLinkedArrayQueue.clear();
        }

        /* renamed from: c */
        public void m31655c() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue<Object[]> spscLinkedArrayQueue = this.f61482f;
            Observer<? super R> observer = this.f61478b;
            boolean z = this.f61483g;
            int i2 = 1;
            while (!this.f61484h) {
                if (!z && this.f61486j.get() != null) {
                    m31653a();
                    m31654b(spscLinkedArrayQueue);
                    observer.onError(ExceptionHelper.m31818b(this.f61486j));
                    return;
                }
                boolean z2 = this.f61485i;
                Object[] poll = spscLinkedArrayQueue.poll();
                boolean z3 = poll == null;
                if (z2 && z3) {
                    m31654b(spscLinkedArrayQueue);
                    Throwable m31818b = ExceptionHelper.m31818b(this.f61486j);
                    if (m31818b == null) {
                        observer.onComplete();
                        return;
                    } else {
                        observer.onError(m31818b);
                        return;
                    }
                }
                if (z3) {
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else {
                    try {
                        R apply = this.f61479c.apply(poll);
                        Objects.requireNonNull(apply, "The combiner returned a null value");
                        observer.onNext(apply);
                    } catch (Throwable th) {
                        Exceptions.m31402a(th);
                        ExceptionHelper.m31817a(this.f61486j, th);
                        m31653a();
                        m31654b(spscLinkedArrayQueue);
                        observer.onError(ExceptionHelper.m31818b(this.f61486j));
                        return;
                    }
                }
            }
            m31654b(spscLinkedArrayQueue);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (this.f61484h) {
                return;
            }
            this.f61484h = true;
            m31653a();
            if (getAndIncrement() == 0) {
                m31654b(this.f61482f);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61484h;
        }
    }

    public ObservableCombineLatest(ObservableSource<? extends T>[] observableSourceArr, Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i2, boolean z) {
        this.f61471b = observableSourceArr;
        this.f61473d = function;
        this.f61474e = i2;
        this.f61475f = z;
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super R> observer) {
        int length;
        ObservableSource<? extends T>[] observableSourceArr = this.f61471b;
        if (observableSourceArr == null) {
            observableSourceArr = new Observable[8];
            length = 0;
            for (ObservableSource<? extends T> observableSource : this.f61472c) {
                if (length == observableSourceArr.length) {
                    ObservableSource<? extends T>[] observableSourceArr2 = new ObservableSource[(length >> 2) + length];
                    System.arraycopy(observableSourceArr, 0, observableSourceArr2, 0, length);
                    observableSourceArr = observableSourceArr2;
                }
                observableSourceArr[length] = observableSource;
                length++;
            }
        } else {
            length = observableSourceArr.length;
        }
        int i2 = length;
        if (i2 == 0) {
            observer.mo31373a(EmptyDisposable.INSTANCE);
            observer.onComplete();
            return;
        }
        LatestCoordinator latestCoordinator = new LatestCoordinator(observer, this.f61473d, i2, this.f61474e, this.f61475f);
        CombinerObserver<T, R>[] combinerObserverArr = latestCoordinator.f61480d;
        int length2 = combinerObserverArr.length;
        latestCoordinator.f61478b.mo31373a(latestCoordinator);
        for (int i3 = 0; i3 < length2 && !latestCoordinator.f61485i && !latestCoordinator.f61484h; i3++) {
            observableSourceArr[i3].mo31364c(combinerObserverArr[i3]);
        }
    }
}
