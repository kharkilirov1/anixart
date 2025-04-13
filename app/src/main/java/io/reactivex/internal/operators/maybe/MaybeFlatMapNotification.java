package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class MaybeFlatMapNotification<T, R> extends AbstractMaybeWithUpstream<T, R> {

    public static final class FlatMapMaybeObserver<T, R> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super R> f61055b;

        /* renamed from: c */
        public final Function<? super T, ? extends MaybeSource<? extends R>> f61056c = null;

        /* renamed from: d */
        public final Function<? super Throwable, ? extends MaybeSource<? extends R>> f61057d = null;

        /* renamed from: e */
        public final Callable<? extends MaybeSource<? extends R>> f61058e = null;

        /* renamed from: f */
        public Disposable f61059f;

        public final class InnerObserver implements MaybeObserver<R> {
            public InnerObserver() {
            }

            @Override // io.reactivex.MaybeObserver
            /* renamed from: a */
            public void mo31355a(Disposable disposable) {
                DisposableHelper.m31413e(FlatMapMaybeObserver.this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                FlatMapMaybeObserver.this.f61055b.onComplete();
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(Throwable th) {
                FlatMapMaybeObserver.this.f61055b.onError(th);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(R r) {
                FlatMapMaybeObserver.this.f61055b.onSuccess(r);
            }
        }

        public FlatMapMaybeObserver(MaybeObserver<? super R> maybeObserver, Function<? super T, ? extends MaybeSource<? extends R>> function, Function<? super Throwable, ? extends MaybeSource<? extends R>> function2, Callable<? extends MaybeSource<? extends R>> callable) {
            this.f61055b = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61059f, disposable)) {
                this.f61059f = disposable;
                this.f61055b.mo31355a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
            this.f61059f.mo31379f();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            try {
                MaybeSource<? extends R> call = this.f61058e.call();
                Objects.requireNonNull(call, "The onCompleteSupplier returned a null MaybeSource");
                call.mo31353b(new InnerObserver());
            } catch (Exception e2) {
                Exceptions.m31402a(e2);
                this.f61055b.onError(e2);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            try {
                MaybeSource<? extends R> apply = this.f61057d.apply(th);
                Objects.requireNonNull(apply, "The onErrorMapper returned a null MaybeSource");
                apply.mo31353b(new InnerObserver());
            } catch (Exception e2) {
                Exceptions.m31402a(e2);
                this.f61055b.onError(new CompositeException(th, e2));
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            try {
                MaybeSource<? extends R> apply = this.f61056c.apply(t);
                Objects.requireNonNull(apply, "The onSuccessMapper returned a null MaybeSource");
                apply.mo31353b(new InnerObserver());
            } catch (Exception e2) {
                Exceptions.m31402a(e2);
                this.f61055b.onError(e2);
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
        new FlatMapMaybeObserver(maybeObserver, null, null, null);
        throw null;
    }
}
