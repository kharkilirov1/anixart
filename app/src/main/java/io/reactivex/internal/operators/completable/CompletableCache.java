package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class CompletableCache extends Completable implements CompletableObserver {

    public final class InnerCompletableCache extends AtomicBoolean implements Disposable {

        /* renamed from: b */
        public final CompletableObserver f59685b;

        public InnerCompletableCache(CompletableObserver completableObserver) {
            this.f59685b = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (compareAndSet(false, true)) {
                Objects.requireNonNull(CompletableCache.this);
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return get();
        }
    }

    @Override // io.reactivex.CompletableObserver
    /* renamed from: a */
    public void mo31347a(Disposable disposable) {
    }

    @Override // io.reactivex.Completable
    /* renamed from: c */
    public void mo31346c(CompletableObserver completableObserver) {
        completableObserver.mo31347a(new InnerCompletableCache(completableObserver));
        throw null;
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public void onComplete() {
        throw null;
    }

    @Override // io.reactivex.CompletableObserver
    public void onError(Throwable th) {
        throw null;
    }
}
