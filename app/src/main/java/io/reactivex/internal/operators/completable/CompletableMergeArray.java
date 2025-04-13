package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class CompletableMergeArray extends Completable {

    public static final class InnerCompletableObserver extends AtomicInteger implements CompletableObserver {

        /* renamed from: b */
        public final CompletableObserver f59737b;

        /* renamed from: c */
        public final AtomicBoolean f59738c;

        /* renamed from: d */
        public final CompositeDisposable f59739d;

        @Override // io.reactivex.CompletableObserver
        /* renamed from: a */
        public void mo31347a(Disposable disposable) {
            this.f59739d.mo31393b(disposable);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            if (decrementAndGet() == 0 && this.f59738c.compareAndSet(false, true)) {
                this.f59737b.onComplete();
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th) {
            this.f59739d.mo31379f();
            if (this.f59738c.compareAndSet(false, true)) {
                this.f59737b.onError(th);
            } else {
                RxJavaPlugins.m31848b(th);
            }
        }
    }

    @Override // io.reactivex.Completable
    /* renamed from: c */
    public void mo31346c(CompletableObserver completableObserver) {
        new AtomicBoolean();
        throw null;
    }
}
