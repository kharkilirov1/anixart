package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class CompletableUsing<R> extends Completable {

    public static final class UsingObserver<R> extends AtomicReference<Object> implements CompletableObserver, Disposable {

        /* renamed from: b */
        public final CompletableObserver f59778b;

        /* renamed from: c */
        public final Consumer<? super R> f59779c;

        /* renamed from: d */
        public final boolean f59780d;

        /* renamed from: e */
        public Disposable f59781e;

        @Override // io.reactivex.CompletableObserver
        /* renamed from: a */
        public void mo31347a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f59781e, disposable)) {
                this.f59781e = disposable;
                this.f59778b.mo31347a(this);
            }
        }

        /* renamed from: b */
        public void m31451b() {
            Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.f59779c.accept(andSet);
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    RxJavaPlugins.m31848b(th);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f59781e.mo31379f();
            this.f59781e = DisposableHelper.DISPOSED;
            m31451b();
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            this.f59781e = DisposableHelper.DISPOSED;
            if (this.f59780d) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f59779c.accept(andSet);
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    this.f59778b.onError(th);
                    return;
                }
            }
            this.f59778b.onComplete();
            if (this.f59780d) {
                return;
            }
            m31451b();
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th) {
            this.f59781e = DisposableHelper.DISPOSED;
            if (this.f59780d) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f59779c.accept(andSet);
                } catch (Throwable th2) {
                    Exceptions.m31402a(th2);
                    th = new CompositeException(th, th2);
                }
            }
            this.f59778b.onError(th);
            if (this.f59780d) {
                return;
            }
            m31451b();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f59781e.mo31380s();
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
