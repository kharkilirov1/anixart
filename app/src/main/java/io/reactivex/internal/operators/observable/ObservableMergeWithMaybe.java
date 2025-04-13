package io.reactivex.internal.operators.observable;

import android.R;
import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
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
public final class ObservableMergeWithMaybe<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class MergeWithObserver<T> extends AtomicInteger implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f61816b;

        /* renamed from: c */
        public final AtomicReference<Disposable> f61817c = new AtomicReference<>();

        /* renamed from: d */
        public final OtherObserver<T> f61818d = new OtherObserver<>(this);

        /* renamed from: e */
        public final AtomicThrowable f61819e = new AtomicThrowable();

        /* renamed from: f */
        public volatile SimplePlainQueue<T> f61820f;

        /* renamed from: g */
        public T f61821g;

        /* renamed from: h */
        public volatile boolean f61822h;

        /* renamed from: i */
        public volatile boolean f61823i;

        /* renamed from: j */
        public volatile int f61824j;

        public static final class OtherObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {

            /* renamed from: b */
            public final MergeWithObserver<T> f61825b;

            public OtherObserver(MergeWithObserver<T> mergeWithObserver) {
                this.f61825b = mergeWithObserver;
            }

            @Override // io.reactivex.MaybeObserver
            /* renamed from: a */
            public void mo31355a(Disposable disposable) {
                DisposableHelper.m31413e(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                MergeWithObserver<T> mergeWithObserver = this.f61825b;
                mergeWithObserver.f61824j = 2;
                mergeWithObserver.m31685b();
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(Throwable th) {
                MergeWithObserver<T> mergeWithObserver = this.f61825b;
                if (!ExceptionHelper.m31817a(mergeWithObserver.f61819e, th)) {
                    RxJavaPlugins.m31848b(th);
                } else {
                    DisposableHelper.m31409a(mergeWithObserver.f61817c);
                    mergeWithObserver.m31685b();
                }
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(T t) {
                MergeWithObserver<T> mergeWithObserver = this.f61825b;
                if (mergeWithObserver.compareAndSet(0, 1)) {
                    mergeWithObserver.f61816b.onNext(t);
                    mergeWithObserver.f61824j = 2;
                } else {
                    mergeWithObserver.f61821g = t;
                    mergeWithObserver.f61824j = 1;
                    if (mergeWithObserver.getAndIncrement() != 0) {
                        return;
                    }
                }
                mergeWithObserver.m31686c();
            }
        }

        public MergeWithObserver(Observer<? super T> observer) {
            this.f61816b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31413e(this.f61817c, disposable);
        }

        /* renamed from: b */
        public void m31685b() {
            if (getAndIncrement() == 0) {
                m31686c();
            }
        }

        /* renamed from: c */
        public void m31686c() {
            Observer<? super T> observer = this.f61816b;
            int i2 = 1;
            while (!this.f61822h) {
                if (this.f61819e.get() != null) {
                    this.f61821g = null;
                    this.f61820f = null;
                    observer.onError(ExceptionHelper.m31818b(this.f61819e));
                    return;
                }
                int i3 = this.f61824j;
                if (i3 == 1) {
                    T t = this.f61821g;
                    this.f61821g = null;
                    this.f61824j = 2;
                    observer.onNext(t);
                    i3 = 2;
                }
                boolean z = this.f61823i;
                SimplePlainQueue<T> simplePlainQueue = this.f61820f;
                R.attr poll = simplePlainQueue != null ? simplePlainQueue.poll() : null;
                boolean z2 = poll == null;
                if (z && z2 && i3 == 2) {
                    this.f61820f = null;
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
            this.f61821g = null;
            this.f61820f = null;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61822h = true;
            DisposableHelper.m31409a(this.f61817c);
            DisposableHelper.m31409a(this.f61818d);
            if (getAndIncrement() == 0) {
                this.f61820f = null;
                this.f61821g = null;
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61823i = true;
            m31685b();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f61819e, th)) {
                RxJavaPlugins.m31848b(th);
            } else {
                DisposableHelper.m31409a(this.f61817c);
                m31685b();
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (compareAndSet(0, 1)) {
                this.f61816b.onNext(t);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SpscLinkedArrayQueue spscLinkedArrayQueue = this.f61820f;
                if (spscLinkedArrayQueue == null) {
                    spscLinkedArrayQueue = new SpscLinkedArrayQueue(Flowable.f59569b);
                    this.f61820f = spscLinkedArrayQueue;
                }
                spscLinkedArrayQueue.offer(t);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m31686c();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(this.f61817c.get());
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
