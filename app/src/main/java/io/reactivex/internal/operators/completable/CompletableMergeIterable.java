package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class CompletableMergeIterable extends Completable {

    public static final class MergeCompletableObserver extends AtomicBoolean implements CompletableObserver {

        /* renamed from: b */
        public final CompositeDisposable f59744b;

        /* renamed from: c */
        public final CompletableObserver f59745c;

        /* renamed from: d */
        public final AtomicInteger f59746d;

        @Override // io.reactivex.CompletableObserver
        /* renamed from: a */
        public void mo31347a(Disposable disposable) {
            this.f59744b.mo31393b(disposable);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            if (this.f59746d.decrementAndGet() == 0 && compareAndSet(false, true)) {
                this.f59745c.onComplete();
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th) {
            this.f59744b.mo31379f();
            if (compareAndSet(false, true)) {
                this.f59745c.onError(th);
            } else {
                RxJavaPlugins.m31848b(th);
            }
        }
    }

    @Override // io.reactivex.Completable
    /* renamed from: c */
    public void mo31346c(CompletableObserver completableObserver) {
        completableObserver.mo31347a(new CompositeDisposable());
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            completableObserver.onError(th);
        }
    }
}
