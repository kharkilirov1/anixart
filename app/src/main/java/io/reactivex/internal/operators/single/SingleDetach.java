package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes3.dex */
public final class SingleDetach<T> extends Single<T> {

    public static final class DetachSingleObserver<T> implements SingleObserver<T>, Disposable {

        /* renamed from: b */
        public SingleObserver<? super T> f62467b;

        /* renamed from: c */
        public Disposable f62468c;

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void mo31388a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62468c, disposable)) {
                this.f62468c = disposable;
                this.f62467b.mo31388a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f62467b = null;
            this.f62468c.mo31379f();
            this.f62468c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            this.f62468c = DisposableHelper.DISPOSED;
            SingleObserver<? super T> singleObserver = this.f62467b;
            if (singleObserver != null) {
                this.f62467b = null;
                singleObserver.onError(th);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            this.f62468c = DisposableHelper.DISPOSED;
            SingleObserver<? super T> singleObserver = this.f62467b;
            if (singleObserver != null) {
                this.f62467b = null;
                singleObserver.onSuccess(t);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62468c.mo31380s();
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super T> singleObserver) {
        throw null;
    }
}
