package io.reactivex.internal.operators.observable;

import io.reactivex.Flowable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableBufferBoundary<T, U extends Collection<? super T>, Open, Close> extends AbstractObservableWithUpstream<T, U> {

    public static final class BufferBoundaryObserver<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super C> f61393b;

        /* renamed from: i */
        public volatile boolean f61400i;

        /* renamed from: k */
        public volatile boolean f61402k;

        /* renamed from: l */
        public long f61403l;

        /* renamed from: c */
        public final Callable<C> f61394c = null;

        /* renamed from: d */
        public final ObservableSource<? extends Open> f61395d = null;

        /* renamed from: e */
        public final Function<? super Open, ? extends ObservableSource<? extends Close>> f61396e = null;

        /* renamed from: j */
        public final SpscLinkedArrayQueue<C> f61401j = new SpscLinkedArrayQueue<>(Flowable.f59569b);

        /* renamed from: f */
        public final CompositeDisposable f61397f = new CompositeDisposable();

        /* renamed from: g */
        public final AtomicReference<Disposable> f61398g = new AtomicReference<>();

        /* renamed from: m */
        public Map<Long, C> f61404m = new LinkedHashMap();

        /* renamed from: h */
        public final AtomicThrowable f61399h = new AtomicThrowable();

        public static final class BufferOpenObserver<Open> extends AtomicReference<Disposable> implements Observer<Open>, Disposable {

            /* renamed from: b */
            public final BufferBoundaryObserver<?, ?, Open, ?> f61405b;

            public BufferOpenObserver(BufferBoundaryObserver<?, ?, Open, ?> bufferBoundaryObserver) {
                this.f61405b = bufferBoundaryObserver;
            }

            @Override // io.reactivex.Observer
            /* renamed from: a */
            public void mo31373a(Disposable disposable) {
                DisposableHelper.m31413e(this, disposable);
            }

            @Override // io.reactivex.disposables.Disposable
            /* renamed from: f */
            public void mo31379f() {
                DisposableHelper.m31409a(this);
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
                lazySet(DisposableHelper.DISPOSED);
                BufferBoundaryObserver<?, ?, Open, ?> bufferBoundaryObserver = this.f61405b;
                bufferBoundaryObserver.f61397f.mo31394c(this);
                if (bufferBoundaryObserver.f61397f.m31396e() == 0) {
                    DisposableHelper.m31409a(bufferBoundaryObserver.f61398g);
                    bufferBoundaryObserver.f61400i = true;
                    bufferBoundaryObserver.m31651c();
                }
            }

            @Override // io.reactivex.Observer
            public void onError(Throwable th) {
                lazySet(DisposableHelper.DISPOSED);
                BufferBoundaryObserver<?, ?, Open, ?> bufferBoundaryObserver = this.f61405b;
                DisposableHelper.m31409a(bufferBoundaryObserver.f61398g);
                bufferBoundaryObserver.f61397f.mo31394c(this);
                bufferBoundaryObserver.onError(th);
            }

            @Override // io.reactivex.Observer
            public void onNext(Open open) {
                BufferBoundaryObserver<?, ?, Open, ?> bufferBoundaryObserver = this.f61405b;
                Objects.requireNonNull(bufferBoundaryObserver);
                try {
                    Object call = bufferBoundaryObserver.f61394c.call();
                    Objects.requireNonNull(call, "The bufferSupplier returned a null Collection");
                    Collection collection = (Collection) call;
                    ObservableSource<? extends Object> apply = bufferBoundaryObserver.f61396e.apply(open);
                    Objects.requireNonNull(apply, "The bufferClose returned a null ObservableSource");
                    ObservableSource<? extends Object> observableSource = apply;
                    long j2 = bufferBoundaryObserver.f61403l;
                    bufferBoundaryObserver.f61403l = 1 + j2;
                    synchronized (bufferBoundaryObserver) {
                        Map<Long, ?> map = bufferBoundaryObserver.f61404m;
                        if (map != null) {
                            map.put(Long.valueOf(j2), collection);
                            BufferCloseObserver bufferCloseObserver = new BufferCloseObserver(bufferBoundaryObserver, j2);
                            bufferBoundaryObserver.f61397f.mo31393b(bufferCloseObserver);
                            observableSource.mo31364c(bufferCloseObserver);
                        }
                    }
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    DisposableHelper.m31409a(bufferBoundaryObserver.f61398g);
                    bufferBoundaryObserver.onError(th);
                }
            }

            @Override // io.reactivex.disposables.Disposable
            /* renamed from: s */
            public boolean mo31380s() {
                return get() == DisposableHelper.DISPOSED;
            }
        }

        public BufferBoundaryObserver(Observer<? super C> observer, ObservableSource<? extends Open> observableSource, Function<? super Open, ? extends ObservableSource<? extends Close>> function, Callable<C> callable) {
            this.f61393b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31413e(this.f61398g, disposable)) {
                BufferOpenObserver bufferOpenObserver = new BufferOpenObserver(this);
                this.f61397f.mo31393b(bufferOpenObserver);
                this.f61395d.mo31364c(bufferOpenObserver);
            }
        }

        /* renamed from: b */
        public void m31650b(BufferCloseObserver<T, C> bufferCloseObserver, long j2) {
            boolean z;
            this.f61397f.mo31394c(bufferCloseObserver);
            if (this.f61397f.m31396e() == 0) {
                DisposableHelper.m31409a(this.f61398g);
                z = true;
            } else {
                z = false;
            }
            synchronized (this) {
                Map<Long, C> map = this.f61404m;
                if (map == null) {
                    return;
                }
                this.f61401j.offer(map.remove(Long.valueOf(j2)));
                if (z) {
                    this.f61400i = true;
                }
                m31651c();
            }
        }

        /* renamed from: c */
        public void m31651c() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super C> observer = this.f61393b;
            SpscLinkedArrayQueue<C> spscLinkedArrayQueue = this.f61401j;
            int i2 = 1;
            while (!this.f61402k) {
                boolean z = this.f61400i;
                if (z && this.f61399h.get() != null) {
                    spscLinkedArrayQueue.clear();
                    observer.onError(ExceptionHelper.m31818b(this.f61399h));
                    return;
                }
                C poll = spscLinkedArrayQueue.poll();
                boolean z2 = poll == null;
                if (z && z2) {
                    observer.onComplete();
                    return;
                } else if (z2) {
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else {
                    observer.onNext(poll);
                }
            }
            spscLinkedArrayQueue.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (DisposableHelper.m31409a(this.f61398g)) {
                this.f61402k = true;
                this.f61397f.mo31379f();
                synchronized (this) {
                    this.f61404m = null;
                }
                if (getAndIncrement() != 0) {
                    this.f61401j.clear();
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61397f.mo31379f();
            synchronized (this) {
                Map<Long, C> map = this.f61404m;
                if (map == null) {
                    return;
                }
                Iterator<C> it = map.values().iterator();
                while (it.hasNext()) {
                    this.f61401j.offer(it.next());
                }
                this.f61404m = null;
                this.f61400i = true;
                m31651c();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f61399h, th)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f61397f.mo31379f();
            synchronized (this) {
                this.f61404m = null;
            }
            this.f61400i = true;
            m31651c();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            synchronized (this) {
                Map<Long, C> map = this.f61404m;
                if (map == null) {
                    return;
                }
                Iterator<C> it = map.values().iterator();
                while (it.hasNext()) {
                    it.next().add(t);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(this.f61398g.get());
        }
    }

    public static final class BufferCloseObserver<T, C extends Collection<? super T>> extends AtomicReference<Disposable> implements Observer<Object>, Disposable {

        /* renamed from: b */
        public final BufferBoundaryObserver<T, C, ?, ?> f61406b;

        /* renamed from: c */
        public final long f61407c;

        public BufferCloseObserver(BufferBoundaryObserver<T, C, ?, ?> bufferBoundaryObserver, long j2) {
            this.f61406b = bufferBoundaryObserver;
            this.f61407c = j2;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31413e(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable != disposableHelper) {
                lazySet(disposableHelper);
                this.f61406b.m31650b(this, this.f61407c);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            lazySet(disposableHelper);
            BufferBoundaryObserver<T, C, ?, ?> bufferBoundaryObserver = this.f61406b;
            DisposableHelper.m31409a(bufferBoundaryObserver.f61398g);
            bufferBoundaryObserver.f61397f.mo31394c(this);
            bufferBoundaryObserver.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable != disposableHelper) {
                lazySet(disposableHelper);
                disposable.mo31379f();
                this.f61406b.m31650b(this, this.f61407c);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return get() == DisposableHelper.DISPOSED;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super U> observer) {
        BufferBoundaryObserver bufferBoundaryObserver = new BufferBoundaryObserver(observer, null, null, null);
        observer.mo31373a(bufferBoundaryObserver);
        this.f61337b.mo31364c(bufferBoundaryObserver);
    }
}
