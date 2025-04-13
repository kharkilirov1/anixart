package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subjects.UnicastSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableWindowBoundarySelector<T, B, V> extends AbstractObservableWithUpstream<T, Observable<T>> {

    public static final class OperatorWindowBoundaryCloseObserver<T, V> extends DisposableObserver<V> {

        /* renamed from: c */
        public final WindowBoundaryMainObserver<T, ?, V> f62215c;

        /* renamed from: d */
        public final UnicastSubject<T> f62216d;

        /* renamed from: e */
        public boolean f62217e;

        public OperatorWindowBoundaryCloseObserver(WindowBoundaryMainObserver<T, ?, V> windowBoundaryMainObserver, UnicastSubject<T> unicastSubject) {
            this.f62215c = windowBoundaryMainObserver;
            this.f62216d = unicastSubject;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f62217e) {
                return;
            }
            this.f62217e = true;
            WindowBoundaryMainObserver<T, ?, V> windowBoundaryMainObserver = this.f62215c;
            windowBoundaryMainObserver.f62222k.mo31394c(this);
            windowBoundaryMainObserver.f59668d.offer(new WindowOperation(this.f62216d, null));
            if (windowBoundaryMainObserver.m31440e()) {
                windowBoundaryMainObserver.m31731k();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f62217e) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f62217e = true;
            WindowBoundaryMainObserver<T, ?, V> windowBoundaryMainObserver = this.f62215c;
            windowBoundaryMainObserver.f62223l.mo31379f();
            windowBoundaryMainObserver.f62222k.mo31379f();
            windowBoundaryMainObserver.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(V v) {
            DisposableHelper.m31409a(this.f62817b);
            onComplete();
        }
    }

    public static final class OperatorWindowBoundaryOpenObserver<T, B> extends DisposableObserver<B> {

        /* renamed from: c */
        public final WindowBoundaryMainObserver<T, B, ?> f62218c;

        public OperatorWindowBoundaryOpenObserver(WindowBoundaryMainObserver<T, B, ?> windowBoundaryMainObserver) {
            this.f62218c = windowBoundaryMainObserver;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f62218c.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            WindowBoundaryMainObserver<T, B, ?> windowBoundaryMainObserver = this.f62218c;
            windowBoundaryMainObserver.f62223l.mo31379f();
            windowBoundaryMainObserver.f62222k.mo31379f();
            windowBoundaryMainObserver.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(B b) {
            WindowBoundaryMainObserver<T, B, ?> windowBoundaryMainObserver = this.f62218c;
            windowBoundaryMainObserver.f59668d.offer(new WindowOperation(null, b));
            if (windowBoundaryMainObserver.m31440e()) {
                windowBoundaryMainObserver.m31731k();
            }
        }
    }

    public static final class WindowBoundaryMainObserver<T, B, V> extends QueueDrainObserver<T, Object, Observable<T>> implements Disposable {

        /* renamed from: h */
        public final ObservableSource<B> f62219h;

        /* renamed from: i */
        public final Function<? super B, ? extends ObservableSource<V>> f62220i;

        /* renamed from: j */
        public final int f62221j;

        /* renamed from: k */
        public final CompositeDisposable f62222k;

        /* renamed from: l */
        public Disposable f62223l;

        /* renamed from: m */
        public final AtomicReference<Disposable> f62224m;

        /* renamed from: n */
        public final List<UnicastSubject<T>> f62225n;

        /* renamed from: o */
        public final AtomicLong f62226o;

        /* renamed from: p */
        public final AtomicBoolean f62227p;

        public WindowBoundaryMainObserver(Observer<? super Observable<T>> observer, ObservableSource<B> observableSource, Function<? super B, ? extends ObservableSource<V>> function, int i2) {
            super(observer, new MpscLinkedQueue());
            this.f62224m = new AtomicReference<>();
            AtomicLong atomicLong = new AtomicLong();
            this.f62226o = atomicLong;
            this.f62227p = new AtomicBoolean();
            this.f62219h = null;
            this.f62220i = null;
            this.f62221j = i2;
            this.f62222k = new CompositeDisposable();
            this.f62225n = new ArrayList();
            atomicLong.lazySet(1L);
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62223l, disposable)) {
                this.f62223l = disposable;
                this.f59667c.mo31373a(this);
                if (this.f62227p.get()) {
                    return;
                }
                OperatorWindowBoundaryOpenObserver operatorWindowBoundaryOpenObserver = new OperatorWindowBoundaryOpenObserver(this);
                if (this.f62224m.compareAndSet(null, operatorWindowBoundaryOpenObserver)) {
                    this.f62219h.mo31364c(operatorWindowBoundaryOpenObserver);
                }
            }
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        /* renamed from: c */
        public void mo31438c(Observer<? super Observable<T>> observer, Object obj) {
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (this.f62227p.compareAndSet(false, true)) {
                DisposableHelper.m31409a(this.f62224m);
                if (this.f62226o.decrementAndGet() == 0) {
                    this.f62223l.mo31379f();
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: k */
        public void m31731k() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.f59668d;
            Observer<? super V> observer = this.f59667c;
            List<UnicastSubject<T>> list = this.f62225n;
            int i2 = 1;
            while (true) {
                boolean z = this.f59670f;
                Object poll = mpscLinkedQueue.poll();
                boolean z2 = poll == null;
                if (z && z2) {
                    this.f62222k.mo31379f();
                    DisposableHelper.m31409a(this.f62224m);
                    Throwable th = this.f59671g;
                    if (th != null) {
                        Iterator<UnicastSubject<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th);
                        }
                    } else {
                        Iterator<UnicastSubject<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    list.clear();
                    return;
                }
                if (z2) {
                    i2 = m31444j(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else if (poll instanceof WindowOperation) {
                    WindowOperation windowOperation = (WindowOperation) poll;
                    UnicastSubject<T> unicastSubject = windowOperation.f62228a;
                    if (unicastSubject != null) {
                        if (list.remove(unicastSubject)) {
                            windowOperation.f62228a.onComplete();
                            if (this.f62226o.decrementAndGet() == 0) {
                                this.f62222k.mo31379f();
                                DisposableHelper.m31409a(this.f62224m);
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.f62227p.get()) {
                        UnicastSubject<T> m31871p = UnicastSubject.m31871p(this.f62221j);
                        list.add(m31871p);
                        observer.onNext(m31871p);
                        try {
                            ObservableSource<V> apply = this.f62220i.apply(windowOperation.f62229b);
                            Objects.requireNonNull(apply, "The ObservableSource supplied is null");
                            ObservableSource<V> observableSource = apply;
                            OperatorWindowBoundaryCloseObserver operatorWindowBoundaryCloseObserver = new OperatorWindowBoundaryCloseObserver(this, m31871p);
                            if (this.f62222k.mo31393b(operatorWindowBoundaryCloseObserver)) {
                                this.f62226o.getAndIncrement();
                                observableSource.mo31364c(operatorWindowBoundaryCloseObserver);
                            }
                        } catch (Throwable th2) {
                            Exceptions.m31402a(th2);
                            this.f62227p.set(true);
                            observer.onError(th2);
                        }
                    }
                } else {
                    Iterator<UnicastSubject<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(poll);
                    }
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f59670f) {
                return;
            }
            this.f59670f = true;
            if (m31440e()) {
                m31731k();
            }
            if (this.f62226o.decrementAndGet() == 0) {
                this.f62222k.mo31379f();
            }
            this.f59667c.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f59670f) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f59671g = th;
            this.f59670f = true;
            if (m31440e()) {
                m31731k();
            }
            if (this.f62226o.decrementAndGet() == 0) {
                this.f62222k.mo31379f();
            }
            this.f59667c.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (m31441g()) {
                Iterator<UnicastSubject<T>> it = this.f62225n.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t);
                }
                if (m31444j(-1) == 0) {
                    return;
                }
            } else {
                this.f59668d.offer(t);
                if (!m31440e()) {
                    return;
                }
            }
            m31731k();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62227p.get();
        }
    }

    public static final class WindowOperation<T, B> {

        /* renamed from: a */
        public final UnicastSubject<T> f62228a;

        /* renamed from: b */
        public final B f62229b;

        public WindowOperation(UnicastSubject<T> unicastSubject, B b) {
            this.f62228a = unicastSubject;
            this.f62229b = b;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super Observable<T>> observer) {
        this.f61337b.mo31364c(new WindowBoundaryMainObserver(new SerializedObserver(observer), null, null, 0));
    }
}
