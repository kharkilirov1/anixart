package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes3.dex */
public final class SingleDoAfterTerminate<T> extends Single<T> {

    /* renamed from: b */
    public final SingleSource<T> f62472b;

    /* renamed from: c */
    public final Action f62473c;

    public static final class DoAfterTerminateObserver<T> implements SingleObserver<T>, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super T> f62474b;

        /* renamed from: c */
        public final Action f62475c;

        /* renamed from: d */
        public Disposable f62476d;

        public DoAfterTerminateObserver(SingleObserver<? super T> singleObserver, Action action) {
            this.f62474b = singleObserver;
            this.f62475c = action;
        }

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void mo31388a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62476d, disposable)) {
                this.f62476d = disposable;
                this.f62474b.mo31388a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f62476d.mo31379f();
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            this.f62474b.onError(th);
            try {
                this.f62475c.run();
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                RxJavaPlugins.m31848b(th2);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            this.f62474b.onSuccess(t);
            try {
                this.f62475c.run();
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                RxJavaPlugins.m31848b(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62476d.mo31380s();
        }
    }

    public SingleDoAfterTerminate(SingleSource<T> singleSource, Action action) {
        this.f62472b = singleSource;
        this.f62473c = action;
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super T> singleObserver) {
        this.f62472b.mo31385b(new DoAfterTerminateObserver(singleObserver, this.f62473c));
    }
}
