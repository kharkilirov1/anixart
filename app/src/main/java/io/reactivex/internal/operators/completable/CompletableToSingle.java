package io.reactivex.internal.operators.completable;

import io.reactivex.CompletableObserver;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class CompletableToSingle<T> extends Single<T> {

    public final class ToSingle implements CompletableObserver {

        /* renamed from: b */
        public final SingleObserver<? super T> f59776b;

        /* renamed from: c */
        public final /* synthetic */ CompletableToSingle f59777c;

        @Override // io.reactivex.CompletableObserver
        /* renamed from: a */
        public void mo31347a(Disposable disposable) {
            this.f59776b.mo31388a(disposable);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            Objects.requireNonNull(this.f59777c);
            Objects.requireNonNull(this.f59777c);
            this.f59776b.onError(new NullPointerException("The value supplied is null"));
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th) {
            this.f59776b.onError(th);
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super T> singleObserver) {
        throw null;
    }
}
