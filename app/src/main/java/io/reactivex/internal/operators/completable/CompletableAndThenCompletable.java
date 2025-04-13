package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class CompletableAndThenCompletable extends Completable {

    public static final class NextObserver implements CompletableObserver {

        /* renamed from: b */
        public final AtomicReference<Disposable> f59681b;

        /* renamed from: c */
        public final CompletableObserver f59682c;

        public NextObserver(AtomicReference<Disposable> atomicReference, CompletableObserver completableObserver) {
            this.f59681b = atomicReference;
            this.f59682c = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver
        /* renamed from: a */
        public void mo31347a(Disposable disposable) {
            DisposableHelper.m31411c(this.f59681b, disposable);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            this.f59682c.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th) {
            this.f59682c.onError(th);
        }
    }

    public static final class SourceObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {

        /* renamed from: b */
        public final CompletableObserver f59683b;

        /* renamed from: c */
        public final CompletableSource f59684c = null;

        public SourceObserver(CompletableObserver completableObserver, CompletableSource completableSource) {
            this.f59683b = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver
        /* renamed from: a */
        public void mo31347a(Disposable disposable) {
            if (DisposableHelper.m31413e(this, disposable)) {
                this.f59683b.mo31347a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            this.f59684c.mo31345b(new NextObserver(this, this.f59683b));
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th) {
            this.f59683b.onError(th);
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
        new SourceObserver(completableObserver, null);
        throw null;
    }
}
