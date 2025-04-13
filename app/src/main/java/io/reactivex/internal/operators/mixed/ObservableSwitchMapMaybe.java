package io.reactivex.internal.operators.mixed;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.Observer;
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
public final class ObservableSwitchMapMaybe<T, R> extends Observable<R> {

    public static final class SwitchMapMaybeMainObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {

        /* renamed from: j */
        public static final SwitchMapMaybeObserver<Object> f61313j = new SwitchMapMaybeObserver<>(null);

        /* renamed from: b */
        public final Observer<? super R> f61314b;

        /* renamed from: d */
        public final boolean f61316d;

        /* renamed from: g */
        public Disposable f61319g;

        /* renamed from: h */
        public volatile boolean f61320h;

        /* renamed from: i */
        public volatile boolean f61321i;

        /* renamed from: c */
        public final Function<? super T, ? extends MaybeSource<? extends R>> f61315c = null;

        /* renamed from: e */
        public final AtomicThrowable f61317e = new AtomicThrowable();

        /* renamed from: f */
        public final AtomicReference<SwitchMapMaybeObserver<R>> f61318f = new AtomicReference<>();

        public static final class SwitchMapMaybeObserver<R> extends AtomicReference<Disposable> implements MaybeObserver<R> {

            /* renamed from: b */
            public final SwitchMapMaybeMainObserver<?, R> f61322b;

            /* renamed from: c */
            public volatile R f61323c;

            public SwitchMapMaybeObserver(SwitchMapMaybeMainObserver<?, R> switchMapMaybeMainObserver) {
                this.f61322b = switchMapMaybeMainObserver;
            }

            @Override // io.reactivex.MaybeObserver
            /* renamed from: a */
            public void mo31355a(Disposable disposable) {
                DisposableHelper.m31413e(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                SwitchMapMaybeMainObserver<?, R> switchMapMaybeMainObserver = this.f61322b;
                if (switchMapMaybeMainObserver.f61318f.compareAndSet(this, null)) {
                    switchMapMaybeMainObserver.m31641c();
                }
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(Throwable th) {
                SwitchMapMaybeMainObserver<?, R> switchMapMaybeMainObserver = this.f61322b;
                if (!switchMapMaybeMainObserver.f61318f.compareAndSet(this, null) || !ExceptionHelper.m31817a(switchMapMaybeMainObserver.f61317e, th)) {
                    RxJavaPlugins.m31848b(th);
                    return;
                }
                if (!switchMapMaybeMainObserver.f61316d) {
                    switchMapMaybeMainObserver.f61319g.mo31379f();
                    switchMapMaybeMainObserver.m31640b();
                }
                switchMapMaybeMainObserver.m31641c();
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(R r) {
                this.f61323c = r;
                this.f61322b.m31641c();
            }
        }

        public SwitchMapMaybeMainObserver(Observer<? super R> observer, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z) {
            this.f61314b = observer;
            this.f61316d = z;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61319g, disposable)) {
                this.f61319g = disposable;
                this.f61314b.mo31373a(this);
            }
        }

        /* renamed from: b */
        public void m31640b() {
            AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.f61318f;
            SwitchMapMaybeObserver<Object> switchMapMaybeObserver = f61313j;
            SwitchMapMaybeObserver<Object> switchMapMaybeObserver2 = (SwitchMapMaybeObserver) atomicReference.getAndSet(switchMapMaybeObserver);
            if (switchMapMaybeObserver2 == null || switchMapMaybeObserver2 == switchMapMaybeObserver) {
                return;
            }
            DisposableHelper.m31409a(switchMapMaybeObserver2);
        }

        /* renamed from: c */
        public void m31641c() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super R> observer = this.f61314b;
            AtomicThrowable atomicThrowable = this.f61317e;
            AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.f61318f;
            int i2 = 1;
            while (!this.f61321i) {
                if (atomicThrowable.get() != null && !this.f61316d) {
                    observer.onError(ExceptionHelper.m31818b(atomicThrowable));
                    return;
                }
                boolean z = this.f61320h;
                SwitchMapMaybeObserver<R> switchMapMaybeObserver = atomicReference.get();
                boolean z2 = switchMapMaybeObserver == null;
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
                if (z2 || switchMapMaybeObserver.f61323c == null) {
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else {
                    atomicReference.compareAndSet(switchMapMaybeObserver, null);
                    observer.onNext(switchMapMaybeObserver.f61323c);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61321i = true;
            this.f61319g.mo31379f();
            m31640b();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61320h = true;
            m31641c();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f61317e, th)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            if (!this.f61316d) {
                m31640b();
            }
            this.f61320h = true;
            m31641c();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            SwitchMapMaybeObserver<R> switchMapMaybeObserver;
            SwitchMapMaybeObserver<R> switchMapMaybeObserver2 = this.f61318f.get();
            if (switchMapMaybeObserver2 != null) {
                DisposableHelper.m31409a(switchMapMaybeObserver2);
            }
            try {
                MaybeSource<? extends R> apply = this.f61315c.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null MaybeSource");
                MaybeSource<? extends R> maybeSource = apply;
                SwitchMapMaybeObserver<R> switchMapMaybeObserver3 = new SwitchMapMaybeObserver<>(this);
                do {
                    switchMapMaybeObserver = this.f61318f.get();
                    if (switchMapMaybeObserver == f61313j) {
                        return;
                    }
                } while (!this.f61318f.compareAndSet(switchMapMaybeObserver, switchMapMaybeObserver3));
                maybeSource.mo31353b(switchMapMaybeObserver3);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61319g.mo31379f();
                this.f61318f.getAndSet(f61313j);
                onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61321i;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super R> observer) {
        if (ScalarXMapZHelper.m31645b(null, null, observer)) {
            return;
        }
        new SwitchMapMaybeMainObserver(observer, null, false);
        throw null;
    }
}
