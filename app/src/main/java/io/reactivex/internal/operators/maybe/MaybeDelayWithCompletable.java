package io.reactivex.internal.operators.maybe;

import io.reactivex.CompletableObserver;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class MaybeDelayWithCompletable<T> extends Maybe<T> {

    public static final class DelayWithMainObserver<T> implements MaybeObserver<T> {

        /* renamed from: b */
        public final AtomicReference<Disposable> f61006b;

        /* renamed from: c */
        public final MaybeObserver<? super T> f61007c;

        public DelayWithMainObserver(AtomicReference<Disposable> atomicReference, MaybeObserver<? super T> maybeObserver) {
            this.f61006b = atomicReference;
            this.f61007c = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            DisposableHelper.m31411c(this.f61006b, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f61007c.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.f61007c.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.f61007c.onSuccess(t);
        }
    }

    public static final class OtherObserver<T> extends AtomicReference<Disposable> implements CompletableObserver, Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super T> f61008b;

        /* renamed from: c */
        public final MaybeSource<T> f61009c = null;

        public OtherObserver(MaybeObserver<? super T> maybeObserver, MaybeSource<T> maybeSource) {
            this.f61008b = maybeObserver;
        }

        @Override // io.reactivex.CompletableObserver
        /* renamed from: a */
        public void mo31347a(Disposable disposable) {
            if (DisposableHelper.m31413e(this, disposable)) {
                this.f61008b.mo31355a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            this.f61009c.mo31353b(new DelayWithMainObserver(this, this.f61008b));
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th) {
            this.f61008b.onError(th);
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
        new OtherObserver(maybeObserver, null);
        throw null;
    }
}
