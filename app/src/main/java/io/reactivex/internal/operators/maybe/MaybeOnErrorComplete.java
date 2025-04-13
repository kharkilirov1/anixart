package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes3.dex */
public final class MaybeOnErrorComplete<T> extends AbstractMaybeWithUpstream<T, T> {

    public static final class OnErrorCompleteMaybeObserver<T> implements MaybeObserver<T>, Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super T> f61107b;

        /* renamed from: c */
        public final Predicate<? super Throwable> f61108c;

        /* renamed from: d */
        public Disposable f61109d;

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61109d, disposable)) {
                this.f61109d = disposable;
                this.f61107b.mo31355a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61109d.mo31379f();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f61107b.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            try {
                if (this.f61108c.mo31407b(th)) {
                    this.f61107b.onComplete();
                } else {
                    this.f61107b.onError(th);
                }
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                this.f61107b.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.f61107b.onSuccess(t);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61109d.mo31380s();
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        throw null;
    }
}
