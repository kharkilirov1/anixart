package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class MaybeFlatMapSingleElement<T, R> extends Maybe<R> {

    public static final class FlatMapMaybeObserver<T, R> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super R> f61065b;

        /* renamed from: c */
        public final Function<? super T, ? extends SingleSource<? extends R>> f61066c = null;

        public FlatMapMaybeObserver(MaybeObserver<? super R> maybeObserver, Function<? super T, ? extends SingleSource<? extends R>> function) {
            this.f61065b = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            if (DisposableHelper.m31413e(this, disposable)) {
                this.f61065b.mo31355a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f61065b.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.f61065b.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            try {
                SingleSource<? extends R> apply = this.f61066c.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                apply.mo31385b(new FlatMapSingleObserver(this, this.f61065b));
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61065b.onError(th);
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
        public final AtomicReference<Disposable> f61067b;

        /* renamed from: c */
        public final MaybeObserver<? super R> f61068c;

        public FlatMapSingleObserver(AtomicReference<Disposable> atomicReference, MaybeObserver<? super R> maybeObserver) {
            this.f61067b = atomicReference;
            this.f61068c = maybeObserver;
        }

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void mo31388a(Disposable disposable) {
            DisposableHelper.m31411c(this.f61067b, disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            this.f61068c.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(R r) {
            this.f61068c.onSuccess(r);
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super R> maybeObserver) {
        new FlatMapMaybeObserver(maybeObserver, null);
        throw null;
    }
}
