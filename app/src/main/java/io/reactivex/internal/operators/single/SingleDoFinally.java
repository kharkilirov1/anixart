package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class SingleDoFinally<T> extends Single<T> {

    public static final class DoFinallyObserver<T> extends AtomicInteger implements SingleObserver<T>, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super T> f62477b;

        /* renamed from: c */
        public final Action f62478c = null;

        /* renamed from: d */
        public Disposable f62479d;

        public DoFinallyObserver(SingleObserver<? super T> singleObserver, Action action) {
            this.f62477b = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void mo31388a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62479d, disposable)) {
                this.f62479d = disposable;
                this.f62477b.mo31388a(this);
            }
        }

        /* renamed from: b */
        public void m31758b() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f62478c.run();
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    RxJavaPlugins.m31848b(th);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f62479d.mo31379f();
            m31758b();
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            this.f62477b.onError(th);
            m31758b();
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            this.f62477b.onSuccess(t);
            m31758b();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62479d.mo31380s();
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super T> singleObserver) {
        new DoFinallyObserver(singleObserver, null);
        throw null;
    }
}
