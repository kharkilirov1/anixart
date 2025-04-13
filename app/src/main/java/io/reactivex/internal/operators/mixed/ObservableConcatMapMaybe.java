package io.reactivex.internal.operators.mixed;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableConcatMapMaybe<T, R> extends Observable<R> {

    public static final class ConcatMapMaybeMainObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super R> f61280b;

        /* renamed from: f */
        public final SimplePlainQueue<T> f61284f;

        /* renamed from: h */
        public Disposable f61286h;

        /* renamed from: i */
        public volatile boolean f61287i;

        /* renamed from: j */
        public volatile boolean f61288j;

        /* renamed from: k */
        public R f61289k;

        /* renamed from: l */
        public volatile int f61290l;

        /* renamed from: c */
        public final Function<? super T, ? extends MaybeSource<? extends R>> f61281c = null;

        /* renamed from: g */
        public final ErrorMode f61285g = null;

        /* renamed from: d */
        public final AtomicThrowable f61282d = new AtomicThrowable();

        /* renamed from: e */
        public final ConcatMapMaybeObserver<R> f61283e = new ConcatMapMaybeObserver<>(this);

        public static final class ConcatMapMaybeObserver<R> extends AtomicReference<Disposable> implements MaybeObserver<R> {

            /* renamed from: b */
            public final ConcatMapMaybeMainObserver<?, R> f61291b;

            public ConcatMapMaybeObserver(ConcatMapMaybeMainObserver<?, R> concatMapMaybeMainObserver) {
                this.f61291b = concatMapMaybeMainObserver;
            }

            @Override // io.reactivex.MaybeObserver
            /* renamed from: a */
            public void mo31355a(Disposable disposable) {
                DisposableHelper.m31411c(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                ConcatMapMaybeMainObserver<?, R> concatMapMaybeMainObserver = this.f61291b;
                concatMapMaybeMainObserver.f61290l = 0;
                concatMapMaybeMainObserver.m31638b();
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(Throwable th) {
                ConcatMapMaybeMainObserver<?, R> concatMapMaybeMainObserver = this.f61291b;
                if (!ExceptionHelper.m31817a(concatMapMaybeMainObserver.f61282d, th)) {
                    RxJavaPlugins.m31848b(th);
                    return;
                }
                if (concatMapMaybeMainObserver.f61285g != ErrorMode.END) {
                    concatMapMaybeMainObserver.f61286h.mo31379f();
                }
                concatMapMaybeMainObserver.f61290l = 0;
                concatMapMaybeMainObserver.m31638b();
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(R r) {
                ConcatMapMaybeMainObserver<?, R> concatMapMaybeMainObserver = this.f61291b;
                concatMapMaybeMainObserver.f61289k = r;
                concatMapMaybeMainObserver.f61290l = 2;
                concatMapMaybeMainObserver.m31638b();
            }
        }

        public ConcatMapMaybeMainObserver(Observer<? super R> observer, Function<? super T, ? extends MaybeSource<? extends R>> function, int i2, ErrorMode errorMode) {
            this.f61280b = observer;
            this.f61284f = new SpscLinkedArrayQueue(i2);
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61286h, disposable)) {
                this.f61286h = disposable;
                this.f61280b.mo31373a(this);
            }
        }

        /* renamed from: b */
        public void m31638b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super R> observer = this.f61280b;
            ErrorMode errorMode = this.f61285g;
            SimplePlainQueue<T> simplePlainQueue = this.f61284f;
            AtomicThrowable atomicThrowable = this.f61282d;
            int i2 = 1;
            while (true) {
                if (this.f61288j) {
                    simplePlainQueue.clear();
                    this.f61289k = null;
                } else {
                    int i3 = this.f61290l;
                    if (atomicThrowable.get() == null || (errorMode != ErrorMode.IMMEDIATE && (errorMode != ErrorMode.BOUNDARY || i3 != 0))) {
                        if (i3 == 0) {
                            boolean z = this.f61287i;
                            T poll = simplePlainQueue.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                Throwable m31818b = ExceptionHelper.m31818b(atomicThrowable);
                                if (m31818b == null) {
                                    observer.onComplete();
                                    return;
                                } else {
                                    observer.onError(m31818b);
                                    return;
                                }
                            }
                            if (!z2) {
                                try {
                                    MaybeSource<? extends R> apply = this.f61281c.apply(poll);
                                    Objects.requireNonNull(apply, "The mapper returned a null MaybeSource");
                                    MaybeSource<? extends R> maybeSource = apply;
                                    this.f61290l = 1;
                                    maybeSource.mo31353b(this.f61283e);
                                } catch (Throwable th) {
                                    Exceptions.m31402a(th);
                                    this.f61286h.mo31379f();
                                    simplePlainQueue.clear();
                                    ExceptionHelper.m31817a(atomicThrowable, th);
                                    observer.onError(ExceptionHelper.m31818b(atomicThrowable));
                                    return;
                                }
                            }
                        } else if (i3 == 2) {
                            R r = this.f61289k;
                            this.f61289k = null;
                            observer.onNext(r);
                            this.f61290l = 0;
                        }
                    }
                }
                i2 = addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            }
            simplePlainQueue.clear();
            this.f61289k = null;
            observer.onError(ExceptionHelper.m31818b(atomicThrowable));
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61288j = true;
            this.f61286h.mo31379f();
            DisposableHelper.m31409a(this.f61283e);
            if (getAndIncrement() == 0) {
                this.f61284f.clear();
                this.f61289k = null;
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61287i = true;
            m31638b();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f61282d, th)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            if (this.f61285g == ErrorMode.IMMEDIATE) {
                DisposableHelper.m31409a(this.f61283e);
            }
            this.f61287i = true;
            m31638b();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f61284f.offer(t);
            m31638b();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61288j;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super R> observer) {
        if (ScalarXMapZHelper.m31645b(null, null, observer)) {
            return;
        }
        new ConcatMapMaybeMainObserver(observer, null, 0, null);
        throw null;
    }
}
