package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class SingleOnErrorReturn<T> extends Single<T> {

    public final class OnErrorReturn implements SingleObserver<T> {

        /* renamed from: b */
        public final SingleObserver<? super T> f62546b;

        /* renamed from: c */
        public final /* synthetic */ SingleOnErrorReturn f62547c;

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void mo31388a(Disposable disposable) {
            this.f62546b.mo31388a(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            Objects.requireNonNull(this.f62547c);
            Objects.requireNonNull(this.f62547c);
            NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
            nullPointerException.initCause(th);
            this.f62546b.onError(nullPointerException);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            this.f62546b.onSuccess(t);
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super T> singleObserver) {
        throw null;
    }
}
