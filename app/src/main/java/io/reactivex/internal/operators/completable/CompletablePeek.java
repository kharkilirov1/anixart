package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class CompletablePeek extends Completable {

    public final class CompletableObserverImplementation implements CompletableObserver, Disposable {

        /* renamed from: b */
        public final CompletableObserver f59752b;

        /* renamed from: c */
        public Disposable f59753c;

        /* renamed from: d */
        public final /* synthetic */ CompletablePeek f59754d;

        @Override // io.reactivex.CompletableObserver
        /* renamed from: a */
        public void mo31347a(Disposable disposable) {
            try {
                Objects.requireNonNull(this.f59754d);
                throw null;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                disposable.mo31379f();
                this.f59753c = DisposableHelper.DISPOSED;
                EmptyDisposable.m31416b(th, this.f59752b);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            try {
                Objects.requireNonNull(this.f59754d);
                throw null;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                RxJavaPlugins.m31848b(th);
                this.f59753c.mo31379f();
            }
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            if (this.f59753c == DisposableHelper.DISPOSED) {
                return;
            }
            try {
                Objects.requireNonNull(this.f59754d);
                throw null;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f59752b.onError(th);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th) {
            if (this.f59753c == DisposableHelper.DISPOSED) {
                RxJavaPlugins.m31848b(th);
            } else {
                try {
                    Objects.requireNonNull(this.f59754d);
                    throw null;
                } finally {
                    try {
                    } catch (Throwable th2) {
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f59753c.mo31380s();
        }
    }

    @Override // io.reactivex.Completable
    /* renamed from: c */
    public void mo31346c(CompletableObserver completableObserver) {
        throw null;
    }
}
