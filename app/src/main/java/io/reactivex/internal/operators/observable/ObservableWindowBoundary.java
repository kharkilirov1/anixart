package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subjects.UnicastSubject;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableWindowBoundary<T, B> extends AbstractObservableWithUpstream<T, Observable<T>> {

    public static final class WindowBoundaryInnerObserver<T, B> extends DisposableObserver<B> {

        /* renamed from: c */
        public final WindowBoundaryMainObserver<T, B> f62202c;

        /* renamed from: d */
        public boolean f62203d;

        public WindowBoundaryInnerObserver(WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver) {
            this.f62202c = windowBoundaryMainObserver;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f62203d) {
                return;
            }
            this.f62203d = true;
            WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver = this.f62202c;
            DisposableHelper.m31409a(windowBoundaryMainObserver.f62208e);
            windowBoundaryMainObserver.f62213j = true;
            windowBoundaryMainObserver.m31730b();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f62203d) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f62203d = true;
            WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver = this.f62202c;
            DisposableHelper.m31409a(windowBoundaryMainObserver.f62208e);
            if (!ExceptionHelper.m31817a(windowBoundaryMainObserver.f62211h, th)) {
                RxJavaPlugins.m31848b(th);
            } else {
                windowBoundaryMainObserver.f62213j = true;
                windowBoundaryMainObserver.m31730b();
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(B b) {
            if (this.f62203d) {
                return;
            }
            WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver = this.f62202c;
            windowBoundaryMainObserver.f62210g.offer(WindowBoundaryMainObserver.f62204l);
            windowBoundaryMainObserver.m31730b();
        }
    }

    public static final class WindowBoundaryMainObserver<T, B> extends AtomicInteger implements Observer<T>, Disposable, Runnable {

        /* renamed from: l */
        public static final Object f62204l = new Object();

        /* renamed from: b */
        public final Observer<? super Observable<T>> f62205b;

        /* renamed from: c */
        public final int f62206c;

        /* renamed from: d */
        public final WindowBoundaryInnerObserver<T, B> f62207d = new WindowBoundaryInnerObserver<>(this);

        /* renamed from: e */
        public final AtomicReference<Disposable> f62208e = new AtomicReference<>();

        /* renamed from: f */
        public final AtomicInteger f62209f = new AtomicInteger(1);

        /* renamed from: g */
        public final MpscLinkedQueue<Object> f62210g = new MpscLinkedQueue<>();

        /* renamed from: h */
        public final AtomicThrowable f62211h = new AtomicThrowable();

        /* renamed from: i */
        public final AtomicBoolean f62212i = new AtomicBoolean();

        /* renamed from: j */
        public volatile boolean f62213j;

        /* renamed from: k */
        public UnicastSubject<T> f62214k;

        public WindowBoundaryMainObserver(Observer<? super Observable<T>> observer, int i2) {
            this.f62205b = observer;
            this.f62206c = i2;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31413e(this.f62208e, disposable)) {
                this.f62210g.offer(f62204l);
                m31730b();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public void m31730b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super Observable<T>> observer = this.f62205b;
            MpscLinkedQueue<Object> mpscLinkedQueue = this.f62210g;
            AtomicThrowable atomicThrowable = this.f62211h;
            int i2 = 1;
            while (this.f62209f.get() != 0) {
                UnicastSubject<T> unicastSubject = this.f62214k;
                boolean z = this.f62213j;
                if (z && atomicThrowable.get() != null) {
                    mpscLinkedQueue.clear();
                    Throwable m31818b = ExceptionHelper.m31818b(atomicThrowable);
                    if (unicastSubject != 0) {
                        this.f62214k = null;
                        unicastSubject.onError(m31818b);
                    }
                    observer.onError(m31818b);
                    return;
                }
                Object poll = mpscLinkedQueue.poll();
                boolean z2 = poll == null;
                if (z && z2) {
                    Throwable m31818b2 = ExceptionHelper.m31818b(atomicThrowable);
                    if (m31818b2 == null) {
                        if (unicastSubject != 0) {
                            this.f62214k = null;
                            unicastSubject.onComplete();
                        }
                        observer.onComplete();
                        return;
                    }
                    if (unicastSubject != 0) {
                        this.f62214k = null;
                        unicastSubject.onError(m31818b2);
                    }
                    observer.onError(m31818b2);
                    return;
                }
                if (z2) {
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else if (poll != f62204l) {
                    unicastSubject.onNext(poll);
                } else {
                    if (unicastSubject != 0) {
                        this.f62214k = null;
                        unicastSubject.onComplete();
                    }
                    if (!this.f62212i.get()) {
                        UnicastSubject<T> m31872q = UnicastSubject.m31872q(this.f62206c, this);
                        this.f62214k = m31872q;
                        this.f62209f.getAndIncrement();
                        observer.onNext(m31872q);
                    }
                }
            }
            mpscLinkedQueue.clear();
            this.f62214k = null;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (this.f62212i.compareAndSet(false, true)) {
                DisposableHelper.m31409a(this.f62207d.f62817b);
                if (this.f62209f.decrementAndGet() == 0) {
                    DisposableHelper.m31409a(this.f62208e);
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            DisposableHelper.m31409a(this.f62207d.f62817b);
            this.f62213j = true;
            m31730b();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            DisposableHelper.m31409a(this.f62207d.f62817b);
            if (!ExceptionHelper.m31817a(this.f62211h, th)) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f62213j = true;
                m31730b();
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f62210g.offer(t);
            m31730b();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f62209f.decrementAndGet() == 0) {
                DisposableHelper.m31409a(this.f62208e);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62212i.get();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super Observable<T>> observer) {
        observer.mo31373a(new WindowBoundaryMainObserver(observer, 0));
        throw null;
    }
}
