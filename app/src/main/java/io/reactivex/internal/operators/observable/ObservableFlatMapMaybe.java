package io.reactivex.internal.operators.observable;

import android.R;
import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
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
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableFlatMapMaybe<T, R> extends AbstractObservableWithUpstream<T, R> {

    public static final class FlatMapMaybeObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super R> f61675b;

        /* renamed from: c */
        public final boolean f61676c;

        /* renamed from: i */
        public Disposable f61682i;

        /* renamed from: j */
        public volatile boolean f61683j;

        /* renamed from: g */
        public final Function<? super T, ? extends MaybeSource<? extends R>> f61680g = null;

        /* renamed from: d */
        public final CompositeDisposable f61677d = new CompositeDisposable();

        /* renamed from: f */
        public final AtomicThrowable f61679f = new AtomicThrowable();

        /* renamed from: e */
        public final AtomicInteger f61678e = new AtomicInteger(1);

        /* renamed from: h */
        public final AtomicReference<SpscLinkedArrayQueue<R>> f61681h = new AtomicReference<>();

        public final class InnerObserver extends AtomicReference<Disposable> implements MaybeObserver<R>, Disposable {
            public InnerObserver() {
            }

            @Override // io.reactivex.MaybeObserver
            /* renamed from: a */
            public void mo31355a(Disposable disposable) {
                DisposableHelper.m31413e(this, disposable);
            }

            @Override // io.reactivex.disposables.Disposable
            /* renamed from: f */
            public void mo31379f() {
                DisposableHelper.m31409a(this);
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                FlatMapMaybeObserver flatMapMaybeObserver = FlatMapMaybeObserver.this;
                flatMapMaybeObserver.f61677d.mo31394c(this);
                if (flatMapMaybeObserver.get() == 0) {
                    if (flatMapMaybeObserver.compareAndSet(0, 1)) {
                        boolean z = flatMapMaybeObserver.f61678e.decrementAndGet() == 0;
                        SpscLinkedArrayQueue<R> spscLinkedArrayQueue = flatMapMaybeObserver.f61681h.get();
                        if (!z || (spscLinkedArrayQueue != null && !spscLinkedArrayQueue.isEmpty())) {
                            if (flatMapMaybeObserver.decrementAndGet() == 0) {
                                return;
                            }
                            flatMapMaybeObserver.m31669c();
                            return;
                        } else {
                            Throwable m31818b = ExceptionHelper.m31818b(flatMapMaybeObserver.f61679f);
                            if (m31818b != null) {
                                flatMapMaybeObserver.f61675b.onError(m31818b);
                                return;
                            } else {
                                flatMapMaybeObserver.f61675b.onComplete();
                                return;
                            }
                        }
                    }
                }
                flatMapMaybeObserver.f61678e.decrementAndGet();
                flatMapMaybeObserver.m31668b();
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(Throwable th) {
                FlatMapMaybeObserver flatMapMaybeObserver = FlatMapMaybeObserver.this;
                flatMapMaybeObserver.f61677d.mo31394c(this);
                if (!ExceptionHelper.m31817a(flatMapMaybeObserver.f61679f, th)) {
                    RxJavaPlugins.m31848b(th);
                    return;
                }
                if (!flatMapMaybeObserver.f61676c) {
                    flatMapMaybeObserver.f61682i.mo31379f();
                    flatMapMaybeObserver.f61677d.mo31379f();
                }
                flatMapMaybeObserver.f61678e.decrementAndGet();
                flatMapMaybeObserver.m31668b();
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(R r) {
                SpscLinkedArrayQueue<R> spscLinkedArrayQueue;
                FlatMapMaybeObserver flatMapMaybeObserver = FlatMapMaybeObserver.this;
                flatMapMaybeObserver.f61677d.mo31394c(this);
                if (flatMapMaybeObserver.get() == 0) {
                    if (flatMapMaybeObserver.compareAndSet(0, 1)) {
                        flatMapMaybeObserver.f61675b.onNext(r);
                        boolean z = flatMapMaybeObserver.f61678e.decrementAndGet() == 0;
                        SpscLinkedArrayQueue<R> spscLinkedArrayQueue2 = flatMapMaybeObserver.f61681h.get();
                        if (!z || (spscLinkedArrayQueue2 != null && !spscLinkedArrayQueue2.isEmpty())) {
                            if (flatMapMaybeObserver.decrementAndGet() == 0) {
                                return;
                            }
                            flatMapMaybeObserver.m31669c();
                        } else {
                            Throwable m31818b = ExceptionHelper.m31818b(flatMapMaybeObserver.f61679f);
                            if (m31818b != null) {
                                flatMapMaybeObserver.f61675b.onError(m31818b);
                                return;
                            } else {
                                flatMapMaybeObserver.f61675b.onComplete();
                                return;
                            }
                        }
                    }
                }
                do {
                    spscLinkedArrayQueue = flatMapMaybeObserver.f61681h.get();
                    if (spscLinkedArrayQueue != null) {
                        break;
                    } else {
                        spscLinkedArrayQueue = new SpscLinkedArrayQueue<>(Flowable.f59569b);
                    }
                } while (!flatMapMaybeObserver.f61681h.compareAndSet(null, spscLinkedArrayQueue));
                synchronized (spscLinkedArrayQueue) {
                    spscLinkedArrayQueue.offer(r);
                }
                flatMapMaybeObserver.f61678e.decrementAndGet();
                if (flatMapMaybeObserver.getAndIncrement() != 0) {
                    return;
                }
                flatMapMaybeObserver.m31669c();
            }

            @Override // io.reactivex.disposables.Disposable
            /* renamed from: s */
            public boolean mo31380s() {
                return DisposableHelper.m31410b(get());
            }
        }

        public FlatMapMaybeObserver(Observer<? super R> observer, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z) {
            this.f61675b = observer;
            this.f61676c = z;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61682i, disposable)) {
                this.f61682i = disposable;
                this.f61675b.mo31373a(this);
            }
        }

        /* renamed from: b */
        public void m31668b() {
            if (getAndIncrement() == 0) {
                m31669c();
            }
        }

        /* renamed from: c */
        public void m31669c() {
            Observer<? super R> observer = this.f61675b;
            AtomicInteger atomicInteger = this.f61678e;
            AtomicReference<SpscLinkedArrayQueue<R>> atomicReference = this.f61681h;
            int i2 = 1;
            while (!this.f61683j) {
                if (!this.f61676c && this.f61679f.get() != null) {
                    Throwable m31818b = ExceptionHelper.m31818b(this.f61679f);
                    SpscLinkedArrayQueue<R> spscLinkedArrayQueue = this.f61681h.get();
                    if (spscLinkedArrayQueue != null) {
                        spscLinkedArrayQueue.clear();
                    }
                    observer.onError(m31818b);
                    return;
                }
                boolean z = atomicInteger.get() == 0;
                SpscLinkedArrayQueue<R> spscLinkedArrayQueue2 = atomicReference.get();
                R.attr poll = spscLinkedArrayQueue2 != null ? spscLinkedArrayQueue2.poll() : null;
                boolean z2 = poll == null;
                if (z && z2) {
                    Throwable m31818b2 = ExceptionHelper.m31818b(this.f61679f);
                    if (m31818b2 != null) {
                        observer.onError(m31818b2);
                        return;
                    } else {
                        observer.onComplete();
                        return;
                    }
                }
                if (z2) {
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else {
                    observer.onNext(poll);
                }
            }
            SpscLinkedArrayQueue<R> spscLinkedArrayQueue3 = this.f61681h.get();
            if (spscLinkedArrayQueue3 != null) {
                spscLinkedArrayQueue3.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61683j = true;
            this.f61682i.mo31379f();
            this.f61677d.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61678e.decrementAndGet();
            m31668b();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f61678e.decrementAndGet();
            if (!ExceptionHelper.m31817a(this.f61679f, th)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            if (!this.f61676c) {
                this.f61677d.mo31379f();
            }
            m31668b();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            try {
                MaybeSource<? extends R> apply = this.f61680g.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null MaybeSource");
                MaybeSource<? extends R> maybeSource = apply;
                this.f61678e.getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.f61683j || !this.f61677d.mo31393b(innerObserver)) {
                    return;
                }
                maybeSource.mo31353b(innerObserver);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61682i.mo31379f();
                onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61683j;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super R> observer) {
        this.f61337b.mo31364c(new FlatMapMaybeObserver(observer, null, false));
    }
}
