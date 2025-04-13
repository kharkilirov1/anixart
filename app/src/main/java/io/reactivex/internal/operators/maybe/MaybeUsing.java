package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class MaybeUsing<T, D> extends Maybe<T> {

    public static final class UsingObserver<T, D> extends AtomicReference<Object> implements MaybeObserver<T>, Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super T> f61162b;

        /* renamed from: c */
        public final Consumer<? super D> f61163c;

        /* renamed from: d */
        public final boolean f61164d;

        /* renamed from: e */
        public Disposable f61165e;

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61165e, disposable)) {
                this.f61165e = disposable;
                this.f61162b.mo31355a(this);
            }
        }

        /* renamed from: b */
        public void m31628b() {
            Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.f61163c.accept(andSet);
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    RxJavaPlugins.m31848b(th);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61165e.mo31379f();
            this.f61165e = DisposableHelper.DISPOSED;
            m31628b();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f61165e = DisposableHelper.DISPOSED;
            if (this.f61164d) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f61163c.accept(andSet);
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    this.f61162b.onError(th);
                    return;
                }
            }
            this.f61162b.onComplete();
            if (this.f61164d) {
                return;
            }
            m31628b();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.f61165e = DisposableHelper.DISPOSED;
            if (this.f61164d) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f61163c.accept(andSet);
                } catch (Throwable th2) {
                    Exceptions.m31402a(th2);
                    th = new CompositeException(th, th2);
                }
            }
            this.f61162b.onError(th);
            if (this.f61164d) {
                return;
            }
            m31628b();
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.f61165e = DisposableHelper.DISPOSED;
            if (this.f61164d) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f61163c.accept(andSet);
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    this.f61162b.onError(th);
                    return;
                }
            }
            this.f61162b.onSuccess(t);
            if (this.f61164d) {
                return;
            }
            m31628b();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61165e.mo31380s();
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            maybeObserver.mo31355a(EmptyDisposable.INSTANCE);
            maybeObserver.onError(th);
        }
    }
}
