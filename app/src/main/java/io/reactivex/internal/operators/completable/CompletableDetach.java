package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes3.dex */
public final class CompletableDetach extends Completable {

    public static final class DetachCompletableObserver implements CompletableObserver, Disposable {

        /* renamed from: b */
        public CompletableObserver f59713b;

        /* renamed from: c */
        public Disposable f59714c;

        @Override // io.reactivex.CompletableObserver
        /* renamed from: a */
        public void mo31347a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f59714c, disposable)) {
                this.f59714c = disposable;
                this.f59713b.mo31347a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f59713b = null;
            this.f59714c.mo31379f();
            this.f59714c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            this.f59714c = DisposableHelper.DISPOSED;
            CompletableObserver completableObserver = this.f59713b;
            if (completableObserver != null) {
                this.f59713b = null;
                completableObserver.onComplete();
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th) {
            this.f59714c = DisposableHelper.DISPOSED;
            CompletableObserver completableObserver = this.f59713b;
            if (completableObserver != null) {
                this.f59713b = null;
                completableObserver.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f59714c.mo31380s();
        }
    }

    @Override // io.reactivex.Completable
    /* renamed from: c */
    public void mo31346c(CompletableObserver completableObserver) {
        throw null;
    }
}
