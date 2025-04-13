package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class MaybeOnErrorNext<T> extends AbstractMaybeWithUpstream<T, T> {

    public static final class OnErrorNextMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super T> f61110b;

        /* renamed from: c */
        public final Function<? super Throwable, ? extends MaybeSource<? extends T>> f61111c = null;

        /* renamed from: d */
        public final boolean f61112d;

        public static final class NextMaybeObserver<T> implements MaybeObserver<T> {

            /* renamed from: b */
            public final MaybeObserver<? super T> f61113b;

            /* renamed from: c */
            public final AtomicReference<Disposable> f61114c;

            public NextMaybeObserver(MaybeObserver<? super T> maybeObserver, AtomicReference<Disposable> atomicReference) {
                this.f61113b = maybeObserver;
                this.f61114c = atomicReference;
            }

            @Override // io.reactivex.MaybeObserver
            /* renamed from: a */
            public void mo31355a(Disposable disposable) {
                DisposableHelper.m31413e(this.f61114c, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                this.f61113b.onComplete();
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(Throwable th) {
                this.f61113b.onError(th);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(T t) {
                this.f61113b.onSuccess(t);
            }
        }

        public OnErrorNextMaybeObserver(MaybeObserver<? super T> maybeObserver, Function<? super Throwable, ? extends MaybeSource<? extends T>> function, boolean z) {
            this.f61110b = maybeObserver;
            this.f61112d = z;
        }

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            if (DisposableHelper.m31413e(this, disposable)) {
                this.f61110b.mo31355a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f61110b.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            if (!this.f61112d && !(th instanceof Exception)) {
                this.f61110b.onError(th);
                return;
            }
            try {
                MaybeSource<? extends T> apply = this.f61111c.apply(th);
                Objects.requireNonNull(apply, "The resumeFunction returned a null MaybeSource");
                MaybeSource<? extends T> maybeSource = apply;
                DisposableHelper.m31411c(this, null);
                maybeSource.mo31353b(new NextMaybeObserver(this.f61110b, this));
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                this.f61110b.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.f61110b.onSuccess(t);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        new OnErrorNextMaybeObserver(maybeObserver, null, false);
        throw null;
    }
}
