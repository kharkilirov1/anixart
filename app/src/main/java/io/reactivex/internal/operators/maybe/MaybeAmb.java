package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class MaybeAmb<T> extends Maybe<T> {

    public static final class AmbMaybeObserver<T> implements MaybeObserver<T> {

        /* renamed from: b */
        public final MaybeObserver<? super T> f60957b;

        /* renamed from: c */
        public final AtomicBoolean f60958c;

        /* renamed from: d */
        public final CompositeDisposable f60959d;

        /* renamed from: e */
        public Disposable f60960e;

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            this.f60960e = disposable;
            this.f60959d.mo31393b(disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            if (this.f60958c.compareAndSet(false, true)) {
                this.f60959d.mo31394c(this.f60960e);
                this.f60959d.mo31379f();
                this.f60957b.onComplete();
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            if (!this.f60958c.compareAndSet(false, true)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f60959d.mo31394c(this.f60960e);
            this.f60959d.mo31379f();
            this.f60957b.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            if (this.f60958c.compareAndSet(false, true)) {
                this.f60959d.mo31394c(this.f60960e);
                this.f60959d.mo31379f();
                this.f60957b.onSuccess(t);
            }
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
