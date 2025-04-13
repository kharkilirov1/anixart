package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class UnicastSubject<T> extends Subject<T> {

    /* renamed from: b */
    public final SpscLinkedArrayQueue<T> f62976b;

    /* renamed from: c */
    public final AtomicReference<Observer<? super T>> f62977c;

    /* renamed from: d */
    public final AtomicReference<Runnable> f62978d;

    /* renamed from: e */
    public final boolean f62979e;

    /* renamed from: f */
    public volatile boolean f62980f;

    /* renamed from: g */
    public volatile boolean f62981g;

    /* renamed from: h */
    public Throwable f62982h;

    /* renamed from: i */
    public final AtomicBoolean f62983i;

    /* renamed from: j */
    public final BasicIntQueueDisposable<T> f62984j;

    /* renamed from: k */
    public boolean f62985k;

    public final class UnicastQueueDisposable extends BasicIntQueueDisposable<T> {
        public UnicastQueueDisposable() {
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            if ((i2 & 2) == 0) {
                return 0;
            }
            UnicastSubject.this.f62985k = true;
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            UnicastSubject.this.f62976b.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (UnicastSubject.this.f62980f) {
                return;
            }
            UnicastSubject.this.f62980f = true;
            UnicastSubject.this.m31873r();
            UnicastSubject.this.f62977c.lazySet(null);
            if (UnicastSubject.this.f62984j.getAndIncrement() == 0) {
                UnicastSubject.this.f62977c.lazySet(null);
                UnicastSubject.this.f62976b.clear();
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return UnicastSubject.this.f62976b.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            return UnicastSubject.this.f62976b.poll();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return UnicastSubject.this.f62980f;
        }
    }

    public UnicastSubject(int i2, boolean z) {
        ObjectHelper.m31427c(i2, "capacityHint");
        this.f62976b = new SpscLinkedArrayQueue<>(i2);
        this.f62978d = new AtomicReference<>();
        this.f62979e = z;
        this.f62977c = new AtomicReference<>();
        this.f62983i = new AtomicBoolean();
        this.f62984j = new UnicastQueueDisposable();
    }

    @CheckReturnValue
    @NonNull
    /* renamed from: p */
    public static <T> UnicastSubject<T> m31871p(int i2) {
        return new UnicastSubject<>(i2, true);
    }

    @CheckReturnValue
    @NonNull
    /* renamed from: q */
    public static <T> UnicastSubject<T> m31872q(int i2, Runnable runnable) {
        return new UnicastSubject<>(i2, runnable, true);
    }

    @Override // io.reactivex.Observer
    /* renamed from: a */
    public void mo31373a(Disposable disposable) {
        if (this.f62981g || this.f62980f) {
            disposable.mo31379f();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        if (this.f62983i.get() || !this.f62983i.compareAndSet(false, true)) {
            IllegalStateException illegalStateException = new IllegalStateException("Only a single observer allowed.");
            observer.mo31373a(EmptyDisposable.INSTANCE);
            observer.onError(illegalStateException);
        } else {
            observer.mo31373a(this.f62984j);
            this.f62977c.lazySet(observer);
            if (this.f62980f) {
                this.f62977c.lazySet(null);
            } else {
                m31874s();
            }
        }
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (this.f62981g || this.f62980f) {
            return;
        }
        this.f62981g = true;
        m31873r();
        m31874s();
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        Objects.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f62981g || this.f62980f) {
            RxJavaPlugins.m31848b(th);
            return;
        }
        this.f62982h = th;
        this.f62981g = true;
        m31873r();
        m31874s();
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        Objects.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f62981g || this.f62980f) {
            return;
        }
        this.f62976b.offer(t);
        m31874s();
    }

    /* renamed from: r */
    public void m31873r() {
        Runnable runnable = this.f62978d.get();
        if (runnable == null || !this.f62978d.compareAndSet(runnable, null)) {
            return;
        }
        runnable.run();
    }

    /* renamed from: s */
    public void m31874s() {
        if (this.f62984j.getAndIncrement() != 0) {
            return;
        }
        Observer<? super T> observer = this.f62977c.get();
        int i2 = 1;
        int i3 = 1;
        while (observer == null) {
            i3 = this.f62984j.addAndGet(-i3);
            if (i3 == 0) {
                return;
            } else {
                observer = this.f62977c.get();
            }
        }
        if (this.f62985k) {
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.f62976b;
            boolean z = !this.f62979e;
            while (!this.f62980f) {
                boolean z2 = this.f62981g;
                if (z && z2 && m31875t(spscLinkedArrayQueue, observer)) {
                    return;
                }
                observer.onNext(null);
                if (z2) {
                    this.f62977c.lazySet(null);
                    Throwable th = this.f62982h;
                    if (th != null) {
                        observer.onError(th);
                        return;
                    } else {
                        observer.onComplete();
                        return;
                    }
                }
                i2 = this.f62984j.addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            }
            this.f62977c.lazySet(null);
            spscLinkedArrayQueue.clear();
            return;
        }
        SpscLinkedArrayQueue<T> spscLinkedArrayQueue2 = this.f62976b;
        boolean z3 = !this.f62979e;
        boolean z4 = true;
        int i4 = 1;
        while (!this.f62980f) {
            boolean z5 = this.f62981g;
            T poll = this.f62976b.poll();
            boolean z6 = poll == null;
            if (z5) {
                if (z3 && z4) {
                    if (m31875t(spscLinkedArrayQueue2, observer)) {
                        return;
                    } else {
                        z4 = false;
                    }
                }
                if (z6) {
                    this.f62977c.lazySet(null);
                    Throwable th2 = this.f62982h;
                    if (th2 != null) {
                        observer.onError(th2);
                        return;
                    } else {
                        observer.onComplete();
                        return;
                    }
                }
            }
            if (z6) {
                i4 = this.f62984j.addAndGet(-i4);
                if (i4 == 0) {
                    return;
                }
            } else {
                observer.onNext(poll);
            }
        }
        this.f62977c.lazySet(null);
        spscLinkedArrayQueue2.clear();
    }

    /* renamed from: t */
    public boolean m31875t(SimpleQueue<T> simpleQueue, Observer<? super T> observer) {
        Throwable th = this.f62982h;
        if (th == null) {
            return false;
        }
        this.f62977c.lazySet(null);
        ((SpscLinkedArrayQueue) simpleQueue).clear();
        observer.onError(th);
        return true;
    }

    public UnicastSubject(int i2, Runnable runnable, boolean z) {
        ObjectHelper.m31427c(i2, "capacityHint");
        this.f62976b = new SpscLinkedArrayQueue<>(i2);
        Objects.requireNonNull(runnable, "onTerminate");
        this.f62978d = new AtomicReference<>(runnable);
        this.f62979e = z;
        this.f62977c = new AtomicReference<>();
        this.f62983i = new AtomicBoolean();
        this.f62984j = new UnicastQueueDisposable();
    }
}
