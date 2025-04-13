package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class MaybeDoOnTerminate<T> extends Maybe<T> {

    public final class DoOnTerminate implements MaybeObserver<T> {

        /* renamed from: b */
        public final MaybeObserver<? super T> f61021b;

        /* renamed from: c */
        public final /* synthetic */ MaybeDoOnTerminate f61022c;

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            this.f61021b.mo31355a(disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            try {
                Objects.requireNonNull(this.f61022c);
                throw null;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61021b.onError(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            try {
                Objects.requireNonNull(this.f61022c);
                throw null;
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                this.f61021b.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            try {
                Objects.requireNonNull(this.f61022c);
                throw null;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61021b.onError(th);
            }
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        throw null;
    }
}
