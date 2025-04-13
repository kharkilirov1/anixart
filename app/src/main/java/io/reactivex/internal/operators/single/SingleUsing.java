package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class SingleUsing<T, U> extends Single<T> {

    public static final class UsingSingleObserver<T, U> extends AtomicReference<Object> implements SingleObserver<T>, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super T> f62573b;

        /* renamed from: c */
        public final Consumer<? super U> f62574c;

        /* renamed from: d */
        public final boolean f62575d;

        /* renamed from: e */
        public Disposable f62576e;

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void mo31388a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62576e, disposable)) {
                this.f62576e = disposable;
                this.f62573b.mo31388a(this);
            }
        }

        /* renamed from: b */
        public void m31761b() {
            Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.f62574c.accept(andSet);
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    RxJavaPlugins.m31848b(th);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f62576e.mo31379f();
            this.f62576e = DisposableHelper.DISPOSED;
            m31761b();
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            this.f62576e = DisposableHelper.DISPOSED;
            if (this.f62575d) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f62574c.accept(andSet);
                } catch (Throwable th2) {
                    Exceptions.m31402a(th2);
                    th = new CompositeException(th, th2);
                }
            }
            this.f62573b.onError(th);
            if (this.f62575d) {
                return;
            }
            m31761b();
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            this.f62576e = DisposableHelper.DISPOSED;
            if (this.f62575d) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f62574c.accept(andSet);
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    this.f62573b.onError(th);
                    return;
                }
            }
            this.f62573b.onSuccess(t);
            if (this.f62575d) {
                return;
            }
            m31761b();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62576e.mo31380s();
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
