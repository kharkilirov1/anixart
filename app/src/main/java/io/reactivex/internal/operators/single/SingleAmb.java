package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class SingleAmb<T> extends Single<T> {

    public static final class AmbSingleObserver<T> implements SingleObserver<T> {

        /* renamed from: b */
        public final CompositeDisposable f62435b;

        /* renamed from: c */
        public final SingleObserver<? super T> f62436c;

        /* renamed from: d */
        public final AtomicBoolean f62437d;

        /* renamed from: e */
        public Disposable f62438e;

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void mo31388a(Disposable disposable) {
            this.f62438e = disposable;
            this.f62435b.mo31393b(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            if (!this.f62437d.compareAndSet(false, true)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f62435b.mo31394c(this.f62438e);
            this.f62435b.mo31379f();
            this.f62436c.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            if (this.f62437d.compareAndSet(false, true)) {
                this.f62435b.mo31394c(this.f62438e);
                this.f62435b.mo31379f();
                this.f62436c.onSuccess(t);
            }
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super T> singleObserver) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            singleObserver.mo31388a(EmptyDisposable.INSTANCE);
            singleObserver.onError(th);
        }
    }
}
