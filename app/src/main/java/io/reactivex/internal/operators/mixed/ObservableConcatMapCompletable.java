package io.reactivex.internal.operators.mixed;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableConcatMapCompletable<T> extends Completable {

    public static final class ConcatMapCompletableObserver<T> extends AtomicInteger implements Observer<T>, Disposable {

        /* renamed from: b */
        public final CompletableObserver f61268b;

        /* renamed from: c */
        public final Function<? super T, ? extends CompletableSource> f61269c = null;

        /* renamed from: d */
        public final ErrorMode f61270d = null;

        /* renamed from: e */
        public final AtomicThrowable f61271e = new AtomicThrowable();

        /* renamed from: f */
        public final ConcatMapInnerObserver f61272f = new ConcatMapInnerObserver(this);

        /* renamed from: g */
        public final int f61273g;

        /* renamed from: h */
        public SimpleQueue<T> f61274h;

        /* renamed from: i */
        public Disposable f61275i;

        /* renamed from: j */
        public volatile boolean f61276j;

        /* renamed from: k */
        public volatile boolean f61277k;

        /* renamed from: l */
        public volatile boolean f61278l;

        public static final class ConcatMapInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {

            /* renamed from: b */
            public final ConcatMapCompletableObserver<?> f61279b;

            public ConcatMapInnerObserver(ConcatMapCompletableObserver<?> concatMapCompletableObserver) {
                this.f61279b = concatMapCompletableObserver;
            }

            @Override // io.reactivex.CompletableObserver
            /* renamed from: a */
            public void mo31347a(Disposable disposable) {
                DisposableHelper.m31411c(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                ConcatMapCompletableObserver<?> concatMapCompletableObserver = this.f61279b;
                concatMapCompletableObserver.f61276j = false;
                concatMapCompletableObserver.m31637b();
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th) {
                ConcatMapCompletableObserver<?> concatMapCompletableObserver = this.f61279b;
                if (!ExceptionHelper.m31817a(concatMapCompletableObserver.f61271e, th)) {
                    RxJavaPlugins.m31848b(th);
                    return;
                }
                if (concatMapCompletableObserver.f61270d != ErrorMode.IMMEDIATE) {
                    concatMapCompletableObserver.f61276j = false;
                    concatMapCompletableObserver.m31637b();
                    return;
                }
                concatMapCompletableObserver.f61278l = true;
                concatMapCompletableObserver.f61275i.mo31379f();
                Throwable m31818b = ExceptionHelper.m31818b(concatMapCompletableObserver.f61271e);
                if (m31818b != ExceptionHelper.f62793a) {
                    concatMapCompletableObserver.f61268b.onError(m31818b);
                }
                if (concatMapCompletableObserver.getAndIncrement() == 0) {
                    concatMapCompletableObserver.f61274h.clear();
                }
            }
        }

        public ConcatMapCompletableObserver(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function, ErrorMode errorMode, int i2) {
            this.f61268b = completableObserver;
            this.f61273g = i2;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61275i, disposable)) {
                this.f61275i = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int mo31420F = queueDisposable.mo31420F(3);
                    if (mo31420F == 1) {
                        this.f61274h = queueDisposable;
                        this.f61277k = true;
                        this.f61268b.mo31347a(this);
                        m31637b();
                        return;
                    }
                    if (mo31420F == 2) {
                        this.f61274h = queueDisposable;
                        this.f61268b.mo31347a(this);
                        return;
                    }
                }
                this.f61274h = new SpscLinkedArrayQueue(this.f61273g);
                this.f61268b.mo31347a(this);
            }
        }

        /* renamed from: b */
        public void m31637b() {
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicThrowable atomicThrowable = this.f61271e;
            ErrorMode errorMode = this.f61270d;
            while (!this.f61278l) {
                if (!this.f61276j) {
                    if (errorMode == ErrorMode.BOUNDARY && atomicThrowable.get() != null) {
                        this.f61278l = true;
                        this.f61274h.clear();
                        this.f61268b.onError(ExceptionHelper.m31818b(atomicThrowable));
                        return;
                    }
                    boolean z2 = this.f61277k;
                    CompletableSource completableSource = null;
                    try {
                        T poll = this.f61274h.poll();
                        if (poll != null) {
                            CompletableSource apply = this.f61269c.apply(poll);
                            Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                            completableSource = apply;
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z2 && z) {
                            this.f61278l = true;
                            Throwable m31818b = ExceptionHelper.m31818b(atomicThrowable);
                            if (m31818b != null) {
                                this.f61268b.onError(m31818b);
                                return;
                            } else {
                                this.f61268b.onComplete();
                                return;
                            }
                        }
                        if (!z) {
                            this.f61276j = true;
                            completableSource.mo31345b(this.f61272f);
                        }
                    } catch (Throwable th) {
                        Exceptions.m31402a(th);
                        this.f61278l = true;
                        this.f61274h.clear();
                        this.f61275i.mo31379f();
                        ExceptionHelper.m31817a(atomicThrowable, th);
                        this.f61268b.onError(ExceptionHelper.m31818b(atomicThrowable));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f61274h.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61278l = true;
            this.f61275i.mo31379f();
            DisposableHelper.m31409a(this.f61272f);
            if (getAndIncrement() == 0) {
                this.f61274h.clear();
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61277k = true;
            m31637b();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f61271e, th)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            if (this.f61270d != ErrorMode.IMMEDIATE) {
                this.f61277k = true;
                m31637b();
                return;
            }
            this.f61278l = true;
            DisposableHelper.m31409a(this.f61272f);
            Throwable m31818b = ExceptionHelper.m31818b(this.f61271e);
            if (m31818b != ExceptionHelper.f62793a) {
                this.f61268b.onError(m31818b);
            }
            if (getAndIncrement() == 0) {
                this.f61274h.clear();
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (t != null) {
                this.f61274h.offer(t);
            }
            m31637b();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61278l;
        }
    }

    @Override // io.reactivex.Completable
    /* renamed from: c */
    public void mo31346c(CompletableObserver completableObserver) {
        if (ScalarXMapZHelper.m31644a(null, null, completableObserver)) {
            return;
        }
        new ConcatMapCompletableObserver(completableObserver, null, null, 0);
        throw null;
    }
}
