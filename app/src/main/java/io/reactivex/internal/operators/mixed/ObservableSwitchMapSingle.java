package io.reactivex.internal.operators.mixed;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableSwitchMapSingle<T, R> extends Observable<R> {

    public static final class SwitchMapSingleMainObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {

        /* renamed from: j */
        public static final SwitchMapSingleObserver<Object> f61324j = new SwitchMapSingleObserver<>(null);

        /* renamed from: b */
        public final Observer<? super R> f61325b;

        /* renamed from: d */
        public final boolean f61327d;

        /* renamed from: g */
        public Disposable f61330g;

        /* renamed from: h */
        public volatile boolean f61331h;

        /* renamed from: i */
        public volatile boolean f61332i;

        /* renamed from: c */
        public final Function<? super T, ? extends SingleSource<? extends R>> f61326c = null;

        /* renamed from: e */
        public final AtomicThrowable f61328e = new AtomicThrowable();

        /* renamed from: f */
        public final AtomicReference<SwitchMapSingleObserver<R>> f61329f = new AtomicReference<>();

        public static final class SwitchMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {

            /* renamed from: b */
            public final SwitchMapSingleMainObserver<?, R> f61333b;

            /* renamed from: c */
            public volatile R f61334c;

            public SwitchMapSingleObserver(SwitchMapSingleMainObserver<?, R> switchMapSingleMainObserver) {
                this.f61333b = switchMapSingleMainObserver;
            }

            @Override // io.reactivex.SingleObserver
            /* renamed from: a */
            public void mo31388a(Disposable disposable) {
                DisposableHelper.m31413e(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th) {
                SwitchMapSingleMainObserver<?, R> switchMapSingleMainObserver = this.f61333b;
                if (!switchMapSingleMainObserver.f61329f.compareAndSet(this, null) || !ExceptionHelper.m31817a(switchMapSingleMainObserver.f61328e, th)) {
                    RxJavaPlugins.m31848b(th);
                    return;
                }
                if (!switchMapSingleMainObserver.f61327d) {
                    switchMapSingleMainObserver.f61330g.mo31379f();
                    switchMapSingleMainObserver.m31642b();
                }
                switchMapSingleMainObserver.m31643c();
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(R r) {
                this.f61334c = r;
                this.f61333b.m31643c();
            }
        }

        public SwitchMapSingleMainObserver(Observer<? super R> observer, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z) {
            this.f61325b = observer;
            this.f61327d = z;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61330g, disposable)) {
                this.f61330g = disposable;
                this.f61325b.mo31373a(this);
            }
        }

        /* renamed from: b */
        public void m31642b() {
            AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.f61329f;
            SwitchMapSingleObserver<Object> switchMapSingleObserver = f61324j;
            SwitchMapSingleObserver<Object> switchMapSingleObserver2 = (SwitchMapSingleObserver) atomicReference.getAndSet(switchMapSingleObserver);
            if (switchMapSingleObserver2 == null || switchMapSingleObserver2 == switchMapSingleObserver) {
                return;
            }
            DisposableHelper.m31409a(switchMapSingleObserver2);
        }

        /* renamed from: c */
        public void m31643c() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super R> observer = this.f61325b;
            AtomicThrowable atomicThrowable = this.f61328e;
            AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.f61329f;
            int i2 = 1;
            while (!this.f61332i) {
                if (atomicThrowable.get() != null && !this.f61327d) {
                    observer.onError(ExceptionHelper.m31818b(atomicThrowable));
                    return;
                }
                boolean z = this.f61331h;
                SwitchMapSingleObserver<R> switchMapSingleObserver = atomicReference.get();
                boolean z2 = switchMapSingleObserver == null;
                if (z && z2) {
                    Throwable m31818b = ExceptionHelper.m31818b(atomicThrowable);
                    if (m31818b != null) {
                        observer.onError(m31818b);
                        return;
                    } else {
                        observer.onComplete();
                        return;
                    }
                }
                if (z2 || switchMapSingleObserver.f61334c == null) {
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else {
                    atomicReference.compareAndSet(switchMapSingleObserver, null);
                    observer.onNext(switchMapSingleObserver.f61334c);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61332i = true;
            this.f61330g.mo31379f();
            m31642b();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61331h = true;
            m31643c();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f61328e, th)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            if (!this.f61327d) {
                m31642b();
            }
            this.f61331h = true;
            m31643c();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            SwitchMapSingleObserver<R> switchMapSingleObserver;
            SwitchMapSingleObserver<R> switchMapSingleObserver2 = this.f61329f.get();
            if (switchMapSingleObserver2 != null) {
                DisposableHelper.m31409a(switchMapSingleObserver2);
            }
            try {
                SingleSource<? extends R> apply = this.f61326c.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                SingleSource<? extends R> singleSource = apply;
                SwitchMapSingleObserver<R> switchMapSingleObserver3 = new SwitchMapSingleObserver<>(this);
                do {
                    switchMapSingleObserver = this.f61329f.get();
                    if (switchMapSingleObserver == f61324j) {
                        return;
                    }
                } while (!this.f61329f.compareAndSet(switchMapSingleObserver, switchMapSingleObserver3));
                singleSource.mo31385b(switchMapSingleObserver3);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61330g.mo31379f();
                this.f61329f.getAndSet(f61324j);
                onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61332i;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super R> observer) {
        if (ScalarXMapZHelper.m31646c(null, null, observer)) {
            return;
        }
        new SwitchMapSingleMainObserver(observer, null, false);
        throw null;
    }
}
