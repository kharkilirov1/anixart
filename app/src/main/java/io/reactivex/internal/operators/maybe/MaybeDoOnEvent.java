package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiConsumer;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes3.dex */
public final class MaybeDoOnEvent<T> extends AbstractMaybeWithUpstream<T, T> {

    public static final class DoOnEventMaybeObserver<T> implements MaybeObserver<T>, Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super T> f61018b;

        /* renamed from: c */
        public final BiConsumer<? super T, ? super Throwable> f61019c;

        /* renamed from: d */
        public Disposable f61020d;

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61020d, disposable)) {
                this.f61020d = disposable;
                this.f61018b.mo31355a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61020d.mo31379f();
            this.f61020d = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f61020d = DisposableHelper.DISPOSED;
            try {
                this.f61019c.mo31403a(null, null);
                this.f61018b.onComplete();
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61018b.onError(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.f61020d = DisposableHelper.DISPOSED;
            try {
                this.f61019c.mo31403a(null, th);
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                th = new CompositeException(th, th2);
            }
            this.f61018b.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.f61020d = DisposableHelper.DISPOSED;
            try {
                this.f61019c.mo31403a(t, null);
                this.f61018b.onSuccess(t);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61018b.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61020d.mo31380s();
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        throw null;
    }
}
