package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class MaybeMap<T, R> extends AbstractMaybeWithUpstream<T, R> {

    public static final class MapMaybeObserver<T, R> implements MaybeObserver<T>, Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super R> f61087b;

        /* renamed from: c */
        public final Function<? super T, ? extends R> f61088c;

        /* renamed from: d */
        public Disposable f61089d;

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61089d, disposable)) {
                this.f61089d = disposable;
                this.f61087b.mo31355a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            Disposable disposable = this.f61089d;
            this.f61089d = DisposableHelper.DISPOSED;
            disposable.mo31379f();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f61087b.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.f61087b.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            try {
                R apply = this.f61088c.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null item");
                this.f61087b.onSuccess(apply);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61087b.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61089d.mo31380s();
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super R> maybeObserver) {
        throw null;
    }
}
