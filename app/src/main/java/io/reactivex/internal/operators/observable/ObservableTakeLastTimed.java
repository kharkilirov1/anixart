package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class ObservableTakeLastTimed<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class TakeLastTimedObserver<T> extends AtomicBoolean implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f62092b;

        /* renamed from: c */
        public final long f62093c;

        /* renamed from: d */
        public final long f62094d;

        /* renamed from: e */
        public final TimeUnit f62095e = null;

        /* renamed from: f */
        public final Scheduler f62096f = null;

        /* renamed from: g */
        public final SpscLinkedArrayQueue<Object> f62097g;

        /* renamed from: h */
        public final boolean f62098h;

        /* renamed from: i */
        public Disposable f62099i;

        /* renamed from: j */
        public volatile boolean f62100j;

        /* renamed from: k */
        public Throwable f62101k;

        public TakeLastTimedObserver(Observer<? super T> observer, long j2, long j3, TimeUnit timeUnit, Scheduler scheduler, int i2, boolean z) {
            this.f62092b = observer;
            this.f62093c = j2;
            this.f62094d = j3;
            this.f62097g = new SpscLinkedArrayQueue<>(i2);
            this.f62098h = z;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62099i, disposable)) {
                this.f62099i = disposable;
                this.f62092b.mo31373a(this);
            }
        }

        /* renamed from: b */
        public void m31725b() {
            Throwable th;
            if (compareAndSet(false, true)) {
                Observer<? super T> observer = this.f62092b;
                SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.f62097g;
                boolean z = this.f62098h;
                while (!this.f62100j) {
                    if (!z && (th = this.f62101k) != null) {
                        spscLinkedArrayQueue.clear();
                        observer.onError(th);
                        return;
                    }
                    Object poll = spscLinkedArrayQueue.poll();
                    if (poll == null) {
                        Throwable th2 = this.f62101k;
                        if (th2 != null) {
                            observer.onError(th2);
                            return;
                        } else {
                            observer.onComplete();
                            return;
                        }
                    }
                    Object poll2 = spscLinkedArrayQueue.poll();
                    if (((Long) poll).longValue() >= this.f62096f.mo31375b(this.f62095e) - this.f62094d) {
                        observer.onNext(poll2);
                    }
                }
                spscLinkedArrayQueue.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (this.f62100j) {
                return;
            }
            this.f62100j = true;
            this.f62099i.mo31379f();
            if (compareAndSet(false, true)) {
                this.f62097g.clear();
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            m31725b();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f62101k = th;
            m31725b();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.f62097g;
            long mo31375b = this.f62096f.mo31375b(this.f62095e);
            long j2 = this.f62094d;
            long j3 = this.f62093c;
            boolean z = j3 == Long.MAX_VALUE;
            spscLinkedArrayQueue.m31765c(Long.valueOf(mo31375b), t);
            while (!spscLinkedArrayQueue.isEmpty()) {
                if (((Long) spscLinkedArrayQueue.peek()).longValue() > mo31375b - j2 && (z || (spscLinkedArrayQueue.m31766d() >> 1) <= j3)) {
                    return;
                }
                spscLinkedArrayQueue.poll();
                spscLinkedArrayQueue.poll();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62100j;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f61337b.mo31364c(new TakeLastTimedObserver(observer, 0L, 0L, null, null, 0, false));
    }
}
