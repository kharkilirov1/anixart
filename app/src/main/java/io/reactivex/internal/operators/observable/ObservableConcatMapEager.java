package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.observers.InnerQueuedObserver;
import io.reactivex.internal.observers.InnerQueuedObserverSupport;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class ObservableConcatMapEager<T, R> extends AbstractObservableWithUpstream<T, R> {

    public static final class ConcatMapEagerMainObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable, InnerQueuedObserverSupport<R> {

        /* renamed from: b */
        public final Observer<? super R> f61515b;

        /* renamed from: d */
        public final int f61517d;

        /* renamed from: e */
        public final int f61518e;

        /* renamed from: i */
        public SimpleQueue<T> f61522i;

        /* renamed from: j */
        public Disposable f61523j;

        /* renamed from: k */
        public volatile boolean f61524k;

        /* renamed from: l */
        public int f61525l;

        /* renamed from: m */
        public volatile boolean f61526m;

        /* renamed from: n */
        public InnerQueuedObserver<R> f61527n;

        /* renamed from: o */
        public int f61528o;

        /* renamed from: c */
        public final Function<? super T, ? extends ObservableSource<? extends R>> f61516c = null;

        /* renamed from: f */
        public final ErrorMode f61519f = null;

        /* renamed from: g */
        public final AtomicThrowable f61520g = new AtomicThrowable();

        /* renamed from: h */
        public final ArrayDeque<InnerQueuedObserver<R>> f61521h = new ArrayDeque<>();

        public ConcatMapEagerMainObserver(Observer<? super R> observer, Function<? super T, ? extends ObservableSource<? extends R>> function, int i2, int i3, ErrorMode errorMode) {
            this.f61515b = observer;
            this.f61517d = i2;
            this.f61518e = i3;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61523j, disposable)) {
                this.f61523j = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int mo31420F = queueDisposable.mo31420F(3);
                    if (mo31420F == 1) {
                        this.f61525l = mo31420F;
                        this.f61522i = queueDisposable;
                        this.f61524k = true;
                        this.f61515b.mo31373a(this);
                        mo31433c();
                        return;
                    }
                    if (mo31420F == 2) {
                        this.f61525l = mo31420F;
                        this.f61522i = queueDisposable;
                        this.f61515b.mo31373a(this);
                        return;
                    }
                }
                this.f61522i = new SpscLinkedArrayQueue(this.f61518e);
                this.f61515b.mo31373a(this);
            }
        }

        /* renamed from: b */
        public void m31658b() {
            InnerQueuedObserver<R> innerQueuedObserver = this.f61527n;
            if (innerQueuedObserver != null) {
                DisposableHelper.m31409a(innerQueuedObserver);
            }
            while (true) {
                InnerQueuedObserver<R> poll = this.f61521h.poll();
                if (poll == null) {
                    return;
                } else {
                    DisposableHelper.m31409a(poll);
                }
            }
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        /* renamed from: c */
        public void mo31433c() {
            R poll;
            boolean z;
            ErrorMode errorMode = ErrorMode.IMMEDIATE;
            if (getAndIncrement() != 0) {
                return;
            }
            SimpleQueue<T> simpleQueue = this.f61522i;
            ArrayDeque<InnerQueuedObserver<R>> arrayDeque = this.f61521h;
            Observer<? super R> observer = this.f61515b;
            ErrorMode errorMode2 = this.f61519f;
            int i2 = 1;
            while (true) {
                int i3 = this.f61528o;
                while (i3 != this.f61517d) {
                    if (this.f61526m) {
                        simpleQueue.clear();
                        m31658b();
                        return;
                    }
                    if (errorMode2 == errorMode && this.f61520g.get() != null) {
                        simpleQueue.clear();
                        m31658b();
                        observer.onError(ExceptionHelper.m31818b(this.f61520g));
                        return;
                    }
                    try {
                        T poll2 = simpleQueue.poll();
                        if (poll2 == null) {
                            break;
                        }
                        ObservableSource<? extends R> apply = this.f61516c.apply(poll2);
                        Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                        ObservableSource<? extends R> observableSource = apply;
                        InnerQueuedObserver<R> innerQueuedObserver = new InnerQueuedObserver<>(this, this.f61518e);
                        arrayDeque.offer(innerQueuedObserver);
                        observableSource.mo31364c(innerQueuedObserver);
                        i3++;
                    } catch (Throwable th) {
                        Exceptions.m31402a(th);
                        this.f61523j.mo31379f();
                        simpleQueue.clear();
                        m31658b();
                        ExceptionHelper.m31817a(this.f61520g, th);
                        observer.onError(ExceptionHelper.m31818b(this.f61520g));
                        return;
                    }
                }
                this.f61528o = i3;
                if (this.f61526m) {
                    simpleQueue.clear();
                    m31658b();
                    return;
                }
                if (errorMode2 == errorMode && this.f61520g.get() != null) {
                    simpleQueue.clear();
                    m31658b();
                    observer.onError(ExceptionHelper.m31818b(this.f61520g));
                    return;
                }
                InnerQueuedObserver<R> innerQueuedObserver2 = this.f61527n;
                if (innerQueuedObserver2 == null) {
                    if (errorMode2 == ErrorMode.BOUNDARY && this.f61520g.get() != null) {
                        simpleQueue.clear();
                        m31658b();
                        observer.onError(ExceptionHelper.m31818b(this.f61520g));
                        return;
                    }
                    boolean z2 = this.f61524k;
                    InnerQueuedObserver<R> poll3 = arrayDeque.poll();
                    boolean z3 = poll3 == null;
                    if (z2 && z3) {
                        if (this.f61520g.get() == null) {
                            observer.onComplete();
                            return;
                        }
                        simpleQueue.clear();
                        m31658b();
                        observer.onError(ExceptionHelper.m31818b(this.f61520g));
                        return;
                    }
                    if (!z3) {
                        this.f61527n = poll3;
                    }
                    innerQueuedObserver2 = poll3;
                }
                if (innerQueuedObserver2 != null) {
                    SimpleQueue<R> simpleQueue2 = innerQueuedObserver2.f59660d;
                    while (!this.f61526m) {
                        boolean z4 = innerQueuedObserver2.f59661e;
                        if (errorMode2 == errorMode && this.f61520g.get() != null) {
                            simpleQueue.clear();
                            m31658b();
                            observer.onError(ExceptionHelper.m31818b(this.f61520g));
                            return;
                        }
                        try {
                            poll = simpleQueue2.poll();
                            z = poll == null;
                        } catch (Throwable th2) {
                            Exceptions.m31402a(th2);
                            ExceptionHelper.m31817a(this.f61520g, th2);
                            this.f61527n = null;
                            this.f61528o--;
                        }
                        if (z4 && z) {
                            this.f61527n = null;
                            this.f61528o--;
                        } else if (!z) {
                            observer.onNext(poll);
                        }
                    }
                    simpleQueue.clear();
                    m31658b();
                    return;
                }
                i2 = addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        /* renamed from: d */
        public void mo31434d(InnerQueuedObserver<R> innerQueuedObserver, Throwable th) {
            if (!ExceptionHelper.m31817a(this.f61520g, th)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            if (this.f61519f == ErrorMode.IMMEDIATE) {
                this.f61523j.mo31379f();
            }
            innerQueuedObserver.f59661e = true;
            mo31433c();
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        /* renamed from: e */
        public void mo31435e(InnerQueuedObserver<R> innerQueuedObserver) {
            innerQueuedObserver.f59661e = true;
            mo31433c();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (this.f61526m) {
                return;
            }
            this.f61526m = true;
            this.f61523j.mo31379f();
            if (getAndIncrement() == 0) {
                do {
                    this.f61522i.clear();
                    m31658b();
                } while (decrementAndGet() != 0);
            }
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        /* renamed from: g */
        public void mo31436g(InnerQueuedObserver<R> innerQueuedObserver, R r) {
            innerQueuedObserver.f59660d.offer(r);
            mo31433c();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61524k = true;
            mo31433c();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f61520g, th)) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f61524k = true;
                mo31433c();
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f61525l == 0) {
                this.f61522i.offer(t);
            }
            mo31433c();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61526m;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super R> observer) {
        this.f61337b.mo31364c(new ConcatMapEagerMainObserver(observer, null, 0, 0, null));
    }
}
