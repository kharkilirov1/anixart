package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class CompletableMergeDelayErrorArray extends Completable {

    public static final class MergeInnerCompletableObserver implements CompletableObserver {

        /* renamed from: b */
        public final CompletableObserver f59740b;

        /* renamed from: c */
        public final CompositeDisposable f59741c;

        /* renamed from: d */
        public final AtomicThrowable f59742d;

        /* renamed from: e */
        public final AtomicInteger f59743e;

        @Override // io.reactivex.CompletableObserver
        /* renamed from: a */
        public void mo31347a(Disposable disposable) {
            this.f59741c.mo31393b(disposable);
        }

        /* renamed from: b */
        public void m31450b() {
            if (this.f59743e.decrementAndGet() == 0) {
                Throwable m31818b = ExceptionHelper.m31818b(this.f59742d);
                if (m31818b == null) {
                    this.f59740b.onComplete();
                } else {
                    this.f59740b.onError(m31818b);
                }
            }
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            m31450b();
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th) {
            if (ExceptionHelper.m31817a(this.f59742d, th)) {
                m31450b();
            } else {
                RxJavaPlugins.m31848b(th);
            }
        }
    }

    @Override // io.reactivex.Completable
    /* renamed from: c */
    public void mo31346c(CompletableObserver completableObserver) {
        throw null;
    }
}
