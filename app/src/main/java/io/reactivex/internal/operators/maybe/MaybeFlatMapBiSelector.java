package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class MaybeFlatMapBiSelector<T, U, R> extends AbstractMaybeWithUpstream<T, R> {

    public static final class FlatMapBiMainObserver<T, U, R> implements MaybeObserver<T>, Disposable {

        /* renamed from: b */
        public final Function<? super T, ? extends MaybeSource<? extends U>> f61035b = null;

        /* renamed from: c */
        public final InnerObserver<T, U, R> f61036c;

        public static final class InnerObserver<T, U, R> extends AtomicReference<Disposable> implements MaybeObserver<U> {

            /* renamed from: b */
            public final MaybeObserver<? super R> f61037b;

            /* renamed from: c */
            public final BiFunction<? super T, ? super U, ? extends R> f61038c;

            /* renamed from: d */
            public T f61039d;

            public InnerObserver(MaybeObserver<? super R> maybeObserver, BiFunction<? super T, ? super U, ? extends R> biFunction) {
                this.f61037b = maybeObserver;
                this.f61038c = biFunction;
            }

            @Override // io.reactivex.MaybeObserver
            /* renamed from: a */
            public void mo31355a(Disposable disposable) {
                DisposableHelper.m31413e(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                this.f61037b.onComplete();
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(Throwable th) {
                this.f61037b.onError(th);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(U u) {
                T t = this.f61039d;
                this.f61039d = null;
                try {
                    R apply = this.f61038c.apply(t, u);
                    Objects.requireNonNull(apply, "The resultSelector returned a null value");
                    this.f61037b.onSuccess(apply);
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    this.f61037b.onError(th);
                }
            }
        }

        public FlatMapBiMainObserver(MaybeObserver<? super R> maybeObserver, Function<? super T, ? extends MaybeSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
            this.f61036c = new InnerObserver<>(maybeObserver, null);
        }

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            if (DisposableHelper.m31413e(this.f61036c, disposable)) {
                this.f61036c.f61037b.mo31355a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this.f61036c);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f61036c.f61037b.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.f61036c.f61037b.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            try {
                MaybeSource<? extends U> apply = this.f61035b.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null MaybeSource");
                MaybeSource<? extends U> maybeSource = apply;
                if (DisposableHelper.m31411c(this.f61036c, null)) {
                    InnerObserver<T, U, R> innerObserver = this.f61036c;
                    innerObserver.f61039d = t;
                    maybeSource.mo31353b(innerObserver);
                }
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61036c.f61037b.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(this.f61036c.get());
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super R> maybeObserver) {
        new FlatMapBiMainObserver(maybeObserver, null, null);
        throw null;
    }
}
