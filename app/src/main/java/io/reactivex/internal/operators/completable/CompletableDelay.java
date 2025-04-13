package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class CompletableDelay extends Completable {

    public static final class Delay extends AtomicReference<Disposable> implements CompletableObserver, Runnable, Disposable {

        /* renamed from: b */
        public final CompletableObserver f59707b;

        /* renamed from: c */
        public final long f59708c;

        /* renamed from: d */
        public final TimeUnit f59709d = null;

        /* renamed from: e */
        public final Scheduler f59710e = null;

        /* renamed from: f */
        public final boolean f59711f;

        /* renamed from: g */
        public Throwable f59712g;

        public Delay(CompletableObserver completableObserver, long j2, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
            this.f59707b = completableObserver;
            this.f59708c = j2;
            this.f59711f = z;
        }

        @Override // io.reactivex.CompletableObserver
        /* renamed from: a */
        public void mo31347a(Disposable disposable) {
            if (DisposableHelper.m31413e(this, disposable)) {
                this.f59707b.mo31347a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            DisposableHelper.m31411c(this, this.f59710e.mo31377d(this, this.f59708c, this.f59709d));
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th) {
            this.f59712g = th;
            DisposableHelper.m31411c(this, this.f59710e.mo31377d(this, this.f59711f ? this.f59708c : 0L, this.f59709d));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.f59712g;
            this.f59712g = null;
            if (th != null) {
                this.f59707b.onError(th);
            } else {
                this.f59707b.onComplete();
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
        new Delay(completableObserver, 0L, null, null, false);
        throw null;
    }
}
