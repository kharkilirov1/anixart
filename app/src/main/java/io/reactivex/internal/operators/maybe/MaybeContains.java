package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;

/* loaded from: classes3.dex */
public final class MaybeContains<T> extends Single<Boolean> implements HasUpstreamMaybeSource<T> {

    public static final class ContainsMaybeObserver implements MaybeObserver<Object>, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super Boolean> f60984b;

        /* renamed from: c */
        public final Object f60985c;

        /* renamed from: d */
        public Disposable f60986d;

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f60986d, disposable)) {
                this.f60986d = disposable;
                this.f60984b.mo31388a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f60986d.mo31379f();
            this.f60986d = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f60986d = DisposableHelper.DISPOSED;
            this.f60984b.onSuccess(Boolean.FALSE);
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.f60986d = DisposableHelper.DISPOSED;
            this.f60984b.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(Object obj) {
            this.f60986d = DisposableHelper.DISPOSED;
            this.f60984b.onSuccess(Boolean.valueOf(ObjectHelper.m31426b(obj, this.f60985c)));
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f60986d.mo31380s();
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super Boolean> singleObserver) {
        throw null;
    }
}
