package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subjects.UnicastSubject;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableWindowBoundarySupplier<T, B> extends AbstractObservableWithUpstream<T, Observable<T>> {

    public static final class WindowBoundaryInnerObserver<T, B> extends DisposableObserver<B> {

        /* renamed from: c */
        public final WindowBoundaryMainObserver<T, B> f62230c;

        /* renamed from: d */
        public boolean f62231d;

        public WindowBoundaryInnerObserver(WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver) {
            this.f62230c = windowBoundaryMainObserver;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f62231d) {
                return;
            }
            this.f62231d = true;
            WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver = this.f62230c;
            windowBoundaryMainObserver.f62242j.mo31379f();
            windowBoundaryMainObserver.f62243k = true;
            windowBoundaryMainObserver.m31733c();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f62231d) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f62231d = true;
            WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver = this.f62230c;
            windowBoundaryMainObserver.f62242j.mo31379f();
            if (!ExceptionHelper.m31817a(windowBoundaryMainObserver.f62239g, th)) {
                RxJavaPlugins.m31848b(th);
            } else {
                windowBoundaryMainObserver.f62243k = true;
                windowBoundaryMainObserver.m31733c();
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(B b) {
            if (this.f62231d) {
                return;
            }
            this.f62231d = true;
            DisposableHelper.m31409a(this.f62817b);
            WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver = this.f62230c;
            windowBoundaryMainObserver.f62236d.compareAndSet(this, null);
            windowBoundaryMainObserver.f62238f.offer(WindowBoundaryMainObserver.f62233n);
            windowBoundaryMainObserver.m31733c();
        }
    }

    public static final class WindowBoundaryMainObserver<T, B> extends AtomicInteger implements Observer<T>, Disposable, Runnable {

        /* renamed from: m */
        public static final WindowBoundaryInnerObserver<Object, Object> f62232m = new WindowBoundaryInnerObserver<>(null);

        /* renamed from: n */
        public static final Object f62233n = new Object();

        /* renamed from: b */
        public final Observer<? super Observable<T>> f62234b;

        /* renamed from: c */
        public final int f62235c;

        /* renamed from: d */
        public final AtomicReference<WindowBoundaryInnerObserver<T, B>> f62236d = new AtomicReference<>();

        /* renamed from: e */
        public final AtomicInteger f62237e = new AtomicInteger(1);

        /* renamed from: f */
        public final MpscLinkedQueue<Object> f62238f = new MpscLinkedQueue<>();

        /* renamed from: g */
        public final AtomicThrowable f62239g = new AtomicThrowable();

        /* renamed from: h */
        public final AtomicBoolean f62240h = new AtomicBoolean();

        /* renamed from: i */
        public final Callable<? extends ObservableSource<B>> f62241i = null;

        /* renamed from: j */
        public Disposable f62242j;

        /* renamed from: k */
        public volatile boolean f62243k;

        /* renamed from: l */
        public UnicastSubject<T> f62244l;

        public WindowBoundaryMainObserver(Observer<? super Observable<T>> observer, int i2, Callable<? extends ObservableSource<B>> callable) {
            this.f62234b = observer;
            this.f62235c = i2;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62242j, disposable)) {
                this.f62242j = disposable;
                this.f62234b.mo31373a(this);
                this.f62238f.offer(f62233n);
                m31733c();
            }
        }

        /* renamed from: b */
        public void m31732b() {
            AtomicReference<WindowBoundaryInnerObserver<T, B>> atomicReference = this.f62236d;
            WindowBoundaryInnerObserver<Object, Object> windowBoundaryInnerObserver = f62232m;
            Disposable disposable = (Disposable) atomicReference.getAndSet(windowBoundaryInnerObserver);
            if (disposable == null || disposable == windowBoundaryInnerObserver) {
                return;
            }
            disposable.mo31379f();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: c */
        public void m31733c() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super Observable<T>> observer = this.f62234b;
            MpscLinkedQueue<Object> mpscLinkedQueue = this.f62238f;
            AtomicThrowable atomicThrowable = this.f62239g;
            int i2 = 1;
            while (this.f62237e.get() != 0) {
                UnicastSubject<T> unicastSubject = this.f62244l;
                boolean z = this.f62243k;
                if (z && atomicThrowable.get() != null) {
                    mpscLinkedQueue.clear();
                    Throwable m31818b = ExceptionHelper.m31818b(atomicThrowable);
                    if (unicastSubject != 0) {
                        this.f62244l = null;
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
                            this.f62244l = null;
                            unicastSubject.onComplete();
                        }
                        observer.onComplete();
                        return;
                    }
                    if (unicastSubject != 0) {
                        this.f62244l = null;
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
                } else if (poll != f62233n) {
                    unicastSubject.onNext(poll);
                } else {
                    if (unicastSubject != 0) {
                        this.f62244l = null;
                        unicastSubject.onComplete();
                    }
                    if (!this.f62240h.get()) {
                        UnicastSubject<T> m31872q = UnicastSubject.m31872q(this.f62235c, this);
                        this.f62244l = m31872q;
                        this.f62237e.getAndIncrement();
                        try {
                            ObservableSource<B> call = this.f62241i.call();
                            Objects.requireNonNull(call, "The other Callable returned a null ObservableSource");
                            ObservableSource<B> observableSource = call;
                            WindowBoundaryInnerObserver<T, B> windowBoundaryInnerObserver = new WindowBoundaryInnerObserver<>(this);
                            if (this.f62236d.compareAndSet(null, windowBoundaryInnerObserver)) {
                                observableSource.mo31364c(windowBoundaryInnerObserver);
                                observer.onNext(m31872q);
                            }
                        } catch (Throwable th) {
                            Exceptions.m31402a(th);
                            ExceptionHelper.m31817a(atomicThrowable, th);
                            this.f62243k = true;
                        }
                    }
                }
            }
            mpscLinkedQueue.clear();
            this.f62244l = null;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (this.f62240h.compareAndSet(false, true)) {
                m31732b();
                if (this.f62237e.decrementAndGet() == 0) {
                    this.f62242j.mo31379f();
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            m31732b();
            this.f62243k = true;
            m31733c();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            m31732b();
            if (!ExceptionHelper.m31817a(this.f62239g, th)) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f62243k = true;
                m31733c();
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f62238f.offer(t);
            m31733c();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f62237e.decrementAndGet() == 0) {
                this.f62242j.mo31379f();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62240h.get();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super Observable<T>> observer) {
        this.f61337b.mo31364c(new WindowBoundaryMainObserver(observer, 0, null));
    }
}
