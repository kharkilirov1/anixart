package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class CompletableObserveOn extends Completable {

    public static final class ObserveOnCompletableObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Runnable {

        /* renamed from: b */
        public final CompletableObserver f59747b;

        /* renamed from: c */
        public final Scheduler f59748c = null;

        /* renamed from: d */
        public Throwable f59749d;

        public ObserveOnCompletableObserver(CompletableObserver completableObserver, Scheduler scheduler) {
            this.f59747b = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver
        /* renamed from: a */
        public void mo31347a(Disposable disposable) {
            if (DisposableHelper.m31413e(this, disposable)) {
                this.f59747b.mo31347a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            DisposableHelper.m31411c(this, this.f59748c.mo31376c(this));
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th) {
            this.f59749d = th;
            DisposableHelper.m31411c(this, this.f59748c.mo31376c(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.f59749d;
            if (th == null) {
                this.f59747b.onComplete();
            } else {
                this.f59749d = null;
                this.f59747b.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }
    }

    @Override // io.reactivex.Completable
    /* renamed from: c */
    public void mo31346c(CompletableObserver completableObserver) {
        new ObserveOnCompletableObserver(completableObserver, null);
        throw null;
    }
}
