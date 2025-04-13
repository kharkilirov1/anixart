package io.reactivex.internal.operators.observable;

import android.R;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableConcatMap<T, U> extends AbstractObservableWithUpstream<T, U> {

    public static final class ConcatMapDelayErrorObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super R> f61489b;

        /* renamed from: d */
        public final int f61491d;

        /* renamed from: f */
        public final DelayErrorInnerObserver<R> f61493f;

        /* renamed from: g */
        public final boolean f61494g;

        /* renamed from: h */
        public SimpleQueue<T> f61495h;

        /* renamed from: i */
        public Disposable f61496i;

        /* renamed from: j */
        public volatile boolean f61497j;

        /* renamed from: k */
        public volatile boolean f61498k;

        /* renamed from: l */
        public volatile boolean f61499l;

        /* renamed from: m */
        public int f61500m;

        /* renamed from: c */
        public final Function<? super T, ? extends ObservableSource<? extends R>> f61490c = null;

        /* renamed from: e */
        public final AtomicThrowable f61492e = new AtomicThrowable();

        public static final class DelayErrorInnerObserver<R> extends AtomicReference<Disposable> implements Observer<R> {

            /* renamed from: b */
            public final Observer<? super R> f61501b;

            /* renamed from: c */
            public final ConcatMapDelayErrorObserver<?, R> f61502c;

            public DelayErrorInnerObserver(Observer<? super R> observer, ConcatMapDelayErrorObserver<?, R> concatMapDelayErrorObserver) {
                this.f61501b = observer;
                this.f61502c = concatMapDelayErrorObserver;
            }

            @Override // io.reactivex.Observer
            /* renamed from: a */
            public void mo31373a(Disposable disposable) {
                DisposableHelper.m31411c(this, disposable);
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
                ConcatMapDelayErrorObserver<?, R> concatMapDelayErrorObserver = this.f61502c;
                concatMapDelayErrorObserver.f61497j = false;
                concatMapDelayErrorObserver.m31656b();
            }

            @Override // io.reactivex.Observer
            public void onError(Throwable th) {
                ConcatMapDelayErrorObserver<?, R> concatMapDelayErrorObserver = this.f61502c;
                if (!ExceptionHelper.m31817a(concatMapDelayErrorObserver.f61492e, th)) {
                    RxJavaPlugins.m31848b(th);
                    return;
                }
                if (!concatMapDelayErrorObserver.f61494g) {
                    concatMapDelayErrorObserver.f61496i.mo31379f();
                }
                concatMapDelayErrorObserver.f61497j = false;
                concatMapDelayErrorObserver.m31656b();
            }

            @Override // io.reactivex.Observer
            public void onNext(R r) {
                this.f61501b.onNext(r);
            }
        }

        public ConcatMapDelayErrorObserver(Observer<? super R> observer, Function<? super T, ? extends ObservableSource<? extends R>> function, int i2, boolean z) {
            this.f61489b = observer;
            this.f61491d = i2;
            this.f61494g = z;
            this.f61493f = new DelayErrorInnerObserver<>(observer, this);
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61496i, disposable)) {
                this.f61496i = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int mo31420F = queueDisposable.mo31420F(3);
                    if (mo31420F == 1) {
                        this.f61500m = mo31420F;
                        this.f61495h = queueDisposable;
                        this.f61498k = true;
                        this.f61489b.mo31373a(this);
                        m31656b();
                        return;
                    }
                    if (mo31420F == 2) {
                        this.f61500m = mo31420F;
                        this.f61495h = queueDisposable;
                        this.f61489b.mo31373a(this);
                        return;
                    }
                }
                this.f61495h = new SpscLinkedArrayQueue(this.f61491d);
                this.f61489b.mo31373a(this);
            }
        }

        /* renamed from: b */
        public void m31656b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super R> observer = this.f61489b;
            SimpleQueue<T> simpleQueue = this.f61495h;
            AtomicThrowable atomicThrowable = this.f61492e;
            while (true) {
                if (!this.f61497j) {
                    if (this.f61499l) {
                        simpleQueue.clear();
                        return;
                    }
                    if (!this.f61494g && atomicThrowable.get() != null) {
                        simpleQueue.clear();
                        this.f61499l = true;
                        observer.onError(ExceptionHelper.m31818b(atomicThrowable));
                        return;
                    }
                    boolean z = this.f61498k;
                    try {
                        T poll = simpleQueue.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            this.f61499l = true;
                            Throwable m31818b = ExceptionHelper.m31818b(atomicThrowable);
                            if (m31818b != null) {
                                observer.onError(m31818b);
                                return;
                            } else {
                                observer.onComplete();
                                return;
                            }
                        }
                        if (!z2) {
                            try {
                                ObservableSource<? extends R> apply = this.f61490c.apply(poll);
                                Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                                ObservableSource<? extends R> observableSource = apply;
                                if (observableSource instanceof Callable) {
                                    try {
                                        R.array arrayVar = (Object) ((Callable) observableSource).call();
                                        if (arrayVar != null && !this.f61499l) {
                                            observer.onNext(arrayVar);
                                        }
                                    } catch (Throwable th) {
                                        Exceptions.m31402a(th);
                                        ExceptionHelper.m31817a(atomicThrowable, th);
                                    }
                                } else {
                                    this.f61497j = true;
                                    observableSource.mo31364c(this.f61493f);
                                }
                            } catch (Throwable th2) {
                                Exceptions.m31402a(th2);
                                this.f61499l = true;
                                this.f61496i.mo31379f();
                                simpleQueue.clear();
                                ExceptionHelper.m31817a(atomicThrowable, th2);
                                observer.onError(ExceptionHelper.m31818b(atomicThrowable));
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        Exceptions.m31402a(th3);
                        this.f61499l = true;
                        this.f61496i.mo31379f();
                        ExceptionHelper.m31817a(atomicThrowable, th3);
                        observer.onError(ExceptionHelper.m31818b(atomicThrowable));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61499l = true;
            this.f61496i.mo31379f();
            DisposableHelper.m31409a(this.f61493f);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61498k = true;
            m31656b();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f61492e, th)) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f61498k = true;
                m31656b();
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f61500m == 0) {
                this.f61495h.offer(t);
            }
            m31656b();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61499l;
        }
    }

    public static final class SourceObserver<T, U> extends AtomicInteger implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super U> f61503b;

        /* renamed from: c */
        public final Function<? super T, ? extends ObservableSource<? extends U>> f61504c;

        /* renamed from: d */
        public final InnerObserver<U> f61505d;

        /* renamed from: e */
        public final int f61506e;

        /* renamed from: f */
        public SimpleQueue<T> f61507f;

        /* renamed from: g */
        public Disposable f61508g;

        /* renamed from: h */
        public volatile boolean f61509h;

        /* renamed from: i */
        public volatile boolean f61510i;

        /* renamed from: j */
        public volatile boolean f61511j;

        /* renamed from: k */
        public int f61512k;

        public static final class InnerObserver<U> extends AtomicReference<Disposable> implements Observer<U> {

            /* renamed from: b */
            public final Observer<? super U> f61513b;

            /* renamed from: c */
            public final SourceObserver<?, ?> f61514c;

            @Override // io.reactivex.Observer
            /* renamed from: a */
            public void mo31373a(Disposable disposable) {
                DisposableHelper.m31411c(this, disposable);
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
                SourceObserver<?, ?> sourceObserver = this.f61514c;
                sourceObserver.f61509h = false;
                sourceObserver.m31657b();
            }

            @Override // io.reactivex.Observer
            public void onError(Throwable th) {
                this.f61514c.mo31379f();
                this.f61513b.onError(th);
            }

            @Override // io.reactivex.Observer
            public void onNext(U u) {
                this.f61513b.onNext(u);
            }
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61508g, disposable)) {
                this.f61508g = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int mo31420F = queueDisposable.mo31420F(3);
                    if (mo31420F == 1) {
                        this.f61512k = mo31420F;
                        this.f61507f = queueDisposable;
                        this.f61511j = true;
                        this.f61503b.mo31373a(this);
                        m31657b();
                        return;
                    }
                    if (mo31420F == 2) {
                        this.f61512k = mo31420F;
                        this.f61507f = queueDisposable;
                        this.f61503b.mo31373a(this);
                        return;
                    }
                }
                this.f61507f = new SpscLinkedArrayQueue(this.f61506e);
                this.f61503b.mo31373a(this);
            }
        }

        /* renamed from: b */
        public void m31657b() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.f61510i) {
                if (!this.f61509h) {
                    boolean z = this.f61511j;
                    try {
                        T poll = this.f61507f.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            this.f61510i = true;
                            this.f61503b.onComplete();
                            return;
                        }
                        if (!z2) {
                            try {
                                ObservableSource<? extends U> apply = this.f61504c.apply(poll);
                                Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                                ObservableSource<? extends U> observableSource = apply;
                                this.f61509h = true;
                                observableSource.mo31364c(this.f61505d);
                            } catch (Throwable th) {
                                Exceptions.m31402a(th);
                                mo31379f();
                                this.f61507f.clear();
                                this.f61503b.onError(th);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        Exceptions.m31402a(th2);
                        mo31379f();
                        this.f61507f.clear();
                        this.f61503b.onError(th2);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f61507f.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61510i = true;
            DisposableHelper.m31409a(this.f61505d);
            this.f61508g.mo31379f();
            if (getAndIncrement() == 0) {
                this.f61507f.clear();
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f61511j) {
                return;
            }
            this.f61511j = true;
            m31657b();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f61511j) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f61511j = true;
            mo31379f();
            this.f61503b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f61511j) {
                return;
            }
            if (this.f61512k == 0) {
                this.f61507f.offer(t);
            }
            m31657b();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61510i;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super U> observer) {
        if (ObservableScalarXMap.m31717a(this.f61337b, observer, null)) {
            return;
        }
        this.f61337b.mo31364c(new ConcatMapDelayErrorObserver(observer, null, 0, false));
    }
}
