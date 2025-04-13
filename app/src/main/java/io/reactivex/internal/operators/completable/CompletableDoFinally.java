package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class CompletableDoFinally extends Completable {

    public static final class DoFinallyObserver extends AtomicInteger implements CompletableObserver, Disposable {

        /* renamed from: b */
        public final CompletableObserver f59719b;

        /* renamed from: c */
        public final Action f59720c = null;

        /* renamed from: d */
        public Disposable f59721d;

        public DoFinallyObserver(CompletableObserver completableObserver, Action action) {
            this.f59719b = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver
        /* renamed from: a */
        public void mo31347a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f59721d, disposable)) {
                this.f59721d = disposable;
                this.f59719b.mo31347a(this);
            }
        }

        /* renamed from: b */
        public void m31449b() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f59720c.run();
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    RxJavaPlugins.m31848b(th);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f59721d.mo31379f();
            m31449b();
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            this.f59719b.onComplete();
            m31449b();
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th) {
            this.f59719b.onError(th);
            m31449b();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f59721d.mo31380s();
        }
    }

    @Override // io.reactivex.Completable
    /* renamed from: c */
    public void mo31346c(CompletableObserver completableObserver) {
        new DoFinallyObserver(completableObserver, null);
        throw null;
    }
}
