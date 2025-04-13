package io.reactivex.internal.operators.observable;

import android.R;
import io.reactivex.Flowable;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
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
public final class ObservableFlatMapSingle<T, R> extends AbstractObservableWithUpstream<T, R> {

    public static final class FlatMapSingleObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super R> f61685b;

        /* renamed from: c */
        public final boolean f61686c;

        /* renamed from: i */
        public Disposable f61692i;

        /* renamed from: j */
        public volatile boolean f61693j;

        /* renamed from: g */
        public final Function<? super T, ? extends SingleSource<? extends R>> f61690g = null;

        /* renamed from: d */
        public final CompositeDisposable f61687d = new CompositeDisposable();

        /* renamed from: f */
        public final AtomicThrowable f61689f = new AtomicThrowable();

        /* renamed from: e */
        public final AtomicInteger f61688e = new AtomicInteger(1);

        /* renamed from: h */
        public final AtomicReference<SpscLinkedArrayQueue<R>> f61691h = new AtomicReference<>();

        public final class InnerObserver extends AtomicReference<Disposable> implements SingleObserver<R>, Disposable {
            public InnerObserver() {
            }

            @Override // io.reactivex.SingleObserver
            /* renamed from: a */
            public void mo31388a(Disposable disposable) {
                DisposableHelper.m31413e(this, disposable);
            }

            @Override // io.reactivex.disposables.Disposable
            /* renamed from: f */
            public void mo31379f() {
                DisposableHelper.m31409a(this);
            }

            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th) {
                FlatMapSingleObserver flatMapSingleObserver = FlatMapSingleObserver.this;
                flatMapSingleObserver.f61687d.mo31394c(this);
                if (!ExceptionHelper.m31817a(flatMapSingleObserver.f61689f, th)) {
                    RxJavaPlugins.m31848b(th);
                    return;
                }
                if (!flatMapSingleObserver.f61686c) {
                    flatMapSingleObserver.f61692i.mo31379f();
                    flatMapSingleObserver.f61687d.mo31379f();
                }
                flatMapSingleObserver.f61688e.decrementAndGet();
                flatMapSingleObserver.m31670b();
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(R r) {
                SpscLinkedArrayQueue<R> spscLinkedArrayQueue;
                FlatMapSingleObserver flatMapSingleObserver = FlatMapSingleObserver.this;
                flatMapSingleObserver.f61687d.mo31394c(this);
                if (flatMapSingleObserver.get() == 0) {
                    if (flatMapSingleObserver.compareAndSet(0, 1)) {
                        flatMapSingleObserver.f61685b.onNext(r);
                        boolean z = flatMapSingleObserver.f61688e.decrementAndGet() == 0;
                        SpscLinkedArrayQueue<R> spscLinkedArrayQueue2 = flatMapSingleObserver.f61691h.get();
                        if (!z || (spscLinkedArrayQueue2 != null && !spscLinkedArrayQueue2.isEmpty())) {
                            if (flatMapSingleObserver.decrementAndGet() == 0) {
                                return;
                            }
                            flatMapSingleObserver.m31671c();
                        } else {
                            Throwable m31818b = ExceptionHelper.m31818b(flatMapSingleObserver.f61689f);
                            if (m31818b != null) {
                                flatMapSingleObserver.f61685b.onError(m31818b);
                                return;
                            } else {
                                flatMapSingleObserver.f61685b.onComplete();
                                return;
                            }
                        }
                    }
                }
                do {
                    spscLinkedArrayQueue = flatMapSingleObserver.f61691h.get();
                    if (spscLinkedArrayQueue != null) {
                        break;
                    } else {
                        spscLinkedArrayQueue = new SpscLinkedArrayQueue<>(Flowable.f59569b);
                    }
                } while (!flatMapSingleObserver.f61691h.compareAndSet(null, spscLinkedArrayQueue));
                synchronized (spscLinkedArrayQueue) {
                    spscLinkedArrayQueue.offer(r);
                }
                flatMapSingleObserver.f61688e.decrementAndGet();
                if (flatMapSingleObserver.getAndIncrement() != 0) {
                    return;
                }
                flatMapSingleObserver.m31671c();
            }

            @Override // io.reactivex.disposables.Disposable
            /* renamed from: s */
            public boolean mo31380s() {
                return DisposableHelper.m31410b(get());
            }
        }

        public FlatMapSingleObserver(Observer<? super R> observer, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z) {
            this.f61685b = observer;
            this.f61686c = z;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61692i, disposable)) {
                this.f61692i = disposable;
                this.f61685b.mo31373a(this);
            }
        }

        /* renamed from: b */
        public void m31670b() {
            if (getAndIncrement() == 0) {
                m31671c();
            }
        }

        /* renamed from: c */
        public void m31671c() {
            Observer<? super R> observer = this.f61685b;
            AtomicInteger atomicInteger = this.f61688e;
            AtomicReference<SpscLinkedArrayQueue<R>> atomicReference = this.f61691h;
            int i2 = 1;
            while (!this.f61693j) {
                if (!this.f61686c && this.f61689f.get() != null) {
                    Throwable m31818b = ExceptionHelper.m31818b(this.f61689f);
                    SpscLinkedArrayQueue<R> spscLinkedArrayQueue = this.f61691h.get();
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
                    Throwable m31818b2 = ExceptionHelper.m31818b(this.f61689f);
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
            SpscLinkedArrayQueue<R> spscLinkedArrayQueue3 = this.f61691h.get();
            if (spscLinkedArrayQueue3 != null) {
                spscLinkedArrayQueue3.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61693j = true;
            this.f61692i.mo31379f();
            this.f61687d.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61688e.decrementAndGet();
            m31670b();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f61688e.decrementAndGet();
            if (!ExceptionHelper.m31817a(this.f61689f, th)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            if (!this.f61686c) {
                this.f61687d.mo31379f();
            }
            m31670b();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            try {
                SingleSource<? extends R> apply = this.f61690g.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                SingleSource<? extends R> singleSource = apply;
                this.f61688e.getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.f61693j || !this.f61687d.mo31393b(innerObserver)) {
                    return;
                }
                singleSource.mo31385b(innerObserver);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61692i.mo31379f();
                onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61693j;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super R> observer) {
        this.f61337b.mo31364c(new FlatMapSingleObserver(observer, null, false));
    }
}
