package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class MaybeToSingle<T> extends Single<T> implements HasUpstreamMaybeSource<T> {

    public static final class ToSingleMaybeSubscriber<T> implements MaybeObserver<T>, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super T> f61156b;

        /* renamed from: c */
        public final T f61157c;

        /* renamed from: d */
        public Disposable f61158d;

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61158d, disposable)) {
                this.f61158d = disposable;
                this.f61156b.mo31388a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61158d.mo31379f();
            this.f61158d = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f61158d = DisposableHelper.DISPOSED;
            T t = this.f61157c;
            if (t != null) {
                this.f61156b.onSuccess(t);
            } else {
                this.f61156b.onError(new NoSuchElementException("The MaybeSource is empty"));
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.f61158d = DisposableHelper.DISPOSED;
            this.f61156b.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.f61158d = DisposableHelper.DISPOSED;
            this.f61156b.onSuccess(t);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61158d.mo31380s();
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super T> singleObserver) {
        throw null;
    }
}
