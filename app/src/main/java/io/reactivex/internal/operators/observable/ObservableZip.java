package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableZip<T, R> extends Observable<R> {

    /* renamed from: b */
    public final ObservableSource<? extends T>[] f62297b;

    /* renamed from: c */
    public final Iterable<? extends ObservableSource<? extends T>> f62298c;

    /* renamed from: d */
    public final Function<? super Object[], ? extends R> f62299d;

    /* renamed from: e */
    public final int f62300e;

    /* renamed from: f */
    public final boolean f62301f;

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements Disposable {

        /* renamed from: b */
        public final Observer<? super R> f62302b;

        /* renamed from: c */
        public final Function<? super Object[], ? extends R> f62303c;

        /* renamed from: d */
        public final ZipObserver<T, R>[] f62304d;

        /* renamed from: e */
        public final T[] f62305e;

        /* renamed from: f */
        public final boolean f62306f;

        /* renamed from: g */
        public volatile boolean f62307g;

        public ZipCoordinator(Observer<? super R> observer, Function<? super Object[], ? extends R> function, int i2, boolean z) {
            this.f62302b = observer;
            this.f62303c = function;
            this.f62304d = new ZipObserver[i2];
            this.f62305e = (T[]) new Object[i2];
            this.f62306f = z;
        }

        /* renamed from: a */
        public void m31739a() {
            for (ZipObserver<T, R> zipObserver : this.f62304d) {
                zipObserver.f62309c.clear();
            }
            for (ZipObserver<T, R> zipObserver2 : this.f62304d) {
                DisposableHelper.m31409a(zipObserver2.f62312f);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0067 A[SYNTHETIC] */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m31740b() {
            /*
                r16 = this;
                r1 = r16
                int r0 = r16.getAndIncrement()
                if (r0 == 0) goto L9
                return
            L9:
                io.reactivex.internal.operators.observable.ObservableZip$ZipObserver<T, R>[] r0 = r1.f62304d
                io.reactivex.Observer<? super R> r2 = r1.f62302b
                T[] r3 = r1.f62305e
                boolean r4 = r1.f62306f
                r5 = 1
                r6 = 1
            L13:
                int r7 = r0.length
                r9 = 0
                r10 = 0
                r11 = 0
            L17:
                if (r9 >= r7) goto L88
                r12 = r0[r9]
                r13 = r3[r11]
                if (r13 != 0) goto L70
                boolean r13 = r12.f62310d
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r14 = r12.f62309c
                java.lang.Object r14 = r14.poll()
                if (r14 != 0) goto L2b
                r15 = 1
                goto L2c
            L2b:
                r15 = 0
            L2c:
                boolean r8 = r1.f62307g
                if (r8 == 0) goto L35
                r16.m31739a()
            L33:
                r8 = 1
                goto L65
            L35:
                if (r13 == 0) goto L64
                if (r4 == 0) goto L4c
                if (r15 == 0) goto L64
                java.lang.Throwable r8 = r12.f62311e
                r1.f62307g = r5
                r16.m31739a()
                if (r8 == 0) goto L48
                r2.onError(r8)
                goto L33
            L48:
                r2.onComplete()
                goto L33
            L4c:
                java.lang.Throwable r8 = r12.f62311e
                if (r8 == 0) goto L59
                r1.f62307g = r5
                r16.m31739a()
                r2.onError(r8)
                goto L33
            L59:
                if (r15 == 0) goto L64
                r1.f62307g = r5
                r16.m31739a()
                r2.onComplete()
                goto L33
            L64:
                r8 = 0
            L65:
                if (r8 == 0) goto L68
                return
            L68:
                if (r15 != 0) goto L6d
                r3[r11] = r14
                goto L83
            L6d:
                int r10 = r10 + 1
                goto L83
            L70:
                boolean r8 = r12.f62310d
                if (r8 == 0) goto L83
                if (r4 != 0) goto L83
                java.lang.Throwable r8 = r12.f62311e
                if (r8 == 0) goto L83
                r1.f62307g = r5
                r16.m31739a()
                r2.onError(r8)
                return
            L83:
                int r11 = r11 + 1
                int r9 = r9 + 1
                goto L17
            L88:
                if (r10 == 0) goto L92
                int r6 = -r6
                int r6 = r1.addAndGet(r6)
                if (r6 != 0) goto L13
                return
            L92:
                io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r7 = r1.f62303c     // Catch: java.lang.Throwable -> Laa
                java.lang.Object r8 = r3.clone()     // Catch: java.lang.Throwable -> Laa
                java.lang.Object r7 = r7.apply(r8)     // Catch: java.lang.Throwable -> Laa
                java.lang.String r8 = "The zipper returned a null value"
                java.util.Objects.requireNonNull(r7, r8)     // Catch: java.lang.Throwable -> Laa
                r2.onNext(r7)
                r7 = 0
                java.util.Arrays.fill(r3, r7)
                goto L13
            Laa:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.m31402a(r0)
                r16.m31739a()
                r2.onError(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableZip.ZipCoordinator.m31740b():void");
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (this.f62307g) {
                return;
            }
            this.f62307g = true;
            for (ZipObserver<T, R> zipObserver : this.f62304d) {
                DisposableHelper.m31409a(zipObserver.f62312f);
            }
            if (getAndIncrement() == 0) {
                for (ZipObserver<T, R> zipObserver2 : this.f62304d) {
                    zipObserver2.f62309c.clear();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62307g;
        }
    }

    public static final class ZipObserver<T, R> implements Observer<T> {

        /* renamed from: b */
        public final ZipCoordinator<T, R> f62308b;

        /* renamed from: c */
        public final SpscLinkedArrayQueue<T> f62309c;

        /* renamed from: d */
        public volatile boolean f62310d;

        /* renamed from: e */
        public Throwable f62311e;

        /* renamed from: f */
        public final AtomicReference<Disposable> f62312f = new AtomicReference<>();

        public ZipObserver(ZipCoordinator<T, R> zipCoordinator, int i2) {
            this.f62308b = zipCoordinator;
            this.f62309c = new SpscLinkedArrayQueue<>(i2);
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31413e(this.f62312f, disposable);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f62310d = true;
            this.f62308b.m31740b();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f62311e = th;
            this.f62310d = true;
            this.f62308b.m31740b();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f62309c.offer(t);
            this.f62308b.m31740b();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super R> observer) {
        int length;
        ObservableSource<? extends T>[] observableSourceArr = this.f62297b;
        if (observableSourceArr == null) {
            observableSourceArr = new Observable[8];
            length = 0;
            for (ObservableSource<? extends T> observableSource : this.f62298c) {
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
        if (length == 0) {
            observer.mo31373a(EmptyDisposable.INSTANCE);
            observer.onComplete();
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(observer, this.f62299d, length, this.f62301f);
        int i2 = this.f62300e;
        ZipObserver<T, R>[] zipObserverArr = zipCoordinator.f62304d;
        int length2 = zipObserverArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            zipObserverArr[i3] = new ZipObserver<>(zipCoordinator, i2);
        }
        zipCoordinator.lazySet(0);
        zipCoordinator.f62302b.mo31373a(zipCoordinator);
        for (int i4 = 0; i4 < length2 && !zipCoordinator.f62307g; i4++) {
            observableSourceArr[i4].mo31364c(zipObserverArr[i4]);
        }
    }
}
