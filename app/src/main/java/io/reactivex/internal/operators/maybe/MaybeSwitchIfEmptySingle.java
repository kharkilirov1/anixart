package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class MaybeSwitchIfEmptySingle<T> extends Single<T> implements HasUpstreamMaybeSource<T> {

    public static final class SwitchIfEmptyMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super T> f61129b;

        /* renamed from: c */
        public final SingleSource<? extends T> f61130c = null;

        public static final class OtherSingleObserver<T> implements SingleObserver<T> {

            /* renamed from: b */
            public final SingleObserver<? super T> f61131b;

            /* renamed from: c */
            public final AtomicReference<Disposable> f61132c;

            public OtherSingleObserver(SingleObserver<? super T> singleObserver, AtomicReference<Disposable> atomicReference) {
                this.f61131b = singleObserver;
                this.f61132c = atomicReference;
            }

            @Override // io.reactivex.SingleObserver
            /* renamed from: a */
            public void mo31388a(Disposable disposable) {
                DisposableHelper.m31413e(this.f61132c, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th) {
                this.f61131b.onError(th);
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(T t) {
                this.f61131b.onSuccess(t);
            }
        }

        public SwitchIfEmptyMaybeObserver(SingleObserver<? super T> singleObserver, SingleSource<? extends T> singleSource) {
            this.f61129b = singleObserver;
        }

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            if (DisposableHelper.m31413e(this, disposable)) {
                this.f61129b.mo31388a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            Disposable disposable = get();
            if (disposable == DisposableHelper.DISPOSED || !compareAndSet(disposable, null)) {
                return;
            }
            this.f61130c.mo31385b(new OtherSingleObserver(this.f61129b, this));
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.f61129b.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.f61129b.onSuccess(t);
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
        new SwitchIfEmptyMaybeObserver(singleObserver, null);
        throw null;
    }
}
