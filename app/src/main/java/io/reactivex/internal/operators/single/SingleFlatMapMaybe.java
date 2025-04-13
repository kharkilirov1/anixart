package io.reactivex.internal.operators.single;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class SingleFlatMapMaybe<T, R> extends Maybe<R> {

    public static final class FlatMapMaybeObserver<R> implements MaybeObserver<R> {

        /* renamed from: b */
        public final AtomicReference<Disposable> f62519b;

        /* renamed from: c */
        public final MaybeObserver<? super R> f62520c;

        public FlatMapMaybeObserver(AtomicReference<Disposable> atomicReference, MaybeObserver<? super R> maybeObserver) {
            this.f62519b = atomicReference;
            this.f62520c = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            DisposableHelper.m31411c(this.f62519b, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f62520c.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.f62520c.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(R r) {
            this.f62520c.onSuccess(r);
        }
    }

    public static final class FlatMapSingleObserver<T, R> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super R> f62521b;

        /* renamed from: c */
        public final Function<? super T, ? extends MaybeSource<? extends R>> f62522c = null;

        public FlatMapSingleObserver(MaybeObserver<? super R> maybeObserver, Function<? super T, ? extends MaybeSource<? extends R>> function) {
            this.f62521b = maybeObserver;
        }

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void mo31388a(Disposable disposable) {
            if (DisposableHelper.m31413e(this, disposable)) {
                this.f62521b.mo31355a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            this.f62521b.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            try {
                MaybeSource<? extends R> apply = this.f62522c.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null MaybeSource");
                MaybeSource<? extends R> maybeSource = apply;
                if (mo31380s()) {
                    return;
                }
                maybeSource.mo31353b(new FlatMapMaybeObserver(this, this.f62521b));
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f62521b.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super R> maybeObserver) {
        new FlatMapSingleObserver(maybeObserver, null);
        throw null;
    }
}
