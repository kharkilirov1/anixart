package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class CompletableDoOnEvent extends Completable {

    public final class DoOnEvent implements CompletableObserver {

        /* renamed from: b */
        public final CompletableObserver f59722b;

        /* renamed from: c */
        public final /* synthetic */ CompletableDoOnEvent f59723c;

        @Override // io.reactivex.CompletableObserver
        /* renamed from: a */
        public void mo31347a(Disposable disposable) {
            this.f59722b.mo31347a(disposable);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            try {
                Objects.requireNonNull(this.f59723c);
                throw null;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f59722b.onError(th);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th) {
            try {
                Objects.requireNonNull(this.f59723c);
                throw null;
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                this.f59722b.onError(new CompositeException(th, th2));
            }
        }
    }

    @Override // io.reactivex.Completable
    /* renamed from: c */
    public void mo31346c(CompletableObserver completableObserver) {
        throw null;
    }
}
