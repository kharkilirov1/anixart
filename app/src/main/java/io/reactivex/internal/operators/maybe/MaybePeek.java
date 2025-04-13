package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class MaybePeek<T> extends AbstractMaybeWithUpstream<T, T> {

    public static final class MaybePeekObserver<T> implements MaybeObserver<T>, Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super T> f61118b;

        /* renamed from: c */
        public final MaybePeek<T> f61119c;

        /* renamed from: d */
        public Disposable f61120d;

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61120d, disposable)) {
                try {
                    Objects.requireNonNull(this.f61119c);
                    throw null;
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    disposable.mo31379f();
                    this.f61120d = DisposableHelper.DISPOSED;
                    EmptyDisposable.m31417c(th, this.f61118b);
                }
            }
        }

        /* renamed from: b */
        public void m31624b() {
            try {
                Objects.requireNonNull(this.f61119c);
                throw null;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                RxJavaPlugins.m31848b(th);
            }
        }

        /* renamed from: c */
        public void m31625c(Throwable th) {
            try {
                Objects.requireNonNull(this.f61119c);
                throw null;
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                CompositeException compositeException = new CompositeException(th, th2);
                this.f61120d = DisposableHelper.DISPOSED;
                this.f61118b.onError(compositeException);
                m31624b();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            try {
                Objects.requireNonNull(this.f61119c);
                throw null;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                RxJavaPlugins.m31848b(th);
                this.f61120d.mo31379f();
                this.f61120d = DisposableHelper.DISPOSED;
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            if (this.f61120d == DisposableHelper.DISPOSED) {
                return;
            }
            try {
                Objects.requireNonNull(this.f61119c);
                throw null;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                m31625c(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            if (this.f61120d == DisposableHelper.DISPOSED) {
                RxJavaPlugins.m31848b(th);
            } else {
                m31625c(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            if (this.f61120d == DisposableHelper.DISPOSED) {
                return;
            }
            try {
                Objects.requireNonNull(this.f61119c);
                throw null;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                m31625c(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61120d.mo31380s();
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        throw null;
    }
}
