package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class CompletableAmb extends Completable {

    public static final class Amb implements CompletableObserver {

        /* renamed from: b */
        public final AtomicBoolean f59677b;

        /* renamed from: c */
        public final CompositeDisposable f59678c;

        /* renamed from: d */
        public final CompletableObserver f59679d;

        /* renamed from: e */
        public Disposable f59680e;

        @Override // io.reactivex.CompletableObserver
        /* renamed from: a */
        public void mo31347a(Disposable disposable) {
            this.f59680e = disposable;
            this.f59678c.mo31393b(disposable);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            if (this.f59677b.compareAndSet(false, true)) {
                this.f59678c.mo31394c(this.f59680e);
                this.f59678c.mo31379f();
                this.f59679d.onComplete();
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th) {
            if (!this.f59677b.compareAndSet(false, true)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f59678c.mo31394c(this.f59680e);
            this.f59678c.mo31379f();
            this.f59679d.onError(th);
        }
    }

    @Override // io.reactivex.Completable
    /* renamed from: c */
    public void mo31346c(CompletableObserver completableObserver) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            completableObserver.mo31347a(EmptyDisposable.INSTANCE);
            completableObserver.onError(th);
        }
    }
}
