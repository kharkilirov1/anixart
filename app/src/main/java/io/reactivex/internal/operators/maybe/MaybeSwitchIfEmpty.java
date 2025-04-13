package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class MaybeSwitchIfEmpty<T> extends AbstractMaybeWithUpstream<T, T> {

    public static final class SwitchIfEmptyMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super T> f61125b;

        /* renamed from: c */
        public final MaybeSource<? extends T> f61126c = null;

        public static final class OtherMaybeObserver<T> implements MaybeObserver<T> {

            /* renamed from: b */
            public final MaybeObserver<? super T> f61127b;

            /* renamed from: c */
            public final AtomicReference<Disposable> f61128c;

            public OtherMaybeObserver(MaybeObserver<? super T> maybeObserver, AtomicReference<Disposable> atomicReference) {
                this.f61127b = maybeObserver;
                this.f61128c = atomicReference;
            }

            @Override // io.reactivex.MaybeObserver
            /* renamed from: a */
            public void mo31355a(Disposable disposable) {
                DisposableHelper.m31413e(this.f61128c, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                this.f61127b.onComplete();
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(Throwable th) {
                this.f61127b.onError(th);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(T t) {
                this.f61127b.onSuccess(t);
            }
        }

        public SwitchIfEmptyMaybeObserver(MaybeObserver<? super T> maybeObserver, MaybeSource<? extends T> maybeSource) {
            this.f61125b = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            if (DisposableHelper.m31413e(this, disposable)) {
                this.f61125b.mo31355a(this);
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
            this.f61126c.mo31353b(new OtherMaybeObserver(this.f61125b, this));
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.f61125b.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.f61125b.onSuccess(t);
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
        new SwitchIfEmptyMaybeObserver(maybeObserver, null);
        throw null;
    }
}
