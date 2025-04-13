package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class ObservableSkipLastTimed<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class SkipLastTimedObserver<T> extends AtomicInteger implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f62031b;

        /* renamed from: c */
        public final long f62032c;

        /* renamed from: d */
        public final TimeUnit f62033d = null;

        /* renamed from: e */
        public final Scheduler f62034e = null;

        /* renamed from: f */
        public final SpscLinkedArrayQueue<Object> f62035f;

        /* renamed from: g */
        public final boolean f62036g;

        /* renamed from: h */
        public Disposable f62037h;

        /* renamed from: i */
        public volatile boolean f62038i;

        /* renamed from: j */
        public volatile boolean f62039j;

        /* renamed from: k */
        public Throwable f62040k;

        public SkipLastTimedObserver(Observer<? super T> observer, long j2, TimeUnit timeUnit, Scheduler scheduler, int i2, boolean z) {
            this.f62031b = observer;
            this.f62032c = j2;
            this.f62035f = new SpscLinkedArrayQueue<>(i2);
            this.f62036g = z;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62037h, disposable)) {
                this.f62037h = disposable;
                this.f62031b.mo31373a(this);
            }
        }

        /* renamed from: b */
        public void m31722b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super T> observer = this.f62031b;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.f62035f;
            boolean z = this.f62036g;
            TimeUnit timeUnit = this.f62033d;
            Scheduler scheduler = this.f62034e;
            long j2 = this.f62032c;
            int i2 = 1;
            while (!this.f62038i) {
                boolean z2 = this.f62039j;
                Long l2 = (Long) spscLinkedArrayQueue.peek();
                boolean z3 = l2 == null;
                long mo31375b = scheduler.mo31375b(timeUnit);
                if (!z3 && l2.longValue() > mo31375b - j2) {
                    z3 = true;
                }
                if (z2) {
                    if (!z) {
                        Throwable th = this.f62040k;
                        if (th != null) {
                            this.f62035f.clear();
                            observer.onError(th);
                            return;
                        } else if (z3) {
                            observer.onComplete();
                            return;
                        }
                    } else if (z3) {
                        Throwable th2 = this.f62040k;
                        if (th2 != null) {
                            observer.onError(th2);
                            return;
                        } else {
                            observer.onComplete();
                            return;
                        }
                    }
                }
                if (z3) {
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else {
                    spscLinkedArrayQueue.poll();
                    observer.onNext(spscLinkedArrayQueue.poll());
                }
            }
            this.f62035f.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (this.f62038i) {
                return;
            }
            this.f62038i = true;
            this.f62037h.mo31379f();
            if (getAndIncrement() == 0) {
                this.f62035f.clear();
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f62039j = true;
            m31722b();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f62040k = th;
            this.f62039j = true;
            m31722b();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f62035f.m31765c(Long.valueOf(this.f62034e.mo31375b(this.f62033d)), t);
            m31722b();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62038i;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f61337b.mo31364c(new SkipLastTimedObserver(observer, 0L, null, null, 0, false));
    }
}
