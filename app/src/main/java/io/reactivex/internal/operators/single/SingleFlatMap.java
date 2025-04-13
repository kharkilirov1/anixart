package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class SingleFlatMap<T, R> extends Single<R> {

    public static final class SingleFlatMapCallback<T, R> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super R> f62500b;

        /* renamed from: c */
        public final Function<? super T, ? extends SingleSource<? extends R>> f62501c = null;

        public static final class FlatMapSingleObserver<R> implements SingleObserver<R> {

            /* renamed from: b */
            public final AtomicReference<Disposable> f62502b;

            /* renamed from: c */
            public final SingleObserver<? super R> f62503c;

            public FlatMapSingleObserver(AtomicReference<Disposable> atomicReference, SingleObserver<? super R> singleObserver) {
                this.f62502b = atomicReference;
                this.f62503c = singleObserver;
            }

            @Override // io.reactivex.SingleObserver
            /* renamed from: a */
            public void mo31388a(Disposable disposable) {
                DisposableHelper.m31411c(this.f62502b, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th) {
                this.f62503c.onError(th);
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(R r) {
                this.f62503c.onSuccess(r);
            }
        }

        public SingleFlatMapCallback(SingleObserver<? super R> singleObserver, Function<? super T, ? extends SingleSource<? extends R>> function) {
            this.f62500b = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void mo31388a(Disposable disposable) {
            if (DisposableHelper.m31413e(this, disposable)) {
                this.f62500b.mo31388a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            this.f62500b.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            try {
                SingleSource<? extends R> apply = this.f62501c.apply(t);
                Objects.requireNonNull(apply, "The single returned by the mapper is null");
                SingleSource<? extends R> singleSource = apply;
                if (mo31380s()) {
                    return;
                }
                singleSource.mo31385b(new FlatMapSingleObserver(this, this.f62500b));
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f62500b.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super R> singleObserver) {
        new SingleFlatMapCallback(singleObserver, null);
        throw null;
    }
}
