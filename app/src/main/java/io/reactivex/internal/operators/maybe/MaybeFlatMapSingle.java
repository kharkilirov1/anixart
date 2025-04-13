package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class MaybeFlatMapSingle<T, R> extends Single<R> {

    public static final class FlatMapMaybeObserver<T, R> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super R> f61061b;

        /* renamed from: c */
        public final Function<? super T, ? extends SingleSource<? extends R>> f61062c = null;

        public FlatMapMaybeObserver(SingleObserver<? super R> singleObserver, Function<? super T, ? extends SingleSource<? extends R>> function) {
            this.f61061b = singleObserver;
        }

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            if (DisposableHelper.m31413e(this, disposable)) {
                this.f61061b.mo31388a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f61061b.onError(new NoSuchElementException());
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.f61061b.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            try {
                SingleSource<? extends R> apply = this.f61062c.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                SingleSource<? extends R> singleSource = apply;
                if (mo31380s()) {
                    return;
                }
                singleSource.mo31385b(new FlatMapSingleObserver(this, this.f61061b));
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61061b.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }
    }

    public static final class FlatMapSingleObserver<R> implements SingleObserver<R> {

        /* renamed from: b */
        public final AtomicReference<Disposable> f61063b;

        /* renamed from: c */
        public final SingleObserver<? super R> f61064c;

        public FlatMapSingleObserver(AtomicReference<Disposable> atomicReference, SingleObserver<? super R> singleObserver) {
            this.f61063b = atomicReference;
            this.f61064c = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void mo31388a(Disposable disposable) {
            DisposableHelper.m31411c(this.f61063b, disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            this.f61064c.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(R r) {
            this.f61064c.onSuccess(r);
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super R> singleObserver) {
        new FlatMapMaybeObserver(singleObserver, null);
        throw null;
    }
}
