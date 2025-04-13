package io.reactivex.internal.operators.mixed;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
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
public final class ObservableConcatMapSingle<T, R> extends Observable<R> {

    public static final class ConcatMapSingleMainObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super R> f61292b;

        /* renamed from: f */
        public final SimplePlainQueue<T> f61296f;

        /* renamed from: h */
        public Disposable f61298h;

        /* renamed from: i */
        public volatile boolean f61299i;

        /* renamed from: j */
        public volatile boolean f61300j;

        /* renamed from: k */
        public R f61301k;

        /* renamed from: l */
        public volatile int f61302l;

        /* renamed from: c */
        public final Function<? super T, ? extends SingleSource<? extends R>> f61293c = null;

        /* renamed from: g */
        public final ErrorMode f61297g = null;

        /* renamed from: d */
        public final AtomicThrowable f61294d = new AtomicThrowable();

        /* renamed from: e */
        public final ConcatMapSingleObserver<R> f61295e = new ConcatMapSingleObserver<>(this);

        public static final class ConcatMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {

            /* renamed from: b */
            public final ConcatMapSingleMainObserver<?, R> f61303b;

            public ConcatMapSingleObserver(ConcatMapSingleMainObserver<?, R> concatMapSingleMainObserver) {
                this.f61303b = concatMapSingleMainObserver;
            }

            @Override // io.reactivex.SingleObserver
            /* renamed from: a */
            public void mo31388a(Disposable disposable) {
                DisposableHelper.m31411c(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th) {
                ConcatMapSingleMainObserver<?, R> concatMapSingleMainObserver = this.f61303b;
                if (!ExceptionHelper.m31817a(concatMapSingleMainObserver.f61294d, th)) {
                    RxJavaPlugins.m31848b(th);
                    return;
                }
                if (concatMapSingleMainObserver.f61297g != ErrorMode.END) {
                    concatMapSingleMainObserver.f61298h.mo31379f();
                }
                concatMapSingleMainObserver.f61302l = 0;
                concatMapSingleMainObserver.m31639b();
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(R r) {
                ConcatMapSingleMainObserver<?, R> concatMapSingleMainObserver = this.f61303b;
                concatMapSingleMainObserver.f61301k = r;
                concatMapSingleMainObserver.f61302l = 2;
                concatMapSingleMainObserver.m31639b();
            }
        }

        public ConcatMapSingleMainObserver(Observer<? super R> observer, Function<? super T, ? extends SingleSource<? extends R>> function, int i2, ErrorMode errorMode) {
            this.f61292b = observer;
            this.f61296f = new SpscLinkedArrayQueue(i2);
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61298h, disposable)) {
                this.f61298h = disposable;
                this.f61292b.mo31373a(this);
            }
        }

        /* renamed from: b */
        public void m31639b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super R> observer = this.f61292b;
            ErrorMode errorMode = this.f61297g;
            SimplePlainQueue<T> simplePlainQueue = this.f61296f;
            AtomicThrowable atomicThrowable = this.f61294d;
            int i2 = 1;
            while (true) {
                if (this.f61300j) {
                    simplePlainQueue.clear();
                    this.f61301k = null;
                } else {
                    int i3 = this.f61302l;
                    if (atomicThrowable.get() == null || (errorMode != ErrorMode.IMMEDIATE && (errorMode != ErrorMode.BOUNDARY || i3 != 0))) {
                        if (i3 == 0) {
                            boolean z = this.f61299i;
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
                                    SingleSource<? extends R> apply = this.f61293c.apply(poll);
                                    Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                                    SingleSource<? extends R> singleSource = apply;
                                    this.f61302l = 1;
                                    singleSource.mo31385b(this.f61295e);
                                } catch (Throwable th) {
                                    Exceptions.m31402a(th);
                                    this.f61298h.mo31379f();
                                    simplePlainQueue.clear();
                                    ExceptionHelper.m31817a(atomicThrowable, th);
                                    observer.onError(ExceptionHelper.m31818b(atomicThrowable));
                                    return;
                                }
                            }
                        } else if (i3 == 2) {
                            R r = this.f61301k;
                            this.f61301k = null;
                            observer.onNext(r);
                            this.f61302l = 0;
                        }
                    }
                }
                i2 = addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            }
            simplePlainQueue.clear();
            this.f61301k = null;
            observer.onError(ExceptionHelper.m31818b(atomicThrowable));
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61300j = true;
            this.f61298h.mo31379f();
            DisposableHelper.m31409a(this.f61295e);
            if (getAndIncrement() == 0) {
                this.f61296f.clear();
                this.f61301k = null;
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61299i = true;
            m31639b();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f61294d, th)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            if (this.f61297g == ErrorMode.IMMEDIATE) {
                DisposableHelper.m31409a(this.f61295e);
            }
            this.f61299i = true;
            m31639b();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f61296f.offer(t);
            m31639b();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61300j;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super R> observer) {
        if (ScalarXMapZHelper.m31646c(null, null, observer)) {
            return;
        }
        new ConcatMapSingleMainObserver(observer, null, 0, null);
        throw null;
    }
}
