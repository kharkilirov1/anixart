package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.util.QueueDrainHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableBufferTimed<T, U extends Collection<? super T>> extends AbstractObservableWithUpstream<T, U> {

    public static final class BufferExactBoundedObserver<T, U extends Collection<? super T>> extends QueueDrainObserver<T, U, U> implements Runnable, Disposable {

        /* renamed from: h */
        public final Callable<U> f61421h;

        /* renamed from: i */
        public final long f61422i;

        /* renamed from: j */
        public final TimeUnit f61423j;

        /* renamed from: k */
        public final int f61424k;

        /* renamed from: l */
        public final boolean f61425l;

        /* renamed from: m */
        public final Scheduler.Worker f61426m;

        /* renamed from: n */
        public U f61427n;

        /* renamed from: o */
        public Disposable f61428o;

        /* renamed from: p */
        public Disposable f61429p;

        /* renamed from: q */
        public long f61430q;

        /* renamed from: r */
        public long f61431r;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61429p, disposable)) {
                this.f61429p = disposable;
                try {
                    U call = this.f61421h.call();
                    Objects.requireNonNull(call, "The buffer supplied is null");
                    this.f61427n = call;
                    this.f59667c.mo31373a(this);
                    Scheduler.Worker worker = this.f61426m;
                    long j2 = this.f61422i;
                    this.f61428o = worker.mo31384d(this, j2, j2, this.f61423j);
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    disposable.mo31379f();
                    EmptyDisposable.m31418d(th, this.f59667c);
                    this.f61426m.mo31379f();
                }
            }
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        /* renamed from: c */
        public void mo31438c(Observer observer, Object obj) {
            observer.onNext((Collection) obj);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (this.f59669e) {
                return;
            }
            this.f59669e = true;
            this.f61429p.mo31379f();
            this.f61426m.mo31379f();
            synchronized (this) {
                this.f61427n = null;
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            U u;
            this.f61426m.mo31379f();
            synchronized (this) {
                u = this.f61427n;
                this.f61427n = null;
            }
            this.f59668d.offer(u);
            this.f59670f = true;
            if (m31440e()) {
                QueueDrainHelper.m31843c(this.f59668d, this.f59667c, false, this, this);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            synchronized (this) {
                this.f61427n = null;
            }
            this.f59667c.onError(th);
            this.f61426m.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            synchronized (this) {
                U u = this.f61427n;
                if (u == null) {
                    return;
                }
                u.add(t);
                if (u.size() < this.f61424k) {
                    return;
                }
                this.f61427n = null;
                this.f61430q++;
                if (this.f61425l) {
                    this.f61428o.mo31379f();
                }
                m31443i(u, false, this);
                try {
                    U call = this.f61421h.call();
                    Objects.requireNonNull(call, "The buffer supplied is null");
                    U u2 = call;
                    synchronized (this) {
                        this.f61427n = u2;
                        this.f61431r++;
                    }
                    if (this.f61425l) {
                        Scheduler.Worker worker = this.f61426m;
                        long j2 = this.f61422i;
                        this.f61428o = worker.mo31384d(this, j2, j2, this.f61423j);
                    }
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    this.f59667c.onError(th);
                    mo31379f();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U call = this.f61421h.call();
                Objects.requireNonNull(call, "The bufferSupplier returned a null buffer");
                U u = call;
                synchronized (this) {
                    U u2 = this.f61427n;
                    if (u2 != null && this.f61430q == this.f61431r) {
                        this.f61427n = u;
                        m31443i(u2, false, this);
                    }
                }
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                mo31379f();
                this.f59667c.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f59669e;
        }
    }

    public static final class BufferExactUnboundedObserver<T, U extends Collection<? super T>> extends QueueDrainObserver<T, U, U> implements Runnable, Disposable {

        /* renamed from: h */
        public final Callable<U> f61432h;

        /* renamed from: i */
        public final long f61433i;

        /* renamed from: j */
        public final TimeUnit f61434j;

        /* renamed from: k */
        public final Scheduler f61435k;

        /* renamed from: l */
        public Disposable f61436l;

        /* renamed from: m */
        public U f61437m;

        /* renamed from: n */
        public final AtomicReference<Disposable> f61438n;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61436l, disposable)) {
                this.f61436l = disposable;
                try {
                    U call = this.f61432h.call();
                    Objects.requireNonNull(call, "The buffer supplied is null");
                    this.f61437m = call;
                    this.f59667c.mo31373a(this);
                    if (this.f59669e) {
                        return;
                    }
                    Scheduler scheduler = this.f61435k;
                    long j2 = this.f61433i;
                    Disposable mo31378e = scheduler.mo31378e(this, j2, j2, this.f61434j);
                    if (this.f61438n.compareAndSet(null, mo31378e)) {
                        return;
                    }
                    mo31378e.mo31379f();
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    mo31379f();
                    EmptyDisposable.m31418d(th, this.f59667c);
                }
            }
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        /* renamed from: c */
        public void mo31438c(Observer observer, Object obj) {
            this.f59667c.onNext((Collection) obj);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this.f61438n);
            this.f61436l.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            U u;
            synchronized (this) {
                u = this.f61437m;
                this.f61437m = null;
            }
            if (u != null) {
                this.f59668d.offer(u);
                this.f59670f = true;
                if (m31440e()) {
                    QueueDrainHelper.m31843c(this.f59668d, this.f59667c, false, null, this);
                }
            }
            DisposableHelper.m31409a(this.f61438n);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            synchronized (this) {
                this.f61437m = null;
            }
            this.f59667c.onError(th);
            DisposableHelper.m31409a(this.f61438n);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            synchronized (this) {
                U u = this.f61437m;
                if (u == null) {
                    return;
                }
                u.add(t);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            U u;
            try {
                U call = this.f61432h.call();
                Objects.requireNonNull(call, "The bufferSupplier returned a null buffer");
                U u2 = call;
                synchronized (this) {
                    u = this.f61437m;
                    if (u != null) {
                        this.f61437m = u2;
                    }
                }
                if (u == null) {
                    DisposableHelper.m31409a(this.f61438n);
                } else {
                    m31442h(u, false, this);
                }
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f59667c.onError(th);
                mo31379f();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61438n.get() == DisposableHelper.DISPOSED;
        }
    }

    public static final class BufferSkipBoundedObserver<T, U extends Collection<? super T>> extends QueueDrainObserver<T, U, U> implements Runnable, Disposable {

        /* renamed from: h */
        public final Callable<U> f61439h;

        /* renamed from: i */
        public final long f61440i;

        /* renamed from: j */
        public final long f61441j;

        /* renamed from: k */
        public final TimeUnit f61442k;

        /* renamed from: l */
        public final Scheduler.Worker f61443l;

        /* renamed from: m */
        public final List<U> f61444m;

        /* renamed from: n */
        public Disposable f61445n;

        public final class RemoveFromBuffer implements Runnable {

            /* renamed from: b */
            public final U f61446b;

            public RemoveFromBuffer(U u) {
                this.f61446b = u;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (BufferSkipBoundedObserver.this) {
                    BufferSkipBoundedObserver.this.f61444m.remove(this.f61446b);
                }
                BufferSkipBoundedObserver bufferSkipBoundedObserver = BufferSkipBoundedObserver.this;
                bufferSkipBoundedObserver.m31443i(this.f61446b, false, bufferSkipBoundedObserver.f61443l);
            }
        }

        public final class RemoveFromBufferEmit implements Runnable {

            /* renamed from: b */
            public final U f61448b;

            public RemoveFromBufferEmit(U u) {
                this.f61448b = u;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (BufferSkipBoundedObserver.this) {
                    BufferSkipBoundedObserver.this.f61444m.remove(this.f61448b);
                }
                BufferSkipBoundedObserver bufferSkipBoundedObserver = BufferSkipBoundedObserver.this;
                bufferSkipBoundedObserver.m31443i(this.f61448b, false, bufferSkipBoundedObserver.f61443l);
            }
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61445n, disposable)) {
                this.f61445n = disposable;
                try {
                    U call = this.f61439h.call();
                    Objects.requireNonNull(call, "The buffer supplied is null");
                    U u = call;
                    this.f61444m.add(u);
                    this.f59667c.mo31373a(this);
                    Scheduler.Worker worker = this.f61443l;
                    long j2 = this.f61441j;
                    worker.mo31384d(this, j2, j2, this.f61442k);
                    this.f61443l.mo31383c(new RemoveFromBufferEmit(u), this.f61440i, this.f61442k);
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    disposable.mo31379f();
                    EmptyDisposable.m31418d(th, this.f59667c);
                    this.f61443l.mo31379f();
                }
            }
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        /* renamed from: c */
        public void mo31438c(Observer observer, Object obj) {
            observer.onNext((Collection) obj);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (this.f59669e) {
                return;
            }
            this.f59669e = true;
            synchronized (this) {
                this.f61444m.clear();
            }
            this.f61445n.mo31379f();
            this.f61443l.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.f61444m);
                this.f61444m.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f59668d.offer((Collection) it.next());
            }
            this.f59670f = true;
            if (m31440e()) {
                QueueDrainHelper.m31843c(this.f59668d, this.f59667c, false, this.f61443l, this);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f59670f = true;
            synchronized (this) {
                this.f61444m.clear();
            }
            this.f59667c.onError(th);
            this.f61443l.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            synchronized (this) {
                Iterator<U> it = this.f61444m.iterator();
                while (it.hasNext()) {
                    it.next().add(t);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f59669e) {
                return;
            }
            try {
                U call = this.f61439h.call();
                Objects.requireNonNull(call, "The bufferSupplier returned a null buffer");
                U u = call;
                synchronized (this) {
                    if (this.f59669e) {
                        return;
                    }
                    this.f61444m.add(u);
                    this.f61443l.mo31383c(new RemoveFromBuffer(u), this.f61440i, this.f61442k);
                }
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f59667c.onError(th);
                mo31379f();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f59669e;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super U> observer) {
        throw null;
    }
}
