package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.OpenHashSet;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class CompletableTimeout extends Completable {

    public final class DisposeTask implements Runnable {

        /* renamed from: b */
        public final AtomicBoolean f59765b;

        /* renamed from: c */
        public final CompositeDisposable f59766c;

        /* renamed from: d */
        public final CompletableObserver f59767d;

        /* renamed from: e */
        public final /* synthetic */ CompletableTimeout f59768e;

        public final class DisposeObserver implements CompletableObserver {

            /* renamed from: b */
            public final /* synthetic */ DisposeTask f59769b;

            @Override // io.reactivex.CompletableObserver
            /* renamed from: a */
            public void mo31347a(Disposable disposable) {
                this.f59769b.f59766c.mo31393b(disposable);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                this.f59769b.f59766c.mo31379f();
                this.f59769b.f59767d.onComplete();
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th) {
                this.f59769b.f59766c.mo31379f();
                this.f59769b.f59767d.onError(th);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f59765b.compareAndSet(false, true)) {
                CompositeDisposable compositeDisposable = this.f59766c;
                if (!compositeDisposable.f59605c) {
                    synchronized (compositeDisposable) {
                        if (!compositeDisposable.f59605c) {
                            OpenHashSet<Disposable> openHashSet = compositeDisposable.f59604b;
                            compositeDisposable.f59604b = null;
                            compositeDisposable.m31395d(openHashSet);
                        }
                    }
                }
                Objects.requireNonNull(this.f59768e);
                CompletableObserver completableObserver = this.f59767d;
                Objects.requireNonNull(this.f59768e);
                Objects.requireNonNull(this.f59768e);
                completableObserver.onError(new TimeoutException(ExceptionHelper.m31820d(0L, null)));
            }
        }
    }

    public static final class TimeOutObserver implements CompletableObserver {

        /* renamed from: b */
        public final CompositeDisposable f59770b;

        /* renamed from: c */
        public final AtomicBoolean f59771c;

        /* renamed from: d */
        public final CompletableObserver f59772d;

        @Override // io.reactivex.CompletableObserver
        /* renamed from: a */
        public void mo31347a(Disposable disposable) {
            this.f59770b.mo31393b(disposable);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            if (this.f59771c.compareAndSet(false, true)) {
                this.f59770b.mo31379f();
                this.f59772d.onComplete();
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th) {
            if (!this.f59771c.compareAndSet(false, true)) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f59770b.mo31379f();
                this.f59772d.onError(th);
            }
        }
    }

    @Override // io.reactivex.Completable
    /* renamed from: c */
    public void mo31346c(CompletableObserver completableObserver) {
        completableObserver.mo31347a(new CompositeDisposable());
        new AtomicBoolean();
        throw null;
    }
}
