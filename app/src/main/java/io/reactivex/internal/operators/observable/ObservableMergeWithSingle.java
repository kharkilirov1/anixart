package io.reactivex.internal.operators.observable;

import android.R;
import io.reactivex.Flowable;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableMergeWithSingle<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class MergeWithObserver<T> extends AtomicInteger implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f61826b;

        /* renamed from: c */
        public final AtomicReference<Disposable> f61827c = new AtomicReference<>();

        /* renamed from: d */
        public final OtherObserver<T> f61828d = new OtherObserver<>(this);

        /* renamed from: e */
        public final AtomicThrowable f61829e = new AtomicThrowable();

        /* renamed from: f */
        public volatile SimplePlainQueue<T> f61830f;

        /* renamed from: g */
        public T f61831g;

        /* renamed from: h */
        public volatile boolean f61832h;

        /* renamed from: i */
        public volatile boolean f61833i;

        /* renamed from: j */
        public volatile int f61834j;

        public static final class OtherObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T> {

            /* renamed from: b */
            public final MergeWithObserver<T> f61835b;

            public OtherObserver(MergeWithObserver<T> mergeWithObserver) {
                this.f61835b = mergeWithObserver;
            }

            @Override // io.reactivex.SingleObserver
            /* renamed from: a */
            public void mo31388a(Disposable disposable) {
                DisposableHelper.m31413e(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th) {
                MergeWithObserver<T> mergeWithObserver = this.f61835b;
                if (!ExceptionHelper.m31817a(mergeWithObserver.f61829e, th)) {
                    RxJavaPlugins.m31848b(th);
                } else {
                    DisposableHelper.m31409a(mergeWithObserver.f61827c);
                    mergeWithObserver.m31687b();
                }
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(T t) {
                MergeWithObserver<T> mergeWithObserver = this.f61835b;
                if (mergeWithObserver.compareAndSet(0, 1)) {
                    mergeWithObserver.f61826b.onNext(t);
                    mergeWithObserver.f61834j = 2;
                } else {
                    mergeWithObserver.f61831g = t;
                    mergeWithObserver.f61834j = 1;
                    if (mergeWithObserver.getAndIncrement() != 0) {
                        return;
                    }
                }
                mergeWithObserver.m31688c();
            }
        }

        public MergeWithObserver(Observer<? super T> observer) {
            this.f61826b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31413e(this.f61827c, disposable);
        }

        /* renamed from: b */
        public void m31687b() {
            if (getAndIncrement() == 0) {
                m31688c();
            }
        }

        /* renamed from: c */
        public void m31688c() {
            Observer<? super T> observer = this.f61826b;
            int i2 = 1;
            while (!this.f61832h) {
                if (this.f61829e.get() != null) {
                    this.f61831g = null;
                    this.f61830f = null;
                    observer.onError(ExceptionHelper.m31818b(this.f61829e));
                    return;
                }
                int i3 = this.f61834j;
                if (i3 == 1) {
                    T t = this.f61831g;
                    this.f61831g = null;
                    this.f61834j = 2;
                    observer.onNext(t);
                    i3 = 2;
                }
                boolean z = this.f61833i;
                SimplePlainQueue<T> simplePlainQueue = this.f61830f;
                R.attr poll = simplePlainQueue != null ? simplePlainQueue.poll() : null;
                boolean z2 = poll == null;
                if (z && z2 && i3 == 2) {
                    this.f61830f = null;
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
            this.f61831g = null;
            this.f61830f = null;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61832h = true;
            DisposableHelper.m31409a(this.f61827c);
            DisposableHelper.m31409a(this.f61828d);
            if (getAndIncrement() == 0) {
                this.f61830f = null;
                this.f61831g = null;
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61833i = true;
            m31687b();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f61829e, th)) {
                RxJavaPlugins.m31848b(th);
            } else {
                DisposableHelper.m31409a(this.f61827c);
                m31687b();
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (compareAndSet(0, 1)) {
                this.f61826b.onNext(t);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SpscLinkedArrayQueue spscLinkedArrayQueue = this.f61830f;
                if (spscLinkedArrayQueue == null) {
                    spscLinkedArrayQueue = new SpscLinkedArrayQueue(Flowable.f59569b);
                    this.f61830f = spscLinkedArrayQueue;
                }
                spscLinkedArrayQueue.offer(t);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m31688c();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(this.f61827c.get());
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(observer);
        observer.mo31373a(mergeWithObserver);
        this.f61337b.mo31364c(mergeWithObserver);
        throw null;
    }
}
