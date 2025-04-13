package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableBufferBoundarySupplier<T, U extends Collection<? super T>, B> extends AbstractObservableWithUpstream<T, U> {

    public static final class BufferBoundaryObserver<T, U extends Collection<? super T>, B> extends DisposableObserver<B> {

        /* renamed from: c */
        public final BufferBoundarySupplierObserver<T, U, B> f61408c;

        /* renamed from: d */
        public boolean f61409d;

        public BufferBoundaryObserver(BufferBoundarySupplierObserver<T, U, B> bufferBoundarySupplierObserver) {
            this.f61408c = bufferBoundarySupplierObserver;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f61409d) {
                return;
            }
            this.f61409d = true;
            this.f61408c.m31652k();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f61409d) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f61409d = true;
            BufferBoundarySupplierObserver<T, U, B> bufferBoundarySupplierObserver = this.f61408c;
            bufferBoundarySupplierObserver.mo31379f();
            bufferBoundarySupplierObserver.f59667c.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(B b) {
            if (this.f61409d) {
                return;
            }
            this.f61409d = true;
            DisposableHelper.m31409a(this.f62817b);
            this.f61408c.m31652k();
        }
    }

    public static final class BufferBoundarySupplierObserver<T, U extends Collection<? super T>, B> extends QueueDrainObserver<T, U, U> implements Disposable {

        /* renamed from: h */
        public final Callable<U> f61410h;

        /* renamed from: i */
        public final Callable<? extends ObservableSource<B>> f61411i;

        /* renamed from: j */
        public Disposable f61412j;

        /* renamed from: k */
        public final AtomicReference<Disposable> f61413k;

        /* renamed from: l */
        public U f61414l;

        public BufferBoundarySupplierObserver(Observer<? super U> observer, Callable<U> callable, Callable<? extends ObservableSource<B>> callable2) {
            super(observer, new MpscLinkedQueue());
            this.f61413k = new AtomicReference<>();
            this.f61410h = null;
            this.f61411i = null;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61412j, disposable)) {
                this.f61412j = disposable;
                Observer<? super V> observer = this.f59667c;
                try {
                    U call = this.f61410h.call();
                    Objects.requireNonNull(call, "The buffer supplied is null");
                    this.f61414l = call;
                    try {
                        ObservableSource<B> call2 = this.f61411i.call();
                        Objects.requireNonNull(call2, "The boundary ObservableSource supplied is null");
                        ObservableSource<B> observableSource = call2;
                        BufferBoundaryObserver bufferBoundaryObserver = new BufferBoundaryObserver(this);
                        this.f61413k.set(bufferBoundaryObserver);
                        observer.mo31373a(this);
                        if (this.f59669e) {
                            return;
                        }
                        observableSource.mo31364c(bufferBoundaryObserver);
                    } catch (Throwable th) {
                        Exceptions.m31402a(th);
                        this.f59669e = true;
                        disposable.mo31379f();
                        EmptyDisposable.m31418d(th, observer);
                    }
                } catch (Throwable th2) {
                    Exceptions.m31402a(th2);
                    this.f59669e = true;
                    disposable.mo31379f();
                    EmptyDisposable.m31418d(th2, observer);
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
            if (this.f59669e) {
                return;
            }
            this.f59669e = true;
            this.f61412j.mo31379f();
            DisposableHelper.m31409a(this.f61413k);
            if (m31440e()) {
                this.f59668d.clear();
            }
        }

        /* renamed from: k */
        public void m31652k() {
            try {
                U call = this.f61410h.call();
                Objects.requireNonNull(call, "The buffer supplied is null");
                U u = call;
                try {
                    ObservableSource<B> call2 = this.f61411i.call();
                    Objects.requireNonNull(call2, "The boundary ObservableSource supplied is null");
                    ObservableSource<B> observableSource = call2;
                    BufferBoundaryObserver bufferBoundaryObserver = new BufferBoundaryObserver(this);
                    if (DisposableHelper.m31411c(this.f61413k, bufferBoundaryObserver)) {
                        synchronized (this) {
                            U u2 = this.f61414l;
                            if (u2 == null) {
                                return;
                            }
                            this.f61414l = u;
                            observableSource.mo31364c(bufferBoundaryObserver);
                            m31442h(u2, false, this);
                        }
                    }
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    this.f59669e = true;
                    this.f61412j.mo31379f();
                    this.f59667c.onError(th);
                }
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                mo31379f();
                this.f59667c.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            synchronized (this) {
                U u = this.f61414l;
                if (u == null) {
                    return;
                }
                this.f61414l = null;
                this.f59668d.offer(u);
                this.f59670f = true;
                if (m31440e()) {
                    QueueDrainHelper.m31843c(this.f59668d, this.f59667c, false, this, this);
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            mo31379f();
            this.f59667c.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            synchronized (this) {
                U u = this.f61414l;
                if (u == null) {
                    return;
                }
                u.add(t);
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
        this.f61337b.mo31364c(new BufferBoundarySupplierObserver(new SerializedObserver(observer), null, null));
    }
}
