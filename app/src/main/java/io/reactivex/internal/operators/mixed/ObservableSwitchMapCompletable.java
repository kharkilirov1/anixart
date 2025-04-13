package io.reactivex.internal.operators.mixed;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableSwitchMapCompletable<T> extends Completable {

    public static final class SwitchMapCompletableObserver<T> implements Observer<T>, Disposable {

        /* renamed from: i */
        public static final SwitchMapInnerObserver f61304i = new SwitchMapInnerObserver(null);

        /* renamed from: b */
        public final CompletableObserver f61305b;

        /* renamed from: d */
        public final boolean f61307d;

        /* renamed from: g */
        public volatile boolean f61310g;

        /* renamed from: h */
        public Disposable f61311h;

        /* renamed from: c */
        public final Function<? super T, ? extends CompletableSource> f61306c = null;

        /* renamed from: e */
        public final AtomicThrowable f61308e = new AtomicThrowable();

        /* renamed from: f */
        public final AtomicReference<SwitchMapInnerObserver> f61309f = new AtomicReference<>();

        public static final class SwitchMapInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {

            /* renamed from: b */
            public final SwitchMapCompletableObserver<?> f61312b;

            public SwitchMapInnerObserver(SwitchMapCompletableObserver<?> switchMapCompletableObserver) {
                this.f61312b = switchMapCompletableObserver;
            }

            @Override // io.reactivex.CompletableObserver
            /* renamed from: a */
            public void mo31347a(Disposable disposable) {
                DisposableHelper.m31413e(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                SwitchMapCompletableObserver<?> switchMapCompletableObserver = this.f61312b;
                if (switchMapCompletableObserver.f61309f.compareAndSet(this, null) && switchMapCompletableObserver.f61310g) {
                    Throwable m31818b = ExceptionHelper.m31818b(switchMapCompletableObserver.f61308e);
                    if (m31818b == null) {
                        switchMapCompletableObserver.f61305b.onComplete();
                    } else {
                        switchMapCompletableObserver.f61305b.onError(m31818b);
                    }
                }
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th) {
                SwitchMapCompletableObserver<?> switchMapCompletableObserver = this.f61312b;
                if (!switchMapCompletableObserver.f61309f.compareAndSet(this, null) || !ExceptionHelper.m31817a(switchMapCompletableObserver.f61308e, th)) {
                    RxJavaPlugins.m31848b(th);
                    return;
                }
                if (switchMapCompletableObserver.f61307d) {
                    if (switchMapCompletableObserver.f61310g) {
                        switchMapCompletableObserver.f61305b.onError(ExceptionHelper.m31818b(switchMapCompletableObserver.f61308e));
                        return;
                    }
                    return;
                }
                switchMapCompletableObserver.mo31379f();
                Throwable m31818b = ExceptionHelper.m31818b(switchMapCompletableObserver.f61308e);
                if (m31818b != ExceptionHelper.f62793a) {
                    switchMapCompletableObserver.f61305b.onError(m31818b);
                }
            }
        }

        public SwitchMapCompletableObserver(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function, boolean z) {
            this.f61305b = completableObserver;
            this.f61307d = z;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61311h, disposable)) {
                this.f61311h = disposable;
                this.f61305b.mo31347a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61311h.mo31379f();
            AtomicReference<SwitchMapInnerObserver> atomicReference = this.f61309f;
            SwitchMapInnerObserver switchMapInnerObserver = f61304i;
            SwitchMapInnerObserver andSet = atomicReference.getAndSet(switchMapInnerObserver);
            if (andSet == null || andSet == switchMapInnerObserver) {
                return;
            }
            DisposableHelper.m31409a(andSet);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61310g = true;
            if (this.f61309f.get() == null) {
                Throwable m31818b = ExceptionHelper.m31818b(this.f61308e);
                if (m31818b == null) {
                    this.f61305b.onComplete();
                } else {
                    this.f61305b.onError(m31818b);
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f61308e, th)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            if (this.f61307d) {
                onComplete();
                return;
            }
            AtomicReference<SwitchMapInnerObserver> atomicReference = this.f61309f;
            SwitchMapInnerObserver switchMapInnerObserver = f61304i;
            SwitchMapInnerObserver andSet = atomicReference.getAndSet(switchMapInnerObserver);
            if (andSet != null && andSet != switchMapInnerObserver) {
                DisposableHelper.m31409a(andSet);
            }
            Throwable m31818b = ExceptionHelper.m31818b(this.f61308e);
            if (m31818b != ExceptionHelper.f62793a) {
                this.f61305b.onError(m31818b);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            SwitchMapInnerObserver switchMapInnerObserver;
            try {
                CompletableSource apply = this.f61306c.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                CompletableSource completableSource = apply;
                SwitchMapInnerObserver switchMapInnerObserver2 = new SwitchMapInnerObserver(this);
                do {
                    switchMapInnerObserver = this.f61309f.get();
                    if (switchMapInnerObserver == f61304i) {
                        return;
                    }
                } while (!this.f61309f.compareAndSet(switchMapInnerObserver, switchMapInnerObserver2));
                if (switchMapInnerObserver != null) {
                    DisposableHelper.m31409a(switchMapInnerObserver);
                }
                completableSource.mo31345b(switchMapInnerObserver2);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61311h.mo31379f();
                onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61309f.get() == f61304i;
        }
    }

    @Override // io.reactivex.Completable
    /* renamed from: c */
    public void mo31346c(CompletableObserver completableObserver) {
        if (ScalarXMapZHelper.m31644a(null, null, completableObserver)) {
            return;
        }
        new SwitchMapCompletableObserver(completableObserver, null, false);
        throw null;
    }
}
