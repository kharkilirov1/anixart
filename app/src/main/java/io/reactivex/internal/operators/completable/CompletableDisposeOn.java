package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes3.dex */
public final class CompletableDisposeOn extends Completable {

    public static final class DisposeOnObserver implements CompletableObserver, Disposable, Runnable {

        /* renamed from: b */
        public final CompletableObserver f59715b;

        /* renamed from: c */
        public final Scheduler f59716c;

        /* renamed from: d */
        public Disposable f59717d;

        /* renamed from: e */
        public volatile boolean f59718e;

        @Override // io.reactivex.CompletableObserver
        /* renamed from: a */
        public void mo31347a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f59717d, disposable)) {
                this.f59717d = disposable;
                this.f59715b.mo31347a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f59718e = true;
            this.f59716c.mo31376c(this);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            if (this.f59718e) {
                return;
            }
            this.f59715b.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th) {
            if (this.f59718e) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f59715b.onError(th);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f59717d.mo31379f();
            this.f59717d = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f59718e;
        }
    }

    @Override // io.reactivex.Completable
    /* renamed from: c */
    public void mo31346c(CompletableObserver completableObserver) {
        throw null;
    }
}
