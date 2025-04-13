package io.reactivex.internal.operators.maybe;

import io.reactivex.CompletableObserver;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamCompletableSource;

/* loaded from: classes3.dex */
public final class MaybeFromCompletable<T> extends Maybe<T> implements HasUpstreamCompletableSource {

    public static final class FromCompletableObserver<T> implements CompletableObserver, Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super T> f61073b;

        /* renamed from: c */
        public Disposable f61074c;

        @Override // io.reactivex.CompletableObserver
        /* renamed from: a */
        public void mo31347a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61074c, disposable)) {
                this.f61074c = disposable;
                this.f61073b.mo31355a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61074c.mo31379f();
            this.f61074c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            this.f61074c = DisposableHelper.DISPOSED;
            this.f61073b.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th) {
            this.f61074c = DisposableHelper.DISPOSED;
            this.f61073b.onError(th);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61074c.mo31380s();
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        throw null;
    }
}
