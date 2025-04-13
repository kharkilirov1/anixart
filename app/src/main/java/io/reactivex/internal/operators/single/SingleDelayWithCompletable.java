package io.reactivex.internal.operators.single;

import io.reactivex.CompletableObserver;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.ResumeSingleObserver;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class SingleDelayWithCompletable<T> extends Single<T> {

    public static final class OtherObserver<T> extends AtomicReference<Disposable> implements CompletableObserver, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super T> f62453b;

        /* renamed from: c */
        public final SingleSource<T> f62454c = null;

        public OtherObserver(SingleObserver<? super T> singleObserver, SingleSource<T> singleSource) {
            this.f62453b = singleObserver;
        }

        @Override // io.reactivex.CompletableObserver
        /* renamed from: a */
        public void mo31347a(Disposable disposable) {
            if (DisposableHelper.m31413e(this, disposable)) {
                this.f62453b.mo31388a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            this.f62454c.mo31385b(new ResumeSingleObserver(this, this.f62453b));
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th) {
            this.f62453b.onError(th);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super T> singleObserver) {
        new OtherObserver(singleObserver, null);
        throw null;
    }
}
